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
package com.amazonaws.services.docdb;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.docdb.model.*;
import com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters;

/**
 * Interface for accessing Amazon DocDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.docdb.AbstractAmazonDocDB} instead.
 * </p>
 * <p>
 * <p>
 * Amazon DocumentDB API documentation
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDocDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds";

    /**
     * <p>
     * Adds a source identifier to an existing event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     *        Represents the input to <a>AddSourceIdentifierToSubscription</a>.
     * @return Result of the AddSourceIdentifierToSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonDocDB.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to
     * track costs that are associated with Amazon DocumentDB resources or in a <code>Condition</code> statement in an
     * Identity and Access Management (IAM) policy for Amazon DocumentDB.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input to <a>AddTagsToResource</a>.
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing snapshot.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to an Amazon DocumentDB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     *        Represents the input to <a>ApplyPendingMaintenanceAction</a>.
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @sample AmazonDocDB.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Copies the specified cluster parameter group.
     * </p>
     * 
     * @param copyDBClusterParameterGroupRequest
     *        Represents the input to <a>CopyDBClusterParameterGroup</a>.
     * @return Result of the CopyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @throws DBParameterGroupQuotaExceededException
     *         This request would cause you to exceed the allowed number of parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A parameter group with the same name already exists.
     * @sample AmazonDocDB.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Copies a snapshot of a cluster.
     * </p>
     * <p>
     * To copy a cluster snapshot from a shared manual cluster snapshot, <code>SourceDBClusterSnapshotIdentifier</code>
     * must be the Amazon Resource Name (ARN) of the shared cluster snapshot. You can only copy a shared DB cluster
     * snapshot, whether encrypted or not, in the same Region.
     * </p>
     * <p>
     * To cancel the copy operation after it is in progress, delete the target cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that cluster snapshot is in the <i>copying</i> status.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     *        Represents the input to <a>CopyDBClusterSnapshot</a>.
     * @return Result of the CopyDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         You already have a cluster snapshot with the given identifier.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @throws SnapshotQuotaExceededException
     *         The request would cause you to exceed the allowed number of snapshots.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred when accessing an KMS key.
     * @sample AmazonDocDB.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new Amazon DocumentDB cluster.
     * </p>
     * 
     * @param createDBClusterRequest
     *        Represents the input to <a>CreateDBCluster</a>.
     * @return Result of the CreateDBCluster operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @throws InsufficientStorageClusterCapacityException
     *         There is not enough storage available for the current action. You might be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws DBClusterQuotaExceededException
     *         The cluster can't be created because you have reached the maximum allowed quota of clusters.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBSubnetGroupStateException
     *         The subnet group can't be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred when accessing an KMS key.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global cluster.
     * @throws InvalidGlobalClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonDocDB.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster createDBCluster(CreateDBClusterRequest createDBClusterRequest);

    /**
     * <p>
     * Creates a new cluster parameter group.
     * </p>
     * <p>
     * Parameters in a cluster parameter group apply to all of the instances in a cluster.
     * </p>
     * <p>
     * A cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the cluster. In Amazon DocumentDB, you cannot make modifications directly to the
     * <code>default.docdb3.6</code> cluster parameter group. If your Amazon DocumentDB cluster is using the default
     * cluster parameter group and you want to modify a value in it, you must first <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-create.html"> create a
     * new parameter group</a> or <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-copy.html"> copy an
     * existing parameter group</a>, modify it, and then apply the modified parameter group to your cluster. For the new
     * cluster parameter group and associated settings to take effect, you must then reboot the instances in the cluster
     * without failover. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/cluster_parameter_group-modify.html">
     * Modifying Amazon DocumentDB Cluster Parameter Groups</a>.
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     *        Represents the input of <a>CreateDBClusterParameterGroup</a>.
     * @return Result of the CreateDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         This request would cause you to exceed the allowed number of parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A parameter group with the same name already exists.
     * @sample AmazonDocDB.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     *        Represents the input of <a>CreateDBClusterSnapshot</a>.
     * @return Result of the CreateDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         You already have a cluster snapshot with the given identifier.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws SnapshotQuotaExceededException
     *         The request would cause you to exceed the allowed number of snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @sample AmazonDocDB.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     *        Represents the input to <a>CreateDBInstance</a>.
     * @return Result of the CreateDBInstance operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         You already have a instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing security group.
     * @throws InstanceQuotaExceededException
     *         The request would cause you to exceed the allowed number of instances.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws StorageTypeNotSupportedException
     *         Storage of the specified <code>StorageType</code> can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP or Amazon EC2 security group isn't authorized for the specified security group.</p>
     *         <p>
     *         Amazon DocumentDB also might not be authorized to perform necessary actions on your behalf using IAM.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred when accessing an KMS key.
     * @sample AmazonDocDB.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a new subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in
     * the Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     *        Represents the input to <a>CreateDBSubnetGroup</a>.
     * @return Result of the CreateDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupAlreadyExistsException
     *         <code>DBSubnetGroupName</code> is already being used by an existing subnet group.
     * @throws DBSubnetGroupQuotaExceededException
     *         The request would cause you to exceed the allowed number of subnet groups.
     * @throws DBSubnetQuotaExceededException
     *         The request would cause you to exceed the allowed number of subnets in a subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @sample AmazonDocDB.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates an Amazon DocumentDB event notification subscription. This action requires a topic Amazon Resource Name
     * (ARN) created by using the Amazon DocumentDB console, the Amazon SNS console, or the Amazon SNS API. To obtain an
     * ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in
     * the Amazon SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of. You can also
     * provide a list of Amazon DocumentDB sources (<code>SourceIds</code>) that trigger the events, and you can provide
     * a list of event categories (<code>EventCategories</code>) for events that you want to be notified of. For
     * example, you can specify <code>SourceType = db-instance</code>,
     * <code>SourceIds = mydbinstance1, mydbinstance2</code> and <code>EventCategories = Availability, Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code> (such as
     * <code>SourceType = db-instance</code> and <code>SourceIdentifier = myDBInstance1</code>), you are notified of all
     * the <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify a <code>SourceIdentifier</code>, you receive notice of the events for that source type for all your
     * Amazon DocumentDB sources. If you do not specify either the <code>SourceType</code> or the
     * <code>SourceIdentifier</code>, you are notified of events generated from all Amazon DocumentDB sources belonging
     * to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     *        Represents the input to <a>CreateEventSubscription</a>.
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionAlreadyExistException
     *         The provided subscription name already exists.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic Amazon Resource Name (ARN).
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The provided category does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonDocDB.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an Amazon DocumentDB global cluster that can span multiple multiple Regions. The global cluster contains
     * one primary cluster with read-write capability, and up-to give read-only secondary clusters. Global clusters uses
     * storage-based fast replication across regions with latencies less than one second, using dedicated infrastructure
     * with no impact to your workload’s performance.
     * </p>
     * <p/>
     * <p>
     * You can create a global cluster that is initially empty, and then add a primary and a secondary to it. Or you can
     * specify an existing cluster during the create operation, and this cluster becomes the primary of the global
     * cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Amazon DocumentDB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     *        Represents the input to <a>CreateGlobalCluster</a>.
     * @return Result of the CreateGlobalCluster operation returned by the service.
     * @throws GlobalClusterAlreadyExistsException
     *         The <code>GlobalClusterIdentifier</code> already exists. Choose a new global cluster identifier (unique
     *         name) to create a new global cluster.
     * @throws GlobalClusterQuotaExceededException
     *         The number of global clusters for this account is already at the maximum allowed.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.CreateGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster createGlobalCluster(CreateGlobalClusterRequest createGlobalClusterRequest);

    /**
     * <p>
     * Deletes a previously provisioned cluster. When you delete a cluster, all automated backups for that cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the specified cluster are not deleted.
     * </p>
     * <p/>
     * 
     * @param deleteDBClusterRequest
     *        Represents the input to <a>DeleteDBCluster</a>.
     * @return Result of the DeleteDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         You already have a cluster snapshot with the given identifier.
     * @throws SnapshotQuotaExceededException
     *         The request would cause you to exceed the allowed number of snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @sample AmazonDocDB.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * Deletes a specified cluster parameter group. The cluster parameter group to be deleted can't be associated with
     * any clusters.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     *        Represents the input to <a>DeleteDBClusterParameterGroup</a>.
     * @return Result of the DeleteDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The parameter group is in use, or it is in a state that is not valid. If you are trying to delete the
     *         parameter group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @sample AmazonDocDB.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     *        Represents the input to <a>DeleteDBClusterSnapshot</a>.
     * @return Result of the DeleteDBClusterSnapshot operation returned by the service.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @sample AmazonDocDB.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

    /**
     * <p>
     * Deletes a previously provisioned instance.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     *        Represents the input to <a>DeleteDBInstance</a>.
     * @return Result of the DeleteDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @throws DBSnapshotAlreadyExistsException
     *         <code>DBSnapshotIdentifier</code> is already being used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request would cause you to exceed the allowed number of snapshots.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @sample AmazonDocDB.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     *        Represents the input to <a>DeleteDBSubnetGroup</a>.
     * @return Result of the DeleteDBSubnetGroup operation returned by the service.
     * @throws InvalidDBSubnetGroupStateException
     *         The subnet group can't be deleted because it's in use.
     * @throws InvalidDBSubnetStateException
     *         The subnet isn't in the <i>available</i> state.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @sample AmazonDocDB.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

    /**
     * <p>
     * Deletes an Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     *        Represents the input to <a>DeleteEventSubscription</a>.
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws InvalidEventSubscriptionStateException
     *         Someone else might be modifying a subscription. Wait a few seconds, and try again.
     * @sample AmazonDocDB.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes a global cluster. The primary and secondary clusters must already be detached or deleted before
     * attempting to delete a global cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Amazon DocumentDB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     *        Represents the input to <a>DeleteGlobalCluster</a>.
     * @return Result of the DeleteGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global cluster.
     * @throws InvalidGlobalClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonDocDB.DeleteGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster deleteGlobalCluster(DeleteGlobalClusterRequest deleteGlobalClusterRequest);

    /**
     * <p>
     * Returns a list of certificate authority (CA) certificates provided by Amazon DocumentDB for this account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws CertificateNotFoundException
     *         <code>CertificateIdentifier</code> doesn't refer to an existing certificate.
     * @sample AmazonDocDB.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list contains only the description of the
     * specified cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     *        Represents the input to <a>DescribeDBClusterParameterGroups</a>.
     * @return Result of the DescribeDBClusterParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @sample AmazonDocDB.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     *        Represents the input to <a>DescribeDBClusterParameters</a>.
     * @return Result of the DescribeDBClusterParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @sample AmazonDocDB.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest describeDBClusterParametersRequest);

    /**
     * <p>
     * Returns a list of cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When you share snapshots with other accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the accounts that are authorized to copy or restore the
     * manual cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual cluster snapshot is public and can be copied or restored by all accounts.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     *        Represents the input to <a>DescribeDBClusterSnapshotAttributes</a>.
     * @return Result of the DescribeDBClusterSnapshotAttributes operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @sample AmazonDocDB.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns information about cluster snapshots. This API operation supports pagination.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     *        Represents the input to <a>DescribeDBClusterSnapshots</a>.
     * @return Result of the DescribeDBClusterSnapshots operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @sample AmazonDocDB.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB clusters. This API operation supports pagination. For
     * certain management features such as cluster and instance lifecycle management, Amazon DocumentDB leverages
     * operational technology that is shared with Amazon RDS and Amazon Neptune. Use the
     * <code>filterName=engine,Values=docdb</code> filter parameter to return only Amazon DocumentDB clusters.
     * </p>
     * 
     * @param describeDBClustersRequest
     *        Represents the input to <a>DescribeDBClusters</a>.
     * @return Result of the DescribeDBClusters operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * <p>
     * Returns a list of the available engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     *        Represents the input to <a>DescribeDBEngineVersions</a>.
     * @return Result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonDocDB.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     *        Represents the input to <a>DescribeDBInstances</a>.
     * @return Result of the DescribeDBInstances operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @sample AmazonDocDB.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * <p>
     * Returns a list of <code>DBSubnetGroup</code> descriptions. If a <code>DBSubnetGroupName</code> is specified, the
     * list will contain only the descriptions of the specified <code>DBSubnetGroup</code>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     *        Represents the input to <a>DescribeDBSubnetGroups</a>.
     * @return Result of the DescribeDBSubnetGroups operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @sample AmazonDocDB.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     *        Represents the input to <a>DescribeEngineDefaultClusterParameters</a>.
     * @return Result of the DescribeEngineDefaultClusterParameters operation returned by the service.
     * @sample AmazonDocDB.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     *        Represents the input to <a>DescribeEventCategories</a>.
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonDocDB.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify a <code>SubscriptionName</code>, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     *        Represents the input to <a>DescribeEventSubscriptions</a>.
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @sample AmazonDocDB.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Returns events related to instances, security groups, snapshots, and DB parameter groups for the past 14 days.
     * You can obtain events specific to a particular DB instance, security group, snapshot, or parameter group by
     * providing the name as a parameter. By default, the events of the past hour are returned.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input to <a>DescribeEvents</a>.
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonDocDB.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns information about Amazon DocumentDB global clusters. This API supports pagination.
     * </p>
     * <note>
     * <p>
     * This action only applies to Amazon DocumentDB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return Result of the DescribeGlobalClusters operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global cluster.
     * @sample AmazonDocDB.DescribeGlobalClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeGlobalClusters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGlobalClustersResult describeGlobalClusters(DescribeGlobalClustersRequest describeGlobalClustersRequest);

    /**
     * <p>
     * Returns a list of orderable instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     *        Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
     * @return Result of the DescribeOrderableDBInstanceOptions operation returned by the service.
     * @sample AmazonDocDB.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest);

    /**
     * <p>
     * Returns a list of resources (for example, instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     *        Represents the input to <a>DescribePendingMaintenanceActions</a>.
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @sample AmazonDocDB.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * <p>
     * Forces a failover for a cluster.
     * </p>
     * <p>
     * A failover for a cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the cluster to
     * be the primary instance (the cluster writer).
     * </p>
     * <p>
     * If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one
     * exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
     * </p>
     * 
     * @param failoverDBClusterRequest
     *        Represents the input to <a>FailoverDBCluster</a>.
     * @return Result of the FailoverDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @sample AmazonDocDB.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * <p>
     * Lists all tags on an Amazon DocumentDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Represents the input to <a>ListTagsForResource</a>.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing snapshot.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modifies a setting for an Amazon DocumentDB cluster. You can change one or more database configuration parameters
     * by specifying these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBClusterRequest
     *        Represents the input to <a>ModifyDBCluster</a>.
     * @return Result of the ModifyDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws InvalidDBSubnetGroupStateException
     *         The subnet group can't be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @throws DBClusterParameterGroupNotFoundException
     *         <code>DBClusterParameterGroupName</code> doesn't refer to an existing cluster parameter group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the security group doesn't allow deletion.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @throws DBClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @sample AmazonDocDB.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or
     * maintenance window before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster
     * that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully
     * complete the create action before the parameter group is used as the default for a new cluster. This step is
     * especially important for parameters that are critical when creating the default database for a cluster, such as
     * the character set for the default database defined by the <code>character_set_database</code> parameter.
     * </p>
     * </important>
     * 
     * @param modifyDBClusterParameterGroupRequest
     *        Represents the input to <a>ModifyDBClusterParameterGroup</a>.
     * @return Result of the ModifyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The parameter group is in use, or it is in a state that is not valid. If you are trying to delete the
     *         parameter group, you can't delete it when the parameter group is in this state.
     * @sample AmazonDocDB.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual cluster snapshot.
     * </p>
     * <p>
     * To share a manual cluster snapshot with other accounts, specify <code>restore</code> as the
     * <code>AttributeName</code>, and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the accounts
     * that are authorized to restore the manual cluster snapshot. Use the value <code>all</code> to make the manual
     * cluster snapshot public, which means that it can be copied or restored by all accounts. Do not add the
     * <code>all</code> value for any manual cluster snapshots that contain private information that you don't want
     * available to all accounts. If a manual cluster snapshot is encrypted, it can be shared, but only by specifying a
     * list of authorized account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     *        Represents the input to <a>ModifyDBClusterSnapshotAttribute</a>.
     * @return Result of the ModifyDBClusterSnapshotAttribute operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonDocDB.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies settings for an instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     *        Represents the input to <a>ModifyDBInstance</a>.
     * @return Result of the ModifyDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the security group doesn't allow deletion.
     * @throws DBInstanceAlreadyExistsException
     *         You already have a instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws DBSecurityGroupNotFoundException
     *         <code>DBSecurityGroupName</code> doesn't refer to an existing security group.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified instance class isn't available in the specified Availability Zone.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws DBUpgradeDependencyFailureException
     *         The upgrade failed because a resource that the depends on can't be modified.
     * @throws StorageTypeNotSupportedException
     *         Storage of the specified <code>StorageType</code> can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP or Amazon EC2 security group isn't authorized for the specified security group.</p>
     *         <p>
     *         Amazon DocumentDB also might not be authorized to perform necessary actions on your behalf using IAM.
     * @throws CertificateNotFoundException
     *         <code>CertificateIdentifier</code> doesn't refer to an existing certificate.
     * @sample AmazonDocDB.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest);

    /**
     * <p>
     * Modifies an existing subnet group. subnet groups must contain at least one subnet in at least two Availability
     * Zones in the Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     *        Represents the input to <a>ModifyDBSubnetGroup</a>.
     * @return Result of the ModifyDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws DBSubnetQuotaExceededException
     *         The request would cause you to exceed the allowed number of subnets in a subnet group.
     * @throws SubnetAlreadyInUseException
     *         The subnet is already in use in the Availability Zone.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @sample AmazonDocDB.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     *        Represents the input to <a>ModifyEventSubscription</a>.
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic Amazon Resource Name (ARN).
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The provided category does not exist.
     * @sample AmazonDocDB.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modify a setting for an Amazon DocumentDB global cluster. You can change one or more configuration parameters
     * (for example: deletion protection), or the global cluster identifier by specifying these parameters and the new
     * values in the request.
     * </p>
     * <note>
     * <p>
     * This action only applies to Amazon DocumentDB clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     *        Represents the input to <a>ModifyGlobalCluster</a>.
     * @return Result of the ModifyGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global cluster.
     * @throws InvalidGlobalClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonDocDB.ModifyGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GlobalCluster modifyGlobalCluster(ModifyGlobalClusterRequest modifyGlobalClusterRequest);

    /**
     * <p>
     * You might need to reboot your instance, usually for maintenance reasons. For example, if you make certain
     * changes, or if you change the cluster parameter group that is associated with the instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting an instance restarts the database engine service. Rebooting an instance results in a momentary outage,
     * during which the instance status is set to <i>rebooting</i>.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     *        Represents the input to <a>RebootDBInstance</a>.
     * @return Result of the RebootDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @sample AmazonDocDB.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest);

    /**
     * <p>
     * Detaches an Amazon DocumentDB secondary cluster from a global cluster. The cluster becomes a standalone cluster
     * with read-write capability instead of being read-only and receiving data from a primary in a different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Amazon DocumentDB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     *        Represents the input to <a>RemoveFromGlobalCluster</a>.
     * @return Result of the RemoveFromGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     *         The <code>GlobalClusterIdentifier</code> doesn't refer to an existing global cluster.
     * @throws InvalidGlobalClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.RemoveFromGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    GlobalCluster removeFromGlobalCluster(RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest);

    /**
     * <p>
     * Removes a source identifier from an existing Amazon DocumentDB event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     *        Represents the input to <a>RemoveSourceIdentifierFromSubscription</a>.
     * @return Result of the RemoveSourceIdentifierFromSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonDocDB.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon DocumentDB resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input to <a>RemoveTagsFromResource</a>.
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <code>DBInstanceIdentifier</code> doesn't refer to an existing instance.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing snapshot.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @sample AmazonDocDB.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RemoveTagsFromResource" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Modifies the parameters of a cluster parameter group to the default value. To reset specific parameters, submit a
     * list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance reboot.
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     *        Represents the input to <a>ResetDBClusterParameterGroup</a>.
     * @return Result of the ResetDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The parameter group is in use, or it is in a state that is not valid. If you are trying to delete the
     *         parameter group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <code>DBParameterGroupName</code> doesn't refer to an existing parameter group.
     * @sample AmazonDocDB.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a new cluster from a snapshot or cluster snapshot.
     * </p>
     * <p>
     * If a snapshot is specified, the target cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a cluster snapshot is specified, the target cluster is created from the source cluster restore point with the
     * same configuration as the original source DB cluster, except that the new cluster is created with the default
     * security group.
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     *        Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
     * @return Result of the RestoreDBClusterFromSnapshot operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         The cluster can't be created because you have reached the maximum allowed quota of clusters.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws DBSnapshotNotFoundException
     *         <code>DBSnapshotIdentifier</code> doesn't refer to an existing snapshot.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @throws InsufficientDBClusterCapacityException
     *         The cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is not enough storage available for the current action. You might be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBSnapshotStateException
     *         The state of the snapshot doesn't allow deletion.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws InvalidRestoreException
     *         You cannot restore from a virtual private cloud (VPC) backup to a non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @throws KMSKeyNotAccessibleException
     *         An error occurred when accessing an KMS key.
     * @sample AmazonDocDB.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Restores a cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target cluster is
     * created from the source cluster with the same configuration as the original cluster, except that the new cluster
     * is created with the default security group.
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     *        Represents the input to <a>RestoreDBClusterToPointInTime</a>.
     * @return Result of the RestoreDBClusterToPointInTime operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         You already have a cluster with the given identifier.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws DBClusterQuotaExceededException
     *         The cluster can't be created because you have reached the maximum allowed quota of clusters.
     * @throws DBClusterSnapshotNotFoundException
     *         <code>DBClusterSnapshotIdentifier</code> doesn't refer to an existing cluster snapshot.
     * @throws DBSubnetGroupNotFoundException
     *         <code>DBSubnetGroupName</code> doesn't refer to an existing subnet group.
     * @throws InsufficientDBClusterCapacityException
     *         The cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is not enough storage available for the current action. You might be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBClusterSnapshotStateException
     *         The provided value isn't a valid cluster snapshot state.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBSnapshotStateException
     *         The state of the snapshot doesn't allow deletion.
     * @throws InvalidRestoreException
     *         You cannot restore from a virtual private cloud (VPC) backup to a non-VPC DB instance.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or multiple subnets were requested that are not all in a common
     *         virtual private cloud (VPC).
     * @throws InvalidVPCNetworkStateException
     *         The subnet group doesn't cover all Availability Zones after it is created because of changes that were
     *         made.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred when accessing an KMS key.
     * @throws StorageQuotaExceededException
     *         The request would cause you to exceed the allowed amount of storage available across all instances.
     * @sample AmazonDocDB.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

    /**
     * <p>
     * Restarts the stopped cluster that is specified by <code>DBClusterIdentifier</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param startDBClusterRequest
     * @return Result of the StartDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @sample AmazonDocDB.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster startDBCluster(StartDBClusterRequest startDBClusterRequest);

    /**
     * <p>
     * Stops the running cluster that is specified by <code>DBClusterIdentifier</code>. The cluster must be in the
     * <i>available</i> state. For more information, see <a
     * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-stop-start.html">Stopping and
     * Starting an Amazon DocumentDB Cluster</a>.
     * </p>
     * 
     * @param stopDBClusterRequest
     * @return Result of the StopDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <code>DBClusterIdentifier</code> doesn't refer to an existing cluster.
     * @throws InvalidDBClusterStateException
     *         The cluster isn't in a valid state.
     * @throws InvalidDBInstanceStateException
     *         The specified instance isn't in the <i>available</i> state.
     * @sample AmazonDocDB.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster stopDBCluster(StopDBClusterRequest stopDBClusterRequest);

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

    AmazonDocDBWaiters waiters();

}
