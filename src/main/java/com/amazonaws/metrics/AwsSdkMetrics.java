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
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_METRICS_SYSTEM_PROPERTY;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.AWSServiceMetrics;
import com.amazonaws.util.jmx.MBeans;

/**
 * Used to control the default AWS SDK metric collection system.
 * <p>
 * The default metric collection of the Java AWS SDK is disabled by
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
 * SPI {@link MetricCollector}, and then replace the default AWS SDK
 * implementation of the collector via
 * {@link #setMetricCollector(MetricCollector)}.
 * <p>
 * Alternatively, for limited customization of the internal collector
 * implementation provided by the AWS SDK, one can extend the internal Amazon
 * CloudWatch metric collector. See the javadoc at
 * com.amazonaws.metrics.internal.cloudwatch.CloudWatchMetricConfig for
 * more details.
 */
public enum AwsSdkMetrics {
    ;
    public static final String METRICS_NAMESPACE = "AWSSDK/Java";
    private static final String MBEAN_OBJECT_NAME =
        "com.amazonaws.management:type=" + AwsSdkMetrics.class.getSimpleName();
    /**
     * Used to exclude the generation of JVM metrics when the AWS SDK default
     * metrics is enabled when starting up the JVM.
     * 
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=excludeJvmMetrics
     * </pre>
     */
    public static final String EXCLUDE_MACHINE_METRICS = "excludeMachineMetrics";

    public static final String AWS_CREDENTAIL_PROPERTIES_FILE= "credentialFile";
    public static final String CLOUDWATCH_REGION = "cloudwatchRegion";
    public static final String METRIC_QUEUE_SIZE = "metricQueueSize"; 
    public static final String QUEUE_POLL_TIMEOUT_MILLI = "getQueuePollTimeoutMilli"; 
    
    private static final String DEFAULT_METRIC_COLLECTOR_FACTORY =
        "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";
    /**
     * True iff the system property {@link #DEFAULT_METRICS_SYSTEM_PROPERTY} has
     * been set; false otherwise.
     */
    private static final boolean defaultMetricsEnabled;
    /**
     * True if machine metrics is to be excluded; false otherwise.
     */
    private static volatile boolean machineMetricsExcluded;
    private static volatile AWSCredentialsProvider credentialProvider;
    private static volatile Regions region;
    private static volatile Integer metricQueueSize;
    private static volatile Long queuePollTimeoutMilli;

    static {
        String defaultMetrics = System.getProperty(DEFAULT_METRICS_SYSTEM_PROPERTY);
        defaultMetricsEnabled = defaultMetrics != null;
        if (defaultMetricsEnabled) {
            String[] values = defaultMetrics.split(",");
            boolean excludeMachineMetrics = false;
            for (String s: values) {
                String part = s.trim();
                if (!excludeMachineMetrics && EXCLUDE_MACHINE_METRICS.equals(part)) {
                    excludeMachineMetrics = true;
                } else {
                    String[] pair = part.split("=");
                    if (pair.length == 2) {
                        String key = pair[0].trim();
                        String value  = pair[1].trim();
                        try {
                            if (AWS_CREDENTAIL_PROPERTIES_FILE.equals(key)) {
                                final PropertiesCredentials cred;
                                    cred = new PropertiesCredentials(new File(value));
                                    credentialProvider = new AWSCredentialsProvider() {
                                        @Override public void refresh() {}
                                        @Override public AWSCredentials getCredentials() { return cred; }
                                    };
                            } else if (CLOUDWATCH_REGION.equals(key)) {
                                region = Regions.fromName(value);
                            } else if (METRIC_QUEUE_SIZE.equals(key)) {
                                Integer i = new Integer(value);
                                if (i.intValue() < 1)
                                    throw new IllegalArgumentException(METRIC_QUEUE_SIZE + " must be at least 1");
                                metricQueueSize = i;
                            } else if (QUEUE_POLL_TIMEOUT_MILLI.equals(key)) {
                                Long i = new Long(value);
                                if (i.intValue() < 1000)
                                    throw new IllegalArgumentException(QUEUE_POLL_TIMEOUT_MILLI + " must be at least 1000");
                                queuePollTimeoutMilli = i;
                            } else {
                                LogFactory.getLog(AwsSdkMetrics.class).debug("Ignoring unrecognized parameter: " + part);
                            }
                        } catch (Exception e) {
                            LogFactory.getLog(AwsSdkMetrics.class).debug("Ignoring failure", e);
                        }
                    }
                }
            }
            machineMetricsExcluded = excludeMachineMetrics;
        }
    }

    private static final MetricRegistry registry = new MetricRegistry();
    private static volatile MetricCollector mc;
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
     * {@link #setMetricCollector(MetricCollector)} and the
     * {@link SDKGlobalConfiguration#DEFAULT_METRICS_SYSTEM_PROPERTY} has been set, then this method
     * will initialize and return the default metric collector provided by the
     * AWS SDK on a best-attempt basis.
     */
    public static <T extends RequestMetricCollector> T getRequestMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T)(mc == null ? RequestMetricCollector.NONE : mc.getRequestMetricCollector()); 
        return t; 
    }

    public static <T extends ServiceMetricCollector> T getServiceMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T)(mc == null ? ServiceMetricCollector.NONE : mc.getServiceMetricCollector());
        return t; 
    }

    public static <T extends MetricCollector> T getMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T)(mc == null ? MetricCollector.NONE : mc);
        return t; 
    }

    /**
     * Sets the metric collector to be used by the AWS SDK, and stop the
     * previously running collector used by the AWS SDK, if any. Note, however,
     * a request metric collector specified at the web service client level or
     * request level, if any, always takes precedence over the one specified at
     * the AWS SDK level.
     * <p>
     * Caller of this method is responsible for starting the new metric
     * collector specified as the input parameter.
     * 
     * @param mc
     *            the metric collector to be used by the AWS SDK; or
     *            null if no metric collection is to be performed
     *            at the AWS SDK level.
     * 
     * @see RequestMetricCollector
     * @see RequestMetricCollector#NONE
     */
    public static synchronized void setMetricCollector(MetricCollector mc) {
        MetricCollector old = AwsSdkMetrics.mc;
        AwsSdkMetrics.mc = mc;
        if (old != null) {
            old.stop();
        }
    }

    /**
     * Used to set whether the machine metrics is to be excluded.
     * 
     * @param excludeMachineMetrics true if machine metrics is to be excluded;
     * false otherwise.
     */
    public static void setMachineMetricsExcluded(boolean excludeMachineMetrics) {
        AwsSdkMetrics.machineMetricsExcluded = excludeMachineMetrics;
    }

    /**
     * Returns true if the system property
     * {@link SDKGlobalConfiguration#DEFAULT_METRICS_SYSTEM_PROPERTY} has been
     * set; false otherwise.
     */
    public static boolean isDefaultMetricsEnabled() {
        return defaultMetricsEnabled;
    }

    /**
     * Returns true if metrics at the AWS SDK level is enabled; false
     * if disabled.
     */
    public static boolean isMetricsEnabled() {
        MetricCollector mc = AwsSdkMetrics.mc;
        return mc != null && mc.isEnabled();
    }

    /**
     * Returns true if machine metrics is to be excluded.
     */
    public static boolean isMachineMetricExcluded() {
        return machineMetricsExcluded;
    }

    /**
     * Starts the default AWS SDK metric collector, but
     * only if no metric collector is currently in use at the AWS SDK
     * level.
     * 
     * @return true if the default AWS SDK metric collector has been
     *         successfully started by this call; false otherwise.
     */
    public static synchronized boolean enableDefaultMetrics() {
        if (mc == null || !mc.isEnabled()) {
            if (dirtyEnabling) {
                throw new IllegalStateException("Reentrancy is not allowed");
            }
            dirtyEnabling = true;
            try {
                Class<?> c = Class.forName(DEFAULT_METRIC_COLLECTOR_FACTORY);
                MetricCollector.Factory f = (MetricCollector.Factory)c.newInstance();
                MetricCollector instance = f.getInstance();
                if (instance != null) {
                    setMetricCollector(instance);
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
     * Convenient method to disable the metric collector at the AWS SDK
     * level.
     */
    public static void disableMetrics() {
        setMetricCollector(MetricCollector.NONE);
    }

    /**
     * Adds the given metric type to the registry of predefined metrics to be
     * captured at the AWS SDK level.
     * 
     * @return true if the set of predefined metric types gets changed as a
     *        result of the call
     */
    public static boolean add(MetricType type) {
        return type == null ? false : registry.addMetricType(type);
    }
    /**
     * Adds the given metric types to the registry of predefined metrics to be
     * captured at the AWS SDK level.
     * 
     * @return true if the set of predefined metric types gets changed as a
     *        result of the call
     */
    public static <T extends MetricType> boolean addAll(Collection<T> types) {
        return types == null || types.size() == 0
             ? false
             : registry.addMetricTypes(types);
    }
    /**
     * Sets the given metric types to replace the registry of predefined metrics
     * to be captured at the AWS SDK level.
     */
    public static <T extends MetricType> void set(Collection<T> types) {
        registry.setMetricTypes(types);
    }
    /**
     * Removes the given metric type from the registry of predefined metrics to
     * be captured at the AWS SDK level.
     * 
     * @return true if the set of predefined metric types gets changed as a
     *        result of the call
     */
    public static boolean remove(MetricType type) {
        return type == null ? false : registry.removeMetricType(type);
    }
    /**
     * Returns an unmodifiable set of the current predefined metrics.
     */
    public static Set<MetricType> getPredefinedMetrics() {
        return registry.predefinedMetrics();
    }

    /**
     * Returns the credential provider for the default AWS SDK metric implementation.
     * This method is restricted to calls from the default AWS SDK metric implementation.
     * 
     * @throws SecurityException if called outside the default AWS SDK metric implementation.
     */
    public static AWSCredentialsProvider getCredentialProvider() {
        StackTraceElement[] e = Thread.currentThread().getStackTrace();
        for (int i=0; i < e.length; i++) {
            if (e[i].getClassName().equals(DEFAULT_METRIC_COLLECTOR_FACTORY)) {
                return credentialProvider;
            }
        }
        SecurityException ex = new SecurityException();
        LogFactory.getLog(AwsSdkMetrics.class).warn("Illegal attempt to access the credential provider", ex);
        throw ex;
    }

    /**
     * Sets the credential provider for the default AWS SDK metric implementation;
     * or null if the default is to be used.
     */
    public static void setCredentialProvider(AWSCredentialsProvider provider) {
        credentialProvider = provider;
    }

    /**
     * Returns the region configured for the default AWS SDK metric collector;
     * or null if the default is to be used.
     */
    public static Regions getRegion() {
        return region;
    }

    /**
     * Sets the region to be used for the default AWS SDK metric collector;
     * or null if the default is to be used.
     */
    public static void setRegion(Regions region) {
        AwsSdkMetrics.region = region;
    }

    /**
     * Returns the internal metric queue size to be used for the default AWS SDK
     * metric collector; or null if the default is to be used.
     */
    public static Integer getMetricQueueSize() {
        return metricQueueSize;
    }
    
    /**
     * Sets the metric queue size to be used for the default AWS SDK metric collector;
     * or null if the default is to be used.
     */
    public static void setMetricQueueSize(Integer size) {
        metricQueueSize = size;
    }

    /**
     * Returns the internal metric queue timeout in millisecond to be used for
     * the default AWS SDK metric collector; or null if the default is to be
     * used.
     */
    public static Long getQueuePollTimeoutMilli() {
        return queuePollTimeoutMilli;
    }

    /**
     * Sets the queue poll time in millisecond to be used for the default AWS
     * SDK metric collector; or null if the default is to be used.
     */
    public static void setQueuePollTimeoutMilli(Long timeoutMilli) {
        queuePollTimeoutMilli = timeoutMilli;
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
         * Returns the name of the service metric collector set at the AWS SDK
         * level, or NONE if there is none.
         */
        public String getServiceMetricCollector();
        /**
         * Starts the default AWS SDK metric collector, but only if no
         * metric collector is currently in use at the AWS SDK level.
         * 
         * @return true if the default AWS SDK metric collector has been
         *         successfully started by this call; false otherwise.
         */
        public boolean enableDefaultMetrics();
        /**
         * Disables the metric collector at the AWS SDK level.
         */
        public void disableMetrics();
        /**
         * Returns true if machine metrics is to be excluded; false otherwise.
         */
        public boolean isMachineMetricsExcluded();
        /**
         * Used to set whether the JVM metrics is to be excluded.
         * 
         * @param excludeMachineMetrics true if JVM metrics is to be excluded;
         * false otherwise.
         */
        public void setMachineMetricsExcluded(boolean excludeMachineMetrics);
        
        /**
         * Returns the region configured for the default AWS SDK metric collector;
         * or null if the default is to be used.
         */
        public String getRegion();
        
        /**
         * Sets the region to be used for the default AWS SDK metric collector;
         * or null if the default is to be used.
         */
        public void setRegion(String region);
        /**
         * Returns the internal metric queue size to be used for the default AWS SDK
         * metric collector; or null if the default is to be used.
         */
        public Integer getMetricQueueSize();
        /**
         * Sets the metric queue size to be used for the default AWS SDK metric collector;
         * or null if the default is to be used.
         */
        public void setMetricQueueSize(Integer metricQueueSize);
        
        /**
         * Returns the internal metric queue timeout in millisecond to be used
         * for the default AWS SDK metric collector; or null if the default is
         * to be used. Use Integer instead of Long as it seems jconsole does not
         * handle Long properly.
         */
        public Integer getQueuePollTimeoutMilli();

        /**
         * Sets the queue poll time in millisecond to be used for the default
         * AWS SDK metric collector; or null if the default is to be used. Use
         * Integer instead of Long as it seems jconsole does not handle Long
         * properly.
         */
        public void setQueuePollTimeoutMilli(Integer timeoutMilli);
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
            MetricCollector mc = AwsSdkMetrics.mc;
            RequestMetricCollector rmc = mc == null ? null : mc.getRequestMetricCollector();
            return mc == null || rmc == RequestMetricCollector.NONE
                 ? "NONE"
                 : rmc.getClass().getName()
                 ;
        }
        @Override
        public String getServiceMetricCollector() {
            MetricCollector mc = AwsSdkMetrics.mc;
            ServiceMetricCollector smc = mc == null ? null : mc.getServiceMetricCollector();
            return mc == null || smc == ServiceMetricCollector.NONE
                 ? "NONE"
                 : smc.getClass().getName()
                 ;
        }
        @Override
        public boolean isMetricsEnabled() {
            return AwsSdkMetrics.isMetricsEnabled();
        }

        @Override
        public boolean isMachineMetricsExcluded() {
            return machineMetricsExcluded;
        }
        @Override
        public void setMachineMetricsExcluded(boolean excludeJvmMetrics) {
            AwsSdkMetrics.setMachineMetricsExcluded(excludeJvmMetrics);
        }
        @Override
        public String getRegion() {
            return region == null ? null : region.getName();
        }
        @Override
        public void setRegion(String region) {
            if (region == null || region.isEmpty())
                AwsSdkMetrics.setRegion(null);
            else {
                AwsSdkMetrics.setRegion(Regions.fromName(region));
            }
        }
        @Override
        public Integer getMetricQueueSize() {
            return metricQueueSize;
        }
        @Override
        public void setMetricQueueSize(Integer metricQueueSize) {
            AwsSdkMetrics.setMetricQueueSize(metricQueueSize);
            
        }
        @Override
        public Integer getQueuePollTimeoutMilli() {
            return queuePollTimeoutMilli == null ? null : queuePollTimeoutMilli.intValue();
        }
        @Override
        public void setQueuePollTimeoutMilli(Integer timeoutMilli) {
            AwsSdkMetrics.setQueuePollTimeoutMilli(timeoutMilli == null ? null : timeoutMilli.longValue());
        }
    }

    /**
     * Used as a registry for the predefined metrics to be captured by the
     * metric collector at the AWS SDK level.
     */
    private static class MetricRegistry {
        private final Set<MetricType> metricTypes = new HashSet<MetricType>();
        private volatile Set<MetricType> readOnly;

        MetricRegistry() {
            metricTypes.add(Field.ClientExecuteTime);
            metricTypes.add(Field.Exception);
            metricTypes.add(Field.HttpClientRetryCount);
            metricTypes.add(Field.HttpRequestTime);
            metricTypes.add(Field.RequestCount);
//            metricTypes.add(Field.RequestSigningTime);
//            metricTypes.add(Field.ResponseProcessingTime);
            metricTypes.add(Field.RetryCount);
            metricTypes.add(Field.HttpClientSendRequestTime);
            metricTypes.add(Field.HttpClientReceiveResponseTime);
            metricTypes.add(AWSServiceMetrics.HttpClientGetConnectionTime);
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
        public <T extends MetricType> void setMetricTypes(Collection<T> types) {
            synchronized(metricTypes) {
                if (types == null || types.size() == 0) {
                    if (metricTypes.size() == 0)
                        return;
                    if (types == null)
                        types = Collections.emptyList();
                }
                metricTypes.clear();
                if (!addMetricTypes(types)) {
                    syncReadOnly(); // avoid missing sync
                }
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
