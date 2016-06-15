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

import static com.amazonaws.services.dynamodbv2.model.ScalarAttributeType.N;
import static com.amazonaws.services.dynamodbv2.model.ScalarAttributeType.S;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.util.DateUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Type conversions.
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
 */
@SdkInternalApi
enum StandardTypeConverters {

    /**
     * {@link Date} to {@link Calendar}
     */
    DATE_TO_CALENDAR(null, Date.class, Calendar.class, null, new DynamoDBTypeConverter<Date,Calendar>() {
        @Override
        public final Date convert(final Calendar object) {
            return object.getTime();
        }
        @Override
        public final Calendar unconvert(final Date object) {
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(object);
            return calendar;
        }
    }),

    /**
     * {@link Date} to {@link Date}
     */
    DATE_TO_DATE(null, Date.class, Date.class, null, new DynamoDBTypeConverter<Date,Date>() {
        @Override
        public final Date convert(final Date object) {
            return object;
        }
        @Override
        public final Date unconvert(final Date object) {
            return object;
        }
    }),

    /**
     * {@link Date} to {@link Long}
     */
    DATE_TO_LONG(null, Date.class, Long.class, null, new DynamoDBTypeConverter<Date,Long>() {
        @Override
        public final Date convert(final Long object) {
            return new Date(object);
        }
        @Override
        public final Long unconvert(final Date object) {
            return object.getTime();
        }
    }),

    /**
     * {@link String} to {@link BigDecimal}
     */
    STRING_TO_BIGDECIMAL(N, String.class, BigDecimal.class, null, new DynamoDBTypeConverter<String,BigDecimal>() {
        @Override
        public final String convert(final BigDecimal object) {
            return object.toString();
        }
        @Override
        public final BigDecimal unconvert(final String object) {
            return new BigDecimal(object);
        }
    }),

    /**
     * {@link String} to {@link BigInteger}
     */
    STRING_TO_BIGINTEGER(N, String.class, BigInteger.class, null, new DynamoDBTypeConverter<String,BigInteger>() {
        @Override
        public final String convert(final BigInteger object) {
            return object.toString();
        }
        @Override
        public final BigInteger unconvert(final String object) {
            return new BigInteger(object);
        }
    }),

    /**
     * {@link String} to {@link Boolean}
     */
    STRING_TO_BOOLEAN(N, String.class, Boolean.class, Boolean.TYPE, new DynamoDBTypeConverter<String,Boolean>() {
        @Override
        public final String convert(final Boolean object) {
            return Boolean.TRUE.equals(object) ? "1" : "0";
        }
        @Override
        public final Boolean unconvert(final String object) {
            return "0".equals(object) ? Boolean.FALSE : "1".equals(object) ? Boolean.TRUE : Boolean.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Byte}
     */
    STRING_TO_BYTE(N, String.class, Byte.class, Byte.TYPE, new DynamoDBTypeConverter<String,Byte>() {
        @Override
        public final String convert(final Byte object) {
            return object.toString();
        }
        @Override
        public final Byte unconvert(final String object) {
            return Byte.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Calendar}
     */
    STRING_TO_CALENDAR(S, String.class, Calendar.class, null, new DynamoDBTypeConverter<String,Calendar>() {
        @Override
        public final String convert(final Calendar object) {
            return DateUtils.formatISO8601Date(object.getTime());
        }
        @Override
        public final Calendar unconvert(final String object) {
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(DateUtils.parseISO8601Date(object));
            return calendar;
        }
    }),

    /**
     * {@link String} to {@link Character}
     */
    STRING_TO_CHARACTER(null, String.class, Character.class, Character.TYPE, new DynamoDBTypeConverter<String,Character>() {
        @Override
        public final String convert(final Character object) {
            return object.toString();
        }
        @Override
        public final Character unconvert(final String object) {
            return Character.valueOf(object.charAt(0));
        }
    }),

    /**
     * {@link String} to {@link Date}
     */
    STRING_TO_DATE(S, String.class, Date.class, null, new DynamoDBTypeConverter<String,Date>() {
        @Override
        public final String convert(final Date object) {
            return DateUtils.formatISO8601Date(object);
        }
        @Override
        public final Date unconvert(final String object) {
            return DateUtils.parseISO8601Date(object);
        }
    }),

    /**
     * {@link String} to {@link Double}
     */
    STRING_TO_DOUBLE(N, String.class, Double.class, Double.TYPE, new DynamoDBTypeConverter<String,Double>() {
        @Override
        public final String convert(final Double object) {
            return object.toString();
        }
        @Override
        public final Double unconvert(final String object) {
            return Double.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Float}
     */
    STRING_TO_FLOAT(N, String.class, Float.class, Float.TYPE, new DynamoDBTypeConverter<String,Float>() {
        @Override
        public final String convert(final Float object) {
            return object.toString();
        }
        @Override
        public final Float unconvert(final String object) {
            return Float.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Integer}
     */
    STRING_TO_INTEGER(N, String.class, Integer.class, Integer.TYPE, new DynamoDBTypeConverter<String,Integer>() {
        @Override
        public final String convert(final Integer object) {
            return object.toString();
        }
        @Override
        public final Integer unconvert(final String object) {
            return Integer.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Long}
     */
    STRING_TO_LONG(N, String.class, Long.class, Long.TYPE, new DynamoDBTypeConverter<String,Long>() {
        @Override
        public final String convert(final Long object) {
            return object.toString();
        }
        @Override
        public final Long unconvert(final String object) {
            return Long.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link Short}
     */
    STRING_TO_SHORT(N, String.class, Short.class, Short.TYPE, new DynamoDBTypeConverter<String,Short>() {
        @Override
        public final String convert(final Short object) {
            return object.toString();
        }
        @Override
        public final Short unconvert(final String object) {
            return Short.valueOf(object);
        }
    }),

    /**
     * {@link String} to {@link String}
     */
    STRING_TO_STRING(S, String.class, String.class, null, new DynamoDBTypeConverter<String,String>() {
        @Override
        public final String convert(final String object) {
            return object;
        }
        @Override
        public final String unconvert(final String object) {
            return object;
        }
    }),

    /**
     * {@link String} to {@link UUID}
     */
    STRING_TO_UUID(S, String.class, UUID.class, null, new DynamoDBTypeConverter<String,UUID>() {
        @Override
        public final String convert(final UUID object) {
            return object.toString();
        }
        @Override
        public final UUID unconvert(final String object) {
            return UUID.fromString(object);
        }
    }),

    /**
     * {@link UUID} to {@link String}
     */
    UUID_TO_STRING(null, UUID.class, String.class, null, new DynamoDBTypeConverter<UUID,String>() {
        @Override
        public final UUID convert(final String object) {
            return UUID.fromString(object);
        }
        @Override
        public final String unconvert(final UUID object) {
            return object.toString();
        }
    }),

    /**
     * {@link UUID} to {@link UUID}
     */
    UUID_TO_UUID(null, UUID.class, UUID.class, null, new DynamoDBTypeConverter<UUID,UUID>() {
        @Override
        public final UUID convert(final UUID object) {
            return object;
        }
        @Override
        public final UUID unconvert(final UUID object) {
            return object;
        }
    });

    /**
     * The converter.
     */
    private final DynamoDBTypeConverter<?,?> converter;

    /**
     * The scalar attribute type (for native conversions).
     */
    private final ScalarAttributeType scalarAttributeType;

    /**
     * The type conversions.
     */
    private final Class<?> sourceType, targetType, primitiveTargetType;

    /**
     * Constructs the conversion.
     * @param scalarAttributeType The scalar attribute type (for native conversions).
     * @param sourceType The type conversion.
     * @param targetType The type conversion.
     * @param primitiveTargetType The primitive type conversion (or null if not applicable).
     * @param converter The converter.
     */
    private StandardTypeConverters(
        final ScalarAttributeType scalarAttributeType,
        final Class<?> sourceType,
        final Class<?> targetType,
        final Class<?> primitiveTargetType,
        final DynamoDBTypeConverter<?,?> converter) {
        this.converter = converter;
        this.scalarAttributeType = scalarAttributeType;
        this.sourceType = sourceType;
        this.targetType = targetType;
        this.primitiveTargetType = primitiveTargetType;
    }

    /**
     * Gets the type-converter.
     * @return The type-converter.
     */
    final <S,T> DynamoDBTypeConverter<S,T> converter() {
        return (DynamoDBTypeConverter<S,T>)this.converter;
    }

    /**
     * Gets the scalar attribute type.
     * @return The scalar attribute type.
     */
    final ScalarAttributeType scalarAttributeType() {
        return this.scalarAttributeType;
    }

    /**
     * Gets the source conversion type.
     * @return The source conversion type.
     */
    final <S> Class<S> sourceType() {
        return (Class<S>)this.sourceType;
    }

    /**
     * Gets the target conversion type.
     * @return The target conversion type.
     */
    final <T> Class<T> targetType() {
        return (Class<T>)this.targetType;
    }

    /**
     * Gets the primitive target conversion type.
     * @return The primitive target conversion type, or null if not applicable.
     */
    final <T> Class<T> primitiveTargetType() {
        return (Class<T>)this.primitiveTargetType;
    }

    /**
     * Determines if the converter is assignable based on the types.
     * @param sourceType The source conversion type.
     * @param targetType The target conversion type.
     * @param primitive Flag indicating if primitive types are allowed.
     * @return True if assiganble, false otherwise.
     */
    final <S,T> boolean isAssignableFrom(final Class<S> sourceType, final Class<T> targetType, final boolean primitive) {
        if (this.sourceType == sourceType) {
            if (!targetType.isPrimitive()) {
                return this.targetType.isAssignableFrom(targetType);
            } else if (primitive && this.primitiveTargetType != null) {
                return this.primitiveTargetType.isAssignableFrom(targetType);
            }
        }
        return false;
    }

    /**
     * Gets the converter matching the conversion types.
     * @param sourceType The source conversion type.
     * @param targetType The target conversion type.
     * @param primitive Flag indicating if primitive types are allowed.
     * @return The converter.
     */
    static final <S,T> DynamoDBTypeConverter<S,T> of(final Class<S> sourceType, final Class<T> targetType, final boolean primitive) {
        if (targetType.isEnum()) {
            return (DynamoDBTypeConverter<S,T>)new StringToEnum(targetType);
        }
        for (final StandardTypeConverters c : StandardTypeConverters.values()) {
            if (c.isAssignableFrom(sourceType, targetType, primitive)) {
                return c.converter();
            }
        }
        throw new DynamoDBMappingException("unsupported " + sourceType + " to " + targetType);
    }

    /**
     * {@link Enum} converter.
     */
    static final class StringToEnum<T extends Enum<T>> implements DynamoDBTypeConverter<String,T> {
        private final Class<T> targetType;
        public StringToEnum(final Class<T> targetType) {
            if (!targetType.isEnum()) {
                throw new DynamoDBMappingException("unsupported " + targetType + "; expected Enum");
            }
            this.targetType = targetType;
        }
        @Override
        public final String convert(final T object) {
            return object.name();
        }
        @Override
        public final T unconvert(final String object) {
            return Enum.valueOf(targetType, object);
        }
    }

}
