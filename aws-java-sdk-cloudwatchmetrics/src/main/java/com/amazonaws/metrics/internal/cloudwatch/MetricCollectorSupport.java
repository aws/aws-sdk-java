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

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.metrics.MetricCollector;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.metrics.ServiceMetricCollector;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;

/**
 * This is the default implementation of an AWS SDK request metric collection
 * system.
 * 
 * @see RequestMetricCollector
 */
@ThreadSafe
public class MetricCollectorSupport extends MetricCollector {
    protected final static Log log = LogFactory.getLog(MetricCollectorSupport.class);
    private static volatile MetricCollectorSupport singleton;
    
    /** Returns the singleton instance; or null if there isn't one. */
    static MetricCollectorSupport getInstance() {
        return singleton;
    }

    /** 
     * Starts a new CloudWatch collector if it's not already started.
     *
     * @return true if it is successfully started by this call; false if the
     * collector is already running or if there is failure in trying to start
     * the collector for the first time. 
     */
    static synchronized boolean startSingleton(CloudWatchMetricConfig config) {
        if (singleton != null) {
            return false;
        }
        log.info("Initializing " + MetricCollectorSupport.class.getSimpleName());
        return createAndStartCollector(config);
    }

    /** Retarts with a new CloudWatch collector. */
    static synchronized boolean restartSingleton(CloudWatchMetricConfig config) {
        if (singleton == null) {
            throw new IllegalStateException(MetricCollectorSupport.class.getSimpleName()
                + " has neven been initialized");
        }
        log.info("Re-initializing " + MetricCollectorSupport.class.getSimpleName());
        singleton.stop();
        // singleton is set to null at this point via the stop method
        return createAndStartCollector(config);
    }

    /**
     * Returns true if the collector is successfully created and started;
     * false otherwise.
     */
    private static boolean createAndStartCollector(CloudWatchMetricConfig config) {
        MetricCollectorSupport collector = new MetricCollectorSupport(config);
        if (collector.start()) {
            singleton = collector;
            return true;
        }
        return false;
    }

    private final RequestMetricCollectorSupport requestMetricCollector;
    private final ServiceMetricCollectorSupport serviceMetricCollector;

    private final BlockingQueue<MetricDatum> queue;
//    private final PredefinedMetricTransformer transformer = new PredefinedMetricTransformer();
    private final CloudWatchMetricConfig config;
    private MetricUploaderThread uploaderThread;

    protected MetricCollectorSupport(CloudWatchMetricConfig config) {
        if (config == null) {
            throw new IllegalArgumentException();
        }
        this.config = config;
        this.queue = new LinkedBlockingQueue<MetricDatum>(config.getMetricQueueSize());
        this.requestMetricCollector = new RequestMetricCollectorSupport(queue);
        this.serviceMetricCollector = new ServiceMetricCollectorSupport(queue);
    }

    @Override
    public boolean start() {
        synchronized(MetricCollectorSupport.class) {
            if (uploaderThread != null) {
                return false;   // already started
            }
            uploaderThread = new MetricUploaderThread(config, queue);
            uploaderThread.start();
        }
        return true;
    }

    /**
     * Stops this collector immediately, dropping all pending metrics in memory.
     */
    @Override
    public boolean stop() {
        synchronized(MetricCollectorSupport.class) {
            if (uploaderThread != null) {
                uploaderThread.cancel();
                uploaderThread.interrupt();
                uploaderThread = null;
                if (singleton == this) { // defensive check
                    singleton = null;
                }
                return true;
            }
        }
        return false;
    }

    /** Returns the configuration. */
    public CloudWatchMetricConfig getConfig() { return config; }

    public AmazonCloudWatchClient getCloudwatchClient() {
        return uploaderThread == null ? null : uploaderThread.getCloudwatchClient();
    }
    /** Always returns true. */
    @Override public final boolean isEnabled() { return true; }

    @Override
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    @Override 
    public ServiceMetricCollector getServiceMetricCollector() {
        return serviceMetricCollector;
    }
}
