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
package com.amazonaws.services.costexplorer;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;

/**
 * Abstract implementation of {@code AWSCostExplorerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCostExplorerAsync extends AbstractAWSCostExplorer implements AWSCostExplorerAsync {

    protected AbstractAWSCostExplorerAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(GetCostAndUsageRequest request) {

        return getCostAndUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(GetCostAndUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCostAndUsageRequest, GetCostAndUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(GetCostForecastRequest request) {

        return getCostForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(GetCostForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCostForecastRequest, GetCostForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(GetDimensionValuesRequest request) {

        return getDimensionValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(GetDimensionValuesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDimensionValuesRequest, GetDimensionValuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(GetReservationCoverageRequest request) {

        return getReservationCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(GetReservationCoverageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReservationCoverageRequest, GetReservationCoverageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            GetReservationPurchaseRecommendationRequest request) {

        return getReservationPurchaseRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            GetReservationPurchaseRecommendationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReservationPurchaseRecommendationRequest, GetReservationPurchaseRecommendationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(GetReservationUtilizationRequest request) {

        return getReservationUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(GetReservationUtilizationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReservationUtilizationRequest, GetReservationUtilizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
