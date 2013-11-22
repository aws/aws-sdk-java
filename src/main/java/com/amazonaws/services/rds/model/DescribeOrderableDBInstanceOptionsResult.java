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
 * <p>
 * Contains the result of a successful invocation of the DescribeOrderableDBInstanceOptions action.
 * </p>
 */
public class DescribeOrderableDBInstanceOptionsResult implements Serializable {

    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption> orderableDBInstanceOptions;

    /**
     * An optional pagination token provided by a previous
     * OrderableDBInstanceOptions request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     */
    private String marker;

    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB instance.
     *
     * @return An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB instance.
     */
    public java.util.List<OrderableDBInstanceOption> getOrderableDBInstanceOptions() {
        if (orderableDBInstanceOptions == null) {
              orderableDBInstanceOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption>();
              orderableDBInstanceOptions.setAutoConstruct(true);
        }
        return orderableDBInstanceOptions;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB instance.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB instance.
     */
    public void setOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        if (orderableDBInstanceOptions == null) {
            this.orderableDBInstanceOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption> orderableDBInstanceOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption>(orderableDBInstanceOptions.size());
        orderableDBInstanceOptionsCopy.addAll(orderableDBInstanceOptions);
        this.orderableDBInstanceOptions = orderableDBInstanceOptionsCopy;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(OrderableDBInstanceOption... orderableDBInstanceOptions) {
        if (getOrderableDBInstanceOptions() == null) setOrderableDBInstanceOptions(new java.util.ArrayList<OrderableDBInstanceOption>(orderableDBInstanceOptions.length));
        for (OrderableDBInstanceOption value : orderableDBInstanceOptions) {
            getOrderableDBInstanceOptions().add(value);
        }
        return this;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        if (orderableDBInstanceOptions == null) {
            this.orderableDBInstanceOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption> orderableDBInstanceOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableDBInstanceOption>(orderableDBInstanceOptions.size());
            orderableDBInstanceOptionsCopy.addAll(orderableDBInstanceOptions);
            this.orderableDBInstanceOptions = orderableDBInstanceOptionsCopy;
        }

        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * OrderableDBInstanceOptions request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @return An optional pagination token provided by a previous
     *         OrderableDBInstanceOptions request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * OrderableDBInstanceOptions request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @param marker An optional pagination token provided by a previous
     *         OrderableDBInstanceOptions request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * OrderableDBInstanceOptions request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         OrderableDBInstanceOptions request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableDBInstanceOptionsResult withMarker(String marker) {
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
        if (getOrderableDBInstanceOptions() != null) sb.append("OrderableDBInstanceOptions: " + getOrderableDBInstanceOptions() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOrderableDBInstanceOptions() == null) ? 0 : getOrderableDBInstanceOptions().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOrderableDBInstanceOptionsResult == false) return false;
        DescribeOrderableDBInstanceOptionsResult other = (DescribeOrderableDBInstanceOptionsResult)obj;
        
        if (other.getOrderableDBInstanceOptions() == null ^ this.getOrderableDBInstanceOptions() == null) return false;
        if (other.getOrderableDBInstanceOptions() != null && other.getOrderableDBInstanceOptions().equals(this.getOrderableDBInstanceOptions()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    