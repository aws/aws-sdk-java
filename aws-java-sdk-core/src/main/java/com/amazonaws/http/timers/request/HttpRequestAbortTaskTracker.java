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

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Returned by {@link HttpRequestTimer} to track a scheduled timer task.
 */
@SdkInternalApi
public interface HttpRequestAbortTaskTracker {

    /**
     * @return True if the HTTP request the scheduled task is tracking has been aborted by the task.
     *         False otherwise
     */
    boolean httpRequestAborted();

    /**
     * @return True if the timer is enabled for this request. False otherwise
     */
    boolean isEnabled();

    /**
     * Cancel the timer task. This should be called when the request completes within the timeout
     * otherwise the task will wake up and abort the HTTP request
     */
    void cancelTask();

}