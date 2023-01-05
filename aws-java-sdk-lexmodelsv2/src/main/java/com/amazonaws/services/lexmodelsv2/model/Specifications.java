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
 * Subslot specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/Specifications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Specifications implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to the slot type.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * Specifies the elicitation setting details for constituent sub slots of a composite slot.
     * </p>
     */
    private SubSlotValueElicitationSetting valueElicitationSetting;

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

    public Specifications withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * Specifies the elicitation setting details for constituent sub slots of a composite slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        Specifies the elicitation setting details for constituent sub slots of a composite slot.
     */

    public void setValueElicitationSetting(SubSlotValueElicitationSetting valueElicitationSetting) {
        this.valueElicitationSetting = valueElicitationSetting;
    }

    /**
     * <p>
     * Specifies the elicitation setting details for constituent sub slots of a composite slot.
     * </p>
     * 
     * @return Specifies the elicitation setting details for constituent sub slots of a composite slot.
     */

    public SubSlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    /**
     * <p>
     * Specifies the elicitation setting details for constituent sub slots of a composite slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        Specifies the elicitation setting details for constituent sub slots of a composite slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Specifications withValueElicitationSetting(SubSlotValueElicitationSetting valueElicitationSetting) {
        setValueElicitationSetting(valueElicitationSetting);
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
        if (getValueElicitationSetting() != null)
            sb.append("ValueElicitationSetting: ").append(getValueElicitationSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Specifications == false)
            return false;
        Specifications other = (Specifications) obj;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getValueElicitationSetting() == null ^ this.getValueElicitationSetting() == null)
            return false;
        if (other.getValueElicitationSetting() != null && other.getValueElicitationSetting().equals(this.getValueElicitationSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getValueElicitationSetting() == null) ? 0 : getValueElicitationSetting().hashCode());
        return hashCode;
    }

    @Override
    public Specifications clone() {
        try {
            return (Specifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SpecificationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
