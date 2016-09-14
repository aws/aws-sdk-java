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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

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
        BOOL(new Reflect<AttributeValue,Boolean>() {
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
                    return StandardTypeConverters.Scalar.BOOLEAN.convert(o.getN());
                }
                return super.unconvert(o);
            }
        },

        /**
         * {@code S} of {@link AttributeValue}
         */
        S(new Reflect<AttributeValue,String>() {
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
        N(new Reflect<AttributeValue,String>() {
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
        B(new Reflect<AttributeValue,ByteBuffer>() {
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
        SS(new Reflect<AttributeValue,List<String>>() {
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
        NS(new Reflect<AttributeValue,List<String>>() {
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
        BS(new Reflect<AttributeValue,List<ByteBuffer>>() {
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
        L(new Reflect<AttributeValue,List<AttributeValue>>() {
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
        M(new Reflect<AttributeValue,Map<String,AttributeValue>>() {
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
        NULL(new Reflect<AttributeValue,Boolean>() {
            public final void set(final AttributeValue o, final Boolean value) {
                o.setNULL(value);
            }
            public final Boolean get(final AttributeValue o) {
                return o.getNULL();
            }
        }) {
            @Override
            final <S,V> DynamoDBTypeConverter<AttributeValue,V> join(final DynamoDBTypeConverter<S,V> target) {
                final DynamoDBTypeConverter<AttributeValue,V> converter = (DynamoDBTypeConverter<AttributeValue,V>)target;
                return new DynamoDBTypeConverter<AttributeValue,V>() {
                    public final AttributeValue convert(final V o) {
                        return o == null ? new AttributeValue().withNULL(true) : converter.convert(o);
                    }
                    public final V unconvert(final AttributeValue o) {
                        return converter.unconvert(o);
                    }
                };
            }
        };

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The DynamoDB attribute type.
         */
        private final DynamoDBAttributeType attributeType;

        /**
         * The reflection function.
         */
        private final Reflect<AttributeValue,Object> reflect;

        /**
         * Constructs a new attribute value data converter.
         */
        private AttributeType(final Reflect<AttributeValue,?> reflect) {
            if (name().matches("[BNS]S?")) {
                this.scalarAttributeType = ScalarAttributeType.valueOf(name().substring(0,1));
            } else {
                this.scalarAttributeType = null;
            }
            this.attributeType = DynamoDBAttributeType.valueOf(name());
            this.reflect = (Reflect<AttributeValue,Object>)reflect;
        }

        /**
         * Creates a new attribute value converter with the target conversion.
         */
        <S,V> DynamoDBTypeConverter<AttributeValue,V> join(final DynamoDBTypeConverter<S,V> target) {
            return StandardTypeConverters.join((DynamoDBTypeConverter<AttributeValue,S>)this, target);
        }

        /**
         * Gets the DynamoDB attribute type.
         */
        final DynamoDBAttributeType attributeType() {
            return this.attributeType;
        }

        /**
         * Gets the scalar attribute type.
         */
        final ScalarAttributeType scalarAttributeType() {
            return this.scalarAttributeType;
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
         * Copies the value of this {@link AttributeValue} into the second.
         */
        final void copy(final AttributeValue from, final AttributeValue into) {
            this.reflect.set(into, this.reflect.get(from));
        }
    }

    /**
     * Copies the contents from the fist {@link AttributeValue} into the second.
     */
    static final void copy(final AttributeValue from, final AttributeValue into) {
        for (final AttributeType attribute : AttributeType.values()) {
            attribute.copy(from, into);
        }
    }

}
