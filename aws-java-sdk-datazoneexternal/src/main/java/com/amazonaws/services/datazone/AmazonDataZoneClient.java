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
package com.amazonaws.services.datazone;

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

import com.amazonaws.services.datazone.AmazonDataZoneClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.datazone.model.*;

import com.amazonaws.services.datazone.model.transform.*;

/**
 * Client for accessing Amazon DataZone. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon DataZone is a data management service that enables you to catalog, discover, govern, share, and analyze your
 * data. With Amazon DataZone, you can share and access your data across accounts and supported regions. Amazon DataZone
 * simplifies your experience across Amazon Web Services services, including, but not limited to, Amazon Redshift,
 * Amazon Athena, Amazon Web Services Glue, and Amazon Web Services Lake Formation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDataZoneClient extends AmazonWebServiceClient implements AmazonDataZone {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDataZone.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "datazone";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datazone.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.datazone.model.AmazonDataZoneException.class));

    public static AmazonDataZoneClientBuilder builder() {
        return AmazonDataZoneClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DataZone using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDataZoneClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DataZone using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDataZoneClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("datazone.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/datazone/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/datazone/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param acceptPredictionsRequest
     * @return Result of the AcceptPredictions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.AcceptPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptPredictionsResult acceptPredictions(AcceptPredictionsRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptPredictions(request);
    }

    @SdkInternalApi
    final AcceptPredictionsResult executeAcceptPredictions(AcceptPredictionsRequest acceptPredictionsRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptPredictionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptPredictionsRequest> request = null;
        Response<AcceptPredictionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptPredictionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptPredictionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptPredictions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptPredictionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptPredictionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a subscription request to a specific asset.
     * </p>
     * 
     * @param acceptSubscriptionRequestRequest
     * @return Result of the AcceptSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.AcceptSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptSubscriptionRequestResult acceptSubscriptionRequest(AcceptSubscriptionRequestRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptSubscriptionRequest(request);
    }

    @SdkInternalApi
    final AcceptSubscriptionRequestResult executeAcceptSubscriptionRequest(AcceptSubscriptionRequestRequest acceptSubscriptionRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptSubscriptionRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptSubscriptionRequestRequest> request = null;
        Response<AcceptSubscriptionRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptSubscriptionRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptSubscriptionRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptSubscriptionRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptSubscriptionRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptSubscriptionRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the metadata generation run.
     * </p>
     * 
     * @param cancelMetadataGenerationRunRequest
     * @return Result of the CancelMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CancelMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMetadataGenerationRunResult cancelMetadataGenerationRun(CancelMetadataGenerationRunRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMetadataGenerationRun(request);
    }

    @SdkInternalApi
    final CancelMetadataGenerationRunResult executeCancelMetadataGenerationRun(CancelMetadataGenerationRunRequest cancelMetadataGenerationRunRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMetadataGenerationRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMetadataGenerationRunRequest> request = null;
        Response<CancelMetadataGenerationRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMetadataGenerationRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMetadataGenerationRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMetadataGenerationRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMetadataGenerationRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMetadataGenerationRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the subscription to the specified asset.
     * </p>
     * 
     * @param cancelSubscriptionRequest
     * @return Result of the CancelSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CancelSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelSubscriptionResult cancelSubscription(CancelSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSubscription(request);
    }

    @SdkInternalApi
    final CancelSubscriptionResult executeCancelSubscription(CancelSubscriptionRequest cancelSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSubscriptionRequest> request = null;
        Response<CancelSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an asset in Amazon DataZone catalog.
     * </p>
     * 
     * @param createAssetRequest
     * @return Result of the CreateAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssetResult createAsset(CreateAssetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAsset(request);
    }

    @SdkInternalApi
    final CreateAssetResult executeCreateAsset(CreateAssetRequest createAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetRequest> request = null;
        Response<CreateAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a revision of the asset.
     * </p>
     * 
     * @param createAssetRevisionRequest
     * @return Result of the CreateAssetRevision operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAssetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAssetRevisionResult createAssetRevision(CreateAssetRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssetRevision(request);
    }

    @SdkInternalApi
    final CreateAssetRevisionResult executeCreateAssetRevision(CreateAssetRevisionRequest createAssetRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetRevisionRequest> request = null;
        Response<CreateAssetRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssetRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom asset type.
     * </p>
     * 
     * @param createAssetTypeRequest
     * @return Result of the CreateAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssetTypeResult createAssetType(CreateAssetTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssetType(request);
    }

    @SdkInternalApi
    final CreateAssetTypeResult executeCreateAssetType(CreateAssetTypeRequest createAssetTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetTypeRequest> request = null;
        Response<CreateAssetTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssetType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon DataZone data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Creates an Amazon DataZone domain.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an Amazon DataZone environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironment(request);
    }

    @SdkInternalApi
    final CreateEnvironmentResult executeCreateEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon DataZone environment profile.
     * </p>
     * 
     * @param createEnvironmentProfileRequest
     * @return Result of the CreateEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentProfileResult createEnvironmentProfile(CreateEnvironmentProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentProfile(request);
    }

    @SdkInternalApi
    final CreateEnvironmentProfileResult executeCreateEnvironmentProfile(CreateEnvironmentProfileRequest createEnvironmentProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentProfileRequest> request = null;
        Response<CreateEnvironmentProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEnvironmentProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEnvironmentProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a metadata form type.
     * </p>
     * 
     * @param createFormTypeRequest
     * @return Result of the CreateFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFormTypeResult createFormType(CreateFormTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFormType(request);
    }

    @SdkInternalApi
    final CreateFormTypeResult executeCreateFormType(CreateFormTypeRequest createFormTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createFormTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFormTypeRequest> request = null;
        Response<CreateFormTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFormTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFormTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFormType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFormTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFormTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon DataZone business glossary.
     * </p>
     * 
     * @param createGlossaryRequest
     * @return Result of the CreateGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGlossaryResult createGlossary(CreateGlossaryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlossary(request);
    }

    @SdkInternalApi
    final CreateGlossaryResult executeCreateGlossary(CreateGlossaryRequest createGlossaryRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlossaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlossaryRequest> request = null;
        Response<CreateGlossaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlossaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGlossaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlossary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGlossaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGlossaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a business glossary term.
     * </p>
     * 
     * @param createGlossaryTermRequest
     * @return Result of the CreateGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateGlossaryTermResult createGlossaryTerm(CreateGlossaryTermRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlossaryTerm(request);
    }

    @SdkInternalApi
    final CreateGlossaryTermResult executeCreateGlossaryTerm(CreateGlossaryTermRequest createGlossaryTermRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlossaryTermRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlossaryTermRequest> request = null;
        Response<CreateGlossaryTermResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlossaryTermRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGlossaryTermRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlossaryTerm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGlossaryTermResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGlossaryTermResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group profile in Amazon DataZone.
     * </p>
     * 
     * @param createGroupProfileRequest
     * @return Result of the CreateGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateGroupProfileResult createGroupProfile(CreateGroupProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroupProfile(request);
    }

    @SdkInternalApi
    final CreateGroupProfileResult executeCreateGroupProfile(CreateGroupProfileRequest createGroupProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupProfileRequest> request = null;
        Response<CreateGroupProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroupProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes a listing (a record of an asset at a given time) or removes a listing from the catalog.
     * </p>
     * 
     * @param createListingChangeSetRequest
     * @return Result of the CreateListingChangeSet operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateListingChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateListingChangeSetResult createListingChangeSet(CreateListingChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateListingChangeSet(request);
    }

    @SdkInternalApi
    final CreateListingChangeSetResult executeCreateListingChangeSet(CreateListingChangeSetRequest createListingChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createListingChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateListingChangeSetRequest> request = null;
        Response<CreateListingChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateListingChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createListingChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateListingChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateListingChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateListingChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon DataZone project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a project membership in Amazon DataZone.
     * </p>
     * 
     * @param createProjectMembershipRequest
     * @return Result of the CreateProjectMembership operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProjectMembershipResult createProjectMembership(CreateProjectMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProjectMembership(request);
    }

    @SdkInternalApi
    final CreateProjectMembershipResult executeCreateProjectMembership(CreateProjectMembershipRequest createProjectMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectMembershipRequest> request = null;
        Response<CreateProjectMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createProjectMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProjectMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateProjectMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subsscription grant in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionGrantRequest
     * @return Result of the CreateSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSubscriptionGrantResult createSubscriptionGrant(CreateSubscriptionGrantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriptionGrant(request);
    }

    @SdkInternalApi
    final CreateSubscriptionGrantResult executeCreateSubscriptionGrant(CreateSubscriptionGrantRequest createSubscriptionGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriptionGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionGrantRequest> request = null;
        Response<CreateSubscriptionGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionGrantRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSubscriptionGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriptionGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriptionGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSubscriptionGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionRequestRequest
     * @return Result of the CreateSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSubscriptionRequestResult createSubscriptionRequest(CreateSubscriptionRequestRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriptionRequest(request);
    }

    @SdkInternalApi
    final CreateSubscriptionRequestResult executeCreateSubscriptionRequest(CreateSubscriptionRequestRequest createSubscriptionRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriptionRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionRequestRequest> request = null;
        Response<CreateSubscriptionRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSubscriptionRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriptionRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriptionRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSubscriptionRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionTargetRequest
     * @return Result of the CreateSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSubscriptionTargetResult createSubscriptionTarget(CreateSubscriptionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriptionTarget(request);
    }

    @SdkInternalApi
    final CreateSubscriptionTargetResult executeCreateSubscriptionTarget(CreateSubscriptionTargetRequest createSubscriptionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriptionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionTargetRequest> request = null;
        Response<CreateSubscriptionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSubscriptionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriptionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriptionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSubscriptionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user profile in Amazon DataZone.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserProfile(request);
    }

    @SdkInternalApi
    final CreateUserProfileResult executeCreateUserProfile(CreateUserProfileRequest createUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delets an asset in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssetResult deleteAsset(DeleteAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAsset(request);
    }

    @SdkInternalApi
    final DeleteAssetResult executeDeleteAsset(DeleteAssetRequest deleteAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<DeleteAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an asset type in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetTypeRequest
     * @return Result of the DeleteAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssetTypeResult deleteAssetType(DeleteAssetTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssetType(request);
    }

    @SdkInternalApi
    final DeleteAssetTypeResult executeDeleteAssetType(DeleteAssetTypeRequest deleteAssetTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetTypeRequest> request = null;
        Response<DeleteAssetTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssetType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a data source in Amazon DataZone.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Deletes a Amazon DataZone domain.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an environment in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironment(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentResult executeDeleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentRequest> request = null;
        Response<DeleteEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentBlueprintConfigurationRequest
     * @return Result of the DeleteEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentBlueprintConfigurationResult deleteEnvironmentBlueprintConfiguration(DeleteEnvironmentBlueprintConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentBlueprintConfiguration(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentBlueprintConfigurationResult executeDeleteEnvironmentBlueprintConfiguration(
            DeleteEnvironmentBlueprintConfigurationRequest deleteEnvironmentBlueprintConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentBlueprintConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentBlueprintConfigurationRequest> request = null;
        Response<DeleteEnvironmentBlueprintConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentBlueprintConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentBlueprintConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentBlueprintConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentBlueprintConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteEnvironmentBlueprintConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an environment profile in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentProfileRequest
     * @return Result of the DeleteEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentProfileResult deleteEnvironmentProfile(DeleteEnvironmentProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentProfile(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentProfileResult executeDeleteEnvironmentProfile(DeleteEnvironmentProfileRequest deleteEnvironmentProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentProfileRequest> request = null;
        Response<DeleteEnvironmentProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEnvironmentProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delets and metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param deleteFormTypeRequest
     * @return Result of the DeleteFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteFormType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFormTypeResult deleteFormType(DeleteFormTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFormType(request);
    }

    @SdkInternalApi
    final DeleteFormTypeResult executeDeleteFormType(DeleteFormTypeRequest deleteFormTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFormTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFormTypeRequest> request = null;
        Response<DeleteFormTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFormTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFormTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFormType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFormTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFormTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryRequest
     * @return Result of the DeleteGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGlossaryResult deleteGlossary(DeleteGlossaryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlossary(request);
    }

    @SdkInternalApi
    final DeleteGlossaryResult executeDeleteGlossary(DeleteGlossaryRequest deleteGlossaryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlossaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlossaryRequest> request = null;
        Response<DeleteGlossaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlossaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGlossaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlossary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGlossaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGlossaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryTermRequest
     * @return Result of the DeleteGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteGlossaryTermResult deleteGlossaryTerm(DeleteGlossaryTermRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlossaryTerm(request);
    }

    @SdkInternalApi
    final DeleteGlossaryTermResult executeDeleteGlossaryTerm(DeleteGlossaryTermRequest deleteGlossaryTermRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlossaryTermRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlossaryTermRequest> request = null;
        Response<DeleteGlossaryTermResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlossaryTermRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGlossaryTermRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlossaryTerm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGlossaryTermResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGlossaryTermResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param deleteListingRequest
     * @return Result of the DeleteListing operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteListing" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteListingResult deleteListing(DeleteListingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteListing(request);
    }

    @SdkInternalApi
    final DeleteListingResult executeDeleteListing(DeleteListingRequest deleteListingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteListingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteListingRequest> request = null;
        Response<DeleteListingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteListingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteListingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteListing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteListingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteListingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a project in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes project membership in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectMembershipRequest
     * @return Result of the DeleteProjectMembership operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProjectMembershipResult deleteProjectMembership(DeleteProjectMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProjectMembership(request);
    }

    @SdkInternalApi
    final DeleteProjectMembershipResult executeDeleteProjectMembership(DeleteProjectMembershipRequest deleteProjectMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectMembershipRequest> request = null;
        Response<DeleteProjectMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProjectMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProjectMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProjectMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes and subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionGrantRequest
     * @return Result of the DeleteSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSubscriptionGrantResult deleteSubscriptionGrant(DeleteSubscriptionGrantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriptionGrant(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionGrantResult executeDeleteSubscriptionGrant(DeleteSubscriptionGrantRequest deleteSubscriptionGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionGrantRequest> request = null;
        Response<DeleteSubscriptionGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionGrantRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriptionGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriptionGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSubscriptionGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionRequestRequest
     * @return Result of the DeleteSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSubscriptionRequestResult deleteSubscriptionRequest(DeleteSubscriptionRequestRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriptionRequest(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionRequestResult executeDeleteSubscriptionRequest(DeleteSubscriptionRequestRequest deleteSubscriptionRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionRequestRequest> request = null;
        Response<DeleteSubscriptionRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriptionRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriptionRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSubscriptionRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionTargetRequest
     * @return Result of the DeleteSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSubscriptionTargetResult deleteSubscriptionTarget(DeleteSubscriptionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriptionTarget(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionTargetResult executeDeleteSubscriptionTarget(DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionTargetRequest> request = null;
        Response<DeleteSubscriptionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriptionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriptionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSubscriptionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified time series form for the specified asset.
     * </p>
     * 
     * @param deleteTimeSeriesDataPointsRequest
     * @return Result of the DeleteTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTimeSeriesDataPointsResult deleteTimeSeriesDataPoints(DeleteTimeSeriesDataPointsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTimeSeriesDataPoints(request);
    }

    @SdkInternalApi
    final DeleteTimeSeriesDataPointsResult executeDeleteTimeSeriesDataPoints(DeleteTimeSeriesDataPointsRequest deleteTimeSeriesDataPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTimeSeriesDataPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTimeSeriesDataPointsRequest> request = null;
        Response<DeleteTimeSeriesDataPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTimeSeriesDataPointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTimeSeriesDataPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTimeSeriesDataPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTimeSeriesDataPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTimeSeriesDataPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return Result of the GetAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAssetResult getAsset(GetAssetRequest request) {
        request = beforeClientExecution(request);
        return executeGetAsset(request);
    }

    @SdkInternalApi
    final GetAssetResult executeGetAsset(GetAssetRequest getAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetRequest> request = null;
        Response<GetAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone asset type.
     * </p>
     * 
     * @param getAssetTypeRequest
     * @return Result of the GetAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAssetTypeResult getAssetType(GetAssetTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssetType(request);
    }

    @SdkInternalApi
    final GetAssetTypeResult executeGetAssetType(GetAssetTypeRequest getAssetTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetTypeRequest> request = null;
        Response<GetAssetTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssetTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssetType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssetTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Gets an Amazon DataZone data source run.
     * </p>
     * 
     * @param getDataSourceRunRequest
     * @return Result of the GetDataSourceRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSourceRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSourceRunResult getDataSourceRun(GetDataSourceRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSourceRun(request);
    }

    @SdkInternalApi
    final GetDataSourceRunResult executeGetDataSourceRun(GetDataSourceRunRequest getDataSourceRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSourceRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRunRequest> request = null;
        Response<GetDataSourceRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSourceRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSourceRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSourceRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSourceRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomain(request);
    }

    @SdkInternalApi
    final GetDomainResult executeGetDomain(GetDomainRequest getDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEnvironmentResult getEnvironment(GetEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironment(request);
    }

    @SdkInternalApi
    final GetEnvironmentResult executeGetEnvironment(GetEnvironmentRequest getEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentRequest> request = null;
        Response<GetEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon DataZone blueprint.
     * </p>
     * 
     * @param getEnvironmentBlueprintRequest
     * @return Result of the GetEnvironmentBlueprint operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnvironmentBlueprintResult getEnvironmentBlueprint(GetEnvironmentBlueprintRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentBlueprint(request);
    }

    @SdkInternalApi
    final GetEnvironmentBlueprintResult executeGetEnvironmentBlueprint(GetEnvironmentBlueprintRequest getEnvironmentBlueprintRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentBlueprintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentBlueprintRequest> request = null;
        Response<GetEnvironmentBlueprintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentBlueprintRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEnvironmentBlueprintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentBlueprint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentBlueprintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEnvironmentBlueprintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentBlueprintConfigurationRequest
     * @return Result of the GetEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnvironmentBlueprintConfigurationResult getEnvironmentBlueprintConfiguration(GetEnvironmentBlueprintConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentBlueprintConfiguration(request);
    }

    @SdkInternalApi
    final GetEnvironmentBlueprintConfigurationResult executeGetEnvironmentBlueprintConfiguration(
            GetEnvironmentBlueprintConfigurationRequest getEnvironmentBlueprintConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentBlueprintConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentBlueprintConfigurationRequest> request = null;
        Response<GetEnvironmentBlueprintConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentBlueprintConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEnvironmentBlueprintConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentBlueprintConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentBlueprintConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEnvironmentBlueprintConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an evinronment profile in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentProfileRequest
     * @return Result of the GetEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEnvironmentProfileResult getEnvironmentProfile(GetEnvironmentProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentProfile(request);
    }

    @SdkInternalApi
    final GetEnvironmentProfileResult executeGetEnvironmentProfile(GetEnvironmentProfileRequest getEnvironmentProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentProfileRequest> request = null;
        Response<GetEnvironmentProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetEnvironmentProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param getFormTypeRequest
     * @return Result of the GetFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetFormType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFormTypeResult getFormType(GetFormTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetFormType(request);
    }

    @SdkInternalApi
    final GetFormTypeResult executeGetFormType(GetFormTypeRequest getFormTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getFormTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFormTypeRequest> request = null;
        Response<GetFormTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFormTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFormTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFormType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFormTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFormTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryRequest
     * @return Result of the GetGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGlossaryResult getGlossary(GetGlossaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetGlossary(request);
    }

    @SdkInternalApi
    final GetGlossaryResult executeGetGlossary(GetGlossaryRequest getGlossaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getGlossaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlossaryRequest> request = null;
        Response<GetGlossaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlossaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGlossaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGlossary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGlossaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGlossaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryTermRequest
     * @return Result of the GetGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossaryTerm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGlossaryTermResult getGlossaryTerm(GetGlossaryTermRequest request) {
        request = beforeClientExecution(request);
        return executeGetGlossaryTerm(request);
    }

    @SdkInternalApi
    final GetGlossaryTermResult executeGetGlossaryTerm(GetGlossaryTermRequest getGlossaryTermRequest) {

        ExecutionContext executionContext = createExecutionContext(getGlossaryTermRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlossaryTermRequest> request = null;
        Response<GetGlossaryTermResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlossaryTermRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGlossaryTermRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGlossaryTerm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGlossaryTermResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGlossaryTermResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a group profile in Amazon DataZone.
     * </p>
     * 
     * @param getGroupProfileRequest
     * @return Result of the GetGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGroupProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupProfileResult getGroupProfile(GetGroupProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroupProfile(request);
    }

    @SdkInternalApi
    final GetGroupProfileResult executeGetGroupProfile(GetGroupProfileRequest getGroupProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupProfileRequest> request = null;
        Response<GetGroupProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroupProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the data portal URL for the specified Amazon DataZone domain.
     * </p>
     * 
     * @param getIamPortalLoginUrlRequest
     * @return Result of the GetIamPortalLoginUrl operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetIamPortalLoginUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetIamPortalLoginUrl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIamPortalLoginUrlResult getIamPortalLoginUrl(GetIamPortalLoginUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetIamPortalLoginUrl(request);
    }

    @SdkInternalApi
    final GetIamPortalLoginUrlResult executeGetIamPortalLoginUrl(GetIamPortalLoginUrlRequest getIamPortalLoginUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getIamPortalLoginUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIamPortalLoginUrlRequest> request = null;
        Response<GetIamPortalLoginUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIamPortalLoginUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIamPortalLoginUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIamPortalLoginUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIamPortalLoginUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIamPortalLoginUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param getListingRequest
     * @return Result of the GetListing operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetListing" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetListingResult getListing(GetListingRequest request) {
        request = beforeClientExecution(request);
        return executeGetListing(request);
    }

    @SdkInternalApi
    final GetListingResult executeGetListing(GetListingRequest getListingRequest) {

        ExecutionContext executionContext = createExecutionContext(getListingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetListingRequest> request = null;
        Response<GetListingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetListingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getListingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetListing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetListingResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetListingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a metadata generation run in Amazon DataZone.
     * </p>
     * 
     * @param getMetadataGenerationRunRequest
     * @return Result of the GetMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMetadataGenerationRunResult getMetadataGenerationRun(GetMetadataGenerationRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetadataGenerationRun(request);
    }

    @SdkInternalApi
    final GetMetadataGenerationRunResult executeGetMetadataGenerationRun(GetMetadataGenerationRunRequest getMetadataGenerationRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetadataGenerationRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetadataGenerationRunRequest> request = null;
        Response<GetMetadataGenerationRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetadataGenerationRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMetadataGenerationRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetadataGenerationRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMetadataGenerationRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMetadataGenerationRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a project in Amazon DataZone.
     * </p>
     * 
     * @param getProjectRequest
     * @return Result of the GetProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProjectResult getProject(GetProjectRequest request) {
        request = beforeClientExecution(request);
        return executeGetProject(request);
    }

    @SdkInternalApi
    final GetProjectResult executeGetProject(GetProjectRequest getProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(getProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProjectRequest> request = null;
        Response<GetProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a subscription in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionRequest
     * @return Result of the GetSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSubscriptionResult getSubscription(GetSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscription(request);
    }

    @SdkInternalApi
    final GetSubscriptionResult executeGetSubscription(GetSubscriptionRequest getSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionRequest> request = null;
        Response<GetSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionGrantRequest
     * @return Result of the GetSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSubscriptionGrantResult getSubscriptionGrant(GetSubscriptionGrantRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriptionGrant(request);
    }

    @SdkInternalApi
    final GetSubscriptionGrantResult executeGetSubscriptionGrant(GetSubscriptionGrantRequest getSubscriptionGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionGrantRequest> request = null;
        Response<GetSubscriptionGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubscriptionGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriptionGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriptionGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSubscriptionGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of the specified subscription request.
     * </p>
     * 
     * @param getSubscriptionRequestDetailsRequest
     * @return Result of the GetSubscriptionRequestDetails operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionRequestDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionRequestDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSubscriptionRequestDetailsResult getSubscriptionRequestDetails(GetSubscriptionRequestDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriptionRequestDetails(request);
    }

    @SdkInternalApi
    final GetSubscriptionRequestDetailsResult executeGetSubscriptionRequestDetails(GetSubscriptionRequestDetailsRequest getSubscriptionRequestDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionRequestDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionRequestDetailsRequest> request = null;
        Response<GetSubscriptionRequestDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionRequestDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSubscriptionRequestDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriptionRequestDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriptionRequestDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSubscriptionRequestDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the subscription target in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionTargetRequest
     * @return Result of the GetSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSubscriptionTargetResult getSubscriptionTarget(GetSubscriptionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriptionTarget(request);
    }

    @SdkInternalApi
    final GetSubscriptionTargetResult executeGetSubscriptionTarget(GetSubscriptionTargetRequest getSubscriptionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionTargetRequest> request = null;
        Response<GetSubscriptionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubscriptionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriptionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriptionTargetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSubscriptionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the existing data point for the asset.
     * </p>
     * 
     * @param getTimeSeriesDataPointRequest
     * @return Result of the GetTimeSeriesDataPoint operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetTimeSeriesDataPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTimeSeriesDataPointResult getTimeSeriesDataPoint(GetTimeSeriesDataPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetTimeSeriesDataPoint(request);
    }

    @SdkInternalApi
    final GetTimeSeriesDataPointResult executeGetTimeSeriesDataPoint(GetTimeSeriesDataPointRequest getTimeSeriesDataPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getTimeSeriesDataPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTimeSeriesDataPointRequest> request = null;
        Response<GetTimeSeriesDataPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTimeSeriesDataPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTimeSeriesDataPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTimeSeriesDataPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTimeSeriesDataPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTimeSeriesDataPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a user profile in Amazon DataZone.
     * </p>
     * 
     * @param getUserProfileRequest
     * @return Result of the GetUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserProfileResult getUserProfile(GetUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserProfile(request);
    }

    @SdkInternalApi
    final GetUserProfileResult executeGetUserProfile(GetUserProfileRequest getUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserProfileRequest> request = null;
        Response<GetUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the revisions for the asset.
     * </p>
     * 
     * @param listAssetRevisionsRequest
     * @return Result of the ListAssetRevisions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListAssetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListAssetRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssetRevisionsResult listAssetRevisions(ListAssetRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssetRevisions(request);
    }

    @SdkInternalApi
    final ListAssetRevisionsResult executeListAssetRevisions(ListAssetRevisionsRequest listAssetRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetRevisionsRequest> request = null;
        Response<ListAssetRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssetRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists data source run activities.
     * </p>
     * 
     * @param listDataSourceRunActivitiesRequest
     * @return Result of the ListDataSourceRunActivities operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSourceRunActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRunActivities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataSourceRunActivitiesResult listDataSourceRunActivities(ListDataSourceRunActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSourceRunActivities(request);
    }

    @SdkInternalApi
    final ListDataSourceRunActivitiesResult executeListDataSourceRunActivities(ListDataSourceRunActivitiesRequest listDataSourceRunActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourceRunActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourceRunActivitiesRequest> request = null;
        Response<ListDataSourceRunActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourceRunActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDataSourceRunActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSourceRunActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourceRunActivitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataSourceRunActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists data source runs in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourceRunsRequest
     * @return Result of the ListDataSourceRuns operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSourceRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRuns" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDataSourceRunsResult listDataSourceRuns(ListDataSourceRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSourceRuns(request);
    }

    @SdkInternalApi
    final ListDataSourceRunsResult executeListDataSourceRuns(ListDataSourceRunsRequest listDataSourceRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourceRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourceRunsRequest> request = null;
        Response<ListDataSourceRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourceRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourceRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSourceRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourceRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourceRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists data sources in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSources" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Lists Amazon DataZone domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists blueprint configurations for a Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintConfigurationsRequest
     * @return Result of the ListEnvironmentBlueprintConfigurations operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentBlueprintConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprintConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentBlueprintConfigurationsResult listEnvironmentBlueprintConfigurations(ListEnvironmentBlueprintConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentBlueprintConfigurations(request);
    }

    @SdkInternalApi
    final ListEnvironmentBlueprintConfigurationsResult executeListEnvironmentBlueprintConfigurations(
            ListEnvironmentBlueprintConfigurationsRequest listEnvironmentBlueprintConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentBlueprintConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentBlueprintConfigurationsRequest> request = null;
        Response<ListEnvironmentBlueprintConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentBlueprintConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentBlueprintConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentBlueprintConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentBlueprintConfigurationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListEnvironmentBlueprintConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists blueprints in an Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintsRequest
     * @return Result of the ListEnvironmentBlueprints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentBlueprintsResult listEnvironmentBlueprints(ListEnvironmentBlueprintsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentBlueprints(request);
    }

    @SdkInternalApi
    final ListEnvironmentBlueprintsResult executeListEnvironmentBlueprints(ListEnvironmentBlueprintsRequest listEnvironmentBlueprintsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentBlueprintsRequest> request = null;
        Response<ListEnvironmentBlueprintsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentBlueprintsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentBlueprintsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentBlueprints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentBlueprintsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnvironmentBlueprintsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon DataZone environment profiles.
     * </p>
     * 
     * @param listEnvironmentProfilesRequest
     * @return Result of the ListEnvironmentProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentProfilesResult listEnvironmentProfiles(ListEnvironmentProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentProfiles(request);
    }

    @SdkInternalApi
    final ListEnvironmentProfilesResult executeListEnvironmentProfiles(ListEnvironmentProfilesRequest listEnvironmentProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentProfilesRequest> request = null;
        Response<ListEnvironmentProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentProfilesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnvironmentProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon DataZone environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironments(request);
    }

    @SdkInternalApi
    final ListEnvironmentsResult executeListEnvironments(ListEnvironmentsRequest listEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentsRequest> request = null;
        Response<ListEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all metadata generation runs.
     * </p>
     * 
     * @param listMetadataGenerationRunsRequest
     * @return Result of the ListMetadataGenerationRuns operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListMetadataGenerationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMetadataGenerationRunsResult listMetadataGenerationRuns(ListMetadataGenerationRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListMetadataGenerationRuns(request);
    }

    @SdkInternalApi
    final ListMetadataGenerationRunsResult executeListMetadataGenerationRuns(ListMetadataGenerationRunsRequest listMetadataGenerationRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMetadataGenerationRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMetadataGenerationRunsRequest> request = null;
        Response<ListMetadataGenerationRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMetadataGenerationRunsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMetadataGenerationRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMetadataGenerationRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMetadataGenerationRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMetadataGenerationRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Amazon DataZone notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNotificationsResult listNotifications(ListNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotifications(request);
    }

    @SdkInternalApi
    final ListNotificationsResult executeListNotifications(ListNotificationsRequest listNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationsRequest> request = null;
        Response<ListNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all members of the specified project.
     * </p>
     * 
     * @param listProjectMembershipsRequest
     * @return Result of the ListProjectMemberships operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListProjectMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjectMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProjectMembershipsResult listProjectMemberships(ListProjectMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjectMemberships(request);
    }

    @SdkInternalApi
    final ListProjectMembershipsResult executeListProjectMemberships(ListProjectMembershipsRequest listProjectMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectMembershipsRequest> request = null;
        Response<ListProjectMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjectMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProjectMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon DataZone projects.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists subscription grants.
     * </p>
     * 
     * @param listSubscriptionGrantsRequest
     * @return Result of the ListSubscriptionGrants operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionGrants"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSubscriptionGrantsResult listSubscriptionGrants(ListSubscriptionGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptionGrants(request);
    }

    @SdkInternalApi
    final ListSubscriptionGrantsResult executeListSubscriptionGrants(ListSubscriptionGrantsRequest listSubscriptionGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionGrantsRequest> request = null;
        Response<ListSubscriptionGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSubscriptionGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptionGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscriptionGrantsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSubscriptionGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon DataZone subscription requests.
     * </p>
     * 
     * @param listSubscriptionRequestsRequest
     * @return Result of the ListSubscriptionRequests operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSubscriptionRequestsResult listSubscriptionRequests(ListSubscriptionRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptionRequests(request);
    }

    @SdkInternalApi
    final ListSubscriptionRequestsResult executeListSubscriptionRequests(ListSubscriptionRequestsRequest listSubscriptionRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionRequestsRequest> request = null;
        Response<ListSubscriptionRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionRequestsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSubscriptionRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptionRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscriptionRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSubscriptionRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists subscription targets in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionTargetsRequest
     * @return Result of the ListSubscriptionTargets operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSubscriptionTargetsResult listSubscriptionTargets(ListSubscriptionTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptionTargets(request);
    }

    @SdkInternalApi
    final ListSubscriptionTargetsResult executeListSubscriptionTargets(ListSubscriptionTargetsRequest listSubscriptionTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionTargetsRequest> request = null;
        Response<ListSubscriptionTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSubscriptionTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptionTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscriptionTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSubscriptionTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists subscriptions in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionsRequest
     * @return Result of the ListSubscriptions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSubscriptionsResult listSubscriptions(ListSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptions(request);
    }

    @SdkInternalApi
    final ListSubscriptionsResult executeListSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionsRequest> request = null;
        Response<ListSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for the specified resource in Amazon DataZone.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Lists time series data points.
     * </p>
     * 
     * @param listTimeSeriesDataPointsRequest
     * @return Result of the ListTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTimeSeriesDataPointsResult listTimeSeriesDataPoints(ListTimeSeriesDataPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListTimeSeriesDataPoints(request);
    }

    @SdkInternalApi
    final ListTimeSeriesDataPointsResult executeListTimeSeriesDataPoints(ListTimeSeriesDataPointsRequest listTimeSeriesDataPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTimeSeriesDataPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTimeSeriesDataPointsRequest> request = null;
        Response<ListTimeSeriesDataPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTimeSeriesDataPointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTimeSeriesDataPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTimeSeriesDataPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTimeSeriesDataPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTimeSeriesDataPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts time series data points to Amazon DataZone for the specified asset.
     * </p>
     * 
     * @param postTimeSeriesDataPointsRequest
     * @return Result of the PostTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.PostTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PostTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostTimeSeriesDataPointsResult postTimeSeriesDataPoints(PostTimeSeriesDataPointsRequest request) {
        request = beforeClientExecution(request);
        return executePostTimeSeriesDataPoints(request);
    }

    @SdkInternalApi
    final PostTimeSeriesDataPointsResult executePostTimeSeriesDataPoints(PostTimeSeriesDataPointsRequest postTimeSeriesDataPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(postTimeSeriesDataPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostTimeSeriesDataPointsRequest> request = null;
        Response<PostTimeSeriesDataPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostTimeSeriesDataPointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(postTimeSeriesDataPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostTimeSeriesDataPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostTimeSeriesDataPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PostTimeSeriesDataPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes the configuration for the specified environment blueprint in Amazon DataZone.
     * </p>
     * 
     * @param putEnvironmentBlueprintConfigurationRequest
     * @return Result of the PutEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.PutEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PutEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEnvironmentBlueprintConfigurationResult putEnvironmentBlueprintConfiguration(PutEnvironmentBlueprintConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutEnvironmentBlueprintConfiguration(request);
    }

    @SdkInternalApi
    final PutEnvironmentBlueprintConfigurationResult executePutEnvironmentBlueprintConfiguration(
            PutEnvironmentBlueprintConfigurationRequest putEnvironmentBlueprintConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putEnvironmentBlueprintConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEnvironmentBlueprintConfigurationRequest> request = null;
        Response<PutEnvironmentBlueprintConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEnvironmentBlueprintConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEnvironmentBlueprintConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEnvironmentBlueprintConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEnvironmentBlueprintConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEnvironmentBlueprintConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param rejectPredictionsRequest
     * @return Result of the RejectPredictions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RejectPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RejectPredictionsResult rejectPredictions(RejectPredictionsRequest request) {
        request = beforeClientExecution(request);
        return executeRejectPredictions(request);
    }

    @SdkInternalApi
    final RejectPredictionsResult executeRejectPredictions(RejectPredictionsRequest rejectPredictionsRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectPredictionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectPredictionsRequest> request = null;
        Response<RejectPredictionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectPredictionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectPredictionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectPredictions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectPredictionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectPredictionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects the specified subscription request.
     * </p>
     * 
     * @param rejectSubscriptionRequestRequest
     * @return Result of the RejectSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RejectSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectSubscriptionRequestResult rejectSubscriptionRequest(RejectSubscriptionRequestRequest request) {
        request = beforeClientExecution(request);
        return executeRejectSubscriptionRequest(request);
    }

    @SdkInternalApi
    final RejectSubscriptionRequestResult executeRejectSubscriptionRequest(RejectSubscriptionRequestRequest rejectSubscriptionRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectSubscriptionRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectSubscriptionRequestRequest> request = null;
        Response<RejectSubscriptionRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectSubscriptionRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectSubscriptionRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectSubscriptionRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectSubscriptionRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectSubscriptionRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes a specified subscription in Amazon DataZone.
     * </p>
     * 
     * @param revokeSubscriptionRequest
     * @return Result of the RevokeSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RevokeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RevokeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RevokeSubscriptionResult revokeSubscription(RevokeSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeSubscription(request);
    }

    @SdkInternalApi
    final RevokeSubscriptionResult executeRevokeSubscription(RevokeSubscriptionRequest revokeSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSubscriptionRequest> request = null;
        Response<RevokeSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for assets in Amazon DataZone.
     * </p>
     * 
     * @param searchRequest
     * @return Result of the Search operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Search" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchResult search(SearchRequest request) {
        request = beforeClientExecution(request);
        return executeSearch(request);
    }

    @SdkInternalApi
    final SearchResult executeSearch(SearchRequest searchRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Search");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches group profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchGroupProfilesRequest
     * @return Result of the SearchGroupProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchGroupProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchGroupProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchGroupProfilesResult searchGroupProfiles(SearchGroupProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchGroupProfiles(request);
    }

    @SdkInternalApi
    final SearchGroupProfilesResult executeSearchGroupProfiles(SearchGroupProfilesRequest searchGroupProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchGroupProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchGroupProfilesRequest> request = null;
        Response<SearchGroupProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchGroupProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchGroupProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchGroupProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchGroupProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchGroupProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches listings (records of an asset at a given time) in Amazon DataZone.
     * </p>
     * 
     * @param searchListingsRequest
     * @return Result of the SearchListings operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchListings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchListingsResult searchListings(SearchListingsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchListings(request);
    }

    @SdkInternalApi
    final SearchListingsResult executeSearchListings(SearchListingsRequest searchListingsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchListingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchListingsRequest> request = null;
        Response<SearchListingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchListingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchListingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchListings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchListingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchListingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for types in Amazon DataZone.
     * </p>
     * 
     * @param searchTypesRequest
     * @return Result of the SearchTypes operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchTypesResult searchTypes(SearchTypesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchTypes(request);
    }

    @SdkInternalApi
    final SearchTypesResult executeSearchTypes(SearchTypesRequest searchTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchTypesRequest> request = null;
        Response<SearchTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches user profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchUserProfilesRequest
     * @return Result of the SearchUserProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchUserProfilesResult searchUserProfiles(SearchUserProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchUserProfiles(request);
    }

    @SdkInternalApi
    final SearchUserProfilesResult executeSearchUserProfiles(SearchUserProfilesRequest searchUserProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUserProfilesRequest> request = null;
        Response<SearchUserProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUserProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchUserProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchUserProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchUserProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchUserProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start the run of the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param startDataSourceRunRequest
     * @return Result of the StartDataSourceRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.StartDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartDataSourceRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartDataSourceRunResult startDataSourceRun(StartDataSourceRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartDataSourceRun(request);
    }

    @SdkInternalApi
    final StartDataSourceRunResult executeStartDataSourceRun(StartDataSourceRunRequest startDataSourceRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startDataSourceRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataSourceRunRequest> request = null;
        Response<StartDataSourceRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataSourceRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDataSourceRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDataSourceRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDataSourceRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDataSourceRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the metadata generation run.
     * </p>
     * 
     * @param startMetadataGenerationRunRequest
     * @return Result of the StartMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.StartMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMetadataGenerationRunResult startMetadataGenerationRun(StartMetadataGenerationRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataGenerationRun(request);
    }

    @SdkInternalApi
    final StartMetadataGenerationRunResult executeStartMetadataGenerationRun(StartMetadataGenerationRunRequest startMetadataGenerationRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataGenerationRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataGenerationRunRequest> request = null;
        Response<StartMetadataGenerationRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataGenerationRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataGenerationRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataGenerationRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataGenerationRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataGenerationRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource in Amazon DataZone.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Untags a resource in Amazon DataZone.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Updates the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
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
     * Updates a Amazon DataZone domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDomainResult updateDomain(UpdateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomain(request);
    }

    @SdkInternalApi
    final UpdateDomainResult executeUpdateDomain(UpdateDomainRequest updateDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainRequest> request = null;
        Response<UpdateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified environment in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified environment profile in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentProfileRequest
     * @return Result of the UpdateEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentProfileResult updateEnvironmentProfile(UpdateEnvironmentProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironmentProfile(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentProfileResult executeUpdateEnvironmentProfile(UpdateEnvironmentProfileRequest updateEnvironmentProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentProfileRequest> request = null;
        Response<UpdateEnvironmentProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEnvironmentProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironmentProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnvironmentProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the business glossary in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryRequest
     * @return Result of the UpdateGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGlossaryResult updateGlossary(UpdateGlossaryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlossary(request);
    }

    @SdkInternalApi
    final UpdateGlossaryResult executeUpdateGlossary(UpdateGlossaryRequest updateGlossaryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlossaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlossaryRequest> request = null;
        Response<UpdateGlossaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlossaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlossaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlossary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlossaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlossaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryTermRequest
     * @return Result of the UpdateGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateGlossaryTermResult updateGlossaryTerm(UpdateGlossaryTermRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlossaryTerm(request);
    }

    @SdkInternalApi
    final UpdateGlossaryTermResult executeUpdateGlossaryTerm(UpdateGlossaryTermRequest updateGlossaryTermRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlossaryTermRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlossaryTermRequest> request = null;
        Response<UpdateGlossaryTermResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlossaryTermRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlossaryTermRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlossaryTerm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlossaryTermResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlossaryTermResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified group profile in Amazon DataZone.
     * </p>
     * 
     * @param updateGroupProfileRequest
     * @return Result of the UpdateGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateGroupProfileResult updateGroupProfile(UpdateGroupProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroupProfile(request);
    }

    @SdkInternalApi
    final UpdateGroupProfileResult executeUpdateGroupProfile(UpdateGroupProfileRequest updateGroupProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupProfileRequest> request = null;
        Response<UpdateGroupProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroupProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified project in Amazon DataZone.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of the specified subscription grant status in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionGrantStatusRequest
     * @return Result of the UpdateSubscriptionGrantStatus operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionGrantStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriptionGrantStatusResult updateSubscriptionGrantStatus(UpdateSubscriptionGrantStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriptionGrantStatus(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionGrantStatusResult executeUpdateSubscriptionGrantStatus(UpdateSubscriptionGrantStatusRequest updateSubscriptionGrantStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionGrantStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionGrantStatusRequest> request = null;
        Response<UpdateSubscriptionGrantStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionGrantStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriptionGrantStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriptionGrantStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionGrantStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubscriptionGrantStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified subscription request in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionRequestRequest
     * @return Result of the UpdateSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriptionRequestResult updateSubscriptionRequest(UpdateSubscriptionRequestRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriptionRequest(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionRequestResult executeUpdateSubscriptionRequest(UpdateSubscriptionRequestRequest updateSubscriptionRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionRequestRequest> request = null;
        Response<UpdateSubscriptionRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriptionRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriptionRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubscriptionRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified subscription target in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionTargetRequest
     * @return Result of the UpdateSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriptionTargetResult updateSubscriptionTarget(UpdateSubscriptionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriptionTarget(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionTargetResult executeUpdateSubscriptionTarget(UpdateSubscriptionTargetRequest updateSubscriptionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionTargetRequest> request = null;
        Response<UpdateSubscriptionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriptionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriptionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubscriptionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified user profile in Amazon DataZone.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserProfile(request);
    }

    @SdkInternalApi
    final UpdateUserProfileResult executeUpdateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<UpdateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataZone");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserProfileResultJsonUnmarshaller());
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
