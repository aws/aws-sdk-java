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
package com.amazonaws.services.chatbot;

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

import com.amazonaws.services.chatbot.AWSChatbotClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chatbot.model.*;

import com.amazonaws.services.chatbot.model.transform.*;

/**
 * Client for accessing AWS Chatbot. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * AWS Chatbot API
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSChatbotClient extends AmazonWebServiceClient implements AWSChatbot {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSChatbot.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "chatbot";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescribeSlackWorkspacesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DescribeSlackWorkspacesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateSlackChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.UpdateSlackChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ListTeamsChannelConfigurationsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ListTeamsChannelConfigurationsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateChimeWebhookConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.UpdateChimeWebhookConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescribeSlackChannelConfigurationsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DescribeSlackChannelConfigurationsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescribeChimeWebhookConfigurationsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DescribeChimeWebhookConfigurationsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GetAccountPreferencesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.GetAccountPreferencesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteTeamsChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteTeamsChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteSlackUserIdentityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteSlackUserIdentityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteSlackWorkspaceAuthorizationFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteSlackWorkspaceAuthorizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateTeamsChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.UpdateTeamsChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateAccountPreferencesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.UpdateAccountPreferencesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateSlackChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.CreateSlackChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ListMicrosoftTeamsConfiguredTeamsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ListMicrosoftTeamsConfiguredTeamsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteMicrosoftTeamsUserIdentityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteMicrosoftTeamsUserIdentityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteSlackChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteSlackChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteTeamsConfiguredTeamException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteTeamsConfiguredTeamExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ListMicrosoftTeamsUserIdentitiesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.ListMicrosoftTeamsUserIdentitiesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateChimeWebhookConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.CreateChimeWebhookConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateTeamsChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.CreateTeamsChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GetTeamsChannelConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.GetTeamsChannelConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DescribeSlackUserIdentitiesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DescribeSlackUserIdentitiesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteChimeWebhookConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chatbot.model.transform.DeleteChimeWebhookConfigurationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chatbot.model.AWSChatbotException.class));

    public static AWSChatbotClientBuilder builder() {
        return AWSChatbotClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Chatbot using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSChatbotClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Chatbot using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSChatbotClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("chatbot.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chatbot/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chatbot/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Creates Chime Webhook Configuration
     * 
     * @param createChimeWebhookConfigurationRequest
     * @return Result of the CreateChimeWebhookConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChimeWebhookConfigurationResult createChimeWebhookConfiguration(CreateChimeWebhookConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChimeWebhookConfiguration(request);
    }

    @SdkInternalApi
    final CreateChimeWebhookConfigurationResult executeCreateChimeWebhookConfiguration(
            CreateChimeWebhookConfigurationRequest createChimeWebhookConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createChimeWebhookConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChimeWebhookConfigurationRequest> request = null;
        Response<CreateChimeWebhookConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChimeWebhookConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createChimeWebhookConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChimeWebhookConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChimeWebhookConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateChimeWebhookConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates MS Teams Channel Configuration
     * 
     * @param createMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the CreateMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMicrosoftTeamsChannelConfigurationResult createMicrosoftTeamsChannelConfiguration(CreateMicrosoftTeamsChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMicrosoftTeamsChannelConfiguration(request);
    }

    @SdkInternalApi
    final CreateMicrosoftTeamsChannelConfigurationResult executeCreateMicrosoftTeamsChannelConfiguration(
            CreateMicrosoftTeamsChannelConfigurationRequest createMicrosoftTeamsChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createMicrosoftTeamsChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMicrosoftTeamsChannelConfigurationRequest> request = null;
        Response<CreateMicrosoftTeamsChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMicrosoftTeamsChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMicrosoftTeamsChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMicrosoftTeamsChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMicrosoftTeamsChannelConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateMicrosoftTeamsChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates Slack Channel Configuration
     * 
     * @param createSlackChannelConfigurationRequest
     * @return Result of the CreateSlackChannelConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws LimitExceededException
     *         You have exceeded a service limit for AWS Chatbot.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws CreateSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ConflictException
     *         There was an issue processing your request.
     * @sample AWSChatbot.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSlackChannelConfigurationResult createSlackChannelConfiguration(CreateSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final CreateSlackChannelConfigurationResult executeCreateSlackChannelConfiguration(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSlackChannelConfigurationRequest> request = null;
        Response<CreateSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSlackChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a Chime Webhook Configuration
     * 
     * @param deleteChimeWebhookConfigurationRequest
     * @return Result of the DeleteChimeWebhookConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChimeWebhookConfigurationResult deleteChimeWebhookConfiguration(DeleteChimeWebhookConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChimeWebhookConfiguration(request);
    }

    @SdkInternalApi
    final DeleteChimeWebhookConfigurationResult executeDeleteChimeWebhookConfiguration(
            DeleteChimeWebhookConfigurationRequest deleteChimeWebhookConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChimeWebhookConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChimeWebhookConfigurationRequest> request = null;
        Response<DeleteChimeWebhookConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChimeWebhookConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteChimeWebhookConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChimeWebhookConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChimeWebhookConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteChimeWebhookConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes MS Teams Channel Configuration
     * 
     * @param deleteMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the DeleteMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMicrosoftTeamsChannelConfigurationResult deleteMicrosoftTeamsChannelConfiguration(DeleteMicrosoftTeamsChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMicrosoftTeamsChannelConfiguration(request);
    }

    @SdkInternalApi
    final DeleteMicrosoftTeamsChannelConfigurationResult executeDeleteMicrosoftTeamsChannelConfiguration(
            DeleteMicrosoftTeamsChannelConfigurationRequest deleteMicrosoftTeamsChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMicrosoftTeamsChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMicrosoftTeamsChannelConfigurationRequest> request = null;
        Response<DeleteMicrosoftTeamsChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMicrosoftTeamsChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMicrosoftTeamsChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMicrosoftTeamsChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMicrosoftTeamsChannelConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteMicrosoftTeamsChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the Microsoft Teams team authorization allowing for channels to be configured in that Microsoft Teams
     * team. Note that the Microsoft Teams team must have no channels configured to remove it.
     * 
     * @param deleteMicrosoftTeamsConfiguredTeamRequest
     * @return Result of the DeleteMicrosoftTeamsConfiguredTeam operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteTeamsConfiguredTeamException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsConfiguredTeam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsConfiguredTeam"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMicrosoftTeamsConfiguredTeamResult deleteMicrosoftTeamsConfiguredTeam(DeleteMicrosoftTeamsConfiguredTeamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMicrosoftTeamsConfiguredTeam(request);
    }

    @SdkInternalApi
    final DeleteMicrosoftTeamsConfiguredTeamResult executeDeleteMicrosoftTeamsConfiguredTeam(
            DeleteMicrosoftTeamsConfiguredTeamRequest deleteMicrosoftTeamsConfiguredTeamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMicrosoftTeamsConfiguredTeamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMicrosoftTeamsConfiguredTeamRequest> request = null;
        Response<DeleteMicrosoftTeamsConfiguredTeamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMicrosoftTeamsConfiguredTeamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMicrosoftTeamsConfiguredTeamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMicrosoftTeamsConfiguredTeam");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMicrosoftTeamsConfiguredTeamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMicrosoftTeamsConfiguredTeamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a Teams user identity
     * 
     * @param deleteMicrosoftTeamsUserIdentityRequest
     * @return Result of the DeleteMicrosoftTeamsUserIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws DeleteMicrosoftTeamsUserIdentityException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteMicrosoftTeamsUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMicrosoftTeamsUserIdentityResult deleteMicrosoftTeamsUserIdentity(DeleteMicrosoftTeamsUserIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMicrosoftTeamsUserIdentity(request);
    }

    @SdkInternalApi
    final DeleteMicrosoftTeamsUserIdentityResult executeDeleteMicrosoftTeamsUserIdentity(
            DeleteMicrosoftTeamsUserIdentityRequest deleteMicrosoftTeamsUserIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMicrosoftTeamsUserIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMicrosoftTeamsUserIdentityRequest> request = null;
        Response<DeleteMicrosoftTeamsUserIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMicrosoftTeamsUserIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMicrosoftTeamsUserIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMicrosoftTeamsUserIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMicrosoftTeamsUserIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMicrosoftTeamsUserIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes Slack Channel Configuration
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @return Result of the DeleteSlackChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlackChannelConfigurationResult deleteSlackChannelConfiguration(DeleteSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSlackChannelConfigurationResult executeDeleteSlackChannelConfiguration(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlackChannelConfigurationRequest> request = null;
        Response<DeleteSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSlackChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a Slack user identity
     * 
     * @param deleteSlackUserIdentityRequest
     * @return Result of the DeleteSlackUserIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws DeleteSlackUserIdentityException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DeleteSlackUserIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackUserIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlackUserIdentityResult deleteSlackUserIdentity(DeleteSlackUserIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlackUserIdentity(request);
    }

    @SdkInternalApi
    final DeleteSlackUserIdentityResult executeDeleteSlackUserIdentity(DeleteSlackUserIdentityRequest deleteSlackUserIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlackUserIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlackUserIdentityRequest> request = null;
        Response<DeleteSlackUserIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlackUserIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSlackUserIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlackUserIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlackUserIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSlackUserIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the Slack workspace authorization that allows channels to be configured in that workspace. This requires
     * all configured channels in the workspace to be deleted.
     * 
     * @param deleteSlackWorkspaceAuthorizationRequest
     * @return Result of the DeleteSlackWorkspaceAuthorization operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DeleteSlackWorkspaceAuthorizationException
     *         There was an issue deleting your Slack workspace.
     * @sample AWSChatbot.DeleteSlackWorkspaceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackWorkspaceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlackWorkspaceAuthorizationResult deleteSlackWorkspaceAuthorization(DeleteSlackWorkspaceAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlackWorkspaceAuthorization(request);
    }

    @SdkInternalApi
    final DeleteSlackWorkspaceAuthorizationResult executeDeleteSlackWorkspaceAuthorization(
            DeleteSlackWorkspaceAuthorizationRequest deleteSlackWorkspaceAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlackWorkspaceAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlackWorkspaceAuthorizationRequest> request = null;
        Response<DeleteSlackWorkspaceAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlackWorkspaceAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSlackWorkspaceAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlackWorkspaceAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlackWorkspaceAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSlackWorkspaceAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists Chime Webhook Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeChimeWebhookConfigurationsRequest
     * @return Result of the DescribeChimeWebhookConfigurations operation returned by the service.
     * @throws DescribeChimeWebhookConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeChimeWebhookConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChimeWebhookConfigurationsResult describeChimeWebhookConfigurations(DescribeChimeWebhookConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChimeWebhookConfigurations(request);
    }

    @SdkInternalApi
    final DescribeChimeWebhookConfigurationsResult executeDescribeChimeWebhookConfigurations(
            DescribeChimeWebhookConfigurationsRequest describeChimeWebhookConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChimeWebhookConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChimeWebhookConfigurationsRequest> request = null;
        Response<DescribeChimeWebhookConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChimeWebhookConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChimeWebhookConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChimeWebhookConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChimeWebhookConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeChimeWebhookConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists Slack Channel Configurations optionally filtered by ChatConfigurationArn
     * 
     * @param describeSlackChannelConfigurationsRequest
     * @return Result of the DescribeSlackChannelConfigurations operation returned by the service.
     * @throws DescribeSlackChannelConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSlackChannelConfigurationsResult describeSlackChannelConfigurations(DescribeSlackChannelConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSlackChannelConfigurations(request);
    }

    @SdkInternalApi
    final DescribeSlackChannelConfigurationsResult executeDescribeSlackChannelConfigurations(
            DescribeSlackChannelConfigurationsRequest describeSlackChannelConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSlackChannelConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSlackChannelConfigurationsRequest> request = null;
        Response<DescribeSlackChannelConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSlackChannelConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSlackChannelConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSlackChannelConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSlackChannelConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSlackChannelConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists all Slack user identities with a mapped role.
     * 
     * @param describeSlackUserIdentitiesRequest
     * @return Result of the DescribeSlackUserIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws DescribeSlackUserIdentitiesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.DescribeSlackUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSlackUserIdentitiesResult describeSlackUserIdentities(DescribeSlackUserIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSlackUserIdentities(request);
    }

    @SdkInternalApi
    final DescribeSlackUserIdentitiesResult executeDescribeSlackUserIdentities(DescribeSlackUserIdentitiesRequest describeSlackUserIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSlackUserIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSlackUserIdentitiesRequest> request = null;
        Response<DescribeSlackUserIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSlackUserIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSlackUserIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSlackUserIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSlackUserIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSlackUserIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists all authorized Slack Workspaces for AWS Account
     * 
     * @param describeSlackWorkspacesRequest
     * @return Result of the DescribeSlackWorkspaces operation returned by the service.
     * @throws DescribeSlackWorkspacesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.DescribeSlackWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSlackWorkspacesResult describeSlackWorkspaces(DescribeSlackWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSlackWorkspaces(request);
    }

    @SdkInternalApi
    final DescribeSlackWorkspacesResult executeDescribeSlackWorkspaces(DescribeSlackWorkspacesRequest describeSlackWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSlackWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSlackWorkspacesRequest> request = null;
        Response<DescribeSlackWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSlackWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSlackWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSlackWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSlackWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSlackWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get Chatbot account level preferences
     * 
     * @param getAccountPreferencesRequest
     * @return Result of the GetAccountPreferences operation returned by the service.
     * @throws GetAccountPreferencesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.GetAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetAccountPreferences" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountPreferencesResult getAccountPreferences(GetAccountPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountPreferences(request);
    }

    @SdkInternalApi
    final GetAccountPreferencesResult executeGetAccountPreferences(GetAccountPreferencesRequest getAccountPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountPreferencesRequest> request = null;
        Response<GetAccountPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountPreferencesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAccountPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get a single MS Teams Channel Configurations
     * 
     * @param getMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the GetMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws GetTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.GetMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMicrosoftTeamsChannelConfigurationResult getMicrosoftTeamsChannelConfiguration(GetMicrosoftTeamsChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetMicrosoftTeamsChannelConfiguration(request);
    }

    @SdkInternalApi
    final GetMicrosoftTeamsChannelConfigurationResult executeGetMicrosoftTeamsChannelConfiguration(
            GetMicrosoftTeamsChannelConfigurationRequest getMicrosoftTeamsChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getMicrosoftTeamsChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMicrosoftTeamsChannelConfigurationRequest> request = null;
        Response<GetMicrosoftTeamsChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMicrosoftTeamsChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMicrosoftTeamsChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMicrosoftTeamsChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMicrosoftTeamsChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMicrosoftTeamsChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists MS Teams Channel Configurations optionally filtered by TeamId
     * 
     * @param listMicrosoftTeamsChannelConfigurationsRequest
     * @return Result of the ListMicrosoftTeamsChannelConfigurations operation returned by the service.
     * @throws ListTeamsChannelConfigurationsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMicrosoftTeamsChannelConfigurationsResult listMicrosoftTeamsChannelConfigurations(ListMicrosoftTeamsChannelConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListMicrosoftTeamsChannelConfigurations(request);
    }

    @SdkInternalApi
    final ListMicrosoftTeamsChannelConfigurationsResult executeListMicrosoftTeamsChannelConfigurations(
            ListMicrosoftTeamsChannelConfigurationsRequest listMicrosoftTeamsChannelConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMicrosoftTeamsChannelConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMicrosoftTeamsChannelConfigurationsRequest> request = null;
        Response<ListMicrosoftTeamsChannelConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMicrosoftTeamsChannelConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMicrosoftTeamsChannelConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMicrosoftTeamsChannelConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMicrosoftTeamsChannelConfigurationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMicrosoftTeamsChannelConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists all authorized MS teams for AWS Account
     * 
     * @param listMicrosoftTeamsConfiguredTeamsRequest
     * @return Result of the ListMicrosoftTeamsConfiguredTeams operation returned by the service.
     * @throws ListMicrosoftTeamsConfiguredTeamsException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsConfiguredTeams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsConfiguredTeams"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMicrosoftTeamsConfiguredTeamsResult listMicrosoftTeamsConfiguredTeams(ListMicrosoftTeamsConfiguredTeamsRequest request) {
        request = beforeClientExecution(request);
        return executeListMicrosoftTeamsConfiguredTeams(request);
    }

    @SdkInternalApi
    final ListMicrosoftTeamsConfiguredTeamsResult executeListMicrosoftTeamsConfiguredTeams(
            ListMicrosoftTeamsConfiguredTeamsRequest listMicrosoftTeamsConfiguredTeamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMicrosoftTeamsConfiguredTeamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMicrosoftTeamsConfiguredTeamsRequest> request = null;
        Response<ListMicrosoftTeamsConfiguredTeamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMicrosoftTeamsConfiguredTeamsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMicrosoftTeamsConfiguredTeamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMicrosoftTeamsConfiguredTeams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMicrosoftTeamsConfiguredTeamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMicrosoftTeamsConfiguredTeamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists all Microsoft Teams user identities with a mapped role.
     * 
     * @param listMicrosoftTeamsUserIdentitiesRequest
     * @return Result of the ListMicrosoftTeamsUserIdentities operation returned by the service.
     * @throws ListMicrosoftTeamsUserIdentitiesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.ListMicrosoftTeamsUserIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsUserIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMicrosoftTeamsUserIdentitiesResult listMicrosoftTeamsUserIdentities(ListMicrosoftTeamsUserIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListMicrosoftTeamsUserIdentities(request);
    }

    @SdkInternalApi
    final ListMicrosoftTeamsUserIdentitiesResult executeListMicrosoftTeamsUserIdentities(
            ListMicrosoftTeamsUserIdentitiesRequest listMicrosoftTeamsUserIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMicrosoftTeamsUserIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMicrosoftTeamsUserIdentitiesRequest> request = null;
        Response<ListMicrosoftTeamsUserIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMicrosoftTeamsUserIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMicrosoftTeamsUserIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMicrosoftTeamsUserIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMicrosoftTeamsUserIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMicrosoftTeamsUserIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieves the list of tags applied to a configuration.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @sample AWSChatbot.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
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
     * Applies the supplied tags to a configuration.
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws TooManyTagsException
     *         The supplied list of tags contains too many tags.
     * @sample AWSChatbot.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
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
     * Removes the supplied tags from a configuration
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         Customer/consumer-facing internal service exception.
     *         https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
     * @throws ServiceUnavailableException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @sample AWSChatbot.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
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
     * Update Chatbot account level preferences
     * 
     * @param updateAccountPreferencesRequest
     * @return Result of the UpdateAccountPreferences operation returned by the service.
     * @throws UpdateAccountPreferencesException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @sample AWSChatbot.UpdateAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountPreferencesResult updateAccountPreferences(UpdateAccountPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountPreferences(request);
    }

    @SdkInternalApi
    final UpdateAccountPreferencesResult executeUpdateAccountPreferences(UpdateAccountPreferencesRequest updateAccountPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountPreferencesRequest> request = null;
        Response<UpdateAccountPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccountPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccountPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates a Chime Webhook Configuration
     * 
     * @param updateChimeWebhookConfigurationRequest
     * @return Result of the UpdateChimeWebhookConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateChimeWebhookConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateChimeWebhookConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateChimeWebhookConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChimeWebhookConfigurationResult updateChimeWebhookConfiguration(UpdateChimeWebhookConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChimeWebhookConfiguration(request);
    }

    @SdkInternalApi
    final UpdateChimeWebhookConfigurationResult executeUpdateChimeWebhookConfiguration(
            UpdateChimeWebhookConfigurationRequest updateChimeWebhookConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChimeWebhookConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChimeWebhookConfigurationRequest> request = null;
        Response<UpdateChimeWebhookConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChimeWebhookConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateChimeWebhookConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChimeWebhookConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChimeWebhookConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateChimeWebhookConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates MS Teams Channel Configuration
     * 
     * @param updateMicrosoftTeamsChannelConfigurationRequest
     * @return Result of the UpdateMicrosoftTeamsChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateTeamsChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateMicrosoftTeamsChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateMicrosoftTeamsChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMicrosoftTeamsChannelConfigurationResult updateMicrosoftTeamsChannelConfiguration(UpdateMicrosoftTeamsChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMicrosoftTeamsChannelConfiguration(request);
    }

    @SdkInternalApi
    final UpdateMicrosoftTeamsChannelConfigurationResult executeUpdateMicrosoftTeamsChannelConfiguration(
            UpdateMicrosoftTeamsChannelConfigurationRequest updateMicrosoftTeamsChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMicrosoftTeamsChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMicrosoftTeamsChannelConfigurationRequest> request = null;
        Response<UpdateMicrosoftTeamsChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMicrosoftTeamsChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMicrosoftTeamsChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMicrosoftTeamsChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMicrosoftTeamsChannelConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateMicrosoftTeamsChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates Slack Channel Configuration
     * 
     * @param updateSlackChannelConfigurationRequest
     * @return Result of the UpdateSlackChannelConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         We were not able to find the resource for your request.
     * @throws InvalidParameterException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws InvalidRequestException
     *         Your request input doesn't meet the constraints that AWS Chatbot requires.
     * @throws UpdateSlackChannelConfigurationException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSChatbot.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSlackChannelConfigurationResult updateSlackChannelConfiguration(UpdateSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final UpdateSlackChannelConfigurationResult executeUpdateSlackChannelConfiguration(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSlackChannelConfigurationRequest> request = null;
        Response<UpdateSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "chatbot");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSlackChannelConfigurationResultJsonUnmarshaller());
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
