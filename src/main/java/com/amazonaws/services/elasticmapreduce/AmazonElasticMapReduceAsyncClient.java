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
package com.amazonaws.services.elasticmapreduce;

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

import com.amazonaws.services.elasticmapreduce.model.*;


/**
 * Asynchronous client for accessing AmazonElasticMapReduce.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * This is the <i>Amazon Elastic MapReduce API Reference</i> . This guide provides descriptions and samples of the Amazon Elastic MapReduce APIs.
 * </p>
 * <p>
 * Amazon Elastic MapReduce (Amazon EMR) is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis, machine learning, scientific
 * simulation, and data warehousing.
 * </p>
 */
public class AmazonElasticMapReduceAsyncClient extends AmazonElasticMapReduceClient
        implements AmazonElasticMapReduceAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce.  A credentials provider chain will be used
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
    public AmazonElasticMapReduceAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce.  A credentials provider chain will be used
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
     *                       client connects to AmazonElasticMapReduce
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticMapReduceAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials.
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials,
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials provider.
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials provider
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     *
     * @param listBootstrapActionsRequest Container for the necessary
     *           parameters to execute the ListBootstrapActions operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListBootstrapActions service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListBootstrapActionsResult> listBootstrapActionsAsync(final ListBootstrapActionsRequest listBootstrapActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListBootstrapActionsResult>() {
            public ListBootstrapActionsResult call() throws Exception {
                return listBootstrapActions(listBootstrapActionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     *
     * @param listBootstrapActionsRequest Container for the necessary
     *           parameters to execute the ListBootstrapActions operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListBootstrapActions service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListBootstrapActionsResult> listBootstrapActionsAsync(
            final ListBootstrapActionsRequest listBootstrapActionsRequest,
            final AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListBootstrapActionsResult>() {
            public ListBootstrapActionsResult call() throws Exception {
            	ListBootstrapActionsResult result;
                try {
            		result = listBootstrapActions(listBootstrapActionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listBootstrapActionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specified job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of
     * RunJobFlow. The SetVisibleToAllUsers action can be called only by an
     * IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     *
     * @param setVisibleToAllUsersRequest Container for the necessary
     *           parameters to execute the SetVisibleToAllUsers operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         SetVisibleToAllUsers service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setVisibleToAllUsersAsync(final SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setVisibleToAllUsers(setVisibleToAllUsersRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specified job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of
     * RunJobFlow. The SetVisibleToAllUsers action can be called only by an
     * IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     *
     * @param setVisibleToAllUsersRequest Container for the necessary
     *           parameters to execute the SetVisibleToAllUsers operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetVisibleToAllUsers service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setVisibleToAllUsersAsync(
            final SetVisibleToAllUsersRequest setVisibleToAllUsersRequest,
            final AsyncHandler<SetVisibleToAllUsersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setVisibleToAllUsers(setVisibleToAllUsersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setVisibleToAllUsersRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     *
     * @param listStepsRequest Container for the necessary parameters to
     *           execute the ListSteps operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStepsResult> listStepsAsync(final ListStepsRequest listStepsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStepsResult>() {
            public ListStepsResult call() throws Exception {
                return listSteps(listStepsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     *
     * @param listStepsRequest Container for the necessary parameters to
     *           execute the ListSteps operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStepsResult> listStepsAsync(
            final ListStepsRequest listStepsRequest,
            final AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStepsResult>() {
            public ListStepsResult call() throws Exception {
            	ListStepsResult result;
                try {
            		result = listSteps(listStepsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listStepsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of
     * 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         AddJobFlowSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddJobFlowStepsResult> addJobFlowStepsAsync(final AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddJobFlowStepsResult>() {
            public AddJobFlowStepsResult call() throws Exception {
                return addJobFlowSteps(addJobFlowStepsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of
     * 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddJobFlowSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddJobFlowStepsResult> addJobFlowStepsAsync(
            final AddJobFlowStepsRequest addJobFlowStepsRequest,
            final AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddJobFlowStepsResult>() {
            public AddJobFlowStepsResult call() throws Exception {
            	AddJobFlowStepsResult result;
                try {
            		result = addJobFlowSteps(addJobFlowStepsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addJobFlowStepsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     *
     * @param describeStepRequest Container for the necessary parameters to
     *           execute the DescribeStep operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStep service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStepResult> describeStepAsync(final DescribeStepRequest describeStepRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStepResult>() {
            public DescribeStepResult call() throws Exception {
                return describeStep(describeStepRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     *
     * @param describeStepRequest Container for the necessary parameters to
     *           execute the DescribeStep operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStep service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStepResult> describeStepAsync(
            final DescribeStepRequest describeStepRequest,
            final AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStepResult>() {
            public DescribeStepResult call() throws Exception {
            	DescribeStepResult result;
                try {
            		result = describeStep(describeStepRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStepRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account.
     * Allows you to filter the list of clusters based on certain criteria;
     * for example, filtering by cluster creation date and time or by status.
     * This call returns a maximum of 50 clusters per call, but returns a
     * marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(final ListClustersRequest listClustersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListClustersResult>() {
            public ListClustersResult call() throws Exception {
                return listClusters(listClustersRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account.
     * Allows you to filter the list of clusters based on certain criteria;
     * for example, filtering by cluster creation date and time or by status.
     * This call returns a maximum of 50 clusters per call, but returns a
     * marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(
            final ListClustersRequest listClustersRequest,
            final AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListClustersResult>() {
            public ListClustersResult call() throws Exception {
            	ListClustersResult result;
                try {
            		result = listClusters(listClustersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listClustersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     *
     * @param listInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ListInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstanceGroupsResult> listInstanceGroupsAsync(final ListInstanceGroupsRequest listInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceGroupsResult>() {
            public ListInstanceGroupsResult call() throws Exception {
                return listInstanceGroups(listInstanceGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     *
     * @param listInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ListInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstanceGroupsResult> listInstanceGroupsAsync(
            final ListInstanceGroupsRequest listInstanceGroupsRequest,
            final AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceGroupsResult>() {
            public ListInstanceGroupsResult call() throws Exception {
            	ListInstanceGroupsResult result;
                try {
            		result = listInstanceGroups(listInstanceGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listInstanceGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     *
     * @param modifyInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ModifyInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceGroupsAsync(final ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                modifyInstanceGroups(modifyInstanceGroupsRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     *
     * @param modifyInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ModifyInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceGroupsAsync(
            final ModifyInstanceGroupsRequest modifyInstanceGroupsRequest,
            final AsyncHandler<ModifyInstanceGroupsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		modifyInstanceGroups(modifyInstanceGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyInstanceGroupsRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For
     * example, this operation indicates when the EC2 instances reach the
     * Ready state, when instances become available to Amazon EMR to use for
     * jobs, and the IP addresses for cluster instances, etc.
     * </p>
     *
     * @param listInstancesRequest Container for the necessary parameters to
     *           execute the ListInstances operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest listInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstancesResult>() {
            public ListInstancesResult call() throws Exception {
                return listInstances(listInstancesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For
     * example, this operation indicates when the EC2 instances reach the
     * Ready state, when instances become available to Amazon EMR to use for
     * jobs, and the IP addresses for cluster instances, etc.
     * </p>
     *
     * @param listInstancesRequest Container for the necessary parameters to
     *           execute the ListInstances operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(
            final ListInstancesRequest listInstancesRequest,
            final AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstancesResult>() {
            public ListInstancesResult call() throws Exception {
            	ListInstancesResult result;
                try {
            		result = listInstances(listInstancesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listInstancesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         AddInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddInstanceGroupsResult> addInstanceGroupsAsync(final AddInstanceGroupsRequest addInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddInstanceGroupsResult>() {
            public AddInstanceGroupsResult call() throws Exception {
                return addInstanceGroups(addInstanceGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddInstanceGroupsResult> addInstanceGroupsAsync(
            final AddInstanceGroupsRequest addInstanceGroupsRequest,
            final AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddInstanceGroupsResult>() {
            public AddInstanceGroupsResult call() throws Exception {
            	AddInstanceGroupsResult result;
                try {
            		result = addInstanceGroups(addInstanceGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addInstanceGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     * <p>
     * The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 5-20 minutes for the
     * job flow to completely terminate and release allocated resources, such
     * as Amazon EC2 instances.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateJobFlowsAsync(final TerminateJobFlowsRequest terminateJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                terminateJobFlows(terminateJobFlowsRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     * <p>
     * The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 5-20 minutes for the
     * job flow to completely terminate and release allocated resources, such
     * as Amazon EC2 instances.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateJobFlowsAsync(
            final TerminateJobFlowsRequest terminateJobFlowsRequest,
            final AsyncHandler<TerminateJobFlowsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		terminateJobFlows(terminateJobFlowsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(terminateJobFlowsRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow
     * IDs, job flow states, and restrictions on job flow creation date and
     * time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the
     * last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    @Deprecated
    public Future<DescribeJobFlowsResult> describeJobFlowsAsync(final DescribeJobFlowsRequest describeJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeJobFlowsResult>() {
            public DescribeJobFlowsResult call() throws Exception {
                return describeJobFlows(describeJobFlowsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow
     * IDs, job flow states, and restrictions on job flow creation date and
     * time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the
     * last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            final DescribeJobFlowsRequest describeJobFlowsRequest,
            final AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeJobFlowsResult>() {
            public DescribeJobFlowsResult call() throws Exception {
            	DescribeJobFlowsResult result;
                try {
            		result = describeJobFlows(describeJobFlowsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeJobFlowsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call,
     * or in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * SetTerminationProtection on a job flow is analogous to calling the
     * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
     * cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of
     * a job flow and to ensure that in the event of an error, the instances
     * will persist so you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code> ,
     * you must first unlock the job flow by a subsequent call to
     * SetTerminationProtection in which you set the value to
     * <code>false</code> .
     * </p>
     * <p>
     * For more information, go to <a
     * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
     * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     *
     * @param setTerminationProtectionRequest Container for the necessary
     *           parameters to execute the SetTerminationProtection operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         SetTerminationProtection service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTerminationProtectionAsync(final SetTerminationProtectionRequest setTerminationProtectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTerminationProtection(setTerminationProtectionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call,
     * or in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * SetTerminationProtection on a job flow is analogous to calling the
     * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
     * cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of
     * a job flow and to ensure that in the event of an error, the instances
     * will persist so you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code> ,
     * you must first unlock the job flow by a subsequent call to
     * SetTerminationProtection in which you set the value to
     * <code>false</code> .
     * </p>
     * <p>
     * For more information, go to <a
     * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
     * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     *
     * @param setTerminationProtectionRequest Container for the necessary
     *           parameters to execute the SetTerminationProtection operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTerminationProtection service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTerminationProtectionAsync(
            final SetTerminationProtectionRequest setTerminationProtectionRequest,
            final AsyncHandler<SetTerminationProtectionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setTerminationProtection(setTerminationProtectionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setTerminationProtectionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the cluster
     * is stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3.
     * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code> , the job flow will transition
     * to the WAITING state rather than shutting down once the steps have
     * completed.
     * </p>
     * <p>
     * For additional protection, you can set the JobFlowInstancesConfig
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
     * lock the job flow and prevent it from being terminated by API call,
     * user intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         RunJobFlow service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunJobFlowResult> runJobFlowAsync(final RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RunJobFlowResult>() {
            public RunJobFlowResult call() throws Exception {
                return runJobFlow(runJobFlowRequest);
		    }
		});
    }

    
    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the cluster
     * is stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3.
     * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code> , the job flow will transition
     * to the WAITING state rather than shutting down once the steps have
     * completed.
     * </p>
     * <p>
     * For additional protection, you can set the JobFlowInstancesConfig
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
     * lock the job flow and prevent it from being terminated by API call,
     * user intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RunJobFlow service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunJobFlowResult> runJobFlowAsync(
            final RunJobFlowRequest runJobFlowRequest,
            final AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RunJobFlowResult>() {
            public RunJobFlowResult call() throws Exception {
            	RunJobFlowResult result;
                try {
            		result = runJobFlow(runJobFlowRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(runJobFlowRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     *
     * @param describeClusterRequest Container for the necessary parameters
     *           to execute the DescribeCluster operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCluster service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterResult> describeClusterAsync(final DescribeClusterRequest describeClusterRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterResult>() {
            public DescribeClusterResult call() throws Exception {
                return describeCluster(describeClusterRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     *
     * @param describeClusterRequest Container for the necessary parameters
     *           to execute the DescribeCluster operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCluster service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterResult> describeClusterAsync(
            final DescribeClusterRequest describeClusterRequest,
            final AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeClusterResult>() {
            public DescribeClusterResult call() throws Exception {
            	DescribeClusterResult result;
                try {
            		result = describeCluster(describeClusterRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeClusterRequest, result);
               	return result;
		    }
		});
    }
    
}
        