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
 * Pricing Detail
 */
public class PricingDetail implements Serializable {

    private Double price;

    private Integer count;

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
    public PricingDetail withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Returns the value of the Count property for this object.
     *
     * @return The value of the Count property for this object.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     *
     * @param count The new value for the Count property for this object.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The new value for the Count property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PricingDetail withCount(Integer count) {
        this.count = count;
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
        if (getPrice() != null) sb.append("Price: " + getPrice() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PricingDetail == false) return false;
        PricingDetail other = (PricingDetail)obj;
        
        if (other.getPrice() == null ^ this.getPrice() == null) return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        return true;
    }
    
}
    