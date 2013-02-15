/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.redshift.model.*;

/**
 * Interface for accessing AmazonRedshift asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Redshift <b>Overview</b> <p>
 * This is the Amazon Redshift API Reference. This guide provides descriptions and samples of the Amazon Redshift API.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity, monitoring and backing up the
 * cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus on using your data to acquire new insights for your business
 * and customers.
 * </p>
 * <b>Are You a First-Time Amazon Redshift User?</b> <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the following sections:
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>Service Highlights and Pricing</i> - The <a href="http://aws.amazon.com/redshift/"> product detail page </a> provides the Amazon Redshift value
 * proposition, service highlights and pricing.
 * </p>
 * </li>
 * <li> <p>
 * <i>Getting Started</i> - The <a href="http://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html"> Getting Started Guide </a> includes an
 * example that walks you through the process of creating a cluster, creating database tables, uploading data, and testing queries.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * After you complete the Getting Started Guide, we recommend that you explore one of the following guides:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>Cluster Management</i> - If you are responsible for managing Amazon Redshift clusters, the <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/welcome.html"> Cluster Management Guide </a> shows you how to create and manage Amazon Redshift
 * clusters.
 * </p>
 * <p>
 * If you are an application developer, you can use the Amazon Redshift Query API to manage clusters programmatically. Additionally, the AWS SDK
 * libraries that wrap the underlying Amazon Redshift API simplify your programming tasks. If you prefer a more interactive way of managing clusters,
 * you can use the Amazon Redshift console and the AWS command line interface (AWS CLI). For information about the API and CLI, go to the following
 * manuals :
 * </p>
 * 
 * <ul>
 * <li> <p>
 * API Reference ( <i>this document</i> )
 * </p>
 * </li>
 * <li> <p>
 * <a href="http://docs.aws.amazon.com/redshift/latest/cli"> CLI Reference </a>
 * </p>
 * </li>
 * 
 * </ul>
 * </li>
 * <li> <p>
 * <i>Amazon Redshift Database Database Developer</i> - If you are a database developer, the Amazon Redshift <a
 * href="http://docs.aws.amazon.com/redshift/latest/dg/rs-dw-intro.html"> Database Developer Guide </a> explains how to design, build, query, and
 * maintain the databases that make up your data warehouse.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For a list of supported AWS regions where you can provision a cluster, go to the <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"> Regions and Endpoints </a> section in the <i>Amazon Web Services
 * Glossary</i> .
 * </p> 
 */       
public interface AmazonRedshiftAsync extends AmazonRedshift {
    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC
     * subnets. The operation replaces the existing list of subnets with the
     * new list of subnets.
     * </p>
     *
     * @param modifyClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterSubnetGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC
     * subnets. The operation replaces the existing list of subnets with the
     * new list of subnets.
     * </p>
     *
     * @param modifyClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterSubnetGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest,
            AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a
     * predefined set of reserved node offerings. You can purchase one of the
     * offerings. You can call the DescribeReservedNodeOfferings API to
     * obtain the available reserved node offerings. You can call this API by
     * providing a specific reserved node offering and the number of nodes
     * you want to reserve.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">
     * Purchasing Reserved Nodes </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * 
     * </p>
     *
     * @param purchaseReservedNodeOfferingRequest Container for the necessary
     *           parameters to execute the PurchaseReservedNodeOffering operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedNodeOffering service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a
     * predefined set of reserved node offerings. You can purchase one of the
     * offerings. You can call the DescribeReservedNodeOfferings API to
     * obtain the available reserved node offerings. You can call this API by
     * providing a specific reserved node offering and the number of nodes
     * you want to reserve.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">
     * Purchasing Reserved Nodes </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * 
     * </p>
     *
     * @param purchaseReservedNodeOfferingRequest Container for the necessary
     *           parameters to execute the PurchaseReservedNodeOffering operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedNodeOffering service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest,
            AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another
     * security or parameter group, update the preferred maintenance window,
     * or change the master user password. Resetting a cluster password or
     * modifying the security groups associated with a cluster do not need a
     * reboot. However, modifying parameter group requires a reboot for
     * parameters to take effect. For more information about managing
     * clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or
     * down the cluster. When resizing a cluster, you must specify both the
     * number of nodes and the node type even if one of the parameters does
     * not change. If you specify the same number of nodes and node type that
     * are already configured for the cluster, an error is returned.
     * </p>
     *
     * @param modifyClusterRequest Container for the necessary parameters to
     *           execute the ModifyCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another
     * security or parameter group, update the preferred maintenance window,
     * or change the master user password. Resetting a cluster password or
     * modifying the security groups associated with a cluster do not need a
     * reboot. However, modifying parameter group requires a reboot for
     * parameters to take effect. For more information about managing
     * clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or
     * down the cluster. When resizing a cluster, you must specify both the
     * number of nodes and the node type even if one of the parameters does
     * not change. If you specify the same number of nodes and node type that
     * are already configured for the cluster, an error is returned.
     * </p>
     *
     * @param modifyClusterRequest Container for the necessary parameters to
     *           execute the ModifyCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest,
            AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param modifyClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param modifyClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterParameterGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest,
            AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the
     * name of a security group is specified, the response will contain only
     * information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * </p>
     *
     * @param describeClusterSecurityGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterSecurityGroups
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSecurityGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the
     * name of a security group is specified, the response will contain only
     * information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * </p>
     *
     * @param describeClusterSecurityGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterSecurityGroups
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSecurityGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest,
            AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual
     * cluster snapshot. The source must be an automated snapshot and it must
     * be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated
     * snapshots of the cluster. Also, when the retention period of the
     * snapshot expires, Amazon Redshift automatically deletes it. If you
     * want to keep an automated snapshot for a longer period, you can make a
     * manual copy of the snapshot. Manual snapshots are retained until you
     * delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param copyClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CopyClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CopyClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest copyClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual
     * cluster snapshot. The source must be an automated snapshot and it must
     * be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated
     * snapshots of the cluster. Also, when the retention period of the
     * snapshot expires, Amazon Redshift automatically deletes it. If you
     * want to keep an automated snapshot for a longer period, you can make a
     * manual copy of the snapshot. Manual snapshots are retained until you
     * delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param copyClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CopyClusterSnapshot operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CopyClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest copyClusterSnapshotRequest,
            AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new
     * cluster you can use this operation to find what options are available,
     * such as the EC2 Availability Zones (AZ) in the specific AWS region
     * that you can specify, and the node types you can request. The node
     * types differ by available storage, memory, CPU and price. With the
     * cost involved you might want to obtain a list of cluster options in
     * the specific region and specify values when creating a cluster. For
     * more information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param describeOrderableClusterOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableClusterOptions
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOrderableClusterOptions service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new
     * cluster you can use this operation to find what options are available,
     * such as the EC2 Availability Zones (AZ) in the specific AWS region
     * that you can specify, and the node types you can request. The node
     * types differ by available storage, memory, CPU and price. With the
     * cost involved you might want to obtain a list of cluster options in
     * the specific region and specify values when creating a cluster. For
     * more information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param describeOrderableClusterOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableClusterOptions
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOrderableClusterOptions service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest,
            AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list
     * of one or more subnets in your existing Amazon Virtual Private Cloud
     * (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * .aws.amazon.com/redshift/latest/mgmt/working-with-subnet-groups.html">
     * Amazon Redshift Cluster Subnet Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSubnetGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list
     * of one or more subnets in your existing Amazon Virtual Private Cloud
     * (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * .aws.amazon.com/redshift/latest/mgmt/working-with-subnet-groups.html">
     * Amazon Redshift Cluster Subnet Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSubnetGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest,
            AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It
     * results in a momentary outage to the cluster, during which the cluster
     * status is set to <code>rebooting</code> . A cluster event is created
     * when the reboot is completed. Any pending cluster modifications (see
     * ModifyCluster) are applied at this reboot. For more information about
     * managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param rebootClusterRequest Container for the necessary parameters to
     *           execute the RebootCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> rebootClusterAsync(RebootClusterRequest rebootClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It
     * results in a momentary outage to the cluster, during which the cluster
     * status is set to <code>rebooting</code> . A cluster event is created
     * when the reboot is completed. Any pending cluster modifications (see
     * ModifyCluster) are applied at this reboot. For more information about
     * managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param rebootClusterRequest Container for the necessary parameters to
     *           execute the RebootCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> rebootClusterAsync(RebootClusterRequest rebootClusterRequest,
            AsyncHandler<RebootClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     *
     * @param deleteClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSubnetGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     *
     * @param deleteClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSubnetGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest,
            AsyncHandler<DeleteClusterSubnetGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     *
     * @param describeClusterSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSubnetGroups operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSubnetGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     *
     * @param describeClusterSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSubnetGroups operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSubnetGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest,
            AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must
     * be in the "available" state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param createClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CreateClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must
     * be in the "available" state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param createClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CreateClusterSnapshot operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest,
            AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from
     * the web service indicates that the request was received correctly. If
     * a final cluster snapshot is requested the status of the cluster will
     * be "final-snapshot" while the snapshot is being taken, then it's
     * "deleting" once Amazon Redshift begins deleting the cluster. Use
     * DescribeClusters to monitor the status of the deletion. The delete
     * operation cannot be canceled or reverted once submitted. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from
     * the web service indicates that the request was received correctly. If
     * a final cluster snapshot is requested the status of the cluster will
     * be "final-snapshot" while the snapshot is being taken, then it's
     * "deleting" once Amazon Redshift begins deleting the cluster. Use
     * DescribeClusters to monitor the status of the deletion. The delete
     * operation cannot be canceled or reverted once submitted. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new cluster. To create the cluster in virtual private cloud
     * (VPC), you must provide cluster subnet group name. If you don't
     * provide a cluster subnet group name or the cluster security group
     * parameter, Amazon Redshift creates a non-VPC cluster, it associates
     * the default cluster security group with the cluster. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param createClusterRequest Container for the necessary parameters to
     *           execute the CreateCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> createClusterAsync(CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new cluster. To create the cluster in virtual private cloud
     * (VPC), you must provide cluster subnet group name. If you don't
     * provide a cluster subnet group name or the cluster security group
     * parameter, Amazon Redshift creates a non-VPC cluster, it associates
     * the default cluster security group with the cluster. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param createClusterRequest Container for the necessary parameters to
     *           execute the CreateCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> createClusterAsync(CreateClusterRequest createClusterRequest,
            AsyncHandler<CreateClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the
     * "available" state.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after
     * you delete your cluster. Amazon Redshift does not delete your manual
     * snapshots. You must delete manual snapshot explicitly to avoid getting
     * charged.
     * </p>
     *
     * @param deleteClusterSnapshotRequest Container for the necessary
     *           parameters to execute the DeleteClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the
     * "available" state.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after
     * you delete your cluster. Amazon Redshift does not delete your manual
     * snapshots. You must delete manual snapshot explicitly to avoid getting
     * charged.
     * </p>
     *
     * @param deleteClusterSnapshotRequest Container for the necessary
     *           parameters to execute the DeleteClusterSnapshot operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSnapshot service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest,
            AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group. <p>
     * <b>NOTE:</b>You cannot delete a parameter group if it is associated
     * with a cluster.
     * </p>
     * 
     * </p>
     *
     * @param deleteClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group. <p>
     * <b>NOTE:</b>You cannot delete a parameter group if it is associated
     * with a cluster.
     * </p>
     * 
     * </p>
     *
     * @param deleteClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterParameterGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest,
            AsyncHandler<DeleteClusterParameterGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group.
     * Depending on whether the application accessing your cluster is running
     * on the Internet or an EC2 instance, you can authorize inbound access
     * to either a Classless Interdomain Routing (CIDR) IP address range or
     * an EC2 security group. You can add as many as 20 ingress rules to an
     * Amazon Redshift security group.
     * </p>
     * <p>
     * <b>NOTE:</b> The EC2 security group must be defined in the AWS region
     * where the cluster resides.
     * </p>
     * <p>
     * For an overview of CIDR blocks, see the Wikipedia article on <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Classless Inter-Domain Routing </a> .
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that
     * clients running on these IP addresses or the EC2 instance are
     * authorized to connect to the cluster. For information about managing
     * security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Working with Security Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param authorizeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the
     *           AuthorizeClusterSecurityGroupIngress operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group.
     * Depending on whether the application accessing your cluster is running
     * on the Internet or an EC2 instance, you can authorize inbound access
     * to either a Classless Interdomain Routing (CIDR) IP address range or
     * an EC2 security group. You can add as many as 20 ingress rules to an
     * Amazon Redshift security group.
     * </p>
     * <p>
     * <b>NOTE:</b> The EC2 security group must be defined in the AWS region
     * where the cluster resides.
     * </p>
     * <p>
     * For an overview of CIDR blocks, see the Wikipedia article on <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Classless Inter-Domain Routing </a> .
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that
     * clients running on these IP addresses or the EC2 instance are
     * authorized to connect to the cluster. For information about managing
     * security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Working with Security Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param authorizeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the
     *           AuthorizeClusterSecurityGroupIngress operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest,
            AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained
     * by providing the name as a parameter. By default, the past hour of
     * events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained
     * by providing the name as a parameter. By default, the past hour of
     * events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a security group that is associated with
     * any clusters. You cannot delete the default security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * </p>
     *
     * @param deleteClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSecurityGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a security group that is associated with
     * any clusters. You cannot delete the default security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * </p>
     *
     * @param deleteClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSecurityGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest,
            AsyncHandler<DeleteClusterSecurityGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     *
     * @param describeReservedNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedNodes operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedNodes service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     *
     * @param describeReservedNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedNodes operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedNodes service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest describeReservedNodesRequest,
            AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their
     * default values and sets the source values of the parameters to
     * "engine-default". To reset the entire parameter group specify the
     * <i>ResetAllParameters</i> parameter. For parameter changes to take
     * effect you must reboot any associated clusters.
     * </p>
     *
     * @param resetClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ResetClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their
     * default values and sets the source values of the parameters to
     * "engine-default". To reset the entire parameter group specify the
     * <i>ResetAllParameters</i> parameter. For parameter changes to take
     * effect you must reboot any associated clusters.
     * </p>
     *
     * @param resetClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetClusterParameterGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest,
            AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter
     * group family.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeDefaultClusterParametersRequest Container for the
     *           necessary parameters to execute the DescribeDefaultClusterParameters
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultClusterParameters service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter
     * group family.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeDefaultClusterParametersRequest Container for the
     *           necessary parameters to execute the DescribeDefaultClusterParameters
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultClusterParameters service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest,
            AsyncHandler<DescribeDefaultClusterParametersRequest, DefaultClusterParameters> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups
     * to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSecurityGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups
     * to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSecurityGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest,
            AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon
     * Redshift with their descriptions including the node type, the fixed
     * and recurring costs of reserving the node and duration the node will
     * be reserved for you. These descriptions help you determine which
     * reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to PurchaseReservedNodeOffering to reserve one
     * or more nodes for your Amazon Redshift cluster.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">
     * Purchasing Reserved Nodes </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * 
     * </p>
     *
     * @param describeReservedNodeOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedNodeOfferings
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedNodeOfferings service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon
     * Redshift with their descriptions including the node type, the fixed
     * and recurring costs of reserving the node and duration the node will
     * be reserved for you. These descriptions help you determine which
     * reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to PurchaseReservedNodeOffering to reserve one
     * or more nodes for your Amazon Redshift cluster.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">
     * Purchasing Reserved Nodes </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * 
     * </p>
     *
     * @param describeReservedNodeOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedNodeOfferings
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedNodeOfferings service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest,
            AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the last resize operation for the specified
     * cluster. If no resize operation has ever been initiated for the
     * specified cluster, a <code>HTTP 404</code> error is returned. If a
     * resize operation was initiated and completed, the status of the resize
     * remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using ModifyCluster and
     * specifying a different number or type of nodes for the cluster.
     * </p>
     *
     * @param describeResizeRequest Container for the necessary parameters to
     *           execute the DescribeResize operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeResize service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest describeResizeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the last resize operation for the specified
     * cluster. If no resize operation has ever been initiated for the
     * specified cluster, a <code>HTTP 404</code> error is returned. If a
     * resize operation was initiated and completed, the status of the resize
     * remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using ModifyCluster and
     * specifying a different number or type of nodes for the cluster.
     * </p>
     *
     * @param describeResizeRequest Container for the necessary parameters to
     *           execute the DescribeResize operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeResize service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest describeResizeRequest,
            AsyncHandler<DescribeResizeRequest, DescribeResizeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster
     * versions. You can call this operation even before creating any
     * clusters to learn more about the Amazon Redshift versions. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param describeClusterVersionsRequest Container for the necessary
     *           parameters to execute the DescribeClusterVersions operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterVersions service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest describeClusterVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster
     * versions. You can call this operation even before creating any
     * clusters to learn more about the Amazon Redshift versions. For more
     * information about managing clusters, go to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i>
     * </p>
     *
     * @param describeClusterVersionsRequest Container for the necessary
     *           parameters to execute the DescribeClusterVersions operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterVersions service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest describeClusterVersionsRequest,
            AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified
     * Amazon Redshift parameter group. For each parameter the response
     * includes information such as parameter name, description, data type,
     * value, whether the parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only
     * specific type. For example, to retrieve parameters that were modified
     * by a user action such as from ModifyClusterParameterGroup, you can
     * specify <i>source</i> equal to <i>user</i> .
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeClusterParametersRequest Container for the necessary
     *           parameters to execute the DescribeClusterParameters operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameters service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParametersResult> describeClusterParametersAsync(DescribeClusterParametersRequest describeClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified
     * Amazon Redshift parameter group. For each parameter the response
     * includes information such as parameter name, description, data type,
     * value, whether the parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only
     * specific type. For example, to retrieve parameters that were modified
     * by a user action such as from ModifyClusterParameterGroup, you can
     * specify <i>source</i> equal to <i>user</i> .
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeClusterParametersRequest Container for the necessary
     *           parameters to execute the DescribeClusterParameters operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameters service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParametersResult> describeClusterParametersAsync(DescribeClusterParametersRequest describeClusterParametersRequest,
            AsyncHandler<DescribeClusterParametersRequest, DescribeClusterParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a
     * previously authorized IP range or Amazon EC2 security group. To add an
     * ingress rule, see AuthorizeClusterSecurityGroupIngress. For
     * information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * 
     * </p>
     *
     * @param revokeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the RevokeClusterSecurityGroupIngress
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a
     * previously authorized IP range or Amazon EC2 security group. To add an
     * ingress rule, see AuthorizeClusterSecurityGroupIngress. For
     * information about managing security groups, go to <a
     * ws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
     * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon
     * Redshift Management Guide</i> .
     * 
     * </p>
     *
     * @param revokeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the RevokeClusterSecurityGroupIngress
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest,
            AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster
     * properties, cluster database properties, maintenance and backup
     * properties, and security and access properties. This operation
     * supports pagination. For more information about managing clusters, go
     * to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster
     * properties, cluster database properties, maintenance and backup
     * properties, and security and access properties. This operation
     * supports pagination. For more information about managing clusters, go
     * to <a
     * /docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">
     * Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * 
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by the AWS account.
     * </p>
     *
     * @param describeClusterSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSnapshots operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSnapshots service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by the AWS account.
     * </p>
     *
     * @param describeClusterSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSnapshots operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSnapshots service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest,
            AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can
     * associate a cluster with a parameter group when you create the
     * cluster. You can also associate an existing cluster with a parameter
     * group after the cluster is created by using ModifyCluster.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that
     * applies to the databases you create on the cluster. For more
     * information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest createClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can
     * associate a cluster with a parameter group when you create the
     * cluster. You can also associate an existing cluster with a parameter
     * group after the cluster is created by using ModifyCluster.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that
     * applies to the databases you create on the cluster. For more
     * information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterParameterGroup operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest createClusterParameterGroupRequest,
            AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including
     * parameter groups you created and the default parameter group. For each
     * parameter group, the response includes the parameter group name,
     * description, and parameter group family name. You can optionally
     * specify a name to retrieve the description of a specific parameter
     * group.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeClusterParameterGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterParameterGroups
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameterGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including
     * parameter groups you created and the default parameter group. For each
     * parameter group, the response includes the parameter group name,
     * description, and parameter group family name. You can optionally
     * specify a name to retrieve the description of a specific parameter
     * group.
     * </p>
     * <p>
     * For more information about managing parameter groups, go to <a
     * s.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">
     * Amazon Redshift Parameter Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * </p>
     *
     * @param describeClusterParameterGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterParameterGroups
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameterGroups service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest,
            AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new cluster from a snapshot. Amazon Redshift creates the
     * resulting cluster with the same configuration as the original cluster
     * from which the snapshot was created, except that the new cluster is
     * created with the default cluster security and parameter group. After
     * Amazon Redshift creates the cluster you can use the ModifyCluster API
     * to associate a different security group and different parameter group
     * with the restored cluster.
     * </p>
     * <p>
     * If a snapshot is taken of a cluster in VPC, you can restore it only
     * in VPC. In this case, you must provide a cluster subnet group where
     * you want the cluster restored. If snapshot is taken of a cluster
     * outside VPC, then you can restore it only outside VPC.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param restoreFromClusterSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromClusterSnapshot service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new cluster from a snapshot. Amazon Redshift creates the
     * resulting cluster with the same configuration as the original cluster
     * from which the snapshot was created, except that the new cluster is
     * created with the default cluster security and parameter group. After
     * Amazon Redshift creates the cluster you can use the ModifyCluster API
     * to associate a different security group and different parameter group
     * with the restored cluster.
     * </p>
     * <p>
     * If a snapshot is taken of a cluster in VPC, you can restore it only
     * in VPC. In this case, you must provide a cluster subnet group where
     * you want the cluster restored. If snapshot is taken of a cluster
     * outside VPC, then you can restore it only outside VPC.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param restoreFromClusterSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromClusterSnapshot operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromClusterSnapshot service method, as returned by
     *         AmazonRedshift.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest,
            AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        