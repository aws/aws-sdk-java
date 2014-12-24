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

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * An unmarshaller that unmarshals Lists into Java {@code Sets}.
 */
public class SetUnmarshaller extends LUnmarshaller {

    private static final SetUnmarshaller INSTANCE = new SetUnmarshaller();

    public static SetUnmarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentUnmarshaller memberUnmarshaller;

    private SetUnmarshaller() {
        memberUnmarshaller = null;
    }

    public SetUnmarshaller(ArgumentUnmarshaller memberUnmarshaller) {
        if (memberUnmarshaller == null) {
            throw new NullPointerException("memberUnmarshaller");
        }
        this.memberUnmarshaller = memberUnmarshaller;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        List<AttributeValue> values = value.getL();
        Set<Object> objects = new HashSet(values.size());

        for (AttributeValue v : values) {
            memberUnmarshaller.typeCheck(v, null);
            objects.add(memberUnmarshaller.unmarshall(v));
        }

        return objects;
    }
}
