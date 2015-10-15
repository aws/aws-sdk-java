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

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.timertask.HttpRequestAbortTask;
import com.amazonaws.http.timertask.HttpRequestAbortTaskTracker;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpRequestBase;

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
        executor.setRemoveOnCancelPolicy(true);
        executor.setKeepAliveTime(5, TimeUnit.SECONDS);
        executor.allowCoreThreadTimeOut(true);
        return executor;
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
        if(!enabled) {
            throw new IllegalStateException("Trying to schedule a task on a disabled timer.");
        }
        HttpRequestAbortTask timerTask = new HttpRequestAbortTask(apacheRequest);
        ScheduledFuture<?> timerTaskFuture = executor.schedule(timerTask, requestTimeoutMillis, TimeUnit.MILLISECONDS);
        return new HttpRequestAbortTaskTracker(timerTask, timerTaskFuture);
    }
    
    public void shutdown() {
        if(executor != null) {
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
