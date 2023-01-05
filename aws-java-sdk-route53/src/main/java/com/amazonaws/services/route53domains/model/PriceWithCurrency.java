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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Currency-specific price information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/PriceWithCurrency" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriceWithCurrency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The price of a domain, in a specific currency.
     * </p>
     */
    private Double price;
    /**
     * <p>
     * The currency specifier.
     * </p>
     */
    private String currency;

    /**
     * <p>
     * The price of a domain, in a specific currency.
     * </p>
     * 
     * @param price
     *        The price of a domain, in a specific currency.
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The price of a domain, in a specific currency.
     * </p>
     * 
     * @return The price of a domain, in a specific currency.
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The price of a domain, in a specific currency.
     * </p>
     * 
     * @param price
     *        The price of a domain, in a specific currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceWithCurrency withPrice(Double price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The currency specifier.
     * </p>
     * 
     * @param currency
     *        The currency specifier.
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency specifier.
     * </p>
     * 
     * @return The currency specifier.
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency specifier.
     * </p>
     * 
     * @param currency
     *        The currency specifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceWithCurrency withCurrency(String currency) {
        setCurrency(currency);
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
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PriceWithCurrency == false)
            return false;
        PriceWithCurrency other = (PriceWithCurrency) obj;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        return hashCode;
    }

    @Override
    public PriceWithCurrency clone() {
        try {
            return (PriceWithCurrency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.PriceWithCurrencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
