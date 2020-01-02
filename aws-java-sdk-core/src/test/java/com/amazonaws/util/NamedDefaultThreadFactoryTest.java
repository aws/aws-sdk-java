/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.Executors;

import org.junit.Assert;
import org.junit.Test;

public class NamedDefaultThreadFactoryTest {
    private Runnable doNothingRunnable = new Runnable() {
        @Override
        public void run() {
            // do nothing
        }
    };

    @Test
    public void multipleThreads_samePool_areNamedCorrectly() {
        NamedDefaultThreadFactory namedDefaultThreadFactory = NamedDefaultThreadFactory.of("fakeservice1");

        Thread thread1 = namedDefaultThreadFactory.newThread(doNothingRunnable);
        Thread thread2 = namedDefaultThreadFactory.newThread(doNothingRunnable);
        Thread thread3 = namedDefaultThreadFactory.newThread(doNothingRunnable);

        Assert.assertEquals("pool-fakeservice1-1-thread-1", thread1.getName());
        Assert.assertEquals("pool-fakeservice1-1-thread-2", thread2.getName());
        Assert.assertEquals("pool-fakeservice1-1-thread-3", thread3.getName());
    }

    @Test
    public void multiplePools_differentNames_areNamedCorrectly() {
        NamedDefaultThreadFactory namedDefaultThreadFactory1 = NamedDefaultThreadFactory.of("fakeservice2");
        NamedDefaultThreadFactory namedDefaultThreadFactory2 = NamedDefaultThreadFactory.of("fakeservice3");

        Thread thread1 = namedDefaultThreadFactory1.newThread(doNothingRunnable);
        Thread thread2 = namedDefaultThreadFactory2.newThread(doNothingRunnable);

        Assert.assertEquals("pool-fakeservice2-1-thread-1", thread1.getName());
        Assert.assertEquals("pool-fakeservice3-1-thread-1", thread2.getName());
    }

    @Test
    public void multiplePools_sameNames_areNamedCorrectly() {
        NamedDefaultThreadFactory namedDefaultThreadFactory1 = NamedDefaultThreadFactory.of("fakeservice4");
        NamedDefaultThreadFactory namedDefaultThreadFactory2 = NamedDefaultThreadFactory.of("fakeservice4");

        Thread thread1 = namedDefaultThreadFactory1.newThread(doNothingRunnable);
        Thread thread2 = namedDefaultThreadFactory2.newThread(doNothingRunnable);

        Assert.assertEquals("pool-fakeservice4-1-thread-1", thread1.getName());
        Assert.assertEquals("pool-fakeservice4-2-thread-1", thread2.getName());
    }

    @Test
    public void otherThreadPropertiesAreSameAsDefaultJavaImplementation() {
        NamedDefaultThreadFactory namedDefaultThreadFactory = NamedDefaultThreadFactory.of("fakeservice5");

        Thread actualThread = namedDefaultThreadFactory.newThread(doNothingRunnable);
        Thread defaultThread = Executors.defaultThreadFactory().newThread(doNothingRunnable);

        Assert.assertEquals(defaultThread.getPriority(), actualThread.getPriority());
        Assert.assertEquals(defaultThread.getThreadGroup(), actualThread.getThreadGroup());
        Assert.assertEquals(defaultThread.getContextClassLoader(), actualThread.getContextClassLoader());
        Assert.assertEquals(defaultThread.getUncaughtExceptionHandler(), actualThread.getUncaughtExceptionHandler());
    }
}