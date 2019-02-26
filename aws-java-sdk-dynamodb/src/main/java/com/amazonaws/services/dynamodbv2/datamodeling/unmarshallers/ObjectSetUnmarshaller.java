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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMappingException;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class ObjectSetUnmarshaller extends LUnmarshaller {

    private static final ObjectSetUnmarshaller INSTANCE =
            new ObjectSetUnmarshaller();

    public static ObjectSetUnmarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentUnmarshaller memberUnmarshaller;

    private ObjectSetUnmarshaller() {
        memberUnmarshaller = null;
    }

    public ObjectSetUnmarshaller(ArgumentUnmarshaller memberUnmarshaller) {
        if (memberUnmarshaller == null) {
            throw new NullPointerException("memberUnmarshaller");
        }
        this.memberUnmarshaller = memberUnmarshaller;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        List<AttributeValue> values = value.getL();

        // As in the LinkedHashSet(Collection) constructor.
        int size = Math.max(values.size() * 2, 11);
        Set<Object> objects =  new LinkedHashSet<Object>(size);

        for (AttributeValue v : values) {
            memberUnmarshaller.typeCheck(v, null);
            Object o = memberUnmarshaller.unmarshall(v);
            if (!objects.add(o)) {
                throw new DynamoDBMappingException(
                        "Duplicate value (" + o + ") found in " + values);
            }
        }

        return objects;
    }
}
