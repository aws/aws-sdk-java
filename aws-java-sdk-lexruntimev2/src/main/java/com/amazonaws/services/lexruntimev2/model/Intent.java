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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current intent that Amazon Lex V2 is attempting to fulfill.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Intent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Intent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot has not
     * been filled, the value is null.
     * </p>
     */
    private java.util.Map<String, Slot> slots;
    /**
     * <p>
     * Contains fulfillment information for the intent.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Contains information about whether fulfillment of the intent has been confirmed.
     * </p>
     */
    private String confirmationState;

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param name
     *        The name of the intent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @return The name of the intent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param name
     *        The name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Intent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot has not
     * been filled, the value is null.
     * </p>
     * 
     * @return A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot
     *         has not been filled, the value is null.
     */

    public java.util.Map<String, Slot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot has not
     * been filled, the value is null.
     * </p>
     * 
     * @param slots
     *        A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot
     *        has not been filled, the value is null.
     */

    public void setSlots(java.util.Map<String, Slot> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot has not
     * been filled, the value is null.
     * </p>
     * 
     * @param slots
     *        A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot
     *        has not been filled, the value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Intent withSlots(java.util.Map<String, Slot> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * Add a single Slots entry
     *
     * @see Intent#withSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Intent addSlotsEntry(String key, Slot value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, Slot>();
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

    public Intent clearSlotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * Contains fulfillment information for the intent.
     * </p>
     * 
     * @param state
     *        Contains fulfillment information for the intent.
     * @see IntentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Contains fulfillment information for the intent.
     * </p>
     * 
     * @return Contains fulfillment information for the intent.
     * @see IntentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Contains fulfillment information for the intent.
     * </p>
     * 
     * @param state
     *        Contains fulfillment information for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntentState
     */

    public Intent withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Contains fulfillment information for the intent.
     * </p>
     * 
     * @param state
     *        Contains fulfillment information for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntentState
     */

    public Intent withState(IntentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about whether fulfillment of the intent has been confirmed.
     * </p>
     * 
     * @param confirmationState
     *        Contains information about whether fulfillment of the intent has been confirmed.
     * @see ConfirmationState
     */

    public void setConfirmationState(String confirmationState) {
        this.confirmationState = confirmationState;
    }

    /**
     * <p>
     * Contains information about whether fulfillment of the intent has been confirmed.
     * </p>
     * 
     * @return Contains information about whether fulfillment of the intent has been confirmed.
     * @see ConfirmationState
     */

    public String getConfirmationState() {
        return this.confirmationState;
    }

    /**
     * <p>
     * Contains information about whether fulfillment of the intent has been confirmed.
     * </p>
     * 
     * @param confirmationState
     *        Contains information about whether fulfillment of the intent has been confirmed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationState
     */

    public Intent withConfirmationState(String confirmationState) {
        setConfirmationState(confirmationState);
        return this;
    }

    /**
     * <p>
     * Contains information about whether fulfillment of the intent has been confirmed.
     * </p>
     * 
     * @param confirmationState
     *        Contains information about whether fulfillment of the intent has been confirmed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfirmationState
     */

    public Intent withConfirmationState(ConfirmationState confirmationState) {
        this.confirmationState = confirmationState.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getConfirmationState() != null)
            sb.append("ConfirmationState: ").append(getConfirmationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Intent == false)
            return false;
        Intent other = (Intent) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getConfirmationState() == null ^ this.getConfirmationState() == null)
            return false;
        if (other.getConfirmationState() != null && other.getConfirmationState().equals(this.getConfirmationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getConfirmationState() == null) ? 0 : getConfirmationState().hashCode());
        return hashCode;
    }

    @Override
    public Intent clone() {
        try {
            return (Intent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.IntentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
