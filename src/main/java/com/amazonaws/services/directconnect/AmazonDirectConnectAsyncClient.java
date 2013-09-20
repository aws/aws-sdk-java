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
package com.amazonaws.services.directconnect;

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

import com.amazonaws.services.directconnect.model.*;


/**
 * Asynchronous client for accessing AmazonDirectConnect.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * AWS Direct Connect makes it easy to establish a dedicated network connection from your premises to Amazon Web Services (AWS). Using AWS Direct
 * Connect, you can establish private connectivity between AWS and your data center, office, or colocation environment, which in many cases can reduce
 * your network costs, increase bandwidth throughput, and provide a more consistent network experience than Internet-based connections.
 * </p>
 * <p>
 * The AWS Direct Connect API Reference provides descriptions, syntax, and usage examples for each of the actions and data types for AWS Direct Connect.
 * Use the following links to get started using the <i>AWS Direct Connect API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Operations.html"> Actions </a> : An alphabetical list of all AWS
 * Direct Connect actions.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Types.html"> Data Types </a> : An alphabetical list of all AWS Direct
 * Connect data types.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"> Common Parameters </a> : Parameters that all Query
 * actions can use.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server errors that all
 * actions can return.</li>
 * <li> <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a> : Itemized regions and endpoints for
 * all AWS products.</li>
 * 
 * </ul>
 */
public class AmazonDirectConnectAsyncClient extends AmazonDirectConnectClient
        implements AmazonDirectConnectAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect.  A credentials provider chain will be used
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
    public AmazonDirectConnectAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect.  A credentials provider chain will be used
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
     *                       client connects to AmazonDirectConnect
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDirectConnectAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials.
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
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials
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
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials,
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
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials provider.
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
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials provider
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
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials
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
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDirectConnect using the specified AWS account credentials
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
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a virtual interface ID is included then
     * only a single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the Direct
     * Connect location and the customer.
     * </p>
     *
     * @param describeVirtualInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeVirtualInterfaces operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualInterfaces service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(final DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVirtualInterfacesResult>() {
            public DescribeVirtualInterfacesResult call() throws Exception {
                return describeVirtualInterfaces(describeVirtualInterfacesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a virtual interface ID is included then
     * only a single virtual interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the Direct
     * Connect location and the customer.
     * </p>
     *
     * @param describeVirtualInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeVirtualInterfaces operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualInterfaces service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            final DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest,
            final AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVirtualInterfacesResult>() {
            public DescribeVirtualInterfacesResult call() throws Exception {
            	DescribeVirtualInterfacesResult result;
                try {
            		result = describeVirtualInterfaces(describeVirtualInterfacesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeVirtualInterfacesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual
     * interfaces linking to a virtual private gateway. A virtual private
     * gateway can be managed via Amazon Virtual Private Cloud (VPC) console
     * or the <a
     * /AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">
     * EC2 CreateVpnGateway </a> action.
     * </p>
     *
     * @param describeVirtualGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVirtualGateways operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualGateways service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(final DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVirtualGatewaysResult>() {
            public DescribeVirtualGatewaysResult call() throws Exception {
                return describeVirtualGateways(describeVirtualGatewaysRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual
     * interfaces linking to a virtual private gateway. A virtual private
     * gateway can be managed via Amazon Virtual Private Cloud (VPC) console
     * or the <a
     * /AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">
     * EC2 CreateVpnGateway </a> action.
     * </p>
     *
     * @param describeVirtualGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVirtualGateways operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVirtualGateways service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            final DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest,
            final AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVirtualGatewaysResult>() {
            public DescribeVirtualGatewaysResult call() throws Exception {
            	DescribeVirtualGatewaysResult result;
                try {
            		result = describeVirtualGateways(describeVirtualGatewaysRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeVirtualGatewaysRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays details about a specific connection including the order steps
     * for the connection and the current state of the connection order.
     * </p>
     *
     * @param describeConnectionDetailRequest Container for the necessary
     *           parameters to execute the DescribeConnectionDetail operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionDetailResult> describeConnectionDetailAsync(final DescribeConnectionDetailRequest describeConnectionDetailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionDetailResult>() {
            public DescribeConnectionDetailResult call() throws Exception {
                return describeConnectionDetail(describeConnectionDetailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays details about a specific connection including the order steps
     * for the connection and the current state of the connection order.
     * </p>
     *
     * @param describeConnectionDetailRequest Container for the necessary
     *           parameters to execute the DescribeConnectionDetail operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionDetailResult> describeConnectionDetailAsync(
            final DescribeConnectionDetailRequest describeConnectionDetailRequest,
            final AsyncHandler<DescribeConnectionDetailRequest, DescribeConnectionDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionDetailResult>() {
            public DescribeConnectionDetailResult call() throws Exception {
            	DescribeConnectionDetailResult result;
                try {
            		result = describeConnectionDetail(describeConnectionDetailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeConnectionDetailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes one or more of the offerings that are currently available
     * for creating new connections. The results include offerings for all
     * regions.
     * </p>
     * <p>
     * To order a new connection you need to select a specific offering ID.
     * </p>
     *
     * @param describeOfferingsRequest Container for the necessary parameters
     *           to execute the DescribeOfferings operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferings service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingsResult> describeOfferingsAsync(final DescribeOfferingsRequest describeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOfferingsResult>() {
            public DescribeOfferingsResult call() throws Exception {
                return describeOfferings(describeOfferingsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes one or more of the offerings that are currently available
     * for creating new connections. The results include offerings for all
     * regions.
     * </p>
     * <p>
     * To order a new connection you need to select a specific offering ID.
     * </p>
     *
     * @param describeOfferingsRequest Container for the necessary parameters
     *           to execute the DescribeOfferings operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferings service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingsResult> describeOfferingsAsync(
            final DescribeOfferingsRequest describeOfferingsRequest,
            final AsyncHandler<DescribeOfferingsRequest, DescribeOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOfferingsResult>() {
            public DescribeOfferingsResult call() throws Exception {
            	DescribeOfferingsResult result;
                try {
            		result = describeOfferings(describeOfferingsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOfferingsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, it will only return this particular
     * connection.
     * </p>
     *
     * @param describeConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeConnections operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnections service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsResult> describeConnectionsAsync(final DescribeConnectionsRequest describeConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionsResult>() {
            public DescribeConnectionsResult call() throws Exception {
                return describeConnections(describeConnectionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, it will only return this particular
     * connection.
     * </p>
     *
     * @param describeConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeConnections operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnections service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsResult> describeConnectionsAsync(
            final DescribeConnectionsRequest describeConnectionsRequest,
            final AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionsResult>() {
            public DescribeConnectionsResult call() throws Exception {
            	DescribeConnectionsResult result;
                try {
            		result = describeConnections(describeConnectionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeConnectionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays additional ordering step details for a specified offering.
     * </p>
     *
     * @param describeOfferingDetailRequest Container for the necessary
     *           parameters to execute the DescribeOfferingDetail operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferingDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingDetailResult> describeOfferingDetailAsync(final DescribeOfferingDetailRequest describeOfferingDetailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOfferingDetailResult>() {
            public DescribeOfferingDetailResult call() throws Exception {
                return describeOfferingDetail(describeOfferingDetailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays additional ordering step details for a specified offering.
     * </p>
     *
     * @param describeOfferingDetailRequest Container for the necessary
     *           parameters to execute the DescribeOfferingDetail operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOfferingDetail service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOfferingDetailResult> describeOfferingDetailAsync(
            final DescribeOfferingDetailRequest describeOfferingDetailRequest,
            final AsyncHandler<DescribeOfferingDetailRequest, DescribeOfferingDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOfferingDetailResult>() {
            public DescribeOfferingDetailResult call() throws Exception {
            	DescribeOfferingDetailResult result;
                try {
            		result = describeOfferingDetail(describeOfferingDetailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOfferingDetailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port and data
     * transfer charges. You separately need to cancel any services or
     * charges for cross-connects or network circuits that connect you to the
     * AWS Direct Connect location with the providers of those services.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteConnectionResult> deleteConnectionAsync(final DeleteConnectionRequest deleteConnectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConnectionResult>() {
            public DeleteConnectionResult call() throws Exception {
                return deleteConnection(deleteConnectionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port and data
     * transfer charges. You separately need to cancel any services or
     * charges for cross-connects or network circuits that connect you to the
     * AWS Direct Connect location with the providers of those services.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteConnectionResult> deleteConnectionAsync(
            final DeleteConnectionRequest deleteConnectionRequest,
            final AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConnectionResult>() {
            public DeleteConnectionResult call() throws Exception {
            	DeleteConnectionResult result;
                try {
            		result = deleteConnection(deleteConnectionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteConnectionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new network connection between the customer network and a
     * specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. A Direct Connect location provides
     * access to Amazon Web Services in the region it is associated with. You
     * can establish connections with AWS Direct Connect locations in
     * multiple regions, but a connection in one region does not provide
     * connectivity to other regions.
     * </p>
     *
     * @param createConnectionRequest Container for the necessary parameters
     *           to execute the CreateConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateConnectionResult> createConnectionAsync(final CreateConnectionRequest createConnectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConnectionResult>() {
            public CreateConnectionResult call() throws Exception {
                return createConnection(createConnectionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new network connection between the customer network and a
     * specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. A Direct Connect location provides
     * access to Amazon Web Services in the region it is associated with. You
     * can establish connections with AWS Direct Connect locations in
     * multiple regions, but a connection in one region does not provide
     * connectivity to other regions.
     * </p>
     *
     * @param createConnectionRequest Container for the necessary parameters
     *           to execute the CreateConnection operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateConnection service method, as returned by AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateConnectionResult> createConnectionAsync(
            final CreateConnectionRequest createConnectionRequest,
            final AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConnectionResult>() {
            public CreateConnectionResult call() throws Exception {
            	CreateConnectionResult result;
                try {
            		result = createConnection(createConnectionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createConnectionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single Virtual Private Cloud
     * (VPC).
     * </p>
     *
     * @param createPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the CreatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(final CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePrivateVirtualInterfaceResult>() {
            public CreatePrivateVirtualInterfaceResult call() throws Exception {
                return createPrivateVirtualInterface(createPrivateVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single Virtual Private Cloud
     * (VPC).
     * </p>
     *
     * @param createPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the CreatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            final CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest,
            final AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePrivateVirtualInterfaceResult>() {
            public CreatePrivateVirtualInterfaceResult call() throws Exception {
            	CreatePrivateVirtualInterfaceResult result;
                try {
            		result = createPrivateVirtualInterface(createPrivateVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPrivateVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     *
     * @param deleteVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualInterface operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(final DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteVirtualInterfaceResult>() {
            public DeleteVirtualInterfaceResult call() throws Exception {
                return deleteVirtualInterface(deleteVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     *
     * @param deleteVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualInterface operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(
            final DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest,
            final AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteVirtualInterfaceResult>() {
            public DeleteVirtualInterfaceResult call() throws Exception {
            	DeleteVirtualInterfaceResult result;
                try {
            		result = deleteVirtualInterface(deleteVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A public virtual
     * interface supports sending traffic to public services of AWS such as
     * Amazon Simple Storage Service (Amazon S3).
     * </p>
     *
     * @param createPublicVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the CreatePublicVirtualInterface operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(final CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePublicVirtualInterfaceResult>() {
            public CreatePublicVirtualInterfaceResult call() throws Exception {
                return createPublicVirtualInterface(createPublicVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A public virtual
     * interface supports sending traffic to public services of AWS such as
     * Amazon Simple Storage Service (Amazon S3).
     * </p>
     *
     * @param createPublicVirtualInterfaceRequest Container for the necessary
     *           parameters to execute the CreatePublicVirtualInterface operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            final CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest,
            final AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePublicVirtualInterfaceResult>() {
            public CreatePublicVirtualInterfaceResult call() throws Exception {
            	CreatePublicVirtualInterfaceResult result;
                try {
            		result = createPublicVirtualInterface(createPublicVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPublicVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
}
        