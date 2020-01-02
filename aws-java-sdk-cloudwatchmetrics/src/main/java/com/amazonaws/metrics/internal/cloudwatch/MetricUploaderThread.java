/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.cloudwatch.AmazonCloudWatch;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.ValidationUtils;
import java.util.concurrent.BlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.util.VersionInfoUtils;

/**
 * A internal daemon thread used to upload request metrics to Amazon CloudWatch.
 */
@SdkInternalApi
class MetricUploaderThread extends Thread {
    private static final String USER_AGENT = MetricUploaderThread.class.getName() + "/" + VersionInfoUtils.getVersion();
    private static final String THREAD_NAME = "java-sdk-metric-uploader";
    private volatile boolean cancelled;
    private final AmazonCloudWatch cloudwatchClient;
    private final Log log = LogFactory.getLog(getClass());
    private final BlockingRequestBuilder qIterator;

    MetricUploaderThread(CloudWatchMetricConfig config,
            BlockingQueue<MetricDatum> queue) {
        this(config,
             queue,
             createCloudWatchClient(config));
    }

    private static AmazonCloudWatch createCloudWatchClient(
            CloudWatchMetricConfig config) {

        if (config.getCloudWatchEndPoint() != null && config.getEndpointConfiguration() != null) {
            throw new IllegalArgumentException("Both cloudWatchEndpoint and endpointConfiguration are specified and "
                                               + "only one should be specified (cloudWatchEndpoint is deprecated in favor of"
                                               + " endpointConfiguration)");
        }

        AmazonCloudWatchClientBuilder amazonCloudWatchClientBuilder = AmazonCloudWatchClient.builder();

        amazonCloudWatchClientBuilder.withClientConfiguration(config.getClientConfiguration());
        amazonCloudWatchClientBuilder.withCredentials(config.getCredentialsProvider());
        amazonCloudWatchClientBuilder.withEndpointConfiguration(config.getEndpointConfiguration());

        if (config.getCloudWatchEndPoint() != null) {
            String cloudWatchEndPoint = config.getCloudWatchEndPoint();
            String region = AwsHostNameUtils.parseRegion(cloudWatchEndPoint, AmazonCloudWatch.ENDPOINT_PREFIX);
            amazonCloudWatchClientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(cloudWatchEndPoint, region));
        }

        return amazonCloudWatchClientBuilder.build();
    }

    @SdkTestInternalApi
    MetricUploaderThread(CloudWatchMetricConfig config,
        BlockingQueue<MetricDatum> queue,
        AmazonCloudWatch client)
    {
        super(THREAD_NAME);

        ValidationUtils.assertNotNull(config, "config");
        ValidationUtils.assertNotNull(queue, "queue");

        this.cloudwatchClient = client;
        this.qIterator = new BlockingRequestBuilder(config, queue);

        this.setPriority(MIN_PRIORITY);
        setDaemon(true);
    }

    @Override
    public void run() {
        while (!cancelled) {
            try {
                Iterable<PutMetricDataRequest> requests = qIterator.nextUploadUnits();
                for (PutMetricDataRequest req: requests) {
                    appendUserAgent(req);
                    log.debug(req);
                    cloudwatchClient.putMetricData(req);
                    Thread.yield();
                }
            } catch(InterruptedException e) {
                if (!cancelled) {
                    log.debug("Unexpected interruption ignored");
                }
            } catch(Throwable t) {
                log.warn("Unexpected condition; soldier on", t);
                Thread.yield();
            }
        }
    }

    void cancel() { cancelled = true; }

    AmazonCloudWatchClient getCloudwatchClient() {
        return (AmazonCloudWatchClient) cloudwatchClient;
    }

    private void appendUserAgent(PutMetricDataRequest request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
    }

}
