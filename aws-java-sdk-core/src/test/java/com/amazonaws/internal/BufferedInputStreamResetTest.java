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
package com.amazonaws.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * This test demonstrates why we should call mark(Integer.MAX_VALUE) instead of
 * mark(-1).
 */
public class BufferedInputStreamResetTest {
    @Test
    public void testNeatives() throws IOException {
        testNegative(-1);   // fixed buffer
        testNegative(19);   // 1 byte short
    }

    private void testNegative(final int readLimit) throws IOException {
        byte[] bytes = new byte[100];
        for (int i=0; i < bytes.length; i++)
            bytes[i] = (byte)i;
        // buffer of 10 bytes
        BufferedInputStream bis =
            new BufferedInputStream(new ByteArrayInputStream(bytes), 10);
        // skip 10 bytes
        bis.skip(10);
        bis.mark(readLimit);   // 1 byte short in buffer size
        // read 30 bytes in total, with internal buffer incread to 20
        bis.read(new byte[20]);
        try {
            bis.reset();
            fail();
        } catch(IOException ex) {
            assertEquals("Resetting to invalid mark", ex.getMessage());
        }
    }
 
    @Test
    public void testPositives() throws IOException {
        testPositive(20);   // just enough
        testPositive(Integer.MAX_VALUE);
    }

    private void testPositive(final int readLimit) throws IOException {
        byte[] bytes = new byte[100];
        for (int i=0; i < bytes.length; i++)
            bytes[i] = (byte)i;
        // buffer of 10 bytes
        BufferedInputStream bis =
            new BufferedInputStream(new ByteArrayInputStream(bytes), 10);
        // skip 10 bytes
        bis.skip(10);
        bis.mark(readLimit);   // buffer size would increase up to readLimit
        // read 30 bytes in total, with internal buffer increased to 20
        bis.read(new byte[20]);
        bis.reset();
        assert(bis.read() == 10);
    }
}
