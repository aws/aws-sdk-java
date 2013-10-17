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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesListings(DescribeReservedInstancesListingsRequest) DescribeReservedInstancesListings operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesListings(DescribeReservedInstancesListingsRequest)
 */
public class DescribeReservedInstancesListingsRequest extends AmazonWebServiceRequest implements Serializable {

    private String reservedInstancesId;

    private String reservedInstancesListingId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Returns the value of the ReservedInstancesId property for this object.
     *
     * @return The value of the ReservedInstancesId property for this object.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * Returns the value of the ReservedInstancesListingId property for this
     * object.
     *
     * @return The value of the ReservedInstancesListingId property for this object.
     */
    public String getReservedInstancesListingId() {
        return reservedInstancesListingId;
    }
    
    /**
     * Sets the value of the ReservedInstancesListingId property for this
     * object.
     *
     * @param reservedInstancesListingId The new value for the ReservedInstancesListingId property for this
     *         object.
     */
    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }
    
    /**
     * Sets the value of the ReservedInstancesListingId property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListingId The new value for the ReservedInstancesListingId property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
        return this;
    }

    /**
     * Returns the value of the Filters property for this object.
     *
     * @return The value of the Filters property for this object.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     *
     * @param filters The new value for the Filters property for this object.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getReservedInstancesListingId() != null) sb.append("ReservedInstancesListingId: " + getReservedInstancesListingId() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesListingsRequest == false) return false;
        DescribeReservedInstancesListingsRequest other = (DescribeReservedInstancesListingsRequest)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null) return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    