/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

/**
 * Inventory Retrieval Job Input
 */
public class InventoryRetrievalJobInput implements Serializable {

    private String startDate;

    private String endDate;

    private String limit;

    private String marker;

    /**
     * Returns the value of the StartDate property for this object.
     *
     * @return The value of the StartDate property for this object.
     */
    public String getStartDate() {
        return startDate;
    }
    
    /**
     * Sets the value of the StartDate property for this object.
     *
     * @param startDate The new value for the StartDate property for this object.
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Sets the value of the StartDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDate The new value for the StartDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InventoryRetrievalJobInput withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Returns the value of the EndDate property for this object.
     *
     * @return The value of the EndDate property for this object.
     */
    public String getEndDate() {
        return endDate;
    }
    
    /**
     * Sets the value of the EndDate property for this object.
     *
     * @param endDate The new value for the EndDate property for this object.
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    /**
     * Sets the value of the EndDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDate The new value for the EndDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InventoryRetrievalJobInput withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Returns the value of the Limit property for this object.
     *
     * @return The value of the Limit property for this object.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     *
     * @param limit The new value for the Limit property for this object.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit The new value for the Limit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InventoryRetrievalJobInput withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns the value of the Marker property for this object.
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InventoryRetrievalJobInput withMarker(String marker) {
        this.marker = marker;
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
        if (getStartDate() != null) sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null) sb.append("EndDate: " + getEndDate() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode()); 
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InventoryRetrievalJobInput == false) return false;
        InventoryRetrievalJobInput other = (InventoryRetrievalJobInput)obj;
        
        if (other.getStartDate() == null ^ this.getStartDate() == null) return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false) return false; 
        if (other.getEndDate() == null ^ this.getEndDate() == null) return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    