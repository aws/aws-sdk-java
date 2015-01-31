/*
 * Copyright 2014-2015 Amazon Technologies, Inc.
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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.*;

/**
 * An unmarshaller that unmarshals sets of UUIDs as sets of
 * Java {@code UUID} objects.
 * 
 * @author Sergei Egorov
 */
public class UUIDSetUnmarshaller extends SSUnmarshaller {

    private static final UUIDSetUnmarshaller INSTANCE =
            new UUIDSetUnmarshaller();

    public static UUIDSetUnmarshaller instance() {
        return INSTANCE;
    }

    private UUIDSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        Set<UUID> result = new HashSet<UUID>();

        for (String s : value.getSS()) {
            result.add(UUID.fromString(s));
        }

        return result;
    }
}
