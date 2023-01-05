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
package com.amazonaws.services.devopsguru;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;

/**
 * Abstract implementation of {@code AmazonDevOpsGuruAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDevOpsGuruAsync extends AbstractAmazonDevOpsGuru implements AmazonDevOpsGuruAsync {

    protected AbstractAmazonDevOpsGuruAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest request) {

        return addNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<AddNotificationChannelRequest, AddNotificationChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest request) {

        return deleteInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest request) {

        return describeAccountHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountHealthRequest, DescribeAccountHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest request) {

        return describeAccountOverviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountOverviewRequest, DescribeAccountOverviewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest request) {

        return describeAnomalyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyRequest, DescribeAnomalyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourcesConfigResult> describeEventSourcesConfigAsync(DescribeEventSourcesConfigRequest request) {

        return describeEventSourcesConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourcesConfigResult> describeEventSourcesConfigAsync(DescribeEventSourcesConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSourcesConfigRequest, DescribeEventSourcesConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(DescribeFeedbackRequest request) {

        return describeFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(DescribeFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFeedbackRequest, DescribeFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest request) {

        return describeInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInsightRequest, DescribeInsightResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationHealthResult> describeOrganizationHealthAsync(DescribeOrganizationHealthRequest request) {

        return describeOrganizationHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationHealthResult> describeOrganizationHealthAsync(DescribeOrganizationHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationHealthRequest, DescribeOrganizationHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationOverviewResult> describeOrganizationOverviewAsync(DescribeOrganizationOverviewRequest request) {

        return describeOrganizationOverviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationOverviewResult> describeOrganizationOverviewAsync(DescribeOrganizationOverviewRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationOverviewRequest, DescribeOrganizationOverviewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationResourceCollectionHealthResult> describeOrganizationResourceCollectionHealthAsync(
            DescribeOrganizationResourceCollectionHealthRequest request) {

        return describeOrganizationResourceCollectionHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationResourceCollectionHealthResult> describeOrganizationResourceCollectionHealthAsync(
            DescribeOrganizationResourceCollectionHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationResourceCollectionHealthRequest, DescribeOrganizationResourceCollectionHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest request) {

        return describeResourceCollectionHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceCollectionHealthRequest, DescribeResourceCollectionHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(DescribeServiceIntegrationRequest request) {

        return describeServiceIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(DescribeServiceIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceIntegrationRequest, DescribeServiceIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(GetCostEstimationRequest request) {

        return getCostEstimationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(GetCostEstimationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCostEstimationRequest, GetCostEstimationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest request) {

        return getResourceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceCollectionRequest, GetResourceCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest request) {

        return listAnomaliesForInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomaliesForInsightRequest, ListAnomaliesForInsightResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnomalousLogGroupsResult> listAnomalousLogGroupsAsync(ListAnomalousLogGroupsRequest request) {

        return listAnomalousLogGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalousLogGroupsResult> listAnomalousLogGroupsAsync(ListAnomalousLogGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomalousLogGroupsRequest, ListAnomalousLogGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest request) {

        return listEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventsRequest, ListEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest request) {

        return listInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInsightsRequest, ListInsightsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourcesResult> listMonitoredResourcesAsync(ListMonitoredResourcesRequest request) {

        return listMonitoredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourcesResult> listMonitoredResourcesAsync(ListMonitoredResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMonitoredResourcesRequest, ListMonitoredResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest request) {

        return listNotificationChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotificationChannelsRequest, ListNotificationChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationInsightsResult> listOrganizationInsightsAsync(ListOrganizationInsightsRequest request) {

        return listOrganizationInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationInsightsResult> listOrganizationInsightsAsync(ListOrganizationInsightsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationInsightsRequest, ListOrganizationInsightsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request) {

        return putFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(RemoveNotificationChannelRequest request) {

        return removeNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(RemoveNotificationChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveNotificationChannelRequest, RemoveNotificationChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest request) {

        return searchInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchInsightsRequest, SearchInsightsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchOrganizationInsightsResult> searchOrganizationInsightsAsync(SearchOrganizationInsightsRequest request) {

        return searchOrganizationInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchOrganizationInsightsResult> searchOrganizationInsightsAsync(SearchOrganizationInsightsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchOrganizationInsightsRequest, SearchOrganizationInsightsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(StartCostEstimationRequest request) {

        return startCostEstimationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(StartCostEstimationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCostEstimationRequest, StartCostEstimationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourcesConfigResult> updateEventSourcesConfigAsync(UpdateEventSourcesConfigRequest request) {

        return updateEventSourcesConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventSourcesConfigResult> updateEventSourcesConfigAsync(UpdateEventSourcesConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEventSourcesConfigRequest, UpdateEventSourcesConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest request) {

        return updateResourceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceCollectionRequest, UpdateResourceCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest request) {

        return updateServiceIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceIntegrationRequest, UpdateServiceIntegrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
