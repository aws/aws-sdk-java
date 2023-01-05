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
 * Customer's consent for the owner change request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/Consent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Consent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum amount the customer agreed to accept.
     * </p>
     */
    private Double maxPrice;
    /**
     * <p>
     * Currency for the <code>MaxPrice</code>.
     * </p>
     */
    private String currency;

    /**
     * <p>
     * Maximum amount the customer agreed to accept.
     * </p>
     * 
     * @param maxPrice
     *        Maximum amount the customer agreed to accept.
     */

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * <p>
     * Maximum amount the customer agreed to accept.
     * </p>
     * 
     * @return Maximum amount the customer agreed to accept.
     */

    public Double getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * <p>
     * Maximum amount the customer agreed to accept.
     * </p>
     * 
     * @param maxPrice
     *        Maximum amount the customer agreed to accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent withMaxPrice(Double maxPrice) {
        setMaxPrice(maxPrice);
        return this;
    }

    /**
     * <p>
     * Currency for the <code>MaxPrice</code>.
     * </p>
     * 
     * @param currency
     *        Currency for the <code>MaxPrice</code>.
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * Currency for the <code>MaxPrice</code>.
     * </p>
     * 
     * @return Currency for the <code>MaxPrice</code>.
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * Currency for the <code>MaxPrice</code>.
     * </p>
     * 
     * @param currency
     *        Currency for the <code>MaxPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent withCurrency(String currency) {
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
        if (getMaxPrice() != null)
            sb.append("MaxPrice: ").append(getMaxPrice()).append(",");
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

        if (obj instanceof Consent == false)
            return false;
        Consent other = (Consent) obj;
        if (other.getMaxPrice() == null ^ this.getMaxPrice() == null)
            return false;
        if (other.getMaxPrice() != null && other.getMaxPrice().equals(this.getMaxPrice()) == false)
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

        hashCode = prime * hashCode + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        return hashCode;
    }

    @Override
    public Consent clone() {
        try {
            return (Consent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.ConsentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
