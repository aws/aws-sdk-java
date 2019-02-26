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
package com.amazonaws.http.timers.request;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.ValidationUtils;

/**
 * Keeps track of the scheduled {@link HttpRequestAbortTask} and the associated {@link Future}
 */
@SdkInternalApi
public class HttpRequestAbortTaskTrackerImpl implements HttpRequestAbortTaskTracker {

    private final HttpRequestAbortTask task;
    private final ScheduledFuture<?> future;

    public HttpRequestAbortTaskTrackerImpl(final HttpRequestAbortTask task, final ScheduledFuture<?> future) {
        this.task = ValidationUtils.assertNotNull(task, "task");
        this.future = ValidationUtils.assertNotNull(future, "future");
    }

    @Override
    public boolean httpRequestAborted() {
        return task.httpRequestAborted();
    }

    @Override
    public boolean isEnabled() {
        return task.isEnabled();
    }

    @Override
    public void cancelTask() {
        future.cancel(false);
    }

}
