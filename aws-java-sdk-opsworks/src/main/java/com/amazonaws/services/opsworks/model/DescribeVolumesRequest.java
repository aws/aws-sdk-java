/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A stack ID. The action describes the stack's registered Amazon EBS volumes.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     * </p>
     */
    private String raidArrayId;
    /**
     * <p>
     * Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     * specified volumes. Otherwise, it returns a description of every volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeIds;

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *        volumes associated with the specified instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     * </p>
     * 
     * @return The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *         volumes associated with the specified instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *        volumes associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A stack ID. The action describes the stack's registered Amazon EBS volumes.
     * </p>
     * 
     * @param stackId
     *        A stack ID. The action describes the stack's registered Amazon EBS volumes.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID. The action describes the stack's registered Amazon EBS volumes.
     * </p>
     * 
     * @return A stack ID. The action describes the stack's registered Amazon EBS volumes.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID. The action describes the stack's registered Amazon EBS volumes.
     * </p>
     * 
     * @param stackId
     *        A stack ID. The action describes the stack's registered Amazon EBS volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     * </p>
     * 
     * @param raidArrayId
     *        The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *        volumes associated with the specified RAID array.
     */

    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }

    /**
     * <p>
     * The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     * </p>
     * 
     * @return The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *         volumes associated with the specified RAID array.
     */

    public String getRaidArrayId() {
        return this.raidArrayId;
    }

    /**
     * <p>
     * The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the volumes
     * associated with the specified RAID array.
     * </p>
     * 
     * @param raidArrayId
     *        The RAID array ID. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     *        volumes associated with the specified RAID array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withRaidArrayId(String raidArrayId) {
        setRaidArrayId(raidArrayId);
        return this;
    }

    /**
     * <p>
     * Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     * specified volumes. Otherwise, it returns a description of every volume.
     * </p>
     * 
     * @return Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of
     *         the specified volumes. Otherwise, it returns a description of every volume.
     */

    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeIds;
    }

    /**
     * <p>
     * Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     * specified volumes. Otherwise, it returns a description of every volume.
     * </p>
     * 
     * @param volumeIds
     *        Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of
     *        the specified volumes. Otherwise, it returns a description of every volume.
     */

    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new com.amazonaws.internal.SdkInternalList<String>(volumeIds);
    }

    /**
     * <p>
     * Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     * specified volumes. Otherwise, it returns a description of every volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeIds(java.util.Collection)} or {@link #withVolumeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeIds
     *        Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of
     *        the specified volumes. Otherwise, it returns a description of every volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new com.amazonaws.internal.SdkInternalList<String>(volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of the
     * specified volumes. Otherwise, it returns a description of every volume.
     * </p>
     * 
     * @param volumeIds
     *        Am array of volume IDs. If you use this parameter, <code>DescribeVolumes</code> returns descriptions of
     *        the specified volumes. Otherwise, it returns a description of every volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getRaidArrayId() != null)
            sb.append("RaidArrayId: ").append(getRaidArrayId()).append(",");
        if (getVolumeIds() != null)
            sb.append("VolumeIds: ").append(getVolumeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null)
            return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false)
            return false;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        return true;
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
    public DescribeVolumesRequest clone() {
        return (DescribeVolumesRequest) super.clone();
    }

}
