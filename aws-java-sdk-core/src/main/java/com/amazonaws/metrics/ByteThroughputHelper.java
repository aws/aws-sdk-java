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

import java.util.concurrent.TimeUnit;

/**
 * Helper class to capture the byte throughput.
 * <p>
 * Note this class is only relevant
 * when metric is enabled. Otherwise it should not even be involved in the call
 * stack to minimize runtime overhead.
 */
class ByteThroughputHelper extends ByteThroughputProvider {
    private static final int REPORT_INTERVAL_SECS = 10;

    ByteThroughputHelper(ThroughputMetricType type) {
        super(type);
    }

    long startTiming() {
        if (TimeUnit.NANOSECONDS.toSeconds(getDurationNano()) > REPORT_INTERVAL_SECS) {
            reportMetrics();
        }
        return System.nanoTime();
    }
    

    void reportMetrics() {
        if (getByteCount() > 0) {
            ServiceMetricCollector col = AwsSdkMetrics.getServiceMetricCollector();
            col.collectByteThroughput(this);
            reset();
        }
    }

    @Override
    public void increment(int bytesDelta, long startTimeNano) {
        super.increment(bytesDelta, startTimeNano);
    }
}
