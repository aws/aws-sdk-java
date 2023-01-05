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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.memorydb.model.*;

/**
 * Interface for accessing Amazon MemoryDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.memorydb.AbstractAmazonMemoryDB} instead.
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
public interface AmazonMemoryDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "memory-db";

    /**
     * <p>
     * Apply the service update to a list of clusters supplied. For more information on service updates and applying
     * them, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/managing-updates.html#applying-updates">Applying the
     * service updates</a>.
     * </p>
     * 
     * @param batchUpdateClusterRequest
     * @return Result of the BatchUpdateCluster operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.BatchUpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdateClusterResult batchUpdateCluster(BatchUpdateClusterRequest batchUpdateClusterRequest);

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidSnapshotStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Creates an Access Control List. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createACLRequest
     * @return Result of the CreateACL operation returned by the service.
     * @throws UserNotFoundException
     * @throws DuplicateUserNameException
     * @throws ACLAlreadyExistsException
     * @throws DefaultUserRequiredException
     * @throws ACLQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateACL" target="_top">AWS API
     *      Documentation</a>
     */
    CreateACLResult createACL(CreateACLRequest createACLRequest);

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     * @throws SubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws ParameterGroupNotFoundException
     * @throws InsufficientClusterCapacityException
     * @throws InvalidVPCNetworkStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws ShardsPerClusterQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCredentialsException
     * @throws TagQuotaPerResourceExceededException
     * @throws ACLNotFoundException
     * @throws InvalidACLStateException
     * @sample AmazonMemoryDB.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are
     * applied to all of the nodes in any cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/parametergroups.html">Configuring engine parameters
     * using parameter groups</a>.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return Result of the CreateParameterGroup operation returned by the service.
     * @throws ParameterGroupQuotaExceededException
     * @throws ParameterGroupAlreadyExistsException
     * @throws InvalidParameterGroupStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateParameterGroupResult createParameterGroup(CreateParameterGroupRequest createParameterGroupRequest);

    /**
     * <p>
     * Creates a copy of an entire cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotQuotaExceededException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

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
     * @return Result of the CreateSubnetGroup operation returned by the service.
     * @throws SubnetGroupAlreadyExistsException
     * @throws SubnetGroupQuotaExceededException
     * @throws SubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws SubnetNotAllowedException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSubnetGroupResult createSubnetGroup(CreateSubnetGroupRequest createSubnetGroupRequest);

    /**
     * <p>
     * Creates a MemoryDB user. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws UserAlreadyExistsException
     * @throws UserQuotaExceededException
     * @throws DuplicateUserNameException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param deleteACLRequest
     * @return Result of the DeleteACL operation returned by the service.
     * @throws ACLNotFoundException
     * @throws InvalidACLStateException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.DeleteACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteACL" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteACLResult deleteACL(DeleteACLRequest deleteACLRequest);

    /**
     * <p>
     * Deletes a cluster. It also deletes all associated nodes and node endpoints
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotAlreadyExistsException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters.
     * You cannot delete the default parameter groups in your account.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return Result of the DeleteParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteParameterGroupResult deleteParameterGroup(DeleteParameterGroupRequest deleteParameterGroupRequest);

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     * @throws InvalidSnapshotStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
     * </p>
     * 
     * @param deleteSubnetGroupRequest
     * @return Result of the DeleteSubnetGroup operation returned by the service.
     * @throws SubnetGroupInUseException
     * @throws SubnetGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSubnetGroupResult deleteSubnetGroup(DeleteSubnetGroupRequest deleteSubnetGroupRequest);

    /**
     * <p>
     * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidUserStateException
     * @throws UserNotFoundException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Returns a list of ACLs
     * </p>
     * 
     * @param describeACLsRequest
     * @return Result of the DescribeACLs operation returned by the service.
     * @throws ACLNotFoundException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeACLs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeACLsResult describeACLs(DescribeACLsRequest describeACLsRequest);

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cluster if a cluster name is supplied.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Returns a list of the available Redis engine versions.
     * </p>
     * 
     * @param describeEngineVersionsRequest
     * @return Result of the DescribeEngineVersions operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEngineVersionsResult describeEngineVersions(DescribeEngineVersionsRequest describeEngineVersionsRequest);

    /**
     * <p>
     * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a
     * particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the
     * events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only
     * the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return Result of the DescribeParameterGroups operation returned by the service.
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeParameterGroupsResult describeParameterGroups(DescribeParameterGroupsRequest describeParameterGroupsRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeParametersResult describeParameters(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return Result of the DescribeReservedNodes operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The requested node does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest);

    /**
     * <p>
     * Lists available reserved node offerings.
     * </p>
     * 
     * @param describeReservedNodesOfferingsRequest
     * @return Result of the DescribeReservedNodesOfferings operation returned by the service.
     * @throws ReservedNodesOfferingNotFoundException
     *         The requested node offering does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeReservedNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedNodesOfferingsResult describeReservedNodesOfferings(DescribeReservedNodesOfferingsRequest describeReservedNodesOfferingsRequest);

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return Result of the DescribeServiceUpdates operation returned by the service.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest describeServiceUpdatesRequest);

    /**
     * <p>
     * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can
     * optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws SnapshotNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return Result of the DescribeSubnetGroups operation returned by the service.
     * @throws SubnetGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSubnetGroupsResult describeSubnetGroups(DescribeSubnetGroupsRequest describeSubnetGroupsRequest);

    /**
     * <p>
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws UserNotFoundException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUsersResult describeUsers(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Used to failover a shard. This API is designed for testing the behavior of your application in case of MemoryDB
     * failover. It is not designed to be used as a production-level tool for initiating a failover to overcome a
     * problem you may have with the cluster. Moreover, in certain conditions such as large scale operational events,
     * Amazon may block this API.
     * </p>
     * 
     * @param failoverShardRequest
     * @return Result of the FailoverShard operation returned by the service.
     * @throws APICallRateForCustomerExceededException
     * @throws InvalidClusterStateException
     * @throws ShardNotFoundException
     * @throws ClusterNotFoundException
     * @throws TestFailoverNotAvailableException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.FailoverShard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/FailoverShard" target="_top">AWS API
     *      Documentation</a>
     */
    FailoverShardResult failoverShard(FailoverShardRequest failoverShardRequest);

    /**
     * <p>
     * Lists all available node types that you can scale to from your cluster's current node type. When you use the
     * UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeUpdatesRequest
     * @return Result of the ListAllowedNodeTypeUpdates operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.ListAllowedNodeTypeUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListAllowedNodeTypeUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    ListAllowedNodeTypeUpdatesResult listAllowedNodeTypeUpdates(ListAllowedNodeTypeUpdatesRequest listAllowedNodeTypeUpdatesRequest);

    /**
     * <p>
     * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are
     * case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/Tagging-Resources.html">Tagging your MemoryDB
     * resources</a>
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @sample AmazonMemoryDB.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Allows you to purchase a reserved node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable.
     * </p>
     * 
     * @param purchaseReservedNodesOfferingRequest
     * @return Result of the PurchaseReservedNodesOffering operation returned by the service.
     * @throws ReservedNodesOfferingNotFoundException
     *         The requested node offering does not exist.
     * @throws ReservedNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the user's node quota.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.PurchaseReservedNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    PurchaseReservedNodesOfferingResult purchaseReservedNodesOffering(PurchaseReservedNodesOfferingRequest purchaseReservedNodesOfferingRequest);

    /**
     * <p>
     * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire parameter group, specify the
     * AllParameters and ParameterGroupName parameters.
     * </p>
     * 
     * @param resetParameterGroupRequest
     * @return Result of the ResetParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.ResetParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ResetParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ResetParameterGroupResult resetParameterGroup(ResetParameterGroupRequest resetParameterGroupRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidARNException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use this operation to remove tags on a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws TagNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @sample AmazonMemoryDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Changes the list of users that belong to the Access Control List.
     * </p>
     * 
     * @param updateACLRequest
     * @return Result of the UpdateACL operation returned by the service.
     * @throws ACLNotFoundException
     * @throws UserNotFoundException
     * @throws DuplicateUserNameException
     * @throws DefaultUserRequiredException
     * @throws InvalidACLStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateACLResult updateACL(UpdateACLRequest updateACLRequest);

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * settings by specifying the settings and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws InvalidNodeStateException
     * @throws ParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidKMSKeyException
     * @throws NodeQuotaForClusterExceededException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws ShardsPerClusterQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws NoOperationException
     * @throws InvalidACLStateException
     * @throws ACLNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting
     * a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return Result of the UpdateParameterGroup operation returned by the service.
     * @throws ParameterGroupNotFoundException
     * @throws InvalidParameterGroupStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest updateParameterGroupRequest);

    /**
     * <p>
     * Updates a subnet group. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/ubnetGroups.Modifying.html">Updating a subnet
     * group</a>
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return Result of the UpdateSubnetGroup operation returned by the service.
     * @throws SubnetGroupNotFoundException
     * @throws SubnetQuotaExceededException
     * @throws SubnetInUseException
     * @throws InvalidSubnetException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws SubnetNotAllowedException
     * @sample AmazonMemoryDB.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSubnetGroupResult updateSubnetGroup(UpdateSubnetGroupRequest updateSubnetGroupRequest);

    /**
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws UserNotFoundException
     * @throws InvalidUserStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
