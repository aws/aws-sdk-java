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

/**
 * Interface for converting types.
 *
 * @param <S> The DynamoDB standard type.
 * @param <T> The object's field/property type.
 */
public interface DynamoDBTypeConverter<S extends Object, T extends Object> {

    /**
     * Turns an object of type T into an object of type S.
     */
    S convert(T object);

    /**
     * Turns an object of type S into an objext of type T.
     */
    T unconvert(S object);

}
