/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas;

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

import com.amazonaws.services.schemas.AWSSchemasClientBuilder;
import com.amazonaws.services.schemas.waiters.AWSSchemasWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.services.schemas.model.transform.*;

/**
 * Client for accessing Schemas. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS EventBridge Schemas
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSchemasClient extends AmazonWebServiceClient implements AWSSchemas {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSchemas.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "schemas";

    private volatile AWSSchemasWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GoneException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.GoneExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.schemas.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.schemas.model.AWSSchemasException.class));

    public static AWSSchemasClientBuilder builder() {
        return AWSSchemasClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSchemasClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSchemasClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("schemas.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/schemas/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/schemas/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @return Result of the CreateDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws UnauthorizedException
     * @throws ForbiddenException
     * @throws ServiceUnavailableException
     * @throws ConflictException
     * @sample AWSSchemas.CreateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDiscovererResult createDiscoverer(CreateDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDiscoverer(request);
    }

    @SdkInternalApi
    final CreateDiscovererResult executeCreateDiscoverer(CreateDiscovererRequest createDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(createDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiscovererRequest> request = null;
        Response<CreateDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @return Result of the CreateRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws UnauthorizedException
     * @throws ForbiddenException
     * @throws ServiceUnavailableException
     * @throws ConflictException
     * @sample AWSSchemas.CreateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRegistryResult createRegistry(CreateRegistryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRegistry(request);
    }

    @SdkInternalApi
    final CreateRegistryResult executeCreateRegistry(CreateRegistryRequest createRegistryRequest) {

        ExecutionContext executionContext = createExecutionContext(createRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRegistryRequest> request = null;
        Response<CreateRegistryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRegistryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRegistryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRegistry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRegistryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRegistryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSchemaResult createSchema(CreateSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchema(request);
    }

    @SdkInternalApi
    final CreateSchemaResult executeCreateSchema(CreateSchemaRequest createSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(createSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaRequest> request = null;
        Response<CreateSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @return Result of the DeleteDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDiscovererResult deleteDiscoverer(DeleteDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDiscoverer(request);
    }

    @SdkInternalApi
    final DeleteDiscovererResult executeDeleteDiscoverer(DeleteDiscovererRequest deleteDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiscovererRequest> request = null;
        Response<DeleteDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @return Result of the DeleteRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRegistryResult deleteRegistry(DeleteRegistryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRegistry(request);
    }

    @SdkInternalApi
    final DeleteRegistryResult executeDeleteRegistry(DeleteRegistryRequest deleteRegistryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegistryRequest> request = null;
        Response<DeleteRegistryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegistryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRegistryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRegistry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRegistryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRegistryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSchemaResult deleteSchema(DeleteSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchema(request);
    }

    @SdkInternalApi
    final DeleteSchemaResult executeDeleteSchema(DeleteSchemaRequest deleteSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaRequest> request = null;
        Response<DeleteSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @return Result of the DeleteSchemaVersion operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchemaVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSchemaVersionResult deleteSchemaVersion(DeleteSchemaVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchemaVersion(request);
    }

    @SdkInternalApi
    final DeleteSchemaVersionResult executeDeleteSchemaVersion(DeleteSchemaVersionRequest deleteSchemaVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchemaVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaVersionRequest> request = null;
        Response<DeleteSchemaVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchemaVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchemaVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchemaVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSchemaVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @return Result of the DescribeCodeBinding operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.DescribeCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeCodeBinding" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCodeBindingResult describeCodeBinding(DescribeCodeBindingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCodeBinding(request);
    }

    @SdkInternalApi
    final DescribeCodeBindingResult executeDescribeCodeBinding(DescribeCodeBindingRequest describeCodeBindingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCodeBindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCodeBindingRequest> request = null;
        Response<DescribeCodeBindingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCodeBindingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCodeBindingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCodeBinding");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCodeBindingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCodeBindingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @return Result of the DescribeDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDiscovererResult describeDiscoverer(DescribeDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDiscoverer(request);
    }

    @SdkInternalApi
    final DescribeDiscovererResult executeDescribeDiscoverer(DescribeDiscovererRequest describeDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDiscovererRequest> request = null;
        Response<DescribeDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @return Result of the DescribeRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRegistryResult describeRegistry(DescribeRegistryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRegistry(request);
    }

    @SdkInternalApi
    final DescribeRegistryResult executeDescribeRegistry(DescribeRegistryRequest describeRegistryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegistryRequest> request = null;
        Response<DescribeRegistryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegistryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRegistryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRegistry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRegistryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRegistryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return Result of the DescribeSchema operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSchemaResult describeSchema(DescribeSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchema(request);
    }

    @SdkInternalApi
    final DescribeSchemaResult executeDescribeSchema(DescribeSchemaRequest describeSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemaRequest> request = null;
        Response<DescribeSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @return Result of the GetCodeBindingSource operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.GetCodeBindingSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetCodeBindingSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCodeBindingSourceResult getCodeBindingSource(GetCodeBindingSourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetCodeBindingSource(request);
    }

    @SdkInternalApi
    final GetCodeBindingSourceResult executeGetCodeBindingSource(GetCodeBindingSourceRequest getCodeBindingSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getCodeBindingSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCodeBindingSourceRequest> request = null;
        Response<GetCodeBindingSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCodeBindingSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCodeBindingSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCodeBindingSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCodeBindingSourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                            new GetCodeBindingSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @return Result of the GetDiscoveredSchema operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.GetDiscoveredSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetDiscoveredSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDiscoveredSchemaResult getDiscoveredSchema(GetDiscoveredSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeGetDiscoveredSchema(request);
    }

    @SdkInternalApi
    final GetDiscoveredSchemaResult executeGetDiscoveredSchema(GetDiscoveredSchemaRequest getDiscoveredSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiscoveredSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiscoveredSchemaRequest> request = null;
        Response<GetDiscoveredSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiscoveredSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDiscoveredSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDiscoveredSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiscoveredSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDiscoveredSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @return Result of the ListDiscoverers operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListDiscoverers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListDiscoverers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDiscoverersResult listDiscoverers(ListDiscoverersRequest request) {
        request = beforeClientExecution(request);
        return executeListDiscoverers(request);
    }

    @SdkInternalApi
    final ListDiscoverersResult executeListDiscoverers(ListDiscoverersRequest listDiscoverersRequest) {

        ExecutionContext executionContext = createExecutionContext(listDiscoverersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoverersRequest> request = null;
        Response<ListDiscoverersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoverersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDiscoverersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDiscoverers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDiscoverersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDiscoverersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return Result of the ListRegistries operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListRegistries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRegistriesResult listRegistries(ListRegistriesRequest request) {
        request = beforeClientExecution(request);
        return executeListRegistries(request);
    }

    @SdkInternalApi
    final ListRegistriesResult executeListRegistries(ListRegistriesRequest listRegistriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRegistriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegistriesRequest> request = null;
        Response<ListRegistriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegistriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRegistriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRegistries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRegistriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRegistriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return Result of the ListSchemaVersions operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.ListSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemaVersionsResult listSchemaVersions(ListSchemaVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemaVersions(request);
    }

    @SdkInternalApi
    final ListSchemaVersionsResult executeListSchemaVersions(ListSchemaVersionsRequest listSchemaVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemaVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemaVersionsRequest> request = null;
        Response<ListSchemaVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemaVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemaVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemaVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemaVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemaVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemasResult listSchemas(ListSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemas(request);
    }

    @SdkInternalApi
    final ListSchemasResult executeListSchemas(ListSchemasRequest listSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
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
     * @param lockServiceLinkedRoleRequest
     * @return Result of the LockServiceLinkedRole operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.LockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/LockServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public LockServiceLinkedRoleResult lockServiceLinkedRole(LockServiceLinkedRoleRequest request) {
        request = beforeClientExecution(request);
        return executeLockServiceLinkedRole(request);
    }

    @SdkInternalApi
    final LockServiceLinkedRoleResult executeLockServiceLinkedRole(LockServiceLinkedRoleRequest lockServiceLinkedRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(lockServiceLinkedRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LockServiceLinkedRoleRequest> request = null;
        Response<LockServiceLinkedRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LockServiceLinkedRoleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(lockServiceLinkedRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LockServiceLinkedRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LockServiceLinkedRoleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new LockServiceLinkedRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @return Result of the PutCodeBinding operation returned by the service.
     * @throws GoneException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.PutCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/PutCodeBinding" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutCodeBindingResult putCodeBinding(PutCodeBindingRequest request) {
        request = beforeClientExecution(request);
        return executePutCodeBinding(request);
    }

    @SdkInternalApi
    final PutCodeBindingResult executePutCodeBinding(PutCodeBindingRequest putCodeBindingRequest) {

        ExecutionContext executionContext = createExecutionContext(putCodeBindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCodeBindingRequest> request = null;
        Response<PutCodeBindingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCodeBindingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putCodeBindingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutCodeBinding");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutCodeBindingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutCodeBindingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @return Result of the SearchSchemas operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.SearchSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchSchemasResult searchSchemas(SearchSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSchemas(request);
    }

    @SdkInternalApi
    final SearchSchemasResult executeSearchSchemas(SearchSchemasRequest searchSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSchemasRequest> request = null;
        Response<SearchSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @return Result of the StartDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.StartDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StartDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartDiscovererResult startDiscoverer(StartDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeStartDiscoverer(request);
    }

    @SdkInternalApi
    final StartDiscovererResult executeStartDiscoverer(StartDiscovererRequest startDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(startDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDiscovererRequest> request = null;
        Response<StartDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @return Result of the StopDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.StopDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StopDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopDiscovererResult stopDiscoverer(StopDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeStopDiscoverer(request);
    }

    @SdkInternalApi
    final StopDiscovererResult executeStopDiscoverer(StopDiscovererRequest stopDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDiscovererRequest> request = null;
        Response<StopDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
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
     * @param unlockServiceLinkedRoleRequest
     * @return Result of the UnlockServiceLinkedRole operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.UnlockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UnlockServiceLinkedRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UnlockServiceLinkedRoleResult unlockServiceLinkedRole(UnlockServiceLinkedRoleRequest request) {
        request = beforeClientExecution(request);
        return executeUnlockServiceLinkedRole(request);
    }

    @SdkInternalApi
    final UnlockServiceLinkedRoleResult executeUnlockServiceLinkedRole(UnlockServiceLinkedRoleRequest unlockServiceLinkedRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(unlockServiceLinkedRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlockServiceLinkedRoleRequest> request = null;
        Response<UnlockServiceLinkedRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlockServiceLinkedRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(unlockServiceLinkedRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnlockServiceLinkedRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnlockServiceLinkedRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UnlockServiceLinkedRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
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
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @return Result of the UpdateDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDiscovererResult updateDiscoverer(UpdateDiscovererRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDiscoverer(request);
    }

    @SdkInternalApi
    final UpdateDiscovererResult executeUpdateDiscoverer(UpdateDiscovererRequest updateDiscovererRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDiscovererRequest> request = null;
        Response<UpdateDiscovererResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDiscovererRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDiscovererRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDiscoverer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDiscovererResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDiscovererResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest
     * @return Result of the UpdateRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRegistryResult updateRegistry(UpdateRegistryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRegistry(request);
    }

    @SdkInternalApi
    final UpdateRegistryResult executeUpdateRegistry(UpdateRegistryRequest updateRegistryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegistryRequest> request = null;
        Response<UpdateRegistryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegistryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRegistryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRegistry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRegistryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRegistryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * 
     * @param updateSchemaRequest
     * @return Result of the UpdateSchema operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSchemaResult updateSchema(UpdateSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchema(request);
    }

    @SdkInternalApi
    final UpdateSchemaResult executeUpdateSchema(UpdateSchemaRequest updateSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSchemaRequest> request = null;
        Response<UpdateSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "schemas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSchemaResultJsonUnmarshaller());
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
    public AWSSchemasWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSSchemasWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
