/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/**
 * This class wraps a ProgressListener object, and manages all its callback
 * execution. Callbacks are executed sequentially in a separate single thread.
 */
public class ProgressListenerCallbackExecutor {

    /** The wrapped ProgressListener **/
    private final ProgressListener listener;

    /** A single thread pool for executing all ProgressListener callbacks. **/
    private static final ExecutorService executor = createNewExecutorService();

    /**
     * Used to submit a task to publish a progress event to the given listener.
     * 
     * @return the future of the submitted task; or null if there is no listener.
     */
    public static Future<?> progressChanged(final ProgressListener listener,
            final ProgressEvent progressEvent) {
        if (listener == null) return null;
        return executor.submit(new Runnable() {
            @Override
            public void run() {
                listener.progressChanged(progressEvent);
            }
        });
    }

    /////////////////////////
    public ProgressListenerCallbackExecutor(ProgressListener listener) {
        this.listener = listener;
    }

    public ProgressListenerCallbackExecutor() {
        this.listener = null;
    }

    public void progressChanged(final ProgressEvent progressEvent) {
        if (listener == null) return;
        executor.submit(new Runnable() {
            @Override
            public void run() {
                listener.progressChanged(progressEvent);
            }
        });
    }

    /**
     * Returns the listener associated with the callback executor.
     */
    protected ProgressListener getListener() {
        return listener;
    }

    /**
     * Returns the executor service used for performing the callbacks.
     */
    protected static ExecutorService getExecutorService() {
        return executor;
    }

    /**
     * Returns a new ProgressListenerCallbackExecutor instance that wraps the
     * specified ProgressListener if it is not null, otherwise directly returns
     * null.
     */
    public static ProgressListenerCallbackExecutor wrapListener(ProgressListener listener) {
        return listener == null ?
                null : new ProgressListenerCallbackExecutor(listener);
    }

    /**
     * Creates a new single threaded executor service for performing the
     * callbacks.
     */
    private static ExecutorService createNewExecutorService() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("java-sdk-progress-listener-callback-thread");
                t.setDaemon(true);
                return t;
            }
        });
    }
}
