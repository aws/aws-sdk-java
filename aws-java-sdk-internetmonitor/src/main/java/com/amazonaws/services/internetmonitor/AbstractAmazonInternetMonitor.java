/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.internetmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonInternetMonitor}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonInternetMonitor implements AmazonInternetMonitor {

    protected AbstractAmazonInternetMonitor() {
    }

    @Override
    public CreateMonitorResult createMonitor(CreateMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMonitorResult deleteMonitor(DeleteMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetHealthEventResult getHealthEvent(GetHealthEventRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInternetEventResult getInternetEvent(GetInternetEventRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMonitorResult getMonitor(GetMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueryStatusResult getQueryStatus(GetQueryStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListHealthEventsResult listHealthEvents(ListHealthEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInternetEventsResult listInternetEvents(ListInternetEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMonitorsResult listMonitors(ListMonitorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopQueryResult stopQuery(StopQueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateMonitorResult updateMonitor(UpdateMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
