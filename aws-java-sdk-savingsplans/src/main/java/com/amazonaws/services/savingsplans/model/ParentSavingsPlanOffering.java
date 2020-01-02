/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Savings Plan offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/ParentSavingsPlanOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParentSavingsPlanOffering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The payment option.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private String planType;
    /**
     * <p>
     * The duration, in seconds.
     * </p>
     */
    private Long durationSeconds;
    /**
     * <p>
     * The currency.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String planDescription;

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @return The ID of the offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentSavingsPlanOffering withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @see SavingsPlanPaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @return The payment option.
     * @see SavingsPlanPaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public ParentSavingsPlanOffering withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public ParentSavingsPlanOffering withPaymentOption(SavingsPlanPaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @see SavingsPlanType
     */

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @return The plan type.
     * @see SavingsPlanType
     */

    public String getPlanType() {
        return this.planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public ParentSavingsPlanOffering withPlanType(String planType) {
        setPlanType(planType);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public ParentSavingsPlanOffering withPlanType(SavingsPlanType planType) {
        this.planType = planType.toString();
        return this;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds.
     */

    public void setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @return The duration, in seconds.
     */

    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentSavingsPlanOffering withDurationSeconds(Long durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @see CurrencyCode
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @return The currency.
     * @see CurrencyCode
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public ParentSavingsPlanOffering withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public ParentSavingsPlanOffering withCurrency(CurrencyCode currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param planDescription
     *        The description.
     */

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getPlanDescription() {
        return this.planDescription;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param planDescription
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentSavingsPlanOffering withPlanDescription(String planDescription) {
        setPlanDescription(planDescription);
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
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getPlanType() != null)
            sb.append("PlanType: ").append(getPlanType()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getPlanDescription() != null)
            sb.append("PlanDescription: ").append(getPlanDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParentSavingsPlanOffering == false)
            return false;
        ParentSavingsPlanOffering other = (ParentSavingsPlanOffering) obj;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getPlanDescription() == null ^ this.getPlanDescription() == null)
            return false;
        if (other.getPlanDescription() != null && other.getPlanDescription().equals(this.getPlanDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getPlanDescription() == null) ? 0 : getPlanDescription().hashCode());
        return hashCode;
    }

    @Override
    public ParentSavingsPlanOffering clone() {
        try {
            return (ParentSavingsPlanOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.savingsplans.model.transform.ParentSavingsPlanOfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
