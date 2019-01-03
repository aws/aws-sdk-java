/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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
package com.amazonaws.jmx;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.List;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.jmx.spi.JmxInfoProvider;

public class JmxInfoProviderSupport implements JmxInfoProvider {
    @Override
    public long[] getFileDecriptorInfo() {
        MBeanServer mbsc = MBeans.getMBeanServer();
        AttributeList attributes;
        try {
            attributes = mbsc.getAttributes(
                new ObjectName("java.lang:type=OperatingSystem"), 
                new String[]{"OpenFileDescriptorCount", "MaxFileDescriptorCount"});
            List<Attribute> attrList = attributes.asList();
            long openFdCount = (Long)attrList.get(0).getValue();
            long maxFdCount = (Long)attrList.get(1).getValue();
            long[] fdCounts = { openFdCount, maxFdCount};
            return fdCounts;
        } catch (Exception e) {
            LogFactory.getLog(SdkMBeanRegistrySupport.class).debug(
                    "Failed to retrieve file descriptor info", e);
        }
        return null;
    }

    @Override
    public int getThreadCount() {
      ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
      return threadMXBean.getThreadCount();
    }

    @Override
    public int getDaemonThreadCount() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return threadMXBean.getDaemonThreadCount();
    }

    @Override
    public int getPeakThreadCount() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return threadMXBean.getPeakThreadCount();
    }

    @Override
    public long getTotalStartedThreadCount() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return threadMXBean.getTotalStartedThreadCount();
    }

    @Override
    public long[] findDeadlockedThreads() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return threadMXBean.findDeadlockedThreads();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
