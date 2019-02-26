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

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMappingException;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * An unmarshaller that unmarshals DynamoDB Bools (or Numbers) into Java
 * {@code Boolean}s. Numbers are handled for backwards compatibility with
 * versions of the mapper written before the DynamoDB native Boolean type
 * was added, which stored Java {@code Boolean}s as either the Number 0 (false)
 * or 1 (true).
 */
public class BooleanUnmarshaller implements ArgumentUnmarshaller {

    private static final BooleanUnmarshaller INSTANCE =
            new BooleanUnmarshaller();

    public static BooleanUnmarshaller instance() {
        return INSTANCE;
    }

    private BooleanUnmarshaller() {
    }

    @Override
    public void typeCheck(AttributeValue value, Method setter) {
        if (value.getN() == null && value.getBOOL() == null) {
            throw new DynamoDBMappingException(
                    "Expected either N or BOOL in value " + value
                    + " when invoking " + setter);
        }
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        if (value.getBOOL() != null) {
            return value.getBOOL();
        }
        if ("1".equals(value.getN())) {
            return Boolean.TRUE;
        }
        if ("0".equals(value.getN())) {
            return Boolean.FALSE;
        }

        throw new IllegalArgumentException(
                "Expected '1', '0', or BOOL value for boolean value, was "
                + value);
    }
}
