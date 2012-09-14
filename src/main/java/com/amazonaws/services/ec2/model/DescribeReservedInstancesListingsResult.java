/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Describe Reserved Instances Listings Result
 */
public class DescribeReservedInstancesListingsResult {

    private java.util.List<ReservedInstancesListing> reservedInstancesListings;

    /**
     * Returns the value of the ReservedInstancesListings property for this
     * object.
     *
     * @return The value of the ReservedInstancesListings property for this object.
     */
    public java.util.List<ReservedInstancesListing> getReservedInstancesListings() {
        
        if (reservedInstancesListings == null) {
            reservedInstancesListings = new java.util.ArrayList<ReservedInstancesListing>();
        }
        return reservedInstancesListings;
    }
    
    /**
     * Sets the value of the ReservedInstancesListings property for this
     * object.
     *
     * @param reservedInstancesListings The new value for the ReservedInstancesListings property for this
     *         object.
     */
    public void setReservedInstancesListings(java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        if (reservedInstancesListings == null) {
            this.reservedInstancesListings = null;
            return;
        }

        java.util.List<ReservedInstancesListing> reservedInstancesListingsCopy = new java.util.ArrayList<ReservedInstancesListing>(reservedInstancesListings.size());
        reservedInstancesListingsCopy.addAll(reservedInstancesListings);
        this.reservedInstancesListings = reservedInstancesListingsCopy;
    }
    
    /**
     * Sets the value of the ReservedInstancesListings property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListings The new value for the ReservedInstancesListings property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesListingsResult withReservedInstancesListings(ReservedInstancesListing... reservedInstancesListings) {
        if (getReservedInstancesListings() == null) setReservedInstancesListings(new java.util.ArrayList<ReservedInstancesListing>(reservedInstancesListings.length));
        for (ReservedInstancesListing value : reservedInstancesListings) {
            getReservedInstancesListings().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ReservedInstancesListings property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListings The new value for the ReservedInstancesListings property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesListingsResult withReservedInstancesListings(java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        if (reservedInstancesListings == null) {
            this.reservedInstancesListings = null;
        } else {
            java.util.List<ReservedInstancesListing> reservedInstancesListingsCopy = new java.util.ArrayList<ReservedInstancesListing>(reservedInstancesListings.size());
            reservedInstancesListingsCopy.addAll(reservedInstancesListings);
            this.reservedInstancesListings = reservedInstancesListingsCopy;
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
        if (reservedInstancesListings != null) sb.append("ReservedInstancesListings: " + reservedInstancesListings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesListings() == null) ? 0 : getReservedInstancesListings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeReservedInstancesListingsResult == false) return false;
        DescribeReservedInstancesListingsResult other = (DescribeReservedInstancesListingsResult)obj;
        
        if (other.getReservedInstancesListings() == null ^ this.getReservedInstancesListings() == null) return false;
        if (other.getReservedInstancesListings() != null && other.getReservedInstancesListings().equals(this.getReservedInstancesListings()) == false) return false; 
        return true;
    }
    
}
    