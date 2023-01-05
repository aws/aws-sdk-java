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
package com.amazonaws.services.iottwinmaker;

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

import com.amazonaws.services.iottwinmaker.AWSIoTTwinMakerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.services.iottwinmaker.model.transform.*;

/**
 * Client for accessing AWS IoT TwinMaker. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * IoT TwinMaker is a service that enables you to build operational digital twins of physical systems. IoT TwinMaker
 * overlays measurements and analysis from real-world sensors, cameras, and enterprise applications so you can create
 * data visualizations to monitor your physical factory, building, or industrial plant. You can use this real-world data
 * to monitor operations and diagnose and repair errors.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTTwinMakerClient extends AmazonWebServiceClient implements AWSIoTTwinMaker {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTTwinMaker.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iottwinmaker";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConnectorFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ConnectorFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConnectorTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ConnectorTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iottwinmaker.model.transform.QueryTimeoutExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iottwinmaker.model.AWSIoTTwinMakerException.class));

    public static AWSIoTTwinMakerClientBuilder builder() {
        return AWSIoTTwinMakerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT TwinMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTTwinMakerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT TwinMaker using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTTwinMakerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iottwinmaker.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iottwinmaker/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iottwinmaker/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sets values for multiple time series properties.
     * </p>
     * 
     * @param batchPutPropertyValuesRequest
     * @return Result of the BatchPutPropertyValues operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.BatchPutPropertyValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchPutPropertyValuesResult batchPutPropertyValues(BatchPutPropertyValuesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutPropertyValues(request);
    }

    @SdkInternalApi
    final BatchPutPropertyValuesResult executeBatchPutPropertyValues(BatchPutPropertyValuesRequest batchPutPropertyValuesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutPropertyValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutPropertyValuesRequest> request = null;
        Response<BatchPutPropertyValuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutPropertyValuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutPropertyValuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutPropertyValues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutPropertyValuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchPutPropertyValuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a component type.
     * </p>
     * 
     * @param createComponentTypeRequest
     * @return Result of the CreateComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateComponentTypeResult createComponentType(CreateComponentTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComponentType(request);
    }

    @SdkInternalApi
    final CreateComponentTypeResult executeCreateComponentType(CreateComponentTypeRequest createComponentTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createComponentTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentTypeRequest> request = null;
        Response<CreateComponentTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComponentTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComponentType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComponentTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateComponentTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an entity.
     * </p>
     * 
     * @param createEntityRequest
     * @return Result of the CreateEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEntityResult createEntity(CreateEntityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEntity(request);
    }

    @SdkInternalApi
    final CreateEntityResult executeCreateEntity(CreateEntityRequest createEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(createEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEntityRequest> request = null;
        Response<CreateEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a scene.
     * </p>
     * 
     * @param createSceneRequest
     * @return Result of the CreateScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateScene" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSceneResult createScene(CreateSceneRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScene(request);
    }

    @SdkInternalApi
    final CreateSceneResult executeCreateScene(CreateSceneRequest createSceneRequest) {

        ExecutionContext executionContext = createExecutionContext(createSceneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSceneRequest> request = null;
        Response<CreateSceneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSceneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSceneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScene");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSceneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSceneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action creates a SyncJob.
     * </p>
     * 
     * @param createSyncJobRequest
     * @return Result of the CreateSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSyncJobResult createSyncJob(CreateSyncJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSyncJob(request);
    }

    @SdkInternalApi
    final CreateSyncJobResult executeCreateSyncJob(CreateSyncJobRequest createSyncJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createSyncJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSyncJobRequest> request = null;
        Response<CreateSyncJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSyncJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSyncJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSyncJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSyncJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSyncJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a workplace.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspace(request);
    }

    @SdkInternalApi
    final CreateWorkspaceResult executeCreateWorkspace(CreateWorkspaceRequest createWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceRequest> request = null;
        Response<CreateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a component type.
     * </p>
     * 
     * @param deleteComponentTypeRequest
     * @return Result of the DeleteComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteComponentTypeResult deleteComponentType(DeleteComponentTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComponentType(request);
    }

    @SdkInternalApi
    final DeleteComponentTypeResult executeDeleteComponentType(DeleteComponentTypeRequest deleteComponentTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComponentTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentTypeRequest> request = null;
        Response<DeleteComponentTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteComponentTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComponentType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComponentTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteComponentTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an entity.
     * </p>
     * 
     * @param deleteEntityRequest
     * @return Result of the DeleteEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.DeleteEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteEntity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEntityResult deleteEntity(DeleteEntityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEntity(request);
    }

    @SdkInternalApi
    final DeleteEntityResult executeDeleteEntity(DeleteEntityRequest deleteEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEntityRequest> request = null;
        Response<DeleteEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a scene.
     * </p>
     * 
     * @param deleteSceneRequest
     * @return Result of the DeleteScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteScene" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSceneResult deleteScene(DeleteSceneRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScene(request);
    }

    @SdkInternalApi
    final DeleteSceneResult executeDeleteScene(DeleteSceneRequest deleteSceneRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSceneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSceneRequest> request = null;
        Response<DeleteSceneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSceneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSceneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScene");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSceneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSceneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the SyncJob.
     * </p>
     * 
     * @param deleteSyncJobRequest
     * @return Result of the DeleteSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.DeleteSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSyncJobResult deleteSyncJob(DeleteSyncJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSyncJob(request);
    }

    @SdkInternalApi
    final DeleteSyncJobResult executeDeleteSyncJob(DeleteSyncJobRequest deleteSyncJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSyncJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSyncJobRequest> request = null;
        Response<DeleteSyncJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSyncJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSyncJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSyncJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSyncJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSyncJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspace(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceResult executeDeleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceRequest> request = null;
        Response<DeleteWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Run queries to access information from your knowledge graph of entities within individual workspaces.
     * </p>
     * 
     * @param executeQueryRequest
     * @return Result of the ExecuteQuery operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws QueryTimeoutException
     *         The query timeout exception.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ExecuteQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ExecuteQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExecuteQueryResult executeQuery(ExecuteQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteQuery(request);
    }

    @SdkInternalApi
    final ExecuteQueryResult executeExecuteQuery(ExecuteQueryRequest executeQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteQueryRequest> request = null;
        Response<ExecuteQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExecuteQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a component type.
     * </p>
     * 
     * @param getComponentTypeRequest
     * @return Result of the GetComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetComponentType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetComponentTypeResult getComponentType(GetComponentTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponentType(request);
    }

    @SdkInternalApi
    final GetComponentTypeResult executeGetComponentType(GetComponentTypeRequest getComponentTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentTypeRequest> request = null;
        Response<GetComponentTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComponentTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponentType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComponentTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an entity.
     * </p>
     * 
     * @param getEntityRequest
     * @return Result of the GetEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetEntity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEntityResult getEntity(GetEntityRequest request) {
        request = beforeClientExecution(request);
        return executeGetEntity(request);
    }

    @SdkInternalApi
    final GetEntityResult executeGetEntity(GetEntityRequest getEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(getEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEntityRequest> request = null;
        Response<GetEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEntityResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the pricing plan.
     * </p>
     * 
     * @param getPricingPlanRequest
     * @return Result of the GetPricingPlan operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetPricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPricingPlanResult getPricingPlan(GetPricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeGetPricingPlan(request);
    }

    @SdkInternalApi
    final GetPricingPlanResult executeGetPricingPlan(GetPricingPlanRequest getPricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(getPricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPricingPlanRequest> request = null;
        Response<GetPricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPricingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the property values for a component, component type, entity, or workspace.
     * </p>
     * <p>
     * You must specify a value for either <code>componentName</code>, <code>componentTypeId</code>,
     * <code>entityId</code>, or <code>workspaceId</code>.
     * </p>
     * 
     * @param getPropertyValueRequest
     * @return Result of the GetPropertyValue operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ConnectorFailureException
     *         The connector failed.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConnectorTimeoutException
     *         The connector timed out.
     * @sample AWSIoTTwinMaker.GetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPropertyValueResult getPropertyValue(GetPropertyValueRequest request) {
        request = beforeClientExecution(request);
        return executeGetPropertyValue(request);
    }

    @SdkInternalApi
    final GetPropertyValueResult executeGetPropertyValue(GetPropertyValueRequest getPropertyValueRequest) {

        ExecutionContext executionContext = createExecutionContext(getPropertyValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPropertyValueRequest> request = null;
        Response<GetPropertyValueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPropertyValueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPropertyValueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPropertyValue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPropertyValueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPropertyValueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the history of a time series property value for a component, component type, entity,
     * or workspace.
     * </p>
     * <p>
     * You must specify a value for <code>workspaceId</code>. For entity-specific queries, specify values for
     * <code>componentName</code> and <code>entityId</code>. For cross-entity quries, specify a value for
     * <code>componentTypeId</code>.
     * </p>
     * 
     * @param getPropertyValueHistoryRequest
     * @return Result of the GetPropertyValueHistory operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ConnectorFailureException
     *         The connector failed.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConnectorTimeoutException
     *         The connector timed out.
     * @sample AWSIoTTwinMaker.GetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPropertyValueHistoryResult getPropertyValueHistory(GetPropertyValueHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetPropertyValueHistory(request);
    }

    @SdkInternalApi
    final GetPropertyValueHistoryResult executeGetPropertyValueHistory(GetPropertyValueHistoryRequest getPropertyValueHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getPropertyValueHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPropertyValueHistoryRequest> request = null;
        Response<GetPropertyValueHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPropertyValueHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPropertyValueHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPropertyValueHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPropertyValueHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPropertyValueHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a scene.
     * </p>
     * 
     * @param getSceneRequest
     * @return Result of the GetScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSceneResult getScene(GetSceneRequest request) {
        request = beforeClientExecution(request);
        return executeGetScene(request);
    }

    @SdkInternalApi
    final GetSceneResult executeGetScene(GetSceneRequest getSceneRequest) {

        ExecutionContext executionContext = createExecutionContext(getSceneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSceneRequest> request = null;
        Response<GetSceneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSceneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSceneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetScene");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSceneResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSceneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the SyncJob.
     * </p>
     * 
     * @param getSyncJobRequest
     * @return Result of the GetSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSyncJobResult getSyncJob(GetSyncJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetSyncJob(request);
    }

    @SdkInternalApi
    final GetSyncJobResult executeGetSyncJob(GetSyncJobRequest getSyncJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getSyncJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSyncJobRequest> request = null;
        Response<GetSyncJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSyncJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSyncJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSyncJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSyncJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSyncJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a workspace.
     * </p>
     * 
     * @param getWorkspaceRequest
     * @return Result of the GetWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkspaceResult getWorkspace(GetWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkspace(request);
    }

    @SdkInternalApi
    final GetWorkspaceResult executeGetWorkspace(GetWorkspaceRequest getWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkspaceRequest> request = null;
        Response<GetWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all component types in a workspace.
     * </p>
     * 
     * @param listComponentTypesRequest
     * @return Result of the ListComponentTypes operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.ListComponentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListComponentTypesResult listComponentTypes(ListComponentTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListComponentTypes(request);
    }

    @SdkInternalApi
    final ListComponentTypesResult executeListComponentTypes(ListComponentTypesRequest listComponentTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentTypesRequest> request = null;
        Response<ListComponentTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponentTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComponentTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all entities in a workspace.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return Result of the ListEntities operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEntitiesResult listEntities(ListEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListEntities(request);
    }

    @SdkInternalApi
    final ListEntitiesResult executeListEntities(ListEntitiesRequest listEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesRequest> request = null;
        Response<ListEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all scenes in a workspace.
     * </p>
     * 
     * @param listScenesRequest
     * @return Result of the ListScenes operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.ListScenes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListScenes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListScenesResult listScenes(ListScenesRequest request) {
        request = beforeClientExecution(request);
        return executeListScenes(request);
    }

    @SdkInternalApi
    final ListScenesResult executeListScenes(ListScenesRequest listScenesRequest) {

        ExecutionContext executionContext = createExecutionContext(listScenesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScenesRequest> request = null;
        Response<ListScenesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScenesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScenesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScenes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScenesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScenesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all SyncJobs.
     * </p>
     * 
     * @param listSyncJobsRequest
     * @return Result of the ListSyncJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSyncJobsResult listSyncJobs(ListSyncJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListSyncJobs(request);
    }

    @SdkInternalApi
    final ListSyncJobsResult executeListSyncJobs(ListSyncJobsRequest listSyncJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSyncJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSyncJobsRequest> request = null;
        Response<ListSyncJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSyncJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSyncJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSyncJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSyncJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSyncJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the sync resources.
     * </p>
     * 
     * @param listSyncResourcesRequest
     * @return Result of the ListSyncResources operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListSyncResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSyncResourcesResult listSyncResources(ListSyncResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListSyncResources(request);
    }

    @SdkInternalApi
    final ListSyncResourcesResult executeListSyncResources(ListSyncResourcesRequest listSyncResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSyncResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSyncResourcesRequest> request = null;
        Response<ListSyncResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSyncResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSyncResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSyncResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSyncResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSyncResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about workspaces in the current account.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWorkspacesResult listWorkspaces(ListWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaces(request);
    }

    @SdkInternalApi
    final ListWorkspacesResult executeListWorkspaces(ListWorkspacesRequest listWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspacesRequest> request = null;
        Response<ListWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     *         The number of tags exceeds the limit.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates information in a component type.
     * </p>
     * 
     * @param updateComponentTypeRequest
     * @return Result of the UpdateComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateComponentTypeResult updateComponentType(UpdateComponentTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComponentType(request);
    }

    @SdkInternalApi
    final UpdateComponentTypeResult executeUpdateComponentType(UpdateComponentTypeRequest updateComponentTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateComponentTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateComponentTypeRequest> request = null;
        Response<UpdateComponentTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateComponentTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateComponentTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComponentType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateComponentTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateComponentTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an entity.
     * </p>
     * 
     * @param updateEntityRequest
     * @return Result of the UpdateEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEntityResult updateEntity(UpdateEntityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEntity(request);
    }

    @SdkInternalApi
    final UpdateEntityResult executeUpdateEntity(UpdateEntityRequest updateEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEntityRequest> request = null;
        Response<UpdateEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return Result of the UpdatePricingPlan operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdatePricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePricingPlanResult updatePricingPlan(UpdatePricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePricingPlan(request);
    }

    @SdkInternalApi
    final UpdatePricingPlanResult executeUpdatePricingPlan(UpdatePricingPlanRequest updatePricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePricingPlanRequest> request = null;
        Response<UpdatePricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePricingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a scene.
     * </p>
     * 
     * @param updateSceneRequest
     * @return Result of the UpdateScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.UpdateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSceneResult updateScene(UpdateSceneRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScene(request);
    }

    @SdkInternalApi
    final UpdateSceneResult executeUpdateScene(UpdateSceneRequest updateSceneRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSceneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSceneRequest> request = null;
        Response<UpdateSceneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSceneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSceneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScene");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSceneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSceneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a workspace.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return Result of the UpdateWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWorkspaceResult updateWorkspace(UpdateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspace(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceResult executeUpdateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceRequest> request = null;
        Response<UpdateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTTwinMaker");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
