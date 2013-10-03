/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.concurrent.ThreadFactory;

/**
 * This class wraps a ProgressListener object, and manages all its callback
 * execution. Callbacks are executed sequentially in a separate single thread.
 */
public class ProgressListenerCallbackExecutor {

    /** The wrapped ProgressListener **/
    private final ProgressListener listener;
    
    /** A single thread pool for executing all ProgressListener callbacks. **/
    private static ExecutorService executor;
    
    public ProgressListenerCallbackExecutor(ProgressListener listener) {
        this.listener = listener;
    }
    
    public void progressChanged(final ProgressEvent progressEvent) {
        if (listener == null) return;
        
        synchronized (ProgressListenerCallbackExecutor.class) {
            if (executor == null) {
                executor = Executors.newSingleThreadExecutor(new ThreadFactory() {
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setName("java-sdk-progress-listener-callback-thread");
                        t.setDaemon(true);
                        return t;
                    }
                });
            }
            executor.submit(new Runnable() {
                
                @Override
                public void run() {
                    listener.progressChanged(progressEvent);
                }
            });
        }
        
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
}
