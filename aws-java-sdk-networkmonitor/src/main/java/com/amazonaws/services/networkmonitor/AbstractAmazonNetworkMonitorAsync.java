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
package com.amazonaws.services.networkmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.networkmonitor.model.*;

/**
 * Abstract implementation of {@code AmazonNetworkMonitorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonNetworkMonitorAsync extends AbstractAmazonNetworkMonitor implements AmazonNetworkMonitorAsync {

    protected AbstractAmazonNetworkMonitorAsync() {
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
    public java.util.concurrent.Future<CreateProbeResult> createProbeAsync(CreateProbeRequest request) {

        return createProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProbeResult> createProbeAsync(CreateProbeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProbeRequest, CreateProbeResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(DeleteProbeRequest request) {

        return deleteProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(DeleteProbeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProbeRequest, DeleteProbeResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetProbeResult> getProbeAsync(GetProbeRequest request) {

        return getProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProbeResult> getProbeAsync(GetProbeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProbeRequest, GetProbeResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(UpdateProbeRequest request) {

        return updateProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(UpdateProbeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProbeRequest, UpdateProbeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
