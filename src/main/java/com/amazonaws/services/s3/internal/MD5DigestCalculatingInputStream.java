/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) { // should never occur
            throw new IllegalStateException("unexpected", e);
        }
    }

    public byte[] getMd5Digest() {
        return digest.digest();
    }

    @Override
    public void mark(int readlimit) {
        super.mark(readlimit);
        if (markSupported()) {
            try {
                digestLastMarked = (MessageDigest)digest.clone();
            } catch (CloneNotSupportedException e) { // should never occur
                throw new IllegalStateException("unexpected", e);
            }
        }
    }

    /**
     * Resets the wrapped input stream and the in progress message digest.
     */
    @Override
    public void reset() throws IOException {
        super.reset();
        if (digestLastMarked != null) {
            try {
                digest = (MessageDigest)digestLastMarked.clone();
            } catch (CloneNotSupportedException e) { // should never occur
                throw new IllegalStateException("unexpected", e);
            }
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
