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
 * <p>
 * Contains the output of DescribeSpotFleetInstances.
 * </p>
 */
public class DescribeSpotFleetInstancesResult implements Serializable, Cloneable {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The running instances. Note that this list is refreshed periodically
     * and might be out of date.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance> activeInstances;

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesResult withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The running instances. Note that this list is refreshed periodically
     * and might be out of date.
     *
     * @return The running instances. Note that this list is refreshed periodically
     *         and might be out of date.
     */
    public java.util.List<ActiveInstance> getActiveInstances() {
        if (activeInstances == null) {
              activeInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance>();
              activeInstances.setAutoConstruct(true);
        }
        return activeInstances;
    }
    
    /**
     * The running instances. Note that this list is refreshed periodically
     * and might be out of date.
     *
     * @param activeInstances The running instances. Note that this list is refreshed periodically
     *         and might be out of date.
     */
    public void setActiveInstances(java.util.Collection<ActiveInstance> activeInstances) {
        if (activeInstances == null) {
            this.activeInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance> activeInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance>(activeInstances.size());
        activeInstancesCopy.addAll(activeInstances);
        this.activeInstances = activeInstancesCopy;
    }
    
    /**
     * The running instances. Note that this list is refreshed periodically
     * and might be out of date.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActiveInstances(java.util.Collection)} or {@link
     * #withActiveInstances(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activeInstances The running instances. Note that this list is refreshed periodically
     *         and might be out of date.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesResult withActiveInstances(ActiveInstance... activeInstances) {
        if (getActiveInstances() == null) setActiveInstances(new java.util.ArrayList<ActiveInstance>(activeInstances.length));
        for (ActiveInstance value : activeInstances) {
            getActiveInstances().add(value);
        }
        return this;
    }
    
    /**
     * The running instances. Note that this list is refreshed periodically
     * and might be out of date.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activeInstances The running instances. Note that this list is refreshed periodically
     *         and might be out of date.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesResult withActiveInstances(java.util.Collection<ActiveInstance> activeInstances) {
        if (activeInstances == null) {
            this.activeInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance> activeInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ActiveInstance>(activeInstances.size());
            activeInstancesCopy.addAll(activeInstances);
            this.activeInstances = activeInstancesCopy;
        }

        return this;
    }

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesResult withNextToken(String nextToken) {
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
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getActiveInstances() != null) sb.append("ActiveInstances: " + getActiveInstances() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getActiveInstances() == null) ? 0 : getActiveInstances().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotFleetInstancesResult == false) return false;
        DescribeSpotFleetInstancesResult other = (DescribeSpotFleetInstancesResult)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getActiveInstances() == null ^ this.getActiveInstances() == null) return false;
        if (other.getActiveInstances() != null && other.getActiveInstances().equals(this.getActiveInstances()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSpotFleetInstancesResult clone() {
        try {
            return (DescribeSpotFleetInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    