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
import java.nio.charset.Charset;
import java.util.AbstractMap.SimpleImmutableEntry;
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
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
final class StandardTypeConverters extends DynamoDBTypeConverterFactory {

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
        final Scalar source = Scalar.of(sourceType), target = Scalar.of(targetType);
        final Converter<S,T> sourceFromTarget = source.getConverter(sourceType, target.<T>type());
        final Converter<T,S> targetFromSource = target.getConverter(targetType, source.<S>type());
        return new DynamoDBTypeConverter<S,T>() {
            @Override
            public final S convert(final T o) {
                return sourceFromTarget.convert(o);
            }
            @Override
            public final T unconvert(final S o) {
                return targetFromSource.convert(o);
            }
        };
    }

    /**
     * Standard scalar types.
     */
    static enum Scalar {
        /**
         * {@link BigDecimal}
         */
        BIG_DECIMAL(ScalarAttributeType.N, BigDecimal.class, null, new ConverterMap<BigDecimal>()
            .with(String.class, BigDecimalFromString)
        ),

        /**
         * {@link BigInteger}
         */
        BIG_INTEGER(ScalarAttributeType.N, BigInteger.class, null, new ConverterMap<BigInteger>()
            .with(String.class, BigIntegerFromString)
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(ScalarAttributeType.N, Boolean.class, Boolean.TYPE, new ConverterMap<Boolean>()
            .with(String.class, BooleanFromString)
        ),

        /**
         * {@link Byte}
         */
        BYTE(ScalarAttributeType.N, Byte.class, Byte.TYPE, new ConverterMap<Byte>()
            .with(Number.class, ByteFromNumber)
            .with(String.class, ByteFromString)
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(ScalarAttributeType.B, byte[].class, null, new ConverterMap<byte[]>()
            .with(ByteBuffer.class, ByteArrayFromByteBuffer)
            .with(String.class, ByteArrayFromString)
        ),

        /**
         * {@link ByteBuffer}
         */
        BYTE_BUFFER(ScalarAttributeType.B, ByteBuffer.class, null, new ConverterMap<ByteBuffer>()
            .with(byte[].class, ByteBufferFromByteArray)
            .with(String.class, ByteBufferFromByteArray.join(ByteArrayFromString))
            .with(java.util.UUID.class, ByteBufferFromUuid)
        ),

        /**
         * {@link Calendar}
         */
        CALENDAR(ScalarAttributeType.S, Calendar.class, null, new ConverterMap<Calendar>()
            .with(Date.class, CalendarFromDate)
            .with(String.class, CalendarFromDate.join(DateFromString))
        ),

        /**
         * {@link Character}
         */
        CHARACTER(ScalarAttributeType.S, Character.class, Character.TYPE, new ConverterMap<Character>()
            .with(String.class, CharacterFromString)
        ),

        /**
         * {@link Currency}
         */
        CURRENCY(ScalarAttributeType.S, Currency.class, null, new ConverterMap<Currency>()
            .with(String.class, CurrencyFromString)
        ),

        /**
         * {@link Date}
         */
        DATE(ScalarAttributeType.S, Date.class, null, new ConverterMap<Date>()
            .with(Calendar.class, DateFromCalendar)
            .with(Long.class, DateFromLong)
            .with(String.class, DateFromString)
        ),

        /**
         * {@link Double}
         */
        DOUBLE(ScalarAttributeType.N, Double.class, Double.TYPE, new ConverterMap<Double>()
            .with(Number.class, DoubleFromNumber)
            .with(String.class, DoubleFromString)
        ),

        /**
         * {@link Float}
         */
        FLOAT(ScalarAttributeType.N, Float.class, Float.TYPE, new ConverterMap<Float>()
            .with(Number.class, FloatFromNumber)
            .with(String.class, FloatFromString)
        ),

        /**
         * {@link Integer}
         */
        INTEGER(ScalarAttributeType.N, Integer.class, Integer.TYPE, new ConverterMap<Integer>()
            .with(Number.class, IntegerFromNumber)
            .with(String.class, IntegerFromString)
        ),

        /**
         * {@link Locale}
         */
        LOCALE(ScalarAttributeType.S, Locale.class, null, new ConverterMap<Locale>()
            .with(String.class, LocaleFromString)
        ),

        /**
         * {@link Long}
         */
        LONG(ScalarAttributeType.N, Long.class, Long.TYPE, new ConverterMap<Long>()
            .with(Date.class, LongFromDate)
            .with(Number.class, LongFromNumber)
            .with(String.class, LongFromString)
        ),

        /**
         * {@link S3Link}
         */
        S3_LINK(ScalarAttributeType.S, S3Link.class, null, new ConverterMap<S3Link>()),

        /**
         * {@link Short}
         */
        SHORT(ScalarAttributeType.N, Short.class, Short.TYPE, new ConverterMap<Short>()
            .with(Number.class, ShortFromNumber)
            .with(String.class, ShortFromString)
        ),

        /**
         * {@link String}
         */
        STRING(ScalarAttributeType.S, String.class, null, new ConverterMap<String>()
            .with(Boolean.class, StringFromBoolean)
            .with(byte[].class, StringFromByteArray)
            .with(ByteBuffer.class, StringFromByteArray.join(ByteArrayFromByteBuffer))
            .with(Calendar.class, StringFromDate.join(DateFromCalendar))
            .with(Date.class, StringFromDate)
            .with(Enum.class, StringFromEnum)
            .with(Locale.class, StringFromLocale)
            .with(TimeZone.class, StringFromTimeZone)
            .with(Object.class, StringFromObject)
        ),

        /**
         * {@link TimeZone}
         */
        TIME_ZONE(ScalarAttributeType.S, TimeZone.class, null, new ConverterMap<TimeZone>()
            .with(String.class, TimeZoneFromString)
        ),

        /**
         * {@link java.net.URL}
         */
        URL(ScalarAttributeType.S, java.net.URL.class, null, new ConverterMap<java.net.URL>()
            .with(String.class, UrlFromString)
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(ScalarAttributeType.S, java.util.UUID.class, null, new ConverterMap<java.util.UUID>()
            .with(ByteBuffer.class, UuidFromByteBuffer)
            .with(String.class, UuidFromString)
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(null, Object.class, null, new ConverterMap<Object>());

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The conversion types/
         */
        private final Class<?> type, primitiveType;

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConverterMap<Object> map;

        /**
         * Constructs a new scalar with the specified conversion mappings.
         */
        private Scalar(final ScalarAttributeType scalarAttributeType, final Class<?> type, final Class<?> primitiveType, final ConverterMap<?> map) {
            this.scalarAttributeType = scalarAttributeType;
            this.primitiveType = primitiveType;
            this.type = type;
            this.map = (ConverterMap<Object>)map;
        }

        /**
         * Returns the function to convert from the specified target class to
         * this scalar type.
         */
        final <S,T> Converter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            if (this == DEFAULT && sourceType.isEnum() && STRING.is(targetType)) {
                return (Converter<S,T>)new EnumFromString(sourceType);
            }
            for (final Map.Entry<Class<?>,Converter<Object,?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(targetType)) {
                    return (Converter<S,T>)entry.getValue();
                }
            }
            if (is(targetType)) {
                return (Converter<S,T>)ObjectFromObject;
            }
            throw new DynamoDBMappingException("type [" + targetType + "] is not supported; no conversion from " + sourceType);
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
            return factory().getConverter(this.<S>type(), targetType);
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
            if (sourceType.isPrimitive()) {
                return primitiveType != null && primitiveType.isAssignableFrom(sourceType);
            } else {
                return type.isAssignableFrom(sourceType);
            }
        }

        /**
         * Returns the primary conversion type.
         */
        final <S> Class<S> type() {
            return (Class<S>)this.type;
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

        /**
         * Converter map.
         */
        private static final class ConverterMap<S> extends LinkedHashMap<Class<?>,Converter<S,?>> {
            private static final long serialVersionUID = -1L;
            private <T> ConverterMap<S> with(Class<T> targetType, Converter<S,T> converter) {
                put(targetType, converter);
                return this;
            }
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
            static <S,T> DynamoDBTypeConverter<List<S>,List<T>> join(final DynamoDBTypeConverter<S,T> scalar) {
                return new DynamoDBTypeConverter<List<S>,List<T>>() {
                    @Override
                    public final List<S> convert(final List<T> o) {
                        return LIST.<S,T>convert(o, scalar);
                    }
                    @Override
                    public final List<T> unconvert(final List<S> o) {
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
                    @Override
                    public final Map<K,S> convert(final Map<K,T> o) {
                        return MAP.<K,S,T>convert(o, scalar);
                    }
                    @Override
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
                    @Override
                    public List<S> convert(final Collection<T> o) {
                        return LIST.<S,T>convert(o, target);
                    }
                    @Override
                    public Collection<T> unconvert(final List<S> o) {
                        return SET.<S,T>unconvert(o, target);
                    }
                };
            }

            static <S,T> Set<T> unconvert(final Collection<S> o, final DynamoDBTypeConverter<S,T> scalar) {
                final Set<T> vector = new LinkedHashSet<T>();
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
     * Joins the source and target converters into a new extended converter.
     */
    static <S,T,U> DynamoDBTypeConverter<S,U> join(final DynamoDBTypeConverter<S,T> source, final DynamoDBTypeConverter<T,U> target) {
        return new DynamoDBTypeConverter<S,U>() {
            @Override
            public final S convert(final U o) {
                final T object = o == null ? null : target.convert(o);
                return object == null ? null : source.convert(object);
            }
            @Override
            public final U unconvert(final S o) {
                final T object = o == null ? null : source.unconvert(o);
                return object == null ? null : target.unconvert(object);
            }
        };
    }

    /**
     * One-way type-converter.
     */
    static abstract class Converter<S,T> {
        final <U> Converter<S,U> join(final Converter<T,U> target) {
            final Converter<S,T> source = this;
            return new Converter<S,U>() {
                @Override
                public S convert(final U o) {
                    return source.convert(target.convert(o));
                }
            };
        }

        public abstract S convert(T o);
    }

    /**
     * {@link BigDecimal} from {@link String}
     */
    private static final Converter<BigDecimal,String> BigDecimalFromString = new Converter<BigDecimal,String>() {
        @Override
        public final BigDecimal convert(final String o) {
            return new BigDecimal(o);
        }
    };

    /**
     * {@link BigInteger} from {@link String}
     */
    private static final Converter<BigInteger,String> BigIntegerFromString = new Converter<BigInteger,String>() {
        @Override
        public final BigInteger convert(final String o) {
            return new BigInteger(o);
        }
    };

    /**
     * {@link Boolean} from {@link String}
     */
    private static final Converter<Boolean,String> BooleanFromString = new Converter<Boolean,String>() {
        private final Pattern N0 = Pattern.compile("(?i)[N0]");
        private final Pattern Y1 = Pattern.compile("(?i)[Y1]");
        @Override
        public final Boolean convert(final String o) {
            return N0.matcher(o).matches() ? Boolean.FALSE : Y1.matcher(o).matches() ? Boolean.TRUE : Boolean.valueOf(o);
        }
    };

    /**
     * {@link Byte} from {@link Number}
     */
    private static final Converter<Byte,Number> ByteFromNumber = new Converter<Byte,Number>() {
        @Override
        public final Byte convert(final Number o) {
            return o.byteValue();
        }
    };

    /**
     * {@link Byte} from {@link String}
     */
    private static final Converter<Byte,String> ByteFromString = new Converter<Byte,String>() {
        @Override
        public final Byte convert(final String o) {
            return Byte.valueOf(o);
        }
    };

    /**
     * {@link byte} arry from {@link ByteBuffer}
     */
    private static final Converter<byte[],ByteBuffer> ByteArrayFromByteBuffer = new Converter<byte[],ByteBuffer>() {
        @Override
        public final byte[] convert(final ByteBuffer o) {
            if (o.hasArray()) {
                return o.array();
            }
            final byte[] value = new byte[o.remaining()];
            o.get(value);
            return value;
        }
    };

    /**
     * {@link byte} array from {@link String}
     */
    private static final Converter<byte[],String> ByteArrayFromString = new Converter<byte[],String>() {
        private final Charset UTF8 = Charset.forName("UTF-8");
        @Override
        public final byte[] convert(final String o) {
            return o.getBytes(UTF8);
        }
    };

    /**
     * {@link ByteBuffer} from {@link byte} array
     */
    private static final Converter<ByteBuffer,byte[]> ByteBufferFromByteArray = new Converter<ByteBuffer,byte[]>() {
        @Override
        public final ByteBuffer convert(final byte[] o) {
            return ByteBuffer.wrap(o);
        }
    };

    /**
     * {@link ByteBuffer} from {@link java.util.UUID}
     */
    private static final Converter<ByteBuffer,java.util.UUID> ByteBufferFromUuid = new Converter<ByteBuffer,java.util.UUID>() {
        @Override
        public final ByteBuffer convert(final java.util.UUID o) {
            final ByteBuffer value = ByteBuffer.allocate(16);
            value.putLong(o.getMostSignificantBits()).putLong(o.getLeastSignificantBits());
            value.position(0);
            return value;
        }
    };

    /**
     * {@link Calendar} from {@link Date}
     */
    private static final Converter<Calendar,Date> CalendarFromDate = new Converter<Calendar,Date>() {
        @Override
        public final Calendar convert(final Date o) {
            final Calendar value = Calendar.getInstance();
            value.setTime(o);
            return value;
        }
    };

    /**
     * {@link Character} from {@link String}
     */
    private static final Converter<Character,String> CharacterFromString = new Converter<Character,String>() {
        @Override
        public final Character convert(final String o) {
            return Character.valueOf(o.charAt(0));
        }
    };

    /**
     * {@link Currency} from {@link String}
     */
    private static final Converter<Currency,String> CurrencyFromString = new Converter<Currency,String>() {
        @Override
        public final Currency convert(final String o) {
            return Currency.getInstance(o);
        }
    };

    /**
     * {@link Date} from {@link Calendar}
     */
    private static final Converter<Date,Calendar> DateFromCalendar = new Converter<Date,Calendar>() {
        @Override
        public final Date convert(final Calendar o) {
            return o.getTime();
        }
    };

    /**
     * {@link Date} from {@link Long}
     */
    private static final Converter<Date,Long> DateFromLong = new Converter<Date,Long>() {
        @Override
        public final Date convert(final Long o) {
            return new Date(o);
        }
    };

    /**
     * {@link Date} from {@link String}
     */
    private static final Converter<Date,String> DateFromString = new Converter<Date,String>() {
        @Override
        public final Date convert(final String o) {
            return DateUtils.parseISO8601Date(o);
        }
    };

    /**
     * {@link Double} from {@link Number}
     */
    private static final Converter<Double,Number> DoubleFromNumber = new Converter<Double,Number>() {
        @Override
        public final Double convert(final Number o) {
            return o.doubleValue();
        }
    };

    /**
     * {@link Double} from {@link String}
     */
    private static final Converter<Double,String> DoubleFromString = new Converter<Double,String>() {
        @Override
        public final Double convert(final String o) {
            return Double.valueOf(o);
        }
    };

    /**
     * {@link Enum} from {@link String}
     */
    private static final class EnumFromString<S extends Enum<S>> extends Converter<S,String> {
        private final Class<S> sourceType;
        private EnumFromString(final Class<S> sourceType) {
            this.sourceType = sourceType;
        }
        @Override
        public final S convert(final String o) {
            return Enum.valueOf(sourceType, o);
        }
    }

    /**
     * {@link Float} from {@link Number}
     */
    private static final Converter<Float,Number> FloatFromNumber = new Converter<Float,Number>() {
        @Override
        public final Float convert(final Number o) {
            return o.floatValue();
        }
    };

    /**
     * {@link Float} from {@link String}
     */
    private static final Converter<Float,String> FloatFromString = new Converter<Float,String>() {
        @Override
        public final Float convert(final String o) {
            return Float.valueOf(o);
        }
    };

    /**
     * {@link Integer} from {@link Number}
     */
    private static final Converter<Integer,Number> IntegerFromNumber = new Converter<Integer,Number>() {
        @Override
        public final Integer convert(final Number o) {
            return o.intValue();
        }
    };

    /**
     * {@link Integer} from {@link String}
     */
    private static final Converter<Integer,String> IntegerFromString = new Converter<Integer,String>() {
        @Override
        public final Integer convert(final String o) {
            return Integer.valueOf(o);
        }
    };

    /**
     * {@link Locale} from {@link String}
     */
    private static final Converter<Locale,String> LocaleFromString = new Converter<Locale,String>() {
        @Override
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
    };

    /**
     * {@link Long} from {@link Date}
     */
    private static final Converter<Long,Date> LongFromDate = new Converter<Long,Date>() {
        @Override
        public final Long convert(final Date o) {
            return o.getTime();
        }
    };

    /**
     * {@link Long} from {@link Number}
     */
    private static final Converter<Long,Number> LongFromNumber = new Converter<Long,Number>() {
        @Override
        public final Long convert(final Number o) {
            return o.longValue();
        }
    };

    /**
     * {@link Long} from {@link String}
     */
    private static final Converter<Long,String> LongFromString = new Converter<Long,String>() {
        @Override
        public final Long convert(final String o) {
            return Long.valueOf(o);
        }
    };

    /**
     * {@link Short} from {@link Number}
     */
    private static final Converter<Short,Number> ShortFromNumber = new Converter<Short,Number>() {
        @Override
        public final Short convert(final Number o) {
            return o.shortValue();
        }
    };

    /**
     * {@link Short} from {@link String}
     */
    private static final Converter<Short,String> ShortFromString = new Converter<Short,String>() {
        @Override
        public final Short convert(final String o) {
            return Short.valueOf(o);
        }
    };

    /**
     * {@link String} from {@link Boolean}
     */
    private static final Converter<String,Boolean> StringFromBoolean = new Converter<String,Boolean>() {
        @Override
        public final String convert(final Boolean o) {
            return Boolean.TRUE.equals(o) ? "1" : "0";
        }
    };

    /**
     * {@link String} from {@link byte} array
     */
    private static final Converter<String,byte[]> StringFromByteArray = new Converter<String,byte[]>() {
        private final Charset UTF8 = Charset.forName("UTF-8");
        @Override
        public final String convert(final byte[] o) {
            return new String(o, UTF8);
        }
    };

    /**
     * {@link String} from {@link Date}
     */
    private static final Converter<String,Date> StringFromDate = new Converter<String,Date>() {
        @Override
        public final String convert(final Date o) {
            return DateUtils.formatISO8601Date(o);
        }
    };

    /**
     * {@link String} from {@link Enum}
     */
    private static final Converter<String,Enum> StringFromEnum = new Converter<String,Enum>() {
        @Override
        public final String convert(final Enum o) {
            return o.name();
        }
    };

    /**
     * {@link String} from {@link Locale}
     */
    private static final Converter<String,Locale> StringFromLocale = new Converter<String,Locale>() {
        @Override
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
    };

    /**
     * {@link String} from {@link TimeZone}
     */
    private static final Converter<String,TimeZone> StringFromTimeZone = new Converter<String,TimeZone>() {
        @Override
        public final String convert(final TimeZone o) {
            return o.getID();
        }
    };

    /**
     * {@link String} from {@link Object}
     */
    private static final Converter<String,Object> StringFromObject = new Converter<String,Object>() {
        @Override
        public final String convert(final Object o) {
            return o.toString();
        }
    };

    /**
     * {@link TimeZone} from {@link String}
     */
    private static final Converter<TimeZone,String> TimeZoneFromString = new Converter<TimeZone,String>() {
        @Override
        public final TimeZone convert(final String o) {
            return TimeZone.getTimeZone(o);
        }
    };

    /**
     * {@link java.net.URL} from {@link String}
     */
    private static final Converter<java.net.URL,String> UrlFromString = new Converter<java.net.URL,String>() {
        @Override
        public final java.net.URL convert(final String o) {
            try {
                return new java.net.URL(o);
            } catch (final java.net.MalformedURLException e) {
                throw new IllegalArgumentException("malformed URL", e);
            }
        }
    };

    /**
     * {@link java.util.UUID} from {@link ByteBuffer}
     */
    private static final Converter<java.util.UUID,ByteBuffer> UuidFromByteBuffer = new Converter<java.util.UUID,ByteBuffer>() {
        @Override
        public final java.util.UUID convert(final ByteBuffer o) {
            return new java.util.UUID(o.getLong(), o.getLong());
        }
    };

    /**
     * {@link java.util.UUID} from {@link String}
     */
    private static final Converter<java.util.UUID,String> UuidFromString = new Converter<java.util.UUID,String>() {
        @Override
        public final java.util.UUID convert(final String o) {
            return java.util.UUID.fromString(o);
        }
    };

    /**
     * {@link Object} from {@link Object}
     */
    private static final Converter<Object,Object> ObjectFromObject = new Converter<Object,Object>() {
        @Override
        public final Object convert(final Object o) {
            return o;
        }
    };

}
