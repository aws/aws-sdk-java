/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PutSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the request.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The name of the current intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     */
    private String slots;
    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     */
    private String sessionAttributes;
    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     */
    private String message;
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
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     * fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     * reasons, including the user does not provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     */
    private String dialogState;
    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex is
     * eliciting a value.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     */
    private java.io.InputStream audioStream;
    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     */
    private String sessionId;

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

    public PutSessionResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     * 
     * @param intentName
     *        The name of the current intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     * 
     * @return The name of the current intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     * 
     * @param intentName
     *        The name of the current intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default is
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
     *        Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.</p>
     *        <p>
     *        Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *        determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *        If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *        user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *        is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *        there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default
     *        is <code>ORIGINAL_VALUE</code>.
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.</p>
     *         <p>
     *         Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *         determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *         If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *         user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *         is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *         there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default
     *         is <code>ORIGINAL_VALUE</code>.
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined
     * by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated. If
     * <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the user is
     * returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code> is set to
     * <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if there is no
     * resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default is
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
     *        Map of zero or more intent slots Amazon Lex detected from the user input during the conversation.</p>
     *        <p>
     *        Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is
     *        determined by the <code>valueSelectionStrategy</code> selected when the slot type was created or updated.
     *        If <code>valueSelectionStrategy</code> is set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *        user is returned, if the user value is similar to the slot values. If <code>valueSelectionStrategy</code>
     *        is set to <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in the resolution list or, if
     *        there is no resolution list, null. If you don't specify a <code>valueSelectionStrategy</code> the default
     *        is <code>ORIGINAL_VALUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
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
     *        Map of key/value pairs representing session-specific context information.
     */

    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Map of key/value pairs representing session-specific context information.
     */

    public String getSessionAttributes() {
        return this.sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
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
     *        Map of key/value pairs representing session-specific context information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSessionAttributes(String sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * 
     * @param message
     *        The next message that should be presented to the user.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * 
     * @return The next message that should be presented to the user.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * 
     * @param message
     *        The next message that should be presented to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withMessage(String message) {
        setMessage(message);
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

    public PutSessionResult withMessageFormat(String messageFormat) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatType
     */

    public PutSessionResult withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     * fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     * reasons, including the user does not provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     *        fulfilling an intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     *        reasons, including the user does not provide an appropriate response to prompts from the service, or if
     *        the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     *        </p>
     *        </li>
     * @see DialogState
     */

    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     * fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     * reasons, including the user does not provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <ul>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent
     *         before fulfilling an intent.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     *         reasons, including the user does not provide an appropriate response to prompts from the service, or if
     *         the Lambda function fails to fulfill the intent.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     *         </p>
     *         </li>
     * @see DialogState
     */

    public String getDialogState() {
        return this.dialogState;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     * fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     * reasons, including the user does not provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     *        fulfilling an intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     *        reasons, including the user does not provide an appropriate response to prompts from the service, or if
     *        the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PutSessionResult withDialogState(String dialogState) {
        setDialogState(dialogState);
        return this;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     * fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     * reasons, including the user does not provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before
     *        fulfilling an intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for the current intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Failed</code> - Conveys that the conversation with the user has failed. This can happen for various
     *        reasons, including the user does not provide an appropriate response to prompts from the service, or if
     *        the Lambda function fails to fulfill the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully fulfilled the intent.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PutSessionResult withDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex is
     * eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     *        Lex is eliciting a value.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex is
     * eliciting a value.
     * </p>
     * 
     * @return If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     *         Lex is eliciting a value.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex is
     * eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the name of the slot for which Amazon
     *        Lex is eliciting a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     * 
     * @param audioStream
     *        The audio version of the message to convey to the user.
     */

    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     * 
     * @return The audio version of the message to convey to the user.
     */

    public java.io.InputStream getAudioStream() {
        return this.audioStream;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     * 
     * @param audioStream
     *        The audio version of the message to convey to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withAudioStream(java.io.InputStream audioStream) {
        setAudioStream(audioStream);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        A unique identifier for the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @return A unique identifier for the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        A unique identifier for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat()).append(",");
        if (getDialogState() != null)
            sb.append("DialogState: ").append(getDialogState()).append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getAudioStream() != null)
            sb.append("AudioStream: ").append(getAudioStream()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionResult == false)
            return false;
        PutSessionResult other = (PutSessionResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode + ((getDialogState() == null) ? 0 : getDialogState().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public PutSessionResult clone() {
        try {
            return (PutSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
