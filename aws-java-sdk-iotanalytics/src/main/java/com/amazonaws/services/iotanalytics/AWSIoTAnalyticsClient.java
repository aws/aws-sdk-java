/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics;

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

import com.amazonaws.services.iotanalytics.AWSIoTAnalyticsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotanalytics.model.*;
import com.amazonaws.services.iotanalytics.model.transform.*;

/**
 * Client for accessing AWS IoT Analytics. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
 * query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
 * integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.
 * </p>
 * <p>
 * Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
 * from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
 * devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
 * occur. Also, IoT data is often only meaningful in the context of other data from external sources.
 * </p>
 * <p>
 * AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
 * transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
 * service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
 * enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
 * analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
 * machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
 * questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTAnalyticsClient extends AmazonWebServiceClient implements AWSIoTAnalytics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTAnalytics.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotanalytics";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.iotanalytics.model.ResourceAlreadyExistsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotanalytics.model.AWSIoTAnalyticsException.class));

    public static AWSIoTAnalyticsClientBuilder builder() {
        return AWSIoTAnalyticsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Analytics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTAnalyticsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Analytics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTAnalyticsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotanalytics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotanalytics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotanalytics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sends messages to a channel.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return Result of the BatchPutMessage operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Cancels the reprocessing of data through the pipeline.
     * </p>
     * 
     * @param cancelPipelineReprocessingRequest
     * @return Result of the CancelPipelineReprocessing operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.CancelPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CancelPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelPipelineReprocessingResult cancelPipelineReprocessing(CancelPipelineReprocessingRequest request) {
        request = beforeClientExecution(request);
        return executeCancelPipelineReprocessing(request);
    }

    @SdkInternalApi
    final CancelPipelineReprocessingResult executeCancelPipelineReprocessing(CancelPipelineReprocessingRequest cancelPipelineReprocessingRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelPipelineReprocessingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelPipelineReprocessingRequest> request = null;
        Response<CancelPipelineReprocessingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelPipelineReprocessingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelPipelineReprocessingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelPipelineReprocessing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelPipelineReprocessingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelPipelineReprocessingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
     * publishing the data to a pipeline.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateChannelResult createChannel(CreateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannel(request);
    }

    @SdkInternalApi
    final CreateChannelResult executeCreateChannel(CreateChannelRequest createChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelRequest> request = null;
        Response<CreateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query)
     * or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data
     * set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a
     * "trigger" you specify.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDatasetResult createDataset(CreateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataset(request);
    }

    @SdkInternalApi
    final CreateDatasetResult executeCreateDataset(CreateDatasetRequest createDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a
     * containerized application).
     * </p>
     * 
     * @param createDatasetContentRequest
     * @return Result of the CreateDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.CreateDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatasetContentResult createDatasetContent(CreateDatasetContentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatasetContent(request);
    }

    @SdkInternalApi
    final CreateDatasetContentResult executeCreateDatasetContent(CreateDatasetContentRequest createDatasetContentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetContentRequest> request = null;
        Response<CreateDatasetContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatasetContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data store, which is a repository for messages.
     * </p>
     * 
     * @param createDatastoreRequest
     * @return Result of the CreateDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDatastoreResult createDatastore(CreateDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatastore(request);
    }

    @SdkInternalApi
    final CreateDatastoreResult executeCreateDatastore(CreateDatastoreRequest createDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatastoreRequest> request = null;
        Response<CreateDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
     * before storing them in a data store. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param createPipelineRequest
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Deletes the specified channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteChannelResult deleteChannel(DeleteChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannel(request);
    }

    @SdkInternalApi
    final DeleteChannelResult executeDeleteChannel(DeleteChannelRequest deleteChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<DeleteChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified data set.
     * </p>
     * <p>
     * You do not have to delete the content of the data set before you perform this operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the content of the specified data set.
     * </p>
     * 
     * @param deleteDatasetContentRequest
     * @return Result of the DeleteDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatasetContentResult deleteDatasetContent(DeleteDatasetContentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatasetContent(request);
    }

    @SdkInternalApi
    final DeleteDatasetContentResult executeDeleteDatasetContent(DeleteDatasetContentRequest deleteDatasetContentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetContentRequest> request = null;
        Response<DeleteDatasetContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatasetContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified data store.
     * </p>
     * 
     * @param deleteDatastoreRequest
     * @return Result of the DeleteDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDatastoreResult deleteDatastore(DeleteDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatastore(request);
    }

    @SdkInternalApi
    final DeleteDatastoreResult executeDeleteDatastore(DeleteDatastoreRequest deleteDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatastoreRequest> request = null;
        Response<DeleteDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Retrieves information about a channel.
     * </p>
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeChannelResult describeChannel(DescribeChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChannel(request);
    }

    @SdkInternalApi
    final DescribeChannelResult executeDescribeChannel(DescribeChannelRequest describeChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelRequest> request = null;
        Response<DescribeChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a data set.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataset(request);
    }

    @SdkInternalApi
    final DescribeDatasetResult executeDescribeDataset(DescribeDatasetRequest describeDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a data store.
     * </p>
     * 
     * @param describeDatastoreRequest
     * @return Result of the DescribeDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDatastoreResult describeDatastore(DescribeDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDatastore(request);
    }

    @SdkInternalApi
    final DescribeDatastoreResult executeDescribeDatastore(DescribeDatastoreRequest describeDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatastoreRequest> request = null;
        Response<DescribeDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingOptions(request);
    }

    @SdkInternalApi
    final DescribeLoggingOptionsResult executeDescribeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingOptionsRequest> request = null;
        Response<DescribeLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @return Result of the DescribePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePipelineResult describePipeline(DescribePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePipeline(request);
    }

    @SdkInternalApi
    final DescribePipelineResult executeDescribePipeline(DescribePipelineRequest describePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(describePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePipelineRequest> request = null;
        Response<DescribePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the contents of a data set as pre-signed URIs.
     * </p>
     * 
     * @param getDatasetContentRequest
     * @return Result of the GetDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.GetDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GetDatasetContent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDatasetContentResult getDatasetContent(GetDatasetContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatasetContent(request);
    }

    @SdkInternalApi
    final GetDatasetContentResult executeGetDatasetContent(GetDatasetContentRequest getDatasetContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatasetContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatasetContentRequest> request = null;
        Response<GetDatasetContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatasetContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatasetContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatasetContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatasetContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatasetContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of channels.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannels(request);
    }

    @SdkInternalApi
    final ListChannelsResult executeListChannels(ListChannelsRequest listChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about data set contents that have been created.
     * </p>
     * 
     * @param listDatasetContentsRequest
     * @return Result of the ListDatasetContents operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.ListDatasetContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDatasetContentsResult listDatasetContents(ListDatasetContentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetContents(request);
    }

    @SdkInternalApi
    final ListDatasetContentsResult executeListDatasetContents(ListDatasetContentsRequest listDatasetContentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetContentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetContentsRequest> request = null;
        Response<ListDatasetContentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetContentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetContentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetContents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetContentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetContentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about data sets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasets(request);
    }

    @SdkInternalApi
    final ListDatasetsResult executeListDatasets(ListDatasetsRequest listDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @return Result of the ListDatastores operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDatastoresResult listDatastores(ListDatastoresRequest request) {
        request = beforeClientExecution(request);
        return executeListDatastores(request);
    }

    @SdkInternalApi
    final ListDatastoresResult executeListDatastores(ListDatastoresRequest listDatastoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatastoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatastoresRequest> request = null;
        Response<ListDatastoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatastoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatastoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatastores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatastoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatastoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListPipelines" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Lists the tags (metadata) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Sets or updates the AWS IoT Analytics logging options.
     * </p>
     * <p>
     * Note that if you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the
     * change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
     * (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutLoggingOptions(request);
    }

    @SdkInternalApi
    final PutLoggingOptionsResult executePutLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingOptionsRequest> request = null;
        Response<PutLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Simulates the results of running a pipeline activity on a message payload.
     * </p>
     * 
     * @param runPipelineActivityRequest
     * @return Result of the RunPipelineActivity operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.RunPipelineActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RunPipelineActivityResult runPipelineActivity(RunPipelineActivityRequest request) {
        request = beforeClientExecution(request);
        return executeRunPipelineActivity(request);
    }

    @SdkInternalApi
    final RunPipelineActivityResult executeRunPipelineActivity(RunPipelineActivityRequest runPipelineActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(runPipelineActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunPipelineActivityRequest> request = null;
        Response<RunPipelineActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunPipelineActivityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(runPipelineActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RunPipelineActivity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RunPipelineActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RunPipelineActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
     * messages can be retrieved.
     * </p>
     * 
     * @param sampleChannelDataRequest
     * @return Result of the SampleChannelData operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.SampleChannelData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SampleChannelDataResult sampleChannelData(SampleChannelDataRequest request) {
        request = beforeClientExecution(request);
        return executeSampleChannelData(request);
    }

    @SdkInternalApi
    final SampleChannelDataResult executeSampleChannelData(SampleChannelDataRequest sampleChannelDataRequest) {

        ExecutionContext executionContext = createExecutionContext(sampleChannelDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SampleChannelDataRequest> request = null;
        Response<SampleChannelDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SampleChannelDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sampleChannelDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SampleChannelData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SampleChannelDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SampleChannelDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the reprocessing of raw message data through the pipeline.
     * </p>
     * 
     * @param startPipelineReprocessingRequest
     * @return Result of the StartPipelineReprocessing operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.StartPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/StartPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartPipelineReprocessingResult startPipelineReprocessing(StartPipelineReprocessingRequest request) {
        request = beforeClientExecution(request);
        return executeStartPipelineReprocessing(request);
    }

    @SdkInternalApi
    final StartPipelineReprocessingResult executeStartPipelineReprocessing(StartPipelineReprocessingRequest startPipelineReprocessingRequest) {

        ExecutionContext executionContext = createExecutionContext(startPipelineReprocessingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipelineReprocessingRequest> request = null;
        Response<StartPipelineReprocessingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipelineReprocessingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startPipelineReprocessingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPipelineReprocessing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPipelineReprocessingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartPipelineReprocessingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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
     * Updates the settings of a channel.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateChannelResult updateChannel(UpdateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannel(request);
    }

    @SdkInternalApi
    final UpdateChannelResult executeUpdateChannel(UpdateChannelRequest updateChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelRequest> request = null;
        Response<UpdateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings of a data set.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDatasetResult updateDataset(UpdateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataset(request);
    }

    @SdkInternalApi
    final UpdateDatasetResult executeUpdateDataset(UpdateDatasetRequest updateDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetRequest> request = null;
        Response<UpdateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings of a data store.
     * </p>
     * 
     * @param updateDatastoreRequest
     * @return Result of the UpdateDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDatastoreResult updateDatastore(UpdateDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatastore(request);
    }

    @SdkInternalApi
    final UpdateDatastoreResult executeUpdateDatastore(UpdateDatastoreRequest updateDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatastoreRequest> request = null;
        Response<UpdateDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings of a pipeline. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTAnalytics");
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

}
