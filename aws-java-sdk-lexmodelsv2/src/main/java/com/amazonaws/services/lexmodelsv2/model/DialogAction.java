/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the action that the bot executes at runtime when the conversation reaches this step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DialogAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialogAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that the bot should execute.
     * </p>
     */
    private String type;
    /**
     * <p>
     * If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * When true the next message for the intent is not used.
     * </p>
     */
    private Boolean suppressNextMessage;

    /**
     * <p>
     * The action that the bot should execute.
     * </p>
     * 
     * @param type
     *        The action that the bot should execute.
     * @see DialogActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The action that the bot should execute.
     * </p>
     * 
     * @return The action that the bot should execute.
     * @see DialogActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The action that the bot should execute.
     * </p>
     * 
     * @param type
     *        The action that the bot should execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The action that the bot should execute.
     * </p>
     * 
     * @param type
     *        The action that the bot should execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(DialogActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     * </p>
     * 
     * @param slotToElicit
     *        If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     * </p>
     * 
     * @return If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     * </p>
     * 
     * @param slotToElicit
     *        If the dialog action is <code>ElicitSlot</code>, defines the slot to elicit from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * When true the next message for the intent is not used.
     * </p>
     * 
     * @param suppressNextMessage
     *        When true the next message for the intent is not used.
     */

    public void setSuppressNextMessage(Boolean suppressNextMessage) {
        this.suppressNextMessage = suppressNextMessage;
    }

    /**
     * <p>
     * When true the next message for the intent is not used.
     * </p>
     * 
     * @return When true the next message for the intent is not used.
     */

    public Boolean getSuppressNextMessage() {
        return this.suppressNextMessage;
    }

    /**
     * <p>
     * When true the next message for the intent is not used.
     * </p>
     * 
     * @param suppressNextMessage
     *        When true the next message for the intent is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSuppressNextMessage(Boolean suppressNextMessage) {
        setSuppressNextMessage(suppressNextMessage);
        return this;
    }

    /**
     * <p>
     * When true the next message for the intent is not used.
     * </p>
     * 
     * @return When true the next message for the intent is not used.
     */

    public Boolean isSuppressNextMessage() {
        return this.suppressNextMessage;
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
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getSuppressNextMessage() != null)
            sb.append("SuppressNextMessage: ").append(getSuppressNextMessage());
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
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getSuppressNextMessage() == null ^ this.getSuppressNextMessage() == null)
            return false;
        if (other.getSuppressNextMessage() != null && other.getSuppressNextMessage().equals(this.getSuppressNextMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getSuppressNextMessage() == null) ? 0 : getSuppressNextMessage().hashCode());
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
        com.amazonaws.services.lexmodelsv2.model.transform.DialogActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
