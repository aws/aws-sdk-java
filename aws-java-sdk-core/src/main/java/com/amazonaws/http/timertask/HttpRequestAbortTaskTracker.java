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
package com.amazonaws.http.timertask;

import java.util.concurrent.ScheduledFuture;

/**
 * Tracking object for a scheduled HttpRequestAbortTask.
 */
public class HttpRequestAbortTaskTracker {
    
    private final HttpRequestAbortTask task;
    private final ScheduledFuture<?> future;
    
    public HttpRequestAbortTaskTracker(final HttpRequestAbortTask task, final ScheduledFuture<?> future) {
        this.task = task;
        this.future = future;
    }
    
    public boolean httpRequestAborted() {
        return task.httpRequestAborted();
    }
 
    public void cancelTask() {
        future.cancel(true);
    }
    
}
