/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperModelFactory.TableFactory;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter.AbstractConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter.DelegateConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Beans;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;

import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BOOLEAN;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.DEFAULT;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.STRING;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.LIST;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.MAP;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.SET;
import static com.amazonaws.services.dynamodbv2.model.ScalarAttributeType.B;
import static com.amazonaws.services.dynamodbv2.model.ScalarAttributeType.N;
import static com.amazonaws.services.dynamodbv2.model.ScalarAttributeType.S;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardModelFactories {

    private static final Log LOG = LogFactory.getLog(StandardModelFactories.class);

    /**
     * Creates the standard {@link DynamoDBMapperModelFactory} factory.
     */
    static final DynamoDBMapperModelFactory of(S3Link.Factory s3Links) {
        return new StandardModelFactory(s3Links);
    }

    /**
     * {@link TableFactory} mapped by {@link ConversionSchema}.
     */
    private static final class StandardModelFactory implements DynamoDBMapperModelFactory {
        private final ConcurrentMap<ConversionSchema,TableFactory> cache;
        private final S3Link.Factory s3Links;

        private StandardModelFactory(S3Link.Factory s3Links) {
            this.cache = new ConcurrentHashMap<ConversionSchema,TableFactory>();
            this.s3Links = s3Links;
        }

        @Override
        public TableFactory getTableFactory(DynamoDBMapperConfig config) {
            final ConversionSchema schema = config.getConversionSchema();
            if (!cache.containsKey(schema)) {
                RuleFactory<Object> rules = rulesOf(config, s3Links, this);
                rules = new ConversionSchemas.ItemConverterRuleFactory<Object>(config, s3Links, rules);
                cache.putIfAbsent(schema, new StandardTableFactory(rules));
            }
            return cache.get(schema);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} mapped by the clazz.
     */
    private static final class StandardTableFactory implements TableFactory {
        private final ConcurrentMap<Class<?>,DynamoDBMapperTableModel<?>> cache;
        private final RuleFactory<Object> rules;

        private StandardTableFactory(RuleFactory<Object> rules) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.rules = rules;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> DynamoDBMapperTableModel<T> getTable(Class<T> clazz) {
            if (!this.cache.containsKey(clazz)) {
                this.cache.putIfAbsent(clazz, new TableBuilder<T>(clazz, rules).build());
            }
            return (DynamoDBMapperTableModel<T>)this.cache.get(clazz);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    private static final class TableBuilder<T> extends DynamoDBMapperTableModel.Builder<T> {
        private TableBuilder(Class<T> clazz, Beans<T> beans, RuleFactory<Object> rules) {
            super(clazz, beans.properties());
            for (final Bean<T,Object> bean : beans.map().values()) {
                try {
                    with(new FieldBuilder<T,Object>(clazz, bean, rules.getRule(bean.type())).build());
                } catch (final RuntimeException e) {
                    throw new DynamoDBMappingException(String.format(
                        "%s[%s] could not be mapped for type %s",
                        clazz.getSimpleName(), bean.properties().attributeName(), bean.type()
                    ), e);
                }
            }
        }

        private TableBuilder(Class<T> clazz, RuleFactory<Object> rules) {
            this(clazz, StandardBeanProperties.<T>of(clazz), rules);
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} builder.
     */
    private static final class FieldBuilder<T,V> extends DynamoDBMapperFieldModel.Builder<T,V> {
        private FieldBuilder(Class<T> clazz, Bean<T,V> bean, Rule<V> rule) {
            super(clazz, bean.properties());
            if (bean.type().attributeType() != null) {
                with(bean.type().attributeType());
            } else {
                with(rule.getAttributeType());
            }
            with(rule.newConverter(bean.type()));
            with(bean.reflect());
        }
    }

    /**
     * Creates a new set of conversion rules based on the configuration.
     */
    private static final <T> RuleFactory<T> rulesOf(DynamoDBMapperConfig config, S3Link.Factory s3Links, DynamoDBMapperModelFactory models) {
        final boolean ver1 = (config.getConversionSchema() == ConversionSchemas.V1);
        final boolean ver2 = (config.getConversionSchema() == ConversionSchemas.V2);
        final boolean v2Compatible = (config.getConversionSchema() == ConversionSchemas.V2_COMPATIBLE);

        final DynamoDBTypeConverterFactory.Builder scalars = config.getTypeConverterFactory().override();
        scalars.with(String.class, S3Link.class, s3Links);

        final Rules<T> factory = new Rules<T>(scalars.build());
        factory.add(factory.new NativeType(!ver1));
        factory.add(factory.new V2CompatibleBool(v2Compatible));
        factory.add(factory.new NativeBool(ver2));
        factory.add(factory.new StringScalar(true));
        factory.add(factory.new DateToEpochRule(true));
        factory.add(factory.new NumberScalar(true));
        factory.add(factory.new BinaryScalar(true));
        factory.add(factory.new NativeBoolSet(ver2));
        factory.add(factory.new StringScalarSet(true));
        factory.add(factory.new NumberScalarSet(true));
        factory.add(factory.new BinaryScalarSet(true));
        factory.add(factory.new ObjectSet(ver2));
        factory.add(factory.new ObjectStringSet(!ver2));
        factory.add(factory.new ObjectList(!ver1));
        factory.add(factory.new ObjectMap(!ver1));
        factory.add(factory.new ObjectDocumentMap(!ver1, models, config));
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
        private void add(Rule<?> rule) {
            this.rules.add((Rule<T>)rule);
        }

        @Override
        public Rule<T> getRule(ConvertibleType<T> type) {
            for (final Rule<T> rule : rules) {
                if (rule.isAssignableFrom(type)) {
                    return rule;
                }
            }
            return new NotSupported();
        }

        /**
         * Native {@link AttributeValue} conversion.
         */
        private class NativeType extends AbstractRule<AttributeValue,T> {
            private NativeType(boolean supported) {
                super(DynamoDBAttributeType.NULL, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.supported && type.is(AttributeValue.class);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(type.<AttributeValue>typeConverter());
            }
            @Override
            public AttributeValue get(AttributeValue o) {
                return o;
            }
            @Override
            public void set(AttributeValue value, AttributeValue o) {
                value.withS(o.getS()).withN(o.getN()).withB(o.getB())
                    .withSS(o.getSS()).withNS(o.getNS()).withBS(o.getBS())
                    .withBOOL(o.getBOOL()).withL(o.getL()).withM(o.getM())
                    .withNULL(o.getNULL());
            }
        }

        /**
         * {@code S} conversion
         */
        private class StringScalar extends AbstractRule<String,T> {
            private StringScalar(boolean supported) {
                super(DynamoDBAttributeType.S, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(S));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(String.class, type), type.<String>typeConverter());
            }
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
        }

        /**
         * {@code N} conversion
         */
        private class NumberScalar extends AbstractRule<String,T> {
            private NumberScalar(boolean supported) {
                super(DynamoDBAttributeType.N, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(N));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(String.class, type), type.<String>typeConverter());
            }
            @Override
            public String get(AttributeValue value) {
                return value.getN();
            }
            @Override
            public void set(AttributeValue value, String o) {
                value.setN(o);
            }
        }

        /**
         * {@code N} conversion
         */
        private class DateToEpochRule extends AbstractRule<Long,T> {
            private DateToEpochRule(boolean supported) {
                super(DynamoDBAttributeType.N, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return (type.is(Date.class) || type.is(Calendar.class) || type.is(DateTime.class))
                       && super.isAssignableFrom(type) && (type.attributeType() != null || type.is(N));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(Long.class, type), type.<Long>typeConverter());
            }
            @Override
            public Long get(AttributeValue value) {
                return Long.valueOf(value.getN());
            }
            @Override
            public void set(AttributeValue value, Long o) {
                value.setN(String.valueOf(o));
            }
        }

        /**
         * {@code B} conversion
         */
        private class BinaryScalar extends AbstractRule<ByteBuffer,T> {
            private BinaryScalar(boolean supported) {
                super(DynamoDBAttributeType.B, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(B));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(ByteBuffer.class, type), type.<ByteBuffer>typeConverter());
            }
            @Override
            public ByteBuffer get(AttributeValue value) {
                return value.getB();
            }
            @Override
            public void set(AttributeValue value, ByteBuffer o) {
                value.setB(o);
            }
        }

        /**
         * {@code SS} conversion
         */
        private class StringScalarSet extends AbstractRule<List<String>,Collection<T>> {
            private StringScalarSet(boolean supported) {
                super(DynamoDBAttributeType.SS, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(S, SET));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConvertibleType<Collection<T>> type) {
                return joinAll(SET.join(getConverter(String.class, type.<T>param(0))), type.<List<String>>typeConverter());
            }
            @Override
            public List<String> get(AttributeValue value) {
                return value.getSS();
            }
            @Override
            public void set(AttributeValue value, List<String> o) {
                value.setSS(o);
            }
        }

        /**
         * {@code NS} conversion
         */
        private class NumberScalarSet extends AbstractRule<List<String>,Collection<T>> {
            private NumberScalarSet(boolean supported) {
                super(DynamoDBAttributeType.NS, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(N, SET));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConvertibleType<Collection<T>> type) {
                return joinAll(SET.join(getConverter(String.class, type.<T>param(0))), type.<List<String>>typeConverter());
            }
            @Override
            public List<String> get(AttributeValue value) {
                return value.getNS();
            }
            @Override
            public void set(AttributeValue value, List<String> o) {
                value.setNS(o);
            }
        }

        /**
         * {@code BS} conversion
         */
        private class BinaryScalarSet extends AbstractRule<List<ByteBuffer>,Collection<T>> {
            private BinaryScalarSet(boolean supported) {
                super(DynamoDBAttributeType.BS, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && (type.attributeType() != null || type.is(B, SET));
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConvertibleType<Collection<T>> type) {
                return joinAll(SET.join(getConverter(ByteBuffer.class, type.<T>param(0))), type.<List<ByteBuffer>>typeConverter());
            }
            @Override
            public List<ByteBuffer> get(AttributeValue value) {
                return value.getBS();
            }
            @Override
            public void set(AttributeValue value, List<ByteBuffer> o) {
                value.setBS(o);
            }
        }

        /**
         * {@code SS} conversion
         */
        private class ObjectStringSet extends StringScalarSet {
            private ObjectStringSet(boolean supported) {
                super(supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return type.attributeType() == null && super.supported && type.is(SET);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConvertibleType<Collection<T>> type) {
                LOG.warn("Marshaling a set of non-String objects to a DynamoDB "
                    + "StringSet. You won't be able to read these objects back "
                    + "out of DynamoDB unless you REALLY know what you're doing: "
                    + "it's probably a bug. If you DO know what you're doing feel"
                    + "free to ignore this warning, but consider using a custom "
                    + "marshaler for this instead.");
                return joinAll(SET.join(scalars.getConverter(String.class, DEFAULT.<T>type())), type.<List<String>>typeConverter());
            }
        }

        /**
         * Native boolean conversion.
         */
        private class NativeBool extends AbstractRule<Boolean,T> {
            private NativeBool(boolean supported) {
                super(DynamoDBAttributeType.BOOL, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.is(BOOLEAN);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(Boolean.class, type), type.<Boolean>typeConverter());
            }
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
        }

        /**
         * Native boolean conversion.
         */
        private class V2CompatibleBool extends AbstractRule<String, T> {
            private V2CompatibleBool(boolean supported) {
                super(DynamoDBAttributeType.N, supported);
            }

            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.is(BOOLEAN);
            }

            @Override
            public DynamoDBTypeConverter<AttributeValue, T> newConverter(ConvertibleType<T> type) {
                return joinAll(getConverter(String.class, type), type.<String>typeConverter());
            }

            /**
             * For V2 Compatible schema we support loading booleans from a numeric attribute value (0/1) or the native boolean
             * type.
             */
            @Override
            public String get(AttributeValue o) {
                if(o.getBOOL() != null) {
                    // Handle native bools, transform to expected numeric representation.
                    return o.getBOOL() ? "1" : "0";
                }
                return o.getN();
            }

            /**
             * For the V2 compatible schema we save as a numeric attribute value unless overridden by {@link
             * DynamoDBNativeBoolean} or {@link DynamoDBTyped}.
             */
            @Override
            public void set(AttributeValue o, String value) {
                o.setN(value);
            }
        }

        /**
         * Any {@link Set} conversions.
         */
        private class ObjectSet extends AbstractRule<List<AttributeValue>,Collection<T>> {
            private ObjectSet(boolean supported) {
                super(DynamoDBAttributeType.L, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.param(0) != null && type.is(SET);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<T>> newConverter(ConvertibleType<Collection<T>> type) {
                return joinAll(SET.join(getConverter(type.<T>param(0))), type.<List<AttributeValue>>typeConverter());
            }
            @Override
            public List<AttributeValue> get(AttributeValue value) {
                return value.getL();
            }
            @Override
            public void set(AttributeValue value, List<AttributeValue> o) {
                value.setL(o);
            }
        }

        /**
         * Native bool {@link Set} conversions.
         */
        private class NativeBoolSet extends ObjectSet {
            private NativeBoolSet(boolean supported) {
                super(supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.param(0).is(BOOLEAN);
            }
            @Override
            public List<AttributeValue> unconvert(AttributeValue o) {
                if (o.getL() == null && o.getNS() != null) {
                    return LIST.convert(o.getNS(), new NativeBool(true).join(scalars.getConverter(Boolean.class, String.class)));
                }
                return super.unconvert(o);
            }
        }

        /**
         * Any {@link List} conversions.
         */
        private class ObjectList extends AbstractRule<List<AttributeValue>,List<T>> {
            private ObjectList(boolean supported) {
                super(DynamoDBAttributeType.L, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.param(0) != null && type.is(LIST);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,List<T>> newConverter(ConvertibleType<List<T>> type) {
                return joinAll(LIST.join(getConverter(type.<T>param(0))), type.<List<AttributeValue>>typeConverter());
            }
            @Override
            public List<AttributeValue> get(AttributeValue value) {
                return value.getL();
            }
            @Override
            public void set(AttributeValue value, List<AttributeValue> o) {
                value.setL(o);
            }
        }

        /**
         * Any {@link Map} conversions.
         */
        private class ObjectMap extends AbstractRule<Map<String,AttributeValue>,Map<String,T>> {
            private ObjectMap(boolean supported) {
                super(DynamoDBAttributeType.M, supported);
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return super.isAssignableFrom(type) && type.param(1) != null && type.is(MAP) && type.param(0).is(STRING);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Map<String,T>> newConverter(ConvertibleType<Map<String,T>> type) {
                return joinAll(
                    MAP.<String,AttributeValue,T>join(getConverter(type.<T>param(1))),
                    type.<Map<String,AttributeValue>>typeConverter()
                );
            }
            @Override
            public Map<String,AttributeValue> get(AttributeValue value) {
                return value.getM();
            }
            @Override
            public void set(AttributeValue value, Map<String,AttributeValue> o) {
                value.setM(o);
            }
        }

        /**
         * All object conversions.
         */
        private class ObjectDocumentMap extends AbstractRule<Map<String,AttributeValue>,T> {
            private final DynamoDBMapperModelFactory models;
            private final DynamoDBMapperConfig config;
            private ObjectDocumentMap(boolean supported, DynamoDBMapperModelFactory models, DynamoDBMapperConfig config) {
                super(DynamoDBAttributeType.M, supported);
                this.models = models;
                this.config = config;
            }
            @Override
            public boolean isAssignableFrom(ConvertibleType<?> type) {
                return type.attributeType() == getAttributeType() && super.supported && !type.is(MAP);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(final ConvertibleType<T> type) {
                return joinAll(new DynamoDBTypeConverter<Map<String,AttributeValue>,T>() {
                    public final Map<String,AttributeValue> convert(final T o) {
                        return models.getTableFactory(config).getTable(type.targetType()).convert(o);
                    }
                    public final T unconvert(final Map<String,AttributeValue> o) {
                        return models.getTableFactory(config).getTable(type.targetType()).unconvert(o);
                    }
                }, type.<Map<String,AttributeValue>>typeConverter());
            }
            @Override
            public Map<String,AttributeValue> get(AttributeValue value) {
                return value.getM();
            }
            @Override
            public void set(AttributeValue value, Map<String,AttributeValue> o) {
                value.setM(o);
            }
        }

        /**
         * Default conversion when no match could be determined.
         */
        private class NotSupported extends AbstractRule<T,T> {
            private NotSupported() {
                super(DynamoDBAttributeType.NULL, false);
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type) {
                return this;
            }
            @Override
            public T get(AttributeValue value) {
                throw new DynamoDBMappingException("not supported; requires @DynamoDBTyped or @DynamoDBTypeConverted");
            }
            @Override
            public void set(AttributeValue value, T o) {
                throw new DynamoDBMappingException("not supported; requires @DynamoDBTyped or @DynamoDBTypeConverted");
            }
        }

        /**
         * Gets the scalar converter for the given source and target types.
         */
        private <S> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, ConvertibleType<T> type) {
            return scalars.getConverter(sourceType, type.targetType());
        }

        /**
         * Gets the nested converter for the given conversion type.
         * Also wraps the resulting converter with a nullable converter.
         */
        private DynamoDBTypeConverter<AttributeValue,T> getConverter(ConvertibleType<T> type) {
            return new DelegateConverter<AttributeValue,T>(getRule(type).newConverter(type)) {
                public final AttributeValue convert(T o) {
                    return o == null ? new AttributeValue().withNULL(true) : super.convert(o);
                }
            };
        }
    }

    /**
     * Basic attribute value conversion functions.
     */
    private static abstract class AbstractRule<S,T> extends AbstractConverter<AttributeValue,S> implements Reflect<AttributeValue,S>, Rule<T> {
        protected final DynamoDBAttributeType attributeType;
        protected final boolean supported;
        protected AbstractRule(DynamoDBAttributeType attributeType, boolean supported) {
            this.attributeType = attributeType;
            this.supported = supported;
        }
        @Override
        public boolean isAssignableFrom(ConvertibleType<?> type) {
            return type.attributeType() == null ? supported : type.attributeType() == attributeType;
        }
        @Override
        public DynamoDBAttributeType getAttributeType() {
           return this.attributeType;
        }
        @Override
        public AttributeValue convert(final S o) {
            final AttributeValue value = new AttributeValue();
            set(value, o);
            return value;
        }
        @Override
        public S unconvert(final AttributeValue o) {
            final S value = get(o);
            if (value == null && o.isNULL() == null) {
                throw new DynamoDBMappingException("expected " + attributeType  + " in value " + o);
            }
            return value;
        }
    }

    /**
     * Attribute value conversion.
     */
    static interface Rule<T> {
        boolean isAssignableFrom(ConvertibleType<?> type);
        DynamoDBTypeConverter<AttributeValue,T> newConverter(ConvertibleType<T> type);
        DynamoDBAttributeType getAttributeType();
    }

    /**
     * Attribute value conversion factory.
     */
    static interface RuleFactory<T> {
        Rule<T> getRule(ConvertibleType<T> type);
    }

}
