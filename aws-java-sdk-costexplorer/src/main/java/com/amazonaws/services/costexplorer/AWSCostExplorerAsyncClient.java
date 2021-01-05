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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Cost Explorer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
 * daily write operations for Amazon DynamoDB database tables in your production environment.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Cost Explorer API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>https://ce.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the Cost Explorer API, see <a
 * href="http://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCostExplorerAsyncClient extends AWSCostExplorerClient implements AWSCostExplorerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCostExplorerAsyncClientBuilder asyncBuilder() {
        return AWSCostExplorerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Cost Explorer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCostExplorerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Cost Explorer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCostExplorerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(CreateAnomalyMonitorRequest request) {

        return createAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(final CreateAnomalyMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnomalyMonitorRequest, CreateAnomalyMonitorResult> asyncHandler) {
        final CreateAnomalyMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnomalyMonitorResult>() {
            @Override
            public CreateAnomalyMonitorResult call() throws Exception {
                CreateAnomalyMonitorResult result = null;

                try {
                    result = executeCreateAnomalyMonitor(finalRequest);
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
    public java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(CreateAnomalySubscriptionRequest request) {

        return createAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(final CreateAnomalySubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnomalySubscriptionRequest, CreateAnomalySubscriptionResult> asyncHandler) {
        final CreateAnomalySubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnomalySubscriptionResult>() {
            @Override
            public CreateAnomalySubscriptionResult call() throws Exception {
                CreateAnomalySubscriptionResult result = null;

                try {
                    result = executeCreateAnomalySubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(CreateCostCategoryDefinitionRequest request) {

        return createCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(final CreateCostCategoryDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCostCategoryDefinitionRequest, CreateCostCategoryDefinitionResult> asyncHandler) {
        final CreateCostCategoryDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCostCategoryDefinitionResult>() {
            @Override
            public CreateCostCategoryDefinitionResult call() throws Exception {
                CreateCostCategoryDefinitionResult result = null;

                try {
                    result = executeCreateCostCategoryDefinition(finalRequest);
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
    public java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(DeleteAnomalyMonitorRequest request) {

        return deleteAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(final DeleteAnomalyMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnomalyMonitorRequest, DeleteAnomalyMonitorResult> asyncHandler) {
        final DeleteAnomalyMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnomalyMonitorResult>() {
            @Override
            public DeleteAnomalyMonitorResult call() throws Exception {
                DeleteAnomalyMonitorResult result = null;

                try {
                    result = executeDeleteAnomalyMonitor(finalRequest);
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
    public java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(DeleteAnomalySubscriptionRequest request) {

        return deleteAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(final DeleteAnomalySubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnomalySubscriptionRequest, DeleteAnomalySubscriptionResult> asyncHandler) {
        final DeleteAnomalySubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnomalySubscriptionResult>() {
            @Override
            public DeleteAnomalySubscriptionResult call() throws Exception {
                DeleteAnomalySubscriptionResult result = null;

                try {
                    result = executeDeleteAnomalySubscription(finalRequest);
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
    public java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(DeleteCostCategoryDefinitionRequest request) {

        return deleteCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(final DeleteCostCategoryDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCostCategoryDefinitionRequest, DeleteCostCategoryDefinitionResult> asyncHandler) {
        final DeleteCostCategoryDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCostCategoryDefinitionResult>() {
            @Override
            public DeleteCostCategoryDefinitionResult call() throws Exception {
                DeleteCostCategoryDefinitionResult result = null;

                try {
                    result = executeDeleteCostCategoryDefinition(finalRequest);
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
    public java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(DescribeCostCategoryDefinitionRequest request) {

        return describeCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(
            final DescribeCostCategoryDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCostCategoryDefinitionRequest, DescribeCostCategoryDefinitionResult> asyncHandler) {
        final DescribeCostCategoryDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCostCategoryDefinitionResult>() {
            @Override
            public DescribeCostCategoryDefinitionResult call() throws Exception {
                DescribeCostCategoryDefinitionResult result = null;

                try {
                    result = executeDescribeCostCategoryDefinition(finalRequest);
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
    public java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(GetAnomaliesRequest request) {

        return getAnomaliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(final GetAnomaliesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnomaliesRequest, GetAnomaliesResult> asyncHandler) {
        final GetAnomaliesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnomaliesResult>() {
            @Override
            public GetAnomaliesResult call() throws Exception {
                GetAnomaliesResult result = null;

                try {
                    result = executeGetAnomalies(finalRequest);
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
    public java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(GetAnomalyMonitorsRequest request) {

        return getAnomalyMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(final GetAnomalyMonitorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnomalyMonitorsRequest, GetAnomalyMonitorsResult> asyncHandler) {
        final GetAnomalyMonitorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnomalyMonitorsResult>() {
            @Override
            public GetAnomalyMonitorsResult call() throws Exception {
                GetAnomalyMonitorsResult result = null;

                try {
                    result = executeGetAnomalyMonitors(finalRequest);
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
    public java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(GetAnomalySubscriptionsRequest request) {

        return getAnomalySubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(final GetAnomalySubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnomalySubscriptionsRequest, GetAnomalySubscriptionsResult> asyncHandler) {
        final GetAnomalySubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnomalySubscriptionsResult>() {
            @Override
            public GetAnomalySubscriptionsResult call() throws Exception {
                GetAnomalySubscriptionsResult result = null;

                try {
                    result = executeGetAnomalySubscriptions(finalRequest);
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
    public java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(GetCostAndUsageRequest request) {

        return getCostAndUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(final GetCostAndUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCostAndUsageRequest, GetCostAndUsageResult> asyncHandler) {
        final GetCostAndUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCostAndUsageResult>() {
            @Override
            public GetCostAndUsageResult call() throws Exception {
                GetCostAndUsageResult result = null;

                try {
                    result = executeGetCostAndUsage(finalRequest);
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
    public java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(GetCostAndUsageWithResourcesRequest request) {

        return getCostAndUsageWithResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(final GetCostAndUsageWithResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCostAndUsageWithResourcesRequest, GetCostAndUsageWithResourcesResult> asyncHandler) {
        final GetCostAndUsageWithResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCostAndUsageWithResourcesResult>() {
            @Override
            public GetCostAndUsageWithResourcesResult call() throws Exception {
                GetCostAndUsageWithResourcesResult result = null;

                try {
                    result = executeGetCostAndUsageWithResources(finalRequest);
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
    public java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(GetCostCategoriesRequest request) {

        return getCostCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(final GetCostCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCostCategoriesRequest, GetCostCategoriesResult> asyncHandler) {
        final GetCostCategoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCostCategoriesResult>() {
            @Override
            public GetCostCategoriesResult call() throws Exception {
                GetCostCategoriesResult result = null;

                try {
                    result = executeGetCostCategories(finalRequest);
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
    public java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(GetCostForecastRequest request) {

        return getCostForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(final GetCostForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCostForecastRequest, GetCostForecastResult> asyncHandler) {
        final GetCostForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCostForecastResult>() {
            @Override
            public GetCostForecastResult call() throws Exception {
                GetCostForecastResult result = null;

                try {
                    result = executeGetCostForecast(finalRequest);
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
    public java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(GetDimensionValuesRequest request) {

        return getDimensionValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(final GetDimensionValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDimensionValuesRequest, GetDimensionValuesResult> asyncHandler) {
        final GetDimensionValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDimensionValuesResult>() {
            @Override
            public GetDimensionValuesResult call() throws Exception {
                GetDimensionValuesResult result = null;

                try {
                    result = executeGetDimensionValues(finalRequest);
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
    public java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(GetReservationCoverageRequest request) {

        return getReservationCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(final GetReservationCoverageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservationCoverageRequest, GetReservationCoverageResult> asyncHandler) {
        final GetReservationCoverageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReservationCoverageResult>() {
            @Override
            public GetReservationCoverageResult call() throws Exception {
                GetReservationCoverageResult result = null;

                try {
                    result = executeGetReservationCoverage(finalRequest);
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
    public java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            GetReservationPurchaseRecommendationRequest request) {

        return getReservationPurchaseRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            final GetReservationPurchaseRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservationPurchaseRecommendationRequest, GetReservationPurchaseRecommendationResult> asyncHandler) {
        final GetReservationPurchaseRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReservationPurchaseRecommendationResult>() {
            @Override
            public GetReservationPurchaseRecommendationResult call() throws Exception {
                GetReservationPurchaseRecommendationResult result = null;

                try {
                    result = executeGetReservationPurchaseRecommendation(finalRequest);
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
    public java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(GetReservationUtilizationRequest request) {

        return getReservationUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(final GetReservationUtilizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservationUtilizationRequest, GetReservationUtilizationResult> asyncHandler) {
        final GetReservationUtilizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReservationUtilizationResult>() {
            @Override
            public GetReservationUtilizationResult call() throws Exception {
                GetReservationUtilizationResult result = null;

                try {
                    result = executeGetReservationUtilization(finalRequest);
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
    public java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(GetRightsizingRecommendationRequest request) {

        return getRightsizingRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(final GetRightsizingRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRightsizingRecommendationRequest, GetRightsizingRecommendationResult> asyncHandler) {
        final GetRightsizingRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRightsizingRecommendationResult>() {
            @Override
            public GetRightsizingRecommendationResult call() throws Exception {
                GetRightsizingRecommendationResult result = null;

                try {
                    result = executeGetRightsizingRecommendation(finalRequest);
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
    public java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(GetSavingsPlansCoverageRequest request) {

        return getSavingsPlansCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(final GetSavingsPlansCoverageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSavingsPlansCoverageRequest, GetSavingsPlansCoverageResult> asyncHandler) {
        final GetSavingsPlansCoverageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSavingsPlansCoverageResult>() {
            @Override
            public GetSavingsPlansCoverageResult call() throws Exception {
                GetSavingsPlansCoverageResult result = null;

                try {
                    result = executeGetSavingsPlansCoverage(finalRequest);
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
    public java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            GetSavingsPlansPurchaseRecommendationRequest request) {

        return getSavingsPlansPurchaseRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            final GetSavingsPlansPurchaseRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSavingsPlansPurchaseRecommendationRequest, GetSavingsPlansPurchaseRecommendationResult> asyncHandler) {
        final GetSavingsPlansPurchaseRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSavingsPlansPurchaseRecommendationResult>() {
            @Override
            public GetSavingsPlansPurchaseRecommendationResult call() throws Exception {
                GetSavingsPlansPurchaseRecommendationResult result = null;

                try {
                    result = executeGetSavingsPlansPurchaseRecommendation(finalRequest);
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
    public java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(GetSavingsPlansUtilizationRequest request) {

        return getSavingsPlansUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(final GetSavingsPlansUtilizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationRequest, GetSavingsPlansUtilizationResult> asyncHandler) {
        final GetSavingsPlansUtilizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSavingsPlansUtilizationResult>() {
            @Override
            public GetSavingsPlansUtilizationResult call() throws Exception {
                GetSavingsPlansUtilizationResult result = null;

                try {
                    result = executeGetSavingsPlansUtilization(finalRequest);
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
    public java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            GetSavingsPlansUtilizationDetailsRequest request) {

        return getSavingsPlansUtilizationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            final GetSavingsPlansUtilizationDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationDetailsRequest, GetSavingsPlansUtilizationDetailsResult> asyncHandler) {
        final GetSavingsPlansUtilizationDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSavingsPlansUtilizationDetailsResult>() {
            @Override
            public GetSavingsPlansUtilizationDetailsResult call() throws Exception {
                GetSavingsPlansUtilizationDetailsResult result = null;

                try {
                    result = executeGetSavingsPlansUtilizationDetails(finalRequest);
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
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(final GetTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {
        final GetTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagsResult>() {
            @Override
            public GetTagsResult call() throws Exception {
                GetTagsResult result = null;

                try {
                    result = executeGetTags(finalRequest);
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
    public java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(GetUsageForecastRequest request) {

        return getUsageForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(final GetUsageForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsageForecastRequest, GetUsageForecastResult> asyncHandler) {
        final GetUsageForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsageForecastResult>() {
            @Override
            public GetUsageForecastResult call() throws Exception {
                GetUsageForecastResult result = null;

                try {
                    result = executeGetUsageForecast(finalRequest);
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
    public java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(ListCostCategoryDefinitionsRequest request) {

        return listCostCategoryDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(final ListCostCategoryDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCostCategoryDefinitionsRequest, ListCostCategoryDefinitionsResult> asyncHandler) {
        final ListCostCategoryDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCostCategoryDefinitionsResult>() {
            @Override
            public ListCostCategoryDefinitionsResult call() throws Exception {
                ListCostCategoryDefinitionsResult result = null;

                try {
                    result = executeListCostCategoryDefinitions(finalRequest);
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
    public java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(ProvideAnomalyFeedbackRequest request) {

        return provideAnomalyFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(final ProvideAnomalyFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvideAnomalyFeedbackRequest, ProvideAnomalyFeedbackResult> asyncHandler) {
        final ProvideAnomalyFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvideAnomalyFeedbackResult>() {
            @Override
            public ProvideAnomalyFeedbackResult call() throws Exception {
                ProvideAnomalyFeedbackResult result = null;

                try {
                    result = executeProvideAnomalyFeedback(finalRequest);
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
    public java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(UpdateAnomalyMonitorRequest request) {

        return updateAnomalyMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(final UpdateAnomalyMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnomalyMonitorRequest, UpdateAnomalyMonitorResult> asyncHandler) {
        final UpdateAnomalyMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnomalyMonitorResult>() {
            @Override
            public UpdateAnomalyMonitorResult call() throws Exception {
                UpdateAnomalyMonitorResult result = null;

                try {
                    result = executeUpdateAnomalyMonitor(finalRequest);
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
    public java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(UpdateAnomalySubscriptionRequest request) {

        return updateAnomalySubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(final UpdateAnomalySubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnomalySubscriptionRequest, UpdateAnomalySubscriptionResult> asyncHandler) {
        final UpdateAnomalySubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnomalySubscriptionResult>() {
            @Override
            public UpdateAnomalySubscriptionResult call() throws Exception {
                UpdateAnomalySubscriptionResult result = null;

                try {
                    result = executeUpdateAnomalySubscription(finalRequest);
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
    public java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(UpdateCostCategoryDefinitionRequest request) {

        return updateCostCategoryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(final UpdateCostCategoryDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCostCategoryDefinitionRequest, UpdateCostCategoryDefinitionResult> asyncHandler) {
        final UpdateCostCategoryDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCostCategoryDefinitionResult>() {
            @Override
            public UpdateCostCategoryDefinitionResult call() throws Exception {
                UpdateCostCategoryDefinitionResult result = null;

                try {
                    result = executeUpdateCostCategoryDefinition(finalRequest);
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
