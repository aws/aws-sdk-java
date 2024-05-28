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
package com.amazonaws.services.bedrock;

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

import com.amazonaws.services.bedrock.AmazonBedrockClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.services.bedrock.model.transform.*;

/**
 * Client for accessing Amazon Bedrock. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Describes the API operations for creating, managing, fine-turning, and evaluating Amazon Bedrock models.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonBedrockClient extends AmazonWebServiceClient implements AmazonBedrock {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonBedrock.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "bedrock";

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
                                    com.amazonaws.services.bedrock.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrock.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.bedrock.model.AmazonBedrockException.class));

    public static AmazonBedrockClientBuilder builder() {
        return AmazonBedrockClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Bedrock using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonBedrockClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Bedrock using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonBedrockClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("bedrock.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/bedrock/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/bedrock/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * API operation for creating and managing Amazon Bedrock automatic model evaluation jobs and model evaluation jobs
     * that use human workers. To learn more about the requirements for creating a model evaluation job see, <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation.html">Model evaluations</a>.
     * </p>
     * 
     * @param createEvaluationJobRequest
     * @return Result of the CreateEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateEvaluationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEvaluationJobResult createEvaluationJob(CreateEvaluationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEvaluationJob(request);
    }

    @SdkInternalApi
    final CreateEvaluationJobResult executeCreateEvaluationJob(CreateEvaluationJobRequest createEvaluationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createEvaluationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEvaluationJobRequest> request = null;
        Response<CreateEvaluationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEvaluationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEvaluationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEvaluationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEvaluationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEvaluationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a guardrail to block topics and to filter out harmful content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a <code>name</code> and optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify messages for when the guardrail successfully blocks a prompt or a model response in the
     * <code>blockedInputMessaging</code> and <code>blockedOutputsMessaging</code> fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify topics for the guardrail to deny in the <code>topicPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailTopicConfig.html"
     * >GuardrailTopicConfig</a> object in the <code>topicsConfig</code> list pertains to one topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Give a <code>name</code> and <code>description</code> so that the guardrail can properly identify the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>DENY</code> in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Provide up to five prompts that you would categorize as belonging to the topic in the
     * <code>examples</code> list.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Specify filter strengths for the harmful categories defined in Amazon Bedrock in the
     * <code>contentPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a> object in the <code>filtersConfig</code> list pertains to a harmful category.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters">Content filters</a>. For more
     * information about the fields in a content filter, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the category in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the strength of the filter for prompts in the <code>inputStrength</code> field and for model responses in
     * the <code>strength</code> field of the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * (Optional) For security, include the ARN of a KMS key in the <code>kmsKeyId</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Attach any tags to the guardrail in the <code>tags</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging">Tag resources</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGuardrailRequest
     * @return Result of the CreateGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGuardrailResult createGuardrail(CreateGuardrailRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGuardrail(request);
    }

    @SdkInternalApi
    final CreateGuardrailResult executeCreateGuardrail(CreateGuardrailRequest createGuardrailRequest) {

        ExecutionContext executionContext = createExecutionContext(createGuardrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGuardrailRequest> request = null;
        Response<CreateGuardrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGuardrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGuardrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGuardrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGuardrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGuardrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a version of the guardrail. Use this API to create a snapshot of the guardrail when you are satisfied
     * with a configuration, or to compare the configuration with another version.
     * </p>
     * 
     * @param createGuardrailVersionRequest
     * @return Result of the CreateGuardrailVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateGuardrailVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateGuardrailVersionResult createGuardrailVersion(CreateGuardrailVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGuardrailVersion(request);
    }

    @SdkInternalApi
    final CreateGuardrailVersionResult executeCreateGuardrailVersion(CreateGuardrailVersionRequest createGuardrailVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createGuardrailVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGuardrailVersionRequest> request = null;
        Response<CreateGuardrailVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGuardrailVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGuardrailVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGuardrailVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGuardrailVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateGuardrailVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fine-tuning job to customize a base model.
     * </p>
     * <p>
     * You specify the base foundation model and the location of the training data. After the model-customization job
     * completes successfully, your custom model resource will be ready to use. Amazon Bedrock returns validation loss
     * metrics and output generations after the job completes.
     * </p>
     * <p>
     * For information on the format of training and validation data, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-prepare.html">Prepare the
     * datasets</a>.
     * </p>
     * <p>
     * Model-customization jobs are asynchronous and the completion time depends on the base model and the
     * training/validation data size. To monitor a job, use the <code>GetModelCustomizationJob</code> operation to
     * retrieve the job status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param createModelCustomizationJobRequest
     * @return Result of the CreateModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateModelCustomizationJobResult createModelCustomizationJob(CreateModelCustomizationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModelCustomizationJob(request);
    }

    @SdkInternalApi
    final CreateModelCustomizationJobResult executeCreateModelCustomizationJob(CreateModelCustomizationJobRequest createModelCustomizationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelCustomizationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelCustomizationJobRequest> request = null;
        Response<CreateModelCustomizationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelCustomizationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createModelCustomizationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModelCustomizationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelCustomizationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateModelCustomizationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates dedicated throughput for a base or custom model with the model units and for the duration that you
     * specify. For pricing details, see <a href="http://aws.amazon.com/bedrock/pricing/">Amazon Bedrock Pricing</a>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createProvisionedModelThroughputRequest
     * @return Result of the CreateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProvisionedModelThroughputResult createProvisionedModelThroughput(CreateProvisionedModelThroughputRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProvisionedModelThroughput(request);
    }

    @SdkInternalApi
    final CreateProvisionedModelThroughputResult executeCreateProvisionedModelThroughput(
            CreateProvisionedModelThroughputRequest createProvisionedModelThroughputRequest) {

        ExecutionContext executionContext = createExecutionContext(createProvisionedModelThroughputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProvisionedModelThroughputRequest> request = null;
        Response<CreateProvisionedModelThroughputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProvisionedModelThroughputRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createProvisionedModelThroughputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProvisionedModelThroughput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProvisionedModelThroughputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateProvisionedModelThroughputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom model that you created earlier. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param deleteCustomModelRequest
     * @return Result of the DeleteCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCustomModelResult deleteCustomModel(DeleteCustomModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomModel(request);
    }

    @SdkInternalApi
    final DeleteCustomModelResult executeDeleteCustomModel(DeleteCustomModelRequest deleteCustomModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomModelRequest> request = null;
        Response<DeleteCustomModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCustomModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a guardrail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a guardrail, only specify the ARN of the guardrail in the <code>guardrailIdentifier</code> field. If
     * you delete a guardrail, all of its versions will be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a version of a guardrail, specify the ARN of the guardrail in the <code>guardrailIdentifier</code>
     * field and the version in the <code>guardrailVersion</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteGuardrailRequest
     * @return Result of the DeleteGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGuardrailResult deleteGuardrail(DeleteGuardrailRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGuardrail(request);
    }

    @SdkInternalApi
    final DeleteGuardrailResult executeDeleteGuardrail(DeleteGuardrailRequest deleteGuardrailRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGuardrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGuardrailRequest> request = null;
        Response<DeleteGuardrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGuardrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGuardrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGuardrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGuardrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGuardrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the invocation logging.
     * </p>
     * 
     * @param deleteModelInvocationLoggingConfigurationRequest
     * @return Result of the DeleteModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteModelInvocationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteModelInvocationLoggingConfigurationResult deleteModelInvocationLoggingConfiguration(DeleteModelInvocationLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModelInvocationLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteModelInvocationLoggingConfigurationResult executeDeleteModelInvocationLoggingConfiguration(
            DeleteModelInvocationLoggingConfigurationRequest deleteModelInvocationLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelInvocationLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelInvocationLoggingConfigurationRequest> request = null;
        Response<DeleteModelInvocationLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelInvocationLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteModelInvocationLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModelInvocationLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelInvocationLoggingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteModelInvocationLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Provisioned Throughput. You can't delete a Provisioned Throughput before the commitment term is over.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deleteProvisionedModelThroughputRequest
     * @return Result of the DeleteProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProvisionedModelThroughputResult deleteProvisionedModelThroughput(DeleteProvisionedModelThroughputRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProvisionedModelThroughput(request);
    }

    @SdkInternalApi
    final DeleteProvisionedModelThroughputResult executeDeleteProvisionedModelThroughput(
            DeleteProvisionedModelThroughputRequest deleteProvisionedModelThroughputRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProvisionedModelThroughputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisionedModelThroughputRequest> request = null;
        Response<DeleteProvisionedModelThroughputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisionedModelThroughputRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProvisionedModelThroughputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProvisionedModelThroughput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProvisionedModelThroughputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProvisionedModelThroughputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the properties associated with a Amazon Bedrock custom model that you have created.For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param getCustomModelRequest
     * @return Result of the GetCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCustomModelResult getCustomModel(GetCustomModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomModel(request);
    }

    @SdkInternalApi
    final GetCustomModelResult executeGetCustomModel(GetCustomModelRequest getCustomModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomModelRequest> request = null;
        Response<GetCustomModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCustomModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCustomModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCustomModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the properties associated with a model evaluation job, including the status of the job. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/latest/userguide/model-evaluation.html">Model
     * evaluations</a>.
     * </p>
     * 
     * @param getEvaluationJobRequest
     * @return Result of the GetEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEvaluationJobResult getEvaluationJob(GetEvaluationJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvaluationJob(request);
    }

    @SdkInternalApi
    final GetEvaluationJobResult executeGetEvaluationJob(GetEvaluationJobRequest getEvaluationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvaluationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvaluationJobRequest> request = null;
        Response<GetEvaluationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvaluationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEvaluationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvaluationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvaluationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEvaluationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get details about a Amazon Bedrock foundation model.
     * </p>
     * 
     * @param getFoundationModelRequest
     * @return Result of the GetFoundationModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetFoundationModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFoundationModelResult getFoundationModel(GetFoundationModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetFoundationModel(request);
    }

    @SdkInternalApi
    final GetFoundationModelResult executeGetFoundationModel(GetFoundationModelRequest getFoundationModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getFoundationModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFoundationModelRequest> request = null;
        Response<GetFoundationModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFoundationModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFoundationModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFoundationModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFoundationModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFoundationModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a guardrail. If you don't specify a version, the response returns details for the
     * <code>DRAFT</code> version.
     * </p>
     * 
     * @param getGuardrailRequest
     * @return Result of the GetGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGuardrailResult getGuardrail(GetGuardrailRequest request) {
        request = beforeClientExecution(request);
        return executeGetGuardrail(request);
    }

    @SdkInternalApi
    final GetGuardrailResult executeGetGuardrail(GetGuardrailRequest getGuardrailRequest) {

        ExecutionContext executionContext = createExecutionContext(getGuardrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGuardrailRequest> request = null;
        Response<GetGuardrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGuardrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGuardrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGuardrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGuardrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGuardrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the properties associated with a model-customization job, including the status of the job. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getModelCustomizationJobRequest
     * @return Result of the GetModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetModelCustomizationJobResult getModelCustomizationJob(GetModelCustomizationJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelCustomizationJob(request);
    }

    @SdkInternalApi
    final GetModelCustomizationJobResult executeGetModelCustomizationJob(GetModelCustomizationJobRequest getModelCustomizationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelCustomizationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelCustomizationJobRequest> request = null;
        Response<GetModelCustomizationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelCustomizationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getModelCustomizationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelCustomizationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelCustomizationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetModelCustomizationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the current configuration values for model invocation logging.
     * </p>
     * 
     * @param getModelInvocationLoggingConfigurationRequest
     * @return Result of the GetModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetModelInvocationLoggingConfigurationResult getModelInvocationLoggingConfiguration(GetModelInvocationLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelInvocationLoggingConfiguration(request);
    }

    @SdkInternalApi
    final GetModelInvocationLoggingConfigurationResult executeGetModelInvocationLoggingConfiguration(
            GetModelInvocationLoggingConfigurationRequest getModelInvocationLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelInvocationLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelInvocationLoggingConfigurationRequest> request = null;
        Response<GetModelInvocationLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelInvocationLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getModelInvocationLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelInvocationLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelInvocationLoggingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetModelInvocationLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getProvisionedModelThroughputRequest
     * @return Result of the GetProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProvisionedModelThroughputResult getProvisionedModelThroughput(GetProvisionedModelThroughputRequest request) {
        request = beforeClientExecution(request);
        return executeGetProvisionedModelThroughput(request);
    }

    @SdkInternalApi
    final GetProvisionedModelThroughputResult executeGetProvisionedModelThroughput(GetProvisionedModelThroughputRequest getProvisionedModelThroughputRequest) {

        ExecutionContext executionContext = createExecutionContext(getProvisionedModelThroughputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProvisionedModelThroughputRequest> request = null;
        Response<GetProvisionedModelThroughputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProvisionedModelThroughputRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProvisionedModelThroughputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProvisionedModelThroughput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProvisionedModelThroughputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProvisionedModelThroughputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the custom models that you have created with the <code>CreateModelCustomizationJob</code>
     * operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param listCustomModelsRequest
     * @return Result of the ListCustomModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListCustomModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCustomModelsResult listCustomModels(ListCustomModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomModels(request);
    }

    @SdkInternalApi
    final ListCustomModelsResult executeListCustomModels(ListCustomModelsRequest listCustomModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomModelsRequest> request = null;
        Response<ListCustomModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCustomModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCustomModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists model evaluation jobs.
     * </p>
     * 
     * @param listEvaluationJobsRequest
     * @return Result of the ListEvaluationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListEvaluationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEvaluationJobsResult listEvaluationJobs(ListEvaluationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListEvaluationJobs(request);
    }

    @SdkInternalApi
    final ListEvaluationJobsResult executeListEvaluationJobs(ListEvaluationJobsRequest listEvaluationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEvaluationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEvaluationJobsRequest> request = null;
        Response<ListEvaluationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEvaluationJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEvaluationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEvaluationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEvaluationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEvaluationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Bedrock foundation models that you can use. You can filter the results with the request parameters.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/foundation-models.html">Foundation models</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFoundationModelsRequest
     * @return Result of the ListFoundationModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListFoundationModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFoundationModelsResult listFoundationModels(ListFoundationModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListFoundationModels(request);
    }

    @SdkInternalApi
    final ListFoundationModelsResult executeListFoundationModels(ListFoundationModelsRequest listFoundationModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFoundationModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFoundationModelsRequest> request = null;
        Response<ListFoundationModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFoundationModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFoundationModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFoundationModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFoundationModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFoundationModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists details about all the guardrails in an account. To list the <code>DRAFT</code> version of all your
     * guardrails, don't specify the <code>guardrailIdentifier</code> field. To list all versions of a guardrail,
     * specify the ARN of the guardrail in the <code>guardrailIdentifier</code> field.
     * </p>
     * <p>
     * You can set the maximum number of results to return in a response in the <code>maxResults</code> field. If there
     * are more results than the number you set, the response returns a <code>nextToken</code> that you can send in
     * another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     * 
     * @param listGuardrailsRequest
     * @return Result of the ListGuardrails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListGuardrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListGuardrails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGuardrailsResult listGuardrails(ListGuardrailsRequest request) {
        request = beforeClientExecution(request);
        return executeListGuardrails(request);
    }

    @SdkInternalApi
    final ListGuardrailsResult executeListGuardrails(ListGuardrailsRequest listGuardrailsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGuardrailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGuardrailsRequest> request = null;
        Response<ListGuardrailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGuardrailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGuardrailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGuardrails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGuardrailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGuardrailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of model customization jobs that you have submitted. You can filter the jobs to return based on
     * one or more criteria.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param listModelCustomizationJobsRequest
     * @return Result of the ListModelCustomizationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListModelCustomizationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListModelCustomizationJobsResult listModelCustomizationJobs(ListModelCustomizationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListModelCustomizationJobs(request);
    }

    @SdkInternalApi
    final ListModelCustomizationJobsResult executeListModelCustomizationJobs(ListModelCustomizationJobsRequest listModelCustomizationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelCustomizationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelCustomizationJobsRequest> request = null;
        Response<ListModelCustomizationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelCustomizationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listModelCustomizationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModelCustomizationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelCustomizationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListModelCustomizationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Provisioned Throughputs in the account. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listProvisionedModelThroughputsRequest
     * @return Result of the ListProvisionedModelThroughputs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListProvisionedModelThroughputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProvisionedModelThroughputsResult listProvisionedModelThroughputs(ListProvisionedModelThroughputsRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisionedModelThroughputs(request);
    }

    @SdkInternalApi
    final ListProvisionedModelThroughputsResult executeListProvisionedModelThroughputs(
            ListProvisionedModelThroughputsRequest listProvisionedModelThroughputsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisionedModelThroughputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisionedModelThroughputsRequest> request = null;
        Response<ListProvisionedModelThroughputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisionedModelThroughputsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisionedModelThroughputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisionedModelThroughputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisionedModelThroughputsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProvisionedModelThroughputsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags associated with the specified resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging
     * resources</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
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
     * Set the configuration values for model invocation logging.
     * </p>
     * 
     * @param putModelInvocationLoggingConfigurationRequest
     * @return Result of the PutModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.PutModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/PutModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutModelInvocationLoggingConfigurationResult putModelInvocationLoggingConfiguration(PutModelInvocationLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutModelInvocationLoggingConfiguration(request);
    }

    @SdkInternalApi
    final PutModelInvocationLoggingConfigurationResult executePutModelInvocationLoggingConfiguration(
            PutModelInvocationLoggingConfigurationRequest putModelInvocationLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putModelInvocationLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutModelInvocationLoggingConfigurationRequest> request = null;
        Response<PutModelInvocationLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutModelInvocationLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putModelInvocationLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutModelInvocationLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutModelInvocationLoggingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutModelInvocationLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an in progress model evaluation job.
     * </p>
     * 
     * @param stopEvaluationJobRequest
     * @return Result of the StopEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.StopEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopEvaluationJobResult stopEvaluationJob(StopEvaluationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopEvaluationJob(request);
    }

    @SdkInternalApi
    final StopEvaluationJobResult executeStopEvaluationJob(StopEvaluationJobRequest stopEvaluationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopEvaluationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEvaluationJobRequest> request = null;
        Response<StopEvaluationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEvaluationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopEvaluationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopEvaluationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopEvaluationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopEvaluationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an active model customization job. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param stopModelCustomizationJobRequest
     * @return Result of the StopModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.StopModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopModelCustomizationJobResult stopModelCustomizationJob(StopModelCustomizationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopModelCustomizationJob(request);
    }

    @SdkInternalApi
    final StopModelCustomizationJobResult executeStopModelCustomizationJob(StopModelCustomizationJobRequest stopModelCustomizationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopModelCustomizationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopModelCustomizationJobRequest> request = null;
        Response<StopModelCustomizationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopModelCustomizationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopModelCustomizationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopModelCustomizationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopModelCustomizationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopModelCustomizationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
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
     * Remove one or more tags from a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
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
     * Updates a guardrail with the values you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a <code>name</code> and optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify messages for when the guardrail successfully blocks a prompt or a model response in the
     * <code>blockedInputMessaging</code> and <code>blockedOutputsMessaging</code> fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify topics for the guardrail to deny in the <code>topicPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailTopicConfig.html"
     * >GuardrailTopicConfig</a> object in the <code>topicsConfig</code> list pertains to one topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Give a <code>name</code> and <code>description</code> so that the guardrail can properly identify the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>DENY</code> in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Provide up to five prompts that you would categorize as belonging to the topic in the
     * <code>examples</code> list.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Specify filter strengths for the harmful categories defined in Amazon Bedrock in the
     * <code>contentPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a> object in the <code>filtersConfig</code> list pertains to a harmful category.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters">Content filters</a>. For more
     * information about the fields in a content filter, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the category in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the strength of the filter for prompts in the <code>inputStrength</code> field and for model responses in
     * the <code>strength</code> field of the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * (Optional) For security, include the ARN of a KMS key in the <code>kmsKeyId</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Attach any tags to the guardrail in the <code>tags</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging">Tag resources</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGuardrailRequest
     * @return Result of the UpdateGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UpdateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGuardrailResult updateGuardrail(UpdateGuardrailRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGuardrail(request);
    }

    @SdkInternalApi
    final UpdateGuardrailResult executeUpdateGuardrail(UpdateGuardrailRequest updateGuardrailRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGuardrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGuardrailRequest> request = null;
        Response<UpdateGuardrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGuardrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGuardrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGuardrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGuardrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGuardrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name or associated model for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateProvisionedModelThroughputRequest
     * @return Result of the UpdateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UpdateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProvisionedModelThroughputResult updateProvisionedModelThroughput(UpdateProvisionedModelThroughputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProvisionedModelThroughput(request);
    }

    @SdkInternalApi
    final UpdateProvisionedModelThroughputResult executeUpdateProvisionedModelThroughput(
            UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProvisionedModelThroughputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisionedModelThroughputRequest> request = null;
        Response<UpdateProvisionedModelThroughputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisionedModelThroughputRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateProvisionedModelThroughputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProvisionedModelThroughput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProvisionedModelThroughputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateProvisionedModelThroughputResultJsonUnmarshaller());
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
