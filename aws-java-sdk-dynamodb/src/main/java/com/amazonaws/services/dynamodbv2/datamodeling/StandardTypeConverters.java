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
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.util.DateUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
final class StandardTypeConverters {

    /**
     * One-way type-converter.
     */
    static abstract class ConvertTo<S,T> {
        static final ConvertTo<?,?> ANY = new ConvertTo<Object,Object>() {
            public final Object convertTo(final Object o) {
                return o;
            }
        };
        public abstract T convertTo(S o);
    }

    /**
     * Standard scalar types.
     */
    static enum Scalar {
        /**
         * {@link BigDecimal}
         */
        BIG_DECIMAL(ScalarAttributeType.N, new ConvertToMap(BigDecimal.class, null)
            .with(String.class, new ConvertTo<String,BigDecimal>() {
                public final BigDecimal convertTo(final String o) {
                    return new BigDecimal(o);
                }
            })
        ),

        /**
         * {@link BigInteger}
         */
        BIG_INTEGER(ScalarAttributeType.N, new ConvertToMap(BigInteger.class, null)
            .with(String.class, new ConvertTo<String,BigInteger>() {
                public final BigInteger convertTo(final String o) {
                    return new BigInteger(o);
                }
            })
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(ScalarAttributeType.N, new ConvertToMap(Boolean.class, Boolean.TYPE)
            .with(String.class, new ConvertTo<String,Boolean>() {
                public final Boolean convertTo(final String o) {
                    return "0".equals(o) ? Boolean.FALSE : "1".equals(o) ? Boolean.TRUE : Boolean.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte}
         */
        BYTE(ScalarAttributeType.N, new ConvertToMap(Byte.class, Byte.TYPE)
            .with(String.class, new ConvertTo<String,Byte>() {
                public final Byte convertTo(final String o) {
                    return Byte.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(ScalarAttributeType.B, new ConvertToMap(byte[].class, null)
            .with(ByteBuffer.class, new ConvertTo<ByteBuffer,byte[]>() {
                public final byte[] convertTo(final ByteBuffer o) {
                    if (o.hasArray()) {
                        return o.array();
                    }
                    final byte[] array = new byte[o.remaining()];
                    o.get(array);
                    return array;
                }
            })
        ),

        /**
         * {@link ByteBuffer}
         */
        BYTE_BUFFER(ScalarAttributeType.B, new ConvertToMap(ByteBuffer.class, null)
            .with(byte[].class, new ConvertTo<byte[],ByteBuffer>() {
                public final ByteBuffer convertTo(final byte[] o) {
                    return ByteBuffer.wrap(o);
                }
            })
        ),

        /**
         * {@link Calendar}
         */
        CALENDAR(ScalarAttributeType.S, new ConvertToMap(Calendar.class, null)
            .with(Date.class, new ConvertTo<Date,Calendar>() {
                public final Calendar convertTo(final Date o) {
                    final Calendar calendar = Calendar.getInstance();
                    calendar.setTime(o);
                    return calendar;
                }
            })
            .with(String.class, new ConvertTo<String,Calendar>() {
                public final Calendar convertTo(final String o) {
                    final Calendar calendar = Calendar.getInstance();
                    calendar.setTime(DateUtils.parseISO8601Date(o));
                    return calendar;
                }
            })
        ),

        /**
         * {@link Character}
         */
        CHARACTER(null, new ConvertToMap(Character.class, Character.TYPE)
            .with(String.class, new ConvertTo<String,Character>() {
                public final Character convertTo(final String o) {
                    if (o.length() != 1) {
                        throw new DynamoDBMappingException("expected single character string");
                    }
                    return Character.valueOf(o.charAt(0));
                }
            })
        ),

        /**
         * {@link Date}
         */
        DATE(ScalarAttributeType.S, new ConvertToMap(Date.class, null)
            .with(Calendar.class, new ConvertTo<Calendar,Date>() {
                public final Date convertTo(final Calendar o) {
                    return o.getTime();
                }
            })
            .with(Long.class, new ConvertTo<Long,Date>() {
                public final Date convertTo(final Long o) {
                    return new Date(o);
                }
            })
            .with(String.class, new ConvertTo<String,Date>() {
                public final Date convertTo(final String o) {
                    return DateUtils.parseISO8601Date(o);
                }
            })
        ),

        /**
         * {@link Double}
         */
        DOUBLE(ScalarAttributeType.N, new ConvertToMap(Double.class, Double.TYPE)
            .with(String.class, new ConvertTo<String,Double>() {
                public final Double convertTo(final String o) {
                    return Double.valueOf(o);
                }
            })
        ),

        /**
         * {@link Enum}
         */
        ENUM(null, new ConvertToMap(Enum.class, null)),

        /**
         * {@link Float}
         */
        FLOAT(ScalarAttributeType.N, new ConvertToMap(Float.class, Float.TYPE)
            .with(String.class, new ConvertTo<String,Float>() {
                public final Float convertTo(final String o) {
                    return Float.valueOf(o);
                }
            })
        ),

        /**
         * {@link Integer}
         */
        INTEGER(ScalarAttributeType.N, new ConvertToMap(Integer.class, Integer.TYPE)
            .with(String.class, new ConvertTo<String,Integer>() {
                public final Integer convertTo(final String o) {
                    return Integer.valueOf(o);
                }
            })
        ),

        /**
         * {@link List}
         */
        LIST(null, new ConvertToMap(List.class, null)),

        /**
         * {@link Long}
         */
        LONG(ScalarAttributeType.N, new ConvertToMap(Long.class, Long.TYPE)
            .with(Date.class, new ConvertTo<Date,Long>() {
               public final Long convertTo(final Date o) {
                    return o.getTime();
                }
            })
            .with(String.class, new ConvertTo<String,Long>() {
                public final Long convertTo(final String o) {
                    return Long.valueOf(o);
                }
            })
        ),

        /**
         * {@link Map}
         */
        MAP(null, new ConvertToMap(Map.class, null)),

        /**
         * {@link S3Link}
         */
        S3_LINK(ScalarAttributeType.S, new ConvertToMap(S3Link.class, null)),

        /**
         * {@link Set}
         */
        SET(null, new ConvertToMap(Set.class, null)),

        /**
         * {@link Short}
         */
        SHORT(ScalarAttributeType.N, new ConvertToMap(Short.class, Short.TYPE)
            .with(String.class, new ConvertTo<String,Short>() {
                public final Short convertTo(final String o) {
                    return Short.valueOf(o);
                }
            })
        ),

        /**
         * {@link String}
         */
        STRING(ScalarAttributeType.S, new ConvertToMap(String.class, null)
            .with(Boolean.class, new ConvertTo<Boolean,String>() {
                public final String convertTo(final Boolean o) {
                    return Boolean.TRUE.equals(o) ? "1" : "0";
                }
            })
            .with(Calendar.class, new ConvertTo<Calendar,String>() {
                public final String convertTo(final Calendar o) {
                    return DateUtils.formatISO8601Date(o.getTime());
                }
            })
            .with(Date.class, new ConvertTo<Date,String>() {
                public final String convertTo(final Date o) {
                    return DateUtils.formatISO8601Date(o);
                }
            })
            .with(Enum.class, new ConvertTo<Enum,String>() {
                public final String convertTo(final Enum o) {
                    return o.name();
                }
            })
            .with(S3Link.class, new ConvertTo<S3Link,String>() {
                public final String convertTo(final S3Link o) {
                    return o.getBucketName() == null || o.getKey() == null ? null : o.toJson();
                }
            })
            .with(Object.class, new ConvertTo<Object,String>() {
                public final String convertTo(final Object o) {
                    return o.toString();
                }
            })
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(ScalarAttributeType.S, new ConvertToMap(java.util.UUID.class, null)
            .with(String.class, new ConvertTo<String,java.util.UUID>() {
                public final java.util.UUID convertTo(final String o) {
                    return java.util.UUID.fromString(o);
                }
            })
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(null, new ConvertToMap(Object.class, null)
            .with(Object.class, ConvertTo.ANY)
        );

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConvertToMap<?> map;

        /**
         * Constructs a new scalar.
         * @param scalarAttributeType The scalar attribute type.
         * @param map The mapping of conversion functions.
         */
        private Scalar(final ScalarAttributeType scalarAttributeType, final ConvertToMap<?> map) {
            this.scalarAttributeType = scalarAttributeType;
            this.map = map;
        }

        /**
         * Gets the scalar attribute type.
         * @return The scalar attribute type.
         */
        public final ScalarAttributeType scalarAttributeType() {
            return this.scalarAttributeType;
        }

        /**
         * Gets the type-converter matching the conversion types.
         * @param scalar The scalar.
         * @return The type-converter.
         */
        public final <S,T> ConvertTo<S,T> to(final Scalar scalar) {
            for (final Class<?> key : scalar.map.keySet()) {
                if (key.isAssignableFrom(this.map.type)) {
                    return (ConvertTo<S,T>)scalar.map.get(key);
                }
            }
            if (this == scalar) { //<- unmapped type-to-type
                return (ConvertTo<S,T>)ConvertTo.ANY;
            }
            throw new DynamoDBMappingException("unsupported " + this + " to " + scalar);
        }

        /**
         * Gets the type-converter matching the conversion types.
         * @param targetType The conversion type.
         * @param primitive Indicates if primitives are allowed.
         * @return The type-converter.
         */
        public final <S,T> ConvertTo<S,T> to(final Class<T> targetType, final boolean primitive) {
            if (this == STRING && targetType.isEnum()) { //<- enum requires type
                return (ConvertTo<S,T>)new StringToEnum(targetType);
            }
            return this.<S,T>to(Scalar.of(targetType, primitive));
        }

        /**
         * Returns the scalar matching the type conversion.
         * @param targetType The conversion type.
         * @param primitive Flag indicating if primitives are allowed.
         * @return The scalar.
         */
        public static final Scalar of(final Class<?> targetType, final boolean primitive) {
            if (targetType != null) {
                if (!targetType.isPrimitive()) {
                    for (final Scalar scalar : Scalar.values()) {
                        if (scalar.map.type.isAssignableFrom(targetType)) {
                            return scalar;
                        }
                    }
                } else if (primitive) {
                    for (final Scalar scalar : Scalar.values()) {
                        if (scalar.map.primitiveType == null) {
                            continue;
                        } else if (scalar.map.primitiveType.isAssignableFrom(targetType)) {
                            return scalar;
                        }
                    }
                }
            }
            return Scalar.DEFAULT;
        }
    }

    /**
     * Map of class to converters for a given type.
     */
    private static final class ConvertToMap<T> extends LinkedHashMap<Class<?>,ConvertTo<?,T>> {
        private final Class<?> primitiveType;
        private final Class<T> type;
        private ConvertToMap(final Class<T> type, final Class<?> primitiveType) {
            this.primitiveType = primitiveType;
            this.type = type;
        }
        private final <S> ConvertToMap<T> with(final Class<S> key, final ConvertTo<S,T> convertTo) {
            if (super.put(key, convertTo) != null) {
                throw new IllegalStateException("duplicate conversion for type " + key);
            }
            return this;
        }
    }

    /**
     * {@link String} to {@link Enum}
     */
    private static final class StringToEnum<T extends Enum<T>> extends ConvertTo<String,T> {
        private final Class<T> targetType;
        private StringToEnum(final Class<T> targetType) {
            this.targetType = targetType;
        }
        @Override
        public final T convertTo(final String o) {
            return Enum.valueOf(targetType, o);
        }
    }

}
