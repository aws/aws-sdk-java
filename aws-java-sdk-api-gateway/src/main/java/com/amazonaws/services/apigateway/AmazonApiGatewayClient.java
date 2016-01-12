/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.apigateway;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.services.apigateway.model.transform.*;

/**
 * Client for accessing Amazon API Gateway. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure and scalable
 * mobile and web application backends. Amazon API Gateway allows developers to
 * securely connect mobile and web applications to APIs that run on AWS Lambda,
 * Amazon EC2, or other publicly addressable web services that are hosted
 * outside of AWS.
 * </p>
 */
public class AmazonApiGatewayClient extends AmazonWebServiceClient implements
        AmazonApiGateway {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonApiGateway.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "apigateway";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "apigateway";

    /**
     * List of exception unmarshallers for all Amazon API Gateway exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonApiGatewayClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon API Gateway (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonApiGatewayClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonApiGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon API Gateway (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonApiGatewayClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonApiGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon API Gateway (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonApiGatewayClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon API Gateway
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon API Gateway (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonApiGatewayClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.UnauthorizedException.class,
                        "UnauthorizedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.BadRequestException.class,
                        "BadRequestException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.ConflictException.class,
                        "ConflictException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.NotFoundException.class,
                        "NotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.TooManyRequestsException.class,
                        "TooManyRequestsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.apigateway.model.ServiceUnavailableException.class,
                        "ServiceUnavailableException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://apigateway.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/apigateway/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/apigateway/request.handler2s"));
    }

    /**
     * @param createApiKeyRequest
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @sample AmazonApiGateway.CreateApiKey
     */
    @Override
    public CreateApiKeyResult createApiKey(
            CreateApiKeyRequest createApiKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(createApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiKeyRequest> request = null;
        Response<CreateApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(createApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateApiKeyResult> responseHandler = new JsonResponseHandler<CreateApiKeyResult>(
                    new CreateApiKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to create a new <a>BasePathMapping</a>
     *        resource.
     * @return Result of the CreateBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateBasePathMapping
     */
    @Override
    public CreateBasePathMappingResult createBasePathMapping(
            CreateBasePathMappingRequest createBasePathMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(createBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBasePathMappingRequest> request = null;
        Response<CreateBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBasePathMappingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateBasePathMappingResult> responseHandler = new JsonResponseHandler<CreateBasePathMappingResult>(
                    new CreateBasePathMappingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests Amazon API Gateway to create a <a>Deployment</a>
     *        resource.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.CreateDeployment
     */
    @Override
    public CreateDeploymentResult createDeployment(
            CreateDeploymentRequest createDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(
                    new CreateDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateDomainName
     */
    @Override
    public CreateDomainNameResult createDomainName(
            CreateDomainNameRequest createDomainNameRequest) {
        ExecutionContext executionContext = createExecutionContext(createDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainNameRequest> request = null;
        Response<CreateDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainNameRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDomainNameResult> responseHandler = new JsonResponseHandler<CreateDomainNameResult>(
                    new CreateDomainNameResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a>
     *        resource.
     * @return Result of the CreateModel operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateModel
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest createModelRequest) {
        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestMarshaller().marshall(super
                        .beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateModelResult> responseHandler = new JsonResponseHandler<CreateModelResult>(
                    new CreateModelResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to create a <a>Resource</a> resource.
     * @return Result of the CreateResource operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateResource
     */
    @Override
    public CreateResourceResult createResource(
            CreateResourceRequest createResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestMarshaller().marshall(super
                        .beforeMarshalling(createResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateResourceResult> responseHandler = new JsonResponseHandler<CreateResourceResult>(
                    new CreateResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to add a new <a>RestApi</a> resource to your collection.
     * @return Result of the CreateRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateRestApi
     */
    @Override
    public CreateRestApiResult createRestApi(
            CreateRestApiRequest createRestApiRequest) {
        ExecutionContext executionContext = createExecutionContext(createRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRestApiRequest> request = null;
        Response<CreateRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRestApiRequestMarshaller().marshall(super
                        .beforeMarshalling(createRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateRestApiResult> responseHandler = new JsonResponseHandler<CreateRestApiResult>(
                    new CreateRestApiResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>Stage</a> resource.
     * </p>
     * 
     * @param createStageRequest
     *        Requests Amazon API Gateway to create a <a>Stage</a> resource.
     * @return Result of the CreateStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateStage
     */
    @Override
    public CreateStageResult createStage(CreateStageRequest createStageRequest) {
        ExecutionContext executionContext = createExecutionContext(createStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStageRequest> request = null;
        Response<CreateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStageRequestMarshaller().marshall(super
                        .beforeMarshalling(createStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateStageResult> responseHandler = new JsonResponseHandler<CreateStageResult>(
                    new CreateStageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteApiKey
     */
    @Override
    public void deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiKeyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteBasePathMapping
     */
    @Override
    public void deleteBasePathMapping(
            DeleteBasePathMappingRequest deleteBasePathMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBasePathMappingRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBasePathMappingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param deleteClientCertificateRequest
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @sample AmazonApiGateway.DeleteClientCertificate
     */
    @Override
    public void deleteClientCertificate(
            DeleteClientCertificateRequest deleteClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClientCertificateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClientCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests Amazon API Gateway to delete a <a>Deployment</a>
     *        resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteDeployment
     */
    @Override
    public void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteDomainName
     */
    @Override
    public void deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainNameRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainNameRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteIntegration
     */
    @Override
    public void deleteIntegration(
            DeleteIntegrationRequest deleteIntegrationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteIntegrationResponse
     */
    @Override
    public void deleteIntegrationResponse(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationResponseRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteMethod
     */
    @Override
    public void deleteMethod(DeleteMethodRequest deleteMethodRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteMethodResponse
     */
    @Override
    public void deleteMethodResponse(
            DeleteMethodResponseRequest deleteMethodResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodResponseRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Request to delete an existing model in an existing <a>RestApi</a>
     *        resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @sample AmazonApiGateway.DeleteModel
     */
    @Override
    public void deleteModel(DeleteModelRequest deleteModelRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteResource
     */
    @Override
    public void deleteResource(DeleteResourceRequest deleteResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteRestApi
     */
    @Override
    public void deleteRestApi(DeleteRestApiRequest deleteRestApiRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRestApiRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRestApiRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Requests Amazon API Gateway to delete a <a>Stage</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteStage
     */
    @Override
    public void deleteStage(DeleteStageRequest deleteStageRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStageRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStageRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

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
     *        Requests Amazon API Gateway to flush a stage's cache.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.FlushStageCache
     */
    @Override
    public void flushStageCache(FlushStageCacheRequest flushStageCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(flushStageCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FlushStageCacheRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FlushStageCacheRequestMarshaller().marshall(super
                        .beforeMarshalling(flushStageCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param generateClientCertificateRequest
     * @return Result of the GenerateClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @sample AmazonApiGateway.GenerateClientCertificate
     */
    @Override
    public GenerateClientCertificateResult generateClientCertificate(
            GenerateClientCertificateRequest generateClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(generateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateClientCertificateRequest> request = null;
        Response<GenerateClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateClientCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(generateClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GenerateClientCertificateResult> responseHandler = new JsonResponseHandler<GenerateClientCertificateResult>(
                    new GenerateClientCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to get information about the current
     *        <a>Account</a> resource.
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetAccount
     */
    @Override
    public GetAccountResult getAccount(GetAccountRequest getAccountRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetAccountResult> responseHandler = new JsonResponseHandler<GetAccountResult>(
                    new GetAccountResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        A request to get information about the current <a>ApiKey</a>
     *        resource.
     * @return Result of the GetApiKey operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetApiKey
     */
    @Override
    public GetApiKeyResult getApiKey(GetApiKeyRequest getApiKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(getApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeyRequest> request = null;
        Response<GetApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(getApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetApiKeyResult> responseHandler = new JsonResponseHandler<GetApiKeyResult>(
                    new GetApiKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        A request to get information about the current <a>ApiKeys</a>
     *        resource.
     * @return Result of the GetApiKeys operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetApiKeys
     */
    @Override
    public GetApiKeysResult getApiKeys(GetApiKeysRequest getApiKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(getApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeysRequest> request = null;
        Response<GetApiKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeysRequestMarshaller().marshall(super
                        .beforeMarshalling(getApiKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetApiKeysResult> responseHandler = new JsonResponseHandler<GetApiKeysResult>(
                    new GetApiKeysResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the GetBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetBasePathMapping
     */
    @Override
    public GetBasePathMappingResult getBasePathMapping(
            GetBasePathMappingRequest getBasePathMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(getBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingRequest> request = null;
        Response<GetBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetBasePathMappingResult> responseHandler = new JsonResponseHandler<GetBasePathMappingResult>(
                    new GetBasePathMappingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        A request to get information about a collection of
     *        <a>BasePathMapping</a> resources.
     * @return Result of the GetBasePathMappings operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetBasePathMappings
     */
    @Override
    public GetBasePathMappingsResult getBasePathMappings(
            GetBasePathMappingsRequest getBasePathMappingsRequest) {
        ExecutionContext executionContext = createExecutionContext(getBasePathMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingsRequest> request = null;
        Response<GetBasePathMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getBasePathMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetBasePathMappingsResult> responseHandler = new JsonResponseHandler<GetBasePathMappingsResult>(
                    new GetBasePathMappingsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getClientCertificateRequest
     * @return Result of the GetClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetClientCertificate
     */
    @Override
    public GetClientCertificateResult getClientCertificate(
            GetClientCertificateRequest getClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(getClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificateRequest> request = null;
        Response<GetClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetClientCertificateResult> responseHandler = new JsonResponseHandler<GetClientCertificateResult>(
                    new GetClientCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getClientCertificatesRequest
     * @return Result of the GetClientCertificates operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetClientCertificates
     */
    @Override
    public GetClientCertificatesResult getClientCertificates(
            GetClientCertificatesRequest getClientCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(getClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificatesRequest> request = null;
        Response<GetClientCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificatesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getClientCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetClientCertificatesResult> responseHandler = new JsonResponseHandler<GetClientCertificatesResult>(
                    new GetClientCertificatesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployment</a> resource.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.GetDeployment
     */
    @Override
    public GetDeploymentResult getDeployment(
            GetDeploymentRequest getDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller().marshall(super
                        .beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentResult> responseHandler = new JsonResponseHandler<GetDeploymentResult>(
                    new GetDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployments</a> collection.
     * @return Result of the GetDeployments operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.GetDeployments
     */
    @Override
    public GetDeploymentsResult getDeployments(
            GetDeploymentsRequest getDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentsRequest> request = null;
        Response<GetDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentsRequestMarshaller().marshall(super
                        .beforeMarshalling(getDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDeploymentsResult> responseHandler = new JsonResponseHandler<GetDeploymentsResult>(
                    new GetDeploymentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return Result of the GetDomainName operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetDomainName
     */
    @Override
    public GetDomainNameResult getDomainName(
            GetDomainNameRequest getDomainNameRequest) {
        ExecutionContext executionContext = createExecutionContext(getDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNameRequest> request = null;
        Response<GetDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNameRequestMarshaller().marshall(super
                        .beforeMarshalling(getDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDomainNameResult> responseHandler = new JsonResponseHandler<GetDomainNameResult>(
                    new GetDomainNameResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetDomainNames
     */
    @Override
    public GetDomainNamesResult getDomainNames(
            GetDomainNamesRequest getDomainNamesRequest) {
        ExecutionContext executionContext = createExecutionContext(getDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNamesRequest> request = null;
        Response<GetDomainNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNamesRequestMarshaller().marshall(super
                        .beforeMarshalling(getDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDomainNamesResult> responseHandler = new JsonResponseHandler<GetDomainNamesResult>(
                    new GetDomainNamesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents a get integration.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a get integration request.
     * @return Result of the GetIntegration operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetIntegration
     */
    @Override
    public GetIntegrationResult getIntegration(
            GetIntegrationRequest getIntegrationRequest) {
        ExecutionContext executionContext = createExecutionContext(getIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationRequest> request = null;
        Response<GetIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationRequestMarshaller().marshall(super
                        .beforeMarshalling(getIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetIntegrationResult> responseHandler = new JsonResponseHandler<GetIntegrationResult>(
                    new GetIntegrationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the GetIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetIntegrationResponse
     */
    @Override
    public GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest getIntegrationResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(getIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationResponseRequest> request = null;
        Response<GetIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetIntegrationResponseResult> responseHandler = new JsonResponseHandler<GetIntegrationResponseResult>(
                    new GetIntegrationResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetMethod
     */
    @Override
    public GetMethodResult getMethod(GetMethodRequest getMethodRequest) {
        ExecutionContext executionContext = createExecutionContext(getMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodRequest> request = null;
        Response<GetMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodRequestMarshaller().marshall(super
                        .beforeMarshalling(getMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetMethodResult> responseHandler = new JsonResponseHandler<GetMethodResult>(
                    new GetMethodResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the GetMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetMethodResponse
     */
    @Override
    public GetMethodResponseResult getMethodResponse(
            GetMethodResponseRequest getMethodResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(getMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodResponseRequest> request = null;
        Response<GetMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetMethodResponseResult> responseHandler = new JsonResponseHandler<GetMethodResponseResult>(
                    new GetMethodResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to list information about a model in an existing
     *        <a>RestApi</a> resource.
     * @return Result of the GetModel operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModel
     */
    @Override
    public GetModelResult getModel(GetModelRequest getModelRequest) {
        ExecutionContext executionContext = createExecutionContext(getModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelRequest> request = null;
        Response<GetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelRequestMarshaller().marshall(super
                        .beforeMarshalling(getModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetModelResult> responseHandler = new JsonResponseHandler<GetModelResult>(
                    new GetModelResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform
     *        the payload.
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModelTemplate
     */
    @Override
    public GetModelTemplateResult getModelTemplate(
            GetModelTemplateRequest getModelTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(getModelTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelTemplateRequest> request = null;
        Response<GetModelTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelTemplateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getModelTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetModelTemplateResult> responseHandler = new JsonResponseHandler<GetModelTemplateResult>(
                    new GetModelTemplateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to list existing <a>Models</a> defined for a
     *        <a>RestApi</a> resource.
     * @return Result of the GetModels operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModels
     */
    @Override
    public GetModelsResult getModels(GetModelsRequest getModelsRequest) {
        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestMarshaller().marshall(super
                        .beforeMarshalling(getModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetModelsResult> responseHandler = new JsonResponseHandler<GetModelsResult>(
                    new GetModelsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetResource
     */
    @Override
    public GetResourceResult getResource(GetResourceRequest getResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(getResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceRequest> request = null;
        Response<GetResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceRequestMarshaller().marshall(super
                        .beforeMarshalling(getResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetResourceResult> responseHandler = new JsonResponseHandler<GetResourceResult>(
                    new GetResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetResources
     */
    @Override
    public GetResourcesResult getResources(
            GetResourcesRequest getResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestMarshaller().marshall(super
                        .beforeMarshalling(getResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetResourcesResult> responseHandler = new JsonResponseHandler<GetResourcesResult>(
                    new GetResourcesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to list an existing <a>RestApi</a> defined for your
     *        collection.
     * @return Result of the GetRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetRestApi
     */
    @Override
    public GetRestApiResult getRestApi(GetRestApiRequest getRestApiRequest) {
        ExecutionContext executionContext = createExecutionContext(getRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApiRequest> request = null;
        Response<GetRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApiRequestMarshaller().marshall(super
                        .beforeMarshalling(getRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetRestApiResult> responseHandler = new JsonResponseHandler<GetRestApiResult>(
                    new GetRestApiResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to list existing <a>RestApis</a> defined for your
     *        collection.
     * @return Result of the GetRestApis operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetRestApis
     */
    @Override
    public GetRestApisResult getRestApis(GetRestApisRequest getRestApisRequest) {
        ExecutionContext executionContext = createExecutionContext(getRestApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApisRequest> request = null;
        Response<GetRestApisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApisRequestMarshaller().marshall(super
                        .beforeMarshalling(getRestApisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetRestApisResult> responseHandler = new JsonResponseHandler<GetRestApisResult>(
                    new GetRestApisResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getSdkRequest
     * @return Result of the GetSdk operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetSdk
     */
    @Override
    public GetSdkResult getSdk(GetSdkRequest getSdkRequest) {
        ExecutionContext executionContext = createExecutionContext(getSdkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkRequest> request = null;
        Response<GetSdkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkRequestMarshaller().marshall(super
                        .beforeMarshalling(getSdkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetSdkResult> responseHandler = new JsonResponseHandler<GetSdkResult>(
                    new GetSdkResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(false);
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
     *        Requests Amazon API Gateway to get information about a
     *        <a>Stage</a> resource.
     * @return Result of the GetStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetStage
     */
    @Override
    public GetStageResult getStage(GetStageRequest getStageRequest) {
        ExecutionContext executionContext = createExecutionContext(getStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageRequest> request = null;
        Response<GetStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageRequestMarshaller().marshall(super
                        .beforeMarshalling(getStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetStageResult> responseHandler = new JsonResponseHandler<GetStageResult>(
                    new GetStageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to get information about one or more
     *        <a>Stage</a> resources.
     * @return Result of the GetStages operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetStages
     */
    @Override
    public GetStagesResult getStages(GetStagesRequest getStagesRequest) {
        ExecutionContext executionContext = createExecutionContext(getStagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStagesRequest> request = null;
        Response<GetStagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStagesRequestMarshaller().marshall(super
                        .beforeMarshalling(getStagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetStagesResult> responseHandler = new JsonResponseHandler<GetStagesResult>(
                    new GetStagesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @param putIntegrationRequest
     *        Represents a put integration request.
     * @return Result of the PutIntegration operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutIntegration
     */
    @Override
    public PutIntegrationResult putIntegration(
            PutIntegrationRequest putIntegrationRequest) {
        ExecutionContext executionContext = createExecutionContext(putIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationRequest> request = null;
        Response<PutIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationRequestMarshaller().marshall(super
                        .beforeMarshalling(putIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutIntegrationResult> responseHandler = new JsonResponseHandler<PutIntegrationResult>(
                    new PutIntegrationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the PutIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutIntegrationResponse
     */
    @Override
    public PutIntegrationResponseResult putIntegrationResponse(
            PutIntegrationResponseRequest putIntegrationResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(putIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationResponseRequest> request = null;
        Response<PutIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutIntegrationResponseResult> responseHandler = new JsonResponseHandler<PutIntegrationResponseResult>(
                    new PutIntegrationResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutMethod
     */
    @Override
    public PutMethodResult putMethod(PutMethodRequest putMethodRequest) {
        ExecutionContext executionContext = createExecutionContext(putMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodRequest> request = null;
        Response<PutMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodRequestMarshaller().marshall(super
                        .beforeMarshalling(putMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutMethodResult> responseHandler = new JsonResponseHandler<PutMethodResult>(
                    new PutMethodResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to add a <a>MethodResponse</a> to an existing
     *        <a>Method</a> resource.
     * @return Result of the PutMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutMethodResponse
     */
    @Override
    public PutMethodResponseResult putMethodResponse(
            PutMethodResponseRequest putMethodResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(putMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodResponseRequest> request = null;
        Response<PutMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutMethodResponseResult> responseHandler = new JsonResponseHandler<PutMethodResponseResult>(
                    new PutMethodResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param testInvokeMethodRequest
     * @return Result of the TestInvokeMethod operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.TestInvokeMethod
     */
    @Override
    public TestInvokeMethodResult testInvokeMethod(
            TestInvokeMethodRequest testInvokeMethodRequest) {
        ExecutionContext executionContext = createExecutionContext(testInvokeMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeMethodRequest> request = null;
        Response<TestInvokeMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeMethodRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(testInvokeMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<TestInvokeMethodResult> responseHandler = new JsonResponseHandler<TestInvokeMethodResult>(
                    new TestInvokeMethodResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to change information about the
     *        current <a>Account</a> resource.
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateAccount
     */
    @Override
    public UpdateAccountResult updateAccount(
            UpdateAccountRequest updateAccountRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountRequest> request = null;
        Response<UpdateAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountRequestMarshaller().marshall(super
                        .beforeMarshalling(updateAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateAccountResult> responseHandler = new JsonResponseHandler<UpdateAccountResult>(
                    new UpdateAccountResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateApiKey
     */
    @Override
    public UpdateApiKeyResult updateApiKey(
            UpdateApiKeyRequest updateApiKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiKeyRequest> request = null;
        Response<UpdateApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(updateApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateApiKeyResult> responseHandler = new JsonResponseHandler<UpdateApiKeyResult>(
                    new UpdateApiKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        A request to change information about the <a>BasePathMapping</a>
     *        resource.
     * @return Result of the UpdateBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateBasePathMapping
     */
    @Override
    public UpdateBasePathMappingResult updateBasePathMapping(
            UpdateBasePathMappingRequest updateBasePathMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBasePathMappingRequest> request = null;
        Response<UpdateBasePathMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBasePathMappingRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateBasePathMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateBasePathMappingResult> responseHandler = new JsonResponseHandler<UpdateBasePathMappingResult>(
                    new UpdateBasePathMappingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param updateClientCertificateRequest
     * @return Result of the UpdateClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @sample AmazonApiGateway.UpdateClientCertificate
     */
    @Override
    public UpdateClientCertificateResult updateClientCertificate(
            UpdateClientCertificateRequest updateClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClientCertificateRequest> request = null;
        Response<UpdateClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClientCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateClientCertificateResult> responseHandler = new JsonResponseHandler<UpdateClientCertificateResult>(
                    new UpdateClientCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to change information about a
     *        <a>Deployment</a> resource.
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.UpdateDeployment
     */
    @Override
    public UpdateDeploymentResult updateDeployment(
            UpdateDeploymentRequest updateDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentRequest> request = null;
        Response<UpdateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDeploymentResult> responseHandler = new JsonResponseHandler<UpdateDeploymentResult>(
                    new UpdateDeploymentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        A request to change information about the <a>DomainName</a>
     *        resource.
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateDomainName
     */
    @Override
    public UpdateDomainNameResult updateDomainName(
            UpdateDomainNameRequest updateDomainNameRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameRequest> request = null;
        Response<UpdateDomainNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDomainNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDomainNameResult> responseHandler = new JsonResponseHandler<UpdateDomainNameResult>(
                    new UpdateDomainNameResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the UpdateIntegration operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateIntegration
     */
    @Override
    public UpdateIntegrationResult updateIntegration(
            UpdateIntegrationRequest updateIntegrationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationRequest> request = null;
        Response<UpdateIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateIntegrationResult> responseHandler = new JsonResponseHandler<UpdateIntegrationResult>(
                    new UpdateIntegrationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the UpdateIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateIntegrationResponse
     */
    @Override
    public UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(updateIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationResponseRequest> request = null;
        Response<UpdateIntegrationResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateIntegrationResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateIntegrationResponseResult> responseHandler = new JsonResponseHandler<UpdateIntegrationResponseResult>(
                    new UpdateIntegrationResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateMethod
     */
    @Override
    public UpdateMethodResult updateMethod(
            UpdateMethodRequest updateMethodRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodRequest> request = null;
        Response<UpdateMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodRequestMarshaller().marshall(super
                        .beforeMarshalling(updateMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateMethodResult> responseHandler = new JsonResponseHandler<UpdateMethodResult>(
                    new UpdateMethodResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the UpdateMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateMethodResponse
     */
    @Override
    public UpdateMethodResponseResult updateMethodResponse(
            UpdateMethodResponseRequest updateMethodResponseRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodResponseRequest> request = null;
        Response<UpdateMethodResponseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodResponseRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateMethodResponseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateMethodResponseResult> responseHandler = new JsonResponseHandler<UpdateMethodResponseResult>(
                    new UpdateMethodResponseResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to update an existing model in an existing <a>RestApi</a>
     *        resource.
     * @return Result of the UpdateModel operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateModel
     */
    @Override
    public UpdateModelResult updateModel(UpdateModelRequest updateModelRequest) {
        ExecutionContext executionContext = createExecutionContext(updateModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelRequest> request = null;
        Response<UpdateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelRequestMarshaller().marshall(super
                        .beforeMarshalling(updateModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateModelResult> responseHandler = new JsonResponseHandler<UpdateModelResult>(
                    new UpdateModelResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateResource
     */
    @Override
    public UpdateResourceResult updateResource(
            UpdateResourceRequest updateResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestMarshaller().marshall(super
                        .beforeMarshalling(updateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateResourceResult> responseHandler = new JsonResponseHandler<UpdateResourceResult>(
                    new UpdateResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Request to update an existing <a>RestApi</a> resource in your
     *        collection.
     * @return Result of the UpdateRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateRestApi
     */
    @Override
    public UpdateRestApiResult updateRestApi(
            UpdateRestApiRequest updateRestApiRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRestApiRequest> request = null;
        Response<UpdateRestApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRestApiRequestMarshaller().marshall(super
                        .beforeMarshalling(updateRestApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateRestApiResult> responseHandler = new JsonResponseHandler<UpdateRestApiResult>(
                    new UpdateRestApiResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *        Requests Amazon API Gateway to change information about a
     *        <a>Stage</a> resource.
     * @return Result of the UpdateStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateStage
     */
    @Override
    public UpdateStageResult updateStage(UpdateStageRequest updateStageRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStageRequest> request = null;
        Response<UpdateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStageRequestMarshaller().marshall(super
                        .beforeMarshalling(updateStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateStageResult> responseHandler = new JsonResponseHandler<UpdateStageResult>(
                    new UpdateStageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
