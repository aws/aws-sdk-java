/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.services.simpleworkflow.model.transform.*;

/**
 * Client for accessing Amazon SWF. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Simple Workflow Service</fullname>
 * <p>
 * The Amazon Simple Workflow Service (Amazon SWF) makes it easy to build applications that use Amazon's cloud to
 * coordinate work across distributed components. In Amazon SWF, a <i>task</i> represents a logical unit of work that is
 * performed by a component of your workflow. Coordinating tasks in a workflow involves managing intertask dependencies,
 * scheduling, and concurrency in accordance with the logical flow of the application.
 * </p>
 * <p>
 * Amazon SWF gives you full control over implementing tasks and coordinating them without worrying about underlying
 * complexities such as tracking their progress and maintaining their state.
 * </p>
 * <p>
 * This documentation serves as reference only. For a broader overview of the Amazon SWF programming model, see the <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/">Amazon SWF Developer Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonSimpleWorkflowClient extends AmazonWebServiceClient implements AmazonSimpleWorkflow {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSimpleWorkflow.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "swf";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientConfigurationFactory configFactory = new com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.0")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DomainAlreadyExistsFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.DomainAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TypeAlreadyExistsFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.TypeAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.OperationNotPermittedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TypeDeprecatedFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.TypeDeprecatedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LimitExceededFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.LimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("WorkflowExecutionAlreadyStartedFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.WorkflowExecutionAlreadyStartedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnknownResourceFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.UnknownResourceException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DomainDeprecatedFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.DomainDeprecatedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DefaultUndefinedFault").withModeledClass(
                            com.amazonaws.services.simpleworkflow.model.DefaultUndefinedException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.simpleworkflow.model.AmazonSimpleWorkflowException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon SWF. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleWorkflowClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SWF (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleWorkflowClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonSimpleWorkflowClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SWF (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AmazonSimpleWorkflowClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonSimpleWorkflowClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SWF (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AmazonSimpleWorkflowClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SWF (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonSimpleWorkflowClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SWF using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleWorkflowClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("swf.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/simpleworkflow/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/simpleworkflow/request.handler2s"));
    }

    /**
     * <p>
     * Returns the number of closed workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.</li>
     * <li><code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.</li>
     * <li><code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param countClosedWorkflowExecutionsRequest
     * @return Result of the CountClosedWorkflowExecutions operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.CountClosedWorkflowExecutions
     */
    @Override
    public WorkflowExecutionCount countClosedWorkflowExecutions(CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(countClosedWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountClosedWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionCount> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountClosedWorkflowExecutionsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(countClosedWorkflowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowExecutionCount>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowExecutionCountJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of open workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.</li>
     * <li><code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.</li>
     * <li><code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param countOpenWorkflowExecutionsRequest
     * @return Result of the CountOpenWorkflowExecutions operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.CountOpenWorkflowExecutions
     */
    @Override
    public WorkflowExecutionCount countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(countOpenWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountOpenWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionCount> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountOpenWorkflowExecutionsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(countOpenWorkflowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowExecutionCount>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowExecutionCountJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation
     * and is not guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0
     * will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the <code>taskList.name</code> parameter by using a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param countPendingActivityTasksRequest
     * @return Result of the CountPendingActivityTasks operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.CountPendingActivityTasks
     */
    @Override
    public PendingTaskCount countPendingActivityTasks(CountPendingActivityTasksRequest countPendingActivityTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(countPendingActivityTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountPendingActivityTasksRequest> request = null;
        Response<PendingTaskCount> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountPendingActivityTasksRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(countPendingActivityTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PendingTaskCount>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PendingTaskCountJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation
     * and is not guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0
     * will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the <code>taskList.name</code> parameter by using a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param countPendingDecisionTasksRequest
     * @return Result of the CountPendingDecisionTasks operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.CountPendingDecisionTasks
     */
    @Override
    public PendingTaskCount countPendingDecisionTasks(CountPendingDecisionTasksRequest countPendingDecisionTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(countPendingDecisionTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CountPendingDecisionTasksRequest> request = null;
        Response<PendingTaskCount> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CountPendingDecisionTasksRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(countPendingDecisionTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PendingTaskCount>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PendingTaskCountJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates the specified <i>activity type</i>. After an activity type has been deprecated, you cannot create new
     * tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated will continue
     * to run.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.</li>
     * <li><code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param deprecateActivityTypeRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws TypeDeprecatedException
     *         Returned when the specified activity or workflow type was already deprecated.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DeprecateActivityType
     */
    @Override
    public void deprecateActivityType(DeprecateActivityTypeRequest deprecateActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateActivityTypeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateActivityTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprecateActivityTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow
     * executions or register new types. However, you can still use visibility actions on this domain. Deprecating a
     * domain also deprecates all activity and workflow types registered in the domain. Executions that were started
     * before the domain was deprecated will continue to run.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param deprecateDomainRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws DomainDeprecatedException
     *         Returned when the specified domain has been deprecated.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DeprecateDomain
     */
    @Override
    public void deprecateDomain(DeprecateDomainRequest deprecateDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateDomainRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateDomainRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprecateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates the specified <i>workflow type</i>. After a workflow type has been deprecated, you cannot create new
     * executions of that type. Executions that were started before the type was deprecated will continue to run. A
     * deprecated workflow type may still be used when calling visibility actions.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.</li>
     * <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param deprecateWorkflowTypeRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws TypeDeprecatedException
     *         Returned when the specified activity or workflow type was already deprecated.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DeprecateWorkflowType
     */
    @Override
    public void deprecateWorkflowType(DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(deprecateWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateWorkflowTypeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateWorkflowTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprecateWorkflowTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified activity type. This includes configuration settings provided when the
     * type was registered and other general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.</li>
     * <li><code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param describeActivityTypeRequest
     * @return Result of the DescribeActivityType operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DescribeActivityType
     */
    @Override
    public ActivityTypeDetail describeActivityType(DescribeActivityTypeRequest describeActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivityTypeRequest> request = null;
        Response<ActivityTypeDetail> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivityTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActivityTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivityTypeDetail>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivityTypeDetailJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified domain, including description and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DescribeDomain
     */
    @Override
    public DomainDetail describeDomain(DescribeDomainRequest describeDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DomainDetail> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DomainDetail>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DomainDetailJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified workflow execution including its type and some statistics.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param describeWorkflowExecutionRequest
     * @return Result of the DescribeWorkflowExecution operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DescribeWorkflowExecution
     */
    @Override
    public WorkflowExecutionDetail describeWorkflowExecution(DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkflowExecutionRequest> request = null;
        Response<WorkflowExecutionDetail> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkflowExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkflowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowExecutionDetail>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowExecutionDetailJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified <i>workflow type</i>. This includes configuration settings specified when
     * the type was registered and other information such as creation date, current status, and so on.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.</li>
     * <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param describeWorkflowTypeRequest
     * @return Result of the DescribeWorkflowType operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.DescribeWorkflowType
     */
    @Override
    public WorkflowTypeDetail describeWorkflowType(DescribeWorkflowTypeRequest describeWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkflowTypeRequest> request = null;
        Response<WorkflowTypeDetail> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkflowTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkflowTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowTypeDetail>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowTypeDetailJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the history of the specified workflow execution. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param getWorkflowExecutionHistoryRequest
     * @return Result of the GetWorkflowExecutionHistory operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.GetWorkflowExecutionHistory
     */
    @Override
    public History getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getWorkflowExecutionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowExecutionHistoryRequest> request = null;
        Response<History> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowExecutionHistoryRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWorkflowExecutionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<History>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new HistoryJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all activities registered in the specified domain that match the specified name and
     * registration status. The result includes information like creation date, current status of the activity, etc. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param listActivityTypesRequest
     * @return Result of the ListActivityTypes operation returned by the service.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @sample AmazonSimpleWorkflow.ListActivityTypes
     */
    @Override
    public ActivityTypeInfos listActivityTypes(ListActivityTypesRequest listActivityTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(listActivityTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActivityTypesRequest> request = null;
        Response<ActivityTypeInfos> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActivityTypesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActivityTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivityTypeInfos>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivityTypeInfosJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * nextPageToken returned by the initial call.
     * </p>
     * <note>This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.</li>
     * <li><code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.</li>
     * <li><code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param listClosedWorkflowExecutionsRequest
     * @return Result of the ListClosedWorkflowExecutions operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.ListClosedWorkflowExecutions
     */
    @Override
    public WorkflowExecutionInfos listClosedWorkflowExecutions(ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listClosedWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClosedWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionInfos> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClosedWorkflowExecutionsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listClosedWorkflowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowExecutionInfos>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowExecutionInfosJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve
     * subsequent pages, make the call again using the nextPageToken returned by the initial call.
     * </p>
     * <note> This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains. The
     * element must be set to <code>arn:aws:swf::AccountID:domain/*</code>, where <i>AccountID</i> is the account ID,
     * with no dashes.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.ListDomains
     */
    @Override
    public DomainInfos listDomains(ListDomainsRequest listDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<DomainInfos> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DomainInfos>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DomainInfosJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results
     * may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken
     * returned by the initial call.
     * </p>
     * <note> This operation is eventually consistent. The results are best effort and may not exactly reflect recent
     * updates and changes.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li><code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.</li>
     * <li><code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.</li>
     * <li><code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param listOpenWorkflowExecutionsRequest
     * @return Result of the ListOpenWorkflowExecutions operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.ListOpenWorkflowExecutions
     */
    @Override
    public WorkflowExecutionInfos listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listOpenWorkflowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOpenWorkflowExecutionsRequest> request = null;
        Response<WorkflowExecutionInfos> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOpenWorkflowExecutionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOpenWorkflowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowExecutionInfos>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowExecutionInfosJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about workflow types in the specified domain. The results may be split into multiple pages
     * that can be retrieved by making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param listWorkflowTypesRequest
     * @return Result of the ListWorkflowTypes operation returned by the service.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @sample AmazonSimpleWorkflow.ListWorkflowTypes
     */
    @Override
    public WorkflowTypeInfos listWorkflowTypes(ListWorkflowTypesRequest listWorkflowTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(listWorkflowTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowTypesRequest> request = null;
        Response<WorkflowTypeInfos> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowTypesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkflowTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WorkflowTypeInfos>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WorkflowTypeInfosJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to get an <a>ActivityTask</a> from the specified activity <code>taskList</code>. This initiates a
     * long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The
     * maximum time the service holds on to the request before responding is 60 seconds. If no task is available within
     * 60 seconds, the poll will return an empty result. An empty result, in this context, means that an ActivityTask is
     * returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its
     * type to identify and process it correctly.
     * </p>
     * <important>Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the
     * maximum time service may hold the poll request).</important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the <code>taskList.name</code> parameter by using a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param pollForActivityTaskRequest
     * @return Result of the PollForActivityTask operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @sample AmazonSimpleWorkflow.PollForActivityTask
     */
    @Override
    public ActivityTask pollForActivityTask(PollForActivityTaskRequest pollForActivityTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForActivityTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForActivityTaskRequest> request = null;
        Response<ActivityTask> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForActivityTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForActivityTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivityTask>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivityTaskJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by deciders to get a <a>DecisionTask</a> from the specified decision <code>taskList</code>. A decision task
     * may be returned for any open workflow execution that is using the specified task list. The task includes a
     * paginated view of the history of the workflow execution. The decider should use the workflow type and the history
     * to determine how to properly handle the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task
     * becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds
     * expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned,
     * but that the value of <code>taskToken</code> is an empty string.
     * </p>
     * <important>Deciders should set their client-side socket timeout to at least 70 seconds (10 seconds higher than
     * the timeout).</important> <important>Because the number of workflow history events for a single workflow
     * execution might be very large, the result returned might be split up across a number of pages. To retrieve
     * subsequent pages, make additional calls to <code>PollForDecisionTask</code> using the <code>nextPageToken</code>
     * returned by the initial call. Note that you do <b>not</b> call <code>GetWorkflowExecutionHistory</code> with this
     * <code>nextPageToken</code>. Instead, call <code>PollForDecisionTask</code> again.</important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the <code>taskList.name</code> parameter by using a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param pollForDecisionTaskRequest
     * @return Result of the PollForDecisionTask operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @sample AmazonSimpleWorkflow.PollForDecisionTask
     */
    @Override
    public DecisionTask pollForDecisionTask(PollForDecisionTaskRequest pollForDecisionTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForDecisionTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForDecisionTaskRequest> request = null;
        Response<DecisionTask> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForDecisionTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForDecisionTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DecisionTask>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DecisionTaskJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by activity workers to report to the service that the <a>ActivityTask</a> represented by the specified
     * <code>taskToken</code> is still making progress. The worker can also (optionally) specify details of the
     * progress, for example percent complete, using the <code>details</code> parameter. This action can also be used by
     * the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is
     * being attempted for the specified task, then the boolean <code>cancelRequested</code> flag returned by the
     * service is set to <code>true</code>.
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The <code>taskHeartbeatTimeout</code> is
     * specified in <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * This action does not in itself create an event in the workflow execution history. However, if the task times out,
     * the workflow execution history will contain a <code>ActivityTaskTimedOut</code> event that contains the
     * information from the last heartbeat generated by the activity worker.
     * </p>
     * <note>The <code>taskStartToCloseTimeout</code> of an activity type is the maximum duration of an activity task,
     * regardless of the number of <a>RecordActivityTaskHeartbeat</a> requests received. The
     * <code>taskStartToCloseTimeout</code> is also specified in <a>RegisterActivityType</a>.</note> <note>This
     * operation is only useful for long-lived activities to report liveliness of the task and to determine if a
     * cancellation is being attempted. </note> <important>If the <code>cancelRequested</code> flag returns
     * <code>true</code>, a cancellation is being attempted. If the worker can cancel the activity, it should respond
     * with <a>RespondActivityTaskCanceled</a>. Otherwise, it should ignore the cancellation request.</important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param recordActivityTaskHeartbeatRequest
     * @return Result of the RecordActivityTaskHeartbeat operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RecordActivityTaskHeartbeat
     */
    @Override
    public ActivityTaskStatus recordActivityTaskHeartbeat(RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest) {
        ExecutionContext executionContext = createExecutionContext(recordActivityTaskHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecordActivityTaskHeartbeatRequest> request = null;
        Response<ActivityTaskStatus> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecordActivityTaskHeartbeatRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(recordActivityTaskHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivityTaskStatus>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivityTaskStatusJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration settings in the specified domain.
     * </p>
     * <important>A <code>TypeAlreadyExists</code> fault is returned if the type already exists in the domain. You
     * cannot change any configuration settings of the type after its registration, and it must be registered as a new
     * version.</important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.</li>
     * <li> <code>name</code>: String constraint. The key is <code>swf:name</code>.</li>
     * <li> <code>version</code>: String constraint. The key is <code>swf:version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param registerActivityTypeRequest
     * @throws TypeAlreadyExistsException
     *         Returned if the type already exists in the specified domain. You will get this fault even if the existing
     *         type is in deprecated status. You can specify another version if the intent is to create a new distinct
     *         version of the type.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RegisterActivityType
     */
    @Override
    public void registerActivityType(RegisterActivityTypeRequest registerActivityTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerActivityTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterActivityTypeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterActivityTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerActivityTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

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
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>You cannot use an IAM policy to control domain access for this action. The name of the domain being
     * registered is available as the resource of this action.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param registerDomainRequest
     * @throws DomainAlreadyExistsException
     *         Returned if the specified domain already exists. You will get this fault even if the existing domain is
     *         in deprecated status.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RegisterDomain
     */
    @Override
    public void registerDomain(RegisterDomainRequest registerDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDomainRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDomainRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the <a>RegisterDomain</a> action.
     * </p>
     * <important>If the type already exists, then a <code>TypeAlreadyExists</code> fault is returned. You cannot change
     * the configuration settings of a workflow type once it is registered and it must be registered as a new
     * version.</important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.</li>
     * <li> <code>name</code>: String constraint. The key is <code>swf:name</code>.</li>
     * <li> <code>version</code>: String constraint. The key is <code>swf:version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param registerWorkflowTypeRequest
     * @throws TypeAlreadyExistsException
     *         Returned if the type already exists in the specified domain. You will get this fault even if the existing
     *         type is in deprecated status. You can specify another version if the intent is to create a new distinct
     *         version of the type.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RegisterWorkflowType
     */
    @Override
    public void registerWorkflowType(RegisterWorkflowTypeRequest registerWorkflowTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerWorkflowTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterWorkflowTypeRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterWorkflowTypeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerWorkflowTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the currently running workflow execution
     * identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow
     * execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history
     * with this event.
     * </p>
     * <note>If the runId is not specified, the <code>WorkflowExecutionCancelRequested</code> event is recorded in the
     * history of the current open workflow execution with the specified workflowId in the domain.</note> <note>Because
     * this action allows the workflow to properly clean up and gracefully close, it should be used instead of
     * <a>TerminateWorkflowExecution</a> when possible.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param requestCancelWorkflowExecutionRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RequestCancelWorkflowExecution
     */
    @Override
    public void requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(requestCancelWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestCancelWorkflowExecutionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestCancelWorkflowExecutionRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(requestCancelWorkflowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> was
     * successfully canceled. Additional <code>details</code> can be optionally provided using the <code>details</code>
     * argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the <code>ActivityTaskCanceled</code> event added to the
     * workflow history.
     * </p>
     * <important>Only use this operation if the <code>canceled</code> flag of a <a>RecordActivityTaskHeartbeat</a>
     * request returns <code>true</code> and if the activity can be safely undone or abandoned.</important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, RespondActivityTaskCanceled, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param respondActivityTaskCanceledRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RespondActivityTaskCanceled
     */
    @Override
    public void respondActivityTaskCanceled(RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskCanceledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondActivityTaskCanceledRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondActivityTaskCanceledRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(respondActivityTaskCanceledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code>
     * completed successfully with a <code>result</code> (if provided). The <code>result</code> appears in the
     * <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <important> If the requested task does not complete successfully, use <a>RespondActivityTaskFailed</a> instead.
     * If the worker finds that the task is canceled through the <code>canceled</code> flag returned by
     * <a>RecordActivityTaskHeartbeat</a>, it should cancel the task, clean up and then call
     * <a>RespondActivityTaskCanceled</a>.</important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * RespondActivityTaskCompleted, <a>RespondActivityTaskCanceled</a>, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param respondActivityTaskCompletedRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RespondActivityTaskCompleted
     */
    @Override
    public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskCompletedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondActivityTaskCompletedRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondActivityTaskCompletedRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(respondActivityTaskCompletedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> has
     * failed with <code>reason</code> (if specified). The <code>reason</code> and <code>details</code> appear in the
     * <code>ActivityTaskFailed</code> event added to the workflow history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, <a>RespondActivityTaskCanceled</a>, RespondActivityTaskFailed, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param respondActivityTaskFailedRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RespondActivityTaskFailed
     */
    @Override
    public void respondActivityTaskFailed(RespondActivityTaskFailedRequest respondActivityTaskFailedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondActivityTaskFailedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondActivityTaskFailedRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondActivityTaskFailedRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(respondActivityTaskFailedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by deciders to tell the service that the <a>DecisionTask</a> identified by the <code>taskToken</code> has
     * successfully completed. The <code>decisions</code> argument specifies the list of decisions made while processing
     * the task.
     * </p>
     * <p>
     * A <code>DecisionTaskCompleted</code> event is added to the workflow history. The <code>executionContext</code>
     * specified is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use <code>RespondDecisionTaskCompleted</code>, it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter. Each of the decisions has one or more
     * parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express
     * permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For
     * more information, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param respondDecisionTaskCompletedRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.RespondDecisionTaskCompleted
     */
    @Override
    public void respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest) {
        ExecutionContext executionContext = createExecutionContext(respondDecisionTaskCompletedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondDecisionTaskCompletedRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondDecisionTaskCompletedRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(respondDecisionTaskCompletedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the workflow execution history and creates a decision
     * task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with
     * the specified user defined signalName and input (if provided).
     * </p>
     * <note> If a runId is not specified, then the <code>WorkflowExecutionSignaled</code> event is recorded in the
     * history of the current open workflow with the matching workflowId in the domain.</note> <note> If the specified
     * workflow execution is not open, this method fails with <code>UnknownResource</code>.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param signalWorkflowExecutionRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.SignalWorkflowExecution
     */
    @Override
    public void signalWorkflowExecution(SignalWorkflowExecutionRequest signalWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(signalWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignalWorkflowExecutionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignalWorkflowExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(signalWorkflowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain using the provided <code>workflowId</code> and
     * input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tagList.member.0</code>: The key is <code>swf:tagList.member.0</code>.</li>
     * <li> <code>tagList.member.1</code>: The key is <code>swf:tagList.member.1</code>.</li>
     * <li> <code>tagList.member.2</code>: The key is <code>swf:tagList.member.2</code>.</li>
     * <li> <code>tagList.member.3</code>: The key is <code>swf:tagList.member.3</code>.</li>
     * <li> <code>tagList.member.4</code>: The key is <code>swf:tagList.member.4</code>.</li>
     * <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li>
     * <li><code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.</li>
     * <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param startWorkflowExecutionRequest
     * @return Result of the StartWorkflowExecution operation returned by the service.
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws TypeDeprecatedException
     *         Returned when the specified activity or workflow type was already deprecated.
     * @throws WorkflowExecutionAlreadyStartedException
     *         Returned by <a>StartWorkflowExecution</a> when an open execution with the same workflowId is already
     *         running in the specified domain.
     * @throws LimitExceededException
     *         Returned by any operation if a system imposed limitation has been reached. To address this fault you
     *         should either clean up unused resources or increase the limit by contacting AWS.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @throws DefaultUndefinedException
     * @sample AmazonSimpleWorkflow.StartWorkflowExecution
     */
    @Override
    public Run startWorkflowExecution(StartWorkflowExecutionRequest startWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(startWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkflowExecutionRequest> request = null;
        Response<Run> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkflowExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startWorkflowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Run>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RunJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces closure of the workflow execution identified
     * by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when
     * starting this execution, is applied to any open child workflow executions of this workflow execution.
     * </p>
     * <important> If the identified workflow execution was in progress, it is terminated immediately.</important>
     * <note> If a runId is not specified, then the <code>WorkflowExecutionTerminated</code> event is recorded in the
     * history of the current open workflow with the matching workflowId in the domain.</note> <note> You should
     * consider using <a>RequestCancelWorkflowExecution</a> action instead because it allows the workflow to gracefully
     * close while <a>TerminateWorkflowExecution</a> does not.</note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
     * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.
     * </p>
     * 
     * @param terminateWorkflowExecutionRequest
     * @throws UnknownResourceException
     *         Returned when the named resource cannot be found with in the scope of this operation (region or domain).
     *         This could happen if the named resource was never created or is no longer available for this operation.
     * @throws OperationNotPermittedException
     *         Returned when the caller does not have sufficient permissions to invoke the action.
     * @sample AmazonSimpleWorkflow.TerminateWorkflowExecution
     */
    @Override
    public void terminateWorkflowExecution(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateWorkflowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateWorkflowExecutionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateWorkflowExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateWorkflowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<Void>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
