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
package com.amazonaws.waiters;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

public class WaiterExecutorServiceFactoryTest {
    private final AtomicInteger atomicCounter = new AtomicInteger();

    private final Runnable slowRunnable = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
                atomicCounter.getAndIncrement();
            } catch (InterruptedException e) {
                // do not increment counter if thread is interrupted
            }
        }
    };

    // Typically this test completes in under 2 seconds. A generous time limit was given due to the number of cores
    // available to the JVM executing this test can produce variable results.
    @Test(timeout = 10000L)
    public void executorUnderLoadDoesNotRejectTasks() throws Exception {
        ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("fake-waiter");

        for (int i = 0; i < 1000; ++i) {
            executorService.submit(slowRunnable);
        }

        executorService.shutdown();
        executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);

        Assert.assertEquals(1000, atomicCounter.get());
    }
}