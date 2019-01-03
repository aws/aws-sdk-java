/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to convert a date object ({@link java.util.Date}, {@link java.util.Calendar}, {@link org.joda.time.DateTime})
 * to a {@link com.amazonaws.services.dynamodbv2.model.ScalarAttributeType#N} stored as epoch time.
 *
 * <p>Alternately, the {@link DynamoDBTyped} annotation may be used,</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.N)
 * public Date getDate()
 * </pre>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
 */
@DynamoDB
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.N)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBTypeConvertedEpochDate {
}
