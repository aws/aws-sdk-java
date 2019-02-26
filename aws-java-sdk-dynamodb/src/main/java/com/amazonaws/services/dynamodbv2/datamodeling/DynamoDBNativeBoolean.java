/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An annotation that marks a {@code boolean} or {@code Boolean} attribute
 * of a modeled class which should be serialized as a DynamoDB BOOL. For
 * backwards compatibility with old versions of the {@code DynamoDBMapper},
 * by default booleans are serialized using the DynamoDB N type, with a value
 * of '1' representing 'true' and a value of '0' representing 'false'.
 * <p/>
 * Using this annotation on the field definition or getter method definition
 * for the attribute will cause it to be serialized as DynamoDB-native BOOL
 * type. Old versions of the {@code DynamoDBMapper} which do not know about the
 * BOOL type will be unable to read items containing BOOLs, so don't use me
 * unless all readers of your table are using an updated version of the mapper.
 *
 * @deprecated - Replaced by {@link DynamoDBTyped}
 */
@Deprecated
@DynamoDB
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.BOOL)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBNativeBoolean {
}
