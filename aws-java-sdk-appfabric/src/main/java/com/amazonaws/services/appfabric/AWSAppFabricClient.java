/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appfabric;

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

import com.amazonaws.services.appfabric.AWSAppFabricClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appfabric.model.*;

import com.amazonaws.services.appfabric.model.transform.*;

/**
 * Client for accessing AppFabric. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Web Services AppFabric quickly connects software as a service (SaaS) applications across your organization.
 * This allows IT and security teams to easily manage and secure applications using a standard schema, and employees can
 * complete everyday tasks faster using generative artificial intelligence (AI). You can use these APIs to complete
 * AppFabric tasks, such as setting up audit log ingestions or viewing user access. For more information about
 * AppFabric, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/appfabric/latest/adminguide/">Amazon Web Services AppFabric Administration
 * Guide</a>. For more information about using the Command Line Interface (CLI) to manage your AppFabric resources, see
 * the <a href="https://docs.aws.amazon.com/cli/latest/reference/appfabric/index.html">AppFabric section of the CLI
 * Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppFabricClient extends AmazonWebServiceClient implements AWSAppFabric {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppFabric.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appfabric";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appfabric.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appfabric.model.AWSAppFabricException.class));

    public static AWSAppFabricClientBuilder builder() {
        return AWSAppFabricClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AppFabric using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppFabricClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AppFabric using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppFabricClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appfabric.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appfabric/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appfabric/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets user access details in a batch request.
     * </p>
     * <p>
     * This action polls data from the tasks that are kicked off by the <code>StartUserAccessTasks</code> action.
     * </p>
     * 
     * @param batchGetUserAccessTasksRequest
     * @return Result of the BatchGetUserAccessTasks operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.BatchGetUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetUserAccessTasksResult batchGetUserAccessTasks(BatchGetUserAccessTasksRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetUserAccessTasks(request);
    }

    @SdkInternalApi
    final BatchGetUserAccessTasksResult executeBatchGetUserAccessTasks(BatchGetUserAccessTasksRequest batchGetUserAccessTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetUserAccessTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetUserAccessTasksRequest> request = null;
        Response<BatchGetUserAccessTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetUserAccessTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetUserAccessTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetUserAccessTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetUserAccessTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetUserAccessTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Establishes a connection between Amazon Web Services AppFabric and an application, which allows AppFabric to call
     * the APIs of the application.
     * </p>
     * 
     * @param connectAppAuthorizationRequest
     * @return Result of the ConnectAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ConnectAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ConnectAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConnectAppAuthorizationResult connectAppAuthorization(ConnectAppAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeConnectAppAuthorization(request);
    }

    @SdkInternalApi
    final ConnectAppAuthorizationResult executeConnectAppAuthorization(ConnectAppAuthorizationRequest connectAppAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(connectAppAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectAppAuthorizationRequest> request = null;
        Response<ConnectAppAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectAppAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(connectAppAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConnectAppAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConnectAppAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ConnectAppAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * 
     * @param createAppAuthorizationRequest
     * @return Result of the CreateAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAppAuthorizationResult createAppAuthorization(CreateAppAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppAuthorization(request);
    }

    @SdkInternalApi
    final CreateAppAuthorizationResult executeCreateAppAuthorization(CreateAppAuthorizationRequest createAppAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppAuthorizationRequest> request = null;
        Response<CreateAppAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAppAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an app bundle to collect data from an application using AppFabric.
     * </p>
     * 
     * @param createAppBundleRequest
     * @return Result of the CreateAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppBundleResult createAppBundle(CreateAppBundleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppBundle(request);
    }

    @SdkInternalApi
    final CreateAppBundleResult executeCreateAppBundle(CreateAppBundleRequest createAppBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppBundleRequest> request = null;
        Response<CreateAppBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data ingestion for an application.
     * </p>
     * 
     * @param createIngestionRequest
     * @return Result of the CreateIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIngestionResult createIngestion(CreateIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIngestion(request);
    }

    @SdkInternalApi
    final CreateIngestionResult executeCreateIngestion(CreateIngestionRequest createIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(createIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIngestionRequest> request = null;
        Response<CreateIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param createIngestionDestinationRequest
     * @return Result of the CreateIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIngestionDestinationResult createIngestionDestination(CreateIngestionDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIngestionDestination(request);
    }

    @SdkInternalApi
    final CreateIngestionDestinationResult executeCreateIngestionDestination(CreateIngestionDestinationRequest createIngestionDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createIngestionDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIngestionDestinationRequest> request = null;
        Response<CreateIngestionDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIngestionDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createIngestionDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIngestionDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIngestionDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIngestionDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an app authorization. You must delete the associated ingestion before you can delete an app
     * authorization.
     * </p>
     * 
     * @param deleteAppAuthorizationRequest
     * @return Result of the DeleteAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppAuthorizationResult deleteAppAuthorization(DeleteAppAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppAuthorization(request);
    }

    @SdkInternalApi
    final DeleteAppAuthorizationResult executeDeleteAppAuthorization(DeleteAppAuthorizationRequest deleteAppAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppAuthorizationRequest> request = null;
        Response<DeleteAppAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAppAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an app bundle. You must delete all associated app authorizations before you can delete an app bundle.
     * </p>
     * 
     * @param deleteAppBundleRequest
     * @return Result of the DeleteAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppBundleResult deleteAppBundle(DeleteAppBundleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppBundle(request);
    }

    @SdkInternalApi
    final DeleteAppBundleResult executeDeleteAppBundle(DeleteAppBundleRequest deleteAppBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppBundleRequest> request = null;
        Response<DeleteAppBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an ingestion. You must stop (disable) the ingestion and you must delete all associated ingestion
     * destinations before you can delete an app ingestion.
     * </p>
     * 
     * @param deleteIngestionRequest
     * @return Result of the DeleteIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIngestionResult deleteIngestion(DeleteIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIngestion(request);
    }

    @SdkInternalApi
    final DeleteIngestionResult executeDeleteIngestion(DeleteIngestionRequest deleteIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIngestionRequest> request = null;
        Response<DeleteIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an ingestion destination.
     * </p>
     * <p>
     * This deletes the association between an ingestion and it's destination. It doesn't delete previously ingested
     * data or the storage destination, such as the Amazon S3 bucket where the data is delivered. If the ingestion
     * destination is deleted while the associated ingestion is enabled, the ingestion will fail and is eventually
     * disabled.
     * </p>
     * 
     * @param deleteIngestionDestinationRequest
     * @return Result of the DeleteIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIngestionDestinationResult deleteIngestionDestination(DeleteIngestionDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIngestionDestination(request);
    }

    @SdkInternalApi
    final DeleteIngestionDestinationResult executeDeleteIngestionDestination(DeleteIngestionDestinationRequest deleteIngestionDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIngestionDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIngestionDestinationRequest> request = null;
        Response<DeleteIngestionDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIngestionDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteIngestionDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIngestionDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIngestionDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIngestionDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an app authorization.
     * </p>
     * 
     * @param getAppAuthorizationRequest
     * @return Result of the GetAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppAuthorization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAppAuthorizationResult getAppAuthorization(GetAppAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppAuthorization(request);
    }

    @SdkInternalApi
    final GetAppAuthorizationResult executeGetAppAuthorization(GetAppAuthorizationRequest getAppAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppAuthorizationRequest> request = null;
        Response<GetAppAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an app bundle.
     * </p>
     * 
     * @param getAppBundleRequest
     * @return Result of the GetAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppBundleResult getAppBundle(GetAppBundleRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppBundle(request);
    }

    @SdkInternalApi
    final GetAppBundleResult executeGetAppBundle(GetAppBundleRequest getAppBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppBundleRequest> request = null;
        Response<GetAppBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an ingestion.
     * </p>
     * 
     * @param getIngestionRequest
     * @return Result of the GetIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIngestionResult getIngestion(GetIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeGetIngestion(request);
    }

    @SdkInternalApi
    final GetIngestionResult executeGetIngestion(GetIngestionRequest getIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(getIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIngestionRequest> request = null;
        Response<GetIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an ingestion destination.
     * </p>
     * 
     * @param getIngestionDestinationRequest
     * @return Result of the GetIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIngestionDestinationResult getIngestionDestination(GetIngestionDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeGetIngestionDestination(request);
    }

    @SdkInternalApi
    final GetIngestionDestinationResult executeGetIngestionDestination(GetIngestionDestinationRequest getIngestionDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(getIngestionDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIngestionDestinationRequest> request = null;
        Response<GetIngestionDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIngestionDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIngestionDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIngestionDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIngestionDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIngestionDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all app authorizations configured for an app bundle.
     * </p>
     * 
     * @param listAppAuthorizationsRequest
     * @return Result of the ListAppAuthorizations operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListAppAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppAuthorizationsResult listAppAuthorizations(ListAppAuthorizationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppAuthorizations(request);
    }

    @SdkInternalApi
    final ListAppAuthorizationsResult executeListAppAuthorizations(ListAppAuthorizationsRequest listAppAuthorizationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppAuthorizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppAuthorizationsRequest> request = null;
        Response<ListAppAuthorizationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppAuthorizationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppAuthorizationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppAuthorizations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppAuthorizationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAppAuthorizationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of app bundles.
     * </p>
     * 
     * @param listAppBundlesRequest
     * @return Result of the ListAppBundles operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListAppBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppBundles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppBundlesResult listAppBundles(ListAppBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeListAppBundles(request);
    }

    @SdkInternalApi
    final ListAppBundlesResult executeListAppBundles(ListAppBundlesRequest listAppBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppBundlesRequest> request = null;
        Response<ListAppBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all ingestion destinations configured for an ingestion.
     * </p>
     * 
     * @param listIngestionDestinationsRequest
     * @return Result of the ListIngestionDestinations operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListIngestionDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestionDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIngestionDestinationsResult listIngestionDestinations(ListIngestionDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeListIngestionDestinations(request);
    }

    @SdkInternalApi
    final ListIngestionDestinationsResult executeListIngestionDestinations(ListIngestionDestinationsRequest listIngestionDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIngestionDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngestionDestinationsRequest> request = null;
        Response<ListIngestionDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngestionDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listIngestionDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIngestionDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIngestionDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIngestionDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all ingestions configured for an app bundle.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return Result of the ListIngestions operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIngestionsResult listIngestions(ListIngestionsRequest request) {
        request = beforeClientExecution(request);
        return executeListIngestions(request);
    }

    @SdkInternalApi
    final ListIngestionsResult executeListIngestions(ListIngestionsRequest listIngestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIngestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngestionsRequest> request = null;
        Response<ListIngestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIngestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIngestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIngestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIngestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
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
     * Starts (enables) an ingestion, which collects data from an application.
     * </p>
     * 
     * @param startIngestionRequest
     * @return Result of the StartIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StartIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartIngestionResult startIngestion(StartIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeStartIngestion(request);
    }

    @SdkInternalApi
    final StartIngestionResult executeStartIngestion(StartIngestionRequest startIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(startIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartIngestionRequest> request = null;
        Response<StartIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the tasks to search user access status for a specific email address.
     * </p>
     * <p>
     * The tasks are stopped when the user access status data is found. The tasks are terminated when the API calls to
     * the application time out.
     * </p>
     * 
     * @param startUserAccessTasksRequest
     * @return Result of the StartUserAccessTasks operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StartUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartUserAccessTasks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartUserAccessTasksResult startUserAccessTasks(StartUserAccessTasksRequest request) {
        request = beforeClientExecution(request);
        return executeStartUserAccessTasks(request);
    }

    @SdkInternalApi
    final StartUserAccessTasksResult executeStartUserAccessTasks(StartUserAccessTasksRequest startUserAccessTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(startUserAccessTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartUserAccessTasksRequest> request = null;
        Response<StartUserAccessTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartUserAccessTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startUserAccessTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartUserAccessTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartUserAccessTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartUserAccessTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops (disables) an ingestion.
     * </p>
     * 
     * @param stopIngestionRequest
     * @return Result of the StopIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StopIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StopIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopIngestionResult stopIngestion(StopIngestionRequest request) {
        request = beforeClientExecution(request);
        return executeStopIngestion(request);
    }

    @SdkInternalApi
    final StopIngestionResult executeStopIngestion(StopIngestionRequest stopIngestionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopIngestionRequest> request = null;
        Response<StopIngestionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopIngestionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopIngestionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopIngestion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopIngestionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopIngestionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
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
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
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
     * Updates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * <p>
     * If the app authorization was in a <code>connected</code> state, updating the app authorization will set it back
     * to a <code>PendingConnect</code> state.
     * </p>
     * 
     * @param updateAppAuthorizationRequest
     * @return Result of the UpdateAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UpdateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAppAuthorizationResult updateAppAuthorization(UpdateAppAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAppAuthorization(request);
    }

    @SdkInternalApi
    final UpdateAppAuthorizationResult executeUpdateAppAuthorization(UpdateAppAuthorizationRequest updateAppAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppAuthorizationRequest> request = null;
        Response<UpdateAppAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAppAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAppAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param updateIngestionDestinationRequest
     * @return Result of the UpdateIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UpdateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIngestionDestinationResult updateIngestionDestination(UpdateIngestionDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIngestionDestination(request);
    }

    @SdkInternalApi
    final UpdateIngestionDestinationResult executeUpdateIngestionDestination(UpdateIngestionDestinationRequest updateIngestionDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIngestionDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIngestionDestinationRequest> request = null;
        Response<UpdateIngestionDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIngestionDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIngestionDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppFabric");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIngestionDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIngestionDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIngestionDestinationResultJsonUnmarshaller());
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
