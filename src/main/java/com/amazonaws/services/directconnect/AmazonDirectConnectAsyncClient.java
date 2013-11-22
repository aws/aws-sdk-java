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
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"> Common Query Parameters </a> : Parameters that all
 * Query actions can use.</li>
 * <li> <a href="http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server errors that all
 * actions can return.</li>
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
     * Returns the list of AWS Direct Connect locations in the current AWS
     * region. These are the locations that may be selected when calling
     * CreateConnection or CreateInterconnect.
     * </p>
     *
     * @param describeLocationsRequest Container for the necessary parameters
     *           to execute the DescribeLocations operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLocations service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLocationsResult> describeLocationsAsync(final DescribeLocationsRequest describeLocationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLocationsResult>() {
            public DescribeLocationsResult call() throws Exception {
                return describeLocations(describeLocationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS
     * region. These are the locations that may be selected when calling
     * CreateConnection or CreateInterconnect.
     * </p>
     *
     * @param describeLocationsRequest Container for the necessary parameters
     *           to execute the DescribeLocations operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLocations service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLocationsResult> describeLocationsAsync(
            final DescribeLocationsRequest describeLocationsRequest,
            final AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLocationsResult>() {
            public DescribeLocationsResult call() throws Exception {
            	DescribeLocationsResult result;
                try {
            		result = describeLocations(describeLocationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeLocationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Accept ownership of a public virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified
     * virtual interface will be created and made available for handling
     * traffic.
     * </p>
     *
     * @param confirmPublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPublicVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmPublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(final ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmPublicVirtualInterfaceResult>() {
            public ConfirmPublicVirtualInterfaceResult call() throws Exception {
                return confirmPublicVirtualInterface(confirmPublicVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Accept ownership of a public virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified
     * virtual interface will be created and made available for handling
     * traffic.
     * </p>
     *
     * @param confirmPublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPublicVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmPublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            final ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest,
            final AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmPublicVirtualInterfaceResult>() {
            public ConfirmPublicVirtualInterfaceResult call() throws Exception {
            	ConfirmPublicVirtualInterfaceResult result;
                try {
            		result = confirmPublicVirtualInterface(confirmPublicVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(confirmPublicVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the
     * VLAN that transports AWS Direct Connect traffic. A private virtual
     * interface supports sending traffic to a single virtual private cloud
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
     * interface supports sending traffic to a single virtual private cloud
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
    
    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's
     * network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other
     * connections. The AWS Direct Connect partner can use an interconnect
     * to provide sub-1Gbps AWS Direct Connect service to tier 2 customers
     * who do not have their own connections. Like a standard connection, an
     * interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet
     * fiber-optic cable. One end is connected to the partner's router, the
     * other to an AWS Direct Connect router.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a
     * connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect
     * to AWS resources by creating a virtual interface on their connection,
     * using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     *
     * @param createInterconnectRequest Container for the necessary
     *           parameters to execute the CreateInterconnect operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInterconnect service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInterconnectResult> createInterconnectAsync(final CreateInterconnectRequest createInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInterconnectResult>() {
            public CreateInterconnectResult call() throws Exception {
                return createInterconnect(createInterconnectRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's
     * network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other
     * connections. The AWS Direct Connect partner can use an interconnect
     * to provide sub-1Gbps AWS Direct Connect service to tier 2 customers
     * who do not have their own connections. Like a standard connection, an
     * interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet
     * fiber-optic cable. One end is connected to the partner's router, the
     * other to an AWS Direct Connect router.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a
     * connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect
     * to AWS resources by creating a virtual interface on their connection,
     * using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     *
     * @param createInterconnectRequest Container for the necessary
     *           parameters to execute the CreateInterconnect operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInterconnect service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInterconnectResult> createInterconnectAsync(
            final CreateInterconnectRequest createInterconnectRequest,
            final AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInterconnectResult>() {
            public CreateInterconnectResult call() throws Exception {
            	CreateInterconnectResult result;
                try {
            		result = createInterconnect(createInterconnectRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createInterconnectRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before DescribeVirtualInterfaces is
     * called are also returned. If a connection ID is included then only
     * virtual interfaces associated with this connection will be returned.
     * If a virtual interface ID is included then only a single virtual
     * interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS
     * Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on
     * the specified connection will be returned. If a virtual interface ID
     * is provided, only this particular virtual interface will be returned.
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
     * called are also returned. If a connection ID is included then only
     * virtual interfaces associated with this connection will be returned.
     * If a virtual interface ID is included then only a single virtual
     * interface will be returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS
     * Direct Connect location and the customer.
     * </p>
     * <p>
     * If a connection ID is provided, only virtual interfaces provisioned on
     * the specified connection will be returned. If a virtual interface ID
     * is provided, only this particular virtual interface will be returned.
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
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering'
     * state, and will remain in this state until the owner calls
     * ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     *
     * @param confirmConnectionRequest Container for the necessary parameters
     *           to execute the ConfirmConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmConnection service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmConnectionResult> confirmConnectionAsync(final ConfirmConnectionRequest confirmConnectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmConnectionResult>() {
            public ConfirmConnectionResult call() throws Exception {
                return confirmConnection(confirmConnectionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering'
     * state, and will remain in this state until the owner calls
     * ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     *
     * @param confirmConnectionRequest Container for the necessary parameters
     *           to execute the ConfirmConnection operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmConnection service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmConnectionResult> confirmConnectionAsync(
            final ConfirmConnectionRequest confirmConnectionRequest,
            final AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmConnectionResult>() {
            public ConfirmConnectionResult call() throws Exception {
            	ConfirmConnectionResult result;
                try {
            		result = confirmConnection(confirmConnectionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(confirmConnectionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular
     * interconnect.
     * </p>
     *
     * @param describeInterconnectsRequest Container for the necessary
     *           parameters to execute the DescribeInterconnects operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInterconnects service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInterconnectsResult> describeInterconnectsAsync(final DescribeInterconnectsRequest describeInterconnectsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInterconnectsResult>() {
            public DescribeInterconnectsResult call() throws Exception {
                return describeInterconnects(describeInterconnectsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular
     * interconnect.
     * </p>
     *
     * @param describeInterconnectsRequest Container for the necessary
     *           parameters to execute the DescribeInterconnects operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInterconnects service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            final DescribeInterconnectsRequest describeInterconnectsRequest,
            final AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInterconnectsResult>() {
            public DescribeInterconnectsResult call() throws Exception {
            	DescribeInterconnectsResult result;
                try {
            		result = describeInterconnects(describeInterconnectsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeInterconnectsRequest, result);
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
     * Accept ownership of a private virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual
     * interface will be created and attached to the given virtual private
     * gateway, and will be available for handling traffic.
     * </p>
     *
     * @param confirmPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmPrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(final ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmPrivateVirtualInterfaceResult>() {
            public ConfirmPrivateVirtualInterfaceResult call() throws Exception {
                return confirmPrivateVirtualInterface(confirmPrivateVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Accept ownership of a private virtual interface created by another
     * customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual
     * interface will be created and attached to the given virtual private
     * gateway, and will be available for handling traffic.
     * </p>
     *
     * @param confirmPrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the ConfirmPrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmPrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            final ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest,
            final AsyncHandler<ConfirmPrivateVirtualInterfaceRequest, ConfirmPrivateVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmPrivateVirtualInterfaceResult>() {
            public ConfirmPrivateVirtualInterfaceResult call() throws Exception {
            	ConfirmPrivateVirtualInterfaceResult result;
                try {
            		result = confirmPrivateVirtualInterface(confirmPrivateVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(confirmPrivateVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular
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
     * If a connection ID is provided, the call returns only that particular
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
     * Provisions a public virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPublicVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePublicVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         AllocatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(final AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocatePublicVirtualInterfaceResult>() {
            public AllocatePublicVirtualInterfaceResult call() throws Exception {
                return allocatePublicVirtualInterface(allocatePublicVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provisions a public virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPublicVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePublicVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePublicVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AllocatePublicVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            final AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest,
            final AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocatePublicVirtualInterfaceResult>() {
            public AllocatePublicVirtualInterfaceResult call() throws Exception {
            	AllocatePublicVirtualInterfaceResult result;
                try {
            		result = allocatePublicVirtualInterface(allocatePublicVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(allocatePublicVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Provisions a private virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a private
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPrivateVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         AllocatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(final AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocatePrivateVirtualInterfaceResult>() {
            public AllocatePrivateVirtualInterfaceResult call() throws Exception {
                return allocatePrivateVirtualInterface(allocatePrivateVirtualInterfaceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provisions a private virtual interface to be owned by a different
     * customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a private
     * virtual interface which will be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by
     * the virtual interface owner by calling ConfirmPrivateVirtualInterface.
     * Until this step has been completed, the virtual interface will be in
     * 'Confirming' state, and will not be available for handling traffic.
     * </p>
     *
     * @param allocatePrivateVirtualInterfaceRequest Container for the
     *           necessary parameters to execute the AllocatePrivateVirtualInterface
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AllocatePrivateVirtualInterface service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            final AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest,
            final AsyncHandler<AllocatePrivateVirtualInterfaceRequest, AllocatePrivateVirtualInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocatePrivateVirtualInterfaceResult>() {
            public AllocatePrivateVirtualInterfaceResult call() throws Exception {
            	AllocatePrivateVirtualInterfaceResult result;
                try {
            		result = allocatePrivateVirtualInterface(allocatePrivateVirtualInterfaceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(allocatePrivateVirtualInterfaceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and
     * data transfer charges. You need to cancel separately with the
     * providers any services or charges for cross-connects or network
     * circuits that connect you to the AWS Direct Connect location.
     * </p>
     *
     * @param deleteConnectionRequest Container for the necessary parameters
     *           to execute the DeleteConnection operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConnection service method, as returned by AmazonDirectConnect.
     * 
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
     * Deleting a connection only stops the AWS Direct Connect port hour and
     * data transfer charges. You need to cancel separately with the
     * providers any services or charges for cross-connects or network
     * circuits that connect you to the AWS Direct Connect location.
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
     * Return a list of connections that have been provisioned on the given
     * interconnect.
     * </p>
     *
     * @param describeConnectionsOnInterconnectRequest Container for the
     *           necessary parameters to execute the DescribeConnectionsOnInterconnect
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionsOnInterconnect service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(final DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionsOnInterconnectResult>() {
            public DescribeConnectionsOnInterconnectResult call() throws Exception {
                return describeConnectionsOnInterconnect(describeConnectionsOnInterconnectRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Return a list of connections that have been provisioned on the given
     * interconnect.
     * </p>
     *
     * @param describeConnectionsOnInterconnectRequest Container for the
     *           necessary parameters to execute the DescribeConnectionsOnInterconnect
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConnectionsOnInterconnect service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            final DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest,
            final AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConnectionsOnInterconnectResult>() {
            public DescribeConnectionsOnInterconnectResult call() throws Exception {
            	DescribeConnectionsOnInterconnectResult result;
                try {
            		result = describeConnectionsOnInterconnect(describeConnectionsOnInterconnectRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeConnectionsOnInterconnectRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by
     * a hosted connection on the given interconnect.
     * </p>
     *
     * @param allocateConnectionOnInterconnectRequest Container for the
     *           necessary parameters to execute the AllocateConnectionOnInterconnect
     *           operation on AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         AllocateConnectionOnInterconnect service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(final AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocateConnectionOnInterconnectResult>() {
            public AllocateConnectionOnInterconnectResult call() throws Exception {
                return allocateConnectionOnInterconnect(allocateConnectionOnInterconnectRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by
     * a hosted connection on the given interconnect.
     * </p>
     *
     * @param allocateConnectionOnInterconnectRequest Container for the
     *           necessary parameters to execute the AllocateConnectionOnInterconnect
     *           operation on AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AllocateConnectionOnInterconnect service method, as returned by
     *         AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            final AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest,
            final AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AllocateConnectionOnInterconnectResult>() {
            public AllocateConnectionOnInterconnectResult call() throws Exception {
            	AllocateConnectionOnInterconnectResult result;
                try {
            		result = allocateConnectionOnInterconnect(allocateConnectionOnInterconnectRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(allocateConnectionOnInterconnectRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new connection between the customer network and a specific
     * AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. An AWS Direct Connect location provides
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
     * Creates a new connection between the customer network and a specific
     * AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to
     * an AWS Direct Connect router. An AWS Direct Connect location provides
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
     * Deletes the specified interconnect.
     * </p>
     *
     * @param deleteInterconnectRequest Container for the necessary
     *           parameters to execute the DeleteInterconnect operation on
     *           AmazonDirectConnect.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInterconnect service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteInterconnectResult> deleteInterconnectAsync(final DeleteInterconnectRequest deleteInterconnectRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteInterconnectResult>() {
            public DeleteInterconnectResult call() throws Exception {
                return deleteInterconnect(deleteInterconnectRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     *
     * @param deleteInterconnectRequest Container for the necessary
     *           parameters to execute the DeleteInterconnect operation on
     *           AmazonDirectConnect.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInterconnect service method, as returned by AmazonDirectConnect.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDirectConnect indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteInterconnectResult> deleteInterconnectAsync(
            final DeleteInterconnectRequest deleteInterconnectRequest,
            final AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteInterconnectResult>() {
            public DeleteInterconnectResult call() throws Exception {
            	DeleteInterconnectResult result;
                try {
            		result = deleteInterconnect(deleteInterconnectRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteInterconnectRequest, result);
               	return result;
		    }
		});
    }
    
}
        