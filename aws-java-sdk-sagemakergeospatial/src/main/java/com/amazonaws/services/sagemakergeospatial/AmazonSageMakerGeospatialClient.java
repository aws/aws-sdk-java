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
package com.amazonaws.services.sagemakergeospatial;

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

import com.amazonaws.services.sagemakergeospatial.AmazonSageMakerGeospatialClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.services.sagemakergeospatial.model.transform.*;

/**
 * Client for accessing Amazon SageMaker geospatial capabilities. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing SageMaker geospatial resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerGeospatialClient extends AmazonWebServiceClient implements AmazonSageMakerGeospatial {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSageMakerGeospatial.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sagemaker-geospatial";

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
                                    com.amazonaws.services.sagemakergeospatial.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakergeospatial.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.sagemakergeospatial.model.AmazonSageMakerGeospatialException.class));

    public static AmazonSageMakerGeospatialClientBuilder builder() {
        return AmazonSageMakerGeospatialClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SageMaker geospatial capabilities using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerGeospatialClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SageMaker geospatial capabilities using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerGeospatialClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sagemaker-geospatial.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sagemakergeospatial/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sagemakergeospatial/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Use this operation to delete an Earth Observation job.
     * </p>
     * 
     * @param deleteEarthObservationJobRequest
     * @return Result of the DeleteEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.DeleteEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEarthObservationJobResult deleteEarthObservationJob(DeleteEarthObservationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEarthObservationJob(request);
    }

    @SdkInternalApi
    final DeleteEarthObservationJobResult executeDeleteEarthObservationJob(DeleteEarthObservationJobRequest deleteEarthObservationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEarthObservationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEarthObservationJobRequest> request = null;
        Response<DeleteEarthObservationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEarthObservationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEarthObservationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEarthObservationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEarthObservationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEarthObservationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to delete a Vector Enrichment job.
     * </p>
     * 
     * @param deleteVectorEnrichmentJobRequest
     * @return Result of the DeleteVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.DeleteVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVectorEnrichmentJobResult deleteVectorEnrichmentJob(DeleteVectorEnrichmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVectorEnrichmentJob(request);
    }

    @SdkInternalApi
    final DeleteVectorEnrichmentJobResult executeDeleteVectorEnrichmentJob(DeleteVectorEnrichmentJobRequest deleteVectorEnrichmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVectorEnrichmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVectorEnrichmentJobRequest> request = null;
        Response<DeleteVectorEnrichmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVectorEnrichmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVectorEnrichmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVectorEnrichmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVectorEnrichmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVectorEnrichmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to export results of an Earth Observation job and optionally source images used as input to
     * the EOJ to an S3 location.
     * </p>
     * 
     * @param exportEarthObservationJobRequest
     * @return Result of the ExportEarthObservationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.ExportEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportEarthObservationJobResult exportEarthObservationJob(ExportEarthObservationJobRequest request) {
        request = beforeClientExecution(request);
        return executeExportEarthObservationJob(request);
    }

    @SdkInternalApi
    final ExportEarthObservationJobResult executeExportEarthObservationJob(ExportEarthObservationJobRequest exportEarthObservationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(exportEarthObservationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportEarthObservationJobRequest> request = null;
        Response<ExportEarthObservationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportEarthObservationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportEarthObservationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportEarthObservationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportEarthObservationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportEarthObservationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to copy results of a Vector Enrichment job to an S3 location.
     * </p>
     * 
     * @param exportVectorEnrichmentJobRequest
     * @return Result of the ExportVectorEnrichmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.ExportVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportVectorEnrichmentJobResult exportVectorEnrichmentJob(ExportVectorEnrichmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeExportVectorEnrichmentJob(request);
    }

    @SdkInternalApi
    final ExportVectorEnrichmentJobResult executeExportVectorEnrichmentJob(ExportVectorEnrichmentJobRequest exportVectorEnrichmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(exportVectorEnrichmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportVectorEnrichmentJobRequest> request = null;
        Response<ExportVectorEnrichmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportVectorEnrichmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportVectorEnrichmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportVectorEnrichmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportVectorEnrichmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportVectorEnrichmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the details for a previously initiated Earth Observation job.
     * </p>
     * 
     * @param getEarthObservationJobRequest
     * @return Result of the GetEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEarthObservationJobResult getEarthObservationJob(GetEarthObservationJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetEarthObservationJob(request);
    }

    @SdkInternalApi
    final GetEarthObservationJobResult executeGetEarthObservationJob(GetEarthObservationJobRequest getEarthObservationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getEarthObservationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEarthObservationJobRequest> request = null;
        Response<GetEarthObservationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEarthObservationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEarthObservationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEarthObservationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEarthObservationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEarthObservationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to get details of a specific raster data collection.
     * </p>
     * 
     * @param getRasterDataCollectionRequest
     * @return Result of the GetRasterDataCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRasterDataCollectionResult getRasterDataCollection(GetRasterDataCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetRasterDataCollection(request);
    }

    @SdkInternalApi
    final GetRasterDataCollectionResult executeGetRasterDataCollection(GetRasterDataCollectionRequest getRasterDataCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getRasterDataCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRasterDataCollectionRequest> request = null;
        Response<GetRasterDataCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRasterDataCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRasterDataCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRasterDataCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRasterDataCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRasterDataCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a web mercator tile for the given Earth Observation job.
     * </p>
     * 
     * @param getTileRequest
     * @return Result of the GetTile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTileResult getTile(GetTileRequest request) {
        request = beforeClientExecution(request);
        return executeGetTile(request);
    }

    @SdkInternalApi
    final GetTileResult executeGetTile(GetTileRequest getTileRequest) {

        ExecutionContext executionContext = createExecutionContext(getTileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTileRequest> request = null;
        Response<GetTileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetTileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
     * </p>
     * 
     * @param getVectorEnrichmentJobRequest
     * @return Result of the GetVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVectorEnrichmentJobResult getVectorEnrichmentJob(GetVectorEnrichmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetVectorEnrichmentJob(request);
    }

    @SdkInternalApi
    final GetVectorEnrichmentJobResult executeGetVectorEnrichmentJob(GetVectorEnrichmentJobRequest getVectorEnrichmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getVectorEnrichmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVectorEnrichmentJobRequest> request = null;
        Response<GetVectorEnrichmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVectorEnrichmentJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVectorEnrichmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVectorEnrichmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVectorEnrichmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVectorEnrichmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services
     * account.
     * </p>
     * 
     * @param listEarthObservationJobsRequest
     * @return Result of the ListEarthObservationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListEarthObservationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListEarthObservationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEarthObservationJobsResult listEarthObservationJobs(ListEarthObservationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListEarthObservationJobs(request);
    }

    @SdkInternalApi
    final ListEarthObservationJobsResult executeListEarthObservationJobs(ListEarthObservationJobsRequest listEarthObservationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEarthObservationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEarthObservationJobsRequest> request = null;
        Response<ListEarthObservationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEarthObservationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEarthObservationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEarthObservationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEarthObservationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEarthObservationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to get raster data collections.
     * </p>
     * 
     * @param listRasterDataCollectionsRequest
     * @return Result of the ListRasterDataCollections operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListRasterDataCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRasterDataCollectionsResult listRasterDataCollections(ListRasterDataCollectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListRasterDataCollections(request);
    }

    @SdkInternalApi
    final ListRasterDataCollectionsResult executeListRasterDataCollections(ListRasterDataCollectionsRequest listRasterDataCollectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRasterDataCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRasterDataCollectionsRequest> request = null;
        Response<ListRasterDataCollectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRasterDataCollectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRasterDataCollectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRasterDataCollections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRasterDataCollectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRasterDataCollectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
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
     * Retrieves a list of vector enrichment jobs.
     * </p>
     * 
     * @param listVectorEnrichmentJobsRequest
     * @return Result of the ListVectorEnrichmentJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListVectorEnrichmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVectorEnrichmentJobsResult listVectorEnrichmentJobs(ListVectorEnrichmentJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListVectorEnrichmentJobs(request);
    }

    @SdkInternalApi
    final ListVectorEnrichmentJobsResult executeListVectorEnrichmentJobs(ListVectorEnrichmentJobsRequest listVectorEnrichmentJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVectorEnrichmentJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVectorEnrichmentJobsRequest> request = null;
        Response<ListVectorEnrichmentJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVectorEnrichmentJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVectorEnrichmentJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVectorEnrichmentJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVectorEnrichmentJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVectorEnrichmentJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching
     * the selected filters.
     * </p>
     * 
     * @param searchRasterDataCollectionRequest
     * @return Result of the SearchRasterDataCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.SearchRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchRasterDataCollectionResult searchRasterDataCollection(SearchRasterDataCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeSearchRasterDataCollection(request);
    }

    @SdkInternalApi
    final SearchRasterDataCollectionResult executeSearchRasterDataCollection(SearchRasterDataCollectionRequest searchRasterDataCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRasterDataCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRasterDataCollectionRequest> request = null;
        Response<SearchRasterDataCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRasterDataCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchRasterDataCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchRasterDataCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchRasterDataCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchRasterDataCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to create an Earth observation job.
     * </p>
     * 
     * @param startEarthObservationJobRequest
     * @return Result of the StartEarthObservationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StartEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartEarthObservationJobResult startEarthObservationJob(StartEarthObservationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartEarthObservationJob(request);
    }

    @SdkInternalApi
    final StartEarthObservationJobResult executeStartEarthObservationJob(StartEarthObservationJobRequest startEarthObservationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startEarthObservationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEarthObservationJobRequest> request = null;
        Response<StartEarthObservationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEarthObservationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startEarthObservationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartEarthObservationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartEarthObservationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartEarthObservationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse
     * geocoding and map matching.
     * </p>
     * 
     * @param startVectorEnrichmentJobRequest
     * @return Result of the StartVectorEnrichmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StartVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartVectorEnrichmentJobResult startVectorEnrichmentJob(StartVectorEnrichmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartVectorEnrichmentJob(request);
    }

    @SdkInternalApi
    final StartVectorEnrichmentJobResult executeStartVectorEnrichmentJob(StartVectorEnrichmentJobRequest startVectorEnrichmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startVectorEnrichmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartVectorEnrichmentJobRequest> request = null;
        Response<StartVectorEnrichmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartVectorEnrichmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startVectorEnrichmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartVectorEnrichmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartVectorEnrichmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartVectorEnrichmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to stop an existing earth observation job.
     * </p>
     * 
     * @param stopEarthObservationJobRequest
     * @return Result of the StopEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StopEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopEarthObservationJobResult stopEarthObservationJob(StopEarthObservationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopEarthObservationJob(request);
    }

    @SdkInternalApi
    final StopEarthObservationJobResult executeStopEarthObservationJob(StopEarthObservationJobRequest stopEarthObservationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopEarthObservationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEarthObservationJobRequest> request = null;
        Response<StopEarthObservationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEarthObservationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopEarthObservationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopEarthObservationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopEarthObservationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopEarthObservationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the Vector Enrichment job for a given job ARN.
     * </p>
     * 
     * @param stopVectorEnrichmentJobRequest
     * @return Result of the StopVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StopVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopVectorEnrichmentJobResult stopVectorEnrichmentJob(StopVectorEnrichmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopVectorEnrichmentJob(request);
    }

    @SdkInternalApi
    final StopVectorEnrichmentJobResult executeStopVectorEnrichmentJob(StopVectorEnrichmentJobRequest stopVectorEnrichmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopVectorEnrichmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopVectorEnrichmentJobRequest> request = null;
        Response<StopVectorEnrichmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopVectorEnrichmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopVectorEnrichmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopVectorEnrichmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopVectorEnrichmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopVectorEnrichmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The resource you want to tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/TagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
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
     * The resource you want to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker Geospatial");
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
