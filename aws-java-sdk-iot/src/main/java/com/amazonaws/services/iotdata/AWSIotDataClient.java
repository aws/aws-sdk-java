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
package com.amazonaws.services.iotdata;

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

import com.amazonaws.services.iotdata.AWSIotDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.services.iotdata.model.transform.*;

/**
 * Client for accessing AWS IoT Data Plane. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>IoT data</fullname>
 * <p>
 * IoT data enables secure, bi-directional communication between Internet-connected things (such as sensors, actuators,
 * embedded devices, or smart appliances) and the Amazon Web Services cloud. It implements a broker for applications and
 * things to publish messages over HTTP (Publish) and retrieve, update, and delete shadows. A shadow is a persistent
 * representation of your things and their state in the Amazon Web Services cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in IoT data by running this CLI command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Amazon Web
 * ServicesSignature Version 4</a> to sign requests is: <i>iotdevicegateway</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIotDataClient extends AmazonWebServiceClient implements AWSIotData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIotData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotdata";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestEntityTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.RequestEntityTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedDocumentEncodingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.UnsupportedDocumentEncodingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.MethodNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotdata.model.AWSIotDataException.class));

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AWSIotDataClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSIotDataClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS IoT Data Plane (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSIotDataClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotDataClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSIotDataClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSIotDataClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT Data Plane (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSIotDataClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotDataClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSIotDataClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT Data Plane (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSIotDataClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotDataClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT Data Plane (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSIotDataClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotDataClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSIotDataClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSIotDataClientBuilder builder() {
        return AWSIotDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIotDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIotDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://data.iot.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotdata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @return Result of the DeleteThingShadow operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.DeleteThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/DeleteThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteThingShadowResult deleteThingShadow(DeleteThingShadowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThingShadow(request);
    }

    @SdkInternalApi
    final DeleteThingShadowResult executeDeleteThingShadow(DeleteThingShadowRequest deleteThingShadowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingShadowRequest> request = null;
        Response<DeleteThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingShadowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThingShadow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThingShadowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new DeleteThingShadowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a single retained message for the specified topic.
     * </p>
     * <p>
     * This action returns the message payload of the retained message, which can incur messaging costs. To list only
     * the topic names of the retained messages, call <a
     * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html">ListRetainedMessages</a>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >GetRetainedMessage</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param getRetainedMessageRequest
     *        The input for the GetRetainedMessage operation.
     * @return Result of the GetRetainedMessage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @sample AWSIotData.GetRetainedMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetRetainedMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetRetainedMessageResult getRetainedMessage(GetRetainedMessageRequest request) {
        request = beforeClientExecution(request);
        return executeGetRetainedMessage(request);
    }

    @SdkInternalApi
    final GetRetainedMessageResult executeGetRetainedMessage(GetRetainedMessageRequest getRetainedMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(getRetainedMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRetainedMessageRequest> request = null;
        Response<GetRetainedMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRetainedMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRetainedMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRetainedMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRetainedMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRetainedMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the IoT
     * Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @return Result of the GetThingShadow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.GetThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetThingShadowResult getThingShadow(GetThingShadowRequest request) {
        request = beforeClientExecution(request);
        return executeGetThingShadow(request);
    }

    @SdkInternalApi
    final GetThingShadowResult executeGetThingShadow(GetThingShadowRequest getThingShadowRequest) {

        ExecutionContext executionContext = createExecutionContext(getThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThingShadowRequest> request = null;
        Response<GetThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThingShadowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetThingShadow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetThingShadowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetThingShadowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListNamedShadowsForThing</a> action.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @return Result of the ListNamedShadowsForThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @sample AWSIotData.ListNamedShadowsForThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListNamedShadowsForThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNamedShadowsForThingResult listNamedShadowsForThing(ListNamedShadowsForThingRequest request) {
        request = beforeClientExecution(request);
        return executeListNamedShadowsForThing(request);
    }

    @SdkInternalApi
    final ListNamedShadowsForThingResult executeListNamedShadowsForThing(ListNamedShadowsForThingRequest listNamedShadowsForThingRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamedShadowsForThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamedShadowsForThingRequest> request = null;
        Response<ListNamedShadowsForThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamedShadowsForThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNamedShadowsForThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamedShadowsForThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamedShadowsForThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNamedShadowsForThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists summary information about the retained messages stored for the account.
     * </p>
     * <p>
     * This action returns only the topic names of the retained messages. It doesn't return any message payloads.
     * Although this action doesn't return a message payload, it can still incur messaging costs.
     * </p>
     * <p>
     * To get the message payload of a retained message, call <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
     * >GetRetainedMessage</a> with the topic name of the retained message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >ListRetainedMessages</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param listRetainedMessagesRequest
     * @return Result of the ListRetainedMessages operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @sample AWSIotData.ListRetainedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListRetainedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRetainedMessagesResult listRetainedMessages(ListRetainedMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeListRetainedMessages(request);
    }

    @SdkInternalApi
    final ListRetainedMessagesResult executeListRetainedMessages(ListRetainedMessagesRequest listRetainedMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRetainedMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetainedMessagesRequest> request = null;
        Response<ListRetainedMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetainedMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRetainedMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRetainedMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRetainedMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRetainedMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes an MQTT message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >Publish</a> action.
     * </p>
     * <p>
     * For more information about MQTT messages, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html">MQTT Protocol</a> in the IoT Developer
     * Guide.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @return Result of the Publish operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIotData.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishResult publish(PublishRequest request) {
        request = beforeClientExecution(request);
        return executePublish(request);
    }

    @SdkInternalApi
    final PublishResult executePublish(PublishRequest publishRequest) {

        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRequest> request = null;
        Response<PublishResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Publish");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @return Result of the UpdateThingShadow operation returned by the service.
     * @throws ConflictException
     *         The specified version does not match the version of the document.
     * @throws RequestEntityTooLargeException
     *         The payload exceeds the maximum size allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.UpdateThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/UpdateThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateThingShadowResult updateThingShadow(UpdateThingShadowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThingShadow(request);
    }

    @SdkInternalApi
    final UpdateThingShadowResult executeUpdateThingShadow(UpdateThingShadowRequest updateThingShadowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingShadowRequest> request = null;
        Response<UpdateThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingShadowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThingShadow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThingShadowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new UpdateThingShadowResultJsonUnmarshaller());
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
