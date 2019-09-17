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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * A simple JSON converter that uses the Jackson JSON processor.
 *
 * <p>It shares all limitations of that library. For more information about
 * Jackson, see: http://wiki.fasterxml.com/JacksonHome</p>
 *
 * <pre class="brush: java">
 * &#064;DynamoDBTypeConvertedJson
 * public Currency getCurrency()
 * </pre>
 *
 * <p>Where,</p>
 * <pre class="brush: java">
 * public class Currency {
 *     private Double amount;
 *     private String unit;
 *
 *     public Double getAmount() { return amount; }
 *     public void setAmount(Double amount) { this.amount = amount; }
 *
 *     public String getUnit() { return unit; }
 *     public void setUnit(String unit) { this.unit = unit; }
 * }
 * </pre>
 *
 * <p>Would write the following value to DynamoDB given,</p>
 * <ul>
 *     <li><code>Currency(79.99,"USD")</code> = <code> "{\"amount\":79.99,\"unit\":\"USD\"}"</code></li>
 * </ul>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
 */
@DynamoDBTypeConverted(converter=DynamoDBTypeConvertedJson.Converter.class)
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBTypeConvertedJson {

    /**
     * The value type to use when calling the JSON mapper's {@code readValue};
     * a value of {@code Void.class} indicates to use the getter's type.
     */
    Class<? extends Object> targetType() default void.class;

    /**
     * JSON type converter.
     */
    final class Converter<T> implements DynamoDBTypeConverter<String,T> {
        private static final ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        private final Class<T> targetType;

        public Converter(Class<T> targetType, DynamoDBTypeConvertedJson annotation) {
            this.targetType = annotation.targetType() == void.class ? targetType : (Class<T>)annotation.targetType();
        }

        @Override
        public final String convert(final T object) {
            try {
                return mapper.writeValueAsString(object);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Unable to write object to JSON", e);
            }
        }

        @Override
        public final T unconvert(final String object) {
            try {
                return mapper.readValue(object, targetType);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Unable to read JSON string", e);
            }
        }
    }

}
