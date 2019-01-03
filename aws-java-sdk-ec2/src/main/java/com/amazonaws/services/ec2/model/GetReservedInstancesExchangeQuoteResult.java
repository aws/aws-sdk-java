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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of GetReservedInstancesExchangeQuote.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedInstancesExchangeQuoteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * </p>
     */
    private Boolean isValidExchange;
    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     */
    private java.util.Date outputReservedInstancesWillExpireAt;
    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     */
    private String paymentDue;
    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     */
    private ReservationValue reservedInstanceValueRollup;
    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstanceReservationValue> reservedInstanceValueSet;
    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     */
    private ReservationValue targetConfigurationValueRollup;
    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetReservationValue> targetConfigurationValueSet;
    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     */
    private String validationFailureReason;

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the transaction.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     * 
     * @return The currency of the transaction.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * </p>
     * 
     * @param isValidExchange
     *        If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     */

    public void setIsValidExchange(Boolean isValidExchange) {
        this.isValidExchange = isValidExchange;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * </p>
     * 
     * @return If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     */

    public Boolean getIsValidExchange() {
        return this.isValidExchange;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * </p>
     * 
     * @param isValidExchange
     *        If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withIsValidExchange(Boolean isValidExchange) {
        setIsValidExchange(isValidExchange);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     * </p>
     * 
     * @return If <code>true</code>, the exchange is valid. If <code>false</code>, the exchange cannot be completed.
     */

    public Boolean isValidExchange() {
        return this.isValidExchange;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     * 
     * @param outputReservedInstancesWillExpireAt
     *        The new end date of the reservation term.
     */

    public void setOutputReservedInstancesWillExpireAt(java.util.Date outputReservedInstancesWillExpireAt) {
        this.outputReservedInstancesWillExpireAt = outputReservedInstancesWillExpireAt;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     * 
     * @return The new end date of the reservation term.
     */

    public java.util.Date getOutputReservedInstancesWillExpireAt() {
        return this.outputReservedInstancesWillExpireAt;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     * 
     * @param outputReservedInstancesWillExpireAt
     *        The new end date of the reservation term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withOutputReservedInstancesWillExpireAt(java.util.Date outputReservedInstancesWillExpireAt) {
        setOutputReservedInstancesWillExpireAt(outputReservedInstancesWillExpireAt);
        return this;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     * 
     * @param paymentDue
     *        The total true upfront charge for the exchange.
     */

    public void setPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     * 
     * @return The total true upfront charge for the exchange.
     */

    public String getPaymentDue() {
        return this.paymentDue;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     * 
     * @param paymentDue
     *        The total true upfront charge for the exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withPaymentDue(String paymentDue) {
        setPaymentDue(paymentDue);
        return this;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @param reservedInstanceValueRollup
     *        The cost associated with the Reserved Instance.
     */

    public void setReservedInstanceValueRollup(ReservationValue reservedInstanceValueRollup) {
        this.reservedInstanceValueRollup = reservedInstanceValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @return The cost associated with the Reserved Instance.
     */

    public ReservationValue getReservedInstanceValueRollup() {
        return this.reservedInstanceValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @param reservedInstanceValueRollup
     *        The cost associated with the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueRollup(ReservationValue reservedInstanceValueRollup) {
        setReservedInstanceValueRollup(reservedInstanceValueRollup);
        return this;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * 
     * @return The configuration of your Convertible Reserved Instances.
     */

    public java.util.List<ReservedInstanceReservationValue> getReservedInstanceValueSet() {
        if (reservedInstanceValueSet == null) {
            reservedInstanceValueSet = new com.amazonaws.internal.SdkInternalList<ReservedInstanceReservationValue>();
        }
        return reservedInstanceValueSet;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * 
     * @param reservedInstanceValueSet
     *        The configuration of your Convertible Reserved Instances.
     */

    public void setReservedInstanceValueSet(java.util.Collection<ReservedInstanceReservationValue> reservedInstanceValueSet) {
        if (reservedInstanceValueSet == null) {
            this.reservedInstanceValueSet = null;
            return;
        }

        this.reservedInstanceValueSet = new com.amazonaws.internal.SdkInternalList<ReservedInstanceReservationValue>(reservedInstanceValueSet);
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstanceValueSet(java.util.Collection)} or
     * {@link #withReservedInstanceValueSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstanceValueSet
     *        The configuration of your Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueSet(ReservedInstanceReservationValue... reservedInstanceValueSet) {
        if (this.reservedInstanceValueSet == null) {
            setReservedInstanceValueSet(new com.amazonaws.internal.SdkInternalList<ReservedInstanceReservationValue>(reservedInstanceValueSet.length));
        }
        for (ReservedInstanceReservationValue ele : reservedInstanceValueSet) {
            this.reservedInstanceValueSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * 
     * @param reservedInstanceValueSet
     *        The configuration of your Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueSet(java.util.Collection<ReservedInstanceReservationValue> reservedInstanceValueSet) {
        setReservedInstanceValueSet(reservedInstanceValueSet);
        return this;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @param targetConfigurationValueRollup
     *        The cost associated with the Reserved Instance.
     */

    public void setTargetConfigurationValueRollup(ReservationValue targetConfigurationValueRollup) {
        this.targetConfigurationValueRollup = targetConfigurationValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @return The cost associated with the Reserved Instance.
     */

    public ReservationValue getTargetConfigurationValueRollup() {
        return this.targetConfigurationValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * 
     * @param targetConfigurationValueRollup
     *        The cost associated with the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueRollup(ReservationValue targetConfigurationValueRollup) {
        setTargetConfigurationValueRollup(targetConfigurationValueRollup);
        return this;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * 
     * @return The values of the target Convertible Reserved Instances.
     */

    public java.util.List<TargetReservationValue> getTargetConfigurationValueSet() {
        if (targetConfigurationValueSet == null) {
            targetConfigurationValueSet = new com.amazonaws.internal.SdkInternalList<TargetReservationValue>();
        }
        return targetConfigurationValueSet;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * 
     * @param targetConfigurationValueSet
     *        The values of the target Convertible Reserved Instances.
     */

    public void setTargetConfigurationValueSet(java.util.Collection<TargetReservationValue> targetConfigurationValueSet) {
        if (targetConfigurationValueSet == null) {
            this.targetConfigurationValueSet = null;
            return;
        }

        this.targetConfigurationValueSet = new com.amazonaws.internal.SdkInternalList<TargetReservationValue>(targetConfigurationValueSet);
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetConfigurationValueSet(java.util.Collection)} or
     * {@link #withTargetConfigurationValueSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetConfigurationValueSet
     *        The values of the target Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueSet(TargetReservationValue... targetConfigurationValueSet) {
        if (this.targetConfigurationValueSet == null) {
            setTargetConfigurationValueSet(new com.amazonaws.internal.SdkInternalList<TargetReservationValue>(targetConfigurationValueSet.length));
        }
        for (TargetReservationValue ele : targetConfigurationValueSet) {
            this.targetConfigurationValueSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * 
     * @param targetConfigurationValueSet
     *        The values of the target Convertible Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueSet(java.util.Collection<TargetReservationValue> targetConfigurationValueSet) {
        setTargetConfigurationValueSet(targetConfigurationValueSet);
        return this;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     * 
     * @param validationFailureReason
     *        Describes the reason why the exchange cannot be completed.
     */

    public void setValidationFailureReason(String validationFailureReason) {
        this.validationFailureReason = validationFailureReason;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     * 
     * @return Describes the reason why the exchange cannot be completed.
     */

    public String getValidationFailureReason() {
        return this.validationFailureReason;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     * 
     * @param validationFailureReason
     *        Describes the reason why the exchange cannot be completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedInstancesExchangeQuoteResult withValidationFailureReason(String validationFailureReason) {
        setValidationFailureReason(validationFailureReason);
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
        if (getIsValidExchange() != null)
            sb.append("IsValidExchange: ").append(getIsValidExchange()).append(",");
        if (getOutputReservedInstancesWillExpireAt() != null)
            sb.append("OutputReservedInstancesWillExpireAt: ").append(getOutputReservedInstancesWillExpireAt()).append(",");
        if (getPaymentDue() != null)
            sb.append("PaymentDue: ").append(getPaymentDue()).append(",");
        if (getReservedInstanceValueRollup() != null)
            sb.append("ReservedInstanceValueRollup: ").append(getReservedInstanceValueRollup()).append(",");
        if (getReservedInstanceValueSet() != null)
            sb.append("ReservedInstanceValueSet: ").append(getReservedInstanceValueSet()).append(",");
        if (getTargetConfigurationValueRollup() != null)
            sb.append("TargetConfigurationValueRollup: ").append(getTargetConfigurationValueRollup()).append(",");
        if (getTargetConfigurationValueSet() != null)
            sb.append("TargetConfigurationValueSet: ").append(getTargetConfigurationValueSet()).append(",");
        if (getValidationFailureReason() != null)
            sb.append("ValidationFailureReason: ").append(getValidationFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedInstancesExchangeQuoteResult == false)
            return false;
        GetReservedInstancesExchangeQuoteResult other = (GetReservedInstancesExchangeQuoteResult) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getIsValidExchange() == null ^ this.getIsValidExchange() == null)
            return false;
        if (other.getIsValidExchange() != null && other.getIsValidExchange().equals(this.getIsValidExchange()) == false)
            return false;
        if (other.getOutputReservedInstancesWillExpireAt() == null ^ this.getOutputReservedInstancesWillExpireAt() == null)
            return false;
        if (other.getOutputReservedInstancesWillExpireAt() != null
                && other.getOutputReservedInstancesWillExpireAt().equals(this.getOutputReservedInstancesWillExpireAt()) == false)
            return false;
        if (other.getPaymentDue() == null ^ this.getPaymentDue() == null)
            return false;
        if (other.getPaymentDue() != null && other.getPaymentDue().equals(this.getPaymentDue()) == false)
            return false;
        if (other.getReservedInstanceValueRollup() == null ^ this.getReservedInstanceValueRollup() == null)
            return false;
        if (other.getReservedInstanceValueRollup() != null && other.getReservedInstanceValueRollup().equals(this.getReservedInstanceValueRollup()) == false)
            return false;
        if (other.getReservedInstanceValueSet() == null ^ this.getReservedInstanceValueSet() == null)
            return false;
        if (other.getReservedInstanceValueSet() != null && other.getReservedInstanceValueSet().equals(this.getReservedInstanceValueSet()) == false)
            return false;
        if (other.getTargetConfigurationValueRollup() == null ^ this.getTargetConfigurationValueRollup() == null)
            return false;
        if (other.getTargetConfigurationValueRollup() != null
                && other.getTargetConfigurationValueRollup().equals(this.getTargetConfigurationValueRollup()) == false)
            return false;
        if (other.getTargetConfigurationValueSet() == null ^ this.getTargetConfigurationValueSet() == null)
            return false;
        if (other.getTargetConfigurationValueSet() != null && other.getTargetConfigurationValueSet().equals(this.getTargetConfigurationValueSet()) == false)
            return false;
        if (other.getValidationFailureReason() == null ^ this.getValidationFailureReason() == null)
            return false;
        if (other.getValidationFailureReason() != null && other.getValidationFailureReason().equals(this.getValidationFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getIsValidExchange() == null) ? 0 : getIsValidExchange().hashCode());
        hashCode = prime * hashCode + ((getOutputReservedInstancesWillExpireAt() == null) ? 0 : getOutputReservedInstancesWillExpireAt().hashCode());
        hashCode = prime * hashCode + ((getPaymentDue() == null) ? 0 : getPaymentDue().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceValueRollup() == null) ? 0 : getReservedInstanceValueRollup().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceValueSet() == null) ? 0 : getReservedInstanceValueSet().hashCode());
        hashCode = prime * hashCode + ((getTargetConfigurationValueRollup() == null) ? 0 : getTargetConfigurationValueRollup().hashCode());
        hashCode = prime * hashCode + ((getTargetConfigurationValueSet() == null) ? 0 : getTargetConfigurationValueSet().hashCode());
        hashCode = prime * hashCode + ((getValidationFailureReason() == null) ? 0 : getValidationFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public GetReservedInstancesExchangeQuoteResult clone() {
        try {
            return (GetReservedInstancesExchangeQuoteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
