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

import org.joda.time.DateTime;

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
    public <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
        final Scalar source = Scalar.of(sourceType), target = Scalar.of(targetType);
        final Converter<S,T> toSource = source.getConverter(sourceType, target.<T>type());
        final Converter<T,S> toTarget = target.getConverter(targetType, source.<S>type());
        return new DynamoDBTypeConverter<S,T>() {
            @Override
            public final S convert(final T o) {
                return toSource.convert(o);
            }
            @Override
            public final T unconvert(final S o) {
                return toTarget.convert(o);
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
        BIG_DECIMAL(ScalarAttributeType.N, new ConverterMap(BigDecimal.class, null)
            .with(Number.class, ToBigDecimal.FromString.join(ToString.FromNumber))
            .with(String.class, ToBigDecimal.FromString)
        ),

        /**
         * {@link BigInteger}
         */
        BIG_INTEGER(ScalarAttributeType.N, new ConverterMap(BigInteger.class, null)
            .with(Number.class, ToBigInteger.FromString.join(ToString.FromNumber))
            .with(String.class, ToBigInteger.FromString)
        ),

        /**
         * {@link Boolean}
         */
        BOOLEAN(ScalarAttributeType.N, new ConverterMap(Boolean.class, Boolean.TYPE)
            .with(Number.class, ToBoolean.FromString.join(ToString.FromNumber))
            .with(String.class, ToBoolean.FromString)
        ),

        /**
         * {@link Byte}
         */
        BYTE(ScalarAttributeType.N, new ConverterMap(Byte.class, Byte.TYPE)
            .with(Number.class, ToByte.FromNumber)
            .with(String.class, ToByte.FromString)
        ),

        /**
         * {@link Byte} array
         */
        BYTE_ARRAY(ScalarAttributeType.B, new ConverterMap(byte[].class, null)
            .with(ByteBuffer.class, ToByteArray.FromByteBuffer)
            .with(String.class, ToByteArray.FromString)
        ),

        /**
         * {@link ByteBuffer}
         */
        BYTE_BUFFER(ScalarAttributeType.B, new ConverterMap(ByteBuffer.class, null)
            .with(byte[].class, ToByteBuffer.FromByteArray)
            .with(String.class, ToByteBuffer.FromByteArray.join(ToByteArray.FromString))
            .with(java.util.UUID.class, ToByteBuffer.FromUuid)
        ),

        /**
         * {@link Calendar}
         */
        CALENDAR(ScalarAttributeType.S, new ConverterMap(Calendar.class, null)
            .with(Date.class, ToCalendar.FromDate)
            .with(DateTime.class, ToCalendar.FromDate.join(ToDate.FromDateTime))
            .with(Long.class, ToCalendar.FromDate.join(ToDate.FromLong))
            .with(String.class, ToCalendar.FromDate.join(ToDate.FromString))
        ),

        /**
         * {@link Character}
         */
        CHARACTER(ScalarAttributeType.S, new ConverterMap(Character.class, Character.TYPE)
            .with(String.class, ToCharacter.FromString)
        ),

        /**
         * {@link Currency}
         */
        CURRENCY(ScalarAttributeType.S, new ConverterMap(Currency.class, null)
            .with(String.class, ToCurrency.FromString)
        ),

        /**
         * {@link Date}
         */
        DATE(ScalarAttributeType.S, new ConverterMap(Date.class, null)
            .with(Calendar.class, ToDate.FromCalendar)
            .with(DateTime.class, ToDate.FromDateTime)
            .with(Long.class, ToDate.FromLong)
            .with(String.class, ToDate.FromString)
        ),

        /**
         * {@link DateTime}
         */
        DATE_TIME(/*ScalarAttributeType.S*/null, new ConverterMap(DateTime.class, null)
            .with(Calendar.class, ToDateTime.FromDate.join(ToDate.FromCalendar))
            .with(Date.class, ToDateTime.FromDate)
            .with(Long.class, ToDateTime.FromDate.join(ToDate.FromLong))
            .with(String.class, ToDateTime.FromDate.join(ToDate.FromString))
        ),

        /**
         * {@link Double}
         */
        DOUBLE(ScalarAttributeType.N, new ConverterMap(Double.class, Double.TYPE)
            .with(Number.class, ToDouble.FromNumber)
            .with(String.class, ToDouble.FromString)
        ),

        /**
         * {@link Float}
         */
        FLOAT(ScalarAttributeType.N, new ConverterMap(Float.class, Float.TYPE)
            .with(Number.class, ToFloat.FromNumber)
            .with(String.class, ToFloat.FromString)
        ),

        /**
         * {@link Integer}
         */
        INTEGER(ScalarAttributeType.N, new ConverterMap(Integer.class, Integer.TYPE)
            .with(Number.class, ToInteger.FromNumber)
            .with(String.class, ToInteger.FromString)
        ),

        /**
         * {@link Locale}
         */
        LOCALE(ScalarAttributeType.S, new ConverterMap(Locale.class, null)
            .with(String.class, ToLocale.FromString)
        ),

        /**
         * {@link Long}
         */
        LONG(ScalarAttributeType.N, new ConverterMap(Long.class, Long.TYPE)
            .with(Date.class, ToLong.FromDate)
            .with(DateTime.class, ToLong.FromDate.join(ToDate.FromDateTime))
            .with(Calendar.class, ToLong.FromDate.join(ToDate.FromCalendar))
            .with(Number.class, ToLong.FromNumber)
            .with(String.class, ToLong.FromString)
        ),

        /**
         * {@link S3Link}
         */
        S3_LINK(ScalarAttributeType.S, new ConverterMap(S3Link.class, null)),

        /**
         * {@link Short}
         */
        SHORT(ScalarAttributeType.N, new ConverterMap(Short.class, Short.TYPE)
            .with(Number.class, ToShort.FromNumber)
            .with(String.class, ToShort.FromString)
        ),

        /**
         * {@link String}
         */
        STRING(ScalarAttributeType.S, new ConverterMap(String.class, null)
            .with(Boolean.class, ToString.FromBoolean)
            .with(byte[].class, ToString.FromByteArray)
            .with(ByteBuffer.class, ToString.FromByteArray.join(ToByteArray.FromByteBuffer))
            .with(Calendar.class, ToString.FromDate.join(ToDate.FromCalendar))
            .with(Date.class, ToString.FromDate)
            .with(Enum.class, ToString.FromEnum)
            .with(Locale.class, ToString.FromLocale)
            .with(TimeZone.class, ToString.FromTimeZone)
            .with(Object.class, ToString.FromObject)
        ),

        /**
         * {@link TimeZone}
         */
        TIME_ZONE(ScalarAttributeType.S, new ConverterMap(TimeZone.class, null)
            .with(String.class, ToTimeZone.FromString)
        ),

        /**
         * {@link java.net.URL}
         */
        URL(ScalarAttributeType.S, new ConverterMap(java.net.URL.class, null)
            .with(String.class, ToUrl.FromString)
        ),

        /**
         * {@link java.net.URI}
         */
        URI(ScalarAttributeType.S, new ConverterMap(java.net.URI.class, null)
            .with(String.class, ToUri.FromString)
        ),

        /**
         * {@link java.util.UUID}
         */
        UUID(ScalarAttributeType.S, new ConverterMap(java.util.UUID.class, null)
            .with(ByteBuffer.class, ToUuid.FromByteBuffer)
            .with(String.class, ToUuid.FromString)
        ),

        /**
         * {@link Object}; default must be last
         */
        DEFAULT(null, new ConverterMap(Object.class, null)) {
            @Override
            <S,T> Converter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
                if (sourceType.isEnum() && STRING.map.isAssignableFrom(targetType)) {
                    return (Converter<S,T>)new ToEnum.FromString(sourceType);
                }
                return super.<S,T>getConverter(sourceType, targetType);
            }
        };

        /**
         * The scalar attribute type.
         */
        private final ScalarAttributeType scalarAttributeType;

        /**
         * The mapping of conversion functions for this scalar.
         */
        private final ConverterMap map;

        /**
         * Constructs a new scalar with the specified conversion mappings.
         */
        private Scalar(ScalarAttributeType scalarAttributeType, ConverterMap map) {
            this.scalarAttributeType = scalarAttributeType;
            this.map = map;
        }

        /**
         * Returns the function to convert from the specified target class to
         * this scalar type.
         */
        <S,T> Converter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
            return map.<S,T>getConverter(targetType);
        }

        /**
         * Converts the target instance using the standard type-conversions.
         */
        @SuppressWarnings("unchecked")
        final <S> S convert(Object o) {
            return getConverter(this.<S>type(), (Class<Object>)o.getClass()).convert(o);
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
        final boolean is(final Class<?> type) {
            return this.map.isAssignableFrom(type);
        }

        /**
         * Returns the primary reference type.
         */
        @SuppressWarnings("unchecked")
        final <S> Class<S> type() {
            return (Class<S>)this.map.referenceType;
        }

        /**
         * Returns the first matching scalar, which may be the same as or a
         * supertype of the specified target class.
         */
        static Scalar of(Class<?> type) {
            for (final Scalar scalar : Scalar.values()) {
                if (scalar.is(type)) {
                    return scalar;
                }
            }
            return DEFAULT;
        }
    }

    /**
     * Standard vector types.
     */
    static abstract class Vector {
        /**
         * {@link List}
         */
        static final ToList LIST = new ToList();
        static final class ToList extends Vector {
            <S,T> DynamoDBTypeConverter<List<S>,List<T>> join(final DynamoDBTypeConverter<S,T> scalar) {
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

            <S,T> List<S> convert(Collection<T> o, DynamoDBTypeConverter<S,T> scalar) {
                final List<S> vector = new ArrayList<S>(o.size());
                for (final T t : o) {
                    vector.add(scalar.convert(t));
                }
                return vector;
            }

            <S,T> List<T> unconvert(Collection<S> o, DynamoDBTypeConverter<S,T> scalar) {
                final List<T> vector = new ArrayList<T>(o.size());
                for (final S s : o) {
                    vector.add(scalar.unconvert(s));
                }
                return vector;
            }

            @Override
            boolean is(final Class<?> type) {
                return List.class.isAssignableFrom(type);
            }
        }

        /**
         * {@link Map}
         */
        static final ToMap MAP = new ToMap();
        static final class ToMap extends Vector {
            <K,S,T> DynamoDBTypeConverter<Map<K,S>,Map<K,T>> join(final DynamoDBTypeConverter<S,T> scalar) {
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

            <K,S,T> Map<K,S> convert(Map<K,T> o, DynamoDBTypeConverter<S,T> scalar) {
                final Map<K,S> vector = new LinkedHashMap<K,S>();
                for (final Map.Entry<K,T> t : o.entrySet()) {
                    vector.put(t.getKey(), scalar.convert(t.getValue()));
                }
                return vector;
            }

            <K,S,T> Map<K,T> unconvert(Map<K,S> o, DynamoDBTypeConverter<S,T> scalar) {
                final Map<K,T> vector = new LinkedHashMap<K,T>();
                for (final Map.Entry<K,S> s : o.entrySet()) {
                    vector.put(s.getKey(), scalar.unconvert(s.getValue()));
                }
                return vector;
            }

            boolean is(final Class<?> type) {
                return Map.class.isAssignableFrom(type);
            }
        }

        /**
         * {@link Set}
         */
        static final ToSet SET = new ToSet();
        static final class ToSet extends Vector {
            <S,T> DynamoDBTypeConverter<List<S>,Collection<T>> join(final DynamoDBTypeConverter<S,T> target) {
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

            <S,T> Set<T> unconvert(Collection<S> o, DynamoDBTypeConverter<S,T> scalar) {
                final Set<T> vector = new LinkedHashSet<T>();
                for (final S s : o) {
                    if (vector.add(scalar.unconvert(s)) == false) {
                        throw new DynamoDBMappingException("duplicate value (" + s + ")");
                    }
                }
                return vector;
            }

            boolean is(final Class<?> type) {
                return Set.class.isAssignableFrom(type);
            }
        }

        /**
         * Determines if the class represented by this vector is either the
         * same as or a supertype of the specified target type.
         */
        abstract boolean is(Class<?> type);
    }

    /**
     * Converter map.
     */
    private static class ConverterMap extends LinkedHashMap<Class<?>,Converter<?,?>> {
        private static final long serialVersionUID = -1L;
        private final Class<?> referenceType, primitiveType;

        private ConverterMap(Class<?> referenceType, Class<?> primitiveType) {
            this.referenceType = referenceType;
            this.primitiveType = primitiveType;
        }

        private <S,T> ConverterMap with(Class<T> targetType, Converter<S,T> converter) {
            put(targetType, converter);
            return this;
        }

        private boolean isAssignableFrom(Class<?> type) {
            return type.isPrimitive() ? primitiveType == type : referenceType.isAssignableFrom(type);
        }

        @SuppressWarnings("unchecked")
        private <S,T> Converter<S,T> getConverter(Class<T> targetType) {
            for (final Map.Entry<Class<?>,Converter<?,?>> entry : entrySet()) {
                if (entry.getKey().isAssignableFrom(targetType)) {
                    return (Converter<S,T>)entry.getValue();
                }
            }
            if (isAssignableFrom(targetType)) {
                return (Converter<S,T>)ToObject.FromObject;
            }
            throw new DynamoDBMappingException(
                "type [" + targetType + "] is not supported; no conversion from " + referenceType
            );
        }
    }

    /**
     * {@link BigDecimal} conversion functions.
     */
    private static abstract class ToBigDecimal<T> extends Converter<BigDecimal,T> {
        private static final ToBigDecimal<String> FromString = new ToBigDecimal<String>() {
            @Override
            public final BigDecimal convert(final String o) {
                return new BigDecimal(o);
            }
        };
    }

    /**
     * {@link BigInteger} conversion functions.
     */
    private static abstract class ToBigInteger<T> extends Converter<BigInteger,T> {
        private static final ToBigInteger<String> FromString = new ToBigInteger<String>() {
            @Override
            public final BigInteger convert(final String o) {
                return new BigInteger(o);
            }
        };
    }

    /**
     * {@link Boolean} conversion functions.
     */
    private static abstract class ToBoolean<T> extends Converter<Boolean,T> {
        private static final ToBoolean<String> FromString = new ToBoolean<String>() {
            private final Pattern N0 = Pattern.compile("(?i)[N0]");
            private final Pattern Y1 = Pattern.compile("(?i)[Y1]");
            @Override
            public final Boolean convert(final String o) {
                return N0.matcher(o).matches() ? Boolean.FALSE : Y1.matcher(o).matches() ? Boolean.TRUE : Boolean.valueOf(o);
            }
        };
    }

    /**
     * {@link Byte} conversion functions.
     */
    private static abstract class ToByte<T> extends Converter<Byte,T> {
        private static final ToByte<Number> FromNumber = new ToByte<Number>() {
            @Override
            public final Byte convert(final Number o) {
                return o.byteValue();
            }
        };

        private static final ToByte<String> FromString = new ToByte<String>() {
            @Override
            public final Byte convert(final String o) {
                return Byte.valueOf(o);
            }
        };
    }

    /**
     * {@link byte} array conversion functions.
     */
    private static abstract class ToByteArray<T> extends Converter<byte[],T> {
        private static final ToByteArray<ByteBuffer> FromByteBuffer = new ToByteArray<ByteBuffer>() {
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

        private static final ToByteArray<String> FromString = new ToByteArray<String>() {
            @Override
            public final byte[] convert(final String o) {
                return o.getBytes(Charset.forName("UTF-8"));
            }
        };
    }

    /**
     * {@link ByteBuffer} conversion functions.
     */
    private static abstract class ToByteBuffer<T> extends Converter<ByteBuffer,T> {
        private static final ToByteBuffer<byte[]> FromByteArray = new ToByteBuffer<byte[]>() {
            @Override
            public final ByteBuffer convert(final byte[] o) {
                return ByteBuffer.wrap(o);
            }
        };

        private static final ToByteBuffer<java.util.UUID> FromUuid = new ToByteBuffer<java.util.UUID>() {
            @Override
            public final ByteBuffer convert(final java.util.UUID o) {
                final ByteBuffer value = ByteBuffer.allocate(16);
                value.putLong(o.getMostSignificantBits()).putLong(o.getLeastSignificantBits());
                value.position(0);
                return value;
            }
        };
    }

    /**
     * {@link Calendar} conversion functions.
     */
    private static abstract class ToCalendar<T> extends Converter<Calendar,T> {
        private static final ToCalendar<Date> FromDate = new ToCalendar<Date>() {
            @Override
            public final Calendar convert(final Date o) {
                final Calendar value = Calendar.getInstance();
                value.setTime(o);
                return value;
            }
        };
    }

    /**
     * {@link Character} conversion functions.
     */
    private static abstract class ToCharacter<T> extends Converter<Character,T> {
        private static final ToCharacter<String> FromString = new ToCharacter<String>() {
            @Override
            public final Character convert(final String o) {
                return Character.valueOf(o.charAt(0));
            }
        };
    }

    /**
     * {@link Currency} conversion functions.
     */
    private static abstract class ToCurrency<T> extends Converter<Currency,T> {
        private static final ToCurrency<String> FromString = new ToCurrency<String>() {
            @Override
            public final Currency convert(final String o) {
                return Currency.getInstance(o);
            }
        };
    }

    /**
     * {@link Date} conversion functions.
     */
    private static abstract class ToDate<T> extends Converter<Date,T> {
        private static final ToDate<Calendar> FromCalendar = new ToDate<Calendar>() {
            @Override
            public final Date convert(final Calendar o) {
                return o.getTime();
            }
        };

        private static final ToDate<DateTime> FromDateTime = new ToDate<DateTime>() {
            @Override
            public final Date convert(final DateTime o) {
                return o.toDate();
            }
        };

        private static final ToDate<Long> FromLong = new ToDate<Long>() {
            @Override
            public final Date convert(final Long o) {
                return new Date(o);
            }
        };

        private static final ToDate<String> FromString = new ToDate<String>() {
            @Override
            public final Date convert(final String o) {
                return DateUtils.parseISO8601Date(o);
            }
        };
    }

    /**
     * {@link DateTime} conversion functions.
     */
    private static abstract class ToDateTime<T> extends Converter<DateTime,T> {
        private static final ToDateTime<Date> FromDate = new ToDateTime<Date>() {
            public final DateTime convert(final Date o) {
                return new DateTime(o);
            }
        };
    }

    /**
     * {@link Double} conversion functions.
     */
    private static abstract class ToDouble<T> extends Converter<Double,T> {
        private static final ToDouble<Number> FromNumber = new ToDouble<Number>() {
            @Override
            public final Double convert(final Number o) {
                return o.doubleValue();
            }
        };

        private static final ToDouble<String> FromString = new ToDouble<String>() {
            @Override
            public final Double convert(final String o) {
                return Double.valueOf(o);
            }
        };
    }

    /**
     * {@link Enum} from {@link String}
     */
    private static abstract class ToEnum<S extends Enum<S>,T> extends Converter<S,T> {
        private static final class FromString<S extends Enum<S>> extends ToEnum<S,String> {
            private final Class<S> sourceType;
            private FromString(final Class<S> sourceType) {
                this.sourceType = sourceType;
            }
            @Override
            public final S convert(final String o) {
                return Enum.valueOf(sourceType, o);
            }
        }
    }

    /**
     * {@link Float} conversion functions.
     */
    private static abstract class ToFloat<T> extends Converter<Float,T> {
        private static final ToFloat<Number> FromNumber = new ToFloat<Number>() {
            @Override
            public final Float convert(final Number o) {
                return o.floatValue();
            }
        };

        private static final ToFloat<String> FromString = new ToFloat<String>() {
            @Override
            public final Float convert(final String o) {
                return Float.valueOf(o);
            }
        };
    }

    /**
     * {@link Integer} conversion functions.
     */
    private static abstract class ToInteger<T> extends Converter<Integer,T> {
        private static final ToInteger<Number> FromNumber = new ToInteger<Number>() {
            @Override
            public final Integer convert(final Number o) {
                return o.intValue();
            }
        };

        private static final ToInteger<String> FromString = new ToInteger<String>() {
            @Override
            public final Integer convert(final String o) {
                return Integer.valueOf(o);
            }
        };
    }

    /**
     * {@link Locale} conversion functions.
     */
    private static abstract class ToLocale<T> extends Converter<Locale,T> {
        private static final ToLocale<String> FromString = new ToLocale<String>() {
            @Override
            public final Locale convert(final String o) {
                final String[] value = o.split("-", 3);
                if (value.length == 3) return new Locale(value[0], value[1], value[2]);
                if (value.length == 2) return new Locale(value[0], value[1]);
                return new Locale(value[0]); //JDK7+: return Locale.forLanguageTag(o);
            }
        };
    }

    /**
     * {@link Long} conversion functions.
     */
    private static abstract class ToLong<T> extends Converter<Long,T> {
        private static final ToLong<Date> FromDate = new ToLong<Date>() {
            @Override
            public final Long convert(final Date o) {
                return o.getTime();
            }
        };

        private static final ToLong<Number> FromNumber = new ToLong<Number>() {
            @Override
            public final Long convert(final Number o) {
                return o.longValue();
            }
        };

        private static final ToLong<String> FromString = new ToLong<String>() {
            @Override
            public final Long convert(final String o) {
                return Long.valueOf(o);
            }
        };
    }

    /**
     * {@link Short} conversion functions.
     */
    private static abstract class ToShort<T> extends Converter<Short,T> {
        private static final ToShort<Number> FromNumber = new ToShort<Number>() {
            @Override
            public final Short convert(final Number o) {
                return o.shortValue();
            }
        };

        private static final ToShort<String> FromString = new ToShort<String>() {
            @Override
            public final Short convert(final String o) {
                return Short.valueOf(o);
            }
        };
    }

    /**
     * {@link String} conversion functions.
     */
    private static abstract class ToString<T> extends Converter<String,T> {
        private static final ToString<Boolean> FromBoolean = new ToString<Boolean>() {
            @Override
            public final String convert(final Boolean o) {
                return Boolean.TRUE.equals(o) ? "1" : "0";
            }
        };

        private static final ToString<byte[]> FromByteArray = new ToString<byte[]>() {
            @Override
            public final String convert(final byte[] o) {
                return new String(o, Charset.forName("UTF-8"));
            }
        };

        private static final ToString<Date> FromDate = new ToString<Date>() {
            @Override
            public final String convert(final Date o) {
                return DateUtils.formatISO8601Date(o);
            }
        };

        private static final ToString<Enum> FromEnum = new ToString<Enum>() {
            @Override
            public final String convert(final Enum o) {
                return o.name();
            }
        };

        private static final ToString<Locale> FromLocale = new ToString<Locale>() {
            @Override
            public final String convert(final Locale o) {
                final StringBuilder value = new StringBuilder(o.getLanguage());
                if (!o.getCountry().isEmpty() || !o.getVariant().isEmpty()) {
                    value.append("-").append(o.getCountry());
                }
                if (!o.getVariant().isEmpty()) {
                    value.append("-").append(o.getVariant());
                }
                return value.toString(); //JDK7+: return o.toLanguageTag();
            }
        };

        private static final ToString<Number> FromNumber = new ToString<Number>() {
            @Override
            public final String convert(final Number o) {
                return o.toString();
            }
        };

        private static final ToString<TimeZone> FromTimeZone = new ToString<TimeZone>() {
            @Override
            public final String convert(final TimeZone o) {
                return o.getID();
            }
        };

        private static final ToString<Object> FromObject = new ToString<Object>() {
            @Override
            public final String convert(final Object o) {
                return o.toString();
            }
        };
    }

    /**
     * {@link TimeZone} conversion functions.
     */
    private static abstract class ToTimeZone<T> extends Converter<TimeZone,T> {
        private static final ToTimeZone<String> FromString = new ToTimeZone<String>() {
            @Override
            public final TimeZone convert(final String o) {
                return TimeZone.getTimeZone(o);
            }
        };
    }

    /**
     * {@link java.net.URL} conversion functions.
     */
    private static abstract class ToUrl<T> extends Converter<java.net.URL,String> {
        private static final ToUrl<String> FromString = new ToUrl<String>() {
            @Override
            public final java.net.URL convert(final String o) {
                try {
                   return new java.net.URL(o);
                } catch (final java.net.MalformedURLException e) {
                    throw new IllegalArgumentException("malformed URL", e);
                }
            }
        };
    }

    /**
     * {@link java.net.URI} conversion functions.
     */
    private static abstract class ToUri<T> extends Converter<java.net.URI,T> {
        private static final ToUri<String> FromString = new ToUri<String>() {
            @Override
            public final java.net.URI convert(final String o) {
                try {
                    return new java.net.URI(o);
                } catch (final java.net.URISyntaxException e) {
                    throw new IllegalArgumentException("malformed URI", e);
                }
            }
        };
    }

    /**
     * {@link java.util.UUID} conversion functions.
     */
    private static abstract class ToUuid<T> extends Converter<java.util.UUID,T> {
        private static final ToUuid<ByteBuffer> FromByteBuffer = new ToUuid<ByteBuffer>() {
            @Override
            public final java.util.UUID convert(final ByteBuffer o) {
                return new java.util.UUID(o.getLong(), o.getLong());
            }
        };

        private static final ToUuid<String> FromString = new ToUuid<String>() {
            @Override
            public final java.util.UUID convert(final String o) {
                return java.util.UUID.fromString(o);
            }
        };
    }

    /**
     * {@link Object} conversion functions.
     */
    private static abstract class ToObject<T> extends Converter<Object,T> {
        private static final ToObject<Object> FromObject = new ToObject<Object>() {
            @Override
            public final Object convert(final Object o) {
                return o;
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

}
