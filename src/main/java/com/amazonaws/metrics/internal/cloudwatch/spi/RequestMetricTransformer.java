/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.metrics.internal.cloudwatch.spi;

import java.util.Date;
import java.util.List;

import com.amazonaws.Request;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.util.TimingInfo;

/**
 * Internal SPI used to provide custom request metric transformer that can be
 * added to or override the default AWS SDK implementation. Implementation of
 * this interface should ensure the {@link Object#equals(Object)} and
 * {@link Object#hashCode()} methods are overridden as necessary.
 */
public interface RequestMetricTransformer {
    /**
     * Returns a list of metric datum for the metrics collected for the given
     * request/response, or null if this transformer does not recognize the
     * specific input metric type.
     * 
     * @param metricType
     *            the predefined metric type
     */
    public List<MetricDatum> toMetricData(MetricType metricType,
            Request<?> request, Object response);
    
    /** A convenient instance of a no-op request metric transformer. */
    public static final RequestMetricTransformer NONE = new RequestMetricTransformer() {
        public List<MetricDatum> toMetricData(MetricType requestMetric,
                Request<?> request, Object response) {
            return null;
        }
    };

    /** Common utilities for implementing this SPI. */
    public static enum Utils {
        ;

        public static long endTimeMilli(TimingInfo ti) {
            Long endTimeMilli = ti.getEndEpochTimeMilliIfKnown();
            return endTimeMilli == null ? System.currentTimeMillis() : endTimeMilli.longValue();
        }

        public static Date endTimestamp(TimingInfo ti) {
            return new Date(endTimeMilli(ti));
        }
    }
}
