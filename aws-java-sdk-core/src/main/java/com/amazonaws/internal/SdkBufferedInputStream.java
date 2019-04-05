/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import static com.amazonaws.util.SdkRuntime.shouldAbort;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.AbortedException;

/**
 * A buffered input stream that is both SDK metric aware, and can be aborted
 * via thread interrupt.
 */
public class SdkBufferedInputStream extends BufferedInputStream implements
        MetricAware {
    public SdkBufferedInputStream(InputStream in) {
        super(in);
    }

    public SdkBufferedInputStream(InputStream in, int size) {
        super(in, size);
    }

    @Override
    public boolean isMetricActivated() {
        if (in instanceof MetricAware) {
            MetricAware metricAware = (MetricAware)in;
            return metricAware.isMetricActivated();
        }
        return false;
    }

    /**
     * Aborts with subclass specific abortion logic executed if needed.
     * Note the interrupted status of the thread is cleared by this method.
     * @throws AbortedException if found necessary.
     */
    protected final void abortIfNeeded() {
        if (shouldAbort()) {
            abort();    // execute subclass specific abortion logic
            throw new AbortedException();
        }
    }

    /**
     * Can be used to provide abortion logic prior to throwing the
     * AbortedException. No-op by default.
     */
    protected void abort() {
    }

    @Override
    public int read() throws IOException {
        abortIfNeeded();
        return super.read();
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        abortIfNeeded();
        return super.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        abortIfNeeded();
        return super.skip(n);
    }

    @Override
    public int available() throws IOException {
        abortIfNeeded();
        return super.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
        abortIfNeeded();
    }

    @Override
    public void mark(int readlimit) {
        abortIfNeeded();
        super.mark(readlimit);
    }

    @Override
    public void reset() throws IOException {
        abortIfNeeded();
        super.reset();
    }

    @Override
    public boolean markSupported() {
        abortIfNeeded();
        return super.markSupported();
    }
}
