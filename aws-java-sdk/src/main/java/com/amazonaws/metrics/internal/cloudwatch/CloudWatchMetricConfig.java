/*
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

import java.util.concurrent.TimeUnit;

import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.metrics.AwsSdkMetrics;

/**
 * Configuration for the default AWS SDK collection implementation. This class
 * is not intended to be used directly by client code except for cases where the
 * default behavior of the internal Amazon CloudWatch collector implementation
 * needs to be customized.
 * <p>
 * Example:
 * 
 * <pre>
 * /**
 *  * My custom Request Metric Collector by extending from the internal Amazon CloudWatch
 *  * implementation.
 *  &#42;/
 * static class MyCloudWatchMetricCollector extends
 *         CloudWatchRequestMetricCollector {
 *     MyCloudWatchMetricCollector(CloudWatchMetricConfig config) {
 *         super(config);
 *     }
 * }
 * MyCloudWatchMetricCollector myCollector = new MyCloudWatchMetricCollector(
 *         new CloudWatchMetricConfig()
 *                 .withQueuePollTimeoutMilli(60000)
 *                 .withMetricQueueSize(1000)
 *                 .withCredentialsProvider(
 *                         new DefaultAWSCredentialsProviderChain())
 *                 .withCloudWatchEndPoint(&quot;monitoring.us-west-2.amazonaws.com&quot;)
 *                 .withPredefinedMetrics(
 *                         new HashSet&lt;Field&gt;(Arrays.asList(Field.HttpRequestTime,
 *                                 Field.ResponseProcessingTime))));
 * myCollector.start();
 * // Enable the AWS SDK level request metric collection with a custom collector
 * AwsSdkMetrics.setRequestMetricCollector(myCollector);
 * </pre>
 * 
 * @see AwsSdkMetrics
 */
@NotThreadSafe
public class CloudWatchMetricConfig {
    static final String NAMESPACE_DELIMITER = "/";
    /**
     * Maximum number of metric data that Amazon CloudWatch can
     * accept in a single request
     */
    static final int MAX_METRICS_DATUM_SIZE = 20;
    /**
     * Default metrics queue size. If the queue size
     * exceeds this value, then excessive metrics will be dropped to prevent
     * resource exhaustion.
     */
    public static final int DEFAULT_METRICS_QSIZE = 1000;
    /**
     * Default timeout in millisecond for queue polling.  Set to one-minute
     * which is the finest granularity of Amazon CloudWatch. 
     */
    public static final int DEFAULT_QUEUE_POLL_TIMEOUT_MILLI = (int)TimeUnit.MINUTES.toMillis(1);

    /** Credentials for the uploader to communicate with Amazon CloudWatch */
    private AWSCredentialsProvider credentialsProvider;

    /**
     * Number of milliseconds to wait before the polling of the metrics queue
     * times out.
     */
    private long queuePollTimeoutMilli = DEFAULT_QUEUE_POLL_TIMEOUT_MILLI;

    /** 
     * Endpoint for Amazon CloudWatch where the metric data can be uploaded;
     * or null if the default endpoint is to be used.
     */
    private String cloudWatchEndPoint;
    
    private int metricQueueSize = DEFAULT_METRICS_QSIZE;

    /**
     * Returns the credential provider that holds the credentials to connect to
     * Amazon CloudWatch.
     */
    public AWSCredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    /**
     * Sets the credential provider to the given provider. This credential
     * provider is used by the uploader thread to connect to Amazon CloudWatch.
     */
    public void setCredentialsProvider(AWSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

    public CloudWatchMetricConfig withCredentialsProvider(AWSCredentialsProvider credentialsProvider) {
        setCredentialsProvider(credentialsProvider);
        return this;
    }

    /**
     * Returns the metrics queue polling timeout in millisecond.
     */
    public long getQueuePollTimeoutMilli() {
        return queuePollTimeoutMilli;
    }

    /**
     * Sets the metric queue polling timeout in millisecond. The default set
     * set to one-minute per the finest granularity of Amazon CloudWatch
     */
    public void setQueuePollTimeoutMilli(long queuePollTimeoutMilli) {
        this.queuePollTimeoutMilli = queuePollTimeoutMilli;
    }

    public CloudWatchMetricConfig withQueuePollTimeoutMilli(long queuePollTimeoutMilli) {
        setQueuePollTimeoutMilli(queuePollTimeoutMilli);
        return this;
    }

    /**
     * Returns the end point of AmazonCloudWatch to upload the metrics.
     */
    public String getCloudWatchEndPoint() {
        return cloudWatchEndPoint;
    }

    /**
     * Sets the end point of AmazonCloudWatch to upload the metrics.
     */
    public void setCloudWatchEndPoint(String cloudWatchEndPoint) {
        this.cloudWatchEndPoint = cloudWatchEndPoint;
    }

    public CloudWatchMetricConfig withCloudWatchEndPoint(String cloudWatchEndPoint) {
        setCloudWatchEndPoint(cloudWatchEndPoint);
        return this;
    }

    public int getMetricQueueSize() {
        return metricQueueSize;
    }

    /**
     * Configure the metric queue size, overriding the default. Must be at
     * least 1.
     * 
     * @see #DEFAULT_METRICS_QSIZE
     */
    public void setMetricQueueSize(int metricQueueSize) {
        if (metricQueueSize < 1) {
            throw new IllegalArgumentException();
        }
        this.metricQueueSize = metricQueueSize;
    }

    public CloudWatchMetricConfig withMetricQueueSize(int metricQueueSize) {
        setMetricQueueSize(metricQueueSize);
        return this;
    }
}
