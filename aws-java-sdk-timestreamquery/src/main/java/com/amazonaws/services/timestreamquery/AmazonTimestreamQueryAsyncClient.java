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
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Timestream Query asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Timestream Query </fullname>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamQueryAsyncClient extends AmazonTimestreamQueryClient implements AmazonTimestreamQueryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonTimestreamQueryAsyncClientBuilder asyncBuilder() {
        return AmazonTimestreamQueryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream Query using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamQueryAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream Query using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonTimestreamQueryAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request) {

        return cancelQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(final CancelQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler) {
        final CancelQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelQueryResult>() {
            @Override
            public CancelQueryResult call() throws Exception {
                CancelQueryResult result = null;

                try {
                    result = executeCancelQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(CreateScheduledQueryRequest request) {

        return createScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(final CreateScheduledQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScheduledQueryRequest, CreateScheduledQueryResult> asyncHandler) {
        final CreateScheduledQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScheduledQueryResult>() {
            @Override
            public CreateScheduledQueryResult call() throws Exception {
                CreateScheduledQueryResult result = null;

                try {
                    result = executeCreateScheduledQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(DeleteScheduledQueryRequest request) {

        return deleteScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(final DeleteScheduledQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduledQueryRequest, DeleteScheduledQueryResult> asyncHandler) {
        final DeleteScheduledQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScheduledQueryResult>() {
            @Override
            public DeleteScheduledQueryResult call() throws Exception {
                DeleteScheduledQueryResult result = null;

                try {
                    result = executeDeleteScheduledQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(DescribeScheduledQueryRequest request) {

        return describeScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(final DescribeScheduledQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledQueryRequest, DescribeScheduledQueryResult> asyncHandler) {
        final DescribeScheduledQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledQueryResult>() {
            @Override
            public DescribeScheduledQueryResult call() throws Exception {
                DescribeScheduledQueryResult result = null;

                try {
                    result = executeDescribeScheduledQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(ExecuteScheduledQueryRequest request) {

        return executeScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(final ExecuteScheduledQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteScheduledQueryRequest, ExecuteScheduledQueryResult> asyncHandler) {
        final ExecuteScheduledQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteScheduledQueryResult>() {
            @Override
            public ExecuteScheduledQueryResult call() throws Exception {
                ExecuteScheduledQueryResult result = null;

                try {
                    result = executeExecuteScheduledQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(ListScheduledQueriesRequest request) {

        return listScheduledQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(final ListScheduledQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScheduledQueriesRequest, ListScheduledQueriesResult> asyncHandler) {
        final ListScheduledQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScheduledQueriesResult>() {
            @Override
            public ListScheduledQueriesResult call() throws Exception {
                ListScheduledQueriesResult result = null;

                try {
                    result = executeListScheduledQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(PrepareQueryRequest request) {

        return prepareQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(final PrepareQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<PrepareQueryRequest, PrepareQueryResult> asyncHandler) {
        final PrepareQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PrepareQueryResult>() {
            @Override
            public PrepareQueryResult call() throws Exception {
                PrepareQueryResult result = null;

                try {
                    result = executePrepareQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(UpdateScheduledQueryRequest request) {

        return updateScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(final UpdateScheduledQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateScheduledQueryRequest, UpdateScheduledQueryResult> asyncHandler) {
        final UpdateScheduledQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateScheduledQueryResult>() {
            @Override
            public UpdateScheduledQueryResult call() throws Exception {
                UpdateScheduledQueryResult result = null;

                try {
                    result = executeUpdateScheduledQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
