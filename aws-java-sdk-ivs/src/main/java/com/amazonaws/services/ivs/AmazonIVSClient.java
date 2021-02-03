/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs;

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

import com.amazonaws.services.ivs.AmazonIVSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ivs.model.*;
import com.amazonaws.services.ivs.model.transform.*;

/**
 * Client for accessing Amazon IVS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) API is REST compatible, using a standard HTTP API and an <a
 * href="http://aws.amazon.com/sns">AWS SNS</a> event stream for responses. JSON is used for both requests and
 * responses, including errors.
 * </p>
 * <p>
 * The API is an AWS regional service, currently in these regions: us-west-2, us-east-1, and eu-west-1.
 * </p>
 * <p>
 * <i> <b>All API request parameters and URLs are case sensitive. </b> </i>
 * </p>
 * <p>
 * For a summary of notable documentation changes in each release, see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/doc-history.html"> Document History</a>.
 * </p>
 * <p>
 * <b>Service Endpoints</b>
 * </p>
 * <p>
 * The following are the Amazon IVS service endpoints (all HTTPS):
 * </p>
 * <p>
 * Region name: US West (Oregon)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-west-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: US East (Virginia)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: EU West (Dublin)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>eu-west-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Allowed Header Values</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <b>Accept:</b> </code> application/json
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Accept-Encoding:</b> </code> gzip, deflate
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Content-Type:</b> </code>application/json
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/GSIVS.html"> Getting Started with Amazon IVS</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Channel — Stores configuration data related to your live stream. You first create a channel and then use the
 * channel’s stream key to start your live stream. See the Channel endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream key — An identifier assigned by Amazon IVS when you create a channel, which is then used to authorize
 * streaming. See the StreamKey endpoints for more information. <i> <b>Treat the stream key like a secret, since it
 * allows anyone to stream to the channel.</b> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Playback key pair — Video playback may be restricted using playback-authorization tokens, which use public-key
 * encryption. A playback key pair is the public-private pair of keys used to sign and validate the
 * playback-authorization token. See the PlaybackKeyPair endpoints for more information.
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
 * information, including restrictions that apply to tags.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"> Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resources support tagging: Channels, Stream Keys, and Playback Key Pairs.
 * </p>
 * <p>
 * <b>Channel Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChannel</a> — Creates a new channel and an associated stream key to start streaming.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetChannel</a> — Gets the channel configuration for the specified channel ARN (Amazon Resource Name).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetChannel</a> — Performs <a>GetChannel</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListChannels</a> — Gets summary information about all channels in your account, in the AWS region where the API
 * request is processed. This list can be filtered to match a specified string.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChannel</a> — Updates a channel's configuration. This does not affect an ongoing stream of this channel. You
 * must stop and restart the stream for the changes to take effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteChannel</a> — Deletes the specified channel.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StreamKey Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStreamKey</a> — Creates a stream key, used to initiate a stream, for the specified channel ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStreamKey</a> — Gets stream key information for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetStreamKey</a> — Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreamKeys</a> — Gets summary information about stream keys for the specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStreamKey</a> — Deletes the stream key for the specified ARN, so it can no longer be used to stream.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Stream Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetStream</a> — Gets information about the active (live) stream on a specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreams</a> — Gets summary information about live streams in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopStream</a> — Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
 * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutMetadata</a> — Inserts metadata into an RTMPS stream for the specified channel. A maximum of 5 requests per
 * second per channel is allowed, each with a maximum 1KB payload.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>PlaybackKeyPair Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ImportPlaybackKeyPair</a> — Imports the public portion of a new key pair and returns its <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> can then be used to generate viewer authorization tokens, to
 * grant viewers access to authorized channels.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPlaybackKeyPair</a> — Gets a specified playback authorization key pair and returns the <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> held by the caller can be used to generate viewer authorization
 * tokens, to grant viewers access to authorized channels.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPlaybackKeyPairs</a> — Gets summary information about playback key pairs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePlaybackKeyPair</a> — Deletes a specified authorization key pair. This invalidates future viewer tokens
 * generated using the key pair’s <code>privateKey</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>AWS Tags Endpoints</b>
 * </p>
 * <ul>
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
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonIVSClient extends AmazonWebServiceClient implements AmazonIVS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonIVS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ivs";

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
                            new JsonErrorShapeMetadata().withErrorCode("StreamUnavailable").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.StreamUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ChannelNotBroadcasting").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ChannelNotBroadcastingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PendingVerification").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.PendingVerificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivs.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ivs.model.AmazonIVSException.class));

    public static AmazonIVSClientBuilder builder() {
        return AmazonIVSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon IVS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonIVSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon IVS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonIVSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ivs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ivs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ivs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @return Result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVS.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetChannelResult batchGetChannel(BatchGetChannelRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetChannel(request);
    }

    @SdkInternalApi
    final BatchGetChannelResult executeBatchGetChannel(BatchGetChannelRequest batchGetChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetChannelRequest> request = null;
        Response<BatchGetChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @return Result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVS.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetStreamKeyResult batchGetStreamKey(BatchGetStreamKeyRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetStreamKey(request);
    }

    @SdkInternalApi
    final BatchGetStreamKeyResult executeBatchGetStreamKey(BatchGetStreamKeyRequest batchGetStreamKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetStreamKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetStreamKeyRequest> request = null;
        Response<BatchGetStreamKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetStreamKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetStreamKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetStreamKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetStreamKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetStreamKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * Creates a stream key, used to initiate a stream, for the specified channel ARN.
     * </p>
     * <p>
     * Note that <a>CreateChannel</a> creates a stream key. If you subsequently use CreateStreamKey on the same channel,
     * it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the
     * stream key on a channel, use <a>DeleteStreamKey</a> and then CreateStreamKey.
     * </p>
     * 
     * @param createStreamKeyRequest
     * @return Result of the CreateStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStreamKeyResult createStreamKey(CreateStreamKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamKey(request);
    }

    @SdkInternalApi
    final CreateStreamKeyResult executeCreateStreamKey(CreateStreamKeyRequest createStreamKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamKeyRequest> request = null;
        Response<CreateStreamKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified channel and its associated stream keys.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s
     * <code>privateKey</code>.
     * </p>
     * 
     * @param deletePlaybackKeyPairRequest
     * @return Result of the DeletePlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeletePlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeletePlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePlaybackKeyPairResult deletePlaybackKeyPair(DeletePlaybackKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlaybackKeyPair(request);
    }

    @SdkInternalApi
    final DeletePlaybackKeyPairResult executeDeletePlaybackKeyPair(DeletePlaybackKeyPairRequest deletePlaybackKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlaybackKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlaybackKeyPairRequest> request = null;
        Response<DeletePlaybackKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlaybackKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePlaybackKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlaybackKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePlaybackKeyPairResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeletePlaybackKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @return Result of the DeleteStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStreamKeyResult deleteStreamKey(DeleteStreamKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStreamKey(request);
    }

    @SdkInternalApi
    final DeleteStreamKeyResult executeDeleteStreamKey(DeleteStreamKeyRequest deleteStreamKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamKeyRequest> request = null;
        Response<DeleteStreamKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStreamKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStreamKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the channel configuration for the specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChannelResult getChannel(GetChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannel(request);
    }

    @SdkInternalApi
    final GetChannelResult executeGetChannel(GetChannelRequest getChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelRequest> request = null;
        Response<GetChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a specified playback authorization key pair and returns the <code>arn</code> and <code>fingerprint</code>.
     * The <code>privateKey</code> held by the caller can be used to generate viewer authorization tokens, to grant
     * viewers access to authorized channels.
     * </p>
     * 
     * @param getPlaybackKeyPairRequest
     * @return Result of the GetPlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPlaybackKeyPairResult getPlaybackKeyPair(GetPlaybackKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlaybackKeyPair(request);
    }

    @SdkInternalApi
    final GetPlaybackKeyPairResult executeGetPlaybackKeyPair(GetPlaybackKeyPairRequest getPlaybackKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlaybackKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlaybackKeyPairRequest> request = null;
        Response<GetPlaybackKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlaybackKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPlaybackKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlaybackKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPlaybackKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPlaybackKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @return Result of the GetStream operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ChannelNotBroadcastingException
     * @sample AmazonIVS.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStreamResult getStream(GetStreamRequest request) {
        request = beforeClientExecution(request);
        return executeGetStream(request);
    }

    @SdkInternalApi
    final GetStreamResult executeGetStream(GetStreamRequest getStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamRequest> request = null;
        Response<GetStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @return Result of the GetStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStreamKeyResult getStreamKey(GetStreamKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamKey(request);
    }

    @SdkInternalApi
    final GetStreamKeyResult executeGetStreamKey(GetStreamKeyRequest getStreamKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamKeyRequest> request = null;
        Response<GetStreamKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStreamKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStreamKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the public portion of a new key pair and returns its <code>arn</code> and <code>fingerprint</code>. The
     * <code>privateKey</code> can then be used to generate viewer authorization tokens, to grant viewers access to
     * authorized channels.
     * </p>
     * 
     * @param importPlaybackKeyPairRequest
     * @return Result of the ImportPlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.ImportPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ImportPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportPlaybackKeyPairResult importPlaybackKeyPair(ImportPlaybackKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeImportPlaybackKeyPair(request);
    }

    @SdkInternalApi
    final ImportPlaybackKeyPairResult executeImportPlaybackKeyPair(ImportPlaybackKeyPairRequest importPlaybackKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(importPlaybackKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportPlaybackKeyPairRequest> request = null;
        Response<ImportPlaybackKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportPlaybackKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importPlaybackKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportPlaybackKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportPlaybackKeyPairResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ImportPlaybackKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all channels in your account, in the AWS region where the API request is
     * processed. This list can be filtered to match a specified string.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVS.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * Gets summary information about playback key pairs.
     * </p>
     * 
     * @param listPlaybackKeyPairsRequest
     * @return Result of the ListPlaybackKeyPairs operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVS.ListPlaybackKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPlaybackKeyPairsResult listPlaybackKeyPairs(ListPlaybackKeyPairsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlaybackKeyPairs(request);
    }

    @SdkInternalApi
    final ListPlaybackKeyPairsResult executeListPlaybackKeyPairs(ListPlaybackKeyPairsRequest listPlaybackKeyPairsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlaybackKeyPairsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlaybackKeyPairsRequest> request = null;
        Response<ListPlaybackKeyPairsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlaybackKeyPairsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPlaybackKeyPairsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlaybackKeyPairs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPlaybackKeyPairsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPlaybackKeyPairsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about stream keys for the specified channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @return Result of the ListStreamKeys operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStreamKeysResult listStreamKeys(ListStreamKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamKeys(request);
    }

    @SdkInternalApi
    final ListStreamKeysResult executeListStreamKeys(ListStreamKeysRequest listStreamKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamKeysRequest> request = null;
        Response<ListStreamKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about live streams in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws AccessDeniedException
     * @sample AmazonIVS.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStreamsResult listStreams(ListStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreams(request);
    }

    @SdkInternalApi
    final ListStreamsResult executeListStreams(ListStreamsRequest listStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamsResultJsonUnmarshaller());
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
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * Inserts metadata into an RTMPS stream for the specified channel. A maximum of 5 requests per second per channel
     * is allowed, each with a maximum 1KB payload.
     * </p>
     * 
     * @param putMetadataRequest
     * @return Result of the PutMetadata operation returned by the service.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ChannelNotBroadcastingException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVS.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutMetadataResult putMetadata(PutMetadataRequest request) {
        request = beforeClientExecution(request);
        return executePutMetadata(request);
    }

    @SdkInternalApi
    final PutMetadataResult executePutMetadata(PutMetadataRequest putMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(putMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetadataRequest> request = null;
        Response<PutMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
     * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
     * </p>
     * <note>
     * <p>
     * Many streaming client-software libraries automatically reconnect a dropped RTMPS session, so to stop the stream
     * permanently, you may want to first revoke the <code>streamKey</code> attached to the channel.
     * </p>
     * </note>
     * 
     * @param stopStreamRequest
     * @return Result of the StopStream operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ChannelNotBroadcastingException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws StreamUnavailableException
     * @sample AmazonIVS.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopStreamResult stopStream(StopStreamRequest request) {
        request = beforeClientExecution(request);
        return executeStopStream(request);
    }

    @SdkInternalApi
    final StopStreamResult executeStopStream(StopStreamRequest stopStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamRequest> request = null;
        Response<StopStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopStreamResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopStreamResultJsonUnmarshaller());
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
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVS.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ivs");
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
