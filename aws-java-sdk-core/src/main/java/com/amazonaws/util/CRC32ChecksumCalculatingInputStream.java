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
package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Simple InputStream wrapper that examines the wrapped stream's contents as
 * they are read and calculates and CRC32 checksum.
 */
public class CRC32ChecksumCalculatingInputStream extends SdkFilterInputStream {

    /** The CRC32 being calculated by this input stream */
    private CRC32 crc32;

    public CRC32ChecksumCalculatingInputStream(InputStream in) {
        super(in);
        crc32 = new CRC32();
    }

    public long getCRC32Checksum() {
        return crc32.getValue();
    }

    /**
     * Resets the wrapped input stream and the CRC32 computation.
     *
     * @see java.io.InputStream#reset()
     */
    @Override
    public synchronized void reset() throws IOException {
        abortIfNeeded();
        crc32.reset();
        in.reset();
    }

    /**
     * @see java.io.InputStream#read()
     */
    @Override
    public int read() throws IOException {
        abortIfNeeded();
        int ch = in.read();
        if (ch != -1) {
            crc32.update(ch);
        }
        return ch;
    }

    /**
     * @see java.io.InputStream#read(byte[], int, int)
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        abortIfNeeded();
        int result = in.read(b, off, len);
        if (result != -1) {
            crc32.update(b, off, result);
        }
        return result;
    }
}
