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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.services.cloudwatch.model.StatisticSet;
import com.amazonaws.util.json.Jackson;

/**
 * An internal builder used to retrieve the next batch of requests to be sent to
 * Amazon CloudWatch. Calling method {@link #nextUploadUnits()} blocks as
 * necessary.
 */
class BlockingRequestBuilder {
    private final MachineMetricFactory machineMetricFactory = new MachineMetricFactory();
    private final BlockingQueue<MetricDatum> queue;
    private final long timeoutNano;

    BlockingRequestBuilder(CloudWatchMetricConfig config, BlockingQueue<MetricDatum> queue) {
        this.queue = queue;
        this.timeoutNano = TimeUnit.MILLISECONDS.toNanos(config.getQueuePollTimeoutMilli());
    }

    /**
     * Returns the next batch of {@link PutMetricDataRequest} to be sent to
     * Amazon CloudWatch, blocking as necessary to gather and accumulate the
     * necessary statistics. If there is no metrics data, this call blocks
     * indefinitely. If there is metrics data, this call will block up to about
     * {@link CloudWatchMetricConfig#getQueuePollTimeoutMilli()} number of
     * milliseconds.
     */
    Iterable<PutMetricDataRequest> nextUploadUnits() throws InterruptedException {
        final Map<String,MetricDatum> uniqueMetrics = new HashMap<String,MetricDatum>();
        long startNano = System.nanoTime();
        
        while(true) {
            final long elapsedNano = System.nanoTime() - startNano;
            if (elapsedNano >= timeoutNano) {
                return toPutMetricDataRequests(uniqueMetrics);
            }
            MetricDatum datum = queue.poll(timeoutNano - elapsedNano, TimeUnit.NANOSECONDS);
            if (datum == null) {
                // timed out
                if (uniqueMetrics.size() > 0) {
                    return toPutMetricDataRequests(uniqueMetrics);   // return whatever we have so far
                }
                datum = queue.take();   // zero metrics; so just wait indefinitely
                startNano = System.nanoTime();
            }
            summarize(datum, uniqueMetrics);
        }
    }

    /**
     * Summarizes the given datum into the statistics of the respective unique metric.
     */
    private void summarize(MetricDatum datum, Map<String, MetricDatum> uniqueMetrics) {
        Double value = datum.getValue();
        if (value == null) {
            return;
        }
        List<Dimension> dims = datum.getDimensions();
        Collections.sort(dims, DimensionComparator.INSTANCE);
        String metricName = datum.getMetricName();
        String key = metricName + Jackson.toJsonString(dims);
        MetricDatum statDatum = uniqueMetrics.get(key);
        if (statDatum == null) {
            statDatum = new MetricDatum()
                .withDimensions(datum.getDimensions())
                .withMetricName(metricName)
                .withUnit(datum.getUnit())
                .withStatisticValues(new StatisticSet()
                    .withMaximum(value)
                    .withMinimum(value)
                    .withSampleCount(0.0)
                    .withSum(0.0))
                ;
            uniqueMetrics.put(key, statDatum);
        }
        StatisticSet stat = statDatum.getStatisticValues();
        stat.setSampleCount(stat.getSampleCount() + 1.0);
        stat.setSum(stat.getSum() + value);
        if (value > stat.getMaximum()) {
            stat.setMaximum(value);
        } else if (value < stat.getMinimum()) {
            stat.setMinimum(value);
        }
    }
    /**
     * Consolidates the input metrics into a list of PutMetricDataRequest, each
     * within the maximum size limit imposed by CloudWatch.
     */
    private Iterable<PutMetricDataRequest> toPutMetricDataRequests(Map<String, MetricDatum> uniqueMetrics) {
        if (!AwsSdkMetrics.isMachineMetricExcluded()) {
            // Opportunistically generates some machine metrics whenever there
            // is metrics consolidation
            for (MetricDatum datum: machineMetricFactory.generateMetrics()) {
                summarize(datum, uniqueMetrics);
            }
        }
        List<PutMetricDataRequest> list = new ArrayList<PutMetricDataRequest>();
        List<MetricDatum> data = new ArrayList<MetricDatum>();
        for (MetricDatum m: uniqueMetrics.values()) {
            data.add(m);
            if (data.size() == CloudWatchMetricConfig.MAX_METRICS_DATUM_SIZE) {
                list.add(newPutMetricDataRequest(data));
                data.clear();
            }
        }

        if (data.size() > 0) {
            list.add(newPutMetricDataRequest(data));
        }
        return list;
    }

    private PutMetricDataRequest newPutMetricDataRequest(Collection<MetricDatum> data) {
        PutMetricDataRequest req = new PutMetricDataRequest()
            .withNamespace(AwsSdkMetrics.METRICS_NAMESPACE)
            .withMetricData(data)
            .withRequestMetricCollector(RequestMetricCollector.NONE)
            ;
        return req;
    }
}
