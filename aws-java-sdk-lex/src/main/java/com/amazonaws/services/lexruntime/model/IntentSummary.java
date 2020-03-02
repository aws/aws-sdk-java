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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the state of an intent. You can use this information to get the current state of an intent
 * so that you can process the intent, or so that you can return the intent to its previous state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/IntentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to filter
     * the intents returned by the operation to those with only the specified label.
     * </p>
     */
    private String checkpointLabel;
    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     */
    private java.util.Map<String, String> slots;
    /**
     * <p>
     * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent,
     * Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets this value
     * to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the intent is
     * complete and that it is ready to be fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did not
     * confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     */
    private String confirmationStatus;
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
    private String dialogActionType;
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
     * The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     * </p>
     */
    private String slotToElicit;

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

    public IntentSummary withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to filter
     * the intents returned by the operation to those with only the specified label.
     * </p>
     * 
     * @param checkpointLabel
     *        A user-defined label that identifies a particular intent. You can use this label to return to a previous
     *        intent. </p>
     *        <p>
     *        Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to
     *        filter the intents returned by the operation to those with only the specified label.
     */

    public void setCheckpointLabel(String checkpointLabel) {
        this.checkpointLabel = checkpointLabel;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to filter
     * the intents returned by the operation to those with only the specified label.
     * </p>
     * 
     * @return A user-defined label that identifies a particular intent. You can use this label to return to a previous
     *         intent. </p>
     *         <p>
     *         Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to
     *         filter the intents returned by the operation to those with only the specified label.
     */

    public String getCheckpointLabel() {
        return this.checkpointLabel;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to filter
     * the intents returned by the operation to those with only the specified label.
     * </p>
     * 
     * @param checkpointLabel
     *        A user-defined label that identifies a particular intent. You can use this label to return to a previous
     *        intent. </p>
     *        <p>
     *        Use the <code>checkpointLabelFilter</code> parameter of the <code>GetSessionRequest</code> operation to
     *        filter the intents returned by the operation to those with only the specified label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withCheckpointLabel(String checkpointLabel) {
        setCheckpointLabel(checkpointLabel);
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

    public IntentSummary withSlots(java.util.Map<String, String> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * Add a single Slots entry
     *
     * @see IntentSummary#withSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary addSlotsEntry(String key, String value) {
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

    public IntentSummary clearSlotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent,
     * Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets this value
     * to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the intent is
     * complete and that it is ready to be fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did not
     * confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * 
     * @param confirmationStatus
     *        The status of the intent after the user responds to the confirmation prompt. If the user confirms the
     *        intent, Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex
     *        sets this value to <code>Denied</code>. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the
     *        intent is complete and that it is ready to be fulfilled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did
     *        not confirm or deny the prompt.
     *        </p>
     *        </li>
     * @see ConfirmationStatus
     */

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent,
     * Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets this value
     * to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the intent is
     * complete and that it is ready to be fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did not
     * confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the intent after the user responds to the confirmation prompt. If the user confirms the
     *         intent, Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex
     *         sets this value to <code>Denied</code>. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the
     *         intent is complete and that it is ready to be fulfilled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did
     *         not confirm or deny the prompt.
     *         </p>
     *         </li>
     * @see ConfirmationStatus
     */

    public String getConfirmationStatus() {
        return this.confirmationStatus;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent,
     * Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets this value
     * to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the intent is
     * complete and that it is ready to be fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did not
     * confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * 
     * @param confirmationStatus
     *        The status of the intent after the user responds to the confirmation prompt. If the user confirms the
     *        intent, Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex
     *        sets this value to <code>Denied</code>. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the
     *        intent is complete and that it is ready to be fulfilled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did
     *        not confirm or deny the prompt.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public IntentSummary withConfirmationStatus(String confirmationStatus) {
        setConfirmationStatus(confirmationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent,
     * Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets this value
     * to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the intent is
     * complete and that it is ready to be fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did not
     * confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * 
     * @param confirmationStatus
     *        The status of the intent after the user responds to the confirmation prompt. If the user confirms the
     *        intent, Amazon Lex sets this field to <code>Confirmed</code>. If the user denies the intent, Amazon Lex
     *        sets this value to <code>Denied</code>. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Confirmed</code> - The user has responded "Yes" to the confirmation prompt, confirming that the
     *        intent is complete and that it is ready to be fulfilled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Denied</code> - The user has responded "No" to the confirmation prompt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code> - The user has never been prompted for confirmation; or, the user was prompted but did
     *        not confirm or deny the prompt.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationStatus
     */

    public IntentSummary withConfirmationStatus(ConfirmationStatus confirmationStatus) {
        this.confirmationStatus = confirmationStatus.toString();
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
     * @param dialogActionType
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

    public void setDialogActionType(String dialogActionType) {
        this.dialogActionType = dialogActionType;
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

    public String getDialogActionType() {
        return this.dialogActionType;
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
     * @param dialogActionType
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

    public IntentSummary withDialogActionType(String dialogActionType) {
        setDialogActionType(dialogActionType);
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
     * @param dialogActionType
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

    public IntentSummary withDialogActionType(DialogActionType dialogActionType) {
        this.dialogActionType = dialogActionType.toString();
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

    public IntentSummary withFulfillmentState(String fulfillmentState) {
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

    public IntentSummary withFulfillmentState(FulfillmentState fulfillmentState) {
        this.fulfillmentState = fulfillmentState.toString();
        return this;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     * </p>
     * 
     * @param slotToElicit
     *        The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     * </p>
     * 
     * @return The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     * </p>
     * 
     * @param slotToElicit
     *        The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getCheckpointLabel() != null)
            sb.append("CheckpointLabel: ").append(getCheckpointLabel()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfirmationStatus() != null)
            sb.append("ConfirmationStatus: ").append(getConfirmationStatus()).append(",");
        if (getDialogActionType() != null)
            sb.append("DialogActionType: ").append(getDialogActionType()).append(",");
        if (getFulfillmentState() != null)
            sb.append("FulfillmentState: ").append(getFulfillmentState()).append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentSummary == false)
            return false;
        IntentSummary other = (IntentSummary) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getCheckpointLabel() == null ^ this.getCheckpointLabel() == null)
            return false;
        if (other.getCheckpointLabel() != null && other.getCheckpointLabel().equals(this.getCheckpointLabel()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getConfirmationStatus() == null ^ this.getConfirmationStatus() == null)
            return false;
        if (other.getConfirmationStatus() != null && other.getConfirmationStatus().equals(this.getConfirmationStatus()) == false)
            return false;
        if (other.getDialogActionType() == null ^ this.getDialogActionType() == null)
            return false;
        if (other.getDialogActionType() != null && other.getDialogActionType().equals(this.getDialogActionType()) == false)
            return false;
        if (other.getFulfillmentState() == null ^ this.getFulfillmentState() == null)
            return false;
        if (other.getFulfillmentState() != null && other.getFulfillmentState().equals(this.getFulfillmentState()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getCheckpointLabel() == null) ? 0 : getCheckpointLabel().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getConfirmationStatus() == null) ? 0 : getConfirmationStatus().hashCode());
        hashCode = prime * hashCode + ((getDialogActionType() == null) ? 0 : getDialogActionType().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentState() == null) ? 0 : getFulfillmentState().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        return hashCode;
    }

    @Override
    public IntentSummary clone() {
        try {
            return (IntentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntime.model.transform.IntentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
