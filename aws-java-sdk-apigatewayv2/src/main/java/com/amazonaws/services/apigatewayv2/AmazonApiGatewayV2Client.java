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
package com.amazonaws.services.apigatewayv2;

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

import com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.services.apigatewayv2.model.transform.*;

/**
 * Client for accessing AmazonApiGatewayV2. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon API Gateway V2
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApiGatewayV2Client extends AmazonWebServiceClient implements AmazonApiGatewayV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonApiGatewayV2.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.apigatewayv2.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.apigatewayv2.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.apigatewayv2.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.apigatewayv2.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.apigatewayv2.model.AmazonApiGatewayV2Exception.class));

    public static AmazonApiGatewayV2ClientBuilder builder() {
        return AmazonApiGatewayV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("apigateway.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/apigatewayv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/apigatewayv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest
     * @return Result of the CreateApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateApi
     */
    @Override
    public CreateApiResult createApi(CreateApiRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApi(request);
    }

    @SdkInternalApi
    final CreateApiResult executeCreateApi(CreateApiRequest createApiRequest) {

        ExecutionContext executionContext = createExecutionContext(createApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiRequest> request = null;
        Response<CreateApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest
     * @return Result of the CreateApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateApiMapping
     */
    @Override
    public CreateApiMappingResult createApiMapping(CreateApiMappingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApiMapping(request);
    }

    @SdkInternalApi
    final CreateApiMappingResult executeCreateApiMapping(CreateApiMappingRequest createApiMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(createApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiMappingRequest> request = null;
        Response<CreateApiMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApiMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApiMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApiMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApiMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateAuthorizer
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateDeployment
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * <p>
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     * @return Result of the CreateDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateDomainName
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest
     * @return Result of the CreateIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateIntegration
     */
    @Override
    public CreateIntegrationResult createIntegration(CreateIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIntegration(request);
    }

    @SdkInternalApi
    final CreateIntegrationResult executeCreateIntegration(CreateIntegrationRequest createIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(createIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntegrationRequest> request = null;
        Response<CreateIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest
     * @return Result of the CreateIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateIntegrationResponse
     */
    @Override
    public CreateIntegrationResponseResult createIntegrationResponse(CreateIntegrationResponseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIntegrationResponse(request);
    }

    @SdkInternalApi
    final CreateIntegrationResponseResult executeCreateIntegrationResponse(CreateIntegrationResponseRequest createIntegrationResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(createIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntegrationResponseRequest> request = null;
        Response<CreateIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntegrationResponseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIntegrationResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIntegrationResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIntegrationResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateModel
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest
     * @return Result of the CreateRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateRoute
     */
    @Override
    public CreateRouteResult createRoute(CreateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoute(request);
    }

    @SdkInternalApi
    final CreateRouteResult executeCreateRoute(CreateRouteRequest createRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteRequest> request = null;
        Response<CreateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest
     * @return Result of the CreateRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateRouteResponse
     */
    @Override
    public CreateRouteResponseResult createRouteResponse(CreateRouteResponseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRouteResponse(request);
    }

    @SdkInternalApi
    final CreateRouteResponseResult executeCreateRouteResponse(CreateRouteResponseRequest createRouteResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(createRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteResponseRequest> request = null;
        Response<CreateRouteResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRouteResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRouteResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRouteResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRouteResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.CreateStage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @return Result of the DeleteApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteApi
     */
    @Override
    public DeleteApiResult deleteApi(DeleteApiRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApi(request);
    }

    @SdkInternalApi
    final DeleteApiResult executeDeleteApi(DeleteApiRequest deleteApiRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiRequest> request = null;
        Response<DeleteApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @return Result of the DeleteApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.DeleteApiMapping
     */
    @Override
    public DeleteApiMappingResult deleteApiMapping(DeleteApiMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApiMapping(request);
    }

    @SdkInternalApi
    final DeleteApiMappingResult executeDeleteApiMapping(DeleteApiMappingRequest deleteApiMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiMappingRequest> request = null;
        Response<DeleteApiMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApiMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApiMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApiMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApiMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteAuthorizer
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteDeployment
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @return Result of the DeleteDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteDomainName
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteIntegration
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @return Result of the DeleteIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteIntegrationResponse
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteModel
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRoute
     */
    @Override
    public DeleteRouteResult deleteRoute(DeleteRouteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoute(request);
    }

    @SdkInternalApi
    final DeleteRouteResult executeDeleteRoute(DeleteRouteRequest deleteRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequest> request = null;
        Response<DeleteRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @return Result of the DeleteRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteRouteResponse
     */
    @Override
    public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRouteResponse(request);
    }

    @SdkInternalApi
    final DeleteRouteResponseResult executeDeleteRouteResponse(DeleteRouteResponseRequest deleteRouteResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteResponseRequest> request = null;
        Response<DeleteRouteResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRouteResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRouteResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRouteResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRouteResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.DeleteStage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @return Result of the GetApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetApi
     */
    @Override
    public GetApiResult getApi(GetApiRequest request) {
        request = beforeClientExecution(request);
        return executeGetApi(request);
    }

    @SdkInternalApi
    final GetApiResult executeGetApi(GetApiRequest getApiRequest) {

        ExecutionContext executionContext = createExecutionContext(getApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiRequest> request = null;
        Response<GetApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @return Result of the GetApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApiMapping
     */
    @Override
    public GetApiMappingResult getApiMapping(GetApiMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetApiMapping(request);
    }

    @SdkInternalApi
    final GetApiMappingResult executeGetApiMapping(GetApiMappingRequest getApiMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiMappingRequest> request = null;
        Response<GetApiMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApiMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApiMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApiMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApiMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @return Result of the GetApiMappings operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApiMappings
     */
    @Override
    public GetApiMappingsResult getApiMappings(GetApiMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApiMappings(request);
    }

    @SdkInternalApi
    final GetApiMappingsResult executeGetApiMappings(GetApiMappingsRequest getApiMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getApiMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiMappingsRequest> request = null;
        Response<GetApiMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiMappingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApiMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApiMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApiMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApiMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @return Result of the GetApis operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetApis
     */
    @Override
    public GetApisResult getApis(GetApisRequest request) {
        request = beforeClientExecution(request);
        return executeGetApis(request);
    }

    @SdkInternalApi
    final GetApisResult executeGetApis(GetApisRequest getApisRequest) {

        ExecutionContext executionContext = createExecutionContext(getApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApisRequest> request = null;
        Response<GetApisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApisResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @return Result of the GetAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetAuthorizer
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @return Result of the GetAuthorizers operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetAuthorizers
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetDeployment
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @return Result of the GetDeployments operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetDeployments
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return Result of the GetDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetDomainName
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @return Result of the GetDomainNames operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetDomainNames
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return Result of the GetIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetIntegration
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @return Result of the GetIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetIntegrationResponse
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @return Result of the GetIntegrationResponses operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetIntegrationResponses
     */
    @Override
    public GetIntegrationResponsesResult getIntegrationResponses(GetIntegrationResponsesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntegrationResponses(request);
    }

    @SdkInternalApi
    final GetIntegrationResponsesResult executeGetIntegrationResponses(GetIntegrationResponsesRequest getIntegrationResponsesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntegrationResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationResponsesRequest> request = null;
        Response<GetIntegrationResponsesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationResponsesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIntegrationResponsesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntegrationResponses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntegrationResponsesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIntegrationResponsesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @return Result of the GetIntegrations operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetIntegrations
     */
    @Override
    public GetIntegrationsResult getIntegrations(GetIntegrationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntegrations(request);
    }

    @SdkInternalApi
    final GetIntegrationsResult executeGetIntegrations(GetIntegrationsRequest getIntegrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationsRequest> request = null;
        Response<GetIntegrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntegrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntegrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntegrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntegrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @return Result of the GetModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetModel
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetModelTemplate
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @return Result of the GetModels operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetModels
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @return Result of the GetRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetRoute
     */
    @Override
    public GetRouteResult getRoute(GetRouteRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoute(request);
    }

    @SdkInternalApi
    final GetRouteResult executeGetRoute(GetRouteRequest getRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(getRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteRequest> request = null;
        Response<GetRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRouteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @return Result of the GetRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetRouteResponse
     */
    @Override
    public GetRouteResponseResult getRouteResponse(GetRouteResponseRequest request) {
        request = beforeClientExecution(request);
        return executeGetRouteResponse(request);
    }

    @SdkInternalApi
    final GetRouteResponseResult executeGetRouteResponse(GetRouteResponseRequest getRouteResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(getRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteResponseRequest> request = null;
        Response<GetRouteResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRouteResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRouteResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRouteResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRouteResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @return Result of the GetRouteResponses operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetRouteResponses
     */
    @Override
    public GetRouteResponsesResult getRouteResponses(GetRouteResponsesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRouteResponses(request);
    }

    @SdkInternalApi
    final GetRouteResponsesResult executeGetRouteResponses(GetRouteResponsesRequest getRouteResponsesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRouteResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteResponsesRequest> request = null;
        Response<GetRouteResponsesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteResponsesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRouteResponsesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRouteResponses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRouteResponsesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRouteResponsesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @return Result of the GetRoutes operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetRoutes
     */
    @Override
    public GetRoutesResult getRoutes(GetRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoutes(request);
    }

    @SdkInternalApi
    final GetRoutesResult executeGetRoutes(GetRoutesRequest getRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoutesRequest> request = null;
        Response<GetRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoutesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @sample AmazonApiGatewayV2.GetStage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @return Result of the GetStages operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @sample AmazonApiGatewayV2.GetStages
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest
     * @return Result of the UpdateApi operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateApi
     */
    @Override
    public UpdateApiResult updateApi(UpdateApiRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApi(request);
    }

    @SdkInternalApi
    final UpdateApiResult executeUpdateApi(UpdateApiRequest updateApiRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiRequest> request = null;
        Response<UpdateApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApiResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest
     * @return Result of the UpdateApiMapping operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateApiMapping
     */
    @Override
    public UpdateApiMappingResult updateApiMapping(UpdateApiMappingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApiMapping(request);
    }

    @SdkInternalApi
    final UpdateApiMappingResult executeUpdateApiMapping(UpdateApiMappingRequest updateApiMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiMappingRequest> request = null;
        Response<UpdateApiMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApiMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApiMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApiMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApiMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateAuthorizer
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateDeployment
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateDomainName
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @return Result of the UpdateIntegration operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateIntegration
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     * @return Result of the UpdateIntegrationResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateIntegrationResponse
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest
     * @return Result of the UpdateModel operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateModel
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateRoute
     */
    @Override
    public UpdateRouteResult updateRoute(UpdateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoute(request);
    }

    @SdkInternalApi
    final UpdateRouteResult executeUpdateRoute(UpdateRouteRequest updateRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteRequest> request = null;
        Response<UpdateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest
     * @return Result of the UpdateRouteResponse operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateRouteResponse
     */
    @Override
    public UpdateRouteResponseResult updateRouteResponse(UpdateRouteResponseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRouteResponse(request);
    }

    @SdkInternalApi
    final UpdateRouteResponseResult executeUpdateRouteResponse(UpdateRouteResponseRequest updateRouteResponseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteResponseRequest> request = null;
        Response<UpdateRouteResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteResponseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRouteResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRouteResponse");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRouteResponseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRouteResponseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AmazonApiGatewayV2.UpdateStage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApiGatewayV2");
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
