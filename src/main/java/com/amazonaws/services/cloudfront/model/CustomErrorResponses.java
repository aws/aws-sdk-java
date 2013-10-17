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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains zero or more CustomErrorResponse elements.
 * </p>
 */
public class CustomErrorResponses implements Serializable {

    /**
     * The number of custom error responses for this distribution.
     */
    private Integer quantity;

    /**
     * Optional: A complex type that contains custom error responses for this
     * distribution. If Quantity is 0, you can omit Items.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse> items;

    /**
     * The number of custom error responses for this distribution.
     *
     * @return The number of custom error responses for this distribution.
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of custom error responses for this distribution.
     *
     * @param quantity The number of custom error responses for this distribution.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of custom error responses for this distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of custom error responses for this distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponses withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Optional: A complex type that contains custom error responses for this
     * distribution. If Quantity is 0, you can omit Items.
     *
     * @return Optional: A complex type that contains custom error responses for this
     *         distribution. If Quantity is 0, you can omit Items.
     */
    public java.util.List<CustomErrorResponse> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * Optional: A complex type that contains custom error responses for this
     * distribution. If Quantity is 0, you can omit Items.
     *
     * @param items Optional: A complex type that contains custom error responses for this
     *         distribution. If Quantity is 0, you can omit Items.
     */
    public void setItems(java.util.Collection<CustomErrorResponse> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * Optional: A complex type that contains custom error responses for this
     * distribution. If Quantity is 0, you can omit Items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items Optional: A complex type that contains custom error responses for this
     *         distribution. If Quantity is 0, you can omit Items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponses withItems(CustomErrorResponse... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<CustomErrorResponse>(items.length));
        for (CustomErrorResponse value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * Optional: A complex type that contains custom error responses for this
     * distribution. If Quantity is 0, you can omit Items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items Optional: A complex type that contains custom error responses for this
     *         distribution. If Quantity is 0, you can omit Items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponses withItems(java.util.Collection<CustomErrorResponse> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomErrorResponse>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

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
        if (getQuantity() != null) sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null) sb.append("Items: " + getItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode()); 
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CustomErrorResponses == false) return false;
        CustomErrorResponses other = (CustomErrorResponses)obj;
        
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
}
    