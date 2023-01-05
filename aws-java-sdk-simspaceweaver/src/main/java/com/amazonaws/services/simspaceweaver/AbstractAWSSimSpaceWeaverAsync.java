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
package com.amazonaws.services.simspaceweaver;

import javax.annotation.Generated;

import com.amazonaws.services.simspaceweaver.model.*;

/**
 * Abstract implementation of {@code AWSSimSpaceWeaverAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSimSpaceWeaverAsync extends AbstractAWSSimSpaceWeaver implements AWSSimSpaceWeaverAsync {

    protected AbstractAWSSimSpaceWeaverAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(DeleteSimulationRequest request) {

        return deleteSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(DeleteSimulationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSimulationRequest, DeleteSimulationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(DescribeSimulationRequest request) {

        return describeSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(DescribeSimulationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSimulationRequest, DescribeSimulationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(ListSimulationsRequest request) {

        return listSimulationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(ListSimulationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSimulationsRequest, ListSimulationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartAppResult> startAppAsync(StartAppRequest request) {

        return startAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppResult> startAppAsync(StartAppRequest request,
            com.amazonaws.handlers.AsyncHandler<StartAppRequest, StartAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartClockResult> startClockAsync(StartClockRequest request) {

        return startClockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartClockResult> startClockAsync(StartClockRequest request,
            com.amazonaws.handlers.AsyncHandler<StartClockRequest, StartClockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(StartSimulationRequest request) {

        return startSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(StartSimulationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSimulationRequest, StartSimulationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopAppResult> stopAppAsync(StopAppRequest request) {

        return stopAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAppResult> stopAppAsync(StopAppRequest request,
            com.amazonaws.handlers.AsyncHandler<StopAppRequest, StopAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopClockResult> stopClockAsync(StopClockRequest request) {

        return stopClockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopClockResult> stopClockAsync(StopClockRequest request,
            com.amazonaws.handlers.AsyncHandler<StopClockRequest, StopClockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(StopSimulationRequest request) {

        return stopSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(StopSimulationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopSimulationRequest, StopSimulationResult> asyncHandler) {

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
