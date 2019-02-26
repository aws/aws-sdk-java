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

import static org.junit.Assert.*;

import org.junit.Test;

public class SystemDefaultDnsResolverTest {

    @Test
    public void testResolveLocalhost() throws Exception {
        DnsResolver resolver = new SystemDefaultDnsResolver();
        assertNotNull(resolver.resolve("127.0.0.1"));
        assertEquals("Should resolve to 1 address", 1, resolver.resolve("127.0.0.1").length);
        assertTrue("Should resolve localhost",  resolver.resolve("localhost").length > 0);
    }
}
