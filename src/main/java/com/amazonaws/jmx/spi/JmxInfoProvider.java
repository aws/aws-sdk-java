/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.jmx.spi;

import org.apache.commons.logging.LogFactory;

/**
 * SPI used to retrieve JMX information and can survive the absence of JMX.
 */
public interface JmxInfoProvider {
    public long[] getFileDecriptorInfo();
    public int getThreadCount();
    public int getDaemonThreadCount();
    public int getPeakThreadCount();
    public long getTotalStartedThreadCount();
    public long[] findDeadlockedThreads();
    public boolean isEnabled();

    public static class Factory {
        private static final JmxInfoProvider provider;
        static {
            JmxInfoProvider p;
            try {
                Class<?> c = Class.forName("com.amazonaws.jmx.JmxInfoProviderSupport");
                p = (JmxInfoProvider)c.newInstance();
            } catch (Exception e) {
                LogFactory
                    .getLog(JmxInfoProvider.class)
                    .debug("Failed to load the JMX implementation module - JMX is disabled", e);
                p = NONE;
            }
            provider = p;
        }
        public static JmxInfoProvider getJmxInfoProvider() {
            return provider;
        }
    }

    static final JmxInfoProvider NONE = new JmxInfoProvider() {
        @Override
        public long[] getFileDecriptorInfo() {
            return null;
        }

        @Override
        public int getThreadCount() {
            return 0;
        }

        @Override
        public int getDaemonThreadCount() {
            return 0;
        }

        @Override
        public int getPeakThreadCount() {
            return 0;
        }

        @Override
        public long getTotalStartedThreadCount() {
            return 0;
        }

        @Override
        public long[] findDeadlockedThreads() {
            return null;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }
    };
}
