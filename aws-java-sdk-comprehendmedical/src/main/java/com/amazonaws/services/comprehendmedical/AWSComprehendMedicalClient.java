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
package com.amazonaws.services.comprehendmedical;

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

import com.amazonaws.services.comprehendmedical.AWSComprehendMedicalClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.services.comprehendmedical.model.transform.*;

/**
 * Client for accessing ComprehendMedical. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain
 * insight in your documents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComprehendMedicalClient extends AmazonWebServiceClient implements AWSComprehendMedical {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSComprehendMedical.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "comprehendmedical";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEncodingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.InvalidEncodingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextSizeLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.TextSizeLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.comprehendmedical.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.comprehendmedical.model.AWSComprehendMedicalException.class));

    public static AWSComprehendMedicalClientBuilder builder() {
        return AWSComprehendMedicalClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ComprehendMedical using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ComprehendMedical using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("comprehendmedical.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/comprehendmedical/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/comprehendmedical/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @return Result of the DescribeEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.DescribeEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2Job(DescribeEntitiesDetectionV2JobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEntitiesDetectionV2Job(request);
    }

    @SdkInternalApi
    final DescribeEntitiesDetectionV2JobResult executeDescribeEntitiesDetectionV2Job(DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntitiesDetectionV2JobRequest> request = null;
        Response<DescribeEntitiesDetectionV2JobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntitiesDetectionV2JobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEntitiesDetectionV2JobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEntitiesDetectionV2Job");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEntitiesDetectionV2JobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEntitiesDetectionV2JobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get
     * the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @return Result of the DescribePHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.DescribePHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribePHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePHIDetectionJobResult describePHIDetectionJob(DescribePHIDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePHIDetectionJob(request);
    }

    @SdkInternalApi
    final DescribePHIDetectionJobResult executeDescribePHIDetectionJob(DescribePHIDetectionJobRequest describePHIDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describePHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePHIDetectionJobRequest> request = null;
        Response<DescribePHIDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePHIDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePHIDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePHIDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePHIDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePHIDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DetectEntities</code> operation is deprecated. You should use the <a>DetectEntitiesV2</a> operation
     * instead.
     * </p>
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DetectEntitiesResult detectEntities(DetectEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDetectEntities(request);
    }

    @SdkInternalApi
    final DetectEntitiesResult executeDetectEntities(DetectEntitiesRequest detectEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(detectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesRequest> request = null;
        Response<DetectEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation replaces the <a>DetectEntities</a> operation. This new action uses a
     * different model for determining the entities in your medical text and changes the way that some entities are
     * returned in the output. You should use the <code>DetectEntitiesV2</code> operation in all new applications.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation returns the <code>Acuity</code> and <code>Direction</code> entities
     * as attributes instead of types.
     * </p>
     * 
     * @param detectEntitiesV2Request
     * @return Result of the DetectEntitiesV2 operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntitiesV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntitiesV2"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetectEntitiesV2Result detectEntitiesV2(DetectEntitiesV2Request request) {
        request = beforeClientExecution(request);
        return executeDetectEntitiesV2(request);
    }

    @SdkInternalApi
    final DetectEntitiesV2Result executeDetectEntitiesV2(DetectEntitiesV2Request detectEntitiesV2Request) {

        ExecutionContext executionContext = createExecutionContext(detectEntitiesV2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesV2Request> request = null;
        Response<DetectEntitiesV2Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesV2RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectEntitiesV2Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectEntitiesV2");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectEntitiesV2Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectEntitiesV2ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI) entities and returns the entity category,
     * location, and confidence score for each entity. Amazon Comprehend Medical only detects entities in English
     * language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @return Result of the DetectPHI operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetectPHIResult detectPHI(DetectPHIRequest request) {
        request = beforeClientExecution(request);
        return executeDetectPHI(request);
    }

    @SdkInternalApi
    final DetectPHIResult executeDetectPHI(DetectPHIRequest detectPHIRequest) {

        ExecutionContext executionContext = createExecutionContext(detectPHIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectPHIRequest> request = null;
        Response<DetectPHIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectPHIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectPHIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectPHI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectPHIResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectPHIResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to
     * normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @return Result of the InferICD10CM operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.InferICD10CM
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferICD10CM" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public InferICD10CMResult inferICD10CM(InferICD10CMRequest request) {
        request = beforeClientExecution(request);
        return executeInferICD10CM(request);
    }

    @SdkInternalApi
    final InferICD10CMResult executeInferICD10CM(InferICD10CMRequest inferICD10CMRequest) {

        ExecutionContext executionContext = createExecutionContext(inferICD10CMRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InferICD10CMRequest> request = null;
        Response<InferICD10CMResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InferICD10CMRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(inferICD10CMRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InferICD10CM");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InferICD10CMResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InferICD10CMResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept
     * identifiers in the RxNorm database from the National Library of Medicine. Amazon Comprehend Medical only detects
     * medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @return Result of the InferRxNorm operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Comprehend Medical service is temporarily unavailable. Please wait and then retry your
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.InferRxNorm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferRxNorm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public InferRxNormResult inferRxNorm(InferRxNormRequest request) {
        request = beforeClientExecution(request);
        return executeInferRxNorm(request);
    }

    @SdkInternalApi
    final InferRxNormResult executeInferRxNorm(InferRxNormRequest inferRxNormRequest) {

        ExecutionContext executionContext = createExecutionContext(inferRxNormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InferRxNormRequest> request = null;
        Response<InferRxNormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InferRxNormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(inferRxNormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InferRxNorm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InferRxNormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InferRxNormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @return Result of the ListEntitiesDetectionV2Jobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ValidationException
     *         The filter that you specified for the operation is invalid. Check the filter values that you entered and
     *         try your request again.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.ListEntitiesDetectionV2Jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListEntitiesDetectionV2Jobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2Jobs(ListEntitiesDetectionV2JobsRequest request) {
        request = beforeClientExecution(request);
        return executeListEntitiesDetectionV2Jobs(request);
    }

    @SdkInternalApi
    final ListEntitiesDetectionV2JobsResult executeListEntitiesDetectionV2Jobs(ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntitiesDetectionV2JobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesDetectionV2JobsRequest> request = null;
        Response<ListEntitiesDetectionV2JobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesDetectionV2JobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEntitiesDetectionV2JobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntitiesDetectionV2Jobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntitiesDetectionV2JobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEntitiesDetectionV2JobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @return Result of the ListPHIDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ValidationException
     *         The filter that you specified for the operation is invalid. Check the filter values that you entered and
     *         try your request again.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.ListPHIDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListPHIDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPHIDetectionJobsResult listPHIDetectionJobs(ListPHIDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListPHIDetectionJobs(request);
    }

    @SdkInternalApi
    final ListPHIDetectionJobsResult executeListPHIDetectionJobs(ListPHIDetectionJobsRequest listPHIDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPHIDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPHIDetectionJobsRequest> request = null;
        Response<ListPHIDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPHIDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPHIDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPHIDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPHIDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPHIDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of documents. Use the
     * <code>DescribeEntitiesDetectionV2Job</code> operation to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @return Result of the StartEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StartEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartEntitiesDetectionV2JobResult startEntitiesDetectionV2Job(StartEntitiesDetectionV2JobRequest request) {
        request = beforeClientExecution(request);
        return executeStartEntitiesDetectionV2Job(request);
    }

    @SdkInternalApi
    final StartEntitiesDetectionV2JobResult executeStartEntitiesDetectionV2Job(StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest) {

        ExecutionContext executionContext = createExecutionContext(startEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEntitiesDetectionV2JobRequest> request = null;
        Response<StartEntitiesDetectionV2JobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEntitiesDetectionV2JobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startEntitiesDetectionV2JobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartEntitiesDetectionV2Job");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartEntitiesDetectionV2JobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartEntitiesDetectionV2JobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI). Use the
     * <code>DescribePHIDetectionJob</code> operation to track the status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @return Result of the StartPHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StartPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StartPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartPHIDetectionJobResult startPHIDetectionJob(StartPHIDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartPHIDetectionJob(request);
    }

    @SdkInternalApi
    final StartPHIDetectionJobResult executeStartPHIDetectionJob(StartPHIDetectionJobRequest startPHIDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startPHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPHIDetectionJobRequest> request = null;
        Response<StartPHIDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPHIDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPHIDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPHIDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPHIDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartPHIDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @return Result of the StopEntitiesDetectionV2Job operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StopEntitiesDetectionV2Job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopEntitiesDetectionV2Job"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2Job(StopEntitiesDetectionV2JobRequest request) {
        request = beforeClientExecution(request);
        return executeStopEntitiesDetectionV2Job(request);
    }

    @SdkInternalApi
    final StopEntitiesDetectionV2JobResult executeStopEntitiesDetectionV2Job(StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEntitiesDetectionV2JobRequest> request = null;
        Response<StopEntitiesDetectionV2JobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEntitiesDetectionV2JobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopEntitiesDetectionV2JobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopEntitiesDetectionV2Job");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopEntitiesDetectionV2JobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopEntitiesDetectionV2JobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @return Result of the StopPHIDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws ResourceNotFoundException
     *         The resource identified by the specified Amazon Resource Name (ARN) was not found. Check the ARN and try
     *         your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSComprehendMedical.StopPHIDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/StopPHIDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopPHIDetectionJobResult stopPHIDetectionJob(StopPHIDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopPHIDetectionJob(request);
    }

    @SdkInternalApi
    final StopPHIDetectionJobResult executeStopPHIDetectionJob(StopPHIDetectionJobRequest stopPHIDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopPHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPHIDetectionJobRequest> request = null;
        Response<StopPHIDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPHIDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopPHIDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopPHIDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopPHIDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopPHIDetectionJobResultJsonUnmarshaller());
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
