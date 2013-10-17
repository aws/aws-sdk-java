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
 * The result of describing Reserved Instances modifications.
 * </p>
 */
public class DescribeReservedInstancesModificationsResult implements Serializable {

    /**
     * The list of Reserved Instances modification requests.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification> reservedInstancesModifications;

    /**
     * The string specifying the next paginated set of results to return.
     */
    private String nextToken;

    /**
     * The list of Reserved Instances modification requests.
     *
     * @return The list of Reserved Instances modification requests.
     */
    public java.util.List<ReservedInstancesModification> getReservedInstancesModifications() {
        if (reservedInstancesModifications == null) {
              reservedInstancesModifications = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification>();
              reservedInstancesModifications.setAutoConstruct(true);
        }
        return reservedInstancesModifications;
    }
    
    /**
     * The list of Reserved Instances modification requests.
     *
     * @param reservedInstancesModifications The list of Reserved Instances modification requests.
     */
    public void setReservedInstancesModifications(java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        if (reservedInstancesModifications == null) {
            this.reservedInstancesModifications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification> reservedInstancesModificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification>(reservedInstancesModifications.size());
        reservedInstancesModificationsCopy.addAll(reservedInstancesModifications);
        this.reservedInstancesModifications = reservedInstancesModificationsCopy;
    }
    
    /**
     * The list of Reserved Instances modification requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModifications The list of Reserved Instances modification requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(ReservedInstancesModification... reservedInstancesModifications) {
        if (getReservedInstancesModifications() == null) setReservedInstancesModifications(new java.util.ArrayList<ReservedInstancesModification>(reservedInstancesModifications.length));
        for (ReservedInstancesModification value : reservedInstancesModifications) {
            getReservedInstancesModifications().add(value);
        }
        return this;
    }
    
    /**
     * The list of Reserved Instances modification requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModifications The list of Reserved Instances modification requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        if (reservedInstancesModifications == null) {
            this.reservedInstancesModifications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification> reservedInstancesModificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModification>(reservedInstancesModifications.size());
            reservedInstancesModificationsCopy.addAll(reservedInstancesModifications);
            this.reservedInstancesModifications = reservedInstancesModificationsCopy;
        }

        return this;
    }

    /**
     * The string specifying the next paginated set of results to return.
     *
     * @return The string specifying the next paginated set of results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The string specifying the next paginated set of results to return.
     *
     * @param nextToken The string specifying the next paginated set of results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The string specifying the next paginated set of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The string specifying the next paginated set of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsResult withNextToken(String nextToken) {
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
        if (getReservedInstancesModifications() != null) sb.append("ReservedInstancesModifications: " + getReservedInstancesModifications() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesModifications() == null) ? 0 : getReservedInstancesModifications().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesModificationsResult == false) return false;
        DescribeReservedInstancesModificationsResult other = (DescribeReservedInstancesModificationsResult)obj;
        
        if (other.getReservedInstancesModifications() == null ^ this.getReservedInstancesModifications() == null) return false;
        if (other.getReservedInstancesModifications() != null && other.getReservedInstancesModifications().equals(this.getReservedInstancesModifications()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    