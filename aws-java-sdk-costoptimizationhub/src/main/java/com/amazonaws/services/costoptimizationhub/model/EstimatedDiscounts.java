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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Estimated discount details of the current and recommended resource configuration for a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/EstimatedDiscounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimatedDiscounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     * <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     * </p>
     */
    private Double otherDiscount;
    /**
     * <p>
     * Estimated reserved instance discounts.
     * </p>
     */
    private Double reservedInstancesDiscount;
    /**
     * <p>
     * Estimated Savings Plans discounts.
     * </p>
     */
    private Double savingsPlansDiscount;

    /**
     * <p>
     * Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     * <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     * </p>
     * 
     * @param otherDiscount
     *        Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     *        <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     */

    public void setOtherDiscount(Double otherDiscount) {
        this.otherDiscount = otherDiscount;
    }

    /**
     * <p>
     * Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     * <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     * </p>
     * 
     * @return Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     *         <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     */

    public Double getOtherDiscount() {
        return this.otherDiscount;
    }

    /**
     * <p>
     * Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     * <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     * </p>
     * 
     * @param otherDiscount
     *        Estimated other discounts include all discounts that are not itemized. Itemized discounts include
     *        <code>reservedInstanceDiscount</code> and <code>savingsPlansDiscount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedDiscounts withOtherDiscount(Double otherDiscount) {
        setOtherDiscount(otherDiscount);
        return this;
    }

    /**
     * <p>
     * Estimated reserved instance discounts.
     * </p>
     * 
     * @param reservedInstancesDiscount
     *        Estimated reserved instance discounts.
     */

    public void setReservedInstancesDiscount(Double reservedInstancesDiscount) {
        this.reservedInstancesDiscount = reservedInstancesDiscount;
    }

    /**
     * <p>
     * Estimated reserved instance discounts.
     * </p>
     * 
     * @return Estimated reserved instance discounts.
     */

    public Double getReservedInstancesDiscount() {
        return this.reservedInstancesDiscount;
    }

    /**
     * <p>
     * Estimated reserved instance discounts.
     * </p>
     * 
     * @param reservedInstancesDiscount
     *        Estimated reserved instance discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedDiscounts withReservedInstancesDiscount(Double reservedInstancesDiscount) {
        setReservedInstancesDiscount(reservedInstancesDiscount);
        return this;
    }

    /**
     * <p>
     * Estimated Savings Plans discounts.
     * </p>
     * 
     * @param savingsPlansDiscount
     *        Estimated Savings Plans discounts.
     */

    public void setSavingsPlansDiscount(Double savingsPlansDiscount) {
        this.savingsPlansDiscount = savingsPlansDiscount;
    }

    /**
     * <p>
     * Estimated Savings Plans discounts.
     * </p>
     * 
     * @return Estimated Savings Plans discounts.
     */

    public Double getSavingsPlansDiscount() {
        return this.savingsPlansDiscount;
    }

    /**
     * <p>
     * Estimated Savings Plans discounts.
     * </p>
     * 
     * @param savingsPlansDiscount
     *        Estimated Savings Plans discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedDiscounts withSavingsPlansDiscount(Double savingsPlansDiscount) {
        setSavingsPlansDiscount(savingsPlansDiscount);
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
        if (getOtherDiscount() != null)
            sb.append("OtherDiscount: ").append(getOtherDiscount()).append(",");
        if (getReservedInstancesDiscount() != null)
            sb.append("ReservedInstancesDiscount: ").append(getReservedInstancesDiscount()).append(",");
        if (getSavingsPlansDiscount() != null)
            sb.append("SavingsPlansDiscount: ").append(getSavingsPlansDiscount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimatedDiscounts == false)
            return false;
        EstimatedDiscounts other = (EstimatedDiscounts) obj;
        if (other.getOtherDiscount() == null ^ this.getOtherDiscount() == null)
            return false;
        if (other.getOtherDiscount() != null && other.getOtherDiscount().equals(this.getOtherDiscount()) == false)
            return false;
        if (other.getReservedInstancesDiscount() == null ^ this.getReservedInstancesDiscount() == null)
            return false;
        if (other.getReservedInstancesDiscount() != null && other.getReservedInstancesDiscount().equals(this.getReservedInstancesDiscount()) == false)
            return false;
        if (other.getSavingsPlansDiscount() == null ^ this.getSavingsPlansDiscount() == null)
            return false;
        if (other.getSavingsPlansDiscount() != null && other.getSavingsPlansDiscount().equals(this.getSavingsPlansDiscount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtherDiscount() == null) ? 0 : getOtherDiscount().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesDiscount() == null) ? 0 : getReservedInstancesDiscount().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlansDiscount() == null) ? 0 : getSavingsPlansDiscount().hashCode());
        return hashCode;
    }

    @Override
    public EstimatedDiscounts clone() {
        try {
            return (EstimatedDiscounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.EstimatedDiscountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
