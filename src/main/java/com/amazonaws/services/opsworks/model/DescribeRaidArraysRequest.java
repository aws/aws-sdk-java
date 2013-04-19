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
package com.amazonaws.services.opsworks.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeRaidArrays(DescribeRaidArraysRequest) DescribeRaidArrays operation}.
 * <p>
 * Describe an instance's RAID arrays.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeRaidArrays(DescribeRaidArraysRequest)
 */
public class DescribeRaidArraysRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * An array of RAID array IDs to be described.
     */
    private java.util.List<String> raidArrayIds;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRaidArraysRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * An array of RAID array IDs to be described.
     *
     * @return An array of RAID array IDs to be described.
     */
    public java.util.List<String> getRaidArrayIds() {
        
        if (raidArrayIds == null) {
            raidArrayIds = new java.util.ArrayList<String>();
        }
        return raidArrayIds;
    }
    
    /**
     * An array of RAID array IDs to be described.
     *
     * @param raidArrayIds An array of RAID array IDs to be described.
     */
    public void setRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        if (raidArrayIds == null) {
            this.raidArrayIds = null;
            return;
        }

        java.util.List<String> raidArrayIdsCopy = new java.util.ArrayList<String>(raidArrayIds.size());
        raidArrayIdsCopy.addAll(raidArrayIds);
        this.raidArrayIds = raidArrayIdsCopy;
    }
    
    /**
     * An array of RAID array IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayIds An array of RAID array IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRaidArraysRequest withRaidArrayIds(String... raidArrayIds) {
        if (getRaidArrayIds() == null) setRaidArrayIds(new java.util.ArrayList<String>(raidArrayIds.length));
        for (String value : raidArrayIds) {
            getRaidArrayIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of RAID array IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayIds An array of RAID array IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRaidArraysRequest withRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        if (raidArrayIds == null) {
            this.raidArrayIds = null;
        } else {
            java.util.List<String> raidArrayIdsCopy = new java.util.ArrayList<String>(raidArrayIds.size());
            raidArrayIdsCopy.addAll(raidArrayIds);
            this.raidArrayIds = raidArrayIdsCopy;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");    	
        if (getRaidArrayIds() != null) sb.append("RaidArrayIds: " + getRaidArrayIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getRaidArrayIds() == null) ? 0 : getRaidArrayIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRaidArraysRequest == false) return false;
        DescribeRaidArraysRequest other = (DescribeRaidArraysRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getRaidArrayIds() == null ^ this.getRaidArrayIds() == null) return false;
        if (other.getRaidArrayIds() != null && other.getRaidArrayIds().equals(this.getRaidArrayIds()) == false) return false; 
        return true;
    }
    
}
    