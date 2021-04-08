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
package com.amazonaws.services.lookoutequipment;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing LookoutEquipment asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Lookout for Equipment is a machine learning service that uses advanced analytics to identify anomalies in
 * machines from sensor data for use in predictive maintenance.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLookoutEquipmentAsyncClient extends AmazonLookoutEquipmentClient implements AmazonLookoutEquipmentAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLookoutEquipmentAsyncClientBuilder asyncBuilder() {
        return AmazonLookoutEquipmentAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on LookoutEquipment using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLookoutEquipmentAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on LookoutEquipment using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLookoutEquipmentAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request) {

        return createDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(final CreateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler) {
        final CreateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetResult>() {
            @Override
            public CreateDatasetResult call() throws Exception {
                CreateDatasetResult result = null;

                try {
                    result = executeCreateDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(CreateInferenceSchedulerRequest request) {

        return createInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(final CreateInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInferenceSchedulerRequest, CreateInferenceSchedulerResult> asyncHandler) {
        final CreateInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInferenceSchedulerResult>() {
            @Override
            public CreateInferenceSchedulerResult call() throws Exception {
                CreateInferenceSchedulerResult result = null;

                try {
                    result = executeCreateInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(final DeleteDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {
        final DeleteDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetResult>() {
            @Override
            public DeleteDatasetResult call() throws Exception {
                DeleteDatasetResult result = null;

                try {
                    result = executeDeleteDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(DeleteInferenceSchedulerRequest request) {

        return deleteInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(final DeleteInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInferenceSchedulerRequest, DeleteInferenceSchedulerResult> asyncHandler) {
        final DeleteInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInferenceSchedulerResult>() {
            @Override
            public DeleteInferenceSchedulerResult call() throws Exception {
                DeleteInferenceSchedulerResult result = null;

                try {
                    result = executeDeleteInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(DescribeDataIngestionJobRequest request) {

        return describeDataIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(final DescribeDataIngestionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataIngestionJobRequest, DescribeDataIngestionJobResult> asyncHandler) {
        final DescribeDataIngestionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataIngestionJobResult>() {
            @Override
            public DescribeDataIngestionJobResult call() throws Exception {
                DescribeDataIngestionJobResult result = null;

                try {
                    result = executeDescribeDataIngestionJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request) {

        return describeDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(final DescribeDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler) {
        final DescribeDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetResult>() {
            @Override
            public DescribeDatasetResult call() throws Exception {
                DescribeDatasetResult result = null;

                try {
                    result = executeDescribeDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(DescribeInferenceSchedulerRequest request) {

        return describeInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(final DescribeInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInferenceSchedulerRequest, DescribeInferenceSchedulerResult> asyncHandler) {
        final DescribeInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInferenceSchedulerResult>() {
            @Override
            public DescribeInferenceSchedulerResult call() throws Exception {
                DescribeInferenceSchedulerResult result = null;

                try {
                    result = executeDescribeInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(ListDataIngestionJobsRequest request) {

        return listDataIngestionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(final ListDataIngestionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataIngestionJobsRequest, ListDataIngestionJobsResult> asyncHandler) {
        final ListDataIngestionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataIngestionJobsResult>() {
            @Override
            public ListDataIngestionJobsResult call() throws Exception {
                ListDataIngestionJobsResult result = null;

                try {
                    result = executeListDataIngestionJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(final ListDatasetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {
        final ListDatasetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetsResult>() {
            @Override
            public ListDatasetsResult call() throws Exception {
                ListDatasetsResult result = null;

                try {
                    result = executeListDatasets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(ListInferenceExecutionsRequest request) {

        return listInferenceExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(final ListInferenceExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInferenceExecutionsRequest, ListInferenceExecutionsResult> asyncHandler) {
        final ListInferenceExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInferenceExecutionsResult>() {
            @Override
            public ListInferenceExecutionsResult call() throws Exception {
                ListInferenceExecutionsResult result = null;

                try {
                    result = executeListInferenceExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(ListInferenceSchedulersRequest request) {

        return listInferenceSchedulersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(final ListInferenceSchedulersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInferenceSchedulersRequest, ListInferenceSchedulersResult> asyncHandler) {
        final ListInferenceSchedulersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInferenceSchedulersResult>() {
            @Override
            public ListInferenceSchedulersResult call() throws Exception {
                ListInferenceSchedulersResult result = null;

                try {
                    result = executeListInferenceSchedulers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(StartDataIngestionJobRequest request) {

        return startDataIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(final StartDataIngestionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataIngestionJobRequest, StartDataIngestionJobResult> asyncHandler) {
        final StartDataIngestionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDataIngestionJobResult>() {
            @Override
            public StartDataIngestionJobResult call() throws Exception {
                StartDataIngestionJobResult result = null;

                try {
                    result = executeStartDataIngestionJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(StartInferenceSchedulerRequest request) {

        return startInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(final StartInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInferenceSchedulerRequest, StartInferenceSchedulerResult> asyncHandler) {
        final StartInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInferenceSchedulerResult>() {
            @Override
            public StartInferenceSchedulerResult call() throws Exception {
                StartInferenceSchedulerResult result = null;

                try {
                    result = executeStartInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(StopInferenceSchedulerRequest request) {

        return stopInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(final StopInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInferenceSchedulerRequest, StopInferenceSchedulerResult> asyncHandler) {
        final StopInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopInferenceSchedulerResult>() {
            @Override
            public StopInferenceSchedulerResult call() throws Exception {
                StopInferenceSchedulerResult result = null;

                try {
                    result = executeStopInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(UpdateInferenceSchedulerRequest request) {

        return updateInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(final UpdateInferenceSchedulerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInferenceSchedulerRequest, UpdateInferenceSchedulerResult> asyncHandler) {
        final UpdateInferenceSchedulerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInferenceSchedulerResult>() {
            @Override
            public UpdateInferenceSchedulerResult call() throws Exception {
                UpdateInferenceSchedulerResult result = null;

                try {
                    result = executeUpdateInferenceScheduler(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
