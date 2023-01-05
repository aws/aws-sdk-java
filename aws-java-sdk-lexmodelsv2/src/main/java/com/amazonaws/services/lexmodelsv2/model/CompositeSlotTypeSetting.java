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
 * A composite slot is a combination of two or more slots that capture multiple pieces of information in a single user
 * input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CompositeSlotTypeSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeSlotTypeSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Subslots in the composite slot.
     * </p>
     */
    private java.util.List<SubSlotTypeComposition> subSlots;

    /**
     * <p>
     * Subslots in the composite slot.
     * </p>
     * 
     * @return Subslots in the composite slot.
     */

    public java.util.List<SubSlotTypeComposition> getSubSlots() {
        return subSlots;
    }

    /**
     * <p>
     * Subslots in the composite slot.
     * </p>
     * 
     * @param subSlots
     *        Subslots in the composite slot.
     */

    public void setSubSlots(java.util.Collection<SubSlotTypeComposition> subSlots) {
        if (subSlots == null) {
            this.subSlots = null;
            return;
        }

        this.subSlots = new java.util.ArrayList<SubSlotTypeComposition>(subSlots);
    }

    /**
     * <p>
     * Subslots in the composite slot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubSlots(java.util.Collection)} or {@link #withSubSlots(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subSlots
     *        Subslots in the composite slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeSlotTypeSetting withSubSlots(SubSlotTypeComposition... subSlots) {
        if (this.subSlots == null) {
            setSubSlots(new java.util.ArrayList<SubSlotTypeComposition>(subSlots.length));
        }
        for (SubSlotTypeComposition ele : subSlots) {
            this.subSlots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Subslots in the composite slot.
     * </p>
     * 
     * @param subSlots
     *        Subslots in the composite slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositeSlotTypeSetting withSubSlots(java.util.Collection<SubSlotTypeComposition> subSlots) {
        setSubSlots(subSlots);
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

        if (obj instanceof CompositeSlotTypeSetting == false)
            return false;
        CompositeSlotTypeSetting other = (CompositeSlotTypeSetting) obj;
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

        hashCode = prime * hashCode + ((getSubSlots() == null) ? 0 : getSubSlots().hashCode());
        return hashCode;
    }

    @Override
    public CompositeSlotTypeSetting clone() {
        try {
            return (CompositeSlotTypeSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.CompositeSlotTypeSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
