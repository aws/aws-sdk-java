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
package com.amazonaws.services.timestreamwrite;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Timestream Write asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Timestream is a fast, scalable, fully managed time series database service that makes it easy to store and
 * analyze trillions of time series data points per day. With Timestream, you can easily store and analyze IoT sensor
 * data to derive insights from your IoT applications. You can analyze industrial telemetry to streamline equipment
 * management and maintenance. You can also store and analyze log data and metrics to improve the performance and
 * availability of your applications. Timestream is built from the ground up to effectively ingest, process, and store
 * time series data. It organizes data to optimize query processing. It automatically scales based on the volume of data
 * ingested and on the query volume to ensure you receive optimal performance while inserting and querying data. As your
 * data grows over time, Timestream’s adaptive query processing engine spans across storage tiers to provide fast
 * analysis while reducing costs.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamWriteAsyncClient extends AmazonTimestreamWriteClient implements AmazonTimestreamWriteAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonTimestreamWriteAsyncClientBuilder asyncBuilder() {
        return AmazonTimestreamWriteAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream Write using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamWriteAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream Write using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonTimestreamWriteAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest request) {

        return createDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(final CreateDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResult> asyncHandler) {
        final CreateDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatabaseResult>() {
            @Override
            public CreateDatabaseResult call() throws Exception {
                CreateDatabaseResult result = null;

                try {
                    result = executeCreateDatabase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest request) {

        return deleteDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(final DeleteDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResult> asyncHandler) {
        final DeleteDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatabaseResult>() {
            @Override
            public DeleteDatabaseResult call() throws Exception {
                DeleteDatabaseResult result = null;

                try {
                    result = executeDeleteDatabase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(DescribeDatabaseRequest request) {

        return describeDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(final DescribeDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatabaseRequest, DescribeDatabaseResult> asyncHandler) {
        final DescribeDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatabaseResult>() {
            @Override
            public DescribeDatabaseResult call() throws Exception {
                DescribeDatabaseResult result = null;

                try {
                    result = executeDescribeDatabase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {
        final DescribeEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointsResult>() {
            @Override
            public DescribeEndpointsResult call() throws Exception {
                DescribeEndpointsResult result = null;

                try {
                    result = executeDescribeEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request) {

        return describeTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(final DescribeTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {
        final DescribeTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableResult>() {
            @Override
            public DescribeTableResult call() throws Exception {
                DescribeTableResult result = null;

                try {
                    result = executeDescribeTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(final ListDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {
        final ListDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatabasesResult>() {
            @Override
            public ListDatabasesResult call() throws Exception {
                ListDatabasesResult result = null;

                try {
                    result = executeListDatabases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest request) {

        return updateDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(final UpdateDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResult> asyncHandler) {
        final UpdateDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatabaseResult>() {
            @Override
            public UpdateDatabaseResult call() throws Exception {
                UpdateDatabaseResult result = null;

                try {
                    result = executeUpdateDatabase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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

    @Override
    public java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(WriteRecordsRequest request) {

        return writeRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(final WriteRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<WriteRecordsRequest, WriteRecordsResult> asyncHandler) {
        final WriteRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<WriteRecordsResult>() {
            @Override
            public WriteRecordsResult call() throws Exception {
                WriteRecordsResult result = null;

                try {
                    result = executeWriteRecords(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
