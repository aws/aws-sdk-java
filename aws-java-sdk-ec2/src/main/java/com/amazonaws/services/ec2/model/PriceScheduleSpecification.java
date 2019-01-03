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
 * Describes the price for a Reserved Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PriceScheduleSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriceScheduleSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The fixed price for the term.
     * </p>
     */
    private Double price;
    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the second to the last month before the
     * capacity reservation expires.
     * </p>
     */
    private Long term;

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     *        <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @return The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     *         <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     *        <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PriceScheduleSpecification withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     *        <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency for transacting the Reserved Instance resale. At this time, the only supported currency is
     *        <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PriceScheduleSpecification withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     * 
     * @param price
     *        The fixed price for the term.
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     * 
     * @return The fixed price for the term.
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     * 
     * @param price
     *        The fixed price for the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceScheduleSpecification withPrice(Double price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the second to the last month before the
     * capacity reservation expires.
     * </p>
     * 
     * @param term
     *        The number of months remaining in the reservation. For example, 2 is the second to the last month before
     *        the capacity reservation expires.
     */

    public void setTerm(Long term) {
        this.term = term;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the second to the last month before the
     * capacity reservation expires.
     * </p>
     * 
     * @return The number of months remaining in the reservation. For example, 2 is the second to the last month before
     *         the capacity reservation expires.
     */

    public Long getTerm() {
        return this.term;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the second to the last month before the
     * capacity reservation expires.
     * </p>
     * 
     * @param term
     *        The number of months remaining in the reservation. For example, 2 is the second to the last month before
     *        the capacity reservation expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriceScheduleSpecification withTerm(Long term) {
        setTerm(term);
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
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getTerm() != null)
            sb.append("Term: ").append(getTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PriceScheduleSpecification == false)
            return false;
        PriceScheduleSpecification other = (PriceScheduleSpecification) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        return hashCode;
    }

    @Override
    public PriceScheduleSpecification clone() {
        try {
            return (PriceScheduleSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
