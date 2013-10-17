/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Price Schedule Specification
 */
public class PriceScheduleSpecification implements Serializable {

    private Long term;

    private Double price;

    private String currencyCode;

    /**
     * Returns the value of the Term property for this object.
     *
     * @return The value of the Term property for this object.
     */
    public Long getTerm() {
        return term;
    }
    
    /**
     * Sets the value of the Term property for this object.
     *
     * @param term The new value for the Term property for this object.
     */
    public void setTerm(Long term) {
        this.term = term;
    }
    
    /**
     * Sets the value of the Term property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param term The new value for the Term property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PriceScheduleSpecification withTerm(Long term) {
        this.term = term;
        return this;
    }

    /**
     * Returns the value of the Price property for this object.
     *
     * @return The value of the Price property for this object.
     */
    public Double getPrice() {
        return price;
    }
    
    /**
     * Sets the value of the Price property for this object.
     *
     * @param price The new value for the Price property for this object.
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    /**
     * Sets the value of the Price property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param price The new value for the Price property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PriceScheduleSpecification withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Returns the value of the CurrencyCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return The value of the CurrencyCode property for this object.
     *
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * Sets the value of the CurrencyCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The new value for the CurrencyCode property for this object.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * Sets the value of the CurrencyCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The new value for the CurrencyCode property for this object.
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
     * Sets the value of the CurrencyCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The new value for the CurrencyCode property for this object.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }
    
    /**
     * Sets the value of the CurrencyCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The new value for the CurrencyCode property for this object.
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
    