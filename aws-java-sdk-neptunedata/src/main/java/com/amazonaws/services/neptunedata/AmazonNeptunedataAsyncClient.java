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
package com.amazonaws.services.neptunedata;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon NeptuneData asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Neptune Data API</fullname>
 * <p>
 * The Amazon Neptune data API provides SDK support for more than 40 of Neptune's data operations, including data
 * loading, query execution, data inquiry, and machine learning. It supports the Gremlin and openCypher query languages,
 * and is available in all SDK languages. It automatically signs API requests and greatly simplifies integrating Neptune
 * into your applications.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNeptunedataAsyncClient extends AmazonNeptunedataClient implements AmazonNeptunedataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonNeptunedataAsyncClientBuilder asyncBuilder() {
        return AmazonNeptunedataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon NeptuneData using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonNeptunedataAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon NeptuneData using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonNeptunedataAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelGremlinQueryResult> cancelGremlinQueryAsync(CancelGremlinQueryRequest request) {

        return cancelGremlinQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelGremlinQueryResult> cancelGremlinQueryAsync(final CancelGremlinQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelGremlinQueryRequest, CancelGremlinQueryResult> asyncHandler) {
        final CancelGremlinQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelGremlinQueryResult>() {
            @Override
            public CancelGremlinQueryResult call() throws Exception {
                CancelGremlinQueryResult result = null;

                try {
                    result = executeCancelGremlinQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelLoaderJobResult> cancelLoaderJobAsync(CancelLoaderJobRequest request) {

        return cancelLoaderJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelLoaderJobResult> cancelLoaderJobAsync(final CancelLoaderJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelLoaderJobRequest, CancelLoaderJobResult> asyncHandler) {
        final CancelLoaderJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelLoaderJobResult>() {
            @Override
            public CancelLoaderJobResult call() throws Exception {
                CancelLoaderJobResult result = null;

                try {
                    result = executeCancelLoaderJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelMLDataProcessingJobResult> cancelMLDataProcessingJobAsync(CancelMLDataProcessingJobRequest request) {

        return cancelMLDataProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMLDataProcessingJobResult> cancelMLDataProcessingJobAsync(final CancelMLDataProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMLDataProcessingJobRequest, CancelMLDataProcessingJobResult> asyncHandler) {
        final CancelMLDataProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMLDataProcessingJobResult>() {
            @Override
            public CancelMLDataProcessingJobResult call() throws Exception {
                CancelMLDataProcessingJobResult result = null;

                try {
                    result = executeCancelMLDataProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelMLModelTrainingJobResult> cancelMLModelTrainingJobAsync(CancelMLModelTrainingJobRequest request) {

        return cancelMLModelTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMLModelTrainingJobResult> cancelMLModelTrainingJobAsync(final CancelMLModelTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMLModelTrainingJobRequest, CancelMLModelTrainingJobResult> asyncHandler) {
        final CancelMLModelTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMLModelTrainingJobResult>() {
            @Override
            public CancelMLModelTrainingJobResult call() throws Exception {
                CancelMLModelTrainingJobResult result = null;

                try {
                    result = executeCancelMLModelTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelMLModelTransformJobResult> cancelMLModelTransformJobAsync(CancelMLModelTransformJobRequest request) {

        return cancelMLModelTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMLModelTransformJobResult> cancelMLModelTransformJobAsync(final CancelMLModelTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMLModelTransformJobRequest, CancelMLModelTransformJobResult> asyncHandler) {
        final CancelMLModelTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMLModelTransformJobResult>() {
            @Override
            public CancelMLModelTransformJobResult call() throws Exception {
                CancelMLModelTransformJobResult result = null;

                try {
                    result = executeCancelMLModelTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelOpenCypherQueryResult> cancelOpenCypherQueryAsync(CancelOpenCypherQueryRequest request) {

        return cancelOpenCypherQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelOpenCypherQueryResult> cancelOpenCypherQueryAsync(final CancelOpenCypherQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelOpenCypherQueryRequest, CancelOpenCypherQueryResult> asyncHandler) {
        final CancelOpenCypherQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelOpenCypherQueryResult>() {
            @Override
            public CancelOpenCypherQueryResult call() throws Exception {
                CancelOpenCypherQueryResult result = null;

                try {
                    result = executeCancelOpenCypherQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMLEndpointResult> createMLEndpointAsync(CreateMLEndpointRequest request) {

        return createMLEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMLEndpointResult> createMLEndpointAsync(final CreateMLEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMLEndpointRequest, CreateMLEndpointResult> asyncHandler) {
        final CreateMLEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMLEndpointResult>() {
            @Override
            public CreateMLEndpointResult call() throws Exception {
                CreateMLEndpointResult result = null;

                try {
                    result = executeCreateMLEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMLEndpointResult> deleteMLEndpointAsync(DeleteMLEndpointRequest request) {

        return deleteMLEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMLEndpointResult> deleteMLEndpointAsync(final DeleteMLEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMLEndpointRequest, DeleteMLEndpointResult> asyncHandler) {
        final DeleteMLEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMLEndpointResult>() {
            @Override
            public DeleteMLEndpointResult call() throws Exception {
                DeleteMLEndpointResult result = null;

                try {
                    result = executeDeleteMLEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePropertygraphStatisticsResult> deletePropertygraphStatisticsAsync(DeletePropertygraphStatisticsRequest request) {

        return deletePropertygraphStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePropertygraphStatisticsResult> deletePropertygraphStatisticsAsync(
            final DeletePropertygraphStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePropertygraphStatisticsRequest, DeletePropertygraphStatisticsResult> asyncHandler) {
        final DeletePropertygraphStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePropertygraphStatisticsResult>() {
            @Override
            public DeletePropertygraphStatisticsResult call() throws Exception {
                DeletePropertygraphStatisticsResult result = null;

                try {
                    result = executeDeletePropertygraphStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSparqlStatisticsResult> deleteSparqlStatisticsAsync(DeleteSparqlStatisticsRequest request) {

        return deleteSparqlStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSparqlStatisticsResult> deleteSparqlStatisticsAsync(final DeleteSparqlStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSparqlStatisticsRequest, DeleteSparqlStatisticsResult> asyncHandler) {
        final DeleteSparqlStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSparqlStatisticsResult>() {
            @Override
            public DeleteSparqlStatisticsResult call() throws Exception {
                DeleteSparqlStatisticsResult result = null;

                try {
                    result = executeDeleteSparqlStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteFastResetResult> executeFastResetAsync(ExecuteFastResetRequest request) {

        return executeFastResetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteFastResetResult> executeFastResetAsync(final ExecuteFastResetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteFastResetRequest, ExecuteFastResetResult> asyncHandler) {
        final ExecuteFastResetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteFastResetResult>() {
            @Override
            public ExecuteFastResetResult call() throws Exception {
                ExecuteFastResetResult result = null;

                try {
                    result = executeExecuteFastReset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinExplainQueryResult> executeGremlinExplainQueryAsync(ExecuteGremlinExplainQueryRequest request) {

        return executeGremlinExplainQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinExplainQueryResult> executeGremlinExplainQueryAsync(final ExecuteGremlinExplainQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteGremlinExplainQueryRequest, ExecuteGremlinExplainQueryResult> asyncHandler) {
        final ExecuteGremlinExplainQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteGremlinExplainQueryResult>() {
            @Override
            public ExecuteGremlinExplainQueryResult call() throws Exception {
                ExecuteGremlinExplainQueryResult result = null;

                try {
                    result = executeExecuteGremlinExplainQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinProfileQueryResult> executeGremlinProfileQueryAsync(ExecuteGremlinProfileQueryRequest request) {

        return executeGremlinProfileQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinProfileQueryResult> executeGremlinProfileQueryAsync(final ExecuteGremlinProfileQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteGremlinProfileQueryRequest, ExecuteGremlinProfileQueryResult> asyncHandler) {
        final ExecuteGremlinProfileQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteGremlinProfileQueryResult>() {
            @Override
            public ExecuteGremlinProfileQueryResult call() throws Exception {
                ExecuteGremlinProfileQueryResult result = null;

                try {
                    result = executeExecuteGremlinProfileQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinQueryResult> executeGremlinQueryAsync(ExecuteGremlinQueryRequest request) {

        return executeGremlinQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteGremlinQueryResult> executeGremlinQueryAsync(final ExecuteGremlinQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteGremlinQueryRequest, ExecuteGremlinQueryResult> asyncHandler) {
        final ExecuteGremlinQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteGremlinQueryResult>() {
            @Override
            public ExecuteGremlinQueryResult call() throws Exception {
                ExecuteGremlinQueryResult result = null;

                try {
                    result = executeExecuteGremlinQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteOpenCypherExplainQueryResult> executeOpenCypherExplainQueryAsync(ExecuteOpenCypherExplainQueryRequest request) {

        return executeOpenCypherExplainQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteOpenCypherExplainQueryResult> executeOpenCypherExplainQueryAsync(
            final ExecuteOpenCypherExplainQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteOpenCypherExplainQueryRequest, ExecuteOpenCypherExplainQueryResult> asyncHandler) {
        final ExecuteOpenCypherExplainQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteOpenCypherExplainQueryResult>() {
            @Override
            public ExecuteOpenCypherExplainQueryResult call() throws Exception {
                ExecuteOpenCypherExplainQueryResult result = null;

                try {
                    result = executeExecuteOpenCypherExplainQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEngineStatusResult> getEngineStatusAsync(GetEngineStatusRequest request) {

        return getEngineStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEngineStatusResult> getEngineStatusAsync(final GetEngineStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEngineStatusRequest, GetEngineStatusResult> asyncHandler) {
        final GetEngineStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEngineStatusResult>() {
            @Override
            public GetEngineStatusResult call() throws Exception {
                GetEngineStatusResult result = null;

                try {
                    result = executeGetEngineStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGremlinQueryStatusResult> getGremlinQueryStatusAsync(GetGremlinQueryStatusRequest request) {

        return getGremlinQueryStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGremlinQueryStatusResult> getGremlinQueryStatusAsync(final GetGremlinQueryStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGremlinQueryStatusRequest, GetGremlinQueryStatusResult> asyncHandler) {
        final GetGremlinQueryStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGremlinQueryStatusResult>() {
            @Override
            public GetGremlinQueryStatusResult call() throws Exception {
                GetGremlinQueryStatusResult result = null;

                try {
                    result = executeGetGremlinQueryStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMLDataProcessingJobResult> getMLDataProcessingJobAsync(GetMLDataProcessingJobRequest request) {

        return getMLDataProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLDataProcessingJobResult> getMLDataProcessingJobAsync(final GetMLDataProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLDataProcessingJobRequest, GetMLDataProcessingJobResult> asyncHandler) {
        final GetMLDataProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLDataProcessingJobResult>() {
            @Override
            public GetMLDataProcessingJobResult call() throws Exception {
                GetMLDataProcessingJobResult result = null;

                try {
                    result = executeGetMLDataProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMLEndpointResult> getMLEndpointAsync(GetMLEndpointRequest request) {

        return getMLEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLEndpointResult> getMLEndpointAsync(final GetMLEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLEndpointRequest, GetMLEndpointResult> asyncHandler) {
        final GetMLEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLEndpointResult>() {
            @Override
            public GetMLEndpointResult call() throws Exception {
                GetMLEndpointResult result = null;

                try {
                    result = executeGetMLEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMLModelTrainingJobResult> getMLModelTrainingJobAsync(GetMLModelTrainingJobRequest request) {

        return getMLModelTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLModelTrainingJobResult> getMLModelTrainingJobAsync(final GetMLModelTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLModelTrainingJobRequest, GetMLModelTrainingJobResult> asyncHandler) {
        final GetMLModelTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLModelTrainingJobResult>() {
            @Override
            public GetMLModelTrainingJobResult call() throws Exception {
                GetMLModelTrainingJobResult result = null;

                try {
                    result = executeGetMLModelTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMLModelTransformJobResult> getMLModelTransformJobAsync(GetMLModelTransformJobRequest request) {

        return getMLModelTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLModelTransformJobResult> getMLModelTransformJobAsync(final GetMLModelTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLModelTransformJobRequest, GetMLModelTransformJobResult> asyncHandler) {
        final GetMLModelTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLModelTransformJobResult>() {
            @Override
            public GetMLModelTransformJobResult call() throws Exception {
                GetMLModelTransformJobResult result = null;

                try {
                    result = executeGetMLModelTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOpenCypherQueryStatusResult> getOpenCypherQueryStatusAsync(GetOpenCypherQueryStatusRequest request) {

        return getOpenCypherQueryStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenCypherQueryStatusResult> getOpenCypherQueryStatusAsync(final GetOpenCypherQueryStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOpenCypherQueryStatusRequest, GetOpenCypherQueryStatusResult> asyncHandler) {
        final GetOpenCypherQueryStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOpenCypherQueryStatusResult>() {
            @Override
            public GetOpenCypherQueryStatusResult call() throws Exception {
                GetOpenCypherQueryStatusResult result = null;

                try {
                    result = executeGetOpenCypherQueryStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPropertygraphStatisticsResult> getPropertygraphStatisticsAsync(GetPropertygraphStatisticsRequest request) {

        return getPropertygraphStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPropertygraphStatisticsResult> getPropertygraphStatisticsAsync(final GetPropertygraphStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPropertygraphStatisticsRequest, GetPropertygraphStatisticsResult> asyncHandler) {
        final GetPropertygraphStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPropertygraphStatisticsResult>() {
            @Override
            public GetPropertygraphStatisticsResult call() throws Exception {
                GetPropertygraphStatisticsResult result = null;

                try {
                    result = executeGetPropertygraphStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPropertygraphSummaryResult> getPropertygraphSummaryAsync(GetPropertygraphSummaryRequest request) {

        return getPropertygraphSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPropertygraphSummaryResult> getPropertygraphSummaryAsync(final GetPropertygraphSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPropertygraphSummaryRequest, GetPropertygraphSummaryResult> asyncHandler) {
        final GetPropertygraphSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPropertygraphSummaryResult>() {
            @Override
            public GetPropertygraphSummaryResult call() throws Exception {
                GetPropertygraphSummaryResult result = null;

                try {
                    result = executeGetPropertygraphSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRDFGraphSummaryResult> getRDFGraphSummaryAsync(GetRDFGraphSummaryRequest request) {

        return getRDFGraphSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRDFGraphSummaryResult> getRDFGraphSummaryAsync(final GetRDFGraphSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRDFGraphSummaryRequest, GetRDFGraphSummaryResult> asyncHandler) {
        final GetRDFGraphSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRDFGraphSummaryResult>() {
            @Override
            public GetRDFGraphSummaryResult call() throws Exception {
                GetRDFGraphSummaryResult result = null;

                try {
                    result = executeGetRDFGraphSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSparqlStatisticsResult> getSparqlStatisticsAsync(GetSparqlStatisticsRequest request) {

        return getSparqlStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSparqlStatisticsResult> getSparqlStatisticsAsync(final GetSparqlStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSparqlStatisticsRequest, GetSparqlStatisticsResult> asyncHandler) {
        final GetSparqlStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSparqlStatisticsResult>() {
            @Override
            public GetSparqlStatisticsResult call() throws Exception {
                GetSparqlStatisticsResult result = null;

                try {
                    result = executeGetSparqlStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSparqlStreamResult> getSparqlStreamAsync(GetSparqlStreamRequest request) {

        return getSparqlStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSparqlStreamResult> getSparqlStreamAsync(final GetSparqlStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSparqlStreamRequest, GetSparqlStreamResult> asyncHandler) {
        final GetSparqlStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSparqlStreamResult>() {
            @Override
            public GetSparqlStreamResult call() throws Exception {
                GetSparqlStreamResult result = null;

                try {
                    result = executeGetSparqlStream(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGremlinQueriesResult> listGremlinQueriesAsync(ListGremlinQueriesRequest request) {

        return listGremlinQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGremlinQueriesResult> listGremlinQueriesAsync(final ListGremlinQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGremlinQueriesRequest, ListGremlinQueriesResult> asyncHandler) {
        final ListGremlinQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGremlinQueriesResult>() {
            @Override
            public ListGremlinQueriesResult call() throws Exception {
                ListGremlinQueriesResult result = null;

                try {
                    result = executeListGremlinQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLoaderJobsResult> listLoaderJobsAsync(ListLoaderJobsRequest request) {

        return listLoaderJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoaderJobsResult> listLoaderJobsAsync(final ListLoaderJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoaderJobsRequest, ListLoaderJobsResult> asyncHandler) {
        final ListLoaderJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoaderJobsResult>() {
            @Override
            public ListLoaderJobsResult call() throws Exception {
                ListLoaderJobsResult result = null;

                try {
                    result = executeListLoaderJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMLDataProcessingJobsResult> listMLDataProcessingJobsAsync(ListMLDataProcessingJobsRequest request) {

        return listMLDataProcessingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMLDataProcessingJobsResult> listMLDataProcessingJobsAsync(final ListMLDataProcessingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMLDataProcessingJobsRequest, ListMLDataProcessingJobsResult> asyncHandler) {
        final ListMLDataProcessingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMLDataProcessingJobsResult>() {
            @Override
            public ListMLDataProcessingJobsResult call() throws Exception {
                ListMLDataProcessingJobsResult result = null;

                try {
                    result = executeListMLDataProcessingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMLEndpointsResult> listMLEndpointsAsync(ListMLEndpointsRequest request) {

        return listMLEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMLEndpointsResult> listMLEndpointsAsync(final ListMLEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMLEndpointsRequest, ListMLEndpointsResult> asyncHandler) {
        final ListMLEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMLEndpointsResult>() {
            @Override
            public ListMLEndpointsResult call() throws Exception {
                ListMLEndpointsResult result = null;

                try {
                    result = executeListMLEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMLModelTrainingJobsResult> listMLModelTrainingJobsAsync(ListMLModelTrainingJobsRequest request) {

        return listMLModelTrainingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMLModelTrainingJobsResult> listMLModelTrainingJobsAsync(final ListMLModelTrainingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMLModelTrainingJobsRequest, ListMLModelTrainingJobsResult> asyncHandler) {
        final ListMLModelTrainingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMLModelTrainingJobsResult>() {
            @Override
            public ListMLModelTrainingJobsResult call() throws Exception {
                ListMLModelTrainingJobsResult result = null;

                try {
                    result = executeListMLModelTrainingJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMLModelTransformJobsResult> listMLModelTransformJobsAsync(ListMLModelTransformJobsRequest request) {

        return listMLModelTransformJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMLModelTransformJobsResult> listMLModelTransformJobsAsync(final ListMLModelTransformJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMLModelTransformJobsRequest, ListMLModelTransformJobsResult> asyncHandler) {
        final ListMLModelTransformJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMLModelTransformJobsResult>() {
            @Override
            public ListMLModelTransformJobsResult call() throws Exception {
                ListMLModelTransformJobsResult result = null;

                try {
                    result = executeListMLModelTransformJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOpenCypherQueriesResult> listOpenCypherQueriesAsync(ListOpenCypherQueriesRequest request) {

        return listOpenCypherQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOpenCypherQueriesResult> listOpenCypherQueriesAsync(final ListOpenCypherQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOpenCypherQueriesRequest, ListOpenCypherQueriesResult> asyncHandler) {
        final ListOpenCypherQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOpenCypherQueriesResult>() {
            @Override
            public ListOpenCypherQueriesResult call() throws Exception {
                ListOpenCypherQueriesResult result = null;

                try {
                    result = executeListOpenCypherQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ManagePropertygraphStatisticsResult> managePropertygraphStatisticsAsync(ManagePropertygraphStatisticsRequest request) {

        return managePropertygraphStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ManagePropertygraphStatisticsResult> managePropertygraphStatisticsAsync(
            final ManagePropertygraphStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ManagePropertygraphStatisticsRequest, ManagePropertygraphStatisticsResult> asyncHandler) {
        final ManagePropertygraphStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ManagePropertygraphStatisticsResult>() {
            @Override
            public ManagePropertygraphStatisticsResult call() throws Exception {
                ManagePropertygraphStatisticsResult result = null;

                try {
                    result = executeManagePropertygraphStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ManageSparqlStatisticsResult> manageSparqlStatisticsAsync(ManageSparqlStatisticsRequest request) {

        return manageSparqlStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ManageSparqlStatisticsResult> manageSparqlStatisticsAsync(final ManageSparqlStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ManageSparqlStatisticsRequest, ManageSparqlStatisticsResult> asyncHandler) {
        final ManageSparqlStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ManageSparqlStatisticsResult>() {
            @Override
            public ManageSparqlStatisticsResult call() throws Exception {
                ManageSparqlStatisticsResult result = null;

                try {
                    result = executeManageSparqlStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartLoaderJobResult> startLoaderJobAsync(StartLoaderJobRequest request) {

        return startLoaderJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLoaderJobResult> startLoaderJobAsync(final StartLoaderJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartLoaderJobRequest, StartLoaderJobResult> asyncHandler) {
        final StartLoaderJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartLoaderJobResult>() {
            @Override
            public StartLoaderJobResult call() throws Exception {
                StartLoaderJobResult result = null;

                try {
                    result = executeStartLoaderJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMLDataProcessingJobResult> startMLDataProcessingJobAsync(StartMLDataProcessingJobRequest request) {

        return startMLDataProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMLDataProcessingJobResult> startMLDataProcessingJobAsync(final StartMLDataProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMLDataProcessingJobRequest, StartMLDataProcessingJobResult> asyncHandler) {
        final StartMLDataProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMLDataProcessingJobResult>() {
            @Override
            public StartMLDataProcessingJobResult call() throws Exception {
                StartMLDataProcessingJobResult result = null;

                try {
                    result = executeStartMLDataProcessingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMLModelTrainingJobResult> startMLModelTrainingJobAsync(StartMLModelTrainingJobRequest request) {

        return startMLModelTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMLModelTrainingJobResult> startMLModelTrainingJobAsync(final StartMLModelTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMLModelTrainingJobRequest, StartMLModelTrainingJobResult> asyncHandler) {
        final StartMLModelTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMLModelTrainingJobResult>() {
            @Override
            public StartMLModelTrainingJobResult call() throws Exception {
                StartMLModelTrainingJobResult result = null;

                try {
                    result = executeStartMLModelTrainingJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMLModelTransformJobResult> startMLModelTransformJobAsync(StartMLModelTransformJobRequest request) {

        return startMLModelTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMLModelTransformJobResult> startMLModelTransformJobAsync(final StartMLModelTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMLModelTransformJobRequest, StartMLModelTransformJobResult> asyncHandler) {
        final StartMLModelTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMLModelTransformJobResult>() {
            @Override
            public StartMLModelTransformJobResult call() throws Exception {
                StartMLModelTransformJobResult result = null;

                try {
                    result = executeStartMLModelTransformJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
