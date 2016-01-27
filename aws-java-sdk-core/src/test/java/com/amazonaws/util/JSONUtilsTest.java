/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.amazonaws.util.json.JSONUtils;

/**
 * Unit tests for the StringUtils class.
 */
public class JSONUtilsTest {

    /**
     * Tests that {@link JSONUtils#toObject(Class, String)} correctly
     * transforms a JSON string into an instantiated object.
     */
    @Test
    public void testFromJSONToObject() throws JSONException {
        Foo expectedObject = getRandomFoo();
        String json;
        json = fooToString(expectedObject);
        Foo parsedObject = JSONUtils.toObject(Foo.class, json);

        assertTrue(expectedObject.equals(parsedObject));
    }

    public class Foo {
        public boolean booleanField;
        public double doubleField;
        public int intField;
        public long longField;
        public String stringField;
        public char charField;
        public int[] arrayField;
        public Bar nestedObjectField;

        public class Bar {
            public int intField;
            public boolean equals(Bar other) {
                return intField == other.intField;
            }
        }

        public boolean equals(Foo other) {
            if (booleanField != other.booleanField)
                return false;
            if (doubleField != other.doubleField)
                return false;
            if (intField != other.intField)
                return false;
            if (longField != other.longField)
                return false;
            if (!stringField.equals(other.stringField))
                return false;
            if (charField != other.charField)
                return false;
            if (!Arrays.equals(arrayField, other.arrayField))
                return false;
            if (!nestedObjectField.equals(other.nestedObjectField))
                return false;
            return true;
        }
    }

    private Foo getRandomFoo() {
        Random random = new Random();
        Foo foo = new Foo();
        foo.booleanField = random.nextBoolean();
        foo.doubleField = random.nextDouble();
        foo.intField = random.nextInt();
        foo.longField = random.nextLong();
        foo.stringField = UUID.randomUUID().toString();
        int MIN_CHAR = 32;
        int MAX_CHAR = 126;
        foo.charField = (char) (MIN_CHAR + random.nextInt(MAX_CHAR - MIN_CHAR));
        int arrayLength = random.nextInt(20);
        foo.arrayField = new int[arrayLength];
        foo.nestedObjectField = foo.new Bar();
        foo.nestedObjectField.intField = random.nextInt();
        return foo;
    }

    private static String fooToString(Foo foo) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("booleanField", foo.booleanField);
        jsonObject.put("doubleField", foo.doubleField);
        jsonObject.put("intField", foo.intField);
        jsonObject.put("longField", foo.longField);
        jsonObject.put("stringField", foo.stringField);
        jsonObject.put("charField", "" + foo.charField);

        JSONArray arrayObject = new JSONArray();
        for (int i = 0; i < foo.arrayField.length; i++)
            arrayObject.put(i, foo.arrayField[i]);
        jsonObject.put("arrayField", arrayObject);

        JSONObject nestedJSONObject = new JSONObject();
        nestedJSONObject.put("intField", foo.nestedObjectField.intField);
        jsonObject.put("nestedObjectField", nestedJSONObject);

        return jsonObject.toString();

    }

}
