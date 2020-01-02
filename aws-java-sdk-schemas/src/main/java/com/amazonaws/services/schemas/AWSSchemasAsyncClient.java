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
package com.amazonaws.services.schemas;

import javax.annotation.Generated;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Schemas asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS EventBridge Schemas
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSchemasAsyncClient extends AWSSchemasClient implements AWSSchemasAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSchemasAsyncClientBuilder asyncBuilder() {
        return AWSSchemasAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Schemas using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSchemasAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateDiscovererResult> createDiscovererAsync(CreateDiscovererRequest request) {

        return createDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDiscovererResult> createDiscovererAsync(final CreateDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDiscovererRequest, CreateDiscovererResult> asyncHandler) {
        final CreateDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDiscovererResult>() {
            @Override
            public CreateDiscovererResult call() throws Exception {
                CreateDiscovererResult result = null;

                try {
                    result = executeCreateDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(CreateRegistryRequest request) {

        return createRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(final CreateRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistryRequest, CreateRegistryResult> asyncHandler) {
        final CreateRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistryResult>() {
            @Override
            public CreateRegistryResult call() throws Exception {
                CreateRegistryResult result = null;

                try {
                    result = executeCreateRegistry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(final CreateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {
        final CreateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaResult>() {
            @Override
            public CreateSchemaResult call() throws Exception {
                CreateSchemaResult result = null;

                try {
                    result = executeCreateSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscovererResult> deleteDiscovererAsync(DeleteDiscovererRequest request) {

        return deleteDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscovererResult> deleteDiscovererAsync(final DeleteDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDiscovererRequest, DeleteDiscovererResult> asyncHandler) {
        final DeleteDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDiscovererResult>() {
            @Override
            public DeleteDiscovererResult call() throws Exception {
                DeleteDiscovererResult result = null;

                try {
                    result = executeDeleteDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(DeleteRegistryRequest request) {

        return deleteRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(final DeleteRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistryRequest, DeleteRegistryResult> asyncHandler) {
        final DeleteRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistryResult>() {
            @Override
            public DeleteRegistryResult call() throws Exception {
                DeleteRegistryResult result = null;

                try {
                    result = executeDeleteRegistry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(final DeleteSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {
        final DeleteSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaResult>() {
            @Override
            public DeleteSchemaResult call() throws Exception {
                DeleteSchemaResult result = null;

                try {
                    result = executeDeleteSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaVersionResult> deleteSchemaVersionAsync(DeleteSchemaVersionRequest request) {

        return deleteSchemaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaVersionResult> deleteSchemaVersionAsync(final DeleteSchemaVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaVersionRequest, DeleteSchemaVersionResult> asyncHandler) {
        final DeleteSchemaVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaVersionResult>() {
            @Override
            public DeleteSchemaVersionResult call() throws Exception {
                DeleteSchemaVersionResult result = null;

                try {
                    result = executeDeleteSchemaVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeBindingResult> describeCodeBindingAsync(DescribeCodeBindingRequest request) {

        return describeCodeBindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeBindingResult> describeCodeBindingAsync(final DescribeCodeBindingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCodeBindingRequest, DescribeCodeBindingResult> asyncHandler) {
        final DescribeCodeBindingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCodeBindingResult>() {
            @Override
            public DescribeCodeBindingResult call() throws Exception {
                DescribeCodeBindingResult result = null;

                try {
                    result = executeDescribeCodeBinding(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDiscovererResult> describeDiscovererAsync(DescribeDiscovererRequest request) {

        return describeDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDiscovererResult> describeDiscovererAsync(final DescribeDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDiscovererRequest, DescribeDiscovererResult> asyncHandler) {
        final DescribeDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDiscovererResult>() {
            @Override
            public DescribeDiscovererResult call() throws Exception {
                DescribeDiscovererResult result = null;

                try {
                    result = executeDescribeDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistryResult> describeRegistryAsync(DescribeRegistryRequest request) {

        return describeRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistryResult> describeRegistryAsync(final DescribeRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistryRequest, DescribeRegistryResult> asyncHandler) {
        final DescribeRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistryResult>() {
            @Override
            public DescribeRegistryResult call() throws Exception {
                DescribeRegistryResult result = null;

                try {
                    result = executeDescribeRegistry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest request) {

        return describeSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(final DescribeSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSchemaRequest, DescribeSchemaResult> asyncHandler) {
        final DescribeSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSchemaResult>() {
            @Override
            public DescribeSchemaResult call() throws Exception {
                DescribeSchemaResult result = null;

                try {
                    result = executeDescribeSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCodeBindingSourceResult> getCodeBindingSourceAsync(GetCodeBindingSourceRequest request) {

        return getCodeBindingSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCodeBindingSourceResult> getCodeBindingSourceAsync(final GetCodeBindingSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCodeBindingSourceRequest, GetCodeBindingSourceResult> asyncHandler) {
        final GetCodeBindingSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCodeBindingSourceResult>() {
            @Override
            public GetCodeBindingSourceResult call() throws Exception {
                GetCodeBindingSourceResult result = null;

                try {
                    result = executeGetCodeBindingSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredSchemaResult> getDiscoveredSchemaAsync(GetDiscoveredSchemaRequest request) {

        return getDiscoveredSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredSchemaResult> getDiscoveredSchemaAsync(final GetDiscoveredSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiscoveredSchemaRequest, GetDiscoveredSchemaResult> asyncHandler) {
        final GetDiscoveredSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiscoveredSchemaResult>() {
            @Override
            public GetDiscoveredSchemaResult call() throws Exception {
                GetDiscoveredSchemaResult result = null;

                try {
                    result = executeGetDiscoveredSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDiscoverersResult> listDiscoverersAsync(ListDiscoverersRequest request) {

        return listDiscoverersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoverersResult> listDiscoverersAsync(final ListDiscoverersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDiscoverersRequest, ListDiscoverersResult> asyncHandler) {
        final ListDiscoverersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDiscoverersResult>() {
            @Override
            public ListDiscoverersResult call() throws Exception {
                ListDiscoverersResult result = null;

                try {
                    result = executeListDiscoverers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(ListRegistriesRequest request) {

        return listRegistriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(final ListRegistriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegistriesRequest, ListRegistriesResult> asyncHandler) {
        final ListRegistriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegistriesResult>() {
            @Override
            public ListRegistriesResult call() throws Exception {
                ListRegistriesResult result = null;

                try {
                    result = executeListRegistries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(ListSchemaVersionsRequest request) {

        return listSchemaVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(final ListSchemaVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemaVersionsRequest, ListSchemaVersionsResult> asyncHandler) {
        final ListSchemaVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemaVersionsResult>() {
            @Override
            public ListSchemaVersionsResult call() throws Exception {
                ListSchemaVersionsResult result = null;

                try {
                    result = executeListSchemaVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(final ListSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {
        final ListSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemasResult>() {
            @Override
            public ListSchemasResult call() throws Exception {
                ListSchemasResult result = null;

                try {
                    result = executeListSchemas(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<LockServiceLinkedRoleResult> lockServiceLinkedRoleAsync(LockServiceLinkedRoleRequest request) {

        return lockServiceLinkedRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LockServiceLinkedRoleResult> lockServiceLinkedRoleAsync(final LockServiceLinkedRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<LockServiceLinkedRoleRequest, LockServiceLinkedRoleResult> asyncHandler) {
        final LockServiceLinkedRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LockServiceLinkedRoleResult>() {
            @Override
            public LockServiceLinkedRoleResult call() throws Exception {
                LockServiceLinkedRoleResult result = null;

                try {
                    result = executeLockServiceLinkedRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutCodeBindingResult> putCodeBindingAsync(PutCodeBindingRequest request) {

        return putCodeBindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCodeBindingResult> putCodeBindingAsync(final PutCodeBindingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutCodeBindingRequest, PutCodeBindingResult> asyncHandler) {
        final PutCodeBindingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutCodeBindingResult>() {
            @Override
            public PutCodeBindingResult call() throws Exception {
                PutCodeBindingResult result = null;

                try {
                    result = executePutCodeBinding(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchSchemasResult> searchSchemasAsync(SearchSchemasRequest request) {

        return searchSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSchemasResult> searchSchemasAsync(final SearchSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSchemasRequest, SearchSchemasResult> asyncHandler) {
        final SearchSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSchemasResult>() {
            @Override
            public SearchSchemasResult call() throws Exception {
                SearchSchemasResult result = null;

                try {
                    result = executeSearchSchemas(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDiscovererResult> startDiscovererAsync(StartDiscovererRequest request) {

        return startDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDiscovererResult> startDiscovererAsync(final StartDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDiscovererRequest, StartDiscovererResult> asyncHandler) {
        final StartDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDiscovererResult>() {
            @Override
            public StartDiscovererResult call() throws Exception {
                StartDiscovererResult result = null;

                try {
                    result = executeStartDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDiscovererResult> stopDiscovererAsync(StopDiscovererRequest request) {

        return stopDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDiscovererResult> stopDiscovererAsync(final StopDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDiscovererRequest, StopDiscovererResult> asyncHandler) {
        final StopDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDiscovererResult>() {
            @Override
            public StopDiscovererResult call() throws Exception {
                StopDiscovererResult result = null;

                try {
                    result = executeStopDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UnlockServiceLinkedRoleResult> unlockServiceLinkedRoleAsync(UnlockServiceLinkedRoleRequest request) {

        return unlockServiceLinkedRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnlockServiceLinkedRoleResult> unlockServiceLinkedRoleAsync(final UnlockServiceLinkedRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnlockServiceLinkedRoleRequest, UnlockServiceLinkedRoleResult> asyncHandler) {
        final UnlockServiceLinkedRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnlockServiceLinkedRoleResult>() {
            @Override
            public UnlockServiceLinkedRoleResult call() throws Exception {
                UnlockServiceLinkedRoleResult result = null;

                try {
                    result = executeUnlockServiceLinkedRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDiscovererResult> updateDiscovererAsync(UpdateDiscovererRequest request) {

        return updateDiscovererAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDiscovererResult> updateDiscovererAsync(final UpdateDiscovererRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDiscovererRequest, UpdateDiscovererResult> asyncHandler) {
        final UpdateDiscovererRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDiscovererResult>() {
            @Override
            public UpdateDiscovererResult call() throws Exception {
                UpdateDiscovererResult result = null;

                try {
                    result = executeUpdateDiscoverer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(UpdateRegistryRequest request) {

        return updateRegistryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(final UpdateRegistryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRegistryRequest, UpdateRegistryResult> asyncHandler) {
        final UpdateRegistryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRegistryResult>() {
            @Override
            public UpdateRegistryResult call() throws Exception {
                UpdateRegistryResult result = null;

                try {
                    result = executeUpdateRegistry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest request) {

        return updateSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(final UpdateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler) {
        final UpdateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSchemaResult>() {
            @Override
            public UpdateSchemaResult call() throws Exception {
                UpdateSchemaResult result = null;

                try {
                    result = executeUpdateSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
