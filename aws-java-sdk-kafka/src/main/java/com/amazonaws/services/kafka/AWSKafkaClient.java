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
package com.amazonaws.services.kafka;

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

import com.amazonaws.services.kafka.AWSKafkaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.services.kafka.model.transform.*;

/**
 * Client for accessing Kafka. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 * <p>
 * The operations for managing an Amazon MSK cluster.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKafkaClient extends AmazonWebServiceClient implements AWSKafka {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSKafka.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kafka";

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
                                    com.amazonaws.services.kafka.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kafka.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kafka.model.AWSKafkaException.class));

    public static AWSKafkaClientBuilder builder() {
        return AWSKafkaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kafka using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSKafkaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kafka using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSKafkaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kafka.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kafka/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kafka/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws TooManyRequestsException
     *         <p>
     *         429 response
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @sample AWSKafka.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final CreateClusterResult executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @return Result of the CreateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws TooManyRequestsException
     *         <p>
     *         429 response
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @sample AWSKafka.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateConfiguration" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final DeleteClusterResult executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCluster(request);
    }

    @SdkInternalApi
    final DescribeClusterResult executeDescribeCluster(DescribeClusterRequest describeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @return Result of the DescribeClusterOperation operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.DescribeClusterOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeClusterOperationResult describeClusterOperation(DescribeClusterOperationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterOperation(request);
    }

    @SdkInternalApi
    final DescribeClusterOperationResult executeDescribeClusterOperation(DescribeClusterOperationRequest describeClusterOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterOperationRequest> request = null;
        Response<DescribeClusterOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterOperationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeClusterOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClusterOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeClusterOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @return Result of the DescribeConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfiguration" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @return Result of the DescribeConfigurationRevision operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return Result of the GetBootstrapBrokers operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.GetBootstrapBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBootstrapBrokersResult getBootstrapBrokers(GetBootstrapBrokersRequest request) {
        request = beforeClientExecution(request);
        return executeGetBootstrapBrokers(request);
    }

    @SdkInternalApi
    final GetBootstrapBrokersResult executeGetBootstrapBrokers(GetBootstrapBrokersRequest getBootstrapBrokersRequest) {

        ExecutionContext executionContext = createExecutionContext(getBootstrapBrokersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBootstrapBrokersRequest> request = null;
        Response<GetBootstrapBrokersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBootstrapBrokersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBootstrapBrokersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBootstrapBrokers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBootstrapBrokersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBootstrapBrokersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the operations that have been performed on the specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @return Result of the ListClusterOperations operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListClusterOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListClusterOperationsResult listClusterOperations(ListClusterOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListClusterOperations(request);
    }

    @SdkInternalApi
    final ListClusterOperationsResult executeListClusterOperations(ListClusterOperationsRequest listClusterOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listClusterOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClusterOperationsRequest> request = null;
        Response<ListClusterOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClusterOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClusterOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusterOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClusterOperationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListClusterOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListClusters(request);
    }

    @SdkInternalApi
    final ListClustersResult executeListClusters(ListClustersRequest listClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @return Result of the ListConfigurationRevisions operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurations" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @return Result of the ListKafkaVersions operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListKafkaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListKafkaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKafkaVersionsResult listKafkaVersions(ListKafkaVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListKafkaVersions(request);
    }

    @SdkInternalApi
    final ListKafkaVersionsResult executeListKafkaVersions(ListKafkaVersionsRequest listKafkaVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listKafkaVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKafkaVersionsRequest> request = null;
        Response<ListKafkaVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKafkaVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKafkaVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKafkaVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKafkaVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKafkaVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNodesResult listNodes(ListNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListNodes(request);
    }

    @SdkInternalApi
    final ListNodesResult executeListNodes(ListNodesRequest listNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodesRequest> request = null;
        Response<ListNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNodesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
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
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @return Result of the UpdateBrokerCount operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateBrokerCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerCount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBrokerCountResult updateBrokerCount(UpdateBrokerCountRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBrokerCount(request);
    }

    @SdkInternalApi
    final UpdateBrokerCountResult executeUpdateBrokerCount(UpdateBrokerCountRequest updateBrokerCountRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBrokerCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrokerCountRequest> request = null;
        Response<UpdateBrokerCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrokerCountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBrokerCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBrokerCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBrokerCountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBrokerCountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @return Result of the UpdateBrokerStorage operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateBrokerStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerStorage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBrokerStorageResult updateBrokerStorage(UpdateBrokerStorageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBrokerStorage(request);
    }

    @SdkInternalApi
    final UpdateBrokerStorageResult executeUpdateBrokerStorage(UpdateBrokerStorageRequest updateBrokerStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBrokerStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrokerStorageRequest> request = null;
        Response<UpdateBrokerStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrokerStorageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBrokerStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBrokerStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBrokerStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBrokerStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the cluster with the configuration that is specified in the request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @return Result of the UpdateClusterConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.UpdateClusterConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateClusterConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateClusterConfigurationResult updateClusterConfiguration(UpdateClusterConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClusterConfiguration(request);
    }

    @SdkInternalApi
    final UpdateClusterConfigurationResult executeUpdateClusterConfiguration(UpdateClusterConfigurationRequest updateClusterConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterConfigurationRequest> request = null;
        Response<UpdateClusterConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateClusterConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateClusterConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateClusterConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics
     * you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with
     * Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest
     *        Request body for UpdateMonitoring.
     * @return Result of the UpdateMonitoring operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateMonitoring" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMonitoringResult updateMonitoring(UpdateMonitoringRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMonitoring(request);
    }

    @SdkInternalApi
    final UpdateMonitoringResult executeUpdateMonitoring(UpdateMonitoringRequest updateMonitoringRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitoringRequest> request = null;
        Response<UpdateMonitoringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitoringRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMonitoringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kafka");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMonitoring");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMonitoringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMonitoringResultJsonUnmarshaller());
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
