/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class IdempotentUtilsTest {

    @Test
    public void resolveString_returns_givenString_when_nonnullString_is_passed() {
        String idempotencyToken = "120c7d4a-e982-4323-a53e-28989a0a9f26";
        assertEquals(idempotencyToken, IdempotentUtils.resolveString(idempotencyToken));
    }

    @Test
    public void resolveString_returns_emptyString_when_emptyString_is_passed() {
        String idempotencyToken = "";
        assertEquals(idempotencyToken, IdempotentUtils.resolveString(idempotencyToken));
    }

    @Test
    public void resolveString_returns_newUniqueToken_when_nullString_is_passed() {
        assertNotNull(IdempotentUtils.resolveString(null));
    }
}
