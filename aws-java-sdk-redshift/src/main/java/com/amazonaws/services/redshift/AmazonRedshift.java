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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters;

/**
 * Interface for accessing Amazon Redshift.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshift.AbstractAmazonRedshift} instead.
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
public interface AmazonRedshift {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "redshift";

    /**
     * Overrides the default endpoint for this client ("redshift.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "redshift.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "redshift.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRedshift#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
     * or number of nodes) and no additional costs.
     * </p>
     * 
     * @param acceptReservedNodeExchangeRequest
     * @return Result of the AcceptReservedNodeExchange operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws InvalidReservedNodeStateException
     *         Indicates that the Reserved Node being exchanged is not in an active state.
     * @throws ReservedNodeAlreadyMigratedException
     *         Indicates that the reserved node has already been exchanged.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @throws ReservedNodeAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @sample AmazonRedshift.AcceptReservedNodeExchange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AcceptReservedNodeExchange"
     *      target="_top">AWS API Documentation</a>
     */
    ReservedNode acceptReservedNodeExchange(AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest);

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
     * @return Result of the AuthorizeClusterSecurityGroupIngress operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDR block or EC2 security group is already authorized for the specified cluster security
     *         group.
     * @throws AuthorizationQuotaExceededException
     *         The authorization quota for the cluster security group has been reached.
     * @sample AmazonRedshift.AuthorizeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest);

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
     * @return Result of the AuthorizeSnapshotAccess operation returned by the service.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDR block or EC2 security group is already authorized for the specified cluster security
     *         group.
     * @throws AuthorizationQuotaExceededException
     *         The authorization quota for the cluster security group has been reached.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @sample AmazonRedshift.AuthorizeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeSnapshotAccess"
     *      target="_top">AWS API Documentation</a>
     */
    Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest);

    /**
     * <p>
     * Deletes a set of cluster snapshots.
     * </p>
     * 
     * @param batchDeleteClusterSnapshotsRequest
     * @return Result of the BatchDeleteClusterSnapshots operation returned by the service.
     * @throws BatchDeleteRequestSizeExceededException
     *         The maximum number for a batch delete of snapshots has been reached. The limit is 100.
     * @sample AmazonRedshift.BatchDeleteClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchDeleteClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteClusterSnapshotsResult batchDeleteClusterSnapshots(BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest);

    /**
     * <p>
     * Modifies the settings for a list of snapshots.
     * </p>
     * 
     * @param batchModifyClusterSnapshotsRequest
     * @return Result of the BatchModifyClusterSnapshots operation returned by the service.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @throws BatchModifyClusterSnapshotsLimitExceededException
     *         The maximum number for snapshot identifiers has been reached. The limit is 100.
     * @sample AmazonRedshift.BatchModifyClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchModifyClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    BatchModifyClusterSnapshotsResult batchModifyClusterSnapshots(BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest);

    /**
     * <p>
     * Cancels a resize operation.
     * </p>
     * 
     * @param cancelResizeRequest
     * @return Result of the CancelResize operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ResizeNotFoundException
     *         A resize operation for the specified cluster is not found.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.CancelResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CancelResize" target="_top">AWS API
     *      Documentation</a>
     */
    CancelResizeResult cancelResize(CancelResizeRequest cancelResizeRequest);

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
     * @return Result of the CopyClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CopyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CopyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest);

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
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws ClusterQuotaExceededException
     *         The request would exceed the allowed number of cluster instances for this account. For information about
     *         increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The cluster subnet group does not cover all Availability Zones.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    Cluster createCluster(CreateClusterRequest createClusterRequest);

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
     * @return Result of the CreateClusterParameterGroup operation returned by the service.
     * @throws ClusterParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster parameter groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws ClusterParameterGroupAlreadyExistsException
     *         A cluster parameter group with the same name already exists.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest createClusterParameterGroupRequest);

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
     * @return Result of the CreateClusterSecurityGroup operation returned by the service.
     * @throws ClusterSecurityGroupAlreadyExistsException
     *         A cluster security group with the same name already exists.
     * @throws ClusterSecurityGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster security groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest);

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
     * @return Result of the CreateClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    Snapshot createClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest);

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
     * @return Result of the CreateClusterSubnetGroup operation returned by the service.
     * @throws ClusterSubnetGroupAlreadyExistsException
     *         A <i>ClusterSubnetGroupName</i> is already used by an existing cluster subnet group.
     * @throws ClusterSubnetGroupQuotaExceededException
     *         The request would result in user exceeding the allowed number of cluster subnet groups. For information
     *         about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws ClusterSubnetQuotaExceededException
     *         The request would result in user exceeding the allowed number of subnets in a cluster subnet groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.CreateClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest);

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
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         The request would exceed the allowed number of event subscriptions for this account. For information
     *         about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws SubscriptionAlreadyExistException
     *         There is already an existing event notification subscription with the specified name.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified Amazon SNS topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the specified Amazon SNS topic.
     * @throws SNSTopicArnNotFoundException
     *         An Amazon SNS topic with the specified Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionEventIdNotFoundException
     *         An Amazon Redshift event with the specified event ID does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The value specified for the event category was not one of the allowed values, or it specified a category
     *         that does not apply to the specified source type. The allowed values are Configuration, Management,
     *         Monitoring, and Security.
     * @throws SubscriptionSeverityNotFoundException
     *         The value specified for the event severity was not one of the allowed values, or it specified a severity
     *         that does not apply to the specified source type. The allowed values are ERROR and INFO.
     * @throws SourceNotFoundException
     *         The specified Amazon Redshift event source could not be found.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

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
     * @return Result of the CreateHsmClientCertificate operation returned by the service.
     * @throws HsmClientCertificateAlreadyExistsException
     *         There is already an existing Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmClientCertificateQuotaExceededException
     *         The quota for HSM client certificates has been reached. For information about increasing your quota, go
     *         to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in
     *         Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    HsmClientCertificate createHsmClientCertificate(CreateHsmClientCertificateRequest createHsmClientCertificateRequest);

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
     * @return Result of the CreateHsmConfiguration operation returned by the service.
     * @throws HsmConfigurationAlreadyExistsException
     *         There is already an existing Amazon Redshift HSM configuration with the specified identifier.
     * @throws HsmConfigurationQuotaExceededException
     *         The quota for HSM configurations has been reached. For information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    HsmConfiguration createHsmConfiguration(CreateHsmConfigurationRequest createHsmConfigurationRequest);

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
     * @return Result of the CreateSnapshotCopyGrant operation returned by the service.
     * @throws SnapshotCopyGrantAlreadyExistsException
     *         The snapshot copy grant can't be created because a grant with the same name already exists.
     * @throws SnapshotCopyGrantQuotaExceededException
     *         The AWS account has exceeded the maximum number of snapshot copy grants in this region.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.CreateSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    SnapshotCopyGrant createSnapshotCopyGrant(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest);

    /**
     * <p>
     * Creates a new snapshot schedule.
     * </p>
     * 
     * @param createSnapshotScheduleRequest
     * @return Result of the CreateSnapshotSchedule operation returned by the service.
     * @throws SnapshotScheduleAlreadyExistsException
     *         The specified snapshot schedule already exists.
     * @throws InvalidScheduleException
     *         The schedule you submitted isn't valid.
     * @throws SnapshotScheduleQuotaExceededException
     *         You have exceeded the quota of snapshot schedules.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws ScheduleDefinitionTypeUnsupportedException
     *         The definition you submitted is not supported.
     * @sample AmazonRedshift.CreateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest createSnapshotScheduleRequest);

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
     * @return Result of the CreateTags operation returned by the service.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

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
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    Cluster deleteCluster(DeleteClusterRequest deleteClusterRequest);

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
     * @return Result of the DeleteClusterParameterGroup operation returned by the service.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.DeleteClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteClusterParameterGroupResult deleteClusterParameterGroup(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest);

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
     * @return Result of the DeleteClusterSecurityGroup operation returned by the service.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @sample AmazonRedshift.DeleteClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteClusterSecurityGroupResult deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest);

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
     * @return Result of the DeleteClusterSnapshot operation returned by the service.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @sample AmazonRedshift.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest);

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     * 
     * @param deleteClusterSubnetGroupRequest
     * @return Result of the DeleteClusterSubnetGroup operation returned by the service.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidClusterSubnetStateException
     *         The state of the subnet is invalid.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @sample AmazonRedshift.DeleteClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest);

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws InvalidSubscriptionStateException
     *         The subscription request is invalid because it is a duplicate request. This subscription request is
     *         already in progress.
     * @sample AmazonRedshift.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventSubscriptionResult deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     * 
     * @param deleteHsmClientCertificateRequest
     * @return Result of the DeleteHsmClientCertificate operation returned by the service.
     * @throws InvalidHsmClientCertificateStateException
     *         The specified HSM client certificate is not in the <code>available</code> state, or it is still in use by
     *         one or more Amazon Redshift clusters.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @sample AmazonRedshift.DeleteHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHsmClientCertificateResult deleteHsmClientCertificate(DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest);

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param deleteHsmConfigurationRequest
     * @return Result of the DeleteHsmConfiguration operation returned by the service.
     * @throws InvalidHsmConfigurationStateException
     *         The specified HSM configuration is not in the <code>available</code> state, or it is still in use by one
     *         or more Amazon Redshift clusters.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @sample AmazonRedshift.DeleteHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest);

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     * 
     * @param deleteSnapshotCopyGrantRequest
     *        The result of the <code>DeleteSnapshotCopyGrant</code> action.
     * @return Result of the DeleteSnapshotCopyGrant operation returned by the service.
     * @throws InvalidSnapshotCopyGrantStateException
     *         The snapshot copy grant can't be deleted because it is used by one or more clusters.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @sample AmazonRedshift.DeleteSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSnapshotCopyGrantResult deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest);

    /**
     * <p>
     * Deletes a snapshot schedule.
     * </p>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return Result of the DeleteSnapshotSchedule operation returned by the service.
     * @throws InvalidClusterSnapshotScheduleStateException
     *         The cluster snapshot schedule state is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @sample AmazonRedshift.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest);

    /**
     * <p>
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
     * tag or tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the output from the <code>DeleteTags</code> action.
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Returns a list of attributes attached to an account
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRedshift.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Returns an array of <code>ClusterDbRevision</code> objects.
     * </p>
     * 
     * @param describeClusterDbRevisionsRequest
     * @return Result of the DescribeClusterDbRevisions operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @sample AmazonRedshift.DescribeClusterDbRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterDbRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterDbRevisionsResult describeClusterDbRevisions(DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest);

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
     * @return Result of the DescribeClusterParameterGroups operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation.
     *
     * @see #describeClusterParameterGroups(DescribeClusterParameterGroupsRequest)
     */
    DescribeClusterParameterGroupsResult describeClusterParameterGroups();

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
     * @return Result of the DescribeClusterParameters operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.DescribeClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest describeClusterParametersRequest);

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
     * @return Result of the DescribeClusterSecurityGroups operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation.
     *
     * @see #describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest)
     */
    DescribeClusterSecurityGroupsResult describeClusterSecurityGroups();

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
     * @return Result of the DescribeClusterSnapshots operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation.
     *
     * @see #describeClusterSnapshots(DescribeClusterSnapshotsRequest)
     */
    DescribeClusterSnapshotsResult describeClusterSnapshots();

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
     * @return Result of the DescribeClusterSubnetGroups operation returned by the service.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation.
     *
     * @see #describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest)
     */
    DescribeClusterSubnetGroupsResult describeClusterSubnetGroups();

    /**
     * <p>
     * Returns a list of all the available maintenance tracks.
     * </p>
     * 
     * @param describeClusterTracksRequest
     * @return Result of the DescribeClusterTracks operation returned by the service.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @sample AmazonRedshift.DescribeClusterTracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterTracks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClusterTracksResult describeClusterTracks(DescribeClusterTracksRequest describeClusterTracksRequest);

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
     * creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
     * clusters, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon
     * Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterVersionsRequest
     * @return Result of the DescribeClusterVersions operation returned by the service.
     * @sample AmazonRedshift.DescribeClusterVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest describeClusterVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation.
     *
     * @see #describeClusterVersions(DescribeClusterVersionsRequest)
     */
    DescribeClusterVersionsResult describeClusterVersions();

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
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

    /**
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClusters(DescribeClustersRequest)
     */
    DescribeClustersResult describeClusters();

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
     * @return Result of the DescribeDefaultClusterParameters operation returned by the service.
     * @sample AmazonRedshift.DescribeDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest);

    /**
     * <p>
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the
     * event categories and source types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html">Amazon Redshift
     * Event Notifications</a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRedshift.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventCategories"
     *      target="_top">AWS API Documentation</a>
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
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
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
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
     * specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
     * name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonRedshift.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
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
     * @return Result of the DescribeHsmClientCertificates operation returned by the service.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeHsmClientCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmClientCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHsmClientCertificatesResult describeHsmClientCertificates(DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest);

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation.
     *
     * @see #describeHsmClientCertificates(DescribeHsmClientCertificatesRequest)
     */
    DescribeHsmClientCertificatesResult describeHsmClientCertificates();

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
     * @return Result of the DescribeHsmConfigurations operation returned by the service.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeHsmConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHsmConfigurationsResult describeHsmConfigurations(DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest);

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation.
     *
     * @see #describeHsmConfigurations(DescribeHsmConfigurationsRequest)
     */
    DescribeHsmConfigurationsResult describeHsmConfigurations();

    /**
     * <p>
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
     * Redshift cluster.
     * </p>
     * 
     * @param describeLoggingStatusRequest
     * @return Result of the DescribeLoggingStatus operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DescribeLoggingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeLoggingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLoggingStatusResult describeLoggingStatus(DescribeLoggingStatusRequest describeLoggingStatusRequest);

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
     * @return Result of the DescribeOrderableClusterOptions operation returned by the service.
     * @sample AmazonRedshift.DescribeOrderableClusterOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeOrderableClusterOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest);

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation.
     *
     * @see #describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest)
     */
    DescribeOrderableClusterOptionsResult describeOrderableClusterOptions();

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
     * @return Result of the DescribeReservedNodeOfferings operation returned by the service.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.DescribeReservedNodeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation.
     *
     * @see #describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest)
     */
    DescribeReservedNodeOfferingsResult describeReservedNodeOfferings();

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return Result of the DescribeReservedNodes operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation.
     *
     * @see #describeReservedNodes(DescribeReservedNodesRequest)
     */
    DescribeReservedNodesResult describeReservedNodes();

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
     * @return Result of the DescribeResize operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ResizeNotFoundException
     *         A resize operation for the specified cluster is not found.
     * @sample AmazonRedshift.DescribeResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeResize" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeResizeResult describeResize(DescribeResizeRequest describeResizeRequest);

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
     * @return Result of the DescribeSnapshotCopyGrants operation returned by the service.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeSnapshotCopyGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotCopyGrants"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation.
     *
     * @see #describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest)
     */
    DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants();

    /**
     * <p>
     * Returns a list of snapshot schedules.
     * </p>
     * 
     * @param describeSnapshotSchedulesRequest
     * @return Result of the DescribeSnapshotSchedules operation returned by the service.
     * @sample AmazonRedshift.DescribeSnapshotSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest);

    /**
     * <p>
     * Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.
     * </p>
     * 
     * @param describeStorageRequest
     * @return Result of the DescribeStorage operation returned by the service.
     * @sample AmazonRedshift.DescribeStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeStorage" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeStorageResult describeStorage(DescribeStorageRequest describeStorageRequest);

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
     * @return Result of the DescribeTableRestoreStatus operation returned by the service.
     * @throws TableRestoreNotFoundException
     *         The specified <code>TableRestoreRequestId</code> value was not found.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DescribeTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTableRestoreStatusResult describeTableRestoreStatus(DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest);

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation.
     *
     * @see #describeTableRestoreStatus(DescribeTableRestoreStatusRequest)
     */
    DescribeTableRestoreStatusResult describeTableRestoreStatus();

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
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTags(DescribeTagsRequest)
     */
    DescribeTagsResult describeTags();

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param disableLoggingRequest
     * @return Result of the DisableLogging operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DisableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    DisableLoggingResult disableLogging(DisableLoggingRequest disableLoggingRequest);

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
     * @return Result of the DisableSnapshotCopy operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotCopyAlreadyDisabledException
     *         The cluster already has cross-region snapshot copy disabled.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @sample AmazonRedshift.DisableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    Cluster disableSnapshotCopy(DisableSnapshotCopyRequest disableSnapshotCopyRequest);

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param enableLoggingRequest
     * @return Result of the EnableLogging operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws BucketNotFoundException
     *         Could not find the specified S3 bucket.
     * @throws InsufficientS3BucketPolicyException
     *         The cluster does not have read bucket or put object permissions on the S3 bucket specified when enabling
     *         logging.
     * @throws InvalidS3KeyPrefixException
     *         The string specified for the logging S3 key prefix does not comply with the documented constraints.
     * @throws InvalidS3BucketNameException
     *         The S3 bucket name is invalid. For more information about naming rules, go to <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *         Limitations</a> in the Amazon Simple Storage Service (S3) Developer Guide.
     * @sample AmazonRedshift.EnableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    EnableLoggingResult enableLogging(EnableLoggingRequest enableLoggingRequest);

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     * </p>
     * 
     * @param enableSnapshotCopyRequest
     * @return Result of the EnableSnapshotCopy operation returned by the service.
     * @throws IncompatibleOrderableOptionsException
     *         The specified options are incompatible.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws CopyToRegionDisabledException
     *         Cross-region snapshot copy was temporarily disabled. Try your request again.
     * @throws SnapshotCopyAlreadyEnabledException
     *         The cluster already has cross-region snapshot copy enabled.
     * @throws UnknownSnapshotCopyRegionException
     *         The specified region is incorrect or does not exist.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.EnableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    Cluster enableSnapshotCopy(EnableSnapshotCopyRequest enableSnapshotCopyRequest);

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
     * @return Result of the GetClusterCredentials operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.GetClusterCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS
     *      API Documentation</a>
     */
    GetClusterCredentialsResult getClusterCredentials(GetClusterCredentialsRequest getClusterCredentialsRequest);

    /**
     * <p>
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
     * DC1 reserved node.
     * </p>
     * 
     * @param getReservedNodeExchangeOfferingsRequest
     * @return Result of the GetReservedNodeExchangeOfferings operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws InvalidReservedNodeStateException
     *         Indicates that the Reserved Node being exchanged is not in an active state.
     * @throws ReservedNodeAlreadyMigratedException
     *         Indicates that the reserved node has already been exchanged.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.GetReservedNodeExchangeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    GetReservedNodeExchangeOfferingsResult getReservedNodeExchangeOfferings(GetReservedNodeExchangeOfferingsRequest getReservedNodeExchangeOfferingsRequest);

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
     * @return Result of the ModifyCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws UnsupportedOptionException
     *         A request option was specified that is not supported.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws TableLimitExceededException
     *         The number of tables in the cluster exceeds the limit for the requested new cluster node type.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    Cluster modifyCluster(ModifyClusterRequest modifyClusterRequest);

    /**
     * <p>
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running
     * in a cluster.
     * </p>
     * 
     * @param modifyClusterDbRevisionRequest
     * @return Result of the ModifyClusterDbRevision operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterOnLatestRevisionException
     *         Cluster is already on the latest database revision.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @sample AmazonRedshift.ModifyClusterDbRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterDbRevision"
     *      target="_top">AWS API Documentation</a>
     */
    Cluster modifyClusterDbRevision(ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest);

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
     * @return Result of the ModifyClusterIamRoles operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.ModifyClusterIamRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterIamRoles" target="_top">AWS
     *      API Documentation</a>
     */
    Cluster modifyClusterIamRoles(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest);

    /**
     * <p>
     * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
     * update or cancel a deferment.
     * </p>
     * 
     * @param modifyClusterMaintenanceRequest
     * @return Result of the ModifyClusterMaintenance operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.ModifyClusterMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterMaintenance"
     *      target="_top">AWS API Documentation</a>
     */
    Cluster modifyClusterMaintenance(ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest);

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
     * @return Result of the ModifyClusterParameterGroup operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @sample AmazonRedshift.ModifyClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest);

    /**
     * <p>
     * Modifies the settings for a snapshot.
     * </p>
     * 
     * @param modifyClusterSnapshotRequest
     * @return Result of the ModifyClusterSnapshot operation returned by the service.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    Snapshot modifyClusterSnapshot(ModifyClusterSnapshotRequest modifyClusterSnapshotRequest);

    /**
     * <p>
     * Modifies a snapshot schedule for a cluster.
     * </p>
     * 
     * @param modifyClusterSnapshotScheduleRequest
     * @return Result of the ModifyClusterSnapshotSchedule operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws InvalidClusterSnapshotScheduleStateException
     *         The cluster snapshot schedule state is not valid.
     * @sample AmazonRedshift.ModifyClusterSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyClusterSnapshotScheduleResult modifyClusterSnapshotSchedule(ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest);

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
     * list of subnets with the new list of subnets.
     * </p>
     * 
     * @param modifyClusterSubnetGroupRequest
     * @return Result of the ModifyClusterSubnetGroup operation returned by the service.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws ClusterSubnetQuotaExceededException
     *         The request would result in user exceeding the allowed number of subnets in a cluster subnet groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws SubnetAlreadyInUseException
     *         A specified subnet is already in use by another cluster.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.ModifyClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest);

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified Amazon SNS topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the specified Amazon SNS topic.
     * @throws SNSTopicArnNotFoundException
     *         An Amazon SNS topic with the specified Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionEventIdNotFoundException
     *         An Amazon Redshift event with the specified event ID does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The value specified for the event category was not one of the allowed values, or it specified a category
     *         that does not apply to the specified source type. The allowed values are Configuration, Management,
     *         Monitoring, and Security.
     * @throws SubscriptionSeverityNotFoundException
     *         The value specified for the event severity was not one of the allowed values, or it specified a severity
     *         that does not apply to the specified source type. The allowed values are ERROR and INFO.
     * @throws SourceNotFoundException
     *         The specified Amazon Redshift event source could not be found.
     * @throws InvalidSubscriptionStateException
     *         The subscription request is invalid because it is a duplicate request. This subscription request is
     *         already in progress.
     * @sample AmazonRedshift.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

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
     * @return Result of the ModifySnapshotCopyRetentionPeriod operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotCopyDisabledException
     *         Cross-region snapshot copy was temporarily disabled. Try your request again.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifySnapshotCopyRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    Cluster modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest);

    /**
     * <p>
     * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
     * </p>
     * 
     * @param modifySnapshotScheduleRequest
     * @return Result of the ModifySnapshotSchedule operation returned by the service.
     * @throws InvalidScheduleException
     *         The schedule you submitted isn't valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws SnapshotScheduleUpdateInProgressException
     *         The specified snapshot schedule is already being updated.
     * @sample AmazonRedshift.ModifySnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    ModifySnapshotScheduleResult modifySnapshotSchedule(ModifySnapshotScheduleRequest modifySnapshotScheduleRequest);

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
     * @return Result of the PurchaseReservedNodeOffering operation returned by the service.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws ReservedNodeAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @throws ReservedNodeQuotaExceededException
     *         Request would exceed the user's compute node quota. For information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.PurchaseReservedNodeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PurchaseReservedNodeOffering"
     *      target="_top">AWS API Documentation</a>
     */
    ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest);

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
     * @return Result of the RebootCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.RebootCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RebootCluster" target="_top">AWS API
     *      Documentation</a>
     */
    Cluster rebootCluster(RebootClusterRequest rebootClusterRequest);

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values
     * of the parameters to "engine-default". To reset the entire parameter group specify the <i>ResetAllParameters</i>
     * parameter. For parameter changes to take effect you must reboot any associated clusters.
     * </p>
     * 
     * @param resetClusterParameterGroupRequest
     * @return Result of the ResetClusterParameterGroup operation returned by the service.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.ResetClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResetClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest);

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
     * @return Result of the ResizeCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws UnsupportedOptionException
     *         A request option was specified that is not supported.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @sample AmazonRedshift.ResizeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    Cluster resizeCluster(ResizeClusterRequest resizeClusterRequest);

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
     * @return Result of the RestoreFromClusterSnapshot operation returned by the service.
     * @throws AccessToSnapshotDeniedException
     *         The owner of the specified snapshot has not authorized your account to access the snapshot.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws ClusterQuotaExceededException
     *         The request would exceed the allowed number of cluster instances for this account. For information about
     *         increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws InvalidRestoreException
     *         The restore is invalid.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws InvalidVPCNetworkStateException
     *         The cluster subnet group does not cover all Availability Zones.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @sample AmazonRedshift.RestoreFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest);

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
     * @return Result of the RestoreTableFromClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InProgressTableRestoreQuotaExceededException
     *         You have exceeded the allowed number of table restore requests. Wait for your current table restore
     *         requests to complete before making a new request.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws InvalidTableRestoreArgumentException
     *         The value specified for the <code>sourceDatabaseName</code>, <code>sourceSchemaName</code>, or
     *         <code>sourceTableName</code> parameter, or a combination of these, doesn't exist in the snapshot.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.RestoreTableFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreTableFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    TableRestoreStatus restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest);

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
     * @return Result of the RevokeClusterSecurityGroupIngress operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or EC2 security group is not authorized for the specified cluster security
     *         group.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @sample AmazonRedshift.RevokeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest);

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
     * @return Result of the RevokeSnapshotAccess operation returned by the service.
     * @throws AccessToSnapshotDeniedException
     *         The owner of the specified snapshot has not authorized your account to access the snapshot.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or EC2 security group is not authorized for the specified cluster security
     *         group.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @sample AmazonRedshift.RevokeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeSnapshotAccess" target="_top">AWS
     *      API Documentation</a>
     */
    Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest);

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     * 
     * @param rotateEncryptionKeyRequest
     * @return Result of the RotateEncryptionKey operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.RotateEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RotateEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    Cluster rotateEncryptionKey(RotateEncryptionKeyRequest rotateEncryptionKeyRequest);

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

    AmazonRedshiftWaiters waiters();

}
