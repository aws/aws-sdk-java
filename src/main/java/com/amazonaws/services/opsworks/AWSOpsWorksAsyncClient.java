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
package com.amazonaws.services.opsworks;

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

import com.amazonaws.services.opsworks.model.*;


/**
 * Asynchronous client for accessing AWSOpsWorks.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS OpsWorks
 */
public class AWSOpsWorksAsyncClient extends AWSOpsWorksClient
        implements AWSOpsWorksAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
    public AWSOpsWorksAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
     *                       client connects to AWSOpsWorks
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AWSOpsWorksAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials.
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials,
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
    public AWSOpsWorksAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials provider.
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials provider
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
    public AWSOpsWorksAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(final UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserProfile(updateUserProfileRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(
            final UpdateUserProfileRequest updateUserProfileRequest,
            final AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		updateUserProfile(updateUserProfileRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateUserProfileRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(final CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStackResult>() {
            public CreateStackResult call() throws Exception {
                return createStack(createStackRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(
            final CreateStackRequest createStackRequest,
            final AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStackResult>() {
            public CreateStackResult call() throws Exception {
            	CreateStackResult result;
                try {
            		result = createStack(createStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createStackRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(final RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                rebootInstance(rebootInstanceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(
            final RebootInstanceRequest rebootInstanceRequest,
            final AsyncHandler<RebootInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		rebootInstance(rebootInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(rebootInstanceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(final SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setPermission(setPermissionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(
            final SetPermissionRequest setPermissionRequest,
            final AsyncHandler<SetPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setPermission(setPermissionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setPermissionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancesResult>() {
            public DescribeInstancesResult call() throws Exception {
                return describeInstances(describeInstancesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(
            final DescribeInstancesRequest describeInstancesRequest,
            final AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancesResult>() {
            public DescribeInstancesResult call() throws Exception {
            	DescribeInstancesResult result;
                try {
            		result = describeInstances(describeInstancesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeInstancesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(final DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePermissionsResult>() {
            public DescribePermissionsResult call() throws Exception {
                return describePermissions(describePermissionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(
            final DescribePermissionsRequest describePermissionsRequest,
            final AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePermissionsResult>() {
            public DescribePermissionsResult call() throws Exception {
            	DescribePermissionsResult result;
                try {
            		result = describePermissions(describePermissionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describePermissionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(final DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteInstance(deleteInstanceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(
            final DeleteInstanceRequest deleteInstanceRequest,
            final AsyncHandler<DeleteInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteInstance(deleteInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteInstanceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(final CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneStackResult>() {
            public CloneStackResult call() throws Exception {
                return cloneStack(cloneStackRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(
            final CloneStackRequest cloneStackRequest,
            final AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneStackResult>() {
            public CloneStackResult call() throws Exception {
            	CloneStackResult result;
                try {
            		result = cloneStack(cloneStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(cloneStackRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
                return createInstance(createInstanceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(
            final CreateInstanceRequest createInstanceRequest,
            final AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
            	CreateInstanceResult result;
                try {
            		result = createInstance(createInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createInstanceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(final StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                stopInstance(stopInstanceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(
            final StopInstanceRequest stopInstanceRequest,
            final AsyncHandler<StopInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		stopInstance(stopInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(stopInstanceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(final UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateApp(updateAppRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(
            final UpdateAppRequest updateAppRequest,
            final AsyncHandler<UpdateAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		updateApp(updateAppRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateAppRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(final DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteApp(deleteAppRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(
            final DeleteAppRequest deleteAppRequest,
            final AsyncHandler<DeleteAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteApp(deleteAppRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteAppRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(final DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommandsResult>() {
            public DescribeCommandsResult call() throws Exception {
                return describeCommands(describeCommandsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(
            final DescribeCommandsRequest describeCommandsRequest,
            final AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommandsResult>() {
            public DescribeCommandsResult call() throws Exception {
            	DescribeCommandsResult result;
                try {
            		result = describeCommands(describeCommandsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeCommandsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(final UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateStack(updateStackRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(
            final UpdateStackRequest updateStackRequest,
            final AsyncHandler<UpdateStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		updateStack(updateStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateStackRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserProfileResult>() {
            public CreateUserProfileResult call() throws Exception {
                return createUserProfile(createUserProfileRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(
            final CreateUserProfileRequest createUserProfileRequest,
            final AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserProfileResult>() {
            public CreateUserProfileResult call() throws Exception {
            	CreateUserProfileResult result;
                try {
            		result = createUserProfile(createUserProfileRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createUserProfileRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(final GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostnameSuggestionResult>() {
            public GetHostnameSuggestionResult call() throws Exception {
                return getHostnameSuggestion(getHostnameSuggestionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            final GetHostnameSuggestionRequest getHostnameSuggestionRequest,
            final AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostnameSuggestionResult>() {
            public GetHostnameSuggestionResult call() throws Exception {
            	GetHostnameSuggestionResult result;
                try {
            		result = getHostnameSuggestion(getHostnameSuggestionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getHostnameSuggestionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(final DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRaidArraysResult>() {
            public DescribeRaidArraysResult call() throws Exception {
                return describeRaidArrays(describeRaidArraysRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            final DescribeRaidArraysRequest describeRaidArraysRequest,
            final AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRaidArraysResult>() {
            public DescribeRaidArraysResult call() throws Exception {
            	DescribeRaidArraysResult result;
                try {
            		result = describeRaidArrays(describeRaidArraysRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeRaidArraysRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(final DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLayersResult>() {
            public DescribeLayersResult call() throws Exception {
                return describeLayers(describeLayersRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(
            final DescribeLayersRequest describeLayersRequest,
            final AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLayersResult>() {
            public DescribeLayersResult call() throws Exception {
            	DescribeLayersResult result;
                try {
            		result = describeLayers(describeLayersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeLayersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(final DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBasedAutoScalingResult>() {
            public DescribeLoadBasedAutoScalingResult call() throws Exception {
                return describeLoadBasedAutoScaling(describeLoadBasedAutoScalingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            final DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest,
            final AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBasedAutoScalingResult>() {
            public DescribeLoadBasedAutoScalingResult call() throws Exception {
            	DescribeLoadBasedAutoScalingResult result;
                try {
            		result = describeLoadBasedAutoScaling(describeLoadBasedAutoScalingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeLoadBasedAutoScalingRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer.
     * </p>
     * <p>
     * <b>NOTE:</b>To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(final SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setLoadBasedAutoScaling(setLoadBasedAutoScalingRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer.
     * </p>
     * <p>
     * <b>NOTE:</b>To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(
            final SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest,
            final AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setLoadBasedAutoScaling(setLoadBasedAutoScalingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setLoadBasedAutoScalingRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(final DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLayer(deleteLayerRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(
            final DeleteLayerRequest deleteLayerRequest,
            final AsyncHandler<DeleteLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteLayer(deleteLayerRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteLayerRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVolumesResult>() {
            public DescribeVolumesResult call() throws Exception {
                return describeVolumes(describeVolumesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(
            final DescribeVolumesRequest describeVolumesRequest,
            final AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVolumesResult>() {
            public DescribeVolumesResult call() throws Exception {
            	DescribeVolumesResult result;
                try {
            		result = describeVolumes(describeVolumesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeVolumesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(final SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTimeBasedAutoScaling(setTimeBasedAutoScalingRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(
            final SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest,
            final AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setTimeBasedAutoScaling(setTimeBasedAutoScalingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setTimeBasedAutoScalingRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(final CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppResult>() {
            public CreateAppResult call() throws Exception {
                return createApp(createAppRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(
            final CreateAppRequest createAppRequest,
            final AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppResult>() {
            public CreateAppResult call() throws Exception {
            	CreateAppResult result;
                try {
            		result = createApp(createAppRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createAppRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(final DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTimeBasedAutoScalingResult>() {
            public DescribeTimeBasedAutoScalingResult call() throws Exception {
                return describeTimeBasedAutoScaling(describeTimeBasedAutoScalingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            final DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest,
            final AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTimeBasedAutoScalingResult>() {
            public DescribeTimeBasedAutoScalingResult call() throws Exception {
            	DescribeTimeBasedAutoScalingResult result;
                try {
            		result = describeTimeBasedAutoScaling(describeTimeBasedAutoScalingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTimeBasedAutoScalingRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(final DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteUserProfile(deleteUserProfileRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(
            final DeleteUserProfileRequest deleteUserProfileRequest,
            final AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteUserProfile(deleteUserProfileRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteUserProfileRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(final DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserProfilesResult>() {
            public DescribeUserProfilesResult call() throws Exception {
                return describeUserProfiles(describeUserProfilesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            final DescribeUserProfilesRequest describeUserProfilesRequest,
            final AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserProfilesResult>() {
            public DescribeUserProfilesResult call() throws Exception {
            	DescribeUserProfilesResult result;
                try {
            		result = describeUserProfiles(describeUserProfilesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeUserProfilesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(final UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateInstance(updateInstanceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(
            final UpdateInstanceRequest updateInstanceRequest,
            final AsyncHandler<UpdateInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		updateInstance(updateInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateInstanceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(final DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceErrorsResult>() {
            public DescribeServiceErrorsResult call() throws Exception {
                return describeServiceErrors(describeServiceErrorsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            final DescribeServiceErrorsRequest describeServiceErrorsRequest,
            final AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceErrorsResult>() {
            public DescribeServiceErrorsResult call() throws Exception {
            	DescribeServiceErrorsResult result;
                try {
            		result = describeServiceErrors(describeServiceErrorsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeServiceErrorsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(final DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeploymentsResult>() {
            public DescribeDeploymentsResult call() throws Exception {
                return describeDeployments(describeDeploymentsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            final DescribeDeploymentsRequest describeDeploymentsRequest,
            final AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDeploymentsResult>() {
            public DescribeDeploymentsResult call() throws Exception {
            	DescribeDeploymentsResult result;
                try {
            		result = describeDeployments(describeDeploymentsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDeploymentsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(final UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateLayer(updateLayerRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(
            final UpdateLayerRequest updateLayerRequest,
            final AsyncHandler<UpdateLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		updateLayer(updateLayerRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateLayerRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(final StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                startInstance(startInstanceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(
            final StartInstanceRequest startInstanceRequest,
            final AsyncHandler<StartInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		startInstance(startInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(startInstanceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(final DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticIpsResult>() {
            public DescribeElasticIpsResult call() throws Exception {
                return describeElasticIps(describeElasticIpsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            final DescribeElasticIpsRequest describeElasticIpsRequest,
            final AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeElasticIpsResult>() {
            public DescribeElasticIpsResult call() throws Exception {
            	DescribeElasticIpsResult result;
                try {
            		result = describeElasticIps(describeElasticIpsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeElasticIpsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(final DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStacksResult>() {
            public DescribeStacksResult call() throws Exception {
                return describeStacks(describeStacksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(
            final DescribeStacksRequest describeStacksRequest,
            final AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStacksResult>() {
            public DescribeStacksResult call() throws Exception {
            	DescribeStacksResult result;
                try {
            		result = describeStacks(describeStacksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStacksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(final DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAppsResult>() {
            public DescribeAppsResult call() throws Exception {
                return describeApps(describeAppsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(
            final DescribeAppsRequest describeAppsRequest,
            final AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAppsResult>() {
            public DescribeAppsResult call() throws Exception {
            	DescribeAppsResult result;
                try {
            		result = describeApps(describeAppsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeAppsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(final CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLayerResult>() {
            public CreateLayerResult call() throws Exception {
                return createLayer(createLayerRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(
            final CreateLayerRequest createLayerRequest,
            final AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLayerResult>() {
            public CreateLayerResult call() throws Exception {
            	CreateLayerResult result;
                try {
            		result = createLayer(createLayerRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createLayerRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(final DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteStack(deleteStackRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(
            final DeleteStackRequest deleteStackRequest,
            final AsyncHandler<DeleteStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteStack(deleteStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteStackRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(final StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                startStack(startStackRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(
            final StartStackRequest startStackRequest,
            final AsyncHandler<StartStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		startStack(startStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(startStackRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(final StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                stopStack(stopStackRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(
            final StopStackRequest stopStackRequest,
            final AsyncHandler<StopStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		stopStack(stopStackRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(stopStackRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deploys a stack or app.
     * </p>
     * 
     * <ul>
     * <li>App deployment generates a <code>deploy</code> event, which runs
     * the associated recipes and passes them a JSON stack configuration
     * object that includes information about the app. </li>
     * <li>Stack deployment runs the <code>deploy</code> recipes but does
     * not raise an event.</li>
     * 
     * </ul>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentResult>() {
            public CreateDeploymentResult call() throws Exception {
                return createDeployment(createDeploymentRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deploys a stack or app.
     * </p>
     * 
     * <ul>
     * <li>App deployment generates a <code>deploy</code> event, which runs
     * the associated recipes and passes them a JSON stack configuration
     * object that includes information about the app. </li>
     * <li>Stack deployment runs the <code>deploy</code> recipes but does
     * not raise an event.</li>
     * 
     * </ul>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest createDeploymentRequest,
            final AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDeploymentResult>() {
            public CreateDeploymentResult call() throws Exception {
            	CreateDeploymentResult result;
                try {
            		result = createDeployment(createDeploymentRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDeploymentRequest, result);
               	return result;
		    }
		});
    }
    
}
        