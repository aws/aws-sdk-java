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

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to override the standard attribute type binding.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.S)
 * public MyObject getMyObject()
 * </pre>

 * <p><b>Standard Types</b></p>
 * <p>Standard types do not require the annotation if applying the default
 * attribute binding for that type.</p>
 * <p>String/{@code S} types,</p>
 * <ul>
 *     <li>{@link java.lang.Character}/{@code char}</li>
 *     <li>{@link java.lang.String}</li>
 *     <li>{@link java.net.URL}</li>
 *     <li>{@link java.net.URI}</li>
 *     <li>{@link java.util.Calendar}</li>
 *     <li>{@link java.util.Currency}</li>
 *     <li>{@link java.util.Date}</li>
 *     <li>{@link java.util.Locale}</li>
 *     <li>{@link java.util.TimeZone}</li>
 *     <li>{@link java.util.UUID}</li>
 *     <li>{@link S3Link}</li>
 * </ul>
 * <p>Number/{@code N} types,</p>
 * <ul>
 *     <li>{@link java.math.BigDecimal}</li>
 *     <li>{@link java.math.BigInteger}</li>
 *     <li>{@link java.lang.Boolean}/{@code boolean}</li>
 *     <li>{@link java.lang.Byte}/{@code byte}</li>
 *     <li>{@link java.lang.Double}/{@code double}</li>
 *     <li>{@link java.lang.Float}/{@code float}</li>
 *     <li>{@link java.lang.Integer}/{@code int}</li>
 *     <li>{@link java.lang.Long}/{@code long}</li>
 *     <li>{@link java.lang.Short}/{@code short}</li>
 * </ul>
 * <p>Binary/{@code B} types,</p>
 * <ul>
 *     <li>{@link java.nio.ByteBuffer}</li>
 *     <li>{@code byte[]}</li>
 * </ul>
 *
 * <p><b>{@link DynamoDBTypeConverter}</b></p>
 * <p>A custom type-converter maybe applied to any attribute, either by
 * annotation or by overriding the standard type-converter factory.</p>
 * <pre class="brush: java">
 * DynamoDBMapperConfig config = DynamoDBMapperConfig.builder()
 *     .withTypeConverterFactory(DynamoDBTypeConverterFactory.standard().override()
 *         .with(String.class, MyObject.class, new StringToMyObjectConverter())
 *         .build())
 *     .build();
 * </pre>
 * <p>If the converter being applied is already a supported data type and
 * the conversion is of the same attribute type, for instance,
 * {@link java.util.Date} to {@link String} to {@code S},
 * the annotation may be omited. The annotation is require for all non-standard
 * types or if the attribute type binding is being overriden.</p>
 *
 * <p><b>{@link com.amazonaws.services.dynamodbv2.model.AttributeValue}</b></p>
 * <p>Direct native conversion is supported by default in all schemas.
 * If the attribute is a primary or index key, it must specify either
 * {@code B}, {@code N}, or {@code S}, otherwise, it may be omited.</p>
 *
 * <p><b>{@link Boolean} to {@code BOOL}</b></p>
 * <p>The standard V2 conversion schema will by default serialize booleans
 * natively using the DynamoDB {@code BOOL} type.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.BOOL)
 * public boolean isTesting()
 * </pre>
 *
 * <p><b>{@link Boolean} to {@code N}</b></p>
 * <p>The standard V1 and V2 compatible conversion schemas will by default
 * serialize booleans using the DynamoDB {@code N} type, with a value of '1'
 * representing 'true' and a value of '0' representing 'false'.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.N)
 * public boolean isTesting()
 * </pre>
 *
 * <p><b>{@link Enum} to {@code S}</b></p>
 * <p>The {@code enum} type is only supported by override or custom converter.
 * There are some risks in distributed systems when using enumerations as
 * attributes intead of simply using a String. When adding new values to the
 * enumeration, the enum only changes must deployed before the enumeration
 * value can be persisted. This will ensure that all systems have the correct
 * code to map it from the item record in DynamoDB to your objects.</p>
 * <pre class="brush: java">
 * public enum Status { OPEN, PENDING, CLOSED };
 *
 * &#064;DynamoDBTyped(DynamoDBAttributeType.S)
 * public Status getStatus()
 * </pre>
 *
 * <p><b>{@link UUID} to {@code B}</b></p>
 * <p>The {@code UUID} type will serialize to {@link String}/{@code S} by
 * default in all conversion schemas. The schemas do support serializing to
 * {@link ByteBuffer}/{@code B} by override.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.B)
 * public UUID getKey()
 * </pre>
 *
 * <p><b>{@link Set} to {@code L}</b></p>
 * <p>The standard V1 and V2 compatible conversion schemas do not by default
 * support non-scalar {@code Set} types. They are supported in V2.  In
 * non-supported schemas, the {@link List}/{@code L} override may be applied
 * to any {@code Set} type.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.L)
 * public Set&lt;MyObject&gt; getMyObjects()
 * </pre>
 *
 * <p><b>{@link Object} to {@code M}</b></p>
 * <p>Also supported as {@link DynamoDBDocument}.</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.M)
 * public MyObject getMyObject()
 * </pre>
 *
 * <p>May be combined with {@link DynamoDBTypeConverted}.</p>
 *
 * <p>May be used as a meta-annotation.</p>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverterFactory
 */
@DynamoDB
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBTyped {

    /**
     * Use when the type of the attribute as stored in DynamoDB should differ
     * from the standard type assigned by DynamoDBMapper.
     */
    DynamoDBAttributeType value() default DynamoDBAttributeType.NULL;

}
