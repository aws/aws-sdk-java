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
 * Describes the limit price of a Reserved Instance offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstanceLimitPrice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceLimitPrice implements Serializable, Cloneable {

    /**
     * <p>
     * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount *
     * price).
     * </p>
     */
    private Double amount;
    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount *
     * price).
     * </p>
     * 
     * @param amount
     *        Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order
     *        (instanceCount * price).
     */

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount *
     * price).
     * </p>
     * 
     * @return Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order
     *         (instanceCount * price).
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount *
     * price).
     * </p>
     * 
     * @param amount
     *        Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order
     *        (instanceCount * price).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceLimitPrice withAmount(Double amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported
     *        currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     * 
     * @return The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported
     *         currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported
     *        currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstanceLimitPrice withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported
     *        currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported currency
     * is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>limitPrice</code> amount is specified. At this time, the only supported
     *        currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstanceLimitPrice withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
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
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstanceLimitPrice == false)
            return false;
        ReservedInstanceLimitPrice other = (ReservedInstanceLimitPrice) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstanceLimitPrice clone() {
        try {
            return (ReservedInstanceLimitPrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
