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
package com.amazonaws.services.comprehend;

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

import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.services.comprehend.model.transform.*;

/**
 * Client for accessing Amazon Comprehend. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonComprehendClient extends AmazonWebServiceClient implements AmazonComprehend {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonComprehend.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "comprehend";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsKeyValidationException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.KmsKeyValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilterException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.InvalidFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagKeysException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.TooManyTagKeysException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.BatchSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.TextSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedLanguageException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.UnsupportedLanguageException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.ResourceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("JobNotFoundException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.JobNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.ResourceLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.comprehend.model.AmazonComprehendException.class));

    public static AmazonComprehendClientBuilder builder() {
        return AmazonComprehendClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Comprehend using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonComprehendClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Comprehend using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonComprehendClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("comprehend.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/comprehend/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/comprehend/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return Result of the BatchDetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDetectDominantLanguageResult batchDetectDominantLanguage(BatchDetectDominantLanguageRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDetectDominantLanguage(request);
    }

    @SdkInternalApi
    final BatchDetectDominantLanguageResult executeBatchDetectDominantLanguage(BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDetectDominantLanguageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectDominantLanguageRequest> request = null;
        Response<BatchDetectDominantLanguageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectDominantLanguageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDetectDominantLanguageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDetectDominantLanguage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDetectDominantLanguageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDetectDominantLanguageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns information about them. For more
     * information about named entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return Result of the BatchDetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDetectEntitiesResult batchDetectEntities(BatchDetectEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDetectEntities(request);
    }

    @SdkInternalApi
    final BatchDetectEntitiesResult executeBatchDetectEntities(BatchDetectEntitiesRequest batchDetectEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDetectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectEntitiesRequest> request = null;
        Response<BatchDetectEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDetectEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDetectEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDetectEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDetectEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return Result of the BatchDetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDetectKeyPhrasesResult batchDetectKeyPhrases(BatchDetectKeyPhrasesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDetectKeyPhrases(request);
    }

    @SdkInternalApi
    final BatchDetectKeyPhrasesResult executeBatchDetectKeyPhrases(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDetectKeyPhrasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectKeyPhrasesRequest> request = null;
        Response<BatchDetectKeyPhrasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectKeyPhrasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDetectKeyPhrasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDetectKeyPhrases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDetectKeyPhrasesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDetectKeyPhrasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return Result of the BatchDetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDetectSentimentResult batchDetectSentiment(BatchDetectSentimentRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDetectSentiment(request);
    }

    @SdkInternalApi
    final BatchDetectSentimentResult executeBatchDetectSentiment(BatchDetectSentimentRequest batchDetectSentimentRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDetectSentimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectSentimentRequest> request = null;
        Response<BatchDetectSentimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectSentimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDetectSentimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDetectSentiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDetectSentimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDetectSentimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
     * returns information about them. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return Result of the BatchDetectSyntax operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSyntax" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDetectSyntaxResult batchDetectSyntax(BatchDetectSyntaxRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDetectSyntax(request);
    }

    @SdkInternalApi
    final BatchDetectSyntaxResult executeBatchDetectSyntax(BatchDetectSyntaxRequest batchDetectSyntaxRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDetectSyntaxRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectSyntaxRequest> request = null;
        Response<BatchDetectSyntaxResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectSyntaxRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDetectSyntaxRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDetectSyntax");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDetectSyntaxResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDetectSyntaxResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a
     * set of training documents that labeled with the categories that you want to use. After the classifier is trained
     * you can use it to categorize a set of labeled documents into the categories. For more information, see
     * <a>how-document-classification</a>.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return Result of the CreateDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceLimitExceededException
     *         The maximum number of recognizers per account has been exceeded. Review the recognizers, perform cleanup,
     *         and then try your request again.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.CreateDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDocumentClassifierResult createDocumentClassifier(CreateDocumentClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDocumentClassifier(request);
    }

    @SdkInternalApi
    final CreateDocumentClassifierResult executeCreateDocumentClassifier(CreateDocumentClassifierRequest createDocumentClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(createDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentClassifierRequest> request = null;
        Response<CreateDocumentClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentClassifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDocumentClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDocumentClassifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDocumentClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDocumentClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your <code>CreateEntityRecognizer</code> request is
     * submitted, you can check job status using the API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return Result of the CreateEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceLimitExceededException
     *         The maximum number of recognizers per account has been exceeded. Review the recognizers, perform cleanup,
     *         and then try your request again.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.CreateEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEntityRecognizerResult createEntityRecognizer(CreateEntityRecognizerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEntityRecognizer(request);
    }

    @SdkInternalApi
    final CreateEntityRecognizerResult executeCreateEntityRecognizer(CreateEntityRecognizerRequest createEntityRecognizerRequest) {

        ExecutionContext executionContext = createExecutionContext(createEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEntityRecognizerRequest> request = null;
        Response<CreateEntityRecognizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEntityRecognizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEntityRecognizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEntityRecognizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEntityRecognizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEntityRecognizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
     * job is using the model, a <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a
     * background job. Once removed, the classifier disappears from your account and is no longer available for use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return Result of the DeleteDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DeleteDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDocumentClassifierResult deleteDocumentClassifier(DeleteDocumentClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDocumentClassifier(request);
    }

    @SdkInternalApi
    final DeleteDocumentClassifierResult executeDeleteDocumentClassifier(DeleteDocumentClassifierRequest deleteDocumentClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentClassifierRequest> request = null;
        Response<DeleteDocumentClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentClassifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDocumentClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDocumentClassifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDocumentClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
     * job is using the model, a <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a
     * background job. Once removed, the recognizer disappears from your account and is no longer available for use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return Result of the DeleteEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DeleteEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEntityRecognizerResult deleteEntityRecognizer(DeleteEntityRecognizerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEntityRecognizer(request);
    }

    @SdkInternalApi
    final DeleteEntityRecognizerResult executeDeleteEntityRecognizer(DeleteEntityRecognizerRequest deleteEntityRecognizerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEntityRecognizerRequest> request = null;
        Response<DeleteEntityRecognizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEntityRecognizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEntityRecognizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEntityRecognizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEntityRecognizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEntityRecognizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use this operation to get the status of a
     * classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return Result of the DescribeDocumentClassificationJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDocumentClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDocumentClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDocumentClassificationJobResult describeDocumentClassificationJob(DescribeDocumentClassificationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDocumentClassificationJob(request);
    }

    @SdkInternalApi
    final DescribeDocumentClassificationJobResult executeDescribeDocumentClassificationJob(
            DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDocumentClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentClassificationJobRequest> request = null;
        Response<DescribeDocumentClassificationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentClassificationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDocumentClassificationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDocumentClassificationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentClassificationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDocumentClassificationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return Result of the DescribeDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDocumentClassifierResult describeDocumentClassifier(DescribeDocumentClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDocumentClassifier(request);
    }

    @SdkInternalApi
    final DescribeDocumentClassifierResult executeDescribeDocumentClassifier(DescribeDocumentClassifierRequest describeDocumentClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentClassifierRequest> request = null;
        Response<DescribeDocumentClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentClassifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDocumentClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDocumentClassifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDocumentClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return Result of the DescribeDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDominantLanguageDetectionJobResult describeDominantLanguageDetectionJob(DescribeDominantLanguageDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDominantLanguageDetectionJob(request);
    }

    @SdkInternalApi
    final DescribeDominantLanguageDetectionJobResult executeDescribeDominantLanguageDetectionJob(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDominantLanguageDetectionJobRequest> request = null;
        Response<DescribeDominantLanguageDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDominantLanguageDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDominantLanguageDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDominantLanguageDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDominantLanguageDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDominantLanguageDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return Result of the DescribeEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEntitiesDetectionJobResult describeEntitiesDetectionJob(DescribeEntitiesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEntitiesDetectionJob(request);
    }

    @SdkInternalApi
    final DescribeEntitiesDetectionJobResult executeDescribeEntitiesDetectionJob(DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntitiesDetectionJobRequest> request = null;
        Response<DescribeEntitiesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntitiesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEntitiesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEntitiesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEntitiesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEntitiesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer
     * metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return Result of the DescribeEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEntityRecognizerResult describeEntityRecognizer(DescribeEntityRecognizerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEntityRecognizer(request);
    }

    @SdkInternalApi
    final DescribeEntityRecognizerResult executeDescribeEntityRecognizer(DescribeEntityRecognizerRequest describeEntityRecognizerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntityRecognizerRequest> request = null;
        Response<DescribeEntityRecognizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntityRecognizerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEntityRecognizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEntityRecognizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEntityRecognizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEntityRecognizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return Result of the DescribeKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeKeyPhrasesDetectionJobResult describeKeyPhrasesDetectionJob(DescribeKeyPhrasesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeKeyPhrasesDetectionJob(request);
    }

    @SdkInternalApi
    final DescribeKeyPhrasesDetectionJobResult executeDescribeKeyPhrasesDetectionJob(DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyPhrasesDetectionJobRequest> request = null;
        Response<DescribeKeyPhrasesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyPhrasesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeKeyPhrasesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeKeyPhrasesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeKeyPhrasesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeKeyPhrasesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return Result of the DescribeSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSentimentDetectionJobResult describeSentimentDetectionJob(DescribeSentimentDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSentimentDetectionJob(request);
    }

    @SdkInternalApi
    final DescribeSentimentDetectionJobResult executeDescribeSentimentDetectionJob(DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSentimentDetectionJobRequest> request = null;
        Response<DescribeSentimentDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSentimentDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSentimentDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSentimentDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSentimentDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSentimentDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return Result of the DescribeTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTopicsDetectionJob(request);
    }

    @SdkInternalApi
    final DescribeTopicsDetectionJobResult executeDescribeTopicsDetectionJob(DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTopicsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTopicsDetectionJobRequest> request = null;
        Response<DescribeTopicsDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTopicsDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTopicsDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTopicsDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTopicsDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTopicsDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return Result of the DetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetectDominantLanguageResult detectDominantLanguage(DetectDominantLanguageRequest request) {
        request = beforeClientExecution(request);
        return executeDetectDominantLanguage(request);
    }

    @SdkInternalApi
    final DetectDominantLanguageResult executeDetectDominantLanguage(DetectDominantLanguageRequest detectDominantLanguageRequest) {

        ExecutionContext executionContext = createExecutionContext(detectDominantLanguageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectDominantLanguageRequest> request = null;
        Response<DetectDominantLanguageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectDominantLanguageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectDominantLanguageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectDominantLanguage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectDominantLanguageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetectDominantLanguageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For more information, about named entities,
     * see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
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
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return Result of the DetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetectKeyPhrasesResult detectKeyPhrases(DetectKeyPhrasesRequest request) {
        request = beforeClientExecution(request);
        return executeDetectKeyPhrases(request);
    }

    @SdkInternalApi
    final DetectKeyPhrasesResult executeDetectKeyPhrases(DetectKeyPhrasesRequest detectKeyPhrasesRequest) {

        ExecutionContext executionContext = createExecutionContext(detectKeyPhrasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectKeyPhrasesRequest> request = null;
        Response<DetectKeyPhrasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectKeyPhrasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectKeyPhrasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectKeyPhrases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectKeyPhrasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectKeyPhrasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return Result of the DetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetectSentimentResult detectSentiment(DetectSentimentRequest request) {
        request = beforeClientExecution(request);
        return executeDetectSentiment(request);
    }

    @SdkInternalApi
    final DetectSentimentResult executeDetectSentiment(DetectSentimentRequest detectSentimentRequest) {

        ExecutionContext executionContext = createExecutionContext(detectSentimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectSentimentRequest> request = null;
        Response<DetectSentimentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectSentimentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectSentimentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectSentiment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectSentimentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectSentimentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document. For more information,
     * <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return Result of the DetectSyntax operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSyntax" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetectSyntaxResult detectSyntax(DetectSyntaxRequest request) {
        request = beforeClientExecution(request);
        return executeDetectSyntax(request);
    }

    @SdkInternalApi
    final DetectSyntaxResult executeDetectSyntax(DetectSyntaxRequest detectSyntaxRequest) {

        ExecutionContext executionContext = createExecutionContext(detectSyntaxRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectSyntaxRequest> request = null;
        Response<DetectSyntaxResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectSyntaxRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectSyntaxRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectSyntax");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectSyntaxResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectSyntaxResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return Result of the ListDocumentClassificationJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDocumentClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDocumentClassificationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDocumentClassificationJobsResult listDocumentClassificationJobs(ListDocumentClassificationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDocumentClassificationJobs(request);
    }

    @SdkInternalApi
    final ListDocumentClassificationJobsResult executeListDocumentClassificationJobs(ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDocumentClassificationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentClassificationJobsRequest> request = null;
        Response<ListDocumentClassificationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentClassificationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDocumentClassificationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDocumentClassificationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentClassificationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDocumentClassificationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return Result of the ListDocumentClassifiers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDocumentClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDocumentClassifiers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDocumentClassifiersResult listDocumentClassifiers(ListDocumentClassifiersRequest request) {
        request = beforeClientExecution(request);
        return executeListDocumentClassifiers(request);
    }

    @SdkInternalApi
    final ListDocumentClassifiersResult executeListDocumentClassifiers(ListDocumentClassifiersRequest listDocumentClassifiersRequest) {

        ExecutionContext executionContext = createExecutionContext(listDocumentClassifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentClassifiersRequest> request = null;
        Response<ListDocumentClassifiersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentClassifiersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDocumentClassifiersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDocumentClassifiers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentClassifiersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDocumentClassifiersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return Result of the ListDominantLanguageDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDominantLanguageDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDominantLanguageDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDominantLanguageDetectionJobs(request);
    }

    @SdkInternalApi
    final ListDominantLanguageDetectionJobsResult executeListDominantLanguageDetectionJobs(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDominantLanguageDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDominantLanguageDetectionJobsRequest> request = null;
        Response<ListDominantLanguageDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDominantLanguageDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDominantLanguageDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDominantLanguageDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDominantLanguageDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDominantLanguageDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return Result of the ListEntitiesDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListEntitiesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntitiesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEntitiesDetectionJobsResult listEntitiesDetectionJobs(ListEntitiesDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListEntitiesDetectionJobs(request);
    }

    @SdkInternalApi
    final ListEntitiesDetectionJobsResult executeListEntitiesDetectionJobs(ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntitiesDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesDetectionJobsRequest> request = null;
        Response<ListEntitiesDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEntitiesDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntitiesDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntitiesDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEntitiesDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in
     * training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This
     * call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return Result of the ListEntityRecognizers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListEntityRecognizers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntityRecognizers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEntityRecognizersResult listEntityRecognizers(ListEntityRecognizersRequest request) {
        request = beforeClientExecution(request);
        return executeListEntityRecognizers(request);
    }

    @SdkInternalApi
    final ListEntityRecognizersResult executeListEntityRecognizers(ListEntityRecognizersRequest listEntityRecognizersRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntityRecognizersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntityRecognizersRequest> request = null;
        Response<ListEntityRecognizersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntityRecognizersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEntityRecognizersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntityRecognizers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntityRecognizersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListEntityRecognizersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return Result of the ListKeyPhrasesDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListKeyPhrasesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListKeyPhrasesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListKeyPhrasesDetectionJobsResult listKeyPhrasesDetectionJobs(ListKeyPhrasesDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListKeyPhrasesDetectionJobs(request);
    }

    @SdkInternalApi
    final ListKeyPhrasesDetectionJobsResult executeListKeyPhrasesDetectionJobs(ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeyPhrasesDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPhrasesDetectionJobsRequest> request = null;
        Response<ListKeyPhrasesDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPhrasesDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listKeyPhrasesDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeyPhrasesDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeyPhrasesDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListKeyPhrasesDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return Result of the ListSentimentDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListSentimentDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListSentimentDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSentimentDetectionJobsResult listSentimentDetectionJobs(ListSentimentDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListSentimentDetectionJobs(request);
    }

    @SdkInternalApi
    final ListSentimentDetectionJobsResult executeListSentimentDetectionJobs(ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSentimentDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSentimentDetectionJobsRequest> request = null;
        Response<ListSentimentDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSentimentDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSentimentDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSentimentDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSentimentDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSentimentDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a given Amazon Comprehend resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
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
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return Result of the ListTopicsDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTopicsDetectionJobsResult listTopicsDetectionJobs(ListTopicsDetectionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListTopicsDetectionJobs(request);
    }

    @SdkInternalApi
    final ListTopicsDetectionJobsResult executeListTopicsDetectionJobs(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTopicsDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicsDetectionJobsRequest> request = null;
        Response<ListTopicsDetectionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicsDetectionJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTopicsDetectionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTopicsDetectionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTopicsDetectionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTopicsDetectionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return Result of the StartDocumentClassificationJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartDocumentClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDocumentClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDocumentClassificationJobResult startDocumentClassificationJob(StartDocumentClassificationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartDocumentClassificationJob(request);
    }

    @SdkInternalApi
    final StartDocumentClassificationJobResult executeStartDocumentClassificationJob(StartDocumentClassificationJobRequest startDocumentClassificationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startDocumentClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDocumentClassificationJobRequest> request = null;
        Response<StartDocumentClassificationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDocumentClassificationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDocumentClassificationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDocumentClassificationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDocumentClassificationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDocumentClassificationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
     * the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return Result of the StartDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDominantLanguageDetectionJobResult startDominantLanguageDetectionJob(StartDominantLanguageDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartDominantLanguageDetectionJob(request);
    }

    @SdkInternalApi
    final StartDominantLanguageDetectionJobResult executeStartDominantLanguageDetectionJob(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDominantLanguageDetectionJobRequest> request = null;
        Response<StartDominantLanguageDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDominantLanguageDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDominantLanguageDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDominantLanguageDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDominantLanguageDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDominantLanguageDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
     * of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom entity recognition. In order to be used for
     * custom entity recognition, the optional <code>EntityRecognizerArn</code> must be used in order to provide access
     * to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return Result of the StartEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartEntitiesDetectionJobResult startEntitiesDetectionJob(StartEntitiesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartEntitiesDetectionJob(request);
    }

    @SdkInternalApi
    final StartEntitiesDetectionJobResult executeStartEntitiesDetectionJob(StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEntitiesDetectionJobRequest> request = null;
        Response<StartEntitiesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEntitiesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startEntitiesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartEntitiesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartEntitiesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartEntitiesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return Result of the StartKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartKeyPhrasesDetectionJobResult startKeyPhrasesDetectionJob(StartKeyPhrasesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartKeyPhrasesDetectionJob(request);
    }

    @SdkInternalApi
    final StartKeyPhrasesDetectionJobResult executeStartKeyPhrasesDetectionJob(StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartKeyPhrasesDetectionJobRequest> request = null;
        Response<StartKeyPhrasesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartKeyPhrasesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startKeyPhrasesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartKeyPhrasesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartKeyPhrasesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartKeyPhrasesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return Result of the StartSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSentimentDetectionJobResult startSentimentDetectionJob(StartSentimentDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartSentimentDetectionJob(request);
    }

    @SdkInternalApi
    final StartSentimentDetectionJobResult executeStartSentimentDetectionJob(StartSentimentDetectionJobRequest startSentimentDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSentimentDetectionJobRequest> request = null;
        Response<StartSentimentDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSentimentDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSentimentDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSentimentDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSentimentDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSentimentDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return Result of the StartTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartTopicsDetectionJobResult startTopicsDetectionJob(StartTopicsDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartTopicsDetectionJob(request);
    }

    @SdkInternalApi
    final StartTopicsDetectionJobResult executeStartTopicsDetectionJob(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startTopicsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTopicsDetectionJobRequest> request = null;
        Response<StartTopicsDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTopicsDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startTopicsDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTopicsDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTopicsDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartTopicsDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return Result of the StopDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopDominantLanguageDetectionJob(request);
    }

    @SdkInternalApi
    final StopDominantLanguageDetectionJobResult executeStopDominantLanguageDetectionJob(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDominantLanguageDetectionJobRequest> request = null;
        Response<StopDominantLanguageDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDominantLanguageDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopDominantLanguageDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDominantLanguageDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDominantLanguageDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopDominantLanguageDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return Result of the StopEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopEntitiesDetectionJobResult stopEntitiesDetectionJob(StopEntitiesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopEntitiesDetectionJob(request);
    }

    @SdkInternalApi
    final StopEntitiesDetectionJobResult executeStopEntitiesDetectionJob(StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEntitiesDetectionJobRequest> request = null;
        Response<StopEntitiesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEntitiesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopEntitiesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopEntitiesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopEntitiesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopEntitiesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return Result of the StopKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopKeyPhrasesDetectionJob(request);
    }

    @SdkInternalApi
    final StopKeyPhrasesDetectionJobResult executeStopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopKeyPhrasesDetectionJobRequest> request = null;
        Response<StopKeyPhrasesDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopKeyPhrasesDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopKeyPhrasesDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopKeyPhrasesDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopKeyPhrasesDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopKeyPhrasesDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return Result of the StopSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopSentimentDetectionJob(request);
    }

    @SdkInternalApi
    final StopSentimentDetectionJobResult executeStopSentimentDetectionJob(StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopSentimentDetectionJobRequest> request = null;
        Response<StopSentimentDetectionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopSentimentDetectionJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopSentimentDetectionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopSentimentDetectionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopSentimentDetectionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopSentimentDetectionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a document classifier training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and put into the <code>STOPPED</code> state and the
     * service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingDocumentClassifierRequest
     * @return Result of the StopTrainingDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopTrainingDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopTrainingDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopTrainingDocumentClassifierResult stopTrainingDocumentClassifier(StopTrainingDocumentClassifierRequest request) {
        request = beforeClientExecution(request);
        return executeStopTrainingDocumentClassifier(request);
    }

    @SdkInternalApi
    final StopTrainingDocumentClassifierResult executeStopTrainingDocumentClassifier(StopTrainingDocumentClassifierRequest stopTrainingDocumentClassifierRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTrainingDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingDocumentClassifierRequest> request = null;
        Response<StopTrainingDocumentClassifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingDocumentClassifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopTrainingDocumentClassifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopTrainingDocumentClassifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTrainingDocumentClassifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopTrainingDocumentClassifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an entity recognizer training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and putted into the <code>STOPPED</code> state and
     * the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingEntityRecognizerRequest
     * @return Result of the StopTrainingEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopTrainingEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopTrainingEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopTrainingEntityRecognizerResult stopTrainingEntityRecognizer(StopTrainingEntityRecognizerRequest request) {
        request = beforeClientExecution(request);
        return executeStopTrainingEntityRecognizer(request);
    }

    @SdkInternalApi
    final StopTrainingEntityRecognizerResult executeStopTrainingEntityRecognizer(StopTrainingEntityRecognizerRequest stopTrainingEntityRecognizerRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTrainingEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingEntityRecognizerRequest> request = null;
        Response<StopTrainingEntityRecognizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingEntityRecognizerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopTrainingEntityRecognizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopTrainingEntityRecognizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTrainingEntityRecognizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopTrainingEntityRecognizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata
     * to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource
     * to indicate its use by the sales department.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ConcurrentModificationException
     *         Concurrent modification of the tags associated with an Amazon Comprehend resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
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
     * Removes a specific tag associated with an Amazon Comprehend resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws TooManyTagKeysException
     *         The request contains more tag keys than can be associated with a resource (50 tag keys per resource).
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ConcurrentModificationException
     *         Concurrent modification of the tags associated with an Amazon Comprehend resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Comprehend");
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
