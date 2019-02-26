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

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ValidationUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void assertNotNull_NullObject_ThrowsException() {
        ValidationUtils.assertNotNull(null, "someField");
    }

    @Test
    public void assertNotNull_NonNullObject_ReturnsSameObject() {
        String nonNullString = "foo";
        assertEquals(nonNullString, ValidationUtils.assertNotNull(nonNullString, "nonNullString"));
    }

    @Test
    public void assertAllAreNull_AllNull_DoesNotThrow() {
        ValidationUtils.assertAllAreNull("foo", null, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertAllAreNull_SomeNull_ThrowsException() {
        ValidationUtils.assertAllAreNull("foo", null, "non-null", null, null);
    }

    @Test
    public void assertAllAreNull_NoneProvided_DoesNotThrow() {
        ValidationUtils.assertAllAreNull("foo");
    }

    @Test
    public void assertIsPositive_PositiveNumber_ReturnsSameNumber() {
        assertEquals(42, ValidationUtils.assertIsPositive(42, "num"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertIsPositive_Zero_ThrowsException() {
        ValidationUtils.assertIsPositive(0, "num");
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertIsPositive_NegativeNumber_ThrowsException() {
        ValidationUtils.assertIsPositive(-9001, "num");
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertStringNotEmpty_NullString_ThrowsException() {
        ValidationUtils.assertStringNotEmpty(null, "someString");
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertStringNotEmpty_EmptyString_ThrowsException() {
        ValidationUtils.assertStringNotEmpty("", "someString");
    }

    @Test
    public void assertStringNotEmpty_NonEmptyString_ReturnsSameString() {
        final String string = "foo";
        assertEquals(string, ValidationUtils.assertStringNotEmpty(string, "someString"));
    }

    @Test
    public void assertNotEmpty_NonNullCollection_ReturnsSameObject() {
        List<String> testList = new ArrayList<String>();
        testList.add("sample");
        assertEquals(testList, ValidationUtils.assertNotEmpty(testList, "testList"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertNotEmpty_NullCollection_ThrowsException() {
        ValidationUtils.assertNotEmpty((Collection<String>) null, "someCollection");
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertNotEmpty_EmptyCollection_ThrowsException() {
        List<String> testList = new ArrayList<String>();
        ValidationUtils.assertNotEmpty(testList, "testList");
    }

    @Test
    public void assertNotEmpty_NonNullArray_ReturnsSameObject() {
        String[] array = new String[]{"foo", "bar"};
        assertArrayEquals(array, ValidationUtils.assertNotEmpty(array, "array"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertNotEmpty_NullArray_ThrowsException() {
        ValidationUtils.assertNotEmpty((String[]) null, "array");
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertNotEmpty_EmptyArray_ThrowsException() {
        ValidationUtils.assertNotEmpty(new String[0], "array");
    }

}
