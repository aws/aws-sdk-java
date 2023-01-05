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
package com.amazonaws.services.redshiftserverless;

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

import com.amazonaws.services.redshiftserverless.AWSRedshiftServerlessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.services.redshiftserverless.model.transform.*;

/**
 * Client for accessing Redshift Serverless. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is an interface reference for Amazon Redshift Serverless. It contains documentation for one of the programming
 * or command line interfaces you can use to manage Amazon Redshift Serverless.
 * </p>
 * <p>
 * Amazon Redshift Serverless automatically provisions data warehouse capacity and intelligently scales the underlying
 * resources based on workload demands. Amazon Redshift Serverless adjusts capacity in seconds to deliver consistently
 * high performance and simplified operations for even the most demanding and volatile workloads. Amazon Redshift
 * Serverless lets you focus on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * To learn more about Amazon Redshift Serverless, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-whatis.html">What is Amazon Redshift
 * Serverless</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRedshiftServerlessClient extends AmazonWebServiceClient implements AWSRedshiftServerless {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRedshiftServerless.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "redshift-serverless";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.InvalidPaginationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientCapacityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.InsufficientCapacityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftserverless.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.redshiftserverless.model.AWSRedshiftServerlessException.class));

    public static AWSRedshiftServerlessClientBuilder builder() {
        return AWSRedshiftServerlessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Redshift Serverless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRedshiftServerlessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Redshift Serverless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRedshiftServerlessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("redshift-serverless.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/redshiftserverless/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/redshiftserverless/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html">Working with snapshots
     * and recovery points</a>.
     * </p>
     * 
     * @param convertRecoveryPointToSnapshotRequest
     * @return Result of the ConvertRecoveryPointToSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.ConvertRecoveryPointToSnapshot
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConvertRecoveryPointToSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConvertRecoveryPointToSnapshotResult convertRecoveryPointToSnapshot(ConvertRecoveryPointToSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeConvertRecoveryPointToSnapshot(request);
    }

    @SdkInternalApi
    final ConvertRecoveryPointToSnapshotResult executeConvertRecoveryPointToSnapshot(ConvertRecoveryPointToSnapshotRequest convertRecoveryPointToSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(convertRecoveryPointToSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConvertRecoveryPointToSnapshotRequest> request = null;
        Response<ConvertRecoveryPointToSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConvertRecoveryPointToSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(convertRecoveryPointToSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConvertRecoveryPointToSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConvertRecoveryPointToSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ConvertRecoveryPointToSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param createEndpointAccessRequest
     * @return Result of the CreateEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEndpointAccessResult createEndpointAccess(CreateEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEndpointAccess(request);
    }

    @SdkInternalApi
    final CreateEndpointAccessResult executeCreateEndpointAccess(CreateEndpointAccessRequest createEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(createEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointAccessRequest> request = null;
        Response<CreateEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createNamespaceRequest
     * @return Result of the CreateNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @sample AWSRedshiftServerless.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNamespaceResult createNamespace(CreateNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNamespace(request);
    }

    @SdkInternalApi
    final CreateNamespaceResult executeCreateNamespace(CreateNamespaceRequest createNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNamespaceRequest> request = null;
        Response<CreateNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of all databases in a namespace. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html"> Working with
     * snapshots and recovery points</a>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final CreateSnapshotResult executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the
     * returned usage limit identifier.
     * </p>
     * 
     * @param createUsageLimitRequest
     * @return Result of the CreateUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUsageLimitResult createUsageLimit(CreateUsageLimitRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUsageLimit(request);
    }

    @SdkInternalApi
    final CreateUsageLimitResult executeCreateUsageLimit(CreateUsageLimitRequest createUsageLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(createUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsageLimitRequest> request = null;
        Response<CreateUsageLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUsageLimitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUsageLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUsageLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUsageLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUsageLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an workgroup in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createWorkgroupRequest
     * @return Result of the CreateWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InsufficientCapacityException
     *         There is an insufficient capacity to perform the action.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @sample AWSRedshiftServerless.CreateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkgroupResult createWorkgroup(CreateWorkgroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkgroup(request);
    }

    @SdkInternalApi
    final CreateWorkgroupResult executeCreateWorkgroup(CreateWorkgroupRequest createWorkgroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkgroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkgroupRequest> request = null;
        Response<CreateWorkgroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkgroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkgroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkgroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkgroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkgroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param deleteEndpointAccessRequest
     * @return Result of the DeleteEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEndpointAccessResult deleteEndpointAccess(DeleteEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpointAccess(request);
    }

    @SdkInternalApi
    final DeleteEndpointAccessResult executeDeleteEndpointAccess(DeleteEndpointAccessRequest deleteEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointAccessRequest> request = null;
        Response<DeleteEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final
     * snapshot that has all of the data within the namespace.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamespace(request);
    }

    @SdkInternalApi
    final DeleteNamespaceResult executeDeleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamespaceRequest> request = null;
        Response<DeleteNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a snapshot from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshot(request);
    }

    @SdkInternalApi
    final DeleteSnapshotResult executeDeleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a usage limit from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteUsageLimitRequest
     * @return Result of the DeleteUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUsageLimitResult deleteUsageLimit(DeleteUsageLimitRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUsageLimit(request);
    }

    @SdkInternalApi
    final DeleteUsageLimitResult executeDeleteUsageLimit(DeleteUsageLimitRequest deleteUsageLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsageLimitRequest> request = null;
        Response<DeleteUsageLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUsageLimitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUsageLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUsageLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUsageLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUsageLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workgroup.
     * </p>
     * 
     * @param deleteWorkgroupRequest
     * @return Result of the DeleteWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkgroupResult deleteWorkgroup(DeleteWorkgroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkgroup(request);
    }

    @SdkInternalApi
    final DeleteWorkgroupResult executeDeleteWorkgroup(DeleteWorkgroupRequest deleteWorkgroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkgroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkgroupRequest> request = null;
        Response<DeleteWorkgroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkgroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkgroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkgroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkgroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkgroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift
     * Serverless.
     * </p>
     * <p>
     * By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900
     * seconds (15 minutes) and 3600 seconds (60 minutes).
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param getCredentialsRequest
     * @return Result of the GetCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCredentialsResult getCredentials(GetCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCredentials(request);
    }

    @SdkInternalApi
    final GetCredentialsResult executeGetCredentials(GetCredentialsRequest getCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialsRequest> request = null;
        Response<GetCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information, such as the name, about a VPC endpoint.
     * </p>
     * 
     * @param getEndpointAccessRequest
     * @return Result of the GetEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEndpointAccessResult getEndpointAccess(GetEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeGetEndpointAccess(request);
    }

    @SdkInternalApi
    final GetEndpointAccessResult executeGetEndpointAccess(GetEndpointAccessRequest getEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(getEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointAccessRequest> request = null;
        Response<GetEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return Result of the GetNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNamespaceResult getNamespace(GetNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetNamespace(request);
    }

    @SdkInternalApi
    final GetNamespaceResult executeGetNamespace(GetNamespaceRequest getNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamespaceRequest> request = null;
        Response<GetNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a recovery point.
     * </p>
     * 
     * @param getRecoveryPointRequest
     * @return Result of the GetRecoveryPoint operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecoveryPointResult getRecoveryPoint(GetRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecoveryPoint(request);
    }

    @SdkInternalApi
    final GetRecoveryPointResult executeGetRecoveryPoint(GetRecoveryPointRequest getRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecoveryPointRequest> request = null;
        Response<GetRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return Result of the GetSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSnapshotResult getSnapshot(GetSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetSnapshot(request);
    }

    @SdkInternalApi
    final GetSnapshotResult executeGetSnapshot(GetSnapshotRequest getSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotRequest> request = null;
        Response<GetSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a <code>TableRestoreStatus</code> object.
     * </p>
     * 
     * @param getTableRestoreStatusRequest
     * @return Result of the GetTableRestoreStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTableRestoreStatusResult getTableRestoreStatus(GetTableRestoreStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetTableRestoreStatus(request);
    }

    @SdkInternalApi
    final GetTableRestoreStatusResult executeGetTableRestoreStatus(GetTableRestoreStatusRequest getTableRestoreStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableRestoreStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableRestoreStatusRequest> request = null;
        Response<GetTableRestoreStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableRestoreStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableRestoreStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTableRestoreStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableRestoreStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetTableRestoreStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a usage limit.
     * </p>
     * 
     * @param getUsageLimitRequest
     * @return Result of the GetUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetUsageLimitResult getUsageLimit(GetUsageLimitRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsageLimit(request);
    }

    @SdkInternalApi
    final GetUsageLimitResult executeGetUsageLimit(GetUsageLimitRequest getUsageLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageLimitRequest> request = null;
        Response<GetUsageLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageLimitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsageLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsageLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsageLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsageLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific workgroup.
     * </p>
     * 
     * @param getWorkgroupRequest
     * @return Result of the GetWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWorkgroupResult getWorkgroup(GetWorkgroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkgroup(request);
    }

    @SdkInternalApi
    final GetWorkgroupResult executeGetWorkgroup(GetWorkgroupRequest getWorkgroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkgroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkgroupRequest> request = null;
        Response<GetWorkgroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkgroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkgroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkgroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkgroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkgroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>EndpointAccess</code> objects and relevant information.
     * </p>
     * 
     * @param listEndpointAccessRequest
     * @return Result of the ListEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEndpointAccessResult listEndpointAccess(ListEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeListEndpointAccess(request);
    }

    @SdkInternalApi
    final ListEndpointAccessResult executeListEndpointAccess(ListEndpointAccessRequest listEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(listEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointAccessRequest> request = null;
        Response<ListEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a list of specified namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNamespacesResult listNamespaces(ListNamespacesRequest request) {
        request = beforeClientExecution(request);
        return executeListNamespaces(request);
    }

    @SdkInternalApi
    final ListNamespacesResult executeListNamespaces(ListNamespacesRequest listNamespacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamespacesRequest> request = null;
        Response<ListNamespacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamespacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNamespacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamespaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamespacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNamespacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of recovery points.
     * </p>
     * 
     * @param listRecoveryPointsRequest
     * @return Result of the ListRecoveryPoints operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecoveryPointsResult listRecoveryPoints(ListRecoveryPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecoveryPoints(request);
    }

    @SdkInternalApi
    final ListRecoveryPointsResult executeListRecoveryPoints(ListRecoveryPointsRequest listRecoveryPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsRequest> request = null;
        Response<ListRecoveryPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecoveryPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecoveryPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecoveryPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecoveryPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of snapshots.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return Result of the ListSnapshots operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSnapshotsResult listSnapshots(ListSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeListSnapshots(request);
    }

    @SdkInternalApi
    final ListSnapshotsResult executeListSnapshots(ListSnapshotsRequest listSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSnapshotsRequest> request = null;
        Response<ListSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an array of <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param listTableRestoreStatusRequest
     * @return Result of the ListTableRestoreStatus operation returned by the service.
     * @throws InvalidPaginationException
     *         The provided pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTableRestoreStatusResult listTableRestoreStatus(ListTableRestoreStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListTableRestoreStatus(request);
    }

    @SdkInternalApi
    final ListTableRestoreStatusResult executeListTableRestoreStatus(ListTableRestoreStatusRequest listTableRestoreStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listTableRestoreStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTableRestoreStatusRequest> request = null;
        Response<ListTableRestoreStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTableRestoreStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTableRestoreStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTableRestoreStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTableRestoreStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTableRestoreStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
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
     * Lists all usage limits within Amazon Redshift Serverless.
     * </p>
     * 
     * @param listUsageLimitsRequest
     * @return Result of the ListUsageLimits operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidPaginationException
     *         The provided pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListUsageLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUsageLimitsResult listUsageLimits(ListUsageLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeListUsageLimits(request);
    }

    @SdkInternalApi
    final ListUsageLimitsResult executeListUsageLimits(ListUsageLimitsRequest listUsageLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsageLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsageLimitsRequest> request = null;
        Response<ListUsageLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsageLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsageLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsageLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsageLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsageLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a list of specified workgroups.
     * </p>
     * 
     * @param listWorkgroupsRequest
     * @return Result of the ListWorkgroups operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListWorkgroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkgroupsResult listWorkgroups(ListWorkgroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkgroups(request);
    }

    @SdkInternalApi
    final ListWorkgroupsResult executeListWorkgroups(ListWorkgroupsRequest listWorkgroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkgroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkgroupsRequest> request = null;
        Response<ListWorkgroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkgroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkgroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkgroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkgroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkgroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web
     * Services accounts.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restore the data from a recovery point.
     * </p>
     * 
     * @param restoreFromRecoveryPointRequest
     * @return Result of the RestoreFromRecoveryPoint operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.RestoreFromRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreFromRecoveryPointResult restoreFromRecoveryPoint(RestoreFromRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreFromRecoveryPoint(request);
    }

    @SdkInternalApi
    final RestoreFromRecoveryPointResult executeRestoreFromRecoveryPoint(RestoreFromRecoveryPointRequest restoreFromRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreFromRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromRecoveryPointRequest> request = null;
        Response<RestoreFromRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(restoreFromRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreFromRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreFromRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreFromRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a namespace from a snapshot.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     * @return Result of the RestoreFromSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreFromSnapshot(request);
    }

    @SdkInternalApi
    final RestoreFromSnapshotResult executeRestoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a table from a snapshot to your Amazon Redshift Serverless instance.
     * </p>
     * 
     * @param restoreTableFromSnapshotRequest
     * @return Result of the RestoreTableFromSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.RestoreTableFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreTableFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreTableFromSnapshotResult restoreTableFromSnapshot(RestoreTableFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreTableFromSnapshot(request);
    }

    @SdkInternalApi
    final RestoreTableFromSnapshotResult executeRestoreTableFromSnapshot(RestoreTableFromSnapshotRequest restoreTableFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreTableFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableFromSnapshotRequest> request = null;
        Response<RestoreTableFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreTableFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(restoreTableFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreTableFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreTableFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreTableFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
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
     * Removes a tag or set of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
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
     * Updates an Amazon Redshift Serverless managed endpoint.
     * </p>
     * 
     * @param updateEndpointAccessRequest
     * @return Result of the UpdateEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSRedshiftServerless.UpdateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEndpointAccessResult updateEndpointAccess(UpdateEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpointAccess(request);
    }

    @SdkInternalApi
    final UpdateEndpointAccessResult executeUpdateEndpointAccess(UpdateEndpointAccessRequest updateEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointAccessRequest> request = null;
        Response<UpdateEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a namespace with the specified settings.
     * </p>
     * 
     * @param updateNamespaceRequest
     * @return Result of the UpdateNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNamespaceResult updateNamespace(UpdateNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNamespace(request);
    }

    @SdkInternalApi
    final UpdateNamespaceResult executeUpdateNamespace(UpdateNamespaceRequest updateNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNamespaceRequest> request = null;
        Response<UpdateNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSnapshotResult updateSnapshot(UpdateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSnapshot(request);
    }

    @SdkInternalApi
    final UpdateSnapshotResult executeUpdateSnapshot(UpdateSnapshotRequest updateSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotRequest> request = null;
        Response<UpdateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
     * </p>
     * 
     * @param updateUsageLimitRequest
     * @return Result of the UpdateUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUsageLimitResult updateUsageLimit(UpdateUsageLimitRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUsageLimit(request);
    }

    @SdkInternalApi
    final UpdateUsageLimitResult executeUpdateUsageLimit(UpdateUsageLimitRequest updateUsageLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUsageLimitRequest> request = null;
        Response<UpdateUsageLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUsageLimitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUsageLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUsageLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUsageLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUsageLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a workgroup with the specified configuration settings.
     * </p>
     * 
     * @param updateWorkgroupRequest
     * @return Result of the UpdateWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InsufficientCapacityException
     *         There is an insufficient capacity to perform the action.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkgroupResult updateWorkgroup(UpdateWorkgroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkgroup(request);
    }

    @SdkInternalApi
    final UpdateWorkgroupResult executeUpdateWorkgroup(UpdateWorkgroupRequest updateWorkgroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkgroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkgroupRequest> request = null;
        Response<UpdateWorkgroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkgroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkgroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkgroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkgroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkgroupResultJsonUnmarshaller());
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
