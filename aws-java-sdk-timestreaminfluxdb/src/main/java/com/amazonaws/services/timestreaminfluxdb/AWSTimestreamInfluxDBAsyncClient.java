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
package com.amazonaws.services.timestreaminfluxdb;

import javax.annotation.Generated;

import com.amazonaws.services.timestreaminfluxdb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Timestream InfluxDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Timestream for InfluxDB is a managed time-series database engine that makes it easy for application developers
 * and DevOps teams to run InfluxDB databases on AWS for near real-time time-series applications using open-source APIs.
 * With Amazon Timestream for InfluxDB, it is easy to set up, operate, and scale time-series workloads that can answer
 * queries with single-digit millisecond query response time.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTimestreamInfluxDBAsyncClient extends AWSTimestreamInfluxDBClient implements AWSTimestreamInfluxDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSTimestreamInfluxDBAsyncClientBuilder asyncBuilder() {
        return AWSTimestreamInfluxDBAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream InfluxDB using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSTimestreamInfluxDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Timestream InfluxDB using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSTimestreamInfluxDBAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(CreateDbInstanceRequest request) {

        return createDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(final CreateDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDbInstanceRequest, CreateDbInstanceResult> asyncHandler) {
        final CreateDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDbInstanceResult>() {
            @Override
            public CreateDbInstanceResult call() throws Exception {
                CreateDbInstanceResult result = null;

                try {
                    result = executeCreateDbInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(CreateDbParameterGroupRequest request) {

        return createDbParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(final CreateDbParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDbParameterGroupRequest, CreateDbParameterGroupResult> asyncHandler) {
        final CreateDbParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDbParameterGroupResult>() {
            @Override
            public CreateDbParameterGroupResult call() throws Exception {
                CreateDbParameterGroupResult result = null;

                try {
                    result = executeCreateDbParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(DeleteDbInstanceRequest request) {

        return deleteDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(final DeleteDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDbInstanceRequest, DeleteDbInstanceResult> asyncHandler) {
        final DeleteDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDbInstanceResult>() {
            @Override
            public DeleteDbInstanceResult call() throws Exception {
                DeleteDbInstanceResult result = null;

                try {
                    result = executeDeleteDbInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(GetDbInstanceRequest request) {

        return getDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(final GetDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDbInstanceRequest, GetDbInstanceResult> asyncHandler) {
        final GetDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDbInstanceResult>() {
            @Override
            public GetDbInstanceResult call() throws Exception {
                GetDbInstanceResult result = null;

                try {
                    result = executeGetDbInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(GetDbParameterGroupRequest request) {

        return getDbParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(final GetDbParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDbParameterGroupRequest, GetDbParameterGroupResult> asyncHandler) {
        final GetDbParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDbParameterGroupResult>() {
            @Override
            public GetDbParameterGroupResult call() throws Exception {
                GetDbParameterGroupResult result = null;

                try {
                    result = executeGetDbParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(ListDbInstancesRequest request) {

        return listDbInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(final ListDbInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDbInstancesRequest, ListDbInstancesResult> asyncHandler) {
        final ListDbInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDbInstancesResult>() {
            @Override
            public ListDbInstancesResult call() throws Exception {
                ListDbInstancesResult result = null;

                try {
                    result = executeListDbInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(ListDbParameterGroupsRequest request) {

        return listDbParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(final ListDbParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDbParameterGroupsRequest, ListDbParameterGroupsResult> asyncHandler) {
        final ListDbParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDbParameterGroupsResult>() {
            @Override
            public ListDbParameterGroupsResult call() throws Exception {
                ListDbParameterGroupsResult result = null;

                try {
                    result = executeListDbParameterGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(UpdateDbInstanceRequest request) {

        return updateDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(final UpdateDbInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDbInstanceRequest, UpdateDbInstanceResult> asyncHandler) {
        final UpdateDbInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDbInstanceResult>() {
            @Override
            public UpdateDbInstanceResult call() throws Exception {
                UpdateDbInstanceResult result = null;

                try {
                    result = executeUpdateDbInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
