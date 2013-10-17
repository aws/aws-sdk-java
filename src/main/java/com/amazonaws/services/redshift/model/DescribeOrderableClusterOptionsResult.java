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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the output from the DescribeOrderableClusterOptions action.
 * </p>
 */
public class DescribeOrderableClusterOptionsResult implements Serializable {

    /**
     * An <a>OrderableClusterOption</a> structure containing information
     * about orderable options for the Cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption> orderableClusterOptions;

    /**
     * A marker that can be used to retrieve paginated results.
     */
    private String marker;

    /**
     * An <a>OrderableClusterOption</a> structure containing information
     * about orderable options for the Cluster.
     *
     * @return An <a>OrderableClusterOption</a> structure containing information
     *         about orderable options for the Cluster.
     */
    public java.util.List<OrderableClusterOption> getOrderableClusterOptions() {
        if (orderableClusterOptions == null) {
              orderableClusterOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption>();
              orderableClusterOptions.setAutoConstruct(true);
        }
        return orderableClusterOptions;
    }
    
    /**
     * An <a>OrderableClusterOption</a> structure containing information
     * about orderable options for the Cluster.
     *
     * @param orderableClusterOptions An <a>OrderableClusterOption</a> structure containing information
     *         about orderable options for the Cluster.
     */
    public void setOrderableClusterOptions(java.util.Collection<OrderableClusterOption> orderableClusterOptions) {
        if (orderableClusterOptions == null) {
            this.orderableClusterOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption> orderableClusterOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption>(orderableClusterOptions.size());
        orderableClusterOptionsCopy.addAll(orderableClusterOptions);
        this.orderableClusterOptions = orderableClusterOptionsCopy;
    }
    
    /**
     * An <a>OrderableClusterOption</a> structure containing information
     * about orderable options for the Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableClusterOptions An <a>OrderableClusterOption</a> structure containing information
     *         about orderable options for the Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsResult withOrderableClusterOptions(OrderableClusterOption... orderableClusterOptions) {
        if (getOrderableClusterOptions() == null) setOrderableClusterOptions(new java.util.ArrayList<OrderableClusterOption>(orderableClusterOptions.length));
        for (OrderableClusterOption value : orderableClusterOptions) {
            getOrderableClusterOptions().add(value);
        }
        return this;
    }
    
    /**
     * An <a>OrderableClusterOption</a> structure containing information
     * about orderable options for the Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderableClusterOptions An <a>OrderableClusterOption</a> structure containing information
     *         about orderable options for the Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsResult withOrderableClusterOptions(java.util.Collection<OrderableClusterOption> orderableClusterOptions) {
        if (orderableClusterOptions == null) {
            this.orderableClusterOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption> orderableClusterOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OrderableClusterOption>(orderableClusterOptions.size());
            orderableClusterOptionsCopy.addAll(orderableClusterOptions);
            this.orderableClusterOptions = orderableClusterOptionsCopy;
        }

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
    public DescribeOrderableClusterOptionsResult withMarker(String marker) {
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
        if (getOrderableClusterOptions() != null) sb.append("OrderableClusterOptions: " + getOrderableClusterOptions() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOrderableClusterOptions() == null) ? 0 : getOrderableClusterOptions().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOrderableClusterOptionsResult == false) return false;
        DescribeOrderableClusterOptionsResult other = (DescribeOrderableClusterOptionsResult)obj;
        
        if (other.getOrderableClusterOptions() == null ^ this.getOrderableClusterOptions() == null) return false;
        if (other.getOrderableClusterOptions() != null && other.getOrderableClusterOptions().equals(this.getOrderableClusterOptions()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    