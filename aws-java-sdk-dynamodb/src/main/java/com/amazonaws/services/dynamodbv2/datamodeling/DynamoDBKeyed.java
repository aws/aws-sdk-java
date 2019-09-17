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

import com.amazonaws.services.dynamodbv2.model.KeyType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for marking a property a key for a modeled class.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBKeyed(KeyType.HASH)
 * public UUID getKey()
 * </pre>
 *
 * <p>Alternately, the short-formed {@link DynamoDBHashKey}, and
 * {@link DynamoDBRangeKey} may be used directly on the field/getter.</p>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBKeyed {

    /**
     * The primary key type; either {@code HASH} or {@code RANGE}.
     */
    KeyType value();

}
