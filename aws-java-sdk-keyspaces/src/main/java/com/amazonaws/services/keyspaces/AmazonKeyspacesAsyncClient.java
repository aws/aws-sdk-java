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
package com.amazonaws.services.keyspaces;

import javax.annotation.Generated;

import com.amazonaws.services.keyspaces.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Keyspaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Keyspaces (for Apache Cassandra) is a scalable, highly available, and managed Apache Cassandra-compatible
 * database service. Amazon Keyspaces makes it easy to migrate, run, and scale Cassandra workloads in the Amazon Web
 * Services Cloud. With just a few clicks on the Amazon Web Services Management Console or a few lines of code, you can
 * create keyspaces and tables in Amazon Keyspaces, without deploying any infrastructure or installing software.
 * </p>
 * <p>
 * In addition to supporting Cassandra Query Language (CQL) requests via open-source Cassandra drivers, Amazon Keyspaces
 * supports data definition language (DDL) operations to manage keyspaces and tables using the Amazon Web Services SDK
 * and CLI. This API reference describes the supported DDL operations in detail.
 * </p>
 * <p>
 * For the list of all supported CQL APIs, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cassandra-apis.html">Supported Cassandra APIs,
 * operations, and data types in Amazon Keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * To learn how Amazon Keyspaces API actions are recorded with CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/keyspaces/latest/devguide/logging-using-cloudtrail.html#service-name-info-in-cloudtrail"
 * >Amazon Keyspaces information in CloudTrail</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * For more information about Amazon Web Services APIs, for example how to implement retry logic or how to sign Amazon
 * Web Services API requests, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">Amazon Web
 * Services APIs</a> in the <i>General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKeyspacesAsyncClient extends AmazonKeyspacesClient implements AmazonKeyspacesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKeyspacesAsyncClientBuilder asyncBuilder() {
        return AmazonKeyspacesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Keyspaces using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKeyspacesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Keyspaces using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonKeyspacesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(CreateKeyspaceRequest request) {

        return createKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(final CreateKeyspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyspaceRequest, CreateKeyspaceResult> asyncHandler) {
        final CreateKeyspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyspaceResult>() {
            @Override
            public CreateKeyspaceResult call() throws Exception {
                CreateKeyspaceResult result = null;

                try {
                    result = executeCreateKeyspace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(final CreateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {
        final CreateTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTableResult>() {
            @Override
            public CreateTableResult call() throws Exception {
                CreateTableResult result = null;

                try {
                    result = executeCreateTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(DeleteKeyspaceRequest request) {

        return deleteKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(final DeleteKeyspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyspaceRequest, DeleteKeyspaceResult> asyncHandler) {
        final DeleteKeyspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyspaceResult>() {
            @Override
            public DeleteKeyspaceResult call() throws Exception {
                DeleteKeyspaceResult result = null;

                try {
                    result = executeDeleteKeyspace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {
        final DeleteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTableResult>() {
            @Override
            public DeleteTableResult call() throws Exception {
                DeleteTableResult result = null;

                try {
                    result = executeDeleteTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(GetKeyspaceRequest request) {

        return getKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(final GetKeyspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyspaceRequest, GetKeyspaceResult> asyncHandler) {
        final GetKeyspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyspaceResult>() {
            @Override
            public GetKeyspaceResult call() throws Exception {
                GetKeyspaceResult result = null;

                try {
                    result = executeGetKeyspace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(ListKeyspacesRequest request) {

        return listKeyspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(final ListKeyspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeyspacesRequest, ListKeyspacesResult> asyncHandler) {
        final ListKeyspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeyspacesResult>() {
            @Override
            public ListKeyspacesResult call() throws Exception {
                ListKeyspacesResult result = null;

                try {
                    result = executeListKeyspaces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(RestoreTableRequest request) {

        return restoreTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(final RestoreTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreTableRequest, RestoreTableResult> asyncHandler) {
        final RestoreTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreTableResult>() {
            @Override
            public RestoreTableResult call() throws Exception {
                RestoreTableResult result = null;

                try {
                    result = executeRestoreTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {
        final UpdateTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTableResult>() {
            @Override
            public UpdateTableResult call() throws Exception {
                UpdateTableResult result = null;

                try {
                    result = executeUpdateTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
