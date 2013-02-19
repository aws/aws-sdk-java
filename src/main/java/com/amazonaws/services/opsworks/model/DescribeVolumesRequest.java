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

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeVolumes(DescribeVolumesRequest) DescribeVolumes operation}.
 * <p>
 * Describes an instance's Amazon EBS volumes.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeVolumes(DescribeVolumesRequest)
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The RAID array ID.
     */
    private String raidArrayId;

    /**
     * Am array of volume IDs to be described.
     */
    private java.util.List<String> volumeIds;

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
    public DescribeVolumesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The RAID array ID.
     *
     * @return The RAID array ID.
     */
    public String getRaidArrayId() {
        return raidArrayId;
    }
    
    /**
     * The RAID array ID.
     *
     * @param raidArrayId The RAID array ID.
     */
    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }
    
    /**
     * The RAID array ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayId The RAID array ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumesRequest withRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
        return this;
    }
    
    
    /**
     * Am array of volume IDs to be described.
     *
     * @return Am array of volume IDs to be described.
     */
    public java.util.List<String> getVolumeIds() {
        
        if (volumeIds == null) {
            volumeIds = new java.util.ArrayList<String>();
        }
        return volumeIds;
    }
    
    /**
     * Am array of volume IDs to be described.
     *
     * @param volumeIds Am array of volume IDs to be described.
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        java.util.List<String> volumeIdsCopy = new java.util.ArrayList<String>(volumeIds.size());
        volumeIdsCopy.addAll(volumeIds);
        this.volumeIds = volumeIdsCopy;
    }
    
    /**
     * Am array of volume IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds Am array of volume IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (getVolumeIds() == null) setVolumeIds(new java.util.ArrayList<String>(volumeIds.length));
        for (String value : volumeIds) {
            getVolumeIds().add(value);
        }
        return this;
    }
    
    /**
     * Am array of volume IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds Am array of volume IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
        } else {
            java.util.List<String> volumeIdsCopy = new java.util.ArrayList<String>(volumeIds.size());
            volumeIdsCopy.addAll(volumeIds);
            this.volumeIds = volumeIdsCopy;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ", ");
        if (getRaidArrayId() != null) sb.append("RaidArrayId: " + getRaidArrayId() + ", ");
        if (getVolumeIds() != null) sb.append("VolumeIds: " + getVolumeIds() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getRaidArrayId() == null) ? 0 : getRaidArrayId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumesRequest == false) return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null) return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false) return false; 
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null) return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false) return false; 
        return true;
    }
    
}
    