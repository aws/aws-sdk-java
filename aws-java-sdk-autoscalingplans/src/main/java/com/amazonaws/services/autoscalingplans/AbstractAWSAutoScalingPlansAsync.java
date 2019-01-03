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
package com.amazonaws.services.autoscalingplans;

import javax.annotation.Generated;

import com.amazonaws.services.autoscalingplans.model.*;

/**
 * Abstract implementation of {@code AWSAutoScalingPlansAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAutoScalingPlansAsync extends AbstractAWSAutoScalingPlans implements AWSAutoScalingPlansAsync {

    protected AbstractAWSAutoScalingPlansAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(CreateScalingPlanRequest request) {

        return createScalingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(CreateScalingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateScalingPlanRequest, CreateScalingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(DeleteScalingPlanRequest request) {

        return deleteScalingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(DeleteScalingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPlanRequest, DeleteScalingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(DescribeScalingPlanResourcesRequest request) {

        return describeScalingPlanResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(DescribeScalingPlanResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPlanResourcesRequest, DescribeScalingPlanResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(DescribeScalingPlansRequest request) {

        return describeScalingPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(DescribeScalingPlansRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPlansRequest, DescribeScalingPlansResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetScalingPlanResourceForecastDataResult> getScalingPlanResourceForecastDataAsync(
            GetScalingPlanResourceForecastDataRequest request) {

        return getScalingPlanResourceForecastDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScalingPlanResourceForecastDataResult> getScalingPlanResourceForecastDataAsync(
            GetScalingPlanResourceForecastDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScalingPlanResourceForecastDataRequest, GetScalingPlanResourceForecastDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateScalingPlanResult> updateScalingPlanAsync(UpdateScalingPlanRequest request) {

        return updateScalingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScalingPlanResult> updateScalingPlanAsync(UpdateScalingPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateScalingPlanRequest, UpdateScalingPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
