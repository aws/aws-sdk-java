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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.services.redshift.model.transform.*;


/**
 * Client for accessing AmazonRedshift.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
 * href="http://docs.aws.amazon.com/redshift/latest/dg/"> Database Developer Guide </a> explains how to design, build, query, and maintain the databases
 * that make up your data warehouse.
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
public class AmazonRedshiftClient extends AmazonWebServiceClient implements AmazonRedshift {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonRedshift exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonRedshiftClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonRedshiftClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ReservedNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessToSnapshotDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOptionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnauthorizedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesPerClusterLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResizeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupAlreadyExistsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("redshift.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/redshift/request.handlers"));
    }

    
    /**
     * <p>
     * Removes the ability of the specified AWS customer account to restore
     * the specified snapshot. If the account is currently restoring the
     * snapshot, the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param revokeSnapshotAccessRequest Container for the necessary
     *           parameters to execute the RevokeSnapshotAccess service method on
     *           AmazonRedshift.
     * 
     * @return The response from the RevokeSnapshotAccess service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws AccessToSnapshotDeniedException
     * @throws ClusterSnapshotNotFoundException
     * @throws AuthorizationNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RevokeSnapshotAccessRequest> request = new RevokeSnapshotAccessRequestMarshaller().marshall(revokeSnapshotAccessRequest);
        return invoke(request, new SnapshotStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC
     * subnets. The operation replaces the existing list of subnets with the
     * new list of subnets.
     * </p>
     *
     * @param modifyClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ModifyClusterSubnetGroup service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws SubnetAlreadyInUseException
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws ClusterSubnetQuotaExceededException
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyClusterSubnetGroupRequest> request = new ModifyClusterSubnetGroupRequestMarshaller().marshall(modifyClusterSubnetGroupRequest);
        return invoke(request, new ClusterSubnetGroupStaxUnmarshaller());
    }
    
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
     *           parameters to execute the PurchaseReservedNodeOffering service method
     *           on AmazonRedshift.
     * 
     * @return The response from the PurchaseReservedNodeOffering service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ReservedNodeAlreadyExistsException
     * @throws ReservedNodeOfferingNotFoundException
     * @throws ReservedNodeQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<PurchaseReservedNodeOfferingRequest> request = new PurchaseReservedNodeOfferingRequestMarshaller().marshall(purchaseReservedNodeOfferingRequest);
        return invoke(request, new ReservedNodeStaxUnmarshaller());
    }
    
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
     *           execute the ModifyCluster service method on AmazonRedshift.
     * 
     * @return The response from the ModifyCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws InsufficientClusterCapacityException
     * @throws UnauthorizedOperationException
     * @throws InvalidClusterStateException
     * @throws NumberOfNodesQuotaExceededException
     * @throws ClusterNotFoundException
     * @throws UnsupportedOptionException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster modifyCluster(ModifyClusterRequest modifyClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyClusterRequest> request = new ModifyClusterRequestMarshaller().marshall(modifyClusterRequest);
        return invoke(request, new ClusterStaxUnmarshaller());
    }
    
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
     *           parameters to execute the ModifyClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * @return The response from the ModifyClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyClusterParameterGroupRequest> request = new ModifyClusterParameterGroupRequestMarshaller().marshall(modifyClusterParameterGroupRequest);
        return invoke(request, new ModifyClusterParameterGroupResultStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSecurityGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterSecurityGroupsRequest> request = new DescribeClusterSecurityGroupsRequestMarshaller().marshall(describeClusterSecurityGroupsRequest);
        return invoke(request, new DescribeClusterSecurityGroupsResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the CopyClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CopyClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws ClusterSnapshotNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CopyClusterSnapshotRequest> request = new CopyClusterSnapshotRequestMarshaller().marshall(copyClusterSnapshotRequest);
        return invoke(request, new SnapshotStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeOrderableClusterOptions service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeOrderableClusterOptionsRequest> request = new DescribeOrderableClusterOptionsRequestMarshaller().marshall(describeOrderableClusterOptionsRequest);
        return invoke(request, new DescribeOrderableClusterOptionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list
     * of one or more subnets in your existing Amazon Virtual Private Cloud
     * (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * zon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html">
     * Amazon Redshift Cluster Subnet Groups </a> in the <i>Amazon Redshift
     * Management Guide</i> .
     * 
     * </p>
     *
     * @param createClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSubnetGroup service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws ClusterSubnetQuotaExceededException
     * @throws ClusterSubnetGroupAlreadyExistsException
     * @throws ClusterSubnetGroupQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateClusterSubnetGroupRequest> request = new CreateClusterSubnetGroupRequestMarshaller().marshall(createClusterSubnetGroupRequest);
        return invoke(request, new ClusterSubnetGroupStaxUnmarshaller());
    }
    
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
     *           execute the RebootCluster service method on AmazonRedshift.
     * 
     * @return The response from the RebootCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster rebootCluster(RebootClusterRequest rebootClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RebootClusterRequest> request = new RebootClusterRequestMarshaller().marshall(rebootClusterRequest);
        return invoke(request, new ClusterStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     *
     * @param deleteClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * @throws InvalidClusterSubnetStateException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteClusterSubnetGroupRequest> request = new DeleteClusterSubnetGroupRequestMarshaller().marshall(deleteClusterSubnetGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     *
     * @param describeClusterSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSubnetGroups service method
     *           on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSubnetGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterSubnetGroupsRequest> request = new DescribeClusterSubnetGroupsRequestMarshaller().marshall(describeClusterSubnetGroupsRequest);
        return invoke(request, new DescribeClusterSubnetGroupsResultStaxUnmarshaller());
    }
    
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
     *           execute the DeleteCluster service method on AmazonRedshift.
     * 
     * @return The response from the DeleteCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster deleteCluster(DeleteClusterRequest deleteClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteClusterRequest> request = new DeleteClusterRequestMarshaller().marshall(deleteClusterRequest);
        return invoke(request, new ClusterStaxUnmarshaller());
    }
    
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
     *           parameters to execute the CreateClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot createClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateClusterSnapshotRequest> request = new CreateClusterSnapshotRequestMarshaller().marshall(createClusterSnapshotRequest);
        return invoke(request, new SnapshotStaxUnmarshaller());
    }
    
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
     *           execute the CreateCluster service method on AmazonRedshift.
     * 
     * @return The response from the CreateCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidSubnetException
     * @throws InsufficientClusterCapacityException
     * @throws UnauthorizedOperationException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws ClusterAlreadyExistsException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws ClusterQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster createCluster(CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateClusterRequest> request = new CreateClusterRequestMarshaller().marshall(createClusterRequest);
        return invoke(request, new ClusterStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the
     * "available" state, with no other users authorized to access the
     * snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after
     * you delete your cluster. Amazon Redshift does not delete your manual
     * snapshots. You must delete manual snapshot explicitly to avoid getting
     * charged. If other accounts are authorized to access the snapshot, you
     * must revoke all of the authorizations before you can delete the
     * snapshot.
     * </p>
     *
     * @param deleteClusterSnapshotRequest Container for the necessary
     *           parameters to execute the DeleteClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DeleteClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteClusterSnapshotRequest> request = new DeleteClusterSnapshotRequestMarshaller().marshall(deleteClusterSnapshotRequest);
        return invoke(request, new SnapshotStaxUnmarshaller());
    }
    
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
     *           parameters to execute the DeleteClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterParameterGroup(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteClusterParameterGroupRequest> request = new DeleteClusterParameterGroupRequestMarshaller().marshall(deleteClusterParameterGroupRequest);
        invoke(request, null);
    }
    
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
     *           AuthorizeClusterSecurityGroupIngress service method on AmazonRedshift.
     * 
     * @return The response from the AuthorizeClusterSecurityGroupIngress
     *         service method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AuthorizeClusterSecurityGroupIngressRequest> request = new AuthorizeClusterSecurityGroupIngressRequestMarshaller().marshall(authorizeClusterSecurityGroupIngressRequest);
        return invoke(request, new ClusterSecurityGroupStaxUnmarshaller());
    }
    
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
     *           execute the DescribeEvents service method on AmazonRedshift.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEventsRequest> request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
        return invoke(request, new DescribeEventsResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the DeleteClusterSecurityGroup service method on
     *           AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteClusterSecurityGroupRequest> request = new DeleteClusterSecurityGroupRequestMarshaller().marshall(deleteClusterSecurityGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     *
     * @param describeReservedNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedNodes service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeReservedNodes service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ReservedNodeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedNodesRequest> request = new DescribeReservedNodesRequestMarshaller().marshall(describeReservedNodesRequest);
        return invoke(request, new DescribeReservedNodesResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the ResetClusterParameterGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ResetClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ResetClusterParameterGroupRequest> request = new ResetClusterParameterGroupRequestMarshaller().marshall(resetClusterParameterGroupRequest);
        return invoke(request, new ResetClusterParameterGroupResultStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeDefaultClusterParameters service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeDefaultClusterParametersRequest> request = new DescribeDefaultClusterParametersRequestMarshaller().marshall(describeDefaultClusterParametersRequest);
        return invoke(request, new DefaultClusterParametersStaxUnmarshaller());
    }
    
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
     *           parameters to execute the CreateClusterSecurityGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSecurityGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterSecurityGroupQuotaExceededException
     * @throws ClusterSecurityGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateClusterSecurityGroupRequest> request = new CreateClusterSecurityGroupRequestMarshaller().marshall(createClusterSecurityGroupRequest);
        return invoke(request, new ClusterSecurityGroupStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the
     * specified snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
     * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management
     * Guide</i> .
     * </p>
     *
     * @param authorizeSnapshotAccessRequest Container for the necessary
     *           parameters to execute the AuthorizeSnapshotAccess service method on
     *           AmazonRedshift.
     * 
     * @return The response from the AuthorizeSnapshotAccess service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws AuthorizationAlreadyExistsException
     * @throws ClusterSnapshotNotFoundException
     * @throws AuthorizationQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AuthorizeSnapshotAccessRequest> request = new AuthorizeSnapshotAccessRequestMarshaller().marshall(authorizeSnapshotAccessRequest);
        return invoke(request, new SnapshotStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeReservedNodeOfferings service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ReservedNodeOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedNodeOfferingsRequest> request = new DescribeReservedNodeOfferingsRequestMarshaller().marshall(describeReservedNodeOfferingsRequest);
        return invoke(request, new DescribeReservedNodeOfferingsResultStaxUnmarshaller());
    }
    
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
     *           execute the DescribeResize service method on AmazonRedshift.
     * 
     * @return The response from the DescribeResize service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     * @throws ResizeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeResizeResult describeResize(DescribeResizeRequest describeResizeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeResizeRequest> request = new DescribeResizeRequestMarshaller().marshall(describeResizeRequest);
        return invoke(request, new DescribeResizeResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the DescribeClusterVersions service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterVersions service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest describeClusterVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterVersionsRequest> request = new DescribeClusterVersionsRequestMarshaller().marshall(describeClusterVersionsRequest);
        return invoke(request, new DescribeClusterVersionsResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the DescribeClusterParameters service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterParameters service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest describeClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterParametersRequest> request = new DescribeClusterParametersRequestMarshaller().marshall(describeClusterParametersRequest);
        return invoke(request, new DescribeClusterParametersResultStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the RevokeClusterSecurityGroupIngress
     *         service method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AuthorizationNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RevokeClusterSecurityGroupIngressRequest> request = new RevokeClusterSecurityGroupIngressRequestMarshaller().marshall(revokeClusterSecurityGroupIngressRequest);
        return invoke(request, new ClusterSecurityGroupStaxUnmarshaller());
    }
    
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
     *           to execute the DescribeClusters service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClustersRequest> request = new DescribeClustersRequestMarshaller().marshall(describeClustersRequest);
        return invoke(request, new DescribeClustersResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by you AWS customer
     * account. No information is returned for snapshots owned by inactive
     * AWS customer accounts.
     * </p>
     *
     * @param describeClusterSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSnapshots service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSnapshots service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterSnapshotsRequest> request = new DescribeClusterSnapshotsRequestMarshaller().marshall(describeClusterSnapshotsRequest);
        return invoke(request, new DescribeClusterSnapshotsResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the CreateClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * @return The response from the CreateClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterParameterGroupQuotaExceededException
     * @throws ClusterParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest createClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateClusterParameterGroupRequest> request = new CreateClusterParameterGroupRequestMarshaller().marshall(createClusterParameterGroupRequest);
        return invoke(request, new ClusterParameterGroupStaxUnmarshaller());
    }
    
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
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterParameterGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeClusterParameterGroupsRequest> request = new DescribeClusterParameterGroupsRequestMarshaller().marshall(describeClusterParameterGroupsRequest);
        return invoke(request, new DescribeClusterParameterGroupsResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the RestoreFromClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the RestoreFromClusterSnapshot service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidSubnetException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws ClusterAlreadyExistsException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidClusterSnapshotStateException
     * @throws AccessToSnapshotDeniedException
     * @throws InvalidRestoreException
     * @throws UnauthorizedOperationException
     * @throws InsufficientClusterCapacityException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws ClusterSnapshotNotFoundException
     * @throws ClusterQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RestoreFromClusterSnapshotRequest> request = new RestoreFromClusterSnapshotRequestMarshaller().marshall(restoreFromClusterSnapshotRequest);
        return invoke(request, new ClusterStaxUnmarshaller());
    }
    
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
     * @return The response from the DescribeClusterSecurityGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterSecurityGroups(new DescribeClusterSecurityGroupsRequest());
    }
    
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
     * @return The response from the DescribeOrderableClusterOptions service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions() throws AmazonServiceException, AmazonClientException {
        return describeOrderableClusterOptions(new DescribeOrderableClusterOptionsRequest());
    }
    
    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     * 
     * @return The response from the DescribeClusterSubnetGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterSubnetGroups(new DescribeClusterSubnetGroupsRequest());
    }
    
    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained
     * by providing the name as a parameter. By default, the past hour of
     * events are returned.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException {
        return describeEvents(new DescribeEventsRequest());
    }
    
    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @return The response from the DescribeReservedNodes service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ReservedNodeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodesResult describeReservedNodes() throws AmazonServiceException, AmazonClientException {
        return describeReservedNodes(new DescribeReservedNodesRequest());
    }
    
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
     * @return The response from the DescribeReservedNodeOfferings service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ReservedNodeOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings() throws AmazonServiceException, AmazonClientException {
        return describeReservedNodeOfferings(new DescribeReservedNodeOfferingsRequest());
    }
    
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
     * @return The response from the DescribeClusterVersions service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterVersionsResult describeClusterVersions() throws AmazonServiceException, AmazonClientException {
        return describeClusterVersions(new DescribeClusterVersionsRequest());
    }
    
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
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters() throws AmazonServiceException, AmazonClientException {
        return describeClusters(new DescribeClustersRequest());
    }
    
    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by you AWS customer
     * account. No information is returned for snapshots owned by inactive
     * AWS customer accounts.
     * </p>
     * 
     * @return The response from the DescribeClusterSnapshots service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSnapshotsResult describeClusterSnapshots() throws AmazonServiceException, AmazonClientException {
        return describeClusterSnapshots(new DescribeClusterSnapshotsRequest());
    }
    
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
     * @return The response from the DescribeClusterParameterGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterParameterGroups(new DescribeClusterParameterGroupsRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://redshift.us-east-1.amazonaws.com") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://redshift.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://redshift.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "redshift";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        