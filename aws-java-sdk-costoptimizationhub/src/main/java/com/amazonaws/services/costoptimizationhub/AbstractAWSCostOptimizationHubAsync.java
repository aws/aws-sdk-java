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
package com.amazonaws.services.costoptimizationhub;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;

/**
 * Abstract implementation of {@code AWSCostOptimizationHubAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCostOptimizationHubAsync extends AbstractAWSCostOptimizationHub implements AWSCostOptimizationHubAsync {

    protected AbstractAWSCostOptimizationHubAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(GetPreferencesRequest request) {

        return getPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(GetPreferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPreferencesRequest, GetPreferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest request) {

        return getRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationRequest, GetRecommendationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(ListEnrollmentStatusesRequest request) {

        return listEnrollmentStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(ListEnrollmentStatusesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEnrollmentStatusesRequest, ListEnrollmentStatusesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(ListRecommendationSummariesRequest request) {

        return listRecommendationSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(ListRecommendationSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationSummariesRequest, ListRecommendationSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request) {

        return listRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request) {

        return updateEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(UpdatePreferencesRequest request) {

        return updatePreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(UpdatePreferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePreferencesRequest, UpdatePreferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
