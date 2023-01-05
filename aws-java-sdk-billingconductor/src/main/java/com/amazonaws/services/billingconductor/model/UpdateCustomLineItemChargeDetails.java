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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of the new charge details of a custom line item. This should contain only one of <code>Flat</code>
 * or <code>Percentage</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItemChargeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomLineItemChargeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat custom line
     * item.
     * </p>
     */
    private UpdateCustomLineItemFlatChargeDetails flat;
    /**
     * <p>
     * An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a percentage
     * custom line item.
     * </p>
     */
    private UpdateCustomLineItemPercentageChargeDetails percentage;

    /**
     * <p>
     * An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat custom line
     * item.
     * </p>
     * 
     * @param flat
     *        An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat
     *        custom line item.
     */

    public void setFlat(UpdateCustomLineItemFlatChargeDetails flat) {
        this.flat = flat;
    }

    /**
     * <p>
     * An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat custom line
     * item.
     * </p>
     * 
     * @return An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat
     *         custom line item.
     */

    public UpdateCustomLineItemFlatChargeDetails getFlat() {
        return this.flat;
    }

    /**
     * <p>
     * An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat custom line
     * item.
     * </p>
     * 
     * @param flat
     *        An <code>UpdateCustomLineItemFlatChargeDetails</code> that describes the new charge details of a flat
     *        custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemChargeDetails withFlat(UpdateCustomLineItemFlatChargeDetails flat) {
        setFlat(flat);
        return this;
    }

    /**
     * <p>
     * An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a percentage
     * custom line item.
     * </p>
     * 
     * @param percentage
     *        An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a
     *        percentage custom line item.
     */

    public void setPercentage(UpdateCustomLineItemPercentageChargeDetails percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a percentage
     * custom line item.
     * </p>
     * 
     * @return An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a
     *         percentage custom line item.
     */

    public UpdateCustomLineItemPercentageChargeDetails getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a percentage
     * custom line item.
     * </p>
     * 
     * @param percentage
     *        An <code>UpdateCustomLineItemPercentageChargeDetails</code> that describes the new charge details of a
     *        percentage custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomLineItemChargeDetails withPercentage(UpdateCustomLineItemPercentageChargeDetails percentage) {
        setPercentage(percentage);
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
        if (getFlat() != null)
            sb.append("Flat: ").append(getFlat()).append(",");
        if (getPercentage() != null)
            sb.append("Percentage: ").append(getPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomLineItemChargeDetails == false)
            return false;
        UpdateCustomLineItemChargeDetails other = (UpdateCustomLineItemChargeDetails) obj;
        if (other.getFlat() == null ^ this.getFlat() == null)
            return false;
        if (other.getFlat() != null && other.getFlat().equals(this.getFlat()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlat() == null) ? 0 : getFlat().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomLineItemChargeDetails clone() {
        try {
            return (UpdateCustomLineItemChargeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.UpdateCustomLineItemChargeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
