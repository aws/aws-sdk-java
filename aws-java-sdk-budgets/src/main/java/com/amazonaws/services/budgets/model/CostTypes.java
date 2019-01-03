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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The types of cost that are included in a <code>COST</code> budget, such as tax and subscriptions.
 * </p>
 * <p>
 * <code>USAGE</code>, <code>RI_UTILIZATION</code>, and <code>RI_COVERAGE</code> budgets do not have
 * <code>CostTypes</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostTypes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether a budget includes taxes.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeTax;
    /**
     * <p>
     * Specifies whether a budget includes subscriptions.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeSubscription;
    /**
     * <p>
     * Specifies whether a budget uses a blended rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean useBlended;
    /**
     * <p>
     * Specifies whether a budget includes refunds.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeRefund;
    /**
     * <p>
     * Specifies whether a budget includes credits.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeCredit;
    /**
     * <p>
     * Specifies whether a budget includes upfront RI costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeUpfront;
    /**
     * <p>
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeRecurring;
    /**
     * <p>
     * Specifies whether a budget includes non-RI subscription costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeOtherSubscription;
    /**
     * <p>
     * Specifies whether a budget includes support subscription fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeSupport;
    /**
     * <p>
     * Specifies whether a budget includes discounts.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     */
    private Boolean includeDiscount;
    /**
     * <p>
     * Specifies whether a budget uses the amortized rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean useAmortized;

    /**
     * <p>
     * Specifies whether a budget includes taxes.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeTax
     *        Specifies whether a budget includes taxes.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeTax(Boolean includeTax) {
        this.includeTax = includeTax;
    }

    /**
     * <p>
     * Specifies whether a budget includes taxes.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes taxes.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeTax() {
        return this.includeTax;
    }

    /**
     * <p>
     * Specifies whether a budget includes taxes.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeTax
     *        Specifies whether a budget includes taxes.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeTax(Boolean includeTax) {
        setIncludeTax(includeTax);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes taxes.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes taxes.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeTax() {
        return this.includeTax;
    }

    /**
     * <p>
     * Specifies whether a budget includes subscriptions.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeSubscription
     *        Specifies whether a budget includes subscriptions.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeSubscription(Boolean includeSubscription) {
        this.includeSubscription = includeSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget includes subscriptions.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes subscriptions.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget includes subscriptions.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeSubscription
     *        Specifies whether a budget includes subscriptions.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeSubscription(Boolean includeSubscription) {
        setIncludeSubscription(includeSubscription);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes subscriptions.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes subscriptions.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget uses a blended rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param useBlended
     *        Specifies whether a budget uses a blended rate.</p>
     *        <p>
     *        The default value is <code>false</code>.
     */

    public void setUseBlended(Boolean useBlended) {
        this.useBlended = useBlended;
    }

    /**
     * <p>
     * Specifies whether a budget uses a blended rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether a budget uses a blended rate.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean getUseBlended() {
        return this.useBlended;
    }

    /**
     * <p>
     * Specifies whether a budget uses a blended rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param useBlended
     *        Specifies whether a budget uses a blended rate.</p>
     *        <p>
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withUseBlended(Boolean useBlended) {
        setUseBlended(useBlended);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget uses a blended rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether a budget uses a blended rate.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean isUseBlended() {
        return this.useBlended;
    }

    /**
     * <p>
     * Specifies whether a budget includes refunds.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeRefund
     *        Specifies whether a budget includes refunds.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeRefund(Boolean includeRefund) {
        this.includeRefund = includeRefund;
    }

    /**
     * <p>
     * Specifies whether a budget includes refunds.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes refunds.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeRefund() {
        return this.includeRefund;
    }

    /**
     * <p>
     * Specifies whether a budget includes refunds.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeRefund
     *        Specifies whether a budget includes refunds.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeRefund(Boolean includeRefund) {
        setIncludeRefund(includeRefund);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes refunds.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes refunds.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeRefund() {
        return this.includeRefund;
    }

    /**
     * <p>
     * Specifies whether a budget includes credits.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeCredit
     *        Specifies whether a budget includes credits.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeCredit(Boolean includeCredit) {
        this.includeCredit = includeCredit;
    }

    /**
     * <p>
     * Specifies whether a budget includes credits.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes credits.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeCredit() {
        return this.includeCredit;
    }

    /**
     * <p>
     * Specifies whether a budget includes credits.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeCredit
     *        Specifies whether a budget includes credits.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeCredit(Boolean includeCredit) {
        setIncludeCredit(includeCredit);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes credits.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes credits.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeCredit() {
        return this.includeCredit;
    }

    /**
     * <p>
     * Specifies whether a budget includes upfront RI costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeUpfront
     *        Specifies whether a budget includes upfront RI costs.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeUpfront(Boolean includeUpfront) {
        this.includeUpfront = includeUpfront;
    }

    /**
     * <p>
     * Specifies whether a budget includes upfront RI costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes upfront RI costs.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeUpfront() {
        return this.includeUpfront;
    }

    /**
     * <p>
     * Specifies whether a budget includes upfront RI costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeUpfront
     *        Specifies whether a budget includes upfront RI costs.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeUpfront(Boolean includeUpfront) {
        setIncludeUpfront(includeUpfront);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes upfront RI costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes upfront RI costs.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeUpfront() {
        return this.includeUpfront;
    }

    /**
     * <p>
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeRecurring
     *        Specifies whether a budget includes recurring fees such as monthly RI fees.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
    }

    /**
     * <p>
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes recurring fees such as monthly RI fees.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeRecurring() {
        return this.includeRecurring;
    }

    /**
     * <p>
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeRecurring
     *        Specifies whether a budget includes recurring fees such as monthly RI fees.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeRecurring(Boolean includeRecurring) {
        setIncludeRecurring(includeRecurring);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes recurring fees such as monthly RI fees.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeRecurring() {
        return this.includeRecurring;
    }

    /**
     * <p>
     * Specifies whether a budget includes non-RI subscription costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeOtherSubscription
     *        Specifies whether a budget includes non-RI subscription costs.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeOtherSubscription(Boolean includeOtherSubscription) {
        this.includeOtherSubscription = includeOtherSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget includes non-RI subscription costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes non-RI subscription costs.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeOtherSubscription() {
        return this.includeOtherSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget includes non-RI subscription costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeOtherSubscription
     *        Specifies whether a budget includes non-RI subscription costs.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeOtherSubscription(Boolean includeOtherSubscription) {
        setIncludeOtherSubscription(includeOtherSubscription);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes non-RI subscription costs.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes non-RI subscription costs.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeOtherSubscription() {
        return this.includeOtherSubscription;
    }

    /**
     * <p>
     * Specifies whether a budget includes support subscription fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeSupport
     *        Specifies whether a budget includes support subscription fees.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeSupport(Boolean includeSupport) {
        this.includeSupport = includeSupport;
    }

    /**
     * <p>
     * Specifies whether a budget includes support subscription fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes support subscription fees.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeSupport() {
        return this.includeSupport;
    }

    /**
     * <p>
     * Specifies whether a budget includes support subscription fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeSupport
     *        Specifies whether a budget includes support subscription fees.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeSupport(Boolean includeSupport) {
        setIncludeSupport(includeSupport);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes support subscription fees.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes support subscription fees.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeSupport() {
        return this.includeSupport;
    }

    /**
     * <p>
     * Specifies whether a budget includes discounts.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeDiscount
     *        Specifies whether a budget includes discounts.</p>
     *        <p>
     *        The default value is <code>true</code>.
     */

    public void setIncludeDiscount(Boolean includeDiscount) {
        this.includeDiscount = includeDiscount;
    }

    /**
     * <p>
     * Specifies whether a budget includes discounts.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes discounts.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean getIncludeDiscount() {
        return this.includeDiscount;
    }

    /**
     * <p>
     * Specifies whether a budget includes discounts.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @param includeDiscount
     *        Specifies whether a budget includes discounts.</p>
     *        <p>
     *        The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeDiscount(Boolean includeDiscount) {
        setIncludeDiscount(includeDiscount);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget includes discounts.
     * </p>
     * <p>
     * The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether a budget includes discounts.</p>
     *         <p>
     *         The default value is <code>true</code>.
     */

    public Boolean isIncludeDiscount() {
        return this.includeDiscount;
    }

    /**
     * <p>
     * Specifies whether a budget uses the amortized rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param useAmortized
     *        Specifies whether a budget uses the amortized rate.</p>
     *        <p>
     *        The default value is <code>false</code>.
     */

    public void setUseAmortized(Boolean useAmortized) {
        this.useAmortized = useAmortized;
    }

    /**
     * <p>
     * Specifies whether a budget uses the amortized rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether a budget uses the amortized rate.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean getUseAmortized() {
        return this.useAmortized;
    }

    /**
     * <p>
     * Specifies whether a budget uses the amortized rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param useAmortized
     *        Specifies whether a budget uses the amortized rate.</p>
     *        <p>
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withUseAmortized(Boolean useAmortized) {
        setUseAmortized(useAmortized);
        return this;
    }

    /**
     * <p>
     * Specifies whether a budget uses the amortized rate.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether a budget uses the amortized rate.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean isUseAmortized() {
        return this.useAmortized;
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
