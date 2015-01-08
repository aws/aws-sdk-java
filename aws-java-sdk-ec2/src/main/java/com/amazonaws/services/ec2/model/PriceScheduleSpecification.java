/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the price for a Reserved Instance.
 * </p>
 */
public class PriceScheduleSpecification implements Serializable {

    /**
     * The number of months remaining in the reservation. For example, 2 is
     * the second to the last month before the capacity reservation expires.
     */
    private Long term;

    /**
     * The fixed price for the term.
     */
    private Double price;

    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * The number of months remaining in the reservation. For example, 2 is
     * the second to the last month before the capacity reservation expires.
     *
     * @return The number of months remaining in the reservation. For example, 2 is
     *         the second to the last month before the capacity reservation expires.
     */
    public Long getTerm() {
        return term;
    }
    
    /**
     * The number of months remaining in the reservation. For example, 2 is
     * the second to the last month before the capacity reservation expires.
     *
     * @param term The number of months remaining in the reservation. For example, 2 is
     *         the second to the last month before the capacity reservation expires.
     */
    public void setTerm(Long term) {
        this.term = term;
    }
    
    /**
     * The number of months remaining in the reservation. For example, 2 is
     * the second to the last month before the capacity reservation expires.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param term The number of months remaining in the reservation. For example, 2 is
     *         the second to the last month before the capacity reservation expires.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PriceScheduleSpecification withTerm(Long term) {
        this.term = term;
        return this;
    }

    /**
     * The fixed price for the term.
     *
     * @return The fixed price for the term.
     */
    public Double getPrice() {
        return price;
    }
    
    /**
     * The fixed price for the term.
     *
     * @param price The fixed price for the term.
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    /**
     * The fixed price for the term.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param price The fixed price for the term.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PriceScheduleSpecification withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return The currency for transacting the Reserved Instance resale. At this
     *         time, the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency for transacting the Reserved Instance resale. At this
     *         time, the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency for transacting the Reserved Instance resale. At this
     *         time, the only supported currency is <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public PriceScheduleSpecification withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency for transacting the Reserved Instance resale. At this
     *         time, the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }
    
    /**
     * The currency for transacting the Reserved Instance resale. At this
     * time, the only supported currency is <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency for transacting the Reserved Instance resale. At this
     *         time, the only supported currency is <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public PriceScheduleSpecification withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTerm() != null) sb.append("Term: " + getTerm() + ",");
        if (getPrice() != null) sb.append("Price: " + getPrice() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode()); 
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PriceScheduleSpecification == false) return false;
        PriceScheduleSpecification other = (PriceScheduleSpecification)obj;
        
        if (other.getTerm() == null ^ this.getTerm() == null) return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false) return false; 
        if (other.getPrice() == null ^ this.getPrice() == null) return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        return true;
    }
    
}
    