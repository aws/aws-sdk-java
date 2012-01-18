/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
package com.amazonaws.services.dynamodb.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;


/**
 * Annotation to mark a property as using a custom marshaller. This is required
 * when storing anything other than {@link String}s, {@link Number}s, and
 * {@link Set}s of the same to DynamoDB. Any object that can be converted into a
 * String representation and vice versa can be saved in this manner.
 * 
 * @see DynamoDBMarshaller
 * @see JsonMarshaller
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DynamoDBMarshalling {

    /**
     * The class of the Marshaller that converts this property to and from a
     * String.
     */
    Class<? extends DynamoDBMarshaller<? extends Object>> marshallerClass();
}
