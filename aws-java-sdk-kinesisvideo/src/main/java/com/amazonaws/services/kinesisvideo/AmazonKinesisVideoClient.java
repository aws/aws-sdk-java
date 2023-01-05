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
package com.amazonaws.services.kinesisvideo;

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

import com.amazonaws.services.kinesisvideo.AmazonKinesisVideoClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.services.kinesisvideo.model.transform.*;

/**
 * Client for accessing Kinesis Video. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoClient extends AmazonWebServiceClient implements AmazonKinesisVideo {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisVideo.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("AccountStreamLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.AccountStreamLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VersionMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.VersionMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountChannelLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.AccountChannelLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.ClientLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StreamEdgeConfigurationNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.StreamEdgeConfigurationNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceFormatException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.InvalidResourceFormatExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoDataRetentionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.NoDataRetentionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeviceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.InvalidDeviceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsPerResourceExceededLimitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.TagsPerResourceExceededLimitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeviceStreamLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.DeviceStreamLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kinesisvideo.model.transform.NotAuthorizedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisvideo.model.AmazonKinesisVideoException.class));

    public static AmazonKinesisVideoClientBuilder builder() {
        return AmazonKinesisVideoClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Video using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Video using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
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
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisvideo/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisvideo/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a signaling channel.
     * </p>
     * <p>
     * <code>CreateSignalingChannel</code> is an asynchronous operation.
     * </p>
     * 
     * @param createSignalingChannelRequest
     * @return Result of the CreateSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws AccountChannelLimitExceededException
     *         You have reached the maximum limit of active signaling channels for this Amazon Web Services account in
     *         this region.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.CreateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSignalingChannelResult createSignalingChannel(CreateSignalingChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSignalingChannel(request);
    }

    @SdkInternalApi
    final CreateSignalingChannelResult executeCreateSignalingChannel(CreateSignalingChannelRequest createSignalingChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createSignalingChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSignalingChannelRequest> request = null;
        Response<CreateSignalingChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSignalingChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSignalingChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSignalingChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSignalingChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSignalingChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Kinesis video stream.
     * </p>
     * <p>
     * When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's
     * metadata, Kinesis Video Streams updates the version.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation.
     * </p>
     * <p>
     * For information about how the service works, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html">How it Works</a>.
     * </p>
     * <p>
     * You must have permissions for the <code>KinesisVideo:CreateStream</code> action.
     * </p>
     * 
     * @param createStreamRequest
     * @return Result of the CreateStream operation returned by the service.
     * @throws AccountStreamLimitExceededException
     *         The number of streams created for the account is too high.
     * @throws DeviceStreamLimitExceededException
     *         Not implemented.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws InvalidDeviceException
     *         Not implemented.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.CreateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStreamResult createStream(CreateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStream(request);
    }

    @SdkInternalApi
    final CreateStreamResult executeCreateStream(CreateStreamRequest createStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<CreateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified signaling channel. <code>DeleteSignalingChannel</code> is an asynchronous operation. If you
     * don't specify the channel's current version, the most recent version is deleted.
     * </p>
     * 
     * @param deleteSignalingChannelRequest
     * @return Result of the DeleteSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideo.DeleteSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSignalingChannelResult deleteSignalingChannel(DeleteSignalingChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSignalingChannel(request);
    }

    @SdkInternalApi
    final DeleteSignalingChannelResult executeDeleteSignalingChannel(DeleteSignalingChannelRequest deleteSignalingChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSignalingChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSignalingChannelRequest> request = null;
        Response<DeleteSignalingChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSignalingChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSignalingChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSignalingChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSignalingChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSignalingChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Kinesis video stream and the data contained in the stream.
     * </p>
     * <p>
     * This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.
     * </p>
     * <p>
     * </p>
     * <p>
     * To ensure that you have the latest version of the stream before deleting it, you can specify the stream version.
     * Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a
     * new version number. To get the latest stream version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:DeleteStream</code> action.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideo.DeleteStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStream(request);
    }

    @SdkInternalApi
    final DeleteStreamResult executeDeleteStream(DeleteStreamRequest deleteStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<DeleteStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a stream’s edge configuration that was set using the <code>StartEdgeConfigurationUpdate</code> API. Use
     * this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
     * </p>
     * 
     * @param describeEdgeConfigurationRequest
     * @return Result of the DescribeEdgeConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws StreamEdgeConfigurationNotFoundException
     *         The Exception rendered when the Amazon Kinesis Video Stream can't find a stream's edge configuration that
     *         you specified.
     * @sample AmazonKinesisVideo.DescribeEdgeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeEdgeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEdgeConfigurationResult describeEdgeConfiguration(DescribeEdgeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEdgeConfiguration(request);
    }

    @SdkInternalApi
    final DescribeEdgeConfigurationResult executeDescribeEdgeConfiguration(DescribeEdgeConfigurationRequest describeEdgeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEdgeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEdgeConfigurationRequest> request = null;
        Response<DescribeEdgeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEdgeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEdgeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEdgeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEdgeConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEdgeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <code>ImageGenerationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeImageGenerationConfigurationRequest
     * @return Result of the DescribeImageGenerationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeImageGenerationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeImageGenerationConfigurationResult describeImageGenerationConfiguration(DescribeImageGenerationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImageGenerationConfiguration(request);
    }

    @SdkInternalApi
    final DescribeImageGenerationConfigurationResult executeDescribeImageGenerationConfiguration(
            DescribeImageGenerationConfigurationRequest describeImageGenerationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImageGenerationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImageGenerationConfigurationRequest> request = null;
        Response<DescribeImageGenerationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImageGenerationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeImageGenerationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeImageGenerationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImageGenerationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeImageGenerationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most current information about the stream. Either streamName or streamARN should be provided in the
     * input.
     * </p>
     * <p>
     * Returns the most current information about the stream. The <code>streamName</code> or <code>streamARN</code>
     * should be provided in the input.
     * </p>
     * 
     * @param describeMappedResourceConfigurationRequest
     * @return Result of the DescribeMappedResourceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @sample AmazonKinesisVideo.DescribeMappedResourceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMappedResourceConfigurationResult describeMappedResourceConfiguration(DescribeMappedResourceConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMappedResourceConfiguration(request);
    }

    @SdkInternalApi
    final DescribeMappedResourceConfigurationResult executeDescribeMappedResourceConfiguration(
            DescribeMappedResourceConfigurationRequest describeMappedResourceConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMappedResourceConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMappedResourceConfigurationRequest> request = null;
        Response<DescribeMappedResourceConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMappedResourceConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMappedResourceConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMappedResourceConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMappedResourceConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMappedResourceConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most current information about the channel. Specify the <code>ChannelName</code> or
     * <code>ChannelARN</code> in the input.
     * </p>
     * 
     * @param describeMediaStorageConfigurationRequest
     * @return Result of the DescribeMediaStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @sample AmazonKinesisVideo.DescribeMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMediaStorageConfigurationResult describeMediaStorageConfiguration(DescribeMediaStorageConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMediaStorageConfiguration(request);
    }

    @SdkInternalApi
    final DescribeMediaStorageConfigurationResult executeDescribeMediaStorageConfiguration(
            DescribeMediaStorageConfigurationRequest describeMediaStorageConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMediaStorageConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMediaStorageConfigurationRequest> request = null;
        Response<DescribeMediaStorageConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMediaStorageConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMediaStorageConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMediaStorageConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMediaStorageConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMediaStorageConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <code>NotificationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeNotificationConfigurationRequest
     * @return Result of the DescribeNotificationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotificationConfigurationResult describeNotificationConfiguration(DescribeNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotificationConfiguration(request);
    }

    @SdkInternalApi
    final DescribeNotificationConfigurationResult executeDescribeNotificationConfiguration(
            DescribeNotificationConfigurationRequest describeNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationConfigurationRequest> request = null;
        Response<DescribeNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotificationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNotificationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most current information about the signaling channel. You must specify either the name or the Amazon
     * Resource Name (ARN) of the channel that you want to describe.
     * </p>
     * 
     * @param describeSignalingChannelRequest
     * @return Result of the DescribeSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSignalingChannel(request);
    }

    @SdkInternalApi
    final DescribeSignalingChannelResult executeDescribeSignalingChannel(DescribeSignalingChannelRequest describeSignalingChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSignalingChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSignalingChannelRequest> request = null;
        Response<DescribeSignalingChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSignalingChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSignalingChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSignalingChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSignalingChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSignalingChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most current information about the specified stream. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param describeStreamRequest
     * @return Result of the DescribeStream operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideo.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStream(request);
    }

    @SdkInternalApi
    final DescribeStreamResult executeDescribeStream(DescribeStreamRequest describeStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to
     * read from the specified stream (using the <code>GetMedia</code> or <code>GetMediaForFragmentList</code>
     * operations) or write to it (using the <code>PutMedia</code> operation).
     * </p>
     * <note>
     * <p>
     * The returned endpoint does not have the API name appended. The client needs to add the API name to the returned
     * endpoint.
     * </p>
     * </note>
     * <p>
     * In the request, specify the stream either by <code>StreamName</code> or <code>StreamARN</code>.
     * </p>
     * 
     * @param getDataEndpointRequest
     * @return Result of the GetDataEndpoint operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideo.GetDataEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetDataEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDataEndpointResult getDataEndpoint(GetDataEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataEndpoint(request);
    }

    @SdkInternalApi
    final GetDataEndpointResult executeGetDataEndpoint(GetDataEndpointRequest getDataEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataEndpointRequest> request = null;
        Response<GetDataEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides an endpoint for the specified signaling channel to send and receive messages. This API uses the
     * <code>SingleMasterChannelEndpointConfiguration</code> input parameter, which consists of the
     * <code>Protocols</code> and <code>Role</code> properties.
     * </p>
     * <p>
     * <code>Protocols</code> is used to determine the communication mechanism. For example, if you specify
     * <code>WSS</code> as the protocol, this API produces a secure websocket endpoint. If you specify
     * <code>HTTPS</code> as the protocol, this API generates an HTTPS endpoint.
     * </p>
     * <p>
     * <code>Role</code> determines the messaging permissions. A <code>MASTER</code> role results in this API generating
     * an endpoint that a client can use to communicate with any of the viewers on the channel. A <code>VIEWER</code>
     * role results in this API generating an endpoint that a client can use to communicate only with a
     * <code>MASTER</code>.
     * </p>
     * 
     * @param getSignalingChannelEndpointRequest
     * @return Result of the GetSignalingChannelEndpoint operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.GetSignalingChannelEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSignalingChannelEndpointResult getSignalingChannelEndpoint(GetSignalingChannelEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetSignalingChannelEndpoint(request);
    }

    @SdkInternalApi
    final GetSignalingChannelEndpointResult executeGetSignalingChannelEndpoint(GetSignalingChannelEndpointRequest getSignalingChannelEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getSignalingChannelEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSignalingChannelEndpointRequest> request = null;
        Response<GetSignalingChannelEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSignalingChannelEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSignalingChannelEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSignalingChannelEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSignalingChannelEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSignalingChannelEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>ChannelInfo</code> objects. Each object describes a signaling channel. To retrieve only
     * those channels that satisfy a specific condition, you can specify a <code>ChannelNameCondition</code>.
     * </p>
     * 
     * @param listSignalingChannelsRequest
     * @return Result of the ListSignalingChannels operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.ListSignalingChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListSignalingChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSignalingChannelsResult listSignalingChannels(ListSignalingChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListSignalingChannels(request);
    }

    @SdkInternalApi
    final ListSignalingChannelsResult executeListSignalingChannels(ListSignalingChannelsRequest listSignalingChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSignalingChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSignalingChannelsRequest> request = null;
        Response<ListSignalingChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSignalingChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSignalingChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSignalingChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSignalingChannelsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListSignalingChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>StreamInfo</code> objects. Each object describes a stream. To retrieve only streams
     * that satisfy a specific condition, you can specify a <code>StreamNameCondition</code>.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @sample AmazonKinesisVideo.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
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
     * Returns a list of tags associated with the specified signaling channel.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
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
     * Returns a list of tags associated with the specified stream.
     * </p>
     * <p>
     * In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param listTagsForStreamRequest
     * @return Result of the ListTagsForStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @sample AmazonKinesisVideo.ListTagsForStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForStream(request);
    }

    @SdkInternalApi
    final ListTagsForStreamResult executeListTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForStreamRequest> request = null;
        Response<ListTagsForStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An asynchronous API that updates a stream’s existing edge configuration. The Kinesis Video Stream will sync the
     * stream’s edge configuration with the Edge Agent IoT Greengrass component that runs on an IoT Hub Device, setup at
     * your premise. The time to sync can vary and depends on the connectivity of the Hub Device. The
     * <code>SyncStatus</code> will be updated as the edge configuration is acknowledged, and synced with the Edge
     * Agent.
     * </p>
     * <p>
     * If this API is invoked for the first time, a new edge configuration will be created for the stream, and the sync
     * status will be set to <code>SYNCING</code>. You will have to wait for the sync status to reach a terminal state
     * such as: <code>IN_SYNC</code>, or <code>SYNC_FAILED</code>, before using this API again. If you invoke this API
     * during the syncing process, a <code>ResourceInUseException</code> will be thrown. The connectivity of the
     * stream’s edge configuration and the Edge Agent will be retried for 15 minutes. After 15 minutes, the status will
     * transition into the <code>SYNC_FAILED</code> state.
     * </p>
     * 
     * @param startEdgeConfigurationUpdateRequest
     * @return Result of the StartEdgeConfigurationUpdate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @sample AmazonKinesisVideo.StartEdgeConfigurationUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartEdgeConfigurationUpdateResult startEdgeConfigurationUpdate(StartEdgeConfigurationUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeStartEdgeConfigurationUpdate(request);
    }

    @SdkInternalApi
    final StartEdgeConfigurationUpdateResult executeStartEdgeConfigurationUpdate(StartEdgeConfigurationUpdateRequest startEdgeConfigurationUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(startEdgeConfigurationUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEdgeConfigurationUpdateRequest> request = null;
        Response<StartEdgeConfigurationUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEdgeConfigurationUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startEdgeConfigurationUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartEdgeConfigurationUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartEdgeConfigurationUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartEdgeConfigurationUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to a signaling channel. A <i>tag</i> is a key-value pair (the value is optional) that you
     * can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value
     * is replaced with the value that you specify in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>Billing and Cost Management and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
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
     * Adds one or more tags to a stream. A <i>tag</i> is a key-value pair (the value is optional) that you can define
     * and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced
     * with the value that you specify in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>Billing and Cost Management and Cost Management User Guide</i>.
     * </p>
     * <p>
     * You must provide either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:TagStream</code> action.
     * </p>
     * <p>
     * A Kinesis video stream can support up to 50 tags.
     * </p>
     * 
     * @param tagStreamRequest
     * @return Result of the TagStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.TagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagStreamResult tagStream(TagStreamRequest request) {
        request = beforeClientExecution(request);
        return executeTagStream(request);
    }

    @SdkInternalApi
    final TagStreamResult executeTagStream(TagStreamRequest tagStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(tagStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagStreamRequest> request = null;
        Response<TagStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagStreamResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify
     * the value. If you specify a tag key that does not exist, it's ignored.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
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
     * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value.
     * If you specify a tag key that does not exist, it's ignored.
     * </p>
     * <p>
     * In the request, you must provide the <code>StreamName</code> or <code>StreamARN</code>.
     * </p>
     * 
     * @param untagStreamRequest
     * @return Result of the UntagStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @sample AmazonKinesisVideo.UntagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagStreamResult untagStream(UntagStreamRequest request) {
        request = beforeClientExecution(request);
        return executeUntagStream(request);
    }

    @SdkInternalApi
    final UntagStreamResult executeUntagStream(UntagStreamRequest untagStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(untagStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagStreamRequest> request = null;
        Response<UntagStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you
     * want to increase or decrease the data retention period, specify the <code>Operation</code> parameter in the
     * request body. In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <note>
     * <p>
     * The retention period that you specify replaces the current value.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:UpdateDataRetention</code> action.
     * </p>
     * <p>
     * Changing the data retention period affects the data in the stream as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the data retention period is increased, existing data is retained for the new retention period. For example,
     * if the data retention period is increased from one hour to seven hours, all existing data is retained for seven
     * hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the data retention period is decreased, existing data is retained for the new retention period. For example,
     * if the data retention period is decreased from seven hours to one hour, all existing data is retained for one
     * hour, and any data older than one hour is deleted immediately.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateDataRetentionRequest
     * @return Result of the UpdateDataRetention operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateDataRetention
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateDataRetention"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataRetentionResult updateDataRetention(UpdateDataRetentionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataRetention(request);
    }

    @SdkInternalApi
    final UpdateDataRetentionResult executeUpdateDataRetention(UpdateDataRetentionRequest updateDataRetentionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataRetentionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataRetentionRequest> request = null;
        Response<UpdateDataRetentionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataRetentionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataRetentionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataRetention");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataRetentionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataRetentionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the <code>StreamInfo</code> and <code>ImageProcessingConfiguration</code> fields.
     * </p>
     * 
     * @param updateImageGenerationConfigurationRequest
     * @return Result of the UpdateImageGenerationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateImageGenerationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateImageGenerationConfigurationResult updateImageGenerationConfiguration(UpdateImageGenerationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateImageGenerationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateImageGenerationConfigurationResult executeUpdateImageGenerationConfiguration(
            UpdateImageGenerationConfigurationRequest updateImageGenerationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateImageGenerationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateImageGenerationConfigurationRequest> request = null;
        Response<UpdateImageGenerationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateImageGenerationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateImageGenerationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateImageGenerationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateImageGenerationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateImageGenerationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a <code>SignalingChannel</code> to a stream to store the media. There are two signaling modes that can
     * specified :
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is disabled, no data will be stored, and the <code>StreamARN</code> parameter
     * will not be needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is enabled, the data will be stored in the <code>StreamARN</code> provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMediaStorageConfigurationRequest
     * @return Result of the UpdateMediaStorageConfiguration operation returned by the service.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMediaStorageConfigurationResult updateMediaStorageConfiguration(UpdateMediaStorageConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMediaStorageConfiguration(request);
    }

    @SdkInternalApi
    final UpdateMediaStorageConfigurationResult executeUpdateMediaStorageConfiguration(
            UpdateMediaStorageConfigurationRequest updateMediaStorageConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMediaStorageConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMediaStorageConfigurationRequest> request = null;
        Response<UpdateMediaStorageConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMediaStorageConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMediaStorageConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMediaStorageConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMediaStorageConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMediaStorageConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the notification information for a stream.
     * </p>
     * 
     * @param updateNotificationConfigurationRequest
     * @return Result of the UpdateNotificationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNotificationConfigurationResult updateNotificationConfiguration(UpdateNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotificationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateNotificationConfigurationResult executeUpdateNotificationConfiguration(
            UpdateNotificationConfigurationRequest updateNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotificationConfigurationRequest> request = null;
        Response<UpdateNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotificationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotificationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotificationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the existing signaling channel. This is an asynchronous operation and takes time to complete.
     * </p>
     * <p>
     * If the <code>MessageTtlSeconds</code> value is updated (either increased or reduced), it only applies to new
     * messages sent via this channel after it's been updated. Existing messages are still expired as per the previous
     * <code>MessageTtlSeconds</code> value.
     * </p>
     * 
     * @param updateSignalingChannelRequest
     * @return Result of the UpdateSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSignalingChannelResult updateSignalingChannel(UpdateSignalingChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSignalingChannel(request);
    }

    @SdkInternalApi
    final UpdateSignalingChannelResult executeUpdateSignalingChannel(UpdateSignalingChannelRequest updateSignalingChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSignalingChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSignalingChannelRequest> request = null;
        Response<UpdateSignalingChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSignalingChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSignalingChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSignalingChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSignalingChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSignalingChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates stream metadata, such as the device name and media type.
     * </p>
     * <p>
     * You must provide the stream name or the Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * To make sure that you have the latest version of the stream before updating it, you can specify the stream
     * version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams
     * assigns a new version number. To get the latest stream version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * <code>UpdateStream</code> is an asynchronous operation, and takes time to complete.
     * </p>
     * 
     * @param updateStreamRequest
     * @return Result of the UpdateStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStreamResult updateStream(UpdateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStream(request);
    }

    @SdkInternalApi
    final UpdateStreamResult executeUpdateStream(UpdateStreamRequest updateStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamRequest> request = null;
        Response<UpdateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Video");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStreamResultJsonUnmarshaller());
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
