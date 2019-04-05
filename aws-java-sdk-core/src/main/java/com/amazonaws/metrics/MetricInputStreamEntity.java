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
import java.io.OutputStream;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;

import com.amazonaws.internal.MetricAware;

/**
 * Used to help capture the throughput metrics.
 * <p>
 * Note this class is only relevant
 * when metric is enabled. Otherwise it should not even be involved in the call
 * stack to minimize runtime overhead.
 */
public class MetricInputStreamEntity extends InputStreamEntity {
    private final static int BUFFER_SIZE = 2048;
    private final ByteThroughputHelper helper;

    public MetricInputStreamEntity(ThroughputMetricType metricType,
            InputStream instream, long length) {
        super(instream, length);
        helper = new ByteThroughputHelper(metricType);
    }

    public MetricInputStreamEntity(ThroughputMetricType metricType,
            final InputStream instream, long length,
            final ContentType contentType) {
        super(instream, length, contentType);
        helper = new ByteThroughputHelper(metricType);
    }

    @Override
    public void writeTo(final OutputStream outstream) throws IOException {
        if (outstream instanceof MetricAware) {
            // hchar: There is currently no implementation of output stream that
            // has metric gathering capability but there could be!
            // So the code here is for future proof purposes.
            MetricAware aware = (MetricAware)outstream;
            if (aware.isMetricActivated()) {
                // let the underlying output stream takes care of byte counting
                super.writeTo(outstream);
                return;
            }
        }
        writeToWithMetrics(outstream);
    }

    /**
     * Copied from {{@link InputStreamEntity#writeTo(OutputStream)} but modified
     * to capture metrics for the output stream.
     */
    private void writeToWithMetrics(final OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        final InputStream content = getContent();
        final long length = getContentLength();
        InputStream instream = content;
        try {
            byte[] buffer = new byte[BUFFER_SIZE];
            int l;
            if (length < 0) {
                // consume until EOF
                while ((l = instream.read(buffer)) != -1) {
                    long startNano = helper.startTiming();
                    outstream.write(buffer, 0, l);
                    helper.increment(l, startNano);
                }
            } else {
                // consume no more than length
                long remaining = length;
                while (remaining > 0) {
                    l = instream.read(buffer, 0, (int)Math.min(BUFFER_SIZE, remaining));
                    if (l == -1) {
                        break;
                    }
                    long startNano = helper.startTiming();
                    outstream.write(buffer, 0, l);
                    helper.increment(l, startNano);
                    remaining -= l;
                }
            }
        } finally {
            helper.reportMetrics();
            instream.close();
        }
    }
}
