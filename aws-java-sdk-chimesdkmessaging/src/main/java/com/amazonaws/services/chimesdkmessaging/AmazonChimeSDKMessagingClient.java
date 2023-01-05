/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging;

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

import com.amazonaws.services.chimesdkmessaging.AmazonChimeSDKMessagingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.services.chimesdkmessaging.model.transform.*;

/**
 * Client for accessing Amazon Chime SDK Messaging. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Messaging APIs in this section allow software developers to send and receive messages in custom
 * messaging applications. These APIs depend on the frameworks provided by the Amazon Chime SDK Identity APIs. For more
 * information about the messaging APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Messaging.html">Amazon
 * Chime SDK messaging</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMessagingClient extends AmazonWebServiceClient implements AmazonChimeSDKMessaging {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChimeSDKMessaging.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "chime";

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
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.UnauthorizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ServiceFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ThrottledClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmessaging.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chimesdkmessaging.model.AmazonChimeSDKMessagingException.class));

    public static AmazonChimeSDKMessagingClientBuilder builder() {
        return AmazonChimeSDKMessagingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Messaging using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMessagingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Messaging using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMessagingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("messaging-chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chimesdkmessaging/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chimesdkmessaging/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a channel flow with a channel. Once associated, all messages to that channel go through channel flow
     * processors. To stop processing, use the <code>DisassociateChannelFlow</code> API.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can associate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param associateChannelFlowRequest
     * @return Result of the AssociateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.AssociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/AssociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateChannelFlowResult associateChannelFlow(AssociateChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateChannelFlow(request);
    }

    @SdkInternalApi
    final AssociateChannelFlowResult executeAssociateChannelFlow(AssociateChannelFlowRequest associateChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(associateChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateChannelFlowRequest> request = null;
        Response<AssociateChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return Result of the BatchCreateChannelMembership operation returned by the service.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMessaging.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/BatchCreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateChannelMembershipResult batchCreateChannelMembership(BatchCreateChannelMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateChannelMembership(request);
    }

    @SdkInternalApi
    final BatchCreateChannelMembershipResult executeBatchCreateChannelMembership(BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateChannelMembershipRequest> request = null;
        Response<BatchCreateChannelMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateChannelMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchCreateChannelMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateChannelMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateChannelMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchCreateChannelMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Calls back Chime SDK Messaging with a processing response message. This should be invoked from the processor
     * Lambda. This is a developer API.
     * </p>
     * <p>
     * You can return one of the following processing responses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update message content or metadata
     * </p>
     * </li>
     * <li>
     * <p>
     * Deny a message
     * </p>
     * </li>
     * <li>
     * <p>
     * Make no changes to the message
     * </p>
     * </li>
     * </ul>
     * 
     * @param channelFlowCallbackRequest
     * @return Result of the ChannelFlowCallback operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ChannelFlowCallback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelFlowCallback"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ChannelFlowCallbackResult channelFlowCallback(ChannelFlowCallbackRequest request) {
        request = beforeClientExecution(request);
        return executeChannelFlowCallback(request);
    }

    @SdkInternalApi
    final ChannelFlowCallbackResult executeChannelFlowCallback(ChannelFlowCallbackRequest channelFlowCallbackRequest) {

        ExecutionContext executionContext = createExecutionContext(channelFlowCallbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChannelFlowCallbackRequest> request = null;
        Response<ChannelFlowCallbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChannelFlowCallbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(channelFlowCallbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChannelFlowCallback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChannelFlowCallbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ChannelFlowCallbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a channel to which you can add users and send messages.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelResult createChannel(CreateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannel(request);
    }

    @SdkInternalApi
    final CreateChannelResult executeCreateChannel(CreateChannelRequest createChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelRequest> request = null;
        Response<CreateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently bans a member from a channel. Moderators can't add banned members to a channel. To undo a ban, you
     * first have to <code>DeleteChannelBan</code>, and then <code>CreateChannelMembership</code>. Bans are cleaned up
     * when you delete users or channels.
     * </p>
     * <p>
     * If you ban a user who is already part of a channel, that user is automatically kicked from the channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelBanRequest
     * @return Result of the CreateChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelBanResult createChannelBan(CreateChannelBanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannelBan(request);
    }

    @SdkInternalApi
    final CreateChannelBanResult executeCreateChannelBan(CreateChannelBanRequest createChannelBanRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelBanRequest> request = null;
        Response<CreateChannelBanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelBanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelBanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannelBan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelBanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelBanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a channel flow, a container for processors. Processors are AWS Lambda functions that perform actions on
     * chat messages, such as stripping out profanity. You can associate channel flows with channels, and the processors
     * in the channel flow then take action on all messages sent to that channel. This is a developer API.
     * </p>
     * <p>
     * Channel flows process the following items:
     * </p>
     * <ol>
     * <li>
     * <p>
     * New and updated messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Persistent and non-persistent messages
     * </p>
     * </li>
     * <li>
     * <p>
     * The Standard message type
     * </p>
     * </li>
     * </ol>
     * <note>
     * <p>
     * Channel flows don't process Control or System messages. For more information about the message types provided by
     * Chime SDK Messaging, refer to <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/using-the-messaging-sdk.html#msg-types">Message types</a> in
     * the <i>Amazon Chime developer guide</i>.
     * </p>
     * </note>
     * 
     * @param createChannelFlowRequest
     * @return Result of the CreateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelFlowResult createChannelFlow(CreateChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannelFlow(request);
    }

    @SdkInternalApi
    final CreateChannelFlowResult executeCreateChannelFlow(CreateChannelFlowRequest createChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelFlowRequest> request = null;
        Response<CreateChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> field in <code>ChannelMembership</code> is derived from the
     * request header. A channel member can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Send messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Receive messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Edit their own messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Leave the channel
     * </p>
     * </li>
     * </ul>
     * <p>
     * Privacy settings impact this action as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Public Channels: You do not need to be a member to list messages, but you must be a member to send messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Private Channels: You must be a member to list or send messages.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelMembershipRequest
     * @return Result of the CreateChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelMembershipResult createChannelMembership(CreateChannelMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannelMembership(request);
    }

    @SdkInternalApi
    final CreateChannelMembershipResult executeCreateChannelMembership(CreateChannelMembershipRequest createChannelMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelMembershipRequest> request = null;
        Response<CreateChannelMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createChannelMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannelMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateChannelMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <code>ChannelModerator</code>. A channel moderator can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add and remove other members of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove other moderators of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove user bans for the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redact messages in the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * List messages in the channel.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelModeratorRequest
     * @return Result of the CreateChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelModeratorResult createChannelModerator(CreateChannelModeratorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannelModerator(request);
    }

    @SdkInternalApi
    final CreateChannelModeratorResult executeCreateChannelModerator(CreateChannelModeratorRequest createChannelModeratorRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelModeratorRequest> request = null;
        Response<CreateChannelModeratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelModeratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelModeratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannelModerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelModeratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateChannelModeratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Immediately makes a channel and its memberships inaccessible and marks them for deletion. This is an irreversible
     * process.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelResult deleteChannel(DeleteChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannel(request);
    }

    @SdkInternalApi
    final DeleteChannelResult executeDeleteChannel(DeleteChannelRequest deleteChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<DeleteChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a user from a channel's ban list.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelBanRequest
     * @return Result of the DeleteChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelBanResult deleteChannelBan(DeleteChannelBanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelBan(request);
    }

    @SdkInternalApi
    final DeleteChannelBanResult executeDeleteChannelBan(DeleteChannelBanRequest deleteChannelBanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelBanRequest> request = null;
        Response<DeleteChannelBanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelBanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelBanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelBan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelBanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelBanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a channel flow, an irreversible process. This is a developer API.
     * </p>
     * <note>
     * <p>
     * This API works only when the channel flow is not associated with any channel. To get a list of all channels that
     * a channel flow is associated with, use the <code>ListChannelsAssociatedWithChannelFlow</code> API. Use the
     * <code>DisassociateChannelFlow</code> API to disassociate a channel flow from all channels.
     * </p>
     * </note>
     * 
     * @param deleteChannelFlowRequest
     * @return Result of the DeleteChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelFlowResult deleteChannelFlow(DeleteChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelFlow(request);
    }

    @SdkInternalApi
    final DeleteChannelFlowResult executeDeleteChannelFlow(DeleteChannelFlowRequest deleteChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelFlowRequest> request = null;
        Response<DeleteChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a member from a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMembershipRequest
     * @return Result of the DeleteChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelMembershipResult deleteChannelMembership(DeleteChannelMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelMembership(request);
    }

    @SdkInternalApi
    final DeleteChannelMembershipResult executeDeleteChannelMembership(DeleteChannelMembershipRequest deleteChannelMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelMembershipRequest> request = null;
        Response<DeleteChannelMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteChannelMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteChannelMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a channel message. Only admins can perform this action. Deletion makes messages inaccessible immediately.
     * A background process deletes any revisions created by <code>UpdateChannelMessage</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMessageRequest
     * @return Result of the DeleteChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelMessageResult deleteChannelMessage(DeleteChannelMessageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelMessage(request);
    }

    @SdkInternalApi
    final DeleteChannelMessageResult executeDeleteChannelMessage(DeleteChannelMessageRequest deleteChannelMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelMessageRequest> request = null;
        Response<DeleteChannelMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a channel moderator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelModeratorRequest
     * @return Result of the DeleteChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelModeratorResult deleteChannelModerator(DeleteChannelModeratorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelModerator(request);
    }

    @SdkInternalApi
    final DeleteChannelModeratorResult executeDeleteChannelModerator(DeleteChannelModeratorRequest deleteChannelModeratorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelModeratorRequest> request = null;
        Response<DeleteChannelModeratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelModeratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelModeratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelModerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelModeratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteChannelModeratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a channel in an Amazon Chime <code>AppInstance</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelResult describeChannel(DescribeChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannel(request);
    }

    @SdkInternalApi
    final DescribeChannelResult executeDescribeChannel(DescribeChannelRequest describeChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelRequest> request = null;
        Response<DescribeChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a channel ban.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelBanRequest
     * @return Result of the DescribeChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelBanResult describeChannelBan(DescribeChannelBanRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelBan(request);
    }

    @SdkInternalApi
    final DescribeChannelBanResult executeDescribeChannelBan(DescribeChannelBanRequest describeChannelBanRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelBanRequest> request = null;
        Response<DescribeChannelBanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelBanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChannelBanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelBan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelBanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChannelBanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a channel flow in an Amazon Chime <code>AppInstance</code>. This is a developer API.
     * </p>
     * 
     * @param describeChannelFlowRequest
     * @return Result of the DescribeChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelFlowResult describeChannelFlow(DescribeChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelFlow(request);
    }

    @SdkInternalApi
    final DescribeChannelFlowResult executeDescribeChannelFlow(DescribeChannelFlowRequest describeChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelFlowRequest> request = null;
        Response<DescribeChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a user's channel membership.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipRequest
     * @return Result of the DescribeChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelMembershipResult describeChannelMembership(DescribeChannelMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelMembership(request);
    }

    @SdkInternalApi
    final DescribeChannelMembershipResult executeDescribeChannelMembership(DescribeChannelMembershipRequest describeChannelMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelMembershipRequest> request = null;
        Response<DescribeChannelMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChannelMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeChannelMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of a channel based on the membership of the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipForAppInstanceUserRequest
     * @return Result of the DescribeChannelMembershipForAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembershipForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelMembershipForAppInstanceUserResult describeChannelMembershipForAppInstanceUser(
            DescribeChannelMembershipForAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelMembershipForAppInstanceUser(request);
    }

    @SdkInternalApi
    final DescribeChannelMembershipForAppInstanceUserResult executeDescribeChannelMembershipForAppInstanceUser(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelMembershipForAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelMembershipForAppInstanceUserRequest> request = null;
        Response<DescribeChannelMembershipForAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelMembershipForAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChannelMembershipForAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelMembershipForAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelMembershipForAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeChannelMembershipForAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a channel moderated by the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratedByAppInstanceUserRequest
     * @return Result of the DescribeChannelModeratedByAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelModeratedByAppInstanceUserResult describeChannelModeratedByAppInstanceUser(DescribeChannelModeratedByAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelModeratedByAppInstanceUser(request);
    }

    @SdkInternalApi
    final DescribeChannelModeratedByAppInstanceUserResult executeDescribeChannelModeratedByAppInstanceUser(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelModeratedByAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelModeratedByAppInstanceUserRequest> request = null;
        Response<DescribeChannelModeratedByAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelModeratedByAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChannelModeratedByAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelModeratedByAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelModeratedByAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeChannelModeratedByAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of a single ChannelModerator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratorRequest
     * @return Result of the DescribeChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChannelModeratorResult describeChannelModerator(DescribeChannelModeratorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannelModerator(request);
    }

    @SdkInternalApi
    final DescribeChannelModeratorResult executeDescribeChannelModerator(DescribeChannelModeratorRequest describeChannelModeratorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelModeratorRequest> request = null;
        Response<DescribeChannelModeratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelModeratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChannelModeratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannelModerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelModeratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeChannelModeratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a channel flow from all its channels. Once disassociated, all messages to that channel stop going
     * through the channel flow processor.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can disassociate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param disassociateChannelFlowRequest
     * @return Result of the DisassociateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DisassociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DisassociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateChannelFlowResult disassociateChannelFlow(DisassociateChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateChannelFlow(request);
    }

    @SdkInternalApi
    final DisassociateChannelFlowResult executeDisassociateChannelFlow(DisassociateChannelFlowRequest disassociateChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateChannelFlowRequest> request = null;
        Response<DisassociateChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can retrieve preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't
     * retrieve preferences for other users. Banned users can't retrieve membership preferences for the channel from
     * which they are banned.
     * </p>
     * 
     * @param getChannelMembershipPreferencesRequest
     * @return Result of the GetChannelMembershipPreferences operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChannelMembershipPreferencesResult getChannelMembershipPreferences(GetChannelMembershipPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelMembershipPreferences(request);
    }

    @SdkInternalApi
    final GetChannelMembershipPreferencesResult executeGetChannelMembershipPreferences(
            GetChannelMembershipPreferencesRequest getChannelMembershipPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelMembershipPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelMembershipPreferencesRequest> request = null;
        Response<GetChannelMembershipPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelMembershipPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getChannelMembershipPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelMembershipPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelMembershipPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetChannelMembershipPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the full details of a channel message.
     * </p>
     * <note>
     * <p>
     * The x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that
     * makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param getChannelMessageRequest
     * @return Result of the GetChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChannelMessageResult getChannelMessage(GetChannelMessageRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelMessage(request);
    }

    @SdkInternalApi
    final GetChannelMessageResult executeGetChannelMessage(GetChannelMessageRequest getChannelMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelMessageRequest> request = null;
        Response<GetChannelMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets message status for a specified <code>messageId</code>. Use this API to determine the intermediate status of
     * messages going through channel flow processing. The API provides an alternative to retrieving message status if
     * the event was not received because a client wasn't connected to a websocket.
     * </p>
     * <p>
     * Messages can have any one of these statuses.
     * </p>
     * <dl>
     * <dt>SENT</dt>
     * <dd>
     * <p>
     * Message processed successfully
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * Ongoing processing
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * Processing failed
     * </p>
     * </dd>
     * <dt>DENIED</dt>
     * <dd>
     * <p>
     * Messasge denied by the processor
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API does not return statuses for denied messages, because we don't store them once the processor denies
     * them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only the message sender can invoke this API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getChannelMessageStatusRequest
     * @return Result of the GetChannelMessageStatus operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMessageStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessageStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChannelMessageStatusResult getChannelMessageStatus(GetChannelMessageStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelMessageStatus(request);
    }

    @SdkInternalApi
    final GetChannelMessageStatusResult executeGetChannelMessageStatus(GetChannelMessageStatusRequest getChannelMessageStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelMessageStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelMessageStatusRequest> request = null;
        Response<GetChannelMessageStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelMessageStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getChannelMessageStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelMessageStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelMessageStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetChannelMessageStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return Result of the GetMessagingSessionEndpoint operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetMessagingSessionEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMessagingSessionEndpointResult getMessagingSessionEndpoint(GetMessagingSessionEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetMessagingSessionEndpoint(request);
    }

    @SdkInternalApi
    final GetMessagingSessionEndpointResult executeGetMessagingSessionEndpoint(GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getMessagingSessionEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMessagingSessionEndpointRequest> request = null;
        Response<GetMessagingSessionEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMessagingSessionEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMessagingSessionEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMessagingSessionEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMessagingSessionEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMessagingSessionEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the users banned from a particular channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelBansRequest
     * @return Result of the ListChannelBans operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelBans"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelBansResult listChannelBans(ListChannelBansRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelBans(request);
    }

    @SdkInternalApi
    final ListChannelBansResult executeListChannelBans(ListChannelBansRequest listChannelBansRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelBansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelBansRequest> request = null;
        Response<ListChannelBansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelBansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelBansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelBans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelBansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelBansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
     * </p>
     * 
     * @param listChannelFlowsRequest
     * @return Result of the ListChannelFlows operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelFlows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelFlowsResult listChannelFlows(ListChannelFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelFlows(request);
    }

    @SdkInternalApi
    final ListChannelFlowsResult executeListChannelFlows(ListChannelFlowsRequest listChannelFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelFlowsRequest> request = null;
        Response<ListChannelFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelFlowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all channel memberships in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * <p>
     * If you want to list the channels to which a specific app instance user belongs, see the <a href=
     * "https://docs.aws.amazon.com/chime/latest/APIReference/API_messaging-chime_ListChannelMembershipsForAppInstanceUser.html"
     * >ListChannelMembershipsForAppInstanceUser</a> API.
     * </p>
     * 
     * @param listChannelMembershipsRequest
     * @return Result of the ListChannelMemberships operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelMembershipsResult listChannelMemberships(ListChannelMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelMemberships(request);
    }

    @SdkInternalApi
    final ListChannelMembershipsResult executeListChannelMemberships(ListChannelMembershipsRequest listChannelMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMembershipsRequest> request = null;
        Response<ListChannelMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListChannelMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all channels that a particular <code>AppInstanceUser</code> is a part of. Only an
     * <code>AppInstanceAdmin</code> can call the API with a user ARN that is not their own.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsForAppInstanceUserRequest
     * @return Result of the ListChannelMembershipsForAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMembershipsForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMembershipsForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelMembershipsForAppInstanceUserResult listChannelMembershipsForAppInstanceUser(ListChannelMembershipsForAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelMembershipsForAppInstanceUser(request);
    }

    @SdkInternalApi
    final ListChannelMembershipsForAppInstanceUserResult executeListChannelMembershipsForAppInstanceUser(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelMembershipsForAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMembershipsForAppInstanceUserRequest> request = null;
        Response<ListChannelMembershipsForAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMembershipsForAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listChannelMembershipsForAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelMembershipsForAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelMembershipsForAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListChannelMembershipsForAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of <code>ChannelMessages</code>. By default, sorted
     * by creation timestamp in descending order.
     * </p>
     * <note>
     * <p>
     * Redacted messages appear in the results as empty, since they are only redacted, not deleted. Deleted messages do
     * not appear in the results. This action always returns the latest version of an edited message.
     * </p>
     * <p>
     * Also, the x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user
     * that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMessagesRequest
     * @return Result of the ListChannelMessages operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMessages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelMessagesResult listChannelMessages(ListChannelMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelMessages(request);
    }

    @SdkInternalApi
    final ListChannelMessagesResult executeListChannelMessages(ListChannelMessagesRequest listChannelMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMessagesRequest> request = null;
        Response<ListChannelMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the moderators for a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelModeratorsRequest
     * @return Result of the ListChannelModerators operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelModerators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelModeratorsResult listChannelModerators(ListChannelModeratorsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelModerators(request);
    }

    @SdkInternalApi
    final ListChannelModeratorsResult executeListChannelModerators(ListChannelModeratorsRequest listChannelModeratorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelModeratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelModeratorsRequest> request = null;
        Response<ListChannelModeratorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelModeratorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelModeratorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelModerators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelModeratorsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListChannelModeratorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Channels created under a single Chime App as a paginated list. You can specify filters to narrow
     * results.
     * </p>
     * <p class="title">
     * <b>Functionality &amp; restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use privacy = <code>PUBLIC</code> to retrieve all public channels in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only an <code>AppInstanceAdmin</code> can set privacy = <code>PRIVATE</code> to list the private channels in an
     * account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannels(request);
    }

    @SdkInternalApi
    final ListChannelsResult executeListChannels(ListChannelsRequest listChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple
     * channels, but you can only associate a channel with one channel flow. This is a developer API.
     * </p>
     * 
     * @param listChannelsAssociatedWithChannelFlowRequest
     * @return Result of the ListChannelsAssociatedWithChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelsAssociatedWithChannelFlow
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsAssociatedWithChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelsAssociatedWithChannelFlowResult listChannelsAssociatedWithChannelFlow(ListChannelsAssociatedWithChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelsAssociatedWithChannelFlow(request);
    }

    @SdkInternalApi
    final ListChannelsAssociatedWithChannelFlowResult executeListChannelsAssociatedWithChannelFlow(
            ListChannelsAssociatedWithChannelFlowRequest listChannelsAssociatedWithChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsAssociatedWithChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsAssociatedWithChannelFlowRequest> request = null;
        Response<ListChannelsAssociatedWithChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsAssociatedWithChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listChannelsAssociatedWithChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelsAssociatedWithChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsAssociatedWithChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListChannelsAssociatedWithChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of the channels moderated by an <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsModeratedByAppInstanceUserRequest
     * @return Result of the ListChannelsModeratedByAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelsModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelsModeratedByAppInstanceUserResult listChannelsModeratedByAppInstanceUser(ListChannelsModeratedByAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelsModeratedByAppInstanceUser(request);
    }

    @SdkInternalApi
    final ListChannelsModeratedByAppInstanceUserResult executeListChannelsModeratedByAppInstanceUser(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsModeratedByAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsModeratedByAppInstanceUserRequest> request = null;
        Response<ListChannelsModeratedByAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsModeratedByAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listChannelsModeratedByAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelsModeratedByAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsModeratedByAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListChannelsModeratedByAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance
     * admins and channel moderators of elastic channels.
     * </p>
     * 
     * @param listSubChannelsRequest
     * @return Result of the ListSubChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListSubChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListSubChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSubChannelsResult listSubChannels(ListSubChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubChannels(request);
    }

    @SdkInternalApi
    final ListSubChannelsResult executeListSubChannels(ListSubChannelsRequest listSubChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubChannelsRequest> request = null;
        Response<ListSubChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSubChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSubChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
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
     * Sets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can set preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't set
     * preferences for other users. Banned users can't set membership preferences for the channel from which they are
     * banned.
     * </p>
     * 
     * @param putChannelMembershipPreferencesRequest
     * @return Result of the PutChannelMembershipPreferences operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.PutChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutChannelMembershipPreferencesResult putChannelMembershipPreferences(PutChannelMembershipPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executePutChannelMembershipPreferences(request);
    }

    @SdkInternalApi
    final PutChannelMembershipPreferencesResult executePutChannelMembershipPreferences(
            PutChannelMembershipPreferencesRequest putChannelMembershipPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(putChannelMembershipPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutChannelMembershipPreferencesRequest> request = null;
        Response<PutChannelMembershipPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutChannelMembershipPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putChannelMembershipPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutChannelMembershipPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutChannelMembershipPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutChannelMembershipPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Redacts message content, but not metadata. The message exists in the back end, but the action returns null
     * content, and the state shows as redacted.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param redactChannelMessageRequest
     * @return Result of the RedactChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/RedactChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RedactChannelMessageResult redactChannelMessage(RedactChannelMessageRequest request) {
        request = beforeClientExecution(request);
        return executeRedactChannelMessage(request);
    }

    @SdkInternalApi
    final RedactChannelMessageResult executeRedactChannelMessage(RedactChannelMessageRequest redactChannelMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(redactChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RedactChannelMessageRequest> request = null;
        Response<RedactChannelMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RedactChannelMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(redactChannelMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RedactChannelMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RedactChannelMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RedactChannelMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows <code>ChimeBearer</code> to search channels by channel members. AppInstanceUsers can search across the
     * channels that they belong to. AppInstanceAdmins can search across all channels.
     * </p>
     * 
     * @param searchChannelsRequest
     * @return Result of the SearchChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.SearchChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchChannelsResult searchChannels(SearchChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchChannels(request);
    }

    @SdkInternalApi
    final SearchChannelsResult executeSearchChannels(SearchChannelsRequest searchChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchChannelsRequest> request = null;
        Response<SearchChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a message to a particular channel that the member is a part of.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * <p>
     * Also, <code>STANDARD</code> messages can contain 4KB of data and the 1KB of metadata. <code>CONTROL</code>
     * messages can contain 30 bytes of data and no metadata.
     * </p>
     * </note>
     * 
     * @param sendChannelMessageRequest
     * @return Result of the SendChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendChannelMessageResult sendChannelMessage(SendChannelMessageRequest request) {
        request = beforeClientExecution(request);
        return executeSendChannelMessage(request);
    }

    @SdkInternalApi
    final SendChannelMessageResult executeSendChannelMessage(SendChannelMessageRequest sendChannelMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(sendChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendChannelMessageRequest> request = null;
        Response<SendChannelMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendChannelMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendChannelMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendChannelMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendChannelMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendChannelMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
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
     * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
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
     * Update a channel's attributes.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChannelResult updateChannel(UpdateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannel(request);
    }

    @SdkInternalApi
    final UpdateChannelResult executeUpdateChannel(UpdateChannelRequest updateChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelRequest> request = null;
        Response<UpdateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates channel flow attributes. This is a developer API.
     * </p>
     * 
     * @param updateChannelFlowRequest
     * @return Result of the UpdateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChannelFlowResult updateChannelFlow(UpdateChannelFlowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannelFlow(request);
    }

    @SdkInternalApi
    final UpdateChannelFlowResult executeUpdateChannelFlow(UpdateChannelFlowRequest updateChannelFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelFlowRequest> request = null;
        Response<UpdateChannelFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannelFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the content of a message.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelMessageRequest
     * @return Result of the UpdateChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChannelMessageResult updateChannelMessage(UpdateChannelMessageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannelMessage(request);
    }

    @SdkInternalApi
    final UpdateChannelMessageResult executeUpdateChannelMessage(UpdateChannelMessageRequest updateChannelMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelMessageRequest> request = null;
        Response<UpdateChannelMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannelMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The details of the time when a user last read messages in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelReadMarkerRequest
     * @return Result of the UpdateChannelReadMarker operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelReadMarker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChannelReadMarkerResult updateChannelReadMarker(UpdateChannelReadMarkerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannelReadMarker(request);
    }

    @SdkInternalApi
    final UpdateChannelReadMarkerResult executeUpdateChannelReadMarker(UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelReadMarkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelReadMarkerRequest> request = null;
        Response<UpdateChannelReadMarkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelReadMarkerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateChannelReadMarkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Messaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannelReadMarker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelReadMarkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateChannelReadMarkerResultJsonUnmarshaller());
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
