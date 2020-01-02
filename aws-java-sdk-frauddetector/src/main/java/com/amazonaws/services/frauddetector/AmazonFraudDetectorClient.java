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
package com.amazonaws.services.frauddetector;

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

import com.amazonaws.services.frauddetector.AmazonFraudDetectorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.services.frauddetector.model.transform.*;

/**
 * Client for accessing Amazon Fraud Detector. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers who need detailed information about
 * Amazon Fraud Detector API actions, data types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon Fraud Detector User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFraudDetectorClient extends AmazonWebServiceClient implements AmazonFraudDetector {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonFraudDetector.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "frauddetector";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.frauddetector.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.frauddetector.model.AmazonFraudDetectorException.class));

    public static AmazonFraudDetectorClientBuilder builder() {
        return AmazonFraudDetectorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Fraud Detector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFraudDetectorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Fraud Detector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFraudDetectorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("frauddetector.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/frauddetector/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/frauddetector/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return Result of the BatchCreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.BatchCreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateVariableResult batchCreateVariable(BatchCreateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateVariable(request);
    }

    @SdkInternalApi
    final BatchCreateVariableResult executeBatchCreateVariable(BatchCreateVariableRequest batchCreateVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateVariableRequest> request = null;
        Response<BatchCreateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchCreateVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchCreateVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return Result of the BatchGetVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.BatchGetVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetVariableResult batchGetVariable(BatchGetVariableRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetVariable(request);
    }

    @SdkInternalApi
    final BatchGetVariableResult executeBatchGetVariable(BatchGetVariableRequest batchGetVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetVariableRequest> request = null;
        Response<BatchGetVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a detector version. The detector version starts in a <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return Result of the CreateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDetectorVersionResult createDetectorVersion(CreateDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDetectorVersion(request);
    }

    @SdkInternalApi
    final CreateDetectorVersionResult executeCreateDetectorVersion(CreateDetectorVersionRequest createDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDetectorVersionRequest> request = null;
        Response<CreateDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return Result of the CreateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.CreateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateModelVersionResult createModelVersion(CreateModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModelVersion(request);
    }

    @SdkInternalApi
    final CreateModelVersionResult executeCreateModelVersion(CreateModelVersionRequest createModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelVersionRequest> request = null;
        Response<CreateModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return Result of the CreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVariableResult createVariable(CreateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVariable(request);
    }

    @SdkInternalApi
    final CreateVariableResult executeCreateVariable(CreateVariableRequest createVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(createVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVariableRequest> request = null;
        Response<CreateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVariableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the detector version.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return Result of the DeleteDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.DeleteDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDetectorVersionResult deleteDetectorVersion(DeleteDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDetectorVersion(request);
    }

    @SdkInternalApi
    final DeleteDetectorVersionResult executeDeleteDetectorVersion(DeleteDetectorVersionRequest deleteDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorVersionRequest> request = null;
        Response<DeleteDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @return Result of the DeleteEvent operation returned by the service.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEventResult deleteEvent(DeleteEventRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEvent(request);
    }

    @SdkInternalApi
    final DeleteEventResult executeDeleteEvent(DeleteEventRequest deleteEventRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventRequest> request = null;
        Response<DeleteEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
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
     * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can
     * also get details for a single, specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return Result of the DescribeModelVersions operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.DescribeModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeModelVersionsResult describeModelVersions(DescribeModelVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModelVersions(request);
    }

    @SdkInternalApi
    final DescribeModelVersionsResult executeDescribeModelVersions(DescribeModelVersionsRequest describeModelVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelVersionsRequest> request = null;
        Response<DescribeModelVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModelVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeModelVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return Result of the GetDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDetectorVersionResult getDetectorVersion(GetDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDetectorVersion(request);
    }

    @SdkInternalApi
    final GetDetectorVersionResult executeGetDetectorVersion(GetDetectorVersionRequest getDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorVersionRequest> request = null;
        Response<GetDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDetectorVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this actions
     * retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must be
     * between 5 and 10. To get the next page results, provide the pagination token from the
     * <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return Result of the GetDetectors operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDetectorsResult getDetectors(GetDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDetectors(request);
    }

    @SdkInternalApi
    final GetDetectorsResult executeGetDetectors(GetDetectorsRequest getDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorsRequest> request = null;
        Response<GetDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDetectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxSizePerPage</code>, this actions retrieves a maximum of 10 records
     * per page. If you provide a <code>maxSizePerPage</code>, the value must be between 5 and 10. To get the next page
     * results, provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A
     * null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return Result of the GetExternalModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetExternalModelsResult getExternalModels(GetExternalModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExternalModels(request);
    }

    @SdkInternalApi
    final GetExternalModelsResult executeGetExternalModels(GetExternalModelsRequest getExternalModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExternalModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExternalModelsRequest> request = null;
        Response<GetExternalModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExternalModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExternalModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExternalModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExternalModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExternalModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return Result of the GetModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetModelVersionResult getModelVersion(GetModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelVersion(request);
    }

    @SdkInternalApi
    final GetModelVersionResult executeGetModelVersion(GetModelVersionRequest getModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelVersionRequest> request = null;
        Response<GetModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified
     * model type, model ID combination.
     * </p>
     * 
     * @param getModelsRequest
     * @return Result of the GetModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetModelsResult getModels(GetModelsRequest request) {
        request = beforeClientExecution(request);
        return executeGetModels(request);
    }

    @SdkInternalApi
    final GetModelsResult executeGetModels(GetModelsRequest getModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this
     * actions retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must
     * be between 50 and 100. To get the next page results, provide the pagination token from the
     * <code>GetOutcomesResult</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return Result of the GetOutcomes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOutcomesResult getOutcomes(GetOutcomesRequest request) {
        request = beforeClientExecution(request);
        return executeGetOutcomes(request);
    }

    @SdkInternalApi
    final GetOutcomesResult executeGetOutcomes(GetOutcomesRequest getOutcomesRequest) {

        ExecutionContext executionContext = createExecutionContext(getOutcomesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOutcomesRequest> request = null;
        Response<GetOutcomesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOutcomesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOutcomesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOutcomes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOutcomesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOutcomesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @return Result of the GetPrediction operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPredictionResult getPrediction(GetPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPrediction(request);
    }

    @SdkInternalApi
    final GetPredictionResult executeGetPrediction(GetPredictionRequest getPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPredictionRequest> request = null;
        Response<GetPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPredictionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all rules available for the specified detector.
     * </p>
     * 
     * @param getRulesRequest
     * @return Result of the GetRules operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRulesResult getRules(GetRulesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRules(request);
    }

    @SdkInternalApi
    final GetRulesResult executeGetRules(GetRulesRequest getRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRulesRequest> request = null;
        Response<GetRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated API. Providing null
     * <code>maxSizePerPage</code> results in retrieving maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get the next page result, a provide a
     * pagination token from <code>GetVariablesResult</code> as part of your request. Null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return Result of the GetVariables operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVariablesResult getVariables(GetVariablesRequest request) {
        request = beforeClientExecution(request);
        return executeGetVariables(request);
    }

    @SdkInternalApi
    final GetVariablesResult executeGetVariables(GetVariablesRequest getVariablesRequest) {

        ExecutionContext executionContext = createExecutionContext(getVariablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVariablesRequest> request = null;
        Response<GetVariablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVariablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVariablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVariables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVariablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVariablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return Result of the PutDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDetectorResult putDetector(PutDetectorRequest request) {
        request = beforeClientExecution(request);
        return executePutDetector(request);
    }

    @SdkInternalApi
    final PutDetectorResult executePutDetector(PutDetectorRequest putDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(putDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDetectorRequest> request = null;
        Response<PutDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration
     * of the model endpoint, including the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return Result of the PutExternalModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutExternalModelResult putExternalModel(PutExternalModelRequest request) {
        request = beforeClientExecution(request);
        return executePutExternalModel(request);
    }

    @SdkInternalApi
    final PutExternalModelResult executePutExternalModel(PutExternalModelRequest putExternalModelRequest) {

        ExecutionContext executionContext = createExecutionContext(putExternalModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutExternalModelRequest> request = null;
        Response<PutExternalModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutExternalModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putExternalModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutExternalModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutExternalModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutExternalModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @return Result of the PutModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.PutModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutModelResult putModel(PutModelRequest request) {
        request = beforeClientExecution(request);
        return executePutModel(request);
    }

    @SdkInternalApi
    final PutModelResult executePutModel(PutModelRequest putModelRequest) {

        ExecutionContext executionContext = createExecutionContext(putModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutModelRequest> request = null;
        Response<PutModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutModelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return Result of the PutOutcome operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutOutcomeResult putOutcome(PutOutcomeRequest request) {
        request = beforeClientExecution(request);
        return executePutOutcome(request);
    }

    @SdkInternalApi
    final PutOutcomeResult executePutOutcome(PutOutcomeRequest putOutcomeRequest) {

        ExecutionContext executionContext = createExecutionContext(putOutcomeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOutcomeRequest> request = null;
        Response<PutOutcomeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOutcomeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putOutcomeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOutcome");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOutcomeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutOutcomeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, and description. You can only update a <code>DRAFT</code> detector version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return Result of the UpdateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersion(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionResult executeUpdateDetectorVersion(UpdateDetectorVersionRequest updateDetectorVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionRequest> request = null;
        Response<UpdateDetectorVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDetectorVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDetectorVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata for any detector version (
     * <code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return Result of the UpdateDetectorVersionMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateDetectorVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersionMetadata(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionMetadataResult executeUpdateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionMetadataRequest> request = null;
        Response<UpdateDetectorVersionMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDetectorVersionMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersionMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDetectorVersionMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following promotions or demotions using
     * <code>UpdateDetectorVersionStatus</code>: <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return Result of the UpdateDetectorVersionStatus operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDetectorVersionStatusResult updateDetectorVersionStatus(UpdateDetectorVersionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorVersionStatus(request);
    }

    @SdkInternalApi
    final UpdateDetectorVersionStatusResult executeUpdateDetectorVersionStatus(UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionStatusRequest> request = null;
        Response<UpdateDetectorVersionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDetectorVersionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorVersionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorVersionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDetectorVersionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a model version. You can update the description and status attributes using this action. You can perform
     * the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @return Result of the UpdateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateModelVersionResult updateModelVersion(UpdateModelVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModelVersion(request);
    }

    @SdkInternalApi
    final UpdateModelVersionResult executeUpdateModelVersion(UpdateModelVersionRequest updateModelVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelVersionRequest> request = null;
        Response<UpdateModelVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateModelVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModelVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateModelVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule's metadata.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return Result of the UpdateRuleMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuleMetadataResult updateRuleMetadata(UpdateRuleMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleMetadata(request);
    }

    @SdkInternalApi
    final UpdateRuleMetadataResult executeUpdateRuleMetadata(UpdateRuleMetadataRequest updateRuleMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleMetadataRequest> request = null;
        Response<UpdateRuleMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return Result of the UpdateRuleVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateRuleVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleVersion(request);
    }

    @SdkInternalApi
    final UpdateRuleVersionResult executeUpdateRuleVersion(UpdateRuleVersionRequest updateRuleVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleVersionRequest> request = null;
        Response<UpdateRuleVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return Result of the UpdateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVariableResult updateVariable(UpdateVariableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVariable(request);
    }

    @SdkInternalApi
    final UpdateVariableResult executeUpdateVariable(UpdateVariableRequest updateVariableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVariableRequest> request = null;
        Response<UpdateVariableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVariableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVariableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FraudDetector");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVariable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVariableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVariableResultJsonUnmarshaller());
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
