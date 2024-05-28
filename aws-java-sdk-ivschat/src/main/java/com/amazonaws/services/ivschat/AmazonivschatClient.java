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
package com.amazonaws.services.ivschat;

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

import com.amazonaws.services.ivschat.AmazonivschatClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ivschat.model.*;

import com.amazonaws.services.ivschat.model.transform.*;

/**
 * Client for accessing ivschat. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon IVS Chat control-plane API enables you to create and manage Amazon IVS Chat resources. You also need to
 * integrate with the <a href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html">
 * Amazon IVS Chat Messaging API</a>, to enable users to interact with chat rooms in real time.
 * </p>
 * <p>
 * The API is an AWS regional service. For a list of supported regions and Amazon IVS Chat HTTPS service endpoints, see
 * the Amazon IVS Chat information on the <a href="https://docs.aws.amazon.com/general/latest/gr/ivs.html">Amazon IVS
 * page</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Notes on terminology:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * You create service applications using the Amazon IVS Chat API. We refer to these as <i>applications</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You create front-end client applications (browser and Android/iOS apps) using the Amazon IVS Chat Messaging API. We
 * refer to these as <i>clients</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Key Concepts</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>LoggingConfiguration</b> — A configuration that allows customers to store and record sent messages in a chat room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Room</b> — The central Amazon IVS Chat resource through which clients connect to and exchange chat messages.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has
 * no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS Chat API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Room.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>API Access Security</b>
 * </p>
 * <p>
 * Your Amazon IVS Chat applications (service applications and clients) must be authenticated and authorized to access
 * Amazon IVS Chat resources. Note the differences between these concepts:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Authentication</i> is about verifying identity. Requests to the Amazon IVS Chat API must be signed to verify your
 * identity.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Authorization</i> is about granting permissions. Your IAM roles need to have permissions for Amazon IVS Chat API
 * requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users (viewers) connect to a room using secure access tokens that you create using the <a>CreateChatToken</a>
 * endpoint through the AWS SDK. You call CreateChatToken for every user’s chat session, passing identity and
 * authorization information about the user.
 * </p>
 * <p>
 * <b>Signing API Requests</b>
 * </p>
 * <p>
 * HTTP API requests must be signed with an AWS SigV4 signature using your AWS security credentials. The AWS Command
 * Line Interface (CLI) and the AWS SDKs take care of signing the underlying API calls for you. However, if your
 * application calls the Amazon IVS Chat HTTP API directly, it’s your responsibility to sign the requests.
 * </p>
 * <p>
 * You generate a signature using valid AWS credentials for an IAM role that has permission to perform the requested
 * action. For example, DeleteMessage requests must be made using an IAM role that has the
 * <code>ivschat:DeleteMessage</code> permission.
 * </p>
 * <p>
 * For more information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Authentication and generating signatures — See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
 * (Amazon Web Services Signature Version 4)</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managing Amazon IVS permissions — See <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html">Identity and Access Management</a> on the
 * Security page of the <i>Amazon IVS User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Resource Names (ARNs)</b>
 * </p>
 * <p>
 * ARNs uniquely identify AWS resources. An ARN is required when you need to specify a resource unambiguously across all
 * of AWS, such as in IAM policies and API calls. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Messaging Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteMessage</a> — Sends an event to a specific room which directs clients to delete a specific message; that is,
 * unrender it from view and delete it from the client’s chat history. This event’s <code>EventName</code> is
 * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
 * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectUser</a> — Disconnects all connections using a specified user ID from a room. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
 * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>SendEvent</a> — Sends an event to a room. Use this within your application’s business logic to send events to
 * clients of a room; e.g., to notify clients to change the way the chat UI is rendered.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chat Token Endpoint</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChatToken</a> — Creates an encrypted token that is used by a chat participant to establish an individual
 * WebSocket chat connection to a room. When the token is used to connect to chat, the connection is valid for the
 * session duration specified in the request. The token becomes invalid at the token-expiration timestamp included in
 * the response.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Room Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateRoom</a> — Creates a room that allows clients to connect and pass messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRoom</a> — Deletes the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRoom</a> — Gets the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRooms</a> — Gets summary information about all your rooms in the AWS region where the API request is
 * processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRoom</a> — Updates a room’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Logging Configuration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateLoggingConfiguration</a> — Creates a logging configuration that allows clients to store and record sent
 * messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteLoggingConfiguration</a> — Deletes the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLoggingConfiguration</a> — Gets the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListLoggingConfigurations</a> — Gets summary information about all your logging configurations in the AWS region
 * where the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateLoggingConfiguration</a> — Updates a specified logging configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All the above are HTTP operations. There is a separate <i>messaging</i> API for managing Chat resources; see the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html"> Amazon IVS Chat Messaging
 * API Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonivschatClient extends AmazonWebServiceClient implements Amazonivschat {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(Amazonivschat.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ivschat";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PendingVerification").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.PendingVerificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivschat.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ivschat.model.AmazonivschatException.class));

    public static AmazonivschatClientBuilder builder() {
        return AmazonivschatClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ivschat using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonivschatClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ivschat using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonivschatClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ivschat.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ivschat/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ivschat/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an encrypted token that is used by a chat participant to establish an individual WebSocket chat
     * connection to a room. When the token is used to connect to chat, the connection is valid for the session duration
     * specified in the request. The token becomes invalid at the token-expiration timestamp included in the response.
     * </p>
     * <p>
     * Use the <code>capabilities</code> field to permit an end user to send messages or moderate a room.
     * </p>
     * <p>
     * The <code>attributes</code> field securely attaches structured data to the chat session; the data is included
     * within each message sent by the end user and received by other participants in the room. Common use cases for
     * attributes include passing end-user profile data like an icon, display name, colors, badges, and other display
     * features.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
     * </p>
     * 
     * @param createChatTokenRequest
     * @return Result of the CreateChatToken operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.CreateChatToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateChatTokenResult createChatToken(CreateChatTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChatToken(request);
    }

    @SdkInternalApi
    final CreateChatTokenResult executeCreateChatToken(CreateChatTokenRequest createChatTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createChatTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChatTokenRequest> request = null;
        Response<CreateChatTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChatTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChatTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChatToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChatTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChatTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a logging configuration that allows clients to store and record sent messages.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     * @return Result of the CreateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLoggingConfigurationResult createLoggingConfiguration(CreateLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoggingConfiguration(request);
    }

    @SdkInternalApi
    final CreateLoggingConfigurationResult executeCreateLoggingConfiguration(CreateLoggingConfigurationRequest createLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoggingConfigurationRequest> request = null;
        Response<CreateLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a room that allows clients to connect and pass messages.
     * </p>
     * 
     * @param createRoomRequest
     * @return Result of the CreateRoom operation returned by the service.
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRoomResult createRoom(CreateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoom(request);
    }

    @SdkInternalApi
    final CreateRoomResult executeCreateRoom(CreateRoomRequest createRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomRequest> request = null;
        Response<CreateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLoggingConfigurationResult executeDeleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoggingConfigurationRequest> request = null;
        Response<DeleteLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from
     * view and delete it from the client’s chat history. This event’s <code>EventName</code> is
     * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
     * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param deleteMessageRequest
     * @return Result of the DeleteMessage operation returned by the service.
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMessageResult deleteMessage(DeleteMessageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMessage(request);
    }

    @SdkInternalApi
    final DeleteMessageResult executeDeleteMessage(DeleteMessageRequest deleteMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageRequest> request = null;
        Response<DeleteMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified room.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return Result of the DeleteRoom operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRoomResult deleteRoom(DeleteRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoom(request);
    }

    @SdkInternalApi
    final DeleteRoomResult executeDeleteRoom(DeleteRoomRequest deleteRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomRequest> request = null;
        Response<DeleteRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects all connections using a specified user ID from a room. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
     * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param disconnectUserRequest
     * @return Result of the DisconnectUser operation returned by the service.
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.DisconnectUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisconnectUserResult disconnectUser(DisconnectUserRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectUser(request);
    }

    @SdkInternalApi
    final DisconnectUserResult executeDisconnectUser(DisconnectUserRequest disconnectUserRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectUserRequest> request = null;
        Response<DisconnectUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisconnectUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified logging configuration.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return Result of the GetLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample Amazonivschat.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLoggingConfigurationResult getLoggingConfiguration(GetLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoggingConfiguration(request);
    }

    @SdkInternalApi
    final GetLoggingConfigurationResult executeGetLoggingConfiguration(GetLoggingConfigurationRequest getLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingConfigurationRequest> request = null;
        Response<GetLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified room.
     * </p>
     * 
     * @param getRoomRequest
     * @return Result of the GetRoom operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample Amazonivschat.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRoomResult getRoom(GetRoomRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoom(request);
    }

    @SdkInternalApi
    final GetRoomResult executeGetRoom(GetRoomRequest getRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomRequest> request = null;
        Response<GetRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all your logging configurations in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return Result of the ListLoggingConfigurations operation returned by the service.
     * @throws AccessDeniedException
     * @throws ValidationException
     * @sample Amazonivschat.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLoggingConfigurationsResult listLoggingConfigurations(ListLoggingConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListLoggingConfigurations(request);
    }

    @SdkInternalApi
    final ListLoggingConfigurationsResult executeListLoggingConfigurations(ListLoggingConfigurationsRequest listLoggingConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLoggingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLoggingConfigurationsRequest> request = null;
        Response<ListLoggingConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLoggingConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLoggingConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLoggingConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLoggingConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLoggingConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are
     * sorted in descending order of <code>updateTime</code>.
     * </p>
     * 
     * @param listRoomsRequest
     * @return Result of the ListRooms operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample Amazonivschat.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRoomsResult listRooms(ListRoomsRequest request) {
        request = beforeClientExecution(request);
        return executeListRooms(request);
    }

    @SdkInternalApi
    final ListRoomsResult executeListRooms(ListRoomsRequest listRoomsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoomsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoomsRequest> request = null;
        Response<ListRoomsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoomsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoomsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRooms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoomsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoomsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @sample Amazonivschat.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
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
     * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room;
     * e.g., to notify clients to change the way the chat UI is rendered.
     * </p>
     * 
     * @param sendEventRequest
     * @return Result of the SendEvent operation returned by the service.
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendEventResult sendEvent(SendEventRequest request) {
        request = beforeClientExecution(request);
        return executeSendEvent(request);
    }

    @SdkInternalApi
    final SendEventResult executeSendEvent(SendEventRequest sendEventRequest) {

        ExecutionContext executionContext = createExecutionContext(sendEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEventRequest> request = null;
        Response<SendEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendEventResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @sample Amazonivschat.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
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
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @sample Amazonivschat.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
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
     * Updates a specified logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLoggingConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLoggingConfigurationResult executeUpdateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoggingConfigurationRequest> request = null;
        Response<UpdateLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a room’s configuration.
     * </p>
     * 
     * @param updateRoomRequest
     * @return Result of the UpdateRoom operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @throws ValidationException
     * @sample Amazonivschat.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRoomResult updateRoom(UpdateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoom(request);
    }

    @SdkInternalApi
    final UpdateRoomResult executeUpdateRoom(UpdateRoomRequest updateRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomRequest> request = null;
        Response<UpdateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivschat");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRoomResultJsonUnmarshaller());
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
