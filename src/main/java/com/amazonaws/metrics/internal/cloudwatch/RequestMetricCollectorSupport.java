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
package com.amazonaws.metrics.internal.cloudwatch;

import java.util.concurrent.BlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.ThreadSafe;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.metrics.RequestMetricType;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.util.AWSRequestMetrics;

/**
 * This is the default implementation of an AWS SDK request metric collection
 * system.
 * 
 * @see RequestMetricCollector
 */
@ThreadSafe
public class RequestMetricCollectorSupport extends RequestMetricCollector 
{
    protected final static Log log = LogFactory.getLog(RequestMetricCollectorSupport.class);
    private final BlockingQueue<MetricDatum> queue;
    private final PredefinedMetricTransformer transformer = new PredefinedMetricTransformer();

    protected RequestMetricCollectorSupport(BlockingQueue<MetricDatum> queue) {
        this.queue = queue;
    }

    /**
     * Collects the metrics at the end of a request/response cycle, transforms
     * the metric data points into a cloud watch metric datum representation,
     * and then adds it to a memory queue so it will get summarized into the
     * necessary statistics and uploaded to Amazon CloudWatch.
     */
    @Override
    public void collectMetrics(Request<?> request, Response<?> response) {
        try {
            collectMetrics0(request, response);
        } catch(Exception ex) { // defensive code
            if (log.isDebugEnabled()) {
                log.debug("Ignoring unexpected failure", ex);
            }
        }
    }
    private void collectMetrics0(Request<?> request, Object response) {
        AWSRequestMetrics arm = request.getAWSRequestMetrics();
        if (arm == null || !arm.isEnabled()) {
            return;
        }
        for (MetricType type: AwsSdkMetrics.getPredefinedMetrics()) {
            if (!(type instanceof RequestMetricType))
                continue;
            PredefinedMetricTransformer transformer = getTransformer();
            for (MetricDatum datum : transformer.toMetricData(type, request, response)) {
                try {
                    addMetricsToQueue(datum);
                } catch(RuntimeException ex) {
                    log.warn("Failed to add to the metrics queue for "
                        + type.name() + ":" + request.getServiceName(),
                        ex);
                }
            }
        }
    }
    /** Adds the given metric to the queue, returning true if successful or false otherwise. */
    protected boolean addMetricsToQueue(MetricDatum metric) { return queue.add(metric); }
    /** Returns the predefined metrics transformer. */
    protected PredefinedMetricTransformer getTransformer() { return transformer; }
}
