/*
 * Copyright 2014-2014 Amazon Technologies, Inc.
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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A legacy unmarshaller that unmarshals DynamoDB NumberSets containing only
 * "0" and "1" into a set of Java Booleans (with "0" == false and "1" == true).
 * Retained only for backwards compatibility - DynamoDB does not have a
 * BooleanSet type, and sets of booleans aren't particularly useful anyways.
 */
public class BooleanSetUnmarshaller extends NSUnmarshaller {

    private static final BooleanSetUnmarshaller INSTANCE =
            new BooleanSetUnmarshaller();

    public static BooleanSetUnmarshaller instance() {
        return INSTANCE;
    }

    private BooleanSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        List<String> values = value.getNS();
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
