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
package com.amazonaws.http.timers;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Utility class to build the {@link ScheduledThreadPoolExecutor} for the request timeout and client
 * execution timeout features
 */
@SdkInternalApi
public class TimeoutThreadPoolBuilder {
    
    /**
     * Creates a {@link ScheduledThreadPoolExecutor} with custom name for the threads.
     *
     * @param name the prefix to add to the thread name in ThreadFactory.
     * @return The default thread pool for request timeout and client execution timeout features.
     */
    public static ScheduledThreadPoolExecutor buildDefaultTimeoutThreadPool(final String name) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5, getThreadFactory(name));
        safeSetRemoveOnCancel(executor);
        executor.setKeepAliveTime(5, TimeUnit.SECONDS);
        executor.allowCoreThreadTimeOut(true);

        return executor;
    }

    private static ThreadFactory getThreadFactory(final String name) {
        return new ThreadFactory() {
            private int threadCount = 1;

            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                if (name != null) {
                    thread.setName(name + "-" + threadCount++);
                }
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
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
            throw new SdkClientException("The request timeout feature is only available for Java 1.7 and above.");
        } catch (SecurityException e) {
            throw new SdkClientException("The request timeout feature needs additional permissions to function.", e);
        }
    }

    /**
     * Wrap exception caused by calling setRemoveOnCancel in a {@link SdkClientException}.
     * 
     * @param cause
     *            Root cause of exception
     */
    private static void throwSetRemoveOnCancelException(Throwable cause) {
        throw new SdkClientException("Unable to setRemoveOnCancelPolicy for request timeout thread pool", cause);
    }
}
