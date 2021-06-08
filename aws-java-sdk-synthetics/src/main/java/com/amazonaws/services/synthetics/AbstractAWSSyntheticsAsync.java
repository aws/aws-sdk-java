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
package com.amazonaws.services.synthetics;

import javax.annotation.Generated;

import com.amazonaws.services.synthetics.model.*;

/**
 * Abstract implementation of {@code AWSSyntheticsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSyntheticsAsync extends AbstractAWSSynthetics implements AWSSyntheticsAsync {

    protected AbstractAWSSyntheticsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(CreateCanaryRequest request) {

        return createCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(CreateCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCanaryRequest, CreateCanaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(DeleteCanaryRequest request) {

        return deleteCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(DeleteCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCanaryRequest, DeleteCanaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(DescribeCanariesRequest request) {

        return describeCanariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(DescribeCanariesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCanariesRequest, DescribeCanariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(DescribeCanariesLastRunRequest request) {

        return describeCanariesLastRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(DescribeCanariesLastRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCanariesLastRunRequest, DescribeCanariesLastRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(DescribeRuntimeVersionsRequest request) {

        return describeRuntimeVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(DescribeRuntimeVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRuntimeVersionsRequest, DescribeRuntimeVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(GetCanaryRequest request) {

        return getCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(GetCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCanaryRequest, GetCanaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(GetCanaryRunsRequest request) {

        return getCanaryRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(GetCanaryRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCanaryRunsRequest, GetCanaryRunsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(StartCanaryRequest request) {

        return startCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(StartCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCanaryRequest, StartCanaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(StopCanaryRequest request) {

        return stopCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(StopCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<StopCanaryRequest, StopCanaryResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(UpdateCanaryRequest request) {

        return updateCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(UpdateCanaryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCanaryRequest, UpdateCanaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
