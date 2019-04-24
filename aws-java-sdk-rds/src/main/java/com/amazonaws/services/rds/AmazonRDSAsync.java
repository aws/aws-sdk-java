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
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
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
     * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
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
     * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
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
     * Second, IP ranges are available if the application accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
     * You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
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
     * Second, IP ranges are available if the application accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
     * You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
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
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * This action only applies to Aurora DB clusters.
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
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
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
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"> Copying a
     * Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
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
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"> Copying a
     * Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
     * <code>CopyDBSnapshot</code> action is the destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopyDBSnapshot.html">Copying a DB Snapshot</a>
     * in the <i>Amazon RDS User Guide.</i>
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
     * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
     * <code>CopyDBSnapshot</code> action is the destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopyDBSnapshot.html">Copying a DB Snapshot</a>
     * in the <i>Amazon RDS User Guide.</i>
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
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a Read Replica of
     * another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
     * by <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a Read Replica of
     * another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
     * by <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * This action only applies to Aurora DB clusters.
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
     * This action only applies to Aurora DB clusters.
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read
     * Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with Read Replicas</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. You must call the <code>CreateDBInstance</code> action to create a DB
     * instance for an Aurora DB cluster.
     * </p>
     * <p>
     * All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source DB instance, except as specified
     * following.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
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
     * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read
     * Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with Read Replicas</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. You must call the <code>CreateDBInstance</code> action to create a DB
     * instance for an Aurora DB cluster.
     * </p>
     * <p>
     * All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source DB instance, except as specified
     * following.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
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
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
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
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
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
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
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
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
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
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
     * Region.
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
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
     * Region.
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
     * myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
     * your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
     * events generated from all RDS sources belonging to your customer account.
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
     * myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
     * your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
     * events generated from all RDS sources belonging to your customer account.
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
     * </p>
     * <p>
     * Creates an Aurora global database spread across multiple regions. The global database contains a single primary
     * cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster
     * through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
     * to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
     * primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * </p>
     * <p>
     * Creates an Aurora global database spread across multiple regions. The global database contains a single primary
     * cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster
     * through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
     * to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
     * primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Creates a new option group. You can create up to 20 option groups.
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
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
     * be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB instance is <code>deleting</code> until the DB
     * snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action can't be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
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
     * @return A Java Future containing the result of the DeleteDBInstance operation returned by the service.
     * @sample AmazonRDSAsync.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest deleteDBInstanceRequest);

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
     * be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB instance is <code>deleting</code> until the DB
     * snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action can't be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
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
     * Deletes automated backups based on the source instance's <code>DbiResourceId</code> value or the restorable
     * instance's resource ID.
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
     * Deletes automated backups based on the source instance's <code>DbiResourceId</code> value or the restorable
     * instance's resource ID.
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
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
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
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
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
     * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
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
     * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
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
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * When sharing snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
     * DB cluster snapshot public or private, use the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * When sharing snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
     * DB cluster snapshot public or private, use the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Returns information about provisioned Aurora DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Returns information about provisioned Aurora DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Returns a list of the available DB engines.
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
     * Returns a list of the available DB engines.
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
     * Returns information about provisioned RDS instances. This API supports pagination.
     * </p>
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
     * Returns information about provisioned RDS instances. This API supports pagination.
     * </p>
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
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * see a list of the event categories and source types in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events</a> topic in the <i>Amazon
     * RDS User Guide.</i>
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
     * see a list of the event categories and source types in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events</a> topic in the <i>Amazon
     * RDS User Guide.</i>
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
     * SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that subscription.
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
     * SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that subscription.
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
     * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
     * days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
     * can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     * </p>
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
     * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
     * days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
     * can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     * </p>
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
     * Returns information about Aurora global database clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * Describes all available options.
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
     * Describes all available options.
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
     * Returns a list of orderable DB instance options for the specified engine.
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
     * Returns a list of orderable DB instance options for the specified engine.
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
     * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB
     * snapshot from. This API action supports pagination.
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
     * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB
     * snapshot from. This API action supports pagination.
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
     * You can call <a>DescribeValidDBInstanceModifications</a> to learn what modifications you can make to your DB
     * instance. You can use this information when you call <a>ModifyDBInstance</a>.
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
     * You can call <a>DescribeValidDBInstanceModifications</a> to learn what modifications you can make to your DB
     * instance. You can use this information when you call <a>ModifyDBInstance</a>.
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
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
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
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the
     * primary instance (the cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails.
     * You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the
     * primary instance (the cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails.
     * You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on
     * the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling
     * points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on
     * the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling
     * points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
     * specifying these parameters and the new values in the request. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
     * specifying these parameters and the new values in the request. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * This action only applies to Aurora DB clusters.
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
     * This action only applies to Aurora DB clusters.
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
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
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
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * call <a>DescribeValidDBInstanceModifications</a> before you call <a>ModifyDBInstance</a>.
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
     * call <a>DescribeValidDBInstanceModifications</a> before you call <a>ModifyDBInstance</a>.
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
     * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL and Oracle.
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
     * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL and Oracle.
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
     * To share a manual DB snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make the
     * manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of
     * authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value
     * for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
     * public or private, use the <a>DescribeDBSnapshotAttributes</a> API action.
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
     * To share a manual DB snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make the
     * manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of
     * authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value
     * for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
     * public or private, use the <a>DescribeDBSnapshotAttributes</a> API action.
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
     * the AWS Region.
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
     * the AWS Region.
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
     * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using
     * this call; to change source identifiers for a subscription, use the <a>AddSourceIdentifierToSubscription</a> and
     * <a>RemoveSourceIdentifierFromSubscription</a> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
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
     * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using
     * this call; to change source identifiers for a subscription, use the <a>AddSourceIdentifierToSubscription</a> and
     * <a>RemoveSourceIdentifierFromSubscription</a> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
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
     * Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
     * parameters by specifying these parameters and the new values in the request. For more information on Amazon
     * Aurora, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What
     * Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
     * parameters by specifying these parameters and the new values in the request. For more information on Amazon
     * Aurora, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What
     * Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Promotes a Read Replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your Read Replica, configure the automated
     * backup window so that daily backups do not interfere with Read Replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
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
     * Promotes a Read Replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your Read Replica, configure the automated
     * backup window so that daily backups do not interfere with Read Replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
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
     * Promotes a Read Replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Promotes a Read Replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
     * cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
     * different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf </a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf </a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
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
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
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
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <a>RebootDBInstance</a> request.
     * You must call <a>RebootDBInstance</a> for every DB instance in your DB cluster that you want the updated static
     * parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <a>RebootDBInstance</a> request.
     * You must call <a>RebootDBInstance</a> for every DB instance in your DB cluster that you want the updated static
     * parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
     * access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.html"> Migrating Data to
     * an Amazon Aurora MySQL DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
     * access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.html"> Migrating Data to
     * an Amazon Aurora MySQL DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
     * with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
     * default security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
     * with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
     * default security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <a>CreateDBInstance</a> action to create DB instances for the restored DB cluster, specifying the identifier of
     * the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <a>CreateDBInstance</a> action to create DB instances for the restored DB cluster, specifying the identifier of
     * the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
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
     * point with the most of original configuration with the default security group and the default DB parameter group.
     * By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server
     * instance that has an option group that is associated with mirroring; in this case, the instance becomes a
     * mirrored AZ deployment and not a single-AZ deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new, restored DB instance, then rename your
     * original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
     * instances with the same name. Once you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB
     * instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterFromSnapshot</a>.
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
     * point with the most of original configuration with the default security group and the default DB parameter group.
     * By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server
     * instance that has an option group that is associated with mirroring; in this case, the instance becomes a
     * mirrored AZ deployment and not a single-AZ deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new, restored DB instance, then rename your
     * original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
     * instances with the same name. Once you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB
     * instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterFromSnapshot</a>.
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
     * identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
     * the BackupRetentionPeriod property.
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
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterToPointInTime</a>.
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
     * identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
     * the BackupRetentionPeriod property.
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
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterToPointInTime</a>.
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
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
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
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
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
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
     * or the StopDBCluster action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
     * or the StopDBCluster action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
     * the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
     * <a>StartDBCluster</a> instead.
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
     * Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
     * the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
     * <a>StartDBCluster</a> instead.
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
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
     * including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
     * point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
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
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use <a>StopDBCluster</a>
     * instead.
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
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use <a>StopDBCluster</a>
     * instead.
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

}
