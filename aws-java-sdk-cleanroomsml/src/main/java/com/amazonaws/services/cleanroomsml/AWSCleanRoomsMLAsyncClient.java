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
package com.amazonaws.services.cleanroomsml;

import javax.annotation.Generated;

import com.amazonaws.services.cleanroomsml.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Clean Rooms ML asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Web Services Clean Rooms ML API Reference</i>.
 * </p>
 * <p>
 * Amazon Web Services Clean Rooms ML provides a privacy-enhancing method for two parties to identify similar users in
 * their data without the need to share their data with each other. The first party brings the training data to Clean
 * Rooms so that they can create and configure an audience model (lookalike model) and associate it with a
 * collaboration. The second party then brings their seed data to Clean Rooms and generates an audience (lookalike
 * segment) that resembles the training data.
 * </p>
 * <p>
 * To learn more about Amazon Web Services Clean Rooms ML concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/machine-learning.html">Clean Rooms User Guide</a>.
 * </p>
 * <p>
 * To learn more about SQL commands, functions, and conditions supported in Clean Rooms, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/sql-reference/sql-reference.html">Clean Rooms SQL Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCleanRoomsMLAsyncClient extends AWSCleanRoomsMLClient implements AWSCleanRoomsMLAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCleanRoomsMLAsyncClientBuilder asyncBuilder() {
        return AWSCleanRoomsMLAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Clean Rooms ML using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsMLAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Clean Rooms ML using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCleanRoomsMLAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAudienceModelResult> createAudienceModelAsync(CreateAudienceModelRequest request) {

        return createAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAudienceModelResult> createAudienceModelAsync(final CreateAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAudienceModelRequest, CreateAudienceModelResult> asyncHandler) {
        final CreateAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAudienceModelResult>() {
            @Override
            public CreateAudienceModelResult call() throws Exception {
                CreateAudienceModelResult result = null;

                try {
                    result = executeCreateAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<CreateConfiguredAudienceModelResult> createConfiguredAudienceModelAsync(CreateConfiguredAudienceModelRequest request) {

        return createConfiguredAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredAudienceModelResult> createConfiguredAudienceModelAsync(
            final CreateConfiguredAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfiguredAudienceModelRequest, CreateConfiguredAudienceModelResult> asyncHandler) {
        final CreateConfiguredAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfiguredAudienceModelResult>() {
            @Override
            public CreateConfiguredAudienceModelResult call() throws Exception {
                CreateConfiguredAudienceModelResult result = null;

                try {
                    result = executeCreateConfiguredAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<CreateTrainingDatasetResult> createTrainingDatasetAsync(CreateTrainingDatasetRequest request) {

        return createTrainingDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingDatasetResult> createTrainingDatasetAsync(final CreateTrainingDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrainingDatasetRequest, CreateTrainingDatasetResult> asyncHandler) {
        final CreateTrainingDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrainingDatasetResult>() {
            @Override
            public CreateTrainingDatasetResult call() throws Exception {
                CreateTrainingDatasetResult result = null;

                try {
                    result = executeCreateTrainingDataset(finalRequest);
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
    public java.util.concurrent.Future<DeleteAudienceGenerationJobResult> deleteAudienceGenerationJobAsync(DeleteAudienceGenerationJobRequest request) {

        return deleteAudienceGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAudienceGenerationJobResult> deleteAudienceGenerationJobAsync(final DeleteAudienceGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAudienceGenerationJobRequest, DeleteAudienceGenerationJobResult> asyncHandler) {
        final DeleteAudienceGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAudienceGenerationJobResult>() {
            @Override
            public DeleteAudienceGenerationJobResult call() throws Exception {
                DeleteAudienceGenerationJobResult result = null;

                try {
                    result = executeDeleteAudienceGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteAudienceModelResult> deleteAudienceModelAsync(DeleteAudienceModelRequest request) {

        return deleteAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAudienceModelResult> deleteAudienceModelAsync(final DeleteAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAudienceModelRequest, DeleteAudienceModelResult> asyncHandler) {
        final DeleteAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAudienceModelResult>() {
            @Override
            public DeleteAudienceModelResult call() throws Exception {
                DeleteAudienceModelResult result = null;

                try {
                    result = executeDeleteAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfiguredAudienceModelResult> deleteConfiguredAudienceModelAsync(DeleteConfiguredAudienceModelRequest request) {

        return deleteConfiguredAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredAudienceModelResult> deleteConfiguredAudienceModelAsync(
            final DeleteConfiguredAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfiguredAudienceModelRequest, DeleteConfiguredAudienceModelResult> asyncHandler) {
        final DeleteConfiguredAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfiguredAudienceModelResult>() {
            @Override
            public DeleteConfiguredAudienceModelResult call() throws Exception {
                DeleteConfiguredAudienceModelResult result = null;

                try {
                    result = executeDeleteConfiguredAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfiguredAudienceModelPolicyResult> deleteConfiguredAudienceModelPolicyAsync(
            DeleteConfiguredAudienceModelPolicyRequest request) {

        return deleteConfiguredAudienceModelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredAudienceModelPolicyResult> deleteConfiguredAudienceModelPolicyAsync(
            final DeleteConfiguredAudienceModelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfiguredAudienceModelPolicyRequest, DeleteConfiguredAudienceModelPolicyResult> asyncHandler) {
        final DeleteConfiguredAudienceModelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfiguredAudienceModelPolicyResult>() {
            @Override
            public DeleteConfiguredAudienceModelPolicyResult call() throws Exception {
                DeleteConfiguredAudienceModelPolicyResult result = null;

                try {
                    result = executeDeleteConfiguredAudienceModelPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrainingDatasetResult> deleteTrainingDatasetAsync(DeleteTrainingDatasetRequest request) {

        return deleteTrainingDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrainingDatasetResult> deleteTrainingDatasetAsync(final DeleteTrainingDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrainingDatasetRequest, DeleteTrainingDatasetResult> asyncHandler) {
        final DeleteTrainingDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrainingDatasetResult>() {
            @Override
            public DeleteTrainingDatasetResult call() throws Exception {
                DeleteTrainingDatasetResult result = null;

                try {
                    result = executeDeleteTrainingDataset(finalRequest);
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
    public java.util.concurrent.Future<GetAudienceGenerationJobResult> getAudienceGenerationJobAsync(GetAudienceGenerationJobRequest request) {

        return getAudienceGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAudienceGenerationJobResult> getAudienceGenerationJobAsync(final GetAudienceGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAudienceGenerationJobRequest, GetAudienceGenerationJobResult> asyncHandler) {
        final GetAudienceGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAudienceGenerationJobResult>() {
            @Override
            public GetAudienceGenerationJobResult call() throws Exception {
                GetAudienceGenerationJobResult result = null;

                try {
                    result = executeGetAudienceGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<GetAudienceModelResult> getAudienceModelAsync(GetAudienceModelRequest request) {

        return getAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAudienceModelResult> getAudienceModelAsync(final GetAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAudienceModelRequest, GetAudienceModelResult> asyncHandler) {
        final GetAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAudienceModelResult>() {
            @Override
            public GetAudienceModelResult call() throws Exception {
                GetAudienceModelResult result = null;

                try {
                    result = executeGetAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<GetConfiguredAudienceModelResult> getConfiguredAudienceModelAsync(GetConfiguredAudienceModelRequest request) {

        return getConfiguredAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredAudienceModelResult> getConfiguredAudienceModelAsync(final GetConfiguredAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfiguredAudienceModelRequest, GetConfiguredAudienceModelResult> asyncHandler) {
        final GetConfiguredAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfiguredAudienceModelResult>() {
            @Override
            public GetConfiguredAudienceModelResult call() throws Exception {
                GetConfiguredAudienceModelResult result = null;

                try {
                    result = executeGetConfiguredAudienceModel(finalRequest);
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
    public java.util.concurrent.Future<GetConfiguredAudienceModelPolicyResult> getConfiguredAudienceModelPolicyAsync(
            GetConfiguredAudienceModelPolicyRequest request) {

        return getConfiguredAudienceModelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredAudienceModelPolicyResult> getConfiguredAudienceModelPolicyAsync(
            final GetConfiguredAudienceModelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfiguredAudienceModelPolicyRequest, GetConfiguredAudienceModelPolicyResult> asyncHandler) {
        final GetConfiguredAudienceModelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfiguredAudienceModelPolicyResult>() {
            @Override
            public GetConfiguredAudienceModelPolicyResult call() throws Exception {
                GetConfiguredAudienceModelPolicyResult result = null;

                try {
                    result = executeGetConfiguredAudienceModelPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetTrainingDatasetResult> getTrainingDatasetAsync(GetTrainingDatasetRequest request) {

        return getTrainingDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrainingDatasetResult> getTrainingDatasetAsync(final GetTrainingDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrainingDatasetRequest, GetTrainingDatasetResult> asyncHandler) {
        final GetTrainingDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrainingDatasetResult>() {
            @Override
            public GetTrainingDatasetResult call() throws Exception {
                GetTrainingDatasetResult result = null;

                try {
                    result = executeGetTrainingDataset(finalRequest);
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
    public java.util.concurrent.Future<ListAudienceExportJobsResult> listAudienceExportJobsAsync(ListAudienceExportJobsRequest request) {

        return listAudienceExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAudienceExportJobsResult> listAudienceExportJobsAsync(final ListAudienceExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAudienceExportJobsRequest, ListAudienceExportJobsResult> asyncHandler) {
        final ListAudienceExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAudienceExportJobsResult>() {
            @Override
            public ListAudienceExportJobsResult call() throws Exception {
                ListAudienceExportJobsResult result = null;

                try {
                    result = executeListAudienceExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListAudienceGenerationJobsResult> listAudienceGenerationJobsAsync(ListAudienceGenerationJobsRequest request) {

        return listAudienceGenerationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAudienceGenerationJobsResult> listAudienceGenerationJobsAsync(final ListAudienceGenerationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAudienceGenerationJobsRequest, ListAudienceGenerationJobsResult> asyncHandler) {
        final ListAudienceGenerationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAudienceGenerationJobsResult>() {
            @Override
            public ListAudienceGenerationJobsResult call() throws Exception {
                ListAudienceGenerationJobsResult result = null;

                try {
                    result = executeListAudienceGenerationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListAudienceModelsResult> listAudienceModelsAsync(ListAudienceModelsRequest request) {

        return listAudienceModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAudienceModelsResult> listAudienceModelsAsync(final ListAudienceModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAudienceModelsRequest, ListAudienceModelsResult> asyncHandler) {
        final ListAudienceModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAudienceModelsResult>() {
            @Override
            public ListAudienceModelsResult call() throws Exception {
                ListAudienceModelsResult result = null;

                try {
                    result = executeListAudienceModels(finalRequest);
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
    public java.util.concurrent.Future<ListConfiguredAudienceModelsResult> listConfiguredAudienceModelsAsync(ListConfiguredAudienceModelsRequest request) {

        return listConfiguredAudienceModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfiguredAudienceModelsResult> listConfiguredAudienceModelsAsync(final ListConfiguredAudienceModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfiguredAudienceModelsRequest, ListConfiguredAudienceModelsResult> asyncHandler) {
        final ListConfiguredAudienceModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfiguredAudienceModelsResult>() {
            @Override
            public ListConfiguredAudienceModelsResult call() throws Exception {
                ListConfiguredAudienceModelsResult result = null;

                try {
                    result = executeListConfiguredAudienceModels(finalRequest);
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
    public java.util.concurrent.Future<ListTrainingDatasetsResult> listTrainingDatasetsAsync(ListTrainingDatasetsRequest request) {

        return listTrainingDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingDatasetsResult> listTrainingDatasetsAsync(final ListTrainingDatasetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingDatasetsRequest, ListTrainingDatasetsResult> asyncHandler) {
        final ListTrainingDatasetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingDatasetsResult>() {
            @Override
            public ListTrainingDatasetsResult call() throws Exception {
                ListTrainingDatasetsResult result = null;

                try {
                    result = executeListTrainingDatasets(finalRequest);
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
    public java.util.concurrent.Future<PutConfiguredAudienceModelPolicyResult> putConfiguredAudienceModelPolicyAsync(
            PutConfiguredAudienceModelPolicyRequest request) {

        return putConfiguredAudienceModelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfiguredAudienceModelPolicyResult> putConfiguredAudienceModelPolicyAsync(
            final PutConfiguredAudienceModelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfiguredAudienceModelPolicyRequest, PutConfiguredAudienceModelPolicyResult> asyncHandler) {
        final PutConfiguredAudienceModelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConfiguredAudienceModelPolicyResult>() {
            @Override
            public PutConfiguredAudienceModelPolicyResult call() throws Exception {
                PutConfiguredAudienceModelPolicyResult result = null;

                try {
                    result = executePutConfiguredAudienceModelPolicy(finalRequest);
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
    public java.util.concurrent.Future<StartAudienceExportJobResult> startAudienceExportJobAsync(StartAudienceExportJobRequest request) {

        return startAudienceExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAudienceExportJobResult> startAudienceExportJobAsync(final StartAudienceExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAudienceExportJobRequest, StartAudienceExportJobResult> asyncHandler) {
        final StartAudienceExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAudienceExportJobResult>() {
            @Override
            public StartAudienceExportJobResult call() throws Exception {
                StartAudienceExportJobResult result = null;

                try {
                    result = executeStartAudienceExportJob(finalRequest);
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
    public java.util.concurrent.Future<StartAudienceGenerationJobResult> startAudienceGenerationJobAsync(StartAudienceGenerationJobRequest request) {

        return startAudienceGenerationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAudienceGenerationJobResult> startAudienceGenerationJobAsync(final StartAudienceGenerationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAudienceGenerationJobRequest, StartAudienceGenerationJobResult> asyncHandler) {
        final StartAudienceGenerationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAudienceGenerationJobResult>() {
            @Override
            public StartAudienceGenerationJobResult call() throws Exception {
                StartAudienceGenerationJobResult result = null;

                try {
                    result = executeStartAudienceGenerationJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateConfiguredAudienceModelResult> updateConfiguredAudienceModelAsync(UpdateConfiguredAudienceModelRequest request) {

        return updateConfiguredAudienceModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredAudienceModelResult> updateConfiguredAudienceModelAsync(
            final UpdateConfiguredAudienceModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfiguredAudienceModelRequest, UpdateConfiguredAudienceModelResult> asyncHandler) {
        final UpdateConfiguredAudienceModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfiguredAudienceModelResult>() {
            @Override
            public UpdateConfiguredAudienceModelResult call() throws Exception {
                UpdateConfiguredAudienceModelResult result = null;

                try {
                    result = executeUpdateConfiguredAudienceModel(finalRequest);
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
