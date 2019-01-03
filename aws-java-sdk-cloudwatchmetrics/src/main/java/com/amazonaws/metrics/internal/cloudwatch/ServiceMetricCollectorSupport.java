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
package com.amazonaws.metrics.internal.cloudwatch;

import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.ByteThroughputProvider;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.metrics.ServiceLatencyProvider;
import com.amazonaws.metrics.ServiceMetricCollector;
import com.amazonaws.metrics.ServiceMetricType;
import com.amazonaws.metrics.ThroughputMetricType;
import com.amazonaws.metrics.internal.cloudwatch.spi.Dimensions;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.StandardUnit;

/**
 * This is the default implementation of an AWS SDK service metric collection
 * system.
 * 
 * @see RequestMetricCollector
 */
@ThreadSafe
public class ServiceMetricCollectorSupport extends ServiceMetricCollector 
{
    static final double NANO_PER_SEC = TimeUnit.SECONDS.toNanos(1);
    protected final static Log log = LogFactory.getLog(ServiceMetricCollectorSupport.class);
    private final BlockingQueue<MetricDatum> queue;

    protected ServiceMetricCollectorSupport(BlockingQueue<MetricDatum> queue) {
        this.queue = queue;
    }

    @Override
    public void collectByteThroughput(ByteThroughputProvider provider) {
        try {
            collectByteThroughput0(provider);
        } catch(Exception ex) { // defensive code
            if (log.isDebugEnabled()) {
                log.debug("Ignoring unexpected failure", ex);
            }
        }
    }
    
    /** 
     * Returns the number of bytes per second, given the byte count and
     * duration in nano seconds.  Duration of zero nanosecond will be treated
     * as 1 nanosecond.
     */
    double bytesPerSecond(double byteCount, double durationNano) {
        if (byteCount < 0 || durationNano < 0)
            throw new IllegalArgumentException();
        if (durationNano == 0) {
            durationNano = 1.0;   // defend against division by zero
            if (log.isDebugEnabled()) {
                log.debug("Set zero to one to avoid division by zero; but should never get here!");
            }
        }
        double bytesPerSec = (byteCount / durationNano) * NANO_PER_SEC;
        if (bytesPerSec == 0) {
            if (log.isDebugEnabled()) {
                log.debug("zero bytes per sec.  Really ?");
            }
        }
        return bytesPerSec;
    }
    
    private void collectByteThroughput0(ByteThroughputProvider provider) {
        final ThroughputMetricType throughputType = provider.getThroughputMetricType();
        final ServiceMetricType byteCountType = throughputType.getByteCountMetricType();
        final Set<MetricType> metrics = AwsSdkMetrics.getPredefinedMetrics();
        final double byteCount = provider.getByteCount();
        double durationNano = provider.getDurationNano();
        double bytesPerSec = bytesPerSecond(byteCount, durationNano);
        if (metrics.contains(throughputType)) {
            // Throughput metric
            final Dimension throughputDimension = new Dimension()
                .withName(Dimensions.MetricType.name())
                .withValue(throughputType.name());
            final MetricDatum throughputDatum = new MetricDatum()
                .withMetricName(throughputType.getServiceName())
                .withDimensions(throughputDimension)
                .withUnit(StandardUnit.BytesSecond)
                .withValue(bytesPerSec);
            safeAddMetricsToQueue(throughputDatum);
        }
        if (metrics.contains(byteCountType)) {
            // Byte count metric
            final Dimension byteCountDimension = new Dimension()
                .withName(Dimensions.MetricType.name())
                .withValue(byteCountType.name());
            final MetricDatum byteCountDatum = new MetricDatum()
                .withMetricName(byteCountType.getServiceName())
                .withDimensions(byteCountDimension)
                .withUnit(StandardUnit.Bytes)
                .withValue(byteCount);
            safeAddMetricsToQueue(byteCountDatum);
        }
    }

    @Override
    public void collectLatency(ServiceLatencyProvider provider) {
        final ServiceMetricType type = provider.getServiceMetricType();
        final Set<MetricType> metrics = AwsSdkMetrics.getPredefinedMetrics();
        if (metrics.contains(type)) {
            final Dimension dim = new Dimension()
                .withName(Dimensions.MetricType.name())
                .withValue(type.name());
            final MetricDatum datum = new MetricDatum()
                .withMetricName(type.getServiceName())
                .withDimensions(dim)
                .withUnit(StandardUnit.Milliseconds)
                .withValue(provider.getDurationMilli());
            safeAddMetricsToQueue(datum);
        }
    }

    private void safeAddMetricsToQueue(MetricDatum metric) {
        try {
            if (!addMetricsToQueue(metric)) {
                if (log.isDebugEnabled()) {
                    log.debug("Failed to add to the metrics queue (due to no space available) for "
                            + metric.getMetricName());
                }
            }
        } catch (RuntimeException ex) {
            log.warn("Failed to add to the metrics queue for metric: " + metric,
                    ex);
        }
    }
    /**
     * Adds the given metric to the queue, returning true if successful or false
     * if no space available.
     */
    protected boolean addMetricsToQueue(MetricDatum metric) {
        return queue.offer(metric); 
    }
}
