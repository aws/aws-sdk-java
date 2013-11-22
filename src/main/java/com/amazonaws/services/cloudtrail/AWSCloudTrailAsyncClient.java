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
package com.amazonaws.services.cloudtrail;

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

import com.amazonaws.services.cloudtrail.model.*;


/**
 * Asynchronous client for accessing AWSCloudTrail.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Cloud Trail <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS account and delivers log files to an Amazon S3 bucket. The recorded information
 * includes the identity of the user, the start time of the AWS API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various programming
 * languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWSCloudTrail. For
 * example, the SDKs take care of cryptographically signing requests, managing errors, and retrying requests automatically. For information about the AWS
 * SDKs, including how to download and install them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * See the CloudTrail User Guide for information about the data that is included with each AWS API call listed in the log files.
 * </p>
 */
public class AWSCloudTrailAsyncClient extends AWSCloudTrailClient
        implements AWSCloudTrailAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail.  A credentials provider chain will be used
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
    public AWSCloudTrailAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail.  A credentials provider chain will be used
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
     *                       client connects to AWSCloudTrail
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudTrailAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials.
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
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials
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
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials,
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
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials provider.
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
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials provider
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
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials
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
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials
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
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrailStatus service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrailStatusResult> getTrailStatusAsync(final GetTrailStatusRequest getTrailStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTrailStatusResult>() {
            public GetTrailStatusResult call() throws Exception {
                return getTrailStatus(getTrailStatusRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrailStatus service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrailStatusResult> getTrailStatusAsync(
            final GetTrailStatusRequest getTrailStatusRequest,
            final AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTrailStatusResult>() {
            public GetTrailStatusResult call() throws Exception {
            	GetTrailStatusResult result;
                try {
            		result = getTrailStatus(getTrailStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getTrailStatusRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a trail.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrailResult> deleteTrailAsync(final DeleteTrailRequest deleteTrailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTrailResult>() {
            public DeleteTrailResult call() throws Exception {
                return deleteTrail(deleteTrailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a trail.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrailResult> deleteTrailAsync(
            final DeleteTrailRequest deleteTrailRequest,
            final AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTrailResult>() {
            public DeleteTrailResult call() throws Exception {
            	DeleteTrailResult result;
                try {
            		result = deleteTrail(deleteTrailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteTrailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * From the command line, use create-subscription.
     * </p>
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket. The request includes a Trail structure that
     * specifies the following:
     * </p>
     * 
     * <ul>
     * <li>Trail name.</li>
     * <li>The name of an existing Amazon S3 bucket to which CloudTrail
     * delivers your log files.</li>
     * <li>The name of the Amazon S3 key prefix that precedes each log
     * file.</li>
     * <li>The name of an existing Amazon SNS topic that notifies you that a
     * new file is available in your bucket.</li>
     * <li>Whether the log file should include AWS API calls from global
     * services. Currently, the only global AWS API calls included in
     * CloudTrail log files are from IAM and AWS STS.</li>
     * 
     * </ul>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrailResult> createTrailAsync(final CreateTrailRequest createTrailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTrailResult>() {
            public CreateTrailResult call() throws Exception {
                return createTrail(createTrailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * From the command line, use create-subscription.
     * </p>
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket. The request includes a Trail structure that
     * specifies the following:
     * </p>
     * 
     * <ul>
     * <li>Trail name.</li>
     * <li>The name of an existing Amazon S3 bucket to which CloudTrail
     * delivers your log files.</li>
     * <li>The name of the Amazon S3 key prefix that precedes each log
     * file.</li>
     * <li>The name of an existing Amazon SNS topic that notifies you that a
     * new file is available in your bucket.</li>
     * <li>Whether the log file should include AWS API calls from global
     * services. Currently, the only global AWS API calls included in
     * CloudTrail log files are from IAM and AWS STS.</li>
     * 
     * </ul>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrailResult> createTrailAsync(
            final CreateTrailRequest createTrailRequest,
            final AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTrailResult>() {
            public CreateTrailResult call() throws Exception {
            	CreateTrailResult result;
                try {
            		result = createTrail(createTrailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createTrailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * From the command line, use update-subscription.
     * </p>
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. You use this
     * action to designate an existing bucket for log delivery. If the
     * existing bucket has previously been a target for CloudTrail log files,
     * an IAM policy exists for the bucket. Use a Trail data type to pass
     * updated bucket or topic names.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrailResult> updateTrailAsync(final UpdateTrailRequest updateTrailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTrailResult>() {
            public UpdateTrailResult call() throws Exception {
                return updateTrail(updateTrailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * From the command line, use update-subscription.
     * </p>
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. You use this
     * action to designate an existing bucket for log delivery. If the
     * existing bucket has previously been a target for CloudTrail log files,
     * an IAM policy exists for the bucket. Use a Trail data type to pass
     * updated bucket or topic names.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrailResult> updateTrailAsync(
            final UpdateTrailRequest updateTrailRequest,
            final AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTrailResult>() {
            public UpdateTrailResult call() throws Exception {
            	UpdateTrailResult result;
                try {
            		result = updateTrail(updateTrailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateTrailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrails service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrailsResult> describeTrailsAsync(final DescribeTrailsRequest describeTrailsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrailsResult>() {
            public DescribeTrailsResult call() throws Exception {
                return describeTrails(describeTrailsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrails service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrailsResult> describeTrailsAsync(
            final DescribeTrailsRequest describeTrailsRequest,
            final AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrailsResult>() {
            public DescribeTrailsResult call() throws Exception {
            	DescribeTrailsResult result;
                try {
            		result = describeTrails(describeTrailsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTrailsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use
     * this action. You can update a trail without stopping it first. This
     * action is the only way to stop recording.
     * </p>
     *
     * @param stopLoggingRequest Container for the necessary parameters to
     *           execute the StopLogging operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         StopLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopLoggingResult> stopLoggingAsync(final StopLoggingRequest stopLoggingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopLoggingResult>() {
            public StopLoggingResult call() throws Exception {
                return stopLogging(stopLoggingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use
     * this action. You can update a trail without stopping it first. This
     * action is the only way to stop recording.
     * </p>
     *
     * @param stopLoggingRequest Container for the necessary parameters to
     *           execute the StopLogging operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopLoggingResult> stopLoggingAsync(
            final StopLoggingRequest stopLoggingRequest,
            final AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopLoggingResult>() {
            public StopLoggingResult call() throws Exception {
            	StopLoggingResult result;
                try {
            		result = stopLogging(stopLoggingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(stopLoggingRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         StartLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartLoggingResult> startLoggingAsync(final StartLoggingRequest startLoggingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartLoggingResult>() {
            public StartLoggingResult call() throws Exception {
                return startLogging(startLoggingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartLoggingResult> startLoggingAsync(
            final StartLoggingRequest startLoggingRequest,
            final AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartLoggingResult>() {
            public StartLoggingResult call() throws Exception {
            	StartLoggingResult result;
                try {
            		result = startLogging(startLoggingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(startLoggingRequest, result);
               	return result;
		    }
		});
    }
    
}
        