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

import static com.amazonaws.util.LengthCheckInputStream.EXCLUDE_SKIPPED_BYTES;
import static com.amazonaws.util.LengthCheckInputStream.INCLUDE_SKIPPED_BYTES;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.amazonaws.AmazonClientException;

public class LengthCheckInputStreamTest {

    String sampleData = "__________1234567890__________12345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678909876543210";

    /**
     * Tests if the content length set in the stream equals the bytes read from
     * the stream. If any exception is thrown, then the test fails.
     */
    @Test
    public void testContentLength() throws Exception {
        InputStream in = new ByteArrayInputStream(sampleData.getBytes());

        LengthCheckInputStream rvis = new LengthCheckInputStream(in,
                sampleData.getBytes().length, INCLUDE_SKIPPED_BYTES);
        try {
            StreamUtils.consumeInputStream(rvis);
        } catch (Exception e) {
            fail();
        }

        rvis.close();
    }

    /**
     * This test case initiates a mark at the start, reads the first 100 bytes
     * from the stream. Now the stream is reset and it is drained. At the last
     * read, the length validation must be success.
     */
    @Test
    public void testMarkInitiallyAndReset() throws Exception {
        InputStream in = new ByteArrayInputStream(sampleData.getBytes());
        LengthCheckInputStream rvis = new LengthCheckInputStream(in,
                sampleData.getBytes().length, INCLUDE_SKIPPED_BYTES);
        rvis.mark(100);
        rvis.read(new byte[100]);
        rvis.reset();
        rvis.read(new byte[sampleData.getBytes().length]);
        try {
            rvis.read();
        } catch (Exception e) {
            fail();
        }

        rvis.close();
        StreamUtils.consumeInputStream(rvis);

    }

    /**
     * This test case initiates a mark after reading 100 bytes from the stream.
     * Reads the next 100 bytes from the stream. Now the stream is reset and it
     * is drained. At the last read, the length validation must fail because the
     * stream was initialized with wrong expected length.
     */
    @Test
    public void testMarkAndResetWithWrongExpectedLength() throws Exception {
        InputStream in = new ByteArrayInputStream(sampleData.getBytes());
        LengthCheckInputStream rvis = new LengthCheckInputStream(in,
                sampleData.getBytes().length + 1, INCLUDE_SKIPPED_BYTES);

        rvis.read(new byte[100]);
        rvis.mark(100);
        rvis.read(new byte[100]);
        rvis.reset();
        rvis.read(new byte[sampleData.getBytes().length - 100]);
        try {
            rvis.read();
            fail();
        } catch (Exception e) {
            System.out
                    .println("Exception occurred. Message: " + e.getMessage());
        }

        rvis.close();

    }

    /**
     * This test case initiates a marks the stream initially, drains the whole
     * stream. Resets the stream and drains again.
     */
    @Test
    public void testMarkAndResetAtEnd() throws Exception {
        InputStream in = new ByteArrayInputStream(sampleData.getBytes());
        LengthCheckInputStream rvis = new LengthCheckInputStream(in,
                sampleData.getBytes().length, INCLUDE_SKIPPED_BYTES);

        rvis.mark(100);
        StreamUtils.consumeInputStream(rvis);
        rvis.reset();
        StreamUtils.consumeInputStream(rvis);

        try {
            rvis.read();
        } catch (Exception e) {
            fail();
        }
        rvis.close();

    }

    /**
     * Actual number of bytes consumed is exactly what's expected, when
     * skipped bytes are included.
     */
    @Test
    public void testSkipIncluded() throws IOException {
        byte[] bytes = new byte[100];
        InputStream is = new LengthCheckInputStream(
                new ByteArrayInputStream(bytes), 100, INCLUDE_SKIPPED_BYTES);
        assertTrue(10 == is.skip(10));
        StreamUtils.consumeInputStream(is);
        is.close();
    }

    /**
     * Actual number of bytes consumed is more than what's expected, when
     * skipped bytes are included.
     */
    @Test
    public void testSkipIncludedFailure() throws IOException {
        byte[] bytes = new byte[100];
        InputStream is = new LengthCheckInputStream(
                new ByteArrayInputStream(bytes), 90, INCLUDE_SKIPPED_BYTES);
        assertTrue(10 == is.skip(10));
        try {
            StreamUtils.consumeInputStream(is);
            fail();
        } catch(AmazonClientException ex) {
            // expected
        }
        is.close();
    }

    /**
     * Actual number of bytes consumed is exactly what's expected, when skipped
     * bytes are excluded.
     */
    @Test
    public void testSkipExcluded() throws IOException {
        byte[] bytes = new byte[100];
        InputStream is = new LengthCheckInputStream(
                new ByteArrayInputStream(bytes), 90, EXCLUDE_SKIPPED_BYTES);
        assertTrue(10 == is.skip(10));
        StreamUtils.consumeInputStream(is);
        is.close();
    }

    /**
     * Actual number of bytes consumed is less than what's expected, when
     * skipped bytes are excluded.
     */
    @Test
    public void testSkipExcludedFailure() throws IOException {
        byte[] bytes = new byte[100];
        LengthCheckInputStream is = new LengthCheckInputStream(
                new ByteArrayInputStream(bytes), 100, EXCLUDE_SKIPPED_BYTES);
        assertTrue(10 == is.skip(10));
        try {
            StreamUtils.consumeInputStream(is);
            fail();
        } catch(AmazonClientException ex) {
            // expected
        }
        is.close();
    }

    /**
     * Skipped more than what's expected.
     */
    @Test
    public void testOverSkipped() throws IOException {
        byte[] bytes = new byte[100];
        LengthCheckInputStream is = new LengthCheckInputStream(
                new ByteArrayInputStream(bytes), 99, INCLUDE_SKIPPED_BYTES);
        try {
            is.skip(100);
            fail();
        } catch(AmazonClientException ex) {
            // expected
        }
        is.close();
    }
}
