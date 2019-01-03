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

/**
 * Implementation of {@link ClientExecutionAbortTask} that interrupts the caller thread and aborts
 * any HTTP request when triggered
 */
@SdkInternalApi
public class ClientExecutionAbortTaskImpl implements ClientExecutionAbortTask {

    private volatile boolean hasTaskExecuted;
    private HttpRequestBase currentHttpRequest;
    private final Thread thread;

    public ClientExecutionAbortTaskImpl(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        hasTaskExecuted = true;
        if (!thread.isInterrupted()) {
            thread.interrupt();
        }
        if (!currentHttpRequest.isAborted()) {
            currentHttpRequest.abort();
        }
    }

    public void setCurrentHttpRequest(HttpRequestBase newRequest) {
        this.currentHttpRequest = newRequest;
    }

    public boolean hasClientExecutionAborted() {
        return hasTaskExecuted;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
