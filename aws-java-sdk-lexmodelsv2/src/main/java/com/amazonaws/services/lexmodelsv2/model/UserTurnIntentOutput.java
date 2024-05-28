/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the intent that is output for the turn by the test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnIntentOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnIntentOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The slots associated with the intent.
     * </p>
     */
    private java.util.Map<String, UserTurnSlotOutput> slots;

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

    public UserTurnIntentOutput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The slots associated with the intent.
     * </p>
     * 
     * @return The slots associated with the intent.
     */

    public java.util.Map<String, UserTurnSlotOutput> getSlots() {
        return slots;
    }

    /**
     * <p>
     * The slots associated with the intent.
     * </p>
     * 
     * @param slots
     *        The slots associated with the intent.
     */

    public void setSlots(java.util.Map<String, UserTurnSlotOutput> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The slots associated with the intent.
     * </p>
     * 
     * @param slots
     *        The slots associated with the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnIntentOutput withSlots(java.util.Map<String, UserTurnSlotOutput> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * Add a single Slots entry
     *
     * @see UserTurnIntentOutput#withSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnIntentOutput addSlotsEntry(String key, UserTurnSlotOutput value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, UserTurnSlotOutput>();
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

    public UserTurnIntentOutput clearSlotsEntries() {
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

        if (obj instanceof UserTurnIntentOutput == false)
            return false;
        UserTurnIntentOutput other = (UserTurnIntentOutput) obj;
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
    public UserTurnIntentOutput clone() {
        try {
            return (UserTurnIntentOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnIntentOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
