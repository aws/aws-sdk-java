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
package com.amazonaws.services.apigateway;

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

import com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.services.apigateway.model.transform.*;

/**
 * Client for accessing Amazon API Gateway. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
 * Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
 * or other publicly addressable web services that are hosted outside of AWS.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApiGatewayClient extends AmazonWebServiceClient implements AmazonApiGateway {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonApiGateway.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "apigateway";

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
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.apigateway.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.apigateway.model.AmazonApiGatewayException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway. A credentials provider chain will be
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
     * @deprecated use {@link AmazonApiGatewayClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonApiGatewayClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonApiGatewayClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonApiGatewayClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonApiGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonApiGatewayClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonApiGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonApiGatewayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonApiGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonApiGatewayClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonApiGatewayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonApiGatewayClientBuilder builder() {
        return AmazonApiGatewayClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://apigateway.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/apigateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/apigateway/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html">AWS CLI</a></div>
     * 
     * @param createApiKeyRequest
     *        Request to create an <a>ApiKey</a> resource.
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.CreateApiKey
     */
    @Override
    public CreateApiKeyResult createApiKey(CreateApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApiKey(request);
    }

    @SdkInternalApi
    final CreateApiKeyResult executeCreateApiKey(CreateApiKeyRequest createApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiKeyRequest> request = null;
        Response<CreateApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApiKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html">AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest
     *        Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateAuthorizer
     */
    @Override
    public CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAuthorizer(request);
    }

    @SdkInternalApi
    final CreateAuthorizerResult executeCreateAuthorizer(CreateAuthorizerRequest createAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(createAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAuthorizerRequest> request = null;
        Response<CreateAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests API Gateway to create a new <a>BasePathMapping</a> resource.
     * @return Result of the CreateBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateBasePathMapping
     */
    @Override
    public CreateBasePathMappingResult createBasePathMapping(CreateBasePathMappingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBasePathMapping(request);
    }

    @SdkInternalApi
    final CreateBasePathMappingResult executeCreateBasePathMapping(CreateBasePathMappingRequest createBasePathMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(createBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBasePathMappingRequest> request = null;
        Response<CreateBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBasePathMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBasePathMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBasePathMappingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateBasePathMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests API Gateway to create a <a>Deployment</a> resource.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.CreateDeployment
     */
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param createDocumentationPartRequest
     *        Creates a new documentation part of a given API.
     * @return Result of the CreateDocumentationPart operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDocumentationPart
     */
    @Override
    public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDocumentationPart(request);
    }

    @SdkInternalApi
    final CreateDocumentationPartResult executeCreateDocumentationPart(CreateDocumentationPartRequest createDocumentationPartRequest) {

        ExecutionContext executionContext = createExecutionContext(createDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentationPartRequest> request = null;
        Response<CreateDocumentationPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentationPartRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDocumentationPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDocumentationPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDocumentationPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDocumentationPartResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param createDocumentationVersionRequest
     *        Creates a new documentation version of a given API.
     * @return Result of the CreateDocumentationVersion operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDocumentationVersion
     */
    @Override
    public CreateDocumentationVersionResult createDocumentationVersion(CreateDocumentationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDocumentationVersion(request);
    }

    @SdkInternalApi
    final CreateDocumentationVersionResult executeCreateDocumentationVersion(CreateDocumentationVersionRequest createDocumentationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentationVersionRequest> request = null;
        Response<CreateDocumentationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDocumentationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDocumentationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDocumentationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDocumentationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @return Result of the CreateDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDomainName
     */
    @Override
    public CreateDomainNameResult createDomainName(CreateDomainNameRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomainName(request);
    }

    @SdkInternalApi
    final CreateDomainNameResult executeCreateDomainName(CreateDomainNameRequest createDomainNameRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainNameRequest> request = null;
        Response<CreateDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomainName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
     * @return Result of the CreateModel operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateModel
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModel(request);
    }

    @SdkInternalApi
    final CreateModelResult executeCreateModel(CreateModelRequest createModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest
     *        Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the CreateRequestValidator operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateRequestValidator
     */
    @Override
    public CreateRequestValidatorResult createRequestValidator(CreateRequestValidatorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRequestValidator(request);
    }

    @SdkInternalApi
    final CreateRequestValidatorResult executeCreateRequestValidator(CreateRequestValidatorRequest createRequestValidatorRequest) {

        ExecutionContext executionContext = createExecutionContext(createRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRequestValidatorRequest> request = null;
        Response<CreateRequestValidatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRequestValidatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRequestValidatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRequestValidator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRequestValidatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRequestValidatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests API Gateway to create a <a>Resource</a> resource.
     * @return Result of the CreateResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateResource
     */
    @Override
    public CreateResourceResult createResource(CreateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResource(request);
    }

    @SdkInternalApi
    final CreateResourceResult executeCreateResource(CreateResourceRequest createResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        The POST Request to add a new <a>RestApi</a> resource to your collection.
     * @return Result of the CreateRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateRestApi
     */
    @Override
    public CreateRestApiResult createRestApi(CreateRestApiRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRestApi(request);
    }

    @SdkInternalApi
    final CreateRestApiResult executeCreateRestApi(CreateRestApiRequest createRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(createRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRestApiRequest> request = null;
        Response<CreateRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRestApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest
     *        Requests API Gateway to create a <a>Stage</a> resource.
     * @return Result of the CreateStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateStage
     */
    @Override
    public CreateStageResult createStage(CreateStageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStage(request);
    }

    @SdkInternalApi
    final CreateStageResult executeCreateStage(CreateStageRequest createStageRequest) {

        ExecutionContext executionContext = createExecutionContext(createStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStageRequest> request = null;
        Response<CreateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
     * payload.
     * </p>
     * 
     * @param createUsagePlanRequest
     *        The POST request to create a usage plan with the name, description, throttle limits and quota limits, as
     *        well as the associated API stages, specified in the payload.
     * @return Result of the CreateUsagePlan operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.CreateUsagePlan
     */
    @Override
    public CreateUsagePlanResult createUsagePlan(CreateUsagePlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUsagePlan(request);
    }

    @SdkInternalApi
    final CreateUsagePlanResult executeCreateUsagePlan(CreateUsagePlanRequest createUsagePlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsagePlanRequest> request = null;
        Response<CreateUsagePlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUsagePlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUsagePlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUsagePlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUsagePlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUsagePlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest
     *        The POST request to create a usage plan key for adding an existing API key to a usage plan.
     * @return Result of the CreateUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateUsagePlanKey
     */
    @Override
    public CreateUsagePlanKeyResult createUsagePlanKey(CreateUsagePlanKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUsagePlanKey(request);
    }

    @SdkInternalApi
    final CreateUsagePlanKeyResult executeCreateUsagePlanKey(CreateUsagePlanKeyRequest createUsagePlanKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsagePlanKeyRequest> request = null;
        Response<CreateUsagePlanKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUsagePlanKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUsagePlanKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUsagePlanKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUsagePlanKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUsagePlanKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
     * takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
     * Endpoint services.
     * </p>
     * 
     * @param createVpcLinkRequest
     *        Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that
     *        typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create
     *        and update VPC Endpoint services.
     * @return Result of the CreateVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateVpcLink
     */
    @Override
    public CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcLink(request);
    }

    @SdkInternalApi
    final CreateVpcLinkResult executeCreateVpcLink(CreateVpcLinkRequest createVpcLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcLinkRequest> request = null;
        Response<CreateVpcLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVpcLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVpcLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @return Result of the DeleteApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteApiKey
     */
    @Override
    public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApiKey(request);
    }

    @SdkInternalApi
    final DeleteApiKeyResult executeDeleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiKeyRequest> request = null;
        Response<DeleteApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApiKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html">AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest
     *        Request to delete an existing <a>Authorizer</a> resource.
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteAuthorizer
     */
    @Override
    public DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAuthorizer(request);
    }

    @SdkInternalApi
    final DeleteAuthorizerResult executeDeleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAuthorizerRequest> request = null;
        Response<DeleteAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @return Result of the DeleteBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteBasePathMapping
     */
    @Override
    public DeleteBasePathMappingResult deleteBasePathMapping(DeleteBasePathMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBasePathMapping(request);
    }

    @SdkInternalApi
    final DeleteBasePathMappingResult executeDeleteBasePathMapping(DeleteBasePathMappingRequest deleteBasePathMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBasePathMappingRequest> request = null;
        Response<DeleteBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBasePathMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBasePathMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBasePathMappingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteBasePathMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest
     *        A request to delete the <a>ClientCertificate</a> resource.
     * @return Result of the DeleteClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.DeleteClientCertificate
     */
    @Override
    public DeleteClientCertificateResult deleteClientCertificate(DeleteClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClientCertificate(request);
    }

    @SdkInternalApi
    final DeleteClientCertificateResult executeDeleteClientCertificate(DeleteClientCertificateRequest deleteClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClientCertificateRequest> request = null;
        Response<DeleteClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClientCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClientCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteClientCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only succeed if there are no <a>Stage</a>
     * resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests API Gateway to delete a <a>Deployment</a> resource.
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDeployment
     */
    @Override
    public DeleteDeploymentResult deleteDeployment(DeleteDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeployment(request);
    }

    @SdkInternalApi
    final DeleteDeploymentResult executeDeleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentRequest> request = null;
        Response<DeleteDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param deleteDocumentationPartRequest
     *        Deletes an existing documentation part of an API.
     * @return Result of the DeleteDocumentationPart operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteDocumentationPart
     */
    @Override
    public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDocumentationPart(request);
    }

    @SdkInternalApi
    final DeleteDocumentationPartResult executeDeleteDocumentationPart(DeleteDocumentationPartRequest deleteDocumentationPartRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentationPartRequest> request = null;
        Response<DeleteDocumentationPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentationPartRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDocumentationPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDocumentationPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentationPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDocumentationPartResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param deleteDocumentationVersionRequest
     *        Deletes an existing documentation version of an API.
     * @return Result of the DeleteDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDocumentationVersion
     */
    @Override
    public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDocumentationVersion(request);
    }

    @SdkInternalApi
    final DeleteDocumentationVersionResult executeDeleteDocumentationVersion(DeleteDocumentationVersionRequest deleteDocumentationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentationVersionRequest> request = null;
        Response<DeleteDocumentationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDocumentationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDocumentationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDocumentationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @return Result of the DeleteDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDomainName
     */
    @Override
    public DeleteDomainNameResult deleteDomainName(DeleteDomainNameRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainName(request);
    }

    @SdkInternalApi
    final DeleteDomainNameResult executeDeleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainNameRequest> request = null;
        Response<DeleteDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomainName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and
     * resets it with the default settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest
     *        Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given
     *        <a>RestApi</a> and resets it with the default settings.
     * @return Result of the DeleteGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteGatewayResponse
     */
    @Override
    public DeleteGatewayResponseResult deleteGatewayResponse(DeleteGatewayResponseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGatewayResponse(request);
    }

    @SdkInternalApi
    final DeleteGatewayResponseResult executeDeleteGatewayResponse(DeleteGatewayResponseRequest deleteGatewayResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayResponseRequest> request = null;
        Response<DeleteGatewayResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGatewayResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayResponseResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteGatewayResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteIntegration
     */
    @Override
    public DeleteIntegrationResult deleteIntegration(DeleteIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntegration(request);
    }

    @SdkInternalApi
    final DeleteIntegrationResult executeDeleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationRequest> request = null;
        Response<DeleteIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @return Result of the DeleteIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteIntegrationResponse
     */
    @Override
    public DeleteIntegrationResponseResult deleteIntegrationResponse(DeleteIntegrationResponseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntegrationResponse(request);
    }

    @SdkInternalApi
    final DeleteIntegrationResponseResult executeDeleteIntegrationResponse(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationResponseRequest> request = null;
        Response<DeleteIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationResponseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntegrationResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntegrationResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIntegrationResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @return Result of the DeleteMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteMethod
     */
    @Override
    public DeleteMethodResult deleteMethod(DeleteMethodRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMethod(request);
    }

    @SdkInternalApi
    final DeleteMethodResult executeDeleteMethod(DeleteMethodRequest deleteMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodRequest> request = null;
        Response<DeleteMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @return Result of the DeleteMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteMethodResponse
     */
    @Override
    public DeleteMethodResponseResult deleteMethodResponse(DeleteMethodResponseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMethodResponse(request);
    }

    @SdkInternalApi
    final DeleteMethodResponseResult executeDeleteMethodResponse(DeleteMethodResponseRequest deleteMethodResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodResponseRequest> request = null;
        Response<DeleteMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMethodResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMethodResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMethodResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a> resource.
     * @return Result of the DeleteModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteModel
     */
    @Override
    public DeleteModelResult deleteModel(DeleteModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModel(request);
    }

    @SdkInternalApi
    final DeleteModelResult executeDeleteModel(DeleteModelRequest deleteModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<DeleteModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest
     *        Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the DeleteRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteRequestValidator
     */
    @Override
    public DeleteRequestValidatorResult deleteRequestValidator(DeleteRequestValidatorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRequestValidator(request);
    }

    @SdkInternalApi
    final DeleteRequestValidatorResult executeDeleteRequestValidator(DeleteRequestValidatorRequest deleteRequestValidatorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRequestValidatorRequest> request = null;
        Response<DeleteRequestValidatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRequestValidatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRequestValidatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRequestValidator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRequestValidatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRequestValidatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @return Result of the DeleteResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteResource
     */
    @Override
    public DeleteResourceResult deleteResource(DeleteResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResource(request);
    }

    @SdkInternalApi
    final DeleteResourceResult executeDeleteResource(DeleteResourceRequest deleteResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<DeleteResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @return Result of the DeleteRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteRestApi
     */
    @Override
    public DeleteRestApiResult deleteRestApi(DeleteRestApiRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRestApi(request);
    }

    @SdkInternalApi
    final DeleteRestApiResult executeDeleteRestApi(DeleteRestApiRequest deleteRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRestApiRequest> request = null;
        Response<DeleteRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRestApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests API Gateway to delete a <a>Stage</a> resource.
     * @return Result of the DeleteStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteStage
     */
    @Override
    public DeleteStageResult deleteStage(DeleteStageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStage(request);
    }

    @SdkInternalApi
    final DeleteStageResult executeDeleteStage(DeleteStageRequest deleteStageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStageRequest> request = null;
        Response<DeleteStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest
     *        The DELETE request to delete a usage plan of a given plan Id.
     * @return Result of the DeleteUsagePlan operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.DeleteUsagePlan
     */
    @Override
    public DeleteUsagePlanResult deleteUsagePlan(DeleteUsagePlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUsagePlan(request);
    }

    @SdkInternalApi
    final DeleteUsagePlanResult executeDeleteUsagePlan(DeleteUsagePlanRequest deleteUsagePlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsagePlanRequest> request = null;
        Response<DeleteUsagePlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUsagePlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUsagePlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUsagePlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUsagePlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUsagePlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest
     *        The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage
     *        plan.
     * @return Result of the DeleteUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteUsagePlanKey
     */
    @Override
    public DeleteUsagePlanKeyResult deleteUsagePlanKey(DeleteUsagePlanKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUsagePlanKey(request);
    }

    @SdkInternalApi
    final DeleteUsagePlanKeyResult executeDeleteUsagePlanKey(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsagePlanKeyRequest> request = null;
        Response<DeleteUsagePlanKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUsagePlanKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUsagePlanKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUsagePlanKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUsagePlanKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUsagePlanKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     *        Deletes an existing <a>VpcLink</a> of a specified identifier.
     * @return Result of the DeleteVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteVpcLink
     */
    @Override
    public DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVpcLink(request);
    }

    @SdkInternalApi
    final DeleteVpcLinkResult executeDeleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcLinkRequest> request = null;
        Response<DeleteVpcLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVpcLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVpcLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVpcLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVpcLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest
     *        Request to flush authorizer cache entries on a specified stage.
     * @return Result of the FlushStageAuthorizersCache operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.FlushStageAuthorizersCache
     */
    @Override
    public FlushStageAuthorizersCacheResult flushStageAuthorizersCache(FlushStageAuthorizersCacheRequest request) {
        request = beforeClientExecution(request);
        return executeFlushStageAuthorizersCache(request);
    }

    @SdkInternalApi
    final FlushStageAuthorizersCacheResult executeFlushStageAuthorizersCache(FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(flushStageAuthorizersCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FlushStageAuthorizersCacheRequest> request = null;
        Response<FlushStageAuthorizersCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FlushStageAuthorizersCacheRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(flushStageAuthorizersCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FlushStageAuthorizersCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FlushStageAuthorizersCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new FlushStageAuthorizersCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests API Gateway to flush a stage's cache.
     * @return Result of the FlushStageCache operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.FlushStageCache
     */
    @Override
    public FlushStageCacheResult flushStageCache(FlushStageCacheRequest request) {
        request = beforeClientExecution(request);
        return executeFlushStageCache(request);
    }

    @SdkInternalApi
    final FlushStageCacheResult executeFlushStageCache(FlushStageCacheRequest flushStageCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(flushStageCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FlushStageCacheRequest> request = null;
        Response<FlushStageCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FlushStageCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(flushStageCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FlushStageCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FlushStageCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new FlushStageCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest
     *        A request to generate a <a>ClientCertificate</a> resource.
     * @return Result of the GenerateClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GenerateClientCertificate
     */
    @Override
    public GenerateClientCertificateResult generateClientCertificate(GenerateClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateClientCertificate(request);
    }

    @SdkInternalApi
    final GenerateClientCertificateResult executeGenerateClientCertificate(GenerateClientCertificateRequest generateClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(generateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateClientCertificateRequest> request = null;
        Response<GenerateClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateClientCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(generateClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateClientCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GenerateClientCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests API Gateway to get information about the current <a>Account</a> resource.
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAccount
     */
    @Override
    public GetAccountResult getAccount(GetAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccount(request);
    }

    @SdkInternalApi
    final GetAccountResult executeGetAccount(GetAccountRequest getAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a> resource.
     * @return Result of the GetApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetApiKey
     */
    @Override
    public GetApiKeyResult getApiKey(GetApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetApiKey(request);
    }

    @SdkInternalApi
    final GetApiKeyResult executeGetApiKey(GetApiKeyRequest getApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeyRequest> request = null;
        Response<GetApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApiKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a> resource.
     * @return Result of the GetApiKeys operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetApiKeys
     */
    @Override
    public GetApiKeysResult getApiKeys(GetApiKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetApiKeys(request);
    }

    @SdkInternalApi
    final GetApiKeysResult executeGetApiKeys(GetApiKeysRequest getApiKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeysRequest> request = null;
        Response<GetApiKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApiKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApiKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApiKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApiKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html">AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest
     *        Request to describe an existing <a>Authorizer</a> resource.
     * @return Result of the GetAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAuthorizer
     */
    @Override
    public GetAuthorizerResult getAuthorizer(GetAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeGetAuthorizer(request);
    }

    @SdkInternalApi
    final GetAuthorizerResult executeGetAuthorizer(GetAuthorizerRequest getAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(getAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizerRequest> request = null;
        Response<GetAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html">AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest
     *        Request to describe an existing <a>Authorizers</a> resource.
     * @return Result of the GetAuthorizers operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAuthorizers
     */
    @Override
    public GetAuthorizersResult getAuthorizers(GetAuthorizersRequest request) {
        request = beforeClientExecution(request);
        return executeGetAuthorizers(request);
    }

    @SdkInternalApi
    final GetAuthorizersResult executeGetAuthorizers(GetAuthorizersRequest getAuthorizersRequest) {

        ExecutionContext executionContext = createExecutionContext(getAuthorizersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizersRequest> request = null;
        Response<GetAuthorizersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthorizersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAuthorizers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAuthorizersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAuthorizersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @return Result of the GetBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetBasePathMapping
     */
    @Override
    public GetBasePathMappingResult getBasePathMapping(GetBasePathMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetBasePathMapping(request);
    }

    @SdkInternalApi
    final GetBasePathMappingResult executeGetBasePathMapping(GetBasePathMappingRequest getBasePathMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingRequest> request = null;
        Response<GetBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBasePathMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBasePathMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBasePathMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of <a>BasePathMapping</a> resources.
     * @return Result of the GetBasePathMappings operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetBasePathMappings
     */
    @Override
    public GetBasePathMappingsResult getBasePathMappings(GetBasePathMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBasePathMappings(request);
    }

    @SdkInternalApi
    final GetBasePathMappingsResult executeGetBasePathMappings(GetBasePathMappingsRequest getBasePathMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBasePathMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingsRequest> request = null;
        Response<GetBasePathMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBasePathMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBasePathMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBasePathMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBasePathMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest
     *        A request to get information about the current <a>ClientCertificate</a> resource.
     * @return Result of the GetClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetClientCertificate
     */
    @Override
    public GetClientCertificateResult getClientCertificate(GetClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetClientCertificate(request);
    }

    @SdkInternalApi
    final GetClientCertificateResult executeGetClientCertificate(GetClientCertificateRequest getClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificateRequest> request = null;
        Response<GetClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClientCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetClientCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest
     *        A request to get information about a collection of <a>ClientCertificate</a> resources.
     * @return Result of the GetClientCertificates operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetClientCertificates
     */
    @Override
    public GetClientCertificatesResult getClientCertificates(GetClientCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetClientCertificates(request);
    }

    @SdkInternalApi
    final GetClientCertificatesResult executeGetClientCertificates(GetClientCertificatesRequest getClientCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificatesRequest> request = null;
        Response<GetClientCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClientCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetClientCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClientCertificatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetClientCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests API Gateway to get information about a <a>Deployment</a> resource.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.GetDeployment
     */
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployment(request);
    }

    @SdkInternalApi
    final GetDeploymentResult executeGetDeployment(GetDeploymentRequest getDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests API Gateway to get information about a <a>Deployments</a> collection.
     * @return Result of the GetDeployments operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.GetDeployments
     */
    @Override
    public GetDeploymentsResult getDeployments(GetDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployments(request);
    }

    @SdkInternalApi
    final GetDeploymentsResult executeGetDeployments(GetDeploymentsRequest getDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentsRequest> request = null;
        Response<GetDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getDocumentationPartRequest
     *        Gets a specified documentation part of a given API.
     * @return Result of the GetDocumentationPart operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationPart
     */
    @Override
    public GetDocumentationPartResult getDocumentationPart(GetDocumentationPartRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentationPart(request);
    }

    @SdkInternalApi
    final GetDocumentationPartResult executeGetDocumentationPart(GetDocumentationPartRequest getDocumentationPartRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationPartRequest> request = null;
        Response<GetDocumentationPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationPartRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentationPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentationPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentationPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentationPartResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getDocumentationPartsRequest
     *        Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API
     *        entities (targets).
     * @return Result of the GetDocumentationParts operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationParts
     */
    @Override
    public GetDocumentationPartsResult getDocumentationParts(GetDocumentationPartsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentationParts(request);
    }

    @SdkInternalApi
    final GetDocumentationPartsResult executeGetDocumentationParts(GetDocumentationPartsRequest getDocumentationPartsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentationPartsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationPartsRequest> request = null;
        Response<GetDocumentationPartsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationPartsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentationPartsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentationParts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentationPartsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetDocumentationPartsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getDocumentationVersionRequest
     *        Gets a documentation snapshot of an API.
     * @return Result of the GetDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationVersion
     */
    @Override
    public GetDocumentationVersionResult getDocumentationVersion(GetDocumentationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentationVersion(request);
    }

    @SdkInternalApi
    final GetDocumentationVersionResult executeGetDocumentationVersion(GetDocumentationVersionRequest getDocumentationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationVersionRequest> request = null;
        Response<GetDocumentationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDocumentationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDocumentationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getDocumentationVersionsRequest
     *        Gets the documentation versions of an API.
     * @return Result of the GetDocumentationVersions operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationVersions
     */
    @Override
    public GetDocumentationVersionsResult getDocumentationVersions(GetDocumentationVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentationVersions(request);
    }

    @SdkInternalApi
    final GetDocumentationVersionsResult executeGetDocumentationVersions(GetDocumentationVersionsRequest getDocumentationVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationVersionsRequest> request = null;
        Response<GetDocumentationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDocumentationVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentationVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentationVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDocumentationVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return Result of the GetDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDomainName
     */
    @Override
    public GetDomainNameResult getDomainName(GetDomainNameRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainName(request);
    }

    @SdkInternalApi
    final GetDomainNameResult executeGetDomainName(GetDomainNameRequest getDomainNameRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNameRequest> request = null;
        Response<GetDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @return Result of the GetDomainNames operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDomainNames
     */
    @Override
    public GetDomainNamesResult getDomainNames(GetDomainNamesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainNames(request);
    }

    @SdkInternalApi
    final GetDomainNamesResult executeGetDomainNames(GetDomainNamesRequest getDomainNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNamesRequest> request = null;
        Response<GetDomainNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest
     *        Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
     * @return Result of the GetExport operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetExport
     */
    @Override
    public GetExportResult getExport(GetExportRequest request) {
        request = beforeClientExecution(request);
        return executeGetExport(request);
    }

    @SdkInternalApi
    final GetExportResult executeGetExport(GetExportRequest getExportRequest) {

        ExecutionContext executionContext = createExecutionContext(getExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportRequest> request = null;
        Response<GetExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest
     *        Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return Result of the GetGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetGatewayResponse
     */
    @Override
    public GetGatewayResponseResult getGatewayResponse(GetGatewayResponseRequest request) {
        request = beforeClientExecution(request);
        return executeGetGatewayResponse(request);
    }

    @SdkInternalApi
    final GetGatewayResponseResult executeGetGatewayResponse(GetGatewayResponseRequest getGatewayResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(getGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayResponseRequest> request = null;
        Response<GetGatewayResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGatewayResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGatewayResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGatewayResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGatewayResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any
     * definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a>
     * collection for the supported response types.
     * </p>
     * 
     * @param getGatewayResponsesRequest
     *        Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added
     *        any definitions for gateway responses, the result will be the API Gateway-generated default
     *        <a>GatewayResponses</a> collection for the supported response types.
     * @return Result of the GetGatewayResponses operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetGatewayResponses
     */
    @Override
    public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) {
        request = beforeClientExecution(request);
        return executeGetGatewayResponses(request);
    }

    @SdkInternalApi
    final GetGatewayResponsesResult executeGetGatewayResponses(GetGatewayResponsesRequest getGatewayResponsesRequest) {

        ExecutionContext executionContext = createExecutionContext(getGatewayResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayResponsesRequest> request = null;
        Response<GetGatewayResponsesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayResponsesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGatewayResponsesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGatewayResponses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGatewayResponsesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGatewayResponsesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a request to get the integration configuration.
     * @return Result of the GetIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetIntegration
     */
    @Override
    public GetIntegrationResult getIntegration(GetIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntegration(request);
    }

    @SdkInternalApi
    final GetIntegrationResult executeGetIntegration(GetIntegrationRequest getIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationRequest> request = null;
        Response<GetIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @return Result of the GetIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetIntegrationResponse
     */
    @Override
    public GetIntegrationResponseResult getIntegrationResponse(GetIntegrationResponseRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntegrationResponse(request);
    }

    @SdkInternalApi
    final GetIntegrationResponseResult executeGetIntegrationResponse(GetIntegrationResponseRequest getIntegrationResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationResponseRequest> request = null;
        Response<GetIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntegrationResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntegrationResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIntegrationResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @return Result of the GetMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetMethod
     */
    @Override
    public GetMethodResult getMethod(GetMethodRequest request) {
        request = beforeClientExecution(request);
        return executeGetMethod(request);
    }

    @SdkInternalApi
    final GetMethodResult executeGetMethod(GetMethodRequest getMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(getMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodRequest> request = null;
        Response<GetMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMethodResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @return Result of the GetMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetMethodResponse
     */
    @Override
    public GetMethodResponseResult getMethodResponse(GetMethodResponseRequest request) {
        request = beforeClientExecution(request);
        return executeGetMethodResponse(request);
    }

    @SdkInternalApi
    final GetMethodResponseResult executeGetMethodResponse(GetMethodResponseRequest getMethodResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(getMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodResponseRequest> request = null;
        Response<GetMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMethodResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMethodResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMethodResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing <a>RestApi</a> resource.
     * @return Result of the GetModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModel
     */
    @Override
    public GetModelResult getModel(GetModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetModel(request);
    }

    @SdkInternalApi
    final GetModelResult executeGetModel(GetModelRequest getModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelRequest> request = null;
        Response<GetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform the payload.
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModelTemplate
     */
    @Override
    public GetModelTemplateResult getModelTemplate(GetModelTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelTemplate(request);
    }

    @SdkInternalApi
    final GetModelTemplateResult executeGetModelTemplate(GetModelTemplateRequest getModelTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelTemplateRequest> request = null;
        Response<GetModelTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * @return Result of the GetModels operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModels
     */
    @Override
    public GetModelsResult getModels(GetModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetModels(request);
    }

    @SdkInternalApi
    final GetModelsResult executeGetModels(GetModelsRequest getModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest
     *        Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the GetRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRequestValidator
     */
    @Override
    public GetRequestValidatorResult getRequestValidator(GetRequestValidatorRequest request) {
        request = beforeClientExecution(request);
        return executeGetRequestValidator(request);
    }

    @SdkInternalApi
    final GetRequestValidatorResult executeGetRequestValidator(GetRequestValidatorRequest getRequestValidatorRequest) {

        ExecutionContext executionContext = createExecutionContext(getRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRequestValidatorRequest> request = null;
        Response<GetRequestValidatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRequestValidatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRequestValidatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRequestValidator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRequestValidatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRequestValidatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest
     *        Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * @return Result of the GetRequestValidators operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRequestValidators
     */
    @Override
    public GetRequestValidatorsResult getRequestValidators(GetRequestValidatorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRequestValidators(request);
    }

    @SdkInternalApi
    final GetRequestValidatorsResult executeGetRequestValidators(GetRequestValidatorsRequest getRequestValidatorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRequestValidatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRequestValidatorsRequest> request = null;
        Response<GetRequestValidatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRequestValidatorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRequestValidatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRequestValidators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRequestValidatorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRequestValidatorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @return Result of the GetResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetResource
     */
    @Override
    public GetResourceResult getResource(GetResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetResource(request);
    }

    @SdkInternalApi
    final GetResourceResult executeGetResource(GetResourceRequest getResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceRequest> request = null;
        Response<GetResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @return Result of the GetResources operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetResources
     */
    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResources(request);
    }

    @SdkInternalApi
    final GetResourcesResult executeGetResources(GetResourcesRequest getResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        The GET request to list an existing <a>RestApi</a> defined for your collection.
     * @return Result of the GetRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRestApi
     */
    @Override
    public GetRestApiResult getRestApi(GetRestApiRequest request) {
        request = beforeClientExecution(request);
        return executeGetRestApi(request);
    }

    @SdkInternalApi
    final GetRestApiResult executeGetRestApi(GetRestApiRequest getRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(getRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApiRequest> request = null;
        Response<GetRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRestApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        The GET request to list existing <a>RestApis</a> defined for your collection.
     * @return Result of the GetRestApis operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRestApis
     */
    @Override
    public GetRestApisResult getRestApis(GetRestApisRequest request) {
        request = beforeClientExecution(request);
        return executeGetRestApis(request);
    }

    @SdkInternalApi
    final GetRestApisResult executeGetRestApis(GetRestApisRequest getRestApisRequest) {

        ExecutionContext executionContext = createExecutionContext(getRestApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApisRequest> request = null;
        Response<GetRestApisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRestApisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRestApis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRestApisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRestApisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest
     *        Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * @return Result of the GetSdk operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdk
     */
    @Override
    public GetSdkResult getSdk(GetSdkRequest request) {
        request = beforeClientExecution(request);
        return executeGetSdk(request);
    }

    @SdkInternalApi
    final GetSdkResult executeGetSdk(GetSdkRequest getSdkRequest) {

        ExecutionContext executionContext = createExecutionContext(getSdkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkRequest> request = null;
        Response<GetSdkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSdkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSdk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSdkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetSdkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getSdkTypeRequest
     *        Get an <a>SdkType</a> instance.
     * @return Result of the GetSdkType operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdkType
     */
    @Override
    public GetSdkTypeResult getSdkType(GetSdkTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetSdkType(request);
    }

    @SdkInternalApi
    final GetSdkTypeResult executeGetSdkType(GetSdkTypeRequest getSdkTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getSdkTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkTypeRequest> request = null;
        Response<GetSdkTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSdkTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSdkType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSdkTypeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSdkTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getSdkTypesRequest
     *        Get the <a>SdkTypes</a> collection.
     * @return Result of the GetSdkTypes operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdkTypes
     */
    @Override
    public GetSdkTypesResult getSdkTypes(GetSdkTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSdkTypes(request);
    }

    @SdkInternalApi
    final GetSdkTypesResult executeGetSdkTypes(GetSdkTypesRequest getSdkTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSdkTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkTypesRequest> request = null;
        Response<GetSdkTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSdkTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSdkTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSdkTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSdkTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests API Gateway to get information about a <a>Stage</a> resource.
     * @return Result of the GetStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetStage
     */
    @Override
    public GetStageResult getStage(GetStageRequest request) {
        request = beforeClientExecution(request);
        return executeGetStage(request);
    }

    @SdkInternalApi
    final GetStageResult executeGetStage(GetStageRequest getStageRequest) {

        ExecutionContext executionContext = createExecutionContext(getStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageRequest> request = null;
        Response<GetStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests API Gateway to get information about one or more <a>Stage</a> resources.
     * @return Result of the GetStages operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetStages
     */
    @Override
    public GetStagesResult getStages(GetStagesRequest request) {
        request = beforeClientExecution(request);
        return executeGetStages(request);
    }

    @SdkInternalApi
    final GetStagesResult executeGetStages(GetStagesRequest getStagesRequest) {

        ExecutionContext executionContext = createExecutionContext(getStagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStagesRequest> request = null;
        Response<GetStagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStagesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest
     *        Gets the <a>Tags</a> collection for a given resource.
     * @return Result of the GetTags operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetTags
     */
    @Override
    public GetTagsResult getTags(GetTagsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTags(request);
    }

    @SdkInternalApi
    final GetTagsResult executeGetTags(GetTagsRequest getTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagsRequest> request = null;
        Response<GetTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest
     *        The GET request to get the usage data of a usage plan in a specified time interval.
     * @return Result of the GetUsage operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsage
     */
    @Override
    public GetUsageResult getUsage(GetUsageRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsage(request);
    }

    @SdkInternalApi
    final GetUsageResult executeGetUsage(GetUsageRequest getUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageRequest> request = null;
        Response<GetUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest
     *        The GET request to get a usage plan of a given plan identifier.
     * @return Result of the GetUsagePlan operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlan
     */
    @Override
    public GetUsagePlanResult getUsagePlan(GetUsagePlanRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsagePlan(request);
    }

    @SdkInternalApi
    final GetUsagePlanResult executeGetUsagePlan(GetUsagePlanRequest getUsagePlanRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanRequest> request = null;
        Response<GetUsagePlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsagePlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsagePlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsagePlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsagePlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest
     *        The GET request to get a usage plan key of a given key identifier.
     * @return Result of the GetUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlanKey
     */
    @Override
    public GetUsagePlanKeyResult getUsagePlanKey(GetUsagePlanKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsagePlanKey(request);
    }

    @SdkInternalApi
    final GetUsagePlanKeyResult executeGetUsagePlanKey(GetUsagePlanKeyRequest getUsagePlanKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanKeyRequest> request = null;
        Response<GetUsagePlanKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsagePlanKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsagePlanKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsagePlanKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsagePlanKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest
     *        The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
     * @return Result of the GetUsagePlanKeys operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlanKeys
     */
    @Override
    public GetUsagePlanKeysResult getUsagePlanKeys(GetUsagePlanKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsagePlanKeys(request);
    }

    @SdkInternalApi
    final GetUsagePlanKeysResult executeGetUsagePlanKeys(GetUsagePlanKeysRequest getUsagePlanKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsagePlanKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanKeysRequest> request = null;
        Response<GetUsagePlanKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsagePlanKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsagePlanKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsagePlanKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsagePlanKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest
     *        The GET request to get all the usage plans of the caller's account.
     * @return Result of the GetUsagePlans operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.GetUsagePlans
     */
    @Override
    public GetUsagePlansResult getUsagePlans(GetUsagePlansRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsagePlans(request);
    }

    @SdkInternalApi
    final GetUsagePlansResult executeGetUsagePlans(GetUsagePlansRequest getUsagePlansRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsagePlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlansRequest> request = null;
        Response<GetUsagePlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsagePlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsagePlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsagePlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsagePlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest
     *        Gets a specified VPC link under the caller's account in a region.
     * @return Result of the GetVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetVpcLink
     */
    @Override
    public GetVpcLinkResult getVpcLink(GetVpcLinkRequest request) {
        request = beforeClientExecution(request);
        return executeGetVpcLink(request);
    }

    @SdkInternalApi
    final GetVpcLinkResult executeGetVpcLink(GetVpcLinkRequest getVpcLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(getVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVpcLinkRequest> request = null;
        Response<GetVpcLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVpcLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVpcLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVpcLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVpcLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVpcLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * </p>
     * 
     * @param getVpcLinksRequest
     *        Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * @return Result of the GetVpcLinks operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetVpcLinks
     */
    @Override
    public GetVpcLinksResult getVpcLinks(GetVpcLinksRequest request) {
        request = beforeClientExecution(request);
        return executeGetVpcLinks(request);
    }

    @SdkInternalApi
    final GetVpcLinksResult executeGetVpcLinks(GetVpcLinksRequest getVpcLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(getVpcLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVpcLinksRequest> request = null;
        Response<GetVpcLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVpcLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVpcLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVpcLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVpcLinksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVpcLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest
     *        The POST request to import API keys from an external source, such as a CSV-formatted file.
     * @return Result of the ImportApiKeys operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.ImportApiKeys
     */
    @Override
    public ImportApiKeysResult importApiKeys(ImportApiKeysRequest request) {
        request = beforeClientExecution(request);
        return executeImportApiKeys(request);
    }

    @SdkInternalApi
    final ImportApiKeysResult executeImportApiKeys(ImportApiKeysRequest importApiKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(importApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportApiKeysRequest> request = null;
        Response<ImportApiKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportApiKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importApiKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportApiKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportApiKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportApiKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param importDocumentationPartsRequest
     *        Import documentation parts from an external (e.g., OpenAPI) definition file.
     * @return Result of the ImportDocumentationParts operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.ImportDocumentationParts
     */
    @Override
    public ImportDocumentationPartsResult importDocumentationParts(ImportDocumentationPartsRequest request) {
        request = beforeClientExecution(request);
        return executeImportDocumentationParts(request);
    }

    @SdkInternalApi
    final ImportDocumentationPartsResult executeImportDocumentationParts(ImportDocumentationPartsRequest importDocumentationPartsRequest) {

        ExecutionContext executionContext = createExecutionContext(importDocumentationPartsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportDocumentationPartsRequest> request = null;
        Response<ImportDocumentationPartsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportDocumentationPartsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importDocumentationPartsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportDocumentationParts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportDocumentationPartsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportDocumentationPartsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest
     *        A POST request to import an API to API Gateway using an input of an API definition file.
     * @return Result of the ImportRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.ImportRestApi
     */
    @Override
    public ImportRestApiResult importRestApi(ImportRestApiRequest request) {
        request = beforeClientExecution(request);
        return executeImportRestApi(request);
    }

    @SdkInternalApi
    final ImportRestApiResult executeImportRestApi(ImportRestApiRequest importRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(importRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportRestApiRequest> request = null;
        Response<ImportRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportRestApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest
     *        Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the
     *        given <a>RestApi</a>.
     * @return Result of the PutGatewayResponse operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutGatewayResponse
     */
    @Override
    public PutGatewayResponseResult putGatewayResponse(PutGatewayResponseRequest request) {
        request = beforeClientExecution(request);
        return executePutGatewayResponse(request);
    }

    @SdkInternalApi
    final PutGatewayResponseResult executePutGatewayResponse(PutGatewayResponseRequest putGatewayResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(putGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGatewayResponseRequest> request = null;
        Response<PutGatewayResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGatewayResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putGatewayResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutGatewayResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutGatewayResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutGatewayResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Sets up a method's integration.
     * @return Result of the PutIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutIntegration
     */
    @Override
    public PutIntegrationResult putIntegration(PutIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executePutIntegration(request);
    }

    @SdkInternalApi
    final PutIntegrationResult executePutIntegration(PutIntegrationRequest putIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(putIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationRequest> request = null;
        Response<PutIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @return Result of the PutIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.PutIntegrationResponse
     */
    @Override
    public PutIntegrationResponseResult putIntegrationResponse(PutIntegrationResponseRequest request) {
        request = beforeClientExecution(request);
        return executePutIntegrationResponse(request);
    }

    @SdkInternalApi
    final PutIntegrationResponseResult executePutIntegrationResponse(PutIntegrationResponseRequest putIntegrationResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(putIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationResponseRequest> request = null;
        Response<PutIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutIntegrationResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutIntegrationResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutIntegrationResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @return Result of the PutMethod operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutMethod
     */
    @Override
    public PutMethodResult putMethod(PutMethodRequest request) {
        request = beforeClientExecution(request);
        return executePutMethod(request);
    }

    @SdkInternalApi
    final PutMethodResult executePutMethod(PutMethodRequest putMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(putMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodRequest> request = null;
        Response<PutMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMethodResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * @return Result of the PutMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutMethodResponse
     */
    @Override
    public PutMethodResponseResult putMethodResponse(PutMethodResponseRequest request) {
        request = beforeClientExecution(request);
        return executePutMethodResponse(request);
    }

    @SdkInternalApi
    final PutMethodResponseResult executePutMethodResponse(PutMethodResponseRequest putMethodResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(putMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodResponseRequest> request = null;
        Response<PutMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMethodResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMethodResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMethodResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API with an input of external API
     * definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest
     *        A PUT request to update an existing API, with external API definitions specified as the request body.
     * @return Result of the PutRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.PutRestApi
     */
    @Override
    public PutRestApiResult putRestApi(PutRestApiRequest request) {
        request = beforeClientExecution(request);
        return executePutRestApi(request);
    }

    @SdkInternalApi
    final PutRestApiResult executePutRestApi(PutRestApiRequest putRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(putRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRestApiRequest> request = null;
        Response<PutRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRestApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds or updates a tag on a given resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.TagResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
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
     * Simulate the execution of an <a>Authorizer</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom
     * authorizers</a> </div>
     * 
     * @param testInvokeAuthorizerRequest
     *        Make a request to simulate the execution of an <a>Authorizer</a>.
     * @return Result of the TestInvokeAuthorizer operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.TestInvokeAuthorizer
     */
    @Override
    public TestInvokeAuthorizerResult testInvokeAuthorizer(TestInvokeAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeTestInvokeAuthorizer(request);
    }

    @SdkInternalApi
    final TestInvokeAuthorizerResult executeTestInvokeAuthorizer(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(testInvokeAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeAuthorizerRequest> request = null;
        Response<TestInvokeAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testInvokeAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestInvokeAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestInvokeAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestInvokeAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * 
     * @param testInvokeMethodRequest
     *        Make a request to simulate the execution of a <a>Method</a>.
     * @return Result of the TestInvokeMethod operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.TestInvokeMethod
     */
    @Override
    public TestInvokeMethodResult testInvokeMethod(TestInvokeMethodRequest request) {
        request = beforeClientExecution(request);
        return executeTestInvokeMethod(request);
    }

    @SdkInternalApi
    final TestInvokeMethodResult executeTestInvokeMethod(TestInvokeMethodRequest testInvokeMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(testInvokeMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeMethodRequest> request = null;
        Response<TestInvokeMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testInvokeMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestInvokeMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestInvokeMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestInvokeMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from a given resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UntagResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
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
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests API Gateway to change information about the current <a>Account</a> resource.
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateAccount
     */
    @Override
    public UpdateAccountResult updateAccount(UpdateAccountRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccount(request);
    }

    @SdkInternalApi
    final UpdateAccountResult executeUpdateAccount(UpdateAccountRequest updateAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountRequest> request = null;
        Response<UpdateAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @return Result of the UpdateApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateApiKey
     */
    @Override
    public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApiKey(request);
    }

    @SdkInternalApi
    final UpdateApiKeyResult executeUpdateApiKey(UpdateApiKeyRequest updateApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiKeyRequest> request = null;
        Response<UpdateApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApiKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html">AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest
     *        Request to update an existing <a>Authorizer</a> resource.
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateAuthorizer
     */
    @Override
    public UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAuthorizer(request);
    }

    @SdkInternalApi
    final UpdateAuthorizerResult executeUpdateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuthorizerRequest> request = null;
        Response<UpdateAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a> resource.
     * @return Result of the UpdateBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateBasePathMapping
     */
    @Override
    public UpdateBasePathMappingResult updateBasePathMapping(UpdateBasePathMappingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBasePathMapping(request);
    }

    @SdkInternalApi
    final UpdateBasePathMappingResult executeUpdateBasePathMapping(UpdateBasePathMappingRequest updateBasePathMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBasePathMappingRequest> request = null;
        Response<UpdateBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBasePathMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBasePathMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBasePathMappingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateBasePathMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest
     *        A request to change information about an <a>ClientCertificate</a> resource.
     * @return Result of the UpdateClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.UpdateClientCertificate
     */
    @Override
    public UpdateClientCertificateResult updateClientCertificate(UpdateClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClientCertificate(request);
    }

    @SdkInternalApi
    final UpdateClientCertificateResult executeUpdateClientCertificate(UpdateClientCertificateRequest updateClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClientCertificateRequest> request = null;
        Response<UpdateClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClientCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClientCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateClientCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests API Gateway to change information about a <a>Deployment</a> resource.
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.UpdateDeployment
     */
    @Override
    public UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeployment(request);
    }

    @SdkInternalApi
    final UpdateDeploymentResult executeUpdateDeployment(UpdateDeploymentRequest updateDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentRequest> request = null;
        Response<UpdateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param updateDocumentationPartRequest
     *        Updates an existing documentation part of a given API.
     * @return Result of the UpdateDocumentationPart operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDocumentationPart
     */
    @Override
    public UpdateDocumentationPartResult updateDocumentationPart(UpdateDocumentationPartRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocumentationPart(request);
    }

    @SdkInternalApi
    final UpdateDocumentationPartResult executeUpdateDocumentationPart(UpdateDocumentationPartRequest updateDocumentationPartRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentationPartRequest> request = null;
        Response<UpdateDocumentationPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentationPartRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDocumentationPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocumentationPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentationPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDocumentationPartResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param updateDocumentationVersionRequest
     *        Updates an existing documentation version of an API.
     * @return Result of the UpdateDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDocumentationVersion
     */
    @Override
    public UpdateDocumentationVersionResult updateDocumentationVersion(UpdateDocumentationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocumentationVersion(request);
    }

    @SdkInternalApi
    final UpdateDocumentationVersionResult executeUpdateDocumentationVersion(UpdateDocumentationVersionRequest updateDocumentationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentationVersionRequest> request = null;
        Response<UpdateDocumentationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDocumentationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocumentationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDocumentationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a> resource.
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDomainName
     */
    @Override
    public UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainName(request);
    }

    @SdkInternalApi
    final UpdateDomainNameResult executeUpdateDomainName(UpdateDomainNameRequest updateDomainNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameRequest> request = null;
        Response<UpdateDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest
     *        Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return Result of the UpdateGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateGatewayResponse
     */
    @Override
    public UpdateGatewayResponseResult updateGatewayResponse(UpdateGatewayResponseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayResponse(request);
    }

    @SdkInternalApi
    final UpdateGatewayResponseResult executeUpdateGatewayResponse(UpdateGatewayResponseRequest updateGatewayResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayResponseRequest> request = null;
        Response<UpdateGatewayResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGatewayResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayResponseResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateGatewayResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @return Result of the UpdateIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateIntegration
     */
    @Override
    public UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIntegration(request);
    }

    @SdkInternalApi
    final UpdateIntegrationResult executeUpdateIntegration(UpdateIntegrationRequest updateIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationRequest> request = null;
        Response<UpdateIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @return Result of the UpdateIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateIntegrationResponse
     */
    @Override
    public UpdateIntegrationResponseResult updateIntegrationResponse(UpdateIntegrationResponseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIntegrationResponse(request);
    }

    @SdkInternalApi
    final UpdateIntegrationResponseResult executeUpdateIntegrationResponse(UpdateIntegrationResponseRequest updateIntegrationResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationResponseRequest> request = null;
        Response<UpdateIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationResponseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIntegrationResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIntegrationResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIntegrationResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @return Result of the UpdateMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateMethod
     */
    @Override
    public UpdateMethodResult updateMethod(UpdateMethodRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMethod(request);
    }

    @SdkInternalApi
    final UpdateMethodResult executeUpdateMethod(UpdateMethodRequest updateMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodRequest> request = null;
        Response<UpdateMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @return Result of the UpdateMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateMethodResponse
     */
    @Override
    public UpdateMethodResponseResult updateMethodResponse(UpdateMethodResponseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMethodResponse(request);
    }

    @SdkInternalApi
    final UpdateMethodResponseResult executeUpdateMethodResponse(UpdateMethodResponseRequest updateMethodResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodResponseRequest> request = null;
        Response<UpdateMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMethodResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMethodResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMethodResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a> resource.
     * @return Result of the UpdateModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateModel
     */
    @Override
    public UpdateModelResult updateModel(UpdateModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModel(request);
    }

    @SdkInternalApi
    final UpdateModelResult executeUpdateModel(UpdateModelRequest updateModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelRequest> request = null;
        Response<UpdateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest
     *        Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the UpdateRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateRequestValidator
     */
    @Override
    public UpdateRequestValidatorResult updateRequestValidator(UpdateRequestValidatorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRequestValidator(request);
    }

    @SdkInternalApi
    final UpdateRequestValidatorResult executeUpdateRequestValidator(UpdateRequestValidatorRequest updateRequestValidatorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRequestValidatorRequest> request = null;
        Response<UpdateRequestValidatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRequestValidatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRequestValidatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRequestValidator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRequestValidatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRequestValidatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @return Result of the UpdateResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateResource
     */
    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResource(request);
    }

    @SdkInternalApi
    final UpdateResourceResult executeUpdateResource(UpdateResourceRequest updateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your collection.
     * @return Result of the UpdateRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateRestApi
     */
    @Override
    public UpdateRestApiResult updateRestApi(UpdateRestApiRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRestApi(request);
    }

    @SdkInternalApi
    final UpdateRestApiResult executeUpdateRestApi(UpdateRestApiRequest updateRestApiRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRestApiRequest> request = null;
        Response<UpdateRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRestApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRestApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRestApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRestApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests API Gateway to change information about a <a>Stage</a> resource.
     * @return Result of the UpdateStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateStage
     */
    @Override
    public UpdateStageResult updateStage(UpdateStageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStage(request);
    }

    @SdkInternalApi
    final UpdateStageResult executeUpdateStage(UpdateStageRequest updateStageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStageRequest> request = null;
        Response<UpdateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest
     *        The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a
     *        specified API key.
     * @return Result of the UpdateUsage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.UpdateUsage
     */
    @Override
    public UpdateUsageResult updateUsage(UpdateUsageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUsage(request);
    }

    @SdkInternalApi
    final UpdateUsageResult executeUpdateUsage(UpdateUsageRequest updateUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUsageRequest> request = null;
        Response<UpdateUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest
     *        The PATCH request to update a usage plan of a given plan Id.
     * @return Result of the UpdateUsagePlan operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateUsagePlan
     */
    @Override
    public UpdateUsagePlanResult updateUsagePlan(UpdateUsagePlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUsagePlan(request);
    }

    @SdkInternalApi
    final UpdateUsagePlanResult executeUpdateUsagePlan(UpdateUsagePlanRequest updateUsagePlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUsagePlanRequest> request = null;
        Response<UpdateUsagePlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUsagePlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUsagePlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUsagePlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUsagePlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUsagePlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest
     *        Updates an existing <a>VpcLink</a> of a specified identifier.
     * @return Result of the UpdateVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateVpcLink
     */
    @Override
    public UpdateVpcLinkResult updateVpcLink(UpdateVpcLinkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVpcLink(request);
    }

    @SdkInternalApi
    final UpdateVpcLinkResult executeUpdateVpcLink(UpdateVpcLinkRequest updateVpcLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVpcLinkRequest> request = null;
        Response<UpdateVpcLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVpcLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVpcLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "API Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVpcLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVpcLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVpcLinkResultJsonUnmarshaller());
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
