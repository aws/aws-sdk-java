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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.redshift.model.*;


/**
 * Asynchronous client for accessing AmazonRedshift.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Redshift <b>Overview</b> <p>
 * This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command line interfaces you can use to
 * manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which means that some interfaces may require techniques, such as polling
 * or asynchronous callback handlers, to determine when a command has been applied. In this reference, the parameter descriptions indicate whether a
 * change is applied immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift cluster
 * management interfaces, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html"> Using the Amazon Redshift Management
 * Interfaces </a> .
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity, monitoring and backing up the
 * cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus on using your data to acquire new insights for your business
 * and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the The <a
 * href="http://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html"> Amazon Redshift Getting Started Guide </a>
 * </p>
 * <p>
 * If you are a database developer, the <a href="http://docs.aws.amazon.com/redshift/latest/dg/welcome.html"> Amazon Redshift Database Developer Guide
 * </a> explains how to design, build, query, and maintain the databases that make up your data warehouse.
 * </p>
 */
public class AmazonRedshiftAsyncClient extends AmazonRedshiftClient
        implements AmazonRedshiftAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
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
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRedshiftAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRedshiftAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }


    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
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
     *           parameters to execute the RevokeSnapshotAccess operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSnapshotAccess service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> revokeSnapshotAccessAsync(final RevokeSnapshotAccessRequest revokeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return revokeSnapshotAccess(revokeSnapshotAccessRequest);
		    }
		});
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
     *           parameters to execute the RevokeSnapshotAccess operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSnapshotAccess service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> revokeSnapshotAccessAsync(
            final RevokeSnapshotAccessRequest revokeSnapshotAccessRequest,
            final AsyncHandler<RevokeSnapshotAccessRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
            	Snapshot result;
                try {
            		result = revokeSnapshotAccess(revokeSnapshotAccessRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(revokeSnapshotAccessRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies the number of days to retain automated snapshots in the
     * destination region after they are copied from the source region.
     * </p>
     *
     * @param modifySnapshotCopyRetentionPeriodRequest Container for the
     *           necessary parameters to execute the ModifySnapshotCopyRetentionPeriod
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifySnapshotCopyRetentionPeriod service method, as returned by
     *         AmazonRedshift.
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
    public Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(final ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return modifySnapshotCopyRetentionPeriod(modifySnapshotCopyRetentionPeriodRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies the number of days to retain automated snapshots in the
     * destination region after they are copied from the source region.
     * </p>
     *
     * @param modifySnapshotCopyRetentionPeriodRequest Container for the
     *           necessary parameters to execute the ModifySnapshotCopyRetentionPeriod
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifySnapshotCopyRetentionPeriod service method, as returned by
     *         AmazonRedshift.
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
    public Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(
            final ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest,
            final AsyncHandler<ModifySnapshotCopyRetentionPeriodRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = modifySnapshotCopyRetentionPeriod(modifySnapshotCopyRetentionPeriodRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifySnapshotCopyRetentionPeriodRequest, result);
               	return result;
		    }
		});
    }
    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(final ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSubnetGroup>() {
            public ClusterSubnetGroup call() throws Exception {
                return modifyClusterSubnetGroup(modifyClusterSubnetGroupRequest);
		    }
		});
    }

    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(
            final ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest,
            final AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSubnetGroup>() {
            public ClusterSubnetGroup call() throws Exception {
            	ClusterSubnetGroup result;
                try {
            		result = modifyClusterSubnetGroup(modifyClusterSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyClusterSubnetGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     *
     * @param deleteHsmConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteHsmConfiguration operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsmConfiguration service method, as returned by AmazonRedshift.
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
    public Future<Void> deleteHsmConfigurationAsync(final DeleteHsmConfigurationRequest deleteHsmConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteHsmConfiguration(deleteHsmConfigurationRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     *
     * @param deleteHsmConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteHsmConfiguration operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsmConfiguration service method, as returned by AmazonRedshift.
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
    public Future<Void> deleteHsmConfigurationAsync(
            final DeleteHsmConfigurationRequest deleteHsmConfigurationRequest,
            final AsyncHandler<DeleteHsmConfigurationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteHsmConfiguration(deleteHsmConfigurationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteHsmConfigurationRequest, null);
               	return null;
		    }
		});
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
     *           parameters to execute the PurchaseReservedNodeOffering operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedNodeOffering service method, as returned by
     *         AmazonRedshift.
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
    public Future<ReservedNode> purchaseReservedNodeOfferingAsync(final PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedNode>() {
            public ReservedNode call() throws Exception {
                return purchaseReservedNodeOffering(purchaseReservedNodeOfferingRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedNode> purchaseReservedNodeOfferingAsync(
            final PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest,
            final AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedNode>() {
            public ReservedNode call() throws Exception {
            	ReservedNode result;
                try {
            		result = purchaseReservedNodeOffering(purchaseReservedNodeOfferingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(purchaseReservedNodeOfferingRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Stops logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param disableLoggingRequest Container for the necessary parameters to
     *           execute the DisableLogging operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DisableLogging service method, as returned by AmazonRedshift.
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
    public Future<DisableLoggingResult> disableLoggingAsync(final DisableLoggingRequest disableLoggingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableLoggingResult>() {
            public DisableLoggingResult call() throws Exception {
                return disableLogging(disableLoggingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Stops logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param disableLoggingRequest Container for the necessary parameters to
     *           execute the DisableLogging operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableLogging service method, as returned by AmazonRedshift.
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
    public Future<DisableLoggingResult> disableLoggingAsync(
            final DisableLoggingRequest disableLoggingRequest,
            final AsyncHandler<DisableLoggingRequest, DisableLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableLoggingResult>() {
            public DisableLoggingResult call() throws Exception {
            	DisableLoggingResult result;
                try {
            		result = disableLogging(disableLoggingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(disableLoggingRequest, result);
               	return result;
		    }
		});
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
     *           execute the ModifyCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> modifyClusterAsync(final ModifyClusterRequest modifyClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return modifyCluster(modifyClusterRequest);
		    }
		});
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
     *           execute the ModifyCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> modifyClusterAsync(
            final ModifyClusterRequest modifyClusterRequest,
            final AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = modifyCluster(modifyClusterRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyClusterRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CopyClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CopyClusterSnapshot service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> copyClusterSnapshotAsync(final CopyClusterSnapshotRequest copyClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return copyClusterSnapshot(copyClusterSnapshotRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> copyClusterSnapshotAsync(
            final CopyClusterSnapshotRequest copyClusterSnapshotRequest,
            final AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
            	Snapshot result;
                try {
            		result = copyClusterSnapshot(copyClusterSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(copyClusterSnapshotRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOrderableClusterOptions service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(final DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOrderableClusterOptionsResult>() {
            public DescribeOrderableClusterOptionsResult call() throws Exception {
                return describeOrderableClusterOptions(describeOrderableClusterOptionsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            final DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest,
            final AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOrderableClusterOptionsResult>() {
            public DescribeOrderableClusterOptionsResult call() throws Exception {
            	DescribeOrderableClusterOptionsResult result;
                try {
            		result = describeOrderableClusterOptions(describeOrderableClusterOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOrderableClusterOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Starts logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param enableLoggingRequest Container for the necessary parameters to
     *           execute the EnableLogging operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         EnableLogging service method, as returned by AmazonRedshift.
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
    public Future<EnableLoggingResult> enableLoggingAsync(final EnableLoggingRequest enableLoggingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableLoggingResult>() {
            public EnableLoggingResult call() throws Exception {
                return enableLogging(enableLoggingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Starts logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param enableLoggingRequest Container for the necessary parameters to
     *           execute the EnableLogging operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableLogging service method, as returned by AmazonRedshift.
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
    public Future<EnableLoggingResult> enableLoggingAsync(
            final EnableLoggingRequest enableLoggingRequest,
            final AsyncHandler<EnableLoggingRequest, EnableLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableLoggingResult>() {
            public EnableLoggingResult call() throws Exception {
            	EnableLoggingResult result;
                try {
            		result = enableLogging(enableLoggingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(enableLoggingRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateClusterSubnetGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSubnetGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(final CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSubnetGroup>() {
            public ClusterSubnetGroup call() throws Exception {
                return createClusterSubnetGroup(createClusterSubnetGroupRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(
            final CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest,
            final AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSubnetGroup>() {
            public ClusterSubnetGroup call() throws Exception {
            	ClusterSubnetGroup result;
                try {
            		result = createClusterSubnetGroup(createClusterSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createClusterSubnetGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     *
     * @param deleteHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the DeleteHsmClientCertificate operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsmClientCertificate service method, as returned by
     *         AmazonRedshift.
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
    public Future<Void> deleteHsmClientCertificateAsync(final DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteHsmClientCertificate(deleteHsmClientCertificateRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     *
     * @param deleteHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the DeleteHsmClientCertificate operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsmClientCertificate service method, as returned by
     *         AmazonRedshift.
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
    public Future<Void> deleteHsmClientCertificateAsync(
            final DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest,
            final AsyncHandler<DeleteHsmClientCertificateRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteHsmClientCertificate(deleteHsmClientCertificateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteHsmClientCertificateRequest, null);
               	return null;
		    }
		});
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
     *           execute the RebootCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> rebootClusterAsync(final RebootClusterRequest rebootClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return rebootCluster(rebootClusterRequest);
		    }
		});
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
     *           execute the RebootCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> rebootClusterAsync(
            final RebootClusterRequest rebootClusterRequest,
            final AsyncHandler<RebootClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = rebootCluster(rebootClusterRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(rebootClusterRequest, result);
               	return result;
		    }
		});
    }
    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSubnetGroupAsync(final DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteClusterSubnetGroup(deleteClusterSubnetGroupRequest);
                return null;
		    }
		});
    }

    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSubnetGroupAsync(
            final DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest,
            final AsyncHandler<DeleteClusterSubnetGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteClusterSubnetGroup(deleteClusterSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteClusterSubnetGroupRequest, null);
               	return null;
		    }
		});
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
     *           execute the DeleteCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> deleteClusterAsync(final DeleteClusterRequest deleteClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return deleteCluster(deleteClusterRequest);
		    }
		});
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
     *           execute the DeleteCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> deleteClusterAsync(
            final DeleteClusterRequest deleteClusterRequest,
            final AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = deleteCluster(deleteClusterRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteClusterRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSnapshot service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> createClusterSnapshotAsync(final CreateClusterSnapshotRequest createClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return createClusterSnapshot(createClusterSnapshotRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> createClusterSnapshotAsync(
            final CreateClusterSnapshotRequest createClusterSnapshotRequest,
            final AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
            	Snapshot result;
                try {
            		result = createClusterSnapshot(createClusterSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createClusterSnapshotRequest, result);
               	return result;
		    }
		});
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
     *           execute the CreateCluster operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> createClusterAsync(final CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return createCluster(createClusterRequest);
		    }
		});
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
     *           execute the CreateCluster operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonRedshift.
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
    public Future<Cluster> createClusterAsync(
            final CreateClusterRequest createClusterRequest,
            final AsyncHandler<CreateClusterRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = createCluster(createClusterRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createClusterRequest, result);
               	return result;
		    }
		});
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
     *           execute the DescribeEvents operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRedshift.
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
    public Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
                return describeEvents(describeEventsRequest);
		    }
		});
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
     *           execute the DescribeEvents operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRedshift.
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
    public Future<DescribeEventsResult> describeEventsAsync(
            final DescribeEventsRequest describeEventsRequest,
            final AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
            	DescribeEventsResult result;
                try {
            		result = describeEvents(describeEventsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventsRequest, result);
               	return result;
		    }
		});
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
     *           AuthorizeClusterSecurityGroupIngress operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
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
    public Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(final AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
                return authorizeClusterSecurityGroupIngress(authorizeClusterSecurityGroupIngressRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(
            final AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest,
            final AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
            	ClusterSecurityGroup result;
                try {
            		result = authorizeClusterSecurityGroupIngress(authorizeClusterSecurityGroupIngressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(authorizeClusterSecurityGroupIngressRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     *
     * @param rotateEncryptionKeyRequest Container for the necessary
     *           parameters to execute the RotateEncryptionKey operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RotateEncryptionKey service method, as returned by AmazonRedshift.
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
    public Future<Cluster> rotateEncryptionKeyAsync(final RotateEncryptionKeyRequest rotateEncryptionKeyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return rotateEncryptionKey(rotateEncryptionKeyRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     *
     * @param rotateEncryptionKeyRequest Container for the necessary
     *           parameters to execute the RotateEncryptionKey operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RotateEncryptionKey service method, as returned by AmazonRedshift.
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
    public Future<Cluster> rotateEncryptionKeyAsync(
            final RotateEncryptionKeyRequest rotateEncryptionKeyRequest,
            final AsyncHandler<RotateEncryptionKeyRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = rotateEncryptionKey(rotateEncryptionKeyRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(rotateEncryptionKeyRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteClusterSecurityGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<Void> deleteClusterSecurityGroupAsync(final DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteClusterSecurityGroup(deleteClusterSecurityGroupRequest);
                return null;
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterSecurityGroupAsync(
            final DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest,
            final AsyncHandler<DeleteClusterSecurityGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteClusterSecurityGroup(deleteClusterSecurityGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteClusterSecurityGroupRequest, null);
               	return null;
		    }
		});
    }
    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodesResult> describeReservedNodesAsync(final DescribeReservedNodesRequest describeReservedNodesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedNodesResult>() {
            public DescribeReservedNodesResult call() throws Exception {
                return describeReservedNodes(describeReservedNodesRequest);
		    }
		});
    }

    
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodesResult> describeReservedNodesAsync(
            final DescribeReservedNodesRequest describeReservedNodesRequest,
            final AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedNodesResult>() {
            public DescribeReservedNodesResult call() throws Exception {
            	DescribeReservedNodesResult result;
                try {
            		result = describeReservedNodes(describeReservedNodesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeReservedNodesRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultClusterParameters service method, as returned by
     *         AmazonRedshift.
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
    public Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(final DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefaultClusterParameters>() {
            public DefaultClusterParameters call() throws Exception {
                return describeDefaultClusterParameters(describeDefaultClusterParametersRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(
            final DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest,
            final AsyncHandler<DescribeDefaultClusterParametersRequest, DefaultClusterParameters> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefaultClusterParameters>() {
            public DefaultClusterParameters call() throws Exception {
            	DefaultClusterParameters result;
                try {
            		result = describeDefaultClusterParameters(describeDefaultClusterParametersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDefaultClusterParametersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<EventSubscription> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return modifyEventSubscription(modifyEventSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<EventSubscription> modifyEventSubscriptionAsync(
            final ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            final AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = modifyEventSubscription(modifyEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyEventSubscriptionRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateClusterSecurityGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterSecurityGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(final CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
                return createClusterSecurityGroup(createClusterSecurityGroupRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(
            final CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest,
            final AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
            	ClusterSecurityGroup result;
                try {
            		result = createClusterSecurityGroup(createClusterSecurityGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createClusterSecurityGroupRequest, result);
               	return result;
		    }
		});
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
     *           execute the DescribeResize operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeResize service method, as returned by AmazonRedshift.
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
    public Future<DescribeResizeResult> describeResizeAsync(final DescribeResizeRequest describeResizeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeResizeResult>() {
            public DescribeResizeResult call() throws Exception {
                return describeResize(describeResizeRequest);
		    }
		});
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
     *           execute the DescribeResize operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeResize service method, as returned by AmazonRedshift.
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
    public Future<DescribeResizeResult> describeResizeAsync(
            final DescribeResizeRequest describeResizeRequest,
            final AsyncHandler<DescribeResizeRequest, DescribeResizeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeResizeResult>() {
            public DescribeResizeResult call() throws Exception {
            	DescribeResizeResult result;
                try {
            		result = describeResize(describeResizeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeResizeRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeClusterVersions operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterVersions service method, as returned by AmazonRedshift.
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
    public Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(final DescribeClusterVersionsRequest describeClusterVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterVersionsResult>() {
            public DescribeClusterVersionsResult call() throws Exception {
                return describeClusterVersions(describeClusterVersionsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(
            final DescribeClusterVersionsRequest describeClusterVersionsRequest,
            final AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterVersionsResult>() {
            public DescribeClusterVersionsResult call() throws Exception {
            	DescribeClusterVersionsResult result;
                try {
            		result = describeClusterVersions(describeClusterVersionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterVersionsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the RestoreFromClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromClusterSnapshot service method, as returned by
     *         AmazonRedshift.
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
    public Future<Cluster> restoreFromClusterSnapshotAsync(final RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return restoreFromClusterSnapshot(restoreFromClusterSnapshotRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Cluster> restoreFromClusterSnapshotAsync(
            final RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest,
            final AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = restoreFromClusterSnapshot(restoreFromClusterSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(restoreFromClusterSnapshotRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the ModifyClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(final ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyClusterParameterGroupResult>() {
            public ModifyClusterParameterGroupResult call() throws Exception {
                return modifyClusterParameterGroup(modifyClusterParameterGroupRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(
            final ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest,
            final AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyClusterParameterGroupResult>() {
            public ModifyClusterParameterGroupResult call() throws Exception {
            	ModifyClusterParameterGroupResult result;
                try {
            		result = modifyClusterParameterGroup(modifyClusterParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyClusterParameterGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays a list of event categories for all event source types, or for
     * a specified source type. For a list of the event categories and source
     * types, go to <a
     * mazon.com/redshift/latest/mgmt/working-with-event-notifications.html">
     * Amazon Redshift Event Notifications </a> .
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventCategories service method, as returned by AmazonRedshift.
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
    public Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest describeEventCategoriesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventCategoriesResult>() {
            public DescribeEventCategoriesResult call() throws Exception {
                return describeEventCategories(describeEventCategoriesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays a list of event categories for all event source types, or for
     * a specified source type. For a list of the event categories and source
     * types, go to <a
     * mazon.com/redshift/latest/mgmt/working-with-event-notifications.html">
     * Amazon Redshift Event Notifications </a> .
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventCategories service method, as returned by AmazonRedshift.
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
    public Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            final DescribeEventCategoriesRequest describeEventCategoriesRequest,
            final AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventCategoriesResult>() {
            public DescribeEventCategoriesResult call() throws Exception {
            	DescribeEventCategoriesResult result;
                try {
            		result = describeEventCategories(describeEventCategoriesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventCategoriesRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSecurityGroups service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(final DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSecurityGroupsResult>() {
            public DescribeClusterSecurityGroupsResult call() throws Exception {
                return describeClusterSecurityGroups(describeClusterSecurityGroupsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            final DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest,
            final AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSecurityGroupsResult>() {
            public DescribeClusterSecurityGroupsResult call() throws Exception {
            	DescribeClusterSecurityGroupsResult result;
                try {
            		result = describeClusterSecurityGroups(describeClusterSecurityGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterSecurityGroupsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeClusterSubnetGroups operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSubnetGroups service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(final DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSubnetGroupsResult>() {
            public DescribeClusterSubnetGroupsResult call() throws Exception {
                return describeClusterSubnetGroups(describeClusterSubnetGroupsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            final DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest,
            final AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSubnetGroupsResult>() {
            public DescribeClusterSubnetGroupsResult call() throws Exception {
            	DescribeClusterSubnetGroupsResult result;
                try {
            		result = describeClusterSubnetGroups(describeClusterSubnetGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterSubnetGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM
     * configuration. If no configuration ID is specified, returns
     * information about all the HSM configurations owned by your AWS
     * customer account.
     * </p>
     *
     * @param describeHsmConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeHsmConfigurations operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsmConfigurations service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(final DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmConfigurationsResult>() {
            public DescribeHsmConfigurationsResult call() throws Exception {
                return describeHsmConfigurations(describeHsmConfigurationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM
     * configuration. If no configuration ID is specified, returns
     * information about all the HSM configurations owned by your AWS
     * customer account.
     * </p>
     *
     * @param describeHsmConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeHsmConfigurations operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsmConfigurations service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            final DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest,
            final AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmConfigurationsResult>() {
            public DescribeHsmConfigurationsResult call() throws Exception {
            	DescribeHsmConfigurationsResult result;
                try {
            		result = describeHsmConfigurations(describeHsmConfigurationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeHsmConfigurationsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteClusterSnapshot operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterSnapshot service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> deleteClusterSnapshotAsync(final DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return deleteClusterSnapshot(deleteClusterSnapshotRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Snapshot> deleteClusterSnapshotAsync(
            final DeleteClusterSnapshotRequest deleteClusterSnapshotRequest,
            final AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
            	Snapshot result;
                try {
            		result = deleteClusterSnapshot(deleteClusterSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteClusterSnapshotRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<Void> deleteClusterParameterGroupAsync(final DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteClusterParameterGroup(deleteClusterParameterGroupRequest);
                return null;
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteClusterParameterGroupAsync(
            final DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest,
            final AsyncHandler<DeleteClusterParameterGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteClusterParameterGroup(deleteClusterParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteClusterParameterGroupRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     *
     * @param disableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the DisableSnapshotCopy operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSnapshotCopy service method, as returned by AmazonRedshift.
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
    public Future<Cluster> disableSnapshotCopyAsync(final DisableSnapshotCopyRequest disableSnapshotCopyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return disableSnapshotCopy(disableSnapshotCopyRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     *
     * @param disableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the DisableSnapshotCopy operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSnapshotCopy service method, as returned by AmazonRedshift.
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
    public Future<Cluster> disableSnapshotCopyAsync(
            final DisableSnapshotCopyRequest disableSnapshotCopyRequest,
            final AsyncHandler<DisableSnapshotCopyRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = disableSnapshotCopy(disableSnapshotCopyRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(disableSnapshotCopyRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This
     * action requires an ARN (Amazon Resource Name) of an Amazon SNS topic
     * created by either the Amazon Redshift console, the Amazon SNS console,
     * or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source
     * IDs, event categories, and event severities. Notifications will be
     * sent for all events you want that match those criteria. For example,
     * you can specify source type = cluster, source ID = my-cluster-1 and
     * mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subsription will only send notifications for those ERROR
     * events in the Availability and Backup categores for the specified
     * clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source
     * type = cluster and source identifier = my-cluster-1, notifiactions
     * will be sent for all the cluster events for my-cluster-1. If you
     * specify a source type but do not specify a source identifier, you will
     * receive notice of the events for the objects of that type in your AWS
     * account. If you do not specify either the SourceType nor the
     * SourceIdentifier, you will be notified of events generated from all
     * Amazon Redshift sources belonging to your AWS account. You must
     * specify a source type if you specify a source ID.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<EventSubscription> createEventSubscriptionAsync(final CreateEventSubscriptionRequest createEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return createEventSubscription(createEventSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This
     * action requires an ARN (Amazon Resource Name) of an Amazon SNS topic
     * created by either the Amazon Redshift console, the Amazon SNS console,
     * or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source
     * IDs, event categories, and event severities. Notifications will be
     * sent for all events you want that match those criteria. For example,
     * you can specify source type = cluster, source ID = my-cluster-1 and
     * mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subsription will only send notifications for those ERROR
     * events in the Availability and Backup categores for the specified
     * clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source
     * type = cluster and source identifier = my-cluster-1, notifiactions
     * will be sent for all the cluster events for my-cluster-1. If you
     * specify a source type but do not specify a source identifier, you will
     * receive notice of the events for the objects of that type in your AWS
     * account. If you do not specify either the SourceType nor the
     * SourceIdentifier, you will be notified of events generated from all
     * Amazon Redshift sources belonging to your AWS account. You must
     * specify a source type if you specify a source ID.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<EventSubscription> createEventSubscriptionAsync(
            final CreateEventSubscriptionRequest createEventSubscriptionRequest,
            final AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = createEventSubscription(createEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createEventSubscriptionRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the ResetClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         ResetClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(final ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetClusterParameterGroupResult>() {
            public ResetClusterParameterGroupResult call() throws Exception {
                return resetClusterParameterGroup(resetClusterParameterGroupRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(
            final ResetClusterParameterGroupRequest resetClusterParameterGroupRequest,
            final AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetClusterParameterGroupResult>() {
            public ResetClusterParameterGroupResult call() throws Exception {
            	ResetClusterParameterGroupResult result;
                try {
            		result = resetClusterParameterGroup(resetClusterParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(resetClusterParameterGroupRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the AuthorizeSnapshotAccess operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSnapshotAccess service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> authorizeSnapshotAccessAsync(final AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
                return authorizeSnapshotAccess(authorizeSnapshotAccessRequest);
		    }
		});
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
     *           parameters to execute the AuthorizeSnapshotAccess operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSnapshotAccess service method, as returned by AmazonRedshift.
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
    public Future<Snapshot> authorizeSnapshotAccessAsync(
            final AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest,
            final AsyncHandler<AuthorizeSnapshotAccessRequest, Snapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Snapshot>() {
            public Snapshot call() throws Exception {
            	Snapshot result;
                try {
            		result = authorizeSnapshotAccess(authorizeSnapshotAccessRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(authorizeSnapshotAccessRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     *
     * @param enableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the EnableSnapshotCopy operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSnapshotCopy service method, as returned by AmazonRedshift.
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
    public Future<Cluster> enableSnapshotCopyAsync(final EnableSnapshotCopyRequest enableSnapshotCopyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
                return enableSnapshotCopy(enableSnapshotCopyRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     *
     * @param enableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the EnableSnapshotCopy operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSnapshotCopy service method, as returned by AmazonRedshift.
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
    public Future<Cluster> enableSnapshotCopyAsync(
            final EnableSnapshotCopyRequest enableSnapshotCopyRequest,
            final AsyncHandler<EnableSnapshotCopyRequest, Cluster> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Cluster>() {
            public Cluster call() throws Exception {
            	Cluster result;
                try {
            		result = enableSnapshotCopy(enableSnapshotCopyRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(enableSnapshotCopyRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedNodeOfferings service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(final DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedNodeOfferingsResult>() {
            public DescribeReservedNodeOfferingsResult call() throws Exception {
                return describeReservedNodeOfferings(describeReservedNodeOfferingsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            final DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest,
            final AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedNodeOfferingsResult>() {
            public DescribeReservedNodeOfferingsResult call() throws Exception {
            	DescribeReservedNodeOfferingsResult result;
                try {
            		result = describeReservedNodeOfferings(describeReservedNodeOfferingsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeReservedNodeOfferingsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notifications
     * subscription for a customer account. If you specify a subscription
     * name, lists the description for that subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventSubscriptions service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(final DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventSubscriptionsResult>() {
            public DescribeEventSubscriptionsResult call() throws Exception {
                return describeEventSubscriptions(describeEventSubscriptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notifications
     * subscription for a customer account. If you specify a subscription
     * name, lists the description for that subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventSubscriptions service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            final DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest,
            final AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventSubscriptionsResult>() {
            public DescribeEventSubscriptionsResult call() throws Exception {
            	DescribeEventSubscriptionsResult result;
                try {
            		result = describeEventSubscriptions(describeEventSubscriptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventSubscriptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes whether information, such as queries and connection
     * attempts, is being logged for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param describeLoggingStatusRequest Container for the necessary
     *           parameters to execute the DescribeLoggingStatus operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoggingStatus service method, as returned by AmazonRedshift.
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
    public Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(final DescribeLoggingStatusRequest describeLoggingStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoggingStatusResult>() {
            public DescribeLoggingStatusResult call() throws Exception {
                return describeLoggingStatus(describeLoggingStatusRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes whether information, such as queries and connection
     * attempts, is being logged for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param describeLoggingStatusRequest Container for the necessary
     *           parameters to execute the DescribeLoggingStatus operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoggingStatus service method, as returned by AmazonRedshift.
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
    public Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(
            final DescribeLoggingStatusRequest describeLoggingStatusRequest,
            final AsyncHandler<DescribeLoggingStatusRequest, DescribeLoggingStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoggingStatusResult>() {
            public DescribeLoggingStatusResult call() throws Exception {
            	DescribeLoggingStatusResult result;
                try {
            		result = describeLoggingStatus(describeLoggingStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeLoggingStatusRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<Void> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteEventSubscription(deleteEventSubscriptionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSubscription service method, as returned by AmazonRedshift.
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
    public Future<Void> deleteEventSubscriptionAsync(
            final DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            final AsyncHandler<DeleteEventSubscriptionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteEventSubscription(deleteEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteEventSubscriptionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will
     * use to connect to the client's HSM in order to store and retrieve the
     * keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM.
     * After creating the HSM certificate, you must create an Amazon Redshift
     * HSM configuration that provides a cluster the information needed to
     * store and retrieve database encryption keys in the HSM. For more
     * information, go to aLinkToHSMTopic in the Amazon Redshift Management
     * Guide.
     * </p>
     *
     * @param createHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the CreateHsmClientCertificate operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsmClientCertificate service method, as returned by
     *         AmazonRedshift.
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
    public Future<HsmClientCertificate> createHsmClientCertificateAsync(final CreateHsmClientCertificateRequest createHsmClientCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<HsmClientCertificate>() {
            public HsmClientCertificate call() throws Exception {
                return createHsmClientCertificate(createHsmClientCertificateRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will
     * use to connect to the client's HSM in order to store and retrieve the
     * keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM.
     * After creating the HSM certificate, you must create an Amazon Redshift
     * HSM configuration that provides a cluster the information needed to
     * store and retrieve database encryption keys in the HSM. For more
     * information, go to aLinkToHSMTopic in the Amazon Redshift Management
     * Guide.
     * </p>
     *
     * @param createHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the CreateHsmClientCertificate operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsmClientCertificate service method, as returned by
     *         AmazonRedshift.
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
    public Future<HsmClientCertificate> createHsmClientCertificateAsync(
            final CreateHsmClientCertificateRequest createHsmClientCertificateRequest,
            final AsyncHandler<CreateHsmClientCertificateRequest, HsmClientCertificate> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<HsmClientCertificate>() {
            public HsmClientCertificate call() throws Exception {
            	HsmClientCertificate result;
                try {
            		result = createHsmClientCertificate(createHsmClientCertificateRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createHsmClientCertificateRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeClusterSecurityGroupIngress service method, as returned by
     *         AmazonRedshift.
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
    public Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(final RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
                return revokeClusterSecurityGroupIngress(revokeClusterSecurityGroupIngressRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(
            final RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest,
            final AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterSecurityGroup>() {
            public ClusterSecurityGroup call() throws Exception {
            	ClusterSecurityGroup result;
                try {
            		result = revokeClusterSecurityGroupIngress(revokeClusterSecurityGroupIngressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(revokeClusterSecurityGroupIngressRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeClusterParameters operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameters service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeClusterParametersResult> describeClusterParametersAsync(final DescribeClusterParametersRequest describeClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterParametersResult>() {
            public DescribeClusterParametersResult call() throws Exception {
                return describeClusterParameters(describeClusterParametersRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParametersResult> describeClusterParametersAsync(
            final DescribeClusterParametersRequest describeClusterParametersRequest,
            final AsyncHandler<DescribeClusterParametersRequest, DescribeClusterParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterParametersResult>() {
            public DescribeClusterParametersResult call() throws Exception {
            	DescribeClusterParametersResult result;
                try {
            		result = describeClusterParameters(describeClusterParametersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterParametersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no
     * certificate ID is specified, returns information about all the HSM
     * certificates owned by your AWS customer account.
     * </p>
     *
     * @param describeHsmClientCertificatesRequest Container for the
     *           necessary parameters to execute the DescribeHsmClientCertificates
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsmClientCertificates service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(final DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmClientCertificatesResult>() {
            public DescribeHsmClientCertificatesResult call() throws Exception {
                return describeHsmClientCertificates(describeHsmClientCertificatesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no
     * certificate ID is specified, returns information about all the HSM
     * certificates owned by your AWS customer account.
     * </p>
     *
     * @param describeHsmClientCertificatesRequest Container for the
     *           necessary parameters to execute the DescribeHsmClientCertificates
     *           operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsmClientCertificates service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            final DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest,
            final AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmClientCertificatesResult>() {
            public DescribeHsmClientCertificatesResult call() throws Exception {
            	DescribeHsmClientCertificatesResult result;
                try {
            		result = describeHsmClientCertificates(describeHsmClientCertificatesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeHsmClientCertificatesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an HSM configuration that contains the information required by
     * an Amazon Redshift cluster to store and retrieve database encryption
     * keys in a Hardware Storeage Module (HSM). After creating the HSM
     * configuration, you can specify it as a parameter when creating a
     * cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * Before creating an HSM configuration, you must have first created an
     * HSM client certificate. For more information, go to aLinkToHSMTopic in
     * the Amazon Redshift Management Guide.
     * </p>
     *
     * @param createHsmConfigurationRequest Container for the necessary
     *           parameters to execute the CreateHsmConfiguration operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsmConfiguration service method, as returned by AmazonRedshift.
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
    public Future<HsmConfiguration> createHsmConfigurationAsync(final CreateHsmConfigurationRequest createHsmConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<HsmConfiguration>() {
            public HsmConfiguration call() throws Exception {
                return createHsmConfiguration(createHsmConfigurationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an HSM configuration that contains the information required by
     * an Amazon Redshift cluster to store and retrieve database encryption
     * keys in a Hardware Storeage Module (HSM). After creating the HSM
     * configuration, you can specify it as a parameter when creating a
     * cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * Before creating an HSM configuration, you must have first created an
     * HSM client certificate. For more information, go to aLinkToHSMTopic in
     * the Amazon Redshift Management Guide.
     * </p>
     *
     * @param createHsmConfigurationRequest Container for the necessary
     *           parameters to execute the CreateHsmConfiguration operation on
     *           AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsmConfiguration service method, as returned by AmazonRedshift.
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
    public Future<HsmConfiguration> createHsmConfigurationAsync(
            final CreateHsmConfigurationRequest createHsmConfigurationRequest,
            final AsyncHandler<CreateHsmConfigurationRequest, HsmConfiguration> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<HsmConfiguration>() {
            public HsmConfiguration call() throws Exception {
            	HsmConfiguration result;
                try {
            		result = createHsmConfiguration(createHsmConfigurationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createHsmConfigurationRequest, result);
               	return result;
		    }
		});
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
     *           to execute the DescribeClusters operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonRedshift.
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
    public Future<DescribeClustersResult> describeClustersAsync(final DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClustersResult>() {
            public DescribeClustersResult call() throws Exception {
                return describeClusters(describeClustersRequest);
		    }
		});
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
     *           to execute the DescribeClusters operation on AmazonRedshift.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonRedshift.
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
    public Future<DescribeClustersResult> describeClustersAsync(
            final DescribeClustersRequest describeClustersRequest,
            final AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClustersResult>() {
            public DescribeClustersResult call() throws Exception {
            	DescribeClustersResult result;
                try {
            		result = describeClusters(describeClustersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClustersRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeClusterSnapshots operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterSnapshots service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(final DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSnapshotsResult>() {
            public DescribeClusterSnapshotsResult call() throws Exception {
                return describeClusterSnapshots(describeClusterSnapshotsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(
            final DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest,
            final AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterSnapshotsResult>() {
            public DescribeClusterSnapshotsResult call() throws Exception {
            	DescribeClusterSnapshotsResult result;
                try {
            		result = describeClusterSnapshots(describeClusterSnapshotsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterSnapshotsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateClusterParameterGroup operation on
     *           AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         CreateClusterParameterGroup service method, as returned by
     *         AmazonRedshift.
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
    public Future<ClusterParameterGroup> createClusterParameterGroupAsync(final CreateClusterParameterGroupRequest createClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterParameterGroup>() {
            public ClusterParameterGroup call() throws Exception {
                return createClusterParameterGroup(createClusterParameterGroupRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ClusterParameterGroup> createClusterParameterGroupAsync(
            final CreateClusterParameterGroupRequest createClusterParameterGroupRequest,
            final AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClusterParameterGroup>() {
            public ClusterParameterGroup call() throws Exception {
            	ClusterParameterGroup result;
                try {
            		result = createClusterParameterGroup(createClusterParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createClusterParameterGroupRequest, result);
               	return result;
		    }
		});
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
     *           operation on AmazonRedshift.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusterParameterGroups service method, as returned by
     *         AmazonRedshift.
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
    public Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(final DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterParameterGroupsResult>() {
            public DescribeClusterParameterGroupsResult call() throws Exception {
                return describeClusterParameterGroups(describeClusterParameterGroupsRequest);
		    }
		});
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            final DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest,
            final AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterParameterGroupsResult>() {
            public DescribeClusterParameterGroupsResult call() throws Exception {
            	DescribeClusterParameterGroupsResult result;
                try {
            		result = describeClusterParameterGroups(describeClusterParameterGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterParameterGroupsRequest, result);
               	return result;
		    }
		});
    }
    
}
        