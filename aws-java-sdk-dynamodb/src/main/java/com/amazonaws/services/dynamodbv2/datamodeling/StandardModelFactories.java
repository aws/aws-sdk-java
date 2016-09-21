/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BOOLEAN;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BYTE_BUFFER;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.DEFAULT;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.STRING;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.LIST;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.MAP;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.SET;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Beans;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter.AbstractConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter.DelegateConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardModelFactories {

    private static final Log LOG = LogFactory.getLog(StandardModelFactories.class);

    /**
     * Creats a new standard {@link DynamoDBMapperModelFactory} factory.
     */
    static final DynamoDBMapperModelFactory.Factory of(S3Link.Factory s3Links) {
        return new ConversionSchemaFactory(s3Links);
    }

    /**
     * {@link DynamoDBMapperModelFactory} mapped by {@link ConversionSchema}.
     */
    private static final class ConversionSchemaFactory implements DynamoDBMapperModelFactory.Factory {
        private final ConcurrentMap<ConversionSchema,DynamoDBMapperModelFactory> cache;
        private final S3Link.Factory s3Links;

        private ConversionSchemaFactory(S3Link.Factory s3Links) {
            this.cache = new ConcurrentHashMap<ConversionSchema,DynamoDBMapperModelFactory>();
            this.s3Links = s3Links;
        }

        @Override
        public DynamoDBMapperModelFactory getModelFactory(DynamoDBMapperConfig config) {
            final ConversionSchema schema = config.getConversionSchema();
            if (!cache.containsKey(schema)) {
                RuleFactory<Object> rules = rulesOf(config, s3Links, this);
                rules = new ConversionSchemas.ItemConverterRuleFactory<Object>(config, s3Links, rules);
                cache.putIfAbsent(schema, new StandardModelFactory(rules));
            }
            return cache.get(schema);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} factory with {@link ItemConverter}.
     */
    private static final class StandardModelFactory implements DynamoDBMapperModelFactory {
        private final ConcurrentMap<Class<?>,DynamoDBMapperTableModel<?>> cache;
        private final RuleFactory<Object> rules;

        private StandardModelFactory(RuleFactory<Object> rules) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.rules = rules;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> DynamoDBMapperTableModel<T> getTableModel(Class<T> targetType) {
            if (!this.cache.containsKey(targetType)) {
                final Beans<T> beans = StandardBeanProperties.<T>of(targetType);
                this.cache.putIfAbsent(targetType, new TableModelBuilder<T>(targetType, beans, rules).build());
            }
            return (DynamoDBMapperTableModel<T>)this.cache.get(targetType);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    private static final class TableModelBuilder<T> extends DynamoDBMapperTableModel.Builder<T> {
        private TableModelBuilder(Class<T> targetType, Beans<T> beans, RuleFactory<Object> rules) {
            super(targetType, beans.properties());
            for (final Bean<T,Object> bean : beans.map().values()) {
                try {
                    with(new FieldModelBuilder<T,Object>(targetType, bean, rules.getRule(bean.type())).build());
                } catch (final RuntimeException e) {
                    throw new DynamoDBMappingException(String.format(
                        "%s[%s] could not be mapped for type %s",
                        targetType.getSimpleName(), bean.properties().attributeName(), bean.type()
                    ), e);
                }
            }
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} builder.
     */
    private static final class FieldModelBuilder<T,V> extends DynamoDBMapperFieldModel.Builder<T,V> {
        private FieldModelBuilder(Class<T> targetType, Bean<T,V> bean, Rule<V> rule) {
            super(targetType, bean.properties());
            with(bean.type().attributeType() == null ? rule.getAttributeType() : bean.type().attributeType());
            with(rule.newConverter(bean.type()));
            with(bean.reflect());
        }
    }

    /**
     * Creates a new set of conversion rules based on the configuration.
     */
    private static final <T> RuleFactory<T> rulesOf(DynamoDBMapperConfig config, S3Link.Factory s3Links, DynamoDBMapperModelFactory.Factory models) {
        final Rules<T> factory = new Rules<T>(config.getTypeConverterFactory().override()
            .with(String.class, S3Link.class, s3Links)
            .build());
        if (config.getConversionSchema() == ConversionSchemas.V1) {
            factory.with(factory.new NativeBool(true));
            factory.with(factory.new SimpleScalar<String>(String.class, S));
            factory.with(factory.new SimpleScalar<String>(String.class, N));
            factory.with(factory.new SimpleScalar<ByteBuffer>(ByteBuffer.class, B));
            factory.with(factory.new SimpleScalarSet<String>(String.class, SS));
            factory.with(factory.new SimpleScalarSet<String>(String.class, NS));
            factory.with(factory.new SimpleScalarSet<ByteBuffer>(ByteBuffer.class, BS));
            factory.with(factory.new ObjectStringSet());
        } else if (config.getConversionSchema() == ConversionSchemas.V2) {
            factory.with(factory.new NativeTyped());
            factory.with(factory.new NativeBool(false));
            factory.with(factory.new SimpleScalar<String>(String.class, S));
            factory.with(factory.new SimpleScalar<String>(String.class, N));
            factory.with(factory.new SimpleScalar<ByteBuffer>(ByteBuffer.class, B));
            factory.with(factory.new NativeBoolSet());
            factory.with(factory.new SimpleScalarSet<String>(String.class, SS));
            factory.with(factory.new SimpleScalarSet<String>(String.class, NS));
            factory.with(factory.new SimpleScalarSet<ByteBuffer>(ByteBuffer.class, BS));
            factory.with(factory.new ObjectSet());
            factory.with(factory.new ObjectList());
            factory.with(factory.new ObjectMap());
            factory.with(factory.new ObjectDocumentMap(models, config));
        } else {
            factory.with(factory.new NativeTyped());
            factory.with(factory.new NativeBool(true));
            factory.with(factory.new SimpleScalar<String>(String.class, S));
            factory.with(factory.new SimpleScalar<String>(String.class, N));
            factory.with(factory.new SimpleScalar<ByteBuffer>(ByteBuffer.class, B));
            factory.with(factory.new SimpleScalarSet<String>(String.class, SS));
            factory.with(factory.new SimpleScalarSet<String>(String.class, NS));
            factory.with(factory.new SimpleScalarSet<ByteBuffer>(ByteBuffer.class, BS));
            factory.with(factory.new ObjectStringSet());
            factory.with(factory.new ObjectList());
            factory.with(factory.new ObjectMap());
            factory.with(factory.new ObjectDocumentMap(models, config));
        }
        return factory;
    }

    /**
     * Groups the conversion rules to be evaluated.
     */
    private static final class Rules<T> implements RuleFactory<T> {
        private final Set<Rule<T>> rules = new LinkedHashSet<Rule<T>>();
        private final DynamoDBTypeConverterFactory scalars;

        private Rules(DynamoDBTypeConverterFactory scalars) {
            this.scalars = scalars;
        }

        @SuppressWarnings("unchecked")
        private Rules<T> with(Rule<?> rule) {
            this.rules.add((Rule<T>)rule);
            return this;
        }

        @Override
        public Rule<T> getRule(ConversionType<T> type) {
            for (final Rule<T> rule : rules) {
                if (rule.isAssignableFrom(type)) {
                    return rule;
                }
            }
            return new NotSupported();
        }

        /**
         * Gets the scalar converter for the given source and target types.
         */
        private <S> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, ConversionType<T> type) {
            return scalars.getConverter(sourceType, type.targetType());
        }

        /**
         * Gets the nested converter for the given conversion type.
         * Also wraps the resulting converter with a nullablel converter.
         */
        private DynamoDBTypeConverter<AttributeValue,T> getConverter(ConversionType<T> type) {
            return new DelegateConverter<AttributeValue,T>(getRule(type).newConverter(type)) {
                @Override
                public final AttributeValue convert(T o) {
                    return o == null ? new AttributeValue().withNULL(true) : super.convert(o);
                }
            };
        }

        /**
         * Native {@link AttributeValue} conversion.
         */
        private final class NativeTyped  implements Rule<AttributeValue> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return AttributeValue.class.isAssignableFrom(type.targetType());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,AttributeValue> newConverter(ConversionType<AttributeValue> type) {
                return type.join(CopyConverter);
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return DynamoDBAttributeType.NULL;
            }
        }

        /**
         * Scalar conversions
         */
        private final class SimpleScalar<S> implements Rule<T> {
            private final ScalarAttributeType scalarAttributeType;
            private final Converter<S> source;
            private final Class<S> sourceType;
            private SimpleScalar(Class<S> sourceType, Converter<S> source) {
                this.scalarAttributeType = ScalarAttributeType.valueOf(source.attributeType.name());
                this.sourceType = sourceType;
                this.source = source;
            }
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return type.attributeType() == source.attributeType() || (type.attributeType() == null &&
                    Scalar.of(type.targetType()).is(scalarAttributeType)
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConversionType<T> type) {
                return type.join(source.join(getConverter(sourceType, type)));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return source.attributeType();
            }
        }

        /**
         * {@code SS} conversion
         */
        private final class SimpleScalarSet<S> implements Rule<Collection<T>> {
            private final ScalarAttributeType scalarAttributeType;
            private final Converter<List<S>> source;
            private final Class<S> sourceType;
            private SimpleScalarSet(Class<S> sourceType, Converter<List<S>> source) {
                this.scalarAttributeType = ScalarAttributeType.valueOf(source.attributeType.name().substring(0,1));
                this.sourceType = sourceType;
                this.source = source;
            }
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return type.attributeType() == source.attributeType() || (type.attributeType() == null &&
                    SET.is(type.targetType()) && type.param(0) != null &&
                    Scalar.of(type.param(0).targetType()).is(scalarAttributeType)
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConversionType<Collection<T>> type) {
                return type.join(source.join(SET.join(getConverter(sourceType, type.<T>param(0)))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return source.attributeType();
            }
        }

        /**
         * {@code SS} conversion
         */
        private final class ObjectStringSet implements Rule<Collection<Object>> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return type.attributeType() == null && SET.is(type.targetType());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<Object>> newConverter(ConversionType<Collection<Object>> type) {
                LOG.warn("Marshaling a set of non-String objects to a DynamoDB "
                    + "StringSet. You won't be able to read these objects back "
                    + "out of DynamoDB unless you REALLY know what you're doing: "
                    + "it's probably a bug. If you DO know what you're doing feel"
                    + "free to ignore this warning, but consider using a custom "
                    + "marshaler for this instead.");
                return type.join(SS.join(SET.join(scalars.getConverter(String.class, Object.class))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return SS.attributeType();
            }
        }

        /**
         * Native boolean conversion.
         */
        private final class NativeBool implements Rule<T> {
            private final boolean onlyIfOverride;
            private NativeBool(boolean onlyIfOverride) {
                this.onlyIfOverride = onlyIfOverride;
            }
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return type.attributeType() == BOOL.attributeType() || (type.attributeType() == null &&
                    !onlyIfOverride && BOOLEAN.is(type.targetType())
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConversionType<T> type) {
                return type.join(BOOL.join(getConverter(Boolean.class, type)));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return BOOL.attributeType();
            }
        }

        /**
         * Native bool {@link Set} conversions.
         */
        private final class NativeBoolSet implements Rule<Collection<T>> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return ((type.attributeType() == L.attributeType() || type.attributeType() == null) &&
                    SET.is(type.targetType()) && type.param(0) != null && BOOLEAN.is(type.param(0).targetType())
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConversionType<Collection<T>> type) {
                final DynamoDBTypeConverter<AttributeValue,String> toBool = BOOL.join(scalars.getConverter(Boolean.class, String.class));
                return type.join(new DelegateConverter<AttributeValue,List<AttributeValue>>(L) {
                    @Override
                    public List<AttributeValue> unconvert(AttributeValue o) {
                        return o.getL() == null && o.getNS() != null ? LIST.convert(o.getNS(), toBool) : super.unconvert(o);
                    }
                }.join(SET.join(getConverter(type.<T>param(0)))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link List} conversions.
         */
        private final class ObjectSet implements Rule<Collection<T>> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return ((type.attributeType() == L.attributeType() || type.attributeType() == null) &&
                    SET.is(type.targetType()) && type.param(0) != null
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConversionType<Collection<T>> type) {
                return type.join(L.join(SET.join(getConverter(type.<T>param(0)))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link List} conversions.
         */
        private final class ObjectList implements Rule<List<T>> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return ((type.attributeType() == L.attributeType() || type.attributeType() == null) &&
                    LIST.is(type.targetType()) && type.param(0) != null
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,List<T>> newConverter(ConversionType<List<T>> type) {
                return type.join(L.join(LIST.join(getConverter(type.<T>param(0)))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link Map} conversions.
         */
        private final class ObjectMap implements Rule<Map<String,T>> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return ((type.attributeType() == M.attributeType() || type.attributeType() == null) &&
                    MAP.is(type.targetType()) && type.param(1) != null && STRING.is(type.param(0).targetType())
                );
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Map<String,T>> newConverter(ConversionType<Map<String,T>> type) {
                return type.join(M.join(MAP.<String,AttributeValue,T>join(getConverter(type.<T>param(1)))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return M.attributeType();
            }
        }

        /**
         * All object conversions.
         */
        private final class ObjectDocumentMap implements Rule<T> {
            private final DynamoDBMapperModelFactory.Factory models;
            private final DynamoDBMapperConfig config;
            private ObjectDocumentMap(DynamoDBMapperModelFactory.Factory models, DynamoDBMapperConfig config) {
                this.models = models;
                this.config = config;
            }
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return type.attributeType() == M.attributeType() && !MAP.is(type.targetType());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(final ConversionType<T> type) {
                return type.join(M.join(new DynamoDBTypeConverter<Map<String,AttributeValue>,T>() {
                    public final Map<String,AttributeValue> convert(final T o) {
                        return models.getModelFactory(config).getTableModel(type.targetType()).convert(o);
                    }
                    public final T unconvert(final Map<String,AttributeValue> o) {
                        return models.getModelFactory(config).getTableModel(type.targetType()).unconvert(o);
                    }
                }));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return M.attributeType();
            }
        }

        /**
         * Default conversion when no match could be determined.
         */
        private final class NotSupported implements Rule<T> {
            @Override
            public boolean isAssignableFrom(ConversionType<?> type) {
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(final ConversionType<T> type) {
                return new DynamoDBTypeConverter<AttributeValue,T>() {
                    public final AttributeValue convert(final T o) {
                        throw new DynamoDBMappingException("type " + type + " is not supported" +
                            "; requires @DynamoDBTyped or @DynamoDBTypeConverted");
                    }
                    public final T unconvert(final AttributeValue o) {
                        throw new DynamoDBMappingException("type " + type + " is not supported" +
                           "; requires @DynamoDBTyped or @DynamoDBTypeConverted");
                    }
                };
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return DynamoDBAttributeType.NULL;
            }
        }
    }

    /**
     * Attribute value conversion.
     */
    static interface Rule<T> {
        boolean isAssignableFrom(ConversionType<?> type);
        DynamoDBTypeConverter<AttributeValue,T> newConverter(ConversionType<T> type);
        DynamoDBAttributeType getAttributeType();
    }

    /**
     * Attribute value conversion factory.
     */
    static interface RuleFactory<T> {
        Rule<T> getRule(ConversionType<T> type);
    }

    /**
     * Attribute value converter.
     */
    static abstract class Converter<S> extends AbstractConverter<AttributeValue,S> implements Reflect<AttributeValue,S> {
        private final DynamoDBAttributeType attributeType;
        private Converter(DynamoDBAttributeType attributeType) {
            this.attributeType = attributeType;
        }
        public DynamoDBAttributeType attributeType() {
            return this.attributeType;
        }
        @Override
        public AttributeValue convert(S o) {
            final AttributeValue value = new AttributeValue();
            set(value, o);
            return value;
        }
        @Override
        public S unconvert(AttributeValue o) {
            final S value = get(o);
            if (value == null && o.isNULL() == null) {
                throw new DynamoDBMappingException("expected " + attributeType() + " in value " + o);
            }
            return value;
        }
    }

    /**
     * Copy conversion.
     */
    static final Converter<AttributeValue> CopyConverter = new Converter<AttributeValue>(DynamoDBAttributeType.NULL) {
        @Override
        public AttributeValue get(AttributeValue o) {
            return o == null ? null : super.convert(o);
        }
        @Override
        public void set(AttributeValue value, AttributeValue o) {
            value.withS(o.getS()).withN(o.getN()).withB(o.getB())
                .withSS(o.getSS()).withNS(o.getNS()).withBS(o.getBS())
                .withBOOL(o.getBOOL()).withL(o.getL()).withM(o.getM())
                .withNULL(o.getNULL());
        }
    };

    /**
     * {@code S}
     */
    private static final Converter<String> S = new Converter<String>(DynamoDBAttributeType.S) {
        @Override
        public String get(AttributeValue value) {
            return value.getS();
        }
        @Override
        public void set(AttributeValue value, String o) {
            value.setS(o);
        }
        @Override
        public AttributeValue convert(String o) {
            return o.length() == 0 ? null : super.convert(o);
        }
    };

    /**
     * {@code N}
     */
    private static final Converter<String> N = new Converter<String>(DynamoDBAttributeType.N) {
        @Override
        public String get(AttributeValue value) {
            return value.getN();
        }
        @Override
        public void set(AttributeValue value, String o) {
            value.setN(o);
        }
    };

    /**
     * {@code B}
     */
    private static final Converter<ByteBuffer> B = new Converter<ByteBuffer>(DynamoDBAttributeType.B) {
        @Override
        public ByteBuffer get(AttributeValue value) {
            return value.getB();
        }
        @Override
        public void set(AttributeValue value, ByteBuffer o) {
            value.setB(o);
        }
    };

    /**
     * {@code SS}
     */
    private static final Converter<List<String>> SS = new Converter<List<String>>(DynamoDBAttributeType.SS) {
        @Override
        public List<String> get(AttributeValue value) {
            return value.getSS();
        }
        @Override
        public void set(AttributeValue value, List<String> o) {
            value.setSS(o);
        }
    };

    /**
     * {@code NS}
     */
    private static final Converter<List<String>> NS = new Converter<List<String>>(DynamoDBAttributeType.NS) {
        @Override
        public List<String> get(AttributeValue value) {
            return value.getNS();
        }
        @Override
        public void set(AttributeValue value, List<String> o) {
            value.setNS(o);
        }
    };

    /**
     * {@code BS}
     */
    private static final Converter<List<ByteBuffer>> BS = new Converter<List<ByteBuffer>>(DynamoDBAttributeType.BS) {
        @Override
        public List<ByteBuffer> get(AttributeValue value) {
            return value.getBS();
        }
        @Override
        public void set(AttributeValue value, List<ByteBuffer> o) {
            value.setBS(o);
        }
    };

    /**
     * {@code BOOL}
     */
    private static final Converter<Boolean> BOOL = new Converter<Boolean>(DynamoDBAttributeType.BOOL) {
        @Override
        public Boolean get(AttributeValue o) {
            return o.getBOOL();
        }
        @Override
        public void set(AttributeValue o, Boolean value) {
            o.setBOOL(value);
        }
        @Override
        public Boolean unconvert(AttributeValue o) {
            if (o.getBOOL() == null && o.getN() != null) {
                return BOOLEAN.<Boolean>convert(o.getN());
            }
            return super.unconvert(o);
        }
    };

    /**
     * {@code L}
     */
    private static final Converter<List<AttributeValue>> L = new Converter<List<AttributeValue>>(DynamoDBAttributeType.L) {
        @Override
        public List<AttributeValue> get(AttributeValue value) {
            return value.getL();
        }
        @Override
        public void set(AttributeValue value, List<AttributeValue> o) {
            value.setL(o);
        }
    };

    /**
     * {@code M}
     */
    private static final Converter<Map<String,AttributeValue>> M = new Converter<Map<String,AttributeValue>>(DynamoDBAttributeType.M) {
        @Override
        public Map<String,AttributeValue> get(AttributeValue value) {
            return value.getM();
        }
        @Override
        public void set(AttributeValue value, Map<String,AttributeValue> o) {
            value.setM(o);
        }
    };

}
