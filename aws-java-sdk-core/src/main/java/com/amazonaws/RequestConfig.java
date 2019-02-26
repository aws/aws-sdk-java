/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.internal.AmazonWebServiceRequestAdapter;
import com.amazonaws.metrics.RequestMetricCollector;

import java.util.List;
import java.util.Map;

/**
 * Generic representation of request level configuration. The customer interface for specifying
 * request level configuration is a base request class with configuration methods.
 */
@SdkProtectedApi
public abstract class RequestConfig {

    /**
     * No op implementation to initalize request config in {@link DefaultRequest}.
     */
    public static final RequestConfig NO_OP = new AmazonWebServiceRequestAdapter(
            AmazonWebServiceRequest.NOOP);

    public abstract ProgressListener getProgressListener();

    public abstract RequestMetricCollector getRequestMetricsCollector();

    public abstract AWSCredentialsProvider getCredentialsProvider();

    /**
     * @return A non null map of custom headers to inject into the request.
     */
    public abstract Map<String, String> getCustomRequestHeaders();

    /**
     * @return A non null map of custom query parameters to inject into the request.
     */
    public abstract Map<String, List<String>> getCustomQueryParameters();

    public abstract Integer getRequestTimeout();

    public abstract Integer getClientExecutionTimeout();

    public abstract RequestClientOptions getRequestClientOptions();

    /**
     * @return String identifying the 'type' (i.e. operation) of the request. Used in metrics
     * subsystem.
     */
    public abstract String getRequestType();

    /**
     * @return The original request object. May be delivered to various strategies or hooks for
     * extra context. I.E. {@link com.amazonaws.handlers.RequestHandler2} or {@link
     * com.amazonaws.retry.RetryPolicy}.
     */
    public abstract Object getOriginalRequest();

}
