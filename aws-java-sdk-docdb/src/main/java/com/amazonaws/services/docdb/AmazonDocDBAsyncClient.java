/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdb;

import javax.annotation.Generated;

import com.amazonaws.services.docdb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon DocDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon DocumentDB API documentation
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDocDBAsyncClient extends AmazonDocDBClient implements AmazonDocDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDocDBAsyncClientBuilder asyncBuilder() {
        return AmazonDocDBAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DocDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDocDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
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
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request) {

        return applyPendingMaintenanceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            final ApplyPendingMaintenanceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler) {
        final ApplyPendingMaintenanceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResourcePendingMaintenanceActions>() {
            @Override
            public ResourcePendingMaintenanceActions call() throws Exception {
                ResourcePendingMaintenanceActions result = null;

                try {
                    result = executeApplyPendingMaintenanceAction(finalRequest);
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
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest request) {

        return copyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(final CopyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {
        final CopyDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result = null;

                try {
                    result = executeCopyDBClusterParameterGroup(finalRequest);
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
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest request) {

        return copyDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(final CopyDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final CopyDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeCopyDBClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request) {

        return createDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(final CreateDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler) {
        final CreateDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeCreateDBCluster(finalRequest);
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
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(CreateDBClusterParameterGroupRequest request) {

        return createDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(final CreateDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {
        final CreateDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result = null;

                try {
                    result = executeCreateDBClusterParameterGroup(finalRequest);
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
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest request) {

        return createDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(final CreateDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final CreateDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeCreateDBClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest request) {

        return createDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(final CreateDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler) {
        final CreateDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeCreateDBInstance(finalRequest);
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
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest request) {

        return createDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(final CreateDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {
        final CreateDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result = null;

                try {
                    result = executeCreateDBSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request) {

        return deleteDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(final DeleteDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler) {
        final DeleteDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeDeleteDBCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(DeleteDBClusterParameterGroupRequest request) {

        return deleteDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            final DeleteDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler) {
        final DeleteDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBClusterParameterGroupResult>() {
            @Override
            public DeleteDBClusterParameterGroupResult call() throws Exception {
                DeleteDBClusterParameterGroupResult result = null;

                try {
                    result = executeDeleteDBClusterParameterGroup(finalRequest);
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
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest request) {

        return deleteDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(final DeleteDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {
        final DeleteDBClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result = null;

                try {
                    result = executeDeleteDBClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest request) {

        return deleteDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(final DeleteDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler) {
        final DeleteDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeDeleteDBInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest request) {

        return deleteDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(final DeleteDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler) {
        final DeleteDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBSubnetGroupResult>() {
            @Override
            public DeleteDBSubnetGroupResult call() throws Exception {
                DeleteDBSubnetGroupResult result = null;

                try {
                    result = executeDeleteDBSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest request) {

        return describeDBClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            final DescribeDBClusterParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {
        final DescribeDBClusterParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParameterGroupsResult>() {
            @Override
            public DescribeDBClusterParameterGroupsResult call() throws Exception {
                DescribeDBClusterParameterGroupsResult result = null;

                try {
                    result = executeDescribeDBClusterParameterGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(DescribeDBClusterParametersRequest request) {

        return describeDBClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(final DescribeDBClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler) {
        final DescribeDBClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParametersResult>() {
            @Override
            public DescribeDBClusterParametersResult call() throws Exception {
                DescribeDBClusterParametersResult result = null;

                try {
                    result = executeDescribeDBClusterParameters(finalRequest);
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
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest request) {

        return describeDBClusterSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            final DescribeDBClusterSnapshotAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler) {
        final DescribeDBClusterSnapshotAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result = null;

                try {
                    result = executeDescribeDBClusterSnapshotAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest request) {

        return describeDBClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(final DescribeDBClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {
        final DescribeDBClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterSnapshotsResult>() {
            @Override
            public DescribeDBClusterSnapshotsResult call() throws Exception {
                DescribeDBClusterSnapshotsResult result = null;

                try {
                    result = executeDescribeDBClusterSnapshots(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request) {

        return describeDBClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(final DescribeDBClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {
        final DescribeDBClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClustersResult>() {
            @Override
            public DescribeDBClustersResult call() throws Exception {
                DescribeDBClustersResult result = null;

                try {
                    result = executeDescribeDBClusters(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest request) {

        return describeDBEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(final DescribeDBEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {
        final DescribeDBEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBEngineVersionsResult>() {
            @Override
            public DescribeDBEngineVersionsResult call() throws Exception {
                DescribeDBEngineVersionsResult result = null;

                try {
                    result = executeDescribeDBEngineVersions(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request) {

        return describeDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(final DescribeDBInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {
        final DescribeDBInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBInstancesResult>() {
            @Override
            public DescribeDBInstancesResult call() throws Exception {
                DescribeDBInstancesResult result = null;

                try {
                    result = executeDescribeDBInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request) {

        return describeDBSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(final DescribeDBSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {
        final DescribeDBSubnetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBSubnetGroupsResult>() {
            @Override
            public DescribeDBSubnetGroupsResult call() throws Exception {
                DescribeDBSubnetGroupsResult result = null;

                try {
                    result = executeDescribeDBSubnetGroups(finalRequest);
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
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(DescribeEngineDefaultClusterParametersRequest request) {

        return describeEngineDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(final DescribeEngineDefaultClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler) {
        final DescribeEngineDefaultClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EngineDefaults>() {
            @Override
            public EngineDefaults call() throws Exception {
                EngineDefaults result = null;

                try {
                    result = executeDescribeEngineDefaultClusterParameters(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {
        final DescribeEventCategoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventCategoriesResult>() {
            @Override
            public DescribeEventCategoriesResult call() throws Exception {
                DescribeEventCategoriesResult result = null;

                try {
                    result = executeDescribeEventCategories(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest request) {

        return describeOrderableDBInstanceOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            final DescribeOrderableDBInstanceOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler) {
        final DescribeOrderableDBInstanceOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableDBInstanceOptionsResult>() {
            @Override
            public DescribeOrderableDBInstanceOptionsResult call() throws Exception {
                DescribeOrderableDBInstanceOptionsResult result = null;

                try {
                    result = executeDescribeOrderableDBInstanceOptions(finalRequest);
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
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request) {

        return describePendingMaintenanceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            final DescribePendingMaintenanceActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {
        final DescribePendingMaintenanceActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePendingMaintenanceActionsResult>() {
            @Override
            public DescribePendingMaintenanceActionsResult call() throws Exception {
                DescribePendingMaintenanceActionsResult result = null;

                try {
                    result = executeDescribePendingMaintenanceActions(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request) {

        return failoverDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(final FailoverDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {
        final FailoverDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeFailoverDBCluster(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request) {

        return modifyDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(final ModifyDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler) {
        final ModifyDBClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeModifyDBCluster(finalRequest);
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
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(ModifyDBClusterParameterGroupRequest request) {

        return modifyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            final ModifyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler) {
        final ModifyDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBClusterParameterGroupResult>() {
            @Override
            public ModifyDBClusterParameterGroupResult call() throws Exception {
                ModifyDBClusterParameterGroupResult result = null;

                try {
                    result = executeModifyDBClusterParameterGroup(finalRequest);
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
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(ModifyDBClusterSnapshotAttributeRequest request) {

        return modifyDBClusterSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            final ModifyDBClusterSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler) {
        final ModifyDBClusterSnapshotAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result = null;

                try {
                    result = executeModifyDBClusterSnapshotAttribute(finalRequest);
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
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest request) {

        return modifyDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(final ModifyDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler) {
        final ModifyDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeModifyDBInstance(finalRequest);
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
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest request) {

        return modifyDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(final ModifyDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {
        final ModifyDBSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result = null;

                try {
                    result = executeModifyDBSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest request) {

        return rebootDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(final RebootDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler) {
        final RebootDBInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result = null;

                try {
                    result = executeRebootDBInstance(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
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
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(ResetDBClusterParameterGroupRequest request) {

        return resetDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(final ResetDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler) {
        final ResetDBClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetDBClusterParameterGroupResult>() {
            @Override
            public ResetDBClusterParameterGroupResult call() throws Exception {
                ResetDBClusterParameterGroupResult result = null;

                try {
                    result = executeResetDBClusterParameterGroup(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest request) {

        return restoreDBClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(final RestoreDBClusterFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler) {
        final RestoreDBClusterFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeRestoreDBClusterFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest request) {

        return restoreDBClusterToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(final RestoreDBClusterToPointInTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler) {
        final RestoreDBClusterToPointInTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result = null;

                try {
                    result = executeRestoreDBClusterToPointInTime(finalRequest);
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
