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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     * </p>
     */
    private java.util.Map<String, String> slots;
    /**
     * <p>
     * Map of key value pairs representing the session specific context information.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the application configuration and context. For
     * example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. In another example, if the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Suppose the Lambda function successfully
     * fulfilled the intent, and sent a message to convey to the user. In that situation, Amazon Lex sends that message
     * in the response.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     */
    private String dialogState;
    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex
     * is eliciting a value.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the response
     * only if the <code>dialogState</code> value indicates that a user response is expected.
     * </p>
     */
    private ResponseCard responseCard;

    /**
     * <p>
     * Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     * </p>
     * 
     * @param intentName
     *        Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     * </p>
     * 
     * @return Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     * </p>
     * 
     * @param intentName
     *        Intent Amazon Lex inferred from the user input text. This is one of the intents configured for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     * </p>
     * 
     * @return Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     */

    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     * </p>
     * 
     * @param slots
     *        Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     */

    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     * </p>
     * 
     * @param slots
     *        Intent slots (name/value pairs) Amazon Lex detected so far from the user input in the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withSlots(java.util.Map<String, String> slots) {
        setSlots(slots);
        return this;
    }

    public PostTextResult addSlotsEntry(String key, String value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, String>();
        }
        if (this.slots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.slots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Slots.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult clearSlotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * Map of key value pairs representing the session specific context information.
     * </p>
     * 
     * @return Map of key value pairs representing the session specific context information.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key value pairs representing the session specific context information.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key value pairs representing the session specific context information.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key value pairs representing the session specific context information.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key value pairs representing the session specific context information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    public PostTextResult addSessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the application configuration and context. For
     * example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. In another example, if the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Suppose the Lambda function successfully
     * fulfilled the intent, and sent a message to convey to the user. In that situation, Amazon Lex sends that message
     * in the response.
     * </p>
     * 
     * @param message
     *        Prompt (or statement) to convey to the user. This is based on the application configuration and context.
     *        For example, if Amazon Lex did not understand the user intent, it sends the
     *        <code>clarificationPrompt</code> configured for the application. In another example, if the intent
     *        requires confirmation before taking the fulfillment action, it sends the <code>confirmationPrompt</code>.
     *        Suppose the Lambda function successfully fulfilled the intent, and sent a message to convey to the user.
     *        In that situation, Amazon Lex sends that message in the response.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the application configuration and context. For
     * example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. In another example, if the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Suppose the Lambda function successfully
     * fulfilled the intent, and sent a message to convey to the user. In that situation, Amazon Lex sends that message
     * in the response.
     * </p>
     * 
     * @return Prompt (or statement) to convey to the user. This is based on the application configuration and context.
     *         For example, if Amazon Lex did not understand the user intent, it sends the
     *         <code>clarificationPrompt</code> configured for the application. In another example, if the intent
     *         requires confirmation before taking the fulfillment action, it sends the <code>confirmationPrompt</code>.
     *         Suppose the Lambda function successfully fulfilled the intent, and sent a message to convey to the user.
     *         In that situation, Amazon Lex sends that message in the response.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the application configuration and context. For
     * example, if Amazon Lex did not understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. In another example, if the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Suppose the Lambda function successfully
     * fulfilled the intent, and sent a message to convey to the user. In that situation, Amazon Lex sends that message
     * in the response.
     * </p>
     * 
     * @param message
     *        Prompt (or statement) to convey to the user. This is based on the application configuration and context.
     *        For example, if Amazon Lex did not understand the user intent, it sends the
     *        <code>clarificationPrompt</code> configured for the application. In another example, if the intent
     *        requires confirmation before taking the fulfillment action, it sends the <code>confirmationPrompt</code>.
     *        Suppose the Lambda function successfully fulfilled the intent, and sent a message to convey to the user.
     *        In that situation, Amazon Lex sends that message in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Represents the message type to be conveyed to the user. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not
     *        understand the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If
     *        Amazon Lex doesn't understand the intent, it returns this <code>dialogState</code>. Another example is
     *        when your intent is configured with a follow up prompt. For example, after OrderPizza intent is fulfilled,
     *        the intent might have a follow up prompt such as " Do you want to order a drink or desert?" In this case,
     *        Amazon Lex returns this <code>dialogState</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to
     *        go ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no
     *        reply, the user might provide a response with additional slot information (either new slot information or
     *        changes to the existing slot values). For example, "Yes, but change to thick crust." Amazon Lex
     *        understands the additional information and updates the intent slots accordingly.
     *        </p>
     *        <p>
     *        Consider another example. Before fulfilling an order, your application might prompt for confirmation such
     *        as "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon
     *        Lex recognizes the new OrderDrink intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example,
     *        suppose Amazon Lex asks, "What size pizza would you like?" A user might reply with
     *        "Medium pepperoni pizza." Amazon Lex recognizes the size and the topping as the two separate slot values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     *        function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to
     *        the client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the
     *        intent.
     *        </p>
     *        <p>
     *        If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex
     *        throws a bad request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent.
     *        This is the case when the current intent is configured with <code>ReturnIntent</code> as the
     *        <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Conversation with the user failed. Some of the reasons for this
     *        <code>dialogState</code> are: after the configured number of attempts the user didn't provide an
     *        appropriate response, or the Lambda function failed to fulfill an intent.
     *        </p>
     *        </li>
     * @see DialogState
     */

    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Represents the message type to be conveyed to the user. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not
     *         understand the first utterances such as "I want to order pizza", which indicates the OrderPizza intent.
     *         If Amazon Lex doesn't understand the intent, it returns this <code>dialogState</code>. Another example is
     *         when your intent is configured with a follow up prompt. For example, after OrderPizza intent is
     *         fulfilled, the intent might have a follow up prompt such as " Do you want to order a drink or desert?" In
     *         this case, Amazon Lex returns this <code>dialogState</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether
     *         to go ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a
     *         yes/no reply, the user might provide a response with additional slot information (either new slot
     *         information or changes to the existing slot values). For example, "Yes, but change to thick crust."
     *         Amazon Lex understands the additional information and updates the intent slots accordingly.
     *         </p>
     *         <p>
     *         Consider another example. Before fulfilling an order, your application might prompt for confirmation such
     *         as "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon
     *         Lex recognizes the new OrderDrink intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example,
     *         suppose Amazon Lex asks, "What size pizza would you like?" A user might reply with
     *         "Medium pepperoni pizza." Amazon Lex recognizes the size and the topping as the two separate slot values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If
     *         Lambda function returns a statement/message to convey the fulfillment result, Amazon Lex passes this
     *         string to the client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured
     *         for the intent.
     *         </p>
     *         <p>
     *         If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex
     *         throws a bad request exception.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent.
     *         This is the case when the current intent is configured with <code>ReturnIntent</code> as the
     *         <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> – Conversation with the user failed. Some of the reasons for this
     *         <code>dialogState</code> are: after the configured number of attempts the user didn't provide an
     *         appropriate response, or the Lambda function failed to fulfill an intent.
     *         </p>
     *         </li>
     * @see DialogState
     */

    public String getDialogState() {
        return this.dialogState;
    }

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Represents the message type to be conveyed to the user. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not
     *        understand the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If
     *        Amazon Lex doesn't understand the intent, it returns this <code>dialogState</code>. Another example is
     *        when your intent is configured with a follow up prompt. For example, after OrderPizza intent is fulfilled,
     *        the intent might have a follow up prompt such as " Do you want to order a drink or desert?" In this case,
     *        Amazon Lex returns this <code>dialogState</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to
     *        go ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no
     *        reply, the user might provide a response with additional slot information (either new slot information or
     *        changes to the existing slot values). For example, "Yes, but change to thick crust." Amazon Lex
     *        understands the additional information and updates the intent slots accordingly.
     *        </p>
     *        <p>
     *        Consider another example. Before fulfilling an order, your application might prompt for confirmation such
     *        as "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon
     *        Lex recognizes the new OrderDrink intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example,
     *        suppose Amazon Lex asks, "What size pizza would you like?" A user might reply with
     *        "Medium pepperoni pizza." Amazon Lex recognizes the size and the topping as the two separate slot values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     *        function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to
     *        the client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the
     *        intent.
     *        </p>
     *        <p>
     *        If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex
     *        throws a bad request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent.
     *        This is the case when the current intent is configured with <code>ReturnIntent</code> as the
     *        <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Conversation with the user failed. Some of the reasons for this
     *        <code>dialogState</code> are: after the configured number of attempts the user didn't provide an
     *        appropriate response, or the Lambda function failed to fulfill an intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PostTextResult withDialogState(String dialogState) {
        setDialogState(dialogState);
        return this;
    }

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Represents the message type to be conveyed to the user. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not
     *        understand the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If
     *        Amazon Lex doesn't understand the intent, it returns this <code>dialogState</code>. Another example is
     *        when your intent is configured with a follow up prompt. For example, after OrderPizza intent is fulfilled,
     *        the intent might have a follow up prompt such as " Do you want to order a drink or desert?" In this case,
     *        Amazon Lex returns this <code>dialogState</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to
     *        go ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no
     *        reply, the user might provide a response with additional slot information (either new slot information or
     *        changes to the existing slot values). For example, "Yes, but change to thick crust." Amazon Lex
     *        understands the additional information and updates the intent slots accordingly.
     *        </p>
     *        <p>
     *        Consider another example. Before fulfilling an order, your application might prompt for confirmation such
     *        as "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon
     *        Lex recognizes the new OrderDrink intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example,
     *        suppose Amazon Lex asks, "What size pizza would you like?" A user might reply with
     *        "Medium pepperoni pizza." Amazon Lex recognizes the size and the topping as the two separate slot values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     *        function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to
     *        the client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the
     *        intent.
     *        </p>
     *        <p>
     *        If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex
     *        throws a bad request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent.
     *        This is the case when the current intent is configured with <code>ReturnIntent</code> as the
     *        <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Conversation with the user failed. Some of the reasons for this
     *        <code>dialogState</code> are: after the configured number of attempts the user didn't provide an
     *        appropriate response, or the Lambda function failed to fulfill an intent.
     *        </p>
     *        </li>
     * @see DialogState
     */

    public void setDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
    }

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not understand
     * the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If Amazon Lex
     * doesn't understand the intent, it returns this <code>dialogState</code>. Another example is when your intent is
     * configured with a follow up prompt. For example, after OrderPizza intent is fulfilled, the intent might have a
     * follow up prompt such as " Do you want to order a drink or desert?" In this case, Amazon Lex returns this
     * <code>dialogState</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to go
     * ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no reply,
     * the user might provide a response with additional slot information (either new slot information or changes to the
     * existing slot values). For example, "Yes, but change to thick crust." Amazon Lex understands the additional
     * information and updates the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application might prompt for confirmation such as
     * "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon Lex
     * recognizes the new OrderDrink intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example, suppose
     * Amazon Lex asks, "What size pizza would you like?" A user might reply with "Medium pepperoni pizza." Amazon Lex
     * recognizes the size and the topping as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     * function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to the
     * client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex throws a
     * bad request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent. This is
     * the case when the current intent is configured with <code>ReturnIntent</code> as the
     * <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the reasons for this <code>dialogState</code>
     * are: after the configured number of attempts the user didn't provide an appropriate response, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dialogState
     *        Represents the message type to be conveyed to the user. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> – Amazon Lex wants to elicit user intent. For example, Amazon Lex did not
     *        understand the first utterances such as "I want to order pizza", which indicates the OrderPizza intent. If
     *        Amazon Lex doesn't understand the intent, it returns this <code>dialogState</code>. Another example is
     *        when your intent is configured with a follow up prompt. For example, after OrderPizza intent is fulfilled,
     *        the intent might have a follow up prompt such as " Do you want to order a drink or desert?" In this case,
     *        Amazon Lex returns this <code>dialogState</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response from the user indicating whether to
     *        go ahead and fulfill the intent (for example, OK to go ahead and order the pizza). In addition to a yes/no
     *        reply, the user might provide a response with additional slot information (either new slot information or
     *        changes to the existing slot values). For example, "Yes, but change to thick crust." Amazon Lex
     *        understands the additional information and updates the intent slots accordingly.
     *        </p>
     *        <p>
     *        Consider another example. Before fulfilling an order, your application might prompt for confirmation such
     *        as "Do you want to place this pizza order?" A user might reply with "No, I want to order a drink." Amazon
     *        Lex recognizes the new OrderDrink intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for the current intent. For example,
     *        suppose Amazon Lex asks, "What size pizza would you like?" A user might reply with
     *        "Medium pepperoni pizza." Amazon Lex recognizes the size and the topping as the two separate slot values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> – Conveys that the Lambda function has successfully fulfilled the intent. If Lambda
     *        function returns a statement/message to convey the fulfillment result, Amazon Lex passes this string to
     *        the client. If not, Amazon Lex looks for <code>conclusionStatement</code> that you configured for the
     *        intent.
     *        </p>
     *        <p>
     *        If both the Lambda function statement and the <code>conclusionStatement</code> are missing, Amazon Lex
     *        throws a bad request exception.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> – conveys that the client has to do the fulfillment work for the intent.
     *        This is the case when the current intent is configured with <code>ReturnIntent</code> as the
     *        <code>fulfillmentActivity </code>, where Amazon Lex returns this state to client.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Conversation with the user failed. Some of the reasons for this
     *        <code>dialogState</code> are: after the configured number of attempts the user didn't provide an
     *        appropriate response, or the Lambda function failed to fulfill an intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogState
     */

    public PostTextResult withDialogState(DialogState dialogState) {
        setDialogState(dialogState);
        return this;
    }

    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex
     * is eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *        Amazon Lex is eliciting a value.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex
     * is eliciting a value.
     * </p>
     * 
     * @return If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *         Amazon Lex is eliciting a value.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which Amazon Lex
     * is eliciting a value.
     * </p>
     * 
     * @param slotToElicit
     *        If <code>dialogState</code> value is <code>ElicitSlot</code>, returns the name of the slot for which
     *        Amazon Lex is eliciting a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the response
     * only if the <code>dialogState</code> value indicates that a user response is expected.
     * </p>
     * 
     * @param responseCard
     *        Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the
     *        response only if the <code>dialogState</code> value indicates that a user response is expected.
     */

    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the response
     * only if the <code>dialogState</code> value indicates that a user response is expected.
     * </p>
     * 
     * @return Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the
     *         response only if the <code>dialogState</code> value indicates that a user response is expected.
     */

    public ResponseCard getResponseCard() {
        return this.responseCard;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the response
     * only if the <code>dialogState</code> value indicates that a user response is expected.
     * </p>
     * 
     * @param responseCard
     *        Represents the options that the user has to respond to the current prompt. Amazon Lex sends this in the
     *        response only if the <code>dialogState</code> value indicates that a user response is expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextResult withResponseCard(ResponseCard responseCard) {
        setResponseCard(responseCard);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getDialogState() != null)
            sb.append("DialogState: ").append(getDialogState()).append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getResponseCard() != null)
            sb.append("ResponseCard: ").append(getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTextResult == false)
            return false;
        PostTextResult other = (PostTextResult) obj;
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
        if (other.getDialogState() == null ^ this.getDialogState() == null)
            return false;
        if (other.getDialogState() != null && other.getDialogState().equals(this.getDialogState()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDialogState() == null) ? 0 : getDialogState().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public PostTextResult clone() {
        try {
            return (PostTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
