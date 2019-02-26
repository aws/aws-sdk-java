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
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMappingException;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that delegates to an instance of a
 * {@code DynamoDBMarshalling}-derived custom marshaler.
 */
public class CustomMarshaller implements StringAttributeMarshaller {

    private final Class<? extends DynamoDBMarshaller<?>> marshallerClass;

    public CustomMarshaller(
            Class<? extends DynamoDBMarshaller<?>> marshallerClass) {

        this.marshallerClass = marshallerClass;
    }

    @Override
    public AttributeValue marshall(Object obj) {

        // TODO: Would be nice to cache this object, but not sure if we can
        // do that now without a breaking change; user's marshalers might
        // not all be thread-safe.

        DynamoDBMarshaller<Object> marshaler =
                createMarshaller(marshallerClass);

        String stringValue = marshaler.marshall(obj);

        if (stringValue == null) {
            return null;
        } else {
            return new AttributeValue(stringValue);
        }
    }

    @SuppressWarnings("unchecked")
    private static DynamoDBMarshaller<Object> createMarshaller(Class<?> clazz) {
        try {

            return (DynamoDBMarshaller<Object>) clazz.newInstance();

        } catch (InstantiationException e) {
            throw new DynamoDBMappingException(
                    "Failed to instantiate custom marshaler for class " + clazz,
                    e);

        } catch (IllegalAccessException e) {
            throw new DynamoDBMappingException(
                    "Failed to instantiate custom marshaler for class " + clazz,
                    e);
        }
    }
}
