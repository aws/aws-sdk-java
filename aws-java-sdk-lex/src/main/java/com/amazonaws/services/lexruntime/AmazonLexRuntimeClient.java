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
package com.amazonaws.services.lexruntime;

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

import com.amazonaws.services.lexruntime.AmazonLexRuntimeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lexruntime.model.*;
import com.amazonaws.services.lexruntime.model.transform.*;

/**
 * Client for accessing Amazon Lex Runtime Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides a set of operations (API). Your
 * conversational bot uses the runtime API to understand user utterances (user input text or voice). For example,
 * suppose a user says "I want pizza", your bot sends this input to Amazon Lex using the runtime API. Amazon Lex
 * recognizes that the user request is for the OrderPizza intent (one of the intents defined in the bot). Then Amazon
 * Lex engages in user conversation on behalf of the bot to elicit required information (slot values, such as pizza size
 * and crust type), and then performs fulfillment activity (that you configured when you created the bot). You use the
 * build-time API to create and manage your Amazon Lex bot. For a list of build-time operations, see the build-time API,
 * .
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexRuntimeClient extends AmazonWebServiceClient implements AmazonLexRuntime {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLexRuntime.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("DependencyFailedException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.DependencyFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTimeoutException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.RequestTimeoutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedMediaTypeException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.UnsupportedMediaTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAcceptableException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.NotAcceptableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadGatewayException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.BadGatewayException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LoopDetectedException").withModeledClass(
                                    com.amazonaws.services.lexruntime.model.LoopDetectedException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lexruntime.model.AmazonLexRuntimeException.class));

    public static AmazonLexRuntimeClientBuilder builder() {
        return AmazonLexRuntimeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lex Runtime Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lex Runtime Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("runtime.lex.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lexruntime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lexruntime/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sends user input (text or speech) to Amazon Lex. Clients use this API to send text and audio requests to Amazon
     * Lex at runtime. Amazon Lex interprets the user input using the machine learning model that it built for the bot.
     * </p>
     * <p>
     * The <code>PostContent</code> operation supports audio input at 8kHz and 16kHz. You can use 8kHz audio to achieve
     * higher speech recognition accuracy in telephone audio applications.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user. Consider the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza," Amazon Lex might return a response with a message eliciting slot data
     * (for example, <code>PizzaSize</code>): "What size pizza would you like?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex might return a response with a message to
     * get user confirmation: "Order the pizza?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies "Yes" to the confirmation prompt, Amazon Lex might return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a response from the user. For example, conclusion statements do not require a
     * response. Some messages require only a yes or no response. In addition to the <code>message</code>, Amazon Lex
     * provides additional context about the message in the response that you can use to enhance client behavior, such
     * as displaying the appropriate client user interface. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-lex-dialog-state</code> header set to <code>ElicitSlot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-intent-name</code> header set to the intent name in the current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slot-to-elicit</code> header set to the slot name for which the <code>message</code> is eliciting
     * information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slots</code> header set to a map of slots configured for the intent with their current values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the <code>x-amz-lex-dialog-state</code> header is set to
     * <code>Confirmation</code> and the <code>x-amz-lex-slot-to-elicit</code> header is omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt configured for the intent, indicating that the user intent is not
     * understood, the <code>x-amz-dialog-state</code> header is set to <code>ElicitIntent</code> and the
     * <code>x-amz-slot-to-elicit</code> header is omitted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific <code>sessionAttributes</code>. For more
     * information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html">Managing Conversation
     * Context</a>.
     * </p>
     * 
     * @param postContentRequest
     * @return Result of the PostContent operation returned by the service.
     * @throws NotFoundException
     *         The resource (such as the Amazon Lex bot or an alias) that is referred to is not found.
     * @throws BadRequestException
     *         Request validation failed, there is no usable message in the context, or the bot build failed, is still
     *         in progress, or contains unbuilt changes.
     * @throws LimitExceededException
     *         Exceeded a limit.
     * @throws InternalFailureException
     *         Internal service error. Retry the call.
     * @throws ConflictException
     *         Two clients are using the same AWS account, Amazon Lex bot, and user ID.
     * @throws UnsupportedMediaTypeException
     *         The Content-Type header (<code>PostContent</code> API) has an invalid value.
     * @throws NotAcceptableException
     *         The accept header in the request does not have a valid value.
     * @throws RequestTimeoutException
     *         The input speech is too long.
     * @throws DependencyFailedException
     *         One of the dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example, </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If Amazon Lex does not have sufficient permissions to call a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a Lambda function takes longer than 30 seconds to execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a fulfillment Lambda function returns a <code>Delegate</code> dialog action without removing any slot
     *         values.
     *         </p>
     *         </li>
     * @throws BadGatewayException
     *         Either the Amazon Lex bot is still building, or one of the dependent services (Amazon Polly, AWS Lambda)
     *         failed with an internal service error.
     * @throws LoopDetectedException
     *         This exception is not used.
     * @sample AmazonLexRuntime.PostContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostContentResult postContent(PostContentRequest request) {
        request = beforeClientExecution(request);
        return executePostContent(request);
    }

    @SdkInternalApi
    final PostContentResult executePostContent(PostContentRequest postContentRequest) {

        ExecutionContext executionContext = createExecutionContext(postContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostContentRequest> request = null;
        Response<PostContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(postContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new PostContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends user input (text-only) to Amazon Lex. Client applications can use this API to send requests to Amazon Lex
     * at runtime. Amazon Lex then interprets the user input using the machine learning model it built for the bot.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next <code>message</code> to convey to the user an optional
     * <code>responseCard</code> to display. Consider the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza", Amazon Lex might return a response with a message eliciting slot data
     * (for example, PizzaSize): "What size pizza would you like?"
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex might return a response with a message to
     * obtain user confirmation "Proceed with the pizza order?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies to a confirmation prompt with a "yes", Amazon Lex might return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a user response. For example, a conclusion statement does not require a
     * response. Some messages require only a "yes" or "no" user response. In addition to the <code>message</code>,
     * Amazon Lex provides additional context about the message in the response that you might use to enhance client
     * behavior, for example, to display the appropriate client user interface. These are the <code>slotToElicit</code>,
     * <code>dialogState</code>, <code>intentName</code>, and <code>slots</code> fields in the response. Consider the
     * following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dialogState</code> set to ElicitSlot
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>intentName</code> set to the intent name in the current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElicit</code> set to the slot name for which the <code>message</code> is eliciting information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slots</code> set to a map of slots, configured for the intent, with currently known values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the <code>dialogState</code> is set to ConfirmIntent and
     * <code>SlotToElicit</code> is set to null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt (configured for the intent) that indicates that user intent is not
     * understood, the <code>dialogState</code> is set to ElicitIntent and <code>slotToElicit</code> is set to null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific <code>sessionAttributes</code>. For more
     * information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html">Managing Conversation
     * Context</a>.
     * </p>
     * 
     * @param postTextRequest
     * @return Result of the PostText operation returned by the service.
     * @throws NotFoundException
     *         The resource (such as the Amazon Lex bot or an alias) that is referred to is not found.
     * @throws BadRequestException
     *         Request validation failed, there is no usable message in the context, or the bot build failed, is still
     *         in progress, or contains unbuilt changes.
     * @throws LimitExceededException
     *         Exceeded a limit.
     * @throws InternalFailureException
     *         Internal service error. Retry the call.
     * @throws ConflictException
     *         Two clients are using the same AWS account, Amazon Lex bot, and user ID.
     * @throws DependencyFailedException
     *         One of the dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example, </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If Amazon Lex does not have sufficient permissions to call a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a Lambda function takes longer than 30 seconds to execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a fulfillment Lambda function returns a <code>Delegate</code> dialog action without removing any slot
     *         values.
     *         </p>
     *         </li>
     * @throws BadGatewayException
     *         Either the Amazon Lex bot is still building, or one of the dependent services (Amazon Polly, AWS Lambda)
     *         failed with an internal service error.
     * @throws LoopDetectedException
     *         This exception is not used.
     * @sample AmazonLexRuntime.PostText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostTextResult postText(PostTextRequest request) {
        request = beforeClientExecution(request);
        return executePostText(request);
    }

    @SdkInternalApi
    final PostTextResult executePostText(PostTextRequest postTextRequest) {

        ExecutionContext executionContext = createExecutionContext(postTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostTextRequest> request = null;
        Response<PostTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostTextRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(postTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Runtime Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostTextResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostTextResultJsonUnmarshaller());
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
