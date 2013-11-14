/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    
    public MD5DigestCalculatingInputStream(InputStream in) throws NoSuchAlgorithmException {
        super(in);
        
        digest = MessageDigest.getInstance("MD5");
    }

    public byte[] getMd5Digest() {
        return digest.digest();
    }

    /**
     * Resets the wrapped input stream and the in progress message digest.
     * 
     * @see java.io.InputStream#reset()
     */
    @Override
    public synchronized void reset() throws IOException {
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            /*
             * Not much to do here. We know the algorithm existed when we
             * created the initial MessageDigest in the constructor, so we
             * can be reasonably sure that it's still going to exist if the
             * stream gets reset.
             */
        }

        in.reset();
    }

    /**
     * @see java.io.InputStream#read()
     */
    @Override
    public int read() throws IOException {
        int ch = in.read();
        if (ch != -1) {
            digest.update((byte)ch);
        }
        return ch;
    }

    /**
     * @see java.io.InputStream#read(byte[], int, int)
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);
        if (result != -1) {
            digest.update(b, off, result);
        }
        return result;
    }

}
