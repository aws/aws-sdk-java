/*
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
}
