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

import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;

/**
 * A internal daemon thread used to upload request metrics to Amazon CloudWatch.
 */
class MetricUploaderThread extends Thread {
    private static final String THREAD_NAME = "java-sdk-metric-uploader";
    private volatile boolean cancelled;
    private final AmazonCloudWatchClient cloudwatchClient;
    private final Log log = LogFactory.getLog(getClass());
    private final BlockingRequestBuilder qIterator;

    MetricUploaderThread(CloudWatchMetricConfig config,
            BlockingQueue<MetricDatum> queue) {
        this(config, 
             queue, 
             config.getCredentialsProvider() == null 
             ? new AmazonCloudWatchClient() 
             : new AmazonCloudWatchClient(config.getCredentialsProvider()));
    }

    MetricUploaderThread(CloudWatchMetricConfig config, 
        BlockingQueue<MetricDatum> queue,
        AmazonCloudWatchClient client)
    {
        super(THREAD_NAME);
        if (config == null || queue == null) {
            throw new IllegalArgumentException();
        }
        this.cloudwatchClient = client;
        this.qIterator = new BlockingRequestBuilder(config, queue);
        String endpoint = config.getCloudWatchEndPoint(); 
        if (endpoint != null)
            cloudwatchClient.setEndpoint(endpoint);
        this.setPriority(MIN_PRIORITY);
        setDaemon(true);
    }

    @Override
    public void run() {
        while (!cancelled) {
            try {
                Iterable<PutMetricDataRequest> requests = qIterator.nextUploadUnits();
                for (PutMetricDataRequest req: requests) {
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

    public AmazonCloudWatchClient getCloudwatchClient() {
        return cloudwatchClient;
    }
}
