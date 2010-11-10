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
package com.amazonaws.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Simple input stream wrapper utility to count the bytes read from a stream.
 */
public class CountingInputStream extends FilterInputStream {
    private long byteCount = 0;

    public CountingInputStream(InputStream in) {
        super(in);
    }

    /**
     * Returns the number of bytes read from this stream so far.
     *
     * @return the number of bytes read from this stream so far.
     */
    public long getByteCount() {
        return byteCount;
    }

    @Override
    public int read() throws IOException {
        int tmp = super.read();
        byteCount += tmp >= 0 ? tmp : 0;
        return tmp;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int tmp = super.read(b, off, len);
        byteCount += tmp >= 0 ? tmp : 0;
        return tmp;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int tmp = super.read(b);
        byteCount += tmp >= 0 ? tmp : 0;
        return tmp;
    }

    @Override
    public long skip(long n) throws IOException {
        long tmp = super.skip(n);
        byteCount += tmp >= 0 ? tmp : 0;
        return tmp;
    }
}