/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Simple InputStream wrapper that examines the wrapped stream's contents as
 * they are read and calculates and MD5 digest.
 */
public class MD5DigestCalculatingInputStream extends SdkFilterInputStream {
    /** The MD5 message digest being calculated by this input stream */
    private MessageDigest digest;
    /**
     * The MD5 message digest as at the time when the last {@link #mark(int)}
     * operation was called; always null if mark is not supported.
     */
    private MessageDigest digestLastMarked;

    public MD5DigestCalculatingInputStream(InputStream in) {
        super(in);
        digest = newMD5();
    }

    private MessageDigest newMD5() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) { // should never occur
            throw new IllegalStateException("unexpected", e);
        }
    }
    
    private MessageDigest cloneFrom(MessageDigest from) {
        try {
            return (MessageDigest)from.clone();
        } catch (CloneNotSupportedException e) { // should never occur
            throw new IllegalStateException("unexpected", e);
        }
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
            digest = (digestLastMarked == null)
                   // This is necessary so that should there be a reset without a
                   // preceding mark, the MD5 would still be computed correctly.
                   ? newMD5()
                   : cloneFrom(digestLastMarked);
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
