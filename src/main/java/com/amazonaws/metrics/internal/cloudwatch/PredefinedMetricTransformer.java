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

import static com.amazonaws.metrics.internal.cloudwatch.spi.MetricData.newMetricDatum;
import static com.amazonaws.metrics.internal.cloudwatch.spi.RequestMetricTransformer.Utils.endTimestamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.ThreadSafe;

import com.amazonaws.Request;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.metrics.internal.cloudwatch.spi.AWSMetricTransformerFactory;
import com.amazonaws.metrics.internal.cloudwatch.spi.Dimensions;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.StandardUnit;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.TimingInfo;
/**
 * Used to transform the predefined metrics of the AWS SDK into instances of
 * {@link MetricDatum}.
 * 
 * See <a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html"
 * >http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/
 * publishingMetrics.html</a>
 * 
 * @see AWSRequestMetrics
 * @see RequestMetricCollector
 */
@ThreadSafe
public class PredefinedMetricTransformer {
    private static final Log log = LogFactory.getLog(PredefinedMetricTransformer.class);
    static final boolean INCLUDE_REQUEST_TYPE = true;
    static final boolean EXCLUDE_REQUEST_TYPE = !INCLUDE_REQUEST_TYPE;


    /**
     * Returns a non-null list of metric datum for the metrics collected for the
     * given request/response.
     * 
     * @param metricType the request metric type
     */
    public List<MetricDatum> toMetricData(MetricType metricType, Request<?> request, Object response) {
        if (metricType instanceof Field) {
            // Predefined metrics across all aws http clients
            Field predefined = (Field) metricType;
            switch(predefined) {
                case HttpClientRetryCount:
                    return metricOfCount(predefined, request, response);
                case RequestCount:  // intentionally fall thru to reuse the same routine as RetryCount
                case RetryCount:
                    return metricOfRequestOrRetryCount(predefined, request, response);
                case ResponseProcessingTime: // drop thru
                case RequestSigningTime: // drop thru
                    return latencyMetricOf(predefined, request, response, EXCLUDE_REQUEST_TYPE);
                case ClientExecuteTime:
                    return latencyOfClientExecuteTime(request, response);
                case HttpClientSendRequestTime:
                case HttpClientReceiveResponseTime:
                case HttpRequestTime:
                    return latencyMetricOf(predefined, request, response, INCLUDE_REQUEST_TYPE);
                case Exception:
                    return counterMetricOf(predefined, request, response, INCLUDE_REQUEST_TYPE);
                default:
                    break;
            }
        }
        // Predefined metrics for specific service clients
        for (AWSMetricTransformerFactory aws: AWSMetricTransformerFactory.values()) {
            if (metricType.name().startsWith(aws.name())) {
                List<MetricDatum> metricData = aws.getRequestMetricTransformer()
                        .toMetricData(metricType, request, response);
                if (metricData != null)
                    return metricData;
                break;
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("No request metric transformer can be found for metric type " + metricType.name());
        }
        return Collections.emptyList();
    }

    /**
     * Returns a list with a single metric datum for the specified retry or
     * request count predefined metric; or an empty list if there is none.
     * 
     * @param metricType
     *            must be either {@link Field#RequestCount} or
     *            {@link Field#RetryCount}; or else GIGO.
     */
    protected List<MetricDatum> metricOfRequestOrRetryCount(
            Field metricType, Request<?> req, Object resp) {
        AWSRequestMetrics m = req.getAWSRequestMetrics(); 
        TimingInfo ti = m.getTimingInfo();
        // Always retrieve the request count even for retry which is equivalent
        // to the number of requests minus one.
        Number counter = ti.getCounter(Field.RequestCount.name());
        if (counter == null) {
            // this is possible if one of the request handlers screwed up
            return Collections.emptyList();
        }
        int requestCount = counter.intValue();
        if (requestCount < 1) {
            LogFactory.getLog(getClass()).warn(
                "request count must be at least one");
            return Collections.emptyList();
        }
        final double count = metricType == Field.RequestCount 
                           ? requestCount
                           : requestCount-1 // retryCount = requestCount - 1
                           ;
        if (count < 1) {
            return Collections.emptyList();
        } else {
            return Collections.singletonList(new MetricDatum()
                .withMetricName(req.getServiceName())
                .withDimensions(new Dimension()
                    .withName(Dimensions.MetricType.name())
                    .withValue(metricType.name()))
                .withUnit(StandardUnit.Count)
                .withValue(Double.valueOf(count))
                .withTimestamp(endTimestamp(ti)))
                ;
        }
    }

    protected List<MetricDatum> metricOfCount(
            Field metricType, Request<?> req, Object resp) {
        AWSRequestMetrics m = req.getAWSRequestMetrics(); 
        TimingInfo ti = m.getTimingInfo();
        Number counter = ti.getCounter(metricType.name());
        if (counter == null) {
            return Collections.emptyList();
        }
        final double count = counter.doubleValue();
        if (count < 1) {
            return Collections.emptyList();
        } else {
            return Collections.singletonList(new MetricDatum()
                .withMetricName(req.getServiceName())
                .withDimensions(new Dimension()
                    .withName(Dimensions.MetricType.name())
                    .withValue(metricType.name()))
                .withUnit(StandardUnit.Count)
                .withValue(Double.valueOf(count))
                .withTimestamp(endTimestamp(ti)))
                ;
        }
    }
    
    /**
     * Returns all the latency metric data recorded for the specified metric
     * event type; or an empty list if there is none. The number of metric datum
     * in the returned list should be exactly one when there is no retries, or
     * more than one when there are retries.
     * 
     * @param includesRequestType
     *            true iff the "request" dimension is to be included;
     */
    protected List<MetricDatum> latencyMetricOf(MetricType metricType,
            Request<?> req, Object response, boolean includesRequestType) {
        AWSRequestMetrics m = req.getAWSRequestMetrics();
        TimingInfo root = m.getTimingInfo();
        final String metricName = metricType.name();
        List<TimingInfo> subMeasures =
            root.getAllSubMeasurements(metricName);
        if (subMeasures != null) {
            List<MetricDatum> result =
                new ArrayList<MetricDatum>(subMeasures.size());
            for (TimingInfo sub : subMeasures) {
                if (sub.isEndTimeKnown()) { // being defensive
                    List<Dimension> dims = new ArrayList<Dimension>();
                    dims.add(new Dimension()
                            .withName(Dimensions.MetricType.name())
                            .withValue(metricName));
                    // Either a non request type specific datum is created per
                    // sub-measurement, or a request type specific one is 
                    // created but not both
                    if (includesRequestType) {
                        dims.add(new Dimension()
                                .withName(Dimensions.RequestType.name())
                                .withValue(requestType(req)));
                    }
                    MetricDatum datum = new MetricDatum()
                        .withMetricName(req.getServiceName())
                        .withDimensions(dims)
                        .withUnit(StandardUnit.Milliseconds)
                        .withValue(sub.getTimeTakenMillisIfKnown());
                    result.add(datum);
                }
            }
            return result;
        }
        return Collections.emptyList();
    }

    /**
     * Returns a request type specific metrics for
     * {@link Field#ClientExecuteTime} which is special in the sense that it
     * makes a more accurate measurement by taking the {@link TimingInfo} at the
     * root into account.
     */
    protected List<MetricDatum> latencyOfClientExecuteTime(Request<?> req, Object response) {
        AWSRequestMetrics m = req.getAWSRequestMetrics();
        TimingInfo root = m.getTimingInfo();
        final String metricName = Field.ClientExecuteTime.name();
        if (root.isEndTimeKnown()) { // being defensive
            List<Dimension> dims = new ArrayList<Dimension>();
            dims.add(new Dimension()
                    .withName(Dimensions.MetricType.name())
                    .withValue(metricName));
            // request type specific
            dims.add(new Dimension()
                    .withName(Dimensions.RequestType.name())
                    .withValue(requestType(req)));
            MetricDatum datum = new MetricDatum()
                .withMetricName(req.getServiceName())
                .withDimensions(dims)
                .withUnit(StandardUnit.Milliseconds)
                .withValue(root.getTimeTakenMillisIfKnown());
            return Collections.singletonList(datum);
        }
        return Collections.emptyList();
    }
    
    /**
     * Returns the name of the type of request.
     */
    private String requestType(Request<?> req) {
        return req.getOriginalRequest().getClass().getSimpleName();
    }

    /**
     * Returns a list of metric datum recorded for the specified counter metric
     * type; or an empty list if there is none.
     * 
     * @param includesRequestType
     *            true iff an additional metric datum is to be created that
     *            includes the "request" dimension
     */
    protected List<MetricDatum> counterMetricOf(MetricType type,
            Request<?> req, Object resp, boolean includesRequestType) {
        AWSRequestMetrics m = req.getAWSRequestMetrics(); 
        TimingInfo ti = m.getTimingInfo();
        final String metricName = type.name();
        Number counter = ti.getCounter(metricName);
        if (counter == null) {
            return Collections.emptyList();
        }
        int count = counter.intValue();
        if (count < 1) {
            LogFactory.getLog(getClass()).warn("Count must be at least one");
            return Collections.emptyList();
        }
        final List<MetricDatum> result = new ArrayList<MetricDatum>();
        final Dimension metricDimension = new Dimension()
            .withName(Dimensions.MetricType.name())
            .withValue(metricName);
        // non-request type specific metric datum
        final MetricDatum first = new MetricDatum()
            .withMetricName(req.getServiceName())
            .withDimensions(metricDimension)
            .withUnit(StandardUnit.Count)
            .withValue(Double.valueOf(count))
            .withTimestamp(endTimestamp(ti));
        result.add(first);
        if (includesRequestType) {
            // additional request type specific metric datum
            Dimension requestDimension = new Dimension()
                .withName(Dimensions.RequestType.name())
                .withValue(requestType(req));
            final MetricDatum second = 
                newMetricDatum(first, metricDimension, requestDimension);
            result.add(second);
        }
        return result;
    }
}
