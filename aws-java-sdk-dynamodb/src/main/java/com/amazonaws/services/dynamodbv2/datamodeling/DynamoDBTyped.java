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

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to override the standard scalar type conversion.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.S)
 * public Locale getLocale()
 * </pre>
 *
 * <p>System-supported overrides include:</p>
 *
 * <p>{@link UUID} to {@code B},</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.B)
 * public UUID getKey()
 * </pre>
 *
 * <p>{@link Enum} to {@code S},
 * <br/>There are some risks in distributed systems when using enumerations as
 * attributes intead of simply using a String. When adding new values to the
 * enumeration, the enum only changes must deployed before the enumeration
 * value can be persisted. This will ensure that all systems have the correct
 * code to map it from the item record in DynamoDB to your objects.</p>
 * <pre class="brush: java">
 * public enum Status { OPEN, PENDING, CLOSED };
 *
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.S)
 * public Status getStatus()
 * </pre>
 *
 * <p>{@link Boolean} to {@code BOOL},
 * <br/>The standard V2 conversion schema will by default serialize booleans
 * natively using the DynamoDB {@code BOOL} type.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.BOOL)
 * public boolean isTesting()
 * </pre>
 *
 * <p>{@link Boolean} to {@code NS},
 * <br/>The standard V1 and V2 compatible conversion schemas will by default
 * serialize booleans using the DynamoDB {@code N} type, with a value of '1'
 * representing 'true' and a value of '0' representing 'false'.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.N)
 * public boolean isTesting()
 * </pre>
 *
 * <p>{@link Object} to {@code M},
 * <br/>Previously supported as {@link DynamoDBDocument}.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(type=DynamoDBAttributeType.M)
 * public MyCustomObject getMyCustomObject()
 * </pre>
 *
 * <p>For custom conversions, additionally, override the type-converter factory,</p>
 * <pre class="brush: java">
 * return DynamoDBMapperConfig.builder()
 *     .withTypeConverterFactory(DynamoDBTypeConverterFactory.standard().override()
 *         .with(String.class, Locale.class, new StringToLocaleConverter())
 *         .with(String.class, DateTime.class, new StringToDateTimeConverter())
 *         .with(String.class, LocalDateTime.class, new StringToLocalDateTimeConverter())
 *         .build())
 *     .build();
 * </pre>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBTyped {

    /**
     * Use when the type of the attribute as stored in DynamoDB should differ
     * from the standard type assigned by DynamoDBMapper.
     *
     * The value {@link DynamoDBAttributeType#NULL} indicates that the type is
     * not is not always known. This may be used when the value type is
     * {@link com.amazonaws.services.dynamodbv2.model.AttributeValue}.  When
     * using this direct native conversion, and the attribute is either a
     * primary or index key, the attribute type must be specified as either
     * {@code B}, {@code N}, or {@code S}.
     *
     * @see DynamoDBMapperFieldModel.DynamoDBAttributeType
     */
    DynamoDBAttributeType value() default DynamoDBAttributeType.NULL;

}
