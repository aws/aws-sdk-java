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
package com.amazonaws.services.kinesisvideowebrtcstorage;

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

import com.amazonaws.services.kinesisvideowebrtcstorage.AmazonKinesisVideoWebRTCStorageClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisvideowebrtcstorage.model.*;
import com.amazonaws.services.kinesisvideowebrtcstorage.model.transform.*;

/**
 * Client for accessing Amazon Kinesis Video WebRTC Storage. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoWebRTCStorageClient extends AmazonWebServiceClient implements AmazonKinesisVideoWebRTCStorage {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisVideoWebRTCStorage.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kinesisvideo";

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
                                    com.amazonaws.services.kinesisvideowebrtcstorage.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideowebrtcstorage.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideowebrtcstorage.model.transform.ClientLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideowebrtcstorage.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisvideowebrtcstorage.model.AmazonKinesisVideoWebRTCStorageException.class));

    public static AmazonKinesisVideoWebRTCStorageClientBuilder builder() {
        return AmazonKinesisVideoWebRTCStorageClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Kinesis Video WebRTC Storage using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoWebRTCStorageClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Kinesis Video WebRTC Storage using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoWebRTCStorageClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kinesisvideo.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisvideowebrtcstorage/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisvideowebrtcstorage/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a video producing device for an input
     * channel. If there’s no existing session for the channel, a new streaming session needs to be created, and the
     * Amazon Resource Name (ARN) of the signaling channel must be provided.
     * </p>
     * <p>
     * Currently for the <code>SINGLE_MASTER</code> type, a video producing device is able to ingest both audio and
     * video media into a stream, while viewers can only ingest audio. Both a video producing device and viewers can
     * join the session first, and wait for other participants.
     * </p>
     * <p>
     * While participants are having peer to peer conversations through webRTC, the ingested media session will be
     * stored into the Kinesis Video Stream. Multiple viewers are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like <code>HLS</code> or <code>DASH</code>
     * playback, Image generation, and more with ingested WebRTC media.
     * </p>
     * <note>
     * <p>
     * Assume that only one video producing device client can be associated with a session for the channel. If more than
     * one client joins the session of a specific channel as a video producing device, the most recent client request
     * takes precedence.
     * </p>
     * </note>
     * 
     * @param joinStorageSessionRequest
     * @return Result of the JoinStorageSession operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ResourceNotFoundException
     *         The specified resource is not found.
     * @sample AmazonKinesisVideoWebRTCStorage.JoinStorageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public JoinStorageSessionResult joinStorageSession(JoinStorageSessionRequest request) {
        request = beforeClientExecution(request);
        return executeJoinStorageSession(request);
    }

    @SdkInternalApi
    final JoinStorageSessionResult executeJoinStorageSession(JoinStorageSessionRequest joinStorageSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(joinStorageSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<JoinStorageSessionRequest> request = null;
        Response<JoinStorageSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new JoinStorageSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(joinStorageSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video WebRTC Storage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "JoinStorageSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<JoinStorageSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new JoinStorageSessionResultJsonUnmarshaller());
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
