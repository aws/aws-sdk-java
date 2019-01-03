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
package com.amazonaws.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.RequestConfig;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Adapts the configuration present in {@link AmazonWebServiceRequest} to {@link RequestConfig}.
 */
@SdkInternalApi
public final class AmazonWebServiceRequestAdapter extends RequestConfig {

    private final AmazonWebServiceRequest request;

    public AmazonWebServiceRequestAdapter(AmazonWebServiceRequest request) {
        this.request = request;
    }

    @Override
    public ProgressListener getProgressListener() {
        return request.getGeneralProgressListener();
    }

    @Override
    public RequestMetricCollector getRequestMetricsCollector() {
        return request.getRequestMetricCollector();
    }

    @Override
    public AWSCredentialsProvider getCredentialsProvider() {
        return request.getRequestCredentialsProvider();
    }

    @Override
    public Map<String, String> getCustomRequestHeaders() {
        return (request.getCustomRequestHeaders() == null) ? Collections.<String, String>emptyMap() :
                request.getCustomRequestHeaders();
    }

    @Override
    public Map<String, List<String>> getCustomQueryParameters() {
        return (request.getCustomQueryParameters() == null) ? Collections.<String, List<String>>emptyMap() :
                request.getCustomQueryParameters();
    }

    @Override
    public Integer getRequestTimeout() {
        return request.getSdkRequestTimeout();
    }

    @Override
    public Integer getClientExecutionTimeout() {
        return request.getSdkClientExecutionTimeout();
    }

    @Override
    public RequestClientOptions getRequestClientOptions() {
        return request.getRequestClientOptions();
    }

    @Override
    public String getRequestType() {
        return request.getClass().getSimpleName();
    }

    @Override
    public Object getOriginalRequest() {
        return request;
    }
}
