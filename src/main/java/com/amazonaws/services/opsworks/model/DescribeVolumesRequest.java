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
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeVolumes(DescribeVolumesRequest) DescribeVolumes operation}.
 * <p>
 * Describes an instance's Amazon EBS volumes.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeVolumes(DescribeVolumesRequest)
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     */
    private String instanceId;

    /**
     * A stack ID. The action describes the stack's registered Amazon EBS
     * volumes.
     */
    private String stackId;

    /**
     * The RAID array ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     */
    private String raidArrayId;

    /**
     * Am array of volume IDs. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the specified
     * volumes. Otherwise, it returns a description of every volume.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIds;

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     *
     * @return The instance ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * A stack ID. The action describes the stack's registered Amazon EBS
     * volumes.
     *
     * @return A stack ID. The action describes the stack's registered Amazon EBS
     *         volumes.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID. The action describes the stack's registered Amazon EBS
     * volumes.
     *
     * @param stackId A stack ID. The action describes the stack's registered Amazon EBS
     *         volumes.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID. The action describes the stack's registered Amazon EBS
     * volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID. The action describes the stack's registered Amazon EBS
     *         volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The RAID array ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     *
     * @return The RAID array ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified RAID array.
     */
    public String getRaidArrayId() {
        return raidArrayId;
    }
    
    /**
     * The RAID array ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     *
     * @param raidArrayId The RAID array ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified RAID array.
     */
    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }
    
    /**
     * The RAID array ID. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayId The RAID array ID. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the volumes
     *         associated with the specified RAID array.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesRequest withRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
        return this;
    }

    /**
     * Am array of volume IDs. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the specified
     * volumes. Otherwise, it returns a description of every volume.
     *
     * @return Am array of volume IDs. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the specified
     *         volumes. Otherwise, it returns a description of every volume.
     */
    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
              volumeIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              volumeIds.setAutoConstruct(true);
        }
        return volumeIds;
    }
    
    /**
     * Am array of volume IDs. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the specified
     * volumes. Otherwise, it returns a description of every volume.
     *
     * @param volumeIds Am array of volume IDs. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the specified
     *         volumes. Otherwise, it returns a description of every volume.
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
        volumeIdsCopy.addAll(volumeIds);
        this.volumeIds = volumeIdsCopy;
    }
    
    /**
     * Am array of volume IDs. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the specified
     * volumes. Otherwise, it returns a description of every volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds Am array of volume IDs. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the specified
     *         volumes. Otherwise, it returns a description of every volume.
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
     * Am array of volume IDs. If you use this parameter,
     * <code>DescribeVolumes</code> returns descriptions of the specified
     * volumes. Otherwise, it returns a description of every volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds Am array of volume IDs. If you use this parameter,
     *         <code>DescribeVolumes</code> returns descriptions of the specified
     *         volumes. Otherwise, it returns a description of every volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getRaidArrayId() != null) sb.append("RaidArrayId: " + getRaidArrayId() + ",");
        if (getVolumeIds() != null) sb.append("VolumeIds: " + getVolumeIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
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
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null) return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false) return false; 
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null) return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false) return false; 
        return true;
    }
    
}
    