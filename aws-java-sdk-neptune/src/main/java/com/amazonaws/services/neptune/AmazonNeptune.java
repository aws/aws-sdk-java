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
package com.amazonaws.services.neptune;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.neptune.model.*;
import com.amazonaws.services.neptune.waiters.AmazonNeptuneWaiters;

/**
 * Interface for accessing Amazon Neptune.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.neptune.AbstractAmazonNeptune} instead.
 * </p>
 * <p>
 * <fullname>Amazon Neptune</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Neptune is a fast, reliable, fully-managed graph database service that makes it easy to build and run
 * applications that work with highly connected datasets. The core of Amazon Neptune is a purpose-built,
 * high-performance graph database engine optimized for storing billions of relationships and querying the graph with
 * milliseconds latency. Amazon Neptune supports popular graph models Property Graph and W3C's RDF, and their respective
 * query languages Apache TinkerPop Gremlin and SPARQL, allowing you to easily build queries that efficiently navigate
 * highly connected datasets. Neptune powers graph use cases such as recommendation engines, fraud detection, knowledge
 * graphs, drug discovery, and network security.
 * </p>
 * <p>
 * This interface reference for Amazon Neptune contains documentation for a programming or command line interface you
 * can use to manage Amazon Neptune. Note that Amazon Neptune is asynchronous, which means that some interfaces might
 * require techniques such as polling or callback functions to determine when a command has been applied. In this
 * reference, the parameter descriptions indicate whether a command is applied immediately, on the next instance reboot,
 * or during the maintenance window. The reference structure is as follows, and we list following some related topics
 * from the user guide.
 * </p>
 * <p>
 * <b>Amazon Neptune API Reference</b>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonNeptune {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds";

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role from an Neptune DB cluster.
     * </p>
     * 
     * @param addRoleToDBClusterRequest
     * @return Result of the AddRoleToDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws DBClusterRoleAlreadyExistsException
     *         The specified IAM role Amazon Resource Name (ARN) is already associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws DBClusterRoleQuotaExceededException
     *         You have exceeded the maximum number of IAM roles that can be associated with the specified DB cluster.
     * @sample AmazonNeptune.AddRoleToDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/AddRoleToDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest);

    /**
     * <p>
     * Adds a source identifier to an existing event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @return Result of the AddSourceIdentifierToSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @sample AmazonNeptune.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to
     * track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon
     * Neptune.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonNeptune.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @sample AmazonNeptune.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return Result of the CopyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonNeptune.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Copies a snapshot of a DB cluster.
     * </p>
     * <p>
     * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
     * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon Resource Name (ARN) of the shared DB cluster
     * snapshot.
     * </p>
     * <p>
     * You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you
     * call the <code>CopyDBClusterSnapshot</code> action is the destination AWS Region for the encrypted DB cluster
     * snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the
     * copy of the DB cluster snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBClusterSnapshot</code> action to be called in the source AWS Region where the DB cluster snapshot is
     * copied from. The pre-signed URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action
     * that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot
     * in the destination AWS Region. This is the same identifier for both the <code>CopyDBClusterSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB cluster snapshot will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS
     * Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:neptune-cluster1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new copy of the DB cluster snapshot in
     * the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value
     * as the <code>SourceDBClusterSnapshotIdentifier</code> in the pre-signed URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster snapshot is in "copying" status.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     * @return Result of the CopyDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         User already has a DB cluster snapshot with the given identifier.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonNeptune.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest);

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * 
     * @param copyDBParameterGroupRequest
     * @return Result of the CopyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @sample AmazonNeptune.CopyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest copyDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new Amazon Neptune DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a Read Replica of
     * another DB cluster or Amazon Neptune DB instance. For cross-region replication where the DB cluster identified by
     * <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * 
     * @param createDBClusterRequest
     * @return Result of the CreateDBCluster operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You may be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws DBClusterQuotaExceededException
     *         User attempted to create a new DB cluster and the user has already reached the maximum allowed DB cluster
     *         quota.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> does not refer to an existing DB Cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @sample AmazonNeptune.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster createDBCluster(CreateDBClusterRequest createDBClusterRequest);

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
     * creating it using <a>ModifyDBClusterParameterGroup</a>. Once you've created a DB cluster parameter group, you
     * need to associate it with your DB cluster using <a>ModifyDBCluster</a>. When you associate a new DB cluster
     * parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover
     * for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
     * fully complete the create action before the DB cluster parameter group is used as the default for a new DB
     * cluster. This is especially important for parameters that are critical when creating the default database for a
     * DB cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon Neptune console</a> or the <a>DescribeDBClusterParameters</a>
     * command to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBClusterParameterGroupRequest
     * @return Result of the CreateDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonNeptune.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a DB cluster.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     * @return Result of the CreateDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         User already has a DB cluster snapshot with the given identifier.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @sample AmazonNeptune.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     * @return Result of the CreateDBInstance operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         User already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         Specified DB instance class is not available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         Neptune may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonNeptune.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for the database engine used by the DB
     * instance. To provide custom values for any of the parameters, you must modify the group after creating it using
     * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group, you need to associate it with your DB
     * instance using <i>ModifyDBInstance</i>. When you associate a new DB parameter group with a running DB instance,
     * you need to reboot the DB instance without failover for the new DB parameter group and associated settings to
     * take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
     * the create action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the Amazon Neptune console or the <i>DescribeDBParameters</i> command to
     * verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest
     * @return Result of the CreateDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonNeptune.CreateDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
     * Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     * @return Result of the CreateDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupAlreadyExistsException
     *         <i>DBSubnetGroupName</i> is already used by an existing DB subnet group.
     * @throws DBSubnetGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB subnet groups.
     * @throws DBSubnetQuotaExceededException
     *         Request would result in user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonNeptune.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateDBSubnetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by
     * either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic
     * in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources
     * (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
     * want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
     * mydbinstance2 and EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
     * myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
     * your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
     * events generated from all Neptune sources belonging to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionAlreadyExistException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SourceNotFoundException
     * @sample AmazonNeptune.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CreateEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * 
     * @param deleteDBClusterRequest
     * @return Result of the DeleteDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         User already has a DB cluster snapshot with the given identifier.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @sample AmazonNeptune.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
     * with any DB clusters.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @return Result of the DeleteDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @return Result of the DeleteDBClusterSnapshot operation returned by the service.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @sample AmazonNeptune.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
     * be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon Neptune DB instance is <code>deleting</code> until
     * the DB snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action can't be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * If the specified DB instance is part of a DB cluster, you can't delete the DB instance if both of the following
     * conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a Read Replica of another DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first call the <a>PromoteReadReplicaDBCluster</a> API action to promote the
     * DB cluster so it's no longer a Read Replica. After the promotion completes, then call the
     * <code>DeleteDBInstance</code> API action to delete the final instance in the DB cluster.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     * @return Result of the DeleteDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @sample AmazonNeptune.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @return Result of the DeleteDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DeleteDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDBParameterGroupResult deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest);

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     * @return Result of the DeleteDBSubnetGroup operation returned by the service.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it is in use.
     * @throws InvalidDBSubnetStateException
     *         The DB subnet is not in the <i>available</i> state.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @sample AmazonNeptune.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

    /**
     * <p>
     * Deletes an event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     * @throws InvalidEventSubscriptionStateException
     * @sample AmazonNeptune.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DeleteEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @return Result of the DescribeDBClusterParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     * @return Result of the DescribeDBClusterParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest describeDBClusterParametersRequest);

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
     * DB cluster snapshot public or private, use the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     * @return Result of the DescribeDBClusterSnapshotAttributes operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @sample AmazonNeptune.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @return Result of the DescribeDBClusterSnapshots operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @sample AmazonNeptune.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about provisioned DB clusters. This API supports pagination.
     * </p>
     * 
     * @param describeDBClustersRequest
     * @return Result of the DescribeDBClusters operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonNeptune.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return Result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonNeptune.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * <p>
     * Returns information about provisioned instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     * @return Result of the DescribeDBInstances operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonNeptune.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a <code>DBParameterGroupName</code> is
     * specified, the list will contain only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest
     * @return Result of the DescribeDBParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DescribeDBParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return Result of the DescribeDBParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.DescribeDBParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBParameters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest describeDBParametersRequest);

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
     * descriptions of the specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     * @return Result of the DescribeDBSubnetGroups operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @sample AmazonNeptune.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @return Result of the DescribeEngineDefaultClusterParameters operation returned by the service.
     * @sample AmazonNeptune.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @sample AmazonNeptune.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonNeptune.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEventCategories"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     * @sample AmazonNeptune.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
     * days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
     * can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonNeptune.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @return Result of the DescribeOrderableDBInstanceOptions operation returned by the service.
     * @sample AmazonNeptune.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest);

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @sample AmazonNeptune.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * <p>
     * You can call <a>DescribeValidDBInstanceModifications</a> to learn what modifications you can make to your DB
     * instance. You can use this information when you call <a>ModifyDBInstance</a>.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest
     * @return Result of the DescribeValidDBInstanceModifications operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @sample AmazonNeptune.DescribeValidDBInstanceModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeValidDBInstanceModifications"
     *      target="_top">AWS API Documentation</a>
     */
    ValidDBInstanceModificationsMessage describeValidDBInstanceModifications(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest);

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the
     * primary instance (the cluster writer).
     * </p>
     * <p>
     * Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails.
     * You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * 
     * @param failoverDBClusterRequest
     * @return Result of the FailoverDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @sample AmazonNeptune.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * <p>
     * Lists all tags on an Amazon Neptune resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonNeptune.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBClusterRequest
     * @return Result of the ModifyDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> does not refer to an existing DB Cluster parameter group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group does not allow deletion.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
     * @sample AmazonNeptune.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DBCluster modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB cluster associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
     * fully complete the create action before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the Amazon Neptune console or the
     * <a>DescribeDBClusterParameters</a> command to verify that your DB cluster parameter group has been created or
     * modified.
     * </p>
     * </important>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @return Result of the ModifyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @sample AmazonNeptune.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB cluster snapshot. Use the value <code>all</code> to make
     * the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not
     * add the <code>all</code> value for any manual DB cluster snapshots that contain private information that you
     * don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but
     * only by specifying a list of authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use
     * <code>all</code> as a value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
     * cluster snapshot public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     * @return Result of the ModifyDBClusterSnapshotAttribute operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonNeptune.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
     * call <a>DescribeValidDBInstanceModifications</a> before you call <a>ModifyDBInstance</a>.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     * @return Result of the ModifyDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group does not allow deletion.
     * @throws DBInstanceAlreadyExistsException
     *         User already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws InsufficientDBInstanceCapacityException
     *         Specified DB instance class is not available in the specified Availability Zone.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     * @throws DBUpgradeDependencyFailureException
     *         The DB upgrade failed because a resource the DB depends on could not be modified.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         Neptune may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws CertificateNotFoundException
     *         <i>CertificateIdentifier</i> does not refer to an existing certificate.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonNeptune.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB instance associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
     * the modify action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the Amazon Neptune console or the <i>DescribeDBParameters</i> command to
     * verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @return Result of the ModifyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @sample AmazonNeptune.ModifyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest);

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     * @return Result of the ModifyDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSubnetQuotaExceededException
     *         Request would result in user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws SubnetAlreadyInUseException
     *         The DB subnet is already in use in the Availability Zone.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonNeptune.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing event notification subscription. Note that you can't modify the source identifiers using
     * this call; to change source identifiers for a subscription, use the <a>AddSourceIdentifierToSubscription</a> and
     * <a>RemoveSourceIdentifierFromSubscription</a> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType by using the <b>DescribeEventCategories</b>
     * action.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @sample AmazonNeptune.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Promotes a Read Replica DB cluster to a standalone DB cluster.
     * </p>
     * 
     * @param promoteReadReplicaDBClusterRequest
     * @return Result of the PromoteReadReplicaDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @sample AmazonNeptune.PromoteReadReplicaDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/PromoteReadReplicaDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest);

    /**
     * <p>
     * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
     * modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
     * outage, during which the DB instance status is set to rebooting.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @return Result of the RebootDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonNeptune.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest);

    /**
     * <p>
     * Disassociates an Identity and Access Management (IAM) role from a DB cluster.
     * </p>
     * 
     * @param removeRoleFromDBClusterRequest
     * @return Result of the RemoveRoleFromDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws DBClusterRoleNotFoundException
     *         The specified IAM role Amazon Resource Name (ARN) is not associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @sample AmazonNeptune.RemoveRoleFromDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RemoveRoleFromDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveRoleFromDBClusterResult removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest);

    /**
     * <p>
     * Removes a source identifier from an existing event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @return Result of the RemoveSourceIdentifierFromSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @sample AmazonNeptune.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon Neptune resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonNeptune.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RemoveTagsFromResource" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
     * a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <a>RebootDBInstance</a> request.
     * You must call <a>RebootDBInstance</a> for every DB instance in your DB cluster that you want the updated static
     * parameter to apply to.
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @return Result of the ResetDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
     * provide a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB
     * parameter group, specify the <code>DBParameterGroup</code> name and <code>ResetAllParameters</code> parameters.
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest
     * @return Result of the ResetDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you cannot delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonNeptune.ResetDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ResetDBParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
     * with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
     * default security group.
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     * @return Result of the RestoreDBClusterFromSnapshot operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         User attempted to create a new DB cluster and the user has already reached the maximum allowed DB cluster
     *         quota.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster does not have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You may be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from vpc backup to non-vpc DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws OptionGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonNeptune.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <a>CreateDBInstance</a> action to create DB instances for the restored DB cluster, specifying the identifier of
     * the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @return Result of the RestoreDBClusterToPointInTime operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws DBClusterQuotaExceededException
     *         User attempted to create a new DB cluster and the user has already reached the maximum allowed DB cluster
     *         quota.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster does not have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You may be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws InvalidDBClusterStateException
     *         The DB cluster is not in a valid state.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws InvalidRestoreException
     *         Cannot restore from vpc backup to non-vpc DB instance.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws OptionGroupNotFoundException
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @sample AmazonNeptune.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

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

    AmazonNeptuneWaiters waiters();

}
