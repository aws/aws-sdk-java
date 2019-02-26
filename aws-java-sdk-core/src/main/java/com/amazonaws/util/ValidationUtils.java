/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.util.Collection;

/**
 * Useful utilities to validate dependencies
 */
public class ValidationUtils {

    /**
     * Asserts that the given object is non-null and returns it.
     *
     * @param object
     *         Object to assert on
     * @param fieldName
     *         Field name to display in exception message if null
     * @return Object if non null
     * @throws IllegalArgumentException
     *         If object was null
     */
    public static <T> T assertNotNull(T object, String fieldName) throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException(String.format("%s cannot be null", fieldName));
        }
        return object;
    }

    /**
     * Asserts that all of the objects are null.
     *
     * @throws IllegalArgumentException
     *         if any object provided was NOT null.
     */
    public static void assertAllAreNull(String messageIfNull, Object... objects) throws IllegalArgumentException {
        for (Object object : objects) {
            if (object != null) {
                throw new IllegalArgumentException(messageIfNull);
            }
        }
    }

    /**
     * Asserts that the given number is positive (non-negative and non-zero).
     *
     * @param num       Number to validate
     * @param fieldName Field name to display in exception message if not positive.
     * @return Number if positive.
     */
    public static int assertIsPositive(int num, String fieldName) {
        if (num <= 0) {
            throw new IllegalArgumentException(String.format("%s must be positive", fieldName));
        }
        return num;
    }

    public static <T extends Collection<?>> T assertNotEmpty(T collection, String fieldName) throws IllegalArgumentException{
        assertNotNull(collection, fieldName);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return collection;
    }

    public static <T> T[] assertNotEmpty(T[] array, String fieldName) throws IllegalArgumentException {
        assertNotNull(array, fieldName);
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return array;
    }

    public static String assertStringNotEmpty(String string, String fieldName) throws IllegalArgumentException {
        assertNotNull(string, fieldName);
        if (string.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return string;
    }
}
