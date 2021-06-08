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
 * Provides summary information about a slot type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotTypeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotTypeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to the slot type.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * The name of the slot type.
     * </p>
     */
    private String slotTypeName;
    /**
     * <p>
     * The description of the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If the slot type is derived from a built-on slot type, the name of the parent slot type.
     * </p>
     */
    private String parentSlotTypeSignature;
    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier assigned to the slot type.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier assigned to the slot type.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the slot type.
     * </p>
     * 
     * @return The unique identifier assigned to the slot type.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the slot type.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier assigned to the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeSummary withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The name of the slot type.
     */

    public void setSlotTypeName(String slotTypeName) {
        this.slotTypeName = slotTypeName;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @return The name of the slot type.
     */

    public String getSlotTypeName() {
        return this.slotTypeName;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The name of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeSummary withSlotTypeName(String slotTypeName) {
        setSlotTypeName(slotTypeName);
        return this;
    }

    /**
     * <p>
     * The description of the slot type.
     * </p>
     * 
     * @param description
     *        The description of the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the slot type.
     * </p>
     * 
     * @return The description of the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the slot type.
     * </p>
     * 
     * @param description
     *        The description of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If the slot type is derived from a built-on slot type, the name of the parent slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        If the slot type is derived from a built-on slot type, the name of the parent slot type.
     */

    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * If the slot type is derived from a built-on slot type, the name of the parent slot type.
     * </p>
     * 
     * @return If the slot type is derived from a built-on slot type, the name of the parent slot type.
     */

    public String getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature;
    }

    /**
     * <p>
     * If the slot type is derived from a built-on slot type, the name of the parent slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        If the slot type is derived from a built-on slot type, the name of the parent slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeSummary withParentSlotTypeSignature(String parentSlotTypeSignature) {
        setParentSlotTypeSignature(parentSlotTypeSignature);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the slot type was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the slot type was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the slot type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getSlotTypeId() != null)
            sb.append("SlotTypeId: ").append(getSlotTypeId()).append(",");
        if (getSlotTypeName() != null)
            sb.append("SlotTypeName: ").append(getSlotTypeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParentSlotTypeSignature() != null)
            sb.append("ParentSlotTypeSignature: ").append(getParentSlotTypeSignature()).append(",");
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

        if (obj instanceof SlotTypeSummary == false)
            return false;
        SlotTypeSummary other = (SlotTypeSummary) obj;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getSlotTypeName() == null ^ this.getSlotTypeName() == null)
            return false;
        if (other.getSlotTypeName() != null && other.getSlotTypeName().equals(this.getSlotTypeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParentSlotTypeSignature() == null ^ this.getParentSlotTypeSignature() == null)
            return false;
        if (other.getParentSlotTypeSignature() != null && other.getParentSlotTypeSignature().equals(this.getParentSlotTypeSignature()) == false)
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

        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeName() == null) ? 0 : getSlotTypeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParentSlotTypeSignature() == null) ? 0 : getParentSlotTypeSignature().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SlotTypeSummary clone() {
        try {
            return (SlotTypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotTypeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
