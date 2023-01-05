/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudcontrolapi;

import javax.annotation.Generated;

import com.amazonaws.services.cloudcontrolapi.model.*;

/**
 * Abstract implementation of {@code AWSCloudControlApiAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudControlApiAsync extends AbstractAWSCloudControlApi implements AWSCloudControlApiAsync {

    protected AbstractAWSCloudControlApiAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(CancelResourceRequestRequest request) {

        return cancelResourceRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(CancelResourceRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelResourceRequestRequest, CancelResourceRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest request) {

        return getResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(GetResourceRequestStatusRequest request) {

        return getResourceRequestStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(GetResourceRequestStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequestStatusRequest, GetResourceRequestStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(ListResourceRequestsRequest request) {

        return listResourceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(ListResourceRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourceRequestsRequest, ListResourceRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
