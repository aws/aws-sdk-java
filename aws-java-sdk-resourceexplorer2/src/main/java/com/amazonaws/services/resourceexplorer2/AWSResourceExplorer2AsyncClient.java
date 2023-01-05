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
package com.amazonaws.services.resourceexplorer2;

import javax.annotation.Generated;

import com.amazonaws.services.resourceexplorer2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Resource Explorer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Resource Explorer is a resource search and discovery service. By using Resource Explorer, you can
 * explore your resources using an internet search engine-like experience. Examples of resources include Amazon
 * Relational Database Service (Amazon RDS) instances, Amazon Simple Storage Service (Amazon S3) buckets, or Amazon
 * DynamoDB tables. You can search for your resources using resource metadata like names, tags, and IDs. Resource
 * Explorer can search across all of the Amazon Web Services Regions in your account in which you turn the service on,
 * to simplify your cross-Region workloads.
 * </p>
 * <p>
 * Resource Explorer scans the resources in each of the Amazon Web Services Regions in your Amazon Web Services account
 * in which you turn on Resource Explorer. Resource Explorer <a href=
 * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/getting-started-terms-and-concepts.html#term-index"
 * >creates and maintains an index</a> in each Region, with the details of that Region's resources.
 * </p>
 * <p>
 * You can <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">search
 * across all of the indexed Regions in your account</a> by designating one of your Amazon Web Services Regions to
 * contain the aggregator index for the account. When you <a
 * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region-turn-on.html">promote a
 * local index in a Region to become the aggregator index for the account</a>, Resource Explorer automatically
 * replicates the index information from all local indexes in the other Regions to the aggregator index. Therefore, the
 * Region with the aggregator index has a copy of all resource information for all Regions in the account where you
 * turned on Resource Explorer. As a result, views in the aggregator index Region include resources from all of the
 * indexed Regions in your account.
 * </p>
 * <p>
 * For more information about Amazon Web Services Resource Explorer, including how to enable and configure the service,
 * see the <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/">Amazon Web Services Resource
 * Explorer User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceExplorer2AsyncClient extends AWSResourceExplorer2Client implements AWSResourceExplorer2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSResourceExplorer2AsyncClientBuilder asyncBuilder() {
        return AWSResourceExplorer2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resource Explorer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSResourceExplorer2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resource Explorer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSResourceExplorer2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateDefaultViewResult> associateDefaultViewAsync(AssociateDefaultViewRequest request) {

        return associateDefaultViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDefaultViewResult> associateDefaultViewAsync(final AssociateDefaultViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDefaultViewRequest, AssociateDefaultViewResult> asyncHandler) {
        final AssociateDefaultViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDefaultViewResult>() {
            @Override
            public AssociateDefaultViewResult call() throws Exception {
                AssociateDefaultViewResult result = null;

                try {
                    result = executeAssociateDefaultView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetViewResult> batchGetViewAsync(BatchGetViewRequest request) {

        return batchGetViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetViewResult> batchGetViewAsync(final BatchGetViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetViewRequest, BatchGetViewResult> asyncHandler) {
        final BatchGetViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetViewResult>() {
            @Override
            public BatchGetViewResult call() throws Exception {
                BatchGetViewResult result = null;

                try {
                    result = executeBatchGetView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateViewResult> createViewAsync(CreateViewRequest request) {

        return createViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateViewResult> createViewAsync(final CreateViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateViewRequest, CreateViewResult> asyncHandler) {
        final CreateViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateViewResult>() {
            @Override
            public CreateViewResult call() throws Exception {
                CreateViewResult result = null;

                try {
                    result = executeCreateView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(DeleteViewRequest request) {

        return deleteViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(final DeleteViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteViewRequest, DeleteViewResult> asyncHandler) {
        final DeleteViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteViewResult>() {
            @Override
            public DeleteViewResult call() throws Exception {
                DeleteViewResult result = null;

                try {
                    result = executeDeleteView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateDefaultViewResult> disassociateDefaultViewAsync(DisassociateDefaultViewRequest request) {

        return disassociateDefaultViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDefaultViewResult> disassociateDefaultViewAsync(final DisassociateDefaultViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDefaultViewRequest, DisassociateDefaultViewResult> asyncHandler) {
        final DisassociateDefaultViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDefaultViewResult>() {
            @Override
            public DisassociateDefaultViewResult call() throws Exception {
                DisassociateDefaultViewResult result = null;

                try {
                    result = executeDisassociateDefaultView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDefaultViewResult> getDefaultViewAsync(GetDefaultViewRequest request) {

        return getDefaultViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDefaultViewResult> getDefaultViewAsync(final GetDefaultViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDefaultViewRequest, GetDefaultViewResult> asyncHandler) {
        final GetDefaultViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDefaultViewResult>() {
            @Override
            public GetDefaultViewResult call() throws Exception {
                GetDefaultViewResult result = null;

                try {
                    result = executeGetDefaultView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest request) {

        return getIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIndexResult> getIndexAsync(final GetIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIndexRequest, GetIndexResult> asyncHandler) {
        final GetIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIndexResult>() {
            @Override
            public GetIndexResult call() throws Exception {
                GetIndexResult result = null;

                try {
                    result = executeGetIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetViewResult> getViewAsync(GetViewRequest request) {

        return getViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetViewResult> getViewAsync(final GetViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetViewRequest, GetViewResult> asyncHandler) {
        final GetViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetViewResult>() {
            @Override
            public GetViewResult call() throws Exception {
                GetViewResult result = null;

                try {
                    result = executeGetView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIndexesResult> listIndexesAsync(ListIndexesRequest request) {

        return listIndexesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndexesResult> listIndexesAsync(final ListIndexesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndexesRequest, ListIndexesResult> asyncHandler) {
        final ListIndexesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIndexesResult>() {
            @Override
            public ListIndexesResult call() throws Exception {
                ListIndexesResult result = null;

                try {
                    result = executeListIndexes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSupportedResourceTypesResult> listSupportedResourceTypesAsync(ListSupportedResourceTypesRequest request) {

        return listSupportedResourceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedResourceTypesResult> listSupportedResourceTypesAsync(final ListSupportedResourceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSupportedResourceTypesRequest, ListSupportedResourceTypesResult> asyncHandler) {
        final ListSupportedResourceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSupportedResourceTypesResult>() {
            @Override
            public ListSupportedResourceTypesResult call() throws Exception {
                ListSupportedResourceTypesResult result = null;

                try {
                    result = executeListSupportedResourceTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListViewsResult> listViewsAsync(ListViewsRequest request) {

        return listViewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListViewsResult> listViewsAsync(final ListViewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListViewsRequest, ListViewsResult> asyncHandler) {
        final ListViewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListViewsResult>() {
            @Override
            public ListViewsResult call() throws Exception {
                ListViewsResult result = null;

                try {
                    result = executeListViews(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request) {

        return searchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(final SearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler) {
        final SearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResult>() {
            @Override
            public SearchResult call() throws Exception {
                SearchResult result = null;

                try {
                    result = executeSearch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateIndexTypeResult> updateIndexTypeAsync(UpdateIndexTypeRequest request) {

        return updateIndexTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexTypeResult> updateIndexTypeAsync(final UpdateIndexTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIndexTypeRequest, UpdateIndexTypeResult> asyncHandler) {
        final UpdateIndexTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIndexTypeResult>() {
            @Override
            public UpdateIndexTypeResult call() throws Exception {
                UpdateIndexTypeResult result = null;

                try {
                    result = executeUpdateIndexType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateViewResult> updateViewAsync(UpdateViewRequest request) {

        return updateViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateViewResult> updateViewAsync(final UpdateViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateViewRequest, UpdateViewResult> asyncHandler) {
        final UpdateViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateViewResult>() {
            @Override
            public UpdateViewResult call() throws Exception {
                UpdateViewResult result = null;

                try {
                    result = executeUpdateView(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
