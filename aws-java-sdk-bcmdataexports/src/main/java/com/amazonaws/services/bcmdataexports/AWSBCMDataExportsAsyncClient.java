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
package com.amazonaws.services.bcmdataexports;

import javax.annotation.Generated;

import com.amazonaws.services.bcmdataexports.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Billing and Cost Management Data Exports asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler}
 * can be used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You can use the Data Exports API to create customized exports from multiple Amazon Web Services cost management and
 * billing datasets, such as cost and usage data and cost optimization recommendations.
 * </p>
 * <p>
 * The Data Exports API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://bcm-data-exports.us-east-1.api.aws
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBCMDataExportsAsyncClient extends AWSBCMDataExportsClient implements AWSBCMDataExportsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBCMDataExportsAsyncClientBuilder asyncBuilder() {
        return AWSBCMDataExportsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Billing and Cost Management Data Exports
     * using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBCMDataExportsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Billing and Cost Management Data Exports
     * using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBCMDataExportsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest request) {

        return createExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(final CreateExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExportRequest, CreateExportResult> asyncHandler) {
        final CreateExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExportResult>() {
            @Override
            public CreateExportResult call() throws Exception {
                CreateExportResult result = null;

                try {
                    result = executeCreateExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest request) {

        return deleteExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(final DeleteExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExportRequest, DeleteExportResult> asyncHandler) {
        final DeleteExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExportResult>() {
            @Override
            public DeleteExportResult call() throws Exception {
                DeleteExportResult result = null;

                try {
                    result = executeDeleteExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(GetExecutionRequest request) {

        return getExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(final GetExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExecutionRequest, GetExecutionResult> asyncHandler) {
        final GetExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExecutionResult>() {
            @Override
            public GetExecutionResult call() throws Exception {
                GetExecutionResult result = null;

                try {
                    result = executeGetExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest request) {

        return getExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(final GetExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler) {
        final GetExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportResult>() {
            @Override
            public GetExportResult call() throws Exception {
                GetExportResult result = null;

                try {
                    result = executeGetExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request) {

        return getTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(final GetTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler) {
        final GetTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableResult>() {
            @Override
            public GetTableResult call() throws Exception {
                GetTableResult result = null;

                try {
                    result = executeGetTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(final ListExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {
        final ListExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExecutionsResult>() {
            @Override
            public ListExecutionsResult call() throws Exception {
                ListExecutionsResult result = null;

                try {
                    result = executeListExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request) {

        return listExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(final ListExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler) {
        final ListExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExportsResult>() {
            @Override
            public ListExportsResult call() throws Exception {
                ListExportsResult result = null;

                try {
                    result = executeListExports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(final ListTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {
        final ListTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTablesResult>() {
            @Override
            public ListTablesResult call() throws Exception {
                ListTablesResult result = null;

                try {
                    result = executeListTables(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest request) {

        return updateExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(final UpdateExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExportRequest, UpdateExportResult> asyncHandler) {
        final UpdateExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExportResult>() {
            @Override
            public UpdateExportResult call() throws Exception {
                UpdateExportResult result = null;

                try {
                    result = executeUpdateExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
