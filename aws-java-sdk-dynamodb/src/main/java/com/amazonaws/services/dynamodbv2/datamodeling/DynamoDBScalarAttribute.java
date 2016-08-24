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

import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to override the standard scalar type conversion.
 *
 * <p>A minimal example using getter annotations,</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTable(tableName=&quot;TestTable&quot;)
 * public class TestClass {
 *     private UUID key;
 *     private Locale locale;
 *
 *     &#064;DynamoDBHashKey
 *     &#064;DynamoDBScalarAttribute(type=ScalarAttributeType.B)
 *     public UUID getKey() { return this.key; }
 *     public void setKey(UUID key) { this.key = key; }
 *
 *     &#064;DynamoDBScalarAttribute(type=ScalarAttributeType.S)
 *     public Locale getLocale() { return this.locale; }
 *     public void setLocale(Locale locale) { this.locale = locale; }
 * }
 * </pre>
 *
 * <p>Here we are overriding the standard {@link java.util.UUID} type conversion
 * to {@link java.nio.ByteBuffer} rather than the default {@link String}.</p>
 *
 * <p>Please note, the conversion function needs to be present in the
 * type-converter factory.</p>
 *
 * <p>To add or override scalar type-conversions,</p>
 * <pre class="brush: java">
 * final DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();

 * final DynamoDBTypeConverterFactory.OverrideFactory factory = builder.newTypeConverterFactory();
 * factory.with(String.class, Locale.class, new DynamoDBTypeConverter&lt;String,Locale&gt;() {
 *     public String convert(Locale object) {
 *         return object.toLanguageTag();
 *     }
 *     public Locale unconvert(final String object) {
 *         return Locale.forLanguageTag(object);
 *     }
 * });
 *
 * final DynamoDBMapperConfig config = builder.build();
 * </pre>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
 * @see com.amazonaws.services.dynamodbv2.model.ScalarAttributeType
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBScalarAttribute {

    /**
     * The scalar attirbute type.
     * @see com.amazonaws.services.dynamodbv2.model.ScalarAttributeType
     */
    ScalarAttributeType type();

}
