/*
 * Copyright 2011-2015 Amazon Technologies, Inc.
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

/**
 * Marshaller interface for storing complex types in DynamoDB as Strings.
 * Implementors provide methods to transform instances of a class to and from
 * Strings.
 */
public interface DynamoDBMarshaller<T extends Object> {

    /**
     * Turns an object of type T into its String representation.
     */
    public String marshall(T getterReturnResult);

    /**
     * Turns a String representation of an object of type T into an object.
     */
    public T unmarshall(Class<T> clazz, String obj);
}
