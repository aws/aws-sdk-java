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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lexruntimev2.model.*;

/**
 * Interface for accessing Lex Runtime V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexruntimev2.AbstractAmazonLexRuntimeV2} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexRuntimeV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "runtime-v2-lex";

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
    DeleteSessionResult deleteSession(DeleteSessionRequest deleteSessionRequest);

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
    GetSessionResult getSession(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Creates a new session or modifies an existing session with an Amazon Lex V2 bot. Use this operation to enable
     * your application to set the state of the bot.
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
    PutSessionResult putSession(PutSessionRequest putSessionRequest);

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
    RecognizeTextResult recognizeText(RecognizeTextRequest recognizeTextRequest);

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
    RecognizeUtteranceResult recognizeUtterance(RecognizeUtteranceRequest recognizeUtteranceRequest);

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
