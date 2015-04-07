/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Data Pipeline configures and manages a data-driven workflow called
 * a pipeline. AWS Data Pipeline handles the details of scheduling and
 * ensuring that data dependencies are met so that your application can
 * focus on processing the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner
 * called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as
 * performing database queries and running data analysis using Amazon
 * Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task
 * Runner as your task runner, or you can write your own task runner to
 * provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the
 * first set to create a pipeline and define data sources, schedules,
 * dependencies, and the transforms to be performed on the data. Use the
 * second set in your task runner application to receive the next task
 * ready for processing. The logic for performing the task, such as
 * querying the data, running data analysis, or converting the data from
 * one format to another, is contained within the task runner. The task
 * runner performs the task assigned to it by the web service, reporting
 * progress to the web service as it does so. When the task is done, the
 * task runner reports the final success or failure of the task to the
 * web service.
 * </p>
 */
public class DataPipelineAsyncClient extends DataPipelineClient
        implements DataPipelineAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

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
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * DataPipeline using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
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
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * Default client settings will be used, and a fixed size thread pool will be
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
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline
     * tasks. If the pipeline does not pass validation, activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a
     * component, such as a data source or script, call DeactivatePipeline.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline
     * and then activate it.
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
     * Validates the specified pipeline and starts processing pipeline
     * tasks. If the pipeline does not pass validation, activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a
     * component, such as a data source or script, call DeactivatePipeline.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline
     * and then activate it.
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
     * Lists the pipeline identifiers for all active pipelines that you have
     * permission to access.
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
     * Lists the pipeline identifiers for all active pipelines that you have
     * permission to access.
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
     * Task runners call <code>ReportTaskProgress</code> when assigned a
     * task to acknowledge that it has the task. If the web service does not
     * receive this acknowledgement within 2 minutes, it assigns the task in
     * a subsequent PollForTask call. After this initial acknowledgement, the
     * task runner only needs to report progress every 15 minutes to maintain
     * its ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data
     * Pipeline assumes that the task runner is unable to process the task
     * and reassigns the task in a subsequent response to PollForTask. Task
     * runners should call <code>ReportTaskProgress</code> every 60 seconds.
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
     * Task runners call <code>ReportTaskProgress</code> when assigned a
     * task to acknowledge that it has the task. If the web service does not
     * receive this acknowledgement within 2 minutes, it assigns the task in
     * a subsequent PollForTask call. After this initial acknowledgement, the
     * task runner only needs to report progress every 15 minutes to maintain
     * its ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data
     * Pipeline assumes that the task runner is unable to process the task
     * and reassigns the task in a subsequent response to PollForTask. Task
     * runners should call <code>ReportTaskProgress</code> every 60 seconds.
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
     * Task runners call <code>PollForTask</code> to receive a task to
     * perform from AWS Data Pipeline. The task runner specifies which tasks
     * it can perform by setting a value for the <code>workerGroup</code>
     * parameter. The task returned can come from any of the pipelines that
     * match the <code>workerGroup</code> value passed in by the task runner
     * and that was launched using the IAM user credentials specified by the
     * task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code>
     * returns a response immediately. If no tasks are available in the
     * queue, <code>PollForTask</code> uses long-polling and holds on to a
     * poll connection for up to a 90 seconds, during which time the first
     * newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task
     * runner should not call <code>PollForTask</code> again on the same
     * <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
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
     * Task runners call <code>PollForTask</code> to receive a task to
     * perform from AWS Data Pipeline. The task runner specifies which tasks
     * it can perform by setting a value for the <code>workerGroup</code>
     * parameter. The task returned can come from any of the pipelines that
     * match the <code>workerGroup</code> value passed in by the task runner
     * and that was launched using the IAM user credentials specified by the
     * task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code>
     * returns a response immediately. If no tasks are available in the
     * queue, <code>PollForTask</code> uses long-polling and holds on to a
     * poll connection for up to a 90 seconds, during which time the first
     * newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task
     * runner should not call <code>PollForTask</code> again on the same
     * <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
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
     * Validates the specified pipeline definition to ensure that it is well
     * formed and can be run without error.
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
     * Validates the specified pipeline definition to ensure that it is well
     * formed and can be run without error.
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
     * Queries the specified pipeline for the names of objects that match
     * the specified set of conditions.
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
     * Queries the specified pipeline for the names of objects that match
     * the specified set of conditions.
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
     * Requests that the status of the specified physical or logical
     * pipeline objects be updated in the specified pipeline. This update
     * might not occur immediately, but is eventually consistent. The status
     * that can be set depends on the type of object (for example, DataNode
     * or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns
     * <code>InvalidRequestException</code> .
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
     * Requests that the status of the specified physical or logical
     * pipeline objects be updated in the specified pipeline. This update
     * might not occur immediately, but is eventually consistent. The status
     * that can be set depends on the type of object (for example, DataNode
     * or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns
     * <code>InvalidRequestException</code> .
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
     * Deletes a pipeline, its pipeline definition, and its run history. AWS
     * Data Pipeline attempts to cancel instances associated with the
     * pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a
     * deleted pipeline. To temporarily pause a pipeline instead of deleting
     * it, call SetStatus with the status set to <code>PAUSE</code> on
     * individual components. Components that are paused by SetStatus can be
     * resumed.
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
     * Deletes a pipeline, its pipeline definition, and its run history. AWS
     * Data Pipeline attempts to cancel instances associated with the
     * pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a
     * deleted pipeline. To temporarily pause a pipeline instead of deleting
     * it, call SetStatus with the status set to <code>PAUSE</code> on
     * individual components. Components that are paused by SetStatus can be
     * resumed.
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
     * Deactivates the specified running pipeline. The pipeline is set to
     * the <code>DEACTIVATING</code> state until the deactivation process
     * completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use ActivatePipeline. By default,
     * the pipeline resumes from the last completed execution. Optionally,
     * you can specify the date and time to resume the pipeline.
     * </p>
     *
     * @param deactivatePipelineRequest Container for the necessary
     *           parameters to execute the DeactivatePipeline operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DeactivatePipeline service method, as returned by DataPipeline.
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
    public Future<DeactivatePipelineResult> deactivatePipelineAsync(final DeactivatePipelineRequest deactivatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeactivatePipelineResult>() {
            public DeactivatePipelineResult call() throws Exception {
                return deactivatePipeline(deactivatePipelineRequest);
        }
    });
    }

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to
     * the <code>DEACTIVATING</code> state until the deactivation process
     * completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use ActivatePipeline. By default,
     * the pipeline resumes from the last completed execution. Optionally,
     * you can specify the date and time to resume the pipeline.
     * </p>
     *
     * @param deactivatePipelineRequest Container for the necessary
     *           parameters to execute the DeactivatePipeline operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeactivatePipeline service method, as returned by DataPipeline.
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
    public Future<DeactivatePipelineResult> deactivatePipelineAsync(
            final DeactivatePipelineRequest deactivatePipelineRequest,
            final AsyncHandler<DeactivatePipelineRequest, DeactivatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeactivatePipelineResult>() {
            public DeactivatePipelineResult call() throws Exception {
              DeactivatePipelineResult result;
                try {
                result = deactivatePipeline(deactivatePipelineRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deactivatePipelineRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call
     * <code>GetPipelineDefinition</code> to retrieve the pipeline definition
     * that you provided using PutPipelineDefinition.
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
     * Gets the definition of the specified pipeline. You can call
     * <code>GetPipelineDefinition</code> to retrieve the pipeline definition
     * that you provided using PutPipelineDefinition.
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
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data
     * Pipeline that a task is completed and provide information about the
     * final status. A task runner makes this call regardless of whether the
     * task was sucessful. A task runner does not need to call
     * <code>SetTaskStatus</code> for tasks that are canceled by the web
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
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data
     * Pipeline that a task is completed and provide information about the
     * final status. A task runner makes this call regardless of whether the
     * task was sucessful. A task runner does not need to call
     * <code>SetTaskStatus</code> for tasks that are canceled by the web
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
     * Task runners call <code>EvaluateExpression</code> to evaluate a
     * string in the context of the specified object. For example, a task
     * runner can evaluate SQL queries stored in Amazon S3.
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
     * Task runners call <code>EvaluateExpression</code> to evaluate a
     * string in the context of the specified object. For example, a task
     * runner can evaluate SQL queries stored in Amazon S3.
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
     * Retrieves metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for
     * which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call GetPipelineDefinition.
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
     * Retrieves metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for
     * which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call GetPipelineDefinition.
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
     * Creates a new, empty pipeline. Use PutPipelineDefinition to populate
     * the pipeline.
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
     * Creates a new, empty pipeline. Use PutPipelineDefinition to populate
     * the pipeline.
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
     * Gets the object definitions for a set of objects associated with the
     * pipeline. Object definitions are composed of a set of fields that
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
     * Gets the object definitions for a set of objects associated with the
     * pipeline. Object definitions are composed of a set of fields that
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
     * Removes existing tags from the specified pipeline.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by DataPipeline.
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
    public Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
                return removeTags(removeTagsRequest);
        }
    });
    }

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by DataPipeline.
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
    public Future<RemoveTagsResult> removeTagsAsync(
            final RemoveTagsRequest removeTagsRequest,
            final AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
              RemoveTagsResult result;
                try {
                result = removeTags(removeTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(removeTagsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15
     * minutes to indicate that they are operational. If the AWS Data
     * Pipeline Task Runner is launched on a resource managed by AWS Data
     * Pipeline, the web service can use this call to detect when the task
     * runner application has failed and restart a new instance.
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
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15
     * minutes to indicate that they are operational. If the AWS Data
     * Pipeline Task Runner is launched on a resource managed by AWS Data
     * Pipeline, the web service can use this call to detect when the task
     * runner application has failed and restart a new instance.
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
     * Adds or modifies tags for the specified pipeline.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by DataPipeline.
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
    public Future<AddTagsResult> addTagsAsync(final AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
                return addTags(addTagsRequest);
        }
    });
    }

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by DataPipeline.
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
    public Future<AddTagsResult> addTagsAsync(
            final AddTagsRequest addTagsRequest,
            final AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
              AddTagsResult result;
                try {
                result = addTags(addTagsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(addTagsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline.
     * You can use <code>PutPipelineDefinition</code> to populate a new
     * pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration
     * as it adds it to the pipeline. Changes to the pipeline are saved
     * unless one of the following three validation errors exists in the
     * pipeline.
     * </p>
     * <ol> <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol> <p>
     * Pipeline object definitions are passed to the
     * <code>PutPipelineDefinition</code> action and returned by the
     * GetPipelineDefinition action.
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
     * Adds tasks, schedules, and preconditions to the specified pipeline.
     * You can use <code>PutPipelineDefinition</code> to populate a new
     * pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration
     * as it adds it to the pipeline. Changes to the pipeline are saved
     * unless one of the following three validation errors exists in the
     * pipeline.
     * </p>
     * <ol> <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol> <p>
     * Pipeline object definitions are passed to the
     * <code>PutPipelineDefinition</code> action and returned by the
     * GetPipelineDefinition action.
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
        