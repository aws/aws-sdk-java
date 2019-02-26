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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void tryParseInt_ValidInt_ReturnsValidInteger() {
        assertIntEquals(7, NumberUtils.tryParseInt("7"));
    }

    @Test
    public void tryParseInt_InvalidInt_ReturnsNull() {
        assertNull(NumberUtils.tryParseInt("seven"));
    }

    @Test
    public void tryParseInt_NullString_ReturnsNull() {
        assertNull(NumberUtils.tryParseInt(null));
    }

    @Test
    public void tryParseInt_EmptyString_ReturnsNull() {
        assertNull(NumberUtils.tryParseInt(""));
    }

    public static void assertIntEquals(int expected, Integer actual) {
        assertEquals(Integer.valueOf(expected), actual);
    }

}
