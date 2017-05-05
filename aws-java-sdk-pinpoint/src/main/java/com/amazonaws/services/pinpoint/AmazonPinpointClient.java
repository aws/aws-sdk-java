/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint;

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
import com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.services.pinpoint.model.transform.*;

/**
 * Client for accessing Amazon Pinpoint. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointClient extends AmazonWebServiceClient implements AmazonPinpoint {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPinpoint.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mobiletargeting";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.MethodNotAllowedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.pinpoint.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pinpoint.model.AmazonPinpointException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonPinpointClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonPinpointClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonPinpointClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonPinpointClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPinpointClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonPinpointClientBuilder builder() {
        return AmazonPinpointClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://pinpoint.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pinpoint/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pinpoint/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.CreateCampaign
     */
    @Override
    public CreateCampaignResult createCampaign(CreateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCampaign(request);
    }

    @SdkInternalApi
    final CreateCampaignResult executeCreateCampaign(CreateCampaignRequest createCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.CreateImportJob
     */
    @Override
    public CreateImportJobResult createImportJob(CreateImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImportJob(request);
    }

    @SdkInternalApi
    final CreateImportJobResult executeCreateImportJob(CreateImportJobRequest createImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImportJobRequest> request = null;
        Response<CreateImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.CreateSegment
     */
    @Override
    public CreateSegmentResult createSegment(CreateSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSegment(request);
    }

    @SdkInternalApi
    final CreateSegmentResult executeCreateSegment(CreateSegmentRequest createSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSegmentRequest> request = null;
        Response<CreateSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return Result of the DeleteApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.DeleteApnsChannel
     */
    @Override
    public DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApnsChannel(request);
    }

    @SdkInternalApi
    final DeleteApnsChannelResult executeDeleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsChannelRequest> request = null;
        Response<DeleteApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.DeleteCampaign
     */
    @Override
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCampaign(request);
    }

    @SdkInternalApi
    final DeleteCampaignResult executeDeleteCampaign(DeleteCampaignRequest deleteCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @return Result of the DeleteEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteEventStream
     */
    @Override
    public DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventStream(request);
    }

    @SdkInternalApi
    final DeleteEventStreamResult executeDeleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventStreamRequest> request = null;
        Response<DeleteEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return Result of the DeleteGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.DeleteGcmChannel
     */
    @Override
    public DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGcmChannel(request);
    }

    @SdkInternalApi
    final DeleteGcmChannelResult executeDeleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGcmChannelRequest> request = null;
        Response<DeleteGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.DeleteSegment
     */
    @Override
    public DeleteSegmentResult deleteSegment(DeleteSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSegment(request);
    }

    @SdkInternalApi
    final DeleteSegmentResult executeDeleteSegment(DeleteSegmentRequest deleteSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSegmentRequest> request = null;
        Response<DeleteSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return Result of the GetApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetApnsChannel
     */
    @Override
    public GetApnsChannelResult getApnsChannel(GetApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetApnsChannel(request);
    }

    @SdkInternalApi
    final GetApnsChannelResult executeGetApnsChannel(GetApnsChannelRequest getApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsChannelRequest> request = null;
        Response<GetApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return Result of the GetApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetApplicationSettings
     */
    @Override
    public GetApplicationSettingsResult getApplicationSettings(GetApplicationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationSettings(request);
    }

    @SdkInternalApi
    final GetApplicationSettingsResult executeGetApplicationSettings(GetApplicationSettingsRequest getApplicationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationSettingsRequest> request = null;
        Response<GetApplicationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetCampaign
     */
    @Override
    public GetCampaignResult getCampaign(GetCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaign(request);
    }

    @SdkInternalApi
    final GetCampaignResult executeGetCampaign(GetCampaignRequest getCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignRequest> request = null;
        Response<GetCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return Result of the GetCampaignActivities operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetCampaignActivities
     */
    @Override
    public GetCampaignActivitiesResult getCampaignActivities(GetCampaignActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignActivities(request);
    }

    @SdkInternalApi
    final GetCampaignActivitiesResult executeGetCampaignActivities(GetCampaignActivitiesRequest getCampaignActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignActivitiesRequest> request = null;
        Response<GetCampaignActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignActivitiesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetCampaignActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return Result of the GetCampaignVersion operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetCampaignVersion
     */
    @Override
    public GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignVersion(request);
    }

    @SdkInternalApi
    final GetCampaignVersionResult executeGetCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionRequest> request = null;
        Response<GetCampaignVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return Result of the GetCampaignVersions operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetCampaignVersions
     */
    @Override
    public GetCampaignVersionsResult getCampaignVersions(GetCampaignVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignVersions(request);
    }

    @SdkInternalApi
    final GetCampaignVersionsResult executeGetCampaignVersions(GetCampaignVersionsRequest getCampaignVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionsRequest> request = null;
        Response<GetCampaignVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return Result of the GetCampaigns operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetCampaigns
     */
    @Override
    public GetCampaignsResult getCampaigns(GetCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaigns(request);
    }

    @SdkInternalApi
    final GetCampaignsResult executeGetCampaigns(GetCampaignsRequest getCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignsRequest> request = null;
        Response<GetCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return Result of the GetEndpoint operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetEndpoint
     */
    @Override
    public GetEndpointResult getEndpoint(GetEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetEndpoint(request);
    }

    @SdkInternalApi
    final GetEndpointResult executeGetEndpoint(GetEndpointRequest getEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointRequest> request = null;
        Response<GetEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStream Request
     * @return Result of the GetEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEventStream
     */
    @Override
    public GetEventStreamResult getEventStream(GetEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventStream(request);
    }

    @SdkInternalApi
    final GetEventStreamResult executeGetEventStream(GetEventStreamRequest getEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventStreamRequest> request = null;
        Response<GetEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return Result of the GetGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetGcmChannel
     */
    @Override
    public GetGcmChannelResult getGcmChannel(GetGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetGcmChannel(request);
    }

    @SdkInternalApi
    final GetGcmChannelResult executeGetGcmChannel(GetGcmChannelRequest getGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGcmChannelRequest> request = null;
        Response<GetGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetImportJob
     */
    @Override
    public GetImportJobResult getImportJob(GetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportJob(request);
    }

    @SdkInternalApi
    final GetImportJobResult executeGetImportJob(GetImportJobRequest getImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobRequest> request = null;
        Response<GetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return Result of the GetImportJobs operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetImportJobs
     */
    @Override
    public GetImportJobsResult getImportJobs(GetImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportJobs(request);
    }

    @SdkInternalApi
    final GetImportJobsResult executeGetImportJobs(GetImportJobsRequest getImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobsRequest> request = null;
        Response<GetImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetSegment
     */
    @Override
    public GetSegmentResult getSegment(GetSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegment(request);
    }

    @SdkInternalApi
    final GetSegmentResult executeGetSegment(GetSegmentRequest getSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentRequest> request = null;
        Response<GetSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return Result of the GetSegmentImportJobs operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetSegmentImportJobs
     */
    @Override
    public GetSegmentImportJobsResult getSegmentImportJobs(GetSegmentImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentImportJobs(request);
    }

    @SdkInternalApi
    final GetSegmentImportJobsResult executeGetSegmentImportJobs(GetSegmentImportJobsRequest getSegmentImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentImportJobsRequest> request = null;
        Response<GetSegmentImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return Result of the GetSegmentVersion operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetSegmentVersion
     */
    @Override
    public GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentVersion(request);
    }

    @SdkInternalApi
    final GetSegmentVersionResult executeGetSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionRequest> request = null;
        Response<GetSegmentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return Result of the GetSegmentVersions operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetSegmentVersions
     */
    @Override
    public GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentVersions(request);
    }

    @SdkInternalApi
    final GetSegmentVersionsResult executeGetSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionsRequest> request = null;
        Response<GetSegmentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return Result of the GetSegments operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.GetSegments
     */
    @Override
    public GetSegmentsResult getSegments(GetSegmentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegments(request);
    }

    @SdkInternalApi
    final GetSegmentsResult executeGetSegments(GetSegmentsRequest getSegmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentsRequest> request = null;
        Response<GetSegmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     *        PutEventStream Request
     * @return Result of the PutEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.PutEventStream
     */
    @Override
    public PutEventStreamResult putEventStream(PutEventStreamRequest request) {
        request = beforeClientExecution(request);
        return executePutEventStream(request);
    }

    @SdkInternalApi
    final PutEventStreamResult executePutEventStream(PutEventStreamRequest putEventStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventStreamRequest> request = null;
        Response<PutEventStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return Result of the UpdateApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateApnsChannel
     */
    @Override
    public UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApnsChannel(request);
    }

    @SdkInternalApi
    final UpdateApnsChannelResult executeUpdateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsChannelRequest> request = null;
        Response<UpdateApnsChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApnsChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApnsChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApnsChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateApplicationSettings
     */
    @Override
    public UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationSettings(request);
    }

    @SdkInternalApi
    final UpdateApplicationSettingsResult executeUpdateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationSettingsRequest> request = null;
        Response<UpdateApplicationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApplicationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApplicationSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateCampaign
     */
    @Override
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaign(request);
    }

    @SdkInternalApi
    final UpdateCampaignResult executeUpdateCampaign(UpdateCampaignRequest updateCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateEndpoint
     */
    @Override
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpoint(request);
    }

    @SdkInternalApi
    final UpdateEndpointResult executeUpdateEndpoint(UpdateEndpointRequest updateEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return Result of the UpdateEndpointsBatch operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateEndpointsBatch
     */
    @Override
    public UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpointsBatch(request);
    }

    @SdkInternalApi
    final UpdateEndpointsBatchResult executeUpdateEndpointsBatch(UpdateEndpointsBatchRequest updateEndpointsBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointsBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointsBatchRequest> request = null;
        Response<UpdateEndpointsBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointsBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointsBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointsBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointsBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return Result of the UpdateGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateGcmChannel
     */
    @Override
    public UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGcmChannel(request);
    }

    @SdkInternalApi
    final UpdateGcmChannelResult executeUpdateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGcmChannelRequest> request = null;
        Response<UpdateGcmChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGcmChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGcmChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGcmChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGcmChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return Result of the UpdateSegment operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws MethodNotAllowedException
     *         405 response
     * @throws TooManyRequestsException
     *         429 response
     * @sample AmazonPinpoint.UpdateSegment
     */
    @Override
    public UpdateSegmentResult updateSegment(UpdateSegmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSegment(request);
    }

    @SdkInternalApi
    final UpdateSegmentResult executeUpdateSegment(UpdateSegmentRequest updateSegmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSegmentRequest> request = null;
        Response<UpdateSegmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSegmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSegmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSegmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSegmentResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
