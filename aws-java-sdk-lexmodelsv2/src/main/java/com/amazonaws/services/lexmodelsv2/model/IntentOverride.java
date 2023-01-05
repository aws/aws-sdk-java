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
 * Override settings to configure the intent state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent. Only required when you're switching intents.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the slot.
     * Slots that are not included in the map aren't overridden.,
     * </p>
     */
    private java.util.Map<String, SlotValueOverride> slots;

    /**
     * <p>
     * The name of the intent. Only required when you're switching intents.
     * </p>
     * 
     * @param name
     *        The name of the intent. Only required when you're switching intents.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent. Only required when you're switching intents.
     * </p>
     * 
     * @return The name of the intent. Only required when you're switching intents.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the intent. Only required when you're switching intents.
     * </p>
     * 
     * @param name
     *        The name of the intent. Only required when you're switching intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentOverride withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the slot.
     * Slots that are not included in the map aren't overridden.,
     * </p>
     * 
     * @return A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the
     *         slot. Slots that are not included in the map aren't overridden.,
     */

    public java.util.Map<String, SlotValueOverride> getSlots() {
        return slots;
    }

    /**
     * <p>
     * A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the slot.
     * Slots that are not included in the map aren't overridden.,
     * </p>
     * 
     * @param slots
     *        A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the
     *        slot. Slots that are not included in the map aren't overridden.,
     */

    public void setSlots(java.util.Map<String, SlotValueOverride> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the slot.
     * Slots that are not included in the map aren't overridden.,
     * </p>
     * 
     * @param slots
     *        A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the
     *        slot. Slots that are not included in the map aren't overridden.,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentOverride withSlots(java.util.Map<String, SlotValueOverride> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * Add a single Slots entry
     *
     * @see IntentOverride#withSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IntentOverride addSlotsEntry(String key, SlotValueOverride value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, SlotValueOverride>();
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

    public IntentOverride clearSlotsEntries() {
        this.slots = null;
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
            sb.append("Slots: ").append(getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentOverride == false)
            return false;
        IntentOverride other = (IntentOverride) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public IntentOverride clone() {
        try {
            return (IntentOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
