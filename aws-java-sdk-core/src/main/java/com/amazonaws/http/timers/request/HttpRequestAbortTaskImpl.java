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

import org.apache.http.client.methods.HttpRequestBase;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Implementation of {@link HttpRequestAbortTask} that aborts the tracking {@link HttpRequestBase}
 * when triggered
 */
@SdkInternalApi
public class HttpRequestAbortTaskImpl implements HttpRequestAbortTask {

    private final HttpRequestBase httpRequest;
    private volatile boolean httpRequestAborted;

    public HttpRequestAbortTaskImpl(final HttpRequestBase httpRequest) {
        this.httpRequest = httpRequest;
    }

    @Override
    public void run() {
        if (!httpRequest.isAborted()) {
            httpRequestAborted = true;
            httpRequest.abort();
        }
    }

    public boolean httpRequestAborted() {
        return httpRequestAborted;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
