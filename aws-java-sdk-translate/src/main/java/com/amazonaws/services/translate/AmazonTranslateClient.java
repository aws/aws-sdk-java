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
import com.amazonaws.services.translate.AmazonTranslateClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.services.translate.model.transform.*;

/**
 * Client for accessing Amazon Translate. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Provides translation between English and one of six languages, or between one of the six languages and English.
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

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.translate.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.translate.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.translate.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.translate.model.TextSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedLanguagePairException").withModeledClass(
                                    com.amazonaws.services.translate.model.UnsupportedLanguagePairException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.translate.model.ServiceUnavailableException.class))
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Translates input text from the source language to the target language. You can translate between English (en) and
     * one of the following languages, or between one of the following languages and English.
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
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * </ul>
     * 
     * @param translateTextRequest
     * @return Result of the TranslateText operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the length constraint for the <code>Text</code> field. Try again with
     *         a shorter text.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws UnsupportedLanguagePairException
     *         Amazon Translate cannot translate input text in the source language into this target language. For more
     *         information, see <a>how-to-error-msg</a>.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         Amazon Translate is unavailable. Retry your request later.
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
