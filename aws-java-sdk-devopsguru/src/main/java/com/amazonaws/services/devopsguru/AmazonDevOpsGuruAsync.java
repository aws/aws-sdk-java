/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing Amazon DevOps Guru asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devopsguru.AbstractAmazonDevOpsGuruAsync} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDevOpsGuruAsync extends AmazonDevOpsGuru {

    /**
     * @param addNotificationChannelRequest
     * @return A Java Future containing the result of the AddNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest addNotificationChannelRequest);

    /**
     * @param addNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest addNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<AddNotificationChannelRequest, AddNotificationChannelResult> asyncHandler);

    /**
     * @param describeAccountHealthRequest
     * @return A Java Future containing the result of the DescribeAccountHealth operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest describeAccountHealthRequest);

    /**
     * @param describeAccountHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountHealth operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest describeAccountHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountHealthRequest, DescribeAccountHealthResult> asyncHandler);

    /**
     * @param describeAccountOverviewRequest
     * @return A Java Future containing the result of the DescribeAccountOverview operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest describeAccountOverviewRequest);

    /**
     * @param describeAccountOverviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountOverview operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest describeAccountOverviewRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountOverviewRequest, DescribeAccountOverviewResult> asyncHandler);

    /**
     * @param describeAnomalyRequest
     * @return A Java Future containing the result of the DescribeAnomaly operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest describeAnomalyRequest);

    /**
     * @param describeAnomalyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnomaly operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest describeAnomalyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyRequest, DescribeAnomalyResult> asyncHandler);

    /**
     * @param describeInsightRequest
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest);

    /**
     * @param describeInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInsightRequest, DescribeInsightResult> asyncHandler);

    /**
     * @param describeResourceCollectionHealthRequest
     * @return A Java Future containing the result of the DescribeResourceCollectionHealth operation returned by the
     *         service.
     * @sample AmazonDevOpsGuruAsync.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest);

    /**
     * @param describeResourceCollectionHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourceCollectionHealth operation returned by the
     *         service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceCollectionHealthRequest, DescribeResourceCollectionHealthResult> asyncHandler);

    /**
     * @param describeServiceIntegrationRequest
     * @return A Java Future containing the result of the DescribeServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(
            DescribeServiceIntegrationRequest describeServiceIntegrationRequest);

    /**
     * @param describeServiceIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(
            DescribeServiceIntegrationRequest describeServiceIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceIntegrationRequest, DescribeServiceIntegrationResult> asyncHandler);

    /**
     * @param getResourceCollectionRequest
     * @return A Java Future containing the result of the GetResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest getResourceCollectionRequest);

    /**
     * @param getResourceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest getResourceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceCollectionRequest, GetResourceCollectionResult> asyncHandler);

    /**
     * @param listAnomaliesForInsightRequest
     * @return A Java Future containing the result of the ListAnomaliesForInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest);

    /**
     * @param listAnomaliesForInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnomaliesForInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnomaliesForInsightRequest, ListAnomaliesForInsightResult> asyncHandler);

    /**
     * @param listEventsRequest
     * @return A Java Future containing the result of the ListEvents operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest listEventsRequest);

    /**
     * @param listEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEvents operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest listEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventsRequest, ListEventsResult> asyncHandler);

    /**
     * @param listInsightsRequest
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest);

    /**
     * @param listInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInsightsRequest, ListInsightsResult> asyncHandler);

    /**
     * @param listNotificationChannelsRequest
     * @return A Java Future containing the result of the ListNotificationChannels operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest listNotificationChannelsRequest);

    /**
     * @param listNotificationChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotificationChannels operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest listNotificationChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationChannelsRequest, ListNotificationChannelsResult> asyncHandler);

    /**
     * @param listRecommendationsRequest
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * @param listRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler);

    /**
     * @param putFeedbackRequest
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest);

    /**
     * @param putFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler);

    /**
     * @param removeNotificationChannelRequest
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest);

    /**
     * @param removeNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveNotificationChannelRequest, RemoveNotificationChannelResult> asyncHandler);

    /**
     * @param searchInsightsRequest
     * @return A Java Future containing the result of the SearchInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest searchInsightsRequest);

    /**
     * @param searchInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest searchInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchInsightsRequest, SearchInsightsResult> asyncHandler);

    /**
     * @param updateResourceCollectionRequest
     * @return A Java Future containing the result of the UpdateResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest updateResourceCollectionRequest);

    /**
     * @param updateResourceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest updateResourceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceCollectionRequest, UpdateResourceCollectionResult> asyncHandler);

    /**
     * @param updateServiceIntegrationRequest
     * @return A Java Future containing the result of the UpdateServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest updateServiceIntegrationRequest);

    /**
     * @param updateServiceIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest updateServiceIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceIntegrationRequest, UpdateServiceIntegrationResult> asyncHandler);

}
