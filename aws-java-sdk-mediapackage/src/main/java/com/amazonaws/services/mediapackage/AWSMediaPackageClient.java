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
package com.amazonaws.services.mediapackage;

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

import com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.services.mediapackage.model.transform.*;

/**
 * Client for accessing MediaPackage. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * AWS Elemental MediaPackage
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageClient extends AmazonWebServiceClient implements AWSMediaPackage {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaPackage.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediapackage";

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
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.UnprocessableEntityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.mediapackage.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediapackage.model.AWSMediaPackageException.class));

    public static AWSMediaPackageClientBuilder builder() {
        return AWSMediaPackageClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaPackage using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaPackage using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediapackage.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediapackage/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediapackage/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Creates a new Channel.
     * 
     * @param createChannelRequest
     *        A new Channel configuration.
     * @return Result of the CreateChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Creates a new OriginEndpoint record.
     * 
     * @param createOriginEndpointRequest
     *        Configuration parameters used to create a new OriginEndpoint.
     * @return Result of the CreateOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOriginEndpointResult createOriginEndpoint(CreateOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOriginEndpoint(request);
    }

    @SdkInternalApi
    final CreateOriginEndpointResult executeCreateOriginEndpoint(CreateOriginEndpointRequest createOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOriginEndpointRequest> request = null;
        Response<CreateOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an existing Channel.
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Deletes an existing OriginEndpoint.
     * 
     * @param deleteOriginEndpointRequest
     * @return Result of the DeleteOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOriginEndpointResult deleteOriginEndpoint(DeleteOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOriginEndpoint(request);
    }

    @SdkInternalApi
    final DeleteOriginEndpointResult executeDeleteOriginEndpoint(DeleteOriginEndpointRequest deleteOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOriginEndpointRequest> request = null;
        Response<DeleteOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Gets details about a Channel.
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeChannel" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Gets details about an existing OriginEndpoint.
     * 
     * @param describeOriginEndpointRequest
     * @return Result of the DescribeOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DescribeOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOriginEndpointResult describeOriginEndpoint(DescribeOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOriginEndpoint(request);
    }

    @SdkInternalApi
    final DescribeOriginEndpointResult executeDescribeOriginEndpoint(DescribeOriginEndpointRequest describeOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOriginEndpointRequest> request = null;
        Response<DescribeOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a collection of Channels.
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListChannels" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Returns a collection of OriginEndpoint records.
     * 
     * @param listOriginEndpointsRequest
     * @return Result of the ListOriginEndpoints operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOriginEndpointsResult listOriginEndpoints(ListOriginEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListOriginEndpoints(request);
    }

    @SdkInternalApi
    final ListOriginEndpointsResult executeListOriginEndpoints(ListOriginEndpointsRequest listOriginEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOriginEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOriginEndpointsRequest> request = null;
        Response<ListOriginEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOriginEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOriginEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOriginEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOriginEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOriginEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackage.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use
     * RotateIngestEndpointCredentials instead
     * 
     * @param rotateChannelCredentialsRequest
     * @return Result of the RotateChannelCredentials operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.RotateChannelCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateChannelCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public RotateChannelCredentialsResult rotateChannelCredentials(RotateChannelCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeRotateChannelCredentials(request);
    }

    @SdkInternalApi
    final RotateChannelCredentialsResult executeRotateChannelCredentials(RotateChannelCredentialsRequest rotateChannelCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(rotateChannelCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateChannelCredentialsRequest> request = null;
        Response<RotateChannelCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateChannelCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rotateChannelCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RotateChannelCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RotateChannelCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RotateChannelCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     * 
     * @param rotateIngestEndpointCredentialsRequest
     * @return Result of the RotateIngestEndpointCredentials operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.RotateIngestEndpointCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateIngestEndpointCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RotateIngestEndpointCredentialsResult rotateIngestEndpointCredentials(RotateIngestEndpointCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeRotateIngestEndpointCredentials(request);
    }

    @SdkInternalApi
    final RotateIngestEndpointCredentialsResult executeRotateIngestEndpointCredentials(
            RotateIngestEndpointCredentialsRequest rotateIngestEndpointCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(rotateIngestEndpointCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateIngestEndpointCredentialsRequest> request = null;
        Response<RotateIngestEndpointCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateIngestEndpointCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rotateIngestEndpointCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RotateIngestEndpointCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RotateIngestEndpointCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RotateIngestEndpointCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSMediaPackage.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackage.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Updates an existing Channel.
     * 
     * @param updateChannelRequest
     *        Configuration parameters used to update the Channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
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
     * Updates an existing OriginEndpoint.
     * 
     * @param updateOriginEndpointRequest
     *        Configuration parameters used to update an existing OriginEndpoint.
     * @return Result of the UpdateOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOriginEndpointResult updateOriginEndpoint(UpdateOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOriginEndpoint(request);
    }

    @SdkInternalApi
    final UpdateOriginEndpointResult executeUpdateOriginEndpoint(UpdateOriginEndpointRequest updateOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOriginEndpointRequest> request = null;
        Response<UpdateOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateOriginEndpointResultJsonUnmarshaller());
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
