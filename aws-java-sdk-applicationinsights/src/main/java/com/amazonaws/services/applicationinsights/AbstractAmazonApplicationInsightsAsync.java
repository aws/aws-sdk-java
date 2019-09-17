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
package com.amazonaws.services.applicationinsights;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;

/**
 * Abstract implementation of {@code AmazonApplicationInsightsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonApplicationInsightsAsync extends AbstractAmazonApplicationInsights implements AmazonApplicationInsightsAsync {

    protected AbstractAmazonApplicationInsightsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request) {

        return createComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request) {

        return describeComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(DescribeComponentConfigurationRequest request) {

        return describeComponentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(DescribeComponentConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRequest, DescribeComponentConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            DescribeComponentConfigurationRecommendationRequest request) {

        return describeComponentConfigurationRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            DescribeComponentConfigurationRecommendationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRecommendationRequest, DescribeComponentConfigurationRecommendationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(DescribeObservationRequest request) {

        return describeObservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(DescribeObservationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeObservationRequest, DescribeObservationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(DescribeProblemRequest request) {

        return describeProblemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(DescribeProblemRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProblemRequest, DescribeProblemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(DescribeProblemObservationsRequest request) {

        return describeProblemObservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(DescribeProblemObservationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProblemObservationsRequest, DescribeProblemObservationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(ListProblemsRequest request) {

        return listProblemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(ListProblemsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProblemsRequest, ListProblemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest request) {

        return updateComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(UpdateComponentConfigurationRequest request) {

        return updateComponentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(UpdateComponentConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
