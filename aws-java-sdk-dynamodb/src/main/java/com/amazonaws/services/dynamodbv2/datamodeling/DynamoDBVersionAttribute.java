/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Annotation for marking a property as an optimistic locking version attribute.
 *
 * <p>Applied to the getter method or the class field for the class's version
 * property. If the annotation is applied directly to the class field, the
 * corresponding getter and setter must be declared in the same class.
 *
 * <p>Alternately, the meta-annotation {@link DynamoDBVersioned} may be used
 * to annotate a custom annotation, or directly to the field/getter.</p>
 *
 * <p>Only nullable, integral numeric types (e.g. Integer, Long) can be used as
 * version properties. On a save() operation, the {@link DynamoDBMapper} will
 * attempt to increment the version property and assert that the service's value
 * matches the client's. New objects will be assigned a version of 1 when saved.
 * <p>
 * Note that for batchWrite, and by extension batchSave and batchDelete, <b>no
 * version checks are performed</b>, as required by the
 * {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
 * API.
 *
 * <p>Note that for transactionWrite, <b>no version checks are performed</b>.
 * An {@link com.amazonaws.SdkClientException} exception is thrown, if class of
 * any input object is annotated with {@link DynamoDBVersionAttribute}.</p>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBVersioned
 */
@DynamoDB
@DynamoDBVersioned
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBVersionAttribute {

    /**
     * Optional parameter when the name of the attribute as stored in DynamoDB
     * should differ from the name used by the getter / setter.
     */
    String attributeName() default "";

}
