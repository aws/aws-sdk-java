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
package com.amazonaws.services.kafkaconnect;

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

import com.amazonaws.services.kafkaconnect.AWSKafkaConnectClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kafkaconnect.model.*;
import com.amazonaws.services.kafkaconnect.model.transform.*;

/**
 * Client for accessing Kafka Connect. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKafkaConnectClient extends AmazonWebServiceClient implements AWSKafkaConnect {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSKafkaConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kafkaconnect";

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
                                    com.amazonaws.services.kafkaconnect.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafkaconnect.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kafkaconnect.model.AWSKafkaConnectException.class));

    public static AWSKafkaConnectClientBuilder builder() {
        return AWSKafkaConnectClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kafka Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSKafkaConnectClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kafka Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSKafkaConnectClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kafkaconnect.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kafkaconnect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kafkaconnect/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a connector using the specified properties.
     * </p>
     * 
     * @param createConnectorRequest
     * @return Result of the CreateConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateConnectorResult createConnector(CreateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnector(request);
    }

    @SdkInternalApi
    final CreateConnectorResult executeCreateConnector(CreateConnectorRequest createConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectorRequest> request = null;
        Response<CreateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom plugin using the specified properties.
     * </p>
     * 
     * @param createCustomPluginRequest
     * @return Result of the CreateCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomPluginResult createCustomPlugin(CreateCustomPluginRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomPlugin(request);
    }

    @SdkInternalApi
    final CreateCustomPluginResult executeCreateCustomPlugin(CreateCustomPluginRequest createCustomPluginRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomPluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomPluginRequest> request = null;
        Response<CreateCustomPluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomPluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomPluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomPlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomPluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCustomPluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a worker configuration using the specified properties.
     * </p>
     * 
     * @param createWorkerConfigurationRequest
     * @return Result of the CreateWorkerConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkerConfigurationResult createWorkerConfiguration(CreateWorkerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkerConfiguration(request);
    }

    @SdkInternalApi
    final CreateWorkerConfigurationResult executeCreateWorkerConfiguration(CreateWorkerConfigurationRequest createWorkerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkerConfigurationRequest> request = null;
        Response<CreateWorkerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWorkerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWorkerConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified connector.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteConnector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteConnectorResult deleteConnector(DeleteConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnector(request);
    }

    @SdkInternalApi
    final DeleteConnectorResult executeDeleteConnector(DeleteConnectorRequest deleteConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectorRequest> request = null;
        Response<DeleteConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom plugin.
     * </p>
     * 
     * @param deleteCustomPluginRequest
     * @return Result of the DeleteCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DeleteCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomPluginResult deleteCustomPlugin(DeleteCustomPluginRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomPlugin(request);
    }

    @SdkInternalApi
    final DeleteCustomPluginResult executeDeleteCustomPlugin(DeleteCustomPluginRequest deleteCustomPluginRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomPluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomPluginRequest> request = null;
        Response<DeleteCustomPluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomPluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomPluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomPlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomPluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCustomPluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about the connector.
     * </p>
     * 
     * @param describeConnectorRequest
     * @return Result of the DescribeConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeConnector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeConnectorResult describeConnector(DescribeConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnector(request);
    }

    @SdkInternalApi
    final DescribeConnectorResult executeDescribeConnector(DescribeConnectorRequest describeConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectorRequest> request = null;
        Response<DescribeConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param describeCustomPluginRequest
     * @return Result of the DescribeCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomPluginResult describeCustomPlugin(DescribeCustomPluginRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomPlugin(request);
    }

    @SdkInternalApi
    final DescribeCustomPluginResult executeDescribeCustomPlugin(DescribeCustomPluginRequest describeCustomPluginRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomPluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomPluginRequest> request = null;
        Response<DescribeCustomPluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomPluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCustomPluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomPlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomPluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCustomPluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a worker configuration.
     * </p>
     * 
     * @param describeWorkerConfigurationRequest
     * @return Result of the DescribeWorkerConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkerConfigurationResult describeWorkerConfiguration(DescribeWorkerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkerConfiguration(request);
    }

    @SdkInternalApi
    final DescribeWorkerConfigurationResult executeDescribeWorkerConfiguration(DescribeWorkerConfigurationRequest describeWorkerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkerConfigurationRequest> request = null;
        Response<DescribeWorkerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkerConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name
     * starts with the specified prefix. The response also includes a description of each of the listed connectors.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListConnectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListConnectorsResult listConnectors(ListConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListConnectors(request);
    }

    @SdkInternalApi
    final ListConnectorsResult executeListConnectors(ListConnectorsRequest listConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectorsRequest> request = null;
        Response<ListConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the custom plugins in this account and Region.
     * </p>
     * 
     * @param listCustomPluginsRequest
     * @return Result of the ListCustomPlugins operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListCustomPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListCustomPlugins" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCustomPluginsResult listCustomPlugins(ListCustomPluginsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomPlugins(request);
    }

    @SdkInternalApi
    final ListCustomPluginsResult executeListCustomPlugins(ListCustomPluginsRequest listCustomPluginsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomPluginsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomPluginsRequest> request = null;
        Response<ListCustomPluginsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomPluginsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCustomPluginsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomPlugins");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomPluginsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCustomPluginsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the worker configurations in this account and Region.
     * </p>
     * 
     * @param listWorkerConfigurationsRequest
     * @return Result of the ListWorkerConfigurations operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListWorkerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListWorkerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkerConfigurationsResult listWorkerConfigurations(ListWorkerConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkerConfigurations(request);
    }

    @SdkInternalApi
    final ListWorkerConfigurationsResult executeListWorkerConfigurations(ListWorkerConfigurationsRequest listWorkerConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkerConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkerConfigurationsRequest> request = null;
        Response<ListWorkerConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkerConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorkerConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkerConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkerConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkerConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified connector.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return Result of the UpdateConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/UpdateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateConnectorResult updateConnector(UpdateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnector(request);
    }

    @SdkInternalApi
    final UpdateConnectorResult executeUpdateConnector(UpdateConnectorRequest updateConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectorRequest> request = null;
        Response<UpdateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KafkaConnect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConnectorResultJsonUnmarshaller());
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
