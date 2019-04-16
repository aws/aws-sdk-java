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
package com.amazonaws.services.redshift;

import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;

/**
 * Interface for accessing Amazon Redshift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshift.AbstractAmazonRedshiftAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Redshift</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command
 * line interfaces you can use to manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
 * means that some interfaces may require techniques, such as polling or asynchronous callback handlers, to determine
 * when a command has been applied. In this reference, the parameter descriptions indicate whether a change is applied
 * immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift
 * cluster management interfaces, go to <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html">Using the Amazon Redshift Management
 * Interfaces</a>.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
 * monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
 * on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the <a
 * href="https://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html">Amazon Redshift Getting Started
 * Guide</a>.
 * </p>
 * <p>
 * If you are a database developer, the <a href="https://docs.aws.amazon.com/redshift/latest/dg/welcome.html">Amazon
 * Redshift Database Developer Guide</a> explains how to design, build, query, and maintain the databases that make up
 * your data warehouse.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRedshiftAsync extends AmazonRedshift {

    /**
     * <p>
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
     * or number of nodes) and no additional costs.
     * </p>
     * 
     * @param acceptReservedNodeExchangeRequest
     * @return A Java Future containing the result of the AcceptReservedNodeExchange operation returned by the service.
     * @sample AmazonRedshiftAsync.AcceptReservedNodeExchange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AcceptReservedNodeExchange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest);

    /**
     * <p>
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
     * or number of nodes) and no additional costs.
     * </p>
     * 
     * @param acceptReservedNodeExchangeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptReservedNodeExchange operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.AcceptReservedNodeExchange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AcceptReservedNodeExchange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptReservedNodeExchangeRequest, ReservedNode> asyncHandler);

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application
     * accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to
     * either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group.
     * You can add as many as 20 ingress rules to an Amazon Redshift security group.
     * </p>
     * <p>
     * If you authorize access to an Amazon EC2 security group, specify <i>EC2SecurityGroupName</i> and
     * <i>EC2SecurityGroupOwnerId</i>. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS
     * Region.
     * </p>
     * <p>
     * If you authorize access to a CIDR/IP address range, specify <i>CIDRIP</i>. For an overview of CIDR blocks, see
     * the Wikipedia article on <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that clients running on these IP addresses or the
     * EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Working with Security
     * Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeClusterSecurityGroupIngressRequest
     * @return A Java Future containing the result of the AuthorizeClusterSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.AuthorizeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(
            AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest);

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application
     * accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to
     * either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group.
     * You can add as many as 20 ingress rules to an Amazon Redshift security group.
     * </p>
     * <p>
     * If you authorize access to an Amazon EC2 security group, specify <i>EC2SecurityGroupName</i> and
     * <i>EC2SecurityGroupOwnerId</i>. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS
     * Region.
     * </p>
     * <p>
     * If you authorize access to a CIDR/IP address range, specify <i>CIDRIP</i>. For an overview of CIDR blocks, see
     * the Wikipedia article on <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that clients running on these IP addresses or the
     * EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Working with Security
     * Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeClusterSecurityGroupIngressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeClusterSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.AuthorizeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(
            AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler);

    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the specified snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeSnapshotAccessRequest
     * @return A Java Future containing the result of the AuthorizeSnapshotAccess operation returned by the service.
     * @sample AmazonRedshiftAsync.AuthorizeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeSnapshotAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest);

    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the specified snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeSnapshotAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeSnapshotAccess operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.AuthorizeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeSnapshotAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSnapshotAccessRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Deletes a set of cluster snapshots.
     * </p>
     * 
     * @param batchDeleteClusterSnapshotsRequest
     * @return A Java Future containing the result of the BatchDeleteClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsync.BatchDeleteClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchDeleteClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(
            BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest);

    /**
     * <p>
     * Deletes a set of cluster snapshots.
     * </p>
     * 
     * @param batchDeleteClusterSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.BatchDeleteClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchDeleteClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(
            BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteClusterSnapshotsRequest, BatchDeleteClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a list of snapshots.
     * </p>
     * 
     * @param batchModifyClusterSnapshotsRequest
     * @return A Java Future containing the result of the BatchModifyClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsync.BatchModifyClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchModifyClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(
            BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest);

    /**
     * <p>
     * Modifies the settings for a list of snapshots.
     * </p>
     * 
     * @param batchModifyClusterSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchModifyClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.BatchModifyClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchModifyClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(
            BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchModifyClusterSnapshotsRequest, BatchModifyClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Cancels a resize operation.
     * </p>
     * 
     * @param cancelResizeRequest
     * @return A Java Future containing the result of the CancelResize operation returned by the service.
     * @sample AmazonRedshiftAsync.CancelResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CancelResize" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(CancelResizeRequest cancelResizeRequest);

    /**
     * <p>
     * Cancels a resize operation.
     * </p>
     * 
     * @param cancelResizeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelResize operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CancelResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CancelResize" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(CancelResizeRequest cancelResizeRequest,
            com.amazonaws.handlers.AsyncHandler<CancelResizeRequest, CancelResizeResult> asyncHandler);

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated
     * snapshot and it must be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the
     * retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an
     * automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained
     * until you delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param copyClusterSnapshotRequest
     * @return A Java Future containing the result of the CopyClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsync.CopyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CopyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest copyClusterSnapshotRequest);

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated
     * snapshot and it must be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the
     * retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an
     * automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained
     * until you delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param copyClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CopyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CopyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest copyClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Creates a new cluster.
     * </p>
     * <p>
     * To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster
     * subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new cluster.
     * </p>
     * <p>
     * To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster
     * subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group
     * when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster
     * is created by using <a>ModifyCluster</a>.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that applies to the databases you create on the
     * cluster. For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterParameterGroupRequest
     * @return A Java Future containing the result of the CreateClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest createClusterParameterGroupRequest);

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group
     * when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster
     * is created by using <a>ModifyCluster</a>.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that applies to the databases you create on the
     * cluster. For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest createClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSecurityGroupRequest
     * @return A Java Future containing the result of the CreateClusterSecurityGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest);

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClusterSecurityGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler);

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must be in the <code>available</code> state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @return A Java Future containing the result of the CreateClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest);

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must be in the <code>available</code> state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing
     * Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html">Amazon Redshift
     * Cluster Subnet Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSubnetGroupRequest
     * @return A Java Future containing the result of the CreateClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest);

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing
     * Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html">Amazon Redshift
     * Cluster Subnet Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of
     * an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API.
     * To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities.
     * Notifications will be sent for all events you want that match those criteria. For example, you can specify source
     * type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup
     * categories for the specified clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source type = cluster and source identifier =
     * my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source
     * type but do not specify a source identifier, you will receive notice of the events for the objects of that type
     * in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
     * of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source
     * type if you specify a source ID.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of
     * an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API.
     * To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities.
     * Notifications will be sent for all events you want that match those criteria. For example, you can specify source
     * type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup
     * categories for the specified clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source type = cluster and source identifier =
     * my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source
     * type but do not specify a source identifier, you will receive notice of the events for the objects of that type
     * in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
     * of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source
     * type if you specify a source ID.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in
     * order to store and retrieve the keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate,
     * you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and
     * use encryption keys in the HSM. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware Security Modules</a> in
     * the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmClientCertificateRequest
     * @return A Java Future containing the result of the CreateHsmClientCertificate operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest createHsmClientCertificateRequest);

    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in
     * order to store and retrieve the keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate,
     * you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and
     * use encryption keys in the HSM. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware Security Modules</a> in
     * the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsmClientCertificate operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest createHsmClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmClientCertificateRequest, HsmClientCertificate> asyncHandler);

    /**
     * <p>
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and
     * use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can
     * specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * In addition to creating an HSM configuration, you must also create an HSM client certificate. For more
     * information, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware
     * Security Modules</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmConfigurationRequest
     * @return A Java Future containing the result of the CreateHsmConfiguration operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest createHsmConfigurationRequest);

    /**
     * <p>
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and
     * use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can
     * specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * In addition to creating an HSM configuration, you must also create an HSM client certificate. For more
     * information, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware
     * Security Modules</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsmConfiguration operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest createHsmConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmConfigurationRequest, HsmConfiguration> asyncHandler);

    /**
     * <p>
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key
     * Management Service (AWS KMS) to encrypt copied snapshots in a destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createSnapshotCopyGrantRequest
     *        The result of the <code>CreateSnapshotCopyGrant</code> action.
     * @return A Java Future containing the result of the CreateSnapshotCopyGrant operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest);

    /**
     * <p>
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key
     * Management Service (AWS KMS) to encrypt copied snapshots in a destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createSnapshotCopyGrantRequest
     *        The result of the <code>CreateSnapshotCopyGrant</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshotCopyGrant operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotCopyGrantRequest, SnapshotCopyGrant> asyncHandler);

    /**
     * <p>
     * Creates a new snapshot schedule.
     * </p>
     * 
     * @param createSnapshotScheduleRequest
     * @return A Java Future containing the result of the CreateSnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(CreateSnapshotScheduleRequest createSnapshotScheduleRequest);

    /**
     * <p>
     * Creates a new snapshot schedule.
     * </p>
     * 
     * @param createSnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(CreateSnapshotScheduleRequest createSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotScheduleRequest, CreateSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an
     * error and the attempt will fail.
     * </p>
     * <p>
     * If you specify a key that already exists for the resource, the value for that key will be updated with the new
     * value.
     * </p>
     * 
     * @param createTagsRequest
     *        Contains the output from the <code>CreateTags</code> action.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonRedshiftAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an
     * error and the attempt will fail.
     * </p>
     * <p>
     * If you specify a key that already exists for the resource, the value for that key will be updated with the new
     * value.
     * </p>
     * 
     * @param createTagsRequest
     *        Contains the output from the <code>CreateTags</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request
     * was received correctly. Use <a>DescribeClusters</a> to monitor the status of the deletion. The delete operation
     * cannot be canceled or reverted once submitted. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you want to shut down the cluster and retain it for future use, set <i>SkipFinalClusterSnapshot</i> to
     * <code>false</code> and specify a name for <i>FinalClusterSnapshotIdentifier</i>. You can later restore this
     * snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be
     * "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the
     * cluster.
     * </p>
     * <p>
     * For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request
     * was received correctly. Use <a>DescribeClusters</a> to monitor the status of the deletion. The delete operation
     * cannot be canceled or reverted once submitted. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you want to shut down the cluster and retain it for future use, set <i>SkipFinalClusterSnapshot</i> to
     * <code>false</code> and specify a name for <i>FinalClusterSnapshotIdentifier</i>. You can later restore this
     * snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be
     * "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the
     * cluster.
     * </p>
     * <p>
     * For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a parameter group if it is associated with a cluster.
     * </p>
     * </note>
     * 
     * @param deleteClusterParameterGroupRequest
     * @return A Java Future containing the result of the DeleteClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(
            DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest);

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a parameter group if it is associated with a cluster.
     * </p>
     * </note>
     * 
     * @param deleteClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(
            DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterParameterGroupRequest, DeleteClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a security group that is associated with any clusters. You cannot delete the default security
     * group.
     * </p>
     * </note>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterSecurityGroupRequest
     * @return A Java Future containing the result of the DeleteClusterSecurityGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(
            DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest);

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a security group that is associated with any clusters. You cannot delete the default security
     * group.
     * </p>
     * </note>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClusterSecurityGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(
            DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSecurityGroupRequest, DeleteClusterSecurityGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the <code>available</code> state, with no other
     * users authorized to access the snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift
     * does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If
     * other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can
     * delete the snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @return A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest);

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the <code>available</code> state, with no other
     * users authorized to access the snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift
     * does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If
     * other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can
     * delete the snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     * 
     * @param deleteClusterSubnetGroupRequest
     * @return A Java Future containing the result of the DeleteClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest);

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     * 
     * @param deleteClusterSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSubnetGroupRequest, DeleteClusterSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, DeleteEventSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     * 
     * @param deleteHsmClientCertificateRequest
     * @return A Java Future containing the result of the DeleteHsmClientCertificate operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(
            DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest);

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     * 
     * @param deleteHsmClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsmClientCertificate operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(
            DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmClientCertificateRequest, DeleteHsmClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param deleteHsmConfigurationRequest
     * @return A Java Future containing the result of the DeleteHsmConfiguration operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest);

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param deleteHsmConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsmConfiguration operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmConfigurationRequest, DeleteHsmConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     * 
     * @param deleteSnapshotCopyGrantRequest
     *        The result of the <code>DeleteSnapshotCopyGrant</code> action.
     * @return A Java Future containing the result of the DeleteSnapshotCopyGrant operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest);

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     * 
     * @param deleteSnapshotCopyGrantRequest
     *        The result of the <code>DeleteSnapshotCopyGrant</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshotCopyGrant operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotCopyGrantRequest, DeleteSnapshotCopyGrantResult> asyncHandler);

    /**
     * <p>
     * Deletes a snapshot schedule.
     * </p>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest);

    /**
     * <p>
     * Deletes a snapshot schedule.
     * </p>
     * 
     * @param deleteSnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
     * tag or tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the output from the <code>DeleteTags</code> action.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonRedshiftAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
     * tag or tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the output from the <code>DeleteTags</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of attributes attached to an account
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Returns a list of attributes attached to an account
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>ClusterDbRevision</code> objects.
     * </p>
     * 
     * @param describeClusterDbRevisionsRequest
     * @return A Java Future containing the result of the DescribeClusterDbRevisions operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterDbRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterDbRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(
            DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest);

    /**
     * <p>
     * Returns an array of <code>ClusterDbRevision</code> objects.
     * </p>
     * 
     * @param describeClusterDbRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterDbRevisions operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterDbRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterDbRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(
            DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterDbRevisionsRequest, DescribeClusterDbRevisionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default
     * parameter group. For each parameter group, the response includes the parameter group name, description, and
     * parameter group family name. You can optionally specify a name to retrieve the description of a specific
     * parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups
     * that match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all parameter
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether
     * they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterParameterGroupsRequest
     * @return A Java Future containing the result of the DescribeClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default
     * parameter group. For each parameter group, the response includes the parameter group name, description, and
     * parameter group family name. You can optionally specify a name to retrieve the description of a specific
     * parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups
     * that match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all parameter
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether
     * they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterParameterGroups operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest)
     */
    java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each
     * parameter the response includes information such as parameter name, description, data type, value, whether the
     * parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only specific type. For example, to retrieve
     * parameters that were modified by a user action such as from <a>ModifyClusterParameterGroup</a>, you can specify
     * <i>source</i> equal to <i>user</i>.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterParametersRequest
     * @return A Java Future containing the result of the DescribeClusterParameters operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(
            DescribeClusterParametersRequest describeClusterParametersRequest);

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each
     * parameter the response includes information such as parameter name, description, data type, value, whether the
     * parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only specific type. For example, to retrieve
     * parameters that were modified by a user action such as from <a>ModifyClusterParameterGroup</a>, you can specify
     * <i>source</i> equal to <i>user</i>.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterParameters operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(
            DescribeClusterParametersRequest describeClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParametersRequest, DescribeClusterParametersResult> asyncHandler);

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the
     * response will contain only information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all security
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSecurityGroupsRequest
     * @return A Java Future containing the result of the DescribeClusterSecurityGroups operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeClusterSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest);

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the
     * response will contain only information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all security
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterSecurityGroups operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest)
     */
    java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this
     * operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No
     * information is returned for snapshots owned by inactive AWS customer accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all snapshots
     * that have any combination of those values are returned. Only snapshots that you own are returned in the response;
     * shared snapshots are not returned with the tag key and tag value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSnapshotsRequest
     * @return A Java Future containing the result of the DescribeClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest);

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this
     * operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No
     * information is returned for snapshots owned by inactive AWS customer accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all snapshots
     * that have any combination of those values are returned. Only snapshots that you own are returned in the response;
     * shared snapshots are not returned with the tag key and tag value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterSnapshots operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By
     * default, this operation returns information about all cluster subnet groups that are defined in you AWS account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all subnet
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSubnetGroupsRequest
     * @return A Java Future containing the result of the DescribeClusterSubnetGroups operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest);

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By
     * default, this operation returns information about all cluster subnet groups that are defined in you AWS account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all subnet
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSubnetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterSubnetGroups operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest)
     */
    java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the available maintenance tracks.
     * </p>
     * 
     * @param describeClusterTracksRequest
     * @return A Java Future containing the result of the DescribeClusterTracks operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterTracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterTracks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(DescribeClusterTracksRequest describeClusterTracksRequest);

    /**
     * <p>
     * Returns a list of all the available maintenance tracks.
     * </p>
     * 
     * @param describeClusterTracksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterTracks operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterTracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterTracks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(DescribeClusterTracksRequest describeClusterTracksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterTracksRequest, DescribeClusterTracksResult> asyncHandler);

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
     * creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
     * clusters, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon
     * Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterVersionsRequest
     * @return A Java Future containing the result of the DescribeClusterVersions operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusterVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest describeClusterVersionsRequest);

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
     * creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
     * clusters, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon
     * Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusterVersions operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusterVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest describeClusterVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest)
     */
    java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync();

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation with an AsyncHandler.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties,
     * maintenance and backup properties, and security and access properties. This operation supports pagination. For
     * more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all clusters
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties,
     * maintenance and backup properties, and security and access properties. This operation supports pagination. For
     * more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all clusters
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClustersAsync(DescribeClustersRequest)
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync();

    /**
     * Simplified method form for invoking the DescribeClusters operation with an AsyncHandler.
     *
     * @see #describeClustersAsync(DescribeClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter group family.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeDefaultClusterParametersRequest
     * @return A Java Future containing the result of the DescribeDefaultClusterParameters operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(
            DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest);

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter group family.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeDefaultClusterParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDefaultClusterParameters operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(
            DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultClusterParametersRequest, DefaultClusterParameters> asyncHandler);

    /**
     * <p>
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the
     * event categories and source types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html">Amazon Redshift
     * Event Notifications</a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventCategories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the
     * event categories and source types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html">Amazon Redshift
     * Event Notifications</a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventCategories"
     *      target="_top">AWS API Documentation</a>
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
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you
     * specify a subscription name, lists the description for that subscription.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification
     * subscriptions that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all subscriptions that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you
     * specify a subscription name, lists the description for that subscription.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification
     * subscriptions that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all subscriptions that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
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
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
     * specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
     * name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
     * specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
     * name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEvents" target="_top">AWS API
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
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns
     * information about all the HSM certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client
     * certificates that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all HSM client certificates that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of
     * whether they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmClientCertificatesRequest
     * @return A Java Future containing the result of the DescribeHsmClientCertificates operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeHsmClientCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmClientCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest);

    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns
     * information about all the HSM certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client
     * certificates that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all HSM client certificates that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of
     * whether they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmClientCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHsmClientCertificates operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeHsmClientCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmClientCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest)
     */
    java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync();

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation with an AsyncHandler.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified,
     * returns information about all the HSM configurations owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all HSM
     * connections that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmConfigurationsRequest
     * @return A Java Future containing the result of the DescribeHsmConfigurations operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeHsmConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest);

    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified,
     * returns information about all the HSM configurations owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all HSM
     * connections that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHsmConfigurations operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeHsmConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation with an AsyncHandler.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
     * Redshift cluster.
     * </p>
     * 
     * @param describeLoggingStatusRequest
     * @return A Java Future containing the result of the DescribeLoggingStatus operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeLoggingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeLoggingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(DescribeLoggingStatusRequest describeLoggingStatusRequest);

    /**
     * <p>
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
     * Redshift cluster.
     * </p>
     * 
     * @param describeLoggingStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoggingStatus operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeLoggingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeLoggingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(DescribeLoggingStatusRequest describeLoggingStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingStatusRequest, DescribeLoggingStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find
     * what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can
     * specify, and the node types you can request. The node types differ by available storage, memory, CPU and price.
     * With the cost involved you might want to obtain a list of cluster options in the specific region and specify
     * values when creating a cluster. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeOrderableClusterOptionsRequest
     * @return A Java Future containing the result of the DescribeOrderableClusterOptions operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeOrderableClusterOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeOrderableClusterOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest);

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find
     * what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can
     * specify, and the node types you can request. The node types differ by available storage, memory, CPU and price.
     * With the cost involved you might want to obtain a list of cluster options in the specific region and specify
     * values when creating a cluster. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeOrderableClusterOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrderableClusterOptions operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeOrderableClusterOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeOrderableClusterOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest)
     */
    java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync();

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation with an AsyncHandler.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the
     * node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you.
     * These descriptions help you determine which reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to <a>PurchaseReservedNodeOffering</a> to reserve one or more nodes for your Amazon
     * Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeReservedNodeOfferingsRequest
     * @return A Java Future containing the result of the DescribeReservedNodeOfferings operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.DescribeReservedNodeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest);

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the
     * node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you.
     * These descriptions help you determine which reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to <a>PurchaseReservedNodeOffering</a> to reserve one or more nodes for your Amazon
     * Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeReservedNodeOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedNodeOfferings operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.DescribeReservedNodeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest)
     */
    java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync();

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler);

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return A Java Future containing the result of the DescribeReservedNodes operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest);

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedNodes operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest)
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync();

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation with an AsyncHandler.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever
     * been initiated for the specified cluster, a <code>HTTP 404</code> error is returned. If a resize operation was
     * initiated and completed, the status of the resize remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using <a>ModifyCluster</a> and specifying a different number or type of nodes
     * for the cluster.
     * </p>
     * 
     * @param describeResizeRequest
     * @return A Java Future containing the result of the DescribeResize operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeResize" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest describeResizeRequest);

    /**
     * <p>
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever
     * been initiated for the specified cluster, a <code>HTTP 404</code> error is returned. If a resize operation was
     * initiated and completed, the status of the resize remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using <a>ModifyCluster</a> and specifying a different number or type of nodes
     * for the cluster.
     * </p>
     * 
     * @param describeResizeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResize operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeResize" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest describeResizeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResizeRequest, DescribeResizeResult> asyncHandler);

    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeSnapshotCopyGrantsRequest
     *        The result of the <code>DescribeSnapshotCopyGrants</code> action.
     * @return A Java Future containing the result of the DescribeSnapshotCopyGrants operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeSnapshotCopyGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotCopyGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest);

    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeSnapshotCopyGrantsRequest
     *        The result of the <code>DescribeSnapshotCopyGrants</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshotCopyGrants operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeSnapshotCopyGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotCopyGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation with an AsyncHandler.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of snapshot schedules.
     * </p>
     * 
     * @param describeSnapshotSchedulesRequest
     * @return A Java Future containing the result of the DescribeSnapshotSchedules operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeSnapshotSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(
            DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest);

    /**
     * <p>
     * Returns a list of snapshot schedules.
     * </p>
     * 
     * @param describeSnapshotSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshotSchedules operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeSnapshotSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(
            DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotSchedulesRequest, DescribeSnapshotSchedulesResult> asyncHandler);

    /**
     * <p>
     * Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.
     * </p>
     * 
     * @param describeStorageRequest
     * @return A Java Future containing the result of the DescribeStorage operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeStorage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(DescribeStorageRequest describeStorageRequest);

    /**
     * <p>
     * Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.
     * </p>
     * 
     * @param describeStorageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorage operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeStorage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(DescribeStorageRequest describeStorageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageRequest, DescribeStorageResult> asyncHandler);

    /**
     * <p>
     * Lists the status of one or more table restore requests made using the <a>RestoreTableFromClusterSnapshot</a> API
     * action. If you don't specify a value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all table restore requests ordered by the date and
     * time of the request in ascending order. Otherwise <code>DescribeTableRestoreStatus</code> returns the status of
     * the table specified by <code>TableRestoreRequestId</code>.
     * </p>
     * 
     * @param describeTableRestoreStatusRequest
     * @return A Java Future containing the result of the DescribeTableRestoreStatus operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(
            DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest);

    /**
     * <p>
     * Lists the status of one or more table restore requests made using the <a>RestoreTableFromClusterSnapshot</a> API
     * action. If you don't specify a value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all table restore requests ordered by the date and
     * time of the request in ascending order. Otherwise <code>DescribeTableRestoreStatus</code> returns the status of
     * the table specified by <code>TableRestoreRequestId</code>.
     * </p>
     * 
     * @param describeTableRestoreStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTableRestoreStatus operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(
            DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest)
     */
    java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync();

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation with an AsyncHandler.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all
     * tags for a given type of resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot specify an ARN and a resource-type value together in the same request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use the <code>MaxRecords</code> and <code>Marker</code> parameters together with the ARN parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxRecords</code> parameter can be a range from 10 to 50 results to return in a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all resources
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonRedshiftAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all
     * tags for a given type of resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot specify an ARN and a resource-type value together in the same request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use the <code>MaxRecords</code> and <code>Marker</code> parameters together with the ARN parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxRecords</code> parameter can be a range from 10 to 50 results to return in a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all resources
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync();

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param disableLoggingRequest
     * @return A Java Future containing the result of the DisableLogging operation returned by the service.
     * @sample AmazonRedshiftAsync.DisableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(DisableLoggingRequest disableLoggingRequest);

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param disableLoggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableLogging operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DisableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(DisableLoggingRequest disableLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<DisableLoggingRequest, DisableLoggingResult> asyncHandler);

    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster.
     * </p>
     * <p>
     * If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use
     * <a>DeleteSnapshotCopyGrant</a> to delete the grant that grants Amazon Redshift permission to the CMK in the
     * destination region.
     * </p>
     * 
     * @param disableSnapshotCopyRequest
     * @return A Java Future containing the result of the DisableSnapshotCopy operation returned by the service.
     * @sample AmazonRedshiftAsync.DisableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest disableSnapshotCopyRequest);

    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster.
     * </p>
     * <p>
     * If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use
     * <a>DeleteSnapshotCopyGrant</a> to delete the grant that grants Amazon Redshift permission to the CMK in the
     * destination region.
     * </p>
     * 
     * @param disableSnapshotCopyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSnapshotCopy operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.DisableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest disableSnapshotCopyRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSnapshotCopyRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param enableLoggingRequest
     * @return A Java Future containing the result of the EnableLogging operation returned by the service.
     * @sample AmazonRedshiftAsync.EnableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest enableLoggingRequest);

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param enableLoggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableLogging operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.EnableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest enableLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<EnableLoggingRequest, EnableLoggingResult> asyncHandler);

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     * </p>
     * 
     * @param enableSnapshotCopyRequest
     * @return A Java Future containing the result of the EnableSnapshotCopy operation returned by the service.
     * @sample AmazonRedshiftAsync.EnableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest enableSnapshotCopyRequest);

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     * </p>
     * 
     * @param enableSnapshotCopyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSnapshotCopy operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.EnableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest enableSnapshotCopyRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSnapshotCopyRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift
     * database. The action returns the database user name prefixed with <code>IAM:</code> if <code>AutoCreate</code> is
     * <code>False</code> or <code>IAMA:</code> if <code>AutoCreate</code> is <code>True</code>. You can optionally
     * specify one or more database user groups that the user will join at log on. By default, the temporary credentials
     * expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds
     * (60 minutes). For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/generating-user-credentials.html">Using IAM Authentication
     * to Generate Database User Credentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM
     * policy attached that allows access to all necessary actions and resources. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html#redshift-policy-resources.getclustercredentials-resources"
     * >Resource Policies for GetClusterCredentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If the <code>DbGroups</code> parameter is specified, the IAM policy must allow the
     * <code>redshift:JoinGroup</code> action with access to the listed <code>dbgroups</code>.
     * </p>
     * <p>
     * In addition, if the <code>AutoCreate</code> parameter is set to <code>True</code>, then the policy must include
     * the <code>redshift:CreateClusterUser</code> privilege.
     * </p>
     * <p>
     * If the <code>DbName</code> parameter is specified, the IAM policy must allow access to the resource
     * <code>dbname</code> for the specified database name.
     * </p>
     * 
     * @param getClusterCredentialsRequest
     *        The request parameters to get cluster credentials.
     * @return A Java Future containing the result of the GetClusterCredentials operation returned by the service.
     * @sample AmazonRedshiftAsync.GetClusterCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(GetClusterCredentialsRequest getClusterCredentialsRequest);

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift
     * database. The action returns the database user name prefixed with <code>IAM:</code> if <code>AutoCreate</code> is
     * <code>False</code> or <code>IAMA:</code> if <code>AutoCreate</code> is <code>True</code>. You can optionally
     * specify one or more database user groups that the user will join at log on. By default, the temporary credentials
     * expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds
     * (60 minutes). For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/generating-user-credentials.html">Using IAM Authentication
     * to Generate Database User Credentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM
     * policy attached that allows access to all necessary actions and resources. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html#redshift-policy-resources.getclustercredentials-resources"
     * >Resource Policies for GetClusterCredentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If the <code>DbGroups</code> parameter is specified, the IAM policy must allow the
     * <code>redshift:JoinGroup</code> action with access to the listed <code>dbgroups</code>.
     * </p>
     * <p>
     * In addition, if the <code>AutoCreate</code> parameter is set to <code>True</code>, then the policy must include
     * the <code>redshift:CreateClusterUser</code> privilege.
     * </p>
     * <p>
     * If the <code>DbName</code> parameter is specified, the IAM policy must allow access to the resource
     * <code>dbname</code> for the specified database name.
     * </p>
     * 
     * @param getClusterCredentialsRequest
     *        The request parameters to get cluster credentials.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClusterCredentials operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.GetClusterCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(GetClusterCredentialsRequest getClusterCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetClusterCredentialsRequest, GetClusterCredentialsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
     * DC1 reserved node.
     * </p>
     * 
     * @param getReservedNodeExchangeOfferingsRequest
     * @return A Java Future containing the result of the GetReservedNodeExchangeOfferings operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.GetReservedNodeExchangeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            GetReservedNodeExchangeOfferingsRequest getReservedNodeExchangeOfferingsRequest);

    /**
     * <p>
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
     * DC1 reserved node.
     * </p>
     * 
     * @param getReservedNodeExchangeOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReservedNodeExchangeOfferings operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.GetReservedNodeExchangeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            GetReservedNodeExchangeOfferingsRequest getReservedNodeExchangeOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetReservedNodeExchangeOfferingsRequest, GetReservedNodeExchangeOfferingsResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the
     * preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the
     * security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a
     * reboot for parameters to take effect. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster,
     * you must specify both the number of nodes and the node type even if one of the parameters does not change.
     * </p>
     * 
     * @param modifyClusterRequest
     * @return A Java Future containing the result of the ModifyCluster operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest);

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the
     * preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the
     * security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a
     * reboot for parameters to take effect. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster,
     * you must specify both the number of nodes and the node type even if one of the parameters does not change.
     * </p>
     * 
     * @param modifyClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCluster operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running
     * in a cluster.
     * </p>
     * 
     * @param modifyClusterDbRevisionRequest
     * @return A Java Future containing the result of the ModifyClusterDbRevision operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterDbRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterDbRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest);

    /**
     * <p>
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running
     * in a cluster.
     * </p>
     * 
     * @param modifyClusterDbRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterDbRevision operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterDbRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterDbRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterDbRevisionRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access
     * other AWS services.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param modifyClusterIamRolesRequest
     * @return A Java Future containing the result of the ModifyClusterIamRoles operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterIamRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterIamRoles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest);

    /**
     * <p>
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access
     * other AWS services.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param modifyClusterIamRolesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterIamRoles operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterIamRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterIamRoles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterIamRolesRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
     * update or cancel a deferment.
     * </p>
     * 
     * @param modifyClusterMaintenanceRequest
     * @return A Java Future containing the result of the ModifyClusterMaintenance operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterMaintenance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest);

    /**
     * <p>
     * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
     * update or cancel a deferment.
     * </p>
     * 
     * @param modifyClusterMaintenanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterMaintenance operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterMaintenance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterMaintenanceRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param modifyClusterParameterGroupRequest
     * @return A Java Future containing the result of the ModifyClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(
            ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param modifyClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(
            ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a snapshot.
     * </p>
     * 
     * @param modifyClusterSnapshotRequest
     * @return A Java Future containing the result of the ModifyClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(ModifyClusterSnapshotRequest modifyClusterSnapshotRequest);

    /**
     * <p>
     * Modifies the settings for a snapshot.
     * </p>
     * 
     * @param modifyClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(ModifyClusterSnapshotRequest modifyClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Modifies a snapshot schedule for a cluster.
     * </p>
     * 
     * @param modifyClusterSnapshotScheduleRequest
     * @return A Java Future containing the result of the ModifyClusterSnapshotSchedule operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.ModifyClusterSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(
            ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest);

    /**
     * <p>
     * Modifies a snapshot schedule for a cluster.
     * </p>
     * 
     * @param modifyClusterSnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterSnapshotSchedule operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(
            ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotScheduleRequest, ModifyClusterSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
     * list of subnets with the new list of subnets.
     * </p>
     * 
     * @param modifyClusterSubnetGroupRequest
     * @return A Java Future containing the result of the ModifyClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest);

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
     * list of subnets with the new list of subnets.
     * </p>
     * 
     * @param modifyClusterSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClusterSubnetGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler);

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler);

    /**
     * <p>
     * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the
     * source AWS Region. By default, this operation only changes the retention period of copied automated snapshots.
     * The retention periods for both new and existing copied automated snapshots are updated with the new retention
     * period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set
     * this option, only newly copied manual snapshots have the new retention period.
     * </p>
     * 
     * @param modifySnapshotCopyRetentionPeriodRequest
     * @return A Java Future containing the result of the ModifySnapshotCopyRetentionPeriod operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.ModifySnapshotCopyRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(
            ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest);

    /**
     * <p>
     * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the
     * source AWS Region. By default, this operation only changes the retention period of copied automated snapshots.
     * The retention periods for both new and existing copied automated snapshots are updated with the new retention
     * period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set
     * this option, only newly copied manual snapshots have the new retention period.
     * </p>
     * 
     * @param modifySnapshotCopyRetentionPeriodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySnapshotCopyRetentionPeriod operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.ModifySnapshotCopyRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(
            ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotCopyRetentionPeriodRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
     * </p>
     * 
     * @param modifySnapshotScheduleRequest
     * @return A Java Future containing the result of the ModifySnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsync.ModifySnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(ModifySnapshotScheduleRequest modifySnapshotScheduleRequest);

    /**
     * <p>
     * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
     * </p>
     * 
     * @param modifySnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySnapshotSchedule operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ModifySnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(ModifySnapshotScheduleRequest modifySnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotScheduleRequest, ModifySnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You
     * can purchase one or more of the offerings. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain
     * the available reserved node offerings. You can call this API by providing a specific reserved node offering and
     * the number of nodes you want to reserve.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param purchaseReservedNodeOfferingRequest
     * @return A Java Future containing the result of the PurchaseReservedNodeOffering operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.PurchaseReservedNodeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PurchaseReservedNodeOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest);

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You
     * can purchase one or more of the offerings. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain
     * the available reserved node offerings. You can call this API by providing a specific reserved node offering and
     * the number of nodes you want to reserve.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param purchaseReservedNodeOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedNodeOffering operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.PurchaseReservedNodeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PurchaseReservedNodeOffering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler);

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster,
     * during which the cluster status is set to <code>rebooting</code>. A cluster event is created when the reboot is
     * completed. Any pending cluster modifications (see <a>ModifyCluster</a>) are applied at this reboot. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param rebootClusterRequest
     * @return A Java Future containing the result of the RebootCluster operation returned by the service.
     * @sample AmazonRedshiftAsync.RebootCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RebootCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest rebootClusterRequest);

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster,
     * during which the cluster status is set to <code>rebooting</code>. A cluster event is created when the reboot is
     * completed. Any pending cluster modifications (see <a>ModifyCluster</a>) are applied at this reboot. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param rebootClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootCluster operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.RebootCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RebootCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest rebootClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RebootClusterRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values
     * of the parameters to "engine-default". To reset the entire parameter group specify the <i>ResetAllParameters</i>
     * parameter. For parameter changes to take effect you must reboot any associated clusters.
     * </p>
     * 
     * @param resetClusterParameterGroupRequest
     * @return A Java Future containing the result of the ResetClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsync.ResetClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResetClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(
            ResetClusterParameterGroupRequest resetClusterParameterGroupRequest);

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values
     * of the parameters to "engine-default". To reset the entire parameter group specify the <i>ResetAllParameters</i>
     * parameter. For parameter changes to take effect you must reboot any associated clusters.
     * </p>
     * 
     * @param resetClusterParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetClusterParameterGroup operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ResetClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResetClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(
            ResetClusterParameterGroupRequest resetClusterParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The
     * default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read
     * and write operations more quickly than with the classic resize method.
     * </p>
     * <p>
     * Elastic resize operations have the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only resize clusters of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * dc2.large
     * </p>
     * </li>
     * <li>
     * <p>
     * dc2.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.8xlarge
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The type of nodes that you add must match the node type for the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeClusterRequest
     * @return A Java Future containing the result of the ResizeCluster operation returned by the service.
     * @sample AmazonRedshiftAsync.ResizeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> resizeClusterAsync(ResizeClusterRequest resizeClusterRequest);

    /**
     * <p>
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The
     * default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read
     * and write operations more quickly than with the classic resize method.
     * </p>
     * <p>
     * Elastic resize operations have the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only resize clusters of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * dc2.large
     * </p>
     * </li>
     * <li>
     * <p>
     * dc2.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.8xlarge
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The type of nodes that you add must match the node type for the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResizeCluster operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.ResizeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Cluster> resizeClusterAsync(ResizeClusterRequest resizeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ResizeClusterRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same
     * configuration as the original cluster from which the snapshot was created, except that the new cluster is created
     * with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use
     * the <a>ModifyCluster</a> API to associate a different security group and different parameter group with the
     * restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the
     * same size during restore.
     * </p>
     * <p>
     * If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param restoreFromClusterSnapshotRequest
     * @return A Java Future containing the result of the RestoreFromClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsync.RestoreFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same
     * configuration as the original cluster from which the snapshot was created, except that the new cluster is created
     * with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use
     * the <a>ModifyCluster</a> API to associate a different security group and different parameter group with the
     * restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the
     * same size during restore.
     * </p>
     * <p>
     * If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param restoreFromClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreFromClusterSnapshot operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.RestoreFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler);

    /**
     * <p>
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the
     * Amazon Redshift cluster that the snapshot was taken from.
     * </p>
     * <p>
     * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore a table with the same name as an existing
     * table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored
     * table. If you want to replace your original table with a new, restored table, then rename or drop your original
     * table before you call <code>RestoreTableFromClusterSnapshot</code>. When you have renamed your original table,
     * then you can pass the original name of the table as the <code>NewTableName</code> parameter value in the call to
     * <code>RestoreTableFromClusterSnapshot</code>. This way, you can replace the original table with the table created
     * from the snapshot.
     * </p>
     * 
     * @param restoreTableFromClusterSnapshotRequest
     * @return A Java Future containing the result of the RestoreTableFromClusterSnapshot operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.RestoreTableFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreTableFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(
            RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the
     * Amazon Redshift cluster that the snapshot was taken from.
     * </p>
     * <p>
     * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore a table with the same name as an existing
     * table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored
     * table. If you want to replace your original table with a new, restored table, then rename or drop your original
     * table before you call <code>RestoreTableFromClusterSnapshot</code>. When you have renamed your original table,
     * then you can pass the original name of the table as the <code>NewTableName</code> parameter value in the call to
     * <code>RestoreTableFromClusterSnapshot</code>. This way, you can replace the original table with the table created
     * from the snapshot.
     * </p>
     * 
     * @param restoreTableFromClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreTableFromClusterSnapshot operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.RestoreTableFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreTableFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(
            RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreTableFromClusterSnapshotRequest, TableRestoreStatus> asyncHandler);

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2
     * security group. To add an ingress rule, see <a>AuthorizeClusterSecurityGroupIngress</a>. For information about
     * managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeClusterSecurityGroupIngressRequest
     * @return A Java Future containing the result of the RevokeClusterSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRedshiftAsync.RevokeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(
            RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest);

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2
     * security group. To add an ingress rule, see <a>AuthorizeClusterSecurityGroupIngress</a>. For information about
     * managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeClusterSecurityGroupIngressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeClusterSecurityGroupIngress operation returned by the
     *         service.
     * @sample AmazonRedshiftAsyncHandler.RevokeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(
            RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler);

    /**
     * <p>
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is
     * currently restoring the snapshot, the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeSnapshotAccessRequest
     * @return A Java Future containing the result of the RevokeSnapshotAccess operation returned by the service.
     * @sample AmazonRedshiftAsync.RevokeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeSnapshotAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest);

    /**
     * <p>
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is
     * currently restoring the snapshot, the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeSnapshotAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeSnapshotAccess operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.RevokeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeSnapshotAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeSnapshotAccessRequest, Snapshot> asyncHandler);

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     * 
     * @param rotateEncryptionKeyRequest
     * @return A Java Future containing the result of the RotateEncryptionKey operation returned by the service.
     * @sample AmazonRedshiftAsync.RotateEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RotateEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest rotateEncryptionKeyRequest);

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     * 
     * @param rotateEncryptionKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateEncryptionKey operation returned by the service.
     * @sample AmazonRedshiftAsyncHandler.RotateEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RotateEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest rotateEncryptionKeyRequest,
            com.amazonaws.handlers.AsyncHandler<RotateEncryptionKeyRequest, Cluster> asyncHandler);

}
