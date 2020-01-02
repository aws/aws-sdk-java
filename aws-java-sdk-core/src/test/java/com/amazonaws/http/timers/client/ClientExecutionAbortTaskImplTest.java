/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http.timers.client;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.AfterClass;
import org.junit.Test;

public class ClientExecutionAbortTaskImplTest {
    private static final ScheduledExecutorService EXEC = Executors.newScheduledThreadPool(1);

    @AfterClass
    public static void teardown() {
        EXEC.shutdown();
    }

    @Test
    public void taskInProgress_hasExecutedReturnsTrue() {
        Thread mockThread = mock(Thread.class);
        HttpRequestBase httpRequestBase = mock(HttpRequestBase.class);
        ClientExecutionAbortTask task = new ClientExecutionAbortTaskImpl(mockThread);
        task.setCurrentHttpRequest(httpRequestBase);

        try {
            EXEC.schedule(task, 500, TimeUnit.MILLISECONDS).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        verify(mockThread).interrupt();
        assertTrue(task.hasClientExecutionAborted());
        verify(httpRequestBase).abort();
    }

    @Test
    public void taskInProgress_cancelCalled_ThreadIsNotInterrupted() throws InterruptedException {
        Thread mockThread = new Thread();
        HttpRequestBase httpRequestBase = mock(HttpRequestBase.class);

        ClientExecutionAbortTask task = new ClientExecutionAbortTaskImpl(mockThread);

        task.setCurrentHttpRequest(httpRequestBase);

        EXEC.schedule(task, 1000, TimeUnit.MILLISECONDS);

        task.cancel();

        assertFalse(mockThread.isInterrupted());

        assertFalse(task.hasClientExecutionAborted());
    }
}
