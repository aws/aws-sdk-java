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

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
final class StandardTypeConverters<S,T> implements DynamoDBTypeConverterFactory<S,T> {

    /**
     * Standard scalar type-converter factory.
     */
    private static final DynamoDBTypeConverterFactory<?,?> FACTORY = new StandardTypeConverters();
    static final <S,T> DynamoDBTypeConverterFactory<S,T> factory() {
        return (DynamoDBTypeConverterFactory<S,T>)StandardTypeConverters.FACTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamoDBTypeConverter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
        final Scalar source = Scalar.of(sourceType), target = Scalar.of(targetType);
        final ConvertTo<S,T> sourceFromTarget = source.from(sourceType, (Class<T>)target.map.types[0]);
        final ConvertTo<T,S> targetFromSource = target.from(targetType, (Class<S>)source.map.types[0]);
        return new DynamoDBTypeConverter<S,T>() {
            public final S convert(final T o) {
                return sourceFromTarget.convertTo(o);
            }
            public final T unconvert(final S o) {
                return targetFromSource.convertTo(o);
            }
        };
    }

    /**
     * Standard scalar types.
     */
    static enum Scalar {
        /**
         * {@link java.math.BigDecimal}
         */
        BIG_DECIMAL(ScalarAttributeType.N, new ConvertToMap(java.math.BigDecimal.class)
            .with(String.class, new ConvertTo<java.math.BigDecimal,String>() {
                public final java.math.BigDecimal convertTo(final String o) {
                    return new java.math.BigDecimal(o);
                }
            })
        ),

        /**
         * {@link java.math.BigInteger}
         */
        BIG_INTEGER(ScalarAttributeType.N, new ConvertToMap(java.math.BigInteger.class)
            .with(String.class, new ConvertTo<java.math.BigInteger,String>() {
                public final java.math.BigInteger convertTo(final String o) {
                    return new java.math.BigInteger(o);
                }
            })
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(ScalarAttributeType.N, new ConvertToMap(Boolean.class, Boolean.TYPE)
            .with(String.class, new ConvertTo<Boolean,String>() {
                public final Boolean convertTo(final String o) {
                    return "0".equals(o) ? Boolean.FALSE : "1".equals(o) ? Boolean.TRUE : Boolean.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte}
         */
        BYTE(ScalarAttributeType.N, new ConvertToMap(Byte.class, Byte.TYPE)
            .with(String.class, new ConvertTo<Byte,String>() {
                public final Byte convertTo(final String o) {
                    return Byte.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(ScalarAttributeType.B, new ConvertToMap(byte[].class)
            .with(java.nio.ByteBuffer.class, new ConvertTo<byte[],java.nio.ByteBuffer>() {
                public final byte[] convertTo(final java.nio.ByteBuffer o) {
                    if (o.hasArray()) {
                        return o.array();
                    }
                    final byte[] value = new byte[o.remaining()];
                    o.get(value);
                    return value;
                }
            })
        ),

        /**
         * {@link java.nio.ByteBuffer}
         */
        BYTE_BUFFER(ScalarAttributeType.B, new ConvertToMap(java.nio.ByteBuffer.class)
            .with(byte[].class, new ConvertTo<java.nio.ByteBuffer,byte[]>() {
                public final java.nio.ByteBuffer convertTo(final byte[] o) {
                    return java.nio.ByteBuffer.wrap(o);
                }
            })
            .with(java.util.UUID.class, new ConvertTo<java.nio.ByteBuffer,java.util.UUID>() {
                public final java.nio.ByteBuffer convertTo(final java.util.UUID o) {
                    final java.nio.ByteBuffer value = java.nio.ByteBuffer.allocate(16);
                    value.putLong(o.getMostSignificantBits());
                    value.putLong(o.getLeastSignificantBits());
                    value.position(0);
                    return value;
                }
            })
        ),

        /**
         * {@link java.util.Calendar}
         */
        CALENDAR(ScalarAttributeType.S, new ConvertToMap(java.util.Calendar.class)
            .with(java.util.Date.class, new ConvertTo<java.util.Calendar,java.util.Date>() {
                public final java.util.Calendar convertTo(final java.util.Date o) {
                    final java.util.Calendar value = java.util.Calendar.getInstance();
                    value.setTime(o);
                    return value;
                }
            })
            .with(String.class, new ConvertTo<java.util.Calendar,String>() {
                public final java.util.Calendar convertTo(final String o) {
                    final java.util.Calendar value = java.util.Calendar.getInstance();
                    value.setTime(DateUtils.parseISO8601Date(o));
                    return value;
                }
            })
        ),

        /**
         * {@link Character}
         */
        CHARACTER(ScalarAttributeType.S, new ConvertToMap(Character.class, Character.TYPE)
            .with(String.class, new ConvertTo<Character,String>() {
                public final Character convertTo(final String o) {
                    if (o.length() != 1) {
                        throw new DynamoDBMappingException("expected single character string");
                    }
                    return Character.valueOf(o.charAt(0));
                }
            })
        ),

        /**
         * {@link java.util.Currency}
         */
        CURRENCY(ScalarAttributeType.S, new ConvertToMap(java.util.Currency.class)
            .with(String.class, new ConvertTo<java.util.Currency,String>() {
                public final java.util.Currency convertTo(final String o) {
                    return java.util.Currency.getInstance(o);
                }
            })
        ),

        /**
         * {@link java.util.Date}
         */
        DATE(ScalarAttributeType.S, new ConvertToMap(java.util.Date.class)
            .with(java.util.Calendar.class, new ConvertTo<java.util.Date,java.util.Calendar>() {
                public final java.util.Date convertTo(final java.util.Calendar o) {
                    return o.getTime();
                }
            })
            .with(Long.class, new ConvertTo<java.util.Date,Long>() {
                public final java.util.Date convertTo(final Long o) {
                    return new java.util.Date(o);
                }
            })
            .with(String.class, new ConvertTo<java.util.Date,String>() {
                public final java.util.Date convertTo(final String o) {
                    return DateUtils.parseISO8601Date(o);
                }
            })
        ),

        /**
         * {@link Double}
         */
        DOUBLE(ScalarAttributeType.N, new ConvertToMap(Double.class, Double.TYPE)
            .with(String.class, new ConvertTo<Double,String>() {
                public final Double convertTo(final String o) {
                    return Double.valueOf(o);
                }
            })
        ),

        /**
         * {@link Enum}
         */
        ENUM(null, new ConvertToMap<Enum,Object>(Enum.class)) {
            @Override
            final <S,T> ConvertTo<S,T> from(final Class<S> sourceType, final Class<T> targetType) {
                if (sourceType.isEnum() && Scalar.STRING.is(targetType)) {
                    return (ConvertTo<S,T>)new ConvertTo<Enum,String>() {
                        public final Enum convertTo(final String o) {
                            return Enum.valueOf((Class<Enum>)sourceType, o);
                        }
                    };
                }
                return super.from(sourceType, targetType);
            }
        },

        /**
         * {@link Float}
         */
        FLOAT(ScalarAttributeType.N, new ConvertToMap(Float.class, Float.TYPE)
            .with(String.class, new ConvertTo<Float,String>() {
                public final Float convertTo(final String o) {
                    return Float.valueOf(o);
                }
            })
        ),

        /**
         * {@link Integer}
         */
        INTEGER(ScalarAttributeType.N, new ConvertToMap(Integer.class, Integer.TYPE)
            .with(String.class, new ConvertTo<Integer,String>() {
                public final Integer convertTo(final String o) {
                    return Integer.valueOf(o);
                }
            })
        ),

        /**
         * {@link java.util.List}
         */
        LIST(null, new ConvertToMap(java.util.List.class)) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> converter) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Collection<S>,Collection<T>>() {
                    public final Collection<S> convert(final Collection<T> o) {
                        return convertAll(o, converter);
                    }
                    public final Collection<T> unconvert(final Collection<S> o) {
                        return unconvertAll(o, converter);
                    }
                };
            }
        },

        /**
         * {@link Long}
         */
        LONG(ScalarAttributeType.N, new ConvertToMap(Long.class, Long.TYPE)
            .with(java.util.Date.class, new ConvertTo<Long,java.util.Date>() {
                public final Long convertTo(final java.util.Date o) {
                    return o.getTime();
                }
            })
            .with(String.class, new ConvertTo<Long,String>() {
                public final Long convertTo(final String o) {
                    return Long.valueOf(o);
                }
            })
        ),

        /**
         * {@link java.util.Map}
         */
        MAP(null, new ConvertToMap(java.util.Map.class)) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> converter) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Map<Object,S>,Map<Object,T>>() {
                    public final Map<Object,S> convert(final Map<Object,T> o) {
                        return convertAll(o, converter);
                    }
                    public final Map<Object,T> unconvert(final Map<Object,S> o) {
                        return unconvertAll(o, converter);
                    }
                };
            }
        },

        /**
         * {@link S3Link}
         */
        S3_LINK(ScalarAttributeType.S, new ConvertToMap(S3Link.class)
            .with(String.class, new ConvertTo<S3Link,String>() {
                public final S3Link convertTo(final String o) {
                    return S3Link.fromJson((S3ClientCache)null, o); //<- placeholder
                }
            })
        ),

        /**
         * {@link java.util.Set}
         */
        SET(null, new ConvertToMap(java.util.Set.class)) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> converter) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Collection<S>,Collection<T>>() {
                    public final Collection<S> convert(final Collection<T> o) {
                        return convertAll(o, converter);
                    }
                    public final Collection<T> unconvert(final Collection<S> o) {
                        final Collection<T> vector = new java.util.LinkedHashSet();
                        for (final S s : o) {
                            if (vector.add(converter.unconvert(s)) == false) {
                                throw new DynamoDBMappingException("duplicate value (" + s + ")");
                            }
                        }
                        return vector;
                    }
                };
            }
        },

        /**
         * {@link Short}
         */
        SHORT(ScalarAttributeType.N, new ConvertToMap(Short.class, Short.TYPE)
            .with(String.class, new ConvertTo<Short,String>() {
                public final Short convertTo(final String o) {
                    return Short.valueOf(o);
                }
            })
        ),

        /**
         * {@link String}
         */
        STRING(ScalarAttributeType.S, new ConvertToMap(String.class)
            .with(Boolean.class, new ConvertTo<String,Boolean>() {
                public final String convertTo(final Boolean o) {
                    return Boolean.TRUE.equals(o) ? "1" : "0";
                }
            })
            .with(java.util.Calendar.class, new ConvertTo<String,java.util.Calendar>() {
                public final String convertTo(final java.util.Calendar o) {
                    return DateUtils.formatISO8601Date(o.getTime());
                }
            })
            .with(java.util.Date.class, new ConvertTo<String,java.util.Date>() {
                public final String convertTo(final java.util.Date o) {
                    return DateUtils.formatISO8601Date(o);
                }
            })
            .with(Enum.class, new ConvertTo<String,Enum>() {
                public final String convertTo(final Enum o) {
                    return o.name();
                }
            })
            .with(S3Link.class, new ConvertTo<String,S3Link>() {
                public final String convertTo(final S3Link o) {
                    return o.getBucketName() == null || o.getKey() == null ? null : o.toJson();
                }
            })
            .with(java.util.TimeZone.class, new ConvertTo<String,java.util.TimeZone>() {
                public final String convertTo(final java.util.TimeZone o) {
                    return o.getID();
                }
            })
            .with(Object.class, new ConvertTo<String,Object>() {
                public final String convertTo(final Object o) {
                    return o.toString();
                }
            })
        ),

        /**
         * {@link java.util.TimeZone}
         */
        TIME_ZONE(ScalarAttributeType.S, new ConvertToMap(java.util.TimeZone.class)
            .with(String.class, new ConvertTo<java.util.TimeZone,String>() {
                public final java.util.TimeZone convertTo(final String o) {
                    return java.util.TimeZone.getTimeZone(o);
                }
            })
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(ScalarAttributeType.S, new ConvertToMap(java.util.UUID.class)
            .with(java.nio.ByteBuffer.class, new ConvertTo<java.util.UUID,java.nio.ByteBuffer>() {
                public final java.util.UUID convertTo(final java.nio.ByteBuffer o) {
                    return new java.util.UUID(o.getLong(), o.getLong());
                }
            })
            .with(String.class, new ConvertTo<java.util.UUID,String>() {
                public final java.util.UUID convertTo(final String o) {
                    return java.util.UUID.fromString(o);
                }
            })
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(null, new ConvertToMap(Object.class));

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConvertToMap<?,?> map;

        /**
         * Constructs a new scalar with the specified conversion mappings.
         */
        private Scalar(final ScalarAttributeType scalarAttributeType, final ConvertToMap<?,?> map) {
            this.scalarAttributeType = scalarAttributeType;
            this.map = map;
        }

        /**
         * Wraps the scalar conversion function with the vector conversion if
         * applicable, otherwise, simply returns the same scalar converter.
         */
        <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> converter) {
            return converter;
        }

        /**
         * Returns the function to convert from the specified target class to
         * this scalar type.
         */
        <S,T> ConvertTo<S,T> from(final Class<S> sourceType, final Class<T> targetType) {
            return (ConvertTo<S,T>)this.map.getConverter(targetType);
        }

        /**
         * Returns the scalar attribute type of this scalar instance.
         */
        final ScalarAttributeType scalarAttributeType() {
            return this.scalarAttributeType;
        }

        /**
         * Determines if the class represented by this scalar is either the
         * same as or a supertype of the specified target type.
         */
        final boolean is(final Class<?> sourceType) {
            return this.map.isAssignableFrom(sourceType);
        }

        /**
         * Returns the first matching scalar, which may be the same as or a
         * supertype of the specified target class.
         */
        static final Scalar of(final Class<?> sourceType) {
            for (final Scalar scalar : Scalar.values()) {
                if (scalar.is(sourceType)) {
                    return scalar;
                }
            }
            return DEFAULT;
        }
    }

    /**
     * Maps classes to converters.
     */
    private static class ConvertToMap<S,T> extends LinkedHashMap<Class<?>,ConvertTo<S,T>> {
        private final Class<S>[] types;
        private ConvertToMap(final Class<S> ... sourceTypes) {
            this.types = sourceTypes;
        }
        final <s extends S,t extends T> ConvertToMap<S,T> with(final Class<t> targetType, final ConvertTo<s,t> converter) {
            this.put((Class<T>)targetType, (ConvertTo<S,T>)converter);
            return this;
        }
        final boolean isAssignableFrom(final Class<?> sourceType) {
            for (final Class<?> type : this.types) {
                if (type.isAssignableFrom(sourceType)) {
                    return true;
                }
            }
            return false;
        }
        public ConvertTo<S,T> getConverter(final Class<?> targetType) {
            for (final Map.Entry<Class<?>,ConvertTo<S,T>> entry : this.entrySet()) {
                if (entry.getKey().isAssignableFrom(targetType)) {
                    return entry.getValue();
                }
            }
            if (this.isAssignableFrom(targetType)) {
                return (ConvertTo<S,T>)ConvertTo.ANY;
            }
            throw new DynamoDBMappingException("type [" + targetType + "] is not supported; no conversion from " + Arrays.toString(types));
        }
    }

    /**
     * One-way type-converter.
     */
    static class ConvertTo<S,T> {
        private static final ConvertTo<?,?> ANY = new ConvertTo();
        public S convertTo(final T o) {
            return (S)o;
        }
    }

    /**
     * Returns the standard type-converter for the given source to target
     * conversion types.
     */
    static final <S,T> DynamoDBTypeConverter<S,T> converter(final Class<S> sourceType, final Class<T> targetType) {
        return StandardTypeConverters.<S,T>factory().getConverter(sourceType, targetType);
    }

    /**
     * Converts the target instance using the standard type-conversions.
     */
    static final <S,T> S convert(final T o, final Class<S> sourceType) {
        return converter(sourceType, (Class<T>)o.getClass()).convert(o);
    }

    /**
     * Unconverts the source instance using the standard type-conversions.
     */
    static final <S,T> T unconvert(final S o, final Class<T> targetType) {
        return converter((Class<S>)o.getClass(), targetType).unconvert(o);
    }

    /**
     * Converts the {@link Collection} to another applying the scalar
     */
    static final <S,T> List<S> convertAll(final Collection<T> o, final DynamoDBTypeConverter<S,T> scalar) {
        final List<S> vector = new java.util.ArrayList<S>(o.size());
        for (final T t : o) {
            vector.add(scalar.convert(t));
        }
        return vector;
    }

    /**
     * Unconverts the {@link Collection} to another applying the scalar
     * conversion function to each entry.
     */
    static final <S,T> List<T> unconvertAll(final Collection<S> o, final DynamoDBTypeConverter<S,T> scalar) {
        final List<T> vector = new java.util.ArrayList<T>(o.size());
        for (final S s : o) {
            vector.add(scalar.unconvert(s));
        }
        return vector;
    }

    /**
     * Converts the {@link Map} to another applying the scalar conversion
     * function to each entry.
     */
    static final <K,S,T> Map<K,S> convertAll(final Map<K,T> o, final DynamoDBTypeConverter<S,T> scalar) {
        final Map<K,S> vector = new LinkedHashMap<K,S>();
        for (final Map.Entry<K,T> t : o.entrySet()) {
            vector.put(t.getKey(), scalar.convert(t.getValue()));
        }
        return vector;
    }

    /**
     * Unconverts the {@link Map} to another applying the scalar conversion
     * function to each entry.
     */
    static final <K,S,T> Map<K,T> unconvertAll(final Map<K,S> o, final DynamoDBTypeConverter<S,T> scalar) {
        final Map<K,T> vector = new LinkedHashMap<K,T>();
        for (final Map.Entry<K,S> s : o.entrySet()) {
            vector.put(s.getKey(), scalar.unconvert(s.getValue()));
        }
        return vector;
    }

    /**
     * Joins the source and target converters.
     */
    static final <S,T,U> DynamoDBTypeConverter<S,U> join(final DynamoDBTypeConverter<S,T> source, final DynamoDBTypeConverter<T,U> target) {
        return new DynamoDBTypeConverter<S,U>() {
            public final S convert(final U o) {
                final T object = o == null ? null : target.convert(o);
                return object == null ? null : source.convert(object);
            }
            public final U unconvert(final S o) {
                final T object = o == null ? null : source.unconvert(o);
                return object == null ? null : target.unconvert(object);
            }
        };
    }

    /**
     * Delegate type-converter.
     */
    static class DelegateConverter<S,T> implements DynamoDBTypeConverter<S,T> {
        private final DynamoDBTypeConverter<S,T> delegate;
        public DelegateConverter(final DynamoDBTypeConverter<S,T> delegate) {
            this.delegate = delegate;
        }
        @Override
        public S convert(final T o) {
            return this.delegate.convert(o);
        }
        @Override
        public T unconvert(final S o) {
            return this.delegate.unconvert(o);
        }
    }

}
