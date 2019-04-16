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
package com.amazonaws.services.mq;

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

import com.amazonaws.services.mq.AmazonMQClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.services.mq.model.transform.*;

/**
 * Client for accessing AmazonMQ. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
 * brokers in the cloud. A message broker allows software applications and components to communicate using various
 * programming languages, operating systems, and formal messaging protocols.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMQClient extends AmazonWebServiceClient implements AmazonMQ {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMQ.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mq";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.mq.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.mq.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.mq.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.mq.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.mq.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.mq.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mq.model.AmazonMQException.class));

    public static AmazonMQClientBuilder builder() {
        return AmazonMQClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMQ using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMQClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMQ using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMQClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mq.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mq/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mq/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Creates a broker. Note: This API is asynchronous.
     * 
     * @param createBrokerRequest
     *        Creates a broker using the specified properties.
     * @return Result of the CreateBroker operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. This broker name already exists. Retry your request with another name.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBrokerResult createBroker(CreateBrokerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBroker(request);
    }

    @SdkInternalApi
    final CreateBrokerResult executeCreateBroker(CreateBrokerRequest createBrokerRequest) {

        ExecutionContext executionContext = createExecutionContext(createBrokerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBrokerRequest> request = null;
        Response<CreateBrokerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBrokerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBrokerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBroker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBrokerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBrokerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
     * engine type and version).
     * 
     * @param createConfigurationRequest
     *        Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration
     *        (the engine type and version).
     * @return Result of the CreateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. This configuration name already exists. Retry your request with another
     *         configuration name.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your input and then retry your request.
     * @sample AmazonMQ.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateConfigurationResult createConfiguration(CreateConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfiguration(request);
    }

    @SdkInternalApi
    final CreateConfigurationResult executeCreateConfiguration(CreateConfigurationRequest createConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationRequest> request = null;
        Response<CreateConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Add a tag to a resource.
     * 
     * @param createTagsRequest
     *        A map of the key-value pairs for the resource tag.
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates an ActiveMQ user.
     * 
     * @param createUserRequest
     *        Creates a new ActiveMQ user.
     * @return Result of the CreateUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes a broker. Note: This API is asynchronous.
     * 
     * @param deleteBrokerRequest
     * @return Result of the DeleteBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteBroker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBrokerResult deleteBroker(DeleteBrokerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBroker(request);
    }

    @SdkInternalApi
    final DeleteBrokerResult executeDeleteBroker(DeleteBrokerRequest deleteBrokerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBrokerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBrokerRequest> request = null;
        Response<DeleteBrokerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBrokerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBrokerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBroker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBrokerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBrokerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes a tag from a resource.
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an ActiveMQ user.
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about the specified broker.
     * 
     * @param describeBrokerRequest
     * @return Result of the DescribeBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBrokerResult describeBroker(DescribeBrokerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBroker(request);
    }

    @SdkInternalApi
    final DescribeBrokerResult executeDescribeBroker(DescribeBrokerRequest describeBrokerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBrokerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBrokerRequest> request = null;
        Response<DescribeBrokerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBrokerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBrokerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBroker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBrokerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBrokerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Describe available engine types and versions.
     * 
     * @param describeBrokerEngineTypesRequest
     * @return Result of the DescribeBrokerEngineTypes operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBrokerEngineTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerEngineTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeBrokerEngineTypesResult describeBrokerEngineTypes(DescribeBrokerEngineTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBrokerEngineTypes(request);
    }

    @SdkInternalApi
    final DescribeBrokerEngineTypesResult executeDescribeBrokerEngineTypes(DescribeBrokerEngineTypesRequest describeBrokerEngineTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBrokerEngineTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBrokerEngineTypesRequest> request = null;
        Response<DescribeBrokerEngineTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBrokerEngineTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeBrokerEngineTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBrokerEngineTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBrokerEngineTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeBrokerEngineTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Describe available broker instance options.
     * 
     * @param describeBrokerInstanceOptionsRequest
     * @return Result of the DescribeBrokerInstanceOptions operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBrokerInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeBrokerInstanceOptionsResult describeBrokerInstanceOptions(DescribeBrokerInstanceOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBrokerInstanceOptions(request);
    }

    @SdkInternalApi
    final DescribeBrokerInstanceOptionsResult executeDescribeBrokerInstanceOptions(DescribeBrokerInstanceOptionsRequest describeBrokerInstanceOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBrokerInstanceOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBrokerInstanceOptionsRequest> request = null;
        Response<DescribeBrokerInstanceOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBrokerInstanceOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeBrokerInstanceOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBrokerInstanceOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBrokerInstanceOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeBrokerInstanceOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about the specified configuration.
     * 
     * @param describeConfigurationRequest
     * @return Result of the DescribeConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeConfigurationResult describeConfiguration(DescribeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfiguration(request);
    }

    @SdkInternalApi
    final DescribeConfigurationResult executeDescribeConfiguration(DescribeConfigurationRequest describeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRequest> request = null;
        Response<DescribeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns the specified configuration revision for the specified configuration.
     * 
     * @param describeConfigurationRevisionRequest
     * @return Result of the DescribeConfigurationRevision operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationRevisionResult describeConfigurationRevision(DescribeConfigurationRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationRevision(request);
    }

    @SdkInternalApi
    final DescribeConfigurationRevisionResult executeDescribeConfigurationRevision(DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRevisionRequest> request = null;
        Response<DescribeConfigurationRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRevisionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns information about an ActiveMQ user.
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUser(request);
    }

    @SdkInternalApi
    final DescribeUserResult executeDescribeUser(DescribeUserRequest describeUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a list of all brokers.
     * 
     * @param listBrokersRequest
     * @return Result of the ListBrokers operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBrokersResult listBrokers(ListBrokersRequest request) {
        request = beforeClientExecution(request);
        return executeListBrokers(request);
    }

    @SdkInternalApi
    final ListBrokersResult executeListBrokers(ListBrokersRequest listBrokersRequest) {

        ExecutionContext executionContext = createExecutionContext(listBrokersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBrokersRequest> request = null;
        Response<ListBrokersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBrokersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBrokersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBrokers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBrokersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBrokersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a list of all revisions for the specified configuration.
     * 
     * @param listConfigurationRevisionsRequest
     * @return Result of the ListConfigurationRevisions operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListConfigurationRevisionsResult listConfigurationRevisions(ListConfigurationRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationRevisions(request);
    }

    @SdkInternalApi
    final ListConfigurationRevisionsResult executeListConfigurationRevisions(ListConfigurationRevisionsRequest listConfigurationRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationRevisionsRequest> request = null;
        Response<ListConfigurationRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfigurationRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfigurationRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a list of all configurations.
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListConfigurationsResult listConfigurations(ListConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurations(request);
    }

    @SdkInternalApi
    final ListConfigurationsResult executeListConfigurations(ListConfigurationsRequest listConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationsRequest> request = null;
        Response<ListConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Lists tags for a resource.
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns a list of all ActiveMQ users.
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Reboots a broker. Note: This API is asynchronous.
     * 
     * @param rebootBrokerRequest
     * @return Result of the RebootBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.RebootBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/RebootBroker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RebootBrokerResult rebootBroker(RebootBrokerRequest request) {
        request = beforeClientExecution(request);
        return executeRebootBroker(request);
    }

    @SdkInternalApi
    final RebootBrokerResult executeRebootBroker(RebootBrokerRequest rebootBrokerRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootBrokerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootBrokerRequest> request = null;
        Response<RebootBrokerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootBrokerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootBrokerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootBroker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootBrokerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootBrokerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Adds a pending configuration change to a broker.
     * 
     * @param updateBrokerRequest
     *        Updates the broker using the specified properties.
     * @return Result of the UpdateBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Concurrent broker update detected. Retrying your request might resolve
     *         the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.UpdateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBrokerResult updateBroker(UpdateBrokerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBroker(request);
    }

    @SdkInternalApi
    final UpdateBrokerResult executeUpdateBroker(UpdateBrokerRequest updateBrokerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBrokerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrokerRequest> request = null;
        Response<UpdateBrokerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrokerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBrokerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBroker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBrokerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBrokerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the specified configuration.
     * 
     * @param updateConfigurationRequest
     *        Updates the specified configuration.
     * @return Result of the UpdateConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Concurrent update to configuration. Retry to create a new revision.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your input and then retry your request.
     * @sample AmazonMQ.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateConfigurationResult updateConfiguration(UpdateConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguration(request);
    }

    @SdkInternalApi
    final UpdateConfigurationResult executeUpdateConfiguration(UpdateConfigurationRequest updateConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationRequest> request = null;
        Response<UpdateConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Updates the information for an ActiveMQ user.
     * 
     * @param updateUserRequest
     *        Updates the information for an ActiveMQ user.
     * @return Result of the UpdateUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mq");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
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
