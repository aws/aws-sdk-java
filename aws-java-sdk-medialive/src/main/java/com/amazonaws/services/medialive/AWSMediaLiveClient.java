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
package com.amazonaws.services.medialive;

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

import com.amazonaws.services.medialive.AWSMediaLiveClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.services.medialive.model.transform.*;

/**
 * Client for accessing MediaLive. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * API for AWS Elemental MediaLive
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaLiveClient extends AmazonWebServiceClient implements AWSMediaLive {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaLive.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "medialive";

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
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.medialive.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.medialive.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.medialive.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withModeledClass(
                                    com.amazonaws.services.medialive.model.UnprocessableEntityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.medialive.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.medialive.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadGatewayException").withModeledClass(
                                    com.amazonaws.services.medialive.model.BadGatewayException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GatewayTimeoutException").withModeledClass(
                                    com.amazonaws.services.medialive.model.GatewayTimeoutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.medialive.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.medialive.model.AWSMediaLiveException.class));

    public static AWSMediaLiveClientBuilder builder() {
        return AWSMediaLiveClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaLive using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaLiveClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaLive using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaLiveClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("medialive.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/medialive/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/medialive/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @return Result of the BatchUpdateSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The update schedule request failed validation.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel id does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update schedule calls.
     * @sample AWSMediaLive.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchUpdateScheduleResult batchUpdateSchedule(BatchUpdateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateSchedule(request);
    }

    @SdkInternalApi
    final BatchUpdateScheduleResult executeBatchUpdateSchedule(BatchUpdateScheduleRequest batchUpdateScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateScheduleRequest> request = null;
        Response<BatchUpdateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The Channel failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to create the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to create due to an issue with channel resources.
     * @sample AWSMediaLive.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return Result of the CreateInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInputResult createInput(CreateInputRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInput(request);
    }

    @SdkInternalApi
    final CreateInputResult executeCreateInput(CreateInputRequest createInputRequest) {

        ExecutionContext executionContext = createExecutionContext(createInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputRequest> request = null;
        Response<CreateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return Result of the CreateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to create an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to create an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInputSecurityGroupResult createInputSecurityGroup(CreateInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInputSecurityGroup(request);
    }

    @SdkInternalApi
    final CreateInputSecurityGroupResult executeCreateInputSecurityGroup(CreateInputSecurityGroupRequest createInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputSecurityGroupRequest> request = null;
        Response<CreateInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to delete does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to delete due to an issue with channel resources.
     * @sample AWSMediaLive.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @throws ConflictException
     *         Resource conflict
     * @sample AWSMediaLive.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInputResult deleteInput(DeleteInputRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInput(request);
    }

    @SdkInternalApi
    final DeleteInputResult executeDeleteInput(DeleteInputRequest deleteInputRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputRequest> request = null;
        Response<DeleteInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return Result of the DeleteInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to delete the Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to delete this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInputSecurityGroupResult deleteInputSecurityGroup(DeleteInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInputSecurityGroup(request);
    }

    @SdkInternalApi
    final DeleteInputSecurityGroupResult executeDeleteInputSecurityGroup(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputSecurityGroupRequest> request = null;
        Response<DeleteInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @return Result of the DeleteReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to delete reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to delete does not exist
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete reservation request
     * @throws ConflictException
     *         The reservation could not be deleted because it is currently active.
     * @sample AWSMediaLive.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteReservationResult deleteReservation(DeleteReservationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReservation(request);
    }

    @SdkInternalApi
    final DeleteReservationResult executeDeleteReservation(DeleteReservationRequest deleteReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReservationRequest> request = null;
        Response<DeleteReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReservationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to describe does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe channel calls to channel service.
     * @sample AWSMediaLive.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInputResult describeInput(DescribeInputRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInput(request);
    }

    @SdkInternalApi
    final DescribeInputResult executeDescribeInput(DescribeInputRequest describeInputRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputRequest> request = null;
        Response<DescribeInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return Result of the DescribeInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to describe an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to describe this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInputSecurityGroupResult describeInputSecurityGroup(DescribeInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInputSecurityGroup(request);
    }

    @SdkInternalApi
    final DescribeInputSecurityGroupResult executeDescribeInputSecurityGroup(DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputSecurityGroupRequest> request = null;
        Response<DescribeInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe offering request
     * @sample AWSMediaLive.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeOfferingResult describeOffering(DescribeOfferingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOffering(request);
    }

    @SdkInternalApi
    final DescribeOfferingResult executeDescribeOffering(DescribeOfferingRequest describeOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOfferingRequest> request = null;
        Response<DescribeOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe reservation request
     * @sample AWSMediaLive.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReservationResult describeReservation(DescribeReservationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservation(request);
    }

    @SdkInternalApi
    final DescribeReservationResult executeDescribeReservation(DescribeReservationRequest describeReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservationRequest> request = null;
        Response<DescribeReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeReservationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting a schedule describe for does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe schedule calls.
     * @sample AWSMediaLive.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeScheduleResult describeSchedule(DescribeScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchedule(request);
    }

    @SdkInternalApi
    final DescribeScheduleResult executeDescribeSchedule(DescribeScheduleRequest describeScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduleRequest> request = null;
        Response<DescribeScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list channels.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list channel calls to channel service.
     * @sample AWSMediaLive.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return Result of the ListInputSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         The request to list Input Security Groups was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to call ListInputSecurityGroups
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInputSecurityGroupsResult listInputSecurityGroups(ListInputSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListInputSecurityGroups(request);
    }

    @SdkInternalApi
    final ListInputSecurityGroupsResult executeListInputSecurityGroups(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputSecurityGroupsRequest> request = null;
        Response<ListInputSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputSecurityGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInputSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputSecurityGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInputSecurityGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInputsResult listInputs(ListInputsRequest request) {
        request = beforeClientExecution(request);
        return executeListInputs(request);
    }

    @SdkInternalApi
    final ListInputsResult executeListInputs(ListInputsRequest listInputsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputsRequest> request = null;
        Response<ListInputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInputsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list offerings
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list offerings request
     * @sample AWSMediaLive.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOfferingsResult listOfferings(ListOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeListOfferings(request);
    }

    @SdkInternalApi
    final ListOfferingsResult executeListOfferings(ListOfferingsRequest listOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingsRequest> request = null;
        Response<ListOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list reservations
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list reservations request
     * @sample AWSMediaLive.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReservationsResult listReservations(ListReservationsRequest request) {
        request = beforeClientExecution(request);
        return executeListReservations(request);
    }

    @SdkInternalApi
    final ListReservationsResult executeListReservations(ListReservationsRequest listReservationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReservationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReservationsRequest> request = null;
        Response<ListReservationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReservationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReservationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReservations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReservationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReservationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to purchase the offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to purchase does not exist
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded on purchase offering request
     * @throws ConflictException
     *         Offering purchase prevented by service resource issue
     * @sample AWSMediaLive.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseOffering(request);
    }

    @SdkInternalApi
    final PurchaseOfferingResult executePurchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseOfferingRequest> request = null;
        Response<PurchaseOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(purchaseOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PurchaseOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to start does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to start due to an issue with channel resources.
     * @sample AWSMediaLive.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to stop does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to stop due to an issue with channel resources.
     * @sample AWSMediaLive.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The channel is unable to update due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
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
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @return Result of the UpdateInput operation returned by the service.
     * @throws BadRequestException
     *         This request to update the input was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an input.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The input was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The input was unable to be updated at this time due to an issue with input resources.
     * @sample AWSMediaLive.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInputResult updateInput(UpdateInputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInput(request);
    }

    @SdkInternalApi
    final UpdateInputResult executeUpdateInput(UpdateInputRequest updateInputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputRequest> request = null;
        Response<UpdateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @return Result of the UpdateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to update the Input Security Group was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The Input Security Group was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The Input Security Group was unable to be updated due to an issue with input security group resources.
     * @sample AWSMediaLive.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInputSecurityGroupResult updateInputSecurityGroup(UpdateInputSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInputSecurityGroup(request);
    }

    @SdkInternalApi
    final UpdateInputSecurityGroupResult executeUpdateInputSecurityGroup(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputSecurityGroupRequest> request = null;
        Response<UpdateInputSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputSecurityGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInputSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInputSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputSecurityGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInputSecurityGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @return Result of the UpdateReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to update reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation not found
     * @throws GatewayTimeoutException
     *         Gateway timeout error
     * @throws TooManyRequestsException
     *         Request limit exceeded
     * @throws ConflictException
     *         The reservation could not be updated
     * @sample AWSMediaLive.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateReservationResult updateReservation(UpdateReservationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReservation(request);
    }

    @SdkInternalApi
    final UpdateReservationResult executeUpdateReservation(UpdateReservationRequest updateReservationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReservationRequest> request = null;
        Response<UpdateReservationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReservationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReservationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaLive");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReservation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReservationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReservationResultJsonUnmarshaller());
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
