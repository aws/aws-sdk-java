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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Forecast Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonForecastAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(CreateAutoPredictorRequest request) {

        return createAutoPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(final CreateAutoPredictorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAutoPredictorRequest, CreateAutoPredictorResult> asyncHandler) {
        final CreateAutoPredictorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAutoPredictorResult>() {
            @Override
            public CreateAutoPredictorResult call() throws Exception {
                CreateAutoPredictorResult result = null;

                try {
                    result = executeCreateAutoPredictor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(CreateExplainabilityRequest request) {

        return createExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(final CreateExplainabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExplainabilityRequest, CreateExplainabilityResult> asyncHandler) {
        final CreateExplainabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExplainabilityResult>() {
            @Override
            public CreateExplainabilityResult call() throws Exception {
                CreateExplainabilityResult result = null;

                try {
                    result = executeCreateExplainability(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(CreateExplainabilityExportRequest request) {

        return createExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(final CreateExplainabilityExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExplainabilityExportRequest, CreateExplainabilityExportResult> asyncHandler) {
        final CreateExplainabilityExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExplainabilityExportResult>() {
            @Override
            public CreateExplainabilityExportResult call() throws Exception {
                CreateExplainabilityExportResult result = null;

                try {
                    result = executeCreateExplainabilityExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request) {

        return createMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(final CreateMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler) {
        final CreateMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitorResult>() {
            @Override
            public CreateMonitorResult call() throws Exception {
                CreateMonitorResult result = null;

                try {
                    result = executeCreateMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            CreatePredictorBacktestExportJobRequest request) {

        return createPredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            final CreatePredictorBacktestExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePredictorBacktestExportJobRequest, CreatePredictorBacktestExportJobResult> asyncHandler) {
        final CreatePredictorBacktestExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePredictorBacktestExportJobResult>() {
            @Override
            public CreatePredictorBacktestExportJobResult call() throws Exception {
                CreatePredictorBacktestExportJobResult result = null;

                try {
                    result = executeCreatePredictorBacktestExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(CreateWhatIfAnalysisRequest request) {

        return createWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(final CreateWhatIfAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWhatIfAnalysisRequest, CreateWhatIfAnalysisResult> asyncHandler) {
        final CreateWhatIfAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWhatIfAnalysisResult>() {
            @Override
            public CreateWhatIfAnalysisResult call() throws Exception {
                CreateWhatIfAnalysisResult result = null;

                try {
                    result = executeCreateWhatIfAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(CreateWhatIfForecastRequest request) {

        return createWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(final CreateWhatIfForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastRequest, CreateWhatIfForecastResult> asyncHandler) {
        final CreateWhatIfForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWhatIfForecastResult>() {
            @Override
            public CreateWhatIfForecastResult call() throws Exception {
                CreateWhatIfForecastResult result = null;

                try {
                    result = executeCreateWhatIfForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(CreateWhatIfForecastExportRequest request) {

        return createWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(final CreateWhatIfForecastExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastExportRequest, CreateWhatIfForecastExportResult> asyncHandler) {
        final CreateWhatIfForecastExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWhatIfForecastExportResult>() {
            @Override
            public CreateWhatIfForecastExportResult call() throws Exception {
                CreateWhatIfForecastExportResult result = null;

                try {
                    result = executeCreateWhatIfForecastExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(DeleteExplainabilityRequest request) {

        return deleteExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(final DeleteExplainabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityRequest, DeleteExplainabilityResult> asyncHandler) {
        final DeleteExplainabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExplainabilityResult>() {
            @Override
            public DeleteExplainabilityResult call() throws Exception {
                DeleteExplainabilityResult result = null;

                try {
                    result = executeDeleteExplainability(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(DeleteExplainabilityExportRequest request) {

        return deleteExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(final DeleteExplainabilityExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityExportRequest, DeleteExplainabilityExportResult> asyncHandler) {
        final DeleteExplainabilityExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExplainabilityExportResult>() {
            @Override
            public DeleteExplainabilityExportResult call() throws Exception {
                DeleteExplainabilityExportResult result = null;

                try {
                    result = executeDeleteExplainabilityExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request) {

        return deleteMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(final DeleteMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler) {
        final DeleteMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitorResult>() {
            @Override
            public DeleteMonitorResult call() throws Exception {
                DeleteMonitorResult result = null;

                try {
                    result = executeDeleteMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            DeletePredictorBacktestExportJobRequest request) {

        return deletePredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            final DeletePredictorBacktestExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePredictorBacktestExportJobRequest, DeletePredictorBacktestExportJobResult> asyncHandler) {
        final DeletePredictorBacktestExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePredictorBacktestExportJobResult>() {
            @Override
            public DeletePredictorBacktestExportJobResult call() throws Exception {
                DeletePredictorBacktestExportJobResult result = null;

                try {
                    result = executeDeletePredictorBacktestExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(DeleteResourceTreeRequest request) {

        return deleteResourceTreeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(final DeleteResourceTreeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceTreeRequest, DeleteResourceTreeResult> asyncHandler) {
        final DeleteResourceTreeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceTreeResult>() {
            @Override
            public DeleteResourceTreeResult call() throws Exception {
                DeleteResourceTreeResult result = null;

                try {
                    result = executeDeleteResourceTree(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(DeleteWhatIfAnalysisRequest request) {

        return deleteWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(final DeleteWhatIfAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWhatIfAnalysisRequest, DeleteWhatIfAnalysisResult> asyncHandler) {
        final DeleteWhatIfAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWhatIfAnalysisResult>() {
            @Override
            public DeleteWhatIfAnalysisResult call() throws Exception {
                DeleteWhatIfAnalysisResult result = null;

                try {
                    result = executeDeleteWhatIfAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(DeleteWhatIfForecastRequest request) {

        return deleteWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(final DeleteWhatIfForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastRequest, DeleteWhatIfForecastResult> asyncHandler) {
        final DeleteWhatIfForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWhatIfForecastResult>() {
            @Override
            public DeleteWhatIfForecastResult call() throws Exception {
                DeleteWhatIfForecastResult result = null;

                try {
                    result = executeDeleteWhatIfForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(DeleteWhatIfForecastExportRequest request) {

        return deleteWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(final DeleteWhatIfForecastExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastExportRequest, DeleteWhatIfForecastExportResult> asyncHandler) {
        final DeleteWhatIfForecastExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWhatIfForecastExportResult>() {
            @Override
            public DeleteWhatIfForecastExportResult call() throws Exception {
                DeleteWhatIfForecastExportResult result = null;

                try {
                    result = executeDeleteWhatIfForecastExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(DescribeAutoPredictorRequest request) {

        return describeAutoPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(final DescribeAutoPredictorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoPredictorRequest, DescribeAutoPredictorResult> asyncHandler) {
        final DescribeAutoPredictorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutoPredictorResult>() {
            @Override
            public DescribeAutoPredictorResult call() throws Exception {
                DescribeAutoPredictorResult result = null;

                try {
                    result = executeDescribeAutoPredictor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(DescribeExplainabilityRequest request) {

        return describeExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(final DescribeExplainabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityRequest, DescribeExplainabilityResult> asyncHandler) {
        final DescribeExplainabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExplainabilityResult>() {
            @Override
            public DescribeExplainabilityResult call() throws Exception {
                DescribeExplainabilityResult result = null;

                try {
                    result = executeDescribeExplainability(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(DescribeExplainabilityExportRequest request) {

        return describeExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(final DescribeExplainabilityExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityExportRequest, DescribeExplainabilityExportResult> asyncHandler) {
        final DescribeExplainabilityExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExplainabilityExportResult>() {
            @Override
            public DescribeExplainabilityExportResult call() throws Exception {
                DescribeExplainabilityExportResult result = null;

                try {
                    result = executeDescribeExplainabilityExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(DescribeMonitorRequest request) {

        return describeMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(final DescribeMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMonitorRequest, DescribeMonitorResult> asyncHandler) {
        final DescribeMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMonitorResult>() {
            @Override
            public DescribeMonitorResult call() throws Exception {
                DescribeMonitorResult result = null;

                try {
                    result = executeDescribeMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            DescribePredictorBacktestExportJobRequest request) {

        return describePredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            final DescribePredictorBacktestExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePredictorBacktestExportJobRequest, DescribePredictorBacktestExportJobResult> asyncHandler) {
        final DescribePredictorBacktestExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePredictorBacktestExportJobResult>() {
            @Override
            public DescribePredictorBacktestExportJobResult call() throws Exception {
                DescribePredictorBacktestExportJobResult result = null;

                try {
                    result = executeDescribePredictorBacktestExportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(DescribeWhatIfAnalysisRequest request) {

        return describeWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(final DescribeWhatIfAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWhatIfAnalysisRequest, DescribeWhatIfAnalysisResult> asyncHandler) {
        final DescribeWhatIfAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWhatIfAnalysisResult>() {
            @Override
            public DescribeWhatIfAnalysisResult call() throws Exception {
                DescribeWhatIfAnalysisResult result = null;

                try {
                    result = executeDescribeWhatIfAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(DescribeWhatIfForecastRequest request) {

        return describeWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(final DescribeWhatIfForecastRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastRequest, DescribeWhatIfForecastResult> asyncHandler) {
        final DescribeWhatIfForecastRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWhatIfForecastResult>() {
            @Override
            public DescribeWhatIfForecastResult call() throws Exception {
                DescribeWhatIfForecastResult result = null;

                try {
                    result = executeDescribeWhatIfForecast(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(DescribeWhatIfForecastExportRequest request) {

        return describeWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(final DescribeWhatIfForecastExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastExportRequest, DescribeWhatIfForecastExportResult> asyncHandler) {
        final DescribeWhatIfForecastExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWhatIfForecastExportResult>() {
            @Override
            public DescribeWhatIfForecastExportResult call() throws Exception {
                DescribeWhatIfForecastExportResult result = null;

                try {
                    result = executeDescribeWhatIfForecastExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(ListExplainabilitiesRequest request) {

        return listExplainabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(final ListExplainabilitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExplainabilitiesRequest, ListExplainabilitiesResult> asyncHandler) {
        final ListExplainabilitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExplainabilitiesResult>() {
            @Override
            public ListExplainabilitiesResult call() throws Exception {
                ListExplainabilitiesResult result = null;

                try {
                    result = executeListExplainabilities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(ListExplainabilityExportsRequest request) {

        return listExplainabilityExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(final ListExplainabilityExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExplainabilityExportsRequest, ListExplainabilityExportsResult> asyncHandler) {
        final ListExplainabilityExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExplainabilityExportsResult>() {
            @Override
            public ListExplainabilityExportsResult call() throws Exception {
                ListExplainabilityExportsResult result = null;

                try {
                    result = executeListExplainabilityExports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(ListMonitorEvaluationsRequest request) {

        return listMonitorEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(final ListMonitorEvaluationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitorEvaluationsRequest, ListMonitorEvaluationsResult> asyncHandler) {
        final ListMonitorEvaluationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitorEvaluationsResult>() {
            @Override
            public ListMonitorEvaluationsResult call() throws Exception {
                ListMonitorEvaluationsResult result = null;

                try {
                    result = executeListMonitorEvaluations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request) {

        return listMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(final ListMonitorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler) {
        final ListMonitorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitorsResult>() {
            @Override
            public ListMonitorsResult call() throws Exception {
                ListMonitorsResult result = null;

                try {
                    result = executeListMonitors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            ListPredictorBacktestExportJobsRequest request) {

        return listPredictorBacktestExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            final ListPredictorBacktestExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPredictorBacktestExportJobsRequest, ListPredictorBacktestExportJobsResult> asyncHandler) {
        final ListPredictorBacktestExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPredictorBacktestExportJobsResult>() {
            @Override
            public ListPredictorBacktestExportJobsResult call() throws Exception {
                ListPredictorBacktestExportJobsResult result = null;

                try {
                    result = executeListPredictorBacktestExportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(ListWhatIfAnalysesRequest request) {

        return listWhatIfAnalysesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(final ListWhatIfAnalysesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWhatIfAnalysesRequest, ListWhatIfAnalysesResult> asyncHandler) {
        final ListWhatIfAnalysesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWhatIfAnalysesResult>() {
            @Override
            public ListWhatIfAnalysesResult call() throws Exception {
                ListWhatIfAnalysesResult result = null;

                try {
                    result = executeListWhatIfAnalyses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(ListWhatIfForecastExportsRequest request) {

        return listWhatIfForecastExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(final ListWhatIfForecastExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastExportsRequest, ListWhatIfForecastExportsResult> asyncHandler) {
        final ListWhatIfForecastExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWhatIfForecastExportsResult>() {
            @Override
            public ListWhatIfForecastExportsResult call() throws Exception {
                ListWhatIfForecastExportsResult result = null;

                try {
                    result = executeListWhatIfForecastExports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(ListWhatIfForecastsRequest request) {

        return listWhatIfForecastsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(final ListWhatIfForecastsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastsRequest, ListWhatIfForecastsResult> asyncHandler) {
        final ListWhatIfForecastsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWhatIfForecastsResult>() {
            @Override
            public ListWhatIfForecastsResult call() throws Exception {
                ListWhatIfForecastsResult result = null;

                try {
                    result = executeListWhatIfForecasts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(ResumeResourceRequest request) {

        return resumeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(final ResumeResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeResourceRequest, ResumeResourceResult> asyncHandler) {
        final ResumeResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeResourceResult>() {
            @Override
            public ResumeResourceResult call() throws Exception {
                ResumeResourceResult result = null;

                try {
                    result = executeResumeResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopResourceResult> stopResourceAsync(StopResourceRequest request) {

        return stopResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopResourceResult> stopResourceAsync(final StopResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopResourceRequest, StopResourceResult> asyncHandler) {
        final StopResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopResourceResult>() {
            @Override
            public StopResourceResult call() throws Exception {
                StopResourceResult result = null;

                try {
                    result = executeStopResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
