/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to describe a classes known sub-types along with a string-identifier
 * for those types that is persisted to the Dynamo table and allows the sub-type information
 * to be persisted at save and retrieved at load time.
 * <p>
 * This annotation is inherited by subclasses, and can be overridden by them as
 * well.
 *
 * Example usage:
 * <pre class="brush: java">
 * &#064;DynamoDBSubTyped({
 *  &#064;SubType(name = "firstSubType", value = FirstSubType.class),
 *  &#064;SubType(name = "secondSubType", value = SecondSubType.class)
 * })
 * class BaseClass { }
 *
 * class FirstSubType extends BaseClass { }
 * class SecondSubType extends BaseClass { }
 * </pre>
 * <p>
 * By default the type name is stored in a String field in Dynamo called "_type"; this can be customized by providing the "attributeName"
 * property to the &#064;DynamoDBSubTyped annotation. This attribute can refer to an attribute already on the object if it doesn't exist
 * as a property of the object it will be created. It must be of type java.lang.String.
 */

@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface DynamoDBSubTyped {

    SubType[] value();

    String attributeName() default "_type";

    @interface SubType {

        Class<?> value();

        String name();
    }
}
