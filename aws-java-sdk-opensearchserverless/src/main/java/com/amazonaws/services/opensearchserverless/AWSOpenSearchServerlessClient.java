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
package com.amazonaws.services.opensearchserverless;

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

import com.amazonaws.services.opensearchserverless.AWSOpenSearchServerlessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.opensearchserverless.model.*;
import com.amazonaws.services.opensearchserverless.model.transform.*;

/**
 * Client for accessing OpenSearch Service Serverless. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Serverless API to create, configure, and manage OpenSearch Serverless collections and
 * security policies.
 * </p>
 * <p>
 * OpenSearch Serverless is an on-demand, pre-provisioned serverless configuration for Amazon OpenSearch Service.
 * OpenSearch Serverless removes the operational complexities of provisioning, configuring, and tuning your OpenSearch
 * clusters. It enables you to easily search and analyze petabytes of data without having to worry about the underlying
 * infrastructure and data management.
 * </p>
 * <p>
 * To learn more about OpenSearch Serverless, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html">What is Amazon
 * OpenSearch Serverless?</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpenSearchServerlessClient extends AmazonWebServiceClient implements AWSOpenSearchServerless {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpenSearchServerless.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aoss";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearchserverless.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearchserverless.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearchserverless.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearchserverless.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.opensearchserverless.model.AWSOpenSearchServerlessException.class));

    public static AWSOpenSearchServerlessClientBuilder builder() {
        return AWSOpenSearchServerlessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on OpenSearch Service Serverless using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpenSearchServerlessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on OpenSearch Service Serverless using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpenSearchServerlessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("aoss.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/opensearchserverless/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/opensearchserverless/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param batchGetCollectionRequest
     * @return Result of the BatchGetCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.BatchGetCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetCollectionResult batchGetCollection(BatchGetCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetCollection(request);
    }

    @SdkInternalApi
    final BatchGetCollectionResult executeBatchGetCollection(BatchGetCollectionRequest batchGetCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCollectionRequest> request = null;
        Response<BatchGetCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see
     * <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param batchGetVpcEndpointRequest
     * @return Result of the BatchGetVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.BatchGetVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetVpcEndpointResult batchGetVpcEndpoint(BatchGetVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetVpcEndpoint(request);
    }

    @SdkInternalApi
    final BatchGetVpcEndpointResult executeBatchGetVpcEndpoint(BatchGetVpcEndpointRequest batchGetVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetVpcEndpointRequest> request = null;
        Response<BatchGetVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data access policy for OpenSearch Serverless. Access policies limit access to collections and the
     * resources within them, and allow a user to access that data irrespective of the access mechanism or network
     * source. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return Result of the CreateAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessPolicyResult createAccessPolicy(CreateAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPolicy(request);
    }

    @SdkInternalApi
    final CreateAccessPolicyResult executeCreateAccessPolicy(CreateAccessPolicyRequest createAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPolicyRequest> request = null;
        Response<CreateAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param createCollectionRequest
     * @return Result of the CreateCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCollectionResult createCollection(CreateCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCollection(request);
    }

    @SdkInternalApi
    final CreateCollectionResult executeCreateCollection(CreateCollectionRequest createCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCollectionRequest> request = null;
        Response<CreateCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityConfigRequest
     * @return Result of the CreateSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSecurityConfigResult createSecurityConfig(CreateSecurityConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecurityConfig(request);
    }

    @SdkInternalApi
    final CreateSecurityConfigResult executeCreateSecurityConfig(CreateSecurityConfigRequest createSecurityConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecurityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityConfigRequest> request = null;
        Response<CreateSecurityConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSecurityConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecurityConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecurityConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSecurityConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a security policy to be used by one or more OpenSearch Serverless collections. Security policies provide
     * access to a collection and its OpenSearch Dashboards endpoint from public networks or specific VPC endpoints.
     * They also allow you to secure a collection with a KMS encryption key. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityPolicyRequest
     * @return Result of the CreateSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSecurityPolicyResult createSecurityPolicy(CreateSecurityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecurityPolicy(request);
    }

    @SdkInternalApi
    final CreateSecurityPolicyResult executeCreateSecurityPolicy(CreateSecurityPolicyRequest createSecurityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecurityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityPolicyRequest> request = null;
        Response<CreateSecurityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSecurityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecurityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecurityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSecurityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcEndpoint(request);
    }

    @SdkInternalApi
    final CreateVpcEndpointResult executeCreateVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcEndpointRequest> request = null;
        Response<CreateVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return Result of the DeleteAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPolicyResult deleteAccessPolicy(DeleteAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccessPolicyResult executeDeleteAccessPolicy(DeleteAccessPolicyRequest deleteAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPolicyRequest> request = null;
        Response<DeleteAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return Result of the DeleteCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCollectionResult deleteCollection(DeleteCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCollection(request);
    }

    @SdkInternalApi
    final DeleteCollectionResult executeDeleteCollection(DeleteCollectionRequest deleteCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCollectionRequest> request = null;
        Response<DeleteCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteSecurityConfigRequest
     * @return Result of the DeleteSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSecurityConfigResult deleteSecurityConfig(DeleteSecurityConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecurityConfig(request);
    }

    @SdkInternalApi
    final DeleteSecurityConfigResult executeDeleteSecurityConfig(DeleteSecurityConfigRequest deleteSecurityConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecurityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityConfigRequest> request = null;
        Response<DeleteSecurityConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSecurityConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecurityConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecurityConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSecurityConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenSearch Serverless security policy.
     * </p>
     * 
     * @param deleteSecurityPolicyRequest
     * @return Result of the DeleteSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSecurityPolicyResult deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecurityPolicy(request);
    }

    @SdkInternalApi
    final DeleteSecurityPolicyResult executeDeleteSecurityPolicy(DeleteSecurityPolicyRequest deleteSecurityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecurityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityPolicyRequest> request = null;
        Response<DeleteSecurityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSecurityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecurityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecurityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSecurityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return Result of the DeleteVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVpcEndpointResult deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVpcEndpoint(request);
    }

    @SdkInternalApi
    final DeleteVpcEndpointResult executeDeleteVpcEndpoint(DeleteVpcEndpointRequest deleteVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcEndpointRequest> request = null;
        Response<DeleteVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getAccessPolicyRequest
     * @return Result of the GetAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPolicyResult getAccessPolicy(GetAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPolicy(request);
    }

    @SdkInternalApi
    final GetAccessPolicyResult executeGetAccessPolicy(GetAccessPolicyRequest getAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPolicyRequest> request = null;
        Response<GetAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns account-level settings related to OpenSearch Serverless.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and
     * security policies.
     * </p>
     * 
     * @param getPoliciesStatsRequest
     * @return Result of the GetPoliciesStats operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @sample AWSOpenSearchServerless.GetPoliciesStats
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetPoliciesStats"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPoliciesStatsResult getPoliciesStats(GetPoliciesStatsRequest request) {
        request = beforeClientExecution(request);
        return executeGetPoliciesStats(request);
    }

    @SdkInternalApi
    final GetPoliciesStatsResult executeGetPoliciesStats(GetPoliciesStatsRequest getPoliciesStatsRequest) {

        ExecutionContext executionContext = createExecutionContext(getPoliciesStatsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPoliciesStatsRequest> request = null;
        Response<GetPoliciesStatsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPoliciesStatsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPoliciesStatsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPoliciesStats");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPoliciesStatsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPoliciesStatsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an OpenSearch Serverless security configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityConfigRequest
     * @return Result of the GetSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSecurityConfigResult getSecurityConfig(GetSecurityConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetSecurityConfig(request);
    }

    @SdkInternalApi
    final GetSecurityConfigResult executeGetSecurityConfig(GetSecurityConfigRequest getSecurityConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getSecurityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecurityConfigRequest> request = null;
        Response<GetSecurityConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecurityConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSecurityConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSecurityConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSecurityConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSecurityConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a configured OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityPolicyRequest
     * @return Result of the GetSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSecurityPolicyResult getSecurityPolicy(GetSecurityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetSecurityPolicy(request);
    }

    @SdkInternalApi
    final GetSecurityPolicyResult executeGetSecurityPolicy(GetSecurityPolicyRequest getSecurityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getSecurityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecurityPolicyRequest> request = null;
        Response<GetSecurityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecurityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSecurityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSecurityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSecurityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSecurityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a list of OpenSearch Serverless access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return Result of the ListAccessPolicies operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPolicies(request);
    }

    @SdkInternalApi
    final ListAccessPoliciesResult executeListAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPoliciesRequest> request = null;
        Response<ListAccessPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccessPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all OpenSearch Serverless collections. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * <note>
     * <p>
     * Make sure to include an empty request body {} if you don't include any collection filters in the request.
     * </p>
     * </note>
     * 
     * @param listCollectionsRequest
     * @return Result of the ListCollections operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListCollections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCollectionsResult listCollections(ListCollectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCollections(request);
    }

    @SdkInternalApi
    final ListCollectionsResult executeListCollections(ListCollectionsRequest listCollectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollectionsRequest> request = null;
        Response<ListCollectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCollectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCollections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCollectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCollectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param listSecurityConfigsRequest
     * @return Result of the ListSecurityConfigs operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListSecurityConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityConfigsResult listSecurityConfigs(ListSecurityConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityConfigs(request);
    }

    @SdkInternalApi
    final ListSecurityConfigsResult executeListSecurityConfigs(ListSecurityConfigsRequest listSecurityConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityConfigsRequest> request = null;
        Response<ListSecurityConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityConfigsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security policies.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return Result of the ListSecurityPolicies operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityPoliciesResult listSecurityPolicies(ListSecurityPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityPolicies(request);
    }

    @SdkInternalApi
    final ListSecurityPoliciesResult executeListSecurityPolicies(ListSecurityPoliciesRequest listSecurityPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityPoliciesRequest> request = null;
        Response<ListSecurityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags for an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
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
     * <p>
     * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return Result of the ListVpcEndpoints operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVpcEndpointsResult listVpcEndpoints(ListVpcEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListVpcEndpoints(request);
    }

    @SdkInternalApi
    final ListVpcEndpointsResult executeListVpcEndpoints(ListVpcEndpointsRequest listVpcEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVpcEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVpcEndpointsRequest> request = null;
        Response<ListVpcEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVpcEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVpcEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVpcEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVpcEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVpcEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates tags with an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
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
     * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
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
     * Updates an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return Result of the UpdateAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccessPolicyResult updateAccessPolicy(UpdateAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessPolicy(request);
    }

    @SdkInternalApi
    final UpdateAccessPolicyResult executeUpdateAccessPolicy(UpdateAccessPolicyRequest updateAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessPolicyRequest> request = null;
        Response<UpdateAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling"
     * >Autoscaling</a>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSettings(request);
    }

    @SdkInternalApi
    final UpdateAccountSettingsResult executeUpdateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an OpenSearch Serverless collection.
     * </p>
     * 
     * @param updateCollectionRequest
     * @return Result of the UpdateCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCollectionResult updateCollection(UpdateCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCollection(request);
    }

    @SdkInternalApi
    final UpdateCollectionResult executeUpdateCollection(UpdateCollectionRequest updateCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCollectionRequest> request = null;
        Response<UpdateCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityConfigRequest
     * @return Result of the UpdateSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSecurityConfigResult updateSecurityConfig(UpdateSecurityConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityConfig(request);
    }

    @SdkInternalApi
    final UpdateSecurityConfigResult executeUpdateSecurityConfig(UpdateSecurityConfigRequest updateSecurityConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityConfigRequest> request = null;
        Response<UpdateSecurityConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecurityConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSecurityConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityPolicyRequest
     * @return Result of the UpdateSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSecurityPolicyResult updateSecurityPolicy(UpdateSecurityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityPolicy(request);
    }

    @SdkInternalApi
    final UpdateSecurityPolicyResult executeUpdateSecurityPolicy(UpdateSecurityPolicyRequest updateSecurityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityPolicyRequest> request = null;
        Response<UpdateSecurityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecurityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSecurityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return Result of the UpdateVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVpcEndpointResult updateVpcEndpoint(UpdateVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVpcEndpoint(request);
    }

    @SdkInternalApi
    final UpdateVpcEndpointResult executeUpdateVpcEndpoint(UpdateVpcEndpointRequest updateVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVpcEndpointRequest> request = null;
        Response<UpdateVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearchServerless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVpcEndpointResultJsonUnmarshaller());
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
