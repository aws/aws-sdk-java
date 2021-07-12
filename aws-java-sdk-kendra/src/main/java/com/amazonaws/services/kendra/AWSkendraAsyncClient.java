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
package com.amazonaws.services.kendra;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing kendra asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Kendra is a service for indexing large document sets.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSkendraAsyncClient extends AWSkendraClient implements AWSkendraAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSkendraAsyncClientBuilder asyncBuilder() {
        return AWSkendraAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on kendra using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSkendraAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on kendra using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSkendraAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest request) {

        return batchDeleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(final BatchDeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteDocumentRequest, BatchDeleteDocumentResult> asyncHandler) {
        final BatchDeleteDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteDocumentResult>() {
            @Override
            public BatchDeleteDocumentResult call() throws Exception {
                BatchDeleteDocumentResult result = null;

                try {
                    result = executeBatchDeleteDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(BatchGetDocumentStatusRequest request) {

        return batchGetDocumentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(final BatchGetDocumentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDocumentStatusRequest, BatchGetDocumentStatusResult> asyncHandler) {
        final BatchGetDocumentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDocumentStatusResult>() {
            @Override
            public BatchGetDocumentStatusResult call() throws Exception {
                BatchGetDocumentStatusResult result = null;

                try {
                    result = executeBatchGetDocumentStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest request) {

        return batchPutDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(final BatchPutDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutDocumentRequest, BatchPutDocumentResult> asyncHandler) {
        final BatchPutDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutDocumentResult>() {
            @Override
            public BatchPutDocumentResult call() throws Exception {
                BatchPutDocumentResult result = null;

                try {
                    result = executeBatchPutDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(ClearQuerySuggestionsRequest request) {

        return clearQuerySuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(final ClearQuerySuggestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ClearQuerySuggestionsRequest, ClearQuerySuggestionsResult> asyncHandler) {
        final ClearQuerySuggestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClearQuerySuggestionsResult>() {
            @Override
            public ClearQuerySuggestionsResult call() throws Exception {
                ClearQuerySuggestionsResult result = null;

                try {
                    result = executeClearQuerySuggestions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request) {

        return createDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(final CreateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler) {
        final CreateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceResult>() {
            @Override
            public CreateDataSourceResult call() throws Exception {
                CreateDataSourceResult result = null;

                try {
                    result = executeCreateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFaqResult> createFaqAsync(CreateFaqRequest request) {

        return createFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFaqResult> createFaqAsync(final CreateFaqRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFaqRequest, CreateFaqResult> asyncHandler) {
        final CreateFaqRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFaqResult>() {
            @Override
            public CreateFaqResult call() throws Exception {
                CreateFaqResult result = null;

                try {
                    result = executeCreateFaq(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request) {

        return createIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(final CreateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler) {
        final CreateIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIndexResult>() {
            @Override
            public CreateIndexResult call() throws Exception {
                CreateIndexResult result = null;

                try {
                    result = executeCreateIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            CreateQuerySuggestionsBlockListRequest request) {

        return createQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            final CreateQuerySuggestionsBlockListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQuerySuggestionsBlockListRequest, CreateQuerySuggestionsBlockListResult> asyncHandler) {
        final CreateQuerySuggestionsBlockListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQuerySuggestionsBlockListResult>() {
            @Override
            public CreateQuerySuggestionsBlockListResult call() throws Exception {
                CreateQuerySuggestionsBlockListResult result = null;

                try {
                    result = executeCreateQuerySuggestionsBlockList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(CreateThesaurusRequest request) {

        return createThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(final CreateThesaurusRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThesaurusRequest, CreateThesaurusResult> asyncHandler) {
        final CreateThesaurusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThesaurusResult>() {
            @Override
            public CreateThesaurusResult call() throws Exception {
                CreateThesaurusResult result = null;

                try {
                    result = executeCreateThesaurus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {
        final DeleteDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSourceResult>() {
            @Override
            public DeleteDataSourceResult call() throws Exception {
                DeleteDataSourceResult result = null;

                try {
                    result = executeDeleteDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(DeleteFaqRequest request) {

        return deleteFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(final DeleteFaqRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFaqRequest, DeleteFaqResult> asyncHandler) {
        final DeleteFaqRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFaqResult>() {
            @Override
            public DeleteFaqResult call() throws Exception {
                DeleteFaqResult result = null;

                try {
                    result = executeDeleteFaq(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest request) {

        return deleteIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(final DeleteIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler) {
        final DeleteIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIndexResult>() {
            @Override
            public DeleteIndexResult call() throws Exception {
                DeleteIndexResult result = null;

                try {
                    result = executeDeleteIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(DeletePrincipalMappingRequest request) {

        return deletePrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(final DeletePrincipalMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePrincipalMappingRequest, DeletePrincipalMappingResult> asyncHandler) {
        final DeletePrincipalMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePrincipalMappingResult>() {
            @Override
            public DeletePrincipalMappingResult call() throws Exception {
                DeletePrincipalMappingResult result = null;

                try {
                    result = executeDeletePrincipalMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            DeleteQuerySuggestionsBlockListRequest request) {

        return deleteQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            final DeleteQuerySuggestionsBlockListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQuerySuggestionsBlockListRequest, DeleteQuerySuggestionsBlockListResult> asyncHandler) {
        final DeleteQuerySuggestionsBlockListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQuerySuggestionsBlockListResult>() {
            @Override
            public DeleteQuerySuggestionsBlockListResult call() throws Exception {
                DeleteQuerySuggestionsBlockListResult result = null;

                try {
                    result = executeDeleteQuerySuggestionsBlockList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(DeleteThesaurusRequest request) {

        return deleteThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(final DeleteThesaurusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThesaurusRequest, DeleteThesaurusResult> asyncHandler) {
        final DeleteThesaurusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThesaurusResult>() {
            @Override
            public DeleteThesaurusResult call() throws Exception {
                DeleteThesaurusResult result = null;

                try {
                    result = executeDeleteThesaurus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest request) {

        return describeDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(final DescribeDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSourceRequest, DescribeDataSourceResult> asyncHandler) {
        final DescribeDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSourceResult>() {
            @Override
            public DescribeDataSourceResult call() throws Exception {
                DescribeDataSourceResult result = null;

                try {
                    result = executeDescribeDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(DescribeFaqRequest request) {

        return describeFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(final DescribeFaqRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFaqRequest, DescribeFaqResult> asyncHandler) {
        final DescribeFaqRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFaqResult>() {
            @Override
            public DescribeFaqResult call() throws Exception {
                DescribeFaqResult result = null;

                try {
                    result = executeDescribeFaq(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest request) {

        return describeIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(final DescribeIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIndexRequest, DescribeIndexResult> asyncHandler) {
        final DescribeIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIndexResult>() {
            @Override
            public DescribeIndexResult call() throws Exception {
                DescribeIndexResult result = null;

                try {
                    result = executeDescribeIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(DescribePrincipalMappingRequest request) {

        return describePrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(final DescribePrincipalMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePrincipalMappingRequest, DescribePrincipalMappingResult> asyncHandler) {
        final DescribePrincipalMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePrincipalMappingResult>() {
            @Override
            public DescribePrincipalMappingResult call() throws Exception {
                DescribePrincipalMappingResult result = null;

                try {
                    result = executeDescribePrincipalMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            DescribeQuerySuggestionsBlockListRequest request) {

        return describeQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            final DescribeQuerySuggestionsBlockListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsBlockListRequest, DescribeQuerySuggestionsBlockListResult> asyncHandler) {
        final DescribeQuerySuggestionsBlockListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQuerySuggestionsBlockListResult>() {
            @Override
            public DescribeQuerySuggestionsBlockListResult call() throws Exception {
                DescribeQuerySuggestionsBlockListResult result = null;

                try {
                    result = executeDescribeQuerySuggestionsBlockList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(DescribeQuerySuggestionsConfigRequest request) {

        return describeQuerySuggestionsConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(
            final DescribeQuerySuggestionsConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsConfigRequest, DescribeQuerySuggestionsConfigResult> asyncHandler) {
        final DescribeQuerySuggestionsConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQuerySuggestionsConfigResult>() {
            @Override
            public DescribeQuerySuggestionsConfigResult call() throws Exception {
                DescribeQuerySuggestionsConfigResult result = null;

                try {
                    result = executeDescribeQuerySuggestionsConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(DescribeThesaurusRequest request) {

        return describeThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(final DescribeThesaurusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThesaurusRequest, DescribeThesaurusResult> asyncHandler) {
        final DescribeThesaurusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThesaurusResult>() {
            @Override
            public DescribeThesaurusResult call() throws Exception {
                DescribeThesaurusResult result = null;

                try {
                    result = executeDescribeThesaurus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(GetQuerySuggestionsRequest request) {

        return getQuerySuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(final GetQuerySuggestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQuerySuggestionsRequest, GetQuerySuggestionsResult> asyncHandler) {
        final GetQuerySuggestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQuerySuggestionsResult>() {
            @Override
            public GetQuerySuggestionsResult call() throws Exception {
                GetQuerySuggestionsResult result = null;

                try {
                    result = executeGetQuerySuggestions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest request) {

        return listDataSourceSyncJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(final ListDataSourceSyncJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourceSyncJobsRequest, ListDataSourceSyncJobsResult> asyncHandler) {
        final ListDataSourceSyncJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourceSyncJobsResult>() {
            @Override
            public ListDataSourceSyncJobsResult call() throws Exception {
                ListDataSourceSyncJobsResult result = null;

                try {
                    result = executeListDataSourceSyncJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request) {

        return listDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(final ListDataSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler) {
        final ListDataSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourcesResult>() {
            @Override
            public ListDataSourcesResult call() throws Exception {
                ListDataSourcesResult result = null;

                try {
                    result = executeListDataSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(ListFaqsRequest request) {

        return listFaqsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(final ListFaqsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFaqsRequest, ListFaqsResult> asyncHandler) {
        final ListFaqsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFaqsResult>() {
            @Override
            public ListFaqsResult call() throws Exception {
                ListFaqsResult result = null;

                try {
                    result = executeListFaqs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(ListGroupsOlderThanOrderingIdRequest request) {

        return listGroupsOlderThanOrderingIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(
            final ListGroupsOlderThanOrderingIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsOlderThanOrderingIdRequest, ListGroupsOlderThanOrderingIdResult> asyncHandler) {
        final ListGroupsOlderThanOrderingIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsOlderThanOrderingIdResult>() {
            @Override
            public ListGroupsOlderThanOrderingIdResult call() throws Exception {
                ListGroupsOlderThanOrderingIdResult result = null;

                try {
                    result = executeListGroupsOlderThanOrderingId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest request) {

        return listIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(final ListIndicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler) {
        final ListIndicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIndicesResult>() {
            @Override
            public ListIndicesResult call() throws Exception {
                ListIndicesResult result = null;

                try {
                    result = executeListIndices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(ListQuerySuggestionsBlockListsRequest request) {

        return listQuerySuggestionsBlockListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(
            final ListQuerySuggestionsBlockListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQuerySuggestionsBlockListsRequest, ListQuerySuggestionsBlockListsResult> asyncHandler) {
        final ListQuerySuggestionsBlockListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQuerySuggestionsBlockListsResult>() {
            @Override
            public ListQuerySuggestionsBlockListsResult call() throws Exception {
                ListQuerySuggestionsBlockListsResult result = null;

                try {
                    result = executeListQuerySuggestionsBlockLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(ListThesauriRequest request) {

        return listThesauriAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(final ListThesauriRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThesauriRequest, ListThesauriResult> asyncHandler) {
        final ListThesauriRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThesauriResult>() {
            @Override
            public ListThesauriResult call() throws Exception {
                ListThesauriResult result = null;

                try {
                    result = executeListThesauri(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(PutPrincipalMappingRequest request) {

        return putPrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(final PutPrincipalMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPrincipalMappingRequest, PutPrincipalMappingResult> asyncHandler) {
        final PutPrincipalMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPrincipalMappingResult>() {
            @Override
            public PutPrincipalMappingResult call() throws Exception {
                PutPrincipalMappingResult result = null;

                try {
                    result = executePutPrincipalMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(final QueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {
        final QueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<QueryResult>() {
            @Override
            public QueryResult call() throws Exception {
                QueryResult result = null;

                try {
                    result = executeQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest request) {

        return startDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(final StartDataSourceSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataSourceSyncJobRequest, StartDataSourceSyncJobResult> asyncHandler) {
        final StartDataSourceSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDataSourceSyncJobResult>() {
            @Override
            public StartDataSourceSyncJobResult call() throws Exception {
                StartDataSourceSyncJobResult result = null;

                try {
                    result = executeStartDataSourceSyncJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest request) {

        return stopDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(final StopDataSourceSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataSourceSyncJobRequest, StopDataSourceSyncJobResult> asyncHandler) {
        final StopDataSourceSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDataSourceSyncJobResult>() {
            @Override
            public StopDataSourceSyncJobResult call() throws Exception {
                StopDataSourceSyncJobResult result = null;

                try {
                    result = executeStopDataSourceSyncJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest request) {

        return submitFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(final SubmitFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitFeedbackRequest, SubmitFeedbackResult> asyncHandler) {
        final SubmitFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubmitFeedbackResult>() {
            @Override
            public SubmitFeedbackResult call() throws Exception {
                SubmitFeedbackResult result = null;

                try {
                    result = executeSubmitFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {
        final UpdateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourceResult>() {
            @Override
            public UpdateDataSourceResult call() throws Exception {
                UpdateDataSourceResult result = null;

                try {
                    result = executeUpdateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest request) {

        return updateIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(final UpdateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIndexRequest, UpdateIndexResult> asyncHandler) {
        final UpdateIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIndexResult>() {
            @Override
            public UpdateIndexResult call() throws Exception {
                UpdateIndexResult result = null;

                try {
                    result = executeUpdateIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            UpdateQuerySuggestionsBlockListRequest request) {

        return updateQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            final UpdateQuerySuggestionsBlockListRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsBlockListRequest, UpdateQuerySuggestionsBlockListResult> asyncHandler) {
        final UpdateQuerySuggestionsBlockListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuerySuggestionsBlockListResult>() {
            @Override
            public UpdateQuerySuggestionsBlockListResult call() throws Exception {
                UpdateQuerySuggestionsBlockListResult result = null;

                try {
                    result = executeUpdateQuerySuggestionsBlockList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(UpdateQuerySuggestionsConfigRequest request) {

        return updateQuerySuggestionsConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(final UpdateQuerySuggestionsConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsConfigRequest, UpdateQuerySuggestionsConfigResult> asyncHandler) {
        final UpdateQuerySuggestionsConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuerySuggestionsConfigResult>() {
            @Override
            public UpdateQuerySuggestionsConfigResult call() throws Exception {
                UpdateQuerySuggestionsConfigResult result = null;

                try {
                    result = executeUpdateQuerySuggestionsConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(UpdateThesaurusRequest request) {

        return updateThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(final UpdateThesaurusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThesaurusRequest, UpdateThesaurusResult> asyncHandler) {
        final UpdateThesaurusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThesaurusResult>() {
            @Override
            public UpdateThesaurusResult call() throws Exception {
                UpdateThesaurusResult result = null;

                try {
                    result = executeUpdateThesaurus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
