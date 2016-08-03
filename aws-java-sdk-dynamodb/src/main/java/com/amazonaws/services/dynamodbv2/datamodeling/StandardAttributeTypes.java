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
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.LIST;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.MAP;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.SET;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.STRING;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.convertAll;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.converter;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.join;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverterFactory.OverrideFactory;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.DelegateConverter;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardAttributeTypes {

    /**
     * {@link AttributeValue} type conversions.
     */
    static enum AttributeType implements DynamoDBTypeConverter<AttributeValue,Object> {
        /**
         * {@code BOOL} of {@link AttributeValue}
         */
        BOOL(ParamType.of(Boolean.class), new Reflect<AttributeValue,Boolean>() {
            public final void set(final AttributeValue o, final Boolean value) {
                o.setBOOL(value);
            }
            public final Boolean get(final AttributeValue o) {
                return o.getBOOL();
            }
        }) {
            @Override
            public final Object unconvert(final AttributeValue o) {
                if (o.getBOOL() == null && o.getN() != null) {
                    return StandardTypeConverters.unconvert(o.getN(), Boolean.class);
                }
                return super.unconvert(o);
            }
        },

        /**
         * {@code S} of {@link AttributeValue}
         */
        S(ParamType.of(String.class), new Reflect<AttributeValue,String>() {
            public final void set(final AttributeValue o, final String value) {
                o.setS(value);
            }
            public final String get(final AttributeValue o) {
                return o.getS();
            }
        }) {
            @Override
            public final AttributeValue convert(final Object o) {
                return ((String)o).length() == 0 ? null : super.convert(o);
            }
        },

        /**
         * {@code N} of {@link AttributeValue}
         */
        N(ParamType.of(String.class), new Reflect<AttributeValue,String>() {
            public final void set(final AttributeValue o, final String value) {
                o.setN(value);
            }
            public final String get(final AttributeValue o) {
                return o.getN();
            }
        }),

        /**
         * {@code B} of {@link AttributeValue}
         */
        B(ParamType.of(ByteBuffer.class), new Reflect<AttributeValue,ByteBuffer>() {
            public final void set(final AttributeValue o, final ByteBuffer value) {
                o.setB(value);
            }
            public final ByteBuffer get(final AttributeValue o) {
                return o.getB();
            }
        }),

        /**
         * {@code SS} of {@link AttributeValue}
         */
        SS(ParamType.of(Set.class, String.class), new Reflect<AttributeValue,List<String>>() {
            public final void set(final AttributeValue o, final List<String> value) {
                o.setSS(value);
            }
            public final List<String> get(final AttributeValue o) {
                return o.getSS();
            }
        }),

        /**
         * {@code NS} of {@link AttributeValue}
         */
        NS(ParamType.of(Set.class, String.class), new Reflect<AttributeValue,List<String>>() {
            public final void set(final AttributeValue o, final List<String> value) {
                o.setNS(value);
            }
            public final List<String> get(final AttributeValue o) {
                return o.getNS();
            }
        }),

        /**
         * {@code BS} of {@link AttributeValue}
         */
        BS(ParamType.of(Set.class, ByteBuffer.class), new Reflect<AttributeValue,List<ByteBuffer>>() {
            public final void set(final AttributeValue o, final List<ByteBuffer> value) {
                o.setBS(value);
            }
            public final List<ByteBuffer> get(final AttributeValue o) {
                return o.getBS();
            }
        }),

        /**
         * {@code L} of {@link AttributeValue}
         */
        L(ParamType.of(List.class, AttributeValue.class), new Reflect<AttributeValue,List<AttributeValue>>() {
            public final void set(final AttributeValue o, final List<AttributeValue> value) {
                o.setL(value);
            }
            public final List<AttributeValue> get(final AttributeValue o) {
                return o.getL();
            }
        }),

        /**
         * {@code M} of {@link AttributeValue}
         */
        M(ParamType.of(Map.class, String.class, AttributeValue.class), new Reflect<AttributeValue,Map<String,AttributeValue>>() {
            public final void set(final AttributeValue o, final Map<String,AttributeValue> value) {
                o.setM(value);
            }
            public final Map<String,AttributeValue> get(final AttributeValue o) {
                return o.getM();
            }
        }),

        /**
         * {@code NULL} of {@link AttributeValue}
         */
        NULL(ParamType.of(AttributeValue.class), new Reflect<AttributeValue,Boolean>() {
            public final void set(final AttributeValue o, final Boolean value) {
                o.setNULL(value);
            }
            public final Boolean get(final AttributeValue o) {
                return o.getNULL();
            }
        }) {
            @Override
            final <T,U> DynamoDBTypeConverter<AttributeValue,U> join(final DynamoDBTypeConverter<T,U> target) {
                return new DelegateConverter<AttributeValue,U>((DynamoDBTypeConverter<AttributeValue,U>)target) {
                    public final AttributeValue convert(final U o) {
                        return o == null ? new AttributeValue().withNULL(true) : super.convert(o);
                    }
                };
            }
        };

        /**
         * The reflection function.
         */
        private final Reflect<AttributeValue,Object> reflect;

        /**
         * The conversion type.
         */
        private final ParamType<Object> type;

        /**
         * Constructs a new attribute value data converter.
         */
        private AttributeType(final ParamType<?> type, final Reflect<AttributeValue,?> reflect) {
            this.reflect = (Reflect<AttributeValue,Object>)reflect;
            this.type = (ParamType<Object>)type;
        }

        /**
         * Creates a new attribute value converter with the target conversion.
         */
        <T,U> DynamoDBTypeConverter<AttributeValue,U> join(final DynamoDBTypeConverter<T,U> target) {
            return StandardTypeConverters.join(this.<T>converter(), target);
        }

        /**
         * Creates a new attribute value converter with the target conversion.
         */
        final <T> DynamoDBTypeConverter<AttributeValue,T> converter() {
            return (DynamoDBTypeConverter<AttributeValue,T>)this;
        }

        /**
         * Returns the scalar attribute type corresponding to this attribute
         * type if applicable, otherwise, returns null.
         */
        final ScalarAttributeType scalarAttributeType() {
            return name().matches("[BNS]") ? ScalarAttributeType.valueOf(name()) : null;
        }

        /**
         * Returns the conversion type.
         */
        final <T> ParamType<T> type() {
            return (ParamType<T>)this.type;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public AttributeValue convert(final Object o) {
            final AttributeValue value = new AttributeValue();
            this.reflect.set(value, o);
            return value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Object unconvert(final AttributeValue o) {
            final Object value = this.reflect.get(o);
            if (value == null && o.isNULL() == null) {
                throw new DynamoDBMappingException("expected " + name() + " in value " + o);
            }
            return value;
        }

        /**
         * Copies the contents from the fist {@link AttributeValue} into the second.
         */
        static final AttributeValue copyAll(final AttributeValue from, final AttributeValue into) {
            for (final AttributeType attribute : AttributeType.values()) {
                attribute.reflect.set(into, attribute.reflect.get(from));
            }
            return into;
        }

        /**
         * Returns the attribute type corresponding to the given scalar type.
         */
        static final AttributeType of(final ScalarAttributeType scalarAttributeType, final String ... suffix) {
            if (scalarAttributeType != null) {
                return valueOf(scalarAttributeType.name() + (suffix.length == 0 ? "" : suffix[0]));
            }
            return null;
        }
    }

    /**
     * Groups the conversion rules to be evaluated.
     */
    static final class Conversions<T> extends OverrideFactory<Object,T> {
        private final Set<Conversion<T>> conversions = new LinkedHashSet<Conversion<T>>();
        private final DynamoDBMapperModelFactory models;

        /**
         * Constructs a new conversion evaluator with the specified scalar
         * type-converter factory.
         */
        Conversions(final DynamoDBTypeConverterFactory<Object,T> scalars, final DynamoDBMapperModelFactory models) {
            super(scalars);
            this.models = models;
        }

        /**
         * Adds a conversion rule.
         */
        final Conversions<T> with(final Conversion<T> conversion) {
            this.conversions.add(conversion);
            return this;
        }

        /**
         * Returns the attribute value converter for the given type.
         */
        final DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
            for (final Conversion<T> conversion : conversions) {
                if (conversion.isAssignableFrom(type)) {
                    return conversion.getConverter(type);
                }
            }
            return new DynamoDBTypeConverter<AttributeValue,T>() {
                public final AttributeValue convert(final T o) {
                    throw new DynamoDBMappingException("type [" + type + "] is not supported" +
                        "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                }
                public final T unconvert(final AttributeValue o) {
                    throw new DynamoDBMappingException("type [" + type + "] is not supported" +
                        "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                }
            };
        }

        /**
         * Returns the native bool converter.
         */
        final DynamoDBTypeConverter<AttributeValue,T> nativeBoolean(final ParamType<T> type) {
            return AttributeType.BOOL.join(converter(AttributeType.BOOL.type().type(), type.type()));
        }

        /**
         * Native boolean conversion.
         */
        final class NativeBool implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return BOOLEAN.is(type.type());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return nativeBoolean(type);
            }
        }

        /**
         * Scalar conversions.
         */
        final class AllScalars implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return type.scalar().scalarAttributeType() != null;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                AttributeType attribute = AttributeType.of(type.scalar().scalarAttributeType());
                return attribute.join(Conversions.this.getConverter(attribute.type().type(), type.type()));
            }
        }

        /**
         * Scalar set conversions.
         */
        final class AllScalarSets implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return SET.is(type.type()) && type.param(0).scalar().scalarAttributeType() != null;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                AttributeType attribute = AttributeType.of(type.param(0).scalar().scalarAttributeType(),"S");
                return attribute.join(SET.wrap(Conversions.this.getConverter(attribute.type().param(0).type(), type.param(0).type())));
            }
        }

        /**
         * V1 Object set conversions.
         */
        final class AnyObjectStringSet implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return SET.is(type.type());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return AttributeType.SS.join(SET.wrap(converter(String.class, (Class<T>)Object.class)));
            }
        }

        /**
         * Native bool {@link Set} conversions.
         */
        final class NativeBoolSet implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return SET.is(type.type()) && BOOLEAN.is(type.param(0).type());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return join((DynamoDBTypeConverter<AttributeValue,T>)new DelegateConverter<AttributeValue,List<AttributeValue>>(
                    AttributeType.L.<List<AttributeValue>>converter()) {
                    public final List<AttributeValue> unconvert(final AttributeValue o) {
                        if (o.getL() == null && o.getNS() != null) {
                            return convertAll(o.getNS(), AttributeType.BOOL.join(converter(Boolean.class, String.class)));
                        }
                        return super.unconvert(o);
                    }
                }, (DynamoDBTypeConverter<T,T>)SET.wrap(AttributeType.NULL.join(AttributeType.BOOL.<T>converter())));
            }
        }

        /**
         * V2 Object set conversions.
         */
        final class AnySet implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return SET.is(type.type());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return AttributeType.L.join(SET.wrap(AttributeType.NULL.join(Conversions.this.getConverter(type.param(0)))));
            }
        }

        /**
         * Any {@link List} conversions.
         */
        final class AnyList implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return LIST.is(type.type()) && type.param(0) != null;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return AttributeType.L.join(LIST.wrap(AttributeType.NULL.join(Conversions.this.getConverter(type.param(0)))));
            }
        }

        /**
         * Any {@link Map} conversions.
         */
        final class AnyMap implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return MAP.is(type.type()) && type.param(1) != null && STRING.is(type.param(0).type());
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return AttributeType.M.join(MAP.wrap(AttributeType.NULL.join(Conversions.this.getConverter(type.param(1)))));
            }
        }

        /**
         * All {@link DynamoDBDocument} conversions.
         */
        final class AnyDocumentObject implements Conversion<T> {
            @Override
            public boolean isAssignableFrom(final ParamType<T> type) {
                return StandardAnnotationMaps.of(type.type()).document() != null;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,T> getConverter(final ParamType<T> type) {
                return AttributeType.M.join(new DynamoDBTypeConverter<Map<String,AttributeValue>,T>() {
                    public final Map<String,AttributeValue> convert(final T o) {
                        return models.getTableModel(type.type()).convert(o);
                    }
                    public final T unconvert(final Map<String,AttributeValue> o) {
                        return models.getTableModel(type.type()).unconvert(o);
                    }
                });
            }
        }
    }

    /**
     * Attribute value conversion.
     */
    static interface Conversion<T> {
        boolean isAssignableFrom(ParamType<T> type);
        DynamoDBTypeConverter<AttributeValue,T> getConverter(ParamType<T> type);
    }

}
