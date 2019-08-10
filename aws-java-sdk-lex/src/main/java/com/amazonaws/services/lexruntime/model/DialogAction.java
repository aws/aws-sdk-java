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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the next action that the bot should take in its interaction with the user and provides information about
 * the context in which the action takes place. Use the <code>DialogAction</code> data type to set the interaction to a
 * specific state, or to return the interaction to a previous state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/DialogAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialogAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     */
    private java.util.Map<String, String> slots;
    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the intent
     * ready to be fulfilled by the client application.
     * </p>
     * </li>
     * </ul>
     */
    private String fulfillmentState;
    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message
     * configured for the intent.
     * </p>
     */
    private String message;
    /**
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
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For more
     * information, see <a href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message
     * Groups</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String messageFormat;

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that the there will not be a response from the user. For example, the
     *        statement "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @see DialogActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *         fulfilled. This is a yes/no question such as "Place the order?"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Close</code> - Indicates that the there will not be a response from the user. For example, the
     *         statement "Your order has been placed" does not require a response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Delegate</code> - The next action is determined by Amazon Lex.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *         </p>
     *         </li>
     * @see DialogActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that the there will not be a response from the user. For example, the
     *        statement "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that the there will not be a response from the user. For example, the
     *        statement "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to determine the intent that the user wants to fulfill.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(DialogActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @return The name of the intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     * 
     * @return Map of the slots that have been gathered and their values.
     */

    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     * 
     * @param slots
     *        Map of the slots that have been gathered and their values.
     */

    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     * 
     * @param slots
     *        Map of the slots that have been gathered and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSlots(java.util.Map<String, String> slots) {
        setSlots(slots);
        return this;
    }

    public DialogAction addSlotsEntry(String key, String value) {
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

    public DialogAction clearSlotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param slotToElicit
     *        The name of the slot that should be elicited from the user.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @return The name of the slot that should be elicited from the user.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param slotToElicit
     *        The name of the slot that should be elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the intent
     * ready to be fulfilled by the client application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fulfillmentState
     *        The fulfillment state of the intent. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the
     *        intent ready to be fulfilled by the client application.
     *        </p>
     *        </li>
     * @see FulfillmentState
     */

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the intent
     * ready to be fulfilled by the client application.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The fulfillment state of the intent. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the
     *         intent ready to be fulfilled by the client application.
     *         </p>
     *         </li>
     * @see FulfillmentState
     */

    public String getFulfillmentState() {
        return this.fulfillmentState;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the intent
     * ready to be fulfilled by the client application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fulfillmentState
     *        The fulfillment state of the intent. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the
     *        intent ready to be fulfilled by the client application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FulfillmentState
     */

    public DialogAction withFulfillmentState(String fulfillmentState) {
        setFulfillmentState(fulfillmentState);
        return this;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the intent
     * ready to be fulfilled by the client application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fulfillmentState
     *        The fulfillment state of the intent. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The Lambda function associated with the intent failed to fulfill the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fulfilled</code> - The intent has fulfilled by the Lambda function associated with the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadyForFulfillment</code> - All of the information necessary for the intent is present and the
     *        intent ready to be fulfilled by the client application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FulfillmentState
     */

    public DialogAction withFulfillmentState(FulfillmentState fulfillmentState) {
        this.fulfillmentState = fulfillmentState.toString();
        return this;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message
     * configured for the intent.
     * </p>
     * 
     * @param message
     *        The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the
     *        message configured for the intent.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message
     * configured for the intent.
     * </p>
     * 
     * @return The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the
     *         message configured for the intent.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message
     * configured for the intent.
     * </p>
     * 
     * @param message
     *        The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the
     *        message configured for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
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
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For more
     * information, see <a href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message
     * Groups</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message Groups</a>.
     *        </p>
     *        </li>
     * @see MessageFormatType
     */

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
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
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For more
     * information, see <a href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message
     * Groups</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <li>
     *         <p>
     *         <code>PlainText</code> - The message contains plain UTF-8 text.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>CustomPayload</code> - The message is a custom format for the client.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>SSML</code> - The message contains text formatted for voice output.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message Groups</a>.
     *         </p>
     *         </li>
     * @see MessageFormatType
     */

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
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
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For more
     * information, see <a href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message
     * Groups</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message Groups</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatType
     */

    public DialogAction withMessageFormat(String messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
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
     * <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For more
     * information, see <a href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message
     * Groups</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageFormat
     *        <li>
     *        <p>
     *        <code>PlainText</code> - The message contains plain UTF-8 text.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>CustomPayload</code> - The message is a custom format for the client.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SSML</code> - The message contains text formatted for voice output.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>Composite</code> - The message contains an escaped JSON object containing one or more messages. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html">Message Groups</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatType
     */

    public DialogAction withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append("***Sensitive Data Redacted***").append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getFulfillmentState() != null)
            sb.append("FulfillmentState: ").append(getFulfillmentState()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialogAction == false)
            return false;
        DialogAction other = (DialogAction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getFulfillmentState() == null ^ this.getFulfillmentState() == null)
            return false;
        if (other.getFulfillmentState() != null && other.getFulfillmentState().equals(this.getFulfillmentState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentState() == null) ? 0 : getFulfillmentState().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        return hashCode;
    }

    @Override
    public DialogAction clone() {
        try {
            return (DialogAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntime.model.transform.DialogActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
