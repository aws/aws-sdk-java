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
 * Summary information about a slot, a value that the bot elicits from the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the slot.
     * </p>
     */
    private String slotId;
    /**
     * <p>
     * The name given to the slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The description of the slot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * </p>
     */
    private String slotConstraint;
    /**
     * <p>
     * The unique identifier for the slot type that defines the values for the slot.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * Prompts that are sent to the user to elicit a value for the slot.
     * </p>
     */
    private PromptSpecification valueElicitationPromptSpecification;
    /**
     * <p>
     * The timestamp of the last date and time that the slot was updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

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

    public SlotSummary withSlotId(String slotId) {
        setSlotId(slotId);
        return this;
    }

    /**
     * <p>
     * The name given to the slot.
     * </p>
     * 
     * @param slotName
     *        The name given to the slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The name given to the slot.
     * </p>
     * 
     * @return The name given to the slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The name given to the slot.
     * </p>
     * 
     * @param slotName
     *        The name given to the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotSummary withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The description of the slot.
     * </p>
     * 
     * @param description
     *        The description of the slot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the slot.
     * </p>
     * 
     * @return The description of the slot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the slot.
     * </p>
     * 
     * @param description
     *        The description of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * </p>
     * 
     * @param slotConstraint
     *        Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * @see SlotConstraint
     */

    public void setSlotConstraint(String slotConstraint) {
        this.slotConstraint = slotConstraint;
    }

    /**
     * <p>
     * Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * </p>
     * 
     * @return Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * @see SlotConstraint
     */

    public String getSlotConstraint() {
        return this.slotConstraint;
    }

    /**
     * <p>
     * Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * </p>
     * 
     * @param slotConstraint
     *        Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotConstraint
     */

    public SlotSummary withSlotConstraint(String slotConstraint) {
        setSlotConstraint(slotConstraint);
        return this;
    }

    /**
     * <p>
     * Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * </p>
     * 
     * @param slotConstraint
     *        Whether the slot is required or optional. An intent is complete when all required slots are filled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotConstraint
     */

    public SlotSummary withSlotConstraint(SlotConstraint slotConstraint) {
        this.slotConstraint = slotConstraint.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the slot type that defines the values for the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type that defines the values for the slot.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type that defines the values for the slot.
     * </p>
     * 
     * @return The unique identifier for the slot type that defines the values for the slot.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type that defines the values for the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type that defines the values for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotSummary withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * Prompts that are sent to the user to elicit a value for the slot.
     * </p>
     * 
     * @param valueElicitationPromptSpecification
     *        Prompts that are sent to the user to elicit a value for the slot.
     */

    public void setValueElicitationPromptSpecification(PromptSpecification valueElicitationPromptSpecification) {
        this.valueElicitationPromptSpecification = valueElicitationPromptSpecification;
    }

    /**
     * <p>
     * Prompts that are sent to the user to elicit a value for the slot.
     * </p>
     * 
     * @return Prompts that are sent to the user to elicit a value for the slot.
     */

    public PromptSpecification getValueElicitationPromptSpecification() {
        return this.valueElicitationPromptSpecification;
    }

    /**
     * <p>
     * Prompts that are sent to the user to elicit a value for the slot.
     * </p>
     * 
     * @param valueElicitationPromptSpecification
     *        Prompts that are sent to the user to elicit a value for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotSummary withValueElicitationPromptSpecification(PromptSpecification valueElicitationPromptSpecification) {
        setValueElicitationPromptSpecification(valueElicitationPromptSpecification);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last date and time that the slot was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the last date and time that the slot was updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the last date and time that the slot was updated.
     * </p>
     * 
     * @return The timestamp of the last date and time that the slot was updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the last date and time that the slot was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the last date and time that the slot was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getSlotId() != null)
            sb.append("SlotId: ").append(getSlotId()).append(",");
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSlotConstraint() != null)
            sb.append("SlotConstraint: ").append(getSlotConstraint()).append(",");
        if (getSlotTypeId() != null)
            sb.append("SlotTypeId: ").append(getSlotTypeId()).append(",");
        if (getValueElicitationPromptSpecification() != null)
            sb.append("ValueElicitationPromptSpecification: ").append(getValueElicitationPromptSpecification()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotSummary == false)
            return false;
        SlotSummary other = (SlotSummary) obj;
        if (other.getSlotId() == null ^ this.getSlotId() == null)
            return false;
        if (other.getSlotId() != null && other.getSlotId().equals(this.getSlotId()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotConstraint() == null ^ this.getSlotConstraint() == null)
            return false;
        if (other.getSlotConstraint() != null && other.getSlotConstraint().equals(this.getSlotConstraint()) == false)
            return false;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getValueElicitationPromptSpecification() == null ^ this.getValueElicitationPromptSpecification() == null)
            return false;
        if (other.getValueElicitationPromptSpecification() != null
                && other.getValueElicitationPromptSpecification().equals(this.getValueElicitationPromptSpecification()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotId() == null) ? 0 : getSlotId().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlotConstraint() == null) ? 0 : getSlotConstraint().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getValueElicitationPromptSpecification() == null) ? 0 : getValueElicitationPromptSpecification().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SlotSummary clone() {
        try {
            return (SlotSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
