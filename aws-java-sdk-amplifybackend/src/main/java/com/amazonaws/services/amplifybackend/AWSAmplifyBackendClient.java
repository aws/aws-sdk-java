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
package com.amazonaws.services.amplifybackend;

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

import com.amazonaws.services.amplifybackend.AWSAmplifyBackendClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.amplifybackend.model.*;
import com.amazonaws.services.amplifybackend.model.transform.*;

/**
 * Client for accessing AmplifyBackend. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS Amplify Admin API
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyBackendClient extends AmazonWebServiceClient implements AWSAmplifyBackend {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAmplifyBackend.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "amplifybackend";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifybackend.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GatewayTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifybackend.model.transform.GatewayTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifybackend.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.amplifybackend.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.amplifybackend.model.AWSAmplifyBackendException.class));

    public static AWSAmplifyBackendClientBuilder builder() {
        return AWSAmplifyBackendClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmplifyBackend using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyBackendClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmplifyBackend using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyBackendClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("amplifybackend.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/amplifybackend/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/amplifybackend/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This operation clones an existing backend.
     * </p>
     * 
     * @param cloneBackendRequest
     *        The request body for CloneBackend.
     * @return Result of the CloneBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CloneBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CloneBackend" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CloneBackendResult cloneBackend(CloneBackendRequest request) {
        request = beforeClientExecution(request);
        return executeCloneBackend(request);
    }

    @SdkInternalApi
    final CloneBackendResult executeCloneBackend(CloneBackendRequest cloneBackendRequest) {

        ExecutionContext executionContext = createExecutionContext(cloneBackendRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneBackendRequest> request = null;
        Response<CloneBackendResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneBackendRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cloneBackendRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CloneBackend");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CloneBackendResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CloneBackendResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app
     * creation.
     * </p>
     * 
     * @param createBackendRequest
     *        The request body for CreateBackend.
     * @return Result of the CreateBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackend" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBackendResult createBackend(CreateBackendRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackend(request);
    }

    @SdkInternalApi
    final CreateBackendResult executeCreateBackend(CreateBackendRequest createBackendRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackendRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendRequest> request = null;
        Response<CreateBackendResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackendRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackend");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackendResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackendResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new backend API resource.
     * </p>
     * 
     * @param createBackendAPIRequest
     *        The request body for CreateBackendAPI.
     * @return Result of the CreateBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBackendAPIResult createBackendAPI(CreateBackendAPIRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackendAPI(request);
    }

    @SdkInternalApi
    final CreateBackendAPIResult executeCreateBackendAPI(CreateBackendAPIRequest createBackendAPIRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackendAPIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendAPIRequest> request = null;
        Response<CreateBackendAPIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendAPIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackendAPIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackendAPI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackendAPIResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackendAPIResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new backend authentication resource.
     * </p>
     * 
     * @param createBackendAuthRequest
     *        The request body for CreateBackendAuth.
     * @return Result of the CreateBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBackendAuthResult createBackendAuth(CreateBackendAuthRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackendAuth(request);
    }

    @SdkInternalApi
    final CreateBackendAuthResult executeCreateBackendAuth(CreateBackendAuthRequest createBackendAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackendAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendAuthRequest> request = null;
        Response<CreateBackendAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackendAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackendAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackendAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackendAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a config object for a backend.
     * </p>
     * 
     * @param createBackendConfigRequest
     *        The request body for CreateBackendConfig.
     * @return Result of the CreateBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBackendConfigResult createBackendConfig(CreateBackendConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackendConfig(request);
    }

    @SdkInternalApi
    final CreateBackendConfigResult executeCreateBackendConfig(CreateBackendConfigRequest createBackendConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackendConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendConfigRequest> request = null;
        Response<CreateBackendConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackendConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackendConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackendConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackendConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
     * </p>
     * 
     * @param createTokenRequest
     * @return Result of the CreateToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTokenResult createToken(CreateTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateToken(request);
    }

    @SdkInternalApi
    final CreateTokenResult executeCreateToken(CreateTokenRequest createTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTokenRequest> request = null;
        Response<CreateTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an existing environment from your Amplify project.
     * </p>
     * 
     * @param deleteBackendRequest
     * @return Result of the DeleteBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackend" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBackendResult deleteBackend(DeleteBackendRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackend(request);
    }

    @SdkInternalApi
    final DeleteBackendResult executeDeleteBackend(DeleteBackendRequest deleteBackendRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackendRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackendRequest> request = null;
        Response<DeleteBackendResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackendRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackendRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackend");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackendResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackendResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing backend API resource.
     * </p>
     * 
     * @param deleteBackendAPIRequest
     *        The request body for DeleteBackendAPI.
     * @return Result of the DeleteBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackendAPIResult deleteBackendAPI(DeleteBackendAPIRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackendAPI(request);
    }

    @SdkInternalApi
    final DeleteBackendAPIResult executeDeleteBackendAPI(DeleteBackendAPIRequest deleteBackendAPIRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackendAPIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackendAPIRequest> request = null;
        Response<DeleteBackendAPIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackendAPIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackendAPIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackendAPI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackendAPIResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackendAPIResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing backend authentication resource.
     * </p>
     * 
     * @param deleteBackendAuthRequest
     *        The request body for DeleteBackendAuth.
     * @return Result of the DeleteBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBackendAuthResult deleteBackendAuth(DeleteBackendAuthRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackendAuth(request);
    }

    @SdkInternalApi
    final DeleteBackendAuthResult executeDeleteBackendAuth(DeleteBackendAuthRequest deleteBackendAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackendAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackendAuthRequest> request = null;
        Response<DeleteBackendAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackendAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackendAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackendAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackendAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackendAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return Result of the DeleteToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTokenResult deleteToken(DeleteTokenRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteToken(request);
    }

    @SdkInternalApi
    final DeleteTokenResult executeDeleteToken(DeleteTokenRequest deleteTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTokenRequest> request = null;
        Response<DeleteTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a model schema for an existing backend API resource.
     * </p>
     * 
     * @param generateBackendAPIModelsRequest
     *        The request body for GenerateBackendAPIModels.
     * @return Result of the GenerateBackendAPIModels operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GenerateBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GenerateBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GenerateBackendAPIModelsResult generateBackendAPIModels(GenerateBackendAPIModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateBackendAPIModels(request);
    }

    @SdkInternalApi
    final GenerateBackendAPIModelsResult executeGenerateBackendAPIModels(GenerateBackendAPIModelsRequest generateBackendAPIModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(generateBackendAPIModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateBackendAPIModelsRequest> request = null;
        Response<GenerateBackendAPIModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateBackendAPIModelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(generateBackendAPIModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateBackendAPIModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateBackendAPIModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GenerateBackendAPIModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides project-level details for your Amplify UI project.
     * </p>
     * 
     * @param getBackendRequest
     *        The request body for GetBackend.
     * @return Result of the GetBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackend" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBackendResult getBackend(GetBackendRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackend(request);
    }

    @SdkInternalApi
    final GetBackendResult executeGetBackend(GetBackendRequest getBackendRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendRequest> request = null;
        Response<GetBackendResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackend");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackendResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details for a backend API.
     * </p>
     * 
     * @param getBackendAPIRequest
     *        The request body for GetBackendAPI.
     * @return Result of the GetBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPI" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBackendAPIResult getBackendAPI(GetBackendAPIRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackendAPI(request);
    }

    @SdkInternalApi
    final GetBackendAPIResult executeGetBackendAPI(GetBackendAPIRequest getBackendAPIRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendAPIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendAPIRequest> request = null;
        Response<GetBackendAPIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendAPIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendAPIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackendAPI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendAPIResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackendAPIResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a model schema for existing backend API resource.
     * </p>
     * 
     * @param getBackendAPIModelsRequest
     *        The request body for GetBackendAPIModels.
     * @return Result of the GetBackendAPIModels operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBackendAPIModelsResult getBackendAPIModels(GetBackendAPIModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackendAPIModels(request);
    }

    @SdkInternalApi
    final GetBackendAPIModelsResult executeGetBackendAPIModels(GetBackendAPIModelsRequest getBackendAPIModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendAPIModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendAPIModelsRequest> request = null;
        Response<GetBackendAPIModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendAPIModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendAPIModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackendAPIModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendAPIModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackendAPIModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a backend auth details.
     * </p>
     * 
     * @param getBackendAuthRequest
     *        The request body for GetBackendAuth.
     * @return Result of the GetBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAuth" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBackendAuthResult getBackendAuth(GetBackendAuthRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackendAuth(request);
    }

    @SdkInternalApi
    final GetBackendAuthResult executeGetBackendAuth(GetBackendAuthRequest getBackendAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendAuthRequest> request = null;
        Response<GetBackendAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackendAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackendAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific job.
     * </p>
     * 
     * @param getBackendJobRequest
     * @return Result of the GetBackendJob operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBackendJobResult getBackendJob(GetBackendJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetBackendJob(request);
    }

    @SdkInternalApi
    final GetBackendJobResult executeGetBackendJob(GetBackendJobRequest getBackendJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getBackendJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendJobRequest> request = null;
        Response<GetBackendJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBackendJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBackendJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBackendJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBackendJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param getTokenRequest
     * @return Result of the GetToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTokenResult getToken(GetTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetToken(request);
    }

    @SdkInternalApi
    final GetTokenResult executeGetToken(GetTokenRequest getTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTokenRequest> request = null;
        Response<GetTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTokenResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports an existing backend authentication resource.
     * </p>
     * 
     * @param importBackendAuthRequest
     *        The request body for ImportBackendAuth.
     * @return Result of the ImportBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.ImportBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ImportBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportBackendAuthResult importBackendAuth(ImportBackendAuthRequest request) {
        request = beforeClientExecution(request);
        return executeImportBackendAuth(request);
    }

    @SdkInternalApi
    final ImportBackendAuthResult executeImportBackendAuth(ImportBackendAuthRequest importBackendAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(importBackendAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportBackendAuthRequest> request = null;
        Response<ImportBackendAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportBackendAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importBackendAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportBackendAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportBackendAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportBackendAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the jobs for the backend of an Amplify app.
     * </p>
     * 
     * @param listBackendJobsRequest
     *        The request body for ListBackendJobs.
     * @return Result of the ListBackendJobs operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.ListBackendJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListBackendJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBackendJobsResult listBackendJobs(ListBackendJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackendJobs(request);
    }

    @SdkInternalApi
    final ListBackendJobsResult executeListBackendJobs(ListBackendJobsRequest listBackendJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackendJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackendJobsRequest> request = null;
        Response<ListBackendJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackendJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackendJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBackendJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackendJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackendJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes all backend environments from your Amplify project.
     * </p>
     * 
     * @param removeAllBackendsRequest
     *        The request body for RemoveAllBackends.
     * @return Result of the RemoveAllBackends operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.RemoveAllBackends
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveAllBackendsResult removeAllBackends(RemoveAllBackendsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAllBackends(request);
    }

    @SdkInternalApi
    final RemoveAllBackendsResult executeRemoveAllBackends(RemoveAllBackendsRequest removeAllBackendsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAllBackendsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAllBackendsRequest> request = null;
        Response<RemoveAllBackendsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAllBackendsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeAllBackendsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAllBackends");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAllBackendsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveAllBackendsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param removeBackendConfigRequest
     * @return Result of the RemoveBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.RemoveBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveBackendConfigResult removeBackendConfig(RemoveBackendConfigRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveBackendConfig(request);
    }

    @SdkInternalApi
    final RemoveBackendConfigResult executeRemoveBackendConfig(RemoveBackendConfigRequest removeBackendConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(removeBackendConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveBackendConfigRequest> request = null;
        Response<RemoveBackendConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveBackendConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeBackendConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveBackendConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveBackendConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveBackendConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing backend API resource.
     * </p>
     * 
     * @param updateBackendAPIRequest
     *        The request body for UpdateBackendAPI.
     * @return Result of the UpdateBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBackendAPIResult updateBackendAPI(UpdateBackendAPIRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBackendAPI(request);
    }

    @SdkInternalApi
    final UpdateBackendAPIResult executeUpdateBackendAPI(UpdateBackendAPIRequest updateBackendAPIRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBackendAPIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackendAPIRequest> request = null;
        Response<UpdateBackendAPIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackendAPIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBackendAPIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBackendAPI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBackendAPIResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBackendAPIResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing backend authentication resource.
     * </p>
     * 
     * @param updateBackendAuthRequest
     *        The request body for UpdateBackendAuth.
     * @return Result of the UpdateBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBackendAuthResult updateBackendAuth(UpdateBackendAuthRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBackendAuth(request);
    }

    @SdkInternalApi
    final UpdateBackendAuthResult executeUpdateBackendAuth(UpdateBackendAuthRequest updateBackendAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBackendAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackendAuthRequest> request = null;
        Response<UpdateBackendAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackendAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBackendAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBackendAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBackendAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBackendAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param updateBackendConfigRequest
     *        The request body for UpdateBackendConfig.
     * @return Result of the UpdateBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBackendConfigResult updateBackendConfig(UpdateBackendConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBackendConfig(request);
    }

    @SdkInternalApi
    final UpdateBackendConfigResult executeUpdateBackendConfig(UpdateBackendConfigRequest updateBackendConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBackendConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackendConfigRequest> request = null;
        Response<UpdateBackendConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackendConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBackendConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBackendConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBackendConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBackendConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specific job.
     * </p>
     * 
     * @param updateBackendJobRequest
     *        The request body for GetBackendJob.
     * @return Result of the UpdateBackendJob operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBackendJobResult updateBackendJob(UpdateBackendJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBackendJob(request);
    }

    @SdkInternalApi
    final UpdateBackendJobResult executeUpdateBackendJob(UpdateBackendJobRequest updateBackendJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBackendJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackendJobRequest> request = null;
        Response<UpdateBackendJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackendJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBackendJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AmplifyBackend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBackendJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBackendJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBackendJobResultJsonUnmarshaller());
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
