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

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.metrics.RequestMetricCollector.Factory;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.jmx.MBeans;

/**
 * Used to control the default AWS SDK metric collection system.
 * <p>
 * The default request metric collection of the Java AWS SDK is disabled by
 * default. To enable it, simply specify the system property
 * <b>"com.amazonaws.sdk.enableDefaultMetrics"</b> when starting up the JVM.
 * When the system property is specified, a default metric collector will be
 * started at the AWS SDK level. The default implementation uploads the
 * request/response metrics captured to Amazon CloudWatch using AWS credentials
 * obtained via the {@link DefaultAWSCredentialsProviderChain}.
 * <p>
 * Instead of via system properties, the default AWS SDK metric collection can
 * also be enabled programmatically via {@link #enableDefaultMetrics()}.
 * Similarly, metric collection at the AWS SDK level can be disabled via
 * {@link #disableMetrics()}.
 * <p>
 * Clients who needs to fully customize the metric collection can implement the
 * SPI {@link RequestMetricCollector}, and then replace the default AWS SDK
 * implementation of the collector via
 * {@link #setRequestMetricCollector(RequestMetricCollector)}.
 * <p>
 * Alternatively, for limited customization of the internal collector
 * implementation provided by the AWS SDK, one can extend the internal Amazon
 * CloudWatch request metric collector. See the javadoc at
 * {@link com.amazonaws.metrics.internal.cloudwatch.CloudWatchMetricConfig} for
 * more details.
 */
public enum AwsSdkMetrics {
    ;
    public static final String METRICS_NAMESPACE = "AWSSDK/Java";
    private static final String MBEAN_OBJECT_NAME =
        "com.amazonaws.management:type=" + AwsSdkMetrics.class.getSimpleName();
    /**
     * System property used to enable the default metrics collected by the AWS
     * SDK, which uploads the derived statistics to Amazon CloudWatch.
     */
    public static final String DEFAULT_METRICS_SYSTEM_PROPERTY = "com.amazonaws.sdk.enableDefaultMetrics";
    private static final String DEFAULT_REQUEST_METRIC_COLLECTOR_FACTORY = "com.amazonaws.metrics.internal.cloudwatch.DefaultRequestMetricCollectorFactory";
    private static final boolean defaultMetricsEnabled = System.getProperty(DEFAULT_METRICS_SYSTEM_PROPERTY) != null;
    private static final MetricRegistry registry = new MetricRegistry();
    private static volatile RequestMetricCollector mc;
    /**
     * Used to disallow re-entrancy in enabling the default metric collection system. 
     */
    private static boolean dirtyEnabling;
    /** Exports AwsSdkMetrics for JMX access. */
    static {
        try {
            MBeans.registerMBean(MBEAN_OBJECT_NAME, new AwsSdkMetrics.Admin());
        } catch(Exception ex) {
            LogFactory.getLog(AwsSdkMetrics.class).warn("", ex);
        }
    }

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
     * Starts the default AWS SDK request metric collector, but
     * only if no request metric collector is currently in use at the AWS SDK
     * level.
     * 
     * @return true if the default AWS SDK request metric collector has been
     *         successfully started by this call; false otherwise.
     */
    public static synchronized boolean enableDefaultMetrics() {
        if (mc == null || !mc.isEnabled()) {
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
                    return true;
                }
            } catch (Exception e) {
                LogFactory.getLog(AwsSdkMetrics.class)
                    .warn("Failed to enable the default metrics", e);
            } finally {
                dirtyEnabling = false;
            }
        }
        return false;
    }

    /**
     * Convenient method to disable the request metric collector at the AWS SDK
     * level.
     */
    public static void disableMetrics() {
        setRequestMetricCollector(RequestMetricCollector.NONE);
    }

    /**
     * Adds the given metric type to the registry of predefined metrics to be
     * captured at the AWS SDK level.
     */
    public static boolean add(MetricType type) {
        return registry.addMetricType(type);
    }
    /**
     * Adds the given metric types to the registry of predefined metrics to be
     * captured at the AWS SDK level.
     */
    public static <T extends MetricType> boolean addAll(Collection<T> types) {
        return registry.addMetricTypes(types);
    }

    /**
     * Removes the given metric type from the registry of predefined metrics to
     * be captured at the AWS SDK level.
     */
    public static boolean remove(MetricType type) {
        return registry.removeMetricType(type);
    }
    /**
     * Returns an unmodifiable set of the current predefined metrics.
     */
    public static Set<MetricType> getPredefinedMetrics() {
        return registry.predefinedMetrics();
    }
    /**
     * MBean interface for AwsSdkMetrics administration.
     */
    public static interface AdminMBean {
        /**
         * Returns true if metrics at the AWS SDK level is enabled; false
         * if disabled.
         */
        public boolean isMetricsEnabled();
        /**
         * Returns the name of the request metric collector set at the AWS SDK
         * level, or NONE if there is none.
         */
        public String getRequestMetricCollector();
        
        /**
         * Starts the default AWS SDK request metric collector, but only if no
         * request metric collector is currently in use at the AWS SDK level.
         * 
         * @return true if the default AWS SDK request metric collector has been
         *         successfully started by this call; false otherwise.
         */
        public boolean enableDefaultMetrics();
        /**
         * Disables the request metric collector at the AWS SDK level.
         */
        public void disableMetrics();
    }

    /**
     *  Administration of AwsSdkMetrics as an MBean.
     */
    private static class Admin implements AdminMBean {
        @Override
        public boolean enableDefaultMetrics() {
            return AwsSdkMetrics.enableDefaultMetrics();
        }
        @Override
        public void disableMetrics() {
            AwsSdkMetrics.disableMetrics();
        }
        @Override
        public String getRequestMetricCollector() {
            RequestMetricCollector mc = AwsSdkMetrics.mc;
            return mc == null || mc == RequestMetricCollector.NONE
                 ? "NONE"
                 : mc.getClass().getName()
                 ;
        }
        @Override
        public boolean isMetricsEnabled() {
            RequestMetricCollector mc = AwsSdkMetrics.mc;
            return mc != null && mc.isEnabled();
        }
    }

    /**
     * Used as a registry for the predefined metrics to be captured by the
     * request metric collector at the AWS SDK level.
     */
    private static class MetricRegistry {
        private final Set<MetricType> metricTypes = new HashSet<MetricType>();
        private volatile Set<MetricType> readOnly;

        MetricRegistry() {
            metricTypes.add(Field.ClientExecuteTime);
            metricTypes.add(Field.HttpRequestTime);
            metricTypes.add(Field.RequestCount);
            metricTypes.add(Field.RequestSigningTime);
            metricTypes.add(Field.ResponseProcessingTime);
            metricTypes.add(Field.RetryCount);
            syncReadOnly();
        }

        private void syncReadOnly() {
            readOnly = Collections.unmodifiableSet(new HashSet<MetricType>(metricTypes));
        }

        public boolean addMetricType(MetricType type) {
            synchronized(metricTypes) {
                boolean added = metricTypes.add(type);
                if (added)
                    syncReadOnly();
                return added;
            }
        }
        public <T extends MetricType> boolean addMetricTypes(Collection<T> types) {
            synchronized(metricTypes) {
                boolean added = metricTypes.addAll(types);
                if (added)
                    syncReadOnly();
                return added;
            }
        }
        public boolean removeMetricType(MetricType type) {
            synchronized(metricTypes) {
                boolean removed = metricTypes.remove(type);
                if (removed)
                    syncReadOnly();
                return removed;
            }
        }
        public Set<MetricType> predefinedMetrics() {
            return readOnly;
        }
    }
}
