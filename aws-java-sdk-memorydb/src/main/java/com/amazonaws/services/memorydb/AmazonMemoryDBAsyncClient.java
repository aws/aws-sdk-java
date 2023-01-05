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
package com.amazonaws.services.memorydb;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon MemoryDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * MemoryDB for Redis is a fully managed, Redis-compatible, in-memory database that delivers ultra-fast performance and
 * Multi-AZ durability for modern applications built using microservices architectures. MemoryDB stores the entire
 * database in-memory, enabling low latency and high throughput data access. It is compatible with Redis, a popular open
 * source data store, enabling you to leverage Redis’ flexible and friendly data structures, APIs, and commands.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMemoryDBAsyncClient extends AmazonMemoryDBClient implements AmazonMemoryDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonMemoryDBAsyncClientBuilder asyncBuilder() {
        return AmazonMemoryDBAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon MemoryDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonMemoryDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon MemoryDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonMemoryDBAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(BatchUpdateClusterRequest request) {

        return batchUpdateClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(final BatchUpdateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateClusterRequest, BatchUpdateClusterResult> asyncHandler) {
        final BatchUpdateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateClusterResult>() {
            @Override
            public BatchUpdateClusterResult call() throws Exception {
                BatchUpdateClusterResult result = null;

                try {
                    result = executeBatchUpdateCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(final CopySnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {
        final CopySnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopySnapshotResult>() {
            @Override
            public CopySnapshotResult call() throws Exception {
                CopySnapshotResult result = null;

                try {
                    result = executeCopySnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateACLResult> createACLAsync(CreateACLRequest request) {

        return createACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateACLResult> createACLAsync(final CreateACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateACLRequest, CreateACLResult> asyncHandler) {
        final CreateACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateACLResult>() {
            @Override
            public CreateACLResult call() throws Exception {
                CreateACLResult result = null;

                try {
                    result = executeCreateACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterResult>() {
            @Override
            public CreateClusterResult call() throws Exception {
                CreateClusterResult result = null;

                try {
                    result = executeCreateCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest request) {

        return createParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(final CreateParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateParameterGroupRequest, CreateParameterGroupResult> asyncHandler) {
        final CreateParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateParameterGroupResult>() {
            @Override
            public CreateParameterGroupResult call() throws Exception {
                CreateParameterGroupResult result = null;

                try {
                    result = executeCreateParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest request) {

        return createSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(final CreateSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubnetGroupRequest, CreateSubnetGroupResult> asyncHandler) {
        final CreateSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubnetGroupResult>() {
            @Override
            public CreateSubnetGroupResult call() throws Exception {
                CreateSubnetGroupResult result = null;

                try {
                    result = executeCreateSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(DeleteACLRequest request) {

        return deleteACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(final DeleteACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteACLRequest, DeleteACLResult> asyncHandler) {
        final DeleteACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteACLResult>() {
            @Override
            public DeleteACLResult call() throws Exception {
                DeleteACLResult result = null;

                try {
                    result = executeDeleteACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterResult>() {
            @Override
            public DeleteClusterResult call() throws Exception {
                DeleteClusterResult result = null;

                try {
                    result = executeDeleteCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest request) {

        return deleteParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(final DeleteParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteParameterGroupRequest, DeleteParameterGroupResult> asyncHandler) {
        final DeleteParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteParameterGroupResult>() {
            @Override
            public DeleteParameterGroupResult call() throws Exception {
                DeleteParameterGroupResult result = null;

                try {
                    result = executeDeleteParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {
        final DeleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result = null;

                try {
                    result = executeDeleteSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest request) {

        return deleteSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(final DeleteSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubnetGroupRequest, DeleteSubnetGroupResult> asyncHandler) {
        final DeleteSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubnetGroupResult>() {
            @Override
            public DeleteSubnetGroupResult call() throws Exception {
                DeleteSubnetGroupResult result = null;

                try {
                    result = executeDeleteSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(DescribeACLsRequest request) {

        return describeACLsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(final DescribeACLsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeACLsRequest, DescribeACLsResult> asyncHandler) {
        final DescribeACLsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeACLsResult>() {
            @Override
            public DescribeACLsResult call() throws Exception {
                DescribeACLsResult result = null;

                try {
                    result = executeDescribeACLs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request) {

        return describeClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(final DescribeClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {
        final DescribeClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClustersResult>() {
            @Override
            public DescribeClustersResult call() throws Exception {
                DescribeClustersResult result = null;

                try {
                    result = executeDescribeClusters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest request) {

        return describeEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(final DescribeEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineVersionsRequest, DescribeEngineVersionsResult> asyncHandler) {
        final DescribeEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEngineVersionsResult>() {
            @Override
            public DescribeEngineVersionsResult call() throws Exception {
                DescribeEngineVersionsResult result = null;

                try {
                    result = executeDescribeEngineVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {
        final DescribeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result = null;

                try {
                    result = executeDescribeEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest request) {

        return describeParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(final DescribeParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeParameterGroupsRequest, DescribeParameterGroupsResult> asyncHandler) {
        final DescribeParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeParameterGroupsResult>() {
            @Override
            public DescribeParameterGroupsResult call() throws Exception {
                DescribeParameterGroupsResult result = null;

                try {
                    result = executeDescribeParameterGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest request) {

        return describeParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(final DescribeParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler) {
        final DescribeParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeParametersResult>() {
            @Override
            public DescribeParametersResult call() throws Exception {
                DescribeParametersResult result = null;

                try {
                    result = executeDescribeParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request) {

        return describeReservedNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(final DescribeReservedNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {
        final DescribeReservedNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodesResult>() {
            @Override
            public DescribeReservedNodesResult call() throws Exception {
                DescribeReservedNodesResult result = null;

                try {
                    result = executeDescribeReservedNodes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(DescribeReservedNodesOfferingsRequest request) {

        return describeReservedNodesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(
            final DescribeReservedNodesOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesOfferingsRequest, DescribeReservedNodesOfferingsResult> asyncHandler) {
        final DescribeReservedNodesOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodesOfferingsResult>() {
            @Override
            public DescribeReservedNodesOfferingsResult call() throws Exception {
                DescribeReservedNodesOfferingsResult result = null;

                try {
                    result = executeDescribeReservedNodesOfferings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(DescribeServiceUpdatesRequest request) {

        return describeServiceUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(final DescribeServiceUpdatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServiceUpdatesRequest, DescribeServiceUpdatesResult> asyncHandler) {
        final DescribeServiceUpdatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServiceUpdatesResult>() {
            @Override
            public DescribeServiceUpdatesResult call() throws Exception {
                DescribeServiceUpdatesResult result = null;

                try {
                    result = executeDescribeServiceUpdates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {
        final DescribeSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
            @Override
            public DescribeSnapshotsResult call() throws Exception {
                DescribeSnapshotsResult result = null;

                try {
                    result = executeDescribeSnapshots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest request) {

        return describeSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(final DescribeSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubnetGroupsRequest, DescribeSubnetGroupsResult> asyncHandler) {
        final DescribeSubnetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubnetGroupsResult>() {
            @Override
            public DescribeSubnetGroupsResult call() throws Exception {
                DescribeSubnetGroupsResult result = null;

                try {
                    result = executeDescribeSubnetGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest request) {

        return describeUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(final DescribeUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler) {
        final DescribeUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUsersResult>() {
            @Override
            public DescribeUsersResult call() throws Exception {
                DescribeUsersResult result = null;

                try {
                    result = executeDescribeUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(FailoverShardRequest request) {

        return failoverShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(final FailoverShardRequest request,
            final com.amazonaws.handlers.AsyncHandler<FailoverShardRequest, FailoverShardResult> asyncHandler) {
        final FailoverShardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FailoverShardResult>() {
            @Override
            public FailoverShardResult call() throws Exception {
                FailoverShardResult result = null;

                try {
                    result = executeFailoverShard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(ListAllowedNodeTypeUpdatesRequest request) {

        return listAllowedNodeTypeUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(final ListAllowedNodeTypeUpdatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeUpdatesRequest, ListAllowedNodeTypeUpdatesResult> asyncHandler) {
        final ListAllowedNodeTypeUpdatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAllowedNodeTypeUpdatesResult>() {
            @Override
            public ListAllowedNodeTypeUpdatesResult call() throws Exception {
                ListAllowedNodeTypeUpdatesResult result = null;

                try {
                    result = executeListAllowedNodeTypeUpdates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(PurchaseReservedNodesOfferingRequest request) {

        return purchaseReservedNodesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(
            final PurchaseReservedNodesOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodesOfferingRequest, PurchaseReservedNodesOfferingResult> asyncHandler) {
        final PurchaseReservedNodesOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseReservedNodesOfferingResult>() {
            @Override
            public PurchaseReservedNodesOfferingResult call() throws Exception {
                PurchaseReservedNodesOfferingResult result = null;

                try {
                    result = executePurchaseReservedNodesOffering(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(ResetParameterGroupRequest request) {

        return resetParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(final ResetParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetParameterGroupRequest, ResetParameterGroupResult> asyncHandler) {
        final ResetParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetParameterGroupResult>() {
            @Override
            public ResetParameterGroupResult call() throws Exception {
                ResetParameterGroupResult result = null;

                try {
                    result = executeResetParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateACLResult> updateACLAsync(UpdateACLRequest request) {

        return updateACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateACLResult> updateACLAsync(final UpdateACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateACLRequest, UpdateACLResult> asyncHandler) {
        final UpdateACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateACLResult>() {
            @Override
            public UpdateACLResult call() throws Exception {
                UpdateACLResult result = null;

                try {
                    result = executeUpdateACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest request) {

        return updateClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(final UpdateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler) {
        final UpdateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterResult>() {
            @Override
            public UpdateClusterResult call() throws Exception {
                UpdateClusterResult result = null;

                try {
                    result = executeUpdateCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest request) {

        return updateParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(final UpdateParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateParameterGroupRequest, UpdateParameterGroupResult> asyncHandler) {
        final UpdateParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateParameterGroupResult>() {
            @Override
            public UpdateParameterGroupResult call() throws Exception {
                UpdateParameterGroupResult result = null;

                try {
                    result = executeUpdateParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest request) {

        return updateSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(final UpdateSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubnetGroupRequest, UpdateSubnetGroupResult> asyncHandler) {
        final UpdateSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubnetGroupResult>() {
            @Override
            public UpdateSubnetGroupResult call() throws Exception {
                UpdateSubnetGroupResult result = null;

                try {
                    result = executeUpdateSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
