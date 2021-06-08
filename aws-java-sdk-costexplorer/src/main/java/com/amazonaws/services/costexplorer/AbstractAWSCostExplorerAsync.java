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
    public java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(CreateAnomalyMonitorRequest request) {

        return createAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(CreateAnomalyMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalyMonitorRequest, CreateAnomalyMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(CreateAnomalySubscriptionRequest request) {

        return createAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(CreateAnomalySubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalySubscriptionRequest, CreateAnomalySubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(CreateCostCategoryDefinitionRequest request) {

        return createCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(CreateCostCategoryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCostCategoryDefinitionRequest, CreateCostCategoryDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(DeleteAnomalyMonitorRequest request) {

        return deleteAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(DeleteAnomalyMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalyMonitorRequest, DeleteAnomalyMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(DeleteAnomalySubscriptionRequest request) {

        return deleteAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(DeleteAnomalySubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalySubscriptionRequest, DeleteAnomalySubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(DeleteCostCategoryDefinitionRequest request) {

        return deleteCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(DeleteCostCategoryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCostCategoryDefinitionRequest, DeleteCostCategoryDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(DescribeCostCategoryDefinitionRequest request) {

        return describeCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(DescribeCostCategoryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCostCategoryDefinitionRequest, DescribeCostCategoryDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(GetAnomaliesRequest request) {

        return getAnomaliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(GetAnomaliesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnomaliesRequest, GetAnomaliesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(GetAnomalyMonitorsRequest request) {

        return getAnomalyMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(GetAnomalyMonitorsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnomalyMonitorsRequest, GetAnomalyMonitorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(GetAnomalySubscriptionsRequest request) {

        return getAnomalySubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(GetAnomalySubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnomalySubscriptionsRequest, GetAnomalySubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(GetCostAndUsageWithResourcesRequest request) {

        return getCostAndUsageWithResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(GetCostAndUsageWithResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCostAndUsageWithResourcesRequest, GetCostAndUsageWithResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(GetCostCategoriesRequest request) {

        return getCostCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(GetCostCategoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCostCategoriesRequest, GetCostCategoriesResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(GetRightsizingRecommendationRequest request) {

        return getRightsizingRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(GetRightsizingRecommendationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRightsizingRecommendationRequest, GetRightsizingRecommendationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(GetSavingsPlansCoverageRequest request) {

        return getSavingsPlansCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(GetSavingsPlansCoverageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansCoverageRequest, GetSavingsPlansCoverageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            GetSavingsPlansPurchaseRecommendationRequest request) {

        return getSavingsPlansPurchaseRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            GetSavingsPlansPurchaseRecommendationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansPurchaseRecommendationRequest, GetSavingsPlansPurchaseRecommendationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(GetSavingsPlansUtilizationRequest request) {

        return getSavingsPlansUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(GetSavingsPlansUtilizationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationRequest, GetSavingsPlansUtilizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            GetSavingsPlansUtilizationDetailsRequest request) {

        return getSavingsPlansUtilizationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            GetSavingsPlansUtilizationDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationDetailsRequest, GetSavingsPlansUtilizationDetailsResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(GetUsageForecastRequest request) {

        return getUsageForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(GetUsageForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUsageForecastRequest, GetUsageForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(ListCostCategoryDefinitionsRequest request) {

        return listCostCategoryDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(ListCostCategoryDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCostCategoryDefinitionsRequest, ListCostCategoryDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(ProvideAnomalyFeedbackRequest request) {

        return provideAnomalyFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(ProvideAnomalyFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<ProvideAnomalyFeedbackRequest, ProvideAnomalyFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(UpdateAnomalyMonitorRequest request) {

        return updateAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(UpdateAnomalyMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalyMonitorRequest, UpdateAnomalyMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(UpdateAnomalySubscriptionRequest request) {

        return updateAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(UpdateAnomalySubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalySubscriptionRequest, UpdateAnomalySubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(UpdateCostCategoryDefinitionRequest request) {

        return updateCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(UpdateCostCategoryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCostCategoryDefinitionRequest, UpdateCostCategoryDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
