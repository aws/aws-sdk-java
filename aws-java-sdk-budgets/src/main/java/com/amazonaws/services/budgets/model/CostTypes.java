/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * This includes the options for getting the cost of a budget.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostTypes implements Serializable, Cloneable, StructuredPojo {

    /** A boolean value whether to include tax in the cost budget. */
    private Boolean includeTax;
    /** A boolean value whether to include subscriptions in the cost budget. */
    private Boolean includeSubscription;
    /** A boolean value whether to use blended costs in the cost budget. */
    private Boolean useBlended;
    /** A boolean value whether to include refunds in the cost budget. */
    private Boolean includeRefund;
    /** A boolean value whether to include credits in the cost budget. */
    private Boolean includeCredit;
    /** A boolean value whether to include upfront costs in the cost budget. */
    private Boolean includeUpfront;
    /** A boolean value whether to include recurring costs in the cost budget. */
    private Boolean includeRecurring;
    /** A boolean value whether to include other subscription costs in the cost budget. */
    private Boolean includeOtherSubscription;
    /** A boolean value whether to include support costs in the cost budget. */
    private Boolean includeSupport;
    /** A boolean value whether to include discounts in the cost budget. */
    private Boolean includeDiscount;
    /** A boolean value whether to include amortized costs in the cost budget. */
    private Boolean useAmortized;

    /**
     * A boolean value whether to include tax in the cost budget.
     * 
     * @param includeTax
     *        A boolean value whether to include tax in the cost budget.
     */

    public void setIncludeTax(Boolean includeTax) {
        this.includeTax = includeTax;
    }

    /**
     * A boolean value whether to include tax in the cost budget.
     * 
     * @return A boolean value whether to include tax in the cost budget.
     */

    public Boolean getIncludeTax() {
        return this.includeTax;
    }

    /**
     * A boolean value whether to include tax in the cost budget.
     * 
     * @param includeTax
     *        A boolean value whether to include tax in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeTax(Boolean includeTax) {
        setIncludeTax(includeTax);
        return this;
    }

    /**
     * A boolean value whether to include tax in the cost budget.
     * 
     * @return A boolean value whether to include tax in the cost budget.
     */

    public Boolean isIncludeTax() {
        return this.includeTax;
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget.
     * 
     * @param includeSubscription
     *        A boolean value whether to include subscriptions in the cost budget.
     */

    public void setIncludeSubscription(Boolean includeSubscription) {
        this.includeSubscription = includeSubscription;
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget.
     * 
     * @return A boolean value whether to include subscriptions in the cost budget.
     */

    public Boolean getIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget.
     * 
     * @param includeSubscription
     *        A boolean value whether to include subscriptions in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeSubscription(Boolean includeSubscription) {
        setIncludeSubscription(includeSubscription);
        return this;
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget.
     * 
     * @return A boolean value whether to include subscriptions in the cost budget.
     */

    public Boolean isIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * A boolean value whether to use blended costs in the cost budget.
     * 
     * @param useBlended
     *        A boolean value whether to use blended costs in the cost budget.
     */

    public void setUseBlended(Boolean useBlended) {
        this.useBlended = useBlended;
    }

    /**
     * A boolean value whether to use blended costs in the cost budget.
     * 
     * @return A boolean value whether to use blended costs in the cost budget.
     */

    public Boolean getUseBlended() {
        return this.useBlended;
    }

    /**
     * A boolean value whether to use blended costs in the cost budget.
     * 
     * @param useBlended
     *        A boolean value whether to use blended costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withUseBlended(Boolean useBlended) {
        setUseBlended(useBlended);
        return this;
    }

    /**
     * A boolean value whether to use blended costs in the cost budget.
     * 
     * @return A boolean value whether to use blended costs in the cost budget.
     */

    public Boolean isUseBlended() {
        return this.useBlended;
    }

    /**
     * A boolean value whether to include refunds in the cost budget.
     * 
     * @param includeRefund
     *        A boolean value whether to include refunds in the cost budget.
     */

    public void setIncludeRefund(Boolean includeRefund) {
        this.includeRefund = includeRefund;
    }

    /**
     * A boolean value whether to include refunds in the cost budget.
     * 
     * @return A boolean value whether to include refunds in the cost budget.
     */

    public Boolean getIncludeRefund() {
        return this.includeRefund;
    }

    /**
     * A boolean value whether to include refunds in the cost budget.
     * 
     * @param includeRefund
     *        A boolean value whether to include refunds in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeRefund(Boolean includeRefund) {
        setIncludeRefund(includeRefund);
        return this;
    }

    /**
     * A boolean value whether to include refunds in the cost budget.
     * 
     * @return A boolean value whether to include refunds in the cost budget.
     */

    public Boolean isIncludeRefund() {
        return this.includeRefund;
    }

    /**
     * A boolean value whether to include credits in the cost budget.
     * 
     * @param includeCredit
     *        A boolean value whether to include credits in the cost budget.
     */

    public void setIncludeCredit(Boolean includeCredit) {
        this.includeCredit = includeCredit;
    }

    /**
     * A boolean value whether to include credits in the cost budget.
     * 
     * @return A boolean value whether to include credits in the cost budget.
     */

    public Boolean getIncludeCredit() {
        return this.includeCredit;
    }

    /**
     * A boolean value whether to include credits in the cost budget.
     * 
     * @param includeCredit
     *        A boolean value whether to include credits in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeCredit(Boolean includeCredit) {
        setIncludeCredit(includeCredit);
        return this;
    }

    /**
     * A boolean value whether to include credits in the cost budget.
     * 
     * @return A boolean value whether to include credits in the cost budget.
     */

    public Boolean isIncludeCredit() {
        return this.includeCredit;
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget.
     * 
     * @param includeUpfront
     *        A boolean value whether to include upfront costs in the cost budget.
     */

    public void setIncludeUpfront(Boolean includeUpfront) {
        this.includeUpfront = includeUpfront;
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget.
     * 
     * @return A boolean value whether to include upfront costs in the cost budget.
     */

    public Boolean getIncludeUpfront() {
        return this.includeUpfront;
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget.
     * 
     * @param includeUpfront
     *        A boolean value whether to include upfront costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeUpfront(Boolean includeUpfront) {
        setIncludeUpfront(includeUpfront);
        return this;
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget.
     * 
     * @return A boolean value whether to include upfront costs in the cost budget.
     */

    public Boolean isIncludeUpfront() {
        return this.includeUpfront;
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget.
     * 
     * @param includeRecurring
     *        A boolean value whether to include recurring costs in the cost budget.
     */

    public void setIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget.
     * 
     * @return A boolean value whether to include recurring costs in the cost budget.
     */

    public Boolean getIncludeRecurring() {
        return this.includeRecurring;
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget.
     * 
     * @param includeRecurring
     *        A boolean value whether to include recurring costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeRecurring(Boolean includeRecurring) {
        setIncludeRecurring(includeRecurring);
        return this;
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget.
     * 
     * @return A boolean value whether to include recurring costs in the cost budget.
     */

    public Boolean isIncludeRecurring() {
        return this.includeRecurring;
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget.
     * 
     * @param includeOtherSubscription
     *        A boolean value whether to include other subscription costs in the cost budget.
     */

    public void setIncludeOtherSubscription(Boolean includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget.
     * 
     * @return A boolean value whether to include other subscription costs in the cost budget.
     */

    public Boolean getIncludeOtherSubscription() {
        return this.includeOtherSubscription;
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget.
     * 
     * @param includeOtherSubscription
     *        A boolean value whether to include other subscription costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeOtherSubscription(Boolean includeOtherSubscription) {
        setIncludeOtherSubscription(includeOtherSubscription);
        return this;
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget.
     * 
     * @return A boolean value whether to include other subscription costs in the cost budget.
     */

    public Boolean isIncludeOtherSubscription() {
        return this.includeOtherSubscription;
    }

    /**
     * A boolean value whether to include support costs in the cost budget.
     * 
     * @param includeSupport
     *        A boolean value whether to include support costs in the cost budget.
     */

    public void setIncludeSupport(Boolean includeSupport) {
        this.includeSupport = includeSupport;
    }

    /**
     * A boolean value whether to include support costs in the cost budget.
     * 
     * @return A boolean value whether to include support costs in the cost budget.
     */

    public Boolean getIncludeSupport() {
        return this.includeSupport;
    }

    /**
     * A boolean value whether to include support costs in the cost budget.
     * 
     * @param includeSupport
     *        A boolean value whether to include support costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeSupport(Boolean includeSupport) {
        setIncludeSupport(includeSupport);
        return this;
    }

    /**
     * A boolean value whether to include support costs in the cost budget.
     * 
     * @return A boolean value whether to include support costs in the cost budget.
     */

    public Boolean isIncludeSupport() {
        return this.includeSupport;
    }

    /**
     * A boolean value whether to include discounts in the cost budget.
     * 
     * @param includeDiscount
     *        A boolean value whether to include discounts in the cost budget.
     */

    public void setIncludeDiscount(Boolean includeDiscount) {
        this.includeDiscount = includeDiscount;
    }

    /**
     * A boolean value whether to include discounts in the cost budget.
     * 
     * @return A boolean value whether to include discounts in the cost budget.
     */

    public Boolean getIncludeDiscount() {
        return this.includeDiscount;
    }

    /**
     * A boolean value whether to include discounts in the cost budget.
     * 
     * @param includeDiscount
     *        A boolean value whether to include discounts in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeDiscount(Boolean includeDiscount) {
        setIncludeDiscount(includeDiscount);
        return this;
    }

    /**
     * A boolean value whether to include discounts in the cost budget.
     * 
     * @return A boolean value whether to include discounts in the cost budget.
     */

    public Boolean isIncludeDiscount() {
        return this.includeDiscount;
    }

    /**
     * A boolean value whether to include amortized costs in the cost budget.
     * 
     * @param useAmortized
     *        A boolean value whether to include amortized costs in the cost budget.
     */

    public void setUseAmortized(Boolean useAmortized) {
        this.useAmortized = useAmortized;
    }

    /**
     * A boolean value whether to include amortized costs in the cost budget.
     * 
     * @return A boolean value whether to include amortized costs in the cost budget.
     */

    public Boolean getUseAmortized() {
        return this.useAmortized;
    }

    /**
     * A boolean value whether to include amortized costs in the cost budget.
     * 
     * @param useAmortized
     *        A boolean value whether to include amortized costs in the cost budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withUseAmortized(Boolean useAmortized) {
        setUseAmortized(useAmortized);
        return this;
    }

    /**
     * A boolean value whether to include amortized costs in the cost budget.
     * 
     * @return A boolean value whether to include amortized costs in the cost budget.
     */

    public Boolean isUseAmortized() {
        return this.useAmortized;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIncludeTax() != null)
            sb.append("IncludeTax: ").append(getIncludeTax()).append(",");
        if (getIncludeSubscription() != null)
            sb.append("IncludeSubscription: ").append(getIncludeSubscription()).append(",");
        if (getUseBlended() != null)
            sb.append("UseBlended: ").append(getUseBlended()).append(",");
        if (getIncludeRefund() != null)
            sb.append("IncludeRefund: ").append(getIncludeRefund()).append(",");
        if (getIncludeCredit() != null)
            sb.append("IncludeCredit: ").append(getIncludeCredit()).append(",");
        if (getIncludeUpfront() != null)
            sb.append("IncludeUpfront: ").append(getIncludeUpfront()).append(",");
        if (getIncludeRecurring() != null)
            sb.append("IncludeRecurring: ").append(getIncludeRecurring()).append(",");
        if (getIncludeOtherSubscription() != null)
            sb.append("IncludeOtherSubscription: ").append(getIncludeOtherSubscription()).append(",");
        if (getIncludeSupport() != null)
            sb.append("IncludeSupport: ").append(getIncludeSupport()).append(",");
        if (getIncludeDiscount() != null)
            sb.append("IncludeDiscount: ").append(getIncludeDiscount()).append(",");
        if (getUseAmortized() != null)
            sb.append("UseAmortized: ").append(getUseAmortized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostTypes == false)
            return false;
        CostTypes other = (CostTypes) obj;
        if (other.getIncludeTax() == null ^ this.getIncludeTax() == null)
            return false;
        if (other.getIncludeTax() != null && other.getIncludeTax().equals(this.getIncludeTax()) == false)
            return false;
        if (other.getIncludeSubscription() == null ^ this.getIncludeSubscription() == null)
            return false;
        if (other.getIncludeSubscription() != null && other.getIncludeSubscription().equals(this.getIncludeSubscription()) == false)
            return false;
        if (other.getUseBlended() == null ^ this.getUseBlended() == null)
            return false;
        if (other.getUseBlended() != null && other.getUseBlended().equals(this.getUseBlended()) == false)
            return false;
        if (other.getIncludeRefund() == null ^ this.getIncludeRefund() == null)
            return false;
        if (other.getIncludeRefund() != null && other.getIncludeRefund().equals(this.getIncludeRefund()) == false)
            return false;
        if (other.getIncludeCredit() == null ^ this.getIncludeCredit() == null)
            return false;
        if (other.getIncludeCredit() != null && other.getIncludeCredit().equals(this.getIncludeCredit()) == false)
            return false;
        if (other.getIncludeUpfront() == null ^ this.getIncludeUpfront() == null)
            return false;
        if (other.getIncludeUpfront() != null && other.getIncludeUpfront().equals(this.getIncludeUpfront()) == false)
            return false;
        if (other.getIncludeRecurring() == null ^ this.getIncludeRecurring() == null)
            return false;
        if (other.getIncludeRecurring() != null && other.getIncludeRecurring().equals(this.getIncludeRecurring()) == false)
            return false;
        if (other.getIncludeOtherSubscription() == null ^ this.getIncludeOtherSubscription() == null)
            return false;
        if (other.getIncludeOtherSubscription() != null && other.getIncludeOtherSubscription().equals(this.getIncludeOtherSubscription()) == false)
            return false;
        if (other.getIncludeSupport() == null ^ this.getIncludeSupport() == null)
            return false;
        if (other.getIncludeSupport() != null && other.getIncludeSupport().equals(this.getIncludeSupport()) == false)
            return false;
        if (other.getIncludeDiscount() == null ^ this.getIncludeDiscount() == null)
            return false;
        if (other.getIncludeDiscount() != null && other.getIncludeDiscount().equals(this.getIncludeDiscount()) == false)
            return false;
        if (other.getUseAmortized() == null ^ this.getUseAmortized() == null)
            return false;
        if (other.getUseAmortized() != null && other.getUseAmortized().equals(this.getUseAmortized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeTax() == null) ? 0 : getIncludeTax().hashCode());
        hashCode = prime * hashCode + ((getIncludeSubscription() == null) ? 0 : getIncludeSubscription().hashCode());
        hashCode = prime * hashCode + ((getUseBlended() == null) ? 0 : getUseBlended().hashCode());
        hashCode = prime * hashCode + ((getIncludeRefund() == null) ? 0 : getIncludeRefund().hashCode());
        hashCode = prime * hashCode + ((getIncludeCredit() == null) ? 0 : getIncludeCredit().hashCode());
        hashCode = prime * hashCode + ((getIncludeUpfront() == null) ? 0 : getIncludeUpfront().hashCode());
        hashCode = prime * hashCode + ((getIncludeRecurring() == null) ? 0 : getIncludeRecurring().hashCode());
        hashCode = prime * hashCode + ((getIncludeOtherSubscription() == null) ? 0 : getIncludeOtherSubscription().hashCode());
        hashCode = prime * hashCode + ((getIncludeSupport() == null) ? 0 : getIncludeSupport().hashCode());
        hashCode = prime * hashCode + ((getIncludeDiscount() == null) ? 0 : getIncludeDiscount().hashCode());
        hashCode = prime * hashCode + ((getUseAmortized() == null) ? 0 : getUseAmortized().hashCode());
        return hashCode;
    }

    @Override
    public CostTypes clone() {
        try {
            return (CostTypes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.CostTypesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
