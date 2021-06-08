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
package com.amazonaws.services.appflow;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;

/**
 * Abstract implementation of {@code AmazonAppflowAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAppflowAsync extends AbstractAmazonAppflow implements AmazonAppflowAsync {

    protected AbstractAmazonAppflowAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(CreateConnectorProfileRequest request) {

        return createConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(CreateConnectorProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorProfileRequest, CreateConnectorProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest request) {

        return createFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(DeleteConnectorProfileRequest request) {

        return deleteConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(DeleteConnectorProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorProfileRequest, DeleteConnectorProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request) {

        return deleteFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(DescribeConnectorEntityRequest request) {

        return describeConnectorEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(DescribeConnectorEntityRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorEntityRequest, DescribeConnectorEntityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(DescribeConnectorProfilesRequest request) {

        return describeConnectorProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(DescribeConnectorProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorProfilesRequest, DescribeConnectorProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(DescribeConnectorsRequest request) {

        return describeConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(DescribeConnectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorsRequest, DescribeConnectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest request) {

        return describeFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(DescribeFlowExecutionRecordsRequest request) {

        return describeFlowExecutionRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(DescribeFlowExecutionRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowExecutionRecordsRequest, DescribeFlowExecutionRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(ListConnectorEntitiesRequest request) {

        return listConnectorEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(ListConnectorEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConnectorEntitiesRequest, ListConnectorEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest request) {

        return listFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest request) {

        return startFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest request) {

        return stopFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(UpdateConnectorProfileRequest request) {

        return updateConnectorProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(UpdateConnectorProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectorProfileRequest, UpdateConnectorProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest request) {

        return updateFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
