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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
final class StandardTypeConverters implements DynamoDBTypeConverter.Factory {
 
    /**
     * Standard scalar type-converter factory.
     */
    private static final DynamoDBTypeConverter.Factory FACTORY = new StandardTypeConverters();
    static final DynamoDBTypeConverter.Factory factory() {
        return StandardTypeConverters.FACTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <S,T> DynamoDBTypeConverter<S,T> getConverter(final Class<T> targetType) {
        final ScalarAttributeType scalarType = Scalar.of(targetType).scalarType;
        if (scalarType == ScalarAttributeType.B) {
            return Scalar.BYTE_BUFFER.getConverter(targetType);
        } else if (scalarType != null) {
            return Scalar.STRING.getConverter(targetType);
        }
        return null;
    }

    /**
     * Standard scalar types.
     */
    static enum Scalar implements DynamoDBTypeConverter.Factory {
        /**
         * {@link BigDecimal}
         */
        BIG_DECIMAL(BigDecimal.class, null, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<BigDecimal,String>() {
                public final BigDecimal convertTo(final String o) {
                    return new BigDecimal(o);
                }
            })
        ),

        /**
         * {@link BigInteger}
         */
        BIG_INTEGER(BigInteger.class, null, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<BigInteger,String>() {
                public final BigInteger convertTo(final String o) {
                    return new BigInteger(o);
                }
            })
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(Boolean.class, Boolean.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Boolean,String>() {
                public final Boolean convertTo(final String o) {
                    return "0".equals(o) ? Boolean.FALSE : "1".equals(o) ? Boolean.TRUE : Boolean.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte}
         */
        BYTE(Byte.class, Byte.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Byte,String>() {
                public final Byte convertTo(final String o) {
                    return Byte.valueOf(o);
                }
            })
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(byte[].class, null, ScalarAttributeType.B, new ConvertToMap()
            .with(ByteBuffer.class, new ConvertTo<byte[],ByteBuffer>() {
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
        BYTE_BUFFER(ByteBuffer.class, null, ScalarAttributeType.B, new ConvertToMap()
            .with(byte[].class, new ConvertTo<ByteBuffer,byte[]>() {
                public final ByteBuffer convertTo(final byte[] o) {
                    return ByteBuffer.wrap(o);
                }
            })
        ),

        /**
         * {@link Calendar}
         */
        CALENDAR(Calendar.class, null, ScalarAttributeType.S, new ConvertToMap()
            .with(Date.class, new ConvertTo<Calendar,Date>() {
                public final Calendar convertTo(final Date o) {
                    final Calendar calendar = Calendar.getInstance();
                    calendar.setTime(o);
                    return calendar;
                }
            })
            .with(String.class, new ConvertTo<Calendar,String>() {
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
        CHARACTER(Character.class, Character.TYPE, ScalarAttributeType.S, new ConvertToMap()
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
         * {@link Date}
         */
        DATE(Date.class, null, ScalarAttributeType.S, new ConvertToMap()
            .with(Calendar.class, new ConvertTo<Date,Calendar>() {
                public final Date convertTo(final Calendar o) {
                    return o.getTime();
                }
            })
            .with(Long.class, new ConvertTo<Date,Long>() {
                public final Date convertTo(final Long o) {
                    return new Date(o);
                }
            })
            .with(String.class, new ConvertTo<Date,String>() {
                public final Date convertTo(final String o) {
                    return DateUtils.parseISO8601Date(o);
                }
            })
        ),

        /**
         * {@link Double}
         */
        DOUBLE(Double.class, Double.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Double,String>() {
                public final Double convertTo(final String o) {
                    return Double.valueOf(o);
                }
            })
        ),

        /**
         * {@link Float}
         */
        FLOAT(Float.class, Float.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Float,String>() {
                public final Float convertTo(final String o) {
                    return Float.valueOf(o);
                }
            })
        ),

        /**
         * {@link Integer}
         */
        INTEGER(Integer.class, Integer.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Integer,String>() {
                public final Integer convertTo(final String o) {
                    return Integer.valueOf(o);
                }
            })
        ),

        /**
         * {@link Long}
         */
        LONG(Long.class, Long.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(Date.class, new ConvertTo<Long,Date>() {
                public final Long convertTo(final Date o) {
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
         * {@link Short}
         */
        SHORT(Short.class, Short.TYPE, ScalarAttributeType.N, new ConvertToMap()
            .with(String.class, new ConvertTo<Short,String>() {
                public final Short convertTo(final String o) {
                    return Short.valueOf(o);
                }
            })
        ),

        /**
         * {@link String}
         */
        STRING(String.class, null, ScalarAttributeType.S, new ConvertToMap()
            .with(Boolean.class, new ConvertTo<String,Boolean>() {
                public final String convertTo(final Boolean o) {
                    return Boolean.TRUE.equals(o) ? "1" : "0";
                }
            })
            .with(Calendar.class, new ConvertTo<String,Calendar>() {
                public final String convertTo(final Calendar o) {
                    return DateUtils.formatISO8601Date(o.getTime());
                }
            })
            .with(Date.class, new ConvertTo<String,Date>() {
                public final String convertTo(final Date o) {
                    return DateUtils.formatISO8601Date(o);
                }
            })
            .with(Object.class, new ConvertTo<String,Object>() {
                public final String convertTo(final Object o) {
                    return o.toString();
                }
            })
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(java.util.UUID.class, null, ScalarAttributeType.S, new ConvertToMap()
            .with(String.class, new ConvertTo<java.util.UUID,String>() {
                public final java.util.UUID convertTo(final String o) {
                    return java.util.UUID.fromString(o);
                }
            })
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(Object.class, null, null, new ConvertToMap());

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConvertToMap<?,ConvertTo<?,?>> map;

        /**
         * The conversion types.
         */
        private final Class<?> type, primitiveType;

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarType;

        /**
         * Constructs a new scalar with the specified conversion mappings.
         */
        private Scalar(final Class<?> type, final Class<?> primitiveType, final ScalarAttributeType scalarType, final ConvertToMap<?,ConvertTo<?,?>> map) {
            this.type = type;
            this.primitiveType = primitiveType;
            this.scalarType = scalarType;
            this.map = map;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(final Class<T> targetType) {
            if (this == STRING && targetType.isEnum()) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<String,Enum>() {
                    public final String convert(final Enum o) {
                        return o.name();
                    }
                    public final Enum unconvert(final String o) {
                        return Enum.valueOf((Class<Enum>)targetType, o);
                    }
                };
            }
            final Scalar source = this, target = Scalar.of(targetType);
            final ConvertTo<S,T> sourceFromTarget = source.from(targetType);
            final ConvertTo<T,S> targetFromSource = target.from((Class<S>)type);
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
         * Gets the conversion function for the specified target type.
         */
        final <S,T> ConvertTo<S,T> from(final Class<T> targetType) {
            ConvertTo<?,?> converter = map.from(Scalar.of(targetType).type);
            if (converter == null) {
                if (is(targetType) == false) {
                    throw new DynamoDBMappingException("type [" + targetType + "] is not supported" +
                        "; not convertible from " + this);
                }
                converter = ConvertTo.ANY;
            }
            return (ConvertTo<S,T>)converter;
        }

        /**
         * Determines if the class represented by this scalar is either the
         * same as or a supertype of the specified target type.
         */
        final boolean is(final Class<?> sourceType) {
            if (sourceType.isPrimitive()) {
                return primitiveType == sourceType;
            }
            return type.isAssignableFrom(sourceType);
        }

        /**
         * Returns the scalar attribute type.
         */
        final ScalarAttributeType scalarType() {
            return this.scalarType;
        }

        /**
         * Returns the conversion type.
         */
        final <S> Class<S> type() {
            return (Class<S>)this.type;
        }

        /**
         * Returns the primitive conversion type.
         */
        final <S> Class<S> primitiveType() {
            return (Class<S>)this.primitiveType;
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
     * Standard collection types.
     */
    static enum Vector {
        /**
         * {@link List}
         */
        LIST(List.class) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> scalar) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Collection<S>,Collection<T>>() {
                    public final Collection<S> convert(final Collection<T> o) {
                        return Vector.convert(o, scalar);
                    }
                    public final Collection<T> unconvert(final Collection<S> o) {
                        return Vector.unconvert(o, scalar);
                    }
                };
            }
        },

        /**
         * {@link Map}
         */
        MAP(Map.class) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> scalar) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Map<Object,S>,Map<Object,T>>() {
                    public final Map<Object,S> convert(final Map<Object,T> o) {
                        return Vector.convert(o, scalar);
                    }
                    public final Map<Object,T> unconvert(final Map<Object,S> o) {
                        return Vector.unconvert(o, scalar);
                    }
                };
            }
        },

        /**
         * {@link Set}
         */
        SET(Set.class) {
            @Override
            final <S,T> DynamoDBTypeConverter<S,T> wrap(final DynamoDBTypeConverter<S,T> scalar) {
                return (DynamoDBTypeConverter<S,T>)new DynamoDBTypeConverter<Collection<S>,Collection<T>>() {
                    public final Collection<S> convert(final Collection<T> o) {
                        return Vector.convert(o, scalar);
                    }
                    public final Collection<T> unconvert(final Collection<S> o) {
                        final Collection<T> vector = new LinkedHashSet();
                        for (final S s : o) {
                            if (vector.add(scalar.unconvert(s)) == false) {
                                throw new DynamoDBMappingException("duplicate value (" + s + ")");
                            }
                        }
                        return vector;
                    }
                };
            }
        };

        /**
         * Wraps the scalar conversion function with the vector conversion.
         */
        abstract <S,T> DynamoDBTypeConverter<S,T> wrap(DynamoDBTypeConverter<S,T> scalar);

        /**
         * The conversion type.
         */
        private final Class<?> type;

        /**
         * Constructs a new vector.
         */
        private Vector(final Class<?> type) {
            this.type = type;
        }

        /**
         * Determines if the class represented by this vector is either the
         * same as or a supertype of the specified target type.
         */
        final boolean is(final Class<?> sourceType) {
            return type.isAssignableFrom(sourceType);
        }

        /**
         * Converts the {@link Collection} to another applying the scalar
         */
        static final <S,T> List<S> convert(final Collection<T> o, final DynamoDBTypeConverter<S,T> scalar) {
            final List<S> vector = new ArrayList<S>(o.size());
            for (final T t : o) {
                vector.add(scalar.convert(t));
            }
            return vector;
        }

        /**
         * Unconverts the {@link Collection} to another applying the scalar
         * conversion function to each entry.
         */
        static final <S,T> List<T> unconvert(final Collection<S> o, final DynamoDBTypeConverter<S,T> scalar) {
            final List<T> vector = new ArrayList<T>(o.size());
            for (final S s : o) {
                vector.add(scalar.unconvert(s));
            }
            return vector;
        }

        /**
         * Converts the {@link Map} to another applying the scalar conversion
         * function to each entry.
         * function to each entry.
         */
        static final <K,S,T> Map<K,S> convert(final Map<K,T> o, final DynamoDBTypeConverter<S,T> scalar) {
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
        static final <K,S,T> Map<K,T> unconvert(final Map<K,S> o, final DynamoDBTypeConverter<S,T> scalar) {
            final Map<K,T> vector = new LinkedHashMap<K,T>();
            for (final Map.Entry<K,S> s : o.entrySet()) {
                vector.put(s.getKey(), scalar.unconvert(s.getValue()));
            }
            return vector;
        }
    }

    /**
     * Maps classes to converters.
     */
    static class ConvertToMap<t,T> extends LinkedHashMap<Class<t>,T> {
        public ConvertToMap<t,T> with(final Class<?> key, final T value) {
            put((Class<t>)key, value);
            return this;
        }
        public T from(final Class<?> key) {
            for (final Map.Entry<Class<t>,T> entry : this.entrySet()) {
                if (entry.getKey().isAssignableFrom(key)) {
                    return entry.getValue();
                }
            }
            return null;
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

}
