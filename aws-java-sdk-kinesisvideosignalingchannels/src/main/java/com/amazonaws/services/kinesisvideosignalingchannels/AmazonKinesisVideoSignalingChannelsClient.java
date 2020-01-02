/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideosignalingchannels;

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

import com.amazonaws.services.kinesisvideosignalingchannels.AmazonKinesisVideoSignalingChannelsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisvideosignalingchannels.model.*;
import com.amazonaws.services.kinesisvideosignalingchannels.model.transform.*;

/**
 * Client for accessing Amazon Kinesis Video Signaling Channels. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * Kinesis Video Streams Signaling Service is a intermediate service that establishes a communication channel for
 * discovering peers, transmitting offers and answers in order to establish peer-to-peer connection in webRTC
 * technology.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoSignalingChannelsClient extends AmazonWebServiceClient implements AmazonKinesisVideoSignalingChannels {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisVideoSignalingChannels.class);

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
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideosignalingchannels.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientLimitExceededException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.kinesisvideosignalingchannels.model.transform.ClientLimitExceededExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideosignalingchannels.model.transform.InvalidClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SessionExpiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideosignalingchannels.model.transform.SessionExpiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideosignalingchannels.model.transform.NotAuthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideosignalingchannels.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(
                            com.amazonaws.services.kinesisvideosignalingchannels.model.AmazonKinesisVideoSignalingChannelsException.class));

    public static AmazonKinesisVideoSignalingChannelsClientBuilder builder() {
        return AmazonKinesisVideoSignalingChannelsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Kinesis Video Signaling Channels using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoSignalingChannelsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Kinesis Video Signaling Channels using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoSignalingChannelsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
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
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisvideosignalingchannels/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisvideosignalingchannels/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username,
     * and password which can be used to configure the WebRTC connection. The ICE component uses this configuration
     * information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT
     * (TURN) relay server.
     * </p>
     * <p>
     * TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a
     * cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are
     * incapable of a direct peer-to-peer connection. For more information, see <a
     * href="https://tools.ietf.org/html/draft-uberti-rtcweb-turn-rest-00">A REST API For Access To TURN Services</a>.
     * </p>
     * <p>
     * You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a
     * direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the
     * client ID in order to invoke this API.
     * </p>
     * 
     * @param getIceServerConfigRequest
     * @return Result of the GetIceServerConfig operation returned by the service.
     * @throws InvalidClientException
     *         The specified client is invalid.
     * @throws SessionExpiredException
     *         If the client session is expired. Once the client is connected, the session is valid for 45 minutes.
     *         Client should reconnect to the channel to continue sending/receiving messages.
     * @throws ClientLimitExceededException
     *         Your request was throttled because you have exceeded the limit of allowed client calls. Try making the
     *         call later.
     * @throws ResourceNotFoundException
     *         The specified resource is not found.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideoSignalingChannels.GetIceServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIceServerConfigResult getIceServerConfig(GetIceServerConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetIceServerConfig(request);
    }

    @SdkInternalApi
    final GetIceServerConfigResult executeGetIceServerConfig(GetIceServerConfigRequest getIceServerConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getIceServerConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIceServerConfigRequest> request = null;
        Response<GetIceServerConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIceServerConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIceServerConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video Signaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIceServerConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIceServerConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIceServerConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the
     * Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master
     * is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If
     * the master is not connected to the signaling channel, redelivery requests are made until the message expires.
     * </p>
     * 
     * @param sendAlexaOfferToMasterRequest
     * @return Result of the SendAlexaOfferToMaster operation returned by the service.
     * @throws ClientLimitExceededException
     *         Your request was throttled because you have exceeded the limit of allowed client calls. Try making the
     *         call later.
     * @throws ResourceNotFoundException
     *         The specified resource is not found.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideoSignalingChannels.SendAlexaOfferToMaster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendAlexaOfferToMasterResult sendAlexaOfferToMaster(SendAlexaOfferToMasterRequest request) {
        request = beforeClientExecution(request);
        return executeSendAlexaOfferToMaster(request);
    }

    @SdkInternalApi
    final SendAlexaOfferToMasterResult executeSendAlexaOfferToMaster(SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest) {

        ExecutionContext executionContext = createExecutionContext(sendAlexaOfferToMasterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendAlexaOfferToMasterRequest> request = null;
        Response<SendAlexaOfferToMasterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendAlexaOfferToMasterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendAlexaOfferToMasterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video Signaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendAlexaOfferToMaster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendAlexaOfferToMasterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendAlexaOfferToMasterResultJsonUnmarshaller());
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

}
