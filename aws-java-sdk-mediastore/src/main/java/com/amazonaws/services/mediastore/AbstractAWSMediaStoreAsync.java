/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore;

import javax.annotation.Generated;

import com.amazonaws.services.mediastore.model.*;

/**
 * Abstract implementation of {@code AWSMediaStoreAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaStoreAsync extends AbstractAWSMediaStore implements AWSMediaStoreAsync {

    protected AbstractAWSMediaStoreAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateContainerResult> createContainerAsync(CreateContainerRequest request) {

        return createContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContainerResult> createContainerAsync(CreateContainerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateContainerRequest, CreateContainerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(DeleteContainerRequest request) {

        return deleteContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(DeleteContainerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerRequest, DeleteContainerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(DeleteContainerPolicyRequest request) {

        return deleteContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(DeleteContainerPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerPolicyRequest, DeleteContainerPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(DescribeContainerRequest request) {

        return describeContainerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(DescribeContainerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeContainerRequest, DescribeContainerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(GetContainerPolicyRequest request) {

        return getContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(GetContainerPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContainerPolicyRequest, GetContainerPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListContainersResult> listContainersAsync(ListContainersRequest request) {

        return listContainersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContainersResult> listContainersAsync(ListContainersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListContainersRequest, ListContainersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(PutContainerPolicyRequest request) {

        return putContainerPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(PutContainerPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutContainerPolicyRequest, PutContainerPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
