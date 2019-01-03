/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.adapters.types;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class StringToInputStreamAdapterTest {

    private final StringToInputStreamAdapter adapter = new StringToInputStreamAdapter();

    @Test
    public void nullString_ReturnsNullInputStream() {
        assertNull(adapter.adapt(null));
    }

    @Test
    public void emptyString_ReturnsEmptyInputStream() throws IOException {
        InputStream inputStream = adapter.adapt("");
        assertEquals(-1, inputStream.read());
    }

    @Test
    public void nonEmptyString_ReturnsNonEmptyInputStream() throws IOException {
        String source = "foo";
        InputStream inputStream = adapter.adapt(source);
        byte[] bytes = new byte[3];
        inputStream.read(bytes);
        assertArrayEquals(bytes, source.getBytes());
    }

}
