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
package com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers;

import java.text.ParseException;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.ItemConverter;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class ObjectUnmarshaller extends MUnmarshaller {

    private static final ObjectUnmarshaller INSTANCE = new ObjectUnmarshaller();

    public static ObjectUnmarshaller instance() {
        return INSTANCE;
    }

    private final ItemConverter converter;
    private final Class<?> clazz;

    private ObjectUnmarshaller() {
        converter = null;
        clazz = null;
    }

    public ObjectUnmarshaller(ItemConverter converter, Class<?> clazz) {
        if (converter == null) {
            throw new NullPointerException("converter");
        }
        if (clazz == null) {
            throw new NullPointerException("clazz");
        }

        this.converter = converter;
        this.clazz = clazz;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        Map<String, AttributeValue> map = value.getM();
        return converter.unconvert(clazz, map);
    }
}
