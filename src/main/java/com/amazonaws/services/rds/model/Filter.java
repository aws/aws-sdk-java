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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * 
 */
public class Filter implements Serializable {

    /**
     * This parameter is not currently supported.
     */
    private String filterName;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> filterValue;

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public String getFilterName() {
        return filterName;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filterName This parameter is not currently supported.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filterName This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Filter withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<String> getFilterValue() {
        if (filterValue == null) {
              filterValue = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              filterValue.setAutoConstruct(true);
        }
        return filterValue;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filterValue This parameter is not currently supported.
     */
    public void setFilterValue(java.util.Collection<String> filterValue) {
        if (filterValue == null) {
            this.filterValue = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> filterValueCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(filterValue.size());
        filterValueCopy.addAll(filterValue);
        this.filterValue = filterValueCopy;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filterValue This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Filter withFilterValue(String... filterValue) {
        if (getFilterValue() == null) setFilterValue(new java.util.ArrayList<String>(filterValue.length));
        for (String value : filterValue) {
            getFilterValue().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filterValue This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Filter withFilterValue(java.util.Collection<String> filterValue) {
        if (filterValue == null) {
            this.filterValue = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> filterValueCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(filterValue.size());
            filterValueCopy.addAll(filterValue);
            this.filterValue = filterValueCopy;
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
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterValue() != null) sb.append("FilterValue: " + getFilterValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterValue() == null) ? 0 : getFilterValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Filter == false) return false;
        Filter other = (Filter)obj;
        
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        if (other.getFilterValue() == null ^ this.getFilterValue() == null) return false;
        if (other.getFilterValue() != null && other.getFilterValue().equals(this.getFilterValue()) == false) return false; 
        return true;
    }
    
}
    