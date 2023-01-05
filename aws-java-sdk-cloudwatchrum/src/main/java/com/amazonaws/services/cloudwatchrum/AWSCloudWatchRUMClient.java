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
package com.amazonaws.services.cloudwatchrum;

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

import com.amazonaws.services.cloudwatchrum.AWSCloudWatchRUMClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatchrum.model.*;
import com.amazonaws.services.cloudwatchrum.model.transform.*;

/**
 * Client for accessing CloudWatch RUM. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * With Amazon CloudWatch RUM, you can perform real-user monitoring to collect client-side data about your web
 * application performance from actual user sessions in real time. The data collected includes page load times,
 * client-side errors, and user behavior. When you view this data, you can see it all aggregated together and also see
 * breakdowns by the browsers and devices that your customers use.
 * </p>
 * <p>
 * You can use the collected data to quickly identify and debug client-side performance issues. CloudWatch RUM helps you
 * visualize anomalies in your application performance and find relevant debugging data such as error messages, stack
 * traces, and user sessions. You can also use RUM to understand the range of end-user impact including the number of
 * users, geolocations, and browsers used.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudWatchRUMClient extends AmazonWebServiceClient implements AWSCloudWatchRUM {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudWatchRUM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rum";

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
                                    com.amazonaws.services.cloudwatchrum.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudwatchrum.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudwatchrum.model.AWSCloudWatchRUMException.class));

    public static AWSCloudWatchRUMClientBuilder builder() {
        return AWSCloudWatchRUMClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch RUM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudWatchRUMClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch RUM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudWatchRUMClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("rum.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudwatchrum/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudwatchrum/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Specifies the extended metrics that you want a CloudWatch RUM app monitor to send to a destination. Valid
     * destinations include CloudWatch and Evidently.
     * </p>
     * <p>
     * By default, RUM app monitors send some metrics to CloudWatch. These default metrics are listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-metrics.html">CloudWatch
     * metrics that you can collect with CloudWatch RUM</a>.
     * </p>
     * <p>
     * If you also send extended metrics, you can send metrics to Evidently as well as CloudWatch, and you can also
     * optionally send the metrics with additional dimensions. The valid dimension names for the additional dimensions
     * are <code>BrowserName</code>, <code>CountryCode</code>, <code>DeviceType</code>, <code>FileType</code>,
     * <code>OSName</code>, and <code>PageId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html">
     * Extended metrics that you can send to CloudWatch and CloudWatch Evidently</a>.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchCreateRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * <p>
     * The maximum number of metric definitions that one destination can contain is 2000.
     * </p>
     * <p>
     * Extended metrics sent are charged as CloudWatch custom metrics. Each combination of additional dimension name and
     * dimension value counts as a custom metric. For more information, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * You must have already created a destination for the metrics before you send them. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html">
     * PutRumMetricsDestination</a>.
     * </p>
     * <p>
     * If some metric definitions specified in a <code>BatchCreateRumMetricDefinitions</code> operations are not valid,
     * those metric definitions fail and return errors, but all valid metric definitions in the same operation still
     * succeed.
     * </p>
     * 
     * @param batchCreateRumMetricDefinitionsRequest
     * @return Result of the BatchCreateRumMetricDefinitions operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.BatchCreateRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateRumMetricDefinitionsResult batchCreateRumMetricDefinitions(BatchCreateRumMetricDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateRumMetricDefinitions(request);
    }

    @SdkInternalApi
    final BatchCreateRumMetricDefinitionsResult executeBatchCreateRumMetricDefinitions(
            BatchCreateRumMetricDefinitionsRequest batchCreateRumMetricDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateRumMetricDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateRumMetricDefinitionsRequest> request = null;
        Response<BatchCreateRumMetricDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateRumMetricDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchCreateRumMetricDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateRumMetricDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateRumMetricDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchCreateRumMetricDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified metrics from being sent to an extended metrics destination.
     * </p>
     * <p>
     * If some metric definition IDs specified in a <code>BatchDeleteRumMetricDefinitions</code> operations are not
     * valid, those metric definitions fail and return errors, but all valid metric definition IDs in the same operation
     * are still deleted.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchDeleteRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * 
     * @param batchDeleteRumMetricDefinitionsRequest
     * @return Result of the BatchDeleteRumMetricDefinitions operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.BatchDeleteRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteRumMetricDefinitionsResult batchDeleteRumMetricDefinitions(BatchDeleteRumMetricDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteRumMetricDefinitions(request);
    }

    @SdkInternalApi
    final BatchDeleteRumMetricDefinitionsResult executeBatchDeleteRumMetricDefinitions(
            BatchDeleteRumMetricDefinitionsRequest batchDeleteRumMetricDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteRumMetricDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteRumMetricDefinitionsRequest> request = null;
        Response<BatchDeleteRumMetricDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteRumMetricDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDeleteRumMetricDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteRumMetricDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteRumMetricDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeleteRumMetricDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of metrics and dimensions that a RUM app monitor is sending to a single destination.
     * </p>
     * 
     * @param batchGetRumMetricDefinitionsRequest
     * @return Result of the BatchGetRumMetricDefinitions operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.BatchGetRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchGetRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetRumMetricDefinitionsResult batchGetRumMetricDefinitions(BatchGetRumMetricDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetRumMetricDefinitions(request);
    }

    @SdkInternalApi
    final BatchGetRumMetricDefinitionsResult executeBatchGetRumMetricDefinitions(BatchGetRumMetricDefinitionsRequest batchGetRumMetricDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetRumMetricDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRumMetricDefinitionsRequest> request = null;
        Response<BatchGetRumMetricDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRumMetricDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetRumMetricDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetRumMetricDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetRumMetricDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetRumMetricDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Amazon CloudWatch RUM app monitor, which collects telemetry data from your application and sends that
     * data to RUM. The data includes performance and reliability information such as page load time, client-side
     * errors, and user behavior.
     * </p>
     * <p>
     * You use this operation only to create a new app monitor. To update an existing app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_UpdateAppMonitor.html"
     * >UpdateAppMonitor</a> instead.
     * </p>
     * <p>
     * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code snippet to add
     * to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param createAppMonitorRequest
     * @return Result of the CreateAppMonitor operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.CreateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CreateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppMonitorResult createAppMonitor(CreateAppMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppMonitor(request);
    }

    @SdkInternalApi
    final CreateAppMonitorResult executeCreateAppMonitor(CreateAppMonitorRequest createAppMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppMonitorRequest> request = null;
        Response<CreateAppMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing app monitor. This immediately stops the collection of data.
     * </p>
     * 
     * @param deleteAppMonitorRequest
     * @return Result of the DeleteAppMonitor operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.DeleteAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppMonitorResult deleteAppMonitor(DeleteAppMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppMonitor(request);
    }

    @SdkInternalApi
    final DeleteAppMonitorResult executeDeleteAppMonitor(DeleteAppMonitorRequest deleteAppMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppMonitorRequest> request = null;
        Response<DeleteAppMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a destination for CloudWatch RUM extended metrics, so that the specified app monitor stops sending
     * extended metrics to that destination.
     * </p>
     * 
     * @param deleteRumMetricsDestinationRequest
     * @return Result of the DeleteRumMetricsDestination operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.DeleteRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteRumMetricsDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRumMetricsDestinationResult deleteRumMetricsDestination(DeleteRumMetricsDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRumMetricsDestination(request);
    }

    @SdkInternalApi
    final DeleteRumMetricsDestinationResult executeDeleteRumMetricsDestination(DeleteRumMetricsDestinationRequest deleteRumMetricsDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRumMetricsDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRumMetricsDestinationRequest> request = null;
        Response<DeleteRumMetricsDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRumMetricsDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRumMetricsDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRumMetricsDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRumMetricsDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRumMetricsDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the complete configuration information for one app monitor.
     * </p>
     * 
     * @param getAppMonitorRequest
     * @return Result of the GetAppMonitor operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.GetAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppMonitorResult getAppMonitor(GetAppMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppMonitor(request);
    }

    @SdkInternalApi
    final GetAppMonitorResult executeGetAppMonitor(GetAppMonitorRequest getAppMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppMonitorRequest> request = null;
        Response<GetAppMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the raw performance events that RUM has collected from your web application, so that you can do your
     * own processing or analysis of this data.
     * </p>
     * 
     * @param getAppMonitorDataRequest
     * @return Result of the GetAppMonitorData operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.GetAppMonitorData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitorData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppMonitorDataResult getAppMonitorData(GetAppMonitorDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppMonitorData(request);
    }

    @SdkInternalApi
    final GetAppMonitorDataResult executeGetAppMonitorData(GetAppMonitorDataRequest getAppMonitorDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppMonitorDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppMonitorDataRequest> request = null;
        Response<GetAppMonitorDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppMonitorDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppMonitorDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppMonitorData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppMonitorDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppMonitorDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the Amazon CloudWatch RUM app monitors in the account.
     * </p>
     * 
     * @param listAppMonitorsRequest
     * @return Result of the ListAppMonitors operation returned by the service.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.ListAppMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListAppMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppMonitorsResult listAppMonitors(ListAppMonitorsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppMonitors(request);
    }

    @SdkInternalApi
    final ListAppMonitorsResult executeListAppMonitors(ListAppMonitorsRequest listAppMonitorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppMonitorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppMonitorsRequest> request = null;
        Response<ListAppMonitorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppMonitorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppMonitorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppMonitors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppMonitorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppMonitorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of destinations that you have created to receive RUM extended metrics, for the specified app
     * monitor.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrcs.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param listRumMetricsDestinationsRequest
     * @return Result of the ListRumMetricsDestinations operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.ListRumMetricsDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListRumMetricsDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRumMetricsDestinationsResult listRumMetricsDestinations(ListRumMetricsDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeListRumMetricsDestinations(request);
    }

    @SdkInternalApi
    final ListRumMetricsDestinationsResult executeListRumMetricsDestinations(ListRumMetricsDestinationsRequest listRumMetricsDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRumMetricsDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRumMetricsDestinationsRequest> request = null;
        Response<ListRumMetricsDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRumMetricsDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRumMetricsDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRumMetricsDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRumMetricsDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRumMetricsDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a CloudWatch RUM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @sample AWSCloudWatchRUM.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
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
     * Sends telemetry events about your application performance and user behavior to CloudWatch RUM. The code snippet
     * that RUM generates for you to add to your application includes <code>PutRumEvents</code> operations to send this
     * data to RUM.
     * </p>
     * <p>
     * Each <code>PutRumEvents</code> operation can send a batch of events from one user session.
     * </p>
     * 
     * @param putRumEventsRequest
     * @return Result of the PutRumEvents operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.PutRumEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRumEventsResult putRumEvents(PutRumEventsRequest request) {
        request = beforeClientExecution(request);
        return executePutRumEvents(request);
    }

    @SdkInternalApi
    final PutRumEventsResult executePutRumEvents(PutRumEventsRequest putRumEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(putRumEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRumEventsRequest> request = null;
        Response<PutRumEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRumEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRumEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRumEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "dataplane.";
                String resolvedHostPrefix = String.format("dataplane.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRumEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRumEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a destination to receive extended metrics from CloudWatch RUM. You can send extended metrics
     * to CloudWatch or to a CloudWatch Evidently experiment.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrics.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param putRumMetricsDestinationRequest
     * @return Result of the PutRumMetricsDestination operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.PutRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumMetricsDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutRumMetricsDestinationResult putRumMetricsDestination(PutRumMetricsDestinationRequest request) {
        request = beforeClientExecution(request);
        return executePutRumMetricsDestination(request);
    }

    @SdkInternalApi
    final PutRumMetricsDestinationResult executePutRumMetricsDestination(PutRumMetricsDestinationRequest putRumMetricsDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(putRumMetricsDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRumMetricsDestinationRequest> request = null;
        Response<PutRumMetricsDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRumMetricsDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRumMetricsDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRumMetricsDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRumMetricsDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRumMetricsDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch RUM resource. Currently, the only
     * resources that can be tagged app monitors.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @sample AWSCloudWatchRUM.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @sample AWSCloudWatchRUM.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
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
     * Updates the configuration of an existing app monitor. When you use this operation, only the parts of the app
     * monitor configuration that you specify in this operation are changed. For any parameters that you omit, the
     * existing values are kept.
     * </p>
     * <p>
     * You can't use this operation to change the tags of an existing app monitor. To change the tags of an existing app
     * monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * <p>
     * To create a new app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_CreateAppMonitor.html"
     * >CreateAppMonitor</a>.
     * </p>
     * <p>
     * After you update an app monitor, sign in to the CloudWatch RUM console to get the updated JavaScript code snippet
     * to add to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param updateAppMonitorRequest
     * @return Result of the UpdateAppMonitor operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.UpdateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAppMonitorResult updateAppMonitor(UpdateAppMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAppMonitor(request);
    }

    @SdkInternalApi
    final UpdateAppMonitorResult executeUpdateAppMonitor(UpdateAppMonitorRequest updateAppMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppMonitorRequest> request = null;
        Response<UpdateAppMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAppMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies one existing metric definition for CloudWatch RUM extended metrics. For more information about extended
     * metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchCreateRumMetricsDefinitions.html"
     * >BatchCreateRumMetricsDefinitions</a>.
     * </p>
     * 
     * @param updateRumMetricDefinitionRequest
     * @return Result of the UpdateRumMetricDefinition operation returned by the service.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws InternalServerException
     *         Internal service exception.
     * @throws ValidationException
     *         One of the arguments for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AWSCloudWatchRUM.UpdateRumMetricDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateRumMetricDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRumMetricDefinitionResult updateRumMetricDefinition(UpdateRumMetricDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRumMetricDefinition(request);
    }

    @SdkInternalApi
    final UpdateRumMetricDefinitionResult executeUpdateRumMetricDefinition(UpdateRumMetricDefinitionRequest updateRumMetricDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRumMetricDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRumMetricDefinitionRequest> request = null;
        Response<UpdateRumMetricDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRumMetricDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRumMetricDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RUM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRumMetricDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRumMetricDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRumMetricDefinitionResultJsonUnmarshaller());
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
