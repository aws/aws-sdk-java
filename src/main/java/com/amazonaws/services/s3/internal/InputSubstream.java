/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Filtered input stream implementation that exposes a range of an input stream
 * as a new input stream.   
 */
public final class InputSubstream extends FilterInputStream {
    private long bytesRemaining;
    private long offset;

    /**
     * Constructs a new InputSubstream so that when callers start reading from
     * this stream they'll start at the specified offset in the real stream and
     * after they've read the specified length, this stream will look empty.
     * 
     * @param in
     *            The input stream to wrap.
     * @param offset
     *            The offset, in bytes, into the specified input stream at which
     *            to start reading data.
     * @param length
     *            The length, in bytes, of the specified input stream to return
     *            through this stream.
     */
    public InputSubstream(InputStream in, long offset, long length) {
        super(in);
        this.bytesRemaining = length;
        this.offset = offset;
    }

    @Override
    public int read() throws IOException {
        byte[] b = new byte[1];
        int bytesRead = read(b, 0, 1);

        if (bytesRead == -1) return bytesRead;
        return b[0];
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (offset > 0) {
            super.skip(offset);
            offset = 0;
        }
            
        if (bytesRemaining <= 0) return -1;
        
        len = (int) Math.min(len, bytesRemaining);
        int bytesRead = super.read(b, off, len);
        bytesRemaining -= bytesRead;
        
        return bytesRead;
    }

    @Override
    public int available() throws IOException {
        return (int)Math.min(bytesRemaining, super.available());
    }

    @Override
    public void close() throws IOException {}
}
