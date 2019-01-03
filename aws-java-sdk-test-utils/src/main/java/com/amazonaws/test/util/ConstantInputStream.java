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
import java.util.Arrays;
import java.util.Random;

import com.amazonaws.internal.SdkInputStream;

/**
 * A test input stream that always return the same value.
 */
public class ConstantInputStream extends SdkInputStream {
    private final byte val;
    private long remaining;
    private final boolean randomlyReturnZeros;
    private int randomZerosCount;

    private static final Random rand = new Random();

    public ConstantInputStream(long total, byte val) {
        this.remaining = total;
        this.val = val;
        this.randomlyReturnZeros = false;
    }

    public ConstantInputStream(long total, byte val, boolean randomlyReturnZeros) {
        this.remaining = total;
        this.val = val;
        this.randomlyReturnZeros = randomlyReturnZeros;
    }

    @Override
    public int read(byte[] b, final int off, int len) throws IOException {
        if (randomlyReturnZeros && rand.nextBoolean()) {
            randomZerosCount++;
            return 0;
        }
        if (remaining <= 0)
            return -1;
        if (len > remaining)
            len = (int) remaining;
        remaining -= len;
        Arrays.fill(b, off, off+len, val);
        return len;
    }

    @Override
    public int read() throws IOException {
        if (randomlyReturnZeros && rand.nextBoolean()) {
            randomZerosCount++;
            return 0;
        }
        if (remaining <= 0)
            return -1;
        remaining--;
        return val;
    }

    public int getRandomZerosCount() {
        return randomZerosCount;
    }

    @Override
    protected InputStream getWrappedInputStream() {
        return null;
    }
}