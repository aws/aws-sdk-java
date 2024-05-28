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
package com.amazonaws.services.kendraranking;

import javax.annotation.Generated;

import com.amazonaws.services.kendraranking.model.*;

/**
 * Abstract implementation of {@code AmazonKendraRankingAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKendraRankingAsync extends AbstractAmazonKendraRanking implements AmazonKendraRankingAsync {

    protected AbstractAmazonKendraRankingAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(CreateRescoreExecutionPlanRequest request) {

        return createRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(CreateRescoreExecutionPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRescoreExecutionPlanRequest, CreateRescoreExecutionPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(DeleteRescoreExecutionPlanRequest request) {

        return deleteRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(DeleteRescoreExecutionPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRescoreExecutionPlanRequest, DeleteRescoreExecutionPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(DescribeRescoreExecutionPlanRequest request) {

        return describeRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(DescribeRescoreExecutionPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRescoreExecutionPlanRequest, DescribeRescoreExecutionPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(ListRescoreExecutionPlansRequest request) {

        return listRescoreExecutionPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(ListRescoreExecutionPlansRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRescoreExecutionPlansRequest, ListRescoreExecutionPlansResult> asyncHandler) {

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
    public java.util.concurrent.Future<RescoreResult> rescoreAsync(RescoreRequest request) {

        return rescoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RescoreResult> rescoreAsync(RescoreRequest request,
            com.amazonaws.handlers.AsyncHandler<RescoreRequest, RescoreResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(UpdateRescoreExecutionPlanRequest request) {

        return updateRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(UpdateRescoreExecutionPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRescoreExecutionPlanRequest, UpdateRescoreExecutionPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
