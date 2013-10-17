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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeRaidArrays(DescribeRaidArraysRequest) DescribeRaidArrays operation}.
 * <p>
 * Describe an instance's RAID arrays.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeRaidArrays(DescribeRaidArraysRequest)
 */
public class DescribeRaidArraysRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     */
    private String instanceId;

    /**
     * An array of RAID array IDs. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the specified
     * arrays. Otherwise, it returns a description of every array.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> raidArrayIds;

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     *
     * @return The instance ID. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the RAID
     *         arrays associated with the specified instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the RAID
     *         arrays associated with the specified instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the RAID
     *         arrays associated with the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRaidArraysRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * An array of RAID array IDs. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the specified
     * arrays. Otherwise, it returns a description of every array.
     *
     * @return An array of RAID array IDs. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the specified
     *         arrays. Otherwise, it returns a description of every array.
     */
    public java.util.List<String> getRaidArrayIds() {
        if (raidArrayIds == null) {
              raidArrayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              raidArrayIds.setAutoConstruct(true);
        }
        return raidArrayIds;
    }
    
    /**
     * An array of RAID array IDs. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the specified
     * arrays. Otherwise, it returns a description of every array.
     *
     * @param raidArrayIds An array of RAID array IDs. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the specified
     *         arrays. Otherwise, it returns a description of every array.
     */
    public void setRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        if (raidArrayIds == null) {
            this.raidArrayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> raidArrayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(raidArrayIds.size());
        raidArrayIdsCopy.addAll(raidArrayIds);
        this.raidArrayIds = raidArrayIdsCopy;
    }
    
    /**
     * An array of RAID array IDs. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the specified
     * arrays. Otherwise, it returns a description of every array.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayIds An array of RAID array IDs. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the specified
     *         arrays. Otherwise, it returns a description of every array.
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
     * An array of RAID array IDs. If you use this parameter,
     * <code>DescribeRaidArrays</code> returns descriptions of the specified
     * arrays. Otherwise, it returns a description of every array.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayIds An array of RAID array IDs. If you use this parameter,
     *         <code>DescribeRaidArrays</code> returns descriptions of the specified
     *         arrays. Otherwise, it returns a description of every array.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRaidArraysRequest withRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        if (raidArrayIds == null) {
            this.raidArrayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> raidArrayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(raidArrayIds.size());
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
    