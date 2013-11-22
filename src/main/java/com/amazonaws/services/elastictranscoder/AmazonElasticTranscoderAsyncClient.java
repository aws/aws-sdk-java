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
package com.amazonaws.services.elastictranscoder;

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

import com.amazonaws.services.elastictranscoder.model.*;


/**
 * Asynchronous client for accessing AmazonElasticTranscoder.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Elastic Transcoder Service <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
public class AmazonElasticTranscoderAsyncClient extends AmazonElasticTranscoderClient
        implements AmazonElasticTranscoderAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder.  A credentials provider chain will be used
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
    public AmazonElasticTranscoderAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder.  A credentials provider chain will be used
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
     *                       client connects to AmazonElasticTranscoder
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticTranscoderAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials.
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials,
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials provider.
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials provider
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials
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
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline,
     * so that the pipeline stops or restarts the processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or
     * more jobs. You can't cancel jobs after Elastic Transcoder has started
     * processing them; if you pause the pipeline to which you submitted the
     * jobs, you have more time to get the job IDs for the jobs that you want
     * to cancel, and to send a CancelJob request.
     * </p>
     *
     * @param updatePipelineStatusRequest Container for the necessary
     *           parameters to execute the UpdatePipelineStatus operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineStatus service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(final UpdatePipelineStatusRequest updatePipelineStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineStatusResult>() {
            public UpdatePipelineStatusResult call() throws Exception {
                return updatePipelineStatus(updatePipelineStatusRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline,
     * so that the pipeline stops or restarts the processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or
     * more jobs. You can't cancel jobs after Elastic Transcoder has started
     * processing them; if you pause the pipeline to which you submitted the
     * jobs, you have more time to get the job IDs for the jobs that you want
     * to cancel, and to send a CancelJob request.
     * </p>
     *
     * @param updatePipelineStatusRequest Container for the necessary
     *           parameters to execute the UpdatePipelineStatus operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineStatus service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(
            final UpdatePipelineStatusRequest updatePipelineStatusRequest,
            final AsyncHandler<UpdatePipelineStatusRequest, UpdatePipelineStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineStatusResult>() {
            public UpdatePipelineStatusResult call() throws Exception {
            	UpdatePipelineStatusResult result;
                try {
            		result = updatePipelineStatus(updatePipelineStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updatePipelineStatusRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon
     * Simple Notification Service (Amazon SNS) notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineNotifications service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(final UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineNotificationsResult>() {
            public UpdatePipelineNotificationsResult call() throws Exception {
                return updatePipelineNotifications(updatePipelineNotificationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon
     * Simple Notification Service (Amazon SNS) notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineNotifications service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(
            final UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest,
            final AsyncHandler<UpdatePipelineNotificationsRequest, UpdatePipelineNotificationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineNotificationsResult>() {
            public UpdatePipelineNotificationsResult call() throws Exception {
            	UpdatePipelineNotificationsResult result;
                try {
            		result = updatePipelineNotifications(updatePipelineNotificationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updatePipelineNotificationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the ReadJob
     *         service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadJobResult> readJobAsync(final ReadJobRequest readJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadJobResult>() {
            public ReadJobResult call() throws Exception {
                return readJob(readJobRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ReadJob
     *         service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadJobResult> readJobAsync(
            final ReadJobRequest readJobRequest,
            final AsyncHandler<ReadJobRequest, ReadJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadJobResult>() {
            public ReadJobResult call() throws Exception {
            	ReadJobResult result;
                try {
            		result = readJob(readJobRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(readJobRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a
     * specified status. The response body contains one element for each job
     * that satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByStatus service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByStatusResult> listJobsByStatusAsync(final ListJobsByStatusRequest listJobsByStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListJobsByStatusResult>() {
            public ListJobsByStatusResult call() throws Exception {
                return listJobsByStatus(listJobsByStatusRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a
     * specified status. The response body contains one element for each job
     * that satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByStatus service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByStatusResult> listJobsByStatusAsync(
            final ListJobsByStatusRequest listJobsByStatusRequest,
            final AsyncHandler<ListJobsByStatusRequest, ListJobsByStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListJobsByStatusResult>() {
            public ListJobsByStatusResult call() throws Exception {
            	ListJobsByStatusResult result;
                try {
            		result = listJobsByStatus(listJobsByStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listJobsByStatusRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPresetResult> readPresetAsync(final ReadPresetRequest readPresetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadPresetResult>() {
            public ReadPresetResult call() throws Exception {
                return readPreset(readPresetRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPresetResult> readPresetAsync(
            final ReadPresetRequest readPresetRequest,
            final AsyncHandler<ReadPresetRequest, ReadPresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadPresetResult>() {
            public ReadPresetResult call() throws Exception {
            	ReadPresetResult result;
                try {
            		result = readPreset(readPresetRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(readPresetRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you
     * specify.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePipelineResult>() {
            public CreatePipelineResult call() throws Exception {
                return createPipeline(createPipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you
     * specify.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(
            final CreatePipelineRequest createPipelineRequest,
            final AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePipelineResult>() {
            public CreatePipelineResult call() throws Exception {
            	CreatePipelineResult result;
                try {
            		result = createPipeline(createPipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPipelineRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(final CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelJobResult>() {
            public CancelJobResult call() throws Exception {
                return cancelJob(cancelJobRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(
            final CancelJobRequest cancelJobRequest,
            final AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelJobResult>() {
            public CancelJobResult call() throws Exception {
            	CancelJobResult result;
                try {
            		result = cancelJob(cancelJobRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(cancelJobRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for
     * a pipeline. <p>
     * <b>IMPORTANT:</b>When you change pipeline settings, your changes take
     * effect immediately. Jobs that you have already submitted and that
     * Elastic Transcoder has not started to process are affected in addition
     * to jobs that you submit after you change settings.
     * </p>
     * 
     * </p>
     *
     * @param updatePipelineRequest Container for the necessary parameters to
     *           execute the UpdatePipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest updatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineResult>() {
            public UpdatePipelineResult call() throws Exception {
                return updatePipeline(updatePipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for
     * a pipeline. <p>
     * <b>IMPORTANT:</b>When you change pipeline settings, your changes take
     * effect immediately. Jobs that you have already submitted and that
     * Elastic Transcoder has not started to process are affected in addition
     * to jobs that you submit after you change settings.
     * </p>
     * 
     * </p>
     *
     * @param updatePipelineRequest Container for the necessary parameters to
     *           execute the UpdatePipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineResult> updatePipelineAsync(
            final UpdatePipelineRequest updatePipelineRequest,
            final AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePipelineResult>() {
            public UpdatePipelineResult call() throws Exception {
            	UpdatePipelineResult result;
                try {
            		result = updatePipeline(updatePipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updatePipelineRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListPresets service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPresetsResult> listPresetsAsync(final ListPresetsRequest listPresetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPresetsResult>() {
            public ListPresetsResult call() throws Exception {
                return listPresets(listPresetsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPresets service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPresetsResult> listPresetsAsync(
            final ListPresetsRequest listPresetsRequest,
            final AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPresetsResult>() {
            public ListPresetsResult call() throws Exception {
            	ListPresetsResult result;
                try {
            		result = listPresets(listPresetsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listPresetsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePipelineResult>() {
            public DeletePipelineResult call() throws Exception {
                return deletePipeline(deletePipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePipelineResult> deletePipelineAsync(
            final DeletePipelineRequest deletePipelineRequest,
            final AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePipelineResult>() {
            public DeletePipelineResult call() throws Exception {
            	DeletePipelineResult result;
                try {
            		result = deletePipeline(deletePipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deletePipelineRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM
     * role you are using has sufficient permissions to let Elastic
     * Transcoder perform tasks associated with the transcoding process. The
     * action attempts to assume the specified IAM role, checks read access
     * to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     *
     * @param testRoleRequest Container for the necessary parameters to
     *           execute the TestRole operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the TestRole
     *         service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestRoleResult> testRoleAsync(final TestRoleRequest testRoleRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestRoleResult>() {
            public TestRoleResult call() throws Exception {
                return testRole(testRoleRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM
     * role you are using has sufficient permissions to let Elastic
     * Transcoder perform tasks associated with the transcoding process. The
     * action attempts to assume the specified IAM role, checks read access
     * to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     *
     * @param testRoleRequest Container for the necessary parameters to
     *           execute the TestRole operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the TestRole
     *         service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestRoleResult> testRoleAsync(
            final TestRoleRequest testRoleRequest,
            final AsyncHandler<TestRoleRequest, TestRoleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestRoleResult>() {
            public TestRoleResult call() throws Exception {
            	TestRoleResult result;
                try {
            		result = testRole(testRoleRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(testRoleRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPipelinesResult>() {
            public ListPipelinesResult call() throws Exception {
                return listPipelines(listPipelinesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(
            final ListPipelinesRequest listPipelinesRequest,
            final AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPipelinesResult>() {
            public ListPipelinesResult call() throws Exception {
            	ListPipelinesResult result;
                try {
            		result = listPipelines(listPipelinesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listPipelinesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPipelineResult> readPipelineAsync(final ReadPipelineRequest readPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadPipelineResult>() {
            public ReadPipelineResult call() throws Exception {
                return readPipeline(readPipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPipeline service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPipelineResult> readPipelineAsync(
            final ReadPipelineRequest readPipelineRequest,
            final AsyncHandler<ReadPipelineRequest, ReadPipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReadPipelineResult>() {
            public ReadPipelineResult call() throws Exception {
            	ReadPipelineResult result;
                try {
            		result = readPipeline(readPipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(readPipelineRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you
     * specify.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the CreatePreset settings
     * to ensure that they meet Elastic Transcoder requirements and to
     * determine whether they comply with H.264 standards. If your settings
     * are not valid for Elastic Transcoder, Elastic Transcoder returns an
     * HTTP 400 response (ValidationException) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't
     * strictly compliant with the H.264 standard, Elastic Transcoder creates
     * the preset and returns a warning message in the response. This helps
     * you determine whether your settings comply with the H.264 standard
     * while giving you greater flexibility with respect to the video that
     * Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePresetResult> createPresetAsync(final CreatePresetRequest createPresetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePresetResult>() {
            public CreatePresetResult call() throws Exception {
                return createPreset(createPresetRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you
     * specify.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the CreatePreset settings
     * to ensure that they meet Elastic Transcoder requirements and to
     * determine whether they comply with H.264 standards. If your settings
     * are not valid for Elastic Transcoder, Elastic Transcoder returns an
     * HTTP 400 response (ValidationException) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't
     * strictly compliant with the H.264 standard, Elastic Transcoder creates
     * the preset and returns a warning message in the response. This helps
     * you determine whether your settings comply with the H.264 standard
     * while giving you greater flexibility with respect to the video that
     * Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePresetResult> createPresetAsync(
            final CreatePresetRequest createPresetRequest,
            final AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePresetResult>() {
            public CreatePresetResult call() throws Exception {
            	CreatePresetResult result;
                try {
            		result = createPreset(createPresetRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPresetRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an
     * AWS region.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't delete the default presets that are included
     * with Elastic Transcoder.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePresetResult> deletePresetAsync(final DeletePresetRequest deletePresetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePresetResult>() {
            public DeletePresetResult call() throws Exception {
                return deletePreset(deletePresetRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an
     * AWS region.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't delete the default presets that are included
     * with Elastic Transcoder.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePreset service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePresetResult> deletePresetAsync(
            final DeletePresetRequest deletePresetRequest,
            final AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePresetResult>() {
            public DeletePresetResult call() throws Exception {
            	DeletePresetResult result;
                try {
            		result = deletePreset(deletePresetRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deletePresetRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example,
     * one output for the Kindle Fire and another output for the Apple iPhone
     * 4s), you currently must use the Elastic Transcoder API to list the
     * jobs (as opposed to the AWS Console).
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(final CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateJobResult>() {
            public CreateJobResult call() throws Exception {
                return createJob(createJobRequest);
		    }
		});
    }

    
    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example,
     * one output for the Kindle Fire and another output for the Apple iPhone
     * 4s), you currently must use the Elastic Transcoder API to list the
     * jobs (as opposed to the AWS Console).
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(
            final CreateJobRequest createJobRequest,
            final AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateJobResult>() {
            public CreateJobResult call() throws Exception {
            	CreateJobResult result;
                try {
            		result = createJob(createJobRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createJobRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in
     * a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByPipeline service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByPipelineResult> listJobsByPipelineAsync(final ListJobsByPipelineRequest listJobsByPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListJobsByPipelineResult>() {
            public ListJobsByPipelineResult call() throws Exception {
                return listJobsByPipeline(listJobsByPipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in
     * a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByPipeline service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByPipelineResult> listJobsByPipelineAsync(
            final ListJobsByPipelineRequest listJobsByPipelineRequest,
            final AsyncHandler<ListJobsByPipelineRequest, ListJobsByPipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListJobsByPipelineResult>() {
            public ListJobsByPipelineResult call() throws Exception {
            	ListJobsByPipelineResult result;
                try {
            		result = listJobsByPipeline(listJobsByPipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listJobsByPipelineRequest, result);
               	return result;
		    }
		});
    }
    
}
        