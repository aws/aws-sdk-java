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
package com.amazonaws.services.gamesparks;

import javax.annotation.Generated;

import com.amazonaws.services.gamesparks.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing GameSparks asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGameSparksAsyncClient extends AWSGameSparksClient implements AWSGameSparksAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGameSparksAsyncClientBuilder asyncBuilder() {
        return AWSGameSparksAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on GameSparks using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGameSparksAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on GameSparks using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSGameSparksAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateGameResult> createGameAsync(CreateGameRequest request) {

        return createGameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGameResult> createGameAsync(final CreateGameRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGameRequest, CreateGameResult> asyncHandler) {
        final CreateGameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGameResult>() {
            @Override
            public CreateGameResult call() throws Exception {
                CreateGameResult result = null;

                try {
                    result = executeCreateGame(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(final CreateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {
        final CreateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStageResult>() {
            @Override
            public CreateStageResult call() throws Exception {
                CreateStageResult result = null;

                try {
                    result = executeCreateStage(finalRequest);
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
    public java.util.concurrent.Future<DeleteGameResult> deleteGameAsync(DeleteGameRequest request) {

        return deleteGameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGameResult> deleteGameAsync(final DeleteGameRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGameRequest, DeleteGameResult> asyncHandler) {
        final DeleteGameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGameResult>() {
            @Override
            public DeleteGameResult call() throws Exception {
                DeleteGameResult result = null;

                try {
                    result = executeDeleteGame(finalRequest);
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
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(final DeleteStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler) {
        final DeleteStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStageResult>() {
            @Override
            public DeleteStageResult call() throws Exception {
                DeleteStageResult result = null;

                try {
                    result = executeDeleteStage(finalRequest);
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
    public java.util.concurrent.Future<DisconnectPlayerResult> disconnectPlayerAsync(DisconnectPlayerRequest request) {

        return disconnectPlayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectPlayerResult> disconnectPlayerAsync(final DisconnectPlayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectPlayerRequest, DisconnectPlayerResult> asyncHandler) {
        final DisconnectPlayerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectPlayerResult>() {
            @Override
            public DisconnectPlayerResult call() throws Exception {
                DisconnectPlayerResult result = null;

                try {
                    result = executeDisconnectPlayer(finalRequest);
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
    public java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest request) {

        return exportSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(final ExportSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportSnapshotRequest, ExportSnapshotResult> asyncHandler) {
        final ExportSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportSnapshotResult>() {
            @Override
            public ExportSnapshotResult call() throws Exception {
                ExportSnapshotResult result = null;

                try {
                    result = executeExportSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(GetExtensionRequest request) {

        return getExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(final GetExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExtensionRequest, GetExtensionResult> asyncHandler) {
        final GetExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExtensionResult>() {
            @Override
            public GetExtensionResult call() throws Exception {
                GetExtensionResult result = null;

                try {
                    result = executeGetExtension(finalRequest);
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
    public java.util.concurrent.Future<GetExtensionVersionResult> getExtensionVersionAsync(GetExtensionVersionRequest request) {

        return getExtensionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExtensionVersionResult> getExtensionVersionAsync(final GetExtensionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExtensionVersionRequest, GetExtensionVersionResult> asyncHandler) {
        final GetExtensionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExtensionVersionResult>() {
            @Override
            public GetExtensionVersionResult call() throws Exception {
                GetExtensionVersionResult result = null;

                try {
                    result = executeGetExtensionVersion(finalRequest);
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
    public java.util.concurrent.Future<GetGameResult> getGameAsync(GetGameRequest request) {

        return getGameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGameResult> getGameAsync(final GetGameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGameRequest, GetGameResult> asyncHandler) {
        final GetGameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGameResult>() {
            @Override
            public GetGameResult call() throws Exception {
                GetGameResult result = null;

                try {
                    result = executeGetGame(finalRequest);
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
    public java.util.concurrent.Future<GetGameConfigurationResult> getGameConfigurationAsync(GetGameConfigurationRequest request) {

        return getGameConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGameConfigurationResult> getGameConfigurationAsync(final GetGameConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGameConfigurationRequest, GetGameConfigurationResult> asyncHandler) {
        final GetGameConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGameConfigurationResult>() {
            @Override
            public GetGameConfigurationResult call() throws Exception {
                GetGameConfigurationResult result = null;

                try {
                    result = executeGetGameConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetGeneratedCodeJobResult> getGeneratedCodeJobAsync(GetGeneratedCodeJobRequest request) {

        return getGeneratedCodeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGeneratedCodeJobResult> getGeneratedCodeJobAsync(final GetGeneratedCodeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGeneratedCodeJobRequest, GetGeneratedCodeJobResult> asyncHandler) {
        final GetGeneratedCodeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGeneratedCodeJobResult>() {
            @Override
            public GetGeneratedCodeJobResult call() throws Exception {
                GetGeneratedCodeJobResult result = null;

                try {
                    result = executeGetGeneratedCodeJob(finalRequest);
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
    public java.util.concurrent.Future<GetPlayerConnectionStatusResult> getPlayerConnectionStatusAsync(GetPlayerConnectionStatusRequest request) {

        return getPlayerConnectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlayerConnectionStatusResult> getPlayerConnectionStatusAsync(final GetPlayerConnectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlayerConnectionStatusRequest, GetPlayerConnectionStatusResult> asyncHandler) {
        final GetPlayerConnectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlayerConnectionStatusResult>() {
            @Override
            public GetPlayerConnectionStatusResult call() throws Exception {
                GetPlayerConnectionStatusResult result = null;

                try {
                    result = executeGetPlayerConnectionStatus(finalRequest);
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
    public java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest request) {

        return getSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(final GetSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSnapshotRequest, GetSnapshotResult> asyncHandler) {
        final GetSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSnapshotResult>() {
            @Override
            public GetSnapshotResult call() throws Exception {
                GetSnapshotResult result = null;

                try {
                    result = executeGetSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(final GetStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {
        final GetStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageResult>() {
            @Override
            public GetStageResult call() throws Exception {
                GetStageResult result = null;

                try {
                    result = executeGetStage(finalRequest);
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
    public java.util.concurrent.Future<GetStageDeploymentResult> getStageDeploymentAsync(GetStageDeploymentRequest request) {

        return getStageDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageDeploymentResult> getStageDeploymentAsync(final GetStageDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageDeploymentRequest, GetStageDeploymentResult> asyncHandler) {
        final GetStageDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageDeploymentResult>() {
            @Override
            public GetStageDeploymentResult call() throws Exception {
                GetStageDeploymentResult result = null;

                try {
                    result = executeGetStageDeployment(finalRequest);
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
    public java.util.concurrent.Future<ImportGameConfigurationResult> importGameConfigurationAsync(ImportGameConfigurationRequest request) {

        return importGameConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportGameConfigurationResult> importGameConfigurationAsync(final ImportGameConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportGameConfigurationRequest, ImportGameConfigurationResult> asyncHandler) {
        final ImportGameConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportGameConfigurationResult>() {
            @Override
            public ImportGameConfigurationResult call() throws Exception {
                ImportGameConfigurationResult result = null;

                try {
                    result = executeImportGameConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListExtensionVersionsResult> listExtensionVersionsAsync(ListExtensionVersionsRequest request) {

        return listExtensionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensionVersionsResult> listExtensionVersionsAsync(final ListExtensionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExtensionVersionsRequest, ListExtensionVersionsResult> asyncHandler) {
        final ListExtensionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExtensionVersionsResult>() {
            @Override
            public ListExtensionVersionsResult call() throws Exception {
                ListExtensionVersionsResult result = null;

                try {
                    result = executeListExtensionVersions(finalRequest);
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
    public java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(ListExtensionsRequest request) {

        return listExtensionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(final ListExtensionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExtensionsRequest, ListExtensionsResult> asyncHandler) {
        final ListExtensionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExtensionsResult>() {
            @Override
            public ListExtensionsResult call() throws Exception {
                ListExtensionsResult result = null;

                try {
                    result = executeListExtensions(finalRequest);
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
    public java.util.concurrent.Future<ListGamesResult> listGamesAsync(ListGamesRequest request) {

        return listGamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGamesResult> listGamesAsync(final ListGamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGamesRequest, ListGamesResult> asyncHandler) {
        final ListGamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGamesResult>() {
            @Override
            public ListGamesResult call() throws Exception {
                ListGamesResult result = null;

                try {
                    result = executeListGames(finalRequest);
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
    public java.util.concurrent.Future<ListGeneratedCodeJobsResult> listGeneratedCodeJobsAsync(ListGeneratedCodeJobsRequest request) {

        return listGeneratedCodeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeneratedCodeJobsResult> listGeneratedCodeJobsAsync(final ListGeneratedCodeJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeneratedCodeJobsRequest, ListGeneratedCodeJobsResult> asyncHandler) {
        final ListGeneratedCodeJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGeneratedCodeJobsResult>() {
            @Override
            public ListGeneratedCodeJobsResult call() throws Exception {
                ListGeneratedCodeJobsResult result = null;

                try {
                    result = executeListGeneratedCodeJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest request) {

        return listSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(final ListSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResult> asyncHandler) {
        final ListSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSnapshotsResult>() {
            @Override
            public ListSnapshotsResult call() throws Exception {
                ListSnapshotsResult result = null;

                try {
                    result = executeListSnapshots(finalRequest);
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
    public java.util.concurrent.Future<ListStageDeploymentsResult> listStageDeploymentsAsync(ListStageDeploymentsRequest request) {

        return listStageDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStageDeploymentsResult> listStageDeploymentsAsync(final ListStageDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStageDeploymentsRequest, ListStageDeploymentsResult> asyncHandler) {
        final ListStageDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStageDeploymentsResult>() {
            @Override
            public ListStageDeploymentsResult call() throws Exception {
                ListStageDeploymentsResult result = null;

                try {
                    result = executeListStageDeployments(finalRequest);
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
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest request) {

        return listStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(final ListStagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStagesRequest, ListStagesResult> asyncHandler) {
        final ListStagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStagesResult>() {
            @Override
            public ListStagesResult call() throws Exception {
                ListStagesResult result = null;

                try {
                    result = executeListStages(finalRequest);
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
    public java.util.concurrent.Future<StartGeneratedCodeJobResult> startGeneratedCodeJobAsync(StartGeneratedCodeJobRequest request) {

        return startGeneratedCodeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartGeneratedCodeJobResult> startGeneratedCodeJobAsync(final StartGeneratedCodeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartGeneratedCodeJobRequest, StartGeneratedCodeJobResult> asyncHandler) {
        final StartGeneratedCodeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartGeneratedCodeJobResult>() {
            @Override
            public StartGeneratedCodeJobResult call() throws Exception {
                StartGeneratedCodeJobResult result = null;

                try {
                    result = executeStartGeneratedCodeJob(finalRequest);
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
    public java.util.concurrent.Future<StartStageDeploymentResult> startStageDeploymentAsync(StartStageDeploymentRequest request) {

        return startStageDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStageDeploymentResult> startStageDeploymentAsync(final StartStageDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStageDeploymentRequest, StartStageDeploymentResult> asyncHandler) {
        final StartStageDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartStageDeploymentResult>() {
            @Override
            public StartStageDeploymentResult call() throws Exception {
                StartStageDeploymentResult result = null;

                try {
                    result = executeStartStageDeployment(finalRequest);
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
    public java.util.concurrent.Future<UpdateGameResult> updateGameAsync(UpdateGameRequest request) {

        return updateGameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGameResult> updateGameAsync(final UpdateGameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGameRequest, UpdateGameResult> asyncHandler) {
        final UpdateGameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGameResult>() {
            @Override
            public UpdateGameResult call() throws Exception {
                UpdateGameResult result = null;

                try {
                    result = executeUpdateGame(finalRequest);
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
    public java.util.concurrent.Future<UpdateGameConfigurationResult> updateGameConfigurationAsync(UpdateGameConfigurationRequest request) {

        return updateGameConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGameConfigurationResult> updateGameConfigurationAsync(final UpdateGameConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGameConfigurationRequest, UpdateGameConfigurationResult> asyncHandler) {
        final UpdateGameConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGameConfigurationResult>() {
            @Override
            public UpdateGameConfigurationResult call() throws Exception {
                UpdateGameConfigurationResult result = null;

                try {
                    result = executeUpdateGameConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest request) {

        return updateSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(final UpdateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler) {
        final UpdateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSnapshotResult>() {
            @Override
            public UpdateSnapshotResult call() throws Exception {
                UpdateSnapshotResult result = null;

                try {
                    result = executeUpdateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(final UpdateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {
        final UpdateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStageResult>() {
            @Override
            public UpdateStageResult call() throws Exception {
                UpdateStageResult result = null;

                try {
                    result = executeUpdateStage(finalRequest);
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
