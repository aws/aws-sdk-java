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
package com.amazonaws.services.lexruntimev2;

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

import com.amazonaws.services.lexruntimev2.AmazonLexRuntimeV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lexruntimev2.model.*;
import com.amazonaws.services.lexruntimev2.model.transform.*;

/**
 * Client for accessing Lex Runtime V2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexRuntimeV2Client extends AmazonWebServiceClient implements AmazonLexRuntimeV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLexRuntimeV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lex";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.DependencyFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadGatewayException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexruntimev2.model.transform.BadGatewayExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lexruntimev2.model.AmazonLexRuntimeV2Exception.class));

    public static AmazonLexRuntimeV2ClientBuilder builder() {
        return AmazonLexRuntimeV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Lex Runtime V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Lex Runtime V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("runtime-v2-lex.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lexruntimev2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lexruntimev2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Removes session information for a specified bot, alias, and user ID.
     * </p>
     * <p>
     * You can use this operation to restart a conversation with a bot. When you remove a session, the entire history of
     * the session is removed so that you can start again.
     * </p>
     * <p>
     * You don't need to delete a session. Sessions have a time limit and will expire. Set the session time limit when
     * you create the bot. The default is 5 minutes, but you can specify anything between 1 minute and 24 hours.
     * </p>
     * <p>
     * If you specify a bot or alias ID that doesn't exist, you receive a <code>BadRequestException.</code>
     * </p>
     * <p>
     * If the locale doesn't exist in the bot, or if the locale hasn't been enables for the alias, you receive a
     * <code>BadRequestException</code>.
     * </p>
     * 
     * @param deleteSessionRequest
     * @return Result of the DeleteSession operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws ConflictException
     * @sample AmazonLexRuntimeV2.DeleteSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/DeleteSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSessionResult deleteSession(DeleteSessionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSession(request);
    }

    @SdkInternalApi
    final DeleteSessionResult executeDeleteSession(DeleteSessionRequest deleteSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSessionRequest> request = null;
        Response<DeleteSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns session information for a specified bot, alias, and user.
     * </p>
     * <p>
     * For example, you can use this operation to retrieve session information for a user that has left a long-running
     * session in use.
     * </p>
     * <p>
     * If the bot, alias, or session identifier doesn't exist, Amazon Lex returns a <code>BadRequestException</code>. If
     * the locale doesn't exist or is not enabled for the alias, you receive a <code>BadRequestException</code>.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @sample AmazonLexRuntimeV2.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionResult getSession(GetSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSession(request);
    }

    @SdkInternalApi
    final GetSessionResult executeGetSession(GetSessionRequest getSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionRequest> request = null;
        Response<GetSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new session or modifies an existing session with an Amazon Lex bot. Use this operation to enable your
     * application to set the state of the bot.
     * </p>
     * 
     * @param putSessionRequest
     * @return Result of the PutSession operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @sample AmazonLexRuntimeV2.PutSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/PutSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSessionResult putSession(PutSessionRequest request) {
        request = beforeClientExecution(request);
        return executePutSession(request);
    }

    @SdkInternalApi
    final PutSessionResult executePutSession(PutSessionRequest putSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(putSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSessionRequest> request = null;
        Response<PutSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSessionResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(true), new PutSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends user input to Amazon Lex. Client applications use this API to send requests to Amazon Lex at runtime.
     * Amazon Lex then interprets the user input using the machine learning model that it build for the bot.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user and an optional response card to display.
     * </p>
     * 
     * @param recognizeTextRequest
     * @return Result of the RecognizeText operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @sample AmazonLexRuntimeV2.RecognizeText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeText" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RecognizeTextResult recognizeText(RecognizeTextRequest request) {
        request = beforeClientExecution(request);
        return executeRecognizeText(request);
    }

    @SdkInternalApi
    final RecognizeTextResult executeRecognizeText(RecognizeTextRequest recognizeTextRequest) {

        ExecutionContext executionContext = createExecutionContext(recognizeTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecognizeTextRequest> request = null;
        Response<RecognizeTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecognizeTextRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(recognizeTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RecognizeText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RecognizeTextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RecognizeTextResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends user input to Amazon Lex. You can send text or speech. Clients use this API to send text and audio requests
     * to Amazon Lex at runtime. Amazon Lex interprets the user input using the machine learning model built for the
     * bot.
     * </p>
     * 
     * @param recognizeUtteranceRequest
     * @return Result of the RecognizeUtterance operation returned by the service.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @sample AmazonLexRuntimeV2.RecognizeUtterance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeUtterance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RecognizeUtteranceResult recognizeUtterance(RecognizeUtteranceRequest request) {
        request = beforeClientExecution(request);
        return executeRecognizeUtterance(request);
    }

    @SdkInternalApi
    final RecognizeUtteranceResult executeRecognizeUtterance(RecognizeUtteranceRequest recognizeUtteranceRequest) {

        ExecutionContext executionContext = createExecutionContext(recognizeUtteranceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecognizeUtteranceRequest> request = null;
        Response<RecognizeUtteranceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecognizeUtteranceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(recognizeUtteranceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RecognizeUtterance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RecognizeUtteranceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new RecognizeUtteranceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

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
