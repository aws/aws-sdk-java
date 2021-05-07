/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics;

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

import com.amazonaws.services.lookoutmetrics.AmazonLookoutMetricsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.services.lookoutmetrics.model.transform.*;

/**
 * Client for accessing LookoutMetrics. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * This is the <i>Amazon Lookout for Metrics API Reference</i>. For an introduction to the service with tutorials for
 * getting started, visit <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev">Amazon Lookout for Metrics
 * Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLookoutMetricsClient extends AmazonWebServiceClient implements AmazonLookoutMetrics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLookoutMetrics.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lookoutmetrics";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/x-amz-json-1.1")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutmetrics.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lookoutmetrics.model.AmazonLookoutMetricsException.class));

    public static AmazonLookoutMetricsClientBuilder builder() {
        return AmazonLookoutMetricsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on LookoutMetrics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutMetricsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on LookoutMetrics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutMetricsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lookoutmetrics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lookoutmetrics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lookoutmetrics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Activates an anomaly detector.
     * </p>
     * 
     * @param activateAnomalyDetectorRequest
     * @return Result of the ActivateAnomalyDetector operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @sample AmazonLookoutMetrics.ActivateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ActivateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ActivateAnomalyDetectorResult activateAnomalyDetector(ActivateAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeActivateAnomalyDetector(request);
    }

    @SdkInternalApi
    final ActivateAnomalyDetectorResult executeActivateAnomalyDetector(ActivateAnomalyDetectorRequest activateAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(activateAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateAnomalyDetectorRequest> request = null;
        Response<ActivateAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(activateAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ActivateAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs a backtest for anomaly detection for the specified resource.
     * </p>
     * 
     * @param backTestAnomalyDetectorRequest
     * @return Result of the BackTestAnomalyDetector operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.BackTestAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/BackTestAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BackTestAnomalyDetectorResult backTestAnomalyDetector(BackTestAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeBackTestAnomalyDetector(request);
    }

    @SdkInternalApi
    final BackTestAnomalyDetectorResult executeBackTestAnomalyDetector(BackTestAnomalyDetectorRequest backTestAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(backTestAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BackTestAnomalyDetectorRequest> request = null;
        Response<BackTestAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BackTestAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(backTestAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BackTestAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BackTestAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BackTestAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alert for an anomaly detector.
     * </p>
     * 
     * @param createAlertRequest
     * @return Result of the CreateAlert operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAlertResult createAlert(CreateAlertRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlert(request);
    }

    @SdkInternalApi
    final CreateAlertResult executeCreateAlert(CreateAlertRequest createAlertRequest) {

        ExecutionContext executionContext = createExecutionContext(createAlertRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAlertRequest> request = null;
        Response<CreateAlertResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAlertRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAlertRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlert");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAlertResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAlertResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an anomaly detector.
     * </p>
     * 
     * @param createAnomalyDetectorRequest
     * @return Result of the CreateAnomalyDetector operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAnomalyDetectorResult createAnomalyDetector(CreateAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnomalyDetector(request);
    }

    @SdkInternalApi
    final CreateAnomalyDetectorResult executeCreateAnomalyDetector(CreateAnomalyDetectorRequest createAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnomalyDetectorRequest> request = null;
        Response<CreateAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnomalyDetectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createMetricSetRequest
     * @return Result of the CreateMetricSet operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMetricSetResult createMetricSet(CreateMetricSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMetricSet(request);
    }

    @SdkInternalApi
    final CreateMetricSetResult executeCreateMetricSet(CreateMetricSetRequest createMetricSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createMetricSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMetricSetRequest> request = null;
        Response<CreateMetricSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMetricSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMetricSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMetricSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMetricSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMetricSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alert.
     * </p>
     * 
     * @param deleteAlertRequest
     * @return Result of the DeleteAlert operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DeleteAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAlert" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAlertResult deleteAlert(DeleteAlertRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlert(request);
    }

    @SdkInternalApi
    final DeleteAlertResult executeDeleteAlert(DeleteAlertRequest deleteAlertRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlertRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlertRequest> request = null;
        Response<DeleteAlertResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlertRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAlertRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlert");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAlertResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAlertResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any
     * configured datasets and alerts.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @return Result of the DeleteAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAnomalyDetectorResult deleteAnomalyDetector(DeleteAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnomalyDetector(request);
    }

    @SdkInternalApi
    final DeleteAnomalyDetectorResult executeDeleteAnomalyDetector(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnomalyDetectorRequest> request = null;
        Response<DeleteAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnomalyDetectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an alert.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeAlertRequest
     * @return Result of the DescribeAlert operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.DescribeAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAlert" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAlertResult describeAlert(DescribeAlertRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlert(request);
    }

    @SdkInternalApi
    final DescribeAlertResult executeDescribeAlert(DescribeAlertRequest describeAlertRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlertRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlertRequest> request = null;
        Response<DescribeAlertResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlertRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAlertRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlert");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAlertResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAlertResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the status of the specified anomaly detection jobs.
     * </p>
     * 
     * @param describeAnomalyDetectionExecutionsRequest
     * @return Result of the DescribeAnomalyDetectionExecutions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DescribeAnomalyDetectionExecutions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetectionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAnomalyDetectionExecutionsResult describeAnomalyDetectionExecutions(DescribeAnomalyDetectionExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnomalyDetectionExecutions(request);
    }

    @SdkInternalApi
    final DescribeAnomalyDetectionExecutionsResult executeDescribeAnomalyDetectionExecutions(
            DescribeAnomalyDetectionExecutionsRequest describeAnomalyDetectionExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnomalyDetectionExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnomalyDetectionExecutionsRequest> request = null;
        Response<DescribeAnomalyDetectionExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnomalyDetectionExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAnomalyDetectionExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnomalyDetectionExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnomalyDetectionExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAnomalyDetectionExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a detector.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeAnomalyDetectorRequest
     * @return Result of the DescribeAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.DescribeAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAnomalyDetectorResult describeAnomalyDetector(DescribeAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnomalyDetector(request);
    }

    @SdkInternalApi
    final DescribeAnomalyDetectorResult executeDescribeAnomalyDetector(DescribeAnomalyDetectorRequest describeAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnomalyDetectorRequest> request = null;
        Response<DescribeAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a dataset.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeMetricSetRequest
     * @return Result of the DescribeMetricSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DescribeMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetricSetResult describeMetricSet(DescribeMetricSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetricSet(request);
    }

    @SdkInternalApi
    final DescribeMetricSetResult executeDescribeMetricSet(DescribeMetricSetRequest describeMetricSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetricSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricSetRequest> request = null;
        Response<DescribeMetricSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetricSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMetricSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetricSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetricSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMetricSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a group of anomalous metrics.
     * </p>
     * 
     * @param getAnomalyGroupRequest
     * @return Result of the GetAnomalyGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.GetAnomalyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAnomalyGroupResult getAnomalyGroup(GetAnomalyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnomalyGroup(request);
    }

    @SdkInternalApi
    final GetAnomalyGroupResult executeGetAnomalyGroup(GetAnomalyGroupRequest getAnomalyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnomalyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnomalyGroupRequest> request = null;
        Response<GetAnomalyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnomalyGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnomalyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnomalyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnomalyGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnomalyGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get feedback for an anomaly group.
     * </p>
     * 
     * @param getFeedbackRequest
     * @return Result of the GetFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.GetFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFeedbackResult getFeedback(GetFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeGetFeedback(request);
    }

    @SdkInternalApi
    final GetFeedbackResult executeGetFeedback(GetFeedbackRequest getFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(getFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFeedbackRequest> request = null;
        Response<GetFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a selection of sample records from an Amazon S3 datasource.
     * </p>
     * 
     * @param getSampleDataRequest
     * @return Result of the GetSampleData operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.GetSampleData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSampleDataResult getSampleData(GetSampleDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetSampleData(request);
    }

    @SdkInternalApi
    final GetSampleDataResult executeGetSampleData(GetSampleDataRequest getSampleDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getSampleDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSampleDataRequest> request = null;
        Response<GetSampleDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSampleDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSampleDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSampleData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSampleDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSampleDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the alerts attached to a detector.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listAlertsRequest
     * @return Result of the ListAlerts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @sample AmazonLookoutMetrics.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAlertsResult listAlerts(ListAlertsRequest request) {
        request = beforeClientExecution(request);
        return executeListAlerts(request);
    }

    @SdkInternalApi
    final ListAlertsResult executeListAlerts(ListAlertsRequest listAlertsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAlertsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlertsRequest> request = null;
        Response<ListAlertsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlertsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAlertsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAlerts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAlertsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAlertsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the detectors in the current AWS Region.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listAnomalyDetectorsRequest
     * @return Result of the ListAnomalyDetectors operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.ListAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnomalyDetectorsResult listAnomalyDetectors(ListAnomalyDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomalyDetectors(request);
    }

    @SdkInternalApi
    final ListAnomalyDetectorsResult executeListAnomalyDetectors(ListAnomalyDetectorsRequest listAnomalyDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomalyDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomalyDetectorsRequest> request = null;
        Response<ListAnomalyDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomalyDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnomalyDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomalyDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomalyDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnomalyDetectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of anomaly groups.
     * </p>
     * 
     * @param listAnomalyGroupSummariesRequest
     * @return Result of the ListAnomalyGroupSummaries operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.ListAnomalyGroupSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnomalyGroupSummariesResult listAnomalyGroupSummaries(ListAnomalyGroupSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomalyGroupSummaries(request);
    }

    @SdkInternalApi
    final ListAnomalyGroupSummariesResult executeListAnomalyGroupSummaries(ListAnomalyGroupSummariesRequest listAnomalyGroupSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomalyGroupSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomalyGroupSummariesRequest> request = null;
        Response<ListAnomalyGroupSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomalyGroupSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnomalyGroupSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomalyGroupSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomalyGroupSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnomalyGroupSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of anomalous metrics for a measure in an anomaly group.
     * </p>
     * 
     * @param listAnomalyGroupTimeSeriesRequest
     * @return Result of the ListAnomalyGroupTimeSeries operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.ListAnomalyGroupTimeSeries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnomalyGroupTimeSeriesResult listAnomalyGroupTimeSeries(ListAnomalyGroupTimeSeriesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomalyGroupTimeSeries(request);
    }

    @SdkInternalApi
    final ListAnomalyGroupTimeSeriesResult executeListAnomalyGroupTimeSeries(ListAnomalyGroupTimeSeriesRequest listAnomalyGroupTimeSeriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomalyGroupTimeSeriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomalyGroupTimeSeriesRequest> request = null;
        Response<ListAnomalyGroupTimeSeriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomalyGroupTimeSeriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnomalyGroupTimeSeriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomalyGroupTimeSeries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomalyGroupTimeSeriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnomalyGroupTimeSeriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the datasets in the current AWS Region.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listMetricSetsRequest
     * @return Result of the ListMetricSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.ListMetricSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListMetricSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMetricSetsResult listMetricSets(ListMetricSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListMetricSets(request);
    }

    @SdkInternalApi
    final ListMetricSetsResult executeListMetricSets(ListMetricSetsRequest listMetricSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMetricSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMetricSetsRequest> request = null;
        Response<ListMetricSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMetricSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMetricSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMetricSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMetricSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMetricSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> for a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
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
     * Add feedback for an anomalous metric.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutFeedbackResult putFeedback(PutFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executePutFeedback(request);
    }

    @SdkInternalApi
    final PutFeedbackResult executePutFeedback(PutFeedbackRequest putFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(putFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFeedbackRequest> request = null;
        Response<PutFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to a detector,
     * dataset, or alert.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
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
     * Removes <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> from a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
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
     * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
     * </p>
     * 
     * @param updateAnomalyDetectorRequest
     * @return Result of the UpdateAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.UpdateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAnomalyDetectorResult updateAnomalyDetector(UpdateAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnomalyDetector(request);
    }

    @SdkInternalApi
    final UpdateAnomalyDetectorResult executeUpdateAnomalyDetector(UpdateAnomalyDetectorRequest updateAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnomalyDetectorRequest> request = null;
        Response<UpdateAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnomalyDetectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateMetricSetRequest
     * @return Result of the UpdateMetricSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.UpdateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMetricSetResult updateMetricSet(UpdateMetricSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMetricSet(request);
    }

    @SdkInternalApi
    final UpdateMetricSetResult executeUpdateMetricSet(UpdateMetricSetRequest updateMetricSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMetricSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMetricSetRequest> request = null;
        Response<UpdateMetricSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMetricSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMetricSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutMetrics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMetricSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMetricSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMetricSetResultJsonUnmarshaller());
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
