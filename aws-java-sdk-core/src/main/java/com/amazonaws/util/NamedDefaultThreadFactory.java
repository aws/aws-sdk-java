/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * An implementation of {@link ThreadFactory} that is based off of the default implementation in the java libraries
 * except that it inserts a custom name instead of a pool number. The name is also sequenced with a number to allow
 * for multiple pools with the same name to be created and still be distinguishable from each other. A threadsafe cache
 * is used to keep track of the sequence number for any given name.
 */
@SdkInternalApi
public class NamedDefaultThreadFactory implements ThreadFactory {
    private static final Map<String, AtomicInteger> poolNumberMap = new ConcurrentHashMap<String, AtomicInteger>();

    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;

    public static NamedDefaultThreadFactory of(String name) {
        return new NamedDefaultThreadFactory(name);
    }

    private NamedDefaultThreadFactory(String name) {
        AtomicInteger poolNumber = getPoolNumberForName(name);
        SecurityManager s = System.getSecurityManager();
        group = (s != null)? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
        namePrefix = "pool-" + name + "-" + poolNumber.getAndIncrement() + "-thread-";
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);

        if (t.isDaemon()) {
            t.setDaemon(false);
        }

        if (t.getPriority() != Thread.NORM_PRIORITY) {
            t.setPriority(Thread.NORM_PRIORITY);
        }

        return t;
    }

    private static AtomicInteger getPoolNumberForName(String name) {
        AtomicInteger poolNumber = poolNumberMap.get(name);

        if (poolNumber == null) {
            synchronized (NamedDefaultThreadFactory.class) {
                poolNumber = poolNumberMap.get(name);

                if (poolNumber == null) {
                    poolNumber = new AtomicInteger(1);
                    poolNumberMap.put(name, poolNumber);
                }
            }
        }

        return poolNumber;
    }
}
