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
package com.amazonaws.services.iottwinmaker;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT TwinMaker asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * IoT TwinMaker is a service that enables you to build operational digital twins of physical systems. IoT TwinMaker
 * overlays measurements and analysis from real-world sensors, cameras, and enterprise applications so you can create
 * data visualizations to monitor your physical factory, building, or industrial plant. You can use this real-world data
 * to monitor operations and diagnose and repair errors.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTTwinMakerAsyncClient extends AWSIoTTwinMakerClient implements AWSIoTTwinMakerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTTwinMakerAsyncClientBuilder asyncBuilder() {
        return AWSIoTTwinMakerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT TwinMaker using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTTwinMakerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT TwinMaker using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTTwinMakerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchPutPropertyValuesResult> batchPutPropertyValuesAsync(BatchPutPropertyValuesRequest request) {

        return batchPutPropertyValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutPropertyValuesResult> batchPutPropertyValuesAsync(final BatchPutPropertyValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutPropertyValuesRequest, BatchPutPropertyValuesResult> asyncHandler) {
        final BatchPutPropertyValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutPropertyValuesResult>() {
            @Override
            public BatchPutPropertyValuesResult call() throws Exception {
                BatchPutPropertyValuesResult result = null;

                try {
                    result = executeBatchPutPropertyValues(finalRequest);
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
    public java.util.concurrent.Future<CreateComponentTypeResult> createComponentTypeAsync(CreateComponentTypeRequest request) {

        return createComponentTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentTypeResult> createComponentTypeAsync(final CreateComponentTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComponentTypeRequest, CreateComponentTypeResult> asyncHandler) {
        final CreateComponentTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComponentTypeResult>() {
            @Override
            public CreateComponentTypeResult call() throws Exception {
                CreateComponentTypeResult result = null;

                try {
                    result = executeCreateComponentType(finalRequest);
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
    public java.util.concurrent.Future<CreateEntityResult> createEntityAsync(CreateEntityRequest request) {

        return createEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityResult> createEntityAsync(final CreateEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEntityRequest, CreateEntityResult> asyncHandler) {
        final CreateEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEntityResult>() {
            @Override
            public CreateEntityResult call() throws Exception {
                CreateEntityResult result = null;

                try {
                    result = executeCreateEntity(finalRequest);
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
    public java.util.concurrent.Future<CreateSceneResult> createSceneAsync(CreateSceneRequest request) {

        return createSceneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSceneResult> createSceneAsync(final CreateSceneRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSceneRequest, CreateSceneResult> asyncHandler) {
        final CreateSceneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSceneResult>() {
            @Override
            public CreateSceneResult call() throws Exception {
                CreateSceneResult result = null;

                try {
                    result = executeCreateScene(finalRequest);
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
    public java.util.concurrent.Future<CreateSyncJobResult> createSyncJobAsync(CreateSyncJobRequest request) {

        return createSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSyncJobResult> createSyncJobAsync(final CreateSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSyncJobRequest, CreateSyncJobResult> asyncHandler) {
        final CreateSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSyncJobResult>() {
            @Override
            public CreateSyncJobResult call() throws Exception {
                CreateSyncJobResult result = null;

                try {
                    result = executeCreateSyncJob(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request) {

        return createWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(final CreateWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler) {
        final CreateWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkspaceResult>() {
            @Override
            public CreateWorkspaceResult call() throws Exception {
                CreateWorkspaceResult result = null;

                try {
                    result = executeCreateWorkspace(finalRequest);
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
    public java.util.concurrent.Future<DeleteComponentTypeResult> deleteComponentTypeAsync(DeleteComponentTypeRequest request) {

        return deleteComponentTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentTypeResult> deleteComponentTypeAsync(final DeleteComponentTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComponentTypeRequest, DeleteComponentTypeResult> asyncHandler) {
        final DeleteComponentTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteComponentTypeResult>() {
            @Override
            public DeleteComponentTypeResult call() throws Exception {
                DeleteComponentTypeResult result = null;

                try {
                    result = executeDeleteComponentType(finalRequest);
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
    public java.util.concurrent.Future<DeleteEntityResult> deleteEntityAsync(DeleteEntityRequest request) {

        return deleteEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityResult> deleteEntityAsync(final DeleteEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEntityRequest, DeleteEntityResult> asyncHandler) {
        final DeleteEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEntityResult>() {
            @Override
            public DeleteEntityResult call() throws Exception {
                DeleteEntityResult result = null;

                try {
                    result = executeDeleteEntity(finalRequest);
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
    public java.util.concurrent.Future<DeleteSceneResult> deleteSceneAsync(DeleteSceneRequest request) {

        return deleteSceneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSceneResult> deleteSceneAsync(final DeleteSceneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSceneRequest, DeleteSceneResult> asyncHandler) {
        final DeleteSceneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSceneResult>() {
            @Override
            public DeleteSceneResult call() throws Exception {
                DeleteSceneResult result = null;

                try {
                    result = executeDeleteScene(finalRequest);
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
    public java.util.concurrent.Future<DeleteSyncJobResult> deleteSyncJobAsync(DeleteSyncJobRequest request) {

        return deleteSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSyncJobResult> deleteSyncJobAsync(final DeleteSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSyncJobRequest, DeleteSyncJobResult> asyncHandler) {
        final DeleteSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSyncJobResult>() {
            @Override
            public DeleteSyncJobResult call() throws Exception {
                DeleteSyncJobResult result = null;

                try {
                    result = executeDeleteSyncJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {

        return deleteWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(final DeleteWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler) {
        final DeleteWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkspaceResult>() {
            @Override
            public DeleteWorkspaceResult call() throws Exception {
                DeleteWorkspaceResult result = null;

                try {
                    result = executeDeleteWorkspace(finalRequest);
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
    public java.util.concurrent.Future<ExecuteQueryResult> executeQueryAsync(ExecuteQueryRequest request) {

        return executeQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteQueryResult> executeQueryAsync(final ExecuteQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteQueryRequest, ExecuteQueryResult> asyncHandler) {
        final ExecuteQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteQueryResult>() {
            @Override
            public ExecuteQueryResult call() throws Exception {
                ExecuteQueryResult result = null;

                try {
                    result = executeExecuteQuery(finalRequest);
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
    public java.util.concurrent.Future<GetComponentTypeResult> getComponentTypeAsync(GetComponentTypeRequest request) {

        return getComponentTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentTypeResult> getComponentTypeAsync(final GetComponentTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentTypeRequest, GetComponentTypeResult> asyncHandler) {
        final GetComponentTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentTypeResult>() {
            @Override
            public GetComponentTypeResult call() throws Exception {
                GetComponentTypeResult result = null;

                try {
                    result = executeGetComponentType(finalRequest);
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
    public java.util.concurrent.Future<GetEntityResult> getEntityAsync(GetEntityRequest request) {

        return getEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntityResult> getEntityAsync(final GetEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEntityRequest, GetEntityResult> asyncHandler) {
        final GetEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEntityResult>() {
            @Override
            public GetEntityResult call() throws Exception {
                GetEntityResult result = null;

                try {
                    result = executeGetEntity(finalRequest);
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
    public java.util.concurrent.Future<GetPricingPlanResult> getPricingPlanAsync(GetPricingPlanRequest request) {

        return getPricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPricingPlanResult> getPricingPlanAsync(final GetPricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPricingPlanRequest, GetPricingPlanResult> asyncHandler) {
        final GetPricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPricingPlanResult>() {
            @Override
            public GetPricingPlanResult call() throws Exception {
                GetPricingPlanResult result = null;

                try {
                    result = executeGetPricingPlan(finalRequest);
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
    public java.util.concurrent.Future<GetPropertyValueResult> getPropertyValueAsync(GetPropertyValueRequest request) {

        return getPropertyValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPropertyValueResult> getPropertyValueAsync(final GetPropertyValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPropertyValueRequest, GetPropertyValueResult> asyncHandler) {
        final GetPropertyValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPropertyValueResult>() {
            @Override
            public GetPropertyValueResult call() throws Exception {
                GetPropertyValueResult result = null;

                try {
                    result = executeGetPropertyValue(finalRequest);
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
    public java.util.concurrent.Future<GetPropertyValueHistoryResult> getPropertyValueHistoryAsync(GetPropertyValueHistoryRequest request) {

        return getPropertyValueHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPropertyValueHistoryResult> getPropertyValueHistoryAsync(final GetPropertyValueHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPropertyValueHistoryRequest, GetPropertyValueHistoryResult> asyncHandler) {
        final GetPropertyValueHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPropertyValueHistoryResult>() {
            @Override
            public GetPropertyValueHistoryResult call() throws Exception {
                GetPropertyValueHistoryResult result = null;

                try {
                    result = executeGetPropertyValueHistory(finalRequest);
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
    public java.util.concurrent.Future<GetSceneResult> getSceneAsync(GetSceneRequest request) {

        return getSceneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSceneResult> getSceneAsync(final GetSceneRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSceneRequest, GetSceneResult> asyncHandler) {
        final GetSceneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSceneResult>() {
            @Override
            public GetSceneResult call() throws Exception {
                GetSceneResult result = null;

                try {
                    result = executeGetScene(finalRequest);
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
    public java.util.concurrent.Future<GetSyncJobResult> getSyncJobAsync(GetSyncJobRequest request) {

        return getSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSyncJobResult> getSyncJobAsync(final GetSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSyncJobRequest, GetSyncJobResult> asyncHandler) {
        final GetSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSyncJobResult>() {
            @Override
            public GetSyncJobResult call() throws Exception {
                GetSyncJobResult result = null;

                try {
                    result = executeGetSyncJob(finalRequest);
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
    public java.util.concurrent.Future<GetWorkspaceResult> getWorkspaceAsync(GetWorkspaceRequest request) {

        return getWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkspaceResult> getWorkspaceAsync(final GetWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResult> asyncHandler) {
        final GetWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkspaceResult>() {
            @Override
            public GetWorkspaceResult call() throws Exception {
                GetWorkspaceResult result = null;

                try {
                    result = executeGetWorkspace(finalRequest);
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
    public java.util.concurrent.Future<ListComponentTypesResult> listComponentTypesAsync(ListComponentTypesRequest request) {

        return listComponentTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentTypesResult> listComponentTypesAsync(final ListComponentTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentTypesRequest, ListComponentTypesResult> asyncHandler) {
        final ListComponentTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentTypesResult>() {
            @Override
            public ListComponentTypesResult call() throws Exception {
                ListComponentTypesResult result = null;

                try {
                    result = executeListComponentTypes(finalRequest);
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
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest request) {

        return listEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(final ListEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitiesRequest, ListEntitiesResult> asyncHandler) {
        final ListEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitiesResult>() {
            @Override
            public ListEntitiesResult call() throws Exception {
                ListEntitiesResult result = null;

                try {
                    result = executeListEntities(finalRequest);
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
    public java.util.concurrent.Future<ListScenesResult> listScenesAsync(ListScenesRequest request) {

        return listScenesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScenesResult> listScenesAsync(final ListScenesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScenesRequest, ListScenesResult> asyncHandler) {
        final ListScenesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScenesResult>() {
            @Override
            public ListScenesResult call() throws Exception {
                ListScenesResult result = null;

                try {
                    result = executeListScenes(finalRequest);
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
    public java.util.concurrent.Future<ListSyncJobsResult> listSyncJobsAsync(ListSyncJobsRequest request) {

        return listSyncJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSyncJobsResult> listSyncJobsAsync(final ListSyncJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSyncJobsRequest, ListSyncJobsResult> asyncHandler) {
        final ListSyncJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSyncJobsResult>() {
            @Override
            public ListSyncJobsResult call() throws Exception {
                ListSyncJobsResult result = null;

                try {
                    result = executeListSyncJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSyncResourcesResult> listSyncResourcesAsync(ListSyncResourcesRequest request) {

        return listSyncResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSyncResourcesResult> listSyncResourcesAsync(final ListSyncResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSyncResourcesRequest, ListSyncResourcesResult> asyncHandler) {
        final ListSyncResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSyncResourcesResult>() {
            @Override
            public ListSyncResourcesResult call() throws Exception {
                ListSyncResourcesResult result = null;

                try {
                    result = executeListSyncResources(finalRequest);
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
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request) {

        return listWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(final ListWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler) {
        final ListWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkspacesResult>() {
            @Override
            public ListWorkspacesResult call() throws Exception {
                ListWorkspacesResult result = null;

                try {
                    result = executeListWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<UpdateComponentTypeResult> updateComponentTypeAsync(UpdateComponentTypeRequest request) {

        return updateComponentTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentTypeResult> updateComponentTypeAsync(final UpdateComponentTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateComponentTypeRequest, UpdateComponentTypeResult> asyncHandler) {
        final UpdateComponentTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateComponentTypeResult>() {
            @Override
            public UpdateComponentTypeResult call() throws Exception {
                UpdateComponentTypeResult result = null;

                try {
                    result = executeUpdateComponentType(finalRequest);
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
    public java.util.concurrent.Future<UpdateEntityResult> updateEntityAsync(UpdateEntityRequest request) {

        return updateEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEntityResult> updateEntityAsync(final UpdateEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEntityRequest, UpdateEntityResult> asyncHandler) {
        final UpdateEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEntityResult>() {
            @Override
            public UpdateEntityResult call() throws Exception {
                UpdateEntityResult result = null;

                try {
                    result = executeUpdateEntity(finalRequest);
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
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest request) {

        return updatePricingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(final UpdatePricingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePricingPlanRequest, UpdatePricingPlanResult> asyncHandler) {
        final UpdatePricingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePricingPlanResult>() {
            @Override
            public UpdatePricingPlanResult call() throws Exception {
                UpdatePricingPlanResult result = null;

                try {
                    result = executeUpdatePricingPlan(finalRequest);
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
    public java.util.concurrent.Future<UpdateSceneResult> updateSceneAsync(UpdateSceneRequest request) {

        return updateSceneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSceneResult> updateSceneAsync(final UpdateSceneRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSceneRequest, UpdateSceneResult> asyncHandler) {
        final UpdateSceneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSceneResult>() {
            @Override
            public UpdateSceneResult call() throws Exception {
                UpdateSceneResult result = null;

                try {
                    result = executeUpdateScene(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest request) {

        return updateWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(final UpdateWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler) {
        final UpdateWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkspaceResult>() {
            @Override
            public UpdateWorkspaceResult call() throws Exception {
                UpdateWorkspaceResult result = null;

                try {
                    result = executeUpdateWorkspace(finalRequest);
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
