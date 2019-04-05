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

/**
 * A service provider interface that can be used to implement an AWS SDK
 * general purpose metric collector.
 */
public abstract class ServiceMetricCollector {
    public static interface Factory {
        /**
         * Returns an instance of the collector; or null if if failed to create
         * one.
         */
        public ServiceMetricCollector getServiceMetricCollector();
    }
    /**
     * Collects metrics on the number of bytes written or read and the respective
     * duration.
     */
    public abstract void collectByteThroughput(ByteThroughputProvider provider);
    /**
     * Collects metrics for non-request specific latencies.
     */
    public abstract void collectLatency(ServiceLatencyProvider provider);

    public boolean isEnabled() { return true; }
    /** A convenient instance of a no-op service metric collector. */
    public static final ServiceMetricCollector NONE = new ServiceMetricCollector() {
        @Override public void collectByteThroughput(ByteThroughputProvider provider) {}
        @Override public void collectLatency(ServiceLatencyProvider provider) {}
        @Override public boolean isEnabled() { return false; }
    };
}
