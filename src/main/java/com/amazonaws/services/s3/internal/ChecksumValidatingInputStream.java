/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.amazonaws.AmazonClientException;

/**
 * InputStream wrapper that calculates a client-side MD5 checksum of the data as
 * it is read from the wrapped InputStream, then when the stream is closed, the
 * client-side calculated MD5 checksum is compared with the server-side MD5
 * checksum, and if they don't match, then close() throws an exception to alert
 * the user to the likely data corruption.
 */
public class ChecksumValidatingInputStream extends FilterInputStream {

    /** The checksum we expect to match this InputStream's content. */
    private final byte[] expectedChecksum;

    /**
     * The private DigestInputStream we use to wrap the source input stream
     * and compute a client-side MD5 checksum.
     */
    private final DigestInputStream digestInputStream;

    /**
     * Description of the source object from Amazon S3 in case we need to
     * alert the user that the checksums didn't match.
     */
    private final String sourceObject;

    /**
     * Keeps track of whether all content has been read from the wrapped
     * InputStream or not, since we can't compare checksums unless we've read
     * all of the content from the wrapped InputStream, otherwise we'll have an
     * incorrect client-side checksum.
     */
    private boolean hasReadAllContent = false;


    /**
     * Constructs a new InputStream that wraps an existing InputStream and
     * calculates a client-side MD5 checksum as the user reads data from the
     * stream. When the stream is completely read, if the calculated,
     * client-side MD5 checksum doesn't match the server-side MD5 checksum
     * from Amazon S3, then the close() method will throw an exception to
     * alert the user about the likely data corruption.
     *
     * @param in
     *            The InputStream to wrap, containing the content to
     *            calculate the MD5 checksum for.
     * @param expectedChecksum
     *            The expected MD5 checksum for the data.
     * @param sourceObject
     *            A text description of the original source object in Amazon
     *            S3; only used in an error message to give the user more
     *            context about what failed if data corruption is detected.
     *
     * @throws NoSuchAlgorithmException
     *             If the running JVM doesn't support MD5 MessageDigests.
     */
    public ChecksumValidatingInputStream(InputStream in, byte[] expectedChecksum, String sourceObject) throws NoSuchAlgorithmException {
        super(new DigestInputStream(in, MessageDigest.getInstance("MD5")));
        this.expectedChecksum = expectedChecksum;
        this.sourceObject = sourceObject;
        this.digestInputStream = (DigestInputStream)super.in;
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        hasReadAllContent = (read == -1);
        return read;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        hasReadAllContent = (read == 0);
        return read;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int read = super.read(b);
        hasReadAllContent = (read == 0);
        return read;
    }

    @Override
    public void close() throws IOException {
        super.close();

        // If we haven't read all the content from the wrapped InputStream, then
        // we can't try to compare the two checksums, so just bail out.
        if (hasReadAllContent == false) return;

        byte[] clientSideHash = digestInputStream.getMessageDigest().digest();
        if (!Arrays.equals(clientSideHash, expectedChecksum)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  " +
                    "Client calculated content hash didn't match hash calculated by Amazon S3.  " +
                    "The data read from '" + sourceObject + "' may be corrupt.");
        }
    }
}
