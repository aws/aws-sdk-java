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
package com.amazonaws.test.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * Test utility InputStream implementation that generates random ASCII data when
 * read, up to the size specified when constructed.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class RandomInputStream extends InputStream {

    /** The requested amount of data contained in this random stream */
    protected final long lengthInBytes;

    /** The number of bytes of data remaining in this random stream */
    protected long remainingBytes;

    /** Shared Random number generator to generate data */
    private static final Random RANDOM = new Random();

    /** The minimum ASCII code contained in the data in this stream */
    private static final int MIN_CHAR_CODE = 32;

    /** The maximum ASCII code contained in the data in this stream */
    private static final int MAX_CHAR_CODE = 125;

    /** Flag controlling whether binary or character data is used */
    private final boolean binaryData;


    /**
     * Constructs a new InputStream, which will return the specified amount
     * of bytes of random ASCII characters.
     *
     * @param lengthInBytes
     *            The size in bytes of the total data returned by this
     *            stream.
     */
    public RandomInputStream(long lengthInBytes) {
        this(lengthInBytes, false);
    }

    /**
     * Creates a new random input stream of specified length, and specifies
     * whether the stream should be full on binary or character data.
     *
     * @param lengthInBytes
     *            The number of bytes in the stream.
     * @param binaryData
     *            Whether binary or character data should be generated.
     */
    public RandomInputStream(long lengthInBytes, boolean binaryData) {
        this.lengthInBytes  = lengthInBytes;
        this.remainingBytes = lengthInBytes;
        this.binaryData     = binaryData;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        // Signal that we're out of data if we've hit our limit
        if (remainingBytes <= 0) return -1;
        int bytesToRead = len;
        if (bytesToRead > remainingBytes)
            bytesToRead = (int) remainingBytes;

        remainingBytes -= bytesToRead;

        if (binaryData) {
            byte[] bytes = new byte[bytesToRead];
            RANDOM.nextBytes(bytes);
            System.arraycopy(bytes, 0, b, off, bytesToRead);
        } else {
            for (int i = 0; i < bytesToRead; i++) {
                b[off+i] = (byte) (RANDOM.nextInt(MAX_CHAR_CODE - MIN_CHAR_CODE) + MIN_CHAR_CODE);
            }
        }

        return bytesToRead;
    }

    @Override
    public int read() throws IOException {
        // Signal that we're out of data if we've hit our limit
        if (remainingBytes <= 0) return -1;

        remainingBytes--;
        if (binaryData) {
            byte[] bytes = new byte[1];
            RANDOM.nextBytes(bytes);
            return (int)bytes[0];
        } else {
            return RANDOM.nextInt(MAX_CHAR_CODE - MIN_CHAR_CODE) + MIN_CHAR_CODE;
        }
    }

    public long getBytesRead() {
        return lengthInBytes - remainingBytes;
    }
}