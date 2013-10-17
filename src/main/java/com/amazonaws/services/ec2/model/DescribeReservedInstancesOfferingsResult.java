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


/**
 * <p>
 * The result of describing Reserved Instance offerings.
 * </p>
 */
public class DescribeReservedInstancesOfferingsResult implements Serializable {

    /**
     * The list of described Reserved Instance offerings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering> reservedInstancesOfferings;

    private String nextToken;

    /**
     * The list of described Reserved Instance offerings.
     *
     * @return The list of described Reserved Instance offerings.
     */
    public java.util.List<ReservedInstancesOffering> getReservedInstancesOfferings() {
        if (reservedInstancesOfferings == null) {
              reservedInstancesOfferings = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering>();
              reservedInstancesOfferings.setAutoConstruct(true);
        }
        return reservedInstancesOfferings;
    }
    
    /**
     * The list of described Reserved Instance offerings.
     *
     * @param reservedInstancesOfferings The list of described Reserved Instance offerings.
     */
    public void setReservedInstancesOfferings(java.util.Collection<ReservedInstancesOffering> reservedInstancesOfferings) {
        if (reservedInstancesOfferings == null) {
            this.reservedInstancesOfferings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering> reservedInstancesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering>(reservedInstancesOfferings.size());
        reservedInstancesOfferingsCopy.addAll(reservedInstancesOfferings);
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
        if (getReservedInstancesOfferings() == null) setReservedInstancesOfferings(new java.util.ArrayList<ReservedInstancesOffering>(reservedInstancesOfferings.length));
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
        if (reservedInstancesOfferings == null) {
            this.reservedInstancesOfferings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering> reservedInstancesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesOffering>(reservedInstancesOfferings.size());
            reservedInstancesOfferingsCopy.addAll(reservedInstancesOfferings);
            this.reservedInstancesOfferings = reservedInstancesOfferingsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getReservedInstancesOfferings() != null) sb.append("ReservedInstancesOfferings: " + getReservedInstancesOfferings() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesOfferings() == null) ? 0 : getReservedInstancesOfferings().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesOfferingsResult == false) return false;
        DescribeReservedInstancesOfferingsResult other = (DescribeReservedInstancesOfferingsResult)obj;
        
        if (other.getReservedInstancesOfferings() == null ^ this.getReservedInstancesOfferings() == null) return false;
        if (other.getReservedInstancesOfferings() != null && other.getReservedInstancesOfferings().equals(this.getReservedInstancesOfferings()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    