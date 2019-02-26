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

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMappingException;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A special unmarshaller for Set&lt;Boolean>, which the V1 schema stores as
 * an NS using 0/1 for true/false. In the V2 schema these fall through to
 * the {@code ObjectSetToListMarshaller} which stores them as an L or BOOLs.
 */
public class BooleanSetUnmarshaller implements ArgumentUnmarshaller {

    private static final BooleanSetUnmarshaller INSTANCE =
            new BooleanSetUnmarshaller();

    public static BooleanSetUnmarshaller instance() {
        return INSTANCE;
    }

    private BooleanSetUnmarshaller() {
    }

    @Override
    public void typeCheck(AttributeValue value, Method setter) {
        if (value.getNS() == null && value.getL() == null) {
            throw new DynamoDBMappingException(
                    "Expected either L or NS in value " + value
                    + " when invoking " + setter);
        }
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        if (value.getL() != null) {
            return unmarshallList(value.getL());
        } else {
            return unmarshallNS(value.getNS());
        }
    }

    private Set<Boolean> unmarshallList(List<AttributeValue> values) {
        Set<Boolean> result = new HashSet<Boolean>();

        for (AttributeValue value : values) {
            Boolean bool;
            if (Boolean.TRUE.equals(value.isNULL())) {
                bool = null;
            } else {
                bool = value.getBOOL();
                if (bool == null) {
                    throw new DynamoDBMappingException(
                            value + " is not a boolean");
                }
            }

            if (!result.add(bool)) {
                throw new DynamoDBMappingException(
                        "Duplicate value (" + bool + ") found in "
                        + values);
            }
        }

        return result;
    }

    private Set<Boolean> unmarshallNS(List<String> values) {
        Set<Boolean> result = new HashSet<Boolean>();

        for (String s : values) {
            if ("1".equals(s)) {
                result.add(Boolean.TRUE);
            } else if ("0".equals(s)) {
                result.add(Boolean.FALSE);
            } else {
                throw new IllegalArgumentException(
                        "Expected '1' or '0' for boolean value, was " + s);
            }
        }

        return result;
    }
}
