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

import org.apache.http.client.methods.HttpRequestBase;

import com.amazonaws.annotation.SdkInternalApi;

@SdkInternalApi
public interface ClientExecutionAbortTrackerTask {

    /**
     * Client execution timer task needs to abort the current running HTTP request when executed.
     * 
     * @param newRequest
     */
    void setCurrentHttpRequest(HttpRequestBase newRequest);

    /**
     * @return True if client execution has been aborted by the timer task. False otherwise
     */
    boolean hasTimeoutExpired();

    /**
     * @return True if the timer task has been scheduled. False if the client execution timeout is
     *         disabled for this request
     */
    boolean isEnabled();

    void cancelTask();

}