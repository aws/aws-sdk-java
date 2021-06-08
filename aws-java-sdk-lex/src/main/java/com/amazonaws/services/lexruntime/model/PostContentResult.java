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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the request.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that matches the
     * user's intent. The score is between 0.0 and 1.0.
     * </p>
     * <p>
     * The score is a relative score, not an absolute score. The score may change based on improvements to Amazon Lex.
     * </p>
     */
    private String nluIntentConfidence;
    /**
     * <p>
     * One to four alternative intents that may be applicable to the user's intent.
     * </p>
     * <p>
     * Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the user's
     * intent. The intents are sorted by the confidence score.
     * </p>
     */
    private String alternativeIntents;
    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     * conversation. The field is base-64 encoded.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     */
    private String slots;
    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information.
     * </p>
     */
    private String sessionAttributes;
    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     */
    private String sentimentResponse;
    /**
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     */
    @Deprecated
    private String message;
    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the value.
     * </p>
     */
    private String encodedMessage;
    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     */
    private String messageFormat;
    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     */
    private String dialogState;
    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     * Lex is eliciting a value.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     * <code>encodedInputTranscript</code> field instead.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     */
    @Deprecated
    private String inputTranscript;
    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text extracted from
     * the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can use
     * the value.
     * </p>
     */
    private String encodedInputTranscript;
    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For example,
     * if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     */
    private java.io.InputStream audioStream;
    /**
     * <p>
     * The version of the bot that responded to the conversation. You can use this information to help determine if one
     * version of a bot is performing better than another version.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the
     * <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an intent, or to modify the operation of your
     * application.
     * </p>
     */
    private String activeContexts;

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the request.
     * </p>
     * 
     * @param contentType
     *        Content type as specified in the <code>Accept</code> HTTP header in the request.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the request.
     * </p>
     * 
     * @return Content type as specified in the <code>Accept</code> HTTP header in the request.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the request.
     * </p>
     * 
     * @param contentType
     *        Content type as specified in the <code>Accept</code> HTTP header in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     * 
     * @param intentName
     *        Current user intent that Amazon Lex is aware of.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     * 
     * @return Current user intent that Amazon Lex is aware of.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     * 
     * @param intentName
     *        Current user intent that Amazon Lex is aware of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that matches the
     * user's intent. The score is between 0.0 and 1.0.
     * </p>
     * <p>
     * The score is a relative score, not an absolute score. The score may change based on improvements to Amazon Lex.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param nluIntentConfidence
     *        Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that
     *        matches the user's intent. The score is between 0.0 and 1.0.</p>
     *        <p>
     *        The score is a relative score, not an absolute score. The score may change based on improvements to Amazon
     *        Lex.
     */

    public void setNluIntentConfidence(String nluIntentConfidence) {
        this.nluIntentConfidence = nluIntentConfidence;
    }

    /**
     * <p>
     * Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that matches the
     * user's intent. The score is between 0.0 and 1.0.
     * </p>
     * <p>
     * The score is a relative score, not an absolute score. The score may change based on improvements to Amazon Lex.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that
     *         matches the user's intent. The score is between 0.0 and 1.0.</p>
     *         <p>
     *         The score is a relative score, not an absolute score. The score may change based on improvements to
     *         Amazon Lex.
     */

    public String getNluIntentConfidence() {
        return this.nluIntentConfidence;
    }

    /**
     * <p>
     * Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that matches the
     * user's intent. The score is between 0.0 and 1.0.
     * </p>
     * <p>
     * The score is a relative score, not an absolute score. The score may change based on improvements to Amazon Lex.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param nluIntentConfidence
     *        Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that
     *        matches the user's intent. The score is between 0.0 and 1.0.</p>
     *        <p>
     *        The score is a relative score, not an absolute score. The score may change based on improvements to Amazon
     *        Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withNluIntentConfidence(String nluIntentConfidence) {
        setNluIntentConfidence(nluIntentConfidence);
        return this;
    }

    /**
     * <p>
     * One to four alternative intents that may be applicable to the user's intent.
     * </p>
     * <p>
     * Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the user's
     * intent. The intents are sorted by the confidence score.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param alternativeIntents
     *        One to four alternative intents that may be applicable to the user's intent.</p>
     *        <p>
     *        Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the
     *        user's intent. The intents are sorted by the confidence score.
     */

    public void setAlternativeIntents(String alternativeIntents) {
        this.alternativeIntents = alternativeIntents;
    }

    /**
     * <p>
     * One to four alternative intents that may be applicable to the user's intent.
     * </p>
     * <p>
     * Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the user's
     * intent. The intents are sorted by the confidence score.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return One to four alternative intents that may be applicable to the user's intent.</p>
     *         <p>
     *         Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the
     *         user's intent. The intents are sorted by the confidence score.
     */

    public String getAlternativeIntents() {
        return this.alternativeIntents;
    }

    /**
     * <p>
     * One to four alternative intents that may be applicable to the user's intent.
     * </p>
     * <p>
     * Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the user's
     * intent. The intents are sorted by the confidence score.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param alternativeIntents
     *        One to four alternative intents that may be applicable to the user's intent.</p>
     *        <p>
     *        Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the
     *        user's intent. The intents are sorted by the confidence score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withAlternativeIntents(String alternativeIntents) {
        setAlternativeIntents(alternativeIntents);
        return this;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     * conversation. The field is base-64 encoded.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param slots
     *        Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     *        conversation. The field is base-64 encoded.</p>
     *        <p>
     *        Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *        determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *        If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *        user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *        is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *        there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default
     *        is <code>ORIGINAL_VALUE</code>.
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     * conversation. The field is base-64 encoded.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     *         conversation. The field is base-64 encoded.</p>
     *         <p>
     *         Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *         determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *         If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *         user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *         is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *         there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the
     *         default is <code>ORIGINAL_VALUE</code>.
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     * conversation. The field is base-64 encoded.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param slots
     *        Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the
     *        conversation. The field is base-64 encoded.</p>
     *        <p>
     *        Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *        determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *        If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *        user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *        is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *        there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code>, the default
     *        is <code>ORIGINAL_VALUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information.
     */

    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Map of key/value pairs representing the session-specific context information.
     */

    public String getSessionAttributes() {
        return this.sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withSessionAttributes(String sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @param sentimentResponse
     *        The sentiment expressed in an utterance.</p>
     *        <p>
     *        When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *        contains the result of the analysis.
     */

    public void setSentimentResponse(String sentimentResponse) {
        this.sentimentResponse = sentimentResponse;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @return The sentiment expressed in an utterance.</p>
     *         <p>
     *         When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *         contains the result of the analysis.
     */

    public String getSentimentResponse() {
        return this.sentimentResponse;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @param sentimentResponse
     *        The sentiment expressed in an utterance.</p>
     *        <p>
     *        When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *        contains the result of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withSentimentResponse(String sentimentResponse) {
        setSentimentResponse(sentimentResponse);
        return this;
    }

    /**
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * 
     * @param message
     *        You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *        it-IT locales. In all other locales, the <code>message</code> field is null. You should use the
     *        <code>encodedMessage</code> field instead.</p>
     *        <p>
     *        The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *        function.
     *        </p>
     *        <p>
     *        If the intent is not configured with a Lambda function, or if the Lambda function returned
     *        <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *        next course of action and selects an appropriate message from the bot's configuration based on the current
     *        interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *        clarification prompt message.
     *        </p>
     *        <p>
     *        When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *        Lex returns one message from each group in the response. The message field is an escaped JSON string
     *        containing the messages. For more information about the structure of the JSON string returned, see
     *        <a>msg-prompts-formats</a>.
     *        </p>
     *        <p>
     *        If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     */
    @Deprecated
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * 
     * @return You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *         it-IT locales. In all other locales, the <code>message</code> field is null. You should use the
     *         <code>encodedMessage</code> field instead.</p>
     *         <p>
     *         The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *         function.
     *         </p>
     *         <p>
     *         If the intent is not configured with a Lambda function, or if the Lambda function returned
     *         <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *         next course of action and selects an appropriate message from the bot's configuration based on the
     *         current interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *         clarification prompt message.
     *         </p>
     *         <p>
     *         When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *         Lex returns one message from each group in the response. The message field is an escaped JSON string
     *         containing the messages. For more information about the structure of the JSON string returned, see
     *         <a>msg-prompts-formats</a>.
     *         </p>
     *         <p>
     *         If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     */
    @Deprecated
    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * 
     * @param message
     *        You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *        it-IT locales. In all other locales, the <code>message</code> field is null. You should use the
     *        <code>encodedMessage</code> field instead.</p>
     *        <p>
     *        The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *        function.
     *        </p>
     *        <p>
     *        If the intent is not configured with a Lambda function, or if the Lambda function returned
     *        <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *        next course of action and selects an appropriate message from the bot's configuration based on the current
     *        interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *        clarification prompt message.
     *        </p>
     *        <p>
     *        When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *        Lex returns one message from each group in the response. The message field is an escaped JSON string
     *        containing the messages. For more information about the structure of the JSON string returned, see
     *        <a>msg-prompts-formats</a>.
     *        </p>
     *        <p>
     *        If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public PostContentResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the value.
     * </p>
     * 
     * @param encodedMessage
     *        The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *        function.</p>
     *        <p>
     *        If the intent is not configured with a Lambda function, or if the Lambda function returned
     *        <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *        next course of action and selects an appropriate message from the bot's configuration based on the current
     *        interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *        clarification prompt message.
     *        </p>
     *        <p>
     *        When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *        Lex returns one message from each group in the response. The message field is an escaped JSON string
     *        containing the messages. For more information about the structure of the JSON string returned, see
     *        <a>msg-prompts-formats</a>.
     *        </p>
     *        <p>
     *        If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     *        </p>
     *        <p>
     *        The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the
     *        value.
     */

    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the value.
     * </p>
     * 
     * @return The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *         function.</p>
     *         <p>
     *         If the intent is not configured with a Lambda function, or if the Lambda function returned
     *         <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *         next course of action and selects an appropriate message from the bot's configuration based on the
     *         current interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *         clarification prompt message.
     *         </p>
     *         <p>
     *         When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *         Lex returns one message from each group in the response. The message field is an escaped JSON string
     *         containing the messages. For more information about the structure of the JSON string returned, see
     *         <a>msg-prompts-formats</a>.
     *         </p>
     *         <p>
     *         If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     *         </p>
     *         <p>
     *         The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use
     *         the value.
     */

    public String getEncodedMessage() {
        return this.encodedMessage;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda function returned <code>Delegate</code>
     * as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the next course of action and
     * selects an appropriate message from the bot's configuration based on the current interaction context. For
     * example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex
     * returns one message from each group in the response. The message field is an escaped JSON string containing the
     * messages. For more information about the structure of the JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the value.
     * </p>
     * 
     * @param encodedMessage
     *        The message to convey to the user. The message can come from the bot's configuration or from a Lambda
     *        function.</p>
     *        <p>
     *        If the intent is not configured with a Lambda function, or if the Lambda function returned
     *        <code>Delegate</code> as the <code>dialogAction.type</code> in its response, Amazon Lex decides on the
     *        next course of action and selects an appropriate message from the bot's configuration based on the current
     *        interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a
     *        clarification prompt message.
     *        </p>
     *        <p>
     *        When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon
     *        Lex returns one message from each group in the response. The message field is an escaped JSON string
     *        containing the messages. For more information about the structure of the JSON string returned, see
     *        <a>msg-prompts-formats</a>.
     *        </p>
     *        <p>
     *        If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
     *        </p>
     *        <p>
     *        The <code>encodedMessage</code> field is base-64 encoded. You must decode the field before you can use the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withEncodedMessage(String encodedMessage) {
        setEncodedMessage(encodedMessage);
        return this;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        The format of the response message. One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from
     *        the groups that messages were assigned to when the intent was created.
     *        </p>
     *        </li>
     * @see MessageFormatType
     */

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the response message. One of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlainText</code> - The message contains plain UTF-8 text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CustomPayload</code> - The message is a custom format for the client.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSML</code> - The message contains text formatted for voice output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from
     *         the groups that messages were assigned to when the intent was created.
     *         </p>
     *         </li>
     * @see MessageFormatType
     */

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        The format of the response message. One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from
     *        the groups that messages were assigned to when the intent was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatType
     */

    public PostContentResult withMessageFormat(String messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        The format of the response message. One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from
     *        the groups that messages were assigned to when the intent was created.
     *        </p>
     *        </li>
     * @see MessageFormatType
     */

    public void setMessageFormat(MessageFormatType messageFormat) {
        withMessageFormat(messageFormat);
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from the
     * groups that messages were assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        The format of the response message. One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages from
     *        the groups that messages were assigned to when the intent was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatType
     */

    public PostContentResult withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     *        <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     *        </p>
     *        <p>
     *        For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *        intent from this utterance, it will return this dialog state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     *        </p>
     *        <p>
     *        For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or
     *        "no" response, a user might respond with additional information. For example,
     *        "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such
     *        additional information (in these examples, update the crust type slot or change the intent from OrderPizza
     *        to OrderDrink).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        <p>
     *        For example, suppose that in the response Amazon Lex sends this message:
     *        "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might
     *        also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can
     *        process such additional information appropriately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user failed.
     *        </p>
     *        <p>
     *        This can happen for various reasons, including that the user does not provide an appropriate response to
     *        prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific
     *        information), or if the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li>
     * @see DialogState
     */

    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     *         <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following
     *         examples:
     *         </p>
     *         <p>
     *         For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the
     *         user intent from this utterance, it will return this dialog state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     *         </p>
     *         <p>
     *         For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or
     *         "no" response, a user might respond with additional information. For example,
     *         "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such
     *         additional information (in these examples, update the crust type slot or change the intent from
     *         OrderPizza to OrderDrink).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *         </p>
     *         <p>
     *         For example, suppose that in the response Amazon Lex sends this message:
     *         "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user
     *         might also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex
     *         can process such additional information appropriately.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - Conveys that the conversation with the user failed.
     *         </p>
     *         <p>
     *         This can happen for various reasons, including that the user does not provide an appropriate response to
     *         prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific
     *         information), or if the Lambda function fails to fulfill the intent.
     *         </p>
     *         </li>
     * @see DialogState
     */

    public String getDialogState() {
        return this.dialogState;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     *        <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     *        </p>
     *        <p>
     *        For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *        intent from this utterance, it will return this dialog state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     *        </p>
     *        <p>
     *        For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or
     *        "no" response, a user might respond with additional information. For example,
     *        "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such
     *        additional information (in these examples, update the crust type slot or change the intent from OrderPizza
     *        to OrderDrink).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        <p>
     *        For example, suppose that in the response Amazon Lex sends this message:
     *        "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might
     *        also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can
     *        process such additional information appropriately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user failed.
     *        </p>
     *        <p>
     *        This can happen for various reasons, including that the user does not provide an appropriate response to
     *        prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific
     *        information), or if the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PostContentResult withDialogState(String dialogState) {
        setDialogState(dialogState);
        return this;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     *        <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     *        </p>
     *        <p>
     *        For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *        intent from this utterance, it will return this dialog state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     *        </p>
     *        <p>
     *        For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or
     *        "no" response, a user might respond with additional information. For example,
     *        "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such
     *        additional information (in these examples, update the crust type slot or change the intent from OrderPizza
     *        to OrderDrink).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        <p>
     *        For example, suppose that in the response Amazon Lex sends this message:
     *        "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might
     *        also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can
     *        process such additional information appropriately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user failed.
     *        </p>
     *        <p>
     *        This can happen for various reasons, including that the user does not provide an appropriate response to
     *        prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific
     *        information), or if the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li>
     * @see DialogState
     */

    public void setDialogState(DialogState dialogState) {
        withDialogState(dialogState);
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     * <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent
     * from this utterance, it will return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no"
     * response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza"
     * or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update
     * the crust type slot or change the intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A
     * user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the
     * response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not provide an appropriate response to prompts
     * from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if
     * the Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Identifies the current state of the user interaction. Amazon Lex returns one of the following values as
     *        <code>dialogState</code>. The client can optionally use this information to customize the user interface.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent. Consider the following examples:
     *        </p>
     *        <p>
     *        For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *        intent from this utterance, it will return this dialog state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response.
     *        </p>
     *        <p>
     *        For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or
     *        "no" response, a user might respond with additional information. For example,
     *        "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such
     *        additional information (in these examples, update the crust type slot or change the intent from OrderPizza
     *        to OrderDrink).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        <p>
     *        For example, suppose that in the response Amazon Lex sends this message:
     *        "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might
     *        also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can
     *        process such additional information appropriately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has successfully fulfilled the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user failed.
     *        </p>
     *        <p>
     *        This can happen for various reasons, including that the user does not provide an appropriate response to
     *        prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific
     *        information), or if the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PostContentResult withDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     * Lex is eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *        Amazon Lex is eliciting a value.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     * Lex is eliciting a value.
     * </p>
     * 
     * @return If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *         Amazon Lex is eliciting a value.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     * Lex is eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *        Amazon Lex is eliciting a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     * <code>encodedInputTranscript</code> field instead.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * 
     * @param inputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *        it-IT locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     *        <code>encodedInputTranscript</code> field instead.
     *        </p>
     *        <p>
     *        If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *        the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *        can use this information to determine if Amazon Lex is correctly processing the audio that you send.
     */
    @Deprecated
    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     * <code>encodedInputTranscript</code> field instead.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * 
     * @return The text used to process the request.</p>
     *         <p>
     *         You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *         it-IT locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     *         <code>encodedInputTranscript</code> field instead.
     *         </p>
     *         <p>
     *         If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *         the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *         can use this information to determine if Amazon Lex is correctly processing the audio that you send.
     */
    @Deprecated
    public String getInputTranscript() {
        return this.inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT
     * locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     * <code>encodedInputTranscript</code> field instead.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from the
     * audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this
     * information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * 
     * @param inputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        You can use this field only in the de-DE, en-AU, en-GB, en-US, es-419, es-ES, es-US, fr-CA, fr-FR, and
     *        it-IT locales. In all other locales, the <code>inputTranscript</code> field is null. You should use the
     *        <code>encodedInputTranscript</code> field instead.
     *        </p>
     *        <p>
     *        If the input was an audio stream, the <code>inputTranscript</code> field contains the text extracted from
     *        the audio stream. This is the text that is actually processed to recognize intents and slot values. You
     *        can use this information to determine if Amazon Lex is correctly processing the audio that you send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public PostContentResult withInputTranscript(String inputTranscript) {
        setInputTranscript(inputTranscript);
        return this;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text extracted from
     * the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can use
     * the value.
     * </p>
     * 
     * @param encodedInputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text
     *        extracted from the audio stream. This is the text that is actually processed to recognize intents and slot
     *        values. You can use this information to determine if Amazon Lex is correctly processing the audio that you
     *        send.
     *        </p>
     *        <p>
     *        The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can
     *        use the value.
     */

    public void setEncodedInputTranscript(String encodedInputTranscript) {
        this.encodedInputTranscript = encodedInputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text extracted from
     * the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can use
     * the value.
     * </p>
     * 
     * @return The text used to process the request.</p>
     *         <p>
     *         If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text
     *         extracted from the audio stream. This is the text that is actually processed to recognize intents and
     *         slot values. You can use this information to determine if Amazon Lex is correctly processing the audio
     *         that you send.
     *         </p>
     *         <p>
     *         The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you
     *         can use the value.
     */

    public String getEncodedInputTranscript() {
        return this.encodedInputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text extracted from
     * the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the audio that you send.
     * </p>
     * <p>
     * The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can use
     * the value.
     * </p>
     * 
     * @param encodedInputTranscript
     *        The text used to process the request.</p>
     *        <p>
     *        If the input was an audio stream, the <code>encodedInputTranscript</code> field contains the text
     *        extracted from the audio stream. This is the text that is actually processed to recognize intents and slot
     *        values. You can use this information to determine if Amazon Lex is correctly processing the audio that you
     *        send.
     *        </p>
     *        <p>
     *        The <code>encodedInputTranscript</code> field is base-64 encoded. You must decode the field before you can
     *        use the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withEncodedInputTranscript(String encodedInputTranscript) {
        setEncodedInputTranscript(encodedInputTranscript);
        return this;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For example,
     * if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     * 
     * @param audioStream
     *        The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For
     *        example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     *        configured for the bot. If the intent requires confirmation before taking the fulfillment action, it sends
     *        the <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully
     *        fulfilled the intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the
     *        response.
     */

    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For example,
     * if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     * 
     * @return The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For
     *         example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     *         configured for the bot. If the intent requires confirmation before taking the fulfillment action, it
     *         sends the <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully
     *         fulfilled the intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the
     *         response.
     */

    public java.io.InputStream getAudioStream() {
        return this.audioStream;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For example,
     * if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code> configured for
     * the bot. If the intent requires confirmation before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     * 
     * @param audioStream
     *        The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For
     *        example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     *        configured for the bot. If the intent requires confirmation before taking the fulfillment action, it sends
     *        the <code>confirmationPrompt</code>. Another example: Suppose that the Lambda function successfully
     *        fulfilled the intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withAudioStream(java.io.InputStream audioStream) {
        setAudioStream(audioStream);
        return this;
    }

    /**
     * <p>
     * The version of the bot that responded to the conversation. You can use this information to help determine if one
     * version of a bot is performing better than another version.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that responded to the conversation. You can use this information to help determine
     *        if one version of a bot is performing better than another version.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that responded to the conversation. You can use this information to help determine if one
     * version of a bot is performing better than another version.
     * </p>
     * 
     * @return The version of the bot that responded to the conversation. You can use this information to help determine
     *         if one version of a bot is performing better than another version.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that responded to the conversation. You can use this information to help determine if one
     * version of a bot is performing better than another version.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that responded to the conversation. You can use this information to help determine
     *        if one version of a bot is performing better than another version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier for the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @return The unique identifier for the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the
     * <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an intent, or to modify the operation of your
     * application.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param activeContexts
     *        A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling
     *        the <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.</p>
     *        <p>
     *        You can use a context to control the intents that can follow up an intent, or to modify the operation of
     *        your application.
     */

    public void setActiveContexts(String activeContexts) {
        this.activeContexts = activeContexts;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the
     * <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an intent, or to modify the operation of your
     * application.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling
     *         the <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.</p>
     *         <p>
     *         You can use a context to control the intents that can follow up an intent, or to modify the operation of
     *         your application.
     */

    public String getActiveContexts() {
        return this.activeContexts;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the
     * <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an intent, or to modify the operation of your
     * application.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param activeContexts
     *        A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling
     *        the <code>PostContent</code>, <code>PostText</code>, or <code>PutSession</code> operation.</p>
     *        <p>
     *        You can use a context to control the intents that can follow up an intent, or to modify the operation of
     *        your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentResult withActiveContexts(String activeContexts) {
        setActiveContexts(activeContexts);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getNluIntentConfidence() != null)
            sb.append("NluIntentConfidence: ").append(getNluIntentConfidence()).append(",");
        if (getAlternativeIntents() != null)
            sb.append("AlternativeIntents: ").append(getAlternativeIntents()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getSentimentResponse() != null)
            sb.append("SentimentResponse: ").append(getSentimentResponse()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getEncodedMessage() != null)
            sb.append("EncodedMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat()).append(",");
        if (getDialogState() != null)
            sb.append("DialogState: ").append(getDialogState()).append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getInputTranscript() != null)
            sb.append("InputTranscript: ").append(getInputTranscript()).append(",");
        if (getEncodedInputTranscript() != null)
            sb.append("EncodedInputTranscript: ").append("***Sensitive Data Redacted***").append(",");
        if (getAudioStream() != null)
            sb.append("AudioStream: ").append(getAudioStream()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getActiveContexts() != null)
            sb.append("ActiveContexts: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostContentResult == false)
            return false;
        PostContentResult other = (PostContentResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getNluIntentConfidence() == null ^ this.getNluIntentConfidence() == null)
            return false;
        if (other.getNluIntentConfidence() != null && other.getNluIntentConfidence().equals(this.getNluIntentConfidence()) == false)
            return false;
        if (other.getAlternativeIntents() == null ^ this.getAlternativeIntents() == null)
            return false;
        if (other.getAlternativeIntents() != null && other.getAlternativeIntents().equals(this.getAlternativeIntents()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getSentimentResponse() == null ^ this.getSentimentResponse() == null)
            return false;
        if (other.getSentimentResponse() != null && other.getSentimentResponse().equals(this.getSentimentResponse()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEncodedMessage() == null ^ this.getEncodedMessage() == null)
            return false;
        if (other.getEncodedMessage() != null && other.getEncodedMessage().equals(this.getEncodedMessage()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        if (other.getDialogState() == null ^ this.getDialogState() == null)
            return false;
        if (other.getDialogState() != null && other.getDialogState().equals(this.getDialogState()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getInputTranscript() == null ^ this.getInputTranscript() == null)
            return false;
        if (other.getInputTranscript() != null && other.getInputTranscript().equals(this.getInputTranscript()) == false)
            return false;
        if (other.getEncodedInputTranscript() == null ^ this.getEncodedInputTranscript() == null)
            return false;
        if (other.getEncodedInputTranscript() != null && other.getEncodedInputTranscript().equals(this.getEncodedInputTranscript()) == false)
            return false;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidence() == null) ? 0 : getNluIntentConfidence().hashCode());
        hashCode = prime * hashCode + ((getAlternativeIntents() == null) ? 0 : getAlternativeIntents().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getSentimentResponse() == null) ? 0 : getSentimentResponse().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEncodedMessage() == null) ? 0 : getEncodedMessage().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode + ((getDialogState() == null) ? 0 : getDialogState().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getInputTranscript() == null) ? 0 : getInputTranscript().hashCode());
        hashCode = prime * hashCode + ((getEncodedInputTranscript() == null) ? 0 : getEncodedInputTranscript().hashCode());
        hashCode = prime * hashCode + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        return hashCode;
    }

    @Override
    public PostContentResult clone() {
        try {
            return (PostContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
