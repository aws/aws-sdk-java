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
package com.amazonaws.services.lookoutequipment;

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

import com.amazonaws.services.lookoutequipment.AmazonLookoutEquipmentClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.services.lookoutequipment.model.transform.*;

/**
 * Client for accessing LookoutEquipment. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Lookout for Equipment is a machine learning service that uses advanced analytics to identify anomalies in
 * machines from sensor data for use in predictive maintenance.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLookoutEquipmentClient extends AmazonWebServiceClient implements AmazonLookoutEquipment {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLookoutEquipment.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lookoutequipment";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutequipment.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lookoutequipment.model.AmazonLookoutEquipmentException.class));

    public static AmazonLookoutEquipmentClientBuilder builder() {
        return AmazonLookoutEquipmentClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on LookoutEquipment using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutEquipmentClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on LookoutEquipment using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutEquipmentClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lookoutequipment.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lookoutequipment/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lookoutequipment/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata
     * describing where the data is and what the data actually looks like. In other words, it contains the location of
     * the data source, the data schema, and other information. A dataset also contains any tags associated with the
     * ingested data.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to
     * analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data,
     * assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency
     * of inferencing. You must also provide an S3 bucket location for the output data.
     * </p>
     * 
     * @param createInferenceSchedulerRequest
     * @return Result of the CreateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInferenceSchedulerResult createInferenceScheduler(CreateInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInferenceScheduler(request);
    }

    @SdkInternalApi
    final CreateInferenceSchedulerResult executeCreateInferenceScheduler(CreateInferenceSchedulerRequest createInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(createInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInferenceSchedulerRequest> request = null;
        Response<CreateInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInferenceSchedulerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an ML model for data inference.
     * </p>
     * <p>
     * A machine-learning (ML) model is a mathematical model that finds patterns in your data. In Amazon Lookout for
     * Equipment, the model learns the patterns of normal behavior and detects abnormal behavior that could be potential
     * equipment failure (or maintenance events). The models are made by analyzing normal data and abnormalities in
     * machine behavior that have already occurred.
     * </p>
     * <p>
     * Your model is trained using a portion of the data from your dataset and uses that data to learn patterns of
     * normal behavior and abnormal patterns that lead to equipment failure. Another portion of the data is used to
     * evaluate the model's accuracy.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @sample AmazonLookoutEquipment.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModel(request);
    }

    @SdkInternalApi
    final CreateModelResult executeCreateModel(CreateModelRequest createModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data
     * ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated
     * data stored in S3 will be deleted. This does not affect any models that used this dataset for training and
     * evaluation, but does prevent it from being used in the future.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AmazonLookoutEquipment.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Deletes an inference scheduler that has been set up. Already processed output results are not affected.
     * </p>
     * 
     * @param deleteInferenceSchedulerRequest
     * @return Result of the DeleteInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DeleteInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInferenceSchedulerResult deleteInferenceScheduler(DeleteInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInferenceScheduler(request);
    }

    @SdkInternalApi
    final DeleteInferenceSchedulerResult executeDeleteInferenceScheduler(DeleteInferenceSchedulerRequest deleteInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInferenceSchedulerRequest> request = null;
        Response<DeleteInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInferenceSchedulerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used
     * with an inference scheduler, even one that is already set up.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @sample AmazonLookoutEquipment.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteModelResult deleteModel(DeleteModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModel(request);
    }

    @SdkInternalApi
    final DeleteModelResult executeDeleteModel(DeleteModelRequest deleteModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<DeleteModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information on a specific data ingestion job such as creation time, dataset ARN, status, and so on.
     * </p>
     * 
     * @param describeDataIngestionJobRequest
     * @return Result of the DescribeDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataIngestionJobResult describeDataIngestionJob(DescribeDataIngestionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataIngestionJob(request);
    }

    @SdkInternalApi
    final DescribeDataIngestionJobResult executeDescribeDataIngestionJob(DescribeDataIngestionJobRequest describeDataIngestionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataIngestionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataIngestionJobRequest> request = null;
        Response<DescribeDataIngestionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataIngestionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataIngestionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataIngestionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataIngestionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataIngestionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information on a specified dataset such as the schema location, status, and so on.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Specifies information about the inference scheduler being used, including name, model, status, and associated
     * metadata
     * </p>
     * 
     * @param describeInferenceSchedulerRequest
     * @return Result of the DescribeInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInferenceSchedulerResult describeInferenceScheduler(DescribeInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInferenceScheduler(request);
    }

    @SdkInternalApi
    final DescribeInferenceSchedulerResult executeDescribeInferenceScheduler(DescribeInferenceSchedulerRequest describeInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInferenceSchedulerRequest> request = null;
        Response<DescribeInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInferenceSchedulerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides overall information about a specific ML model, including model name and ARN, dataset, training and
     * evaluation information, status, and so on.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeModelResult describeModel(DescribeModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModel(request);
    }

    @SdkInternalApi
    final DescribeModelResult executeDescribeModel(DescribeModelRequest describeModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelRequest> request = null;
        Response<DescribeModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data,
     * status, and so on.
     * </p>
     * 
     * @param listDataIngestionJobsRequest
     * @return Result of the ListDataIngestionJobs operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDataIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataIngestionJobsResult listDataIngestionJobs(ListDataIngestionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataIngestionJobs(request);
    }

    @SdkInternalApi
    final ListDataIngestionJobsResult executeListDataIngestionJobs(ListDataIngestionJobsRequest listDataIngestionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataIngestionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataIngestionJobsRequest> request = null;
        Response<ListDataIngestionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataIngestionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataIngestionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataIngestionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataIngestionJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDataIngestionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all datasets currently available in your account, filtering on the dataset name.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Lists all inference executions that have been performed by the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceExecutionsRequest
     * @return Result of the ListInferenceExecutions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInferenceExecutionsResult listInferenceExecutions(ListInferenceExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListInferenceExecutions(request);
    }

    @SdkInternalApi
    final ListInferenceExecutionsResult executeListInferenceExecutions(ListInferenceExecutionsRequest listInferenceExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInferenceExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInferenceExecutionsRequest> request = null;
        Response<ListInferenceExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInferenceExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInferenceExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInferenceExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInferenceExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInferenceExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all inference schedulers currently available for your account.
     * </p>
     * 
     * @param listInferenceSchedulersRequest
     * @return Result of the ListInferenceSchedulers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInferenceSchedulersResult listInferenceSchedulers(ListInferenceSchedulersRequest request) {
        request = beforeClientExecution(request);
        return executeListInferenceSchedulers(request);
    }

    @SdkInternalApi
    final ListInferenceSchedulersResult executeListInferenceSchedulers(ListInferenceSchedulersRequest listInferenceSchedulersRequest) {

        ExecutionContext executionContext = createExecutionContext(listInferenceSchedulersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInferenceSchedulersRequest> request = null;
        Response<ListInferenceSchedulersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInferenceSchedulersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInferenceSchedulersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInferenceSchedulers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInferenceSchedulersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInferenceSchedulersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a list of all models in the account, including model name and ARN, dataset, and status.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListModelsResult listModels(ListModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListModels(request);
    }

    @SdkInternalApi
    final ListModelsResult executeListModels(ListModelsRequest listModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelsRequest> request = null;
        Response<ListModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the tags for a specified resource, including key and value.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status.
     * </p>
     * 
     * @param startDataIngestionJobRequest
     * @return Result of the StartDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDataIngestionJobResult startDataIngestionJob(StartDataIngestionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartDataIngestionJob(request);
    }

    @SdkInternalApi
    final StartDataIngestionJobResult executeStartDataIngestionJob(StartDataIngestionJobRequest startDataIngestionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startDataIngestionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataIngestionJobRequest> request = null;
        Response<StartDataIngestionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataIngestionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDataIngestionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDataIngestionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDataIngestionJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartDataIngestionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an inference scheduler.
     * </p>
     * 
     * @param startInferenceSchedulerRequest
     * @return Result of the StartInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartInferenceSchedulerResult startInferenceScheduler(StartInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeStartInferenceScheduler(request);
    }

    @SdkInternalApi
    final StartInferenceSchedulerResult executeStartInferenceScheduler(StartInferenceSchedulerRequest startInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(startInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInferenceSchedulerRequest> request = null;
        Response<StartInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartInferenceSchedulerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an inference scheduler.
     * </p>
     * 
     * @param stopInferenceSchedulerRequest
     * @return Result of the StopInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StopInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopInferenceSchedulerResult stopInferenceScheduler(StopInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeStopInferenceScheduler(request);
    }

    @SdkInternalApi
    final StopInferenceSchedulerResult executeStopInferenceScheduler(StopInferenceSchedulerRequest stopInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(stopInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInferenceSchedulerRequest> request = null;
        Response<StopInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopInferenceSchedulerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon
     * Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you
     * to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to
     * 50 tags can be associated with each resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Removes a specific tag from a given resource. The tag is specified by its key.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
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
     * Updates an inference scheduler.
     * </p>
     * 
     * @param updateInferenceSchedulerRequest
     * @return Result of the UpdateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related AWS service
     *         that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInferenceSchedulerResult updateInferenceScheduler(UpdateInferenceSchedulerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInferenceScheduler(request);
    }

    @SdkInternalApi
    final UpdateInferenceSchedulerResult executeUpdateInferenceScheduler(UpdateInferenceSchedulerRequest updateInferenceSchedulerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInferenceSchedulerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInferenceSchedulerRequest> request = null;
        Response<UpdateInferenceSchedulerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInferenceSchedulerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInferenceSchedulerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutEquipment");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInferenceScheduler");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInferenceSchedulerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInferenceSchedulerResultJsonUnmarshaller());
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
