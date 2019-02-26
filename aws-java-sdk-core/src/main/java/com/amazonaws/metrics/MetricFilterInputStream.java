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
package com.amazonaws.metrics;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Used to capture the input stream throughput metrics, but excluding the
 * {@link #read()} API.
 * <p>
 * Note this class is only relevant
 * when metric is enabled. Otherwise it should not even be involved in the call
 * stack to minimize runtime overhead.
 */
public class MetricFilterInputStream extends SdkFilterInputStream {
    private final ByteThroughputHelper helper;

    public MetricFilterInputStream(ThroughputMetricType type, InputStream in) {
        super(in);
        helper = new ByteThroughputHelper(type);
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        abortIfNeeded();
        long startNano = helper.startTiming();
        int bytesRead = in.read(b, off, len);
        if (bytesRead > 0) {
            helper.increment(bytesRead, startNano);
        }
        return bytesRead;
    }

    @Override
    public void close() throws IOException {
        helper.reportMetrics();
        in.close();
        abortIfNeeded();
    }

    @Override
    public final boolean isMetricActivated() {
        return true;
    }
}
