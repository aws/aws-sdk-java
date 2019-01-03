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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of a reserved Elasticsearch instance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedElasticsearchInstance implements Serializable, Cloneable, StructuredPojo {

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
    private String reservedElasticsearchInstanceId;
    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedElasticsearchInstanceOfferingId;
    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance offering.
     * </p>
     */
    private String elasticsearchInstanceType;
    /**
     * <p>
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration, in seconds, for which the Elasticsearch instance is reserved.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The rate you are charged for each hour for the domain that is using this reserved instance.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The number of Elasticsearch instances that have been reserved.
     * </p>
     */
    private Integer elasticsearchInstanceCount;
    /**
     * <p>
     * The state of the reserved Elasticsearch instance.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The payment option as defined in the reserved Elasticsearch instance offering.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The charge to your account regardless of whether you are creating any domains using the instance offering.
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

    public ReservedElasticsearchInstance withReservationName(String reservationName) {
        setReservationName(reservationName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        The unique identifier for the reservation.
     */

    public void setReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @return The unique identifier for the reservation.
     */

    public String getReservedElasticsearchInstanceId() {
        return this.reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        The unique identifier for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        setReservedElasticsearchInstanceId(reservedElasticsearchInstanceId);
        return this;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The offering identifier.
     */

    public void setReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @return The offering identifier.
     */

    public String getReservedElasticsearchInstanceOfferingId() {
        return this.reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        setReservedElasticsearchInstanceOfferingId(reservedElasticsearchInstanceOfferingId);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance offering.
     * </p>
     * 
     * @param elasticsearchInstanceType
     *        The Elasticsearch instance type offered by the reserved instance offering.
     * @see ESPartitionInstanceType
     */

    public void setElasticsearchInstanceType(String elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance offering.
     * </p>
     * 
     * @return The Elasticsearch instance type offered by the reserved instance offering.
     * @see ESPartitionInstanceType
     */

    public String getElasticsearchInstanceType() {
        return this.elasticsearchInstanceType;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance offering.
     * </p>
     * 
     * @param elasticsearchInstanceType
     *        The Elasticsearch instance type offered by the reserved instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ReservedElasticsearchInstance withElasticsearchInstanceType(String elasticsearchInstanceType) {
        setElasticsearchInstanceType(elasticsearchInstanceType);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance offering.
     * </p>
     * 
     * @param elasticsearchInstanceType
     *        The Elasticsearch instance type offered by the reserved instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ReservedElasticsearchInstance withElasticsearchInstanceType(ESPartitionInstanceType elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @return The time the reservation started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the Elasticsearch instance is reserved.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the Elasticsearch instance is reserved.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the Elasticsearch instance is reserved.
     * </p>
     * 
     * @return The duration, in seconds, for which the Elasticsearch instance is reserved.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the Elasticsearch instance is reserved.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the Elasticsearch instance is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     * </p>
     * 
     * @return The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The rate you are charged for each hour for the domain that is using this reserved instance.
     * </p>
     * 
     * @param usagePrice
     *        The rate you are charged for each hour for the domain that is using this reserved instance.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour for the domain that is using this reserved instance.
     * </p>
     * 
     * @return The rate you are charged for each hour for the domain that is using this reserved instance.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour for the domain that is using this reserved instance.
     * </p>
     * 
     * @param usagePrice
     *        The rate you are charged for each hour for the domain that is using this reserved instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved Elasticsearch instance offering.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @return The currency code for the reserved Elasticsearch instance offering.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved Elasticsearch instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The number of Elasticsearch instances that have been reserved.
     * </p>
     * 
     * @param elasticsearchInstanceCount
     *        The number of Elasticsearch instances that have been reserved.
     */

    public void setElasticsearchInstanceCount(Integer elasticsearchInstanceCount) {
        this.elasticsearchInstanceCount = elasticsearchInstanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances that have been reserved.
     * </p>
     * 
     * @return The number of Elasticsearch instances that have been reserved.
     */

    public Integer getElasticsearchInstanceCount() {
        return this.elasticsearchInstanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances that have been reserved.
     * </p>
     * 
     * @param elasticsearchInstanceCount
     *        The number of Elasticsearch instances that have been reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withElasticsearchInstanceCount(Integer elasticsearchInstanceCount) {
        setElasticsearchInstanceCount(elasticsearchInstanceCount);
        return this;
    }

    /**
     * <p>
     * The state of the reserved Elasticsearch instance.
     * </p>
     * 
     * @param state
     *        The state of the reserved Elasticsearch instance.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved Elasticsearch instance.
     * </p>
     * 
     * @return The state of the reserved Elasticsearch instance.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reserved Elasticsearch instance.
     * </p>
     * 
     * @param state
     *        The state of the reserved Elasticsearch instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The payment option as defined in the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the reserved Elasticsearch instance offering.
     * @see ReservedElasticsearchInstancePaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option as defined in the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @return The payment option as defined in the reserved Elasticsearch instance offering.
     * @see ReservedElasticsearchInstancePaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option as defined in the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the reserved Elasticsearch instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedElasticsearchInstancePaymentOption
     */

    public ReservedElasticsearchInstance withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option as defined in the reserved Elasticsearch instance offering.
     * </p>
     * 
     * @param paymentOption
     *        The payment option as defined in the reserved Elasticsearch instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedElasticsearchInstancePaymentOption
     */

    public ReservedElasticsearchInstance withPaymentOption(ReservedElasticsearchInstancePaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any domains using the instance offering.
     * </p>
     * 
     * @return The charge to your account regardless of whether you are creating any domains using the instance
     *         offering.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any domains using the instance offering.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any domains using the instance offering.
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
     * The charge to your account regardless of whether you are creating any domains using the instance offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any domains using the instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withRecurringCharges(RecurringCharge... recurringCharges) {
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
     * The charge to your account regardless of whether you are creating any domains using the instance offering.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any domains using the instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedElasticsearchInstance withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (getReservedElasticsearchInstanceId() != null)
            sb.append("ReservedElasticsearchInstanceId: ").append(getReservedElasticsearchInstanceId()).append(",");
        if (getReservedElasticsearchInstanceOfferingId() != null)
            sb.append("ReservedElasticsearchInstanceOfferingId: ").append(getReservedElasticsearchInstanceOfferingId()).append(",");
        if (getElasticsearchInstanceType() != null)
            sb.append("ElasticsearchInstanceType: ").append(getElasticsearchInstanceType()).append(",");
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
        if (getElasticsearchInstanceCount() != null)
            sb.append("ElasticsearchInstanceCount: ").append(getElasticsearchInstanceCount()).append(",");
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

        if (obj instanceof ReservedElasticsearchInstance == false)
            return false;
        ReservedElasticsearchInstance other = (ReservedElasticsearchInstance) obj;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        if (other.getReservedElasticsearchInstanceId() == null ^ this.getReservedElasticsearchInstanceId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceId() != null
                && other.getReservedElasticsearchInstanceId().equals(this.getReservedElasticsearchInstanceId()) == false)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() == null ^ this.getReservedElasticsearchInstanceOfferingId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() != null
                && other.getReservedElasticsearchInstanceOfferingId().equals(this.getReservedElasticsearchInstanceOfferingId()) == false)
            return false;
        if (other.getElasticsearchInstanceType() == null ^ this.getElasticsearchInstanceType() == null)
            return false;
        if (other.getElasticsearchInstanceType() != null && other.getElasticsearchInstanceType().equals(this.getElasticsearchInstanceType()) == false)
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
        if (other.getElasticsearchInstanceCount() == null ^ this.getElasticsearchInstanceCount() == null)
            return false;
        if (other.getElasticsearchInstanceCount() != null && other.getElasticsearchInstanceCount().equals(this.getElasticsearchInstanceCount()) == false)
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
        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceId() == null) ? 0 : getReservedElasticsearchInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceOfferingId() == null) ? 0 : getReservedElasticsearchInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchInstanceType() == null) ? 0 : getElasticsearchInstanceType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchInstanceCount() == null) ? 0 : getElasticsearchInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedElasticsearchInstance clone() {
        try {
            return (ReservedElasticsearchInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ReservedElasticsearchInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
