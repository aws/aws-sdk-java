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
package com.amazonaws.services.appsync;

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

import com.amazonaws.services.appsync.AWSAppSyncClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.services.appsync.model.transform.*;

/**
 * Client for accessing AWSAppSync. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppSyncClient extends AmazonWebServiceClient implements AWSAppSync {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppSync.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appsync";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.appsync.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.appsync.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GraphQLSchemaException").withModeledClass(
                                    com.amazonaws.services.appsync.model.GraphQLSchemaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.appsync.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.appsync.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApiKeyLimitExceededException").withModeledClass(
                                    com.amazonaws.services.appsync.model.ApiKeyLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.appsync.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApiKeyValidityOutOfBoundsException").withModeledClass(
                                    com.amazonaws.services.appsync.model.ApiKeyValidityOutOfBoundsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApiLimitExceededException").withModeledClass(
                                    com.amazonaws.services.appsync.model.ApiLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.appsync.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appsync.model.AWSAppSyncException.class));

    public static AWSAppSyncClientBuilder builder() {
        return AWSAppSyncClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppSync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppSyncClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppSync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppSyncClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appsync.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appsync/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appsync/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a unique key that you can distribute to clients who are executing your API.
     * </p>
     * 
     * @param createApiKeyRequest
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiKeyLimitExceededException
     *         The API key exceeded a limit. Try your request again.
     * @throws ApiKeyValidityOutOfBoundsException
     *         The API key expiration must be set to a value between 1 and 365 days from creation (for
     *         <code>CreateApiKey</code>) or from update (for <code>UpdateApiKey</code>).
     * @sample AWSAppSync.CreateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiKey" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
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
     * Creates a <code>DataSource</code> object.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSource(request);
    }

    @SdkInternalApi
    final CreateDataSourceResult executeCreateDataSource(CreateDataSourceRequest createDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceRequest> request = null;
        Response<CreateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>Function</code> object.
     * </p>
     * <p>
     * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFunctionResult createFunction(CreateFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFunction(request);
    }

    @SdkInternalApi
    final CreateFunctionResult executeCreateFunction(CreateFunctionRequest createFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(createFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFunctionRequest> request = null;
        Response<CreateFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param createGraphqlApiRequest
     * @return Result of the CreateGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiLimitExceededException
     *         The GraphQL API exceeded a limit. Try your request again.
     * @sample AWSAppSync.CreateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGraphqlApiResult createGraphqlApi(CreateGraphqlApiRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGraphqlApi(request);
    }

    @SdkInternalApi
    final CreateGraphqlApiResult executeCreateGraphqlApi(CreateGraphqlApiRequest createGraphqlApiRequest) {

        ExecutionContext executionContext = createExecutionContext(createGraphqlApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGraphqlApiRequest> request = null;
        Response<CreateGraphqlApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGraphqlApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGraphqlApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGraphqlApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGraphqlApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGraphqlApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>Resolver</code> object.
     * </p>
     * <p>
     * A resolver converts incoming requests into a format that a data source can understand and converts the data
     * source's responses into GraphQL.
     * </p>
     * 
     * @param createResolverRequest
     * @return Result of the CreateResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateResolverResult createResolver(CreateResolverRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResolver(request);
    }

    @SdkInternalApi
    final CreateResolverResult executeCreateResolver(CreateResolverRequest createResolverRequest) {

        ExecutionContext executionContext = createExecutionContext(createResolverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResolverRequest> request = null;
        Response<CreateResolverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResolverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResolverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResolver");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResolverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResolverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>Type</code> object.
     * </p>
     * 
     * @param createTypeRequest
     * @return Result of the CreateType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTypeResult createType(CreateTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateType(request);
    }

    @SdkInternalApi
    final CreateTypeResult executeCreateType(CreateTypeRequest createTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTypeRequest> request = null;
        Response<CreateTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTypeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an API key.
     * </p>
     * 
     * @param deleteApiKeyRequest
     * @return Result of the DeleteApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiKey" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
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
     * Deletes a <code>DataSource</code> object.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSource(request);
    }

    @SdkInternalApi
    final DeleteDataSourceResult executeDeleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>Function</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFunctionResult deleteFunction(DeleteFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunction(request);
    }

    @SdkInternalApi
    final DeleteFunctionResult executeDeleteFunction(DeleteFunctionRequest deleteFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionRequest> request = null;
        Response<DeleteFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param deleteGraphqlApiRequest
     * @return Result of the DeleteGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGraphqlApiResult deleteGraphqlApi(DeleteGraphqlApiRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGraphqlApi(request);
    }

    @SdkInternalApi
    final DeleteGraphqlApiResult executeDeleteGraphqlApi(DeleteGraphqlApiRequest deleteGraphqlApiRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGraphqlApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGraphqlApiRequest> request = null;
        Response<DeleteGraphqlApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGraphqlApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGraphqlApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGraphqlApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGraphqlApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGraphqlApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>Resolver</code> object.
     * </p>
     * 
     * @param deleteResolverRequest
     * @return Result of the DeleteResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteResolver" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteResolverResult deleteResolver(DeleteResolverRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResolver(request);
    }

    @SdkInternalApi
    final DeleteResolverResult executeDeleteResolver(DeleteResolverRequest deleteResolverRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResolverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResolverRequest> request = null;
        Response<DeleteResolverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResolverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResolverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResolver");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResolverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResolverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>Type</code> object.
     * </p>
     * 
     * @param deleteTypeRequest
     * @return Result of the DeleteType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTypeResult deleteType(DeleteTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteType(request);
    }

    @SdkInternalApi
    final DeleteTypeResult executeDeleteType(DeleteTypeRequest deleteTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTypeRequest> request = null;
        Response<DeleteTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTypeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a <code>DataSource</code> object.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSourceResult getDataSource(GetDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSource(request);
    }

    @SdkInternalApi
    final GetDataSourceResult executeGetDataSource(GetDataSourceRequest getDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRequest> request = null;
        Response<GetDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a <code>Function</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppSync.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFunctionResult getFunction(GetFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunction(request);
    }

    @SdkInternalApi
    final GetFunctionResult executeGetFunction(GetFunctionRequest getFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionRequest> request = null;
        Response<GetFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param getGraphqlApiRequest
     * @return Result of the GetGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGraphqlApiResult getGraphqlApi(GetGraphqlApiRequest request) {
        request = beforeClientExecution(request);
        return executeGetGraphqlApi(request);
    }

    @SdkInternalApi
    final GetGraphqlApiResult executeGetGraphqlApi(GetGraphqlApiRequest getGraphqlApiRequest) {

        ExecutionContext executionContext = createExecutionContext(getGraphqlApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGraphqlApiRequest> request = null;
        Response<GetGraphqlApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGraphqlApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGraphqlApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGraphqlApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGraphqlApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGraphqlApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the introspection schema for a GraphQL API.
     * </p>
     * 
     * @param getIntrospectionSchemaRequest
     * @return Result of the GetIntrospectionSchema operation returned by the service.
     * @throws GraphQLSchemaException
     *         The GraphQL schema is not valid.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetIntrospectionSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetIntrospectionSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIntrospectionSchemaResult getIntrospectionSchema(GetIntrospectionSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntrospectionSchema(request);
    }

    @SdkInternalApi
    final GetIntrospectionSchemaResult executeGetIntrospectionSchema(GetIntrospectionSchemaRequest getIntrospectionSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntrospectionSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntrospectionSchemaRequest> request = null;
        Response<GetIntrospectionSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntrospectionSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntrospectionSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntrospectionSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntrospectionSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetIntrospectionSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a <code>Resolver</code> object.
     * </p>
     * 
     * @param getResolverRequest
     * @return Result of the GetResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppSync.GetResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetResolver" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResolverResult getResolver(GetResolverRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolver(request);
    }

    @SdkInternalApi
    final GetResolverResult executeGetResolver(GetResolverRequest getResolverRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverRequest> request = null;
        Response<GetResolverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResolverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolver");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResolverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current status of a schema creation operation.
     * </p>
     * 
     * @param getSchemaCreationStatusRequest
     * @return Result of the GetSchemaCreationStatus operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetSchemaCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSchemaCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSchemaCreationStatusResult getSchemaCreationStatus(GetSchemaCreationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchemaCreationStatus(request);
    }

    @SdkInternalApi
    final GetSchemaCreationStatusResult executeGetSchemaCreationStatus(GetSchemaCreationStatusRequest getSchemaCreationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaCreationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaCreationStatusRequest> request = null;
        Response<GetSchemaCreationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaCreationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSchemaCreationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchemaCreationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaCreationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSchemaCreationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a <code>Type</code> object.
     * </p>
     * 
     * @param getTypeRequest
     * @return Result of the GetType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTypeResult getType(GetTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetType(request);
    }

    @SdkInternalApi
    final GetTypeResult executeGetType(GetTypeRequest getTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTypeRequest> request = null;
        Response<GetTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTypeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the API keys for a given API.
     * </p>
     * <note>
     * <p>
     * API keys are deleted automatically sometime after they expire. However, they may still be included in the
     * response until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete
     * a key before it's automatically deleted.
     * </p>
     * </note>
     * 
     * @param listApiKeysRequest
     * @return Result of the ListApiKeys operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListApiKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListApiKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApiKeysResult listApiKeys(ListApiKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListApiKeys(request);
    }

    @SdkInternalApi
    final ListApiKeysResult executeListApiKeys(ListApiKeysRequest listApiKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApiKeysRequest> request = null;
        Response<ListApiKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApiKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApiKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApiKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApiKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApiKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data sources for a given API.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSources(request);
    }

    @SdkInternalApi
    final ListDataSourcesResult executeListDataSources(ListDataSourcesRequest listDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List multiple functions.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFunctionsResult listFunctions(ListFunctionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFunctions(request);
    }

    @SdkInternalApi
    final ListFunctionsResult executeListFunctions(ListFunctionsRequest listFunctionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionsRequest> request = null;
        Response<ListFunctionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFunctions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFunctionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFunctionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your GraphQL APIs.
     * </p>
     * 
     * @param listGraphqlApisRequest
     * @return Result of the ListGraphqlApis operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListGraphqlApis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGraphqlApisResult listGraphqlApis(ListGraphqlApisRequest request) {
        request = beforeClientExecution(request);
        return executeListGraphqlApis(request);
    }

    @SdkInternalApi
    final ListGraphqlApisResult executeListGraphqlApis(ListGraphqlApisRequest listGraphqlApisRequest) {

        ExecutionContext executionContext = createExecutionContext(listGraphqlApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGraphqlApisRequest> request = null;
        Response<ListGraphqlApisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGraphqlApisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGraphqlApisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGraphqlApis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGraphqlApisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGraphqlApisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resolvers for a given API and type.
     * </p>
     * 
     * @param listResolversRequest
     * @return Result of the ListResolvers operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListResolvers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolvers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResolversResult listResolvers(ListResolversRequest request) {
        request = beforeClientExecution(request);
        return executeListResolvers(request);
    }

    @SdkInternalApi
    final ListResolversResult executeListResolvers(ListResolversRequest listResolversRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolversRequest> request = null;
        Response<ListResolversResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolversRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResolversRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolvers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolversResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResolversResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the resolvers that are associated with a specific function.
     * </p>
     * 
     * @param listResolversByFunctionRequest
     * @return Result of the ListResolversByFunction operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListResolversByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolversByFunction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolversByFunctionResult listResolversByFunction(ListResolversByFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeListResolversByFunction(request);
    }

    @SdkInternalApi
    final ListResolversByFunctionResult executeListResolversByFunction(ListResolversByFunctionRequest listResolversByFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolversByFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolversByFunctionRequest> request = null;
        Response<ListResolversByFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolversByFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResolversByFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolversByFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolversByFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResolversByFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the types for a given API.
     * </p>
     * 
     * @param listTypesRequest
     * @return Result of the ListTypes operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTypesResult listTypes(ListTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListTypes(request);
    }

    @SdkInternalApi
    final ListTypesResult executeListTypes(ListTypesRequest listTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypesRequest> request = null;
        Response<ListTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTypesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new schema to your GraphQL API.
     * </p>
     * <p>
     * This operation is asynchronous. Use to determine when it has completed.
     * </p>
     * 
     * @param startSchemaCreationRequest
     * @return Result of the StartSchemaCreation operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.StartSchemaCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaCreation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartSchemaCreationResult startSchemaCreation(StartSchemaCreationRequest request) {
        request = beforeClientExecution(request);
        return executeStartSchemaCreation(request);
    }

    @SdkInternalApi
    final StartSchemaCreationResult executeStartSchemaCreation(StartSchemaCreationRequest startSchemaCreationRequest) {

        ExecutionContext executionContext = createExecutionContext(startSchemaCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSchemaCreationRequest> request = null;
        Response<StartSchemaCreationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSchemaCreationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSchemaCreationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSchemaCreation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSchemaCreationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSchemaCreationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an API key.
     * </p>
     * 
     * @param updateApiKeyRequest
     * @return Result of the UpdateApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiKeyValidityOutOfBoundsException
     *         The API key expiration must be set to a value between 1 and 365 days from creation (for
     *         <code>CreateApiKey</code>) or from update (for <code>UpdateApiKey</code>).
     * @sample AWSAppSync.UpdateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiKey" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
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
     * Updates a <code>DataSource</code> object.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSource(request);
    }

    @SdkInternalApi
    final UpdateDataSourceResult executeUpdateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <code>Function</code> object.
     * </p>
     * 
     * @param updateFunctionRequest
     * @return Result of the UpdateFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFunctionResult updateFunction(UpdateFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunction(request);
    }

    @SdkInternalApi
    final UpdateFunctionResult executeUpdateFunction(UpdateFunctionRequest updateFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionRequest> request = null;
        Response<UpdateFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param updateGraphqlApiRequest
     * @return Result of the UpdateGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGraphqlApiResult updateGraphqlApi(UpdateGraphqlApiRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGraphqlApi(request);
    }

    @SdkInternalApi
    final UpdateGraphqlApiResult executeUpdateGraphqlApi(UpdateGraphqlApiRequest updateGraphqlApiRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGraphqlApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGraphqlApiRequest> request = null;
        Response<UpdateGraphqlApiResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGraphqlApiRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGraphqlApiRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGraphqlApi");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGraphqlApiResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGraphqlApiResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <code>Resolver</code> object.
     * </p>
     * 
     * @param updateResolverRequest
     * @return Result of the UpdateResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateResolverResult updateResolver(UpdateResolverRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResolver(request);
    }

    @SdkInternalApi
    final UpdateResolverResult executeUpdateResolver(UpdateResolverRequest updateResolverRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResolverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResolverRequest> request = null;
        Response<UpdateResolverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResolverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResolverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResolver");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResolverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResolverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <code>Type</code> object.
     * </p>
     * 
     * @param updateTypeRequest
     * @return Result of the UpdateType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTypeResult updateType(UpdateTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateType(request);
    }

    @SdkInternalApi
    final UpdateTypeResult executeUpdateType(UpdateTypeRequest updateTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTypeRequest> request = null;
        Response<UpdateTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTypeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTypeResultJsonUnmarshaller());
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
