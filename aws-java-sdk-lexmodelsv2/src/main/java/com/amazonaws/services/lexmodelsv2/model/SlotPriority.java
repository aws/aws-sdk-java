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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets the priority that Amazon Lex should use when eliciting slot values from a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotPriority" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotPriority implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The priority that a slot should be elicited.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The unique identifier of the slot.
     * </p>
     */
    private String slotId;

    /**
     * <p>
     * The priority that a slot should be elicited.
     * </p>
     * 
     * @param priority
     *        The priority that a slot should be elicited.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority that a slot should be elicited.
     * </p>
     * 
     * @return The priority that a slot should be elicited.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority that a slot should be elicited.
     * </p>
     * 
     * @param priority
     *        The priority that a slot should be elicited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotPriority withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the slot.
     * </p>
     * 
     * @param slotId
     *        The unique identifier of the slot.
     */

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * <p>
     * The unique identifier of the slot.
     * </p>
     * 
     * @return The unique identifier of the slot.
     */

    public String getSlotId() {
        return this.slotId;
    }

    /**
     * <p>
     * The unique identifier of the slot.
     * </p>
     * 
     * @param slotId
     *        The unique identifier of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotPriority withSlotId(String slotId) {
        setSlotId(slotId);
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSlotId() != null)
            sb.append("SlotId: ").append(getSlotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotPriority == false)
            return false;
        SlotPriority other = (SlotPriority) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSlotId() == null ^ this.getSlotId() == null)
            return false;
        if (other.getSlotId() != null && other.getSlotId().equals(this.getSlotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSlotId() == null) ? 0 : getSlotId().hashCode());
        return hashCode;
    }

    @Override
    public SlotPriority clone() {
        try {
            return (SlotPriority) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotPriorityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
