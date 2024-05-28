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
package com.amazonaws.services.mediaconnect;

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

import com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder;
import com.amazonaws.services.mediaconnect.waiters.AWSMediaConnectWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.services.mediaconnect.model.transform.*;

/**
 * Client for accessing AWS MediaConnect. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * API for AWS Elemental MediaConnect
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConnectClient extends AmazonWebServiceClient implements AWSMediaConnect {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediaconnect";

    private volatile AWSMediaConnectWaiters waiters;

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
                                    com.amazonaws.services.mediaconnect.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateFlow420Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.CreateFlow420ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateBridge420Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.CreateBridge420ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateGateway420Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.CreateGateway420ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GrantFlowEntitlements420Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.GrantFlowEntitlements420ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AddFlowOutputs420Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.AddFlowOutputs420ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediaconnect.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediaconnect.model.AWSMediaConnectException.class));

    public static AWSMediaConnectClientBuilder builder() {
        return AWSMediaConnectClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS MediaConnect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaConnectClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS MediaConnect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaConnectClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediaconnect.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediaconnect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediaconnect/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Adds outputs to an existing bridge.
     * 
     * @param addBridgeOutputsRequest
     *        A request to add outputs to the specified bridge.
     * @return Result of the AddBridgeOutputs operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.AddBridgeOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddBridgeOutputsResult addBridgeOutputs(AddBridgeOutputsRequest request) {
        request = beforeClientExecution(request);
        return executeAddBridgeOutputs(request);
    }

    @SdkInternalApi
    final AddBridgeOutputsResult executeAddBridgeOutputs(AddBridgeOutputsRequest addBridgeOutputsRequest) {

        ExecutionContext executionContext = createExecutionContext(addBridgeOutputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddBridgeOutputsRequest> request = null;
        Response<AddBridgeOutputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddBridgeOutputsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addBridgeOutputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddBridgeOutputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddBridgeOutputsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddBridgeOutputsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds sources to an existing bridge.
     * 
     * @param addBridgeSourcesRequest
     *        A request to add sources to the specified bridge.
     * @return Result of the AddBridgeSources operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.AddBridgeSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeSources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddBridgeSourcesResult addBridgeSources(AddBridgeSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeAddBridgeSources(request);
    }

    @SdkInternalApi
    final AddBridgeSourcesResult executeAddBridgeSources(AddBridgeSourcesRequest addBridgeSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(addBridgeSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddBridgeSourcesRequest> request = null;
        Response<AddBridgeSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddBridgeSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addBridgeSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddBridgeSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddBridgeSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddBridgeSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a
     * source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
     * 
     * @param addFlowMediaStreamsRequest
     *        A request to add media streams to the flow.
     * @return Result of the AddFlowMediaStreams operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowMediaStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowMediaStreams"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddFlowMediaStreamsResult addFlowMediaStreams(AddFlowMediaStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeAddFlowMediaStreams(request);
    }

    @SdkInternalApi
    final AddFlowMediaStreamsResult executeAddFlowMediaStreams(AddFlowMediaStreamsRequest addFlowMediaStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(addFlowMediaStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddFlowMediaStreamsRequest> request = null;
        Response<AddFlowMediaStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddFlowMediaStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addFlowMediaStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddFlowMediaStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddFlowMediaStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddFlowMediaStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
     * 
     * @param addFlowOutputsRequest
     *        A request to add outputs to the specified flow.
     * @return Result of the AddFlowOutputs operation returned by the service.
     * @throws AddFlowOutputs420Exception
     *         AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number
     *         of allowed outputs (50). For more information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddFlowOutputsResult addFlowOutputs(AddFlowOutputsRequest request) {
        request = beforeClientExecution(request);
        return executeAddFlowOutputs(request);
    }

    @SdkInternalApi
    final AddFlowOutputsResult executeAddFlowOutputs(AddFlowOutputsRequest addFlowOutputsRequest) {

        ExecutionContext executionContext = createExecutionContext(addFlowOutputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddFlowOutputsRequest> request = null;
        Response<AddFlowOutputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddFlowOutputsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addFlowOutputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddFlowOutputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddFlowOutputsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddFlowOutputsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds Sources to flow
     * 
     * @param addFlowSourcesRequest
     *        A request to add sources to the flow.
     * @return Result of the AddFlowSources operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowSources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddFlowSourcesResult addFlowSources(AddFlowSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeAddFlowSources(request);
    }

    @SdkInternalApi
    final AddFlowSourcesResult executeAddFlowSources(AddFlowSourcesRequest addFlowSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(addFlowSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddFlowSourcesRequest> request = null;
        Response<AddFlowSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddFlowSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addFlowSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddFlowSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddFlowSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddFlowSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds VPC interfaces to flow
     * 
     * @param addFlowVpcInterfacesRequest
     *        A request to add VPC interfaces to the flow.
     * @return Result of the AddFlowVpcInterfaces operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowVpcInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddFlowVpcInterfacesResult addFlowVpcInterfaces(AddFlowVpcInterfacesRequest request) {
        request = beforeClientExecution(request);
        return executeAddFlowVpcInterfaces(request);
    }

    @SdkInternalApi
    final AddFlowVpcInterfacesResult executeAddFlowVpcInterfaces(AddFlowVpcInterfacesRequest addFlowVpcInterfacesRequest) {

        ExecutionContext executionContext = createExecutionContext(addFlowVpcInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddFlowVpcInterfacesRequest> request = null;
        Response<AddFlowVpcInterfacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddFlowVpcInterfacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addFlowVpcInterfacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddFlowVpcInterfaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddFlowVpcInterfacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddFlowVpcInterfacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new bridge. The request must include one source.
     * 
     * @param createBridgeRequest
     *        Creates a new bridge. The request must include one source.
     * @return Result of the CreateBridge operation returned by the service.
     * @throws CreateBridge420Exception
     *         Your account already contains the maximum number of bridges per account, per Region. For more
     *         information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.CreateBridge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateBridge" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBridgeResult createBridge(CreateBridgeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBridge(request);
    }

    @SdkInternalApi
    final CreateBridgeResult executeCreateBridge(CreateBridgeRequest createBridgeRequest) {

        ExecutionContext executionContext = createExecutionContext(createBridgeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBridgeRequest> request = null;
        Response<CreateBridgeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBridgeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBridgeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBridge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBridgeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBridgeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50)
     * and entitlements (up to 50).
     * 
     * @param createFlowRequest
     *        Creates a new flow. The request must include one source. The request optionally can include outputs (up to
     *        50) and entitlements (up to 50).
     * @return Result of the CreateFlow operation returned by the service.
     * @throws CreateFlow420Exception
     *         Your account already contains the maximum number of 20 flows per account, per Region. For more
     *         information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFlowResult createFlow(CreateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlow(request);
    }

    @SdkInternalApi
    final CreateFlowResult executeCreateFlow(CreateFlowRequest createFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowRequest> request = null;
        Response<CreateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new gateway. The request must include at least one network (up to 4).
     * 
     * @param createGatewayRequest
     *        Creates a new gateway. The request must include at least one network (up to 4).
     * @return Result of the CreateGateway operation returned by the service.
     * @throws CreateGateway420Exception
     *         Your account already contains the maximum number of gateways per account, per Region. For more
     *         information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGatewayResult createGateway(CreateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGateway(request);
    }

    @SdkInternalApi
    final CreateGatewayResult executeCreateGateway(CreateGatewayRequest createGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(createGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayRequest> request = null;
        Response<CreateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a bridge. Before you can delete a bridge, you must stop the bridge.
     * 
     * @param deleteBridgeRequest
     * @return Result of the DeleteBridge operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DeleteBridge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteBridge" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBridgeResult deleteBridge(DeleteBridgeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBridge(request);
    }

    @SdkInternalApi
    final DeleteBridgeResult executeDeleteBridge(DeleteBridgeRequest deleteBridgeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBridgeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBridgeRequest> request = null;
        Response<DeleteBridgeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBridgeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBridgeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBridge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBridgeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBridgeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a flow. Before you can delete a flow, you must stop the flow.
     * 
     * @param deleteFlowRequest
     * @return Result of the DeleteFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFlowResult deleteFlow(DeleteFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlow(request);
    }

    @SdkInternalApi
    final DeleteFlowResult executeDeleteFlow(DeleteFlowRequest deleteFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowRequest> request = null;
        Response<DeleteFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a gateway. Before you can delete a gateway, you must deregister its instances and delete its bridges.
     * 
     * @param deleteGatewayRequest
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGateway(request);
    }

    @SdkInternalApi
    final DeleteGatewayResult executeDeleteGateway(DeleteGatewayRequest deleteGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deregisters an instance. Before you deregister an instance, all bridges running on the instance must be stopped.
     * If you want to deregister an instance without stopping the bridges, you must use the --force option.
     * 
     * @param deregisterGatewayInstanceRequest
     * @return Result of the DeregisterGatewayInstance operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DeregisterGatewayInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeregisterGatewayInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterGatewayInstanceResult deregisterGatewayInstance(DeregisterGatewayInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterGatewayInstance(request);
    }

    @SdkInternalApi
    final DeregisterGatewayInstanceResult executeDeregisterGatewayInstance(DeregisterGatewayInstanceRequest deregisterGatewayInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterGatewayInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterGatewayInstanceRequest> request = null;
        Response<DeregisterGatewayInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterGatewayInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterGatewayInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterGatewayInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterGatewayInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterGatewayInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays the details of a bridge.
     * 
     * @param describeBridgeRequest
     * @return Result of the DescribeBridge operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DescribeBridge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeBridge" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeBridgeResult describeBridge(DescribeBridgeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBridge(request);
    }

    @SdkInternalApi
    final DescribeBridgeResult executeDescribeBridge(DescribeBridgeRequest describeBridgeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBridgeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBridgeRequest> request = null;
        Response<DescribeBridgeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBridgeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBridgeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBridge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBridgeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBridgeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
     * details about the source, outputs, and entitlements.
     * 
     * @param describeFlowRequest
     * @return Result of the DescribeFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFlowResult describeFlow(DescribeFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFlow(request);
    }

    @SdkInternalApi
    final DescribeFlowResult executeDescribeFlow(DescribeFlowRequest describeFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowRequest> request = null;
        Response<DescribeFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays details of the flow's source stream. The response contains information about the contents of the stream
     * and its programs.
     * 
     * @param describeFlowSourceMetadataRequest
     * @return Result of the DescribeFlowSourceMetadata operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.DescribeFlowSourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlowSourceMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFlowSourceMetadataResult describeFlowSourceMetadata(DescribeFlowSourceMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFlowSourceMetadata(request);
    }

    @SdkInternalApi
    final DescribeFlowSourceMetadataResult executeDescribeFlowSourceMetadata(DescribeFlowSourceMetadataRequest describeFlowSourceMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFlowSourceMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowSourceMetadataRequest> request = null;
        Response<DescribeFlowSourceMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowSourceMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFlowSourceMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFlowSourceMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFlowSourceMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFlowSourceMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays the details of a gateway. The response includes the gateway ARN, name, and CIDR blocks, as well as
     * details about the networks.
     * 
     * @param describeGatewayRequest
     * @return Result of the DescribeGateway operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DescribeGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeGatewayResult describeGateway(DescribeGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGateway(request);
    }

    @SdkInternalApi
    final DescribeGatewayResult executeDescribeGateway(DescribeGatewayRequest describeGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayRequest> request = null;
        Response<DescribeGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays the details of an instance.
     * 
     * @param describeGatewayInstanceRequest
     * @return Result of the DescribeGatewayInstance operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.DescribeGatewayInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeGatewayInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGatewayInstanceResult describeGatewayInstance(DescribeGatewayInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGatewayInstance(request);
    }

    @SdkInternalApi
    final DescribeGatewayInstanceResult executeDescribeGatewayInstance(DescribeGatewayInstanceRequest describeGatewayInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGatewayInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayInstanceRequest> request = null;
        Response<DescribeGatewayInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGatewayInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGatewayInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGatewayInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGatewayInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays the details of an offering. The response includes the offering description, duration, outbound
     * bandwidth, price, and Amazon Resource Name (ARN).
     * 
     * @param describeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeOffering" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Displays the details of a reservation. The response includes the reservation name, state, start date and time,
     * and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound
     * bandwidth).
     * 
     * @param describeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeReservation"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Grants entitlements to an existing flow.
     * 
     * @param grantFlowEntitlementsRequest
     *        A request to grant entitlements on a flow.
     * @return Result of the GrantFlowEntitlements operation returned by the service.
     * @throws GrantFlowEntitlements420Exception
     *         AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number
     *         of allowed entitlements (50). For more information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.GrantFlowEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantFlowEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GrantFlowEntitlementsResult grantFlowEntitlements(GrantFlowEntitlementsRequest request) {
        request = beforeClientExecution(request);
        return executeGrantFlowEntitlements(request);
    }

    @SdkInternalApi
    final GrantFlowEntitlementsResult executeGrantFlowEntitlements(GrantFlowEntitlementsRequest grantFlowEntitlementsRequest) {

        ExecutionContext executionContext = createExecutionContext(grantFlowEntitlementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GrantFlowEntitlementsRequest> request = null;
        Response<GrantFlowEntitlementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GrantFlowEntitlementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(grantFlowEntitlementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GrantFlowEntitlements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GrantFlowEntitlementsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GrantFlowEntitlementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of bridges that are associated with this account and an optionally specified Arn. This request
     * returns a paginated result.
     * 
     * @param listBridgesRequest
     * @return Result of the ListBridges operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.ListBridges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListBridges" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBridgesResult listBridges(ListBridgesRequest request) {
        request = beforeClientExecution(request);
        return executeListBridges(request);
    }

    @SdkInternalApi
    final ListBridgesResult executeListBridges(ListBridgesRequest listBridgesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBridgesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBridgesRequest> request = null;
        Response<ListBridgesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBridgesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBridgesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBridges");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBridgesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBridgesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
     * page.
     * 
     * @param listEntitlementsRequest
     * @return Result of the ListEntitlements operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEntitlementsResult listEntitlements(ListEntitlementsRequest request) {
        request = beforeClientExecution(request);
        return executeListEntitlements(request);
    }

    @SdkInternalApi
    final ListEntitlementsResult executeListEntitlements(ListEntitlementsRequest listEntitlementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntitlementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitlementsRequest> request = null;
        Response<ListEntitlementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitlementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEntitlementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntitlements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntitlementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEntitlementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of flows that are associated with this account. This request returns a paginated result.
     * 
     * @param listFlowsRequest
     * @return Result of the ListFlows operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFlowsResult listFlows(ListFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlows(request);
    }

    @SdkInternalApi
    final ListFlowsResult executeListFlows(ListFlowsRequest listFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowsRequest> request = null;
        Response<ListFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of instances associated with the AWS account. This request returns a paginated result. You can
     * use the filterArn property to display only the instances associated with the selected Gateway Amazon Resource
     * Name (ARN).
     * 
     * @param listGatewayInstancesRequest
     * @return Result of the ListGatewayInstances operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.ListGatewayInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListGatewayInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGatewayInstancesResult listGatewayInstances(ListGatewayInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListGatewayInstances(request);
    }

    @SdkInternalApi
    final ListGatewayInstancesResult executeListGatewayInstances(ListGatewayInstancesRequest listGatewayInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewayInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewayInstancesRequest> request = null;
        Response<ListGatewayInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewayInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewayInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGatewayInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewayInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewayInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of gateways that are associated with this account. This request returns a paginated result.
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListGateways" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListGateways(request);
    }

    @SdkInternalApi
    final ListGatewaysResult executeListGateways(ListGatewaysRequest listGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an
     * active reservation (which means you've purchased an offering that has already started and hasn't expired yet),
     * your account isn't eligible for other offerings.
     * 
     * @param listOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListOfferings" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list
     * includes all reservations in all states (such as active and expired).
     * 
     * @param listReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListReservations" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * List all tags on an AWS Elemental MediaConnect resource
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another
     * offering.
     * 
     * @param purchaseOfferingRequest
     *        A request to purchase a offering.
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Removes an output from a bridge.
     * 
     * @param removeBridgeOutputRequest
     * @return Result of the RemoveBridgeOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.RemoveBridgeOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveBridgeOutput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveBridgeOutputResult removeBridgeOutput(RemoveBridgeOutputRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveBridgeOutput(request);
    }

    @SdkInternalApi
    final RemoveBridgeOutputResult executeRemoveBridgeOutput(RemoveBridgeOutputRequest removeBridgeOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(removeBridgeOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveBridgeOutputRequest> request = null;
        Response<RemoveBridgeOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveBridgeOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeBridgeOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveBridgeOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveBridgeOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveBridgeOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes a source from a bridge.
     * 
     * @param removeBridgeSourceRequest
     * @return Result of the RemoveBridgeSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.RemoveBridgeSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveBridgeSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveBridgeSourceResult removeBridgeSource(RemoveBridgeSourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveBridgeSource(request);
    }

    @SdkInternalApi
    final RemoveBridgeSourceResult executeRemoveBridgeSource(RemoveBridgeSourceRequest removeBridgeSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeBridgeSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveBridgeSourceRequest> request = null;
        Response<RemoveBridgeSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveBridgeSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeBridgeSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveBridgeSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveBridgeSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveBridgeSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes a media stream from a flow. This action is only available if the media stream is not associated with a
     * source or output.
     * 
     * @param removeFlowMediaStreamRequest
     * @return Result of the RemoveFlowMediaStream operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveFlowMediaStreamResult removeFlowMediaStream(RemoveFlowMediaStreamRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFlowMediaStream(request);
    }

    @SdkInternalApi
    final RemoveFlowMediaStreamResult executeRemoveFlowMediaStream(RemoveFlowMediaStreamRequest removeFlowMediaStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFlowMediaStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFlowMediaStreamRequest> request = null;
        Response<RemoveFlowMediaStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFlowMediaStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeFlowMediaStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFlowMediaStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveFlowMediaStreamResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RemoveFlowMediaStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes an output from an existing flow. This request can be made only on an output that does not have an
     * entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
     * an entitlement is revoked from a flow, the service automatically removes the associated output.
     * 
     * @param removeFlowOutputRequest
     * @return Result of the RemoveFlowOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveFlowOutputResult removeFlowOutput(RemoveFlowOutputRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFlowOutput(request);
    }

    @SdkInternalApi
    final RemoveFlowOutputResult executeRemoveFlowOutput(RemoveFlowOutputRequest removeFlowOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFlowOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFlowOutputRequest> request = null;
        Response<RemoveFlowOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFlowOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeFlowOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFlowOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveFlowOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveFlowOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes a source from an existing flow. This request can be made only if there is more than one source on the
     * flow.
     * 
     * @param removeFlowSourceRequest
     * @return Result of the RemoveFlowSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveFlowSourceResult removeFlowSource(RemoveFlowSourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFlowSource(request);
    }

    @SdkInternalApi
    final RemoveFlowSourceResult executeRemoveFlowSource(RemoveFlowSourceRequest removeFlowSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFlowSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFlowSourceRequest> request = null;
        Response<RemoveFlowSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFlowSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeFlowSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFlowSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveFlowSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveFlowSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not
     * have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must
     * first delete or update the Source or Output to no longer reference the VPC interface.
     * 
     * @param removeFlowVpcInterfaceRequest
     * @return Result of the RemoveFlowVpcInterface operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowVpcInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveFlowVpcInterfaceResult removeFlowVpcInterface(RemoveFlowVpcInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFlowVpcInterface(request);
    }

    @SdkInternalApi
    final RemoveFlowVpcInterfaceResult executeRemoveFlowVpcInterface(RemoveFlowVpcInterfaceRequest removeFlowVpcInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFlowVpcInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFlowVpcInterfaceRequest> request = null;
        Response<RemoveFlowVpcInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFlowVpcInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeFlowVpcInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFlowVpcInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveFlowVpcInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveFlowVpcInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
     * subscriber and the associated output is removed.
     * 
     * @param revokeFlowEntitlementRequest
     * @return Result of the RevokeFlowEntitlement operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RevokeFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RevokeFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RevokeFlowEntitlementResult revokeFlowEntitlement(RevokeFlowEntitlementRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeFlowEntitlement(request);
    }

    @SdkInternalApi
    final RevokeFlowEntitlementResult executeRevokeFlowEntitlement(RevokeFlowEntitlementRequest revokeFlowEntitlementRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeFlowEntitlementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeFlowEntitlementRequest> request = null;
        Response<RevokeFlowEntitlementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeFlowEntitlementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeFlowEntitlementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeFlowEntitlement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeFlowEntitlementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RevokeFlowEntitlementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Starts a flow.
     * 
     * @param startFlowRequest
     * @return Result of the StartFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFlowResult startFlow(StartFlowRequest request) {
        request = beforeClientExecution(request);
        return executeStartFlow(request);
    }

    @SdkInternalApi
    final StartFlowResult executeStartFlow(StartFlowRequest startFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(startFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFlowRequest> request = null;
        Response<StartFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Stops a flow.
     * 
     * @param stopFlowRequest
     * @return Result of the StopFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopFlowResult stopFlow(StopFlowRequest request) {
        request = beforeClientExecution(request);
        return executeStopFlow(request);
    }

    @SdkInternalApi
    final StopFlowResult executeStopFlow(StopFlowRequest stopFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(stopFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopFlowRequest> request = null;
        Response<StopFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * 
     * @param tagResourceRequest
     *        The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Deletes specified tags from a resource.
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
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
     * Updates the bridge
     * 
     * @param updateBridgeRequest
     *        A request to update the bridge.
     * @return Result of the UpdateBridge operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.UpdateBridge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridge" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBridgeResult updateBridge(UpdateBridgeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBridge(request);
    }

    @SdkInternalApi
    final UpdateBridgeResult executeUpdateBridge(UpdateBridgeRequest updateBridgeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBridgeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBridgeRequest> request = null;
        Response<UpdateBridgeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBridgeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBridgeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBridge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBridgeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBridgeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates an existing bridge output.
     * 
     * @param updateBridgeOutputRequest
     *        The fields that you want to update in the bridge output.
     * @return Result of the UpdateBridgeOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.UpdateBridgeOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeOutput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBridgeOutputResult updateBridgeOutput(UpdateBridgeOutputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBridgeOutput(request);
    }

    @SdkInternalApi
    final UpdateBridgeOutputResult executeUpdateBridgeOutput(UpdateBridgeOutputRequest updateBridgeOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBridgeOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBridgeOutputRequest> request = null;
        Response<UpdateBridgeOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBridgeOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBridgeOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBridgeOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBridgeOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBridgeOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates an existing bridge source.
     * 
     * @param updateBridgeSourceRequest
     *        The fields that you want to update in the bridge source.
     * @return Result of the UpdateBridgeSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.UpdateBridgeSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBridgeSourceResult updateBridgeSource(UpdateBridgeSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBridgeSource(request);
    }

    @SdkInternalApi
    final UpdateBridgeSourceResult executeUpdateBridgeSource(UpdateBridgeSourceRequest updateBridgeSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBridgeSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBridgeSourceRequest> request = null;
        Response<UpdateBridgeSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBridgeSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBridgeSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBridgeSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBridgeSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBridgeSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the bridge state
     * 
     * @param updateBridgeStateRequest
     *        A request to update the bridge state.
     * @return Result of the UpdateBridgeState operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.UpdateBridgeState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateBridgeStateResult updateBridgeState(UpdateBridgeStateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBridgeState(request);
    }

    @SdkInternalApi
    final UpdateBridgeStateResult executeUpdateBridgeState(UpdateBridgeStateRequest updateBridgeStateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBridgeStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBridgeStateRequest> request = null;
        Response<UpdateBridgeStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBridgeStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBridgeStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBridgeState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBridgeStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBridgeStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates flow
     * 
     * @param updateFlowRequest
     *        A request to update flow.
     * @return Result of the UpdateFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFlowResult updateFlow(UpdateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlow(request);
    }

    @SdkInternalApi
    final UpdateFlowResult executeUpdateFlow(UpdateFlowRequest updateFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowRequest> request = null;
        Response<UpdateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
     * service will remove the outputs that are are used by the subscribers that are removed.
     * 
     * @param updateFlowEntitlementRequest
     *        The entitlement fields that you want to update.
     * @return Result of the UpdateFlowEntitlement operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFlowEntitlementResult updateFlowEntitlement(UpdateFlowEntitlementRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowEntitlement(request);
    }

    @SdkInternalApi
    final UpdateFlowEntitlementResult executeUpdateFlowEntitlement(UpdateFlowEntitlementRequest updateFlowEntitlementRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowEntitlementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowEntitlementRequest> request = null;
        Response<UpdateFlowEntitlementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowEntitlementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowEntitlementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowEntitlement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowEntitlementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateFlowEntitlementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates an existing media stream.
     * 
     * @param updateFlowMediaStreamRequest
     *        The fields that you want to update in the media stream.
     * @return Result of the UpdateFlowMediaStream operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFlowMediaStreamResult updateFlowMediaStream(UpdateFlowMediaStreamRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowMediaStream(request);
    }

    @SdkInternalApi
    final UpdateFlowMediaStreamResult executeUpdateFlowMediaStream(UpdateFlowMediaStreamRequest updateFlowMediaStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowMediaStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowMediaStreamRequest> request = null;
        Response<UpdateFlowMediaStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowMediaStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowMediaStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowMediaStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowMediaStreamResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateFlowMediaStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates an existing flow output.
     * 
     * @param updateFlowOutputRequest
     *        The fields that you want to update in the output.
     * @return Result of the UpdateFlowOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFlowOutputResult updateFlowOutput(UpdateFlowOutputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowOutput(request);
    }

    @SdkInternalApi
    final UpdateFlowOutputResult executeUpdateFlowOutput(UpdateFlowOutputRequest updateFlowOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowOutputRequest> request = null;
        Response<UpdateFlowOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the source of a flow.
     * 
     * @param updateFlowSourceRequest
     *        A request to update the source of a flow.
     * @return Result of the UpdateFlowSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFlowSourceResult updateFlowSource(UpdateFlowSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowSource(request);
    }

    @SdkInternalApi
    final UpdateFlowSourceResult executeUpdateFlowSource(UpdateFlowSourceRequest updateFlowSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowSourceRequest> request = null;
        Response<UpdateFlowSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the configuration of an existing Gateway Instance.
     * 
     * @param updateGatewayInstanceRequest
     *        A request to update gateway instance state.
     * @return Result of the UpdateGatewayInstance operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSMediaConnect.UpdateGatewayInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateGatewayInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewayInstanceResult updateGatewayInstance(UpdateGatewayInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayInstance(request);
    }

    @SdkInternalApi
    final UpdateGatewayInstanceResult executeUpdateGatewayInstance(UpdateGatewayInstanceRequest updateGatewayInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInstanceRequest> request = null;
        Response<UpdateGatewayInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGatewayInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateGatewayInstanceResultJsonUnmarshaller());
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
    public AWSMediaConnectWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSMediaConnectWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
