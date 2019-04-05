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

import static com.amazonaws.util.Throwables.failure;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * A simple JSON marshaller that uses the Jackson JSON processor. It shares all limitations of that
 * library. For more information about Jackson, see: http://wiki.fasterxml.com/JacksonHome
 *
 * @deprecated Replaced by {@link DynamoDBTypeConvertedJson}
 */
@Deprecated
public class JsonMarshaller<T extends Object> implements DynamoDBMarshaller<T> {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final ObjectWriter writer = mapper.writer();

    /**
     * The value type.
     */
    private final Class<T> valueType;

    /**
     * Constructs the JSON marshaller instance.
     * @param valueType The value type (for generic type erasure).
     */
    public JsonMarshaller(final Class<T> valueType) {
        this.valueType = valueType;
    }

    /**
     * Constructs the JSON marshaller instance.
     */
    public JsonMarshaller() {
        this(null);
    }

    /**
     * Gets the value type.
     * @return The value type.
     */
    protected final Class<T> getValueType() {
        return this.valueType;
    }

    @Override
    public String marshall(T obj) {

        try {
            return writer.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw failure(e,
                    "Unable to marshall the instance of " + obj.getClass()
                            + "into a string");
        }
    }

    @Override
    public T unmarshall(Class<T> clazz, String json) {
        try {
            return mapper.readValue(json, (getValueType() == null ? clazz : getValueType()));
        } catch (Exception e) {
            throw failure(e, "Unable to unmarshall the string " + json
                    + "into " + clazz);
        }
    }
}
