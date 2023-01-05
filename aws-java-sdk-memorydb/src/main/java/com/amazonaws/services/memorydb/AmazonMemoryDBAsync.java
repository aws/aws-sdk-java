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

/**
 * Interface for accessing Amazon MemoryDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.memorydb.AbstractAmazonMemoryDBAsync} instead.
 * </p>
 * <p>
 * <p>
 * MemoryDB for Redis is a fully managed, Redis-compatible, in-memory database that delivers ultra-fast performance and
 * Multi-AZ durability for modern applications built using microservices architectures. MemoryDB stores the entire
 * database in-memory, enabling low latency and high throughput data access. It is compatible with Redis, a popular open
 * source data store, enabling you to leverage Redis’ flexible and friendly data structures, APIs, and commands.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMemoryDBAsync extends AmazonMemoryDB {

    /**
     * <p>
     * Apply the service update to a list of clusters supplied. For more information on service updates and applying
     * them, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/managing-updates.html#applying-updates">Applying the
     * service updates</a>.
     * </p>
     * 
     * @param batchUpdateClusterRequest
     * @return A Java Future containing the result of the BatchUpdateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsync.BatchUpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(BatchUpdateClusterRequest batchUpdateClusterRequest);

    /**
     * <p>
     * Apply the service update to a list of clusters supplied. For more information on service updates and applying
     * them, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/managing-updates.html#applying-updates">Applying the
     * service updates</a>.
     * </p>
     * 
     * @param batchUpdateClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.BatchUpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(BatchUpdateClusterRequest batchUpdateClusterRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateClusterRequest, BatchUpdateClusterResult> asyncHandler);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsync.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * 
     * @param copySnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates an Access Control List. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createACLRequest
     * @return A Java Future containing the result of the CreateACL operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateACLResult> createACLAsync(CreateACLRequest createACLRequest);

    /**
     * <p>
     * Creates an Access Control List. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateACL operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateACLResult> createACLAsync(CreateACLRequest createACLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateACLRequest, CreateACLResult> asyncHandler);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are
     * applied to all of the nodes in any cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/parametergroups.html">Configuring engine parameters
     * using parameter groups</a>.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return A Java Future containing the result of the CreateParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest createParameterGroupRequest);

    /**
     * <p>
     * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are
     * applied to all of the nodes in any cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/parametergroups.html">Configuring engine parameters
     * using parameter groups</a>.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest createParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateParameterGroupRequest, CreateParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a copy of an entire cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a copy of an entire cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a subnet group. A subnet group is a collection of subnets (typically private) that you can designate for
     * your clusters running in an Amazon Virtual Private Cloud (VPC) environment. When you create a cluster in an
     * Amazon VPC, you must specify a subnet group. MemoryDB uses that subnet group to choose a subnet and IP addresses
     * within that subnet to associate with your nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/subnetgroups.html">Subnets and subnet groups</a>.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @return A Java Future containing the result of the CreateSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest createSubnetGroupRequest);

    /**
     * <p>
     * Creates a subnet group. A subnet group is a collection of subnets (typically private) that you can designate for
     * your clusters running in an Amazon Virtual Private Cloud (VPC) environment. When you create a cluster in an
     * Amazon VPC, you must specify a subnet group. MemoryDB uses that subnet group to choose a subnet and IP addresses
     * within that subnet to associate with your nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/subnetgroups.html">Subnets and subnet groups</a>.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest createSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetGroupRequest, CreateSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a MemoryDB user. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonMemoryDBAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a MemoryDB user. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param deleteACLRequest
     * @return A Java Future containing the result of the DeleteACL operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(DeleteACLRequest deleteACLRequest);

    /**
     * <p>
     * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param deleteACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteACL operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(DeleteACLRequest deleteACLRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteACLRequest, DeleteACLResult> asyncHandler);

    /**
     * <p>
     * Deletes a cluster. It also deletes all associated nodes and node endpoints
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes a cluster. It also deletes all associated nodes and node endpoints
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters.
     * You cannot delete the default parameter groups in your account.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return A Java Future containing the result of the DeleteParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest deleteParameterGroupRequest);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters.
     * You cannot delete the default parameter groups in your account.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest deleteParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteParameterGroupRequest, DeleteParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
     * </p>
     * 
     * @param deleteSubnetGroupRequest
     * @return A Java Future containing the result of the DeleteSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest deleteSubnetGroupRequest);

    /**
     * <p>
     * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
     * </p>
     * 
     * @param deleteSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest deleteSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetGroupRequest, DeleteSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonMemoryDBAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ACLs
     * </p>
     * 
     * @param describeACLsRequest
     * @return A Java Future containing the result of the DescribeACLs operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(DescribeACLsRequest describeACLsRequest);

    /**
     * <p>
     * Returns a list of ACLs
     * </p>
     * 
     * @param describeACLsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeACLs operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(DescribeACLsRequest describeACLsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeACLsRequest, DescribeACLsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cluster if a cluster name is supplied.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cluster if a cluster name is supplied.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available Redis engine versions.
     * </p>
     * 
     * @param describeEngineVersionsRequest
     * @return A Java Future containing the result of the DescribeEngineVersions operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest describeEngineVersionsRequest);

    /**
     * <p>
     * Returns a list of the available Redis engine versions.
     * </p>
     * 
     * @param describeEngineVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngineVersions operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest describeEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineVersionsRequest, DescribeEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a
     * particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the
     * events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a
     * particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the
     * events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only
     * the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return A Java Future containing the result of the DescribeParameterGroups operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest describeParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only
     * the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameterGroups operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest describeParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParameterGroupsRequest, DescribeParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler);

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return A Java Future containing the result of the DescribeReservedNodes operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest);

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedNodes operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler);

    /**
     * <p>
     * Lists available reserved node offerings.
     * </p>
     * 
     * @param describeReservedNodesOfferingsRequest
     * @return A Java Future containing the result of the DescribeReservedNodesOfferings operation returned by the
     *         service.
     * @sample AmazonMemoryDBAsync.DescribeReservedNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(
            DescribeReservedNodesOfferingsRequest describeReservedNodesOfferingsRequest);

    /**
     * <p>
     * Lists available reserved node offerings.
     * </p>
     * 
     * @param describeReservedNodesOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedNodesOfferings operation returned by the
     *         service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeReservedNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(
            DescribeReservedNodesOfferingsRequest describeReservedNodesOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesOfferingsRequest, DescribeReservedNodesOfferingsResult> asyncHandler);

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return A Java Future containing the result of the DescribeServiceUpdates operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(DescribeServiceUpdatesRequest describeServiceUpdatesRequest);

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceUpdates operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(DescribeServiceUpdatesRequest describeServiceUpdatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceUpdatesRequest, DescribeServiceUpdatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can
     * optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can
     * optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return A Java Future containing the result of the DescribeSubnetGroups operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest describeSubnetGroupsRequest);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubnetGroups operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest describeSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetGroupsRequest, DescribeSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonMemoryDBAsync.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler);

    /**
     * <p>
     * Used to failover a shard. This API is designed for testing the behavior of your application in case of MemoryDB
     * failover. It is not designed to be used as a production-level tool for initiating a failover to overcome a
     * problem you may have with the cluster. Moreover, in certain conditions such as large scale operational events,
     * Amazon may block this API.
     * </p>
     * 
     * @param failoverShardRequest
     * @return A Java Future containing the result of the FailoverShard operation returned by the service.
     * @sample AmazonMemoryDBAsync.FailoverShard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/FailoverShard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(FailoverShardRequest failoverShardRequest);

    /**
     * <p>
     * Used to failover a shard. This API is designed for testing the behavior of your application in case of MemoryDB
     * failover. It is not designed to be used as a production-level tool for initiating a failover to overcome a
     * problem you may have with the cluster. Moreover, in certain conditions such as large scale operational events,
     * Amazon may block this API.
     * </p>
     * 
     * @param failoverShardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FailoverShard operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.FailoverShard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/FailoverShard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(FailoverShardRequest failoverShardRequest,
            com.amazonaws.handlers.AsyncHandler<FailoverShardRequest, FailoverShardResult> asyncHandler);

    /**
     * <p>
     * Lists all available node types that you can scale to from your cluster's current node type. When you use the
     * UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeUpdatesRequest
     * @return A Java Future containing the result of the ListAllowedNodeTypeUpdates operation returned by the service.
     * @sample AmazonMemoryDBAsync.ListAllowedNodeTypeUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListAllowedNodeTypeUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(
            ListAllowedNodeTypeUpdatesRequest listAllowedNodeTypeUpdatesRequest);

    /**
     * <p>
     * Lists all available node types that you can scale to from your cluster's current node type. When you use the
     * UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeUpdatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAllowedNodeTypeUpdates operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.ListAllowedNodeTypeUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListAllowedNodeTypeUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(
            ListAllowedNodeTypeUpdatesRequest listAllowedNodeTypeUpdatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeUpdatesRequest, ListAllowedNodeTypeUpdatesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are
     * case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/Tagging-Resources.html">Tagging your MemoryDB
     * resources</a>
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonMemoryDBAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are
     * case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/Tagging-Resources.html">Tagging your MemoryDB
     * resources</a>
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Allows you to purchase a reserved node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable.
     * </p>
     * 
     * @param purchaseReservedNodesOfferingRequest
     * @return A Java Future containing the result of the PurchaseReservedNodesOffering operation returned by the
     *         service.
     * @sample AmazonMemoryDBAsync.PurchaseReservedNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(
            PurchaseReservedNodesOfferingRequest purchaseReservedNodesOfferingRequest);

    /**
     * <p>
     * Allows you to purchase a reserved node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable.
     * </p>
     * 
     * @param purchaseReservedNodesOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedNodesOffering operation returned by the
     *         service.
     * @sample AmazonMemoryDBAsyncHandler.PurchaseReservedNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(
            PurchaseReservedNodesOfferingRequest purchaseReservedNodesOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodesOfferingRequest, PurchaseReservedNodesOfferingResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire parameter group, specify the
     * AllParameters and ParameterGroupName parameters.
     * </p>
     * 
     * @param resetParameterGroupRequest
     * @return A Java Future containing the result of the ResetParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.ResetParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ResetParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(ResetParameterGroupRequest resetParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire parameter group, specify the
     * AllParameters and ParameterGroupName parameters.
     * </p>
     * 
     * @param resetParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.ResetParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ResetParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(ResetParameterGroupRequest resetParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetParameterGroupRequest, ResetParameterGroupResult> asyncHandler);

    /**
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all
     * nodes in the cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/iam.resourcelevelpermissions.html">Resource-level
     * permissions</a>.
     * </p>
     * <p>
     * For example, you can use cost-allocation tags to your MemoryDB resources, Amazon generates a cost allocation
     * report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply
     * tags that represent business categories (such as cost centers, application names, or owners) to organize your
     * costs across multiple services. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/tagging.html">Using Cost Allocation Tags</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMemoryDBAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all
     * nodes in the cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/iam.resourcelevelpermissions.html">Resource-level
     * permissions</a>.
     * </p>
     * <p>
     * For example, you can use cost-allocation tags to your MemoryDB resources, Amazon generates a cost allocation
     * report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply
     * tags that represent business categories (such as cost centers, application names, or owners) to organize your
     * costs across multiple services. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/tagging.html">Using Cost Allocation Tags</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to remove tags on a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMemoryDBAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Use this operation to remove tags on a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Changes the list of users that belong to the Access Control List.
     * </p>
     * 
     * @param updateACLRequest
     * @return A Java Future containing the result of the UpdateACL operation returned by the service.
     * @sample AmazonMemoryDBAsync.UpdateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateACLResult> updateACLAsync(UpdateACLRequest updateACLRequest);

    /**
     * <p>
     * Changes the list of users that belong to the Access Control List.
     * </p>
     * 
     * @param updateACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateACL operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UpdateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateACLResult> updateACLAsync(UpdateACLRequest updateACLRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateACLRequest, UpdateACLResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * settings by specifying the settings and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsync.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * settings by specifying the settings and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler);

    /**
     * <p>
     * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting
     * a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return A Java Future containing the result of the UpdateParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest updateParameterGroupRequest);

    /**
     * <p>
     * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting
     * a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateParameterGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest updateParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateParameterGroupRequest, UpdateParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a subnet group. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/ubnetGroups.Modifying.html">Updating a subnet
     * group</a>
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return A Java Future containing the result of the UpdateSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsync.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest updateSubnetGroupRequest);

    /**
     * <p>
     * Updates a subnet group. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/ubnetGroups.Modifying.html">Updating a subnet
     * group</a>
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubnetGroup operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest updateSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubnetGroupRequest, UpdateSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonMemoryDBAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonMemoryDBAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
