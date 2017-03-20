/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * application uses the runtime API to understand user utterances (user input text or voice). For example, suppose user
 * says "I want pizza", your application sends this input to Amazon Lex using the runtime API. Amazon Lex recognizes
 * that the user request is for the OrderPizza intent (one of the intents defined in the application). Then Amazon Lex
 * engages in user conversation on behalf of the application to elicit required information (slot values, such as pizza
 * size and crust type), and then performs fulfillment activity (that you configured when you created the application).
 * You use the build-time API to create and manage your Amazon Lex applications. For a list of build-time operations,
 * see the build-time API. .
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

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Sends user input text to Amazon Lex at runtime. Amazon Lex uses the machine learning model that the service built
     * for the application to interpret user input.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user (based on the context of the user
     * interaction) and whether to expect a user response to the message (<code>dialogState</code>). For example,
     * consider the following response messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "What pizza toppings would you like?" – In this case, the <code>dialogState</code> would be
     * <code>ElicitSlot</code> (that is, a user response is expected).
     * </p>
     * </li>
     * <li>
     * <p>
     * "Your order has been placed." – In this case, Amazon Lex returns one of the following <code>dialogState</code>
     * values depending on how the intent fulfillment is configured (see <code>fulfillmentActivity</code> in
     * <code>CreateIntent</code>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FulFilled</code> – The intent fulfillment is configured through a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfilment</code> – The intent's <code>fulfillmentActivity</code> is to simply return the intent
     * data back to the client application.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param postTextRequest
     * @return Result of the PostText operation returned by the service.
     * @throws NotFoundException
     *         Resource (such as the Amazon Lex bot or an alias) referred is not found.
     * @throws BadRequestException
     *         Request validation failed, there is no usable message in the context, or the bot build failed.
     * @throws LimitExceededException
     * @throws InternalFailureException
     *         Internal service error. Retry the call.
     * @throws ConflictException
     *         Two clients are using the same AWS account, Amazon Lex bot, and user ID.
     * @throws DependencyFailedException
     *         One of the downstream dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example,
     *         if Amazon Lex does not have sufficient permissions to call a Lambda function which results in AWS Lambda
     *         throwing an exception.
     * @throws BadGatewayException
     *         Either the Amazon Lex bot is still building, or one of the dependent services (Amazon Polly, AWS Lambda)
     *         failed with an internal service error.
     * @throws LoopDetectedException
     *         Lambda fulfilment function returned <code>DelegateDialogAction</code> to Amazon Lex without changing any
     *         slot values.
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

}
