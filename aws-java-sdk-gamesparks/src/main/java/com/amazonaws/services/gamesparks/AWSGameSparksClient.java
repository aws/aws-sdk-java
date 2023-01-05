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
package com.amazonaws.services.gamesparks;

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

import com.amazonaws.services.gamesparks.AWSGameSparksClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.gamesparks.model.*;
import com.amazonaws.services.gamesparks.model.transform.*;

/**
 * Client for accessing GameSparks. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGameSparksClient extends AmazonWebServiceClient implements AWSGameSparks {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGameSparks.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "gamesparks";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gamesparks.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.gamesparks.model.AWSGameSparksException.class));

    public static AWSGameSparksClientBuilder builder() {
        return AWSGameSparksClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on GameSparks using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGameSparksClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on GameSparks using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGameSparksClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("gamesparks.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/gamesparks/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/gamesparks/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new game with an empty configuration. After creating your game, you can update the configuration using
     * <code>UpdateGameConfiguration</code> or <code>ImportGameConfiguration</code>.
     * </p>
     * 
     * @param createGameRequest
     * @return Result of the CreateGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.CreateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateGame" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGameResult createGame(CreateGameRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGame(request);
    }

    @SdkInternalApi
    final CreateGameResult executeCreateGame(CreateGameRequest createGameRequest) {

        ExecutionContext executionContext = createExecutionContext(createGameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGameRequest> request = null;
        Response<CreateGameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGame");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGameResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of the game configuration.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Creates a new stage for stage-by-stage game development and deployment.
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStageResult createStage(CreateStageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStage(request);
    }

    @SdkInternalApi
    final CreateStageResult executeCreateStage(CreateStageRequest createStageRequest) {

        ExecutionContext executionContext = createExecutionContext(createStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStageRequest> request = null;
        Response<CreateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a game.
     * </p>
     * 
     * @param deleteGameRequest
     * @return Result of the DeleteGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DeleteGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteGame" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGameResult deleteGame(DeleteGameRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGame(request);
    }

    @SdkInternalApi
    final DeleteGameResult executeDeleteGame(DeleteGameRequest deleteGameRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGameRequest> request = null;
        Response<DeleteGameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGame");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGameResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a stage from a game, along with the associated game runtime.
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStageResult deleteStage(DeleteStageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStage(request);
    }

    @SdkInternalApi
    final DeleteStageResult executeDeleteStage(DeleteStageRequest deleteStageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStageRequest> request = null;
        Response<DeleteStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects a player from the game runtime.
     * </p>
     * <p>
     * If a player has multiple connections, this operation attempts to close all of them.
     * </p>
     * 
     * @param disconnectPlayerRequest
     * @return Result of the DisconnectPlayer operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DisconnectPlayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DisconnectPlayer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisconnectPlayerResult disconnectPlayer(DisconnectPlayerRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectPlayer(request);
    }

    @SdkInternalApi
    final DisconnectPlayerResult executeDisconnectPlayer(DisconnectPlayerRequest disconnectPlayerRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectPlayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectPlayerRequest> request = null;
        Response<DisconnectPlayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectPlayerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectPlayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectPlayer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectPlayerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisconnectPlayerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a game configuration snapshot.
     * </p>
     * 
     * @param exportSnapshotRequest
     * @return Result of the ExportSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportSnapshotResult exportSnapshot(ExportSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeExportSnapshot(request);
    }

    @SdkInternalApi
    final ExportSnapshotResult executeExportSnapshot(ExportSnapshotRequest exportSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(exportSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportSnapshotRequest> request = null;
        Response<ExportSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a specified extension.
     * </p>
     * 
     * @param getExtensionRequest
     * @return Result of the GetExtension operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtension" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExtensionResult getExtension(GetExtensionRequest request) {
        request = beforeClientExecution(request);
        return executeGetExtension(request);
    }

    @SdkInternalApi
    final GetExtensionResult executeGetExtension(GetExtensionRequest getExtensionRequest) {

        ExecutionContext executionContext = createExecutionContext(getExtensionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExtensionRequest> request = null;
        Response<GetExtensionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExtensionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExtensionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExtension");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExtensionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExtensionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a specified extension version.
     * </p>
     * 
     * @param getExtensionVersionRequest
     * @return Result of the GetExtensionVersion operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetExtensionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtensionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetExtensionVersionResult getExtensionVersion(GetExtensionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetExtensionVersion(request);
    }

    @SdkInternalApi
    final GetExtensionVersionResult executeGetExtensionVersion(GetExtensionVersionRequest getExtensionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getExtensionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExtensionVersionRequest> request = null;
        Response<GetExtensionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExtensionVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExtensionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExtensionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExtensionVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExtensionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a game.
     * </p>
     * 
     * @param getGameRequest
     * @return Result of the GetGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGame" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGameResult getGame(GetGameRequest request) {
        request = beforeClientExecution(request);
        return executeGetGame(request);
    }

    @SdkInternalApi
    final GetGameResult executeGetGame(GetGameRequest getGameRequest) {

        ExecutionContext executionContext = createExecutionContext(getGameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGameRequest> request = null;
        Response<GetGameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGame");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGameResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the configuration of the game.
     * </p>
     * 
     * @param getGameConfigurationRequest
     * @return Result of the GetGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGameConfigurationResult getGameConfiguration(GetGameConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetGameConfiguration(request);
    }

    @SdkInternalApi
    final GetGameConfigurationResult executeGetGameConfiguration(GetGameConfigurationRequest getGameConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getGameConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGameConfigurationRequest> request = null;
        Response<GetGameConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGameConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGameConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGameConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGameConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGameConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a job that is generating code for a snapshot.
     * </p>
     * 
     * @param getGeneratedCodeJobRequest
     * @return Result of the GetGeneratedCodeJob operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGeneratedCodeJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetGeneratedCodeJobResult getGeneratedCodeJob(GetGeneratedCodeJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetGeneratedCodeJob(request);
    }

    @SdkInternalApi
    final GetGeneratedCodeJobResult executeGetGeneratedCodeJob(GetGeneratedCodeJobRequest getGeneratedCodeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getGeneratedCodeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGeneratedCodeJobRequest> request = null;
        Response<GetGeneratedCodeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGeneratedCodeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGeneratedCodeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGeneratedCodeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGeneratedCodeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGeneratedCodeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a player's connection to the game runtime.
     * </p>
     * <p>
     * It's possible for a single player to have multiple connections to the game runtime. If a player is not connected,
     * this operation returns an empty list.
     * </p>
     * 
     * @param getPlayerConnectionStatusRequest
     * @return Result of the GetPlayerConnectionStatus operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetPlayerConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPlayerConnectionStatusResult getPlayerConnectionStatus(GetPlayerConnectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlayerConnectionStatus(request);
    }

    @SdkInternalApi
    final GetPlayerConnectionStatusResult executeGetPlayerConnectionStatus(GetPlayerConnectionStatusRequest getPlayerConnectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlayerConnectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlayerConnectionStatusRequest> request = null;
        Response<GetPlayerConnectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlayerConnectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPlayerConnectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlayerConnectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPlayerConnectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPlayerConnectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a copy of the game configuration in a snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return Result of the GetSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetSnapshot" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Gets information about a stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStageResult getStage(GetStageRequest request) {
        request = beforeClientExecution(request);
        return executeGetStage(request);
    }

    @SdkInternalApi
    final GetStageResult executeGetStage(GetStageRequest getStageRequest) {

        ExecutionContext executionContext = createExecutionContext(getStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageRequest> request = null;
        Response<GetStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a stage deployment.
     * </p>
     * 
     * @param getStageDeploymentRequest
     * @return Result of the GetStageDeployment operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStageDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetStageDeploymentResult getStageDeployment(GetStageDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetStageDeployment(request);
    }

    @SdkInternalApi
    final GetStageDeploymentResult executeGetStageDeployment(GetStageDeploymentRequest getStageDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getStageDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageDeploymentRequest> request = null;
        Response<GetStageDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStageDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStageDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStageDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStageDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a game configuration.
     * </p>
     * <p>
     * This operation replaces the current configuration of the game with the provided input. This is not a reversible
     * operation. If you want to preserve the previous configuration, use <code>CreateSnapshot</code> to make a new
     * snapshot before importing.
     * </p>
     * 
     * @param importGameConfigurationRequest
     * @return Result of the ImportGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.ImportGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ImportGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportGameConfigurationResult importGameConfiguration(ImportGameConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeImportGameConfiguration(request);
    }

    @SdkInternalApi
    final ImportGameConfigurationResult executeImportGameConfiguration(ImportGameConfigurationRequest importGameConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(importGameConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportGameConfigurationRequest> request = null;
        Response<ImportGameConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportGameConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importGameConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportGameConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportGameConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportGameConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of available versions for the extension.
     * </p>
     * <p>
     * Each time an API change is made to an extension, the version is incremented. The list retrieved by this operation
     * shows the versions that are currently available.
     * </p>
     * 
     * @param listExtensionVersionsRequest
     * @return Result of the ListExtensionVersions operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListExtensionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListExtensionVersionsResult listExtensionVersions(ListExtensionVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExtensionVersions(request);
    }

    @SdkInternalApi
    final ListExtensionVersionsResult executeListExtensionVersions(ListExtensionVersionsRequest listExtensionVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExtensionVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExtensionVersionsRequest> request = null;
        Response<ListExtensionVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExtensionVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExtensionVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExtensionVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExtensionVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListExtensionVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of available extensions.
     * </p>
     * <p>
     * Extensions provide features that games can use from scripts.
     * </p>
     * 
     * @param listExtensionsRequest
     * @return Result of the ListExtensions operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExtensionsResult listExtensions(ListExtensionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExtensions(request);
    }

    @SdkInternalApi
    final ListExtensionsResult executeListExtensions(ListExtensionsRequest listExtensionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExtensionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExtensionsRequest> request = null;
        Response<ListExtensionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExtensionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExtensionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExtensions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExtensionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExtensionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of games.
     * </p>
     * 
     * @param listGamesRequest
     * @return Result of the ListGames operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListGames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGames" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGamesResult listGames(ListGamesRequest request) {
        request = beforeClientExecution(request);
        return executeListGames(request);
    }

    @SdkInternalApi
    final ListGamesResult executeListGames(ListGamesRequest listGamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGamesRequest> request = null;
        Response<ListGamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGamesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of code generation jobs for a snapshot.
     * </p>
     * 
     * @param listGeneratedCodeJobsRequest
     * @return Result of the ListGeneratedCodeJobs operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListGeneratedCodeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGeneratedCodeJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGeneratedCodeJobsResult listGeneratedCodeJobs(ListGeneratedCodeJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListGeneratedCodeJobs(request);
    }

    @SdkInternalApi
    final ListGeneratedCodeJobsResult executeListGeneratedCodeJobs(ListGeneratedCodeJobsRequest listGeneratedCodeJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGeneratedCodeJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeneratedCodeJobsRequest> request = null;
        Response<ListGeneratedCodeJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeneratedCodeJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGeneratedCodeJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGeneratedCodeJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGeneratedCodeJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListGeneratedCodeJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of snapshot summaries from the game.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return Result of the ListSnapshots operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListSnapshots" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Gets a paginated list of stage deployment summaries from the game.
     * </p>
     * 
     * @param listStageDeploymentsRequest
     * @return Result of the ListStageDeployments operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListStageDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStageDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStageDeploymentsResult listStageDeployments(ListStageDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListStageDeployments(request);
    }

    @SdkInternalApi
    final ListStageDeploymentsResult executeListStageDeployments(ListStageDeploymentsRequest listStageDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStageDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStageDeploymentsRequest> request = null;
        Response<ListStageDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStageDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStageDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStageDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStageDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStageDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a paginated list of stage summaries from the game.
     * </p>
     * 
     * @param listStagesRequest
     * @return Result of the ListStages operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStagesResult listStages(ListStagesRequest request) {
        request = beforeClientExecution(request);
        return executeListStages(request);
    }

    @SdkInternalApi
    final ListStagesResult executeListStages(ListStagesRequest listStagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStagesRequest> request = null;
        Response<ListStagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStagesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags associated with a GameSparks resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting
     * code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL.
     * </p>
     * 
     * @param startGeneratedCodeJobRequest
     * @return Result of the StartGeneratedCodeJob operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.StartGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartGeneratedCodeJobResult startGeneratedCodeJob(StartGeneratedCodeJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartGeneratedCodeJob(request);
    }

    @SdkInternalApi
    final StartGeneratedCodeJobResult executeStartGeneratedCodeJob(StartGeneratedCodeJobRequest startGeneratedCodeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startGeneratedCodeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGeneratedCodeJobRequest> request = null;
        Response<StartGeneratedCodeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGeneratedCodeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startGeneratedCodeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartGeneratedCodeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartGeneratedCodeJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartGeneratedCodeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deploys a snapshot to the stage and creates a new game runtime.
     * </p>
     * <p>
     * After you call this operation, you can check the deployment status by using <code>GetStageDeployment</code>.
     * </p>
     * <p>
     * If there are any players connected to the previous game runtime, then both runtimes persist. Existing connections
     * to the previous runtime are maintained. When players disconnect and reconnect, they connect to the new runtime.
     * After there are no connections to the previous game runtime, it is deleted.
     * </p>
     * 
     * @param startStageDeploymentRequest
     * @return Result of the StartStageDeployment operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.StartStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartStageDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartStageDeploymentResult startStageDeployment(StartStageDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeStartStageDeployment(request);
    }

    @SdkInternalApi
    final StartStageDeploymentResult executeStartStageDeployment(StartStageDeploymentRequest startStageDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(startStageDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStageDeploymentRequest> request = null;
        Response<StartStageDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStageDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startStageDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStageDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStageDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartStageDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a GameSparks resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Removes tags from a GameSparks resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Updates details of the game.
     * </p>
     * 
     * @param updateGameRequest
     * @return Result of the UpdateGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGame" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGameResult updateGame(UpdateGameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGame(request);
    }

    @SdkInternalApi
    final UpdateGameResult executeUpdateGame(UpdateGameRequest updateGameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGameRequest> request = null;
        Response<UpdateGameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGame");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGameResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates one or more sections of the game configuration.
     * </p>
     * 
     * @param updateGameConfigurationRequest
     * @return Result of the UpdateGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.UpdateGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGameConfigurationResult updateGameConfiguration(UpdateGameConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGameConfiguration(request);
    }

    @SdkInternalApi
    final UpdateGameConfigurationResult executeUpdateGameConfiguration(UpdateGameConfigurationRequest updateGameConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGameConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGameConfigurationRequest> request = null;
        Response<UpdateGameConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGameConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGameConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGameConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGameConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGameConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the metadata of a GameSparks snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
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
     * Updates the metadata of a stage.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStageResult updateStage(UpdateStageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStage(request);
    }

    @SdkInternalApi
    final UpdateStageResult executeUpdateStage(UpdateStageRequest updateStageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStageRequest> request = null;
        Response<UpdateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GameSparks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStageResultJsonUnmarshaller());
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
