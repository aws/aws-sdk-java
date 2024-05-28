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
 * Defines a pricing model where customers are charged a fixed recurring price at the end of each billing period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/RecurringPaymentTerm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecurringPaymentTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the recurrence at which buyers are charged.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * Defines the currency for the prices mentioned in this term.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Amount charged to the buyer every billing period.
     * </p>
     */
    private String price;
    /**
     * <p>
     * Type of the term being updated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Defines the recurrence at which buyers are charged.
     * </p>
     * 
     * @param billingPeriod
     *        Defines the recurrence at which buyers are charged.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * Defines the recurrence at which buyers are charged.
     * </p>
     * 
     * @return Defines the recurrence at which buyers are charged.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * Defines the recurrence at which buyers are charged.
     * </p>
     * 
     * @param billingPeriod
     *        Defines the recurrence at which buyers are charged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringPaymentTerm withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

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

    public RecurringPaymentTerm withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * Amount charged to the buyer every billing period.
     * </p>
     * 
     * @param price
     *        Amount charged to the buyer every billing period.
     */

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * <p>
     * Amount charged to the buyer every billing period.
     * </p>
     * 
     * @return Amount charged to the buyer every billing period.
     */

    public String getPrice() {
        return this.price;
    }

    /**
     * <p>
     * Amount charged to the buyer every billing period.
     * </p>
     * 
     * @param price
     *        Amount charged to the buyer every billing period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringPaymentTerm withPrice(String price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * Type of the term being updated.
     * </p>
     * 
     * @param type
     *        Type of the term being updated.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the term being updated.
     * </p>
     * 
     * @return Type of the term being updated.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the term being updated.
     * </p>
     * 
     * @param type
     *        Type of the term being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringPaymentTerm withType(String type) {
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
        if (getBillingPeriod() != null)
            sb.append("BillingPeriod: ").append(getBillingPeriod()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
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

        if (obj instanceof RecurringPaymentTerm == false)
            return false;
        RecurringPaymentTerm other = (RecurringPaymentTerm) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
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

        hashCode = prime * hashCode + ((getBillingPeriod() == null) ? 0 : getBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RecurringPaymentTerm clone() {
        try {
            return (RecurringPaymentTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.RecurringPaymentTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
