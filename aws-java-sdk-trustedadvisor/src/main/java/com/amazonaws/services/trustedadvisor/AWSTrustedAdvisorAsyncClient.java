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
package com.amazonaws.services.trustedadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.trustedadvisor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing TrustedAdvisor Public API asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * TrustedAdvisor Public API
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTrustedAdvisorAsyncClient extends AWSTrustedAdvisorClient implements AWSTrustedAdvisorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSTrustedAdvisorAsyncClientBuilder asyncBuilder() {
        return AWSTrustedAdvisorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on TrustedAdvisor Public API using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSTrustedAdvisorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on TrustedAdvisor Public API using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSTrustedAdvisorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchUpdateRecommendationResourceExclusionResult> batchUpdateRecommendationResourceExclusionAsync(
            BatchUpdateRecommendationResourceExclusionRequest request) {

        return batchUpdateRecommendationResourceExclusionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateRecommendationResourceExclusionResult> batchUpdateRecommendationResourceExclusionAsync(
            final BatchUpdateRecommendationResourceExclusionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateRecommendationResourceExclusionRequest, BatchUpdateRecommendationResourceExclusionResult> asyncHandler) {
        final BatchUpdateRecommendationResourceExclusionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateRecommendationResourceExclusionResult>() {
            @Override
            public BatchUpdateRecommendationResourceExclusionResult call() throws Exception {
                BatchUpdateRecommendationResourceExclusionResult result = null;

                try {
                    result = executeBatchUpdateRecommendationResourceExclusion(finalRequest);
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
    public java.util.concurrent.Future<GetOrganizationRecommendationResult> getOrganizationRecommendationAsync(GetOrganizationRecommendationRequest request) {

        return getOrganizationRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationRecommendationResult> getOrganizationRecommendationAsync(
            final GetOrganizationRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOrganizationRecommendationRequest, GetOrganizationRecommendationResult> asyncHandler) {
        final GetOrganizationRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOrganizationRecommendationResult>() {
            @Override
            public GetOrganizationRecommendationResult call() throws Exception {
                GetOrganizationRecommendationResult result = null;

                try {
                    result = executeGetOrganizationRecommendation(finalRequest);
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
    public java.util.concurrent.Future<ListChecksResult> listChecksAsync(ListChecksRequest request) {

        return listChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChecksResult> listChecksAsync(final ListChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChecksRequest, ListChecksResult> asyncHandler) {
        final ListChecksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChecksResult>() {
            @Override
            public ListChecksResult call() throws Exception {
                ListChecksResult result = null;

                try {
                    result = executeListChecks(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationRecommendationAccountsResult> listOrganizationRecommendationAccountsAsync(
            ListOrganizationRecommendationAccountsRequest request) {

        return listOrganizationRecommendationAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationRecommendationAccountsResult> listOrganizationRecommendationAccountsAsync(
            final ListOrganizationRecommendationAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationAccountsRequest, ListOrganizationRecommendationAccountsResult> asyncHandler) {
        final ListOrganizationRecommendationAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationRecommendationAccountsResult>() {
            @Override
            public ListOrganizationRecommendationAccountsResult call() throws Exception {
                ListOrganizationRecommendationAccountsResult result = null;

                try {
                    result = executeListOrganizationRecommendationAccounts(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationRecommendationResourcesResult> listOrganizationRecommendationResourcesAsync(
            ListOrganizationRecommendationResourcesRequest request) {

        return listOrganizationRecommendationResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationRecommendationResourcesResult> listOrganizationRecommendationResourcesAsync(
            final ListOrganizationRecommendationResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationResourcesRequest, ListOrganizationRecommendationResourcesResult> asyncHandler) {
        final ListOrganizationRecommendationResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationRecommendationResourcesResult>() {
            @Override
            public ListOrganizationRecommendationResourcesResult call() throws Exception {
                ListOrganizationRecommendationResourcesResult result = null;

                try {
                    result = executeListOrganizationRecommendationResources(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationRecommendationsResult> listOrganizationRecommendationsAsync(
            ListOrganizationRecommendationsRequest request) {

        return listOrganizationRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationRecommendationsResult> listOrganizationRecommendationsAsync(
            final ListOrganizationRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationsRequest, ListOrganizationRecommendationsResult> asyncHandler) {
        final ListOrganizationRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationRecommendationsResult>() {
            @Override
            public ListOrganizationRecommendationsResult call() throws Exception {
                ListOrganizationRecommendationsResult result = null;

                try {
                    result = executeListOrganizationRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ListRecommendationResourcesResult> listRecommendationResourcesAsync(ListRecommendationResourcesRequest request) {

        return listRecommendationResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationResourcesResult> listRecommendationResourcesAsync(final ListRecommendationResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationResourcesRequest, ListRecommendationResourcesResult> asyncHandler) {
        final ListRecommendationResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationResourcesResult>() {
            @Override
            public ListRecommendationResourcesResult call() throws Exception {
                ListRecommendationResourcesResult result = null;

                try {
                    result = executeListRecommendationResources(finalRequest);
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
    public java.util.concurrent.Future<UpdateOrganizationRecommendationLifecycleResult> updateOrganizationRecommendationLifecycleAsync(
            UpdateOrganizationRecommendationLifecycleRequest request) {

        return updateOrganizationRecommendationLifecycleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationRecommendationLifecycleResult> updateOrganizationRecommendationLifecycleAsync(
            final UpdateOrganizationRecommendationLifecycleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrganizationRecommendationLifecycleRequest, UpdateOrganizationRecommendationLifecycleResult> asyncHandler) {
        final UpdateOrganizationRecommendationLifecycleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrganizationRecommendationLifecycleResult>() {
            @Override
            public UpdateOrganizationRecommendationLifecycleResult call() throws Exception {
                UpdateOrganizationRecommendationLifecycleResult result = null;

                try {
                    result = executeUpdateOrganizationRecommendationLifecycle(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecommendationLifecycleResult> updateRecommendationLifecycleAsync(UpdateRecommendationLifecycleRequest request) {

        return updateRecommendationLifecycleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecommendationLifecycleResult> updateRecommendationLifecycleAsync(
            final UpdateRecommendationLifecycleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecommendationLifecycleRequest, UpdateRecommendationLifecycleResult> asyncHandler) {
        final UpdateRecommendationLifecycleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecommendationLifecycleResult>() {
            @Override
            public UpdateRecommendationLifecycleResult call() throws Exception {
                UpdateRecommendationLifecycleResult result = null;

                try {
                    result = executeUpdateRecommendationLifecycle(finalRequest);
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
