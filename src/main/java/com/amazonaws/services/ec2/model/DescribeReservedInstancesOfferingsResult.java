/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The result of describing Reserved Instance offerings.
 * </p>
 */
public class DescribeReservedInstancesOfferingsResult {

    /**
     * The list of described Reserved Instance offerings.
     */
    private java.util.List<ReservedInstancesOffering> reservedInstancesOfferings;

    /**
     * The list of described Reserved Instance offerings.
     *
     * @return The list of described Reserved Instance offerings.
     */
    public java.util.List<ReservedInstancesOffering> getReservedInstancesOfferings() {
        if (reservedInstancesOfferings == null) {
            reservedInstancesOfferings = new java.util.ArrayList<ReservedInstancesOffering>();
        }
        return reservedInstancesOfferings;
    }
    
    /**
     * The list of described Reserved Instance offerings.
     *
     * @param reservedInstancesOfferings The list of described Reserved Instance offerings.
     */
    public void setReservedInstancesOfferings(java.util.Collection<ReservedInstancesOffering> reservedInstancesOfferings) {
        java.util.List<ReservedInstancesOffering> reservedInstancesOfferingsCopy = new java.util.ArrayList<ReservedInstancesOffering>();
        if (reservedInstancesOfferings != null) {
            reservedInstancesOfferingsCopy.addAll(reservedInstancesOfferings);
        }
        this.reservedInstancesOfferings = reservedInstancesOfferingsCopy;
    }
    
    /**
     * The list of described Reserved Instance offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferings The list of described Reserved Instance offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsResult withReservedInstancesOfferings(ReservedInstancesOffering... reservedInstancesOfferings) {
        for (ReservedInstancesOffering value : reservedInstancesOfferings) {
            getReservedInstancesOfferings().add(value);
        }
        return this;
    }
    
    /**
     * The list of described Reserved Instance offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferings The list of described Reserved Instance offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsResult withReservedInstancesOfferings(java.util.Collection<ReservedInstancesOffering> reservedInstancesOfferings) {
        java.util.List<ReservedInstancesOffering> reservedInstancesOfferingsCopy = new java.util.ArrayList<ReservedInstancesOffering>();
        if (reservedInstancesOfferings != null) {
            reservedInstancesOfferingsCopy.addAll(reservedInstancesOfferings);
        }
        this.reservedInstancesOfferings = reservedInstancesOfferingsCopy;

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
        
        sb.append("ReservedInstancesOfferings: " + reservedInstancesOfferings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    