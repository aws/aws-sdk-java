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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details about the Dedicated Host Reservation and associated Dedicated Hosts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/HostReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostReservation implements Serializable, Cloneable {

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     * <code>94608000 (3 years)</code>.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     */
    private java.util.Date end;
    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIdSet;
    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     */
    private String hostReservationId;
    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same
     * in order for it to benefit from the reservation.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * The state of the reservation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     */
    private String upfrontPrice;
    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     * 
     * @param count
     *        The number of Dedicated Hosts the reservation is associated with.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     * 
     * @return The number of Dedicated Hosts the reservation is associated with.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     * 
     * @param count
     *        The number of Dedicated Hosts the reservation is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @return The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified.
     *         At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public HostReservation withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At this
     * time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>upfrontPrice</code> and <code>hourlyPrice</code> amounts are specified. At
     *        this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public HostReservation withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     * <code>94608000 (3 years)</code>.
     * </p>
     * 
     * @param duration
     *        The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     *        <code>94608000 (3 years)</code>.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     * <code>94608000 (3 years)</code>.
     * </p>
     * 
     * @return The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     *         <code>94608000 (3 years)</code>.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     * <code>94608000 (3 years)</code>.
     * </p>
     * 
     * @param duration
     *        The length of the reservation's term, specified in seconds. Can be <code>31536000 (1 year)</code> |
     *        <code>94608000 (3 years)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     * 
     * @param end
     *        The date and time that the reservation ends.
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     * 
     * @return The date and time that the reservation ends.
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     * 
     * @param end
     *        The date and time that the reservation ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withEnd(java.util.Date end) {
        setEnd(end);
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

    public HostReservation withHostIdSet(String... hostIdSet) {
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

    public HostReservation withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     * 
     * @param hostReservationId
     *        The ID of the reservation that specifies the associated Dedicated Hosts.
     */

    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     * 
     * @return The ID of the reservation that specifies the associated Dedicated Hosts.
     */

    public String getHostReservationId() {
        return this.hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     * 
     * @param hostReservationId
     *        The ID of the reservation that specifies the associated Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withHostReservationId(String hostReservationId) {
        setHostReservationId(hostReservationId);
        return this;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the reservation.
     */

    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     * 
     * @return The hourly price of the reservation.
     */

    public String getHourlyPrice() {
        return this.hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same
     * in order for it to benefit from the reservation.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be
     *        the same in order for it to benefit from the reservation.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same
     * in order for it to benefit from the reservation.
     * </p>
     * 
     * @return The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be
     *         the same in order for it to benefit from the reservation.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same
     * in order for it to benefit from the reservation.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be
     *        the same in order for it to benefit from the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
     * </p>
     * 
     * @param offeringId
     *        The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with
     *        it.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
     * </p>
     * 
     * @return The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with
     *         it.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
     * </p>
     * 
     * @param offeringId
     *        The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option selected for this reservation.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * 
     * @return The payment option selected for this reservation.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option selected for this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public HostReservation withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option selected for this reservation.
     * @see PaymentOption
     */

    public void setPaymentOption(PaymentOption paymentOption) {
        withPaymentOption(paymentOption);
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option selected for this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public HostReservation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     * 
     * @param start
     *        The date and time that the reservation started.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     * 
     * @return The date and time that the reservation started.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     * 
     * @param start
     *        The date and time that the reservation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * 
     * @param state
     *        The state of the reservation.
     * @see ReservationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * 
     * @return The state of the reservation.
     * @see ReservationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * 
     * @param state
     *        The state of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationState
     */

    public HostReservation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * 
     * @param state
     *        The state of the reservation.
     * @see ReservationState
     */

    public void setState(ReservationState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * 
     * @param state
     *        The state of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationState
     */

    public HostReservation withState(ReservationState state) {
        this.state = state.toString();
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

    public HostReservation withUpfrontPrice(String upfrontPrice) {
        setUpfrontPrice(upfrontPrice);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * 
     * @return Any tags assigned to the Dedicated Host Reservation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host Reservation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostReservation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getHostIdSet() != null)
            sb.append("HostIdSet: ").append(getHostIdSet()).append(",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: ").append(getHostReservationId()).append(",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: ").append(getHourlyPrice()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: ").append(getUpfrontPrice()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostReservation == false)
            return false;
        HostReservation other = (HostReservation) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public HostReservation clone() {
        try {
            return (HostReservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
