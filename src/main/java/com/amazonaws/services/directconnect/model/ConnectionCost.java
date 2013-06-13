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
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * Cost description.
 * </p>
 */
public class ConnectionCost  implements Serializable  {

    /**
     * The name of the cost item. <p>Example: Inbound data transfer
     */
    private String name;

    /**
     * The unit used in cost calculation. <p>Example: "Gbps," if the price is
     * calculated based on Gbps.
     */
    private String unit;

    /**
     * Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     */
    private String currencyCode;

    /**
     * The amount of charge per unit. <p>Example: 0.01
     */
    private String amount;

    /**
     * The name of the cost item. <p>Example: Inbound data transfer
     *
     * @return The name of the cost item. <p>Example: Inbound data transfer
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the cost item. <p>Example: Inbound data transfer
     *
     * @param name The name of the cost item. <p>Example: Inbound data transfer
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the cost item. <p>Example: Inbound data transfer
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the cost item. <p>Example: Inbound data transfer
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConnectionCost withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The unit used in cost calculation. <p>Example: "Gbps," if the price is
     * calculated based on Gbps.
     *
     * @return The unit used in cost calculation. <p>Example: "Gbps," if the price is
     *         calculated based on Gbps.
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * The unit used in cost calculation. <p>Example: "Gbps," if the price is
     * calculated based on Gbps.
     *
     * @param unit The unit used in cost calculation. <p>Example: "Gbps," if the price is
     *         calculated based on Gbps.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * The unit used in cost calculation. <p>Example: "Gbps," if the price is
     * calculated based on Gbps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unit The unit used in cost calculation. <p>Example: "Gbps," if the price is
     *         calculated based on Gbps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConnectionCost withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     *
     * @return Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     *
     * @param currencyCode Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode Currency code based on ISO 4217. <p>Example: "USD" for US dollar.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConnectionCost withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    /**
     * The amount of charge per unit. <p>Example: 0.01
     *
     * @return The amount of charge per unit. <p>Example: 0.01
     */
    public String getAmount() {
        return amount;
    }
    
    /**
     * The amount of charge per unit. <p>Example: 0.01
     *
     * @param amount The amount of charge per unit. <p>Example: 0.01
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    /**
     * The amount of charge per unit. <p>Example: 0.01
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amount The amount of charge per unit. <p>Example: 0.01
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConnectionCost withAmount(String amount) {
        this.amount = amount;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getUnit() != null) sb.append("Unit: " + getUnit() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getAmount() != null) sb.append("Amount: " + getAmount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConnectionCost == false) return false;
        ConnectionCost other = (ConnectionCost)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getUnit() == null ^ this.getUnit() == null) return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getAmount() == null ^ this.getAmount() == null) return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false) return false; 
        return true;
    }
    
}
    