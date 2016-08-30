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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverterFactory.OverrideFactory.Key;
import com.amazonaws.util.DateUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
final class StandardTypeConverters implements DynamoDBTypeConverterFactory {

    /**
     * Gets the standard type-converter matching the conversion types.
     */
    static <S,T> DynamoDBTypeConverter<S,T> of(final Class<S> sourceType, final Class<T> targetType) {
        return factory().getConverter(sourceType, targetType);
    }

    /**
     * Standard scalar type-converter factory.
     */
    private static final DynamoDBTypeConverterFactory FACTORY = new StandardTypeConverters();
    static DynamoDBTypeConverterFactory factory() {
        return StandardTypeConverters.FACTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <S,T> DynamoDBTypeConverter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
        return Scalar.join(sourceType, targetType);
    }

    /**
     * Standard scalar types.
     */
    static enum Scalar {
        /**
         * {@link BigDecimal}
         */
        BIG_DECIMAL(ScalarAttributeType.N, new ConverterMap<BigDecimal>(BigDecimal.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link BigInteger}
         */
        BIG_INTEGER(ScalarAttributeType.N, new ConverterMap<BigInteger>(BigInteger.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(ScalarAttributeType.N, new ConverterMap<Boolean>(Boolean.class, Boolean.TYPE)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Byte}
         */
        BYTE(ScalarAttributeType.N, new ConverterMap<Byte>(Byte.class, Byte.TYPE)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(ScalarAttributeType.B, new ConverterMap<byte[]>(byte[].class)
            .withStandardTarget(ByteBuffer.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link ByteBuffer}
         */
        BYTE_BUFFER(ScalarAttributeType.B, new ConverterMap<ByteBuffer>(ByteBuffer.class)
            .withStandardTarget(byte[].class)
            .withStandardTarget(String.class, byte[].class)
            .withStandardTarget(java.util.UUID.class)
        ),

        /**
         * {@link Calendar}
         */
        CALENDAR(ScalarAttributeType.S, new ConverterMap<Calendar>(Calendar.class)
            .withStandardTarget(Date.class)
            .withStandardTarget(String.class, Date.class)
        ),

        /**
         * {@link Character}
         */
        CHARACTER(ScalarAttributeType.S, new ConverterMap<Character>(Character.class, Character.TYPE)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Currency}
         */
        CURRENCY(ScalarAttributeType.S, new ConverterMap<Currency>(Currency.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Date}
         */
        DATE(ScalarAttributeType.S, new ConverterMap<Date>(Date.class)
            .withStandardTarget(Calendar.class)
            .withStandardTarget(Long.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Double}
         */
        DOUBLE(ScalarAttributeType.N, new ConverterMap<Double>(Double.class, Double.TYPE)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Float}
         */
        FLOAT(ScalarAttributeType.N, new ConverterMap<Float>(Float.class, Float.TYPE)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Integer}
         */
        INTEGER(ScalarAttributeType.N, new ConverterMap<Integer>(Integer.class, Integer.TYPE)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Locale}
         */
        LOCALE(ScalarAttributeType.S, new ConverterMap<Locale>(Locale.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Long}
         */
        LONG(ScalarAttributeType.N, new ConverterMap<Long>(Long.class, Long.TYPE)
            .withStandardTarget(Date.class)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link S3Link}
         */
        S3_LINK(ScalarAttributeType.S, new ConverterMap<S3Link>(S3Link.class)
        ),

        /**
         * {@link Short}
         */
        SHORT(ScalarAttributeType.N, new ConverterMap<Short>(Short.class, Short.TYPE)
            .withStandardTarget(Number.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link String}
         */
        STRING(ScalarAttributeType.S, new ConverterMap<String>(String.class)
            .withStandardTarget(Boolean.class)
            .withStandardTarget(byte[].class)
            .withStandardTarget(ByteBuffer.class, byte[].class)
            .withStandardTarget(Calendar.class, Date.class)
            .withStandardTarget(Date.class)
            .withStandardTarget(Enum.class)
            .withStandardTarget(Locale.class)
            .withStandardTarget(TimeZone.class)
            .withStandardTarget(Object.class)
        ),

        /**
         * {@link TimeZone}
         */
        TIME_ZONE(ScalarAttributeType.S, new ConverterMap<TimeZone>(TimeZone.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(ScalarAttributeType.S, new ConverterMap<java.util.UUID>(java.util.UUID.class)
            .withStandardTarget(ByteBuffer.class)
            .withStandardTarget(String.class)
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(null, new ConverterMap(Object.class));

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConverterMap<?> map;

        /**
         * Constructs a new scalar with the specified conversion mappings.
         */
        private Scalar(final ScalarAttributeType scalarAttributeType, final ConverterMap<?> map) {
            this.scalarAttributeType = scalarAttributeType;
            this.map = map;
        }

        /**
         * Returns the function to convert from the specified target class to
         * this scalar type.
         */
        final <S,T> Converter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            if (this == DEFAULT && sourceType.isEnum() && STRING.is(targetType)) {
                return (Converter<S,T>)new Converter<Enum,String>() {
                    public final Enum convert(final String o) {
                        return Enum.valueOf((Class<Enum>)sourceType, o);
                    }
                };
            }
            return ((ConverterMap<S>)this.map).getConverter(sourceType, targetType);
        }

        /**
         * Converts the target instance using the standard type-conversions.
         */
        final <S,T> S convert(final T o) {
            return getConverter(this.<S>type(), (Class<T>)o.getClass()).convert(o);
        }

        /**
         * Returns the standard type-converter for the given source to target
         * conversion types.
         */
        final <S,T> DynamoDBTypeConverter<S,T> join(final Class<T> targetType) {
            return Scalar.join(this.<S>type(), targetType);
        }

        /**
         * Determines if the scalar is of the specified scalar attribute type.
         */
        final boolean is(final ScalarAttributeType scalarAttributeType) {
            return this.scalarAttributeType == scalarAttributeType;
        }

        /**
         * Determines if the class represented by this scalar is either the
         * same as or a supertype of the specified target type.
         */
        final boolean is(final Class<?> sourceType) {
            return this.map.isAssignableFrom(sourceType);
        }

        /**
         * Returns the primary conversion type.
         */
        final <S> Class<S> type() {
            return (Class<S>)this.map.types[0];
        }

        /**
         * Returns the standard type-converter for the given source to target
         * conversion types.
         */
        static <S,T> DynamoDBTypeConverter<S,T> join(final Class<S> sourceType, final Class<T> targetType) {
            final Scalar source = Scalar.of(sourceType), target = Scalar.of(targetType);
            final Converter<S,T> sourceFromTarget = source.getConverter(sourceType, target.<T>type());
            final Converter<T,S> targetFromSource = target.getConverter(targetType, source.<S>type());
            return new DynamoDBTypeConverter<S,T>() {
                public final S convert(final T o) {
                    return sourceFromTarget.convert(o);
                }
                public final T unconvert(final S o) {
                    return targetFromSource.convert(o);
                }
            };
        }

        /**
         * Returns the first matching scalar, which may be the same as or a
         * supertype of the specified target class.
         */
        static Scalar of(final Class<?> sourceType) {
            for (final Scalar scalar : Scalar.values()) {
                if (scalar.is(sourceType)) {
                    return scalar;
                }
            }
            return DEFAULT;
        }
    }

    /**
     * Standard vector types.
     */
    static final class Vector {
        /**
         * {@link List}
         */
        static final class LIST {
            static <S,T> DynamoDBTypeConverter<List<S>,Collection<T>> join(final DynamoDBTypeConverter<S,T> scalar) {
                return new DynamoDBTypeConverter<List<S>,Collection<T>>() {
                    public final List<S> convert(final Collection<T> o) {
                        return LIST.<S,T>convert(o, scalar);
                    }
                    public final Collection<T> unconvert(final List<S> o) {
                        return LIST.<S,T>unconvert(o, scalar);
                    }
                };
            }

            static <S,T> List<S> convert(final Collection<T> o, final DynamoDBTypeConverter<S,T> scalar) {
                final List<S> vector = new ArrayList<S>(o.size());
                for (final T t : o) {
                    vector.add(scalar.convert(t));
                }
                return vector;
            }

            static <S,T> List<T> unconvert(final Collection<S> o, final DynamoDBTypeConverter<S,T> scalar) {
                final List<T> vector = new ArrayList<T>(o.size());
                for (final S s : o) {
                    vector.add(scalar.unconvert(s));
                }
                return vector;
            }

            static boolean is(final Class<?> sourceType) {
                return List.class.isAssignableFrom(sourceType);
            }
        }

        /**
         * {@link Map}
         */
        static final class MAP {
            static <K,S,T> DynamoDBTypeConverter<Map<K,S>,Map<K,T>> join(final DynamoDBTypeConverter<S,T> scalar) {
                return new DynamoDBTypeConverter<Map<K,S>,Map<K,T>>() {
                    public final Map<K,S> convert(final Map<K,T> o) {
                        return MAP.<K,S,T>convert(o, scalar);
                    }
                    public final Map<K,T> unconvert(final Map<K,S> o) {
                        return MAP.<K,S,T>unconvert(o, scalar);
                    }
                };
            }

            static <K,S,T> Map<K,S> convert(final Map<K,T> o, final DynamoDBTypeConverter<S,T> scalar) {
                final Map<K,S> vector = new LinkedHashMap<K,S>();
                for (final Map.Entry<K,T> t : o.entrySet()) {
                    vector.put(t.getKey(), scalar.convert(t.getValue()));
                }
                return vector;
            }

            static <K,S,T> Map<K,T> unconvert(final Map<K,S> o, final DynamoDBTypeConverter<S,T> scalar) {
                final Map<K,T> vector = new LinkedHashMap<K,T>();
                for (final Map.Entry<K,S> s : o.entrySet()) {
                    vector.put(s.getKey(), scalar.unconvert(s.getValue()));
                }
                return vector;
            }

            static boolean is(final Class<?> sourceType) {
                return Map.class.isAssignableFrom(sourceType);
            }
        }

        /**
         * {@link Set}
         */
        static final class SET {
            static <S,T> DynamoDBTypeConverter<List<S>,Collection<T>> join(final DynamoDBTypeConverter<S,T> target) {
                return new DynamoDBTypeConverter<List<S>,Collection<T>>() {
                    public List<S> convert(final Collection<T> o) {
                        return LIST.<S,T>convert(o, target);
                    }
                    public Collection<T> unconvert(final List<S> o) {
                        return SET.<S,T>unconvert(o, target);
                    }
                };
            }

            static <S,T> Set<T> unconvert(final Collection<S> o, final DynamoDBTypeConverter<S,T> scalar) {
                final Set<T> vector = new LinkedHashSet();
                for (final S s : o) {
                    if (vector.add(scalar.unconvert(s)) == false) {
                        throw new DynamoDBMappingException("duplicate value (" + s + ")");
                    }
                }
                return vector;
            }

            static boolean is(final Class<?> sourceType) {
                return Set.class.isAssignableFrom(sourceType);
           }
        }
    }

    /**
     * One-way type-converter.
     */
    static abstract class Converter<S,T> {
        private static final Converter<Object,Object> ANY = new Converter<Object,Object>() {
            public final Object convert(final Object o) {
                return o;
            }
        };

        final <U> Converter<S,U> join(final Converter<T,U> target) {
            final Converter<S,T> source = this;
            return new Converter<S,U>() {
                public S convert(final U o) {
                    return source.convert(target.convert(o));
                }
            };
        }

        public abstract S convert(T o);
    }

    /**
     * Maps classes to converters.
     */
    private static final class ConverterMap<S> extends LinkedHashMap<Class<?>,Converter<S,?>> {
        private final Class<S>[] types;

        private ConverterMap(final Class<S> ... sourceTypes) {
            this.types = sourceTypes;
        }

        final <T> ConverterMap<S> withStandardTarget(final Class<T> targetType, final Class<?> ... joins) {
            Converter<T,T> converter = null;
            for (int j = 0; j <= joins.length; j++) {
                final Class<?> keySourceType = (j == 0 ? this.types[0] : joins[j-1]);
                final Class<?> keyTargetType = (j == joins.length ? targetType : joins[j]);
                final Converter<T,T> target = (Converter<T,T>)ALL.get(new Key(keySourceType, keyTargetType));
                converter = converter == null ? target : converter.join(target);
            }
            this.put(targetType, (Converter<S,T>)converter);
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

        final <T> Converter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            for (final Map.Entry<Class<?>,Converter<S,?>> entry : this.entrySet()) {
                if (entry.getKey().isAssignableFrom(targetType)) {
                    return (Converter<S,T>)entry.getValue();
                }
            }
            if (this.isAssignableFrom(targetType)) {
                return (Converter<S,T>)Converter.ANY;
            }
            throw new DynamoDBMappingException("type [" + targetType + "] is not supported; no conversion from " + sourceType);
        }
    }

    /**
     * All standard conversion functions.
     */
    private static final LinkedHashMap<Key<?,?>,Converter<?,?>> ALL;
    static {
        ALL = new LinkedHashMap<Key<?,?>,Converter<?,?>>();

        /**
         * {@link BigDecimal} from {@link String}
         */
        ALL.put(new Key(BigDecimal.class, String.class), new Converter<BigDecimal,String>() {
            public final BigDecimal convert(final String o) {
                return new BigDecimal(o);
            }
        });

        /**
         * {@link BigInteger} from {@link String}
         */
        ALL.put(new Key(BigInteger.class, String.class), new Converter<BigInteger,String>() {
            public final BigInteger convert(final String o) {
                return new BigInteger(o);
            }
        });

        /**
         * {@link Boolean} from {@link String}
         */
        ALL.put(new Key(Boolean.class, String.class), new Converter<Boolean,String>() {
            public final Boolean convert(final String o) {
                return "0".equals(o) ? Boolean.FALSE : "1".equals(o) ? Boolean.TRUE : Boolean.valueOf(o);
            }
        });

        /**
         * {@link Byte} from {@link Number}
         */
        ALL.put(new Key(Byte.class, Number.class), new Converter<Byte,Number>() {
            public final Byte convert(final Number o) {
                return o.byteValue();
            }
        });

        /**
         * {@link Byte} from {@link String}
         */
        ALL.put(new Key(Byte.class, String.class), new Converter<Byte,String>() {
            public final Byte convert(final String o) {
                return Byte.valueOf(o);
            }
        });

        /**
         * {@link byte} arry from {@link ByteBuffer}
         */
        ALL.put(new Key(byte[].class, ByteBuffer.class), new Converter<byte[],ByteBuffer>() {
            public final byte[] convert(final ByteBuffer o) {
                if (o.hasArray()) {
                    return o.array();
                }
                final byte[] value = new byte[o.remaining()];
                o.get(value);
                return value;
            }
        });

        /**
         * {@link byte} array from {@link String}
         */
        ALL.put(new Key(byte[].class, String.class), new Converter<byte[],String>() {
            public final byte[] convert(final String o) {
                return o.getBytes(Charset.forName("UTF-8"));
            }
        });

        /**
         * {@link ByteBuffer} from {@link byte} array
         */
        ALL.put(new Key(ByteBuffer.class, byte[].class), new Converter<ByteBuffer,byte[]>() {
            public final ByteBuffer convert(final byte[] o) {
                return ByteBuffer.wrap(o);
            }
        });

        /**
         * {@link ByteBuffer} from {@link java.util.UUID}
         */
        ALL.put(new Key(ByteBuffer.class, java.util.UUID.class), new Converter<ByteBuffer,java.util.UUID>() {
            public final ByteBuffer convert(final java.util.UUID o) {
                final ByteBuffer value = ByteBuffer.allocate(16);
                value.putLong(o.getMostSignificantBits()).putLong(o.getLeastSignificantBits());
                value.position(0);
                return value;
            }
        });

        /**
         * {@link Calendar} from {@link Date}
         */
        ALL.put(new Key(Calendar.class, Date.class), new Converter<Calendar,Date>() {
            public final Calendar convert(final Date o) {
                final Calendar value = Calendar.getInstance();
                value.setTime(o);
                return value;
            }
        });

        /**
         * {@link Character} from {@link String}
         */
        ALL.put(new Key(Character.class, String.class), new Converter<Character,String>() {
            public final Character convert(final String o) {
                return Character.valueOf(o.charAt(0));
            }
        });

        /**
         * {@link Currency} from {@link String}
         */
        ALL.put(new Key(Currency.class, String.class), new Converter<Currency,String>() {
            public final Currency convert(final String o) {
                return Currency.getInstance(o);
            }
        });

        /**
         * {@link Date} from {@link Calendar}
         */
        ALL.put(new Key(Date.class, Calendar.class), new Converter<Date,Calendar>() {
            public final Date convert(final Calendar o) {
                return o.getTime();
            }
        });

        /**
         * {@link Date} from {@link Long}
         */
        ALL.put(new Key(Date.class, Long.class), new Converter<Date,Long>() {
            public final Date convert(final Long o) {
                return new Date(o);
            }
        });

        /**
         * {@link Date} from {@link String}
         */
        ALL.put(new Key(Date.class, String.class), new Converter<Date,String>() {
            public final Date convert(final String o) {
                return DateUtils.parseISO8601Date(o);
            }
        });

        /**
         * {@link Double} from {@link Number}
         */
        ALL.put(new Key(Double.class, Number.class), new Converter<Double,Number>() {
            public final Double convert(final Number o) {
                return o.doubleValue();
            }
        });

        /**
         * {@link Double} from {@link String}
         */
        ALL.put(new Key(Double.class, String.class), new Converter<Double,String>() {
            public final Double convert(final String o) {
                return Double.valueOf(o);
            }
        });

        /**
         * {@link Float} from {@link Number}
         */
        ALL.put(new Key(Float.class, Number.class), new Converter<Float,Number>() {
            public final Float convert(final Number o) {
                return o.floatValue();
            }
        });

        /**
         * {@link Float} from {@link String}
         */
        ALL.put(new Key(Float.class, String.class), new Converter<Float,String>() {
            public final Float convert(final String o) {
                return Float.valueOf(o);
            }
        });

        /**
         * {@link Integer} from {@link Number}
         */
        ALL.put(new Key(Integer.class, Number.class), new Converter<Integer,Number>() {
            public final Integer convert(final Number o) {
                return o.intValue();
            }
        });

        /**
         * {@link Integer} from {@link String}
         */
        ALL.put(new Key(Integer.class, String.class), new Converter<Integer,String>() {
            public final Integer convert(final String o) {
                return Integer.valueOf(o);
            }
        });

        /**
         * {@link Locale} from {@link String}
         */
        ALL.put(new Key(Locale.class, String.class), new Converter<Locale,String>() {
            public final Locale convert(final String o) {
                //JDK7+: Locale.forLanguageTag(o);
                final String[] value = o.split("-", 3);
                if (value.length == 3) {
                    return new Locale(value[0], value[1], value[2]);
                } else if (value.length == 2) {
                    return new Locale(value[0], value[1]);
                } else {
                    return new Locale(value[0]);
                }
            }
        });

        /**
         * {@link Long} from {@link Date}
         */
        ALL.put(new Key(Long.class, Date.class), new Converter<Long,Date>() {
            public final Long convert(final Date o) {
                return o.getTime();
            }
        });

        /**
         * {@link Long} from {@link Number}
         */
        ALL.put(new Key(Long.class, Number.class), new Converter<Long,Number>() {
            public final Long convert(final Number o) {
                return o.longValue();
            }
        });

        /**
         * {@link Long} from {@link String}
         */
        ALL.put(new Key(Long.class, String.class), new Converter<Long,String>() {
            public final Long convert(final String o) {
                return Long.valueOf(o);
            }
        });

        /**
         * {@link Short} from {@link Number}
         */
        ALL.put(new Key(Short.class, Number.class), new Converter<Short,Number>() {
            public final Short convert(final Number o) {
                return o.shortValue();
            }
        });

        /**
         * {@link Short} from {@link String}
         */
        ALL.put(new Key(Short.class, String.class), new Converter<Short,String>() {
            public final Short convert(final String o) {
                return Short.valueOf(o);
            }
        });

        /**
         * {@link String} from {@link Boolean}
         */
        ALL.put(new Key(String.class, Boolean.class), new Converter<String,Boolean>() {
            public final String convert(final Boolean o) {
                return Boolean.TRUE.equals(o) ? "1" : "0";
            }
        });

        /**
         * {@link String} from {@link byte} array
         */
        ALL.put(new Key(String.class, byte[].class), new Converter<String,byte[]>() {
            public final String convert(final byte[] o) {
                return new String(o, Charset.forName("UTF-8"));
            }
        });

        /**
         * {@link String} from {@link Date}
         */
        ALL.put(new Key(String.class, Date.class), new Converter<String,Date>() {
            public final String convert(final Date o) {
                return DateUtils.formatISO8601Date(o);
            }
        });

        /**
         * {@link String} from {@link Enum}
         */
        ALL.put(new Key(String.class, Enum.class), new Converter<String,Enum>() {
            public final String convert(final Enum o) {
                return o.name();
            }
        });

        /**
         * {@link String} from {@link Locale}
         */
        ALL.put(new Key(String.class, Locale.class), new Converter<String,Locale>() {
            public final String convert(final Locale o) {
                //JDK7+: return o.toLanguageTag();
                final StringBuilder value = new StringBuilder(o.getLanguage());
                if (!o.getCountry().isEmpty() || !o.getVariant().isEmpty()) {
                    value.append("-").append(o.getCountry());
                }
                if (!o.getVariant().isEmpty()) {
                    value.append("-").append(o.getVariant());
                }
                return value.toString();
            }
        });

        /**
         * {@link String} from {@link TimeZone}
         */
        ALL.put(new Key(String.class, TimeZone.class), new Converter<String,TimeZone>() {
            public final String convert(final TimeZone o) {
                return o.getID();
            }
        });

        /**
         * {@link String} from {@link Object}
         */
        ALL.put(new Key(String.class, Object.class), new Converter<String,Object>() {
            public final String convert(final Object o) {
                return o.toString();
            }
        });

        /**
         * {@link TimeZone} from {@link String}
         */
        ALL.put(new Key(TimeZone.class, String.class), new Converter<TimeZone,String>() {
            public final TimeZone convert(final String o) {
                return TimeZone.getTimeZone(o);
            }
        });

        /**
         * {@link java.util.UUID} from {@link ByteBuffer}
         */
        ALL.put(new Key(java.util.UUID.class, ByteBuffer.class), new Converter<java.util.UUID,ByteBuffer>() {
            public final java.util.UUID convert(final ByteBuffer o) {
                return new java.util.UUID(o.getLong(), o.getLong());
            }
        });

        /**
         * {@link java.util.UUID} from {@link String}
         */
        ALL.put(new Key(java.util.UUID.class, String.class), new Converter<java.util.UUID,String>() {
            public final java.util.UUID convert(final String o) {
                return java.util.UUID.fromString(o);
            }
        });
    }

}
