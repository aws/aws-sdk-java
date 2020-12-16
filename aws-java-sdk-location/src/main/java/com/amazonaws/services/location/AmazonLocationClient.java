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
package com.amazonaws.services.location;

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

import com.amazonaws.services.location.AmazonLocationClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.location.model.*;
import com.amazonaws.services.location.model.transform.*;

/**
 * Client for accessing Amazon Location Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Suite of geospatial services including Maps, Places, Tracking, and Geofencing
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLocationClient extends AmazonWebServiceClient implements AmazonLocation {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLocation.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "geo";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.location.model.AmazonLocationException.class));

    public static AmazonLocationClientBuilder builder() {
        return AmazonLocationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Location Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLocationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Location Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLocationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("geo.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/location/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/location/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to
     * communicate location data to the linked geofence collection.
     * </p>
     * 
     * @param associateTrackerConsumerRequest
     * @return Result of the AssociateTrackerConsumer operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.AssociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/AssociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTrackerConsumerResult associateTrackerConsumer(AssociateTrackerConsumerRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTrackerConsumer(request);
    }

    @SdkInternalApi
    final AssociateTrackerConsumerResult executeAssociateTrackerConsumer(AssociateTrackerConsumerRequest associateTrackerConsumerRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTrackerConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrackerConsumerRequest> request = null;
        Response<AssociateTrackerConsumerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrackerConsumerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTrackerConsumerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTrackerConsumer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTrackerConsumerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTrackerConsumerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a batch of geofences from a geofence collection.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action.
     * </p>
     * </note>
     * 
     * @param batchDeleteGeofenceRequest
     * @return Result of the BatchDeleteGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.BatchDeleteGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofence" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDeleteGeofenceResult batchDeleteGeofence(BatchDeleteGeofenceRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteGeofence(request);
    }

    @SdkInternalApi
    final BatchDeleteGeofenceResult executeBatchDeleteGeofence(BatchDeleteGeofenceRequest batchDeleteGeofenceRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteGeofenceRequest> request = null;
        Response<BatchDeleteGeofenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteGeofenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteGeofenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteGeofence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteGeofenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteGeofenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used in geofence monitoring. Evaluates device positions against the position of geofences in a given geofence
     * collection.
     * </p>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return Result of the BatchEvaluateGeofences operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.BatchEvaluateGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchEvaluateGeofences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchEvaluateGeofencesResult batchEvaluateGeofences(BatchEvaluateGeofencesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchEvaluateGeofences(request);
    }

    @SdkInternalApi
    final BatchEvaluateGeofencesResult executeBatchEvaluateGeofences(BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchEvaluateGeofencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEvaluateGeofencesRequest> request = null;
        Response<BatchEvaluateGeofencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEvaluateGeofencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchEvaluateGeofencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchEvaluateGeofences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchEvaluateGeofencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchEvaluateGeofencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A batch request to retrieve device positions.
     * </p>
     * <note>
     * <p>
     * The response will return the device positions from the last 24 hours.
     * </p>
     * </note>
     * 
     * @param batchGetDevicePositionRequest
     * @return Result of the BatchGetDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.BatchGetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetDevicePositionResult batchGetDevicePosition(BatchGetDevicePositionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDevicePosition(request);
    }

    @SdkInternalApi
    final BatchGetDevicePositionResult executeBatchGetDevicePosition(BatchGetDevicePositionRequest batchGetDevicePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDevicePositionRequest> request = null;
        Response<BatchGetDevicePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDevicePositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetDevicePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDevicePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDevicePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetDevicePositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A batch request for storing geofences into a given geofence collection.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return Result of the BatchPutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.BatchPutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchPutGeofenceResult batchPutGeofence(BatchPutGeofenceRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutGeofence(request);
    }

    @SdkInternalApi
    final BatchPutGeofenceResult executeBatchPutGeofence(BatchPutGeofenceRequest batchPutGeofenceRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutGeofenceRequest> request = null;
        Response<BatchPutGeofenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutGeofenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutGeofenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutGeofence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutGeofenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutGeofenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads a position update for one or more devices to a tracker resource. The data is used for API queries
     * requesting the device position and position history.
     * </p>
     * <note>
     * <p>
     * Limitation — Location data is sampled at a fixed rate of 1 position per 30 second interval, and retained for 1
     * year before it is deleted.
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @return Result of the BatchUpdateDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.BatchUpdateDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchUpdateDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateDevicePositionResult batchUpdateDevicePosition(BatchUpdateDevicePositionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateDevicePosition(request);
    }

    @SdkInternalApi
    final BatchUpdateDevicePositionResult executeBatchUpdateDevicePosition(BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateDevicePositionRequest> request = null;
        Response<BatchUpdateDevicePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateDevicePositionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateDevicePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateDevicePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateDevicePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchUpdateDevicePositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @return Result of the CreateGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.CreateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGeofenceCollectionResult createGeofenceCollection(CreateGeofenceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGeofenceCollection(request);
    }

    @SdkInternalApi
    final CreateGeofenceCollectionResult executeCreateGeofenceCollection(CreateGeofenceCollectionRequest createGeofenceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGeofenceCollectionRequest> request = null;
        Response<CreateGeofenceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGeofenceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createGeofenceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGeofenceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGeofenceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateGeofenceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global
     * location data providers.
     * </p>
     * <note>
     * <p>
     * By using Maps, you agree that AWS may transmit your API queries to your selected third party provider for
     * processing, which may be outside the AWS region you are currently using. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param createMapRequest
     * @return Result of the CreateMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.CreateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMapResult createMap(CreateMapRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMap(request);
    }

    @SdkInternalApi
    final CreateMapResult executeCreateMap(CreateMapRequest createMapRequest) {

        ExecutionContext executionContext = createExecutionContext(createMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMapRequest> request = null;
        Response<CreateMapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMapRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMap");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMapResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Place index resource in your AWS account, which supports Places functions with geospatial data sourced
     * from your chosen data provider.
     * </p>
     * <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your selected third party provider for
     * processing, which may be outside the AWS region you are currently using.
     * </p>
     * <p>
     * Because of licensing limitations, you may not use HERE to store results for locations in Japan. For more
     * information, see the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location
     * Service.
     * </p>
     * </note>
     * 
     * @param createPlaceIndexRequest
     * @return Result of the CreatePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.CreatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePlaceIndexResult createPlaceIndex(CreatePlaceIndexRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlaceIndex(request);
    }

    @SdkInternalApi
    final CreatePlaceIndexResult executeCreatePlaceIndex(CreatePlaceIndexRequest createPlaceIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlaceIndexRequest> request = null;
        Response<CreatePlaceIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlaceIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPlaceIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlaceIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePlaceIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePlaceIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of
     * devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @return Result of the CreateTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.CreateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTrackerResult createTracker(CreateTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTracker(request);
    }

    @SdkInternalApi
    final CreateTrackerResult executeCreateTracker(CreateTrackerRequest createTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrackerRequest> request = null;
        Response<CreateTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a geofence collection from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action. If the geofence collection is the
     * target of a tracker resource, the devices will no longer be monitored.
     * </p>
     * </note>
     * 
     * @param deleteGeofenceCollectionRequest
     * @return Result of the DeleteGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DeleteGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGeofenceCollectionResult deleteGeofenceCollection(DeleteGeofenceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGeofenceCollection(request);
    }

    @SdkInternalApi
    final DeleteGeofenceCollectionResult executeDeleteGeofenceCollection(DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGeofenceCollectionRequest> request = null;
        Response<DeleteGeofenceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGeofenceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteGeofenceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGeofenceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGeofenceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteGeofenceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a map resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You cannot undo this action. If the map is being used in an
     * application, the map may not render.
     * </p>
     * </note>
     * 
     * @param deleteMapRequest
     * @return Result of the DeleteMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DeleteMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteMap" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMapResult deleteMap(DeleteMapRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMap(request);
    }

    @SdkInternalApi
    final DeleteMapResult executeDeleteMap(DeleteMapRequest deleteMapRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMapRequest> request = null;
        Response<DeleteMapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMapRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMap");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMapResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Place index resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You cannot undo this action.
     * </p>
     * </note>
     * 
     * @param deletePlaceIndexRequest
     * @return Result of the DeletePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DeletePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeletePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePlaceIndexResult deletePlaceIndex(DeletePlaceIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlaceIndex(request);
    }

    @SdkInternalApi
    final DeletePlaceIndexResult executeDeletePlaceIndex(DeletePlaceIndexRequest deletePlaceIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlaceIndexRequest> request = null;
        Response<DeletePlaceIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlaceIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePlaceIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlaceIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePlaceIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePlaceIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a tracker resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action. If the tracker resource is in use, you
     * may encounter an error. Make sure that the target resource is not a dependency for your applications.
     * </p>
     * </note>
     * 
     * @param deleteTrackerRequest
     * @return Result of the DeleteTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DeleteTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteTracker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTrackerResult deleteTracker(DeleteTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTracker(request);
    }

    @SdkInternalApi
    final DeleteTrackerResult executeDeleteTracker(DeleteTrackerRequest deleteTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrackerRequest> request = null;
        Response<DeleteTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @return Result of the DescribeGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DescribeGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGeofenceCollectionResult describeGeofenceCollection(DescribeGeofenceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGeofenceCollection(request);
    }

    @SdkInternalApi
    final DescribeGeofenceCollectionResult executeDescribeGeofenceCollection(DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGeofenceCollectionRequest> request = null;
        Response<DescribeGeofenceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGeofenceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGeofenceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGeofenceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGeofenceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGeofenceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @return Result of the DescribeMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DescribeMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeMap" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeMapResult describeMap(DescribeMapRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMap(request);
    }

    @SdkInternalApi
    final DescribeMapResult executeDescribeMap(DescribeMapRequest describeMapRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMapRequest> request = null;
        Response<DescribeMapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMapRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMap");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMapResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return Result of the DescribePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DescribePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribePlaceIndex" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePlaceIndexResult describePlaceIndex(DescribePlaceIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePlaceIndex(request);
    }

    @SdkInternalApi
    final DescribePlaceIndexResult executeDescribePlaceIndex(DescribePlaceIndexRequest describePlaceIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(describePlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlaceIndexRequest> request = null;
        Response<DescribePlaceIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlaceIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePlaceIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePlaceIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePlaceIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePlaceIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @return Result of the DescribeTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DescribeTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeTracker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTrackerResult describeTracker(DescribeTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTracker(request);
    }

    @SdkInternalApi
    final DescribeTrackerResult executeDescribeTracker(DescribeTrackerRequest describeTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrackerRequest> request = null;
        Response<DescribeTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association bewteen a tracker resource and a geofence collection.
     * </p>
     * <note>
     * <p>
     * Once you unlink a tracker resource from a geofence collection, the tracker positions will no longer be
     * automatically evaluated against geofences.
     * </p>
     * </note>
     * 
     * @param disassociateTrackerConsumerRequest
     * @return Result of the DisassociateTrackerConsumer operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.DisassociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DisassociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTrackerConsumerResult disassociateTrackerConsumer(DisassociateTrackerConsumerRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTrackerConsumer(request);
    }

    @SdkInternalApi
    final DisassociateTrackerConsumerResult executeDisassociateTrackerConsumer(DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTrackerConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrackerConsumerRequest> request = null;
        Response<DisassociateTrackerConsumerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrackerConsumerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateTrackerConsumerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTrackerConsumer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTrackerConsumerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTrackerConsumerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the latest device position.
     * </p>
     * <note>
     * <p>
     * Limitation — Device positions are deleted after one year.
     * </p>
     * </note>
     * 
     * @param getDevicePositionRequest
     * @return Result of the GetDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevicePositionResult getDevicePosition(GetDevicePositionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevicePosition(request);
    }

    @SdkInternalApi
    final GetDevicePositionResult executeGetDevicePosition(GetDevicePositionRequest getDevicePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePositionRequest> request = null;
        Response<GetDevicePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevicePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevicePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevicePositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the device position history from a tracker resource within a specified range of time.
     * </p>
     * <note>
     * <p>
     * Limitation — Device positions are deleted after one year.
     * </p>
     * </note>
     * 
     * @param getDevicePositionHistoryRequest
     * @return Result of the GetDevicePositionHistory operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDevicePositionHistoryResult getDevicePositionHistory(GetDevicePositionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevicePositionHistory(request);
    }

    @SdkInternalApi
    final GetDevicePositionHistoryResult executeGetDevicePositionHistory(GetDevicePositionHistoryRequest getDevicePositionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicePositionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePositionHistoryRequest> request = null;
        Response<GetDevicePositionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePositionHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDevicePositionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevicePositionHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicePositionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDevicePositionHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @return Result of the GetGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGeofenceResult getGeofence(GetGeofenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetGeofence(request);
    }

    @SdkInternalApi
    final GetGeofenceResult executeGetGeofence(GetGeofenceRequest getGeofenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGeofenceRequest> request = null;
        Response<GetGeofenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGeofenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGeofenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGeofence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGeofenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGeofenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @return Result of the GetMapGlyphs operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetMapGlyphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMapGlyphsResult getMapGlyphs(GetMapGlyphsRequest request) {
        request = beforeClientExecution(request);
        return executeGetMapGlyphs(request);
    }

    @SdkInternalApi
    final GetMapGlyphsResult executeGetMapGlyphs(GetMapGlyphsRequest getMapGlyphsRequest) {

        ExecutionContext executionContext = createExecutionContext(getMapGlyphsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapGlyphsRequest> request = null;
        Response<GetMapGlyphsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapGlyphsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMapGlyphsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMapGlyphs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMapGlyphsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetMapGlyphsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON
     * document describing the offsets of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @return Result of the GetMapSprites operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetMapSprites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapSprites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMapSpritesResult getMapSprites(GetMapSpritesRequest request) {
        request = beforeClientExecution(request);
        return executeGetMapSprites(request);
    }

    @SdkInternalApi
    final GetMapSpritesResult executeGetMapSprites(GetMapSpritesRequest getMapSpritesRequest) {

        ExecutionContext executionContext = createExecutionContext(getMapSpritesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapSpritesRequest> request = null;
        Response<GetMapSpritesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapSpritesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMapSpritesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMapSprites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMapSpritesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetMapSpritesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the map style descriptor from a map resource.
     * </p>
     * <p>
     * The style descriptor contains speciﬁcations on how features render on a map. For example, what data to display,
     * what order to display the data in, and the style for the data. Style descriptors follow the Mapbox Style
     * Specification.
     * </p>
     * 
     * @param getMapStyleDescriptorRequest
     * @return Result of the GetMapStyleDescriptor operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetMapStyleDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMapStyleDescriptorResult getMapStyleDescriptor(GetMapStyleDescriptorRequest request) {
        request = beforeClientExecution(request);
        return executeGetMapStyleDescriptor(request);
    }

    @SdkInternalApi
    final GetMapStyleDescriptorResult executeGetMapStyleDescriptor(GetMapStyleDescriptorRequest getMapStyleDescriptorRequest) {

        ExecutionContext executionContext = createExecutionContext(getMapStyleDescriptorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapStyleDescriptorRequest> request = null;
        Response<GetMapStyleDescriptorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapStyleDescriptorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMapStyleDescriptorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMapStyleDescriptor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMapStyleDescriptorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new GetMapStyleDescriptorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a vector data tile from the map resource. Map tiles are used by clients to render a map. They are
     * addressed using a grid arrangement with an X coordinate, Y coordinate, and Z (zoom) level.
     * </p>
     * <p>
     * The origin (0, 0) is the top left of the map. Increasing the zoom level by 1 doubles both the X and Y dimensions,
     * so a tile containing data for the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0, 1/0/1,
     * 1/1/0, 1/1/1).
     * </p>
     * 
     * @param getMapTileRequest
     * @return Result of the GetMapTile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.GetMapTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapTile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMapTileResult getMapTile(GetMapTileRequest request) {
        request = beforeClientExecution(request);
        return executeGetMapTile(request);
    }

    @SdkInternalApi
    final GetMapTileResult executeGetMapTile(GetMapTileRequest getMapTileRequest) {

        ExecutionContext executionContext = createExecutionContext(getMapTileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapTileRequest> request = null;
        Response<GetMapTileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapTileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMapTileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMapTile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMapTileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetMapTileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @return Result of the ListGeofenceCollections operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListGeofenceCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofenceCollections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGeofenceCollectionsResult listGeofenceCollections(ListGeofenceCollectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListGeofenceCollections(request);
    }

    @SdkInternalApi
    final ListGeofenceCollectionsResult executeListGeofenceCollections(ListGeofenceCollectionsRequest listGeofenceCollectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGeofenceCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeofenceCollectionsRequest> request = null;
        Response<ListGeofenceCollectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeofenceCollectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listGeofenceCollectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGeofenceCollections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGeofenceCollectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListGeofenceCollectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @return Result of the ListGeofences operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofences" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGeofencesResult listGeofences(ListGeofencesRequest request) {
        request = beforeClientExecution(request);
        return executeListGeofences(request);
    }

    @SdkInternalApi
    final ListGeofencesResult executeListGeofences(ListGeofencesRequest listGeofencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGeofencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeofencesRequest> request = null;
        Response<ListGeofencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeofencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGeofencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGeofences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGeofencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGeofencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @return Result of the ListMaps operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListMaps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListMaps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMapsResult listMaps(ListMapsRequest request) {
        request = beforeClientExecution(request);
        return executeListMaps(request);
    }

    @SdkInternalApi
    final ListMapsResult executeListMaps(ListMapsRequest listMapsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMapsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMapsRequest> request = null;
        Response<ListMapsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMapsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMapsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMaps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "maps.";
                String resolvedHostPrefix = String.format("maps.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMapsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMapsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return Result of the ListPlaceIndexes operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListPlaceIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListPlaceIndexes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPlaceIndexesResult listPlaceIndexes(ListPlaceIndexesRequest request) {
        request = beforeClientExecution(request);
        return executeListPlaceIndexes(request);
    }

    @SdkInternalApi
    final ListPlaceIndexesResult executeListPlaceIndexes(ListPlaceIndexesRequest listPlaceIndexesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlaceIndexesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlaceIndexesRequest> request = null;
        Response<ListPlaceIndexesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlaceIndexesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPlaceIndexesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlaceIndexes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPlaceIndexesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPlaceIndexesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @return Result of the ListTrackerConsumers operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListTrackerConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackerConsumers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTrackerConsumersResult listTrackerConsumers(ListTrackerConsumersRequest request) {
        request = beforeClientExecution(request);
        return executeListTrackerConsumers(request);
    }

    @SdkInternalApi
    final ListTrackerConsumersResult executeListTrackerConsumers(ListTrackerConsumersRequest listTrackerConsumersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrackerConsumersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrackerConsumersRequest> request = null;
        Response<ListTrackerConsumersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrackerConsumersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrackerConsumersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrackerConsumers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrackerConsumersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrackerConsumersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @return Result of the ListTrackers operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.ListTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTrackersResult listTrackers(ListTrackersRequest request) {
        request = beforeClientExecution(request);
        return executeListTrackers(request);
    }

    @SdkInternalApi
    final ListTrackersResult executeListTrackers(ListTrackersRequest listTrackersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrackersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrackersRequest> request = null;
        Response<ListTrackersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrackersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrackersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrackers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tracking.";
                String resolvedHostPrefix = String.format("tracking.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrackersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrackersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stores a geofence to a given geofence collection, or updates the geometry of an existing geofence if a geofence
     * ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return Result of the PutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful due to a conflict.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.PutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutGeofenceResult putGeofence(PutGeofenceRequest request) {
        request = beforeClientExecution(request);
        return executePutGeofence(request);
    }

    @SdkInternalApi
    final PutGeofenceResult executePutGeofence(PutGeofenceRequest putGeofenceRequest) {

        ExecutionContext executionContext = createExecutionContext(putGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGeofenceRequest> request = null;
        Response<PutGeofenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGeofenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putGeofenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutGeofence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "geofencing.";
                String resolvedHostPrefix = String.format("geofencing.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutGeofenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutGeofenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of
     * interest near a given position.
     * </p>
     * <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your selected third party provider for
     * processing, which may be outside the AWS region you are currently using.
     * </p>
     * <p>
     * Because of licensing limitations, you may not use HERE to store results for locations in Japan. For more
     * information, see the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location
     * Service.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return Result of the SearchPlaceIndexForPosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchPlaceIndexForPositionResult searchPlaceIndexForPosition(SearchPlaceIndexForPositionRequest request) {
        request = beforeClientExecution(request);
        return executeSearchPlaceIndexForPosition(request);
    }

    @SdkInternalApi
    final SearchPlaceIndexForPositionResult executeSearchPlaceIndexForPosition(SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest) {

        ExecutionContext executionContext = createExecutionContext(searchPlaceIndexForPositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPlaceIndexForPositionRequest> request = null;
        Response<SearchPlaceIndexForPositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPlaceIndexForPositionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchPlaceIndexForPositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchPlaceIndexForPosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchPlaceIndexForPositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchPlaceIndexForPositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of
     * interest.
     * </p>
     * <p>
     * Includes the option to apply additional parameters to narrow your list of results.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using <code>BiasPosition</code>, or filter results within a
     * bounding box using <code>FilterBBox</code>. Providing both parameters simultaneously returns an error.
     * </p>
     * </note> <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your selected third party provider for
     * processing, which may be outside the AWS region you are currently using.
     * </p>
     * <p>
     * Also, when using HERE as your data provider, you may not (a) use HERE Places for Asset Management, or (b) select
     * the <code>Storage</code> option for the <code>IntendedUse</code> parameter when requesting Places in Japan. For
     * more information, see the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon
     * Location Service.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return Result of the SearchPlaceIndexForText operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied due to insufficient access or permission. Check with an administrator to verify
     *         your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForText"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchPlaceIndexForTextResult searchPlaceIndexForText(SearchPlaceIndexForTextRequest request) {
        request = beforeClientExecution(request);
        return executeSearchPlaceIndexForText(request);
    }

    @SdkInternalApi
    final SearchPlaceIndexForTextResult executeSearchPlaceIndexForText(SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest) {

        ExecutionContext executionContext = createExecutionContext(searchPlaceIndexForTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPlaceIndexForTextRequest> request = null;
        Response<SearchPlaceIndexForTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPlaceIndexForTextRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchPlaceIndexForTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchPlaceIndexForText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "places.";
                String resolvedHostPrefix = String.format("places.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchPlaceIndexForTextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchPlaceIndexForTextResultJsonUnmarshaller());
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
