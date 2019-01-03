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
package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Simple InputStream wrapper that examines the wrapped stream's contents as
 * they are read and calculates and MD5 digest.
 */
public class MD5DigestCalculatingInputStream extends SdkFilterInputStream {
    private static Log log = LogFactory.getLog(MD5DigestCalculatingInputStream.class);

    /** The MD5 message digest being calculated by this input stream */
    private MessageDigest digest;

    private boolean digestCanBeCloned;

    /**
     * The MD5 message digest as at the time when the last {@link #mark(int)}
     * operation was called; always null if mark is not supported.
     */
    private MessageDigest digestLastMarked;

    public MD5DigestCalculatingInputStream(InputStream in) {
        super(in);
        resetDigest();
        if (in.markSupported() && !digestCanBeCloned) {
            log.debug("Mark-and-reset disabled on MD5 calculation because the digest implementation does not support cloning. "
                      + "This will limit the SDK's ability to retry requests that failed. Consider pre-calculating the MD5 "
                      + "checksum for the request or switching to a security provider that supports message digest cloning.");
        }
    }

    private void resetDigest() {
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No message digest support for MD5 was found.", e);
        }

        digestCanBeCloned = canBeCloned(digest);
    }

    private boolean canBeCloned(MessageDigest digest) {
        try {
            digest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }
    
    private MessageDigest cloneFrom(MessageDigest from) {
        try {
            return (MessageDigest)from.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Message digest implementation does not support cloning.", e);
        }
    }

    @Override
    public boolean markSupported() {
        // Cloning of the digest is required to support restoring the prior state of the MD5 calculation when using mark() and
        // reset(). If the digest doesn't support cloning, we have to disable mark/reset support.
        return super.markSupported() && digestCanBeCloned;
    }

    public byte[] getMd5Digest() {
        return digest.digest();
    }

    @Override
    public void mark(int readlimit) {
        if (markSupported()) {
            super.mark(readlimit);
            digestLastMarked = cloneFrom(digest);
        }
    }

    /**
     * Resets the wrapped input stream and the in progress message digest.
     */
    @Override
    public void reset() throws IOException {
        if (markSupported()) {
            super.reset();

            if (digestLastMarked == null) {
                resetDigest();
            } else {
                digest = cloneFrom(digestLastMarked);
            }
        } else {
            throw new IOException("mark/reset not supported");
        }
    }

    @Override
    public int read() throws IOException {
        int ch = super.read();
        if (ch != -1) {
            digest.update((byte)ch);
        }
        return ch;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if (result != -1) {
            digest.update(b, off, result);
        }
        return result;
    }
}
