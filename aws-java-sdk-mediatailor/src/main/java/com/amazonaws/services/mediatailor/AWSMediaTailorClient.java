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
package com.amazonaws.services.mediatailor;

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

import com.amazonaws.services.mediatailor.AWSMediaTailorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.services.mediatailor.model.transform.*;

/**
 * Client for accessing MediaTailor. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDKs and CLI to configure scalable ad insertion and linear channels. With
 * MediaTailor, you can assemble existing content into a linear stream and serve targeted ads to viewers while
 * maintaining broadcast quality in over-the-top (OTT) video applications. For information about using the service,
 * including detailed information about the settings covered in this guide, see the <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/">AWS Elemental MediaTailor User Guide</a>.
 * </p>
 * <p>
 * Through the SDKs and the CLI you manage AWS Elemental MediaTailor configurations and channels the same as you do
 * through the console. For example, you specify ad insertion behavior and mapping information for the origin server and
 * the ad decision server (ADS).
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaTailorClient extends AmazonWebServiceClient implements AWSMediaTailor {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaTailor.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediatailor";

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
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediatailor.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediatailor.model.AWSMediaTailorException.class));

    public static AWSMediaTailorClientBuilder builder() {
        return AWSMediaTailorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaTailor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaTailorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaTailor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaTailorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.mediatailor.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediatailor/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediatailor/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a channel.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @sample AWSMediaTailor.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Creates a program.
     * </p>
     * 
     * @param createProgramRequest
     * @return Result of the CreateProgram operation returned by the service.
     * @sample AWSMediaTailor.CreateProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateProgram" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProgramResult createProgram(CreateProgramRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProgram(request);
    }

    @SdkInternalApi
    final CreateProgramResult executeCreateProgram(CreateProgramRequest createProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(createProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProgramRequest> request = null;
        Response<CreateProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a source location on a specific channel.
     * </p>
     * 
     * @param createSourceLocationRequest
     * @return Result of the CreateSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.CreateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSourceLocationResult createSourceLocation(CreateSourceLocationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSourceLocation(request);
    }

    @SdkInternalApi
    final CreateSourceLocationResult executeCreateSourceLocation(CreateSourceLocationRequest createSourceLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSourceLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSourceLocationRequest> request = null;
        Response<CreateSourceLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSourceLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSourceLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSourceLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSourceLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSourceLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates name for a specific VOD source in a source location.
     * </p>
     * 
     * @param createVodSourceRequest
     * @return Result of the CreateVodSource operation returned by the service.
     * @sample AWSMediaTailor.CreateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVodSourceResult createVodSource(CreateVodSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVodSource(request);
    }

    @SdkInternalApi
    final CreateVodSourceResult executeCreateVodSource(CreateVodSourceRequest createVodSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createVodSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVodSourceRequest> request = null;
        Response<CreateVodSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVodSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVodSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVodSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVodSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVodSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a channel. You must stop the channel before it can be deleted.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaTailor.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Deletes a channel's IAM policy.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return Result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelPolicyResult deleteChannelPolicy(DeleteChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelPolicy(request);
    }

    @SdkInternalApi
    final DeleteChannelPolicyResult executeDeleteChannelPolicy(DeleteChannelPolicyRequest deleteChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelPolicyRequest> request = null;
        Response<DeleteChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the playback configuration for the specified name.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return Result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePlaybackConfigurationResult deletePlaybackConfiguration(DeletePlaybackConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlaybackConfiguration(request);
    }

    @SdkInternalApi
    final DeletePlaybackConfigurationResult executeDeletePlaybackConfiguration(DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlaybackConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlaybackConfigurationRequest> request = null;
        Response<DeletePlaybackConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlaybackConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePlaybackConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlaybackConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePlaybackConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePlaybackConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific program on a specific channel.
     * </p>
     * 
     * @param deleteProgramRequest
     * @return Result of the DeleteProgram operation returned by the service.
     * @sample AWSMediaTailor.DeleteProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteProgram" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProgramResult deleteProgram(DeleteProgramRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProgram(request);
    }

    @SdkInternalApi
    final DeleteProgramResult executeDeleteProgram(DeleteProgramRequest deleteProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProgramRequest> request = null;
        Response<DeleteProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a source location on a specific channel.
     * </p>
     * 
     * @param deleteSourceLocationRequest
     * @return Result of the DeleteSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.DeleteSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSourceLocationResult deleteSourceLocation(DeleteSourceLocationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSourceLocation(request);
    }

    @SdkInternalApi
    final DeleteSourceLocationResult executeDeleteSourceLocation(DeleteSourceLocationRequest deleteSourceLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSourceLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSourceLocationRequest> request = null;
        Response<DeleteSourceLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSourceLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSourceLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSourceLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSourceLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSourceLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific VOD source in a specific source location.
     * </p>
     * 
     * @param deleteVodSourceRequest
     * @return Result of the DeleteVodSource operation returned by the service.
     * @sample AWSMediaTailor.DeleteVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVodSourceResult deleteVodSource(DeleteVodSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVodSource(request);
    }

    @SdkInternalApi
    final DeleteVodSourceResult executeDeleteVodSource(DeleteVodSourceRequest deleteVodSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVodSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVodSourceRequest> request = null;
        Response<DeleteVodSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVodSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVodSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVodSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVodSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVodSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the properties of a specific channel.
     * </p>
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaTailor.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Retrieves the properties of the requested program.
     * </p>
     * 
     * @param describeProgramRequest
     * @return Result of the DescribeProgram operation returned by the service.
     * @sample AWSMediaTailor.DescribeProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeProgram" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeProgramResult describeProgram(DescribeProgramRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProgram(request);
    }

    @SdkInternalApi
    final DescribeProgramResult executeDescribeProgram(DescribeProgramRequest describeProgramRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProgramRequest> request = null;
        Response<DescribeProgramResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProgramRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProgramRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProgram");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProgramResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProgramResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the properties of the requested source location.
     * </p>
     * 
     * @param describeSourceLocationRequest
     * @return Result of the DescribeSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.DescribeSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSourceLocationResult describeSourceLocation(DescribeSourceLocationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSourceLocation(request);
    }

    @SdkInternalApi
    final DescribeSourceLocationResult executeDescribeSourceLocation(DescribeSourceLocationRequest describeSourceLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSourceLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSourceLocationRequest> request = null;
        Response<DescribeSourceLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSourceLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSourceLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSourceLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSourceLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSourceLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about a specific VOD source in a specific source location.
     * </p>
     * 
     * @param describeVodSourceRequest
     * @return Result of the DescribeVodSource operation returned by the service.
     * @sample AWSMediaTailor.DescribeVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeVodSourceResult describeVodSource(DescribeVodSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVodSource(request);
    }

    @SdkInternalApi
    final DescribeVodSourceResult executeDescribeVodSource(DescribeVodSourceRequest describeVodSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVodSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVodSourceRequest> request = null;
        Response<DescribeVodSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVodSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVodSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVodSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVodSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVodSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a channel's IAM policy.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return Result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetChannelPolicyResult getChannelPolicy(GetChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelPolicy(request);
    }

    @SdkInternalApi
    final GetChannelPolicyResult executeGetChannelPolicy(GetChannelPolicyRequest getChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelPolicyRequest> request = null;
        Response<GetChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about your channel's schedule.
     * </p>
     * 
     * @param getChannelScheduleRequest
     * @return Result of the GetChannelSchedule operation returned by the service.
     * @sample AWSMediaTailor.GetChannelSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetChannelScheduleResult getChannelSchedule(GetChannelScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelSchedule(request);
    }

    @SdkInternalApi
    final GetChannelScheduleResult executeGetChannelSchedule(GetChannelScheduleRequest getChannelScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelScheduleRequest> request = null;
        Response<GetChannelScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the playback configuration for the specified name.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return Result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPlaybackConfigurationResult getPlaybackConfiguration(GetPlaybackConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlaybackConfiguration(request);
    }

    @SdkInternalApi
    final GetPlaybackConfigurationResult executeGetPlaybackConfiguration(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlaybackConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlaybackConfigurationRequest> request = null;
        Response<GetPlaybackConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlaybackConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPlaybackConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlaybackConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPlaybackConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPlaybackConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of alerts for the given resource.
     * </p>
     * 
     * @param listAlertsRequest
     * @return Result of the ListAlerts operation returned by the service.
     * @sample AWSMediaTailor.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAlertsResult listAlerts(ListAlertsRequest request) {
        request = beforeClientExecution(request);
        return executeListAlerts(request);
    }

    @SdkInternalApi
    final ListAlertsResult executeListAlerts(ListAlertsRequest listAlertsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAlertsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlertsRequest> request = null;
        Response<ListAlertsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlertsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAlertsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAlerts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAlertsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAlertsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of channels that are associated with this account.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @sample AWSMediaTailor.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListChannels" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum
     * number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If
     * MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you
     * can use to retrieve the next pageful.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return Result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailor.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPlaybackConfigurationsResult listPlaybackConfigurations(ListPlaybackConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlaybackConfigurations(request);
    }

    @SdkInternalApi
    final ListPlaybackConfigurationsResult executeListPlaybackConfigurations(ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlaybackConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlaybackConfigurationsRequest> request = null;
        Response<ListPlaybackConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlaybackConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPlaybackConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlaybackConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPlaybackConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPlaybackConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of source locations.
     * </p>
     * 
     * @param listSourceLocationsRequest
     * @return Result of the ListSourceLocations operation returned by the service.
     * @sample AWSMediaTailor.ListSourceLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListSourceLocations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSourceLocationsResult listSourceLocations(ListSourceLocationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSourceLocations(request);
    }

    @SdkInternalApi
    final ListSourceLocationsResult executeListSourceLocations(ListSourceLocationsRequest listSourceLocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSourceLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSourceLocationsRequest> request = null;
        Response<ListSourceLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSourceLocationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSourceLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSourceLocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSourceLocationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSourceLocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags assigned to the specified playback configuration resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Lists all the VOD sources in a source location.
     * </p>
     * 
     * @param listVodSourcesRequest
     * @return Result of the ListVodSources operation returned by the service.
     * @sample AWSMediaTailor.ListVodSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListVodSources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVodSourcesResult listVodSources(ListVodSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListVodSources(request);
    }

    @SdkInternalApi
    final ListVodSourcesResult executeListVodSources(ListVodSourcesRequest listVodSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVodSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVodSourcesRequest> request = null;
        Response<ListVodSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVodSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVodSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVodSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVodSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVodSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IAM policy for the channel.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return Result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutChannelPolicyResult putChannelPolicy(PutChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutChannelPolicy(request);
    }

    @SdkInternalApi
    final PutChannelPolicyResult executePutChannelPolicy(PutChannelPolicyRequest putChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutChannelPolicyRequest> request = null;
        Response<PutChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new playback configuration to AWS Elemental MediaTailor.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return Result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutPlaybackConfigurationResult putPlaybackConfiguration(PutPlaybackConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutPlaybackConfiguration(request);
    }

    @SdkInternalApi
    final PutPlaybackConfigurationResult executePutPlaybackConfiguration(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putPlaybackConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPlaybackConfigurationRequest> request = null;
        Response<PutPlaybackConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPlaybackConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putPlaybackConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPlaybackConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPlaybackConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutPlaybackConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a specific channel.
     * </p>
     * 
     * @param startChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @sample AWSMediaTailor.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartChannelResult startChannel(StartChannelRequest request) {
        request = beforeClientExecution(request);
        return executeStartChannel(request);
    }

    @SdkInternalApi
    final StartChannelResult executeStartChannel(StartChannelRequest startChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(startChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartChannelRequest> request = null;
        Response<StartChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specific channel.
     * </p>
     * 
     * @param stopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @sample AWSMediaTailor.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopChannelResult stopChannel(StopChannelRequest request) {
        request = beforeClientExecution(request);
        return executeStopChannel(request);
    }

    @SdkInternalApi
    final StopChannelResult executeStopChannel(StopChannelRequest stopChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(stopChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopChannelRequest> request = null;
        Response<StopChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to the specified playback configuration resource. You can specify one or more tags to add.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Updates an existing channel.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaTailor.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
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
     * Updates a source location on a specific channel.
     * </p>
     * 
     * @param updateSourceLocationRequest
     * @return Result of the UpdateSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.UpdateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSourceLocationResult updateSourceLocation(UpdateSourceLocationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSourceLocation(request);
    }

    @SdkInternalApi
    final UpdateSourceLocationResult executeUpdateSourceLocation(UpdateSourceLocationRequest updateSourceLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSourceLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSourceLocationRequest> request = null;
        Response<UpdateSourceLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSourceLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSourceLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSourceLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSourceLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSourceLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specific VOD source in a specific source location.
     * </p>
     * 
     * @param updateVodSourceRequest
     * @return Result of the UpdateVodSource operation returned by the service.
     * @sample AWSMediaTailor.UpdateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVodSourceResult updateVodSource(UpdateVodSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVodSource(request);
    }

    @SdkInternalApi
    final UpdateVodSourceResult executeUpdateVodSource(UpdateVodSourceRequest updateVodSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVodSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVodSourceRequest> request = null;
        Response<UpdateVodSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVodSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVodSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaTailor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVodSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVodSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVodSourceResultJsonUnmarshaller());
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
