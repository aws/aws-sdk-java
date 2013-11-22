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
package com.amazonaws.services.datapipeline;

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

import com.amazonaws.services.datapipeline.model.*;


/**
 * Asynchronous client for accessing DataPipeline.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * This is the <i>AWS Data Pipeline API Reference</i> . This guide provides descriptions and samples of the AWS Data Pipeline API.
 * </p>
 * <p>
 * AWS Data Pipeline is a web service that configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the details of
 * scheduling and ensuring that data dependencies are met so your application can focus on processing the data.
 * </p>
 * <p>
 * The AWS Data Pipeline API implements two main sets of functionality. The first set of actions configure the pipeline in the web service. You call
 * these actions to create a pipeline and define data sources, schedules, dependencies, and the transforms to be performed on the data.
 * </p>
 * <p>
 * The second set of actions are used by a task runner application that calls the AWS Data Pipeline API to receive the next task ready for processing.
 * The logic for performing the task, such as querying the data, running data analysis, or converting the data from one format to another, is contained
 * within the task runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as it does so. When
 * the task is done, the task runner reports the final success or failure of the task to the web service.
 * </p>
 * <p>
 * AWS Data Pipeline provides an open-source implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as performing database queries and running data analysis using Amazon Elastic MapReduce
 * (Amazon EMR). You can use AWS Data Pipeline Task Runner as your task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * The AWS Data Pipeline API uses the Signature Version 4 protocol for signing requests. For more information about how to sign a request with this
 * protocol, see <a href="http://docs.amazonwebservices.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a> . In
 * the code examples in this reference, the Signature Version 4 Request parameters are represented as AuthParams.
 * </p>
 */
public class DataPipelineAsyncClient extends DataPipelineClient
        implements DataPipelineAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline.  A credentials provider chain will be used
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
    public DataPipelineAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline.  A credentials provider chain will be used
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
     *                       client connects to DataPipeline
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public DataPipelineAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials.
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
    public DataPipelineAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials
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
    public DataPipelineAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials,
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
    public DataPipelineAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials provider.
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
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials provider
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
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials
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
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials
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
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Validates a pipeline and initiates processing. If the pipeline does
     * not pass validation, activation fails.
     * </p>
     * <p>
     * Call this action to start processing pipeline tasks of a pipeline
     * you've created using the CreatePipeline and PutPipelineDefinition
     * actions. A pipeline cannot be modified after it has been successfully
     * activated.
     * </p>
     *
     * @param activatePipelineRequest Container for the necessary parameters
     *           to execute the ActivatePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ActivatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivatePipelineResult> activatePipelineAsync(final ActivatePipelineRequest activatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivatePipelineResult>() {
            public ActivatePipelineResult call() throws Exception {
                return activatePipeline(activatePipelineRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Validates a pipeline and initiates processing. If the pipeline does
     * not pass validation, activation fails.
     * </p>
     * <p>
     * Call this action to start processing pipeline tasks of a pipeline
     * you've created using the CreatePipeline and PutPipelineDefinition
     * actions. A pipeline cannot be modified after it has been successfully
     * activated.
     * </p>
     *
     * @param activatePipelineRequest Container for the necessary parameters
     *           to execute the ActivatePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ActivatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivatePipelineResult> activatePipelineAsync(
            final ActivatePipelineRequest activatePipelineRequest,
            final AsyncHandler<ActivatePipelineRequest, ActivatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivatePipelineResult>() {
            public ActivatePipelineResult call() throws Exception {
            	ActivatePipelineResult result;
                try {
            		result = activatePipeline(activatePipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(activatePipelineRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
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
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
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
     * Updates the AWS Data Pipeline service on the progress of the calling
     * task runner. When the task runner is assigned a task, it should call
     * ReportTaskProgress to acknowledge that it has the task within 2
     * minutes. If the web service does not recieve this acknowledgement
     * within the 2 minute window, it will assign the task in a subsequent
     * PollForTask call. After this initial acknowledgement, the task runner
     * only needs to report progress every 15 minutes to maintain its
     * ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline. If a task runner does not report its status after 5
     * minutes, AWS Data Pipeline will assume that the task runner is unable
     * to process the task and will reassign the task in a subsequent
     * response to PollForTask. task runners should call ReportTaskProgress
     * every 60 seconds.
     * </p>
     *
     * @param reportTaskProgressRequest Container for the necessary
     *           parameters to execute the ReportTaskProgress operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskProgress service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskProgressResult> reportTaskProgressAsync(final ReportTaskProgressRequest reportTaskProgressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReportTaskProgressResult>() {
            public ReportTaskProgressResult call() throws Exception {
                return reportTaskProgress(reportTaskProgressRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Updates the AWS Data Pipeline service on the progress of the calling
     * task runner. When the task runner is assigned a task, it should call
     * ReportTaskProgress to acknowledge that it has the task within 2
     * minutes. If the web service does not recieve this acknowledgement
     * within the 2 minute window, it will assign the task in a subsequent
     * PollForTask call. After this initial acknowledgement, the task runner
     * only needs to report progress every 15 minutes to maintain its
     * ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline. If a task runner does not report its status after 5
     * minutes, AWS Data Pipeline will assume that the task runner is unable
     * to process the task and will reassign the task in a subsequent
     * response to PollForTask. task runners should call ReportTaskProgress
     * every 60 seconds.
     * </p>
     *
     * @param reportTaskProgressRequest Container for the necessary
     *           parameters to execute the ReportTaskProgress operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskProgress service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskProgressResult> reportTaskProgressAsync(
            final ReportTaskProgressRequest reportTaskProgressRequest,
            final AsyncHandler<ReportTaskProgressRequest, ReportTaskProgressResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReportTaskProgressResult>() {
            public ReportTaskProgressResult call() throws Exception {
            	ReportTaskProgressResult result;
                try {
            		result = reportTaskProgress(reportTaskProgressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(reportTaskProgressRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Tests the pipeline definition with a set of validation checks to
     * ensure that it is well formed and can run without error.
     * </p>
     *
     * @param validatePipelineDefinitionRequest Container for the necessary
     *           parameters to execute the ValidatePipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ValidatePipelineDefinition service method, as returned by
     *         DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(final ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidatePipelineDefinitionResult>() {
            public ValidatePipelineDefinitionResult call() throws Exception {
                return validatePipelineDefinition(validatePipelineDefinitionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Tests the pipeline definition with a set of validation checks to
     * ensure that it is well formed and can run without error.
     * </p>
     *
     * @param validatePipelineDefinitionRequest Container for the necessary
     *           parameters to execute the ValidatePipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ValidatePipelineDefinition service method, as returned by
     *         DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(
            final ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest,
            final AsyncHandler<ValidatePipelineDefinitionRequest, ValidatePipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ValidatePipelineDefinitionResult>() {
            public ValidatePipelineDefinitionResult call() throws Exception {
            	ValidatePipelineDefinitionResult result;
                try {
            		result = validatePipelineDefinition(validatePipelineDefinitionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(validatePipelineDefinitionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Task runners call this action to receive a task to perform from AWS
     * Data Pipeline. The task runner specifies which tasks it can perform by
     * setting a value for the workerGroup parameter of the PollForTask call.
     * The task returned by PollForTask may come from any of the pipelines
     * that match the workerGroup value passed in by the task runner and that
     * was launched using the IAM user credentials specified by the task
     * runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, PollForTask returns a response
     * immediately. If no tasks are available in the queue, PollForTask uses
     * long-polling and holds on to a poll connection for up to a 90 seconds
     * during which time the first newly scheduled task is handed to the task
     * runner. To accomodate this, set the socket timeout in your task runner
     * to 90 seconds. The task runner should not call PollForTask again on
     * the same <code>workerGroup</code> until it receives a response, and
     * this may take up to 90 seconds.
     * </p>
     *
     * @param pollForTaskRequest Container for the necessary parameters to
     *           execute the PollForTask operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         PollForTask service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PollForTaskResult> pollForTaskAsync(final PollForTaskRequest pollForTaskRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PollForTaskResult>() {
            public PollForTaskResult call() throws Exception {
                return pollForTask(pollForTaskRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Task runners call this action to receive a task to perform from AWS
     * Data Pipeline. The task runner specifies which tasks it can perform by
     * setting a value for the workerGroup parameter of the PollForTask call.
     * The task returned by PollForTask may come from any of the pipelines
     * that match the workerGroup value passed in by the task runner and that
     * was launched using the IAM user credentials specified by the task
     * runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, PollForTask returns a response
     * immediately. If no tasks are available in the queue, PollForTask uses
     * long-polling and holds on to a poll connection for up to a 90 seconds
     * during which time the first newly scheduled task is handed to the task
     * runner. To accomodate this, set the socket timeout in your task runner
     * to 90 seconds. The task runner should not call PollForTask again on
     * the same <code>workerGroup</code> until it receives a response, and
     * this may take up to 90 seconds.
     * </p>
     *
     * @param pollForTaskRequest Container for the necessary parameters to
     *           execute the PollForTask operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PollForTask service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PollForTaskResult> pollForTaskAsync(
            final PollForTaskRequest pollForTaskRequest,
            final AsyncHandler<PollForTaskRequest, PollForTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PollForTaskResult>() {
            public PollForTaskResult call() throws Exception {
            	PollForTaskResult result;
                try {
            		result = pollForTask(pollForTaskRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(pollForTaskRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Queries a pipeline for the names of objects that match a specified set
     * of conditions.
     * </p>
     * <p>
     * The objects returned by QueryObjects are paginated and then filtered
     * by the value you set for query. This means the action may return an
     * empty result set with a value set for marker. If
     * <code>HasMoreResults</code> is set to <code>True</code> , you should
     * continue to call QueryObjects, passing in the returned value for
     * marker, until <code>HasMoreResults</code> returns <code>False</code> .
     * </p>
     *
     * @param queryObjectsRequest Container for the necessary parameters to
     *           execute the QueryObjects operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         QueryObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryObjectsResult> queryObjectsAsync(final QueryObjectsRequest queryObjectsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<QueryObjectsResult>() {
            public QueryObjectsResult call() throws Exception {
                return queryObjects(queryObjectsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Queries a pipeline for the names of objects that match a specified set
     * of conditions.
     * </p>
     * <p>
     * The objects returned by QueryObjects are paginated and then filtered
     * by the value you set for query. This means the action may return an
     * empty result set with a value set for marker. If
     * <code>HasMoreResults</code> is set to <code>True</code> , you should
     * continue to call QueryObjects, passing in the returned value for
     * marker, until <code>HasMoreResults</code> returns <code>False</code> .
     * </p>
     *
     * @param queryObjectsRequest Container for the necessary parameters to
     *           execute the QueryObjects operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         QueryObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryObjectsResult> queryObjectsAsync(
            final QueryObjectsRequest queryObjectsRequest,
            final AsyncHandler<QueryObjectsRequest, QueryObjectsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<QueryObjectsResult>() {
            public QueryObjectsResult call() throws Exception {
            	QueryObjectsResult result;
                try {
            		result = queryObjects(queryObjectsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(queryObjectsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Requests that the status of an array of physical or logical pipeline
     * objects be updated in the pipeline. This update may not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object.
     * </p>
     *
     * @param setStatusRequest Container for the necessary parameters to
     *           execute the SetStatus operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         SetStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStatusAsync(final SetStatusRequest setStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setStatus(setStatusRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Requests that the status of an array of physical or logical pipeline
     * objects be updated in the pipeline. This update may not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object.
     * </p>
     *
     * @param setStatusRequest Container for the necessary parameters to
     *           execute the SetStatus operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStatusAsync(
            final SetStatusRequest setStatusRequest,
            final AsyncHandler<SetStatusRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setStatus(setStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setStatusRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Permanently deletes a pipeline, its pipeline definition and its run
     * history. You cannot query or restore a deleted pipeline. AWS Data
     * Pipeline will attempt to cancel instances associated with the pipeline
     * that are currently being processed by task runners. Deleting a
     * pipeline cannot be undone.
     * </p>
     * <p>
     * To temporarily pause a pipeline instead of deleting it, call
     * SetStatus with the status set to Pause on individual components.
     * Components that are paused by SetStatus can be resumed.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePipelineAsync(final DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePipeline(deletePipelineRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Permanently deletes a pipeline, its pipeline definition and its run
     * history. You cannot query or restore a deleted pipeline. AWS Data
     * Pipeline will attempt to cancel instances associated with the pipeline
     * that are currently being processed by task runners. Deleting a
     * pipeline cannot be undone.
     * </p>
     * <p>
     * To temporarily pause a pipeline instead of deleting it, call
     * SetStatus with the status set to Pause on individual components.
     * Components that are paused by SetStatus can be resumed.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePipelineAsync(
            final DeletePipelineRequest deletePipelineRequest,
            final AsyncHandler<DeletePipelineRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deletePipeline(deletePipelineRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deletePipelineRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the definition of the specified pipeline. You can call
     * GetPipelineDefinition to retrieve the pipeline definition you provided
     * using PutPipelineDefinition.
     * </p>
     *
     * @param getPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the GetPipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         GetPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(final GetPipelineDefinitionRequest getPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPipelineDefinitionResult>() {
            public GetPipelineDefinitionResult call() throws Exception {
                return getPipelineDefinition(getPipelineDefinitionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the definition of the specified pipeline. You can call
     * GetPipelineDefinition to retrieve the pipeline definition you provided
     * using PutPipelineDefinition.
     * </p>
     *
     * @param getPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the GetPipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(
            final GetPipelineDefinitionRequest getPipelineDefinitionRequest,
            final AsyncHandler<GetPipelineDefinitionRequest, GetPipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPipelineDefinitionResult>() {
            public GetPipelineDefinitionResult call() throws Exception {
            	GetPipelineDefinitionResult result;
                try {
            		result = getPipelineDefinition(getPipelineDefinitionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getPipelineDefinitionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Notifies AWS Data Pipeline that a task is completed and provides
     * information about the final status. The task runner calls this action
     * regardless of whether the task was sucessful. The task runner does not
     * need to call SetTaskStatus for tasks that are canceled by the web
     * service during a call to ReportTaskProgress.
     * </p>
     *
     * @param setTaskStatusRequest Container for the necessary parameters to
     *           execute the SetTaskStatus operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         SetTaskStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetTaskStatusResult> setTaskStatusAsync(final SetTaskStatusRequest setTaskStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetTaskStatusResult>() {
            public SetTaskStatusResult call() throws Exception {
                return setTaskStatus(setTaskStatusRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Notifies AWS Data Pipeline that a task is completed and provides
     * information about the final status. The task runner calls this action
     * regardless of whether the task was sucessful. The task runner does not
     * need to call SetTaskStatus for tasks that are canceled by the web
     * service during a call to ReportTaskProgress.
     * </p>
     *
     * @param setTaskStatusRequest Container for the necessary parameters to
     *           execute the SetTaskStatus operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTaskStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetTaskStatusResult> setTaskStatusAsync(
            final SetTaskStatusRequest setTaskStatusRequest,
            final AsyncHandler<SetTaskStatusRequest, SetTaskStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetTaskStatusResult>() {
            public SetTaskStatusResult call() throws Exception {
            	SetTaskStatusResult result;
                try {
            		result = setTaskStatus(setTaskStatusRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setTaskStatusRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Evaluates a string in the context of a specified object. A task runner
     * can use this action to evaluate SQL queries stored in Amazon S3.
     * </p>
     *
     * @param evaluateExpressionRequest Container for the necessary
     *           parameters to execute the EvaluateExpression operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         EvaluateExpression service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EvaluateExpressionResult> evaluateExpressionAsync(final EvaluateExpressionRequest evaluateExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EvaluateExpressionResult>() {
            public EvaluateExpressionResult call() throws Exception {
                return evaluateExpression(evaluateExpressionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Evaluates a string in the context of a specified object. A task runner
     * can use this action to evaluate SQL queries stored in Amazon S3.
     * </p>
     *
     * @param evaluateExpressionRequest Container for the necessary
     *           parameters to execute the EvaluateExpression operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EvaluateExpression service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EvaluateExpressionResult> evaluateExpressionAsync(
            final EvaluateExpressionRequest evaluateExpressionRequest,
            final AsyncHandler<EvaluateExpressionRequest, EvaluateExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EvaluateExpressionResult>() {
            public EvaluateExpressionResult call() throws Exception {
            	EvaluateExpressionResult result;
                try {
            		result = evaluateExpression(evaluateExpressionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(evaluateExpressionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Retrieve metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines you have
     * read permission for.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call the GetPipelineDefinition action.
     * </p>
     *
     * @param describePipelinesRequest Container for the necessary parameters
     *           to execute the DescribePipelines operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePipelinesResult> describePipelinesAsync(final DescribePipelinesRequest describePipelinesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePipelinesResult>() {
            public DescribePipelinesResult call() throws Exception {
                return describePipelines(describePipelinesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Retrieve metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines you have
     * read permission for.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call the GetPipelineDefinition action.
     * </p>
     *
     * @param describePipelinesRequest Container for the necessary parameters
     *           to execute the DescribePipelines operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePipelinesResult> describePipelinesAsync(
            final DescribePipelinesRequest describePipelinesRequest,
            final AsyncHandler<DescribePipelinesRequest, DescribePipelinesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePipelinesResult>() {
            public DescribePipelinesResult call() throws Exception {
            	DescribePipelinesResult result;
                try {
            		result = describePipelines(describePipelinesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describePipelinesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new empty pipeline. When this action succeeds, you can then
     * use the PutPipelineDefinition action to populate the pipeline.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
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
     * Creates a new empty pipeline. When this action succeeds, you can then
     * use the PutPipelineDefinition action to populate the pipeline.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
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
     * Returns the object definitions for a set of objects associated with
     * the pipeline. Object definitions are composed of a set of fields that
     * define the properties of the object.
     * </p>
     *
     * @param describeObjectsRequest Container for the necessary parameters
     *           to execute the DescribeObjects operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeObjectsResult> describeObjectsAsync(final DescribeObjectsRequest describeObjectsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeObjectsResult>() {
            public DescribeObjectsResult call() throws Exception {
                return describeObjects(describeObjectsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the object definitions for a set of objects associated with
     * the pipeline. Object definitions are composed of a set of fields that
     * define the properties of the object.
     * </p>
     *
     * @param describeObjectsRequest Container for the necessary parameters
     *           to execute the DescribeObjects operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeObjectsResult> describeObjectsAsync(
            final DescribeObjectsRequest describeObjectsRequest,
            final AsyncHandler<DescribeObjectsRequest, DescribeObjectsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeObjectsResult>() {
            public DescribeObjectsResult call() throws Exception {
            	DescribeObjectsResult result;
                try {
            		result = describeObjects(describeObjectsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeObjectsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to
     * indicate that they are operational. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the
     * web service can use this call to detect when the task runner
     * application has failed and restart a new instance.
     * </p>
     *
     * @param reportTaskRunnerHeartbeatRequest Container for the necessary
     *           parameters to execute the ReportTaskRunnerHeartbeat operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskRunnerHeartbeat service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(final ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReportTaskRunnerHeartbeatResult>() {
            public ReportTaskRunnerHeartbeatResult call() throws Exception {
                return reportTaskRunnerHeartbeat(reportTaskRunnerHeartbeatRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to
     * indicate that they are operational. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the
     * web service can use this call to detect when the task runner
     * application has failed and restart a new instance.
     * </p>
     *
     * @param reportTaskRunnerHeartbeatRequest Container for the necessary
     *           parameters to execute the ReportTaskRunnerHeartbeat operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskRunnerHeartbeat service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(
            final ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest,
            final AsyncHandler<ReportTaskRunnerHeartbeatRequest, ReportTaskRunnerHeartbeatResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReportTaskRunnerHeartbeatResult>() {
            public ReportTaskRunnerHeartbeatResult call() throws Exception {
            	ReportTaskRunnerHeartbeatResult result;
                try {
            		result = reportTaskRunnerHeartbeat(reportTaskRunnerHeartbeatRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(reportTaskRunnerHeartbeatRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Adds tasks, schedules, and preconditions that control the behavior of
     * the pipeline. You can use PutPipelineDefinition to populate a new
     * pipeline or to update an existing pipeline that has not yet been
     * activated.
     * </p>
     * <p>
     * PutPipelineDefinition also validates the configuration as it adds it
     * to the pipeline. Changes to the pipeline are saved unless one of the
     * following three validation errors exists in the pipeline. <ol> <li>An
     * object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * </ol>
     * </p>
     * <p>
     * Pipeline object definitions are passed to the PutPipelineDefinition
     * action and returned by the GetPipelineDefinition action.
     * </p>
     *
     * @param putPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the PutPipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         PutPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(final PutPipelineDefinitionRequest putPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutPipelineDefinitionResult>() {
            public PutPipelineDefinitionResult call() throws Exception {
                return putPipelineDefinition(putPipelineDefinitionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Adds tasks, schedules, and preconditions that control the behavior of
     * the pipeline. You can use PutPipelineDefinition to populate a new
     * pipeline or to update an existing pipeline that has not yet been
     * activated.
     * </p>
     * <p>
     * PutPipelineDefinition also validates the configuration as it adds it
     * to the pipeline. Changes to the pipeline are saved unless one of the
     * following three validation errors exists in the pipeline. <ol> <li>An
     * object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * </ol>
     * </p>
     * <p>
     * Pipeline object definitions are passed to the PutPipelineDefinition
     * action and returned by the GetPipelineDefinition action.
     * </p>
     *
     * @param putPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the PutPipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(
            final PutPipelineDefinitionRequest putPipelineDefinitionRequest,
            final AsyncHandler<PutPipelineDefinitionRequest, PutPipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutPipelineDefinitionResult>() {
            public PutPipelineDefinitionResult call() throws Exception {
            	PutPipelineDefinitionResult result;
                try {
            		result = putPipelineDefinition(putPipelineDefinitionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(putPipelineDefinitionRequest, result);
               	return result;
		    }
		});
    }
    
}
        