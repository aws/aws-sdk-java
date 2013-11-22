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
package com.amazonaws.services.simpleworkflow;

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

import com.amazonaws.services.simpleworkflow.model.*;


/**
 * Asynchronous client for accessing AmazonSimpleWorkflow.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Simple Workflow Service <p>
 * The Amazon Simple Workflow Service API Reference is intended for programmers who need detailed information about the Amazon SWF actions and data
 * types.
 * </p>
 * <p>
 * For an broader overview of the Amazon SWF programming model, please go to the <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/">
 * Amazon SWF Developer Guide </a> .
 * </p>
 * <p>
 * This section provides an overview of Amazon SWF actions.
 * </p>
 * <p>
 * <b>Action Categories</b>
 * </p>
 * <p>
 * The Amazon SWF actions can be grouped into the following major categories.
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Actions related to Activities
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Deciders
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Workflow Executions
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Administration
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Visibility
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Activities</b>
 * </p>
 * <p>
 * The following are actions that are performed by activity workers:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForActivityTask
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCompleted
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskFailed
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCanceled
 * </p>
 * </li>
 * <li> <p>
 * RecordActivityTaskHeartbeat
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Activity workers use the PollForActivityTask to get new activity tasks. After a worker receives an activity task from Amazon SWF, it performs the task
 * and responds using RespondActivityTaskCompleted if successful or RespondActivityTaskFailed if unsuccessful.
 * </p>
 * <p>
 * <b>Actions related to Deciders</b>
 * </p>
 * <p>
 * The following are actions that are performed by deciders:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForDecisionTask
 * </p>
 * </li>
 * <li> <p>
 * RespondDecisionTaskCompleted
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Deciders use PollForDecisionTask to get decision tasks. After a decider receives a decision task from Amazon SWF, it examines its workflow execution
 * history and decides what to do next. It calls RespondDecisionTaskCompletedto complete the decision task and provide zero or more next decisions.
 * </p>
 * <p>
 * <b>Actions related to Workflow Executions</b>
 * </p>
 * <p>
 * The following actions operate on a workflow execution:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * StartWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * SignalWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Administration</b>
 * </p>
 * <p>
 * Although you can perform administrative tasks from the Amazon SWF console, you can use the actions in this section to automate functions or build your
 * own administrative tools.
 * </p>
 * <p>
 * <b>Activity Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterActivityType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateActivityType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterWorkflowType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterDomain
 * </p>
 * </li>
 * <li> <p>
 * DeprecateDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Visibility Actions</b>
 * </p>
 * <p>
 * Although you can perform visibility actions from the Amazon SWF console, you can use the actions in this section to build your own console or
 * administrative tools.
 * </p>
 * 
 * <ul>
 * 
 * </ul>
 * <p>
 * <b>Activity Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListActivityTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeActivity
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListWorkflowTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * DescribeWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * ListOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * ListClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * GetWorkflowExecutionHistory
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListDomains
 * </p>
 * </li>
 * <li> <p>
 * DescribeDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Task List Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * CountPendingActivityTasks
 * </p>
 * </li>
 * <li> <p>
 * CountPendingDecisionTasks
 * </p>
 * </li>
 * 
 * </ul>
 */
public class AmazonSimpleWorkflowAsyncClient extends AmazonSimpleWorkflowClient
        implements AmazonSimpleWorkflowAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow.  A credentials provider chain will be used
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
    public AmazonSimpleWorkflowAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow.  A credentials provider chain will be used
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
     *                       client connects to AmazonSimpleWorkflow
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleWorkflowAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials.
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials,
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials provider.
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials provider
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials
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
    public AmazonSimpleWorkflowAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Deprecates the specified <i>workflow type</i> . After a workflow type
     * has been deprecated, you cannot create new executions of that type.
     * Executions that were started before the type was deprecated will
     * continue to run. A deprecated workflow type may still be used when
     * calling visibility actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DeprecateWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateWorkflowTypeAsync(final DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deprecateWorkflowType(deprecateWorkflowTypeRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deprecates the specified <i>workflow type</i> . After a workflow type
     * has been deprecated, you cannot create new executions of that type.
     * Executions that were started before the type was deprecated will
     * continue to run. A deprecated workflow type may still be used when
     * calling visibility actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DeprecateWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateWorkflowTypeAsync(
            final DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest,
            final AsyncHandler<DeprecateWorkflowTypeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deprecateWorkflowType(deprecateWorkflowTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deprecateWorkflowTypeRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated
     * it cannot be used to create new workflow executions or register new
     * types. However, you can still use visibility actions on this domain.
     * Deprecating a domain also deprecates all activity and workflow types
     * registered in the domain. Executions that were started before the
     * domain was deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateDomainRequest Container for the necessary parameters
     *           to execute the DeprecateDomain operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateDomainAsync(final DeprecateDomainRequest deprecateDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deprecateDomain(deprecateDomainRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated
     * it cannot be used to create new workflow executions or register new
     * types. However, you can still use visibility actions on this domain.
     * Deprecating a domain also deprecates all activity and workflow types
     * registered in the domain. Executions that were started before the
     * domain was deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateDomainRequest Container for the necessary parameters
     *           to execute the DeprecateDomain operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateDomainAsync(
            final DeprecateDomainRequest deprecateDomainRequest,
            final AsyncHandler<DeprecateDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deprecateDomain(deprecateDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deprecateDomainRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings
     * in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the
     * RegisterDomain action.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the type already exists, then a TypeAlreadyExists
     * fault is returned. You cannot change the configuration settings of a
     * workflow type once it is registered and it must be registered as a new
     * version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param registerWorkflowTypeRequest Container for the necessary
     *           parameters to execute the RegisterWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerWorkflowTypeAsync(final RegisterWorkflowTypeRequest registerWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                registerWorkflowType(registerWorkflowTypeRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings
     * in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the
     * RegisterDomain action.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the type already exists, then a TypeAlreadyExists
     * fault is returned. You cannot change the configuration settings of a
     * workflow type once it is registered and it must be registered as a new
     * version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param registerWorkflowTypeRequest Container for the necessary
     *           parameters to execute the RegisterWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerWorkflowTypeAsync(
            final RegisterWorkflowTypeRequest registerWorkflowTypeRequest,
            final AsyncHandler<RegisterWorkflowTypeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		registerWorkflowType(registerWorkflowTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(registerWorkflowTypeRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about workflow types in the specified domain. The
     * results may be split into multiple pages that can be retrieved by
     * making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listWorkflowTypesRequest Container for the necessary parameters
     *           to execute the ListWorkflowTypes operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         ListWorkflowTypes service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowTypeInfos> listWorkflowTypesAsync(final ListWorkflowTypesRequest listWorkflowTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowTypeInfos>() {
            public WorkflowTypeInfos call() throws Exception {
                return listWorkflowTypes(listWorkflowTypesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about workflow types in the specified domain. The
     * results may be split into multiple pages that can be retrieved by
     * making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listWorkflowTypesRequest Container for the necessary parameters
     *           to execute the ListWorkflowTypes operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListWorkflowTypes service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowTypeInfos> listWorkflowTypesAsync(
            final ListWorkflowTypesRequest listWorkflowTypesRequest,
            final AsyncHandler<ListWorkflowTypesRequest, WorkflowTypeInfos> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowTypeInfos>() {
            public WorkflowTypeInfos call() throws Exception {
            	WorkflowTypeInfos result;
                try {
            		result = listWorkflowTypes(listWorkflowTypesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listWorkflowTypesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain
     * using the provided <code>workflowId</code> and input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tagList.member.0</code> : The key is
     * <code>swf:tagList.member.0</code> .</li>
     * <li> <code>tagList.member.1</code> : The key is
     * <code>swf:tagList.member.1</code> .</li>
     * <li> <code>tagList.member.2</code> : The key is
     * <code>swf:tagList.member.2</code> .</li>
     * <li> <code>tagList.member.3</code> : The key is
     * <code>swf:tagList.member.3</code> .</li>
     * <li> <code>tagList.member.4</code> : The key is
     * <code>swf:tagList.member.4</code> .</li>
     * <li> <code>taskList</code> : String constraint. The key is
     * <code>swf:taskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param startWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the StartWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         StartWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Run> startWorkflowExecutionAsync(final StartWorkflowExecutionRequest startWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Run>() {
            public Run call() throws Exception {
                return startWorkflowExecution(startWorkflowExecutionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain
     * using the provided <code>workflowId</code> and input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tagList.member.0</code> : The key is
     * <code>swf:tagList.member.0</code> .</li>
     * <li> <code>tagList.member.1</code> : The key is
     * <code>swf:tagList.member.1</code> .</li>
     * <li> <code>tagList.member.2</code> : The key is
     * <code>swf:tagList.member.2</code> .</li>
     * <li> <code>tagList.member.3</code> : The key is
     * <code>swf:tagList.member.3</code> .</li>
     * <li> <code>tagList.member.4</code> : The key is
     * <code>swf:tagList.member.4</code> .</li>
     * <li> <code>taskList</code> : String constraint. The key is
     * <code>swf:taskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param startWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the StartWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Run> startWorkflowExecutionAsync(
            final StartWorkflowExecutionRequest startWorkflowExecutionRequest,
            final AsyncHandler<StartWorkflowExecutionRequest, Run> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Run>() {
            public Run call() throws Exception {
            	Run result;
                try {
            		result = startWorkflowExecution(startWorkflowExecutionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(startWorkflowExecutionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the
     * workflow execution history and creates a decision task for the
     * workflow execution identified by the given domain, workflowId and
     * runId. The event is recorded with the specified user defined
     * signalName and input (if provided).
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionSignaled event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> If the specified workflow execution is not open, this
     * method fails with UnknownResource.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param signalWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the SignalWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         SignalWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> signalWorkflowExecutionAsync(final SignalWorkflowExecutionRequest signalWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                signalWorkflowExecution(signalWorkflowExecutionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the
     * workflow execution history and creates a decision task for the
     * workflow execution identified by the given domain, workflowId and
     * runId. The event is recorded with the specified user defined
     * signalName and input (if provided).
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionSignaled event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> If the specified workflow execution is not open, this
     * method fails with UnknownResource.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param signalWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the SignalWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SignalWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> signalWorkflowExecutionAsync(
            final SignalWorkflowExecutionRequest signalWorkflowExecutionRequest,
            final AsyncHandler<SignalWorkflowExecutionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		signalWorkflowExecution(signalWorkflowExecutionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(signalWorkflowExecutionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the list of domains registered in the account. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains. The element must be set to
     * <code>arn:aws:swf::AccountID:domain/*"</code> , where ???AccountID" is
     * the account ID, with no dashes.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainInfos> listDomainsAsync(final ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainInfos>() {
            public DomainInfos call() throws Exception {
                return listDomains(listDomainsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the list of domains registered in the account. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains. The element must be set to
     * <code>arn:aws:swf::AccountID:domain/*"</code> , where ???AccountID" is
     * the account ID, with no dashes.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainInfos> listDomainsAsync(
            final ListDomainsRequest listDomainsRequest,
            final AsyncHandler<ListDomainsRequest, DomainInfos> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainInfos>() {
            public DomainInfos call() throws Exception {
            	DomainInfos result;
                try {
            		result = listDomains(listDomainsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listDomainsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the
     * currently running workflow execution identified by the given domain,
     * workflowId, and runId. This logically requests the cancellation of the
     * workflow execution as a whole. It is up to the decider to take
     * appropriate actions when it receives an execution history with this
     * event.
     * </p>
     * <p>
     * <b>NOTE:</b> If the runId is not specified, the
     * WorkflowExecutionCancelRequested event is recorded in the history of
     * the current open workflow execution with the specified workflowId in
     * the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> Because this action allows the workflow to properly clean
     * up and gracefully close, it should be used instead of
     * TerminateWorkflowExecution when possible.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param requestCancelWorkflowExecutionRequest Container for the
     *           necessary parameters to execute the RequestCancelWorkflowExecution
     *           operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RequestCancelWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> requestCancelWorkflowExecutionAsync(final RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                requestCancelWorkflowExecution(requestCancelWorkflowExecutionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the
     * currently running workflow execution identified by the given domain,
     * workflowId, and runId. This logically requests the cancellation of the
     * workflow execution as a whole. It is up to the decider to take
     * appropriate actions when it receives an execution history with this
     * event.
     * </p>
     * <p>
     * <b>NOTE:</b> If the runId is not specified, the
     * WorkflowExecutionCancelRequested event is recorded in the history of
     * the current open workflow execution with the specified workflowId in
     * the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> Because this action allows the workflow to properly clean
     * up and gracefully close, it should be used instead of
     * TerminateWorkflowExecution when possible.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param requestCancelWorkflowExecutionRequest Container for the
     *           necessary parameters to execute the RequestCancelWorkflowExecution
     *           operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RequestCancelWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> requestCancelWorkflowExecutionAsync(
            final RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest,
            final AsyncHandler<RequestCancelWorkflowExecutionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		requestCancelWorkflowExecution(requestCancelWorkflowExecutionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(requestCancelWorkflowExecutionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified <i>workflow type</i> . This
     * includes configuration settings specified when the type was registered
     * and other information such as creation date, current status, etc.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowTypeDetail> describeWorkflowTypeAsync(final DescribeWorkflowTypeRequest describeWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowTypeDetail>() {
            public WorkflowTypeDetail call() throws Exception {
                return describeWorkflowType(describeWorkflowTypeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified <i>workflow type</i> . This
     * includes configuration settings specified when the type was registered
     * and other information such as creation date, current status, etc.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkflowType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowTypeDetail> describeWorkflowTypeAsync(
            final DescribeWorkflowTypeRequest describeWorkflowTypeRequest,
            final AsyncHandler<DescribeWorkflowTypeRequest, WorkflowTypeDetail> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowTypeDetail>() {
            public WorkflowTypeDetail call() throws Exception {
            	WorkflowTypeDetail result;
                try {
            		result = describeWorkflowType(describeWorkflowTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeWorkflowTypeRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deprecates the specified <i>activity type</i> .
     * After an activity type has been deprecated, you cannot create
     * new tasks of that activity type. Tasks of this type that were
     * scheduled before the type was deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateActivityTypeRequest Container for the necessary
     *           parameters to execute the DeprecateActivityType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateActivityTypeAsync(final DeprecateActivityTypeRequest deprecateActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deprecateActivityType(deprecateActivityTypeRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deprecates the specified <i>activity type</i> .
     * After an activity type has been deprecated, you cannot create
     * new tasks of that activity type. Tasks of this type that were
     * scheduled before the type was deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param deprecateActivityTypeRequest Container for the necessary
     *           parameters to execute the DeprecateActivityType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeprecateActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deprecateActivityTypeAsync(
            final DeprecateActivityTypeRequest deprecateActivityTypeRequest,
            final AsyncHandler<DeprecateActivityTypeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deprecateActivityType(deprecateActivityTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deprecateActivityTypeRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the number of closed workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countClosedWorkflowExecutionsRequest Container for the
     *           necessary parameters to execute the CountClosedWorkflowExecutions
     *           operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         CountClosedWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(final CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionCount>() {
            public WorkflowExecutionCount call() throws Exception {
                return countClosedWorkflowExecutions(countClosedWorkflowExecutionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the number of closed workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countClosedWorkflowExecutionsRequest Container for the
     *           necessary parameters to execute the CountClosedWorkflowExecutions
     *           operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CountClosedWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(
            final CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest,
            final AsyncHandler<CountClosedWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionCount>() {
            public WorkflowExecutionCount call() throws Exception {
            	WorkflowExecutionCount result;
                try {
            		result = countClosedWorkflowExecutions(countClosedWorkflowExecutionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(countClosedWorkflowExecutionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no activity task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countPendingActivityTasksRequest Container for the necessary
     *           parameters to execute the CountPendingActivityTasks operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         CountPendingActivityTasks service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PendingTaskCount> countPendingActivityTasksAsync(final CountPendingActivityTasksRequest countPendingActivityTasksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PendingTaskCount>() {
            public PendingTaskCount call() throws Exception {
                return countPendingActivityTasks(countPendingActivityTasksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no activity task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countPendingActivityTasksRequest Container for the necessary
     *           parameters to execute the CountPendingActivityTasks operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CountPendingActivityTasks service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PendingTaskCount> countPendingActivityTasksAsync(
            final CountPendingActivityTasksRequest countPendingActivityTasksRequest,
            final AsyncHandler<CountPendingActivityTasksRequest, PendingTaskCount> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PendingTaskCount>() {
            public PendingTaskCount call() throws Exception {
            	PendingTaskCount result;
                try {
            		result = countPendingActivityTasks(countPendingActivityTasksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(countPendingActivityTasksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> was successfully canceled. Additional
     * <code>details</code> can be optionally provided using the
     * <code>details</code> argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the
     * <code>ActivityTaskCanceled</code> event added to the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Only use this operation if the canceled flag of a
     * RecordActivityTaskHeartbeat request returns true and if the activity
     * can be safely undone or abandoned.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskCanceledRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCanceled operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskCanceled service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskCanceledAsync(final RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                respondActivityTaskCanceled(respondActivityTaskCanceledRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> was successfully canceled. Additional
     * <code>details</code> can be optionally provided using the
     * <code>details</code> argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the
     * <code>ActivityTaskCanceled</code> event added to the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Only use this operation if the canceled flag of a
     * RecordActivityTaskHeartbeat request returns true and if the activity
     * can be safely undone or abandoned.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskCanceledRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCanceled operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskCanceled service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskCanceledAsync(
            final RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest,
            final AsyncHandler<RespondActivityTaskCanceledRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		respondActivityTaskCanceled(respondActivityTaskCanceledRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(respondActivityTaskCanceledRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Used by deciders to tell the service that the DecisionTask identified
     * by the <code>taskToken</code> has successfully completed. The
     * <code>decisions</code> argument specifies the list of decisions made
     * while processing the task.
     * </p>
     * <p>
     * A
     * <code>DecisionTaskCompleted</code> event is added
     * to the workflow history. The <code>executionContext</code> specified
     * is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use
     * <code>RespondDecisionTaskCompleted</code> , it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter in
     * the same way as for the regular API. This approach maintains a uniform
     * conceptual model and helps keep policies readable. For more
     * information, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondDecisionTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondDecisionTaskCompleted operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RespondDecisionTaskCompleted service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondDecisionTaskCompletedAsync(final RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                respondDecisionTaskCompleted(respondDecisionTaskCompletedRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Used by deciders to tell the service that the DecisionTask identified
     * by the <code>taskToken</code> has successfully completed. The
     * <code>decisions</code> argument specifies the list of decisions made
     * while processing the task.
     * </p>
     * <p>
     * A
     * <code>DecisionTaskCompleted</code> event is added
     * to the workflow history. The <code>executionContext</code> specified
     * is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use
     * <code>RespondDecisionTaskCompleted</code> , it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter in
     * the same way as for the regular API. This approach maintains a uniform
     * conceptual model and helps keep policies readable. For more
     * information, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondDecisionTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondDecisionTaskCompleted operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RespondDecisionTaskCompleted service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondDecisionTaskCompletedAsync(
            final RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest,
            final AsyncHandler<RespondDecisionTaskCompletedRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		respondDecisionTaskCompleted(respondDecisionTaskCompletedRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(respondDecisionTaskCompletedRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> completed successfully with a
     * <code>result</code> (if provided). The <code>result</code> appears in
     * the <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the requested task does not complete
     * successfully, use RespondActivityTaskFailed instead. If the worker
     * finds that the task is canceled through the canceled flag returned by
     * RecordActivityTaskHeartbeat, it should cancel the task, clean up and
     * then call RespondActivityTaskCanceled.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCompleted operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskCompleted service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskCompletedAsync(final RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                respondActivityTaskCompleted(respondActivityTaskCompletedRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> completed successfully with a
     * <code>result</code> (if provided). The <code>result</code> appears in
     * the <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the requested task does not complete
     * successfully, use RespondActivityTaskFailed instead. If the worker
     * finds that the task is canceled through the canceled flag returned by
     * RecordActivityTaskHeartbeat, it should cancel the task, clean up and
     * then call RespondActivityTaskCanceled.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCompleted operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskCompleted service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskCompletedAsync(
            final RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest,
            final AsyncHandler<RespondActivityTaskCompletedRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		respondActivityTaskCompleted(respondActivityTaskCompletedRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(respondActivityTaskCompletedRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Used by workers to get an ActivityTask from the specified activity
     * <code>taskList</code> .
     * This initiates a long poll, where the service holds the HTTP
     * connection open and responds as soon as a task becomes available. The
     * maximum time the service holds on to the request before responding is
     * 60 seconds. If no task is available within 60 seconds, the poll will
     * return an empty result. An empty result, in this context, means that
     * an ActivityTask is returned, but that the value of taskToken is an
     * empty string. If a task is returned, the worker should use its type to
     * identify and process it correctly.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Workers should set their client side socket timeout
     * to at least 70 seconds (10 seconds higher than the maximum time
     * service may hold the poll request).
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param pollForActivityTaskRequest Container for the necessary
     *           parameters to execute the PollForActivityTask operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         PollForActivityTask service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTask> pollForActivityTaskAsync(final PollForActivityTaskRequest pollForActivityTaskRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTask>() {
            public ActivityTask call() throws Exception {
                return pollForActivityTask(pollForActivityTaskRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Used by workers to get an ActivityTask from the specified activity
     * <code>taskList</code> .
     * This initiates a long poll, where the service holds the HTTP
     * connection open and responds as soon as a task becomes available. The
     * maximum time the service holds on to the request before responding is
     * 60 seconds. If no task is available within 60 seconds, the poll will
     * return an empty result. An empty result, in this context, means that
     * an ActivityTask is returned, but that the value of taskToken is an
     * empty string. If a task is returned, the worker should use its type to
     * identify and process it correctly.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Workers should set their client side socket timeout
     * to at least 70 seconds (10 seconds higher than the maximum time
     * service may hold the poll request).
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param pollForActivityTaskRequest Container for the necessary
     *           parameters to execute the PollForActivityTask operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PollForActivityTask service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTask> pollForActivityTaskAsync(
            final PollForActivityTaskRequest pollForActivityTaskRequest,
            final AsyncHandler<PollForActivityTaskRequest, ActivityTask> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTask>() {
            public ActivityTask call() throws Exception {
            	ActivityTask result;
                try {
            		result = pollForActivityTask(pollForActivityTaskRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(pollForActivityTaskRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the number of open workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the CountOpenWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         CountOpenWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(final CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionCount>() {
            public WorkflowExecutionCount call() throws Exception {
                return countOpenWorkflowExecutions(countOpenWorkflowExecutionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the number of open workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the CountOpenWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CountOpenWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(
            final CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest,
            final AsyncHandler<CountOpenWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionCount>() {
            public WorkflowExecutionCount call() throws Exception {
            	WorkflowExecutionCount result;
                try {
            		result = countOpenWorkflowExecutions(countOpenWorkflowExecutionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(countOpenWorkflowExecutionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified activity type. This includes
     * configuration settings provided at registration time as well as other
     * general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeActivityTypeRequest Container for the necessary
     *           parameters to execute the DescribeActivityType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTypeDetail> describeActivityTypeAsync(final DescribeActivityTypeRequest describeActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTypeDetail>() {
            public ActivityTypeDetail call() throws Exception {
                return describeActivityType(describeActivityTypeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified activity type. This includes
     * configuration settings provided at registration time as well as other
     * general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeActivityTypeRequest Container for the necessary
     *           parameters to execute the DescribeActivityType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTypeDetail> describeActivityTypeAsync(
            final DescribeActivityTypeRequest describeActivityTypeRequest,
            final AsyncHandler<DescribeActivityTypeRequest, ActivityTypeDetail> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTypeDetail>() {
            public ActivityTypeDetail call() throws Exception {
            	ActivityTypeDetail result;
                try {
            		result = describeActivityType(describeActivityTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeActivityTypeRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListOpenWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         ListOpenWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(final ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionInfos>() {
            public WorkflowExecutionInfos call() throws Exception {
                return listOpenWorkflowExecutions(listOpenWorkflowExecutionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListOpenWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListOpenWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(
            final ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest,
            final AsyncHandler<ListOpenWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionInfos>() {
            public WorkflowExecutionInfos call() throws Exception {
            	WorkflowExecutionInfos result;
                try {
            		result = listOpenWorkflowExecutions(listOpenWorkflowExecutionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listOpenWorkflowExecutionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the history of the specified workflow execution. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the <code>nextPageToken</code> returned by the
     * initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param getWorkflowExecutionHistoryRequest Container for the necessary
     *           parameters to execute the GetWorkflowExecutionHistory operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         GetWorkflowExecutionHistory service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<History> getWorkflowExecutionHistoryAsync(final GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<History>() {
            public History call() throws Exception {
                return getWorkflowExecutionHistory(getWorkflowExecutionHistoryRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the history of the specified workflow execution. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the <code>nextPageToken</code> returned by the
     * initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param getWorkflowExecutionHistoryRequest Container for the necessary
     *           parameters to execute the GetWorkflowExecutionHistory operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetWorkflowExecutionHistory service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<History> getWorkflowExecutionHistoryAsync(
            final GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest,
            final AsyncHandler<GetWorkflowExecutionHistoryRequest, History> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<History>() {
            public History call() throws Exception {
            	History result;
                try {
            		result = getWorkflowExecutionHistory(getWorkflowExecutionHistoryRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getWorkflowExecutionHistoryRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Registers a new domain.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>You cannot use an IAM policy to control domain access for this
     * action. The name of the domain being registered is available as the
     * resource of this action.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     * <p>
     * </p>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerDomainAsync(final RegisterDomainRequest registerDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                registerDomain(registerDomainRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Registers a new domain.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>You cannot use an IAM policy to control domain access for this
     * action. The name of the domain being registered is available as the
     * resource of this action.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     * <p>
     * </p>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerDomainAsync(
            final RegisterDomainRequest registerDomainRequest,
            final AsyncHandler<RegisterDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		registerDomain(registerDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(registerDomainRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration
     * settings in the specified domain.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> A TypeAlreadyExists fault is returned if the type
     * already exists in the domain. You cannot change any configuration
     * settings of the type after its registration, and it must be registered
     * as a new version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param registerActivityTypeRequest Container for the necessary
     *           parameters to execute the RegisterActivityType operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerActivityTypeAsync(final RegisterActivityTypeRequest registerActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                registerActivityType(registerActivityTypeRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration
     * settings in the specified domain.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> A TypeAlreadyExists fault is returned if the type
     * already exists in the domain. You cannot change any configuration
     * settings of the type after its registration, and it must be registered
     * as a new version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param registerActivityTypeRequest Container for the necessary
     *           parameters to execute the RegisterActivityType operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterActivityType service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerActivityTypeAsync(
            final RegisterActivityTypeRequest registerActivityTypeRequest,
            final AsyncHandler<RegisterActivityTypeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		registerActivityType(registerActivityTypeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(registerActivityTypeRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listClosedWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListClosedWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         ListClosedWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(final ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionInfos>() {
            public WorkflowExecutionInfos call() throws Exception {
                return listClosedWorkflowExecutions(listClosedWorkflowExecutionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listClosedWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListClosedWorkflowExecutions operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListClosedWorkflowExecutions service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(
            final ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest,
            final AsyncHandler<ListClosedWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionInfos>() {
            public WorkflowExecutionInfos call() throws Exception {
            	WorkflowExecutionInfos result;
                try {
            		result = listClosedWorkflowExecutions(listClosedWorkflowExecutionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listClosedWorkflowExecutionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Used by activity workers to report to the service that the
     * ActivityTask represented by the specified <code>taskToken</code> is
     * still making progress. The worker can also (optionally) specify
     * details of the progress, for example percent complete, using the
     * <code>details</code> parameter. This action can also be used by the
     * worker as a mechanism to check if cancellation is being requested for
     * the activity task. If a cancellation is being attempted for the
     * specified task, then the boolean <code>cancelRequested</code> flag
     * returned by the service is set to <code>true</code> .
     * 
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The
     * <code>taskHeartbeatTimeout</code> is specified in
     * RegisterActivityType.
     * </p>
     * <p>
     * This action does not in itself create an event in the workflow
     * execution history. However, if the task times out, the workflow
     * execution history will contain a <code>ActivityTaskTimedOut</code>
     * event that contains the information from the last heartbeat generated
     * by the activity worker.
     * </p>
     * <p>
     * <b>NOTE:</b> The taskStartToCloseTimeout of an activity type is the
     * maximum duration of an activity task, regardless of the number of
     * RecordActivityTaskHeartbeat requests received. The
     * taskStartToCloseTimeout is also specified in RegisterActivityType.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is only useful for long-lived activities
     * to report liveliness of the task and to determine if a cancellation is
     * being attempted.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the cancelRequested flag returns true, a
     * cancellation is being attempted. If the worker can cancel the
     * activity, it should respond with RespondActivityTaskCanceled.
     * Otherwise, it should ignore the cancellation request.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param recordActivityTaskHeartbeatRequest Container for the necessary
     *           parameters to execute the RecordActivityTaskHeartbeat operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RecordActivityTaskHeartbeat service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(final RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTaskStatus>() {
            public ActivityTaskStatus call() throws Exception {
                return recordActivityTaskHeartbeat(recordActivityTaskHeartbeatRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Used by activity workers to report to the service that the
     * ActivityTask represented by the specified <code>taskToken</code> is
     * still making progress. The worker can also (optionally) specify
     * details of the progress, for example percent complete, using the
     * <code>details</code> parameter. This action can also be used by the
     * worker as a mechanism to check if cancellation is being requested for
     * the activity task. If a cancellation is being attempted for the
     * specified task, then the boolean <code>cancelRequested</code> flag
     * returned by the service is set to <code>true</code> .
     * 
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The
     * <code>taskHeartbeatTimeout</code> is specified in
     * RegisterActivityType.
     * </p>
     * <p>
     * This action does not in itself create an event in the workflow
     * execution history. However, if the task times out, the workflow
     * execution history will contain a <code>ActivityTaskTimedOut</code>
     * event that contains the information from the last heartbeat generated
     * by the activity worker.
     * </p>
     * <p>
     * <b>NOTE:</b> The taskStartToCloseTimeout of an activity type is the
     * maximum duration of an activity task, regardless of the number of
     * RecordActivityTaskHeartbeat requests received. The
     * taskStartToCloseTimeout is also specified in RegisterActivityType.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is only useful for long-lived activities
     * to report liveliness of the task and to determine if a cancellation is
     * being attempted.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the cancelRequested flag returns true, a
     * cancellation is being attempted. If the worker can cancel the
     * activity, it should respond with RespondActivityTaskCanceled.
     * Otherwise, it should ignore the cancellation request.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param recordActivityTaskHeartbeatRequest Container for the necessary
     *           parameters to execute the RecordActivityTaskHeartbeat operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RecordActivityTaskHeartbeat service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(
            final RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest,
            final AsyncHandler<RecordActivityTaskHeartbeatRequest, ActivityTaskStatus> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTaskStatus>() {
            public ActivityTaskStatus call() throws Exception {
            	ActivityTaskStatus result;
                try {
            		result = recordActivityTaskHeartbeat(recordActivityTaskHeartbeatRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(recordActivityTaskHeartbeatRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Used by deciders to get a DecisionTask from the specified decision
     * <code>taskList</code> .
     * A decision task may be returned for any open workflow execution
     * that is using the specified task list. The task includes a paginated
     * view of the history of the workflow execution. The decider should use
     * the workflow type and the history to determine how to properly handle
     * the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP
     * connection open and responds as soon a task becomes available. If no
     * decision task is available in the specified task list before the
     * timeout of 60 seconds expires, an empty result is returned. An empty
     * result, in this context, means that a DecisionTask is returned, but
     * that the value of taskToken is an empty string.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deciders should set their client side socket timeout
     * to at least 70 seconds (10 seconds higher than the timeout).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the number of workflow history events for a
     * single workflow execution might be very large, the result returned
     * might be split up across a number of pages. To retrieve subsequent
     * pages, make additional calls to PollForDecisionTask using the
     * nextPageToken returned by the initial call. Note that you do not call
     * GetWorkflowExecutionHistory with this nextPageToken. Instead, call
     * PollForDecisionTask again.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param pollForDecisionTaskRequest Container for the necessary
     *           parameters to execute the PollForDecisionTask operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         PollForDecisionTask service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecisionTask> pollForDecisionTaskAsync(final PollForDecisionTaskRequest pollForDecisionTaskRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecisionTask>() {
            public DecisionTask call() throws Exception {
                return pollForDecisionTask(pollForDecisionTaskRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Used by deciders to get a DecisionTask from the specified decision
     * <code>taskList</code> .
     * A decision task may be returned for any open workflow execution
     * that is using the specified task list. The task includes a paginated
     * view of the history of the workflow execution. The decider should use
     * the workflow type and the history to determine how to properly handle
     * the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP
     * connection open and responds as soon a task becomes available. If no
     * decision task is available in the specified task list before the
     * timeout of 60 seconds expires, an empty result is returned. An empty
     * result, in this context, means that a DecisionTask is returned, but
     * that the value of taskToken is an empty string.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deciders should set their client side socket timeout
     * to at least 70 seconds (10 seconds higher than the timeout).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the number of workflow history events for a
     * single workflow execution might be very large, the result returned
     * might be split up across a number of pages. To retrieve subsequent
     * pages, make additional calls to PollForDecisionTask using the
     * nextPageToken returned by the initial call. Note that you do not call
     * GetWorkflowExecutionHistory with this nextPageToken. Instead, call
     * PollForDecisionTask again.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param pollForDecisionTaskRequest Container for the necessary
     *           parameters to execute the PollForDecisionTask operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PollForDecisionTask service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DecisionTask> pollForDecisionTaskAsync(
            final PollForDecisionTaskRequest pollForDecisionTaskRequest,
            final AsyncHandler<PollForDecisionTaskRequest, DecisionTask> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecisionTask>() {
            public DecisionTask call() throws Exception {
            	DecisionTask result;
                try {
            		result = pollForDecisionTask(pollForDecisionTaskRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(pollForDecisionTaskRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about all activities registered in the specified
     * domain that match the specified name and registration status. The
     * result includes information like creation date, current status of the
     * activity, etc. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listActivityTypesRequest Container for the necessary parameters
     *           to execute the ListActivityTypes operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         ListActivityTypes service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTypeInfos> listActivityTypesAsync(final ListActivityTypesRequest listActivityTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTypeInfos>() {
            public ActivityTypeInfos call() throws Exception {
                return listActivityTypes(listActivityTypesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about all activities registered in the specified
     * domain that match the specified name and registration status. The
     * result includes information like creation date, current status of the
     * activity, etc. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param listActivityTypesRequest Container for the necessary parameters
     *           to execute the ListActivityTypes operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListActivityTypes service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivityTypeInfos> listActivityTypesAsync(
            final ListActivityTypesRequest listActivityTypesRequest,
            final AsyncHandler<ListActivityTypesRequest, ActivityTypeInfos> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivityTypeInfos>() {
            public ActivityTypeInfos call() throws Exception {
            	ActivityTypeInfos result;
                try {
            		result = listActivityTypes(listActivityTypesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listActivityTypesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified domain including description
     * and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeDomainRequest Container for the necessary parameters to
     *           execute the DescribeDomain operation on AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainDetail> describeDomainAsync(final DescribeDomainRequest describeDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainDetail>() {
            public DomainDetail call() throws Exception {
                return describeDomain(describeDomainRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified domain including description
     * and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeDomainRequest Container for the necessary parameters to
     *           execute the DescribeDomain operation on AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomain service method, as returned by AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainDetail> describeDomainAsync(
            final DescribeDomainRequest describeDomainRequest,
            final AsyncHandler<DescribeDomainRequest, DomainDetail> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainDetail>() {
            public DomainDetail call() throws Exception {
            	DomainDetail result;
                try {
            		result = describeDomain(describeDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDomainRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> has failed with <code>reason</code> (if
     * specified). The <code>reason</code> and <code>details</code> appear in
     * the <code>ActivityTaskFailed</code> event added to the workflow
     * history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskFailedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskFailed operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskFailed service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskFailedAsync(final RespondActivityTaskFailedRequest respondActivityTaskFailedRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                respondActivityTaskFailed(respondActivityTaskFailedRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> has failed with <code>reason</code> (if
     * specified). The <code>reason</code> and <code>details</code> appear in
     * the <code>ActivityTaskFailed</code> event added to the workflow
     * history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has <a
     * zonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">
     * timed out </a> .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param respondActivityTaskFailedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskFailed operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RespondActivityTaskFailed service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> respondActivityTaskFailedAsync(
            final RespondActivityTaskFailedRequest respondActivityTaskFailedRequest,
            final AsyncHandler<RespondActivityTaskFailedRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		respondActivityTaskFailed(respondActivityTaskFailedRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(respondActivityTaskFailedRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no decision task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countPendingDecisionTasksRequest Container for the necessary
     *           parameters to execute the CountPendingDecisionTasks operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         CountPendingDecisionTasks service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PendingTaskCount> countPendingDecisionTasksAsync(final CountPendingDecisionTasksRequest countPendingDecisionTasksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PendingTaskCount>() {
            public PendingTaskCount call() throws Exception {
                return countPendingDecisionTasks(countPendingDecisionTasksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no decision task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param countPendingDecisionTasksRequest Container for the necessary
     *           parameters to execute the CountPendingDecisionTasks operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CountPendingDecisionTasks service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PendingTaskCount> countPendingDecisionTasksAsync(
            final CountPendingDecisionTasksRequest countPendingDecisionTasksRequest,
            final AsyncHandler<CountPendingDecisionTasksRequest, PendingTaskCount> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PendingTaskCount>() {
            public PendingTaskCount call() throws Exception {
            	PendingTaskCount result;
                try {
            		result = countPendingDecisionTasks(countPendingDecisionTasksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(countPendingDecisionTasksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces
     * closure of the workflow execution identified by the given domain,
     * runId, and workflowId. The child policy, registered with the workflow
     * type or specified when starting this execution, is applied to any open
     * child workflow executions of this workflow execution.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the identified workflow execution was in
     * progress, it is terminated immediately.
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionTerminated event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> You should consider using RequestCancelWorkflowExecution
     * action instead because it allows the workflow to gracefully close
     * while TerminateWorkflowExecution does not.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param terminateWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the TerminateWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateWorkflowExecutionAsync(final TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                terminateWorkflowExecution(terminateWorkflowExecutionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces
     * closure of the workflow execution identified by the given domain,
     * runId, and workflowId. The child policy, registered with the workflow
     * type or specified when starting this execution, is applied to any open
     * child workflow executions of this workflow execution.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the identified workflow execution was in
     * progress, it is terminated immediately.
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionTerminated event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> You should consider using RequestCancelWorkflowExecution
     * action instead because it allows the workflow to gracefully close
     * while TerminateWorkflowExecution does not.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param terminateWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the TerminateWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateWorkflowExecutionAsync(
            final TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest,
            final AsyncHandler<TerminateWorkflowExecutionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		terminateWorkflowExecution(terminateWorkflowExecutionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(terminateWorkflowExecutionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the specified workflow execution including
     * its type and some statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(final DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionDetail>() {
            public WorkflowExecutionDetail call() throws Exception {
                return describeWorkflowExecution(describeWorkflowExecutionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the specified workflow execution including
     * its type and some statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF
     * resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see <a
     * docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
     * Using IAM to Manage Access to Amazon SWF Workflows </a> .
     * </p>
     *
     * @param describeWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowExecution operation on
     *           AmazonSimpleWorkflow.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkflowExecution service method, as returned by
     *         AmazonSimpleWorkflow.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(
            final DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest,
            final AsyncHandler<DescribeWorkflowExecutionRequest, WorkflowExecutionDetail> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<WorkflowExecutionDetail>() {
            public WorkflowExecutionDetail call() throws Exception {
            	WorkflowExecutionDetail result;
                try {
            		result = describeWorkflowExecution(describeWorkflowExecutionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeWorkflowExecutionRequest, result);
               	return result;
		    }
		});
    }
    
}
        