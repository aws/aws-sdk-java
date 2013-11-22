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
package com.amazonaws.services.cloudfront;

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

import com.amazonaws.services.cloudfront.model.*;


/**
 * Asynchronous client for accessing AmazonCloudFront.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * 
 */
public class AmazonCloudFrontAsyncClient extends AmazonCloudFrontClient
        implements AmazonCloudFrontAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront.  A credentials provider chain will be used
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
    public AmazonCloudFrontAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudFront
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFrontAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials.
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
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials
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
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials,
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
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials provider.
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
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials provider
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
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials
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
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials
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
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * List streaming distributions.
     * </p>
     *
     * @param listStreamingDistributionsRequest Container for the necessary
     *           parameters to execute the ListStreamingDistributions operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         ListStreamingDistributions service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(final ListStreamingDistributionsRequest listStreamingDistributionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStreamingDistributionsResult>() {
            public ListStreamingDistributionsResult call() throws Exception {
                return listStreamingDistributions(listStreamingDistributionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * List streaming distributions.
     * </p>
     *
     * @param listStreamingDistributionsRequest Container for the necessary
     *           parameters to execute the ListStreamingDistributions operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStreamingDistributions service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            final ListStreamingDistributionsRequest listStreamingDistributionsRequest,
            final AsyncHandler<ListStreamingDistributionsRequest, ListStreamingDistributionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStreamingDistributionsResult>() {
            public ListStreamingDistributionsResult call() throws Exception {
            	ListStreamingDistributionsResult result;
                try {
            		result = listStreamingDistributions(listStreamingDistributionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listStreamingDistributionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Update an origin access identity.
     * </p>
     *
     * @param updateCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           UpdateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(final UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateCloudFrontOriginAccessIdentityResult>() {
            public UpdateCloudFrontOriginAccessIdentityResult call() throws Exception {
                return updateCloudFrontOriginAccessIdentity(updateCloudFrontOriginAccessIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Update an origin access identity.
     * </p>
     *
     * @param updateCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           UpdateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            final UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest,
            final AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateCloudFrontOriginAccessIdentityResult>() {
            public UpdateCloudFrontOriginAccessIdentityResult call() throws Exception {
            	UpdateCloudFrontOriginAccessIdentityResult result;
                try {
            		result = updateCloudFrontOriginAccessIdentity(updateCloudFrontOriginAccessIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateCloudFrontOriginAccessIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Create a new invalidation.
     * </p>
     *
     * @param createInvalidationRequest Container for the necessary
     *           parameters to execute the CreateInvalidation operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInvalidation service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInvalidationResult> createInvalidationAsync(final CreateInvalidationRequest createInvalidationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInvalidationResult>() {
            public CreateInvalidationResult call() throws Exception {
                return createInvalidation(createInvalidationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Create a new invalidation.
     * </p>
     *
     * @param createInvalidationRequest Container for the necessary
     *           parameters to execute the CreateInvalidation operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInvalidation service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInvalidationResult> createInvalidationAsync(
            final CreateInvalidationRequest createInvalidationRequest,
            final AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInvalidationResult>() {
            public CreateInvalidationResult call() throws Exception {
            	CreateInvalidationResult result;
                try {
            		result = createInvalidation(createInvalidationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createInvalidationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Delete a streaming distribution.
     * </p>
     *
     * @param deleteStreamingDistributionRequest Container for the necessary
     *           parameters to execute the DeleteStreamingDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStreamingDistributionAsync(final DeleteStreamingDistributionRequest deleteStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteStreamingDistribution(deleteStreamingDistributionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Delete a streaming distribution.
     * </p>
     *
     * @param deleteStreamingDistributionRequest Container for the necessary
     *           parameters to execute the DeleteStreamingDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStreamingDistributionAsync(
            final DeleteStreamingDistributionRequest deleteStreamingDistributionRequest,
            final AsyncHandler<DeleteStreamingDistributionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteStreamingDistribution(deleteStreamingDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteStreamingDistributionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     *
     * @param getDistributionConfigRequest Container for the necessary
     *           parameters to execute the GetDistributionConfig operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetDistributionConfig service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionConfigResult> getDistributionConfigAsync(final GetDistributionConfigRequest getDistributionConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDistributionConfigResult>() {
            public GetDistributionConfigResult call() throws Exception {
                return getDistributionConfig(getDistributionConfigRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     *
     * @param getDistributionConfigRequest Container for the necessary
     *           parameters to execute the GetDistributionConfig operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDistributionConfig service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionConfigResult> getDistributionConfigAsync(
            final GetDistributionConfigRequest getDistributionConfigRequest,
            final AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDistributionConfigResult>() {
            public GetDistributionConfigResult call() throws Exception {
            	GetDistributionConfigResult result;
                try {
            		result = getDistributionConfig(getDistributionConfigRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getDistributionConfigRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     *
     * @param updateStreamingDistributionRequest Container for the necessary
     *           parameters to execute the UpdateStreamingDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(final UpdateStreamingDistributionRequest updateStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStreamingDistributionResult>() {
            public UpdateStreamingDistributionResult call() throws Exception {
                return updateStreamingDistribution(updateStreamingDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     *
     * @param updateStreamingDistributionRequest Container for the necessary
     *           parameters to execute the UpdateStreamingDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            final UpdateStreamingDistributionRequest updateStreamingDistributionRequest,
            final AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStreamingDistributionResult>() {
            public UpdateStreamingDistributionResult call() throws Exception {
            	UpdateStreamingDistributionResult result;
                try {
            		result = updateStreamingDistribution(updateStreamingDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateStreamingDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     *
     * @param getDistributionRequest Container for the necessary parameters
     *           to execute the GetDistribution operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionResult> getDistributionAsync(final GetDistributionRequest getDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDistributionResult>() {
            public GetDistributionResult call() throws Exception {
                return getDistribution(getDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     *
     * @param getDistributionRequest Container for the necessary parameters
     *           to execute the GetDistribution operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionResult> getDistributionAsync(
            final GetDistributionRequest getDistributionRequest,
            final AsyncHandler<GetDistributionRequest, GetDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDistributionResult>() {
            public GetDistributionResult call() throws Exception {
            	GetDistributionResult result;
                try {
            		result = getDistribution(getDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * List invalidation batches.
     * </p>
     *
     * @param listInvalidationsRequest Container for the necessary parameters
     *           to execute the ListInvalidations operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         ListInvalidations service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInvalidationsResult> listInvalidationsAsync(final ListInvalidationsRequest listInvalidationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInvalidationsResult>() {
            public ListInvalidationsResult call() throws Exception {
                return listInvalidations(listInvalidationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * List invalidation batches.
     * </p>
     *
     * @param listInvalidationsRequest Container for the necessary parameters
     *           to execute the ListInvalidations operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListInvalidations service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInvalidationsResult> listInvalidationsAsync(
            final ListInvalidationsRequest listInvalidationsRequest,
            final AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInvalidationsResult>() {
            public ListInvalidationsResult call() throws Exception {
            	ListInvalidationsResult result;
                try {
            		result = listInvalidations(listInvalidationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listInvalidationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Update a distribution.
     * </p>
     *
     * @param updateDistributionRequest Container for the necessary
     *           parameters to execute the UpdateDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDistributionResult> updateDistributionAsync(final UpdateDistributionRequest updateDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDistributionResult>() {
            public UpdateDistributionResult call() throws Exception {
                return updateDistribution(updateDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Update a distribution.
     * </p>
     *
     * @param updateDistributionRequest Container for the necessary
     *           parameters to execute the UpdateDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDistributionResult> updateDistributionAsync(
            final UpdateDistributionRequest updateDistributionRequest,
            final AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDistributionResult>() {
            public UpdateDistributionResult call() throws Exception {
            	UpdateDistributionResult result;
                try {
            		result = updateDistribution(updateDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Delete a distribution.
     * </p>
     *
     * @param deleteDistributionRequest Container for the necessary
     *           parameters to execute the DeleteDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDistributionAsync(final DeleteDistributionRequest deleteDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDistribution(deleteDistributionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Delete a distribution.
     * </p>
     *
     * @param deleteDistributionRequest Container for the necessary
     *           parameters to execute the DeleteDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDistributionAsync(
            final DeleteDistributionRequest deleteDistributionRequest,
            final AsyncHandler<DeleteDistributionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteDistribution(deleteDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDistributionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Create a new origin access identity.
     * </p>
     *
     * @param createCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           CreateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(final CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCloudFrontOriginAccessIdentityResult>() {
            public CreateCloudFrontOriginAccessIdentityResult call() throws Exception {
                return createCloudFrontOriginAccessIdentity(createCloudFrontOriginAccessIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Create a new origin access identity.
     * </p>
     *
     * @param createCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           CreateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            final CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest,
            final AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCloudFrontOriginAccessIdentityResult>() {
            public CreateCloudFrontOriginAccessIdentityResult call() throws Exception {
            	CreateCloudFrontOriginAccessIdentityResult result;
                try {
            		result = createCloudFrontOriginAccessIdentity(createCloudFrontOriginAccessIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createCloudFrontOriginAccessIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionRequest Container for the necessary
     *           parameters to execute the GetStreamingDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionResult> getStreamingDistributionAsync(final GetStreamingDistributionRequest getStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStreamingDistributionResult>() {
            public GetStreamingDistributionResult call() throws Exception {
                return getStreamingDistribution(getStreamingDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionRequest Container for the necessary
     *           parameters to execute the GetStreamingDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionResult> getStreamingDistributionAsync(
            final GetStreamingDistributionRequest getStreamingDistributionRequest,
            final AsyncHandler<GetStreamingDistributionRequest, GetStreamingDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStreamingDistributionResult>() {
            public GetStreamingDistributionResult call() throws Exception {
            	GetStreamingDistributionResult result;
                try {
            		result = getStreamingDistribution(getStreamingDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getStreamingDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * List distributions.
     * </p>
     *
     * @param listDistributionsRequest Container for the necessary parameters
     *           to execute the ListDistributions operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         ListDistributions service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDistributionsResult> listDistributionsAsync(final ListDistributionsRequest listDistributionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDistributionsResult>() {
            public ListDistributionsResult call() throws Exception {
                return listDistributions(listDistributionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * List distributions.
     * </p>
     *
     * @param listDistributionsRequest Container for the necessary parameters
     *           to execute the ListDistributions operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDistributions service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDistributionsResult> listDistributionsAsync(
            final ListDistributionsRequest listDistributionsRequest,
            final AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDistributionsResult>() {
            public ListDistributionsResult call() throws Exception {
            	ListDistributionsResult result;
                try {
            		result = listDistributions(listDistributionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listDistributionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Create a new streaming distribution.
     * </p>
     *
     * @param createStreamingDistributionRequest Container for the necessary
     *           parameters to execute the CreateStreamingDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(final CreateStreamingDistributionRequest createStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStreamingDistributionResult>() {
            public CreateStreamingDistributionResult call() throws Exception {
                return createStreamingDistribution(createStreamingDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Create a new streaming distribution.
     * </p>
     *
     * @param createStreamingDistributionRequest Container for the necessary
     *           parameters to execute the CreateStreamingDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            final CreateStreamingDistributionRequest createStreamingDistributionRequest,
            final AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStreamingDistributionResult>() {
            public CreateStreamingDistributionResult call() throws Exception {
            	CreateStreamingDistributionResult result;
                try {
            		result = createStreamingDistribution(createStreamingDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createStreamingDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * List origin access identities.
     * </p>
     *
     * @param listCloudFrontOriginAccessIdentitiesRequest Container for the
     *           necessary parameters to execute the
     *           ListCloudFrontOriginAccessIdentities operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         ListCloudFrontOriginAccessIdentities service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(final ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCloudFrontOriginAccessIdentitiesResult>() {
            public ListCloudFrontOriginAccessIdentitiesResult call() throws Exception {
                return listCloudFrontOriginAccessIdentities(listCloudFrontOriginAccessIdentitiesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * List origin access identities.
     * </p>
     *
     * @param listCloudFrontOriginAccessIdentitiesRequest Container for the
     *           necessary parameters to execute the
     *           ListCloudFrontOriginAccessIdentities operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListCloudFrontOriginAccessIdentities service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            final ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest,
            final AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCloudFrontOriginAccessIdentitiesResult>() {
            public ListCloudFrontOriginAccessIdentitiesResult call() throws Exception {
            	ListCloudFrontOriginAccessIdentitiesResult result;
                try {
            		result = listCloudFrontOriginAccessIdentities(listCloudFrontOriginAccessIdentitiesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listCloudFrontOriginAccessIdentitiesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     *
     * @param deleteCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           DeleteCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCloudFrontOriginAccessIdentityAsync(final DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteCloudFrontOriginAccessIdentity(deleteCloudFrontOriginAccessIdentityRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     *
     * @param deleteCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           DeleteCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCloudFrontOriginAccessIdentityAsync(
            final DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest,
            final AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteCloudFrontOriginAccessIdentity(deleteCloudFrontOriginAccessIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteCloudFrontOriginAccessIdentityRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Create a new distribution.
     * </p>
     *
     * @param createDistributionRequest Container for the necessary
     *           parameters to execute the CreateDistribution operation on
     *           AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDistributionResult> createDistributionAsync(final CreateDistributionRequest createDistributionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDistributionResult>() {
            public CreateDistributionResult call() throws Exception {
                return createDistribution(createDistributionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Create a new distribution.
     * </p>
     *
     * @param createDistributionRequest Container for the necessary
     *           parameters to execute the CreateDistribution operation on
     *           AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDistribution service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDistributionResult> createDistributionAsync(
            final CreateDistributionRequest createDistributionRequest,
            final AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDistributionResult>() {
            public CreateDistributionResult call() throws Exception {
            	CreateDistributionResult result;
                try {
            		result = createDistribution(createDistributionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDistributionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     *
     * @param getInvalidationRequest Container for the necessary parameters
     *           to execute the GetInvalidation operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetInvalidation service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetInvalidationResult> getInvalidationAsync(final GetInvalidationRequest getInvalidationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetInvalidationResult>() {
            public GetInvalidationResult call() throws Exception {
                return getInvalidation(getInvalidationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     *
     * @param getInvalidationRequest Container for the necessary parameters
     *           to execute the GetInvalidation operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetInvalidation service method, as returned by AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetInvalidationResult> getInvalidationAsync(
            final GetInvalidationRequest getInvalidationRequest,
            final AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetInvalidationResult>() {
            public GetInvalidationResult call() throws Exception {
            	GetInvalidationResult result;
                try {
            		result = getInvalidation(getInvalidationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getInvalidationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityConfigRequest Container for
     *           the necessary parameters to execute the
     *           GetCloudFrontOriginAccessIdentityConfig operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentityConfig service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(final GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCloudFrontOriginAccessIdentityConfigResult>() {
            public GetCloudFrontOriginAccessIdentityConfigResult call() throws Exception {
                return getCloudFrontOriginAccessIdentityConfig(getCloudFrontOriginAccessIdentityConfigRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityConfigRequest Container for
     *           the necessary parameters to execute the
     *           GetCloudFrontOriginAccessIdentityConfig operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentityConfig service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            final GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest,
            final AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCloudFrontOriginAccessIdentityConfigResult>() {
            public GetCloudFrontOriginAccessIdentityConfigResult call() throws Exception {
            	GetCloudFrontOriginAccessIdentityConfigResult result;
                try {
            		result = getCloudFrontOriginAccessIdentityConfig(getCloudFrontOriginAccessIdentityConfigRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getCloudFrontOriginAccessIdentityConfigRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the GetCloudFrontOriginAccessIdentity
     *           operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(final GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCloudFrontOriginAccessIdentityResult>() {
            public GetCloudFrontOriginAccessIdentityResult call() throws Exception {
                return getCloudFrontOriginAccessIdentity(getCloudFrontOriginAccessIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the GetCloudFrontOriginAccessIdentity
     *           operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            final GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest,
            final AsyncHandler<GetCloudFrontOriginAccessIdentityRequest, GetCloudFrontOriginAccessIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCloudFrontOriginAccessIdentityResult>() {
            public GetCloudFrontOriginAccessIdentityResult call() throws Exception {
            	GetCloudFrontOriginAccessIdentityResult result;
                try {
            		result = getCloudFrontOriginAccessIdentity(getCloudFrontOriginAccessIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getCloudFrontOriginAccessIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionConfigRequest Container for the
     *           necessary parameters to execute the GetStreamingDistributionConfig
     *           operation on AmazonCloudFront.
     * 
     * @return A Java Future object containing the response from the
     *         GetStreamingDistributionConfig service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(final GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStreamingDistributionConfigResult>() {
            public GetStreamingDistributionConfigResult call() throws Exception {
                return getStreamingDistributionConfig(getStreamingDistributionConfigRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionConfigRequest Container for the
     *           necessary parameters to execute the GetStreamingDistributionConfig
     *           operation on AmazonCloudFront.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetStreamingDistributionConfig service method, as returned by
     *         AmazonCloudFront.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            final GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest,
            final AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetStreamingDistributionConfigResult>() {
            public GetStreamingDistributionConfigResult call() throws Exception {
            	GetStreamingDistributionConfigResult result;
                try {
            		result = getStreamingDistributionConfig(getStreamingDistributionConfigRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getStreamingDistributionConfigRequest, result);
               	return result;
		    }
		});
    }
    
}
        