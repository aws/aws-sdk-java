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

import static com.amazonaws.metrics.internal.cloudwatch.CloudWatchMetricConfig.NAMESPACE_DELIMITER;

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
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.json.Jackson;

/**
 * An internal builder used to retrieve the next batch of requests to be sent to
 * Amazon CloudWatch. Calling method {@link #nextUploadUnits()} blocks as
 * necessary.
 */
class BlockingRequestBuilder {
    private static final String OS_METRIC_NAME = MachineMetric.getOSMetricName();
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
                list.addAll(newPutMetricDataRequests(data));
                data.clear();
            }
        }

        if (data.size() > 0) {
            list.addAll(newPutMetricDataRequests(data));
        }
        return list;
    }

    private List<PutMetricDataRequest> newPutMetricDataRequests(Collection<MetricDatum> data) {
        List<PutMetricDataRequest> list = new ArrayList<PutMetricDataRequest>();
        final String ns = AwsSdkMetrics.getMetricNameSpace();
        PutMetricDataRequest req = newPutMetricDataRequest(data, ns);
        list.add(req);
        String perHostNameSpace = null;
        final boolean perHost = AwsSdkMetrics.isPerHostMetricIncluded();
        if (perHost) {
            perHostNameSpace = ns + NAMESPACE_DELIMITER
                    + AwsHostNameUtils.localHostName();
            req = newPutMetricDataRequest(data, perHostNameSpace);
            list.add(req);
        }
        String jvmMetricName = AwsSdkMetrics.getJvmMetricName();
        if (jvmMetricName != null) {
            jvmMetricName = jvmMetricName.trim();
            if (jvmMetricName.length() > 0) {
                String perJvmNameSpace = perHostNameSpace == null
                    ? ns + NAMESPACE_DELIMITER + jvmMetricName
                    : perHostNameSpace + NAMESPACE_DELIMITER + jvmMetricName
                    ;
                // If OS metrics are already included at the per host level,
                // there is little reason, if any, to include them at the
                // JVM level.  Hence the filtering.
                req = newPutMetricDataRequest
                    (perHost ? filterOSMetrics(data) : data, perJvmNameSpace);
                list.add(req);
            }
        }
        return list;
    }

    /**
     * Return a collection of metrics almost the same as the input except with
     * all OS metrics removed.
     */
    private Collection<MetricDatum> filterOSMetrics(Collection<MetricDatum> data) {
        Collection<MetricDatum> output = new ArrayList<MetricDatum>(data.size());
        for (MetricDatum datum: data) {
            if (!OS_METRIC_NAME.equals(datum.getMetricName()))
                output.add(datum);
        }
        return output;
    }

    private PutMetricDataRequest newPutMetricDataRequest(
            Collection<MetricDatum> data, String namespace) {
        return new PutMetricDataRequest()
            .withNamespace(namespace)
            .withMetricData(data)
            .withRequestMetricCollector(RequestMetricCollector.NONE)
            ;
    }
}
