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

import java.util.HashSet;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * An unmarshaller that unmarshals DynamoDB StringSets as sets of Java
 * {@code String} objects.
 */
public class StringSetUnmarshaller extends SSUnmarshaller {

    private static final StringSetUnmarshaller INSTANCE =
            new StringSetUnmarshaller();

    public static StringSetUnmarshaller instance() {
        return INSTANCE;
    }

    private StringSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        return new HashSet<String>(value.getSS());
    }
}
