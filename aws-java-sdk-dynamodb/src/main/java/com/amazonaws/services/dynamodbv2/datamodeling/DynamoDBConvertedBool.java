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

/**
 * Annotation to convert a {@link Boolean} to the DynamoDB {@code S} type.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBConvertedBool(DynamoDBConvertedBool.Format.Y_N)
 * public boolean isTesting()
 * </pre>
 *
 * <p>The standard V1 and V2 compatible conversion schemas will, by default,
 * serialize booleans using the DynamoDB {@code N} type, with a value of '1'
 * representing 'true' and a value of '0' representing 'false'. To force the
 * {@code N} conversion in other schemas,
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.N)
 * public boolean isTesting()
 * </pre>
 *
 * <p>The standard V2 conversion schema will by default serialize booleans
 * natively using the DynamoDB {@code BOOL} type. To force the native
 * {@code BOOL} conversion in other schemas,
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.BOOL)
 * public boolean isTesting()
 * </pre>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@DynamoDBTypeConverted(converter=DynamoDBConvertedBool.Converter.class)
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBConvertedBool {

    /**
     * Enumeration of the supported format options.
     */
    public static enum Format { true_false, T_F, Y_N };

    /**
     * The format type for converting to and from {@link String}.
     */
    Format value();

    /**
     * Boolean type converter.
     */
    static final class Converter implements DynamoDBTypeConverter<String,Boolean> {
        private final String valueTrue, valueFalse;

        public Converter(Class<Boolean> targetType, DynamoDBConvertedBool annotation) {
            this.valueTrue = annotation.value().name().split("_")[0];
            this.valueFalse = annotation.value().name().split("_")[1];
        }

        @Override
        public final String convert(final Boolean object) {
            return Boolean.TRUE.equals(object) ? valueTrue : valueFalse;
        }

        @Override
        public final Boolean unconvert(final String object) {
            return valueTrue.equals(object) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

}
