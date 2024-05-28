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
package com.amazonaws.services.connectparticipant;

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

import com.amazonaws.services.connectparticipant.AmazonConnectParticipantClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.connectparticipant.model.*;

import com.amazonaws.services.connectparticipant.model.transform.*;

/**
 * Client for accessing Amazon Connect Participant. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Connect is an easy-to-use omnichannel cloud contact center service that enables companies of any size to
 * deliver superior customer service at a lower cost. Amazon Connect communications capabilities make it easy for
 * companies to deliver personalized interactions across communication channels, including chat.
 * </p>
 * <p>
 * Use the Amazon Connect Participant Service to manage participants (for example, agents, customers, and managers
 * listening in), and to send messages and events within a chat contact. The APIs in the service enable the following:
 * sending chat messages, attachment sharing, managing a participant's connection state and message events, and
 * retrieving chat transcripts.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectParticipantClient extends AmazonWebServiceClient implements AmazonConnectParticipant {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConnectParticipant.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "execute-api";

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
                                    com.amazonaws.services.connectparticipant.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectparticipant.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.connectparticipant.model.AmazonConnectParticipantException.class));

    public static AmazonConnectParticipantClientBuilder builder() {
        return AmazonConnectParticipantClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect Participant using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectParticipantClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect Participant using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectParticipantClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("participant.connect.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/connectparticipant/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/connectparticipant/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in
     * StartAttachmentUpload API. A conflict exception is thrown when an attachment with that identifier is already
     * being uploaded.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @return Result of the CompleteAttachmentUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @throws ServiceQuotaExceededException
     *         The number of attachments per contact exceeds the quota.
     * @throws ConflictException
     *         The requested operation conflicts with the current state of a service resource associated with the
     *         request.
     * @sample AmazonConnectParticipant.CompleteAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CompleteAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CompleteAttachmentUploadResult completeAttachmentUpload(CompleteAttachmentUploadRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteAttachmentUpload(request);
    }

    @SdkInternalApi
    final CompleteAttachmentUploadResult executeCompleteAttachmentUpload(CompleteAttachmentUploadRequest completeAttachmentUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(completeAttachmentUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteAttachmentUploadRequest> request = null;
        Response<CompleteAttachmentUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteAttachmentUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(completeAttachmentUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteAttachmentUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteAttachmentUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CompleteAttachmentUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the participant's connection.
     * </p>
     * <note>
     * <p>
     * <code>ParticipantToken</code> is used for invoking this API instead of <code>ConnectionToken</code>.
     * </p>
     * </note>
     * <p>
     * The participant token is valid for the lifetime of the participant – until they are part of a contact.
     * </p>
     * <p>
     * The response URL for <code>WEBSOCKET</code> Type has a connect expiry timeout of 100s. Clients must manually
     * connect to the returned websocket URL and subscribe to the desired topic.
     * </p>
     * <p>
     * For chat, you need to publish the following on the established websocket connection:
     * </p>
     * <p>
     * <code>{"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}</code>
     * </p>
     * <p>
     * Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API
     * again to obtain a new websocket URL and perform the same steps as before.
     * </p>
     * <p>
     * <b>Message streaming support</b>: This API can also be used together with the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API to create a participant connection for chat contacts that are not using a
     * websocket. For more information about message streaming, <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Feature specifications</b>: For information about feature specifications, such as the allowed number of open
     * websocket connections per participant, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
     * 
     * @param createParticipantConnectionRequest
     * @return Result of the CreateParticipantConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.CreateParticipantConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateParticipantConnection(request);
    }

    @SdkInternalApi
    final CreateParticipantConnectionResult executeCreateParticipantConnection(CreateParticipantConnectionRequest createParticipantConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createParticipantConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateParticipantConnectionRequest> request = null;
        Response<CreateParticipantConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateParticipantConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createParticipantConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateParticipantConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateParticipantConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateParticipantConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the view for the specified view token.
     * </p>
     * 
     * @param describeViewRequest
     * @return Result of the DescribeView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.DescribeView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DescribeView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeViewResult describeView(DescribeViewRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeView(request);
    }

    @SdkInternalApi
    final DescribeViewResult executeDescribeView(DescribeViewRequest describeViewRequest) {

        ExecutionContext executionContext = createExecutionContext(describeViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeViewRequest> request = null;
        Response<DescribeViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects a participant.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return Result of the DisconnectParticipant operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisconnectParticipantResult disconnectParticipant(DisconnectParticipantRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectParticipant(request);
    }

    @SdkInternalApi
    final DisconnectParticipantResult executeDisconnectParticipant(DisconnectParticipantRequest disconnectParticipantRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectParticipantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectParticipantRequest> request = null;
        Response<DisconnectParticipantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectParticipantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectParticipantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectParticipant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectParticipantResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisconnectParticipantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active
     * contacts.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param getAttachmentRequest
     * @return Result of the GetAttachment operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.GetAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAttachmentResult getAttachment(GetAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttachment(request);
    }

    @SdkInternalApi
    final GetAttachmentResult executeGetAttachment(GetAttachmentRequest getAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttachmentRequest> request = null;
        Response<GetAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a transcript of the session, including details about any attachments. For information about accessing
     * past chat contact transcripts for a persistent chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     * <p>
     * If you have a process that consumes events in the transcript of an chat that has ended, note that chat
     * transcripts contain the following event content types if the event has occurred during the chat session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.participant.joined</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.chat.ended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.transfer.succeeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.transfer.failed</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param getTranscriptRequest
     * @return Result of the GetTranscript operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.GetTranscript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTranscriptResult getTranscript(GetTranscriptRequest request) {
        request = beforeClientExecution(request);
        return executeGetTranscript(request);
    }

    @SdkInternalApi
    final GetTranscriptResult executeGetTranscript(GetTranscriptRequest getTranscriptRequest) {

        ExecutionContext executionContext = createExecutionContext(getTranscriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTranscriptRequest> request = null;
        Response<GetTranscriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTranscriptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTranscriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTranscript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTranscriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTranscriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * The <code>application/vnd.amazonaws.connect.event.connection.acknowledged</code> ContentType will no longer be
     * supported starting December 31, 2024. This event has been migrated to the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API using the <code>ConnectParticipant</code> field.
     * </p>
     * </note>
     * <p>
     * Sends an event. Message receipts are not supported when there are more than two active participants in the chat.
     * Using the SendEvent API for message receipts when a supervisor is barged-in will result in a conflict exception.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param sendEventRequest
     * @return Result of the SendEvent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @throws ConflictException
     *         The requested operation conflicts with the current state of a service resource associated with the
     *         request.
     * @sample AmazonConnectParticipant.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
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
     * Sends a message.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param sendMessageRequest
     * @return Result of the SendMessage operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.SendMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SendMessageResult sendMessage(SendMessageRequest request) {
        request = beforeClientExecution(request);
        return executeSendMessage(request);
    }

    @SdkInternalApi
    final SendMessageResult executeSendMessage(SendMessageRequest sendMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(sendMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageRequest> request = null;
        Response<SendMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @return Result of the StartAttachmentUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @throws ServiceQuotaExceededException
     *         The number of attachments per contact exceeds the quota.
     * @sample AmazonConnectParticipant.StartAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAttachmentUploadResult startAttachmentUpload(StartAttachmentUploadRequest request) {
        request = beforeClientExecution(request);
        return executeStartAttachmentUpload(request);
    }

    @SdkInternalApi
    final StartAttachmentUploadResult executeStartAttachmentUpload(StartAttachmentUploadRequest startAttachmentUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(startAttachmentUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAttachmentUploadRequest> request = null;
        Response<StartAttachmentUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAttachmentUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAttachmentUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectParticipant");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAttachmentUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAttachmentUploadResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartAttachmentUploadResultJsonUnmarshaller());
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
