/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeInstancesResult implements Serializable {

    /**
     * One or more reservations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Reservation> reservations;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * One or more reservations.
     *
     * @return One or more reservations.
     */
    public java.util.List<Reservation> getReservations() {
        if (reservations == null) {
              reservations = new com.amazonaws.internal.ListWithAutoConstructFlag<Reservation>();
              reservations.setAutoConstruct(true);
        }
        return reservations;
    }
    
    /**
     * One or more reservations.
     *
     * @param reservations One or more reservations.
     */
    public void setReservations(java.util.Collection<Reservation> reservations) {
        if (reservations == null) {
            this.reservations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Reservation> reservationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Reservation>(reservations.size());
        reservationsCopy.addAll(reservations);
        this.reservations = reservationsCopy;
    }
    
    /**
     * One or more reservations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservations One or more reservations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstancesResult withReservations(Reservation... reservations) {
        if (getReservations() == null) setReservations(new java.util.ArrayList<Reservation>(reservations.length));
        for (Reservation value : reservations) {
            getReservations().add(value);
        }
        return this;
    }
    
    /**
     * One or more reservations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservations One or more reservations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstancesResult withReservations(java.util.Collection<Reservation> reservations) {
        if (reservations == null) {
            this.reservations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Reservation> reservationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Reservation>(reservations.size());
            reservationsCopy.addAll(reservations);
            this.reservations = reservationsCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstancesResult withNextToken(String nextToken) {
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
        if (getReservations() != null) sb.append("Reservations: " + getReservations() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservations() == null) ? 0 : getReservations().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstancesResult == false) return false;
        DescribeInstancesResult other = (DescribeInstancesResult)obj;
        
        if (other.getReservations() == null ^ this.getReservations() == null) return false;
        if (other.getReservations() != null && other.getReservations().equals(this.getReservations()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    