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
package com.amazonaws.services.finspace;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing finspace asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * The FinSpace management service provides the APIs for managing FinSpace environments.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSfinspaceAsyncClient extends AWSfinspaceClient implements AWSfinspaceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSfinspaceAsyncClientBuilder asyncBuilder() {
        return AWSfinspaceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on finspace using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSfinspaceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on finspace using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSfinspaceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    @Deprecated
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<CreateKxChangesetResult> createKxChangesetAsync(CreateKxChangesetRequest request) {

        return createKxChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxChangesetResult> createKxChangesetAsync(final CreateKxChangesetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxChangesetRequest, CreateKxChangesetResult> asyncHandler) {
        final CreateKxChangesetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxChangesetResult>() {
            @Override
            public CreateKxChangesetResult call() throws Exception {
                CreateKxChangesetResult result = null;

                try {
                    result = executeCreateKxChangeset(finalRequest);
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
    public java.util.concurrent.Future<CreateKxClusterResult> createKxClusterAsync(CreateKxClusterRequest request) {

        return createKxClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxClusterResult> createKxClusterAsync(final CreateKxClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxClusterRequest, CreateKxClusterResult> asyncHandler) {
        final CreateKxClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxClusterResult>() {
            @Override
            public CreateKxClusterResult call() throws Exception {
                CreateKxClusterResult result = null;

                try {
                    result = executeCreateKxCluster(finalRequest);
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
    public java.util.concurrent.Future<CreateKxDatabaseResult> createKxDatabaseAsync(CreateKxDatabaseRequest request) {

        return createKxDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxDatabaseResult> createKxDatabaseAsync(final CreateKxDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxDatabaseRequest, CreateKxDatabaseResult> asyncHandler) {
        final CreateKxDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxDatabaseResult>() {
            @Override
            public CreateKxDatabaseResult call() throws Exception {
                CreateKxDatabaseResult result = null;

                try {
                    result = executeCreateKxDatabase(finalRequest);
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
    public java.util.concurrent.Future<CreateKxDataviewResult> createKxDataviewAsync(CreateKxDataviewRequest request) {

        return createKxDataviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxDataviewResult> createKxDataviewAsync(final CreateKxDataviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxDataviewRequest, CreateKxDataviewResult> asyncHandler) {
        final CreateKxDataviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxDataviewResult>() {
            @Override
            public CreateKxDataviewResult call() throws Exception {
                CreateKxDataviewResult result = null;

                try {
                    result = executeCreateKxDataview(finalRequest);
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
    public java.util.concurrent.Future<CreateKxEnvironmentResult> createKxEnvironmentAsync(CreateKxEnvironmentRequest request) {

        return createKxEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxEnvironmentResult> createKxEnvironmentAsync(final CreateKxEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxEnvironmentRequest, CreateKxEnvironmentResult> asyncHandler) {
        final CreateKxEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxEnvironmentResult>() {
            @Override
            public CreateKxEnvironmentResult call() throws Exception {
                CreateKxEnvironmentResult result = null;

                try {
                    result = executeCreateKxEnvironment(finalRequest);
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
    public java.util.concurrent.Future<CreateKxScalingGroupResult> createKxScalingGroupAsync(CreateKxScalingGroupRequest request) {

        return createKxScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxScalingGroupResult> createKxScalingGroupAsync(final CreateKxScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxScalingGroupRequest, CreateKxScalingGroupResult> asyncHandler) {
        final CreateKxScalingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxScalingGroupResult>() {
            @Override
            public CreateKxScalingGroupResult call() throws Exception {
                CreateKxScalingGroupResult result = null;

                try {
                    result = executeCreateKxScalingGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateKxUserResult> createKxUserAsync(CreateKxUserRequest request) {

        return createKxUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxUserResult> createKxUserAsync(final CreateKxUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxUserRequest, CreateKxUserResult> asyncHandler) {
        final CreateKxUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxUserResult>() {
            @Override
            public CreateKxUserResult call() throws Exception {
                CreateKxUserResult result = null;

                try {
                    result = executeCreateKxUser(finalRequest);
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
    public java.util.concurrent.Future<CreateKxVolumeResult> createKxVolumeAsync(CreateKxVolumeRequest request) {

        return createKxVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKxVolumeResult> createKxVolumeAsync(final CreateKxVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKxVolumeRequest, CreateKxVolumeResult> asyncHandler) {
        final CreateKxVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKxVolumeResult>() {
            @Override
            public CreateKxVolumeResult call() throws Exception {
                CreateKxVolumeResult result = null;

                try {
                    result = executeCreateKxVolume(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxClusterResult> deleteKxClusterAsync(DeleteKxClusterRequest request) {

        return deleteKxClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxClusterResult> deleteKxClusterAsync(final DeleteKxClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxClusterRequest, DeleteKxClusterResult> asyncHandler) {
        final DeleteKxClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxClusterResult>() {
            @Override
            public DeleteKxClusterResult call() throws Exception {
                DeleteKxClusterResult result = null;

                try {
                    result = executeDeleteKxCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxClusterNodeResult> deleteKxClusterNodeAsync(DeleteKxClusterNodeRequest request) {

        return deleteKxClusterNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxClusterNodeResult> deleteKxClusterNodeAsync(final DeleteKxClusterNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxClusterNodeRequest, DeleteKxClusterNodeResult> asyncHandler) {
        final DeleteKxClusterNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxClusterNodeResult>() {
            @Override
            public DeleteKxClusterNodeResult call() throws Exception {
                DeleteKxClusterNodeResult result = null;

                try {
                    result = executeDeleteKxClusterNode(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxDatabaseResult> deleteKxDatabaseAsync(DeleteKxDatabaseRequest request) {

        return deleteKxDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxDatabaseResult> deleteKxDatabaseAsync(final DeleteKxDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxDatabaseRequest, DeleteKxDatabaseResult> asyncHandler) {
        final DeleteKxDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxDatabaseResult>() {
            @Override
            public DeleteKxDatabaseResult call() throws Exception {
                DeleteKxDatabaseResult result = null;

                try {
                    result = executeDeleteKxDatabase(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxDataviewResult> deleteKxDataviewAsync(DeleteKxDataviewRequest request) {

        return deleteKxDataviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxDataviewResult> deleteKxDataviewAsync(final DeleteKxDataviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxDataviewRequest, DeleteKxDataviewResult> asyncHandler) {
        final DeleteKxDataviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxDataviewResult>() {
            @Override
            public DeleteKxDataviewResult call() throws Exception {
                DeleteKxDataviewResult result = null;

                try {
                    result = executeDeleteKxDataview(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxEnvironmentResult> deleteKxEnvironmentAsync(DeleteKxEnvironmentRequest request) {

        return deleteKxEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxEnvironmentResult> deleteKxEnvironmentAsync(final DeleteKxEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxEnvironmentRequest, DeleteKxEnvironmentResult> asyncHandler) {
        final DeleteKxEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxEnvironmentResult>() {
            @Override
            public DeleteKxEnvironmentResult call() throws Exception {
                DeleteKxEnvironmentResult result = null;

                try {
                    result = executeDeleteKxEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxScalingGroupResult> deleteKxScalingGroupAsync(DeleteKxScalingGroupRequest request) {

        return deleteKxScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxScalingGroupResult> deleteKxScalingGroupAsync(final DeleteKxScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxScalingGroupRequest, DeleteKxScalingGroupResult> asyncHandler) {
        final DeleteKxScalingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxScalingGroupResult>() {
            @Override
            public DeleteKxScalingGroupResult call() throws Exception {
                DeleteKxScalingGroupResult result = null;

                try {
                    result = executeDeleteKxScalingGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxUserResult> deleteKxUserAsync(DeleteKxUserRequest request) {

        return deleteKxUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxUserResult> deleteKxUserAsync(final DeleteKxUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxUserRequest, DeleteKxUserResult> asyncHandler) {
        final DeleteKxUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxUserResult>() {
            @Override
            public DeleteKxUserResult call() throws Exception {
                DeleteKxUserResult result = null;

                try {
                    result = executeDeleteKxUser(finalRequest);
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
    public java.util.concurrent.Future<DeleteKxVolumeResult> deleteKxVolumeAsync(DeleteKxVolumeRequest request) {

        return deleteKxVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKxVolumeResult> deleteKxVolumeAsync(final DeleteKxVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKxVolumeRequest, DeleteKxVolumeResult> asyncHandler) {
        final DeleteKxVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKxVolumeResult>() {
            @Override
            public DeleteKxVolumeResult call() throws Exception {
                DeleteKxVolumeResult result = null;

                try {
                    result = executeDeleteKxVolume(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(final GetEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {
        final GetEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentResult>() {
            @Override
            public GetEnvironmentResult call() throws Exception {
                GetEnvironmentResult result = null;

                try {
                    result = executeGetEnvironment(finalRequest);
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
    public java.util.concurrent.Future<GetKxChangesetResult> getKxChangesetAsync(GetKxChangesetRequest request) {

        return getKxChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxChangesetResult> getKxChangesetAsync(final GetKxChangesetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxChangesetRequest, GetKxChangesetResult> asyncHandler) {
        final GetKxChangesetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxChangesetResult>() {
            @Override
            public GetKxChangesetResult call() throws Exception {
                GetKxChangesetResult result = null;

                try {
                    result = executeGetKxChangeset(finalRequest);
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
    public java.util.concurrent.Future<GetKxClusterResult> getKxClusterAsync(GetKxClusterRequest request) {

        return getKxClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxClusterResult> getKxClusterAsync(final GetKxClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxClusterRequest, GetKxClusterResult> asyncHandler) {
        final GetKxClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxClusterResult>() {
            @Override
            public GetKxClusterResult call() throws Exception {
                GetKxClusterResult result = null;

                try {
                    result = executeGetKxCluster(finalRequest);
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
    public java.util.concurrent.Future<GetKxConnectionStringResult> getKxConnectionStringAsync(GetKxConnectionStringRequest request) {

        return getKxConnectionStringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxConnectionStringResult> getKxConnectionStringAsync(final GetKxConnectionStringRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxConnectionStringRequest, GetKxConnectionStringResult> asyncHandler) {
        final GetKxConnectionStringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxConnectionStringResult>() {
            @Override
            public GetKxConnectionStringResult call() throws Exception {
                GetKxConnectionStringResult result = null;

                try {
                    result = executeGetKxConnectionString(finalRequest);
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
    public java.util.concurrent.Future<GetKxDatabaseResult> getKxDatabaseAsync(GetKxDatabaseRequest request) {

        return getKxDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxDatabaseResult> getKxDatabaseAsync(final GetKxDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxDatabaseRequest, GetKxDatabaseResult> asyncHandler) {
        final GetKxDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxDatabaseResult>() {
            @Override
            public GetKxDatabaseResult call() throws Exception {
                GetKxDatabaseResult result = null;

                try {
                    result = executeGetKxDatabase(finalRequest);
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
    public java.util.concurrent.Future<GetKxDataviewResult> getKxDataviewAsync(GetKxDataviewRequest request) {

        return getKxDataviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxDataviewResult> getKxDataviewAsync(final GetKxDataviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxDataviewRequest, GetKxDataviewResult> asyncHandler) {
        final GetKxDataviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxDataviewResult>() {
            @Override
            public GetKxDataviewResult call() throws Exception {
                GetKxDataviewResult result = null;

                try {
                    result = executeGetKxDataview(finalRequest);
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
    public java.util.concurrent.Future<GetKxEnvironmentResult> getKxEnvironmentAsync(GetKxEnvironmentRequest request) {

        return getKxEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxEnvironmentResult> getKxEnvironmentAsync(final GetKxEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxEnvironmentRequest, GetKxEnvironmentResult> asyncHandler) {
        final GetKxEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxEnvironmentResult>() {
            @Override
            public GetKxEnvironmentResult call() throws Exception {
                GetKxEnvironmentResult result = null;

                try {
                    result = executeGetKxEnvironment(finalRequest);
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
    public java.util.concurrent.Future<GetKxScalingGroupResult> getKxScalingGroupAsync(GetKxScalingGroupRequest request) {

        return getKxScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxScalingGroupResult> getKxScalingGroupAsync(final GetKxScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxScalingGroupRequest, GetKxScalingGroupResult> asyncHandler) {
        final GetKxScalingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxScalingGroupResult>() {
            @Override
            public GetKxScalingGroupResult call() throws Exception {
                GetKxScalingGroupResult result = null;

                try {
                    result = executeGetKxScalingGroup(finalRequest);
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
    public java.util.concurrent.Future<GetKxUserResult> getKxUserAsync(GetKxUserRequest request) {

        return getKxUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxUserResult> getKxUserAsync(final GetKxUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxUserRequest, GetKxUserResult> asyncHandler) {
        final GetKxUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxUserResult>() {
            @Override
            public GetKxUserResult call() throws Exception {
                GetKxUserResult result = null;

                try {
                    result = executeGetKxUser(finalRequest);
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
    public java.util.concurrent.Future<GetKxVolumeResult> getKxVolumeAsync(GetKxVolumeRequest request) {

        return getKxVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKxVolumeResult> getKxVolumeAsync(final GetKxVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKxVolumeRequest, GetKxVolumeResult> asyncHandler) {
        final GetKxVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKxVolumeResult>() {
            @Override
            public GetKxVolumeResult call() throws Exception {
                GetKxVolumeResult result = null;

                try {
                    result = executeGetKxVolume(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
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
    public java.util.concurrent.Future<ListKxChangesetsResult> listKxChangesetsAsync(ListKxChangesetsRequest request) {

        return listKxChangesetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxChangesetsResult> listKxChangesetsAsync(final ListKxChangesetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxChangesetsRequest, ListKxChangesetsResult> asyncHandler) {
        final ListKxChangesetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxChangesetsResult>() {
            @Override
            public ListKxChangesetsResult call() throws Exception {
                ListKxChangesetsResult result = null;

                try {
                    result = executeListKxChangesets(finalRequest);
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
    public java.util.concurrent.Future<ListKxClusterNodesResult> listKxClusterNodesAsync(ListKxClusterNodesRequest request) {

        return listKxClusterNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxClusterNodesResult> listKxClusterNodesAsync(final ListKxClusterNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxClusterNodesRequest, ListKxClusterNodesResult> asyncHandler) {
        final ListKxClusterNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxClusterNodesResult>() {
            @Override
            public ListKxClusterNodesResult call() throws Exception {
                ListKxClusterNodesResult result = null;

                try {
                    result = executeListKxClusterNodes(finalRequest);
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
    public java.util.concurrent.Future<ListKxClustersResult> listKxClustersAsync(ListKxClustersRequest request) {

        return listKxClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxClustersResult> listKxClustersAsync(final ListKxClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxClustersRequest, ListKxClustersResult> asyncHandler) {
        final ListKxClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxClustersResult>() {
            @Override
            public ListKxClustersResult call() throws Exception {
                ListKxClustersResult result = null;

                try {
                    result = executeListKxClusters(finalRequest);
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
    public java.util.concurrent.Future<ListKxDatabasesResult> listKxDatabasesAsync(ListKxDatabasesRequest request) {

        return listKxDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxDatabasesResult> listKxDatabasesAsync(final ListKxDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxDatabasesRequest, ListKxDatabasesResult> asyncHandler) {
        final ListKxDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxDatabasesResult>() {
            @Override
            public ListKxDatabasesResult call() throws Exception {
                ListKxDatabasesResult result = null;

                try {
                    result = executeListKxDatabases(finalRequest);
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
    public java.util.concurrent.Future<ListKxDataviewsResult> listKxDataviewsAsync(ListKxDataviewsRequest request) {

        return listKxDataviewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxDataviewsResult> listKxDataviewsAsync(final ListKxDataviewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxDataviewsRequest, ListKxDataviewsResult> asyncHandler) {
        final ListKxDataviewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxDataviewsResult>() {
            @Override
            public ListKxDataviewsResult call() throws Exception {
                ListKxDataviewsResult result = null;

                try {
                    result = executeListKxDataviews(finalRequest);
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
    public java.util.concurrent.Future<ListKxEnvironmentsResult> listKxEnvironmentsAsync(ListKxEnvironmentsRequest request) {

        return listKxEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxEnvironmentsResult> listKxEnvironmentsAsync(final ListKxEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxEnvironmentsRequest, ListKxEnvironmentsResult> asyncHandler) {
        final ListKxEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxEnvironmentsResult>() {
            @Override
            public ListKxEnvironmentsResult call() throws Exception {
                ListKxEnvironmentsResult result = null;

                try {
                    result = executeListKxEnvironments(finalRequest);
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
    public java.util.concurrent.Future<ListKxScalingGroupsResult> listKxScalingGroupsAsync(ListKxScalingGroupsRequest request) {

        return listKxScalingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxScalingGroupsResult> listKxScalingGroupsAsync(final ListKxScalingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxScalingGroupsRequest, ListKxScalingGroupsResult> asyncHandler) {
        final ListKxScalingGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxScalingGroupsResult>() {
            @Override
            public ListKxScalingGroupsResult call() throws Exception {
                ListKxScalingGroupsResult result = null;

                try {
                    result = executeListKxScalingGroups(finalRequest);
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
    public java.util.concurrent.Future<ListKxUsersResult> listKxUsersAsync(ListKxUsersRequest request) {

        return listKxUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxUsersResult> listKxUsersAsync(final ListKxUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxUsersRequest, ListKxUsersResult> asyncHandler) {
        final ListKxUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxUsersResult>() {
            @Override
            public ListKxUsersResult call() throws Exception {
                ListKxUsersResult result = null;

                try {
                    result = executeListKxUsers(finalRequest);
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
    public java.util.concurrent.Future<ListKxVolumesResult> listKxVolumesAsync(ListKxVolumesRequest request) {

        return listKxVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKxVolumesResult> listKxVolumesAsync(final ListKxVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKxVolumesRequest, ListKxVolumesResult> asyncHandler) {
        final ListKxVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKxVolumesResult>() {
            @Override
            public ListKxVolumesResult call() throws Exception {
                ListKxVolumesResult result = null;

                try {
                    result = executeListKxVolumes(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxClusterCodeConfigurationResult> updateKxClusterCodeConfigurationAsync(
            UpdateKxClusterCodeConfigurationRequest request) {

        return updateKxClusterCodeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxClusterCodeConfigurationResult> updateKxClusterCodeConfigurationAsync(
            final UpdateKxClusterCodeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxClusterCodeConfigurationRequest, UpdateKxClusterCodeConfigurationResult> asyncHandler) {
        final UpdateKxClusterCodeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxClusterCodeConfigurationResult>() {
            @Override
            public UpdateKxClusterCodeConfigurationResult call() throws Exception {
                UpdateKxClusterCodeConfigurationResult result = null;

                try {
                    result = executeUpdateKxClusterCodeConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxClusterDatabasesResult> updateKxClusterDatabasesAsync(UpdateKxClusterDatabasesRequest request) {

        return updateKxClusterDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxClusterDatabasesResult> updateKxClusterDatabasesAsync(final UpdateKxClusterDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxClusterDatabasesRequest, UpdateKxClusterDatabasesResult> asyncHandler) {
        final UpdateKxClusterDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxClusterDatabasesResult>() {
            @Override
            public UpdateKxClusterDatabasesResult call() throws Exception {
                UpdateKxClusterDatabasesResult result = null;

                try {
                    result = executeUpdateKxClusterDatabases(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxDatabaseResult> updateKxDatabaseAsync(UpdateKxDatabaseRequest request) {

        return updateKxDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxDatabaseResult> updateKxDatabaseAsync(final UpdateKxDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxDatabaseRequest, UpdateKxDatabaseResult> asyncHandler) {
        final UpdateKxDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxDatabaseResult>() {
            @Override
            public UpdateKxDatabaseResult call() throws Exception {
                UpdateKxDatabaseResult result = null;

                try {
                    result = executeUpdateKxDatabase(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxDataviewResult> updateKxDataviewAsync(UpdateKxDataviewRequest request) {

        return updateKxDataviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxDataviewResult> updateKxDataviewAsync(final UpdateKxDataviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxDataviewRequest, UpdateKxDataviewResult> asyncHandler) {
        final UpdateKxDataviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxDataviewResult>() {
            @Override
            public UpdateKxDataviewResult call() throws Exception {
                UpdateKxDataviewResult result = null;

                try {
                    result = executeUpdateKxDataview(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxEnvironmentResult> updateKxEnvironmentAsync(UpdateKxEnvironmentRequest request) {

        return updateKxEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxEnvironmentResult> updateKxEnvironmentAsync(final UpdateKxEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxEnvironmentRequest, UpdateKxEnvironmentResult> asyncHandler) {
        final UpdateKxEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxEnvironmentResult>() {
            @Override
            public UpdateKxEnvironmentResult call() throws Exception {
                UpdateKxEnvironmentResult result = null;

                try {
                    result = executeUpdateKxEnvironment(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxEnvironmentNetworkResult> updateKxEnvironmentNetworkAsync(UpdateKxEnvironmentNetworkRequest request) {

        return updateKxEnvironmentNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxEnvironmentNetworkResult> updateKxEnvironmentNetworkAsync(final UpdateKxEnvironmentNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxEnvironmentNetworkRequest, UpdateKxEnvironmentNetworkResult> asyncHandler) {
        final UpdateKxEnvironmentNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxEnvironmentNetworkResult>() {
            @Override
            public UpdateKxEnvironmentNetworkResult call() throws Exception {
                UpdateKxEnvironmentNetworkResult result = null;

                try {
                    result = executeUpdateKxEnvironmentNetwork(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxUserResult> updateKxUserAsync(UpdateKxUserRequest request) {

        return updateKxUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxUserResult> updateKxUserAsync(final UpdateKxUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxUserRequest, UpdateKxUserResult> asyncHandler) {
        final UpdateKxUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxUserResult>() {
            @Override
            public UpdateKxUserResult call() throws Exception {
                UpdateKxUserResult result = null;

                try {
                    result = executeUpdateKxUser(finalRequest);
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
    public java.util.concurrent.Future<UpdateKxVolumeResult> updateKxVolumeAsync(UpdateKxVolumeRequest request) {

        return updateKxVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKxVolumeResult> updateKxVolumeAsync(final UpdateKxVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKxVolumeRequest, UpdateKxVolumeResult> asyncHandler) {
        final UpdateKxVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKxVolumeResult>() {
            @Override
            public UpdateKxVolumeResult call() throws Exception {
                UpdateKxVolumeResult result = null;

                try {
                    result = executeUpdateKxVolume(finalRequest);
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
