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
package com.amazonaws.services.transcribe;

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

import com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.services.transcribe.model.transform.*;

/**
 * Client for accessing Amazon Transcribe Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Transcribe offers three main types of batch transcription: <b>Standard</b>, <b>Medical</b>, and <b>Call
 * Analytics</b>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Standard transcriptions</b> are the most common option. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Medical transcriptions</b> are tailored to medical professionals and incorporate medical terms. A common use case
 * for this service is transcribing doctor-patient dialogue into after-visit notes. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Call Analytics transcriptions</b> are designed for use with call center audio on two different channels; if you're
 * looking for insight into customer service calls, use this option. Refer to for details.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeClient extends AmazonWebServiceClient implements AmazonTranscribe {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTranscribe.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "transcribe";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transcribe.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.transcribe.model.AmazonTranscribeException.class));

    public static AmazonTranscribeClientBuilder builder() {
        return AmazonTranscribeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Transcribe Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranscribeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Transcribe Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranscribeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("transcribe.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/transcribe/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/transcribe/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Call Analytics category.
     * </p>
     * <p>
     * All categories are automatically applied to your Call Analytics transcriptions. Note that in order to apply
     * categories to your transcriptions, you must create them before submitting your transcription request, as
     * categories cannot be applied retroactively.
     * </p>
     * <p>
     * When creating a new category, you can use the <code>InputType</code> parameter to label the category as a batch
     * category (<code>POST_CALL</code>) or a streaming category (<code>REAL_TIME</code>). Batch categories can only be
     * applied to batch transcriptions and streaming categories can only be applied to streaming transcriptions. If you
     * do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * <p>
     * Call Analytics categories are composed of rules. For each category, you must create between 1 and 20 rules. Rules
     * can include these parameters: , , , and .
     * </p>
     * <p>
     * To update an existing category, see .
     * </p>
     * <p>
     * To learn more about Call Analytics categories, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html">Creating categories for batch
     * transcriptions</a> and <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html">Creating categories for
     * streaming transcriptions</a>.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @return Result of the CreateCallAnalyticsCategory operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCallAnalyticsCategoryResult createCallAnalyticsCategory(CreateCallAnalyticsCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCallAnalyticsCategory(request);
    }

    @SdkInternalApi
    final CreateCallAnalyticsCategoryResult executeCreateCallAnalyticsCategory(CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCallAnalyticsCategoryRequest> request = null;
        Response<CreateCallAnalyticsCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCallAnalyticsCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCallAnalyticsCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCallAnalyticsCategory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCallAnalyticsCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCallAnalyticsCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom language model.
     * </p>
     * <p>
     * When creating a new custom language model, you must specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband (audio sample rates under 16,000 Hz)
     * base model
     * </p>
     * </li>
     * <li>
     * <p>
     * The location of your training and tuning files (this must be an Amazon S3 URI)
     * </p>
     * </li>
     * <li>
     * <p>
     * The language of your model
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique name for your model
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLanguageModelRequest
     * @return Result of the CreateLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLanguageModelResult createLanguageModel(CreateLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLanguageModel(request);
    }

    @SdkInternalApi
    final CreateLanguageModelResult executeCreateLanguageModel(CreateLanguageModelRequest createLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLanguageModelRequest> request = null;
        Response<CreateLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLanguageModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * Before creating a new custom medical vocabulary, you must first upload a text file that contains your new
     * entries, phrases, and terms into an Amazon S3 bucket. Note that this differs from , where you can include a list
     * of terms within your request using the <code>Phrases</code> flag; <code>CreateMedicalVocabulary</code> does not
     * support the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a>.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return Result of the CreateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMedicalVocabularyResult createMedicalVocabulary(CreateMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMedicalVocabulary(request);
    }

    @SdkInternalApi
    final CreateMedicalVocabularyResult executeCreateMedicalVocabulary(CreateMedicalVocabularyRequest createMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(createMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMedicalVocabularyRequest> request = null;
        Response<CreateMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new custom vocabulary, you can either upload a text file that contains your new entries, phrases,
     * and terms into an Amazon S3 bucket and include the URI in your request. Or you can include a list of terms
     * directly in your request using the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a>.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVocabularyResult createVocabulary(CreateVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVocabulary(request);
    }

    @SdkInternalApi
    final CreateVocabularyResult executeCreateVocabulary(CreateVocabularyRequest createVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(createVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyRequest> request = null;
        Response<CreateVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom vocabulary filter.
     * </p>
     * <p>
     * You can use custom vocabulary filters to mask, delete, or flag specific words from your transcript. Custom
     * vocabulary filters are commonly used to mask profanity in transcripts.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Vocabulary filtering</a>.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return Result of the CreateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVocabularyFilterResult createVocabularyFilter(CreateVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVocabularyFilter(request);
    }

    @SdkInternalApi
    final CreateVocabularyFilterResult executeCreateVocabularyFilter(CreateVocabularyFilterRequest createVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(createVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyFilterRequest> request = null;
        Response<CreateVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete
     * using <code>CategoryName</code>. Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return Result of the DeleteCallAnalyticsCategory operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCallAnalyticsCategoryResult deleteCallAnalyticsCategory(DeleteCallAnalyticsCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCallAnalyticsCategory(request);
    }

    @SdkInternalApi
    final DeleteCallAnalyticsCategoryResult executeDeleteCallAnalyticsCategory(DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCallAnalyticsCategoryRequest> request = null;
        Response<DeleteCallAnalyticsCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCallAnalyticsCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCallAnalyticsCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCallAnalyticsCategory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCallAnalyticsCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCallAnalyticsCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using
     * <code>CallAnalyticsJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return Result of the DeleteCallAnalyticsJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCallAnalyticsJobResult deleteCallAnalyticsJob(DeleteCallAnalyticsJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCallAnalyticsJob(request);
    }

    @SdkInternalApi
    final DeleteCallAnalyticsJobResult executeDeleteCallAnalyticsJob(DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCallAnalyticsJobRequest> request = null;
        Response<DeleteCallAnalyticsJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCallAnalyticsJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCallAnalyticsJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCallAnalyticsJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCallAnalyticsJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCallAnalyticsJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete
     * using <code>ModelName</code>. custom language model names are case sensitive.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return Result of the DeleteLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLanguageModelResult deleteLanguageModel(DeleteLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLanguageModel(request);
    }

    @SdkInternalApi
    final DeleteLanguageModelResult executeDeleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLanguageModelRequest> request = null;
        Response<DeleteLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLanguageModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return Result of the DeleteMedicalTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMedicalTranscriptionJobResult deleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final DeleteMedicalTranscriptionJobResult executeDeleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalTranscriptionJobRequest> request = null;
        Response<DeleteMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to
     * delete using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return Result of the DeleteMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMedicalVocabularyResult deleteMedicalVocabulary(DeleteMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMedicalVocabulary(request);
    }

    @SdkInternalApi
    final DeleteMedicalVocabularyResult executeDeleteMedicalVocabulary(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalVocabularyRequest> request = null;
        Response<DeleteMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return Result of the DeleteTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTranscriptionJobResult deleteTranscriptionJob(DeleteTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTranscriptionJob(request);
    }

    @SdkInternalApi
    final DeleteTranscriptionJobResult executeDeleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTranscriptionJobRequest> request = null;
        Response<DeleteTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete
     * using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVocabulary(request);
    }

    @SdkInternalApi
    final DeleteVocabularyResult executeDeleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyRequest> request = null;
        Response<DeleteVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you
     * want to delete using <code>VocabularyFilterName</code>. Custom vocabulary filter names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return Result of the DeleteVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVocabularyFilterResult deleteVocabularyFilter(DeleteVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVocabularyFilter(request);
    }

    @SdkInternalApi
    final DeleteVocabularyFilterResult executeDeleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyFilterRequest> request = null;
        Response<DeleteVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This operation also shows if the base language model that you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return Result of the DescribeLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLanguageModelResult describeLanguageModel(DescribeLanguageModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLanguageModel(request);
    }

    @SdkInternalApi
    final DescribeLanguageModelResult executeDescribeLanguageModel(DescribeLanguageModelRequest describeLanguageModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLanguageModelRequest> request = null;
        Response<DescribeLanguageModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLanguageModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLanguageModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLanguageModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLanguageModelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeLanguageModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return Result of the GetCallAnalyticsCategory operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCallAnalyticsCategoryResult getCallAnalyticsCategory(GetCallAnalyticsCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetCallAnalyticsCategory(request);
    }

    @SdkInternalApi
    final GetCallAnalyticsCategoryResult executeGetCallAnalyticsCategory(GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCallAnalyticsCategoryRequest> request = null;
        Response<GetCallAnalyticsCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCallAnalyticsCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCallAnalyticsCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCallAnalyticsCategory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCallAnalyticsCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCallAnalyticsCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified Call Analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>. If the status is <code>COMPLETED</code>,
     * the job is finished. You can find your completed transcript at the URI specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     * on why your transcription job failed.
     * </p>
     * <p>
     * If you enabled personally identifiable information (PII) redaction, the redacted transcript appears at the
     * location specified in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * If you chose to redact the audio in your media file, you can find your redacted media file at the location
     * specified in <code>RedactedMediaFileUri</code>.
     * </p>
     * <p>
     * To get a list of your Call Analytics jobs, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @return Result of the GetCallAnalyticsJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCallAnalyticsJobResult getCallAnalyticsJob(GetCallAnalyticsJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetCallAnalyticsJob(request);
    }

    @SdkInternalApi
    final GetCallAnalyticsJobResult executeGetCallAnalyticsJob(GetCallAnalyticsJobRequest getCallAnalyticsJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCallAnalyticsJobRequest> request = null;
        Response<GetCallAnalyticsJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCallAnalyticsJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCallAnalyticsJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCallAnalyticsJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCallAnalyticsJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCallAnalyticsJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified medical transcription job.
     * </p>
     * <p>
     * To view the status of the specified medical transcription job, check the <code>TranscriptionJobStatus</code>
     * field. If the status is <code>COMPLETED</code>, the job is finished. You can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * <p>
     * To get a list of your medical transcription jobs, use the operation.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return Result of the GetMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final GetMedicalTranscriptionJobResult executeGetMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalTranscriptionJobRequest> request = null;
        Response<GetMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified custom medical vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom medical vocabulary, check the <code>VocabularyState</code> field. If
     * the status is <code>READY</code>, your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why your vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom medical vocabularies, use the operation.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return Result of the GetMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMedicalVocabularyResult getMedicalVocabulary(GetMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeGetMedicalVocabulary(request);
    }

    @SdkInternalApi
    final GetMedicalVocabularyResult executeGetMedicalVocabulary(GetMedicalVocabularyRequest getMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(getMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalVocabularyRequest> request = null;
        Response<GetMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified transcription job.
     * </p>
     * <p>
     * To view the status of the specified transcription job, check the <code>TranscriptionJobStatus</code> field. If
     * the status is <code>COMPLETED</code>, the job is finished. You can find the results at the location specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     * on why your transcription job failed.
     * </p>
     * <p>
     * If you enabled content redaction, the redacted transcript can be found at the location specified in
     * <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * To get a list of your transcription jobs, use the operation.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTranscriptionJobResult getTranscriptionJob(GetTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetTranscriptionJob(request);
    }

    @SdkInternalApi
    final GetTranscriptionJobResult executeGetTranscriptionJob(GetTranscriptionJobRequest getTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTranscriptionJobRequest> request = null;
        Response<GetTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified custom vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom vocabulary, check the <code>VocabularyState</code> field. If the
     * status is <code>READY</code>, your custom vocabulary is available to use. If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your custom vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom vocabularies, use the operation.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return Result of the GetVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVocabularyResult getVocabulary(GetVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeGetVocabulary(request);
    }

    @SdkInternalApi
    final GetVocabularyResult executeGetVocabulary(GetVocabularyRequest getVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(getVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyRequest> request = null;
        Response<GetVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return Result of the GetVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetVocabularyFilterResult getVocabularyFilter(GetVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeGetVocabularyFilter(request);
    }

    @SdkInternalApi
    final GetVocabularyFilterResult executeGetVocabularyFilter(GetVocabularyFilterRequest getVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(getVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyFilterRequest> request = null;
        Response<GetVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVocabularyFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of Call Analytics categories, including all rules that make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return Result of the ListCallAnalyticsCategories operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListCallAnalyticsCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsCategories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCallAnalyticsCategoriesResult listCallAnalyticsCategories(ListCallAnalyticsCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListCallAnalyticsCategories(request);
    }

    @SdkInternalApi
    final ListCallAnalyticsCategoriesResult executeListCallAnalyticsCategories(ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCallAnalyticsCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCallAnalyticsCategoriesRequest> request = null;
        Response<ListCallAnalyticsCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCallAnalyticsCategoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCallAnalyticsCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCallAnalyticsCategories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCallAnalyticsCategoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCallAnalyticsCategoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of Call Analytics jobs that match the specified criteria. If no criteria are specified, all Call
     * Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return Result of the ListCallAnalyticsJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListCallAnalyticsJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCallAnalyticsJobsResult listCallAnalyticsJobs(ListCallAnalyticsJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListCallAnalyticsJobs(request);
    }

    @SdkInternalApi
    final ListCallAnalyticsJobsResult executeListCallAnalyticsJobs(ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCallAnalyticsJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCallAnalyticsJobsRequest> request = null;
        Response<ListCallAnalyticsJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCallAnalyticsJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCallAnalyticsJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCallAnalyticsJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCallAnalyticsJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListCallAnalyticsJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of custom language models that match the specified criteria. If no criteria are specified, all
     * custom language models are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom language model, use the operation.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return Result of the ListLanguageModels operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLanguageModelsResult listLanguageModels(ListLanguageModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListLanguageModels(request);
    }

    @SdkInternalApi
    final ListLanguageModelsResult executeListLanguageModels(ListLanguageModelsRequest listLanguageModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLanguageModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLanguageModelsRequest> request = null;
        Response<ListLanguageModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLanguageModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLanguageModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLanguageModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLanguageModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLanguageModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of medical transcription jobs that match the specified criteria. If no criteria are specified,
     * all medical transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific medical transcription job, use the operation.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return Result of the ListMedicalTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMedicalTranscriptionJobs(request);
    }

    @SdkInternalApi
    final ListMedicalTranscriptionJobsResult executeListMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMedicalTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalTranscriptionJobsRequest> request = null;
        Response<ListMedicalTranscriptionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalTranscriptionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMedicalTranscriptionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMedicalTranscriptionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMedicalTranscriptionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMedicalTranscriptionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of custom medical vocabularies that match the specified criteria. If no criteria are specified,
     * all custom medical vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom medical vocabulary, use the operation.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return Result of the ListMedicalVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMedicalVocabulariesResult listMedicalVocabularies(ListMedicalVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeListMedicalVocabularies(request);
    }

    @SdkInternalApi
    final ListMedicalVocabulariesResult executeListMedicalVocabularies(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMedicalVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalVocabulariesRequest> request = null;
        Response<ListMedicalVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMedicalVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMedicalVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMedicalVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMedicalVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with the specified transcription job, vocabulary, model, or resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
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
     * Provides a list of transcription jobs that match the specified criteria. If no criteria are specified, all
     * transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the operation.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTranscriptionJobsResult listTranscriptionJobs(ListTranscriptionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListTranscriptionJobs(request);
    }

    @SdkInternalApi
    final ListTranscriptionJobsResult executeListTranscriptionJobs(ListTranscriptionJobsRequest listTranscriptionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTranscriptionJobsRequest> request = null;
        Response<ListTranscriptionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTranscriptionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTranscriptionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTranscriptionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTranscriptionJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListTranscriptionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of custom vocabularies that match the specified criteria. If no criteria are specified, all
     * custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the operation.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return Result of the ListVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVocabulariesResult listVocabularies(ListVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeListVocabularies(request);
    }

    @SdkInternalApi
    final ListVocabulariesResult executeListVocabularies(ListVocabulariesRequest listVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabulariesRequest> request = null;
        Response<ListVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of custom vocabulary filters that match the specified criteria. If no criteria are specified, all
     * custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary filter, use the operation.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return Result of the ListVocabularyFilters operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVocabularyFiltersResult listVocabularyFilters(ListVocabularyFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeListVocabularyFilters(request);
    }

    @SdkInternalApi
    final ListVocabularyFiltersResult executeListVocabularyFilters(ListVocabularyFiltersRequest listVocabularyFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(listVocabularyFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabularyFiltersRequest> request = null;
        Response<ListVocabularyFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabularyFiltersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVocabularyFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVocabularyFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVocabularyFiltersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVocabularyFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transcribes the audio from a customer service call and applies any additional Request Parameters you choose to
     * include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Call Analytics provides you with call characteristics, call
     * summarization, speaker sentiment, and optional redaction of your text transcript and your audio file. You can
     * also apply custom categories to flag specified conditions. To learn more about these features and insights, refer
     * to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html">Analyzing call center audio
     * with Call Analytics</a>.
     * </p>
     * <p>
     * If you want to apply categories to your Call Analytics job, you must create them before submitting your job
     * request. Categories cannot be retroactively applied to a job. To create a new category, use the operation. To
     * learn more about Call Analytics categories, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html">Creating categories for batch
     * transcriptions</a> and <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html">Creating categories for
     * streaming transcriptions</a>.
     * </p>
     * <p>
     * To make a <code>StartCallAnalyticsJob</code> request, you must first upload your media file into an Amazon S3
     * bucket; you can then specify the Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartCallAnalyticsJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CallAnalyticsJobName</code>: A custom name that you create for your transcription job that's unique within
     * your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM role that has permissions to access the
     * Amazon S3 bucket that contains your input files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code> or <code>RedactedMediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * With Call Analytics, you can redact the audio contained in your media file by including
     * <code>RedactedMediaFileUri</code>, instead of <code>MediaFileUri</code>, to specify the location of your input
     * audio. If you choose to redact your audio, you can find your redacted media at the location specified in the
     * <code>RedactedMediaFileUri</code> field of your response.
     * </p>
     * </note>
     * 
     * @param startCallAnalyticsJobRequest
     * @return Result of the StartCallAnalyticsJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartCallAnalyticsJobResult startCallAnalyticsJob(StartCallAnalyticsJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartCallAnalyticsJob(request);
    }

    @SdkInternalApi
    final StartCallAnalyticsJobResult executeStartCallAnalyticsJob(StartCallAnalyticsJobRequest startCallAnalyticsJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCallAnalyticsJobRequest> request = null;
        Response<StartCallAnalyticsJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCallAnalyticsJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCallAnalyticsJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCallAnalyticsJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCallAnalyticsJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartCallAnalyticsJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transcribes the audio from a medical dictation or conversation and applies any additional Request Parameters you
     * choose to include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Amazon Transcribe Medical provides you with a robust medical
     * vocabulary and, optionally, content identification, which adds flags to personal health information (PHI). To
     * learn more about these features, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html">How Amazon Transcribe Medical
     * works</a>.
     * </p>
     * <p>
     * To make a <code>StartMedicalTranscriptionJob</code> request, you must first upload your media file into an Amazon
     * S3 bucket; you can then specify the S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartMedicalTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MedicalTranscriptionJobName</code>: A custom name you create for your transcription job that is unique
     * within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LanguageCode</code>: This must be <code>en-US</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your transcript stored. If you want your
     * output stored in a sub-folder of this bucket, you must also include <code>OutputKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: Choose whether your audio is a conversation or a dictation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return Result of the StartMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMedicalTranscriptionJob(request);
    }

    @SdkInternalApi
    final StartMedicalTranscriptionJobResult executeStartMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMedicalTranscriptionJobRequest> request = null;
        Response<StartMedicalTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMedicalTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMedicalTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMedicalTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMedicalTranscriptionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMedicalTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transcribes the audio from a media file and applies any additional Request Parameters you choose to include in
     * your request.
     * </p>
     * <p>
     * To make a <code>StartTranscriptionJob</code> request, you must first upload your media file into an Amazon S3
     * bucket; you can then specify the Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TranscriptionJobName</code>: A custom name you create for your transcription job that is unique within your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * One of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>: If
     * you know the language of your media file, specify it using the <code>LanguageCode</code> parameter; you can find
     * all valid language codes in the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * If you don't know the languages spoken in your media, use either <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> and let Amazon Transcribe identify the languages for you.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartTranscriptionJob(request);
    }

    @SdkInternalApi
    final StartTranscriptionJobResult executeStartTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTranscriptionJobRequest> request = null;
        Response<StartTranscriptionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTranscriptionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTranscriptionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTranscriptionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTranscriptionJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartTranscriptionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to the specified resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
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
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also include <code>ResourceArn</code> and
     * <code>TagKeys</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
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
     * Updates the specified Call Analytics category with new rules. Note that the
     * <code>UpdateCallAnalyticsCategory</code> operation overwrites all existing rules contained in the specified
     * category. You cannot append additional rules onto an existing category.
     * </p>
     * <p>
     * To create a new category, see .
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return Result of the UpdateCallAnalyticsCategory operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCallAnalyticsCategoryResult updateCallAnalyticsCategory(UpdateCallAnalyticsCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCallAnalyticsCategory(request);
    }

    @SdkInternalApi
    final UpdateCallAnalyticsCategoryResult executeUpdateCallAnalyticsCategory(UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCallAnalyticsCategoryRequest> request = null;
        Response<UpdateCallAnalyticsCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCallAnalyticsCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCallAnalyticsCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCallAnalyticsCategory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCallAnalyticsCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCallAnalyticsCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information
     * with your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return Result of the UpdateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMedicalVocabularyResult updateMedicalVocabulary(UpdateMedicalVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMedicalVocabulary(request);
    }

    @SdkInternalApi
    final UpdateMedicalVocabularyResult executeUpdateMedicalVocabulary(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMedicalVocabularyRequest> request = null;
        Response<UpdateMedicalVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMedicalVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMedicalVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMedicalVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMedicalVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMedicalVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with
     * your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return Result of the UpdateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVocabulary(request);
    }

    @SdkInternalApi
    final UpdateVocabularyResult executeUpdateVocabulary(UpdateVocabularyRequest updateVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyRequest> request = null;
        Response<UpdateVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all
     * previous entries; you cannot append new terms onto an existing custom vocabulary filter.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return Result of the UpdateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.UpdateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVocabularyFilterResult updateVocabularyFilter(UpdateVocabularyFilterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVocabularyFilter(request);
    }

    @SdkInternalApi
    final UpdateVocabularyFilterResult executeUpdateVocabularyFilter(UpdateVocabularyFilterRequest updateVocabularyFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyFilterRequest> request = null;
        Response<UpdateVocabularyFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVocabularyFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transcribe");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVocabularyFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVocabularyFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVocabularyFilterResultJsonUnmarshaller());
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
