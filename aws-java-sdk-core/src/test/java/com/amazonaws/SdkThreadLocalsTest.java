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
package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.amazonaws.internal.SdkThreadLocalsRegistry;
import org.junit.Test;

public class SdkThreadLocalsTest {

    @Test
    public void testOneThreadLocalRemoved() {
        ThreadLocal<Integer> t = new ThreadLocal<Integer>();
        t.set(1);
        SdkThreadLocalsRegistry.register(t);
        assertEquals(1, (int) t.get());
        SdkThreadLocals.remove();
        assertNull(t.get());
    }

    @Test
    public void testMultipleThreadLocalsRemoved() {
        ThreadLocal<Integer> t1 = new ThreadLocal<Integer>();
        t1.set(1);
        ThreadLocal<Integer> t2 = new ThreadLocal<Integer>();
        t2.set(1);
        SdkThreadLocalsRegistry.register(t1);
        SdkThreadLocalsRegistry.register(t2);
        assertEquals(1, (int) t1.get());
        assertEquals(1, (int) t2.get());
        SdkThreadLocals.remove();
        assertNull(t1.get());
        assertNull(t2.get());
    }

}