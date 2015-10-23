/*
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.methods.HttpRequestBase;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.timertask.HttpRequestAbortTask;
import com.amazonaws.http.timertask.HttpRequestAbortTaskTracker;

/**
 * Represents a timer class to enforce http request timeouts.
 */
@ThreadSafe
public class HttpRequestTimer {

    private final ScheduledThreadPoolExecutor executor;
    private final long requestTimeoutMillis;
    private final boolean enabled;

    private static ScheduledThreadPoolExecutor createExecutor() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        safeSetRemoveOnCancel(executor);
        executor.setKeepAliveTime(5, TimeUnit.SECONDS);
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }

    /**
     * {@link ScheduledThreadPoolExecutor#setRemoveOnCancelPolicy(boolean)} is not available in Java
     * 6 so we invoke it with reflection to be able to compile against Java 6.
     * 
     * @param executor
     */
    private static void safeSetRemoveOnCancel(ScheduledThreadPoolExecutor executor) {
        try {
            executor.getClass().getMethod("setRemoveOnCancelPolicy", boolean.class).invoke(executor, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            throwSetRemoveOnCancelException(e);
        } catch (IllegalArgumentException e) {
            throwSetRemoveOnCancelException(e);
        } catch (InvocationTargetException e) {
            throwSetRemoveOnCancelException(e.getCause());
        } catch (NoSuchMethodException e) {
            throw new AmazonClientException("The request timeout feature is only available for Java 1.7 and above.");
        } catch (SecurityException e) {
            throw new AmazonClientException("The request timeout feature needs additional permissions to function.", e);
        }
    }

    /**
     * Wrap exception caused by calling setRemoveOnCancel in an Amazon client exception
     * 
     * @param cause
     *            Root cause of exception
     */
    private static void throwSetRemoveOnCancelException(Throwable cause) {
        throw new AmazonClientException("Unable to setRemoveOnCancelPolicy for request timeout thread pool", cause);
    }

    public HttpRequestTimer(final ClientConfiguration config) {
        this.requestTimeoutMillis = config.getRequestTimeout();
        this.enabled = (requestTimeoutMillis > 0) ? true : false;
        this.executor = enabled ? createExecutor() : null;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public HttpRequestAbortTaskTracker schedule(final HttpRequestBase apacheRequest) {
        if (!enabled) {
            throw new IllegalStateException("Trying to schedule a task on a disabled timer.");
        }
        HttpRequestAbortTask timerTask = new HttpRequestAbortTask(apacheRequest);
        ScheduledFuture<?> timerTaskFuture = executor.schedule(timerTask, requestTimeoutMillis, TimeUnit.MILLISECONDS);
        return new HttpRequestAbortTaskTracker(timerTask, timerTaskFuture);
    }

    public void shutdown() {
        if (executor != null) {
            executor.shutdown();
        }
    }

    /**
     * Package-protected for unit test purposes.
     */
    ScheduledThreadPoolExecutor getExecutor() {
        return executor;
    }

}
