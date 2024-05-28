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

/**
 * Abstract implementation of {@code AmazonInternetMonitorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonInternetMonitorAsync extends AbstractAmazonInternetMonitor implements AmazonInternetMonitorAsync {

    protected AbstractAmazonInternetMonitorAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request) {

        return createMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request) {

        return deleteMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(GetHealthEventRequest request) {

        return getHealthEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(GetHealthEventRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHealthEventRequest, GetHealthEventResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(GetInternetEventRequest request) {

        return getInternetEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(GetInternetEventRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInternetEventRequest, GetInternetEventResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest request) {

        return getMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(GetQueryStatusRequest request) {

        return getQueryStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(GetQueryStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryStatusRequest, GetQueryStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(ListHealthEventsRequest request) {

        return listHealthEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(ListHealthEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHealthEventsRequest, ListHealthEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(ListInternetEventsRequest request) {

        return listInternetEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(ListInternetEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInternetEventsRequest, ListInternetEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request) {

        return listMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request) {

        return stopQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest request) {

        return updateMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
