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

import com.amazonaws.services.lexruntime.model.*;

/**
 * Interface for accessing Amazon Lex Runtime Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexruntime.AbstractAmazonLexRuntimeAsync} instead.
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
public interface AmazonLexRuntimeAsync extends AmazonLexRuntime {

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
     * @return A Java Future containing the result of the PostText operation returned by the service.
     * @sample AmazonLexRuntimeAsync.PostText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PostTextResult> postTextAsync(PostTextRequest postTextRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostText operation returned by the service.
     * @sample AmazonLexRuntimeAsyncHandler.PostText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PostTextResult> postTextAsync(PostTextRequest postTextRequest,
            com.amazonaws.handlers.AsyncHandler<PostTextRequest, PostTextResult> asyncHandler);

}
