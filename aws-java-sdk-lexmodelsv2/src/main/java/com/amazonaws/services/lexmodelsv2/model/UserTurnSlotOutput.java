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
 * Contains information about a slot output by the test set execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnSlotOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnSlotOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value output by the slot recognition.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Values that are output by the slot recognition.
     * </p>
     */
    private java.util.List<UserTurnSlotOutput> values;
    /**
     * <p>
     * A list of items mapping the name of the subslots to information about those subslots.
     * </p>
     */
    private java.util.Map<String, UserTurnSlotOutput> subSlots;

    /**
     * <p>
     * The value output by the slot recognition.
     * </p>
     * 
     * @param value
     *        The value output by the slot recognition.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value output by the slot recognition.
     * </p>
     * 
     * @return The value output by the slot recognition.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value output by the slot recognition.
     * </p>
     * 
     * @param value
     *        The value output by the slot recognition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Values that are output by the slot recognition.
     * </p>
     * 
     * @return Values that are output by the slot recognition.
     */

    public java.util.List<UserTurnSlotOutput> getValues() {
        return values;
    }

    /**
     * <p>
     * Values that are output by the slot recognition.
     * </p>
     * 
     * @param values
     *        Values that are output by the slot recognition.
     */

    public void setValues(java.util.Collection<UserTurnSlotOutput> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<UserTurnSlotOutput>(values);
    }

    /**
     * <p>
     * Values that are output by the slot recognition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Values that are output by the slot recognition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput withValues(UserTurnSlotOutput... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<UserTurnSlotOutput>(values.length));
        }
        for (UserTurnSlotOutput ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values that are output by the slot recognition.
     * </p>
     * 
     * @param values
     *        Values that are output by the slot recognition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput withValues(java.util.Collection<UserTurnSlotOutput> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * A list of items mapping the name of the subslots to information about those subslots.
     * </p>
     * 
     * @return A list of items mapping the name of the subslots to information about those subslots.
     */

    public java.util.Map<String, UserTurnSlotOutput> getSubSlots() {
        return subSlots;
    }

    /**
     * <p>
     * A list of items mapping the name of the subslots to information about those subslots.
     * </p>
     * 
     * @param subSlots
     *        A list of items mapping the name of the subslots to information about those subslots.
     */

    public void setSubSlots(java.util.Map<String, UserTurnSlotOutput> subSlots) {
        this.subSlots = subSlots;
    }

    /**
     * <p>
     * A list of items mapping the name of the subslots to information about those subslots.
     * </p>
     * 
     * @param subSlots
     *        A list of items mapping the name of the subslots to information about those subslots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput withSubSlots(java.util.Map<String, UserTurnSlotOutput> subSlots) {
        setSubSlots(subSlots);
        return this;
    }

    /**
     * Add a single SubSlots entry
     *
     * @see UserTurnSlotOutput#withSubSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput addSubSlotsEntry(String key, UserTurnSlotOutput value) {
        if (null == this.subSlots) {
            this.subSlots = new java.util.HashMap<String, UserTurnSlotOutput>();
        }
        if (this.subSlots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.subSlots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SubSlots.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSlotOutput clearSubSlotsEntries() {
        this.subSlots = null;
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getSubSlots() != null)
            sb.append("SubSlots: ").append(getSubSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserTurnSlotOutput == false)
            return false;
        UserTurnSlotOutput other = (UserTurnSlotOutput) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getSubSlots() == null ^ this.getSubSlots() == null)
            return false;
        if (other.getSubSlots() != null && other.getSubSlots().equals(this.getSubSlots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getSubSlots() == null) ? 0 : getSubSlots().hashCode());
        return hashCode;
    }

    @Override
    public UserTurnSlotOutput clone() {
        try {
            return (UserTurnSlotOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnSlotOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
