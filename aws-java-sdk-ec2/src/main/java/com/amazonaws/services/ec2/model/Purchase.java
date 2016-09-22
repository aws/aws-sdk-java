/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the result of the purchase.
 * </p>
 */
public class Purchase implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     */
    private String hostReservationId;
    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIdSet;
    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be associated with.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     */
    private String upfrontPrice;
    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @param hostReservationId
     *        The ID of the reservation.
     */

    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @return The ID of the reservation.
     */

    public String getHostReservationId() {
        return this.hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @param hostReservationId
     *        The ID of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withHostReservationId(String hostReservationId) {
        setHostReservationId(hostReservationId);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts associated with the reservation.
     */

    public java.util.List<String> getHostIdSet() {
        if (hostIdSet == null) {
            hostIdSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts associated with the reservation.
     */

    public void setHostIdSet(java.util.Collection<String> hostIdSet) {
        if (hostIdSet == null) {
            this.hostIdSet = null;
            return;
        }

        this.hostIdSet = new com.amazonaws.internal.SdkInternalList<String>(hostIdSet);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIdSet(java.util.Collection)} or {@link #withHostIdSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts associated with the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withHostIdSet(String... hostIdSet) {
        if (this.hostIdSet == null) {
            setHostIdSet(new com.amazonaws.internal.SdkInternalList<String>(hostIdSet.length));
        }
        for (String ele : hostIdSet) {
            this.hostIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts associated with the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be associated with.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family on the Dedicated Host that the reservation can be associated with.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be associated with.
     * </p>
     * 
     * @return The instance family on the Dedicated Host that the reservation can be associated with.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be associated with.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family on the Dedicated Host that the reservation can be associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * 
     * @return The payment option for the reservation.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public Purchase withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation.
     * @see PaymentOption
     */

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public Purchase withPaymentOption(PaymentOption paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     * 
     * @param upfrontPrice
     *        The upfront price of the reservation.
     */

    public void setUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     * 
     * @return The upfront price of the reservation.
     */

    public String getUpfrontPrice() {
        return this.upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     * 
     * @param upfrontPrice
     *        The upfront price of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withUpfrontPrice(String upfrontPrice) {
        setUpfrontPrice(upfrontPrice);
        return this;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the reservation per hour.
     */

    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     * 
     * @return The hourly price of the reservation per hour.
     */

    public String getHourlyPrice() {
        return this.hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the reservation per hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @return The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified.
     *         At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public Purchase withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>UpfrontPrice</code> and <code>HourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public Purchase withCurrencyCode(CurrencyCodeValues currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation's term in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     * 
     * @return The duration of the reservation's term in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation's term in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Purchase withDuration(Integer duration) {
        setDuration(duration);
        return this;
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
        if (getHostReservationId() != null)
            sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getHostIdSet() != null)
            sb.append("HostIdSet: " + getHostIdSet() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: " + getUpfrontPrice() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Purchase == false)
            return false;
        Purchase other = (Purchase) obj;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        return hashCode;
    }

    @Override
    public Purchase clone() {
        try {
            return (Purchase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
