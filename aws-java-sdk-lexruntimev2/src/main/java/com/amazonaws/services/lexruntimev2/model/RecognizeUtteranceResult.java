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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeUtterance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecognizeUtteranceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the input mode to the operation was text or speech.
     * </p>
     */
    private String inputMode;
    /**
     * <p>
     * Content type as specified in the <code>responseContentType</code> in the request.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that you returned
     * the messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * <p>
     * The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the contents
     * of the field, you must decode and decompress the contents. See the example for a simple function to decode and
     * decompress the contents.
     * </p>
     */
    private String messages;
    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     */
    private String interpretations;
    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * <p>
     * The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     */
    private String sessionState;
    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents.
     * </p>
     */
    private String requestAttributes;
    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     */
    private String inputTranscript;
    /**
     * <p>
     * The prompt or statement to send to the user. This is based on the bot configuration and context. For example, if
     * Amazon Lex V2 did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex V2 sends that message in the response.
     * </p>
     */
    private java.io.InputStream audioStream;

    /**
     * <p>
     * Indicates whether the input mode to the operation was text or speech.
     * </p>
     * 
     * @param inputMode
     *        Indicates whether the input mode to the operation was text or speech.
     */

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    /**
     * <p>
     * Indicates whether the input mode to the operation was text or speech.
     * </p>
     * 
     * @return Indicates whether the input mode to the operation was text or speech.
     */

    public String getInputMode() {
        return this.inputMode;
    }

    /**
     * <p>
     * Indicates whether the input mode to the operation was text or speech.
     * </p>
     * 
     * @param inputMode
     *        Indicates whether the input mode to the operation was text or speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withInputMode(String inputMode) {
        setInputMode(inputMode);
        return this;
    }

    /**
     * <p>
     * Content type as specified in the <code>responseContentType</code> in the request.
     * </p>
     * 
     * @param contentType
     *        Content type as specified in the <code>responseContentType</code> in the request.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>responseContentType</code> in the request.
     * </p>
     * 
     * @return Content type as specified in the <code>responseContentType</code> in the request.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>responseContentType</code> in the request.
     * </p>
     * 
     * @param contentType
     *        Content type as specified in the <code>responseContentType</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that you returned
     * the messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * <p>
     * The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the contents
     * of the field, you must decode and decompress the contents. See the example for a simple function to decode and
     * decompress the contents.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on the order that you
     *        returned the messages from your Lambda function or the order that the messages are defined in the bot.</p>
     *        <p>
     *        The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the
     *        contents of the field, you must decode and decompress the contents. See the example for a simple function
     *        to decode and decompress the contents.
     */

    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that you returned
     * the messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * <p>
     * The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the contents
     * of the field, you must decode and decompress the contents. See the example for a simple function to decode and
     * decompress the contents.
     * </p>
     * 
     * @return A list of messages that were last sent to the user. The messages are ordered based on the order that you
     *         returned the messages from your Lambda function or the order that the messages are defined in the
     *         bot.</p>
     *         <p>
     *         The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the
     *         contents of the field, you must decode and decompress the contents. See the example for a simple function
     *         to decode and decompress the contents.
     */

    public String getMessages() {
        return this.messages;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that you returned
     * the messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * <p>
     * The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the contents
     * of the field, you must decode and decompress the contents. See the example for a simple function to decode and
     * decompress the contents.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on the order that you
     *        returned the messages from your Lambda function or the order that the messages are defined in the bot.</p>
     *        <p>
     *        The <code>messages</code> field is compressed with gzip and then base64 encoded. Before you can use the
     *        contents of the field, you must decode and decompress the contents. See the example for a simple function
     *        to decode and decompress the contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withMessages(String messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.</p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     *        </p>
     *        <p>
     *        The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     */

    public void setInterpretations(String interpretations) {
        this.interpretations = interpretations;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @return A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.</p>
     *         <p>
     *         Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *         interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *         expressed in the utterance.
     *         </p>
     *         <p>
     *         The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can
     *         use the contents of the field, you must decode and decompress the contents. See the example for a simple
     *         function to decode and decompress the contents.
     */

    public String getInterpretations() {
        return this.interpretations;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.</p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     *        </p>
     *        <p>
     *        The <code>interpretations</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withInterpretations(String interpretations) {
        setInterpretations(interpretations);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * <p>
     * The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action might be.
     *        </p>
     *        <p>
     *        The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     */

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * <p>
     * The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @return Represents the current state of the dialog between the user and the bot.</p>
     *         <p>
     *         Use this to determine the progress of the conversation and what the next action might be.
     *         </p>
     *         <p>
     *         The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use
     *         the contents of the field, you must decode and decompress the contents. See the example for a simple
     *         function to decode and decompress the contents.
     */

    public String getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * <p>
     * The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action might be.
     *        </p>
     *        <p>
     *        The <code>sessionState</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withSessionState(String sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents.
     * </p>
     * 
     * @param requestAttributes
     *        The attributes sent in the request.</p>
     *        <p>
     *        The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can
     *        use the contents of the field, you must decode and decompress the contents.
     */

    public void setRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents.
     * </p>
     * 
     * @return The attributes sent in the request.</p>
     *         <p>
     *         The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can
     *         use the contents of the field, you must decode and decompress the contents.
     */

    public String getRequestAttributes() {
        return this.requestAttributes;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents.
     * </p>
     * 
     * @param requestAttributes
     *        The attributes sent in the request.</p>
     *        <p>
     *        The <code>requestAttributes</code> field is compressed with gzip and then base64 encoded. Before you can
     *        use the contents of the field, you must decode and decompress the contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withRequestAttributes(String requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @return The identifier of the session in use.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param inputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *        the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *        can use this information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     *        </p>
     *        <p>
     *        The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     */

    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @return The text used to process the request.</p>
     *         <p>
     *         If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *         the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *         can use this information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     *         </p>
     *         <p>
     *         The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can
     *         use the contents of the field, you must decode and decompress the contents. See the example for a simple
     *         function to decode and decompress the contents.
     */

    public String getInputTranscript() {
        return this.inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use the
     * contents of the field, you must decode and decompress the contents. See the example for a simple function to
     * decode and decompress the contents.
     * </p>
     * 
     * @param inputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *        the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *        can use this information to determine if Amazon Lex V2 is correctly processing the audio that you send.
     *        </p>
     *        <p>
     *        The <code>inputTranscript</code> field is compressed with gzip and then base64 encoded. Before you can use
     *        the contents of the field, you must decode and decompress the contents. See the example for a simple
     *        function to decode and decompress the contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withInputTranscript(String inputTranscript) {
        setInputTranscript(inputTranscript);
        return this;
    }

    /**
     * <p>
     * The prompt or statement to send to the user. This is based on the bot configuration and context. For example, if
     * Amazon Lex V2 did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex V2 sends that message in the response.
     * </p>
     * 
     * @param audioStream
     *        The prompt or statement to send to the user. This is based on the bot configuration and context. For
     *        example, if Amazon Lex V2 did not understand the user intent, it sends the
     *        <code>clarificationPrompt</code> configured for the bot. If the intent requires confirmation before taking
     *        the fulfillment action, it sends the <code>confirmationPrompt</code>. Another example: Suppose that the
     *        Lambda function successfully fulfilled the intent, and sent a message to convey to the user. Then Amazon
     *        Lex V2 sends that message in the response.
     */

    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * The prompt or statement to send to the user. This is based on the bot configuration and context. For example, if
     * Amazon Lex V2 did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex V2 sends that message in the response.
     * </p>
     * 
     * @return The prompt or statement to send to the user. This is based on the bot configuration and context. For
     *         example, if Amazon Lex V2 did not understand the user intent, it sends the
     *         <code>clarificationPrompt</code> configured for the bot. If the intent requires confirmation before
     *         taking the fulfillment action, it sends the <code>confirmationPrompt</code>. Another example: Suppose
     *         that the Lambda function successfully fulfilled the intent, and sent a message to convey to the user.
     *         Then Amazon Lex V2 sends that message in the response.
     */

    public java.io.InputStream getAudioStream() {
        return this.audioStream;
    }

    /**
     * <p>
     * The prompt or statement to send to the user. This is based on the bot configuration and context. For example, if
     * Amazon Lex V2 did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex V2 sends that message in the response.
     * </p>
     * 
     * @param audioStream
     *        The prompt or statement to send to the user. This is based on the bot configuration and context. For
     *        example, if Amazon Lex V2 did not understand the user intent, it sends the
     *        <code>clarificationPrompt</code> configured for the bot. If the intent requires confirmation before taking
     *        the fulfillment action, it sends the <code>confirmationPrompt</code>. Another example: Suppose that the
     *        Lambda function successfully fulfilled the intent, and sent a message to convey to the user. Then Amazon
     *        Lex V2 sends that message in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceResult withAudioStream(java.io.InputStream audioStream) {
        setAudioStream(audioStream);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInputMode() != null)
            sb.append("InputMode: ").append(getInputMode()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getInterpretations() != null)
            sb.append("Interpretations: ").append(getInterpretations()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getInputTranscript() != null)
            sb.append("InputTranscript: ").append(getInputTranscript()).append(",");
        if (getAudioStream() != null)
            sb.append("AudioStream: ").append(getAudioStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizeUtteranceResult == false)
            return false;
        RecognizeUtteranceResult other = (RecognizeUtteranceResult) obj;
        if (other.getInputMode() == null ^ this.getInputMode() == null)
            return false;
        if (other.getInputMode() != null && other.getInputMode().equals(this.getInputMode()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getInterpretations() == null ^ this.getInterpretations() == null)
            return false;
        if (other.getInterpretations() != null && other.getInterpretations().equals(this.getInterpretations()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getInputTranscript() == null ^ this.getInputTranscript() == null)
            return false;
        if (other.getInputTranscript() != null && other.getInputTranscript().equals(this.getInputTranscript()) == false)
            return false;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputMode() == null) ? 0 : getInputMode().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getInterpretations() == null) ? 0 : getInterpretations().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getInputTranscript() == null) ? 0 : getInputTranscript().hashCode());
        hashCode = prime * hashCode + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        return hashCode;
    }

    @Override
    public RecognizeUtteranceResult clone() {
        try {
            return (RecognizeUtteranceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
