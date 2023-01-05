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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of an OpenSearch Reserved Instance offering.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceOffering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the Reserved Instance offering.
     * </p>
     */
    private String reservedInstanceOfferingId;
    /**
     * <p>
     * The OpenSearch instance type offered by the Reserved Instance offering.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The hourly rate at which you're charged for the domain using this Reserved Instance.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the Reserved Instance offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Payment option for the Reserved Instance offering
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The unique identifier of the Reserved Instance offering.
     * </p>
     * 
     * @param reservedInstanceOfferingId
     *        The unique identifier of the Reserved Instance offering.
     */

    public void setReservedInstanceOfferingId(String reservedInstanceOfferingId) {
        this.reservedInstanceOfferingId = reservedInstanceOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the Reserved Instance offering.
     * </p>
     * 
     * @return The unique identifier of the Reserved Instance offering.
     */

    public String getReservedInstanceOfferingId() {
        return this.reservedInstanceOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the Reserved Instance offering.
     * </p>
     * 
     * @param reservedInstanceOfferingId
     *        The unique identifier of the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withReservedInstanceOfferingId(String reservedInstanceOfferingId) {
        setReservedInstanceOfferingId(reservedInstanceOfferingId);
        return this;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by the Reserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by the Reserved Instance offering.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by the Reserved Instance offering.
     * </p>
     * 
     * @return The OpenSearch instance type offered by the Reserved Instance offering.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by the Reserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ReservedInstanceOffering withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by the Reserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ReservedInstanceOffering withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     * </p>
     * 
     * @return The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the offering will reserve the OpenSearch instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @return The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The hourly rate at which you're charged for the domain using this Reserved Instance.
     * </p>
     * 
     * @param usagePrice
     *        The hourly rate at which you're charged for the domain using this Reserved Instance.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly rate at which you're charged for the domain using this Reserved Instance.
     * </p>
     * 
     * @return The hourly rate at which you're charged for the domain using this Reserved Instance.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The hourly rate at which you're charged for the domain using this Reserved Instance.
     * </p>
     * 
     * @param usagePrice
     *        The hourly rate at which you're charged for the domain using this Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the Reserved Instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the Reserved Instance offering.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the Reserved Instance offering.
     * </p>
     * 
     * @return The currency code for the Reserved Instance offering.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the Reserved Instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * Payment option for the Reserved Instance offering
     * </p>
     * 
     * @param paymentOption
     *        Payment option for the Reserved Instance offering
     * @see ReservedInstancePaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * Payment option for the Reserved Instance offering
     * </p>
     * 
     * @return Payment option for the Reserved Instance offering
     * @see ReservedInstancePaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * Payment option for the Reserved Instance offering
     * </p>
     * 
     * @param paymentOption
     *        Payment option for the Reserved Instance offering
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedInstancePaymentOption
     */

    public ReservedInstanceOffering withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * Payment option for the Reserved Instance offering
     * </p>
     * 
     * @param paymentOption
     *        Payment option for the Reserved Instance offering
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedInstancePaymentOption
     */

    public ReservedInstanceOffering withPaymentOption(ReservedInstancePaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * </p>
     * 
     * @return The recurring charge to your account, regardless of whether you creates any domains using the offering.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you creates any domains using the offering.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you creates any domains using the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedInstanceOfferingId() != null)
            sb.append("ReservedInstanceOfferingId: ").append(getReservedInstanceOfferingId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstanceOffering == false)
            return false;
        ReservedInstanceOffering other = (ReservedInstanceOffering) obj;
        if (other.getReservedInstanceOfferingId() == null ^ this.getReservedInstanceOfferingId() == null)
            return false;
        if (other.getReservedInstanceOfferingId() != null && other.getReservedInstanceOfferingId().equals(this.getReservedInstanceOfferingId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstanceOfferingId() == null) ? 0 : getReservedInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstanceOffering clone() {
        try {
            return (ReservedInstanceOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ReservedInstanceOfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
