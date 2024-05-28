/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
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
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.services.stepfunctions.model.transform.*;

/**
 * Client for accessing AWS SFN. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Step Functions</fullname>
 * <p>
 * Step Functions is a service that lets you coordinate the components of distributed applications and microservices
 * using visual workflows.
 * </p>
 * <p>
 * You can use Step Functions to build applications from individual components, each of which performs a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a console
 * that helps visualize the components of your application as a series of steps. Step Functions automatically triggers
 * and tracks each step, and retries steps when there are errors, so your application executes predictably and in the
 * right order every time. Step Functions logs the state of each step, so you can quickly diagnose and debug any issues.
 * </p>
 * <p>
 * Step Functions manages operations and underlying infrastructure to ensure your application is available at any scale.
 * You can run tasks on Amazon Web Services, your own servers, or any system that has access to Amazon Web Services. You
 * can access and use Step Functions using the console, the Amazon Web Services SDKs, or an HTTP API. For more
 * information about Step Functions, see the <i> <a
 * href="https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html">Step Functions Developer Guide</a> </i>.
 * </p>
 * <important>
 * <p>
 * If you use the Step Functions API actions using Amazon Web Services SDK integrations, make sure the API actions are
 * in camel case and parameter names are in Pascal case. For example, you could use Step Functions API action
 * <code>startSyncExecution</code> and specify its parameter as <code>StateMachineArn</code>.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSStepFunctionsClient extends AmazonWebServiceClient implements AWSStepFunctions {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSStepFunctions.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "states";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final com.amazonaws.services.stepfunctions.AWSStepFunctionsClientConfigurationFactory configFactory = new com.amazonaws.services.stepfunctions.AWSStepFunctionsClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActivityDoesNotExist").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ActivityDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StateMachineTypeNotSupported").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.StateMachineTypeNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDefinition").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidDefinitionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidName").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLoggingConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidLoggingConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StateMachineAlreadyExists").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.StateMachineAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExecutionLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ExecutionLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArn").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StateMachineDeleting").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.StateMachineDeletingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActivityWorkerLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ActivityWorkerLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TaskTimedOut").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.TaskTimedOutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExecutionAlreadyExists").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ExecutionAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameter").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.MissingRequiredParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExecutionDoesNotExist").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ExecutionDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExecutionNotRedrivable").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ExecutionNotRedrivableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StateMachineLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.StateMachineLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidToken").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTags").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOutput").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidOutputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTracingConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidTracingConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActivityLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ActivityLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExecutionInput").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.InvalidExecutionInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TaskDoesNotExist").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.TaskDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StateMachineDoesNotExist").withExceptionUnmarshaller(
                                    com.amazonaws.services.stepfunctions.model.transform.StateMachineDoesNotExistExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.stepfunctions.model.AWSStepFunctionsException.class));

    /**
     * Constructs a new client to invoke service methods on AWS SFN. A credentials provider chain will be used that
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
     * @deprecated use {@link AWSStepFunctionsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSStepFunctionsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStepFunctionsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSStepFunctionsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSStepFunctionsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStepFunctionsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSStepFunctionsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStepFunctionsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSStepFunctionsClientBuilder builder() {
        return AWSStepFunctionsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSStepFunctionsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSStepFunctionsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("states.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/stepfunctions/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/stepfunctions/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an activity. An activity is a task that you write in any programming language and host on any machine
     * that has access to Step Functions. Activities must poll Step Functions using the <code>GetActivityTask</code> API
     * action and respond using <code>SendTask*</code> API actions. This function lets Step Functions know the existence
     * of your activity and returns an identifier for use in a state machine and when polling from the activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note> <note>
     * <p>
     * <code>CreateActivity</code> is an idempotent API. Subsequent requests won’t create a duplicate resource if it was
     * already created. <code>CreateActivity</code>'s idempotency check is based on the activity <code>name</code>. If a
     * following request has different <code>tags</code> values, Step Functions will ignore these differences and treat
     * it as an idempotent request of the previous. In this case, <code>tags</code> will not be updated, even if they
     * are different.
     * </p>
     * </note>
     * 
     * @param createActivityRequest
     * @return Result of the CreateActivity operation returned by the service.
     * @throws ActivityLimitExceededException
     *         The maximum number of activities has been reached. Existing activities must be deleted before a new
     *         activity can be created.
     * @throws InvalidNameException
     *         The provided name is not valid.
     * @throws TooManyTagsException
     *         You've exceeded the number of tags allowed for a resource. See the <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html"> Limits Topic</a> in the Step
     *         Functions Developer Guide.
     * @sample AWSStepFunctions.CreateActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateActivity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateActivityResult createActivity(CreateActivityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateActivity(request);
    }

    @SdkInternalApi
    final CreateActivityResult executeCreateActivity(CreateActivityRequest createActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(createActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActivityRequest> request = null;
        Response<CreateActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActivityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateActivity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a state machine. A state machine consists of a collection of states that can do work (<code>Task</code>
     * states), determine to which states to transition next (<code>Choice</code> states), stop an execution with an
     * error (<code>Fail</code> states), and so on. State machines are specified using a JSON-based, structured
     * language. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> in the Step Functions User Guide.
     * </p>
     * <p>
     * If you set the <code>publish</code> parameter of this API action to <code>true</code>, it publishes version
     * <code>1</code> as the first revision of the state machine.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note> <note>
     * <p>
     * <code>CreateStateMachine</code> is an idempotent API. Subsequent requests won’t create a duplicate resource if it
     * was already created. <code>CreateStateMachine</code>'s idempotency check is based on the state machine
     * <code>name</code>, <code>definition</code>, <code>type</code>, <code>LoggingConfiguration</code>, and
     * <code>TracingConfiguration</code>. The check is also based on the <code>publish</code> and
     * <code>versionDescription</code> parameters. If a following request has a different <code>roleArn</code> or
     * <code>tags</code>, Step Functions will ignore these differences and treat it as an idempotent request of the
     * previous. In this case, <code>roleArn</code> and <code>tags</code> will not be updated, even if they are
     * different.
     * </p>
     * </note>
     * 
     * @param createStateMachineRequest
     * @return Result of the CreateStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidDefinitionException
     *         The provided Amazon States Language definition is not valid.
     * @throws InvalidNameException
     *         The provided name is not valid.
     * @throws InvalidLoggingConfigurationException
     * @throws InvalidTracingConfigurationException
     *         Your <code>tracingConfiguration</code> key does not match, or <code>enabled</code> has not been set to
     *         <code>true</code> or <code>false</code>.
     * @throws StateMachineAlreadyExistsException
     *         A state machine with the same name but a different definition or role ARN already exists.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineLimitExceededException
     *         The maximum number of state machines has been reached. Existing state machines must be deleted before a
     *         new state machine can be created.
     * @throws StateMachineTypeNotSupportedException
     * @throws TooManyTagsException
     *         You've exceeded the number of tags allowed for a resource. See the <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html"> Limits Topic</a> in the Step
     *         Functions Developer Guide.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.</p>
     *         <p>
     *         HTTP Status Code: 409
     * @sample AWSStepFunctions.CreateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStateMachineResult createStateMachine(CreateStateMachineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStateMachine(request);
    }

    @SdkInternalApi
    final CreateStateMachineResult executeCreateStateMachine(CreateStateMachineRequest createStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(createStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStateMachineRequest> request = null;
        Response<CreateStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStateMachineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStateMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a> for a
     * state machine that points to one or two <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">versions</a> of
     * the same state machine. You can set your application to call <a>StartExecution</a> with an alias and update the
     * version the alias uses without changing the client's code.
     * </p>
     * <p>
     * You can also map an alias to split <a>StartExecution</a> requests between two versions of a state machine. To do
     * this, add a second <code>RoutingConfig</code> object in the <code>routingConfiguration</code> parameter. You must
     * also specify the percentage of execution run requests each version should receive in both
     * <code>RoutingConfig</code> objects. Step Functions randomly chooses which version runs a given execution based on
     * the percentage you specify.
     * </p>
     * <p>
     * To create an alias that points to a single version, specify a single <code>RoutingConfig</code> object with a
     * <code>weight</code> set to 100.
     * </p>
     * <p>
     * You can create up to 100 aliases for each state machine. You must delete unused aliases using the
     * <a>DeleteStateMachineAlias</a> API action.
     * </p>
     * <p>
     * <code>CreateStateMachineAlias</code> is an idempotent API. Step Functions bases the idempotency check on the
     * <code>stateMachineArn</code>, <code>description</code>, <code>name</code>, and <code>routingConfiguration</code>
     * parameters. Requests that contain the same values for these parameters return a successful idempotent response
     * without creating a duplicate resource.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteStateMachineAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createStateMachineAliasRequest
     * @return Result of the CreateStateMachineAlias operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNameException
     *         The provided name is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.</p>
     *         <p>
     *         HTTP Status Code: 409
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     *         </p>
     *         <p>
     *         HTTP Status Code: 402
     * @sample AWSStepFunctions.CreateStateMachineAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachineAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStateMachineAliasResult createStateMachineAlias(CreateStateMachineAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStateMachineAlias(request);
    }

    @SdkInternalApi
    final CreateStateMachineAliasResult executeCreateStateMachineAlias(CreateStateMachineAliasRequest createStateMachineAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createStateMachineAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStateMachineAliasRequest> request = null;
        Response<CreateStateMachineAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStateMachineAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createStateMachineAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStateMachineAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStateMachineAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStateMachineAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an activity.
     * </p>
     * 
     * @param deleteActivityRequest
     * @return Result of the DeleteActivity operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.DeleteActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteActivity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteActivityResult deleteActivity(DeleteActivityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteActivity(request);
    }

    @SdkInternalApi
    final DeleteActivityResult executeDeleteActivity(DeleteActivityRequest deleteActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActivityRequest> request = null;
        Response<DeleteActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActivityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteActivity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a state machine. This is an asynchronous operation. It sets the state machine's status to
     * <code>DELETING</code> and begins the deletion process. A state machine is deleted only when all its executions
     * are completed. On the next state transition, the state machine's executions are terminated.
     * </p>
     * <p>
     * A qualified state machine ARN can either refer to a <i>Distributed Map state</i> defined within a state machine,
     * a version ARN, or an alias ARN.
     * </p>
     * <p>
     * The following are some examples of qualified and unqualified state machine ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to a <i>Distributed Map state</i> with a label
     * <code>mapStateLabel</code> in a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:partition:states:region:account-id:stateMachine:myStateMachine/mapStateLabel</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a <i>Distributed Map state</i>, the request fails
     * with <code>ValidationException</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following unqualified state machine ARN refers to a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:partition:states:region:account-id:stateMachine:myStateMachine</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This API action also deletes all <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">versions</a> and
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">aliases</a>
     * associated with a state machine.
     * </p>
     * <note>
     * <p>
     * For <code>EXPRESS</code> state machines, the deletion happens eventually (usually in less than a minute). Running
     * executions may emit logs after <code>DeleteStateMachine</code> API is called.
     * </p>
     * </note>
     * 
     * @param deleteStateMachineRequest
     * @return Result of the DeleteStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.DeleteStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStateMachineResult deleteStateMachine(DeleteStateMachineRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStateMachine(request);
    }

    @SdkInternalApi
    final DeleteStateMachineResult executeDeleteStateMachine(DeleteStateMachineRequest deleteStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStateMachineRequest> request = null;
        Response<DeleteStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStateMachineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStateMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a>.
     * </p>
     * <p>
     * After you delete a state machine alias, you can't use it to start executions. When you delete a state machine
     * alias, Step Functions doesn't delete the state machine versions that alias references.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateStateMachineAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteStateMachineAliasRequest
     * @return Result of the DeleteStateMachineAlias operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.</p>
     *         <p>
     *         HTTP Status Code: 409
     * @sample AWSStepFunctions.DeleteStateMachineAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachineAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStateMachineAliasResult deleteStateMachineAlias(DeleteStateMachineAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStateMachineAlias(request);
    }

    @SdkInternalApi
    final DeleteStateMachineAliasResult executeDeleteStateMachineAlias(DeleteStateMachineAliasRequest deleteStateMachineAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStateMachineAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStateMachineAliasRequest> request = null;
        Response<DeleteStateMachineAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStateMachineAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteStateMachineAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStateMachineAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStateMachineAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteStateMachineAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a>.
     * After you delete a version, you can't call <a>StartExecution</a> using that version's ARN or use the version with
     * a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a>.
     * </p>
     * <note>
     * <p>
     * Deleting a state machine version won't terminate its in-progress executions.
     * </p>
     * </note> <note>
     * <p>
     * You can't delete a state machine version currently referenced by one or more aliases. Before you delete a
     * version, you must either delete the aliases or update them to point to another state machine version.
     * </p>
     * </note>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PublishStateMachineVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineVersions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteStateMachineVersionRequest
     * @return Result of the DeleteStateMachineVersion operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.</p>
     *         <p>
     *         HTTP Status Code: 409
     * @sample AWSStepFunctions.DeleteStateMachineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStateMachineVersionResult deleteStateMachineVersion(DeleteStateMachineVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStateMachineVersion(request);
    }

    @SdkInternalApi
    final DeleteStateMachineVersionResult executeDeleteStateMachineVersion(DeleteStateMachineVersionRequest deleteStateMachineVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStateMachineVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStateMachineVersionRequest> request = null;
        Response<DeleteStateMachineVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStateMachineVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteStateMachineVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStateMachineVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStateMachineVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteStateMachineVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an activity.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeActivityRequest
     * @return Result of the DescribeActivity operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.DescribeActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeActivity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeActivityResult describeActivity(DescribeActivityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeActivity(request);
    }

    @SdkInternalApi
    final DescribeActivityResult executeDescribeActivity(DescribeActivityRequest describeActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivityRequest> request = null;
        Response<DescribeActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeActivity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a state machine execution, such as the state machine associated with the execution,
     * the execution input and output, and relevant execution metadata. If you've <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-executions.html">redriven</a> an execution,
     * you can use this API action to return information about the redrives of that execution. In addition, you can use
     * this API action to return the Map Run Amazon Resource Name (ARN) if the execution was dispatched by a Map Run.
     * </p>
     * <p>
     * If you specify a version or alias ARN when you call the <a>StartExecution</a> API action,
     * <code>DescribeExecution</code> returns that ARN.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * <p>
     * Executions of an <code>EXPRESS</code> state machine aren't supported by <code>DescribeExecution</code> unless a
     * Map Run dispatched them.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExecution(request);
    }

    @SdkInternalApi
    final DescribeExecutionResult executeDescribeExecution(DescribeExecutionRequest describeExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExecutionRequest> request = null;
        Response<DescribeExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a Map Run's configuration, progress, and results. If you've <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redriven</a> a Map Run, this API
     * action also returns information about the redrives of that Map Run. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-examine-map-run.html">Examining Map Run</a>
     * in the <i>Step Functions Developer Guide</i>.
     * </p>
     * 
     * @param describeMapRunRequest
     * @return Result of the DescribeMapRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.DescribeMapRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeMapRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeMapRunResult describeMapRun(DescribeMapRunRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMapRun(request);
    }

    @SdkInternalApi
    final DescribeMapRunResult executeDescribeMapRun(DescribeMapRunRequest describeMapRunRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMapRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMapRunRequest> request = null;
        Response<DescribeMapRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMapRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMapRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMapRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMapRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMapRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a state machine's definition, its IAM role Amazon Resource Name (ARN), and
     * configuration.
     * </p>
     * <p>
     * A qualified state machine ARN can either refer to a <i>Distributed Map state</i> defined within a state machine,
     * a version ARN, or an alias ARN.
     * </p>
     * <p>
     * The following are some examples of qualified and unqualified state machine ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to a <i>Distributed Map state</i> with a label
     * <code>mapStateLabel</code> in a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:partition:states:region:account-id:stateMachine:myStateMachine/mapStateLabel</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a <i>Distributed Map state</i>, the request fails
     * with <code>ValidationException</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a version ARN or an alias ARN, the request starts
     * execution for that version or alias.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following unqualified state machine ARN refers to a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This API action returns the details for a state machine version if the <code>stateMachineArn</code> you specify
     * is a state machine version ARN.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param describeStateMachineRequest
     * @return Result of the DescribeStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @sample AWSStepFunctions.DescribeStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachine" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStateMachineResult describeStateMachine(DescribeStateMachineRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStateMachine(request);
    }

    @SdkInternalApi
    final DescribeStateMachineResult executeDescribeStateMachine(DescribeStateMachineRequest describeStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStateMachineRequest> request = null;
        Response<DescribeStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStateMachineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStateMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteStateMachineAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeStateMachineAliasRequest
     * @return Result of the DescribeStateMachineAlias operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @sample AWSStepFunctions.DescribeStateMachineAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineAlias"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStateMachineAliasResult describeStateMachineAlias(DescribeStateMachineAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStateMachineAlias(request);
    }

    @SdkInternalApi
    final DescribeStateMachineAliasResult executeDescribeStateMachineAlias(DescribeStateMachineAliasRequest describeStateMachineAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStateMachineAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStateMachineAliasRequest> request = null;
        Response<DescribeStateMachineAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStateMachineAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStateMachineAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStateMachineAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStateMachineAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStateMachineAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a state machine's definition, its execution role ARN, and configuration. If a Map Run
     * dispatched the execution, this action returns the Map Run Amazon Resource Name (ARN) in the response. The state
     * machine returned is the state machine associated with the Map Run.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * <p>
     * This API action is not supported by <code>EXPRESS</code> state machines.
     * </p>
     * 
     * @param describeStateMachineForExecutionRequest
     * @return Result of the DescribeStateMachineForExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.DescribeStateMachineForExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineForExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStateMachineForExecutionResult describeStateMachineForExecution(DescribeStateMachineForExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStateMachineForExecution(request);
    }

    @SdkInternalApi
    final DescribeStateMachineForExecutionResult executeDescribeStateMachineForExecution(
            DescribeStateMachineForExecutionRequest describeStateMachineForExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStateMachineForExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStateMachineForExecutionRequest> request = null;
        Response<DescribeStateMachineForExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStateMachineForExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStateMachineForExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStateMachineForExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStateMachineForExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStateMachineForExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a
     * running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds
     * as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the
     * service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the
     * poll returns a <code>taskToken</code> with a null string.
     * </p>
     * <note>
     * <p>
     * This API action isn't logged in CloudTrail.
     * </p>
     * </note> <important>
     * <p>
     * Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
     * time the service may hold the poll request).
     * </p>
     * <p>
     * Polling with <code>GetActivityTask</code> can cause latency in some implementations. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/bp-activity-pollers.html">Avoid Latency When Polling
     * for Activity Tasks</a> in the Step Functions Developer Guide.
     * </p>
     * </important>
     * 
     * @param getActivityTaskRequest
     * @return Result of the GetActivityTask operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws ActivityWorkerLimitExceededException
     *         The maximum number of workers concurrently polling for activity tasks has been reached.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.GetActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetActivityTaskResult getActivityTask(GetActivityTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetActivityTask(request);
    }

    @SdkInternalApi
    final GetActivityTaskResult executeGetActivityTask(GetActivityTaskRequest getActivityTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getActivityTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActivityTaskRequest> request = null;
        Response<GetActivityTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActivityTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getActivityTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetActivityTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetActivityTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetActivityTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the history of the specified execution as a list of events. By default, the results are returned in
     * ascending order of the <code>timeStamp</code> of the events. Use the <code>reverseOrder</code> parameter to get
     * the latest events first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <p>
     * This API action is not supported by <code>EXPRESS</code> state machines.
     * </p>
     * 
     * @param getExecutionHistoryRequest
     * @return Result of the GetExecutionHistory operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @sample AWSStepFunctions.GetExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetExecutionHistory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExecutionHistoryResult getExecutionHistory(GetExecutionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetExecutionHistory(request);
    }

    @SdkInternalApi
    final GetExecutionHistoryResult executeGetExecutionHistory(GetExecutionHistoryRequest getExecutionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getExecutionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExecutionHistoryRequest> request = null;
        Response<GetExecutionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExecutionHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExecutionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExecutionHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExecutionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExecutionHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing activities.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listActivitiesRequest
     * @return Result of the ListActivities operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @sample AWSStepFunctions.ListActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListActivities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListActivitiesResult listActivities(ListActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListActivities(request);
    }

    @SdkInternalApi
    final ListActivitiesResult executeListActivities(ListActivitiesRequest listActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActivitiesRequest> request = null;
        Response<ListActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActivitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all executions of a state machine or a Map Run. You can list all executions related to a state machine by
     * specifying a state machine Amazon Resource Name (ARN), or those related to a Map Run by specifying a Map Run ARN.
     * Using this API action, you can also list all <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-executions.html">redriven</a> executions.
     * </p>
     * <p>
     * You can also provide a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a> ARN or <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a> ARN
     * to list the executions associated with a specific alias or version.
     * </p>
     * <p>
     * Results are sorted by time, with the most recent execution first.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * <p>
     * This API action is not supported by <code>EXPRESS</code> state machines.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineTypeNotSupportedException
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @sample AWSStepFunctions.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExecutions(request);
    }

    @SdkInternalApi
    final ListExecutionsResult executeListExecutions(ListExecutionsRequest listExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExecutionsRequest> request = null;
        Response<ListExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Map Runs that were started by a given state machine execution. Use this API action to obtain Map Run
     * ARNs, and then call <code>DescribeMapRun</code> to obtain more information, if needed.
     * </p>
     * 
     * @param listMapRunsRequest
     * @return Result of the ListMapRuns operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @sample AWSStepFunctions.ListMapRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListMapRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMapRunsResult listMapRuns(ListMapRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListMapRuns(request);
    }

    @SdkInternalApi
    final ListMapRunsResult executeListMapRuns(ListMapRunsRequest listMapRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMapRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMapRunsRequest> request = null;
        Response<ListMapRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMapRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMapRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMapRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMapRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMapRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">aliases</a> for a
     * specified state machine ARN. Results are sorted by time, with the most recently created aliases listed first.
     * </p>
     * <p>
     * To list aliases that reference a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a>, you
     * can specify the version ARN in the <code>stateMachineArn</code> parameter.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteStateMachineAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listStateMachineAliasesRequest
     * @return Result of the ListStateMachineAliases operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @sample AWSStepFunctions.ListStateMachineAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachineAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStateMachineAliasesResult listStateMachineAliases(ListStateMachineAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListStateMachineAliases(request);
    }

    @SdkInternalApi
    final ListStateMachineAliasesResult executeListStateMachineAliases(ListStateMachineAliasesRequest listStateMachineAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStateMachineAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStateMachineAliasesRequest> request = null;
        Response<ListStateMachineAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStateMachineAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStateMachineAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStateMachineAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStateMachineAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStateMachineAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">versions</a> for
     * the specified state machine Amazon Resource Name (ARN).
     * </p>
     * <p>
     * The results are sorted in descending order of the version creation time.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PublishStateMachineVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteStateMachineVersion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listStateMachineVersionsRequest
     * @return Result of the ListStateMachineVersions operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @sample AWSStepFunctions.ListStateMachineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStateMachineVersionsResult listStateMachineVersions(ListStateMachineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListStateMachineVersions(request);
    }

    @SdkInternalApi
    final ListStateMachineVersionsResult executeListStateMachineVersions(ListStateMachineVersionsRequest listStateMachineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStateMachineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStateMachineVersionsRequest> request = null;
        Response<ListStateMachineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStateMachineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStateMachineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStateMachineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStateMachineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStateMachineVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing state machines.
     * </p>
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param listStateMachinesRequest
     * @return Result of the ListStateMachines operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @sample AWSStepFunctions.ListStateMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStateMachinesResult listStateMachines(ListStateMachinesRequest request) {
        request = beforeClientExecution(request);
        return executeListStateMachines(request);
    }

    @SdkInternalApi
    final ListStateMachinesResult executeListStateMachines(ListStateMachinesRequest listStateMachinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStateMachinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStateMachinesRequest> request = null;
        Response<ListStateMachinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStateMachinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStateMachinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStateMachines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStateMachinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStateMachinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags for a given resource.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @sample AWSStepFunctions.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a> from
     * the current revision of a state machine. Use versions to create immutable snapshots of your state machine. You
     * can start executions from versions either directly or with an alias. To create an alias, use
     * <a>CreateStateMachineAlias</a>.
     * </p>
     * <p>
     * You can publish up to 1000 versions for each state machine. You must manually delete unused versions using the
     * <a>DeleteStateMachineVersion</a> API action.
     * </p>
     * <p>
     * <code>PublishStateMachineVersion</code> is an idempotent API. It doesn't create a duplicate state machine version
     * if it already exists for the current revision. Step Functions bases <code>PublishStateMachineVersion</code>'s
     * idempotency check on the <code>stateMachineArn</code>, <code>name</code>, and <code>revisionId</code> parameters.
     * Requests with the same parameters return a successful idempotent response. If you don't specify a
     * <code>revisionId</code>, Step Functions checks for a previously published version of the state machine's current
     * revision.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteStateMachineVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineVersions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param publishStateMachineVersionRequest
     * @return Result of the PublishStateMachineVersion operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.</p>
     *         <p>
     *         HTTP Status Code: 402
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.
     *         </p>
     *         <p>
     *         HTTP Status Code: 409
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @sample AWSStepFunctions.PublishStateMachineVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/PublishStateMachineVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PublishStateMachineVersionResult publishStateMachineVersion(PublishStateMachineVersionRequest request) {
        request = beforeClientExecution(request);
        return executePublishStateMachineVersion(request);
    }

    @SdkInternalApi
    final PublishStateMachineVersionResult executePublishStateMachineVersion(PublishStateMachineVersionRequest publishStateMachineVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(publishStateMachineVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishStateMachineVersionRequest> request = null;
        Response<PublishStateMachineVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishStateMachineVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(publishStateMachineVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishStateMachineVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishStateMachineVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PublishStateMachineVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restarts unsuccessful executions of Standard workflows that didn't complete successfully in the last 14 days.
     * These include failed, aborted, or timed out executions. When you <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-executions.html">redrive</a> an execution, it
     * continues the failed execution from the unsuccessful step and uses the same input. Step Functions preserves the
     * results and execution history of the successful steps, and doesn't rerun these steps when you redrive an
     * execution. Redriven executions use the same state machine definition and execution ARN as the original execution
     * attempt.
     * </p>
     * <p>
     * For workflows that include an <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-map-state.html">Inline Map</a>
     * or <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-parallel-state.html">Parallel
     * </a> state, <code>RedriveExecution</code> API action reschedules and redrives only the iterations and branches
     * that failed or aborted.
     * </p>
     * <p>
     * To redrive a workflow that includes a Distributed Map state whose Map Run failed, you must redrive the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/use-dist-map-orchestrate-large-scale-parallel-workloads.html#dist-map-orchestrate-parallel-workloads-key-terms"
     * >parent workflow</a>. The parent workflow redrives all the unsuccessful states, including a failed Map Run. If a
     * Map Run was not started in the original execution attempt, the redriven parent workflow starts the Map Run.
     * </p>
     * <note>
     * <p>
     * This API action is not supported by <code>EXPRESS</code> state machines.
     * </p>
     * <p>
     * However, you can restart the unsuccessful executions of Express child workflows in a Distributed Map by redriving
     * its Map Run. When you redrive a Map Run, the Express child workflows are rerun using the <a>StartExecution</a>
     * API action. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">Redriving Map Runs</a>.
     * </p>
     * </note>
     * <p>
     * You can redrive executions if your original execution meets the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The execution status isn't <code>SUCCEEDED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your workflow execution has not exceeded the redrivable period of 14 days. Redrivable period refers to the time
     * during which you can redrive a given execution. This period starts from the day a state machine completes its
     * execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The workflow execution has not exceeded the maximum open time of one year. For more information about state
     * machine quotas, see <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/limits-overview.html#service-limits-state-machine-executions"
     * >Quotas related to state machine executions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The execution event history count is less than 24,999. Redriven executions append their event history to the
     * existing event history. Make sure your workflow execution contains less than 24,999 events to accommodate the
     * <code>ExecutionRedriven</code> history event and at least one other history event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveExecutionRequest
     * @return Result of the RedriveExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws ExecutionNotRedrivableException
     *         The execution Amazon Resource Name (ARN) that you specified for <code>executionArn</code> cannot be
     *         redriven.
     * @throws ExecutionLimitExceededException
     *         The maximum number of running executions has been reached. Running executions must end or be stopped
     *         before a new execution can be started.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.RedriveExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/RedriveExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RedriveExecutionResult redriveExecution(RedriveExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeRedriveExecution(request);
    }

    @SdkInternalApi
    final RedriveExecutionResult executeRedriveExecution(RedriveExecutionRequest redriveExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(redriveExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RedriveExecutionRequest> request = null;
        Response<RedriveExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RedriveExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(redriveExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RedriveExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RedriveExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RedriveExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by activity workers, Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token"
     * >callback</a> pattern, and optionally Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-sync">job run</a>
     * pattern to report that the task identified by the <code>taskToken</code> failed.
     * </p>
     * 
     * @param sendTaskFailureRequest
     * @return Result of the SendTaskFailure operation returned by the service.
     * @throws TaskDoesNotExistException
     *         The activity does not exist.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @throws TaskTimedOutException
     *         The task token has either expired or the task associated with the token has already been closed.
     * @sample AWSStepFunctions.SendTaskFailure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskFailure" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendTaskFailureResult sendTaskFailure(SendTaskFailureRequest request) {
        request = beforeClientExecution(request);
        return executeSendTaskFailure(request);
    }

    @SdkInternalApi
    final SendTaskFailureResult executeSendTaskFailure(SendTaskFailureRequest sendTaskFailureRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskFailureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskFailureRequest> request = null;
        Response<SendTaskFailureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskFailureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskFailureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTaskFailure");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskFailureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskFailureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by activity workers and Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token"
     * >callback</a> pattern, and optionally Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-sync">job run</a>
     * pattern to report to Step Functions that the task represented by the specified <code>taskToken</code> is still
     * making progress. This action resets the <code>Heartbeat</code> clock. The <code>Heartbeat</code> threshold is
     * specified in the state machine's Amazon States Language definition (<code>HeartbeatSeconds</code>). This action
     * does not in itself create an event in the execution history. However, if the task times out, the execution
     * history contains an <code>ActivityTimedOut</code> entry for activities, or a <code>TaskTimedOut</code> entry for
     * tasks using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-sync">job run</a> or
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token">
     * callback</a> pattern.
     * </p>
     * <note>
     * <p>
     * The <code>Timeout</code> of a task, defined in the state machine's Amazon States Language definition, is its
     * maximum allowed duration, regardless of the number of <a>SendTaskHeartbeat</a> requests received. Use
     * <code>HeartbeatSeconds</code> to configure the timeout interval for heartbeats.
     * </p>
     * </note>
     * 
     * @param sendTaskHeartbeatRequest
     * @return Result of the SendTaskHeartbeat operation returned by the service.
     * @throws TaskDoesNotExistException
     *         The activity does not exist.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @throws TaskTimedOutException
     *         The task token has either expired or the task associated with the token has already been closed.
     * @sample AWSStepFunctions.SendTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskHeartbeat" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendTaskHeartbeatResult sendTaskHeartbeat(SendTaskHeartbeatRequest request) {
        request = beforeClientExecution(request);
        return executeSendTaskHeartbeat(request);
    }

    @SdkInternalApi
    final SendTaskHeartbeatResult executeSendTaskHeartbeat(SendTaskHeartbeatRequest sendTaskHeartbeatRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskHeartbeatRequest> request = null;
        Response<SendTaskHeartbeatResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskHeartbeatRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTaskHeartbeat");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskHeartbeatResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskHeartbeatResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by activity workers, Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token"
     * >callback</a> pattern, and optionally Task states using the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-sync">job run</a>
     * pattern to report that the task identified by the <code>taskToken</code> completed successfully.
     * </p>
     * 
     * @param sendTaskSuccessRequest
     * @return Result of the SendTaskSuccess operation returned by the service.
     * @throws TaskDoesNotExistException
     *         The activity does not exist.
     * @throws InvalidOutputException
     *         The provided JSON output data is not valid.
     * @throws InvalidTokenException
     *         The provided token is not valid.
     * @throws TaskTimedOutException
     *         The task token has either expired or the task associated with the token has already been closed.
     * @sample AWSStepFunctions.SendTaskSuccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskSuccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendTaskSuccessResult sendTaskSuccess(SendTaskSuccessRequest request) {
        request = beforeClientExecution(request);
        return executeSendTaskSuccess(request);
    }

    @SdkInternalApi
    final SendTaskSuccessResult executeSendTaskSuccess(SendTaskSuccessRequest sendTaskSuccessRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskSuccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskSuccessRequest> request = null;
        Response<SendTaskSuccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskSuccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskSuccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTaskSuccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskSuccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskSuccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a state machine execution.
     * </p>
     * <p>
     * A qualified state machine ARN can either refer to a <i>Distributed Map state</i> defined within a state machine,
     * a version ARN, or an alias ARN.
     * </p>
     * <p>
     * The following are some examples of qualified and unqualified state machine ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to a <i>Distributed Map state</i> with a label
     * <code>mapStateLabel</code> in a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:partition:states:region:account-id:stateMachine:myStateMachine/mapStateLabel</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a <i>Distributed Map state</i>, the request fails
     * with <code>ValidationException</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a version ARN or an alias ARN, the request starts
     * execution for that version or alias.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following unqualified state machine ARN refers to a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you start an execution with an unqualified state machine ARN, Step Functions uses the latest revision of the
     * state machine for the execution.
     * </p>
     * <p>
     * To start executions of a state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a>, call
     * <code>StartExecution</code> and provide the version ARN or the ARN of an <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a> that
     * points to the version.
     * </p>
     * <note>
     * <p>
     * <code>StartExecution</code> is idempotent for <code>STANDARD</code> workflows. For a <code>STANDARD</code>
     * workflow, if you call <code>StartExecution</code> with the same name and input as a running execution, the call
     * succeeds and return the same response as the original request. If the execution is closed or if the input is
     * different, it returns a <code>400 ExecutionAlreadyExists</code> error. You can reuse names after 90 days.
     * </p>
     * <p>
     * <code>StartExecution</code> isn't idempotent for <code>EXPRESS</code> workflows.
     * </p>
     * </note>
     * 
     * @param startExecutionRequest
     * @return Result of the StartExecution operation returned by the service.
     * @throws ExecutionLimitExceededException
     *         The maximum number of running executions has been reached. Running executions must end or be stopped
     *         before a new execution can be started.
     * @throws ExecutionAlreadyExistsException
     *         The execution has the same <code>name</code> as another execution (but a different <code>input</code>
     *         ).</p> <note>
     *         <p>
     *         Executions with the same <code>name</code> and <code>input</code> are considered idempotent.
     *         </p>
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidExecutionInputException
     *         The provided JSON input data is not valid.
     * @throws InvalidNameException
     *         The provided name is not valid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.StartExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartExecutionResult startExecution(StartExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartExecution(request);
    }

    @SdkInternalApi
    final StartExecutionResult executeStartExecution(StartExecutionRequest startExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExecutionRequest> request = null;
        Response<StartExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a Synchronous Express state machine execution. <code>StartSyncExecution</code> is not available for
     * <code>STANDARD</code> workflows.
     * </p>
     * <note>
     * <p>
     * <code>StartSyncExecution</code> will return a <code>200 OK</code> response, even if your execution fails, because
     * the status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
     * prevent your execution from running, such as permissions errors, limit errors, or issues with your state machine
     * code and configuration.
     * </p>
     * </note> <note>
     * <p>
     * This API action isn't logged in CloudTrail.
     * </p>
     * </note>
     * 
     * @param startSyncExecutionRequest
     * @return Result of the StartSyncExecution operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidExecutionInputException
     *         The provided JSON input data is not valid.
     * @throws InvalidNameException
     *         The provided name is not valid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineTypeNotSupportedException
     * @sample AWSStepFunctions.StartSyncExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartSyncExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSyncExecutionResult startSyncExecution(StartSyncExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartSyncExecution(request);
    }

    @SdkInternalApi
    final StartSyncExecutionResult executeStartSyncExecution(StartSyncExecutionRequest startSyncExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startSyncExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSyncExecutionRequest> request = null;
        Response<StartSyncExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSyncExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSyncExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSyncExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "sync-";
                String resolvedHostPrefix = String.format("sync-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSyncExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSyncExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an execution.
     * </p>
     * <p>
     * This API action is not supported by <code>EXPRESS</code> state machines.
     * </p>
     * 
     * @param stopExecutionRequest
     * @return Result of the StopExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.StopExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StopExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopExecutionResult stopExecution(StopExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopExecution(request);
    }

    @SdkInternalApi
    final StopExecutionResult executeStopExecution(StopExecutionRequest stopExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopExecutionRequest> request = null;
        Response<StopExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add a tag to a Step Functions resource.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws TooManyTagsException
     *         You've exceeded the number of tags allowed for a resource. See the <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html"> Limits Topic</a> in the Step
     *         Functions Developer Guide.
     * @sample AWSStepFunctions.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts the definition of a single state and executes it. You can test a state without creating a state machine
     * or updating an existing state machine. Using this API, you can test the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A state's <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-input-output-dataflow"
     * >input and output processing</a> data flow
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-services.html">Amazon Web Services
     * service integration</a> request and response
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-third-party-apis.html">HTTP Task</a>
     * request and response
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call this API on only one state at a time. The states that you can test include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-task-state.html#task-types">
     * All Task types</a> except <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-activities.html">Activity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-pass-state.html">Pass</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-wait-state.html">Wait</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-choice-state.html">Choice</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-succeed-state.html">Succeed</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-fail-state.html">Fail</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>TestState</code> API assumes an IAM role which must contain the required IAM permissions for the
     * resources your state is accessing. For information about the permissions a state might need, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>.
     * </p>
     * <p>
     * The <code>TestState</code> API can run for up to five minutes. If the execution of a state exceeds this duration,
     * it fails with the <code>States.Timeout</code> error.
     * </p>
     * <p>
     * <code>TestState</code> doesn't support <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-activities.html">Activity tasks</a>,
     * <code>.sync</code> or <code>.waitForTaskToken</code> <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html">service integration
     * patterns</a>, <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-parallel-state.html"
     * >Parallel</a>, or <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-map-state.html">Map</a> states.
     * </p>
     * 
     * @param testStateRequest
     * @return Result of the TestState operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidDefinitionException
     *         The provided Amazon States Language definition is not valid.
     * @throws InvalidExecutionInputException
     *         The provided JSON input data is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.TestState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TestState" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestStateResult testState(TestStateRequest request) {
        request = beforeClientExecution(request);
        return executeTestState(request);
    }

    @SdkInternalApi
    final TestStateResult executeTestState(TestStateRequest testStateRequest) {

        ExecutionContext executionContext = createExecutionContext(testStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestStateRequest> request = null;
        Response<TestStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "sync-";
                String resolvedHostPrefix = String.format("sync-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestStateResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a tag from a Step Functions resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @sample AWSStepFunctions.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an in-progress Map Run's configuration to include changes to the settings that control maximum
     * concurrency and Map Run failure.
     * </p>
     * 
     * @param updateMapRunRequest
     * @return Result of the UpdateMapRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.UpdateMapRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateMapRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMapRunResult updateMapRun(UpdateMapRunRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMapRun(request);
    }

    @SdkInternalApi
    final UpdateMapRunResult executeUpdateMapRun(UpdateMapRunRequest updateMapRunRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMapRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMapRunRequest> request = null;
        Response<UpdateMapRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMapRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMapRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMapRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMapRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMapRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing state machine by modifying its <code>definition</code>, <code>roleArn</code>, or
     * <code>loggingConfiguration</code>. Running executions will continue to use the previous <code>definition</code>
     * and <code>roleArn</code>. You must include at least one of <code>definition</code> or <code>roleArn</code> or you
     * will receive a <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * A qualified state machine ARN refers to a <i>Distributed Map state</i> defined within a state machine. For
     * example, the qualified state machine ARN
     * <code>arn:partition:states:region:account-id:stateMachine:stateMachineName/mapStateLabel</code> refers to a
     * <i>Distributed Map state</i> with a label <code>mapStateLabel</code> in the state machine named
     * <code>stateMachineName</code>.
     * </p>
     * <p>
     * A qualified state machine ARN can either refer to a <i>Distributed Map state</i> defined within a state machine,
     * a version ARN, or an alias ARN.
     * </p>
     * <p>
     * The following are some examples of qualified and unqualified state machine ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to a <i>Distributed Map state</i> with a label
     * <code>mapStateLabel</code> in a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:partition:states:region:account-id:stateMachine:myStateMachine/mapStateLabel</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a <i>Distributed Map state</i>, the request fails
     * with <code>ValidationException</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following qualified state machine ARN refers to an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <note>
     * <p>
     * If you provide a qualified state machine ARN that refers to a version ARN or an alias ARN, the request starts
     * execution for that version or alias.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The following unqualified state machine ARN refers to a state machine named <code>myStateMachine</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update your state machine, you can set the <code>publish</code> parameter to <code>true</code> in the
     * same action to publish a new <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html">version</a>. This
     * way, you can opt-in to strict versioning of your state machine.
     * </p>
     * <note>
     * <p>
     * Step Functions assigns monotonically increasing integers for state machine versions, starting at version number
     * 1.
     * </p>
     * </note> <note>
     * <p>
     * All <code>StartExecution</code> calls within a few seconds use the updated <code>definition</code> and
     * <code>roleArn</code>. Executions started immediately after you call <code>UpdateStateMachine</code> may use the
     * previous state machine <code>definition</code> and <code>roleArn</code>.
     * </p>
     * </note>
     * 
     * @param updateStateMachineRequest
     * @return Result of the UpdateStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws InvalidDefinitionException
     *         The provided Amazon States Language definition is not valid.
     * @throws InvalidLoggingConfigurationException
     * @throws InvalidTracingConfigurationException
     *         Your <code>tracingConfiguration</code> key does not match, or <code>enabled</code> has not been set to
     *         <code>true</code> or <code>false</code>.
     * @throws MissingRequiredParameterException
     *         Request is missing a required parameter. This error occurs if both <code>definition</code> and
     *         <code>roleArn</code> are not specified.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.</p>
     *         <p>
     *         HTTP Status Code: 402
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.
     *         </p>
     *         <p>
     *         HTTP Status Code: 409
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.UpdateStateMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachine" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStateMachineResult updateStateMachine(UpdateStateMachineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStateMachine(request);
    }

    @SdkInternalApi
    final UpdateStateMachineResult executeUpdateStateMachine(UpdateStateMachineRequest updateStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStateMachineRequest> request = null;
        Response<UpdateStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStateMachineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStateMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing state machine <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html">alias</a> by
     * modifying its <code>description</code> or <code>routingConfiguration</code>.
     * </p>
     * <p>
     * You must specify at least one of the <code>description</code> or <code>routingConfiguration</code> parameters to
     * update a state machine alias.
     * </p>
     * <note>
     * <p>
     * <code>UpdateStateMachineAlias</code> is an idempotent API. Step Functions bases the idempotency check on the
     * <code>stateMachineAliasArn</code>, <code>description</code>, and <code>routingConfiguration</code> parameters.
     * Requests with the same parameters return an idempotent response.
     * </p>
     * </note> <note>
     * <p>
     * This operation is eventually consistent. All <a>StartExecution</a> requests made within a few seconds use the
     * latest alias configuration. Executions started immediately after calling <code>UpdateStateMachineAlias</code> may
     * use the previous routing configuration.
     * </p>
     * </note>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeStateMachineAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListStateMachineAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteStateMachineAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStateMachineAliasRequest
     * @return Result of the UpdateStateMachineAlias operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is not valid.
     * @throws ResourceNotFoundException
     *         Could not find the referenced resource.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state. This error occurs when there're
     *         concurrent requests for <a>DeleteStateMachineVersion</a>, <a>PublishStateMachineVersion</a>, or
     *         <a>UpdateStateMachine</a> with the <code>publish</code> parameter set to <code>true</code>.</p>
     *         <p>
     *         HTTP Status Code: 409
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @sample AWSStepFunctions.UpdateStateMachineAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachineAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateStateMachineAliasResult updateStateMachineAlias(UpdateStateMachineAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStateMachineAlias(request);
    }

    @SdkInternalApi
    final UpdateStateMachineAliasResult executeUpdateStateMachineAlias(UpdateStateMachineAliasRequest updateStateMachineAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStateMachineAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStateMachineAliasRequest> request = null;
        Response<UpdateStateMachineAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStateMachineAliasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateStateMachineAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStateMachineAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStateMachineAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateStateMachineAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates the syntax of a state machine definition.
     * </p>
     * <p>
     * You can validate that a state machine definition is correct without creating a state machine resource. Step
     * Functions will implicitly perform the same syntax check when you invoke <code>CreateStateMachine</code> and
     * <code>UpdateStateMachine</code>. State machine definitions are specified using a JSON-based, structured language.
     * For more information on Amazon States Language see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> (ASL).
     * </p>
     * <p>
     * Suggested uses for <code>ValidateStateMachineDefinition</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Integrate automated checks into your code review or Continuous Integration (CI) process to validate state machine
     * definitions before starting deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Run the validation from a Git pre-commit hook to check your state machine definitions before committing them to
     * your source repository.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Errors found in the state machine definition will be returned in the response as a list of <b>diagnostic
     * elements</b>, rather than raise an exception.
     * </p>
     * </note>
     * 
     * @param validateStateMachineDefinitionRequest
     * @return Result of the ValidateStateMachineDefinition operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSStepFunctions.ValidateStateMachineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ValidateStateMachineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateStateMachineDefinitionResult validateStateMachineDefinition(ValidateStateMachineDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeValidateStateMachineDefinition(request);
    }

    @SdkInternalApi
    final ValidateStateMachineDefinitionResult executeValidateStateMachineDefinition(ValidateStateMachineDefinitionRequest validateStateMachineDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(validateStateMachineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateStateMachineDefinitionRequest> request = null;
        Response<ValidateStateMachineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateStateMachineDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateStateMachineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SFN");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateStateMachineDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateStateMachineDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateStateMachineDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

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

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
