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
 * Describe Spot Instance Requests Result
 */
public class DescribeSpotInstanceRequestsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest> spotInstanceRequests;

    /**
     * Returns the value of the SpotInstanceRequests property for this
     * object.
     *
     * @return The value of the SpotInstanceRequests property for this object.
     */
    public java.util.List<SpotInstanceRequest> getSpotInstanceRequests() {
        if (spotInstanceRequests == null) {
              spotInstanceRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest>();
              spotInstanceRequests.setAutoConstruct(true);
        }
        return spotInstanceRequests;
    }
    
    /**
     * Sets the value of the SpotInstanceRequests property for this object.
     *
     * @param spotInstanceRequests The new value for the SpotInstanceRequests property for this object.
     */
    public void setSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        if (spotInstanceRequests == null) {
            this.spotInstanceRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest> spotInstanceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest>(spotInstanceRequests.size());
        spotInstanceRequestsCopy.addAll(spotInstanceRequests);
        this.spotInstanceRequests = spotInstanceRequestsCopy;
    }
    
    /**
     * Sets the value of the SpotInstanceRequests property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequests The new value for the SpotInstanceRequests property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(SpotInstanceRequest... spotInstanceRequests) {
        if (getSpotInstanceRequests() == null) setSpotInstanceRequests(new java.util.ArrayList<SpotInstanceRequest>(spotInstanceRequests.length));
        for (SpotInstanceRequest value : spotInstanceRequests) {
            getSpotInstanceRequests().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SpotInstanceRequests property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequests The new value for the SpotInstanceRequests property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        if (spotInstanceRequests == null) {
            this.spotInstanceRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest> spotInstanceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotInstanceRequest>(spotInstanceRequests.size());
            spotInstanceRequestsCopy.addAll(spotInstanceRequests);
            this.spotInstanceRequests = spotInstanceRequestsCopy;
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
        if (getSpotInstanceRequests() != null) sb.append("SpotInstanceRequests: " + getSpotInstanceRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotInstanceRequests() == null) ? 0 : getSpotInstanceRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotInstanceRequestsResult == false) return false;
        DescribeSpotInstanceRequestsResult other = (DescribeSpotInstanceRequestsResult)obj;
        
        if (other.getSpotInstanceRequests() == null ^ this.getSpotInstanceRequests() == null) return false;
        if (other.getSpotInstanceRequests() != null && other.getSpotInstanceRequests().equals(this.getSpotInstanceRequests()) == false) return false; 
        return true;
    }
    
}
    