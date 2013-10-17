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
 * Reserved Instance Limit Price
 */
public class ReservedInstanceLimitPrice implements Serializable {

    private Double amount;

    private String currencyCode;

    /**
     * Returns the value of the Amount property for this object.
     *
     * @return The value of the Amount property for this object.
     */
    public Double getAmount() {
        return amount;
    }
    
    /**
     * Sets the value of the Amount property for this object.
     *
     * @param amount The new value for the Amount property for this object.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    /**
     * Sets the value of the Amount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amount The new value for the Amount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstanceLimitPrice withAmount(Double amount) {
        this.amount = amount;
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
    public ReservedInstanceLimitPrice withCurrencyCode(String currencyCode) {
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
    public ReservedInstanceLimitPrice withCurrencyCode(CurrencyCodeValues currencyCode) {
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
        if (getAmount() != null) sb.append("Amount: " + getAmount() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstanceLimitPrice == false) return false;
        ReservedInstanceLimitPrice other = (ReservedInstanceLimitPrice)obj;
        
        if (other.getAmount() == null ^ this.getAmount() == null) return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        return true;
    }
    
}
    