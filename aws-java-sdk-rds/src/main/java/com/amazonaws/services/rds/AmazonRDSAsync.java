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
package com.amazonaws.services.rds;

import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;

/**
 * Interface for accessing Amazon RDS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rds.AbstractAmazonRDSAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p/>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizeable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, Db2,
 * or Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use
 * today with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Amazon RDS is asynchronous, which means that some interfaces might require techniques such
 * as polling or callback functions to determine when a command has been applied. In this reference, the parameter
 * descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
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
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
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
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRDSAsync extends AmazonRDS {

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role with a DB cluster.
     * </p>
     * 
     * @param addRoleToDBClusterRequest
     * @return A Java Future containing the result of the AddRoleToDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.AddRoleToDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(AddRoleToDBClusterRequest addRoleToDBClusterRequest);

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role with a DB cluster.
     * </p>
     * 
     * @param addRoleToDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddRoleToDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.AddRoleToDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(AddRoleToDBClusterRequest addRoleToDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<AddRoleToDBClusterRequest, AddRoleToDBClusterResult> asyncHandler);

    /**
     * <p>
     * Associates an Amazon Web Services Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param addRoleToDBInstanceRequest
     * @return A Java Future containing the result of the AddRoleToDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.AddRoleToDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddRoleToDBInstanceResult> addRoleToDBInstanceAsync(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest);

    /**
     * <p>
     * Associates an Amazon Web Services Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param addRoleToDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddRoleToDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.AddRoleToDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddRoleToDBInstanceResult> addRoleToDBInstanceAsync(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<AddRoleToDBInstanceRequest, AddRoleToDBInstanceResult> asyncHandler);

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @return A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
     *         service.
     * @sample AmazonRDSAsync.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest);

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
     * cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonRDSAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
     * cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AmazonRDSAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AmazonRDSAsync.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest,
            com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler);

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
     * can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
     * Second, IP ranges are available if the application accessing your database is running on the internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <p>
     * You can't authorize ingress from an EC2 security group in one Amazon Web Services Region to an Amazon RDS DB
     * instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB
     * instance in another.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param authorizeDBSecurityGroupIngressRequest
     * @return A Java Future containing the result of the AuthorizeDBSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRDSAsync.AuthorizeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AuthorizeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(
            AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest);

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
     * can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
     * Second, IP ranges are available if the application accessing your database is running on the internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <p>
     * You can't authorize ingress from an EC2 security group in one Amazon Web Services Region to an Amazon RDS DB
     * instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB
     * instance in another.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param authorizeDBSecurityGroupIngressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeDBSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.AuthorizeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AuthorizeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(
            AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler);

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html">
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action applies only to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest
     * @return A Java Future containing the result of the BacktrackDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.BacktrackDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BacktrackDBClusterResult> backtrackDBClusterAsync(BacktrackDBClusterRequest backtrackDBClusterRequest);

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html">
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action applies only to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BacktrackDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.BacktrackDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BacktrackDBClusterResult> backtrackDBClusterAsync(BacktrackDBClusterRequest backtrackDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<BacktrackDBClusterRequest, BacktrackDBClusterResult> asyncHandler);

    /**
     * <p>
     * Cancels an export task in progress that is exporting a snapshot or cluster to Amazon S3. Any data that has
     * already been written to the S3 bucket isn't removed.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AmazonRDSAsync.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels an export task in progress that is exporting a snapshot or cluster to Amazon S3. Any data that has
     * already been written to the S3 bucket isn't removed.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler);

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * You can't copy a default DB cluster parameter group. Instead, create a new custom DB cluster parameter group,
     * which copies the default parameters and values for the specified DB cluster parameter group family.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * You can't copy a default DB cluster parameter group. Instead, create a new custom DB cluster parameter group,
     * which copies the default parameters and values for the specified DB cluster parameter group family.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(
            CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler);

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
     * You can copy an encrypted DB cluster snapshot from another Amazon Web Services Region. In that case, the Amazon
     * Web Services Region where you call the <code>CopyDBClusterSnapshot</code> operation is the destination Amazon Web
     * Services Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot
     * from another Amazon Web Services Region, you must provide the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier
     * for the key to use to encrypt the copy of the DB cluster snapshot in the destination Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new copy of the DB cluster snapshot in
     * the destination Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the ARN format for the source Amazon Web Services Region and is
     * the same value as the <code>SourceDBClusterSnapshotIdentifier</code> in the presigned URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted Amazon Aurora DB cluster snapshots from one Amazon Web Services Region
     * to another, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html">
     * Copying a Snapshot</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     * @return A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest);

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
     * You can copy an encrypted DB cluster snapshot from another Amazon Web Services Region. In that case, the Amazon
     * Web Services Region where you call the <code>CopyDBClusterSnapshot</code> operation is the destination Amazon Web
     * Services Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot
     * from another Amazon Web Services Region, you must provide the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier
     * for the key to use to encrypt the copy of the DB cluster snapshot in the destination Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new copy of the DB cluster snapshot in
     * the destination Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the ARN format for the source Amazon Web Services Region and is
     * the same value as the <code>SourceDBClusterSnapshotIdentifier</code> in the presigned URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted Amazon Aurora DB cluster snapshots from one Amazon Web Services Region
     * to another, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html">
     * Copying a Snapshot</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param copyDBClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * <note>
     * <p>
     * You can't copy a default DB parameter group. Instead, create a new custom DB parameter group, which copies the
     * default parameters and values for the specified DB parameter group family.
     * </p>
     * </note>
     * 
     * @param copyDBParameterGroupRequest
     * @return A Java Future containing the result of the CopyDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.CopyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest copyDBParameterGroupRequest);

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * <note>
     * <p>
     * You can't copy a default DB parameter group. Instead, create a new custom DB parameter group, which copies the
     * default parameters and values for the specified DB parameter group family.
     * </p>
     * </note>
     * 
     * @param copyDBParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CopyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest copyDBParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBParameterGroupRequest, DBParameterGroup> asyncHandler);

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the <code>available</code> state.
     * </p>
     * <p>
     * You can copy a snapshot from one Amazon Web Services Region to another. In that case, the Amazon Web Services
     * Region where you call the <code>CopyDBSnapshot</code> operation is the destination Amazon Web Services Region for
     * the DB snapshot copy.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot">Copying
     * a DB Snapshot</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param copyDBSnapshotRequest
     * @return A Java Future containing the result of the CopyDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.CopyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(CopyDBSnapshotRequest copyDBSnapshotRequest);

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the <code>available</code> state.
     * </p>
     * <p>
     * You can copy a snapshot from one Amazon Web Services Region to another. In that case, the Amazon Web Services
     * Region where you call the <code>CopyDBSnapshot</code> operation is the destination Amazon Web Services Region for
     * the DB snapshot copy.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot">Copying
     * a DB Snapshot</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param copyDBSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CopyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(CopyDBSnapshotRequest copyDBSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDBSnapshotRequest, DBSnapshot> asyncHandler);

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest
     * @return A Java Future containing the result of the CopyOptionGroup operation returned by the service.
     * @sample AmazonRDSAsync.CopyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(CopyOptionGroupRequest copyOptionGroupRequest);

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyOptionGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CopyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(CopyOptionGroupRequest copyOptionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CopyOptionGroupRequest, OptionGroup> asyncHandler);

    /**
     * <p>
     * Creates a blue/green deployment.
     * </p>
     * <p>
     * A blue/green deployment creates a staging environment that copies the production environment. In a blue/green
     * deployment, the blue environment is the current production environment. The green environment is the staging
     * environment. The staging environment stays in sync with the current production environment using logical
     * replication.
     * </p>
     * <p>
     * You can make changes to the databases in the green environment without affecting production workloads. For
     * example, you can upgrade the major or minor DB engine version, change database parameters, or make schema changes
     * in the staging environment. You can thoroughly test changes in the green environment. When ready, you can switch
     * over the environments to promote the green environment to be the new production environment. The switchover
     * typically takes under a minute.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createBlueGreenDeploymentRequest
     * @return A Java Future containing the result of the CreateBlueGreenDeployment operation returned by the service.
     * @sample AmazonRDSAsync.CreateBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateBlueGreenDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBlueGreenDeploymentResult> createBlueGreenDeploymentAsync(
            CreateBlueGreenDeploymentRequest createBlueGreenDeploymentRequest);

    /**
     * <p>
     * Creates a blue/green deployment.
     * </p>
     * <p>
     * A blue/green deployment creates a staging environment that copies the production environment. In a blue/green
     * deployment, the blue environment is the current production environment. The green environment is the staging
     * environment. The staging environment stays in sync with the current production environment using logical
     * replication.
     * </p>
     * <p>
     * You can make changes to the databases in the green environment without affecting production workloads. For
     * example, you can upgrade the major or minor DB engine version, change database parameters, or make schema changes
     * in the staging environment. You can thoroughly test changes in the green environment. When ready, you can switch
     * over the environments to promote the green environment to be the new production environment. The switchover
     * typically takes under a minute.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createBlueGreenDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBlueGreenDeployment operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateBlueGreenDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBlueGreenDeploymentResult> createBlueGreenDeploymentAsync(
            CreateBlueGreenDeploymentRequest createBlueGreenDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBlueGreenDeploymentRequest, CreateBlueGreenDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a custom DB engine version (CEV).
     * </p>
     * 
     * @param createCustomDBEngineVersionRequest
     * @return A Java Future containing the result of the CreateCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsync.CreateCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomDBEngineVersionResult> createCustomDBEngineVersionAsync(
            CreateCustomDBEngineVersionRequest createCustomDBEngineVersionRequest);

    /**
     * <p>
     * Creates a custom DB engine version (CEV).
     * </p>
     * 
     * @param createCustomDBEngineVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomDBEngineVersionResult> createCustomDBEngineVersionAsync(
            CreateCustomDBEngineVersionRequest createCustomDBEngineVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomDBEngineVersionRequest, CreateCustomDBEngineVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster or Multi-AZ DB cluster.
     * </p>
     * <p>
     * If you create an Aurora DB cluster, the request creates an empty cluster. You must explicitly create the writer
     * instance for your DB cluster using the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html">CreateDBInstance</a>
     * operation. If you create a Multi-AZ DB cluster, the request creates a writer and two reader DB instances for you,
     * each in a different Availability Zone.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create an Amazon Aurora DB cluster as a
     * read replica of another DB cluster or Amazon RDS for MySQL or PostgreSQL DB instance. For more information about
     * Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html">What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * You can also use the <code>ReplicationSourceIdentifier</code> parameter to create a Multi-AZ DB cluster read
     * replica with an RDS for MySQL or PostgreSQL DB instance as the source. For more information about Multi-AZ DB
     * clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html">Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterRequest
     * @return A Java Future containing the result of the CreateDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest createDBClusterRequest);

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster or Multi-AZ DB cluster.
     * </p>
     * <p>
     * If you create an Aurora DB cluster, the request creates an empty cluster. You must explicitly create the writer
     * instance for your DB cluster using the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html">CreateDBInstance</a>
     * operation. If you create a Multi-AZ DB cluster, the request creates a writer and two reader DB instances for you,
     * each in a different Availability Zone.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create an Amazon Aurora DB cluster as a
     * read replica of another DB cluster or Amazon RDS for MySQL or PostgreSQL DB instance. For more information about
     * Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html">What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * You can also use the <code>ReplicationSourceIdentifier</code> parameter to create a Multi-AZ DB cluster read
     * replica with an RDS for MySQL or PostgreSQL DB instance as the source. For more information about Multi-AZ DB
     * clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html">Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest createDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action applies only to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @return A Java Future containing the result of the CreateDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(CreateDBClusterEndpointRequest createDBClusterEndpointRequest);

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action applies only to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(CreateDBClusterEndpointRequest createDBClusterEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterEndpointRequest, CreateDBClusterEndpointResult> asyncHandler);

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
     * creating it using <code>ModifyDBClusterParameterGroup</code>. Once you've created a DB cluster parameter group,
     * you need to associate it with your DB cluster using <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * When you associate a new DB cluster parameter group with a running Aurora DB cluster, reboot the DB instances in
     * the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <p>
     * When you associate a new DB cluster parameter group with a running Multi-AZ DB cluster, reboot the DB cluster
     * without failover for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
     * This is especially important for parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the <code>DescribeDBClusterParameters</code>
     * operation to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     * @return A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest);

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
     * creating it using <code>ModifyDBClusterParameterGroup</code>. Once you've created a DB cluster parameter group,
     * you need to associate it with your DB cluster using <code>ModifyDBCluster</code>.
     * </p>
     * <p>
     * When you associate a new DB cluster parameter group with a running Aurora DB cluster, reboot the DB instances in
     * the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <p>
     * When you associate a new DB cluster parameter group with a running Multi-AZ DB cluster, reboot the DB cluster
     * without failover for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
     * This is especially important for parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the <code>DescribeDBClusterParameters</code>
     * operation to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     * @return A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param createDBClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * <p>
     * The new DB instance can be an RDS DB instance, or it can be a DB instance in an Aurora DB cluster. For an Aurora
     * DB cluster, you can call this operation multiple times to add more than one DB instance to the cluster.
     * </p>
     * <p>
     * For more information about creating an RDS DB instance, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateDBInstance.html"> Creating an Amazon RDS
     * DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about creating a DB instance in an Aurora DB cluster, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html"> Creating an
     * Amazon Aurora DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createDBInstanceRequest
     * @return A Java Future containing the result of the CreateDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest createDBInstanceRequest);

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * <p>
     * The new DB instance can be an RDS DB instance, or it can be a DB instance in an Aurora DB cluster. For an Aurora
     * DB cluster, you can call this operation multiple times to add more than one DB instance to the cluster.
     * </p>
     * <p>
     * For more information about creating an RDS DB instance, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateDBInstance.html"> Creating an Amazon RDS
     * DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about creating a DB instance in an Aurora DB cluster, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html"> Creating an
     * Amazon Aurora DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest createDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Creates a new DB instance that acts as a read replica for an existing source DB instance or Multi-AZ DB cluster.
     * You can create a read replica for a DB instance running Db2, MariaDB, MySQL, Oracle, PostgreSQL, or SQL Server.
     * You can create a read replica for a Multi-AZ DB cluster running MySQL or PostgreSQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with read replicas</a>
     * and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html#multi-az-db-clusters-migrating-to-instance-with-read-replica"
     * >Migrating from a Multi-AZ DB cluster to a DB instance using a read replica</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this operation. To create a DB instance for an Aurora DB cluster, use the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * All read replica DB instances are created with backups disabled. All other attributes (including DB security
     * groups and DB parameter groups) are inherited from the source DB instance or cluster, except as specified.
     * </p>
     * <important>
     * <p>
     * Your source DB instance or cluster must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return A Java Future containing the result of the CreateDBInstanceReadReplica operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBInstanceReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstanceReadReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest);

    /**
     * <p>
     * Creates a new DB instance that acts as a read replica for an existing source DB instance or Multi-AZ DB cluster.
     * You can create a read replica for a DB instance running Db2, MariaDB, MySQL, Oracle, PostgreSQL, or SQL Server.
     * You can create a read replica for a Multi-AZ DB cluster running MySQL or PostgreSQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with read replicas</a>
     * and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html#multi-az-db-clusters-migrating-to-instance-with-read-replica"
     * >Migrating from a Multi-AZ DB cluster to a DB instance using a read replica</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this operation. To create a DB instance for an Aurora DB cluster, use the
     * <code>CreateDBInstance</code> operation.
     * </p>
     * <p>
     * All read replica DB instances are created with backups disabled. All other attributes (including DB security
     * groups and DB parameter groups) are inherited from the source DB instance or cluster, except as specified.
     * </p>
     * <important>
     * <p>
     * Your source DB instance or cluster must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBInstanceReadReplica operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBInstanceReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstanceReadReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBInstanceReadReplicaRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for the database engine used by the DB
     * instance. To provide custom values for any of the parameters, you must modify the group after creating it using
     * <code>ModifyDBParameterGroup</code>. Once you've created a DB parameter group, you need to associate it with your
     * DB instance using <code>ModifyDBInstance</code>. When you associate a new DB parameter group with a running DB
     * instance, you need to reboot the DB instance without failover for the new DB parameter group and associated
     * settings to take effect.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
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
     * @return A Java Future containing the result of the CreateDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest createDBParameterGroupRequest);

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for the database engine used by the DB
     * instance. To provide custom values for any of the parameters, you must modify the group after creating it using
     * <code>ModifyDBParameterGroup</code>. Once you've created a DB parameter group, you need to associate it with your
     * DB instance using <code>ModifyDBInstance</code>. When you associate a new DB parameter group with a running DB
     * instance, you need to reboot the DB instance without failover for the new DB parameter group and associated
     * settings to take effect.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest createDBParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler);

    /**
     * <p>
     * Creates a new DB proxy.
     * </p>
     * 
     * @param createDBProxyRequest
     * @return A Java Future containing the result of the CreateDBProxy operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBProxyResult> createDBProxyAsync(CreateDBProxyRequest createDBProxyRequest);

    /**
     * <p>
     * Creates a new DB proxy.
     * </p>
     * 
     * @param createDBProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBProxy operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBProxyResult> createDBProxyAsync(CreateDBProxyRequest createDBProxyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBProxyRequest, CreateDBProxyResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>DBProxyEndpoint</code>. Only applies to proxies that are associated with Aurora DB clusters. You
     * can use DB proxy endpoints to specify read/write or read-only access to the DB cluster. You can also use DB proxy
     * endpoints to access a DB proxy through a different VPC than the proxy's default VPC.
     * </p>
     * 
     * @param createDBProxyEndpointRequest
     * @return A Java Future containing the result of the CreateDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBProxyEndpointResult> createDBProxyEndpointAsync(CreateDBProxyEndpointRequest createDBProxyEndpointRequest);

    /**
     * <p>
     * Creates a <code>DBProxyEndpoint</code>. Only applies to proxies that are associated with Aurora DB clusters. You
     * can use DB proxy endpoints to specify read/write or read-only access to the DB cluster. You can also use DB proxy
     * endpoints to access a DB proxy through a different VPC than the proxy's default VPC.
     * </p>
     * 
     * @param createDBProxyEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBProxyEndpointResult> createDBProxyEndpointAsync(CreateDBProxyEndpointRequest createDBProxyEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBProxyEndpointRequest, CreateDBProxyEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest
     * @return A Java Future containing the result of the CreateDBSecurityGroup operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest createDBSecurityGroupRequest);

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBSecurityGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest createDBSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBSecurityGroupRequest, DBSecurityGroup> asyncHandler);

    /**
     * <p>
     * Creates a new DB shard group for Aurora Limitless Database. You must enable Aurora Limitless Database to create a
     * DB shard group.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param createDBShardGroupRequest
     * @return A Java Future containing the result of the CreateDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBShardGroupResult> createDBShardGroupAsync(CreateDBShardGroupRequest createDBShardGroupRequest);

    /**
     * <p>
     * Creates a new DB shard group for Aurora Limitless Database. You must enable Aurora Limitless Database to create a
     * DB shard group.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param createDBShardGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDBShardGroupResult> createDBShardGroupAsync(CreateDBShardGroupRequest createDBShardGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBShardGroupRequest, CreateDBShardGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a DB instance. The source DB instance must be in the <code>available</code> or
     * <code>storage-optimization</code> state.
     * </p>
     * 
     * @param createDBSnapshotRequest
     * @return A Java Future containing the result of the CreateDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest createDBSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a DB instance. The source DB instance must be in the <code>available</code> or
     * <code>storage-optimization</code> state.
     * </p>
     * 
     * @param createDBSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest createDBSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBSnapshotRequest, DBSnapshot> asyncHandler);

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the
     * Amazon Web Services Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     * @return A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsync.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest createDBSubnetGroupRequest);

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the
     * Amazon Web Services Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest createDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler);

    /**
     * <p>
     * Creates an RDS event notification subscription. This operation requires a topic Amazon Resource Name (ARN)
     * created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a
     * topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of and provide a list
     * of RDS sources (<code>SourceIds</code>) that triggers the events. You can also provide a list of event categories
     * (<code>EventCategories</code>) for events that you want to be notified of. For example, you can specify
     * <code>SourceType</code> = <code>db-instance</code>, <code>SourceIds</code> = <code>mydbinstance1</code>,
     * <code>mydbinstance2</code> and <code>EventCategories</code> = <code>Availability</code>, <code>Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType</code> =
     * <code>db-instance</code> and <code>SourceIds</code> = <code>myDBInstance1</code>, you are notified of all the
     * <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify <code>SourceIds</code>, you receive notice of the events for that source type for all your RDS sources.
     * If you don't specify either the SourceType or the <code>SourceIds</code>, you are notified of events generated
     * from all RDS sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about subscribing to an event for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Subscribing.html"> Subscribing to Amazon
     * RDS event notification</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about subscribing to an event for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Subscribing.html"> Subscribing to
     * Amazon RDS event notification</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonRDSAsync.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an RDS event notification subscription. This operation requires a topic Amazon Resource Name (ARN)
     * created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a
     * topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) that you want to be notified of and provide a list
     * of RDS sources (<code>SourceIds</code>) that triggers the events. You can also provide a list of event categories
     * (<code>EventCategories</code>) for events that you want to be notified of. For example, you can specify
     * <code>SourceType</code> = <code>db-instance</code>, <code>SourceIds</code> = <code>mydbinstance1</code>,
     * <code>mydbinstance2</code> and <code>EventCategories</code> = <code>Availability</code>, <code>Backup</code>.
     * </p>
     * <p>
     * If you specify both the <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType</code> =
     * <code>db-instance</code> and <code>SourceIds</code> = <code>myDBInstance1</code>, you are notified of all the
     * <code>db-instance</code> events for the specified source. If you specify a <code>SourceType</code> but do not
     * specify <code>SourceIds</code>, you receive notice of the events for that source type for all your RDS sources.
     * If you don't specify either the SourceType or the <code>SourceIds</code>, you are notified of events generated
     * from all RDS sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about subscribing to an event for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Subscribing.html"> Subscribing to Amazon
     * RDS event notification</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about subscribing to an event for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Subscribing.html"> Subscribing to
     * Amazon RDS event notification</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Creates an Aurora global database spread across multiple Amazon Web Services Regions. The global database
     * contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives
     * data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then create the primary and secondary DB clusters
     * in the global database. Or you can specify an existing Aurora cluster during the create operation, and this
     * cluster becomes the primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @return A Java Future containing the result of the CreateGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.CreateGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> createGlobalClusterAsync(CreateGlobalClusterRequest createGlobalClusterRequest);

    /**
     * <p>
     * Creates an Aurora global database spread across multiple Amazon Web Services Regions. The global database
     * contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives
     * data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then create the primary and secondary DB clusters
     * in the global database. Or you can specify an existing Aurora cluster during the create operation, and this
     * cluster becomes the primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> createGlobalClusterAsync(CreateGlobalClusterRequest createGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Creates a zero-ETL integration with Amazon Redshift.
     * </p>
     * 
     * @param createIntegrationRequest
     * @return A Java Future containing the result of the CreateIntegration operation returned by the service.
     * @sample AmazonRDSAsync.CreateIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(CreateIntegrationRequest createIntegrationRequest);

    /**
     * <p>
     * Creates a zero-ETL integration with Amazon Redshift.
     * </p>
     * 
     * @param createIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntegration operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(CreateIntegrationRequest createIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntegrationRequest, CreateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param createOptionGroupRequest
     * @return A Java Future containing the result of the CreateOptionGroup operation returned by the service.
     * @sample AmazonRDSAsync.CreateOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(CreateOptionGroupRequest createOptionGroupRequest);

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param createOptionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOptionGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(CreateOptionGroupRequest createOptionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOptionGroupRequest, OptionGroup> asyncHandler);

    /**
     * <p>
     * Creates a tenant database in a DB instance that uses the multi-tenant configuration. Only RDS for Oracle
     * container database (CDB) instances are supported.
     * </p>
     * 
     * @param createTenantDatabaseRequest
     * @return A Java Future containing the result of the CreateTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsync.CreateTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> createTenantDatabaseAsync(CreateTenantDatabaseRequest createTenantDatabaseRequest);

    /**
     * <p>
     * Creates a tenant database in a DB instance that uses the multi-tenant configuration. Only RDS for Oracle
     * container database (CDB) instances are supported.
     * </p>
     * 
     * @param createTenantDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsyncHandler.CreateTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> createTenantDatabaseAsync(CreateTenantDatabaseRequest createTenantDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTenantDatabaseRequest, TenantDatabase> asyncHandler);

    /**
     * <p>
     * Deletes a blue/green deployment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param deleteBlueGreenDeploymentRequest
     * @return A Java Future containing the result of the DeleteBlueGreenDeployment operation returned by the service.
     * @sample AmazonRDSAsync.DeleteBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteBlueGreenDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBlueGreenDeploymentResult> deleteBlueGreenDeploymentAsync(
            DeleteBlueGreenDeploymentRequest deleteBlueGreenDeploymentRequest);

    /**
     * <p>
     * Deletes a blue/green deployment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param deleteBlueGreenDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBlueGreenDeployment operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteBlueGreenDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBlueGreenDeploymentResult> deleteBlueGreenDeploymentAsync(
            DeleteBlueGreenDeploymentRequest deleteBlueGreenDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBlueGreenDeploymentRequest, DeleteBlueGreenDeploymentResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom engine version. To run this command, make sure you meet the following prerequisites:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CEV must not be the default for RDS Custom. If it is, change the default before running this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CEV must not be associated with an RDS Custom DB instance, RDS Custom instance snapshot, or automated backup
     * of your RDS Custom instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Typically, deletion takes a few minutes.
     * </p>
     * <note>
     * <p>
     * The MediaImport service that imports files from Amazon S3 to create CEVs isn't integrated with Amazon Web
     * Services CloudTrail. If you turn on data logging for Amazon RDS in CloudTrail, calls to the
     * <code>DeleteCustomDbEngineVersion</code> event aren't logged. However, you might see calls from the API gateway
     * that accesses your Amazon S3 bucket. These calls originate from the MediaImport service for the
     * <code>DeleteCustomDbEngineVersion</code> event.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.delete">Deleting a
     * CEV</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteCustomDBEngineVersionRequest
     * @return A Java Future containing the result of the DeleteCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsync.DeleteCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomDBEngineVersionResult> deleteCustomDBEngineVersionAsync(
            DeleteCustomDBEngineVersionRequest deleteCustomDBEngineVersionRequest);

    /**
     * <p>
     * Deletes a custom engine version. To run this command, make sure you meet the following prerequisites:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CEV must not be the default for RDS Custom. If it is, change the default before running this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CEV must not be associated with an RDS Custom DB instance, RDS Custom instance snapshot, or automated backup
     * of your RDS Custom instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Typically, deletion takes a few minutes.
     * </p>
     * <note>
     * <p>
     * The MediaImport service that imports files from Amazon S3 to create CEVs isn't integrated with Amazon Web
     * Services CloudTrail. If you turn on data logging for Amazon RDS in CloudTrail, calls to the
     * <code>DeleteCustomDbEngineVersion</code> event aren't logged. However, you might see calls from the API gateway
     * that accesses your Amazon S3 bucket. These calls originate from the MediaImport service for the
     * <code>DeleteCustomDbEngineVersion</code> event.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.delete">Deleting a
     * CEV</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteCustomDBEngineVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomDBEngineVersionResult> deleteCustomDBEngineVersionAsync(
            DeleteCustomDBEngineVersionRequest deleteCustomDBEngineVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomDBEngineVersionRequest, DeleteCustomDBEngineVersionResult> asyncHandler);

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p>
     * If you're deleting a Multi-AZ DB cluster with read replicas, all cluster members are terminated and read replicas
     * are promoted to standalone instances.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterRequest
     * @return A Java Future containing the result of the DeleteDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest deleteDBClusterRequest);

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p>
     * If you're deleting a Multi-AZ DB cluster with read replicas, all cluster members are terminated and read replicas
     * are promoted to standalone instances.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest deleteDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Deletes automated backups using the <code>DbClusterResourceId</code> value of the source DB cluster or the Amazon
     * Resource Name (ARN) of the automated backups.
     * </p>
     * 
     * @param deleteDBClusterAutomatedBackupRequest
     * @return A Java Future containing the result of the DeleteDBClusterAutomatedBackup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DeleteDBClusterAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterAutomatedBackup> deleteDBClusterAutomatedBackupAsync(
            DeleteDBClusterAutomatedBackupRequest deleteDBClusterAutomatedBackupRequest);

    /**
     * <p>
     * Deletes automated backups using the <code>DbClusterResourceId</code> value of the source DB cluster or the Amazon
     * Resource Name (ARN) of the automated backups.
     * </p>
     * 
     * @param deleteDBClusterAutomatedBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterAutomatedBackup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DeleteDBClusterAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterAutomatedBackup> deleteDBClusterAutomatedBackupAsync(
            DeleteDBClusterAutomatedBackupRequest deleteDBClusterAutomatedBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterAutomatedBackupRequest, DBClusterAutomatedBackup> asyncHandler);

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @return A Java Future containing the result of the DeleteDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest);

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterEndpointRequest, DeleteDBClusterEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
     * with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @return A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
     * with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler);

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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @return A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest);

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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that
     * instance are deleted and can't be recovered. However, manual DB snapshots of the DB instance aren't deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot, the status of the Amazon RDS DB instance is <code>deleting</code> until the
     * DB snapshot is created. This operation can't be canceled or reverted after it begins. To monitor the status of
     * this operation, use <code>DescribeDBInstance</code>.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when you skip
     * creation of the final snapshot with the <code>SkipFinalSnapshot</code> parameter.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a read replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first use the <code>PromoteReadReplicaDBCluster</code> operation to promote
     * the DB cluster so that it's no longer a read replica. After the promotion completes, use the
     * <code>DeleteDBInstance</code> operation to delete the final instance in the DB cluster.
     * </p>
     * <important>
     * <p>
     * For RDS Custom DB instances, deleting the DB instance permanently deletes the EC2 instance and the associated EBS
     * volumes. Make sure that you don't terminate or delete these resources before you delete the DB instance.
     * Otherwise, deleting the DB instance and creation of the final snapshot might fail.
     * </p>
     * </important>
     * 
     * @param deleteDBInstanceRequest
     * @return A Java Future containing the result of the DeleteDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * Deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that
     * instance are deleted and can't be recovered. However, manual DB snapshots of the DB instance aren't deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot, the status of the Amazon RDS DB instance is <code>deleting</code> until the
     * DB snapshot is created. This operation can't be canceled or reverted after it begins. To monitor the status of
     * this operation, use <code>DescribeDBInstance</code>.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when you skip
     * creation of the final snapshot with the <code>SkipFinalSnapshot</code> parameter.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a read replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first use the <code>PromoteReadReplicaDBCluster</code> operation to promote
     * the DB cluster so that it's no longer a read replica. After the promotion completes, use the
     * <code>DeleteDBInstance</code> operation to delete the final instance in the DB cluster.
     * </p>
     * <important>
     * <p>
     * For RDS Custom DB instances, deleting the DB instance permanently deletes the EC2 instance and the associated EBS
     * volumes. Make sure that you don't terminate or delete these resources before you delete the DB instance.
     * Otherwise, deleting the DB instance and creation of the final snapshot might fail.
     * </p>
     * </important>
     * 
     * @param deleteDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Deletes automated backups using the <code>DbiResourceId</code> value of the source DB instance or the Amazon
     * Resource Name (ARN) of the automated backups.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest
     *        Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
     * @return A Java Future containing the result of the DeleteDBInstanceAutomatedBackup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DeleteDBInstanceAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstanceAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> deleteDBInstanceAutomatedBackupAsync(
            DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest);

    /**
     * <p>
     * Deletes automated backups using the <code>DbiResourceId</code> value of the source DB instance or the Amazon
     * Resource Name (ARN) of the automated backups.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest
     *        Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBInstanceAutomatedBackup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DeleteDBInstanceAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstanceAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> deleteDBInstanceAutomatedBackupAsync(
            DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceAutomatedBackupRequest, DBInstanceAutomatedBackup> asyncHandler);

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @return A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest);

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing DB proxy.
     * </p>
     * 
     * @param deleteDBProxyRequest
     * @return A Java Future containing the result of the DeleteDBProxy operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBProxyResult> deleteDBProxyAsync(DeleteDBProxyRequest deleteDBProxyRequest);

    /**
     * <p>
     * Deletes an existing DB proxy.
     * </p>
     * 
     * @param deleteDBProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBProxy operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBProxyResult> deleteDBProxyAsync(DeleteDBProxyRequest deleteDBProxyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBProxyRequest, DeleteDBProxyResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>DBProxyEndpoint</code>. Doing so removes the ability to access the DB proxy using the endpoint
     * that you defined. The endpoint that you delete might have provided capabilities such as read/write or read-only
     * operations, or using a different VPC than the DB proxy's default VPC.
     * </p>
     * 
     * @param deleteDBProxyEndpointRequest
     * @return A Java Future containing the result of the DeleteDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBProxyEndpointResult> deleteDBProxyEndpointAsync(DeleteDBProxyEndpointRequest deleteDBProxyEndpointRequest);

    /**
     * <p>
     * Deletes a <code>DBProxyEndpoint</code>. Doing so removes the ability to access the DB proxy using the endpoint
     * that you defined. The endpoint that you delete might have provided capabilities such as read/write or read-only
     * operations, or using a different VPC than the DB proxy's default VPC.
     * </p>
     * 
     * @param deleteDBProxyEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBProxyEndpointResult> deleteDBProxyEndpointAsync(DeleteDBProxyEndpointRequest deleteDBProxyEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBProxyEndpointRequest, DeleteDBProxyEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest
     * @return A Java Future containing the result of the DeleteDBSecurityGroup operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest);

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBSecurityGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSecurityGroupRequest, DeleteDBSecurityGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Aurora Limitless Database DB shard group.
     * </p>
     * 
     * @param deleteDBShardGroupRequest
     * @return A Java Future containing the result of the DeleteDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBShardGroupResult> deleteDBShardGroupAsync(DeleteDBShardGroupRequest deleteDBShardGroupRequest);

    /**
     * <p>
     * Deletes an Aurora Limitless Database DB shard group.
     * </p>
     * 
     * @param deleteDBShardGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBShardGroupResult> deleteDBShardGroupAsync(DeleteDBShardGroupRequest deleteDBShardGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBShardGroupRequest, DeleteDBShardGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest
     * @return A Java Future containing the result of the DeleteDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest deleteDBSnapshotRequest);

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest deleteDBSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSnapshotRequest, DBSnapshot> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonRDSAsync.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
     * first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @return A Java Future containing the result of the DeleteGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.DeleteGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> deleteGlobalClusterAsync(DeleteGlobalClusterRequest deleteGlobalClusterRequest);

    /**
     * <p>
     * Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
     * first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> deleteGlobalClusterAsync(DeleteGlobalClusterRequest deleteGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Deletes a zero-ETL integration with Amazon Redshift.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonRDSAsync.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Deletes a zero-ETL integration with Amazon Redshift.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest
     * @return A Java Future containing the result of the DeleteOptionGroup operation returned by the service.
     * @sample AmazonRDSAsync.DeleteOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(DeleteOptionGroupRequest deleteOptionGroupRequest);

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOptionGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(DeleteOptionGroupRequest deleteOptionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOptionGroupRequest, DeleteOptionGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a tenant database from your DB instance. This command only applies to RDS for Oracle container database
     * (CDB) instances.
     * </p>
     * <p>
     * You can't delete a tenant database when it is the only tenant in the DB instance.
     * </p>
     * 
     * @param deleteTenantDatabaseRequest
     * @return A Java Future containing the result of the DeleteTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsync.DeleteTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> deleteTenantDatabaseAsync(DeleteTenantDatabaseRequest deleteTenantDatabaseRequest);

    /**
     * <p>
     * Deletes a tenant database from your DB instance. This command only applies to RDS for Oracle container database
     * (CDB) instances.
     * </p>
     * <p>
     * You can't delete a tenant database when it is the only tenant in the DB instance.
     * </p>
     * 
     * @param deleteTenantDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeleteTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> deleteTenantDatabaseAsync(DeleteTenantDatabaseRequest deleteTenantDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTenantDatabaseRequest, TenantDatabase> asyncHandler);

    /**
     * <p>
     * Remove the association between one or more <code>DBProxyTarget</code> data structures and a
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param deregisterDBProxyTargetsRequest
     * @return A Java Future containing the result of the DeregisterDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsync.DeregisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeregisterDBProxyTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDBProxyTargetsResult> deregisterDBProxyTargetsAsync(DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest);

    /**
     * <p>
     * Remove the association between one or more <code>DBProxyTarget</code> data structures and a
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param deregisterDBProxyTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DeregisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeregisterDBProxyTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDBProxyTargetsResult> deregisterDBProxyTargetsAsync(DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterDBProxyTargetsRequest, DeregisterDBProxyTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
     * such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
     * toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRDSAsync.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
     * such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
     * toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync();

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more blue/green deployments.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeBlueGreenDeploymentsRequest
     * @return A Java Future containing the result of the DescribeBlueGreenDeployments operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeBlueGreenDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeBlueGreenDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBlueGreenDeploymentsResult> describeBlueGreenDeploymentsAsync(
            DescribeBlueGreenDeploymentsRequest describeBlueGreenDeploymentsRequest);

    /**
     * <p>
     * Describes one or more blue/green deployments.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeBlueGreenDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBlueGreenDeployments operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeBlueGreenDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeBlueGreenDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBlueGreenDeploymentsResult> describeBlueGreenDeploymentsAsync(
            DescribeBlueGreenDeploymentsRequest describeBlueGreenDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBlueGreenDeploymentsRequest, DescribeBlueGreenDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Lists the set of certificate authority (CA) certificates provided by Amazon RDS for this Amazon Web Services
     * account.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AmazonRDSAsync.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * <p>
     * Lists the set of certificate authority (CA) certificates provided by Amazon RDS for this Amazon Web Services
     * account.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCertificates operation.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest)
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync();

    /**
     * Simplified method form for invoking the DescribeCertificates operation with an AsyncHandler.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler);

    /**
     * <p>
     * Displays backups for both current and deleted DB clusters. For example, use this operation to find details about
     * automated backups for previously deleted clusters. Current clusters are returned for both the
     * <code>DescribeDBClusterAutomatedBackups</code> and <code>DescribeDBClusters</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBClusterAutomatedBackupsRequest
     * @return A Java Future containing the result of the DescribeDBClusterAutomatedBackups operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBClusterAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterAutomatedBackupsResult> describeDBClusterAutomatedBackupsAsync(
            DescribeDBClusterAutomatedBackupsRequest describeDBClusterAutomatedBackupsRequest);

    /**
     * <p>
     * Displays backups for both current and deleted DB clusters. For example, use this operation to find details about
     * automated backups for previously deleted clusters. Current clusters are returned for both the
     * <code>DescribeDBClusterAutomatedBackups</code> and <code>DescribeDBClusters</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBClusterAutomatedBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterAutomatedBackups operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterAutomatedBackupsResult> describeDBClusterAutomatedBackupsAsync(
            DescribeDBClusterAutomatedBackupsRequest describeDBClusterAutomatedBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterAutomatedBackupsRequest, DescribeDBClusterAutomatedBackupsResult> asyncHandler);

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest
     * @return A Java Future containing the result of the DescribeDBClusterBacktracks operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBClusterBacktracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterBacktracksResult> describeDBClusterBacktracksAsync(
            DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest);

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterBacktracks operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterBacktracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterBacktracksResult> describeDBClusterBacktracksAsync(
            DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterBacktracksRequest, DescribeDBClusterBacktracksResult> asyncHandler);

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @return A Java Future containing the result of the DescribeDBClusterEndpoints operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBClusterEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(
            DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest);

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterEndpoints operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(
            DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterEndpointsRequest, DescribeDBClusterEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @return A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest)
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     * @return A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other Amazon Web Services accounts, <code>DescribeDBClusterSnapshotAttributes</code>
     * returns the <code>restore</code> attribute and a list of IDs for the Amazon Web Services accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If <code>all</code> is included in the list of
     * values for the <code>restore</code> attribute, then the manual DB cluster snapshot is public and can be copied or
     * restored by all Amazon Web Services accounts.
     * </p>
     * <p>
     * To add or remove access for an Amazon Web Services account to copy or restore a manual DB cluster snapshot, or to
     * make the manual DB cluster snapshot public or private, use the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     * @return A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest);

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other Amazon Web Services accounts, <code>DescribeDBClusterSnapshotAttributes</code>
     * returns the <code>restore</code> attribute and a list of IDs for the Amazon Web Services accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If <code>all</code> is included in the list of
     * values for the <code>restore</code> attribute, then the manual DB cluster snapshot is public and can be copied or
     * restored by all Amazon Web Services accounts.
     * </p>
     * <p>
     * To add or remove access for an Amazon Web Services account to copy or restore a manual DB cluster snapshot, or to
     * make the manual DB cluster snapshot public or private, use the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @return A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Describes existing Amazon Aurora DB clusters and Multi-AZ DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * 
     * @param describeDBClustersRequest
     * @return A Java Future containing the result of the DescribeDBClusters operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest describeDBClustersRequest);

    /**
     * <p>
     * Describes existing Amazon Aurora DB clusters and Multi-AZ DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * 
     * @param describeDBClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBClusters operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest describeDBClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBClusters operation.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest)
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync();

    /**
     * Simplified method form for invoking the DescribeDBClusters operation with an AsyncHandler.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler);

    /**
     * <p>
     * Describes the properties of specific versions of DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest);

    /**
     * <p>
     * Describes the properties of specific versions of DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest)
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync();

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation with an AsyncHandler.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use this operation to find details about
     * automated backups for previously deleted instances. Current instances with retention periods greater than zero
     * (0) are returned for both the <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest
     *        Parameter input for DescribeDBInstanceAutomatedBackups.
     * @return A Java Future containing the result of the DescribeDBInstanceAutomatedBackups operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBInstanceAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstanceAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstanceAutomatedBackupsResult> describeDBInstanceAutomatedBackupsAsync(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest);

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use this operation to find details about
     * automated backups for previously deleted instances. Current instances with retention periods greater than zero
     * (0) are returned for both the <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest
     *        Parameter input for DescribeDBInstanceAutomatedBackups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBInstanceAutomatedBackups operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBInstanceAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstanceAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstanceAutomatedBackupsResult> describeDBInstanceAutomatedBackupsAsync(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstanceAutomatedBackupsRequest, DescribeDBInstanceAutomatedBackupsResult> asyncHandler);

    /**
     * <p>
     * Describes provisioned RDS instances. This API supports pagination.
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBInstancesRequest
     * @return A Java Future containing the result of the DescribeDBInstances operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest describeDBInstancesRequest);

    /**
     * <p>
     * Describes provisioned RDS instances. This API supports pagination.
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBInstances operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest describeDBInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBInstances operation.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest)
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeDBInstances operation with an AsyncHandler.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param describeDBLogFilesRequest
     * @return A Java Future containing the result of the DescribeDBLogFiles operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBLogFiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(DescribeDBLogFilesRequest describeDBLogFilesRequest);

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param describeDBLogFilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBLogFiles operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBLogFiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(DescribeDBLogFilesRequest describeDBLogFilesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBLogFilesRequest, DescribeDBLogFilesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a <code>DBParameterGroupName</code> is
     * specified, the list will contain only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest
     * @return A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a <code>DBParameterGroupName</code> is
     * specified, the list will contain only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest)
     */
    java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return A Java Future containing the result of the DescribeDBParameters operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest describeDBParametersRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBParameters operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest describeDBParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBParametersRequest, DescribeDBParametersResult> asyncHandler);

    /**
     * <p>
     * Returns information about DB proxies.
     * </p>
     * 
     * @param describeDBProxiesRequest
     * @return A Java Future containing the result of the DescribeDBProxies operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBProxies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxiesResult> describeDBProxiesAsync(DescribeDBProxiesRequest describeDBProxiesRequest);

    /**
     * <p>
     * Returns information about DB proxies.
     * </p>
     * 
     * @param describeDBProxiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBProxies operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBProxies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxiesResult> describeDBProxiesAsync(DescribeDBProxiesRequest describeDBProxiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBProxiesRequest, DescribeDBProxiesResult> asyncHandler);

    /**
     * <p>
     * Returns information about DB proxy endpoints.
     * </p>
     * 
     * @param describeDBProxyEndpointsRequest
     * @return A Java Future containing the result of the DescribeDBProxyEndpoints operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBProxyEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyEndpointsResult> describeDBProxyEndpointsAsync(DescribeDBProxyEndpointsRequest describeDBProxyEndpointsRequest);

    /**
     * <p>
     * Returns information about DB proxy endpoints.
     * </p>
     * 
     * @param describeDBProxyEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBProxyEndpoints operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBProxyEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyEndpointsResult> describeDBProxyEndpointsAsync(DescribeDBProxyEndpointsRequest describeDBProxyEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBProxyEndpointsRequest, DescribeDBProxyEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns information about DB proxy target groups, represented by <code>DBProxyTargetGroup</code> data structures.
     * </p>
     * 
     * @param describeDBProxyTargetGroupsRequest
     * @return A Java Future containing the result of the DescribeDBProxyTargetGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBProxyTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyTargetGroupsResult> describeDBProxyTargetGroupsAsync(
            DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest);

    /**
     * <p>
     * Returns information about DB proxy target groups, represented by <code>DBProxyTargetGroup</code> data structures.
     * </p>
     * 
     * @param describeDBProxyTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBProxyTargetGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBProxyTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyTargetGroupsResult> describeDBProxyTargetGroupsAsync(
            DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBProxyTargetGroupsRequest, DescribeDBProxyTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns information about <code>DBProxyTarget</code> objects. This API supports pagination.
     * </p>
     * 
     * @param describeDBProxyTargetsRequest
     * @return A Java Future containing the result of the DescribeDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyTargetsResult> describeDBProxyTargetsAsync(DescribeDBProxyTargetsRequest describeDBProxyTargetsRequest);

    /**
     * <p>
     * Returns information about <code>DBProxyTarget</code> objects. This API supports pagination.
     * </p>
     * 
     * @param describeDBProxyTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBProxyTargetsResult> describeDBProxyTargetsAsync(DescribeDBProxyTargetsRequest describeDBProxyTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBProxyTargetsRequest, DescribeDBProxyTargetsResult> asyncHandler);

    /**
     * <p>
     * Describes the recommendations to resolve the issues for your DB instances, DB clusters, and DB parameter groups.
     * </p>
     * 
     * @param describeDBRecommendationsRequest
     * @return A Java Future containing the result of the DescribeDBRecommendations operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBRecommendationsResult> describeDBRecommendationsAsync(
            DescribeDBRecommendationsRequest describeDBRecommendationsRequest);

    /**
     * <p>
     * Describes the recommendations to resolve the issues for your DB instances, DB clusters, and DB parameter groups.
     * </p>
     * 
     * @param describeDBRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBRecommendations operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBRecommendationsResult> describeDBRecommendationsAsync(
            DescribeDBRecommendationsRequest describeDBRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBRecommendationsRequest, DescribeDBRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param describeDBSecurityGroupsRequest
     * @return A Java Future containing the result of the DescribeDBSecurityGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSecurityGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param describeDBSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSecurityGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSecurityGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest)
     */
    java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes existing Aurora Limitless Database DB shard groups.
     * </p>
     * 
     * @param describeDBShardGroupsRequest
     * @return A Java Future containing the result of the DescribeDBShardGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBShardGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBShardGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBShardGroupsResult> describeDBShardGroupsAsync(DescribeDBShardGroupsRequest describeDBShardGroupsRequest);

    /**
     * <p>
     * Describes existing Aurora Limitless Database DB shard groups.
     * </p>
     * 
     * @param describeDBShardGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBShardGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBShardGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBShardGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBShardGroupsResult> describeDBShardGroupsAsync(DescribeDBShardGroupsRequest describeDBShardGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBShardGroupsRequest, DescribeDBShardGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other Amazon Web Services accounts, <code>DescribeDBSnapshotAttributes</code> returns
     * the <code>restore</code> attribute and a list of IDs for the Amazon Web Services accounts that are authorized to
     * copy or restore the manual DB snapshot. If <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public and can be copied or restored by all Amazon
     * Web Services accounts.
     * </p>
     * <p>
     * To add or remove access for an Amazon Web Services account to copy or restore a manual DB snapshot, or to make
     * the manual DB snapshot public or private, use the <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest
     * @return A Java Future containing the result of the DescribeDBSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(
            DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest);

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other Amazon Web Services accounts, <code>DescribeDBSnapshotAttributes</code> returns
     * the <code>restore</code> attribute and a list of IDs for the Amazon Web Services accounts that are authorized to
     * copy or restore the manual DB snapshot. If <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public and can be copied or restored by all Amazon
     * Web Services accounts.
     * </p>
     * <p>
     * To add or remove access for an Amazon Web Services account to copy or restore a manual DB snapshot, or to make
     * the manual DB snapshot public or private, use the <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSnapshotAttributes operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(
            DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest)
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync();

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes the tenant databases that exist in a DB snapshot. This command only applies to RDS for Oracle DB
     * instances in the multi-tenant configuration.
     * </p>
     * <p>
     * You can use this command to inspect the tenant databases within a snapshot before restoring it. You can't
     * directly interact with the tenant databases in a DB snapshot. If you restore a snapshot that was taken from DB
     * instance using the multi-tenant configuration, you restore all its tenant databases.
     * </p>
     * 
     * @param describeDBSnapshotTenantDatabasesRequest
     * @return A Java Future containing the result of the DescribeDBSnapshotTenantDatabases operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeDBSnapshotTenantDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotTenantDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSnapshotTenantDatabasesResult> describeDBSnapshotTenantDatabasesAsync(
            DescribeDBSnapshotTenantDatabasesRequest describeDBSnapshotTenantDatabasesRequest);

    /**
     * <p>
     * Describes the tenant databases that exist in a DB snapshot. This command only applies to RDS for Oracle DB
     * instances in the multi-tenant configuration.
     * </p>
     * <p>
     * You can use this command to inspect the tenant databases within a snapshot before restoring it. You can't
     * directly interact with the tenant databases in a DB snapshot. If you restore a snapshot that was taken from DB
     * instance using the multi-tenant configuration, you restore all its tenant databases.
     * </p>
     * 
     * @param describeDBSnapshotTenantDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSnapshotTenantDatabases operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeDBSnapshotTenantDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotTenantDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSnapshotTenantDatabasesResult> describeDBSnapshotTenantDatabasesAsync(
            DescribeDBSnapshotTenantDatabasesRequest describeDBSnapshotTenantDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotTenantDatabasesRequest, DescribeDBSnapshotTenantDatabasesResult> asyncHandler);

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest
     * @return A Java Future containing the result of the DescribeDBSnapshots operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest describeDBSnapshotsRequest);

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSnapshots operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest describeDBSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest)
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @return A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
     *         the service.
     * @sample AmazonRDSAsync.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
     *         the service.
     * @sample AmazonRDSAsyncHandler.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @return A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest);

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
     * also see this list in the "Amazon RDS event categories and event messages" section of the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html"> <i>Amazon RDS User
     * Guide</i> </a> or the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html"> <i>Amazon Aurora
     * User Guide</i> </a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRDSAsync.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
     * also see this list in the "Amazon RDS event categories and event messages" section of the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html"> <i>Amazon RDS User
     * Guide</i> </a> or the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html"> <i>Amazon Aurora
     * User Guide</i> </a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest)
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync();

    /**
     * Simplified method form for invoking the DescribeEventCategories operation with an AsyncHandler.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonRDSAsync.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest)
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync();

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation with an AsyncHandler.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Returns events related to DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, DB
     * cluster snapshots, and RDS Proxies for the past 14 days. Events specific to a particular DB instance, DB cluster,
     * DB parameter group, DB security group, DB snapshot, DB cluster snapshot group, or RDS Proxy can be obtained by
     * providing the name as a parameter.
     * </p>
     * <p>
     * For more information on working with events, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/working-with-events.html">Monitoring Amazon RDS
     * events</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/working-with-events.html">Monitoring Amazon
     * Aurora events</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * By default, RDS returns events that were generated in the past hour.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonRDSAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, DB
     * cluster snapshots, and RDS Proxies for the past 14 days. Events specific to a particular DB instance, DB cluster,
     * DB parameter group, DB security group, DB snapshot, DB cluster snapshot group, or RDS Proxy can be obtained by
     * providing the name as a parameter.
     * </p>
     * <p>
     * For more information on working with events, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/working-with-events.html">Monitoring Amazon RDS
     * events</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/working-with-events.html">Monitoring Amazon
     * Aurora events</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * By default, RDS returns events that were generated in the past hour.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync();

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a snapshot or cluster export to Amazon S3. This API operation supports pagination.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonRDSAsync.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Returns information about a snapshot or cluster export to Amazon S3. This API operation supports pagination.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * <p>
     * Returns information about Aurora global database clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return A Java Future containing the result of the DescribeGlobalClusters operation returned by the service.
     * @sample AmazonRDSAsync.DescribeGlobalClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalClustersResult> describeGlobalClustersAsync(DescribeGlobalClustersRequest describeGlobalClustersRequest);

    /**
     * <p>
     * Returns information about Aurora global database clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGlobalClusters operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeGlobalClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalClustersResult> describeGlobalClustersAsync(DescribeGlobalClustersRequest describeGlobalClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalClustersRequest, DescribeGlobalClustersResult> asyncHandler);

    /**
     * <p>
     * Describe one or more zero-ETL integrations with Amazon Redshift.
     * </p>
     * 
     * @param describeIntegrationsRequest
     * @return A Java Future containing the result of the DescribeIntegrations operation returned by the service.
     * @sample AmazonRDSAsync.DescribeIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeIntegrations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIntegrationsResult> describeIntegrationsAsync(DescribeIntegrationsRequest describeIntegrationsRequest);

    /**
     * <p>
     * Describe one or more zero-ETL integrations with Amazon Redshift.
     * </p>
     * 
     * @param describeIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIntegrations operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeIntegrations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIntegrationsResult> describeIntegrationsAsync(DescribeIntegrationsRequest describeIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIntegrationsRequest, DescribeIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Describes all available options for the specified engine.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest
     * @return A Java Future containing the result of the DescribeOptionGroupOptions operation returned by the service.
     * @sample AmazonRDSAsync.DescribeOptionGroupOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroupOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(
            DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest);

    /**
     * <p>
     * Describes all available options for the specified engine.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOptionGroupOptions operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeOptionGroupOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroupOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(
            DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupOptionsRequest, DescribeOptionGroupOptionsResult> asyncHandler);

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest
     * @return A Java Future containing the result of the DescribeOptionGroups operation returned by the service.
     * @sample AmazonRDSAsync.DescribeOptionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(DescribeOptionGroupsRequest describeOptionGroupsRequest);

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOptionGroups operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeOptionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(DescribeOptionGroupsRequest describeOptionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest)
     */
    java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation with an AsyncHandler.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the orderable DB instance options for a specified DB engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @return A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest);

    /**
     * <p>
     * Describes the orderable DB instance options for a specified DB engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest)
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync();

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation with an AsyncHandler.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest
     * @return A Java Future containing the result of the DescribeReservedDBInstances operation returned by the service.
     * @sample AmazonRDSAsync.DescribeReservedDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest);

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedDBInstances operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeReservedDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest)
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest
     * @return A Java Future containing the result of the DescribeReservedDBInstancesOfferings operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeReservedDBInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest);

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedDBInstancesOfferings operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeReservedDBInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the source Amazon Web Services Regions where the current Amazon Web Services Region can create
     * a read replica, copy a DB snapshot from, or replicate automated backups from.
     * </p>
     * <p>
     * Use this operation to determine whether cross-Region features are supported between other Regions and your
     * current Region. This operation supports pagination.
     * </p>
     * <p>
     * To return information about the Regions that are enabled for your account, or all Regions, use the EC2 operation
     * <code>DescribeRegions</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeRegions.html"> DescribeRegions</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param describeSourceRegionsRequest
     * @return A Java Future containing the result of the DescribeSourceRegions operation returned by the service.
     * @sample AmazonRDSAsync.DescribeSourceRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeSourceRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(DescribeSourceRegionsRequest describeSourceRegionsRequest);

    /**
     * <p>
     * Returns a list of the source Amazon Web Services Regions where the current Amazon Web Services Region can create
     * a read replica, copy a DB snapshot from, or replicate automated backups from.
     * </p>
     * <p>
     * Use this operation to determine whether cross-Region features are supported between other Regions and your
     * current Region. This operation supports pagination.
     * </p>
     * <p>
     * To return information about the Regions that are enabled for your account, or all Regions, use the EC2 operation
     * <code>DescribeRegions</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeRegions.html"> DescribeRegions</a> in
     * the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param describeSourceRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSourceRegions operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeSourceRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeSourceRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(DescribeSourceRegionsRequest describeSourceRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceRegionsRequest, DescribeSourceRegionsResult> asyncHandler);

    /**
     * <p>
     * Describes the tenant databases in a DB instance that uses the multi-tenant configuration. Only RDS for Oracle CDB
     * instances are supported.
     * </p>
     * 
     * @param describeTenantDatabasesRequest
     * @return A Java Future containing the result of the DescribeTenantDatabases operation returned by the service.
     * @sample AmazonRDSAsync.DescribeTenantDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeTenantDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTenantDatabasesResult> describeTenantDatabasesAsync(DescribeTenantDatabasesRequest describeTenantDatabasesRequest);

    /**
     * <p>
     * Describes the tenant databases in a DB instance that uses the multi-tenant configuration. Only RDS for Oracle CDB
     * instances are supported.
     * </p>
     * 
     * @param describeTenantDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTenantDatabases operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DescribeTenantDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeTenantDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTenantDatabasesResult> describeTenantDatabasesAsync(DescribeTenantDatabasesRequest describeTenantDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTenantDatabasesRequest, DescribeTenantDatabasesResult> asyncHandler);

    /**
     * <p>
     * You can call <code>DescribeValidDBInstanceModifications</code> to learn what modifications you can make to your
     * DB instance. You can use this information when you call <code>ModifyDBInstance</code>.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest
     * @return A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
     *         service.
     * @sample AmazonRDSAsync.DescribeValidDBInstanceModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeValidDBInstanceModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest);

    /**
     * <p>
     * You can call <code>DescribeValidDBInstanceModifications</code> to learn what modifications you can make to your
     * DB instance. You can use this information when you call <code>ModifyDBInstance</code>.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.DescribeValidDBInstanceModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeValidDBInstanceModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeValidDBInstanceModificationsRequest, ValidDBInstanceModificationsMessage> asyncHandler);

    /**
     * <p>
     * Disables the HTTP endpoint for the specified DB cluster. Disabling this endpoint disables RDS Data API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using RDS Data API</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora PostgreSQL Serverless v2 and provisioned DB clusters. To disable the HTTP
     * endpoint for Aurora Serverless v1 DB clusters, use the <code>EnableHttpEndpoint</code> parameter of the
     * <code>ModifyDBCluster</code> operation.
     * </p>
     * </note>
     * 
     * @param disableHttpEndpointRequest
     * @return A Java Future containing the result of the DisableHttpEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.DisableHttpEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DisableHttpEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableHttpEndpointResult> disableHttpEndpointAsync(DisableHttpEndpointRequest disableHttpEndpointRequest);

    /**
     * <p>
     * Disables the HTTP endpoint for the specified DB cluster. Disabling this endpoint disables RDS Data API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using RDS Data API</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora PostgreSQL Serverless v2 and provisioned DB clusters. To disable the HTTP
     * endpoint for Aurora Serverless v1 DB clusters, use the <code>EnableHttpEndpoint</code> parameter of the
     * <code>ModifyDBCluster</code> operation.
     * </p>
     * </note>
     * 
     * @param disableHttpEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableHttpEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DisableHttpEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DisableHttpEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableHttpEndpointResult> disableHttpEndpointAsync(DisableHttpEndpointRequest disableHttpEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DisableHttpEndpointRequest, DisableHttpEndpointResult> asyncHandler);

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest
     * @return A Java Future containing the result of the DownloadDBLogFilePortion operation returned by the service.
     * @sample AmazonRDSAsync.DownloadDBLogFilePortion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DownloadDBLogFilePortion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest);

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DownloadDBLogFilePortion operation returned by the service.
     * @sample AmazonRDSAsyncHandler.DownloadDBLogFilePortion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DownloadDBLogFilePortion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest,
            com.amazonaws.handlers.AsyncHandler<DownloadDBLogFilePortionRequest, DownloadDBLogFilePortionResult> asyncHandler);

    /**
     * <p>
     * Enables the HTTP endpoint for the DB cluster. By default, the HTTP endpoint isn't enabled.
     * </p>
     * <p>
     * When enabled, this endpoint provides a connectionless web service API (RDS Data API) for running SQL queries on
     * the Aurora DB cluster. You can also query your database from inside the RDS console with the RDS query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using RDS Data API</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora PostgreSQL Serverless v2 and provisioned DB clusters. To enable the HTTP
     * endpoint for Aurora Serverless v1 DB clusters, use the <code>EnableHttpEndpoint</code> parameter of the
     * <code>ModifyDBCluster</code> operation.
     * </p>
     * </note>
     * 
     * @param enableHttpEndpointRequest
     * @return A Java Future containing the result of the EnableHttpEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.EnableHttpEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/EnableHttpEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableHttpEndpointResult> enableHttpEndpointAsync(EnableHttpEndpointRequest enableHttpEndpointRequest);

    /**
     * <p>
     * Enables the HTTP endpoint for the DB cluster. By default, the HTTP endpoint isn't enabled.
     * </p>
     * <p>
     * When enabled, this endpoint provides a connectionless web service API (RDS Data API) for running SQL queries on
     * the Aurora DB cluster. You can also query your database from inside the RDS console with the RDS query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using RDS Data API</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation applies only to Aurora PostgreSQL Serverless v2 and provisioned DB clusters. To enable the HTTP
     * endpoint for Aurora Serverless v1 DB clusters, use the <code>EnableHttpEndpoint</code> parameter of the
     * <code>ModifyDBCluster</code> operation.
     * </p>
     * </note>
     * 
     * @param enableHttpEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableHttpEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.EnableHttpEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/EnableHttpEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableHttpEndpointResult> enableHttpEndpointAsync(EnableHttpEndpointRequest enableHttpEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<EnableHttpEndpointRequest, EnableHttpEndpointResult> asyncHandler);

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * For an Aurora DB cluster, failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in
     * the DB cluster to be the primary DB instance (the cluster writer).
     * </p>
     * <p>
     * For a Multi-AZ DB cluster, after RDS terminates the primary DB instance, the internal monitoring system detects
     * that the primary DB instance is unhealthy and promotes a readable standby (read-only instances) in the DB cluster
     * to be the primary DB instance (the cluster writer). Failover times are typically less than 35 seconds.
     * </p>
     * <p>
     * An Amazon Aurora DB cluster automatically fails over to an Aurora Replica, if one exists, when the primary DB
     * instance fails. A Multi-AZ DB cluster automatically fails over to a readable standby DB instance when the primary
     * DB instance fails.
     * </p>
     * <p>
     * To simulate a failure of a primary instance for testing, you can force a failover. Because each instance in a DB
     * cluster has its own endpoint address, make sure to clean up and re-establish any existing connections that use
     * those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param failoverDBClusterRequest
     * @return A Java Future containing the result of the FailoverDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest failoverDBClusterRequest);

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * For an Aurora DB cluster, failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in
     * the DB cluster to be the primary DB instance (the cluster writer).
     * </p>
     * <p>
     * For a Multi-AZ DB cluster, after RDS terminates the primary DB instance, the internal monitoring system detects
     * that the primary DB instance is unhealthy and promotes a readable standby (read-only instances) in the DB cluster
     * to be the primary DB instance (the cluster writer). Failover times are typically less than 35 seconds.
     * </p>
     * <p>
     * An Amazon Aurora DB cluster automatically fails over to an Aurora Replica, if one exists, when the primary DB
     * instance fails. A Multi-AZ DB cluster automatically fails over to a readable standby DB instance when the primary
     * DB instance fails.
     * </p>
     * <p>
     * To simulate a failure of a primary instance for testing, you can force a failover. Because each instance in a DB
     * cluster has its own endpoint address, make sure to clean up and re-establish any existing connections that use
     * those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param failoverDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FailoverDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest failoverDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler);

    /**
     * Simplified method form for invoking the FailoverDBCluster operation.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest)
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync();

    /**
     * Simplified method form for invoking the FailoverDBCluster operation with an AsyncHandler.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Promotes the specified secondary DB cluster to be the primary DB cluster in the global database cluster to fail
     * over or switch over a global database. Switchover operations were previously called "managed planned failovers."
     * </p>
     * <note>
     * <p>
     * Although this operation can be used either to fail over or to switch over a global database cluster, its intended
     * use is for global database failover. To switch over a global database cluster, we recommend that you use the
     * <a>SwitchoverGlobalCluster</a> operation instead.
     * </p>
     * </note>
     * <p>
     * How you use this operation depends on whether you are failing over or switching over your global database
     * cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Failing over - Specify the <code>AllowDataLoss</code> parameter and don't specify the <code>Switchover</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Switching over - Specify the <code>Switchover</code> parameter or omit it, but don't specify the
     * <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>About failing over and switching over</b>
     * </p>
     * <p>
     * While failing over and switching over a global database cluster both change the primary DB cluster, you use these
     * operations for different reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Failing over</i> - Use this operation to respond to an unplanned event, such as a Regional disaster in the
     * primary Region. Failing over can result in a loss of write transaction data that wasn't replicated to the chosen
     * secondary before the failover event occurred. However, the recovery process that promotes a DB instance on the
     * chosen seconday DB cluster to be the primary writer DB instance guarantees that the data is in a transactionally
     * consistent state.
     * </p>
     * <p>
     * For more information about failing over an Amazon Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-failover.managed-unplanned"
     * >Performing managed failovers for Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Switching over</i> - Use this operation on a healthy global database cluster for planned events, such as
     * Regional rotation or to fail back to the original primary DB cluster after a failover operation. With this
     * operation, there is no data loss.
     * </p>
     * <p>
     * For more information about switching over an Amazon Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-disaster-recovery.managed-failover"
     * >Performing switchovers for Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failoverGlobalClusterRequest
     * @return A Java Future containing the result of the FailoverGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.FailoverGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> failoverGlobalClusterAsync(FailoverGlobalClusterRequest failoverGlobalClusterRequest);

    /**
     * <p>
     * Promotes the specified secondary DB cluster to be the primary DB cluster in the global database cluster to fail
     * over or switch over a global database. Switchover operations were previously called "managed planned failovers."
     * </p>
     * <note>
     * <p>
     * Although this operation can be used either to fail over or to switch over a global database cluster, its intended
     * use is for global database failover. To switch over a global database cluster, we recommend that you use the
     * <a>SwitchoverGlobalCluster</a> operation instead.
     * </p>
     * </note>
     * <p>
     * How you use this operation depends on whether you are failing over or switching over your global database
     * cluster:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Failing over - Specify the <code>AllowDataLoss</code> parameter and don't specify the <code>Switchover</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Switching over - Specify the <code>Switchover</code> parameter or omit it, but don't specify the
     * <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>About failing over and switching over</b>
     * </p>
     * <p>
     * While failing over and switching over a global database cluster both change the primary DB cluster, you use these
     * operations for different reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Failing over</i> - Use this operation to respond to an unplanned event, such as a Regional disaster in the
     * primary Region. Failing over can result in a loss of write transaction data that wasn't replicated to the chosen
     * secondary before the failover event occurred. However, the recovery process that promotes a DB instance on the
     * chosen seconday DB cluster to be the primary writer DB instance guarantees that the data is in a transactionally
     * consistent state.
     * </p>
     * <p>
     * For more information about failing over an Amazon Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-failover.managed-unplanned"
     * >Performing managed failovers for Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Switching over</i> - Use this operation on a healthy global database cluster for planned events, such as
     * Regional rotation or to fail back to the original primary DB cluster after a failover operation. With this
     * operation, there is no data loss.
     * </p>
     * <p>
     * For more information about switching over an Amazon Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-disaster-recovery.managed-failover"
     * >Performing switchovers for Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failoverGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FailoverGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.FailoverGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> failoverGlobalClusterAsync(FailoverGlobalClusterRequest failoverGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<FailoverGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRDSAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Changes the audit policy state of a database activity stream to either locked (default) or unlocked. A locked
     * policy is read-only, whereas an unlocked policy is read/write. If your activity stream is started and locked, you
     * can unlock it, customize your audit policy, and then lock your activity stream. Restarting the activity stream
     * isn't required. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.Modifying.html"> Modifying a
     * database activity stream</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This operation is supported for RDS for Oracle and Microsoft SQL Server.
     * </p>
     * 
     * @param modifyActivityStreamRequest
     * @return A Java Future containing the result of the ModifyActivityStream operation returned by the service.
     * @sample AmazonRDSAsync.ModifyActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyActivityStreamResult> modifyActivityStreamAsync(ModifyActivityStreamRequest modifyActivityStreamRequest);

    /**
     * <p>
     * Changes the audit policy state of a database activity stream to either locked (default) or unlocked. A locked
     * policy is read-only, whereas an unlocked policy is read/write. If your activity stream is started and locked, you
     * can unlock it, customize your audit policy, and then lock your activity stream. Restarting the activity stream
     * isn't required. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.Modifying.html"> Modifying a
     * database activity stream</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This operation is supported for RDS for Oracle and Microsoft SQL Server.
     * </p>
     * 
     * @param modifyActivityStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyActivityStream operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyActivityStreamResult> modifyActivityStreamAsync(ModifyActivityStreamRequest modifyActivityStreamRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyActivityStreamRequest, ModifyActivityStreamResult> asyncHandler);

    /**
     * <p>
     * Override the system-default Secure Sockets Layer/Transport Layer Security (SSL/TLS) certificate for Amazon RDS
     * for new DB instances, or remove the override.
     * </p>
     * <p>
     * By using this operation, you can specify an RDS-approved SSL/TLS certificate for new DB instances that is
     * different from the default certificate provided by RDS. You can also use this operation to remove the override,
     * so that new DB instances use the default certificate provided by RDS.
     * </p>
     * <p>
     * You might need to override the default certificate in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You already migrated your applications to support the latest certificate authority (CA) certificate, but the new
     * CA certificate is not yet the RDS default CA certificate for the specified Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has already moved to a new default CA certificate for the specified Amazon Web Services Region, but you are
     * still in the process of supporting the new CA certificate. In this case, you temporarily need additional time to
     * finish your application changes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param modifyCertificatesRequest
     * @return A Java Future containing the result of the ModifyCertificates operation returned by the service.
     * @sample AmazonRDSAsync.ModifyCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Certificate> modifyCertificatesAsync(ModifyCertificatesRequest modifyCertificatesRequest);

    /**
     * <p>
     * Override the system-default Secure Sockets Layer/Transport Layer Security (SSL/TLS) certificate for Amazon RDS
     * for new DB instances, or remove the override.
     * </p>
     * <p>
     * By using this operation, you can specify an RDS-approved SSL/TLS certificate for new DB instances that is
     * different from the default certificate provided by RDS. You can also use this operation to remove the override,
     * so that new DB instances use the default certificate provided by RDS.
     * </p>
     * <p>
     * You might need to override the default certificate in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You already migrated your applications to support the latest certificate authority (CA) certificate, but the new
     * CA certificate is not yet the RDS default CA certificate for the specified Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has already moved to a new default CA certificate for the specified Amazon Web Services Region, but you are
     * still in the process of supporting the new CA certificate. In this case, you temporarily need additional time to
     * finish your application changes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param modifyCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCertificates operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Certificate> modifyCertificatesAsync(ModifyCertificatesRequest modifyCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCertificatesRequest, Certificate> asyncHandler);

    /**
     * <p>
     * Set the capacity of an Aurora Serverless v1 DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless v1 scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless v1 can automatically scale the DB cluster based
     * on the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless v1, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless v1 from finding a scaling point might be dropped. For more information about
     * scaling points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This operation only applies to Aurora Serverless v1 DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @return A Java Future containing the result of the ModifyCurrentDBClusterCapacity operation returned by the
     *         service.
     * @sample AmazonRDSAsync.ModifyCurrentDBClusterCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCurrentDBClusterCapacityResult> modifyCurrentDBClusterCapacityAsync(
            ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest);

    /**
     * <p>
     * Set the capacity of an Aurora Serverless v1 DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless v1 scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless v1 can automatically scale the DB cluster based
     * on the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless v1, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless v1 from finding a scaling point might be dropped. For more information about
     * scaling points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This operation only applies to Aurora Serverless v1 DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCurrentDBClusterCapacity operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.ModifyCurrentDBClusterCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCurrentDBClusterCapacityResult> modifyCurrentDBClusterCapacityAsync(
            ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCurrentDBClusterCapacityRequest, ModifyCurrentDBClusterCapacityResult> asyncHandler);

    /**
     * <p>
     * Modifies the status of a custom engine version (CEV). You can find CEVs to modify by calling
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     * <note>
     * <p>
     * The MediaImport service that imports files from Amazon S3 to create CEVs isn't integrated with Amazon Web
     * Services CloudTrail. If you turn on data logging for Amazon RDS in CloudTrail, calls to the
     * <code>ModifyCustomDbEngineVersion</code> event aren't logged. However, you might see calls from the API gateway
     * that accesses your Amazon S3 bucket. These calls originate from the MediaImport service for the
     * <code>ModifyCustomDbEngineVersion</code> event.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.modify">Modifying CEV
     * status</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param modifyCustomDBEngineVersionRequest
     * @return A Java Future containing the result of the ModifyCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsync.ModifyCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCustomDBEngineVersionResult> modifyCustomDBEngineVersionAsync(
            ModifyCustomDBEngineVersionRequest modifyCustomDBEngineVersionRequest);

    /**
     * <p>
     * Modifies the status of a custom engine version (CEV). You can find CEVs to modify by calling
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     * <note>
     * <p>
     * The MediaImport service that imports files from Amazon S3 to create CEVs isn't integrated with Amazon Web
     * Services CloudTrail. If you turn on data logging for Amazon RDS in CloudTrail, calls to the
     * <code>ModifyCustomDbEngineVersion</code> event aren't logged. However, you might see calls from the API gateway
     * that accesses your Amazon S3 bucket. These calls originate from the MediaImport service for the
     * <code>ModifyCustomDbEngineVersion</code> event.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.modify">Modifying CEV
     * status</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param modifyCustomDBEngineVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCustomDBEngineVersion operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyCustomDBEngineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCustomDBEngineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCustomDBEngineVersionResult> modifyCustomDBEngineVersionAsync(
            ModifyCustomDBEngineVersionRequest modifyCustomDBEngineVersionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCustomDBEngineVersionRequest, ModifyCustomDBEngineVersionResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings of an Amazon Aurora DB cluster or a Multi-AZ DB cluster. You can change one or more
     * settings by specifying these parameters and the new values in the request.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param modifyDBClusterRequest
     * @return A Java Future containing the result of the ModifyDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest modifyDBClusterRequest);

    /**
     * <p>
     * Modifies the settings of an Amazon Aurora DB cluster or a Multi-AZ DB cluster. You can change one or more
     * settings by specifying these parameters and the new values in the request.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param modifyDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest modifyDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @return A Java Future containing the result of the ModifyDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest);

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBClusterEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterEndpointRequest, ModifyDBClusterEndpointResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create operation before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS
     * console</a> or the <code>DescribeDBClusterParameters</code> operation to verify that your DB cluster parameter
     * group has been created or modified.
     * </p>
     * <p>
     * If the modified DB cluster parameter group is used by an Aurora Serverless v1 cluster, Aurora applies the update
     * immediately. The cluster restart might interrupt your workload. In that case, your application must reopen any
     * connections and retry any transactions that were active when the parameter changes took effect.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @return A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create operation before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS
     * console</a> or the <code>DescribeDBClusterParameters</code> operation to verify that your DB cluster parameter
     * group has been created or modified.
     * </p>
     * <p>
     * If the modified DB cluster parameter group is used by an Aurora Serverless v1 cluster, Aurora applies the update
     * immediately. The cluster restart might interrupt your workload. In that case, your application must reopen any
     * connections and retry any transactions that were active when the parameter changes took effect.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other Amazon Web Services accounts, specify <code>restore</code> as
     * the <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the Amazon
     * Web Services accounts that are authorized to restore the manual DB cluster snapshot. Use the value
     * <code>all</code> to make the manual DB cluster snapshot public, which means that it can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB cluster snapshots that contain private information that
     * you don't want available to all Amazon Web Services accounts.
     * </p>
     * </note>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized
     * Amazon Web Services account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which Amazon Web Services accounts have access to copy or restore a manual DB cluster snapshot, or
     * whether a manual DB cluster snapshot is public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API
     * operation. The accounts are returned as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     * @return A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
     *         service.
     * @sample AmazonRDSAsync.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other Amazon Web Services accounts, specify <code>restore</code> as
     * the <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the Amazon
     * Web Services accounts that are authorized to restore the manual DB cluster snapshot. Use the value
     * <code>all</code> to make the manual DB cluster snapshot public, which means that it can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB cluster snapshots that contain private information that
     * you don't want available to all Amazon Web Services accounts.
     * </p>
     * </note>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized
     * Amazon Web Services account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which Amazon Web Services accounts have access to copy or restore a manual DB cluster snapshot, or
     * whether a manual DB cluster snapshot is public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API
     * operation. The accounts are returned as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
     * call <code>DescribeValidDBInstanceModifications</code> before you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     * @return A Java Future containing the result of the ModifyDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest modifyDBInstanceRequest);

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
     * call <code>DescribeValidDBInstanceModifications</code> before you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest modifyDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * modify operation before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @return A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * modify operation before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Changes the settings for an existing DB proxy.
     * </p>
     * 
     * @param modifyDBProxyRequest
     * @return A Java Future containing the result of the ModifyDBProxy operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyResult> modifyDBProxyAsync(ModifyDBProxyRequest modifyDBProxyRequest);

    /**
     * <p>
     * Changes the settings for an existing DB proxy.
     * </p>
     * 
     * @param modifyDBProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBProxy operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyResult> modifyDBProxyAsync(ModifyDBProxyRequest modifyDBProxyRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBProxyRequest, ModifyDBProxyResult> asyncHandler);

    /**
     * <p>
     * Changes the settings for an existing DB proxy endpoint.
     * </p>
     * 
     * @param modifyDBProxyEndpointRequest
     * @return A Java Future containing the result of the ModifyDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyEndpointResult> modifyDBProxyEndpointAsync(ModifyDBProxyEndpointRequest modifyDBProxyEndpointRequest);

    /**
     * <p>
     * Changes the settings for an existing DB proxy endpoint.
     * </p>
     * 
     * @param modifyDBProxyEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBProxyEndpoint operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBProxyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyEndpointResult> modifyDBProxyEndpointAsync(ModifyDBProxyEndpointRequest modifyDBProxyEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBProxyEndpointRequest, ModifyDBProxyEndpointResult> asyncHandler);

    /**
     * <p>
     * Modifies the properties of a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param modifyDBProxyTargetGroupRequest
     * @return A Java Future containing the result of the ModifyDBProxyTargetGroup operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBProxyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyTargetGroupResult> modifyDBProxyTargetGroupAsync(ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest);

    /**
     * <p>
     * Modifies the properties of a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param modifyDBProxyTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBProxyTargetGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBProxyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBProxyTargetGroupResult> modifyDBProxyTargetGroupAsync(ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBProxyTargetGroupRequest, ModifyDBProxyTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the recommendation status and recommended action status for the specified recommendation.
     * </p>
     * 
     * @param modifyDBRecommendationRequest
     * @return A Java Future containing the result of the ModifyDBRecommendation operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBRecommendation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBRecommendationResult> modifyDBRecommendationAsync(ModifyDBRecommendationRequest modifyDBRecommendationRequest);

    /**
     * <p>
     * Updates the recommendation status and recommended action status for the specified recommendation.
     * </p>
     * 
     * @param modifyDBRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBRecommendation operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBRecommendation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBRecommendationResult> modifyDBRecommendationAsync(ModifyDBRecommendationRequest modifyDBRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBRecommendationRequest, ModifyDBRecommendationResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings of an Aurora Limitless Database DB shard group. You can change one or more settings by
     * specifying these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBShardGroupRequest
     * @return A Java Future containing the result of the ModifyDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBShardGroupResult> modifyDBShardGroupAsync(ModifyDBShardGroupRequest modifyDBShardGroupRequest);

    /**
     * <p>
     * Modifies the settings of an Aurora Limitless Database DB shard group. You can change one or more settings by
     * specifying these parameters and the new values in the request.
     * </p>
     * 
     * @param modifyDBShardGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyDBShardGroupResult> modifyDBShardGroupAsync(ModifyDBShardGroupRequest modifyDBShardGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBShardGroupRequest, ModifyDBShardGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a manual DB snapshot with a new engine version. The snapshot can be encrypted or unencrypted, but not
     * shared or public.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL, PostgreSQL, and Oracle. This operation doesn't apply to RDS
     * Custom or RDS for Db2.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @return A Java Future containing the result of the ModifyDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> modifyDBSnapshotAsync(ModifyDBSnapshotRequest modifyDBSnapshotRequest);

    /**
     * <p>
     * Updates a manual DB snapshot with a new engine version. The snapshot can be encrypted or unencrypted, but not
     * shared or public.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL, PostgreSQL, and Oracle. This operation doesn't apply to RDS
     * Custom or RDS for Db2.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBSnapshot operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshot> modifyDBSnapshotAsync(ModifyDBSnapshotRequest modifyDBSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSnapshotRequest, DBSnapshot> asyncHandler);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other Amazon Web Services accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the Amazon Web
     * Services accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make
     * the manual DB snapshot public, which means it can be copied or restored by all Amazon Web Services accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     * want available to all Amazon Web Services accounts.
     * </p>
     * </note>
     * <p>
     * If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized Amazon Web
     * Services account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value for
     * that parameter in this case.
     * </p>
     * <p>
     * To view which Amazon Web Services accounts have access to copy or restore a manual DB snapshot, or whether a
     * manual DB snapshot public or private, use the <a>DescribeDBSnapshotAttributes</a> API operation. The accounts are
     * returned as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest
     * @return A Java Future containing the result of the ModifyDBSnapshotAttribute operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest);

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other Amazon Web Services accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the Amazon Web
     * Services accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make
     * the manual DB snapshot public, which means it can be copied or restored by all Amazon Web Services accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     * want available to all Amazon Web Services accounts.
     * </p>
     * </note>
     * <p>
     * If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized Amazon Web
     * Services account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value for
     * that parameter in this case.
     * </p>
     * <p>
     * To view which Amazon Web Services accounts have access to copy or restore a manual DB snapshot, or whether a
     * manual DB snapshot public or private, use the <a>DescribeDBSnapshotAttributes</a> API operation. The accounts are
     * returned as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBSnapshotAttribute operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSnapshotAttributeRequest, DBSnapshotAttributesResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the Amazon Web Services Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     * @return A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsync.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the Amazon Web Services Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler);

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. You can't modify the source identifiers using this
     * call. To change source identifiers for a subscription, use the <code>AddSourceIdentifierToSubscription</code> and
     * <code>RemoveSourceIdentifierFromSubscription</code> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given source type (<code>SourceType</code>) in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> in the <i>Amazon RDS
     * User Guide</i> or by using the <code>DescribeEventCategories</code> operation.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonRDSAsync.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. You can't modify the source identifiers using this
     * call. To change source identifiers for a subscription, use the <code>AddSourceIdentifierToSubscription</code> and
     * <code>RemoveSourceIdentifierFromSubscription</code> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given source type (<code>SourceType</code>) in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> in the <i>Amazon RDS
     * User Guide</i> or by using the <code>DescribeEventCategories</code> operation.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Modifies a setting for an Amazon Aurora global database cluster. You can change one or more database
     * configuration parameters by specifying these parameters and the new values in the request. For more information
     * on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora global database clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @return A Java Future containing the result of the ModifyGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.ModifyGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> modifyGlobalClusterAsync(ModifyGlobalClusterRequest modifyGlobalClusterRequest);

    /**
     * <p>
     * Modifies a setting for an Amazon Aurora global database cluster. You can change one or more database
     * configuration parameters by specifying these parameters and the new values in the request. For more information
     * on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora global database clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> modifyGlobalClusterAsync(ModifyGlobalClusterRequest modifyGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Modifies a zero-ETL integration with Amazon Redshift.
     * </p>
     * <note>
     * <p>
     * Currently, you can only modify integrations that have Aurora MySQL source DB clusters. Integrations with Aurora
     * PostgreSQL and RDS sources currently don't support modifying the integration.
     * </p>
     * </note>
     * 
     * @param modifyIntegrationRequest
     * @return A Java Future containing the result of the ModifyIntegration operation returned by the service.
     * @sample AmazonRDSAsync.ModifyIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIntegrationResult> modifyIntegrationAsync(ModifyIntegrationRequest modifyIntegrationRequest);

    /**
     * <p>
     * Modifies a zero-ETL integration with Amazon Redshift.
     * </p>
     * <note>
     * <p>
     * Currently, you can only modify integrations that have Aurora MySQL source DB clusters. Integrations with Aurora
     * PostgreSQL and RDS sources currently don't support modifying the integration.
     * </p>
     * </note>
     * 
     * @param modifyIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyIntegration operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyIntegrationResult> modifyIntegrationAsync(ModifyIntegrationRequest modifyIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyIntegrationRequest, ModifyIntegrationResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest
     * @return A Java Future containing the result of the ModifyOptionGroup operation returned by the service.
     * @sample AmazonRDSAsync.ModifyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(ModifyOptionGroupRequest modifyOptionGroupRequest);

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyOptionGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(ModifyOptionGroupRequest modifyOptionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyOptionGroupRequest, OptionGroup> asyncHandler);

    /**
     * <p>
     * Modifies an existing tenant database in a DB instance. You can change the tenant database name or the master user
     * password. This operation is supported only for RDS for Oracle CDB instances using the multi-tenant configuration.
     * </p>
     * 
     * @param modifyTenantDatabaseRequest
     * @return A Java Future containing the result of the ModifyTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsync.ModifyTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> modifyTenantDatabaseAsync(ModifyTenantDatabaseRequest modifyTenantDatabaseRequest);

    /**
     * <p>
     * Modifies an existing tenant database in a DB instance. You can change the tenant database name or the master user
     * password. This operation is supported only for RDS for Oracle CDB instances using the multi-tenant configuration.
     * </p>
     * 
     * @param modifyTenantDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyTenantDatabase operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ModifyTenantDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyTenantDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TenantDatabase> modifyTenantDatabaseAsync(ModifyTenantDatabaseRequest modifyTenantDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyTenantDatabaseRequest, TenantDatabase> asyncHandler);

    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a read replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a read replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your read replica, configure the automated
     * backup window so that daily backups do not interfere with read replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL, Aurora PostgreSQL, or RDS Custom.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest
     * @return A Java Future containing the result of the PromoteReadReplica operation returned by the service.
     * @sample AmazonRDSAsync.PromoteReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(PromoteReadReplicaRequest promoteReadReplicaRequest);

    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a read replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a read replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your read replica, configure the automated
     * backup window so that daily backups do not interfere with read replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL, Aurora PostgreSQL, or RDS Custom.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PromoteReadReplica operation returned by the service.
     * @sample AmazonRDSAsyncHandler.PromoteReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(PromoteReadReplicaRequest promoteReadReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Promotes a read replica DB cluster to a standalone DB cluster.
     * </p>
     * 
     * @param promoteReadReplicaDBClusterRequest
     * @return A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.PromoteReadReplicaDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplicaDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest);

    /**
     * <p>
     * Promotes a read replica DB cluster to a standalone DB cluster.
     * </p>
     * 
     * @param promoteReadReplicaDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.PromoteReadReplicaDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplicaDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest
     * @return A Java Future containing the result of the PurchaseReservedDBInstancesOffering operation returned by the
     *         service.
     * @sample AmazonRDSAsync.PurchaseReservedDBInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PurchaseReservedDBInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(
            PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest);

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedDBInstancesOffering operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.PurchaseReservedDBInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PurchaseReservedDBInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(
            PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedDBInstancesOfferingRequest, ReservedDBInstance> asyncHandler);

    /**
     * <p>
     * You might need to reboot your DB cluster, usually for maintenance reasons. For example, if you make certain
     * modifications, or if you change the DB cluster parameter group associated with the DB cluster, reboot the DB
     * cluster for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB cluster restarts the database engine service. Rebooting a DB cluster results in a momentary
     * outage, during which the DB cluster status is set to rebooting.
     * </p>
     * <p>
     * Use this operation only for a non-Aurora Multi-AZ DB cluster.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBClusterRequest
     * @return A Java Future containing the result of the RebootDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.RebootDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> rebootDBClusterAsync(RebootDBClusterRequest rebootDBClusterRequest);

    /**
     * <p>
     * You might need to reboot your DB cluster, usually for maintenance reasons. For example, if you make certain
     * modifications, or if you change the DB cluster parameter group associated with the DB cluster, reboot the DB
     * cluster for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB cluster restarts the database engine service. Rebooting a DB cluster results in a momentary
     * outage, during which the DB cluster status is set to rebooting.
     * </p>
     * <p>
     * Use this operation only for a non-Aurora Multi-AZ DB cluster.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RebootDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> rebootDBClusterAsync(RebootDBClusterRequest rebootDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RebootDBClusterRequest, DBCluster> asyncHandler);

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
     * <p>
     * For more information about rebooting, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html">Rebooting a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * If your DB instance is part of a Multi-AZ DB cluster, you can reboot the DB cluster with the
     * <code>RebootDBCluster</code> operation.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @return A Java Future containing the result of the RebootDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest rebootDBInstanceRequest);

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
     * <p>
     * For more information about rebooting, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html">Rebooting a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * If your DB instance is part of a Multi-AZ DB cluster, you can reboot the DB cluster with the
     * <code>RebootDBCluster</code> operation.
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest rebootDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * You might need to reboot your DB shard group, usually for maintenance reasons. For example, if you make certain
     * modifications, reboot the DB shard group for the changes to take effect.
     * </p>
     * <p>
     * This operation applies only to Aurora Limitless Database DBb shard groups.
     * </p>
     * 
     * @param rebootDBShardGroupRequest
     * @return A Java Future containing the result of the RebootDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsync.RebootDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootDBShardGroupResult> rebootDBShardGroupAsync(RebootDBShardGroupRequest rebootDBShardGroupRequest);

    /**
     * <p>
     * You might need to reboot your DB shard group, usually for maintenance reasons. For example, if you make certain
     * modifications, reboot the DB shard group for the changes to take effect.
     * </p>
     * <p>
     * This operation applies only to Aurora Limitless Database DBb shard groups.
     * </p>
     * 
     * @param rebootDBShardGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootDBShardGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RebootDBShardGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBShardGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootDBShardGroupResult> rebootDBShardGroupAsync(RebootDBShardGroupRequest rebootDBShardGroupRequest,
            com.amazonaws.handlers.AsyncHandler<RebootDBShardGroupRequest, RebootDBShardGroupResult> asyncHandler);

    /**
     * <p>
     * Associate one or more <code>DBProxyTarget</code> data structures with a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param registerDBProxyTargetsRequest
     * @return A Java Future containing the result of the RegisterDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsync.RegisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RegisterDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterDBProxyTargetsResult> registerDBProxyTargetsAsync(RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest);

    /**
     * <p>
     * Associate one or more <code>DBProxyTarget</code> data structures with a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param registerDBProxyTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDBProxyTargets operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RegisterDBProxyTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RegisterDBProxyTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterDBProxyTargetsResult> registerDBProxyTargetsAsync(RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDBProxyTargetsRequest, RegisterDBProxyTargetsResult> asyncHandler);

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
     * cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
     * different Region.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @return A Java Future containing the result of the RemoveFromGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.RemoveFromGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> removeFromGlobalClusterAsync(RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest);

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
     * cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
     * different Region.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFromGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RemoveFromGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> removeFromGlobalClusterAsync(RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFromGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Removes the asssociation of an Amazon Web Services Identity and Access Management (IAM) role from a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeRoleFromDBClusterRequest
     * @return A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.RemoveRoleFromDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest);

    /**
     * <p>
     * Removes the asssociation of an Amazon Web Services Identity and Access Management (IAM) role from a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeRoleFromDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RemoveRoleFromDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBClusterRequest, RemoveRoleFromDBClusterResult> asyncHandler);

    /**
     * <p>
     * Disassociates an Amazon Web Services Identity and Access Management (IAM) role from a DB instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @return A Java Future containing the result of the RemoveRoleFromDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.RemoveRoleFromDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRoleFromDBInstanceResult> removeRoleFromDBInstanceAsync(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest);

    /**
     * <p>
     * Disassociates an Amazon Web Services Identity and Access Management (IAM) role from a DB instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveRoleFromDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RemoveRoleFromDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRoleFromDBInstanceResult> removeRoleFromDBInstanceAsync(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBInstanceRequest, RemoveRoleFromDBInstanceResult> asyncHandler);

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @return A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
     *         the service.
     * @sample AmazonRDSAsync.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest);

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
     *         the service.
     * @sample AmazonRDSAsyncHandler.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonRDSAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
     * a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request. You must call <code>RebootDBInstance</code> for every DB instance in your DB cluster that you want the
     * updated static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @return A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsync.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
     * a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request. You must call <code>RebootDBInstance</code> for every DB instance in your DB cluster that you want the
     * updated static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the ResetDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsync.ResetDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest resetDBParameterGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetDBParameterGroup operation returned by the service.
     * @sample AmazonRDSAsyncHandler.ResetDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest resetDBParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetDBParameterGroupRequest, ResetDBParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from MySQL data stored in an Amazon S3 bucket. Amazon RDS must be authorized
     * to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.ExtMySQL.html#AuroraMySQL.Migrating.ExtMySQL.S3"
     * > Migrating Data from MySQL by Using an Amazon S3 Bucket</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromS3</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters. The source DB engine must be MySQL.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @return A Java Future containing the result of the RestoreDBClusterFromS3 operation returned by the service.
     * @sample AmazonRDSAsync.RestoreDBClusterFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request);

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from MySQL data stored in an Amazon S3 bucket. Amazon RDS must be authorized
     * to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.ExtMySQL.html#AuroraMySQL.Migrating.ExtMySQL.S3"
     * > Migrating Data from MySQL by Using an Amazon S3 Bucket</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromS3</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters. The source DB engine must be MySQL.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBClusterFromS3 operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RestoreDBClusterFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromS3Request, DBCluster> asyncHandler);

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The target DB cluster is created from the source snapshot with a default configuration. If you don't specify a
     * security group, the new DB cluster is associated with the default security group.
     * </p>
     * <note>
     * <p>
     * This operation only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromSnapshot</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     * @return A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
     *         service.
     * @sample AmazonRDSAsync.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest);

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The target DB cluster is created from the source snapshot with a default configuration. If you don't specify a
     * security group, the new DB cluster is associated with the default security group.
     * </p>
     * <note>
     * <p>
     * This operation only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after
     * the <code>RestoreDBClusterFromSnapshot</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <note>
     * <p>
     * For Aurora, this operation only restores the DB cluster, not the DB instances for that DB cluster. You must
     * invoke the <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying
     * the identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only
     * after the <code>RestoreDBClusterToPointInTime</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @return A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
     *         service.
     * @sample AmazonRDSAsync.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest);

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <note>
     * <p>
     * For Aurora, this operation only restores the DB cluster, not the DB instances for that DB cluster. You must
     * invoke the <code>CreateDBInstance</code> operation to create DB instances for the restored DB cluster, specifying
     * the identifier of the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only
     * after the <code>RestoreDBClusterToPointInTime</code> operation has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on Multi-AZ DB clusters, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html"> Multi-AZ DB
     * cluster deployments</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
     * point with most of the source's original configuration, including the default security group and DB parameter
     * group. By default, the new DB instance is created as a Single-AZ deployment, except when the instance is a SQL
     * Server instance that has an option group associated with mirroring. In this case, the instance becomes a Multi-AZ
     * deployment, not a Single-AZ deployment.
     * </p>
     * <p>
     * If you want to replace your original DB instance with the new, restored DB instance, then rename your original DB
     * instance before you call the <code>RestoreDBInstanceFromDBSnapshot</code> operation. RDS doesn't allow two DB
     * instances with the same name. After you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the <code>DBInstanceIdentifier</code> in the call to the
     * <code>RestoreDBInstanceFromDBSnapshot</code> operation. The result is that you replace the original DB instance
     * with the DB instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterFromSnapshot</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest
     * @return A Java Future containing the result of the RestoreDBInstanceFromDBSnapshot operation returned by the
     *         service.
     * @sample AmazonRDSAsync.RestoreDBInstanceFromDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromDBSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest);

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
     * point with most of the source's original configuration, including the default security group and DB parameter
     * group. By default, the new DB instance is created as a Single-AZ deployment, except when the instance is a SQL
     * Server instance that has an option group associated with mirroring. In this case, the instance becomes a Multi-AZ
     * deployment, not a Single-AZ deployment.
     * </p>
     * <p>
     * If you want to replace your original DB instance with the new, restored DB instance, then rename your original DB
     * instance before you call the <code>RestoreDBInstanceFromDBSnapshot</code> operation. RDS doesn't allow two DB
     * instances with the same name. After you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the <code>DBInstanceIdentifier</code> in the call to the
     * <code>RestoreDBInstanceFromDBSnapshot</code> operation. The result is that you replace the original DB instance
     * with the DB instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterFromSnapshot</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBInstanceFromDBSnapshot operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.RestoreDBInstanceFromDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromDBSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceFromDBSnapshotRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
     * create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
     * restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html">Importing Data into
     * an Amazon RDS MySQL DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This operation doesn't apply to RDS Custom.
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @return A Java Future containing the result of the RestoreDBInstanceFromS3 operation returned by the service.
     * @sample AmazonRDSAsync.RestoreDBInstanceFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromS3" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceFromS3Async(RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request);

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
     * create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
     * restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html">Importing Data into
     * an Amazon RDS MySQL DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This operation doesn't apply to RDS Custom.
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBInstanceFromS3 operation returned by the service.
     * @sample AmazonRDSAsyncHandler.RestoreDBInstanceFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromS3" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceFromS3Async(RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceFromS3Request, DBInstance> asyncHandler);

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
     * identified by the <code>LatestRestorableTime</code> property. You can restore to a point up to the number of days
     * specified by the <code>BackupRetentionPeriod</code> property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration, but in a system-selected Availability
     * Zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
     * the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
     * has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
     * and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This operation doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterToPointInTime</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest
     * @return A Java Future containing the result of the RestoreDBInstanceToPointInTime operation returned by the
     *         service.
     * @sample AmazonRDSAsync.RestoreDBInstanceToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest);

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
     * identified by the <code>LatestRestorableTime</code> property. You can restore to a point up to the number of days
     * specified by the <code>BackupRetentionPeriod</code> property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration, but in a system-selected Availability
     * Zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
     * the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
     * has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
     * and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This operation doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <code>RestoreDBClusterToPointInTime</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDBInstanceToPointInTime operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.RestoreDBInstanceToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceToPointInTimeRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC security groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param revokeDBSecurityGroupIngressRequest
     * @return A Java Future containing the result of the RevokeDBSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRDSAsync.RevokeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RevokeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest);

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC security groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
     * <note>
     * <p>
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we recommend that
     * you migrate as soon as possible. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html">Migrate from EC2-Classic to a VPC</a>
     * in the <i>Amazon EC2 User Guide</i>, the blog <a
     * href="http://aws.amazon.com/blogs/aws/ec2-classic-is-retiring-heres-how-to-prepare/">EC2-Classic Networking is
     * Retiring – Here’s How to Prepare</a>, and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html">Moving a DB instance not
     * in a VPC into a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param revokeDBSecurityGroupIngressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeDBSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.RevokeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RevokeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler);

    /**
     * <p>
     * Starts a database activity stream to monitor activity on the database. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"> Monitoring Amazon
     * Aurora with Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.html"> Monitoring Amazon RDS with
     * Database Activity Streams</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param startActivityStreamRequest
     * @return A Java Future containing the result of the StartActivityStream operation returned by the service.
     * @sample AmazonRDSAsync.StartActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartActivityStreamResult> startActivityStreamAsync(StartActivityStreamRequest startActivityStreamRequest);

    /**
     * <p>
     * Starts a database activity stream to monitor activity on the database. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"> Monitoring Amazon
     * Aurora with Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.html"> Monitoring Amazon RDS with
     * Database Activity Streams</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param startActivityStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartActivityStream operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StartActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartActivityStreamResult> startActivityStreamAsync(StartActivityStreamRequest startActivityStreamRequest,
            com.amazonaws.handlers.AsyncHandler<StartActivityStreamRequest, StartActivityStreamResult> asyncHandler);

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the Amazon Web Services console, the stop-db-cluster
     * CLI command, or the <code>StopDBCluster</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @return A Java Future containing the result of the StartDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest startDBClusterRequest);

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the Amazon Web Services console, the stop-db-cluster
     * CLI command, or the <code>StopDBCluster</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest startDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<StartDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the Amazon Web Services console, the stop-db-instance CLI
     * command, or the <code>StopDBInstance</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL. For Aurora DB clusters, use
     * <code>StartDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @return A Java Future containing the result of the StartDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.StartDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> startDBInstanceAsync(StartDBInstanceRequest startDBInstanceRequest);

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the Amazon Web Services console, the stop-db-instance CLI
     * command, or the <code>StopDBInstance</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL. For Aurora DB clusters, use
     * <code>StartDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StartDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> startDBInstanceAsync(StartDBInstanceRequest startDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Enables replication of automated backups to a different Amazon Web Services Region.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another Amazon Web Services Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param startDBInstanceAutomatedBackupsReplicationRequest
     * @return A Java Future containing the result of the StartDBInstanceAutomatedBackupsReplication operation returned
     *         by the service.
     * @sample AmazonRDSAsync.StartDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> startDBInstanceAutomatedBackupsReplicationAsync(
            StartDBInstanceAutomatedBackupsReplicationRequest startDBInstanceAutomatedBackupsReplicationRequest);

    /**
     * <p>
     * Enables replication of automated backups to a different Amazon Web Services Region.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another Amazon Web Services Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param startDBInstanceAutomatedBackupsReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDBInstanceAutomatedBackupsReplication operation returned
     *         by the service.
     * @sample AmazonRDSAsyncHandler.StartDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> startDBInstanceAutomatedBackupsReplicationAsync(
            StartDBInstanceAutomatedBackupsReplicationRequest startDBInstanceAutomatedBackupsReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartDBInstanceAutomatedBackupsReplicationRequest, DBInstanceAutomatedBackup> asyncHandler);

    /**
     * <p>
     * Starts an export of DB snapshot or DB cluster data to Amazon S3. The provided IAM role must have access to the S3
     * bucket.
     * </p>
     * <p>
     * You can't export snapshot data from Db2 or RDS Custom DB instances.
     * </p>
     * <p>
     * You can't export cluster data from Multi-AZ DB clusters.
     * </p>
     * <p>
     * For more information on exporting DB snapshot data, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ExportSnapshot.html">Exporting DB snapshot data
     * to Amazon S3</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-export-snapshot.html">Exporting DB
     * cluster snapshot data to Amazon S3</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on exporting DB cluster data, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/export-cluster-data.html">Exporting DB cluster
     * data to Amazon S3</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return A Java Future containing the result of the StartExportTask operation returned by the service.
     * @sample AmazonRDSAsync.StartExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest startExportTaskRequest);

    /**
     * <p>
     * Starts an export of DB snapshot or DB cluster data to Amazon S3. The provided IAM role must have access to the S3
     * bucket.
     * </p>
     * <p>
     * You can't export snapshot data from Db2 or RDS Custom DB instances.
     * </p>
     * <p>
     * You can't export cluster data from Multi-AZ DB clusters.
     * </p>
     * <p>
     * For more information on exporting DB snapshot data, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ExportSnapshot.html">Exporting DB snapshot data
     * to Amazon S3</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-export-snapshot.html">Exporting DB
     * cluster snapshot data to Amazon S3</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * For more information on exporting DB cluster data, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/export-cluster-data.html">Exporting DB cluster
     * data to Amazon S3</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param startExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExportTask operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StartExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest startExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartExportTaskRequest, StartExportTaskResult> asyncHandler);

    /**
     * <p>
     * Stops a database activity stream that was started using the Amazon Web Services console, the
     * <code>start-activity-stream</code> CLI command, or the <code>StartActivityStream</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"> Monitoring Amazon
     * Aurora with Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.html"> Monitoring Amazon RDS with
     * Database Activity Streams</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param stopActivityStreamRequest
     * @return A Java Future containing the result of the StopActivityStream operation returned by the service.
     * @sample AmazonRDSAsync.StopActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopActivityStreamResult> stopActivityStreamAsync(StopActivityStreamRequest stopActivityStreamRequest);

    /**
     * <p>
     * Stops a database activity stream that was started using the Amazon Web Services console, the
     * <code>start-activity-stream</code> CLI command, or the <code>StartActivityStream</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"> Monitoring Amazon
     * Aurora with Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/DBActivityStreams.html"> Monitoring Amazon RDS with
     * Database Activity Streams</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param stopActivityStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopActivityStream operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StopActivityStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopActivityStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopActivityStreamResult> stopActivityStreamAsync(StopActivityStreamRequest stopActivityStreamRequest,
            com.amazonaws.handlers.AsyncHandler<StopActivityStreamRequest, StopActivityStreamResult> asyncHandler);

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
     * including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
     * point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @return A Java Future containing the result of the StopDBCluster operation returned by the service.
     * @sample AmazonRDSAsync.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest stopDBClusterRequest);

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
     * including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
     * point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDBCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest stopDBClusterRequest,
            com.amazonaws.handlers.AsyncHandler<StopDBClusterRequest, DBCluster> asyncHandler);

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
     * including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
     * logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"> Stopping an Amazon RDS DB
     * Instance Temporarily</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL. For Aurora clusters, use
     * <code>StopDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @return A Java Future containing the result of the StopDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.StopDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> stopDBInstanceAsync(StopDBInstanceRequest stopDBInstanceRequest);

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
     * including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
     * logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"> Stopping an Amazon RDS DB
     * Instance Temporarily</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL. For Aurora clusters, use
     * <code>StopDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDBInstance operation returned by the service.
     * @sample AmazonRDSAsyncHandler.StopDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> stopDBInstanceAsync(StopDBInstanceRequest stopDBInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopDBInstanceRequest, DBInstance> asyncHandler);

    /**
     * <p>
     * Stops automated backup replication for a DB instance.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another Amazon Web Services Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param stopDBInstanceAutomatedBackupsReplicationRequest
     * @return A Java Future containing the result of the StopDBInstanceAutomatedBackupsReplication operation returned
     *         by the service.
     * @sample AmazonRDSAsync.StopDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> stopDBInstanceAutomatedBackupsReplicationAsync(
            StopDBInstanceAutomatedBackupsReplicationRequest stopDBInstanceAutomatedBackupsReplicationRequest);

    /**
     * <p>
     * Stops automated backup replication for a DB instance.
     * </p>
     * <p>
     * This command doesn't apply to RDS Custom, Aurora MySQL, and Aurora PostgreSQL.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html"> Replicating Automated
     * Backups to Another Amazon Web Services Region</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param stopDBInstanceAutomatedBackupsReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDBInstanceAutomatedBackupsReplication operation returned
     *         by the service.
     * @sample AmazonRDSAsyncHandler.StopDBInstanceAutomatedBackupsReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstanceAutomatedBackupsReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DBInstanceAutomatedBackup> stopDBInstanceAutomatedBackupsReplicationAsync(
            StopDBInstanceAutomatedBackupsReplicationRequest stopDBInstanceAutomatedBackupsReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopDBInstanceAutomatedBackupsReplicationRequest, DBInstanceAutomatedBackup> asyncHandler);

    /**
     * <p>
     * Switches over a blue/green deployment.
     * </p>
     * <p>
     * Before you switch over, production traffic is routed to the databases in the blue environment. After you switch
     * over, production traffic is routed to the databases in the green environment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param switchoverBlueGreenDeploymentRequest
     * @return A Java Future containing the result of the SwitchoverBlueGreenDeployment operation returned by the
     *         service.
     * @sample AmazonRDSAsync.SwitchoverBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverBlueGreenDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SwitchoverBlueGreenDeploymentResult> switchoverBlueGreenDeploymentAsync(
            SwitchoverBlueGreenDeploymentRequest switchoverBlueGreenDeploymentRequest);

    /**
     * <p>
     * Switches over a blue/green deployment.
     * </p>
     * <p>
     * Before you switch over, production traffic is routed to the databases in the blue environment. After you switch
     * over, production traffic is routed to the databases in the green environment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html">Using Amazon RDS
     * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param switchoverBlueGreenDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SwitchoverBlueGreenDeployment operation returned by the
     *         service.
     * @sample AmazonRDSAsyncHandler.SwitchoverBlueGreenDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverBlueGreenDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SwitchoverBlueGreenDeploymentResult> switchoverBlueGreenDeploymentAsync(
            SwitchoverBlueGreenDeploymentRequest switchoverBlueGreenDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<SwitchoverBlueGreenDeploymentRequest, SwitchoverBlueGreenDeploymentResult> asyncHandler);

    /**
     * <p>
     * Switches over the specified secondary DB cluster to be the new primary DB cluster in the global database cluster.
     * Switchover operations were previously called "managed planned failovers."
     * </p>
     * <p>
     * Aurora promotes the specified secondary cluster to assume full read/write capabilities and demotes the current
     * primary cluster to a secondary (read-only) cluster, maintaining the orginal replication topology. All secondary
     * clusters are synchronized with the primary at the beginning of the process so the new primary continues
     * operations for the Aurora global database without losing any data. Your database is unavailable for a short time
     * while the primary and selected secondary clusters are assuming their new roles. For more information about
     * switching over an Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-disaster-recovery.managed-failover"
     * >Performing switchovers for Amazon Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is intended for controlled environments, for operations such as "regional rotation" or to fall
     * back to the original primary after a global database failover.
     * </p>
     * </note>
     * 
     * @param switchoverGlobalClusterRequest
     * @return A Java Future containing the result of the SwitchoverGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsync.SwitchoverGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> switchoverGlobalClusterAsync(SwitchoverGlobalClusterRequest switchoverGlobalClusterRequest);

    /**
     * <p>
     * Switches over the specified secondary DB cluster to be the new primary DB cluster in the global database cluster.
     * Switchover operations were previously called "managed planned failovers."
     * </p>
     * <p>
     * Aurora promotes the specified secondary cluster to assume full read/write capabilities and demotes the current
     * primary cluster to a secondary (read-only) cluster, maintaining the orginal replication topology. All secondary
     * clusters are synchronized with the primary at the beginning of the process so the new primary continues
     * operations for the Aurora global database without losing any data. Your database is unavailable for a short time
     * while the primary and selected secondary clusters are assuming their new roles. For more information about
     * switching over an Aurora global database, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-disaster-recovery.html#aurora-global-database-disaster-recovery.managed-failover"
     * >Performing switchovers for Amazon Aurora global databases</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is intended for controlled environments, for operations such as "regional rotation" or to fall
     * back to the original primary after a global database failover.
     * </p>
     * </note>
     * 
     * @param switchoverGlobalClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SwitchoverGlobalCluster operation returned by the service.
     * @sample AmazonRDSAsyncHandler.SwitchoverGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GlobalCluster> switchoverGlobalClusterAsync(SwitchoverGlobalClusterRequest switchoverGlobalClusterRequest,
            com.amazonaws.handlers.AsyncHandler<SwitchoverGlobalClusterRequest, GlobalCluster> asyncHandler);

    /**
     * <p>
     * Switches over an Oracle standby database in an Oracle Data Guard environment, making it the new primary database.
     * Issue this command in the Region that hosts the current standby database.
     * </p>
     * 
     * @param switchoverReadReplicaRequest
     * @return A Java Future containing the result of the SwitchoverReadReplica operation returned by the service.
     * @sample AmazonRDSAsync.SwitchoverReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> switchoverReadReplicaAsync(SwitchoverReadReplicaRequest switchoverReadReplicaRequest);

    /**
     * <p>
     * Switches over an Oracle standby database in an Oracle Data Guard environment, making it the new primary database.
     * Issue this command in the Region that hosts the current standby database.
     * </p>
     * 
     * @param switchoverReadReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SwitchoverReadReplica operation returned by the service.
     * @sample AmazonRDSAsyncHandler.SwitchoverReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> switchoverReadReplicaAsync(SwitchoverReadReplicaRequest switchoverReadReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<SwitchoverReadReplicaRequest, DBInstance> asyncHandler);

}
