/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.test.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.junit.Assert;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.IOUtils;

public class SdkAsserts {

    /**
     * Asserts that the specified String is not null and not empty.
     *
     * @param str
     *            The String to test.
     * @deprecated Use Hamcrest Matchers instead
     */
    @Deprecated
    public static void assertNotEmpty(String str) {
        assertNotNull(str);
        assertTrue(str.length() > 0);
    }

    /**
     * Asserts that the contents in the specified file are exactly equal to the contents read from
     * the specified input stream. The input stream will be closed at the end of this method. If any
     * problems are encountered, or the stream's contents don't match up exactly with the file's
     * contents, then this method will fail the current test.
     *
     * @param expected
     *            The file containing the expected contents.
     * @param actual
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     */
    public static void assertFileEqualsStream(File expected, InputStream actual) {
        assertFileEqualsStream(null, expected, actual);
    }

    /**
     * Asserts that the contents in the specified file are exactly equal to the contents read from
     * the specified input stream. The input stream will be closed at the end of this method. If any
     * problems are encountered, or the stream's contents don't match up exactly with the file's
     * contents, then this method will fail the current test.
     *
     * @param errmsg
     *            error message to be thrown when the assertion fails.
     * @param expected
     *            The file containing the expected contents.
     * @param actual
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     */
    public static void assertFileEqualsStream(String errmsg, File expected, InputStream actual) {
        try {
            InputStream expectedInputStream = new FileInputStream(expected);
            assertStreamEqualsStream(errmsg, expectedInputStream, actual);
        } catch (FileNotFoundException e) {
            fail("Expected file " + expected.getAbsolutePath() + " doesn't exist: " + e.getMessage());
        }
    }

    /**
     * Asserts that the contents in the specified input streams are same. The input streams will be
     * closed at the end of this method. If any problems are encountered, or the stream's contents
     * don't match up exactly with the file's contents, then this method will fail the current test.
     *
     * @param expected
     *            expected input stream. The stream will be closed at the end.
     * @param actual
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     */
    public static void assertStreamEqualsStream(InputStream expected, InputStream actual) {
        assertStreamEqualsStream(null, expected, actual);
    }

    /**
     * Asserts that the contents in the specified input streams are same. The input streams will be
     * closed at the end of this method. If any problems are encountered, or the stream's contents
     * don't match up exactly with the file's contents, then this method will fail the current test.
     *
     * @param errmsg
     *            error message to be thrown when the assertion fails.
     * @param expected
     *            expected input stream. The stream will be closed at the end.
     * @param actual
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     */
    public static void assertStreamEqualsStream(String errmsg,
                                                InputStream expectedInputStream,
                                                InputStream inputStream) {
        try {
            assertTrue(errmsg, doesStreamEqualStream(expectedInputStream, inputStream));
        } catch (IOException e) {
            fail("Error reading from stream: " + e.getMessage());
        }
    }

    /**
     * Asserts that the contents of the two files are same.
     *
     * @param expected
     *            expected file.
     * @param actual
     *            actual file.
     */
    public static void assertFileEqualsFile(File expected, File actual) {
        if (expected == null || !expected.exists())
            fail("Expected file doesn't exist");
        if (actual == null || !actual.exists())
            fail("Actual file doesn't exist");

        final long expectedFileLen = expected.length();
        final long fileLen = actual.length();
        Assert.assertTrue("expectedFileLen=" + expectedFileLen + ", fileLen=" + fileLen + ", expectedFile=" + expected
                + ", file=" + actual, expectedFileLen == fileLen);
        try {
            assertStreamEqualsStream("expected file: " + expected + " vs. actual file: " + actual,
                    new FileInputStream(expected), new FileInputStream(actual));
        } catch (Exception e) {
            fail("Unable to compare files: " + e.getMessage());
        }
    }

    /**
     * Asserts that the contents in the specified string are exactly equal to the contents read from
     * the specified input stream. The input stream will be closed at the end of this method. If any
     * problems are encountered, or the stream's contents don't match up exactly with the string's
     * contents, then this method will fail the current test.
     *
     * @param expected
     *            The string containing the expected data.
     * @param actual
     *            The stream that will be read, compared to the expected string data, and finally
     *            closed.
     */
    public static void assertStringEqualsStream(String expected, InputStream actual) {
        try {
            InputStream expectedInputStream = new ByteArrayInputStream(expected.getBytes());
            assertTrue(doesStreamEqualStream(expectedInputStream, actual));
        } catch (IOException e) {
            fail("Error reading from stream: " + e.getMessage());
        }
    }

    /**
     * Returns true if, and only if, the contents read from the specified input streams are exactly
     * equal. Both input streams will be closed at the end of this method.
     *
     * @param expected
     *            The input stream containing the expected contents.
     * @param inputStream
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     * @return True if the two input streams contain the same data.
     * @throws IOException
     *             If any problems are encountered comparing the file and stream.
     */
    public static boolean doesStreamEqualStream(InputStream expected, InputStream actual) throws IOException {

        try {
            final byte[] expectedDigest = InputStreamUtils.calculateMD5Digest(expected);
            final byte[] actualDigest = InputStreamUtils.calculateMD5Digest(actual);

            return Arrays.equals(expectedDigest, actualDigest);
        } catch (NoSuchAlgorithmException nse) {
            throw new AmazonClientException(nse.getMessage(), nse);
        } finally {
            IOUtils.closeQuietly(expected, null);
            IOUtils.closeQuietly(actual, null);
        }
    }

    /**
     * Returns true if, and only if, the contents in the specified file are exactly equal to the
     * contents read from the specified input stream. The input stream will be closed at the end of
     * this method.
     *
     * @param expectedFile
     *            The file containing the expected contents.
     * @param inputStream
     *            The stream that will be read, compared to the expected file contents, and finally
     *            closed.
     * @throws IOException
     *             If any problems are encountered comparing the file and stream.
     */
    public static boolean doesFileEqualStream(File expectedFile, InputStream inputStream) throws IOException {
        InputStream expectedInputStream = new FileInputStream(expectedFile);
        return doesStreamEqualStream(expectedInputStream, inputStream);
    }

    /**
     * Asserts that the specified AmazonServiceException is valid, meaning it has a non-empty,
     * non-null value for its message, requestId, etc.
     *
     * @param e
     *            The exception to validate.
     */
    public static void assertValidException(AmazonServiceException e) {
        assertNotNull(e.getRequestId());
        assertTrue(e.getRequestId().trim().length() > 0);

        assertNotNull(e.getMessage());
        assertTrue(e.getMessage().trim().length() > 0);

        assertNotNull(e.getErrorCode());
        assertTrue(e.getErrorCode().trim().length() > 0);

        assertNotNull(e.getServiceName());
        assertTrue(e.getServiceName().startsWith("Amazon") || e.getServiceName().startsWith("AWS"));
    }

}
