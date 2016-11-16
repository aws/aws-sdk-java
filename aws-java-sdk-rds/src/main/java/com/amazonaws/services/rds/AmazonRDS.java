/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.services.rds.waiters.AmazonRDSWaiters;

/**
 * Interface for accessing Amazon RDS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rds.AbstractAmazonRDS} instead.
 * </p>
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizeable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * database instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Note that Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command has been applied. In this reference, the
 * parameter descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list following some related topics from the user
 * guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
public interface AmazonRDS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds";

    /**
     * Overrides the default endpoint for this client ("rds.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "rds.amazonaws.com") or a full URL, including the protocol (ex:
     * "rds.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "rds.amazonaws.com") or a full URL, including the protocol (ex: "rds.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRDS#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Authorizing.AWSServices.html">Authorizing
     * Amazon Aurora to Access Other AWS Services On Your Behalf</a>.
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
     * @sample AmazonRDS.AddRoleToDBCluster
     */
    AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest);

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @return Result of the AddSourceIdentifierToSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.AddSourceIdentifierToSubscription
     */
    EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
     * cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.AddTagsToResource
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
     * @sample AmazonRDS.ApplyPendingMaintenanceAction
     */
    ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
     * can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
     * Second, IP ranges are available if the application accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an EC2 security group in one region to an Amazon RDS DB instance in another.
     * You cannot authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param authorizeDBSecurityGroupIngressRequest
     * @return Result of the AuthorizeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group does not allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDRIP or EC2 security group is already authorized for the specified DB security group.
     * @throws AuthorizationQuotaExceededException
     *         DB security group authorization quota has been reached.
     * @sample AmazonRDS.AuthorizeDBSecurityGroupIngress
     */
    DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest);

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
     * @sample AmazonRDS.CopyDBClusterParameterGroup
     */
    DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     * @sample AmazonRDS.CopyDBClusterSnapshot
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
     * @sample AmazonRDS.CopyDBParameterGroup
     */
    DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest copyDBParameterGroupRequest);

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, the <code>SourceDBSnapshotIdentifier</code> must be the ARN
     * of the shared DB snapshot.
     * </p>
     * 
     * @param copyDBSnapshotRequest
     * @return Result of the CopyDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonRDS.CopyDBSnapshot
     */
    DBSnapshot copyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest);

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest
     * @return Result of the CopyOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CopyOptionGroup
     */
    OptionGroup copyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest);

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a Read Replica of
     * another DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> does not refer to an existing DB Cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonRDS.CreateDBCluster
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
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
     * This is especially important for parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the <a>DescribeDBClusterParameters</a>
     * command to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     * @return Result of the CreateDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBClusterParameterGroup
     */
    DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     * @sample AmazonRDS.CreateDBClusterSnapshot
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
     *         The specified option group could not be found.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         RDS may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonRDS.CreateDBInstance
     */
    DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a DB instance for a DB instance running MySQL, MariaDB, or PostgreSQL that acts as a Read Replica of a
     * source DB instance.
     * </p>
     * <p>
     * All Read Replica DB instances are created as Single-AZ deployments with backups disabled. All other DB instance
     * attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance,
     * except as specified below.
     * </p>
     * <important>
     * <p>
     * The source DB instance must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return Result of the CreateDBInstanceReadReplica operation returned by the service.
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
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBSubnetGroupNotAllowedException
     *         Indicates that the DBSubnetGroup should not be specified while creating read replicas that lie in the
     *         same region as the source instance.
     * @throws InvalidDBSubnetGroupException
     *         Indicates the DBSubnetGroup does not belong to the same VPC as that of an existing cross region read
     *         replica of the same source instance.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonRDS.CreateDBInstanceReadReplica
     */
    DBInstance createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest);

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
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * create action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest
     * @return Result of the CreateDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBParameterGroup
     */
    DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * 
     * @param createDBSecurityGroupRequest
     * @return Result of the CreateDBSecurityGroup operation returned by the service.
     * @throws DBSecurityGroupAlreadyExistsException
     *         A DB security group with the name specified in <i>DBSecurityGroupName</i> already exists.
     * @throws DBSecurityGroupQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB security groups.
     * @throws DBSecurityGroupNotSupportedException
     *         A DB security group is not allowed for this action.
     * @sample AmazonRDS.CreateDBSecurityGroup
     */
    DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest createDBSecurityGroupRequest);

    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
     * </p>
     * 
     * @param createDBSnapshotRequest
     * @return Result of the CreateDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws SnapshotQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB snapshots.
     * @sample AmazonRDS.CreateDBSnapshot
     */
    DBSnapshot createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest);

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the
     * region.
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
     * @sample AmazonRDS.CreateDBSubnetGroup
     */
    DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created
     * by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in
     * Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources
     * (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
     * want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
     * mydbinstance2 and EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
     * myDBInstance1, you will be notified of all the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you will receive notice of the events for that source type for
     * all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
     * of events generated from all RDS sources belonging to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionAlreadyExistException
     *         The supplied subscription name already exists.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.CreateEventSubscription
     */
    EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * 
     * @param createOptionGroupRequest
     * @return Result of the CreateOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CreateOptionGroup
     */
    OptionGroup createOptionGroup(CreateOptionGroupRequest createOptionGroupRequest);

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and cannot be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
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
     * @sample AmazonRDS.DeleteDBCluster
     */
    DBCluster deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted cannot be associated
     * with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @return Result of the DeleteDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBClusterParameterGroup
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
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @return Result of the DeleteDBClusterSnapshot operation returned by the service.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value is not a valid DB cluster snapshot state.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DeleteDBClusterSnapshot
     */
    DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and cannot be recovered. Manual DB snapshots of the DB instance
     * to be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB instance is <code>deleting</code> until the DB
     * snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action cannot be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you cannot delete the DB instance if the
     * following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a Read Replica of another Amazon Aurora DB cluster.
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
     * @sample AmazonRDS.DeleteDBInstance
     */
    DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted cannot be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @return Result of the DeleteDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBParameterGroup
     */
    DeleteDBParameterGroupResult deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest);

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest
     * @return Result of the DeleteDBSecurityGroup operation returned by the service.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group does not allow deletion.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @sample AmazonRDS.DeleteDBSecurityGroup
     */
    DeleteDBSecurityGroupResult deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest);

    /**
     * <p>
     * Deletes a DBSnapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DBSnapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest
     * @return Result of the DeleteDBSnapshot operation returned by the service.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.DeleteDBSnapshot
     */
    DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest);

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
     * @sample AmazonRDS.DeleteDBSubnetGroup
     */
    DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws InvalidEventSubscriptionStateException
     *         This error can occur if someone else is modifying a subscription. You should retry the action.
     * @sample AmazonRDS.DeleteEventSubscription
     */
    EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest
     * @return Result of the DeleteOptionGroup operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws InvalidOptionGroupStateException
     *         The option group is not in the <i>available</i> state.
     * @sample AmazonRDS.DeleteOptionGroup
     */
    DeleteOptionGroupResult deleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest);

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
     * such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
     * toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRDS.DescribeAccountAttributes
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributes(DescribeAccountAttributesRequest)
     */
    DescribeAccountAttributesResult describeAccountAttributes();

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws CertificateNotFoundException
     *         <i>CertificateIdentifier</i> does not refer to an existing certificate.
     * @sample AmazonRDS.DescribeCertificates
     */
    DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * Simplified method form for invoking the DescribeCertificates operation.
     *
     * @see #describeCertificates(DescribeCertificatesRequest)
     */
    DescribeCertificatesResult describeCertificates();

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @return Result of the DescribeDBClusterParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameterGroups
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation.
     *
     * @see #describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest)
     */
    DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups();

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     * @return Result of the DescribeDBClusterParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameters
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
     * @sample AmazonRDS.DescribeDBClusterSnapshotAttributes
     */
    DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @return Result of the DescribeDBClusterSnapshots operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DescribeDBClusterSnapshots
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation.
     *
     * @see #describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest)
     */
    DescribeDBClusterSnapshotsResult describeDBClusterSnapshots();

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeDBClustersRequest
     * @return Result of the DescribeDBClusters operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @sample AmazonRDS.DescribeDBClusters
     */
    DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * Simplified method form for invoking the DescribeDBClusters operation.
     *
     * @see #describeDBClusters(DescribeDBClustersRequest)
     */
    DescribeDBClustersResult describeDBClusters();

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return Result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonRDS.DescribeDBEngineVersions
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation.
     *
     * @see #describeDBEngineVersions(DescribeDBEngineVersionsRequest)
     */
    DescribeDBEngineVersionsResult describeDBEngineVersions();

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     * @return Result of the DescribeDBInstances operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBInstances
     */
    DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeDBInstances operation.
     *
     * @see #describeDBInstances(DescribeDBInstancesRequest)
     */
    DescribeDBInstancesResult describeDBInstances();

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * 
     * @param describeDBLogFilesRequest
     * @return Result of the DescribeDBLogFiles operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBLogFiles
     */
    DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest describeDBLogFilesRequest);

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
     * @sample AmazonRDS.DescribeDBParameterGroups
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation.
     *
     * @see #describeDBParameterGroups(DescribeDBParameterGroupsRequest)
     */
    DescribeDBParameterGroupsResult describeDBParameterGroups();

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return Result of the DescribeDBParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBParameters
     */
    DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest describeDBParametersRequest);

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
     * 
     * @param describeDBSecurityGroupsRequest
     * @return Result of the DescribeDBSecurityGroups operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @sample AmazonRDS.DescribeDBSecurityGroups
     */
    DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation.
     *
     * @see #describeDBSecurityGroups(DescribeDBSecurityGroupsRequest)
     */
    DescribeDBSecurityGroupsResult describeDBSecurityGroups();

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB snapshot. If <code>all</code> is included in the list of values for the <code>restore</code> attribute,
     * then the manual DB snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB
     * snapshot public or private, use the <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest
     * @return Result of the DescribeDBSnapshotAttributes operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshotAttributes
     */
    DBSnapshotAttributesResult describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation.
     *
     * @see #describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest)
     */
    DBSnapshotAttributesResult describeDBSnapshotAttributes();

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest
     * @return Result of the DescribeDBSnapshots operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshots
     */
    DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest describeDBSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation.
     *
     * @see #describeDBSnapshots(DescribeDBSnapshotsRequest)
     */
    DescribeDBSnapshotsResult describeDBSnapshots();

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
     * @sample AmazonRDS.DescribeDBSubnetGroups
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation.
     *
     * @see #describeDBSubnetGroups(DescribeDBSubnetGroupsRequest)
     */
    DescribeDBSubnetGroupsResult describeDBSubnetGroups();

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @return Result of the DescribeEngineDefaultClusterParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultClusterParameters
     */
    EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultParameters
     */
    EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
     * see a list of the event categories and source types in the <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events</a> topic in the <i>Amazon
     * RDS User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRDS.DescribeEventCategories
     */
    DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategories(DescribeEventCategoriesRequest)
     */
    DescribeEventCategoriesResult describeEventCategories();

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
     *         The subscription name does not exist.
     * @sample AmazonRDS.DescribeEventSubscriptions
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptions(DescribeEventSubscriptionsRequest)
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions();

    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
     * days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
     * can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonRDS.DescribeEvents
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

    /**
     * <p>
     * Describes all available options.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest
     * @return Result of the DescribeOptionGroupOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOptionGroupOptions
     */
    DescribeOptionGroupOptionsResult describeOptionGroupOptions(DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest);

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest
     * @return Result of the DescribeOptionGroups operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.DescribeOptionGroups
     */
    DescribeOptionGroupsResult describeOptionGroups(DescribeOptionGroupsRequest describeOptionGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation.
     *
     * @see #describeOptionGroups(DescribeOptionGroupsRequest)
     */
    DescribeOptionGroupsResult describeOptionGroups();

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @return Result of the DescribeOrderableDBInstanceOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOrderableDBInstanceOptions
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
     * @sample AmazonRDS.DescribePendingMaintenanceActions
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation.
     *
     * @see #describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest)
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions();

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest
     * @return Result of the DescribeReservedDBInstances operation returned by the service.
     * @throws ReservedDBInstanceNotFoundException
     *         The specified reserved DB Instance not found.
     * @sample AmazonRDS.DescribeReservedDBInstances
     */
    DescribeReservedDBInstancesResult describeReservedDBInstances(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation.
     *
     * @see #describeReservedDBInstances(DescribeReservedDBInstancesRequest)
     */
    DescribeReservedDBInstancesResult describeReservedDBInstances();

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest
     * @return Result of the DescribeReservedDBInstancesOfferings operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @sample AmazonRDS.DescribeReservedDBInstancesOfferings
     */
    DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation.
     *
     * @see #describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest)
     */
    DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings();

    /**
     * <p>
     * Returns a list of the source AWS regions where the current AWS region can create a Read Replica or copy a DB
     * snapshot from. This API action supports pagination.
     * </p>
     * 
     * @param describeSourceRegionsRequest
     * @return Result of the DescribeSourceRegions operation returned by the service.
     * @sample AmazonRDS.DescribeSourceRegions
     */
    DescribeSourceRegionsResult describeSourceRegions(DescribeSourceRegionsRequest describeSourceRegionsRequest);

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest
     * @return Result of the DownloadDBLogFilePortion operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBLogFileNotFoundException
     *         <i>LogFileName</i> does not refer to an existing DB log file.
     * @sample AmazonRDS.DownloadDBLogFilePortion
     */
    DownloadDBLogFilePortionResult downloadDBLogFilePortion(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest);

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the read-only instances in the DB cluster to the master DB instance
     * (the cluster writer) and deletes the current primary instance.
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to a read-only instance, if one exists, when the primary instance
     * fails. You can force a failover when you want to simulate a failure of a DB instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     * @sample AmazonRDS.FailoverDBCluster
     */
    DBCluster failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * Simplified method form for invoking the FailoverDBCluster operation.
     *
     * @see #failoverDBCluster(FailoverDBClusterRequest)
     */
    DBCluster failoverDBCluster();

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
     * specifying these parameters and the new values in the request. For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     * @sample AmazonRDS.ModifyDBCluster
     */
    DBCluster modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB cluster associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS
     * console</a> or the <a>DescribeDBClusterParameters</a> command to verify that your DB cluster parameter group has
     * been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @return Result of the ModifyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @sample AmazonRDS.ModifyDBClusterParameterGroup
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
     * don't want available to all AWS accounts.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
     * cluster snapshot public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action.
     * </p>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it cannot be shared.
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
     * @sample AmazonRDS.ModifyDBClusterSnapshotAttribute
     */
    DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request.
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
     *         The specified option group could not be found.
     * @throws DBUpgradeDependencyFailureException
     *         The DB upgrade failed because a resource the DB depends on could not be modified.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         RDS may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws CertificateNotFoundException
     *         <i>CertificateIdentifier</i> does not refer to an existing certificate.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonRDS.ModifyDBInstance
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
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * modify action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @return Result of the ModifyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @sample AmazonRDS.ModifyDBParameterGroup
     */
    ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make the
     * manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
     * public or private, use the <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * <p>
     * If the manual DB snapshot is encrypted, it cannot be shared.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest
     * @return Result of the ModifyDBSnapshotAttribute operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonRDS.ModifyDBSnapshotAttribute
     */
    DBSnapshotAttributesResult modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest);

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the region.
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
     * @sample AmazonRDS.ModifyDBSubnetGroup
     */
    DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. Note that you cannot modify the source identifiers
     * using this call; to change source identifiers for a subscription, use the
     * <a>AddSourceIdentifierToSubscription</a> and <a>RemoveSourceIdentifierFromSubscription</a> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the Amazon RDS
     * User Guide or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @sample AmazonRDS.ModifyEventSubscription
     */
    EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest
     * @return Result of the ModifyOptionGroup operation returned by the service.
     * @throws InvalidOptionGroupStateException
     *         The option group is not in the <i>available</i> state.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.ModifyOptionGroup
     */
    OptionGroup modifyOptionGroup(ModifyOptionGroupRequest modifyOptionGroupRequest);

    /**
     * <p>
     * Promotes a Read Replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <p>
     * We recommend that you enable automated backups on your Read Replica before promoting the Read Replica. This
     * ensures that no backup is taken during the promotion process. Once the instance is promoted to a primary
     * instance, backups are taken based on your backup settings.
     * </p>
     * </note>
     * 
     * @param promoteReadReplicaRequest
     * @return Result of the PromoteReadReplica operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonRDS.PromoteReadReplica
     */
    DBInstance promoteReadReplica(PromoteReadReplicaRequest promoteReadReplicaRequest);

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
     * @sample AmazonRDS.PromoteReadReplicaDBCluster
     */
    DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest);

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest
     * @return Result of the PurchaseReservedDBInstancesOffering operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws ReservedDBInstanceAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @throws ReservedDBInstanceQuotaExceededException
     *         Request would exceed the user's DB Instance quota.
     * @sample AmazonRDS.PurchaseReservedDBInstancesOffering
     */
    ReservedDBInstance purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest);

    /**
     * <p>
     * Rebooting a DB instance restarts the database engine service. A reboot also applies to the DB instance any
     * modifications to the associated DB parameter group that were pending. Rebooting a DB instance results in a
     * momentary outage of the instance, during which the DB instance status is set to rebooting. If the RDS instance is
     * configured for MultiAZ, it is possible that the reboot will be conducted through a failover. An Amazon RDS event
     * is created when the reboot is completed.
     * </p>
     * <p>
     * If your DB instance is deployed in multiple Availability Zones, you can force a failover from one AZ to the other
     * during the reboot. You might force a failover to test the availability of your DB instance deployment or to
     * restore operations to the original AZ after a failover occurs.
     * </p>
     * <p>
     * The time required to reboot is a function of the specific database engine's crash recovery process. To improve
     * the reboot time, we recommend that you reduce database activities as much as possible during the reboot process
     * to reduce rollback activity for in-transit transactions.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @return Result of the RebootDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @sample AmazonRDS.RebootDBInstance
     */
    DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest);

    /**
     * <p>
     * Disassociates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Authorizing.AWSServices.html">Authorizing
     * Amazon Aurora to Access Other AWS Services On Your Behalf</a>.
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
     * @sample AmazonRDS.RemoveRoleFromDBCluster
     */
    RemoveRoleFromDBClusterResult removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest);

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @return Result of the RemoveSourceIdentifierFromSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.RemoveSourceIdentifierFromSubscription
     */
    EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @sample AmazonRDS.RemoveTagsFromResource
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
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @return Result of the ResetDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBClusterParameterGroup
     */
    ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters
     * submit a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB
     * parameter group, specify the <code>DBParameterGroup</code> name and <code>ResetAllParameters</code> parameters.
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest
     * @return Result of the ResetDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group cannot be deleted because it is in use.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBParameterGroup
     */
    ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest);

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
     * access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in <a
     * href="AmazonRDS/latest/UserGuide/Aurora.Migrate.MySQL.html#Aurora.Migrate.MySQL.S3">Migrating Data from MySQL by
     * Using an Amazon S3 Bucket</a>.
     * </p>
     * 
     * @param restoreDBClusterFromS3Request
     * @return Result of the RestoreDBClusterFromS3 operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
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
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name could not be found or Amazon RDS is not authorized to access the
     *         specified Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and
     *         try again.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> does not refer to an existing DB Cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You may be able to resolve this error by
     *         updating your subnet group to use different Availability Zones that have more storage available.
     * @sample AmazonRDS.RestoreDBClusterFromS3
     */
    DBCluster restoreDBClusterFromS3(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request);

    /**
     * <p>
     * Creates a new DB cluster from a DB cluster snapshot. The target DB cluster is created from the source DB cluster
     * restore point with the same configuration as the original source DB cluster, except that the new DB cluster is
     * created with the default security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
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
     *         The specified option group could not be found.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonRDS.RestoreDBClusterFromSnapshot
     */
    DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html">Aurora on Amazon RDS</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @return Result of the RestoreDBClusterToPointInTime operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         User already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         User attempted to create a new DB cluster and the user has already reached the maximum allowed DB cluster
     *         quota.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
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
     *         The specified option group could not be found.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @sample AmazonRDS.RestoreDBClusterToPointInTime
     */
    DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
     * point with the most of original configuration with the default security group and the default DB parameter group.
     * By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server
     * instance that has an option group that is associated with mirroring; in this case, the instance becomes a
     * mirrored AZ deployment and not a single-AZ deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new, restored DB instance, then rename your
     * original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS does not allow two DB
     * instances with the same name. Once you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB
     * instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest
     * @return Result of the RestoreDBInstanceFromDBSnapshot operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         User already has a DB instance with the given identifier.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
     * @throws InstanceQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         Specified DB instance class is not available in the specified Availability Zone.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot does not allow deletion.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from vpc backup to non-vpc DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         RDS may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonRDS.RestoreDBInstanceFromDBSnapshot
     */
    DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest);

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
     * identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
     * the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration, but in a system-selected availability
     * zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
     * the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
     * has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
     * and not a single-AZ deployment.
     * </p>
     * 
     * @param restoreDBInstanceToPointInTimeRequest
     * @return Result of the RestoreDBInstanceToPointInTime operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         User already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
     * @throws InstanceQuotaExceededException
     *         Request would result in user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         Specified DB instance class is not available in the specified Availability Zone.
     * @throws InvalidDBInstanceStateException
     *         The specified DB instance is not in the <i>available</i> state.
     * @throws PointInTimeRestoreNotEnabledException
     *         <i>SourceDBInstanceIdentifier</i> refers to a DB instance with <i>BackupRetentionPeriod</i> equal to 0.
     * @throws StorageQuotaExceededException
     *         Request would result in user exceeding the allowed amount of storage available across all DB instances.
     * @throws InvalidVPCNetworkStateException
     *         DB subnet group does not cover all Availability Zones after it is created because users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from vpc backup to non-vpc DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         <i>StorageType</i> specified cannot be associated with the DB Instance.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         RDS may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         Error accessing KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <i>Domain</i> does not refer to an existing Active Directory Domain.
     * @sample AmazonRDS.RestoreDBInstanceToPointInTime
     */
    DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest);

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
     * 
     * @param revokeDBSecurityGroupIngressRequest
     * @return Result of the RevokeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
     * @throws AuthorizationNotFoundException
     *         Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.</p>
     *         <p>
     *         RDS may not also be authorized via IAM to perform necessary actions on your behalf.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group does not allow deletion.
     * @sample AmazonRDS.RevokeDBSecurityGroupIngress
     */
    DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest);

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

    AmazonRDSWaiters waiters();

}
