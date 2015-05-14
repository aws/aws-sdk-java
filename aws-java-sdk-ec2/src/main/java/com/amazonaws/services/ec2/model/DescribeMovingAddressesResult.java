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
public class DescribeMovingAddressesResult implements Serializable, Cloneable {

    /**
     * The status for each Elastic IP address.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus> movingAddressStatuses;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The status for each Elastic IP address.
     *
     * @return The status for each Elastic IP address.
     */
    public java.util.List<MovingAddressStatus> getMovingAddressStatuses() {
        if (movingAddressStatuses == null) {
              movingAddressStatuses = new com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus>();
              movingAddressStatuses.setAutoConstruct(true);
        }
        return movingAddressStatuses;
    }
    
    /**
     * The status for each Elastic IP address.
     *
     * @param movingAddressStatuses The status for each Elastic IP address.
     */
    public void setMovingAddressStatuses(java.util.Collection<MovingAddressStatus> movingAddressStatuses) {
        if (movingAddressStatuses == null) {
            this.movingAddressStatuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus> movingAddressStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus>(movingAddressStatuses.size());
        movingAddressStatusesCopy.addAll(movingAddressStatuses);
        this.movingAddressStatuses = movingAddressStatusesCopy;
    }
    
    /**
     * The status for each Elastic IP address.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMovingAddressStatuses(java.util.Collection)} or
     * {@link #withMovingAddressStatuses(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param movingAddressStatuses The status for each Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesResult withMovingAddressStatuses(MovingAddressStatus... movingAddressStatuses) {
        if (getMovingAddressStatuses() == null) setMovingAddressStatuses(new java.util.ArrayList<MovingAddressStatus>(movingAddressStatuses.length));
        for (MovingAddressStatus value : movingAddressStatuses) {
            getMovingAddressStatuses().add(value);
        }
        return this;
    }
    
    /**
     * The status for each Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param movingAddressStatuses The status for each Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesResult withMovingAddressStatuses(java.util.Collection<MovingAddressStatus> movingAddressStatuses) {
        if (movingAddressStatuses == null) {
            this.movingAddressStatuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus> movingAddressStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MovingAddressStatus>(movingAddressStatuses.size());
            movingAddressStatusesCopy.addAll(movingAddressStatuses);
            this.movingAddressStatuses = movingAddressStatusesCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesResult withNextToken(String nextToken) {
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
        if (getMovingAddressStatuses() != null) sb.append("MovingAddressStatuses: " + getMovingAddressStatuses() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMovingAddressStatuses() == null) ? 0 : getMovingAddressStatuses().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMovingAddressesResult == false) return false;
        DescribeMovingAddressesResult other = (DescribeMovingAddressesResult)obj;
        
        if (other.getMovingAddressStatuses() == null ^ this.getMovingAddressStatuses() == null) return false;
        if (other.getMovingAddressStatuses() != null && other.getMovingAddressStatuses().equals(this.getMovingAddressStatuses()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeMovingAddressesResult clone() {
        try {
            return (DescribeMovingAddressesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    