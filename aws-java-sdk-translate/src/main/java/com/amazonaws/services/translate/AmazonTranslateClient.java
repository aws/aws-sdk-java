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
package com.amazonaws.services.translate;

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

import com.amazonaws.services.translate.AmazonTranslateClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.services.translate.model.transform.*;

/**
 * Client for accessing Amazon Translate. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Provides translation between one source language and another of the same set of languages.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranslateClient extends AmazonWebServiceClient implements AmazonTranslate {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTranslate.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "translate";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.translate.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DetectedLanguageLowConfidenceException").withModeledClass(
                                    com.amazonaws.services.translate.model.DetectedLanguageLowConfidenceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.translate.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.translate.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.translate.model.TextSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.translate.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.translate.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedLanguagePairException").withModeledClass(
                                    com.amazonaws.services.translate.model.UnsupportedLanguagePairException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.translate.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.translate.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.translate.model.AmazonTranslateException.class));

    public static AmazonTranslateClientBuilder builder() {
        return AmazonTranslateClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Translate using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranslateClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Translate using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTranslateClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("translate.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/translate/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/translate/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return Result of the DeleteTerminology operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request. .
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTerminologyResult deleteTerminology(DeleteTerminologyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTerminology(request);
    }

    @SdkInternalApi
    final DeleteTerminologyResult executeDeleteTerminology(DeleteTerminologyRequest deleteTerminologyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTerminologyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTerminologyRequest> request = null;
        Response<DeleteTerminologyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTerminologyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTerminologyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Translate");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTerminology");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTerminologyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTerminologyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return Result of the GetTerminology operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request. .
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTerminologyResult getTerminology(GetTerminologyRequest request) {
        request = beforeClientExecution(request);
        return executeGetTerminology(request);
    }

    @SdkInternalApi
    final GetTerminologyResult executeGetTerminology(GetTerminologyRequest getTerminologyRequest) {

        ExecutionContext executionContext = createExecutionContext(getTerminologyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTerminologyRequest> request = null;
        Response<GetTerminologyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTerminologyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTerminologyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Translate");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTerminology");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTerminologyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTerminologyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return Result of the ImportTerminology operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws LimitExceededException
     *         The specified limit has been exceeded. Review your request and retry it with a quantity below the stated
     *         limit.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ImportTerminologyResult importTerminology(ImportTerminologyRequest request) {
        request = beforeClientExecution(request);
        return executeImportTerminology(request);
    }

    @SdkInternalApi
    final ImportTerminologyResult executeImportTerminology(ImportTerminologyRequest importTerminologyRequest) {

        ExecutionContext executionContext = createExecutionContext(importTerminologyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportTerminologyRequest> request = null;
        Response<ImportTerminologyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportTerminologyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importTerminologyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Translate");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportTerminology");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportTerminologyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportTerminologyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return Result of the ListTerminologies operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and
     *         then retry your operation.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonTranslate.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTerminologiesResult listTerminologies(ListTerminologiesRequest request) {
        request = beforeClientExecution(request);
        return executeListTerminologies(request);
    }

    @SdkInternalApi
    final ListTerminologiesResult executeListTerminologies(ListTerminologiesRequest listTerminologiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTerminologiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTerminologiesRequest> request = null;
        Response<ListTerminologiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTerminologiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTerminologiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Translate");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTerminologies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTerminologiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTerminologiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Translates input text from the source language to the target language. It is not necessary to use English (en) as
     * either the source or the target language but not all language combinations are supported by Amazon Translate. For
     * more information, see <a href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html">Supported Language
     * Pairs</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Traditional) (zh-TW)
     * </p>
     * </li>
     * <li>
     * <p>
     * Czech (cs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Danish (da)
     * </p>
     * </li>
     * <li>
     * <p>
     * Dutch (nl)
     * </p>
     * </li>
     * <li>
     * <p>
     * English (en)
     * </p>
     * </li>
     * <li>
     * <p>
     * Finnish (fi)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Hebrew (he)
     * </p>
     * </li>
     * <li>
     * <p>
     * Indonesian (id)
     * </p>
     * </li>
     * <li>
     * <p>
     * Italian (it)
     * </p>
     * </li>
     * <li>
     * <p>
     * Japanese (ja)
     * </p>
     * </li>
     * <li>
     * <p>
     * Korean (ko)
     * </p>
     * </li>
     * <li>
     * <p>
     * Polish (pl)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Russian (ru)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * <li>
     * <p>
     * Swedish (sv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Turkish (tr)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
     * 
     * @param translateTextRequest
     * @return Result of the TranslateText operation returned by the service.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again.
     * @throws UnsupportedLanguagePairException
     *         Amazon Translate does not support translation from the language of the source text into the requested
     *         target language. For more information, see <a>how-to-error-msg</a>.
     * @throws DetectedLanguageLowConfidenceException
     *         The confidence that Amazon Comprehend accurately detected the source language is low. If a low confidence
     *         level is acceptable for your application, you can use the language in the exception to call Amazon
     *         Translate again. For more information, see the <a
     *         href="https://docs.aws.amazon.com/comprehend/latest/dg/API_DetectDominantLanguage.html"
     *         >DetectDominantLanguage</a> operation in the <i>Amazon Comprehend Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The resource you are looking for has not been found. Review the resource you're looking for and see if a
     *         different resource will accomplish your needs before retrying the revised request. .
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Amazon Translate service is temporarily unavailable. Please wait a bit and then retry your request.
     * @sample AmazonTranslate.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TranslateTextResult translateText(TranslateTextRequest request) {
        request = beforeClientExecution(request);
        return executeTranslateText(request);
    }

    @SdkInternalApi
    final TranslateTextResult executeTranslateText(TranslateTextRequest translateTextRequest) {

        ExecutionContext executionContext = createExecutionContext(translateTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TranslateTextRequest> request = null;
        Response<TranslateTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TranslateTextRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(translateTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Translate");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TranslateText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TranslateTextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TranslateTextResultJsonUnmarshaller());
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
