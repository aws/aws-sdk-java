/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.timers.TimeoutThreadPoolBuilder;

/**
 * Represents a timer to enforce a timeout on the total client execution time. That is the time
 * spent executing request handlers, any HTTP request including retries, unmarshalling, etc.
 * Essentially all the time spent in {@link AmazonHttpClient}
 */
// DO NOT override finalize(). The shutdown() method is called from AmazonHttpClient#shutdown()
// which is called from it's finalize() method.  Since finalize methods can be be called in any
// order and even concurrently, we need to rely on AmazonHttpClient to call our shutdown() method.
@SdkInternalApi
@ThreadSafe
public class ClientExecutionTimer {

    private static final String threadNamePrefix = "AwsSdkClientExecutionTimerThread";

    private volatile ScheduledThreadPoolExecutor executor;

    /**
     * Start the timer with the specified timeout and return a object that can be used to track the
     * state of the timer and cancel it if need be.
     * 
     * @param clientExecutionTimeoutMillis
     *            A positive value here enables the timer, a non-positive value disables it and
     *            returns a dummy tracker task
     * @return Implementation of {@link ClientExecutionAbortTrackerTaskImpl} to query the state of
     *         the task, provide it with up to date context, and cancel it if appropriate
     */
    public ClientExecutionAbortTrackerTask startTimer(int clientExecutionTimeoutMillis) {
        if (isTimeoutDisabled(clientExecutionTimeoutMillis)) {
            return NoOpClientExecutionAbortTrackerTask.INSTANCE;
        } else if (executor == null) {
            initializeExecutor();
        }
        return scheduleTimerTask(clientExecutionTimeoutMillis);
    }

    /**
     * Executor is lazily initialized as it's not compatible with Java 6
     */
    private synchronized void initializeExecutor() {
        if (executor == null) {
            executor = TimeoutThreadPoolBuilder.buildDefaultTimeoutThreadPool(threadNamePrefix);
        }
    }

    /**
     * This method is current exposed for testing purposes
     * 
     * @return The underlying {@link ScheduledThreadPoolExecutor}
     */
    @SdkTestInternalApi
    public ScheduledThreadPoolExecutor getExecutor() {
        return this.executor;
    }

    /**
     * Shutdown the underlying {@link ScheduledThreadPoolExecutor}. Should be invoked when
     * {@link AmazonHttpClient} is shutdown
     */
    public synchronized void shutdown() {
        if (executor != null) {
            executor.shutdown();
        }
    }

    private ClientExecutionAbortTrackerTask scheduleTimerTask(int clientExecutionTimeoutMillis) {
        ClientExecutionAbortTask timerTask = new ClientExecutionAbortTaskImpl(Thread.currentThread());
        ScheduledFuture<?> timerTaskFuture = executor.schedule(timerTask, clientExecutionTimeoutMillis,
                TimeUnit.MILLISECONDS);
        return new ClientExecutionAbortTrackerTaskImpl(timerTask, timerTaskFuture);
    }

    private boolean isTimeoutDisabled(int clientExecutionTimeoutMillis) {
        return clientExecutionTimeoutMillis <= 0;
    }

}
