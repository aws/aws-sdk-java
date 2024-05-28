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
package com.amazonaws.services.osis;

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

import com.amazonaws.services.osis.AmazonOSISClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.osis.model.*;

import com.amazonaws.services.osis.model.transform.*;

/**
 * Client for accessing Amazon OpenSearch Ingestion. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Ingestion API to create and manage ingestion pipelines. OpenSearch Ingestion is a fully
 * managed data collector that delivers real-time log and trace data to OpenSearch Service domains. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ingestion.html">Getting data into your
 * cluster using OpenSearch Ingestion</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOSISClient extends AmazonWebServiceClient implements AmazonOSIS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonOSIS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "osis";

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
                                    com.amazonaws.services.osis.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.DisabledOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.osis.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.osis.model.AmazonOSISException.class));

    public static AmazonOSISClientBuilder builder() {
        return AmazonOSISClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Ingestion using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOSISClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Ingestion using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOSISClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("osis.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/osis/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/osis/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param createPipelineRequest
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws LimitExceededException
     *         You attempted to create more than the allowed number of tags.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceAlreadyExistsException
     *         You attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePipeline(request);
    }

    @SdkInternalApi
    final CreatePipelineResult executeCreatePipeline(CreatePipelineRequest createPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/delete-pipeline.html">Deleting Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @sample AmazonOSIS.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePipeline(request);
    }

    @SdkInternalApi
    final DeletePipelineResult executeDeletePipeline(DeletePipelineRequest deletePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<DeletePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an OpenSearch Ingestion pipeline.
     * </p>
     * 
     * @param getPipelineRequest
     * @return Result of the GetPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPipelineResult getPipeline(GetPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipeline(request);
    }

    @SdkInternalApi
    final GetPipelineResult executeGetPipeline(GetPipelineRequest getPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineRequest> request = null;
        Response<GetPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the
     * configuration needed for a <code>CreatePipeline</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param getPipelineBlueprintRequest
     * @return Result of the GetPipelineBlueprint operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipelineBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPipelineBlueprintResult getPipelineBlueprint(GetPipelineBlueprintRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineBlueprint(request);
    }

    @SdkInternalApi
    final GetPipelineBlueprintResult executeGetPipelineBlueprint(GetPipelineBlueprintRequest getPipelineBlueprintRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineBlueprintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineBlueprintRequest> request = null;
        Response<GetPipelineBlueprintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineBlueprintRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineBlueprintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipelineBlueprint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineBlueprintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineBlueprintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns progress information for the current change happening on an OpenSearch Ingestion pipeline. Currently,
     * this operation only returns information when a pipeline is being created.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#get-pipeline-progress"
     * >Tracking the status of pipeline creation</a>.
     * </p>
     * 
     * @param getPipelineChangeProgressRequest
     * @return Result of the GetPipelineChangeProgress operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipelineChangeProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineChangeProgress" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPipelineChangeProgressResult getPipelineChangeProgress(GetPipelineChangeProgressRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineChangeProgress(request);
    }

    @SdkInternalApi
    final GetPipelineChangeProgressResult executeGetPipelineChangeProgress(GetPipelineChangeProgressRequest getPipelineChangeProgressRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineChangeProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineChangeProgressRequest> request = null;
        Response<GetPipelineChangeProgressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineChangeProgressRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPipelineChangeProgressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipelineChangeProgress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineChangeProgressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPipelineChangeProgressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all available blueprints for Data Prepper. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param listPipelineBlueprintsRequest
     * @return Result of the ListPipelineBlueprints operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InvalidPaginationTokenException
     *         An invalid pagination token provided in the request.
     * @sample AmazonOSIS.ListPipelineBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelineBlueprints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPipelineBlueprintsResult listPipelineBlueprints(ListPipelineBlueprintsRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelineBlueprints(request);
    }

    @SdkInternalApi
    final ListPipelineBlueprintsResult executeListPipelineBlueprints(ListPipelineBlueprintsRequest listPipelineBlueprintsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelineBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelineBlueprintsRequest> request = null;
        Response<ListPipelineBlueprintsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelineBlueprintsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelineBlueprintsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipelineBlueprints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelineBlueprintsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPipelineBlueprintsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/list-pipeline.html">Viewing Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return Result of the ListPipelines operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InvalidPaginationTokenException
     *         An invalid pagination token provided in the request.
     * @sample AmazonOSIS.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelines(request);
    }

    @SdkInternalApi
    final ListPipelinesResult executeListPipelines(ListPipelinesRequest listPipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @sample AmazonOSIS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
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
     * Starts an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--start"
     * >Starting an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param startPipelineRequest
     * @return Result of the StartPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.StartPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StartPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartPipelineResult startPipeline(StartPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeStartPipeline(request);
    }

    @SdkInternalApi
    final StartPipelineResult executeStartPipeline(StartPipelineRequest startPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(startPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipelineRequest> request = null;
        Response<StartPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--stop"
     * >Stopping an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param stopPipelineRequest
     * @return Result of the StopPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.StopPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StopPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopPipelineResult stopPipeline(StopPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeStopPipeline(request);
    }

    @SdkInternalApi
    final StopPipelineResult executeStopPipeline(StopPipelineRequest stopPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(stopPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPipelineRequest> request = null;
        Response<StopPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws LimitExceededException
     *         You attempted to create more than the allowed number of tags.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
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
     * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @sample AmazonOSIS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
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
     * Updates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/update-pipeline.html">Updating Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @sample AmazonOSIS.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipeline(request);
    }

    @SdkInternalApi
    final UpdatePipelineResult executeUpdatePipeline(UpdatePipelineRequest updatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param validatePipelineRequest
     * @return Result of the ValidatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.ValidatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ValidatePipelineResult validatePipeline(ValidatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeValidatePipeline(request);
    }

    @SdkInternalApi
    final ValidatePipelineResult executeValidatePipeline(ValidatePipelineRequest validatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(validatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidatePipelineRequest> request = null;
        Response<ValidatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(validatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OSIS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ValidatePipelineResultJsonUnmarshaller());
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
