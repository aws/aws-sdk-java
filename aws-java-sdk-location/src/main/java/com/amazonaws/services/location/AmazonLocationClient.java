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
 * "Suite of geospatial services including Maps, Places, Routes, Tracking, and Geofencing"
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
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.location.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
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
     * <p>
     * You can associate up to five geofence collections to each tracker resource.
     * </p>
     * <note>
     * <p>
     * Currently not supported — Cross-account configurations, such as creating associations between a tracker resource
     * in one account and a geofence collection in another account.
     * </p>
     * </note>
     * 
     * @param associateTrackerConsumerRequest
     * @return Result of the AssociateTrackerConsumer operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ServiceQuotaExceededException
     *         The operation was denied because the request would exceed the maximum <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/location-quotas.html">quota</a> set for
     *         Amazon Location Service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Deletes the position history of one or more devices from a tracker resource.
     * </p>
     * 
     * @param batchDeleteDevicePositionHistoryRequest
     * @return Result of the BatchDeleteDevicePositionHistory operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchDeleteDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteDevicePositionHistoryResult batchDeleteDevicePositionHistory(BatchDeleteDevicePositionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteDevicePositionHistory(request);
    }

    @SdkInternalApi
    final BatchDeleteDevicePositionHistoryResult executeBatchDeleteDevicePositionHistory(
            BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteDevicePositionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteDevicePositionHistoryRequest> request = null;
        Response<BatchDeleteDevicePositionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteDevicePositionHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDeleteDevicePositionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteDevicePositionHistory");
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

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteDevicePositionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeleteDevicePositionHistoryResultJsonUnmarshaller());
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
     * This operation deletes the resource permanently.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Evaluates device positions against the geofence geometries from a given geofence collection.
     * </p>
     * <p>
     * This operation always returns an empty response because geofences are asynchronously evaluated. The evaluation
     * determines if the device has entered or exited a geofenced area, and then publishes one of the following events
     * to Amazon EventBridge:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTER</code> if Amazon Location determines that the tracked device has entered a geofenced area.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXIT</code> if Amazon Location determines that the tracked device has exited a geofenced area.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The last geofence that a device was observed within is tracked for 30 days after the most recent device position
     * update.
     * </p>
     * </note> <note>
     * <p>
     * Geofence evaluation uses the given device position. It does not account for the optional <code>Accuracy</code> of
     * a <code>DevicePositionUpdate</code>.
     * </p>
     * </note> <note>
     * <p>
     * The <code>DeviceID</code> is used as a string to represent the device. You do not need to have a
     * <code>Tracker</code> associated with the <code>DeviceID</code>.
     * </p>
     * </note>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return Result of the BatchEvaluateGeofences operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Lists the latest device positions for requested devices.
     * </p>
     * 
     * @param batchGetDevicePositionRequest
     * @return Result of the BatchGetDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an
     * existing geofence if a geofence ID is included in the request.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return Result of the BatchPutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when it
     * reports the last known device position and position history. Amazon Location retains location data for 30 days.
     * </p>
     * <note>
     * <p>
     * Position updates are handled based on the <code>PositionFiltering</code> property of the tracker. When
     * <code>PositionFiltering</code> is set to <code>TimeBased</code>, updates are evaluated against linked geofence
     * collections, and location data is stored at a maximum of one position per 30 second interval. If your update
     * frequency is more often than every 30 seconds, only one update per 30 seconds is stored for each unique device
     * ID.
     * </p>
     * <p>
     * When <code>PositionFiltering</code> is set to <code>DistanceBased</code> filtering, location data is stored and
     * evaluated against linked geofence collections only if the device has moved more than 30 m (98.4 ft).
     * </p>
     * <p>
     * When <code>PositionFiltering</code> is set to <code>AccuracyBased</code> filtering, location data is stored and
     * evaluated against linked geofence collections only if the device has moved more than the measured accuracy. For
     * example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the second update
     * is neither stored or evaluated if the device has moved less than 15 m. If <code>PositionFiltering</code> is set
     * to <code>AccuracyBased</code> filtering, Amazon Location uses the default value <code>{ "Horizontal": 0}</code>
     * when accuracy is not provided on a <code>DevicePositionUpdate</code>.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html">Calculates a route</a>
     * given the following required parameters: <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create a
     * route calculator resource</a>.
     * </p>
     * <p>
     * By default, a request that doesn't specify a departure time uses the best time of day to travel with the best
     * traffic conditions when calculating the route.
     * </p>
     * <p>
     * Additional options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/departure-time.html">Specifying a departure
     * time</a> using either <code>DepartureTime</code> or <code>DepartNow</code>. This calculates a route based on
     * predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartNow</code> in a single request. Specifying both
     * parameters returns a validation error.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/travel-mode.html">Specifying a travel
     * mode</a> using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify
     * additional route preferences in <code>CarModeOptions</code> if traveling by <code>Car</code>, or
     * <code>TruckModeOptions</code> if traveling by <code>Truck</code>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>walking</code> for the travel mode and your data provider is Esri, the start and destination
     * must be within 40km.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param calculateRouteRequest
     * @return Result of the CalculateRoute operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CalculateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CalculateRouteResult calculateRoute(CalculateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeCalculateRoute(request);
    }

    @SdkInternalApi
    final CalculateRouteResult executeCalculateRoute(CalculateRouteRequest calculateRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(calculateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CalculateRouteRequest> request = null;
        Response<CalculateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CalculateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(calculateRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CalculateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CalculateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CalculateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html"> Calculates a
     * route matrix</a> given the following required parameters: <code>DeparturePositions</code> and
     * <code>DestinationPositions</code>. <code>CalculateRouteMatrix</code> calculates routes and returns the travel
     * time and travel distance from each departure position to each destination position in the request. For example,
     * given departure positions A and B, and destination positions X and Y, <code>CalculateRouteMatrix</code> will
     * return time and distance for routes from A to X, A to Y, B to X, and B to Y (in that order). The number of
     * results returned (and routes calculated) will be the number of <code>DeparturePositions</code> times the number
     * of <code>DestinationPositions</code>.
     * </p>
     * <note>
     * <p>
     * Your account is charged for each route calculated, not the number of requests.
     * </p>
     * </note>
     * <p>
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create a
     * route calculator resource</a>.
     * </p>
     * <p>
     * By default, a request that doesn't specify a departure time uses the best time of day to travel with the best
     * traffic conditions when calculating routes.
     * </p>
     * <p>
     * Additional options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/departure-time.html"> Specifying a departure
     * time</a> using either <code>DepartureTime</code> or <code>DepartNow</code>. This calculates routes based on
     * predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartNow</code> in a single request. Specifying both
     * parameters returns a validation error.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/travel-mode.html">Specifying a travel
     * mode</a> using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify
     * additional route preferences in <code>CarModeOptions</code> if traveling by <code>Car</code>, or
     * <code>TruckModeOptions</code> if traveling by <code>Truck</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculateRouteMatrixRequest
     * @return Result of the CalculateRouteMatrix operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CalculateRouteMatrix
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteMatrix" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CalculateRouteMatrixResult calculateRouteMatrix(CalculateRouteMatrixRequest request) {
        request = beforeClientExecution(request);
        return executeCalculateRouteMatrix(request);
    }

    @SdkInternalApi
    final CalculateRouteMatrixResult executeCalculateRouteMatrix(CalculateRouteMatrixRequest calculateRouteMatrixRequest) {

        ExecutionContext executionContext = createExecutionContext(calculateRouteMatrixRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CalculateRouteMatrixRequest> request = null;
        Response<CalculateRouteMatrixResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CalculateRouteMatrixRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(calculateRouteMatrixRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CalculateRouteMatrix");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CalculateRouteMatrixResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CalculateRouteMatrixResultJsonUnmarshaller());
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
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createMapRequest
     * @return Result of the CreateMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Creates a place index resource in your AWS account. Use a place index resource to geocode addresses and other
     * text queries by using the <code>SearchPlaceIndexForText</code> operation, and reverse geocode coordinates by
     * using the <code>SearchPlaceIndexForPosition</code> operation, and enable autosuggestions by using the
     * <code>SearchPlaceIndexForSuggestions</code> operation.
     * </p>
     * <note>
     * <p>
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createPlaceIndexRequest
     * @return Result of the CreatePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Creates a route calculator resource in your AWS account.
     * </p>
     * <p>
     * You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A
     * route calculator sources traffic and road network data from your chosen data provider.
     * </p>
     * <note>
     * <p>
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createRouteCalculatorRequest
     * @return Result of the CreateRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRouteCalculatorResult createRouteCalculator(CreateRouteCalculatorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRouteCalculator(request);
    }

    @SdkInternalApi
    final CreateRouteCalculatorResult executeCreateRouteCalculator(CreateRouteCalculatorRequest createRouteCalculatorRequest) {

        ExecutionContext executionContext = createExecutionContext(createRouteCalculatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteCalculatorRequest> request = null;
        Response<CreateRouteCalculatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteCalculatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRouteCalculatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRouteCalculator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRouteCalculatorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateRouteCalculatorResultJsonUnmarshaller());
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
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * This operation deletes the resource permanently. If the geofence collection is the target of a tracker resource,
     * the devices will no longer be monitored.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * This operation deletes the resource permanently. If the map is being used in an application, the map may not
     * render.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Deletes a place index resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Deletes a route calculator resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param deleteRouteCalculatorRequest
     * @return Result of the DeleteRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeleteRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRouteCalculatorResult deleteRouteCalculator(DeleteRouteCalculatorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRouteCalculator(request);
    }

    @SdkInternalApi
    final DeleteRouteCalculatorResult executeDeleteRouteCalculator(DeleteRouteCalculatorRequest deleteRouteCalculatorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRouteCalculatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteCalculatorRequest> request = null;
        Response<DeleteRouteCalculatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteCalculatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRouteCalculatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRouteCalculator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRouteCalculatorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteRouteCalculatorResultJsonUnmarshaller());
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
     * This operation deletes the resource permanently. If the tracker resource is in use, you may encounter an error.
     * Make sure that the target resource isn't a dependency for your applications.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Retrieves the place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return Result of the DescribePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Retrieves the route calculator resource details.
     * </p>
     * 
     * @param describeRouteCalculatorRequest
     * @return Result of the DescribeRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribeRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeRouteCalculator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRouteCalculatorResult describeRouteCalculator(DescribeRouteCalculatorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRouteCalculator(request);
    }

    @SdkInternalApi
    final DescribeRouteCalculatorResult executeDescribeRouteCalculator(DescribeRouteCalculatorRequest describeRouteCalculatorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRouteCalculatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRouteCalculatorRequest> request = null;
        Response<DescribeRouteCalculatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRouteCalculatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRouteCalculatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRouteCalculator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRouteCalculatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRouteCalculatorResultJsonUnmarshaller());
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Removes the association between a tracker resource and a geofence collection.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Retrieves a device's most recent position according to its sample time.
     * </p>
     * <note>
     * <p>
     * Device positions are deleted after 30 days.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Device positions are deleted after 30 days.
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Retrieves a vector data tile from the map resource. Map tiles are used by clients to render a map. they're
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Finds a place by its unique ID. A <code>PlaceId</code> is returned by other search operations.
     * </p>
     * <note>
     * <p>
     * A PlaceId is valid only if all of the following are the same in the original search request and the call to
     * <code>GetPlace</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * Data provider specified in the place index resource
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getPlaceRequest
     * @return Result of the GetPlace operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetPlace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetPlace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPlaceResult getPlace(GetPlaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlace(request);
    }

    @SdkInternalApi
    final GetPlaceResult executeGetPlace(GetPlaceRequest getPlaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlaceRequest> request = null;
        Response<GetPlaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPlaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlace");
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

            HttpResponseHandler<AmazonWebServiceResponse<GetPlaceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPlaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A batch request to retrieve all device positions.
     * </p>
     * 
     * @param listDevicePositionsRequest
     * @return Result of the ListDevicePositions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListDevicePositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListDevicePositions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDevicePositionsResult listDevicePositions(ListDevicePositionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDevicePositions(request);
    }

    @SdkInternalApi
    final ListDevicePositionsResult executeListDevicePositions(ListDevicePositionsRequest listDevicePositionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicePositionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicePositionsRequest> request = null;
        Response<ListDevicePositionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicePositionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicePositionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevicePositions");
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

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicePositionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicePositionsResultJsonUnmarshaller());
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Lists place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return Result of the ListPlaceIndexes operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Lists route calculator resources in your AWS account.
     * </p>
     * 
     * @param listRouteCalculatorsRequest
     * @return Result of the ListRouteCalculators operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListRouteCalculators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListRouteCalculators" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRouteCalculatorsResult listRouteCalculators(ListRouteCalculatorsRequest request) {
        request = beforeClientExecution(request);
        return executeListRouteCalculators(request);
    }

    @SdkInternalApi
    final ListRouteCalculatorsResult executeListRouteCalculators(ListRouteCalculatorsRequest listRouteCalculatorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRouteCalculatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRouteCalculatorsRequest> request = null;
        Response<ListRouteCalculatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRouteCalculatorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRouteCalculatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRouteCalculators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRouteCalculatorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRouteCalculatorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags that are applied to the specified Amazon Location resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "metadata.";
                String resolvedHostPrefix = String.format("metadata.");

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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a
     * geofence ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return Result of the PutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return Result of the SearchPlaceIndexForPosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * Generates suggestions for addresses and points of interest based on partial or misspelled free-form text. This
     * operation is also known as autocomplete, autosuggest, or fuzzy matching.
     * </p>
     * <p>
     * Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a
     * specific position on the globe.
     * </p>
     * <note>
     * <p>
     * You can search for suggested place names near a specified position by using <code>BiasPosition</code>, or filter
     * results within a bounding box by using <code>FilterBBox</code>. These parameters are mutually exclusive; using
     * both <code>BiasPosition</code> and <code>FilterBBox</code> in the same command returns an error.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForSuggestionsRequest
     * @return Result of the SearchPlaceIndexForSuggestions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForSuggestions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchPlaceIndexForSuggestionsResult searchPlaceIndexForSuggestions(SearchPlaceIndexForSuggestionsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchPlaceIndexForSuggestions(request);
    }

    @SdkInternalApi
    final SearchPlaceIndexForSuggestionsResult executeSearchPlaceIndexForSuggestions(SearchPlaceIndexForSuggestionsRequest searchPlaceIndexForSuggestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchPlaceIndexForSuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPlaceIndexForSuggestionsRequest> request = null;
        Response<SearchPlaceIndexForSuggestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPlaceIndexForSuggestionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchPlaceIndexForSuggestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchPlaceIndexForSuggestions");
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

            HttpResponseHandler<AmazonWebServiceResponse<SearchPlaceIndexForSuggestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchPlaceIndexForSuggestionsResultJsonUnmarshaller());
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
     * Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a
     * specific position on the globe.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using <code>BiasPosition</code>, or filter results within a
     * bounding box using <code>FilterBBox</code>. Providing both parameters simultaneously returns an error.
     * </p>
     * </note>
     * <p>
     * Search results are returned in order of highest to lowest relevance.
     * </p>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return Result of the SearchPlaceIndexForText operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
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
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "metadata.";
                String resolvedHostPrefix = String.format("metadata.");

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
     * Removes one or more tags from the specified Amazon Location resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "metadata.";
                String resolvedHostPrefix = String.format("metadata.");

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
     * Updates the specified properties of a given geofence collection.
     * </p>
     * 
     * @param updateGeofenceCollectionRequest
     * @return Result of the UpdateGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGeofenceCollectionResult updateGeofenceCollection(UpdateGeofenceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGeofenceCollection(request);
    }

    @SdkInternalApi
    final UpdateGeofenceCollectionResult executeUpdateGeofenceCollection(UpdateGeofenceCollectionRequest updateGeofenceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGeofenceCollectionRequest> request = null;
        Response<UpdateGeofenceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGeofenceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGeofenceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGeofenceCollection");
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

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGeofenceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGeofenceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified properties of a given map resource.
     * </p>
     * 
     * @param updateMapRequest
     * @return Result of the UpdateMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateMap" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMapResult updateMap(UpdateMapRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMap(request);
    }

    @SdkInternalApi
    final UpdateMapResult executeUpdateMap(UpdateMapRequest updateMapRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMapRequest> request = null;
        Response<UpdateMapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMapRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMap");
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

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMapResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified properties of a given place index resource.
     * </p>
     * 
     * @param updatePlaceIndexRequest
     * @return Result of the UpdatePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePlaceIndexResult updatePlaceIndex(UpdatePlaceIndexRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePlaceIndex(request);
    }

    @SdkInternalApi
    final UpdatePlaceIndexResult executeUpdatePlaceIndex(UpdatePlaceIndexRequest updatePlaceIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePlaceIndexRequest> request = null;
        Response<UpdatePlaceIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePlaceIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePlaceIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePlaceIndex");
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

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePlaceIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePlaceIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified properties for a given route calculator resource.
     * </p>
     * 
     * @param updateRouteCalculatorRequest
     * @return Result of the UpdateRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRouteCalculatorResult updateRouteCalculator(UpdateRouteCalculatorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRouteCalculator(request);
    }

    @SdkInternalApi
    final UpdateRouteCalculatorResult executeUpdateRouteCalculator(UpdateRouteCalculatorRequest updateRouteCalculatorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRouteCalculatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteCalculatorRequest> request = null;
        Response<UpdateRouteCalculatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteCalculatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRouteCalculatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRouteCalculator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "routes.";
                String resolvedHostPrefix = String.format("routes.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRouteCalculatorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateRouteCalculatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified properties of a given tracker resource.
     * </p>
     * 
     * @param updateTrackerRequest
     * @return Result of the UpdateTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTrackerResult updateTracker(UpdateTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTracker(request);
    }

    @SdkInternalApi
    final UpdateTrackerResult executeUpdateTracker(UpdateTrackerRequest updateTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrackerRequest> request = null;
        Response<UpdateTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Location");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTracker");
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

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrackerResultJsonUnmarshaller());
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
