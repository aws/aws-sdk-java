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

import org.junit.Test;

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

}
