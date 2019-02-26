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

import java.lang.reflect.Method;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * The concrete realization of a strategy for converting between Java objects
 * and DynamoDB AttributeValues. Typically created by a
 * {@link ConversionSchema}.
 */
public interface ItemConverter {
    /**
     * Returns the metadata (e.g. name, type) of the DynamoDB attribute that the
     * return value of the given getter will be converted to.
     *
     * @param getter the getter method to inspect
     * @return the metadata of the DynamoDB attribute that the result of the
     *         getter will be converted to
     */
    DynamoDBMapperFieldModel getFieldModel(Method getter);

    /**
     * Converts a Java object into a DynamoDB AttributeValue. Potentially able
     * to handle both scalar and complex types.
     *
     * @param getter the getter that returned the value to be converted
     * @param value the value to be converted
     * @return the converted AttributeValue
     */
    AttributeValue convert(Method getter, Object value);

    /**
     * Converts an appropriately-annotated POJO into a Map of AttributeValues.
     *
     * @param value the POJO to convert
     * @return the resulting map of attribute values
     */
    Map<String, AttributeValue> convert(Object value);

    /**
     * Reverses the {@link #convert(Method, Object)} method, turning a
     * DynamoDB AttributeValue back into a Java object suitable for passing
     * to the given setter.
     *
     * @param getter the getter for the value to be unconverted
     * @param setter the setter for the value to be unconverted
     * @param value the attribute value to be unconverted
     * @return the unconverted Java object
     */
    Object unconvert(Method getter, Method setter, AttributeValue value);

    /**
     * Reverses the {@link #convert(Object)} method, turning a map of attribute
     * values back into a POJO of the given class.
     *
     * @param <T> the compile-time type of the object to create
     * @param clazz the runtime type of the object to create
     * @param values the the map of attribute values to unconvert
     * @return the unconverted POJO
     */
    <T> T unconvert(Class<T> clazz, Map<String, AttributeValue> values);
}
