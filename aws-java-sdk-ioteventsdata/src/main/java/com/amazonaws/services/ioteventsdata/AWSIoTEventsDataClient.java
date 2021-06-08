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
package com.amazonaws.services.ioteventsdata;

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

import com.amazonaws.services.ioteventsdata.AWSIoTEventsDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.services.ioteventsdata.model.transform.*;

/**
 * Client for accessing AWS IoT Events Data. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. You can use AWS IoT Events Data API commands to send inputs to detectors, list detectors, and
 * view or update a detector's status.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/what-is-iotevents.html">What is AWS IoT Events?</a>
 * in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTEventsDataClient extends AmazonWebServiceClient implements AWSIoTEventsData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTEventsData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ioteventsdata";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ioteventsdata.model.AWSIoTEventsDataException.class));

    public static AWSIoTEventsDataClientBuilder builder() {
        return AWSIoTEventsDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("data.iotevents.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ioteventsdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ioteventsdata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Acknowledges one or more alarms. The alarms change to the <code>ACKNOWLEDGED</code> state after you acknowledge
     * them.
     * </p>
     * 
     * @param batchAcknowledgeAlarmRequest
     * @return Result of the BatchAcknowledgeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchAcknowledgeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAcknowledgeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAcknowledgeAlarmResult batchAcknowledgeAlarm(BatchAcknowledgeAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAcknowledgeAlarm(request);
    }

    @SdkInternalApi
    final BatchAcknowledgeAlarmResult executeBatchAcknowledgeAlarm(BatchAcknowledgeAlarmRequest batchAcknowledgeAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAcknowledgeAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAcknowledgeAlarmRequest> request = null;
        Response<BatchAcknowledgeAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAcknowledgeAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchAcknowledgeAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAcknowledgeAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAcknowledgeAlarmResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchAcknowledgeAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables one or more alarms. The alarms change to the <code>DISABLED</code> state after you disable them.
     * </p>
     * 
     * @param batchDisableAlarmRequest
     * @return Result of the BatchDisableAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchDisableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDisableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisableAlarmResult batchDisableAlarm(BatchDisableAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisableAlarm(request);
    }

    @SdkInternalApi
    final BatchDisableAlarmResult executeBatchDisableAlarm(BatchDisableAlarmRequest batchDisableAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisableAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisableAlarmRequest> request = null;
        Response<BatchDisableAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisableAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDisableAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisableAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisableAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDisableAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables one or more alarms. The alarms change to the <code>NORMAL</code> state after you enable them.
     * </p>
     * 
     * @param batchEnableAlarmRequest
     * @return Result of the BatchEnableAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchEnableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchEnableAlarmResult batchEnableAlarm(BatchEnableAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeBatchEnableAlarm(request);
    }

    @SdkInternalApi
    final BatchEnableAlarmResult executeBatchEnableAlarm(BatchEnableAlarmRequest batchEnableAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(batchEnableAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEnableAlarmRequest> request = null;
        Response<BatchEnableAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEnableAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchEnableAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchEnableAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchEnableAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchEnableAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
     * specify (<code>"inputName"</code>) and ingested into any detectors that monitor that input. If multiple messages
     * are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
     * messages one at a time and wait for a successful response.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return Result of the BatchPutMessage operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchPutMessageResult batchPutMessage(BatchPutMessageRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutMessage(request);
    }

    @SdkInternalApi
    final BatchPutMessageResult executeBatchPutMessage(BatchPutMessageRequest batchPutMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutMessageRequest> request = null;
        Response<BatchPutMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets one or more alarms. The alarms return to the <code>NORMAL</code> state after you reset them.
     * </p>
     * 
     * @param batchResetAlarmRequest
     * @return Result of the BatchResetAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchResetAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchResetAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchResetAlarmResult batchResetAlarm(BatchResetAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeBatchResetAlarm(request);
    }

    @SdkInternalApi
    final BatchResetAlarmResult executeBatchResetAlarm(BatchResetAlarmRequest batchResetAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(batchResetAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchResetAlarmRequest> request = null;
        Response<BatchResetAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchResetAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchResetAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchResetAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchResetAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchResetAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes one or more alarms to the snooze mode. The alarms change to the <code>SNOOZE_DISABLED</code> state after
     * you set them to the snooze mode.
     * </p>
     * 
     * @param batchSnoozeAlarmRequest
     * @return Result of the BatchSnoozeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchSnoozeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchSnoozeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchSnoozeAlarmResult batchSnoozeAlarm(BatchSnoozeAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeBatchSnoozeAlarm(request);
    }

    @SdkInternalApi
    final BatchSnoozeAlarmResult executeBatchSnoozeAlarm(BatchSnoozeAlarmRequest batchSnoozeAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(batchSnoozeAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchSnoozeAlarmRequest> request = null;
        Response<BatchSnoozeAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchSnoozeAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchSnoozeAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchSnoozeAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchSnoozeAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchSnoozeAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
     * detector model.
     * </p>
     * 
     * @param batchUpdateDetectorRequest
     * @return Result of the BatchUpdateDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchUpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateDetectorResult batchUpdateDetector(BatchUpdateDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateDetector(request);
    }

    @SdkInternalApi
    final BatchUpdateDetectorResult executeBatchUpdateDetector(BatchUpdateDetectorRequest batchUpdateDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateDetectorRequest> request = null;
        Response<BatchUpdateDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an alarm.
     * </p>
     * 
     * @param describeAlarmRequest
     * @return Result of the DescribeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.DescribeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAlarmResult describeAlarm(DescribeAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlarm(request);
    }

    @SdkInternalApi
    final DescribeAlarmResult executeDescribeAlarm(DescribeAlarmRequest describeAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmRequest> request = null;
        Response<DescribeAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified detector (instance).
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDetector(request);
    }

    @SdkInternalApi
    final DescribeDetectorResult executeDescribeDetector(DescribeDetectorRequest describeDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDetectorRequest> request = null;
        Response<DescribeDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
     * </p>
     * 
     * @param listAlarmsRequest
     * @return Result of the ListAlarms operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.ListAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAlarmsResult listAlarms(ListAlarmsRequest request) {
        request = beforeClientExecution(request);
        return executeListAlarms(request);
    }

    @SdkInternalApi
    final ListAlarmsResult executeListAlarms(ListAlarmsRequest listAlarmsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlarmsRequest> request = null;
        Response<ListAlarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlarmsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAlarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAlarms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAlarmsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAlarmsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists detectors (the instances of a detector model).
     * </p>
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDetectorsResult listDetectors(ListDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListDetectors(request);
    }

    @SdkInternalApi
    final ListDetectorsResult executeListDetectors(ListDetectorsRequest listDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDetectorsRequest> request = null;
        Response<ListDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDetectorsResultJsonUnmarshaller());
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
