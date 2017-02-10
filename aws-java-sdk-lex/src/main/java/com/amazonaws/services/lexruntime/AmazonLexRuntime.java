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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lexruntime.model.*;

/**
 * Interface for accessing Amazon Lex Runtime Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexruntime.AbstractAmazonLexRuntime} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "runtime.lex";

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
    PostTextResult postText(PostTextRequest postTextRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
