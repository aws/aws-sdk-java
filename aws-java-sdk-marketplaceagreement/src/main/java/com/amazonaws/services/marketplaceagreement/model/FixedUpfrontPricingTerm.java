/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a prepaid pricing model where the customers are charged a fixed upfront amount.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/FixedUpfrontPricingTerm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedUpfrontPricingTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the currency for the prices mentioned in this term.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Contract duration for the terms.
     * </p>
     */
    private String duration;
    /**
     * <p>
     * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * </p>
     */
    private java.util.List<GrantItem> grants;
    /**
     * <p>
     * Fixed amount to be charged to the customer when this term is accepted.
     * </p>
     */
    private String price;
    /**
     * <p>
     * Category of the term being updated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Defines the currency for the prices mentioned in this term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in this term.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in this term.
     * </p>
     * 
     * @return Defines the currency for the prices mentioned in this term.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in this term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in this term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * Contract duration for the terms.
     * </p>
     * 
     * @param duration
     *        Contract duration for the terms.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Contract duration for the terms.
     * </p>
     * 
     * @return Contract duration for the terms.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Contract duration for the terms.
     * </p>
     * 
     * @param duration
     *        Contract duration for the terms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * </p>
     * 
     * @return Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     */

    public java.util.List<GrantItem> getGrants() {
        return grants;
    }

    /**
     * <p>
     * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * </p>
     * 
     * @param grants
     *        Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     */

    public void setGrants(java.util.Collection<GrantItem> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<GrantItem>(grants);
    }

    /**
     * <p>
     * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrants(java.util.Collection)} or {@link #withGrants(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param grants
     *        Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withGrants(GrantItem... grants) {
        if (this.grants == null) {
            setGrants(new java.util.ArrayList<GrantItem>(grants.length));
        }
        for (GrantItem ele : grants) {
            this.grants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * </p>
     * 
     * @param grants
     *        Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withGrants(java.util.Collection<GrantItem> grants) {
        setGrants(grants);
        return this;
    }

    /**
     * <p>
     * Fixed amount to be charged to the customer when this term is accepted.
     * </p>
     * 
     * @param price
     *        Fixed amount to be charged to the customer when this term is accepted.
     */

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * <p>
     * Fixed amount to be charged to the customer when this term is accepted.
     * </p>
     * 
     * @return Fixed amount to be charged to the customer when this term is accepted.
     */

    public String getPrice() {
        return this.price;
    }

    /**
     * <p>
     * Fixed amount to be charged to the customer when this term is accepted.
     * </p>
     * 
     * @param price
     *        Fixed amount to be charged to the customer when this term is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withPrice(String price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @return Category of the term being updated.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedUpfrontPricingTerm withType(String type) {
        setType(type);
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
        if (getGrants() != null)
            sb.append("Grants: ").append(getGrants()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedUpfrontPricingTerm == false)
            return false;
        FixedUpfrontPricingTerm other = (FixedUpfrontPricingTerm) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getGrants() == null ^ this.getGrants() == null)
            return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FixedUpfrontPricingTerm clone() {
        try {
            return (FixedUpfrontPricingTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.FixedUpfrontPricingTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
