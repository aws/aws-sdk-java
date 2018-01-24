/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * Definition of the public APIs exposed by SageMaker
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerAsyncClient extends AmazonSageMakerClient implements AmazonSageMakerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSageMakerAsyncClientBuilder asyncBuilder() {
        return AmazonSageMakerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SageMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(final CreateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {
        final CreateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointResult>() {
            @Override
            public CreateEndpointResult call() throws Exception {
                CreateEndpointResult result = null;

                try {
                    result = executeCreateEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest request) {

        return createEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(final CreateEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler) {
        final CreateEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointConfigResult>() {
            @Override
            public CreateEndpointConfigResult call() throws Exception {
                CreateEndpointConfigResult result = null;

                try {
                    result = executeCreateEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest request) {

        return createNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(final CreateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler) {
        final CreateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotebookInstanceResult>() {
            @Override
            public CreateNotebookInstanceResult call() throws Exception {
                CreateNotebookInstanceResult result = null;

                try {
                    result = executeCreateNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest request) {

        return createPresignedNotebookInstanceUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            final CreatePresignedNotebookInstanceUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler) {
        final CreatePresignedNotebookInstanceUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresignedNotebookInstanceUrlResult>() {
            @Override
            public CreatePresignedNotebookInstanceUrlResult call() throws Exception {
                CreatePresignedNotebookInstanceUrlResult result = null;

                try {
                    result = executeCreatePresignedNotebookInstanceUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest request) {

        return createTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(final CreateTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler) {
        final CreateTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrainingJobResult>() {
            @Override
            public CreateTrainingJobResult call() throws Exception {
                CreateTrainingJobResult result = null;

                try {
                    result = executeCreateTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest request) {

        return deleteEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(final DeleteEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler) {
        final DeleteEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointConfigResult>() {
            @Override
            public DeleteEndpointConfigResult call() throws Exception {
                DeleteEndpointConfigResult result = null;

                try {
                    result = executeDeleteEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {
        final DeleteModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelResult>() {
            @Override
            public DeleteModelResult call() throws Exception {
                DeleteModelResult result = null;

                try {
                    result = executeDeleteModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest request) {

        return deleteNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(final DeleteNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler) {
        final DeleteNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotebookInstanceResult>() {
            @Override
            public DeleteNotebookInstanceResult call() throws Exception {
                DeleteNotebookInstanceResult result = null;

                try {
                    result = executeDeleteNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(final DescribeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {
        final DescribeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointResult>() {
            @Override
            public DescribeEndpointResult call() throws Exception {
                DescribeEndpointResult result = null;

                try {
                    result = executeDescribeEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest request) {

        return describeEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(final DescribeEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler) {
        final DescribeEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointConfigResult>() {
            @Override
            public DescribeEndpointConfigResult call() throws Exception {
                DescribeEndpointConfigResult result = null;

                try {
                    result = executeDescribeEndpointConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest request) {

        return describeModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(final DescribeModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler) {
        final DescribeModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelResult>() {
            @Override
            public DescribeModelResult call() throws Exception {
                DescribeModelResult result = null;

                try {
                    result = executeDescribeModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest request) {

        return describeNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(final DescribeNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler) {
        final DescribeNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookInstanceResult>() {
            @Override
            public DescribeNotebookInstanceResult call() throws Exception {
                DescribeNotebookInstanceResult result = null;

                try {
                    result = executeDescribeNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest request) {

        return describeTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(final DescribeTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler) {
        final DescribeTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrainingJobResult>() {
            @Override
            public DescribeTrainingJobResult call() throws Exception {
                DescribeTrainingJobResult result = null;

                try {
                    result = executeDescribeTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest request) {

        return listEndpointConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(final ListEndpointConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler) {
        final ListEndpointConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointConfigsResult>() {
            @Override
            public ListEndpointConfigsResult call() throws Exception {
                ListEndpointConfigsResult result = null;

                try {
                    result = executeListEndpointConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest request) {

        return listEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(final ListEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler) {
        final ListEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointsResult>() {
            @Override
            public ListEndpointsResult call() throws Exception {
                ListEndpointsResult result = null;

                try {
                    result = executeListEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest request) {

        return listModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(final ListModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler) {
        final ListModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelsResult>() {
            @Override
            public ListModelsResult call() throws Exception {
                ListModelsResult result = null;

                try {
                    result = executeListModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest request) {

        return listNotebookInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(final ListNotebookInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler) {
        final ListNotebookInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookInstancesResult>() {
            @Override
            public ListNotebookInstancesResult call() throws Exception {
                ListNotebookInstancesResult result = null;

                try {
                    result = executeListNotebookInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest request) {

        return listTrainingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(final ListTrainingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler) {
        final ListTrainingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingJobsResult>() {
            @Override
            public ListTrainingJobsResult call() throws Exception {
                ListTrainingJobsResult result = null;

                try {
                    result = executeListTrainingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest request) {

        return startNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(final StartNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler) {
        final StartNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartNotebookInstanceResult>() {
            @Override
            public StartNotebookInstanceResult call() throws Exception {
                StartNotebookInstanceResult result = null;

                try {
                    result = executeStartNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest request) {

        return stopNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(final StopNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler) {
        final StopNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopNotebookInstanceResult>() {
            @Override
            public StopNotebookInstanceResult call() throws Exception {
                StopNotebookInstanceResult result = null;

                try {
                    result = executeStopNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest request) {

        return stopTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(final StopTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler) {
        final StopTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTrainingJobResult>() {
            @Override
            public StopTrainingJobResult call() throws Exception {
                StopTrainingJobResult result = null;

                try {
                    result = executeStopTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(final UpdateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {
        final UpdateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointResult>() {
            @Override
            public UpdateEndpointResult call() throws Exception {
                UpdateEndpointResult result = null;

                try {
                    result = executeUpdateEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest request) {

        return updateEndpointWeightsAndCapacitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            final UpdateEndpointWeightsAndCapacitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler) {
        final UpdateEndpointWeightsAndCapacitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointWeightsAndCapacitiesResult>() {
            @Override
            public UpdateEndpointWeightsAndCapacitiesResult call() throws Exception {
                UpdateEndpointWeightsAndCapacitiesResult result = null;

                try {
                    result = executeUpdateEndpointWeightsAndCapacities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest request) {

        return updateNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(final UpdateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler) {
        final UpdateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotebookInstanceResult>() {
            @Override
            public UpdateNotebookInstanceResult call() throws Exception {
                UpdateNotebookInstanceResult result = null;

                try {
                    result = executeUpdateNotebookInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
