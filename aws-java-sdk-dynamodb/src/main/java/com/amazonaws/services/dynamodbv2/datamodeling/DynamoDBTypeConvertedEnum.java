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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to convert the enumeration value to a string.
 *
 * Please note, there are some risks in distributed systems when using
 * enumerations as attributes intead of simply using a String.
 * When adding new values to the enumeration, the enum only changes must
 * be deployed before the enumeration value can be persisted. This will
 * ensure that all systems have the correct code to map it from the item
 * record in DynamoDB to your objects.
 *
 * A minimal example using getter annotations,
 * <pre class="brush: java">
 * &#064;DynamoDBTable(tableName=&quot;TestTable&quot;)
 * public class TestClass {
 *     public static enum Status { OPEN, PENDING, CLOSED }
 *
 *     private String key;
 *     private Status status;
 *
 *     &#064;DynamoDBHashKey
 *     public String getKey() { return key; }
 *     public void setKey(String key) { this.key = key; }
 *
 *     &#064;DynamoDBTypeConvertedEnum
 *     public Status getStatus() { return status; }
 *     public void setStatus(Date status) { this.status = status; }
 * }
 * </pre>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
 */
@DynamoDBTypeConverted(converter=DynamoDBTypeConvertedEnum.Converter.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBTypeConvertedEnum {

    /**
     * Enumeration type converter.
     */
    static final class Converter<T extends Enum<T>> implements DynamoDBTypeConverter<String,T> {
        private final DynamoDBTypeConverter<String,T> converter;

        public Converter(final Class<T> targetType, final DynamoDBTypeConvertedEnum annotation) {
            this.converter = StandardTypeConverters.converter(String.class, targetType);
        }

        @Override
        public final String convert(final T object) {
            return converter.convert(object);
        }

        @Override
        public final T unconvert(final String object) {
            return converter.unconvert(object);
        }
    }

}
