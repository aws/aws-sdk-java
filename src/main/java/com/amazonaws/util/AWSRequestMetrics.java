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

package com.amazonaws.util;

import java.util.Collections;
import java.util.List;

import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricType;

/**
 * Used as both a base class and a minimal support of AWS SDK request metrics.
 * The base class of supporting AWS SDK request metrics.
 * <p>
 * In contrast to {@link AWSRequestMetricsFullSupport}, which is intended to be
 * a full support of AWS SDK request metrics, this class only provides access to
 * a {@link TimingInfo} instance that only has minimal support for start and end
 * time (ie with no-ops for sub-event measurements) for backward compatibility
 * reason. The other methods related to properties and counters in this class
 * are effectively no-ops.
 * <p>
 * This class is instantiated instead of {@link AWSRequestMetricsFullSupport}
 * when request metric collection is not required during a particular service
 * request/response cycle.
 */
@NotThreadSafe
public class AWSRequestMetrics {
    /**
     * Predefined AWS SDK metric types general across all AWS clients. Client
     * specific predefined metrics like S3 or DynamoDB are defined in the client
     * specific packages.
     */
    public static enum Field implements RequestMetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        /**
         * Total number of milliseconds taken for a request/response including
         * the time taken to execute the request handlers, round trip to AWS,
         * and the time taken to execute the response handlers.
         */
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        /**
         * Number of milliseconds taken for a request/response round trip to AWS.
         */
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        /**
         * Number of milliseconds taken to sign a request.
         */
        RequestSigningTime,
        /**
         * Number of milliseconds taken to execute the response handler for a response from AWS.
         */
        ResponseProcessingTime,
        /**
         * Number of requests to AWS.
         */
        RequestCount,
        /**
         * Number of retries of AWS SDK sending a request to AWS.
         */
        RetryCount, // captured via the RequestCount since (RetryCount = RequestCount - 1)
        /**
         * Number of retries of the underlying http client library in sending a
         * request to AWS.
         */
        HttpClientRetryCount,
        /**
         * Time taken to send a request to AWS by the http client library,
         * excluding any retry. 
         */
        HttpClientSendRequestTime,
        /**
         * Time taken to receive a response from AWS by the http client library,
         * excluding any retry. 
         */
        HttpClientReceiveResponseTime,
        RetryPauseTime,
//      S3DownloadThroughput, // migrated to S3RequestMetric in the S3 clint library
//      S3UploadThroughput,   // migrated to S3RequestMetric in the S3 clint library
        ServiceEndpoint,
        ServiceName,
        StatusCode, // The http status code
        ;
    }

    protected final TimingInfo timingInfo;

    /**
     * This constructor should be used only in the case when AWS SDK metrics
     * collector is disabled, when minimal timing info is supported for backward
     * compatibility reasons.
     * 
     * @see AWSRequestMetricsFullSupport
     */
    public AWSRequestMetrics() {
        this.timingInfo = TimingInfo.startTiming();
    }

    protected AWSRequestMetrics(TimingInfo timingInfo) {
        this.timingInfo = timingInfo;
    }

    public final TimingInfo getTimingInfo() {
        return timingInfo;
    }
    /**
     * Returns true if this metrics is enabled; false otherwise.
     * Returns false by default.
     * */
    public boolean isEnabled() {
        return false;
    }

    public void startEvent(String eventName) {}
    public void startEvent(MetricType f) {}
    public void endEvent(String eventName) {}
    public void endEvent(MetricType f) {}
    public void incrementCounter(String event) {}
    public void incrementCounter(MetricType f) {}
    public void setCounter(String counterName, long count) {}
    public void setCounter(MetricType f, long count) {}
    public void addProperty(String propertyName, Object value) {}
    public void addProperty(MetricType f, Object value) {}
    public void log() {}
    public List<Object> getProperty(String propertyName){ return Collections.emptyList(); }
    public List<Object> getProperty(MetricType f) { return Collections.emptyList(); }
}
