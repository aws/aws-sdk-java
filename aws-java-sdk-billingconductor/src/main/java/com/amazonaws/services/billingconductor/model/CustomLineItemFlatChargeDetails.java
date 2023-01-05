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
 * A representation of the charge details that are associated with a flat custom line item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CustomLineItemFlatChargeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLineItemFlatChargeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom line item's fixed charge value in USD.
     * </p>
     */
    private Double chargeValue;

    /**
     * <p>
     * The custom line item's fixed charge value in USD.
     * </p>
     * 
     * @param chargeValue
     *        The custom line item's fixed charge value in USD.
     */

    public void setChargeValue(Double chargeValue) {
        this.chargeValue = chargeValue;
    }

    /**
     * <p>
     * The custom line item's fixed charge value in USD.
     * </p>
     * 
     * @return The custom line item's fixed charge value in USD.
     */

    public Double getChargeValue() {
        return this.chargeValue;
    }

    /**
     * <p>
     * The custom line item's fixed charge value in USD.
     * </p>
     * 
     * @param chargeValue
     *        The custom line item's fixed charge value in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemFlatChargeDetails withChargeValue(Double chargeValue) {
        setChargeValue(chargeValue);
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
        if (getChargeValue() != null)
            sb.append("ChargeValue: ").append(getChargeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLineItemFlatChargeDetails == false)
            return false;
        CustomLineItemFlatChargeDetails other = (CustomLineItemFlatChargeDetails) obj;
        if (other.getChargeValue() == null ^ this.getChargeValue() == null)
            return false;
        if (other.getChargeValue() != null && other.getChargeValue().equals(this.getChargeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChargeValue() == null) ? 0 : getChargeValue().hashCode());
        return hashCode;
    }

    @Override
    public CustomLineItemFlatChargeDetails clone() {
        try {
            return (CustomLineItemFlatChargeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CustomLineItemFlatChargeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
