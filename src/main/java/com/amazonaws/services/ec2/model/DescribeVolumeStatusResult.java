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
 * Describe Volume Status Result
 */
public class DescribeVolumeStatusResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem> volumeStatuses;

    private String nextToken;

    /**
     * Returns the value of the VolumeStatuses property for this object.
     *
     * @return The value of the VolumeStatuses property for this object.
     */
    public java.util.List<VolumeStatusItem> getVolumeStatuses() {
        if (volumeStatuses == null) {
              volumeStatuses = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem>();
              volumeStatuses.setAutoConstruct(true);
        }
        return volumeStatuses;
    }
    
    /**
     * Sets the value of the VolumeStatuses property for this object.
     *
     * @param volumeStatuses The new value for the VolumeStatuses property for this object.
     */
    public void setVolumeStatuses(java.util.Collection<VolumeStatusItem> volumeStatuses) {
        if (volumeStatuses == null) {
            this.volumeStatuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem> volumeStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem>(volumeStatuses.size());
        volumeStatusesCopy.addAll(volumeStatuses);
        this.volumeStatuses = volumeStatusesCopy;
    }
    
    /**
     * Sets the value of the VolumeStatuses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeStatuses The new value for the VolumeStatuses property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumeStatusResult withVolumeStatuses(VolumeStatusItem... volumeStatuses) {
        if (getVolumeStatuses() == null) setVolumeStatuses(new java.util.ArrayList<VolumeStatusItem>(volumeStatuses.length));
        for (VolumeStatusItem value : volumeStatuses) {
            getVolumeStatuses().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VolumeStatuses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeStatuses The new value for the VolumeStatuses property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumeStatusResult withVolumeStatuses(java.util.Collection<VolumeStatusItem> volumeStatuses) {
        if (volumeStatuses == null) {
            this.volumeStatuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem> volumeStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusItem>(volumeStatuses.size());
            volumeStatusesCopy.addAll(volumeStatuses);
            this.volumeStatuses = volumeStatusesCopy;
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
    public DescribeVolumeStatusResult withNextToken(String nextToken) {
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
        if (getVolumeStatuses() != null) sb.append("VolumeStatuses: " + getVolumeStatuses() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeStatuses() == null) ? 0 : getVolumeStatuses().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumeStatusResult == false) return false;
        DescribeVolumeStatusResult other = (DescribeVolumeStatusResult)obj;
        
        if (other.getVolumeStatuses() == null ^ this.getVolumeStatuses() == null) return false;
        if (other.getVolumeStatuses() != null && other.getVolumeStatuses().equals(this.getVolumeStatuses()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    