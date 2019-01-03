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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A number representing the monetary amount for an offering or transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/MonetaryAmount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonetaryAmount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numerical amount of an offering or transaction.
     * </p>
     */
    private Double amount;
    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The numerical amount of an offering or transaction.
     * </p>
     * 
     * @param amount
     *        The numerical amount of an offering or transaction.
     */

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The numerical amount of an offering or transaction.
     * </p>
     * 
     * @return The numerical amount of an offering or transaction.
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The numerical amount of an offering or transaction.
     * </p>
     * 
     * @param amount
     *        The numerical amount of an offering or transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonetaryAmount withAmount(Double amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     * 
     * @param currencyCode
     *        The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * @see CurrencyCode
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     * 
     * @return The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * @see CurrencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     * 
     * @param currencyCode
     *        The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public MonetaryAmount withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     * 
     * @param currencyCode
     *        The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * @see CurrencyCode
     */

    public void setCurrencyCode(CurrencyCode currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * </p>
     * 
     * @param currencyCode
     *        The currency code of a monetary amount. For example, <code>USD</code> means "U.S. dollars."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public MonetaryAmount withCurrencyCode(CurrencyCode currencyCode) {
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

        if (obj instanceof MonetaryAmount == false)
            return false;
        MonetaryAmount other = (MonetaryAmount) obj;
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
    public MonetaryAmount clone() {
        try {
            return (MonetaryAmount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.MonetaryAmountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
