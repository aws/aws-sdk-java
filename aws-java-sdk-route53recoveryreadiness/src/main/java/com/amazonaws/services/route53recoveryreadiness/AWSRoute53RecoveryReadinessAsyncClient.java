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
package com.amazonaws.services.route53recoveryreadiness;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoveryreadiness.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Route53 Recovery Readiness asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Recovery readiness
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryReadinessAsyncClient extends AWSRoute53RecoveryReadinessClient implements AWSRoute53RecoveryReadinessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRoute53RecoveryReadinessAsyncClientBuilder asyncBuilder() {
        return AWSRoute53RecoveryReadinessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Route53 Recovery Readiness using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryReadinessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Route53 Recovery Readiness using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRoute53RecoveryReadinessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCellResult> createCellAsync(CreateCellRequest request) {

        return createCellAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCellResult> createCellAsync(final CreateCellRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCellRequest, CreateCellResult> asyncHandler) {
        final CreateCellRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCellResult>() {
            @Override
            public CreateCellResult call() throws Exception {
                CreateCellResult result = null;

                try {
                    result = executeCreateCell(finalRequest);
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
    public java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            CreateCrossAccountAuthorizationRequest request) {

        return createCrossAccountAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            final CreateCrossAccountAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCrossAccountAuthorizationRequest, CreateCrossAccountAuthorizationResult> asyncHandler) {
        final CreateCrossAccountAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCrossAccountAuthorizationResult>() {
            @Override
            public CreateCrossAccountAuthorizationResult call() throws Exception {
                CreateCrossAccountAuthorizationResult result = null;

                try {
                    result = executeCreateCrossAccountAuthorization(finalRequest);
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
    public java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(CreateReadinessCheckRequest request) {

        return createReadinessCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(final CreateReadinessCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReadinessCheckRequest, CreateReadinessCheckResult> asyncHandler) {
        final CreateReadinessCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReadinessCheckResult>() {
            @Override
            public CreateReadinessCheckResult call() throws Exception {
                CreateReadinessCheckResult result = null;

                try {
                    result = executeCreateReadinessCheck(finalRequest);
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
    public java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(CreateRecoveryGroupRequest request) {

        return createRecoveryGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(final CreateRecoveryGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRecoveryGroupRequest, CreateRecoveryGroupResult> asyncHandler) {
        final CreateRecoveryGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRecoveryGroupResult>() {
            @Override
            public CreateRecoveryGroupResult call() throws Exception {
                CreateRecoveryGroupResult result = null;

                try {
                    result = executeCreateRecoveryGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(CreateResourceSetRequest request) {

        return createResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(final CreateResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceSetRequest, CreateResourceSetResult> asyncHandler) {
        final CreateResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceSetResult>() {
            @Override
            public CreateResourceSetResult call() throws Exception {
                CreateResourceSetResult result = null;

                try {
                    result = executeCreateResourceSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(DeleteCellRequest request) {

        return deleteCellAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(final DeleteCellRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCellRequest, DeleteCellResult> asyncHandler) {
        final DeleteCellRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCellResult>() {
            @Override
            public DeleteCellResult call() throws Exception {
                DeleteCellResult result = null;

                try {
                    result = executeDeleteCell(finalRequest);
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
    public java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            DeleteCrossAccountAuthorizationRequest request) {

        return deleteCrossAccountAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            final DeleteCrossAccountAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCrossAccountAuthorizationRequest, DeleteCrossAccountAuthorizationResult> asyncHandler) {
        final DeleteCrossAccountAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCrossAccountAuthorizationResult>() {
            @Override
            public DeleteCrossAccountAuthorizationResult call() throws Exception {
                DeleteCrossAccountAuthorizationResult result = null;

                try {
                    result = executeDeleteCrossAccountAuthorization(finalRequest);
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
    public java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(DeleteReadinessCheckRequest request) {

        return deleteReadinessCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(final DeleteReadinessCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReadinessCheckRequest, DeleteReadinessCheckResult> asyncHandler) {
        final DeleteReadinessCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReadinessCheckResult>() {
            @Override
            public DeleteReadinessCheckResult call() throws Exception {
                DeleteReadinessCheckResult result = null;

                try {
                    result = executeDeleteReadinessCheck(finalRequest);
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
    public java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(DeleteRecoveryGroupRequest request) {

        return deleteRecoveryGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(final DeleteRecoveryGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecoveryGroupRequest, DeleteRecoveryGroupResult> asyncHandler) {
        final DeleteRecoveryGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecoveryGroupResult>() {
            @Override
            public DeleteRecoveryGroupResult call() throws Exception {
                DeleteRecoveryGroupResult result = null;

                try {
                    result = executeDeleteRecoveryGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest request) {

        return deleteResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(final DeleteResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceSetRequest, DeleteResourceSetResult> asyncHandler) {
        final DeleteResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceSetResult>() {
            @Override
            public DeleteResourceSetResult call() throws Exception {
                DeleteResourceSetResult result = null;

                try {
                    result = executeDeleteResourceSet(finalRequest);
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
    public java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(GetArchitectureRecommendationsRequest request) {

        return getArchitectureRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(
            final GetArchitectureRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchitectureRecommendationsRequest, GetArchitectureRecommendationsResult> asyncHandler) {
        final GetArchitectureRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchitectureRecommendationsResult>() {
            @Override
            public GetArchitectureRecommendationsResult call() throws Exception {
                GetArchitectureRecommendationsResult result = null;

                try {
                    result = executeGetArchitectureRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetCellResult> getCellAsync(GetCellRequest request) {

        return getCellAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCellResult> getCellAsync(final GetCellRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCellRequest, GetCellResult> asyncHandler) {
        final GetCellRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCellResult>() {
            @Override
            public GetCellResult call() throws Exception {
                GetCellResult result = null;

                try {
                    result = executeGetCell(finalRequest);
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
    public java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(GetCellReadinessSummaryRequest request) {

        return getCellReadinessSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(final GetCellReadinessSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCellReadinessSummaryRequest, GetCellReadinessSummaryResult> asyncHandler) {
        final GetCellReadinessSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCellReadinessSummaryResult>() {
            @Override
            public GetCellReadinessSummaryResult call() throws Exception {
                GetCellReadinessSummaryResult result = null;

                try {
                    result = executeGetCellReadinessSummary(finalRequest);
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
    public java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(GetReadinessCheckRequest request) {

        return getReadinessCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(final GetReadinessCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadinessCheckRequest, GetReadinessCheckResult> asyncHandler) {
        final GetReadinessCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadinessCheckResult>() {
            @Override
            public GetReadinessCheckResult call() throws Exception {
                GetReadinessCheckResult result = null;

                try {
                    result = executeGetReadinessCheck(finalRequest);
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
    public java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            GetReadinessCheckResourceStatusRequest request) {

        return getReadinessCheckResourceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            final GetReadinessCheckResourceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadinessCheckResourceStatusRequest, GetReadinessCheckResourceStatusResult> asyncHandler) {
        final GetReadinessCheckResourceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadinessCheckResourceStatusResult>() {
            @Override
            public GetReadinessCheckResourceStatusResult call() throws Exception {
                GetReadinessCheckResourceStatusResult result = null;

                try {
                    result = executeGetReadinessCheckResourceStatus(finalRequest);
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
    public java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(GetReadinessCheckStatusRequest request) {

        return getReadinessCheckStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(final GetReadinessCheckStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadinessCheckStatusRequest, GetReadinessCheckStatusResult> asyncHandler) {
        final GetReadinessCheckStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadinessCheckStatusResult>() {
            @Override
            public GetReadinessCheckStatusResult call() throws Exception {
                GetReadinessCheckStatusResult result = null;

                try {
                    result = executeGetReadinessCheckStatus(finalRequest);
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
    public java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(GetRecoveryGroupRequest request) {

        return getRecoveryGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(final GetRecoveryGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupRequest, GetRecoveryGroupResult> asyncHandler) {
        final GetRecoveryGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecoveryGroupResult>() {
            @Override
            public GetRecoveryGroupResult call() throws Exception {
                GetRecoveryGroupResult result = null;

                try {
                    result = executeGetRecoveryGroup(finalRequest);
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
    public java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            GetRecoveryGroupReadinessSummaryRequest request) {

        return getRecoveryGroupReadinessSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            final GetRecoveryGroupReadinessSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupReadinessSummaryRequest, GetRecoveryGroupReadinessSummaryResult> asyncHandler) {
        final GetRecoveryGroupReadinessSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecoveryGroupReadinessSummaryResult>() {
            @Override
            public GetRecoveryGroupReadinessSummaryResult call() throws Exception {
                GetRecoveryGroupReadinessSummaryResult result = null;

                try {
                    result = executeGetRecoveryGroupReadinessSummary(finalRequest);
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
    public java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest request) {

        return getResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(final GetResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceSetRequest, GetResourceSetResult> asyncHandler) {
        final GetResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceSetResult>() {
            @Override
            public GetResourceSetResult call() throws Exception {
                GetResourceSetResult result = null;

                try {
                    result = executeGetResourceSet(finalRequest);
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
    public java.util.concurrent.Future<ListCellsResult> listCellsAsync(ListCellsRequest request) {

        return listCellsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCellsResult> listCellsAsync(final ListCellsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCellsRequest, ListCellsResult> asyncHandler) {
        final ListCellsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCellsResult>() {
            @Override
            public ListCellsResult call() throws Exception {
                ListCellsResult result = null;

                try {
                    result = executeListCells(finalRequest);
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
    public java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(ListCrossAccountAuthorizationsRequest request) {

        return listCrossAccountAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(
            final ListCrossAccountAuthorizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCrossAccountAuthorizationsRequest, ListCrossAccountAuthorizationsResult> asyncHandler) {
        final ListCrossAccountAuthorizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCrossAccountAuthorizationsResult>() {
            @Override
            public ListCrossAccountAuthorizationsResult call() throws Exception {
                ListCrossAccountAuthorizationsResult result = null;

                try {
                    result = executeListCrossAccountAuthorizations(finalRequest);
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
    public java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(ListReadinessChecksRequest request) {

        return listReadinessChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(final ListReadinessChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReadinessChecksRequest, ListReadinessChecksResult> asyncHandler) {
        final ListReadinessChecksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReadinessChecksResult>() {
            @Override
            public ListReadinessChecksResult call() throws Exception {
                ListReadinessChecksResult result = null;

                try {
                    result = executeListReadinessChecks(finalRequest);
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
    public java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(ListRecoveryGroupsRequest request) {

        return listRecoveryGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(final ListRecoveryGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecoveryGroupsRequest, ListRecoveryGroupsResult> asyncHandler) {
        final ListRecoveryGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecoveryGroupsResult>() {
            @Override
            public ListRecoveryGroupsResult call() throws Exception {
                ListRecoveryGroupsResult result = null;

                try {
                    result = executeListRecoveryGroups(finalRequest);
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
    public java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest request) {

        return listResourceSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(final ListResourceSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceSetsRequest, ListResourceSetsResult> asyncHandler) {
        final ListResourceSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceSetsResult>() {
            @Override
            public ListResourceSetsResult call() throws Exception {
                ListResourceSetsResult result = null;

                try {
                    result = executeListResourceSets(finalRequest);
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
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest request) {

        return listTagsForResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(final ListTagsForResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler) {
        final ListTagsForResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourcesResult>() {
            @Override
            public ListTagsForResourcesResult call() throws Exception {
                ListTagsForResourcesResult result = null;

                try {
                    result = executeListTagsForResources(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateCellResult> updateCellAsync(UpdateCellRequest request) {

        return updateCellAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCellResult> updateCellAsync(final UpdateCellRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCellRequest, UpdateCellResult> asyncHandler) {
        final UpdateCellRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCellResult>() {
            @Override
            public UpdateCellResult call() throws Exception {
                UpdateCellResult result = null;

                try {
                    result = executeUpdateCell(finalRequest);
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
    public java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(UpdateReadinessCheckRequest request) {

        return updateReadinessCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(final UpdateReadinessCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReadinessCheckRequest, UpdateReadinessCheckResult> asyncHandler) {
        final UpdateReadinessCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReadinessCheckResult>() {
            @Override
            public UpdateReadinessCheckResult call() throws Exception {
                UpdateReadinessCheckResult result = null;

                try {
                    result = executeUpdateReadinessCheck(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(UpdateRecoveryGroupRequest request) {

        return updateRecoveryGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(final UpdateRecoveryGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecoveryGroupRequest, UpdateRecoveryGroupResult> asyncHandler) {
        final UpdateRecoveryGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecoveryGroupResult>() {
            @Override
            public UpdateRecoveryGroupResult call() throws Exception {
                UpdateRecoveryGroupResult result = null;

                try {
                    result = executeUpdateRecoveryGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(UpdateResourceSetRequest request) {

        return updateResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(final UpdateResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceSetRequest, UpdateResourceSetResult> asyncHandler) {
        final UpdateResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceSetResult>() {
            @Override
            public UpdateResourceSetResult call() throws Exception {
                UpdateResourceSetResult result = null;

                try {
                    result = executeUpdateResourceSet(finalRequest);
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
