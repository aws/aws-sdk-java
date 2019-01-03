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
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import org.junit.Test;

public class IOUtilsTest {

    private final Random random = new Random();

    @Test
    public void testEmptyByteArray() throws Exception {
        String s = IOUtils.toString(new ByteArrayInputStream(new byte[0]));
        assertEquals("", s);
    }

    @Test
    public void testZeroByteStream() throws Exception {
        String s = IOUtils.toString(new InputStream() {
            @Override
            public int read() throws IOException {
                return -1;
            }
        });
        assertEquals("", s);
    }

    @Test
    public void test() throws Exception {
        String s = IOUtils.toString(new ByteArrayInputStream("Testing".getBytes(StringUtils.UTF8)));
        assertEquals("Testing", s);
    }

    @Test
    public void drainInputStream_AlreadyEos_DoesNotThrowException() throws IOException {
        final InputStream inputStream = randomInputStream();
        while (inputStream.read() != -1) {
        }
        IOUtils.drainInputStream(inputStream);
    }

    @Test
    public void drainInputStream_RemainingBytesInStream_ReadsAllRemainingData() throws IOException {
        final InputStream inputStream = randomInputStream();
        IOUtils.drainInputStream(inputStream);
        assertEquals(-1, inputStream.read());
    }

    private InputStream randomInputStream() {
        byte[] data = new byte[100];
        random.nextBytes(data);
        return new ByteArrayInputStream(data);
    }
}
