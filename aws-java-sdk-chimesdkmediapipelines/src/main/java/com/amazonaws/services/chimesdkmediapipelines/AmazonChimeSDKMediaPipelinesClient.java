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
package com.amazonaws.services.chimesdkmediapipelines;

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

import com.amazonaws.services.chimesdkmediapipelines.AmazonChimeSDKMediaPipelinesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.services.chimesdkmediapipelines.model.transform.*;

/**
 * Client for accessing Amazon Chime SDK Media Pipelines. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime SDK media pipeline APIs in this section allow software developers to create Amazon Chime SDK media
 * pipelines that capture, concatenate, or stream your Amazon Chime SDK meetings. For more information about media
 * pipelines, see <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html"
 * >Amazon Chime SDK media pipelines</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMediaPipelinesClient extends AmazonWebServiceClient implements AmazonChimeSDKMediaPipelines {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChimeSDKMediaPipelines.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.UnauthorizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ServiceFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ThrottledClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmediapipelines.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chimesdkmediapipelines.model.AmazonChimeSDKMediaPipelinesException.class));

    public static AmazonChimeSDKMediaPipelinesClientBuilder builder() {
        return AmazonChimeSDKMediaPipelinesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Media Pipelines using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMediaPipelinesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Media Pipelines using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMediaPipelinesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("media-pipelines-chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chimesdkmediapipelines/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chimesdkmediapipelines/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @return Result of the CreateMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaCapturePipelineResult createMediaCapturePipeline(CreateMediaCapturePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaCapturePipeline(request);
    }

    @SdkInternalApi
    final CreateMediaCapturePipelineResult executeCreateMediaCapturePipeline(CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaCapturePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaCapturePipelineRequest> request = null;
        Response<CreateMediaCapturePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaCapturePipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaCapturePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaCapturePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaCapturePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMediaCapturePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @return Result of the CreateMediaConcatenationPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaConcatenationPipelineResult createMediaConcatenationPipeline(CreateMediaConcatenationPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaConcatenationPipeline(request);
    }

    @SdkInternalApi
    final CreateMediaConcatenationPipelineResult executeCreateMediaConcatenationPipeline(
            CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaConcatenationPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaConcatenationPipelineRequest> request = null;
        Response<CreateMediaConcatenationPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaConcatenationPipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaConcatenationPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaConcatenationPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaConcatenationPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMediaConcatenationPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @return Result of the CreateMediaInsightsPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaInsightsPipelineResult createMediaInsightsPipeline(CreateMediaInsightsPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaInsightsPipeline(request);
    }

    @SdkInternalApi
    final CreateMediaInsightsPipelineResult executeCreateMediaInsightsPipeline(CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaInsightsPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaInsightsPipelineRequest> request = null;
        Response<CreateMediaInsightsPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaInsightsPipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaInsightsPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaInsightsPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaInsightsPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMediaInsightsPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @return Result of the CreateMediaInsightsPipelineConfiguration operation returned by the service.
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
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaInsightsPipelineConfigurationResult createMediaInsightsPipelineConfiguration(CreateMediaInsightsPipelineConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaInsightsPipelineConfiguration(request);
    }

    @SdkInternalApi
    final CreateMediaInsightsPipelineConfigurationResult executeCreateMediaInsightsPipelineConfiguration(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaInsightsPipelineConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaInsightsPipelineConfigurationRequest> request = null;
        Response<CreateMediaInsightsPipelineConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaInsightsPipelineConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaInsightsPipelineConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaInsightsPipelineConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaInsightsPipelineConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateMediaInsightsPipelineConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @return Result of the CreateMediaLiveConnectorPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaLiveConnectorPipelineResult createMediaLiveConnectorPipeline(CreateMediaLiveConnectorPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaLiveConnectorPipeline(request);
    }

    @SdkInternalApi
    final CreateMediaLiveConnectorPipelineResult executeCreateMediaLiveConnectorPipeline(
            CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaLiveConnectorPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaLiveConnectorPipelineRequest> request = null;
        Response<CreateMediaLiveConnectorPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaLiveConnectorPipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaLiveConnectorPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaLiveConnectorPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaLiveConnectorPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMediaLiveConnectorPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Kinesis video stream pool for the media pipeline.
     * </p>
     * 
     * @param createMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the CreateMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaPipelineKinesisVideoStreamPoolResult createMediaPipelineKinesisVideoStreamPool(CreateMediaPipelineKinesisVideoStreamPoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaPipelineKinesisVideoStreamPool(request);
    }

    @SdkInternalApi
    final CreateMediaPipelineKinesisVideoStreamPoolResult executeCreateMediaPipelineKinesisVideoStreamPool(
            CreateMediaPipelineKinesisVideoStreamPoolRequest createMediaPipelineKinesisVideoStreamPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaPipelineKinesisVideoStreamPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaPipelineKinesisVideoStreamPoolRequest> request = null;
        Response<CreateMediaPipelineKinesisVideoStreamPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaPipelineKinesisVideoStreamPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaPipelineKinesisVideoStreamPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaPipelineKinesisVideoStreamPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateMediaPipelineKinesisVideoStreamPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a streaming media pipeline.
     * </p>
     * 
     * @param createMediaStreamPipelineRequest
     * @return Result of the CreateMediaStreamPipeline operation returned by the service.
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
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaStreamPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaStreamPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMediaStreamPipelineResult createMediaStreamPipeline(CreateMediaStreamPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMediaStreamPipeline(request);
    }

    @SdkInternalApi
    final CreateMediaStreamPipelineResult executeCreateMediaStreamPipeline(CreateMediaStreamPipelineRequest createMediaStreamPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createMediaStreamPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMediaStreamPipelineRequest> request = null;
        Response<CreateMediaStreamPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMediaStreamPipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMediaStreamPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMediaStreamPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMediaStreamPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMediaStreamPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @return Result of the DeleteMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMediaCapturePipelineResult deleteMediaCapturePipeline(DeleteMediaCapturePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMediaCapturePipeline(request);
    }

    @SdkInternalApi
    final DeleteMediaCapturePipelineResult executeDeleteMediaCapturePipeline(DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMediaCapturePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMediaCapturePipelineRequest> request = null;
        Response<DeleteMediaCapturePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMediaCapturePipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMediaCapturePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMediaCapturePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMediaCapturePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMediaCapturePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @return Result of the DeleteMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMediaInsightsPipelineConfigurationResult deleteMediaInsightsPipelineConfiguration(DeleteMediaInsightsPipelineConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMediaInsightsPipelineConfiguration(request);
    }

    @SdkInternalApi
    final DeleteMediaInsightsPipelineConfigurationResult executeDeleteMediaInsightsPipelineConfiguration(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMediaInsightsPipelineConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMediaInsightsPipelineConfigurationRequest> request = null;
        Response<DeleteMediaInsightsPipelineConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMediaInsightsPipelineConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMediaInsightsPipelineConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMediaInsightsPipelineConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMediaInsightsPipelineConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteMediaInsightsPipelineConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @return Result of the DeleteMediaPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMediaPipelineResult deleteMediaPipeline(DeleteMediaPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMediaPipeline(request);
    }

    @SdkInternalApi
    final DeleteMediaPipelineResult executeDeleteMediaPipeline(DeleteMediaPipelineRequest deleteMediaPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMediaPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMediaPipelineRequest> request = null;
        Response<DeleteMediaPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMediaPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMediaPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMediaPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMediaPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMediaPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Kinesis video stream pool.
     * </p>
     * 
     * @param deleteMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the DeleteMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMediaPipelineKinesisVideoStreamPoolResult deleteMediaPipelineKinesisVideoStreamPool(DeleteMediaPipelineKinesisVideoStreamPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMediaPipelineKinesisVideoStreamPool(request);
    }

    @SdkInternalApi
    final DeleteMediaPipelineKinesisVideoStreamPoolResult executeDeleteMediaPipelineKinesisVideoStreamPool(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest deleteMediaPipelineKinesisVideoStreamPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMediaPipelineKinesisVideoStreamPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMediaPipelineKinesisVideoStreamPoolRequest> request = null;
        Response<DeleteMediaPipelineKinesisVideoStreamPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMediaPipelineKinesisVideoStreamPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMediaPipelineKinesisVideoStreamPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMediaPipelineKinesisVideoStreamPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteMediaPipelineKinesisVideoStreamPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @return Result of the GetMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMediaCapturePipelineResult getMediaCapturePipeline(GetMediaCapturePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetMediaCapturePipeline(request);
    }

    @SdkInternalApi
    final GetMediaCapturePipelineResult executeGetMediaCapturePipeline(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getMediaCapturePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaCapturePipelineRequest> request = null;
        Response<GetMediaCapturePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaCapturePipelineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMediaCapturePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMediaCapturePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMediaCapturePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMediaCapturePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @return Result of the GetMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMediaInsightsPipelineConfigurationResult getMediaInsightsPipelineConfiguration(GetMediaInsightsPipelineConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetMediaInsightsPipelineConfiguration(request);
    }

    @SdkInternalApi
    final GetMediaInsightsPipelineConfigurationResult executeGetMediaInsightsPipelineConfiguration(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getMediaInsightsPipelineConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaInsightsPipelineConfigurationRequest> request = null;
        Response<GetMediaInsightsPipelineConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaInsightsPipelineConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMediaInsightsPipelineConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMediaInsightsPipelineConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMediaInsightsPipelineConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMediaInsightsPipelineConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @return Result of the GetMediaPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMediaPipelineResult getMediaPipeline(GetMediaPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetMediaPipeline(request);
    }

    @SdkInternalApi
    final GetMediaPipelineResult executeGetMediaPipeline(GetMediaPipelineRequest getMediaPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getMediaPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaPipelineRequest> request = null;
        Response<GetMediaPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMediaPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMediaPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMediaPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMediaPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Kinesis video stream pool.
     * </p>
     * 
     * @param getMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the GetMediaPipelineKinesisVideoStreamPool operation returned by the service.
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
     * @sample AmazonChimeSDKMediaPipelines.GetMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMediaPipelineKinesisVideoStreamPoolResult getMediaPipelineKinesisVideoStreamPool(GetMediaPipelineKinesisVideoStreamPoolRequest request) {
        request = beforeClientExecution(request);
        return executeGetMediaPipelineKinesisVideoStreamPool(request);
    }

    @SdkInternalApi
    final GetMediaPipelineKinesisVideoStreamPoolResult executeGetMediaPipelineKinesisVideoStreamPool(
            GetMediaPipelineKinesisVideoStreamPoolRequest getMediaPipelineKinesisVideoStreamPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(getMediaPipelineKinesisVideoStreamPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaPipelineKinesisVideoStreamPoolRequest> request = null;
        Response<GetMediaPipelineKinesisVideoStreamPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMediaPipelineKinesisVideoStreamPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMediaPipelineKinesisVideoStreamPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMediaPipelineKinesisVideoStreamPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetMediaPipelineKinesisVideoStreamPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return Result of the GetSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSpeakerSearchTaskResult getSpeakerSearchTask(GetSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final GetSpeakerSearchTaskResult executeGetSpeakerSearchTask(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSpeakerSearchTaskRequest> request = null;
        Response<GetSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSpeakerSearchTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return Result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceToneAnalysisTaskResult getVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final GetVoiceToneAnalysisTaskResult executeGetVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceToneAnalysisTaskRequest> request = null;
        Response<GetVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @return Result of the ListMediaCapturePipelines operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMediaCapturePipelinesResult listMediaCapturePipelines(ListMediaCapturePipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListMediaCapturePipelines(request);
    }

    @SdkInternalApi
    final ListMediaCapturePipelinesResult executeListMediaCapturePipelines(ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMediaCapturePipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMediaCapturePipelinesRequest> request = null;
        Response<ListMediaCapturePipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMediaCapturePipelinesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMediaCapturePipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMediaCapturePipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMediaCapturePipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMediaCapturePipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @return Result of the ListMediaInsightsPipelineConfigurations operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMediaInsightsPipelineConfigurationsResult listMediaInsightsPipelineConfigurations(ListMediaInsightsPipelineConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListMediaInsightsPipelineConfigurations(request);
    }

    @SdkInternalApi
    final ListMediaInsightsPipelineConfigurationsResult executeListMediaInsightsPipelineConfigurations(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMediaInsightsPipelineConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMediaInsightsPipelineConfigurationsRequest> request = null;
        Response<ListMediaInsightsPipelineConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMediaInsightsPipelineConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMediaInsightsPipelineConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMediaInsightsPipelineConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMediaInsightsPipelineConfigurationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMediaInsightsPipelineConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the video stream pools in the media pipeline.
     * </p>
     * 
     * @param listMediaPipelineKinesisVideoStreamPoolsRequest
     * @return Result of the ListMediaPipelineKinesisVideoStreamPools operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaPipelineKinesisVideoStreamPools
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelineKinesisVideoStreamPools"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMediaPipelineKinesisVideoStreamPoolsResult listMediaPipelineKinesisVideoStreamPools(ListMediaPipelineKinesisVideoStreamPoolsRequest request) {
        request = beforeClientExecution(request);
        return executeListMediaPipelineKinesisVideoStreamPools(request);
    }

    @SdkInternalApi
    final ListMediaPipelineKinesisVideoStreamPoolsResult executeListMediaPipelineKinesisVideoStreamPools(
            ListMediaPipelineKinesisVideoStreamPoolsRequest listMediaPipelineKinesisVideoStreamPoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMediaPipelineKinesisVideoStreamPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMediaPipelineKinesisVideoStreamPoolsRequest> request = null;
        Response<ListMediaPipelineKinesisVideoStreamPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMediaPipelineKinesisVideoStreamPoolsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMediaPipelineKinesisVideoStreamPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMediaPipelineKinesisVideoStreamPools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMediaPipelineKinesisVideoStreamPoolsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMediaPipelineKinesisVideoStreamPoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @return Result of the ListMediaPipelines operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMediaPipelinesResult listMediaPipelines(ListMediaPipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListMediaPipelines(request);
    }

    @SdkInternalApi
    final ListMediaPipelinesResult executeListMediaPipelines(ListMediaPipelinesRequest listMediaPipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMediaPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMediaPipelinesRequest> request = null;
        Response<ListMediaPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMediaPipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMediaPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMediaPipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMediaPipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMediaPipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
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
     * @sample AmazonChimeSDKMediaPipelines.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
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
     * Starts a speaker search task.
     * </p>
     * <important>
     * <p>
     * Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker
     * as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startSpeakerSearchTaskRequest
     * @return Result of the StartSpeakerSearchTask operation returned by the service.
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
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSpeakerSearchTaskResult startSpeakerSearchTask(StartSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final StartSpeakerSearchTaskResult executeStartSpeakerSearchTask(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSpeakerSearchTaskRequest> request = null;
        Response<StartSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSpeakerSearchTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a voice tone analysis task. For more information about voice tone analysis, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/voice-analytics.html">Using Amazon Chime SDK voice
     * analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the
     * speaker as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startVoiceToneAnalysisTaskRequest
     * @return Result of the StartVoiceToneAnalysisTask operation returned by the service.
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
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StartVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartVoiceToneAnalysisTaskResult startVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final StartVoiceToneAnalysisTaskResult executeStartVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartVoiceToneAnalysisTaskRequest> request = null;
        Response<StartVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return Result of the StopSpeakerSearchTask operation returned by the service.
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
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopSpeakerSearchTaskResult stopSpeakerSearchTask(StopSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final StopSpeakerSearchTaskResult executeStopSpeakerSearchTask(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopSpeakerSearchTaskRequest> request = null;
        Response<StopSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopSpeakerSearchTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StopSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return Result of the StopVoiceToneAnalysisTask operation returned by the service.
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
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StopVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopVoiceToneAnalysisTaskResult stopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final StopVoiceToneAnalysisTaskResult executeStopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopVoiceToneAnalysisTaskRequest> request = null;
        Response<StopVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
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
     * @sample AmazonChimeSDKMediaPipelines.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
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
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
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
     * @sample AmazonChimeSDKMediaPipelines.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
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
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @return Result of the UpdateMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMediaInsightsPipelineConfigurationResult updateMediaInsightsPipelineConfiguration(UpdateMediaInsightsPipelineConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMediaInsightsPipelineConfiguration(request);
    }

    @SdkInternalApi
    final UpdateMediaInsightsPipelineConfigurationResult executeUpdateMediaInsightsPipelineConfiguration(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMediaInsightsPipelineConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMediaInsightsPipelineConfigurationRequest> request = null;
        Response<UpdateMediaInsightsPipelineConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMediaInsightsPipelineConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMediaInsightsPipelineConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMediaInsightsPipelineConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMediaInsightsPipelineConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateMediaInsightsPipelineConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @return Result of the UpdateMediaInsightsPipelineStatus operation returned by the service.
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
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMediaInsightsPipelineStatusResult updateMediaInsightsPipelineStatus(UpdateMediaInsightsPipelineStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMediaInsightsPipelineStatus(request);
    }

    @SdkInternalApi
    final UpdateMediaInsightsPipelineStatusResult executeUpdateMediaInsightsPipelineStatus(
            UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMediaInsightsPipelineStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMediaInsightsPipelineStatusRequest> request = null;
        Response<UpdateMediaInsightsPipelineStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMediaInsightsPipelineStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMediaInsightsPipelineStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMediaInsightsPipelineStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMediaInsightsPipelineStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMediaInsightsPipelineStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Kinesis video stream pool in a media pipeline.
     * </p>
     * 
     * @param updateMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the UpdateMediaPipelineKinesisVideoStreamPool operation returned by the service.
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
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMediaPipelineKinesisVideoStreamPoolResult updateMediaPipelineKinesisVideoStreamPool(UpdateMediaPipelineKinesisVideoStreamPoolRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMediaPipelineKinesisVideoStreamPool(request);
    }

    @SdkInternalApi
    final UpdateMediaPipelineKinesisVideoStreamPoolResult executeUpdateMediaPipelineKinesisVideoStreamPool(
            UpdateMediaPipelineKinesisVideoStreamPoolRequest updateMediaPipelineKinesisVideoStreamPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMediaPipelineKinesisVideoStreamPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMediaPipelineKinesisVideoStreamPoolRequest> request = null;
        Response<UpdateMediaPipelineKinesisVideoStreamPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMediaPipelineKinesisVideoStreamPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Media Pipelines");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMediaPipelineKinesisVideoStreamPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMediaPipelineKinesisVideoStreamPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateMediaPipelineKinesisVideoStreamPoolResultJsonUnmarshaller());
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
