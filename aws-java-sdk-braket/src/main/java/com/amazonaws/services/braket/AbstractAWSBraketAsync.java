/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket;

import javax.annotation.Generated;

import com.amazonaws.services.braket.model.*;

/**
 * Abstract implementation of {@code AWSBraketAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBraketAsync extends AbstractAWSBraket implements AWSBraketAsync {

    protected AbstractAWSBraketAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(CancelQuantumTaskRequest request) {

        return cancelQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(CancelQuantumTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelQuantumTaskRequest, CancelQuantumTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(CreateQuantumTaskRequest request) {

        return createQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(CreateQuantumTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateQuantumTaskRequest, CreateQuantumTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(GetQuantumTaskRequest request) {

        return getQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(GetQuantumTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQuantumTaskRequest, GetQuantumTaskResult> asyncHandler) {

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
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest request) {

        return searchDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchDevicesRequest, SearchDevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(SearchQuantumTasksRequest request) {

        return searchQuantumTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(SearchQuantumTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchQuantumTasksRequest, SearchQuantumTasksResult> asyncHandler) {

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

}
