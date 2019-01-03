/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics;

import javax.annotation.Generated;

import com.amazonaws.services.iotanalytics.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT Analytics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
 * query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
 * integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.
 * </p>
 * <p>
 * Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
 * from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
 * devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
 * occur. Also, IoT data is often only meaningful in the context of other data from external sources.
 * </p>
 * <p>
 * AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
 * transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
 * service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
 * enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
 * analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
 * machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
 * questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTAnalyticsAsyncClient extends AWSIoTAnalyticsClient implements AWSIoTAnalyticsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTAnalyticsAsyncClientBuilder asyncBuilder() {
        return AWSIoTAnalyticsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Analytics using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTAnalyticsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest request) {

        return batchPutMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(final BatchPutMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutMessageRequest, BatchPutMessageResult> asyncHandler) {
        final BatchPutMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutMessageResult>() {
            @Override
            public BatchPutMessageResult call() throws Exception {
                BatchPutMessageResult result = null;

                try {
                    result = executeBatchPutMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelPipelineReprocessingResult> cancelPipelineReprocessingAsync(CancelPipelineReprocessingRequest request) {

        return cancelPipelineReprocessingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelPipelineReprocessingResult> cancelPipelineReprocessingAsync(final CancelPipelineReprocessingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelPipelineReprocessingRequest, CancelPipelineReprocessingResult> asyncHandler) {
        final CancelPipelineReprocessingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelPipelineReprocessingResult>() {
            @Override
            public CancelPipelineReprocessingResult call() throws Exception {
                CancelPipelineReprocessingResult result = null;

                try {
                    result = executeCancelPipelineReprocessing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(final CreateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {
        final CreateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelResult>() {
            @Override
            public CreateChannelResult call() throws Exception {
                CreateChannelResult result = null;

                try {
                    result = executeCreateChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
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
    public java.util.concurrent.Future<CreateDatasetContentResult> createDatasetContentAsync(CreateDatasetContentRequest request) {

        return createDatasetContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetContentResult> createDatasetContentAsync(final CreateDatasetContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetContentRequest, CreateDatasetContentResult> asyncHandler) {
        final CreateDatasetContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetContentResult>() {
            @Override
            public CreateDatasetContentResult call() throws Exception {
                CreateDatasetContentResult result = null;

                try {
                    result = executeCreateDatasetContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest request) {

        return createDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(final CreateDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatastoreRequest, CreateDatastoreResult> asyncHandler) {
        final CreateDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatastoreResult>() {
            @Override
            public CreateDatastoreResult call() throws Exception {
                CreateDatastoreResult result = null;

                try {
                    result = executeCreateDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {
        final CreatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePipelineResult>() {
            @Override
            public CreatePipelineResult call() throws Exception {
                CreatePipelineResult result = null;

                try {
                    result = executeCreatePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(final DeleteChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {
        final DeleteChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelResult>() {
            @Override
            public DeleteChannelResult call() throws Exception {
                DeleteChannelResult result = null;

                try {
                    result = executeDeleteChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteDatasetContentResult> deleteDatasetContentAsync(DeleteDatasetContentRequest request) {

        return deleteDatasetContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetContentResult> deleteDatasetContentAsync(final DeleteDatasetContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetContentRequest, DeleteDatasetContentResult> asyncHandler) {
        final DeleteDatasetContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetContentResult>() {
            @Override
            public DeleteDatasetContentResult call() throws Exception {
                DeleteDatasetContentResult result = null;

                try {
                    result = executeDeleteDatasetContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest request) {

        return deleteDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(final DeleteDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatastoreRequest, DeleteDatastoreResult> asyncHandler) {
        final DeleteDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatastoreResult>() {
            @Override
            public DeleteDatastoreResult call() throws Exception {
                DeleteDatastoreResult result = null;

                try {
                    result = executeDeleteDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {
        final DeletePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePipelineResult>() {
            @Override
            public DeletePipelineResult call() throws Exception {
                DeletePipelineResult result = null;

                try {
                    result = executeDeletePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request) {

        return describeChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(final DescribeChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler) {
        final DescribeChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelResult>() {
            @Override
            public DescribeChannelResult call() throws Exception {
                DescribeChannelResult result = null;

                try {
                    result = executeDescribeChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeDatastoreResult> describeDatastoreAsync(DescribeDatastoreRequest request) {

        return describeDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatastoreResult> describeDatastoreAsync(final DescribeDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatastoreRequest, DescribeDatastoreResult> asyncHandler) {
        final DescribeDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatastoreResult>() {
            @Override
            public DescribeDatastoreResult call() throws Exception {
                DescribeDatastoreResult result = null;

                try {
                    result = executeDescribeDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest request) {

        return describeLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(final DescribeLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler) {
        final DescribeLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingOptionsResult>() {
            @Override
            public DescribeLoggingOptionsResult call() throws Exception {
                DescribeLoggingOptionsResult result = null;

                try {
                    result = executeDescribeLoggingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(DescribePipelineRequest request) {

        return describePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelineResult> describePipelineAsync(final DescribePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipelineRequest, DescribePipelineResult> asyncHandler) {
        final DescribePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipelineResult>() {
            @Override
            public DescribePipelineResult call() throws Exception {
                DescribePipelineResult result = null;

                try {
                    result = executeDescribePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatasetContentResult> getDatasetContentAsync(GetDatasetContentRequest request) {

        return getDatasetContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatasetContentResult> getDatasetContentAsync(final GetDatasetContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatasetContentRequest, GetDatasetContentResult> asyncHandler) {
        final GetDatasetContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatasetContentResult>() {
            @Override
            public GetDatasetContentResult call() throws Exception {
                GetDatasetContentResult result = null;

                try {
                    result = executeGetDatasetContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(final ListChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {
        final ListChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsResult>() {
            @Override
            public ListChannelsResult call() throws Exception {
                ListChannelsResult result = null;

                try {
                    result = executeListChannels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatasetContentsResult> listDatasetContentsAsync(ListDatasetContentsRequest request) {

        return listDatasetContentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetContentsResult> listDatasetContentsAsync(final ListDatasetContentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetContentsRequest, ListDatasetContentsResult> asyncHandler) {
        final ListDatasetContentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetContentsResult>() {
            @Override
            public ListDatasetContentsResult call() throws Exception {
                ListDatasetContentsResult result = null;

                try {
                    result = executeListDatasetContents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest request) {

        return listDatastoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(final ListDatastoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatastoresRequest, ListDatastoresResult> asyncHandler) {
        final ListDatastoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatastoresResult>() {
            @Override
            public ListDatastoresResult call() throws Exception {
                ListDatastoresResult result = null;

                try {
                    result = executeListDatastores(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {
        final ListPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelinesResult>() {
            @Override
            public ListPipelinesResult call() throws Exception {
                ListPipelinesResult result = null;

                try {
                    result = executeListPipelines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest request) {

        return putLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(final PutLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler) {
        final PutLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLoggingOptionsResult>() {
            @Override
            public PutLoggingOptionsResult call() throws Exception {
                PutLoggingOptionsResult result = null;

                try {
                    result = executePutLoggingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RunPipelineActivityResult> runPipelineActivityAsync(RunPipelineActivityRequest request) {

        return runPipelineActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunPipelineActivityResult> runPipelineActivityAsync(final RunPipelineActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunPipelineActivityRequest, RunPipelineActivityResult> asyncHandler) {
        final RunPipelineActivityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunPipelineActivityResult>() {
            @Override
            public RunPipelineActivityResult call() throws Exception {
                RunPipelineActivityResult result = null;

                try {
                    result = executeRunPipelineActivity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SampleChannelDataResult> sampleChannelDataAsync(SampleChannelDataRequest request) {

        return sampleChannelDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SampleChannelDataResult> sampleChannelDataAsync(final SampleChannelDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<SampleChannelDataRequest, SampleChannelDataResult> asyncHandler) {
        final SampleChannelDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SampleChannelDataResult>() {
            @Override
            public SampleChannelDataResult call() throws Exception {
                SampleChannelDataResult result = null;

                try {
                    result = executeSampleChannelData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartPipelineReprocessingResult> startPipelineReprocessingAsync(StartPipelineReprocessingRequest request) {

        return startPipelineReprocessingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineReprocessingResult> startPipelineReprocessingAsync(final StartPipelineReprocessingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPipelineReprocessingRequest, StartPipelineReprocessingResult> asyncHandler) {
        final StartPipelineReprocessingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPipelineReprocessingResult>() {
            @Override
            public StartPipelineReprocessingResult call() throws Exception {
                StartPipelineReprocessingResult result = null;

                try {
                    result = executeStartPipelineReprocessing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(final UpdateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {
        final UpdateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelResult>() {
            @Override
            public UpdateChannelResult call() throws Exception {
                UpdateChannelResult result = null;

                try {
                    result = executeUpdateChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest request) {

        return updateDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(final UpdateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler) {
        final UpdateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatasetResult>() {
            @Override
            public UpdateDatasetResult call() throws Exception {
                UpdateDatasetResult result = null;

                try {
                    result = executeUpdateDataset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatastoreResult> updateDatastoreAsync(UpdateDatastoreRequest request) {

        return updateDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatastoreResult> updateDatastoreAsync(final UpdateDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatastoreRequest, UpdateDatastoreResult> asyncHandler) {
        final UpdateDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatastoreResult>() {
            @Override
            public UpdateDatastoreResult call() throws Exception {
                UpdateDatastoreResult result = null;

                try {
                    result = executeUpdateDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {
        final UpdatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineResult>() {
            @Override
            public UpdatePipelineResult call() throws Exception {
                UpdatePipelineResult result = null;

                try {
                    result = executeUpdatePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
