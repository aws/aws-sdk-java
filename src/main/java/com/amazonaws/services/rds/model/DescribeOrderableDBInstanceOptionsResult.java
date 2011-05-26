/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * DescribeOrderableDBInstanceOptions action.
 * </p>
 */
public class DescribeOrderableDBInstanceOptionsResult {

    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB Instance.
     */
    private java.util.List<OrderableDBInstanceOption> orderableDBInstanceOptions;

    /**
     * A marker that can be used to retrieve paginated results.
     */
    private String marker;

    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB Instance.
     *
     * @return An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB Instance.
     */
    public java.util.List<OrderableDBInstanceOption> getOrderableDBInstanceOptions() {
        if (orderableDBInstanceOptions == null) {
            orderableDBInstanceOptions = new java.util.ArrayList<OrderableDBInstanceOption>();
        }
        return orderableDBInstanceOptions;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB Instance.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB Instance.
     */
    public void setOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        java.util.List<OrderableDBInstanceOption> orderableDBInstanceOptionsCopy = new java.util.ArrayList<OrderableDBInstanceOption>();
        if (orderableDBInstanceOptions != null) {
            orderableDBInstanceOptionsCopy.addAll(orderableDBInstanceOptions);
        }
        this.orderableDBInstanceOptions = orderableDBInstanceOptionsCopy;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(OrderableDBInstanceOption... orderableDBInstanceOptions) {
        for (OrderableDBInstanceOption value : orderableDBInstanceOptions) {
            getOrderableDBInstanceOptions().add(value);
        }
        return this;
    }
    
    /**
     * An <a>OrderableDBInstanceOption</a> structure containing information
     * about orderable options for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableDBInstanceOptions An <a>OrderableDBInstanceOption</a> structure containing information
     *         about orderable options for the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        java.util.List<OrderableDBInstanceOption> orderableDBInstanceOptionsCopy = new java.util.ArrayList<OrderableDBInstanceOption>();
        if (orderableDBInstanceOptions != null) {
            orderableDBInstanceOptionsCopy.addAll(orderableDBInstanceOptions);
        }
        this.orderableDBInstanceOptions = orderableDBInstanceOptionsCopy;

        return this;
    }
    
    /**
     * A marker that can be used to retrieve paginated results.
     *
     * @return A marker that can be used to retrieve paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker that can be used to retrieve paginated results.
     *
     * @param marker A marker that can be used to retrieve paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker that can be used to retrieve paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker that can be used to retrieve paginated results.
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
        sb.append("OrderableDBInstanceOptions: " + orderableDBInstanceOptions + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    