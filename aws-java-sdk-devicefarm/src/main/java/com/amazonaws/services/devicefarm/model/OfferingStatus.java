/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/OfferingStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferingStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Represents the metadata of an offering status.
     * </p>
     */
    private Offering offering;
    /**
     * <p>
     * The number of available devices in the offering.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The date on which the offering is effective.
     * </p>
     */
    private java.util.Date effectiveOn;

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     * 
     * @param type
     *        The type specified for the offering status.
     * @see OfferingTransactionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     * 
     * @return The type specified for the offering status.
     * @see OfferingTransactionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     * 
     * @param type
     *        The type specified for the offering status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTransactionType
     */

    public OfferingStatus withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     * 
     * @param type
     *        The type specified for the offering status.
     * @see OfferingTransactionType
     */

    public void setType(OfferingTransactionType type) {
        withType(type);
    }

    /**
     * <p>
     * The type specified for the offering status.
     * </p>
     * 
     * @param type
     *        The type specified for the offering status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTransactionType
     */

    public OfferingStatus withType(OfferingTransactionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Represents the metadata of an offering status.
     * </p>
     * 
     * @param offering
     *        Represents the metadata of an offering status.
     */

    public void setOffering(Offering offering) {
        this.offering = offering;
    }

    /**
     * <p>
     * Represents the metadata of an offering status.
     * </p>
     * 
     * @return Represents the metadata of an offering status.
     */

    public Offering getOffering() {
        return this.offering;
    }

    /**
     * <p>
     * Represents the metadata of an offering status.
     * </p>
     * 
     * @param offering
     *        Represents the metadata of an offering status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingStatus withOffering(Offering offering) {
        setOffering(offering);
        return this;
    }

    /**
     * <p>
     * The number of available devices in the offering.
     * </p>
     * 
     * @param quantity
     *        The number of available devices in the offering.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of available devices in the offering.
     * </p>
     * 
     * @return The number of available devices in the offering.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of available devices in the offering.
     * </p>
     * 
     * @param quantity
     *        The number of available devices in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingStatus withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The date on which the offering is effective.
     * </p>
     * 
     * @param effectiveOn
     *        The date on which the offering is effective.
     */

    public void setEffectiveOn(java.util.Date effectiveOn) {
        this.effectiveOn = effectiveOn;
    }

    /**
     * <p>
     * The date on which the offering is effective.
     * </p>
     * 
     * @return The date on which the offering is effective.
     */

    public java.util.Date getEffectiveOn() {
        return this.effectiveOn;
    }

    /**
     * <p>
     * The date on which the offering is effective.
     * </p>
     * 
     * @param effectiveOn
     *        The date on which the offering is effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingStatus withEffectiveOn(java.util.Date effectiveOn) {
        setEffectiveOn(effectiveOn);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOffering() != null)
            sb.append("Offering: ").append(getOffering()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getEffectiveOn() != null)
            sb.append("EffectiveOn: ").append(getEffectiveOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferingStatus == false)
            return false;
        OfferingStatus other = (OfferingStatus) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOffering() == null ^ this.getOffering() == null)
            return false;
        if (other.getOffering() != null && other.getOffering().equals(this.getOffering()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getEffectiveOn() == null ^ this.getEffectiveOn() == null)
            return false;
        if (other.getEffectiveOn() != null && other.getEffectiveOn().equals(this.getEffectiveOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOffering() == null) ? 0 : getOffering().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getEffectiveOn() == null) ? 0 : getEffectiveOn().hashCode());
        return hashCode;
    }

    @Override
    public OfferingStatus clone() {
        try {
            return (OfferingStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.OfferingStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
