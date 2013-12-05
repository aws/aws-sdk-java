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

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.services.simpleworkflow.model.transform.*;


/**
 * Client for accessing AmazonSimpleWorkflow.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonSimpleWorkflowClient extends AmazonWebServiceClient implements AmazonSimpleWorkflow {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSimpleWorkflow.class);

    /**
     * List of exception unmarshallers for all AmazonSimpleWorkflow exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonSimpleWorkflowClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonSimpleWorkflowClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSimpleWorkflowClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSimpleWorkflow
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleWorkflowClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonSimpleWorkflowClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleWorkflow using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSimpleWorkflow
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleWorkflowClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DomainAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DomainDeprecatedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DefaultUndefinedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotPermittedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnknownResourceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new WorkflowExecutionAlreadyStartedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TypeDeprecatedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TypeAlreadyExistsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("swf.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpleworkflow/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpleworkflow/request.handler2s"));

        
        clientConfiguration = new ClientConfiguration(clientConfiguration);
        if (clientConfiguration.getMaxConnections() == ClientConfiguration.DEFAULT_MAX_CONNECTIONS) {
            log.debug("Overriding default max connection value to: " + 1000);
            clientConfiguration.setMaxConnections(1000);
        }
        if (clientConfiguration.getSocketTimeout() == ClientConfiguration.DEFAULT_SOCKET_TIMEOUT) {
            log.debug("Overriding default socket timeout value to: " + 90000);
            clientConfiguration.setSocketTimeout(90000);
        }
        setConfiguration(clientConfiguration);
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
     *           parameters to execute the DeprecateWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateWorkflowType(DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeprecateWorkflowTypeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeprecateWorkflowTypeRequestMarshaller().marshall(deprecateWorkflowTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           to execute the DeprecateDomain service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws DomainDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateDomain(DeprecateDomainRequest deprecateDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeprecateDomainRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeprecateDomainRequestMarshaller().marshall(deprecateDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the RegisterWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws TypeAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerWorkflowType(RegisterWorkflowTypeRequest registerWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RegisterWorkflowTypeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RegisterWorkflowTypeRequestMarshaller().marshall(registerWorkflowTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           to execute the ListWorkflowTypes service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListWorkflowTypes service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowTypeInfos listWorkflowTypes(ListWorkflowTypesRequest listWorkflowTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(listWorkflowTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowTypesRequest> request = null;
        Response<WorkflowTypeInfos> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowTypesRequestMarshaller().marshall(listWorkflowTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowTypeInfos, JsonUnmarshallerContext> unmarshaller = new WorkflowTypeInfosJsonUnmarshaller();
            JsonResponseHandler<WorkflowTypeInfos> responseHandler = new JsonResponseHandler<WorkflowTypeInfos>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the StartWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the StartWorkflowExecution service method,
     *         as returned by AmazonSimpleWorkflow.
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws DefaultUndefinedException
     * @throws UnknownResourceException
     * @throws WorkflowExecutionAlreadyStartedException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Run startWorkflowExecution(StartWorkflowExecutionRequest startWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(startWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkflowExecutionRequest> request = null;
        Response<Run> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkflowExecutionRequestMarshaller().marshall(startWorkflowExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<Run, JsonUnmarshallerContext> unmarshaller = new RunJsonUnmarshaller();
            JsonResponseHandler<Run> responseHandler = new JsonResponseHandler<Run>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the SignalWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void signalWorkflowExecution(SignalWorkflowExecutionRequest signalWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(signalWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SignalWorkflowExecutionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SignalWorkflowExecutionRequestMarshaller().marshall(signalWorkflowExecutionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           execute the ListDomains service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DomainInfos listDomains(ListDomainsRequest listDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<DomainInfos> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DomainInfos, JsonUnmarshallerContext> unmarshaller = new DomainInfosJsonUnmarshaller();
            JsonResponseHandler<DomainInfos> responseHandler = new JsonResponseHandler<DomainInfos>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(requestCancelWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RequestCancelWorkflowExecutionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RequestCancelWorkflowExecutionRequestMarshaller().marshall(requestCancelWorkflowExecutionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the DescribeWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeWorkflowType service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowTypeDetail describeWorkflowType(DescribeWorkflowTypeRequest describeWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkflowTypeRequest> request = null;
        Response<WorkflowTypeDetail> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkflowTypeRequestMarshaller().marshall(describeWorkflowTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowTypeDetail, JsonUnmarshallerContext> unmarshaller = new WorkflowTypeDetailJsonUnmarshaller();
            JsonResponseHandler<WorkflowTypeDetail> responseHandler = new JsonResponseHandler<WorkflowTypeDetail>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the DeprecateActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateActivityType(DeprecateActivityTypeRequest deprecateActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeprecateActivityTypeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeprecateActivityTypeRequestMarshaller().marshall(deprecateActivityTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the CountClosedWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionCount countClosedWorkflowExecutions(CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(countClosedWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountClosedWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionCount> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountClosedWorkflowExecutionsRequestMarshaller().marshall(countClosedWorkflowExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowExecutionCount, JsonUnmarshallerContext> unmarshaller = new WorkflowExecutionCountJsonUnmarshaller();
            JsonResponseHandler<WorkflowExecutionCount> responseHandler = new JsonResponseHandler<WorkflowExecutionCount>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the CountPendingActivityTasks service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the CountPendingActivityTasks service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PendingTaskCount countPendingActivityTasks(CountPendingActivityTasksRequest countPendingActivityTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(countPendingActivityTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountPendingActivityTasksRequest> request = null;
        Response<PendingTaskCount> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountPendingActivityTasksRequestMarshaller().marshall(countPendingActivityTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PendingTaskCount, JsonUnmarshallerContext> unmarshaller = new PendingTaskCountJsonUnmarshaller();
            JsonResponseHandler<PendingTaskCount> responseHandler = new JsonResponseHandler<PendingTaskCount>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the RespondActivityTaskCanceled service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskCanceled(RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskCanceledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RespondActivityTaskCanceledRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RespondActivityTaskCanceledRequestMarshaller().marshall(respondActivityTaskCanceledRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the RespondDecisionTaskCompleted service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondDecisionTaskCompletedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RespondDecisionTaskCompletedRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RespondDecisionTaskCompletedRequestMarshaller().marshall(respondDecisionTaskCompletedRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the RespondActivityTaskCompleted service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskCompletedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RespondActivityTaskCompletedRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RespondActivityTaskCompletedRequestMarshaller().marshall(respondActivityTaskCompletedRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the PollForActivityTask service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the PollForActivityTask service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTask pollForActivityTask(PollForActivityTaskRequest pollForActivityTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForActivityTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForActivityTaskRequest> request = null;
        Response<ActivityTask> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForActivityTaskRequestMarshaller().marshall(pollForActivityTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivityTask, JsonUnmarshallerContext> unmarshaller = new ActivityTaskJsonUnmarshaller();
            JsonResponseHandler<ActivityTask> responseHandler = new JsonResponseHandler<ActivityTask>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the CountOpenWorkflowExecutions service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the CountOpenWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionCount countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(countOpenWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountOpenWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionCount> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountOpenWorkflowExecutionsRequestMarshaller().marshall(countOpenWorkflowExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowExecutionCount, JsonUnmarshallerContext> unmarshaller = new WorkflowExecutionCountJsonUnmarshaller();
            JsonResponseHandler<WorkflowExecutionCount> responseHandler = new JsonResponseHandler<WorkflowExecutionCount>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the DescribeActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeActivityType service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTypeDetail describeActivityType(DescribeActivityTypeRequest describeActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivityTypeRequest> request = null;
        Response<ActivityTypeDetail> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivityTypeRequestMarshaller().marshall(describeActivityTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivityTypeDetail, JsonUnmarshallerContext> unmarshaller = new ActivityTypeDetailJsonUnmarshaller();
            JsonResponseHandler<ActivityTypeDetail> responseHandler = new JsonResponseHandler<ActivityTypeDetail>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the ListOpenWorkflowExecutions service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListOpenWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionInfos listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listOpenWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOpenWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionInfos> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOpenWorkflowExecutionsRequestMarshaller().marshall(listOpenWorkflowExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowExecutionInfos, JsonUnmarshallerContext> unmarshaller = new WorkflowExecutionInfosJsonUnmarshaller();
            JsonResponseHandler<WorkflowExecutionInfos> responseHandler = new JsonResponseHandler<WorkflowExecutionInfos>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the GetWorkflowExecutionHistory service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the GetWorkflowExecutionHistory service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public History getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getWorkflowExecutionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowExecutionHistoryRequest> request = null;
        Response<History> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowExecutionHistoryRequestMarshaller().marshall(getWorkflowExecutionHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<History, JsonUnmarshallerContext> unmarshaller = new HistoryJsonUnmarshaller();
            JsonResponseHandler<History> responseHandler = new JsonResponseHandler<History>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           execute the RegisterDomain service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws DomainAlreadyExistsException
     * @throws OperationNotPermittedException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerDomain(RegisterDomainRequest registerDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RegisterDomainRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RegisterDomainRequestMarshaller().marshall(registerDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the RegisterActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws TypeAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerActivityType(RegisterActivityTypeRequest registerActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RegisterActivityTypeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RegisterActivityTypeRequestMarshaller().marshall(registerActivityTypeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the ListClosedWorkflowExecutions service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the ListClosedWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionInfos listClosedWorkflowExecutions(ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listClosedWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClosedWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionInfos> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClosedWorkflowExecutionsRequestMarshaller().marshall(listClosedWorkflowExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowExecutionInfos, JsonUnmarshallerContext> unmarshaller = new WorkflowExecutionInfosJsonUnmarshaller();
            JsonResponseHandler<WorkflowExecutionInfos> responseHandler = new JsonResponseHandler<WorkflowExecutionInfos>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the RecordActivityTaskHeartbeat service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the RecordActivityTaskHeartbeat service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTaskStatus recordActivityTaskHeartbeat(RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest) {
        ExecutionContext executionContext = createExecutionContext(recordActivityTaskHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecordActivityTaskHeartbeatRequest> request = null;
        Response<ActivityTaskStatus> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecordActivityTaskHeartbeatRequestMarshaller().marshall(recordActivityTaskHeartbeatRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivityTaskStatus, JsonUnmarshallerContext> unmarshaller = new ActivityTaskStatusJsonUnmarshaller();
            JsonResponseHandler<ActivityTaskStatus> responseHandler = new JsonResponseHandler<ActivityTaskStatus>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the PollForDecisionTask service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the PollForDecisionTask service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DecisionTask pollForDecisionTask(PollForDecisionTaskRequest pollForDecisionTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForDecisionTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForDecisionTaskRequest> request = null;
        Response<DecisionTask> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForDecisionTaskRequestMarshaller().marshall(pollForDecisionTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DecisionTask, JsonUnmarshallerContext> unmarshaller = new DecisionTaskJsonUnmarshaller();
            JsonResponseHandler<DecisionTask> responseHandler = new JsonResponseHandler<DecisionTask>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           to execute the ListActivityTypes service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListActivityTypes service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTypeInfos listActivityTypes(ListActivityTypesRequest listActivityTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(listActivityTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActivityTypesRequest> request = null;
        Response<ActivityTypeInfos> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActivityTypesRequestMarshaller().marshall(listActivityTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivityTypeInfos, JsonUnmarshallerContext> unmarshaller = new ActivityTypeInfosJsonUnmarshaller();
            JsonResponseHandler<ActivityTypeInfos> responseHandler = new JsonResponseHandler<ActivityTypeInfos>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           execute the DescribeDomain service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeDomain service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DomainDetail describeDomain(DescribeDomainRequest describeDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DomainDetail> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestMarshaller().marshall(describeDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DomainDetail, JsonUnmarshallerContext> unmarshaller = new DomainDetailJsonUnmarshaller();
            JsonResponseHandler<DomainDetail> responseHandler = new JsonResponseHandler<DomainDetail>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the RespondActivityTaskFailed service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskFailed(RespondActivityTaskFailedRequest respondActivityTaskFailedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskFailedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RespondActivityTaskFailedRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RespondActivityTaskFailedRequestMarshaller().marshall(respondActivityTaskFailedRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the CountPendingDecisionTasks service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the CountPendingDecisionTasks service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PendingTaskCount countPendingDecisionTasks(CountPendingDecisionTasksRequest countPendingDecisionTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(countPendingDecisionTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountPendingDecisionTasksRequest> request = null;
        Response<PendingTaskCount> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountPendingDecisionTasksRequestMarshaller().marshall(countPendingDecisionTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PendingTaskCount, JsonUnmarshallerContext> unmarshaller = new PendingTaskCountJsonUnmarshaller();
            JsonResponseHandler<PendingTaskCount> responseHandler = new JsonResponseHandler<PendingTaskCount>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the TerminateWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void terminateWorkflowExecution(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<TerminateWorkflowExecutionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new TerminateWorkflowExecutionRequestMarshaller().marshall(terminateWorkflowExecutionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     *           parameters to execute the DescribeWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeWorkflowExecution service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionDetail describeWorkflowExecution(DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkflowExecutionRequest> request = null;
        Response<WorkflowExecutionDetail> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkflowExecutionRequestMarshaller().marshall(describeWorkflowExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<WorkflowExecutionDetail, JsonUnmarshallerContext> unmarshaller = new WorkflowExecutionDetailJsonUnmarshaller();
            JsonResponseHandler<WorkflowExecutionDetail> responseHandler = new JsonResponseHandler<WorkflowExecutionDetail>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);

        
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);

        
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);

        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        awsRequestMetrics.log();
        return result;
    }
}
        