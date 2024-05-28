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
package com.amazonaws.services.entityresolution;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSEntityResolution asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Entity Resolution API Reference</i>.
 * </p>
 * <p>
 * Entity Resolution is an Amazon Web Services service that provides pre-configured entity resolution capabilities that
 * enable developers and analysts at advertising and marketing companies to build an accurate and complete view of their
 * consumers.
 * </p>
 * <p>
 * With Entity Resolution, you can match source records containing consumer identifiers, such as name, email address,
 * and phone number. This is true even when these records have incomplete or conflicting identifiers. For example,
 * Entity Resolution can effectively match a source record from a customer relationship management (CRM) system with a
 * source record from a marketing system containing campaign information.
 * </p>
 * <p>
 * To learn more about Entity Resolution concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/entityresolution/latest/userguide/what-is-service.html">Entity Resolution User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEntityResolutionAsyncClient extends AWSEntityResolutionClient implements AWSEntityResolutionAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSEntityResolutionAsyncClientBuilder asyncBuilder() {
        return AWSEntityResolutionAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSEntityResolution using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSEntityResolutionAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSEntityResolution using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSEntityResolutionAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddPolicyStatementResult> addPolicyStatementAsync(AddPolicyStatementRequest request) {

        return addPolicyStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPolicyStatementResult> addPolicyStatementAsync(final AddPolicyStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPolicyStatementRequest, AddPolicyStatementResult> asyncHandler) {
        final AddPolicyStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddPolicyStatementResult>() {
            @Override
            public AddPolicyStatementResult call() throws Exception {
                AddPolicyStatementResult result = null;

                try {
                    result = executeAddPolicyStatement(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteUniqueIdResult> batchDeleteUniqueIdAsync(BatchDeleteUniqueIdRequest request) {

        return batchDeleteUniqueIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteUniqueIdResult> batchDeleteUniqueIdAsync(final BatchDeleteUniqueIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteUniqueIdRequest, BatchDeleteUniqueIdResult> asyncHandler) {
        final BatchDeleteUniqueIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteUniqueIdResult>() {
            @Override
            public BatchDeleteUniqueIdResult call() throws Exception {
                BatchDeleteUniqueIdResult result = null;

                try {
                    result = executeBatchDeleteUniqueId(finalRequest);
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
    public java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(CreateIdMappingWorkflowRequest request) {

        return createIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(final CreateIdMappingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdMappingWorkflowRequest, CreateIdMappingWorkflowResult> asyncHandler) {
        final CreateIdMappingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdMappingWorkflowResult>() {
            @Override
            public CreateIdMappingWorkflowResult call() throws Exception {
                CreateIdMappingWorkflowResult result = null;

                try {
                    result = executeCreateIdMappingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<CreateIdNamespaceResult> createIdNamespaceAsync(CreateIdNamespaceRequest request) {

        return createIdNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdNamespaceResult> createIdNamespaceAsync(final CreateIdNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdNamespaceRequest, CreateIdNamespaceResult> asyncHandler) {
        final CreateIdNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdNamespaceResult>() {
            @Override
            public CreateIdNamespaceResult call() throws Exception {
                CreateIdNamespaceResult result = null;

                try {
                    result = executeCreateIdNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(CreateMatchingWorkflowRequest request) {

        return createMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(final CreateMatchingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMatchingWorkflowRequest, CreateMatchingWorkflowResult> asyncHandler) {
        final CreateMatchingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMatchingWorkflowResult>() {
            @Override
            public CreateMatchingWorkflowResult call() throws Exception {
                CreateMatchingWorkflowResult result = null;

                try {
                    result = executeCreateMatchingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(CreateSchemaMappingRequest request) {

        return createSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(final CreateSchemaMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaMappingRequest, CreateSchemaMappingResult> asyncHandler) {
        final CreateSchemaMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaMappingResult>() {
            @Override
            public CreateSchemaMappingResult call() throws Exception {
                CreateSchemaMappingResult result = null;

                try {
                    result = executeCreateSchemaMapping(finalRequest);
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
    public java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(DeleteIdMappingWorkflowRequest request) {

        return deleteIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(final DeleteIdMappingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdMappingWorkflowRequest, DeleteIdMappingWorkflowResult> asyncHandler) {
        final DeleteIdMappingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdMappingWorkflowResult>() {
            @Override
            public DeleteIdMappingWorkflowResult call() throws Exception {
                DeleteIdMappingWorkflowResult result = null;

                try {
                    result = executeDeleteIdMappingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeleteIdNamespaceResult> deleteIdNamespaceAsync(DeleteIdNamespaceRequest request) {

        return deleteIdNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdNamespaceResult> deleteIdNamespaceAsync(final DeleteIdNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdNamespaceRequest, DeleteIdNamespaceResult> asyncHandler) {
        final DeleteIdNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdNamespaceResult>() {
            @Override
            public DeleteIdNamespaceResult call() throws Exception {
                DeleteIdNamespaceResult result = null;

                try {
                    result = executeDeleteIdNamespace(finalRequest);
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
    public java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(DeleteMatchingWorkflowRequest request) {

        return deleteMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(final DeleteMatchingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMatchingWorkflowRequest, DeleteMatchingWorkflowResult> asyncHandler) {
        final DeleteMatchingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMatchingWorkflowResult>() {
            @Override
            public DeleteMatchingWorkflowResult call() throws Exception {
                DeleteMatchingWorkflowResult result = null;

                try {
                    result = executeDeleteMatchingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyStatementResult> deletePolicyStatementAsync(DeletePolicyStatementRequest request) {

        return deletePolicyStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyStatementResult> deletePolicyStatementAsync(final DeletePolicyStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyStatementRequest, DeletePolicyStatementResult> asyncHandler) {
        final DeletePolicyStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyStatementResult>() {
            @Override
            public DeletePolicyStatementResult call() throws Exception {
                DeletePolicyStatementResult result = null;

                try {
                    result = executeDeletePolicyStatement(finalRequest);
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
    public java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(DeleteSchemaMappingRequest request) {

        return deleteSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(final DeleteSchemaMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaMappingRequest, DeleteSchemaMappingResult> asyncHandler) {
        final DeleteSchemaMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaMappingResult>() {
            @Override
            public DeleteSchemaMappingResult call() throws Exception {
                DeleteSchemaMappingResult result = null;

                try {
                    result = executeDeleteSchemaMapping(finalRequest);
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
    public java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(GetIdMappingJobRequest request) {

        return getIdMappingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(final GetIdMappingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdMappingJobRequest, GetIdMappingJobResult> asyncHandler) {
        final GetIdMappingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdMappingJobResult>() {
            @Override
            public GetIdMappingJobResult call() throws Exception {
                GetIdMappingJobResult result = null;

                try {
                    result = executeGetIdMappingJob(finalRequest);
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
    public java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(GetIdMappingWorkflowRequest request) {

        return getIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(final GetIdMappingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdMappingWorkflowRequest, GetIdMappingWorkflowResult> asyncHandler) {
        final GetIdMappingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdMappingWorkflowResult>() {
            @Override
            public GetIdMappingWorkflowResult call() throws Exception {
                GetIdMappingWorkflowResult result = null;

                try {
                    result = executeGetIdMappingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetIdNamespaceResult> getIdNamespaceAsync(GetIdNamespaceRequest request) {

        return getIdNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdNamespaceResult> getIdNamespaceAsync(final GetIdNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdNamespaceRequest, GetIdNamespaceResult> asyncHandler) {
        final GetIdNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdNamespaceResult>() {
            @Override
            public GetIdNamespaceResult call() throws Exception {
                GetIdNamespaceResult result = null;

                try {
                    result = executeGetIdNamespace(finalRequest);
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
    public java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(GetMatchIdRequest request) {

        return getMatchIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(final GetMatchIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMatchIdRequest, GetMatchIdResult> asyncHandler) {
        final GetMatchIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMatchIdResult>() {
            @Override
            public GetMatchIdResult call() throws Exception {
                GetMatchIdResult result = null;

                try {
                    result = executeGetMatchId(finalRequest);
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
    public java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(GetMatchingJobRequest request) {

        return getMatchingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(final GetMatchingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMatchingJobRequest, GetMatchingJobResult> asyncHandler) {
        final GetMatchingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMatchingJobResult>() {
            @Override
            public GetMatchingJobResult call() throws Exception {
                GetMatchingJobResult result = null;

                try {
                    result = executeGetMatchingJob(finalRequest);
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
    public java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(GetMatchingWorkflowRequest request) {

        return getMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(final GetMatchingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMatchingWorkflowRequest, GetMatchingWorkflowResult> asyncHandler) {
        final GetMatchingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMatchingWorkflowResult>() {
            @Override
            public GetMatchingWorkflowResult call() throws Exception {
                GetMatchingWorkflowResult result = null;

                try {
                    result = executeGetMatchingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(GetSchemaMappingRequest request) {

        return getSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(final GetSchemaMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaMappingRequest, GetSchemaMappingResult> asyncHandler) {
        final GetSchemaMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaMappingResult>() {
            @Override
            public GetSchemaMappingResult call() throws Exception {
                GetSchemaMappingResult result = null;

                try {
                    result = executeGetSchemaMapping(finalRequest);
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
    public java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(ListIdMappingJobsRequest request) {

        return listIdMappingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(final ListIdMappingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdMappingJobsRequest, ListIdMappingJobsResult> asyncHandler) {
        final ListIdMappingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdMappingJobsResult>() {
            @Override
            public ListIdMappingJobsResult call() throws Exception {
                ListIdMappingJobsResult result = null;

                try {
                    result = executeListIdMappingJobs(finalRequest);
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
    public java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(ListIdMappingWorkflowsRequest request) {

        return listIdMappingWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(final ListIdMappingWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdMappingWorkflowsRequest, ListIdMappingWorkflowsResult> asyncHandler) {
        final ListIdMappingWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdMappingWorkflowsResult>() {
            @Override
            public ListIdMappingWorkflowsResult call() throws Exception {
                ListIdMappingWorkflowsResult result = null;

                try {
                    result = executeListIdMappingWorkflows(finalRequest);
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
    public java.util.concurrent.Future<ListIdNamespacesResult> listIdNamespacesAsync(ListIdNamespacesRequest request) {

        return listIdNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdNamespacesResult> listIdNamespacesAsync(final ListIdNamespacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdNamespacesRequest, ListIdNamespacesResult> asyncHandler) {
        final ListIdNamespacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdNamespacesResult>() {
            @Override
            public ListIdNamespacesResult call() throws Exception {
                ListIdNamespacesResult result = null;

                try {
                    result = executeListIdNamespaces(finalRequest);
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
    public java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(ListMatchingJobsRequest request) {

        return listMatchingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(final ListMatchingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMatchingJobsRequest, ListMatchingJobsResult> asyncHandler) {
        final ListMatchingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMatchingJobsResult>() {
            @Override
            public ListMatchingJobsResult call() throws Exception {
                ListMatchingJobsResult result = null;

                try {
                    result = executeListMatchingJobs(finalRequest);
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
    public java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(ListMatchingWorkflowsRequest request) {

        return listMatchingWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(final ListMatchingWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMatchingWorkflowsRequest, ListMatchingWorkflowsResult> asyncHandler) {
        final ListMatchingWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMatchingWorkflowsResult>() {
            @Override
            public ListMatchingWorkflowsResult call() throws Exception {
                ListMatchingWorkflowsResult result = null;

                try {
                    result = executeListMatchingWorkflows(finalRequest);
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
    public java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(ListProviderServicesRequest request) {

        return listProviderServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(final ListProviderServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProviderServicesRequest, ListProviderServicesResult> asyncHandler) {
        final ListProviderServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProviderServicesResult>() {
            @Override
            public ListProviderServicesResult call() throws Exception {
                ListProviderServicesResult result = null;

                try {
                    result = executeListProviderServices(finalRequest);
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
    public java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(ListSchemaMappingsRequest request) {

        return listSchemaMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(final ListSchemaMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemaMappingsRequest, ListSchemaMappingsResult> asyncHandler) {
        final ListSchemaMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemaMappingsResult>() {
            @Override
            public ListSchemaMappingsResult call() throws Exception {
                ListSchemaMappingsResult result = null;

                try {
                    result = executeListSchemaMappings(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest request) {

        return putPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(final PutPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler) {
        final PutPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPolicyResult>() {
            @Override
            public PutPolicyResult call() throws Exception {
                PutPolicyResult result = null;

                try {
                    result = executePutPolicy(finalRequest);
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
    public java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(StartIdMappingJobRequest request) {

        return startIdMappingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(final StartIdMappingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartIdMappingJobRequest, StartIdMappingJobResult> asyncHandler) {
        final StartIdMappingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartIdMappingJobResult>() {
            @Override
            public StartIdMappingJobResult call() throws Exception {
                StartIdMappingJobResult result = null;

                try {
                    result = executeStartIdMappingJob(finalRequest);
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
    public java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(StartMatchingJobRequest request) {

        return startMatchingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(final StartMatchingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMatchingJobRequest, StartMatchingJobResult> asyncHandler) {
        final StartMatchingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMatchingJobResult>() {
            @Override
            public StartMatchingJobResult call() throws Exception {
                StartMatchingJobResult result = null;

                try {
                    result = executeStartMatchingJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(UpdateIdMappingWorkflowRequest request) {

        return updateIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(final UpdateIdMappingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdMappingWorkflowRequest, UpdateIdMappingWorkflowResult> asyncHandler) {
        final UpdateIdMappingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdMappingWorkflowResult>() {
            @Override
            public UpdateIdMappingWorkflowResult call() throws Exception {
                UpdateIdMappingWorkflowResult result = null;

                try {
                    result = executeUpdateIdMappingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<UpdateIdNamespaceResult> updateIdNamespaceAsync(UpdateIdNamespaceRequest request) {

        return updateIdNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdNamespaceResult> updateIdNamespaceAsync(final UpdateIdNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdNamespaceRequest, UpdateIdNamespaceResult> asyncHandler) {
        final UpdateIdNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdNamespaceResult>() {
            @Override
            public UpdateIdNamespaceResult call() throws Exception {
                UpdateIdNamespaceResult result = null;

                try {
                    result = executeUpdateIdNamespace(finalRequest);
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
    public java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(UpdateMatchingWorkflowRequest request) {

        return updateMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(final UpdateMatchingWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMatchingWorkflowRequest, UpdateMatchingWorkflowResult> asyncHandler) {
        final UpdateMatchingWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMatchingWorkflowResult>() {
            @Override
            public UpdateMatchingWorkflowResult call() throws Exception {
                UpdateMatchingWorkflowResult result = null;

                try {
                    result = executeUpdateMatchingWorkflow(finalRequest);
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
    public java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(UpdateSchemaMappingRequest request) {

        return updateSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(final UpdateSchemaMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSchemaMappingRequest, UpdateSchemaMappingResult> asyncHandler) {
        final UpdateSchemaMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSchemaMappingResult>() {
            @Override
            public UpdateSchemaMappingResult call() throws Exception {
                UpdateSchemaMappingResult result = null;

                try {
                    result = executeUpdateSchemaMapping(finalRequest);
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
