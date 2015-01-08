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
 * Describes a Reserved Instance offering.
 * </p>
 */
public class PricingDetail implements Serializable {

    /**
     * The price per instance.
     */
    private Double price;

    /**
     * The number of instances available for the price.
     */
    private Integer count;

    /**
     * The price per instance.
     *
     * @return The price per instance.
     */
    public Double getPrice() {
        return price;
    }
    
    /**
     * The price per instance.
     *
     * @param price The price per instance.
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    /**
     * The price per instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param price The price per instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PricingDetail withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * The number of instances available for the price.
     *
     * @return The number of instances available for the price.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * The number of instances available for the price.
     *
     * @param count The number of instances available for the price.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * The number of instances available for the price.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The number of instances available for the price.
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
    