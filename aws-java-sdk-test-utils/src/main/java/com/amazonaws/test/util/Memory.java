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
package com.amazonaws.test.util;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.lang.management.MemoryUsage;
import java.util.Iterator;

/**
 * Used to retrieve information about the JVM memory.
 */
public enum Memory {
    ;
    /**
     * Returns a summary information about the heap memory.
     */
    public static String heapSummary() {
        Runtime rt = Runtime.getRuntime();
        final long totalMem = rt.totalMemory();
        final long freeMem = rt.freeMemory();
        final long usedMem = totalMem - freeMem;
        final long spareMem = rt.maxMemory() - usedMem;
        return String.format(
                "Heap usedMem=%d (KB), freeMem=%d (KB), spareMem=%d (KB)\n",
                usedMem / 1024, freeMem / 1024, spareMem / 1024);
    }

    /**
     * Returns a summary information about the memory pools.
     */
    public static String poolSummaries() {
        // Why ? list-archive?4273859
        // How ? http://stackoverflow.com/questions/697336/how-do-i-programmatically-find-out-my-permgen-space-usage
        //       http://stackoverflow.com/questions/8356416/xxmaxpermsize-with-or-without-xxpermsize
        StringBuilder sb = new StringBuilder();
        Iterator<MemoryPoolMXBean> iter =
            ManagementFactory.getMemoryPoolMXBeans().iterator();
        while (iter.hasNext()) {
            MemoryPoolMXBean item = iter.next();
            String name = item.getName();
            MemoryType type = item.getType();
            MemoryUsage usage = item.getUsage();
            MemoryUsage peak = item.getPeakUsage();
            MemoryUsage collections = item.getCollectionUsage();
            sb.append(String.format("Memory pool name: " + name
                + ", type: " + type
                + ", usage: " + usage
                + ", peak: " + peak
                + ", collections: " + collections
                + "\n"));
        }
        return sb.toString();
    }
}
