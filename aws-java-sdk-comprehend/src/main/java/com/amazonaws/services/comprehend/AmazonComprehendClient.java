/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilterException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.InvalidFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.BatchSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("JobNotFoundException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.JobNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.InvalidRequestException.class))
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
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.comprehend.model.TooManyRequestsException.class))
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
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
     * Inspects the text of a batch of documents and returns information about them. For more information about
     * entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return Result of the BatchDetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
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
     * Inspects text for entities, and returns information about them. For more information, about entities, see
     * <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
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
     *         The filter specified for the <code>ListTopicDetectionJobs</code> operation is invalid. Specify a
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
