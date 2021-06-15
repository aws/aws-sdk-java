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

import javax.annotation.Generated;

import com.amazonaws.services.lexruntimev2.model.*;

/**
 * Interface for accessing Lex Runtime V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexruntimev2.AbstractAmazonLexRuntimeV2Async} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexRuntimeV2Async extends AmazonLexRuntimeV2 {

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
     * @return A Java Future containing the result of the DeleteSession operation returned by the service.
     * @sample AmazonLexRuntimeV2Async.DeleteSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/DeleteSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest deleteSessionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSession operation returned by the service.
     * @sample AmazonLexRuntimeV2AsyncHandler.DeleteSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/DeleteSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest deleteSessionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSessionRequest, DeleteSessionResult> asyncHandler);

    /**
     * <p>
     * Returns session information for a specified bot, alias, and user.
     * </p>
     * <p>
     * For example, you can use this operation to retrieve session information for a user that has left a long-running
     * session in use.
     * </p>
     * <p>
     * If the bot, alias, or session identifier doesn't exist, Amazon Lex V2 returns a <code>BadRequestException</code>.
     * If the locale doesn't exist or is not enabled for the alias, you receive a <code>BadRequestException</code>.
     * </p>
     * 
     * @param getSessionRequest
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonLexRuntimeV2Async.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Returns session information for a specified bot, alias, and user.
     * </p>
     * <p>
     * For example, you can use this operation to retrieve session information for a user that has left a long-running
     * session in use.
     * </p>
     * <p>
     * If the bot, alias, or session identifier doesn't exist, Amazon Lex V2 returns a <code>BadRequestException</code>.
     * If the locale doesn't exist or is not enabled for the alias, you receive a <code>BadRequestException</code>.
     * </p>
     * 
     * @param getSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonLexRuntimeV2AsyncHandler.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler);

    /**
     * <p>
     * Creates a new session or modifies an existing session with an Amazon Lex V2 bot. Use this operation to enable
     * your application to set the state of the bot.
     * </p>
     * 
     * @param putSessionRequest
     * @return A Java Future containing the result of the PutSession operation returned by the service.
     * @sample AmazonLexRuntimeV2Async.PutSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/PutSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest putSessionRequest);

    /**
     * <p>
     * Creates a new session or modifies an existing session with an Amazon Lex V2 bot. Use this operation to enable
     * your application to set the state of the bot.
     * </p>
     * 
     * @param putSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSession operation returned by the service.
     * @sample AmazonLexRuntimeV2AsyncHandler.PutSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/PutSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest putSessionRequest,
            com.amazonaws.handlers.AsyncHandler<PutSessionRequest, PutSessionResult> asyncHandler);

    /**
     * <p>
     * Sends user input to Amazon Lex V2. Client applications use this API to send requests to Amazon Lex V2 at runtime.
     * Amazon Lex V2 then interprets the user input using the machine learning model that it build for the bot.
     * </p>
     * <p>
     * In response, Amazon Lex V2 returns the next message to convey to the user and an optional response card to
     * display.
     * </p>
     * 
     * @param recognizeTextRequest
     * @return A Java Future containing the result of the RecognizeText operation returned by the service.
     * @sample AmazonLexRuntimeV2Async.RecognizeText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeText" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RecognizeTextResult> recognizeTextAsync(RecognizeTextRequest recognizeTextRequest);

    /**
     * <p>
     * Sends user input to Amazon Lex V2. Client applications use this API to send requests to Amazon Lex V2 at runtime.
     * Amazon Lex V2 then interprets the user input using the machine learning model that it build for the bot.
     * </p>
     * <p>
     * In response, Amazon Lex V2 returns the next message to convey to the user and an optional response card to
     * display.
     * </p>
     * 
     * @param recognizeTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecognizeText operation returned by the service.
     * @sample AmazonLexRuntimeV2AsyncHandler.RecognizeText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeText" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RecognizeTextResult> recognizeTextAsync(RecognizeTextRequest recognizeTextRequest,
            com.amazonaws.handlers.AsyncHandler<RecognizeTextRequest, RecognizeTextResult> asyncHandler);

    /**
     * <p>
     * Sends user input to Amazon Lex V2. You can send text or speech. Clients use this API to send text and audio
     * requests to Amazon Lex V2 at runtime. Amazon Lex V2 interprets the user input using the machine learning model
     * built for the bot.
     * </p>
     * <p>
     * The following request fields must be compressed with gzip and then base64 encoded before you send them to Amazon
     * Lex V2.
     * </p>
     * <ul>
     * <li>
     * <p>
     * requestAttributes
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionState
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following response fields are compressed using gzip and then base64 encoded by Amazon Lex V2. Before you can
     * use these fields, you must decode and decompress them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * inputTranscript
     * </p>
     * </li>
     * <li>
     * <p>
     * interpretations
     * </p>
     * </li>
     * <li>
     * <p>
     * messages
     * </p>
     * </li>
     * <li>
     * <p>
     * requestAttributes
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionState
     * </p>
     * </li>
     * </ul>
     * <p>
     * The example contains a Java application that compresses and encodes a Java object to send to Amazon Lex V2, and a
     * second that decodes and decompresses a response from Amazon Lex V2.
     * </p>
     * 
     * @param recognizeUtteranceRequest
     * @return A Java Future containing the result of the RecognizeUtterance operation returned by the service.
     * @sample AmazonLexRuntimeV2Async.RecognizeUtterance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeUtterance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecognizeUtteranceResult> recognizeUtteranceAsync(RecognizeUtteranceRequest recognizeUtteranceRequest);

    /**
     * <p>
     * Sends user input to Amazon Lex V2. You can send text or speech. Clients use this API to send text and audio
     * requests to Amazon Lex V2 at runtime. Amazon Lex V2 interprets the user input using the machine learning model
     * built for the bot.
     * </p>
     * <p>
     * The following request fields must be compressed with gzip and then base64 encoded before you send them to Amazon
     * Lex V2.
     * </p>
     * <ul>
     * <li>
     * <p>
     * requestAttributes
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionState
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following response fields are compressed using gzip and then base64 encoded by Amazon Lex V2. Before you can
     * use these fields, you must decode and decompress them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * inputTranscript
     * </p>
     * </li>
     * <li>
     * <p>
     * interpretations
     * </p>
     * </li>
     * <li>
     * <p>
     * messages
     * </p>
     * </li>
     * <li>
     * <p>
     * requestAttributes
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionState
     * </p>
     * </li>
     * </ul>
     * <p>
     * The example contains a Java application that compresses and encodes a Java object to send to Amazon Lex V2, and a
     * second that decodes and decompresses a response from Amazon Lex V2.
     * </p>
     * 
     * @param recognizeUtteranceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecognizeUtterance operation returned by the service.
     * @sample AmazonLexRuntimeV2AsyncHandler.RecognizeUtterance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeUtterance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RecognizeUtteranceResult> recognizeUtteranceAsync(RecognizeUtteranceRequest recognizeUtteranceRequest,
            com.amazonaws.handlers.AsyncHandler<RecognizeUtteranceRequest, RecognizeUtteranceResult> asyncHandler);

}
