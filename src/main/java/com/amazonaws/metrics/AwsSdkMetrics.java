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

package com.amazonaws.metrics;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.metrics.RequestMetricCollector.Factory;

/**
 * Used to control the default AWS SDK metric collection system.
 */
public enum AwsSdkMetrics {
    ;
    public static final String METRICS_NAMESPACE = "AWSSDK/Java";
    /**
     * System property used to enable the default metrics collected by the AWS
     * SDK, which uploads the derived statistics to Amazon CloudWatch.
     */
    public static final String DEFAULT_METRICS_SYSTEM_PROPERTY = "com.amazonaws.sdk.enableDefaultMetrics";
    private static final String DEFAULT_REQUEST_METRIC_COLLECTOR_FACTORY = "com.amazonaws.metrics.internal.cloudwatch.DefaultRequestMetricCollectorFactory";
    private static final boolean defaultMetricsEnabled = System.getProperty(DEFAULT_METRICS_SYSTEM_PROPERTY) != null;
    private static volatile RequestMetricCollector mc;
    /**
     * Used to disallow re-entrancy in enabling the default metric collection system. 
     */
    private static boolean dirtyEnabling;

    /**
     * Returns a non-null request metric collector for the SDK. If no custom
     * request metric collector has previously been specified via
     * {@link #setRequestMetricCollector(RequestMetricCollector)} and the
     * {@link #DEFAULT_METRICS_SYSTEM_PROPERTY} has been set, then this method
     * will initialize and return the default metric collector provided by the
     * AWS SDK on a best-attempt basis.
     */
    public static <T extends RequestMetricCollector> T getRequestMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T)(mc == null ? RequestMetricCollector.NONE : mc); 
        return t; 
    }

    /**
     * Sets the request metric collector to be used by the AWS SDK, and stop the
     * previously running collector used by the AWS SDK, if any. Note, however,
     * a request metric collector specified at the web service client level or
     * request level, if any, always takes precedence over the one specified at
     * the AWS SDK level.
     * <p>
     * Caller of this method is responsible for starting the new request metric
     * collector specified as the input parameter.
     * 
     * @param mc
     *            the request metric collector to be used by the AWS SDK; or
     *            null if no request metric collection is to be performed
     *            at the AWS SDK level.
     * 
     * @see RequestMetricCollector
     * @see RequestMetricCollector#NONE
     */
    public static synchronized void setRequestMetricCollector(RequestMetricCollector mc) {
        RequestMetricCollector old = AwsSdkMetrics.mc;
        AwsSdkMetrics.mc = mc;
        if (old != null) {
            old.stop();
        }
    }

    /**
     * Returns true if the system property
     * {@link AwsSdkMetrics#DEFAULT_METRICS_SYSTEM_PROPERTY} has been
     * set; false otherwise.
     */
    public static boolean isDefaultMetricsEnabled() {
        return defaultMetricsEnabled;
    }
    /**
     * Enables the default metrics collection system used by the AWS SDK, but
     * only if no request metric collector is currently in use.
     */
    private static synchronized void enableDefaultMetrics() {
        if (mc == null) {
            if (dirtyEnabling) {
                throw new IllegalStateException("Reentrancy is not allowed");
            }
            dirtyEnabling = true;
            try {
                Class<?> c = Class.forName(DEFAULT_REQUEST_METRIC_COLLECTOR_FACTORY);
                RequestMetricCollector.Factory f = (Factory)c.newInstance();
                RequestMetricCollector instance = f.getInstance();
                if (instance != null) {
                    setRequestMetricCollector(instance);
                    return;
                }
            } catch (Exception e) {
                LogFactory.getLog(AwsSdkMetrics.class)
                    .warn("Failed to enable the default metrics", e);
            } finally {
                dirtyEnabling = false;
            }
        }
        return;
    }
}
