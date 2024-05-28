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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Cost Optimization Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You can use the Cost Optimization Hub API to programmatically identify, filter, aggregate, and quantify savings for
 * your cost optimization recommendations across multiple Amazon Web Services Regions and Amazon Web Services accounts
 * in your organization.
 * </p>
 * <p>
 * The Cost Optimization Hub API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://cost-optimization-hub.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCostOptimizationHubAsyncClient extends AWSCostOptimizationHubClient implements AWSCostOptimizationHubAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCostOptimizationHubAsyncClientBuilder asyncBuilder() {
        return AWSCostOptimizationHubAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Cost Optimization Hub using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCostOptimizationHubAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Cost Optimization Hub using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCostOptimizationHubAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(GetPreferencesRequest request) {

        return getPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(final GetPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPreferencesRequest, GetPreferencesResult> asyncHandler) {
        final GetPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPreferencesResult>() {
            @Override
            public GetPreferencesResult call() throws Exception {
                GetPreferencesResult result = null;

                try {
                    result = executeGetPreferences(finalRequest);
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
    public java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest request) {

        return getRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(final GetRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationRequest, GetRecommendationResult> asyncHandler) {
        final GetRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationResult>() {
            @Override
            public GetRecommendationResult call() throws Exception {
                GetRecommendationResult result = null;

                try {
                    result = executeGetRecommendation(finalRequest);
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
    public java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(ListEnrollmentStatusesRequest request) {

        return listEnrollmentStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(final ListEnrollmentStatusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnrollmentStatusesRequest, ListEnrollmentStatusesResult> asyncHandler) {
        final ListEnrollmentStatusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnrollmentStatusesResult>() {
            @Override
            public ListEnrollmentStatusesResult call() throws Exception {
                ListEnrollmentStatusesResult result = null;

                try {
                    result = executeListEnrollmentStatuses(finalRequest);
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
    public java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(ListRecommendationSummariesRequest request) {

        return listRecommendationSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(final ListRecommendationSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationSummariesRequest, ListRecommendationSummariesResult> asyncHandler) {
        final ListRecommendationSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationSummariesResult>() {
            @Override
            public ListRecommendationSummariesResult call() throws Exception {
                ListRecommendationSummariesResult result = null;

                try {
                    result = executeListRecommendationSummaries(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request) {

        return updateEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(final UpdateEnrollmentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler) {
        final UpdateEnrollmentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnrollmentStatusResult>() {
            @Override
            public UpdateEnrollmentStatusResult call() throws Exception {
                UpdateEnrollmentStatusResult result = null;

                try {
                    result = executeUpdateEnrollmentStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(UpdatePreferencesRequest request) {

        return updatePreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(final UpdatePreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePreferencesRequest, UpdatePreferencesResult> asyncHandler) {
        final UpdatePreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePreferencesResult>() {
            @Override
            public UpdatePreferencesResult call() throws Exception {
                UpdatePreferencesResult result = null;

                try {
                    result = executeUpdatePreferences(finalRequest);
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
