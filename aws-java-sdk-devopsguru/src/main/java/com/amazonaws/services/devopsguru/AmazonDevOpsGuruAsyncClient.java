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
package com.amazonaws.services.devopsguru;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon DevOps Guru asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon DevOps Guru is a fully managed service that helps you identify anomalous behavior in business critical
 * operational applications. You specify the AWS resources that you want DevOps Guru to cover, then the Amazon
 * CloudWatch metrics and AWS CloudTrail events related to those resources are analyzed. When anomalous behavior is
 * detected, DevOps Guru creates an <i>insight</i> that includes recommendations, related events, and related metrics
 * that can help you improve your operational applications. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html">What is Amazon DevOps Guru</a>.
 * </p>
 * <p>
 * You can specify 1 or 2 Amazon Simple Notification Service topics so you are notified every time a new insight is
 * created. You can also enable DevOps Guru to generate an OpsItem in AWS Systems Manager for each insight to help you
 * manage and track your work addressing insights.
 * </p>
 * <p>
 * To learn about the DevOps Guru workflow, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html#how-it-works">How DevOps Guru works</a>.
 * To learn about DevOps Guru concepts, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/concepts.html">Concepts in DevOps Guru</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDevOpsGuruAsyncClient extends AmazonDevOpsGuruClient implements AmazonDevOpsGuruAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDevOpsGuruAsyncClientBuilder asyncBuilder() {
        return AmazonDevOpsGuruAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DevOps Guru using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDevOpsGuruAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DevOps Guru using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonDevOpsGuruAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest request) {

        return addNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(final AddNotificationChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddNotificationChannelRequest, AddNotificationChannelResult> asyncHandler) {
        final AddNotificationChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddNotificationChannelResult>() {
            @Override
            public AddNotificationChannelResult call() throws Exception {
                AddNotificationChannelResult result = null;

                try {
                    result = executeAddNotificationChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest request) {

        return describeAccountHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(final DescribeAccountHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountHealthRequest, DescribeAccountHealthResult> asyncHandler) {
        final DescribeAccountHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountHealthResult>() {
            @Override
            public DescribeAccountHealthResult call() throws Exception {
                DescribeAccountHealthResult result = null;

                try {
                    result = executeDescribeAccountHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest request) {

        return describeAccountOverviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(final DescribeAccountOverviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountOverviewRequest, DescribeAccountOverviewResult> asyncHandler) {
        final DescribeAccountOverviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountOverviewResult>() {
            @Override
            public DescribeAccountOverviewResult call() throws Exception {
                DescribeAccountOverviewResult result = null;

                try {
                    result = executeDescribeAccountOverview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest request) {

        return describeAnomalyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(final DescribeAnomalyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnomalyRequest, DescribeAnomalyResult> asyncHandler) {
        final DescribeAnomalyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnomalyResult>() {
            @Override
            public DescribeAnomalyResult call() throws Exception {
                DescribeAnomalyResult result = null;

                try {
                    result = executeDescribeAnomaly(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(DescribeFeedbackRequest request) {

        return describeFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(final DescribeFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFeedbackRequest, DescribeFeedbackResult> asyncHandler) {
        final DescribeFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFeedbackResult>() {
            @Override
            public DescribeFeedbackResult call() throws Exception {
                DescribeFeedbackResult result = null;

                try {
                    result = executeDescribeFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest request) {

        return describeInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(final DescribeInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInsightRequest, DescribeInsightResult> asyncHandler) {
        final DescribeInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInsightResult>() {
            @Override
            public DescribeInsightResult call() throws Exception {
                DescribeInsightResult result = null;

                try {
                    result = executeDescribeInsight(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest request) {

        return describeResourceCollectionHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            final DescribeResourceCollectionHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceCollectionHealthRequest, DescribeResourceCollectionHealthResult> asyncHandler) {
        final DescribeResourceCollectionHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceCollectionHealthResult>() {
            @Override
            public DescribeResourceCollectionHealthResult call() throws Exception {
                DescribeResourceCollectionHealthResult result = null;

                try {
                    result = executeDescribeResourceCollectionHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(DescribeServiceIntegrationRequest request) {

        return describeServiceIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(final DescribeServiceIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceIntegrationRequest, DescribeServiceIntegrationResult> asyncHandler) {
        final DescribeServiceIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServiceIntegrationResult>() {
            @Override
            public DescribeServiceIntegrationResult call() throws Exception {
                DescribeServiceIntegrationResult result = null;

                try {
                    result = executeDescribeServiceIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(GetCostEstimationRequest request) {

        return getCostEstimationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(final GetCostEstimationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCostEstimationRequest, GetCostEstimationResult> asyncHandler) {
        final GetCostEstimationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCostEstimationResult>() {
            @Override
            public GetCostEstimationResult call() throws Exception {
                GetCostEstimationResult result = null;

                try {
                    result = executeGetCostEstimation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest request) {

        return getResourceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(final GetResourceCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceCollectionRequest, GetResourceCollectionResult> asyncHandler) {
        final GetResourceCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceCollectionResult>() {
            @Override
            public GetResourceCollectionResult call() throws Exception {
                GetResourceCollectionResult result = null;

                try {
                    result = executeGetResourceCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest request) {

        return listAnomaliesForInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(final ListAnomaliesForInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnomaliesForInsightRequest, ListAnomaliesForInsightResult> asyncHandler) {
        final ListAnomaliesForInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnomaliesForInsightResult>() {
            @Override
            public ListAnomaliesForInsightResult call() throws Exception {
                ListAnomaliesForInsightResult result = null;

                try {
                    result = executeListAnomaliesForInsight(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest request) {

        return listEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventsResult> listEventsAsync(final ListEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventsRequest, ListEventsResult> asyncHandler) {
        final ListEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventsResult>() {
            @Override
            public ListEventsResult call() throws Exception {
                ListEventsResult result = null;

                try {
                    result = executeListEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest request) {

        return listInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(final ListInsightsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInsightsRequest, ListInsightsResult> asyncHandler) {
        final ListInsightsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInsightsResult>() {
            @Override
            public ListInsightsResult call() throws Exception {
                ListInsightsResult result = null;

                try {
                    result = executeListInsights(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest request) {

        return listNotificationChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(final ListNotificationChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationChannelsRequest, ListNotificationChannelsResult> asyncHandler) {
        final ListNotificationChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationChannelsResult>() {
            @Override
            public ListNotificationChannelsResult call() throws Exception {
                ListNotificationChannelsResult result = null;

                try {
                    result = executeListNotificationChannels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request) {

        return listRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(final ListRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler) {
        final ListRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationsResult>() {
            @Override
            public ListRecommendationsResult call() throws Exception {
                ListRecommendationsResult result = null;

                try {
                    result = executeListRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request) {

        return putFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(final PutFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler) {
        final PutFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFeedbackResult>() {
            @Override
            public PutFeedbackResult call() throws Exception {
                PutFeedbackResult result = null;

                try {
                    result = executePutFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(RemoveNotificationChannelRequest request) {

        return removeNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(final RemoveNotificationChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveNotificationChannelRequest, RemoveNotificationChannelResult> asyncHandler) {
        final RemoveNotificationChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveNotificationChannelResult>() {
            @Override
            public RemoveNotificationChannelResult call() throws Exception {
                RemoveNotificationChannelResult result = null;

                try {
                    result = executeRemoveNotificationChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest request) {

        return searchInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(final SearchInsightsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchInsightsRequest, SearchInsightsResult> asyncHandler) {
        final SearchInsightsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchInsightsResult>() {
            @Override
            public SearchInsightsResult call() throws Exception {
                SearchInsightsResult result = null;

                try {
                    result = executeSearchInsights(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(StartCostEstimationRequest request) {

        return startCostEstimationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(final StartCostEstimationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCostEstimationRequest, StartCostEstimationResult> asyncHandler) {
        final StartCostEstimationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCostEstimationResult>() {
            @Override
            public StartCostEstimationResult call() throws Exception {
                StartCostEstimationResult result = null;

                try {
                    result = executeStartCostEstimation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest request) {

        return updateResourceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(final UpdateResourceCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceCollectionRequest, UpdateResourceCollectionResult> asyncHandler) {
        final UpdateResourceCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceCollectionResult>() {
            @Override
            public UpdateResourceCollectionResult call() throws Exception {
                UpdateResourceCollectionResult result = null;

                try {
                    result = executeUpdateResourceCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest request) {

        return updateServiceIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(final UpdateServiceIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceIntegrationRequest, UpdateServiceIntegrationResult> asyncHandler) {
        final UpdateServiceIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceIntegrationResult>() {
            @Override
            public UpdateServiceIntegrationResult call() throws Exception {
                UpdateServiceIntegrationResult result = null;

                try {
                    result = executeUpdateServiceIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
