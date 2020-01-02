/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Forecast Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon Forecast resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonForecastAsyncClient extends AmazonForecastClient implements AmazonForecastAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonForecastAsyncClientBuilder asyncBuilder() {
        return AmazonForecastAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Forecast Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonForecastAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest request) {

        return createDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(final CreateDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetGroupRequest, CreateDatasetGroupResult> asyncHandler) {
        final CreateDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetGroupResult>() {
            @Override
            public CreateDatasetGroupResult call() throws Exception {
                CreateDatasetGroupResult result = null;

                try {
                    result = executeCreateDatasetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest request) {

        return createDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(final CreateDatasetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetImportJobRequest, CreateDatasetImportJobResult> asyncHandler) {
        final CreateDatasetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetImportJobResult>() {
            @Override
            public CreateDatasetImportJobResult call() throws Exception {
                CreateDatasetImportJobResult result = null;

                try {
                    result = executeCreateDatasetImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateForecastResult> createForecastAsync(CreateForecastRequest request) {

        return createForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateForecastResult> createForecastAsync(final CreateForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateForecastRequest, CreateForecastResult> asyncHandler) {
        final CreateForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateForecastResult>() {
            @Override
            public CreateForecastResult call() throws Exception {
                CreateForecastResult result = null;

                try {
                    result = executeCreateForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(CreateForecastExportJobRequest request) {

        return createForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(final CreateForecastExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateForecastExportJobRequest, CreateForecastExportJobResult> asyncHandler) {
        final CreateForecastExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateForecastExportJobResult>() {
            @Override
            public CreateForecastExportJobResult call() throws Exception {
                CreateForecastExportJobResult result = null;

                try {
                    result = executeCreateForecastExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest request) {

        return createPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(final CreatePredictorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePredictorRequest, CreatePredictorResult> asyncHandler) {
        final CreatePredictorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePredictorResult>() {
            @Override
            public CreatePredictorResult call() throws Exception {
                CreatePredictorResult result = null;

                try {
                    result = executeCreatePredictor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest request) {

        return deleteDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(final DeleteDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetGroupRequest, DeleteDatasetGroupResult> asyncHandler) {
        final DeleteDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetGroupResult>() {
            @Override
            public DeleteDatasetGroupResult call() throws Exception {
                DeleteDatasetGroupResult result = null;

                try {
                    result = executeDeleteDatasetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(DeleteDatasetImportJobRequest request) {

        return deleteDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(final DeleteDatasetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetImportJobRequest, DeleteDatasetImportJobResult> asyncHandler) {
        final DeleteDatasetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetImportJobResult>() {
            @Override
            public DeleteDatasetImportJobResult call() throws Exception {
                DeleteDatasetImportJobResult result = null;

                try {
                    result = executeDeleteDatasetImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(DeleteForecastRequest request) {

        return deleteForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(final DeleteForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteForecastRequest, DeleteForecastResult> asyncHandler) {
        final DeleteForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteForecastResult>() {
            @Override
            public DeleteForecastResult call() throws Exception {
                DeleteForecastResult result = null;

                try {
                    result = executeDeleteForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(DeleteForecastExportJobRequest request) {

        return deleteForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(final DeleteForecastExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteForecastExportJobRequest, DeleteForecastExportJobResult> asyncHandler) {
        final DeleteForecastExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteForecastExportJobResult>() {
            @Override
            public DeleteForecastExportJobResult call() throws Exception {
                DeleteForecastExportJobResult result = null;

                try {
                    result = executeDeleteForecastExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(DeletePredictorRequest request) {

        return deletePredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(final DeletePredictorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePredictorRequest, DeletePredictorResult> asyncHandler) {
        final DeletePredictorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePredictorResult>() {
            @Override
            public DeletePredictorResult call() throws Exception {
                DeletePredictorResult result = null;

                try {
                    result = executeDeletePredictor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest request) {

        return describeDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(final DescribeDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetGroupRequest, DescribeDatasetGroupResult> asyncHandler) {
        final DescribeDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetGroupResult>() {
            @Override
            public DescribeDatasetGroupResult call() throws Exception {
                DescribeDatasetGroupResult result = null;

                try {
                    result = executeDescribeDatasetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest request) {

        return describeDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(final DescribeDatasetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetImportJobRequest, DescribeDatasetImportJobResult> asyncHandler) {
        final DescribeDatasetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetImportJobResult>() {
            @Override
            public DescribeDatasetImportJobResult call() throws Exception {
                DescribeDatasetImportJobResult result = null;

                try {
                    result = executeDescribeDatasetImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(DescribeForecastRequest request) {

        return describeForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(final DescribeForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeForecastRequest, DescribeForecastResult> asyncHandler) {
        final DescribeForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeForecastResult>() {
            @Override
            public DescribeForecastResult call() throws Exception {
                DescribeForecastResult result = null;

                try {
                    result = executeDescribeForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(DescribeForecastExportJobRequest request) {

        return describeForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(final DescribeForecastExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeForecastExportJobRequest, DescribeForecastExportJobResult> asyncHandler) {
        final DescribeForecastExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeForecastExportJobResult>() {
            @Override
            public DescribeForecastExportJobResult call() throws Exception {
                DescribeForecastExportJobResult result = null;

                try {
                    result = executeDescribeForecastExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest request) {

        return describePredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(final DescribePredictorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePredictorRequest, DescribePredictorResult> asyncHandler) {
        final DescribePredictorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePredictorResult>() {
            @Override
            public DescribePredictorResult call() throws Exception {
                DescribePredictorResult result = null;

                try {
                    result = executeDescribePredictor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(GetAccuracyMetricsRequest request) {

        return getAccuracyMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(final GetAccuracyMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccuracyMetricsRequest, GetAccuracyMetricsResult> asyncHandler) {
        final GetAccuracyMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccuracyMetricsResult>() {
            @Override
            public GetAccuracyMetricsResult call() throws Exception {
                GetAccuracyMetricsResult result = null;

                try {
                    result = executeGetAccuracyMetrics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest request) {

        return listDatasetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(final ListDatasetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetGroupsRequest, ListDatasetGroupsResult> asyncHandler) {
        final ListDatasetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetGroupsResult>() {
            @Override
            public ListDatasetGroupsResult call() throws Exception {
                ListDatasetGroupsResult result = null;

                try {
                    result = executeListDatasetGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest request) {

        return listDatasetImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(final ListDatasetImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetImportJobsRequest, ListDatasetImportJobsResult> asyncHandler) {
        final ListDatasetImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetImportJobsResult>() {
            @Override
            public ListDatasetImportJobsResult call() throws Exception {
                ListDatasetImportJobsResult result = null;

                try {
                    result = executeListDatasetImportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(ListForecastExportJobsRequest request) {

        return listForecastExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(final ListForecastExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListForecastExportJobsRequest, ListForecastExportJobsResult> asyncHandler) {
        final ListForecastExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListForecastExportJobsResult>() {
            @Override
            public ListForecastExportJobsResult call() throws Exception {
                ListForecastExportJobsResult result = null;

                try {
                    result = executeListForecastExportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(ListForecastsRequest request) {

        return listForecastsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(final ListForecastsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListForecastsRequest, ListForecastsResult> asyncHandler) {
        final ListForecastsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListForecastsResult>() {
            @Override
            public ListForecastsResult call() throws Exception {
                ListForecastsResult result = null;

                try {
                    result = executeListForecasts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(ListPredictorsRequest request) {

        return listPredictorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(final ListPredictorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPredictorsRequest, ListPredictorsResult> asyncHandler) {
        final ListPredictorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPredictorsResult>() {
            @Override
            public ListPredictorsResult call() throws Exception {
                ListPredictorsResult result = null;

                try {
                    result = executeListPredictors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(UpdateDatasetGroupRequest request) {

        return updateDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(final UpdateDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatasetGroupRequest, UpdateDatasetGroupResult> asyncHandler) {
        final UpdateDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatasetGroupResult>() {
            @Override
            public UpdateDatasetGroupResult call() throws Exception {
                UpdateDatasetGroupResult result = null;

                try {
                    result = executeUpdateDatasetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
