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
 * Details about the Dedicated Host Reservation offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/HostOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The currency of the offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The instance family of the offering.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The available payment option.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront offerings.
     * </p>
     */
    private String upfrontPrice;

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the offering.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * 
     * @return The currency of the offering.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public HostOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the offering.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public HostOffering withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     * 
     * @param duration
     *        The duration of the offering (in seconds).
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     * 
     * @return The duration of the offering (in seconds).
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     * 
     * @param duration
     *        The duration of the offering (in seconds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostOffering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the offering.
     */

    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     * 
     * @return The hourly price of the offering.
     */

    public String getHourlyPrice() {
        return this.hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostOffering withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the offering.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     * 
     * @return The instance family of the offering.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostOffering withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

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

    public HostOffering withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * 
     * @param paymentOption
     *        The available payment option.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * 
     * @return The available payment option.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * 
     * @param paymentOption
     *        The available payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public HostOffering withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * 
     * @param paymentOption
     *        The available payment option.
     * @see PaymentOption
     */

    public void setPaymentOption(PaymentOption paymentOption) {
        withPaymentOption(paymentOption);
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * 
     * @param paymentOption
     *        The available payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public HostOffering withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront offerings.
     * </p>
     * 
     * @param upfrontPrice
     *        The upfront price of the offering. Does not apply to No Upfront offerings.
     */

    public void setUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront offerings.
     * </p>
     * 
     * @return The upfront price of the offering. Does not apply to No Upfront offerings.
     */

    public String getUpfrontPrice() {
        return this.upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront offerings.
     * </p>
     * 
     * @param upfrontPrice
     *        The upfront price of the offering. Does not apply to No Upfront offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostOffering withUpfrontPrice(String upfrontPrice) {
        setUpfrontPrice(upfrontPrice);
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: ").append(getHourlyPrice()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: ").append(getUpfrontPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostOffering == false)
            return false;
        HostOffering other = (HostOffering) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
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
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        return hashCode;
    }

    @Override
    public HostOffering clone() {
        try {
            return (HostOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
