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
 * Details of an OpenSearch Reserved Instance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer-specified identifier to track this reservation.
     * </p>
     */
    private String reservationName;
    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedInstanceId;
    /**
     * <p>
     * The unique identifier of the billing subscription.
     * </p>
     */
    private Long billingSubscriptionId;
    /**
     * <p>
     * The unique identifier of the Reserved Instance offering.
     * </p>
     */
    private String reservedInstanceOfferingId;
    /**
     * <p>
     * The OpenSearch instance type offered by theReserved Instance offering.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The date and time when the reservation was purchased.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration, in seconds, for which the OpenSearch instance is reserved.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
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
     * The currency code for the offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The number of OpenSearch instances that have been reserved.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The state of the Reserved Instance.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The payment option as defined in the Reserved Instance offering.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance
     * offering.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        The customer-specified identifier to track this reservation.
     */

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier to track this reservation.
     * </p>
     * 
     * @return The customer-specified identifier to track this reservation.
     */

    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        The customer-specified identifier to track this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withReservationName(String reservationName) {
        setReservationName(reservationName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedInstanceId
     *        The unique identifier for the reservation.
     */

    public void setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @return The unique identifier for the reservation.
     */

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedInstanceId
     *        The unique identifier for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withReservedInstanceId(String reservedInstanceId) {
        setReservedInstanceId(reservedInstanceId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the billing subscription.
     * </p>
     * 
     * @param billingSubscriptionId
     *        The unique identifier of the billing subscription.
     */

    public void setBillingSubscriptionId(Long billingSubscriptionId) {
        this.billingSubscriptionId = billingSubscriptionId;
    }

    /**
     * <p>
     * The unique identifier of the billing subscription.
     * </p>
     * 
     * @return The unique identifier of the billing subscription.
     */

    public Long getBillingSubscriptionId() {
        return this.billingSubscriptionId;
    }

    /**
     * <p>
     * The unique identifier of the billing subscription.
     * </p>
     * 
     * @param billingSubscriptionId
     *        The unique identifier of the billing subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withBillingSubscriptionId(Long billingSubscriptionId) {
        setBillingSubscriptionId(billingSubscriptionId);
        return this;
    }

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

    public ReservedInstance withReservedInstanceOfferingId(String reservedInstanceOfferingId) {
        setReservedInstanceOfferingId(reservedInstanceOfferingId);
        return this;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by theReserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by theReserved Instance offering.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by theReserved Instance offering.
     * </p>
     * 
     * @return The OpenSearch instance type offered by theReserved Instance offering.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by theReserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by theReserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ReservedInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The OpenSearch instance type offered by theReserved Instance offering.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch instance type offered by theReserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ReservedInstance withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the reservation was purchased.
     * </p>
     * 
     * @param startTime
     *        The date and time when the reservation was purchased.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the reservation was purchased.
     * </p>
     * 
     * @return The date and time when the reservation was purchased.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the reservation was purchased.
     * </p>
     * 
     * @param startTime
     *        The date and time when the reservation was purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the OpenSearch instance is reserved.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the OpenSearch instance is reserved.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the OpenSearch instance is reserved.
     * </p>
     * 
     * @return The duration, in seconds, for which the OpenSearch instance is reserved.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the OpenSearch instance is reserved.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the OpenSearch instance is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @return The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withFixedPrice(Double fixedPrice) {
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

    public ReservedInstance withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the offering.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the offering.
     * </p>
     * 
     * @return The currency code for the offering.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The number of OpenSearch instances that have been reserved.
     * </p>
     * 
     * @param instanceCount
     *        The number of OpenSearch instances that have been reserved.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of OpenSearch instances that have been reserved.
     * </p>
     * 
     * @return The number of OpenSearch instances that have been reserved.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of OpenSearch instances that have been reserved.
     * </p>
     * 
     * @param instanceCount
     *        The number of OpenSearch instances that have been reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The state of the Reserved Instance.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Reserved Instance.
     * </p>
     * 
     * @return The state of the Reserved Instance.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Reserved Instance.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The payment option as defined in the Reserved Instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the Reserved Instance offering.
     * @see ReservedInstancePaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option as defined in the Reserved Instance offering.
     * </p>
     * 
     * @return The payment option as defined in the Reserved Instance offering.
     * @see ReservedInstancePaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option as defined in the Reserved Instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedInstancePaymentOption
     */

    public ReservedInstance withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option as defined in the Reserved Instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedInstancePaymentOption
     */

    public ReservedInstance withPaymentOption(ReservedInstancePaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance
     * offering.
     * </p>
     * 
     * @return The recurring charge to your account, regardless of whether you create any domains using the Reserved
     *         Instance offering.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance
     * offering.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you create any domains using the Reserved
     *        Instance offering.
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
     * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance
     * offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you create any domains using the Reserved
     *        Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withRecurringCharges(RecurringCharge... recurringCharges) {
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
     * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance
     * offering.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge to your account, regardless of whether you create any domains using the Reserved
     *        Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstance withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (getReservationName() != null)
            sb.append("ReservationName: ").append(getReservationName()).append(",");
        if (getReservedInstanceId() != null)
            sb.append("ReservedInstanceId: ").append(getReservedInstanceId()).append(",");
        if (getBillingSubscriptionId() != null)
            sb.append("BillingSubscriptionId: ").append(getBillingSubscriptionId()).append(",");
        if (getReservedInstanceOfferingId() != null)
            sb.append("ReservedInstanceOfferingId: ").append(getReservedInstanceOfferingId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof ReservedInstance == false)
            return false;
        ReservedInstance other = (ReservedInstance) obj;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        if (other.getReservedInstanceId() == null ^ this.getReservedInstanceId() == null)
            return false;
        if (other.getReservedInstanceId() != null && other.getReservedInstanceId().equals(this.getReservedInstanceId()) == false)
            return false;
        if (other.getBillingSubscriptionId() == null ^ this.getBillingSubscriptionId() == null)
            return false;
        if (other.getBillingSubscriptionId() != null && other.getBillingSubscriptionId().equals(this.getBillingSubscriptionId()) == false)
            return false;
        if (other.getReservedInstanceOfferingId() == null ^ this.getReservedInstanceOfferingId() == null)
            return false;
        if (other.getReservedInstanceOfferingId() != null && other.getReservedInstanceOfferingId().equals(this.getReservedInstanceOfferingId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceId() == null) ? 0 : getReservedInstanceId().hashCode());
        hashCode = prime * hashCode + ((getBillingSubscriptionId() == null) ? 0 : getBillingSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceOfferingId() == null) ? 0 : getReservedInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstance clone() {
        try {
            return (ReservedInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ReservedInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
