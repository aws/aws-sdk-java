/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeviceStreamLimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.DeviceStreamLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountStreamLimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.AccountStreamLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientLimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VersionMismatchException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.VersionMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeviceException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.InvalidDeviceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceFormatException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.InvalidResourceFormatException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsPerResourceExceededLimitException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.TagsPerResourceExceededLimitException.class))
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
     *         The stream is currently not available for this operation.
     * @throws InvalidDeviceException
     *         Not implemented.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. Kinesis video streams
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
     * Adds one or more tags to a stream. A <i>tag</i> is a key-value pair (the value is optional) that you can define
     * and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value
     * that you specify in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * You must provide either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:TagStream</code> action.
     * </p>
     * <p>
     * Kinesis video streams support up to 50 tags.
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
     *         You have exceeded the limit of tags that you can associate with the resource. Kinesis video streams
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
     *         The stream is currently not available for this operation.
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
     *         The stream is currently not available for this operation.
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

}
