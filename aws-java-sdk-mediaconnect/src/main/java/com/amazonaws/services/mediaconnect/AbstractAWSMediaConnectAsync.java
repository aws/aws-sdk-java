/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;

/**
 * Abstract implementation of {@code AWSMediaConnectAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaConnectAsync extends AbstractAWSMediaConnect implements AWSMediaConnectAsync {

    protected AbstractAWSMediaConnectAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest request) {

        return addFlowOutputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddFlowOutputsRequest, AddFlowOutputsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request) {

        return deleteFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler) {

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
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest request) {

        return grantFlowEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest request,
            com.amazonaws.handlers.AsyncHandler<GrantFlowEntitlementsRequest, GrantFlowEntitlementsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest request) {

        return listEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest request) {

        return removeFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveFlowOutputRequest, RemoveFlowOutputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest request) {

        return revokeFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeFlowEntitlementRequest, RevokeFlowEntitlementResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest request) {

        return updateFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowEntitlementRequest, UpdateFlowEntitlementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest request) {

        return updateFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowOutputRequest, UpdateFlowOutputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest request) {

        return updateFlowSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowSourceRequest, UpdateFlowSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
