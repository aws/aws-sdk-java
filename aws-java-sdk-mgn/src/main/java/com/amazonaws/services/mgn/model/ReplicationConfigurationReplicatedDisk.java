/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Replication Configuration replicated disk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ReplicationConfigurationReplicatedDisk"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfigurationReplicatedDisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Replication Configuration replicated disk device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Replication Configuration replicated disk IOPs.
     * </p>
     */
    private Long iops;
    /**
     * <p>
     * Replication Configuration replicated disk boot disk.
     * </p>
     */
    private Boolean isBootDisk;
    /**
     * <p>
     * Replication Configuration replicated disk staging disk type.
     * </p>
     */
    private String stagingDiskType;

    /**
     * <p>
     * Replication Configuration replicated disk device name.
     * </p>
     * 
     * @param deviceName
     *        Replication Configuration replicated disk device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * Replication Configuration replicated disk device name.
     * </p>
     * 
     * @return Replication Configuration replicated disk device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * Replication Configuration replicated disk device name.
     * </p>
     * 
     * @param deviceName
     *        Replication Configuration replicated disk device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Replication Configuration replicated disk IOPs.
     * </p>
     * 
     * @param iops
     *        Replication Configuration replicated disk IOPs.
     */

    public void setIops(Long iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Replication Configuration replicated disk IOPs.
     * </p>
     * 
     * @return Replication Configuration replicated disk IOPs.
     */

    public Long getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Replication Configuration replicated disk IOPs.
     * </p>
     * 
     * @param iops
     *        Replication Configuration replicated disk IOPs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withIops(Long iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Replication Configuration replicated disk boot disk.
     * </p>
     * 
     * @param isBootDisk
     *        Replication Configuration replicated disk boot disk.
     */

    public void setIsBootDisk(Boolean isBootDisk) {
        this.isBootDisk = isBootDisk;
    }

    /**
     * <p>
     * Replication Configuration replicated disk boot disk.
     * </p>
     * 
     * @return Replication Configuration replicated disk boot disk.
     */

    public Boolean getIsBootDisk() {
        return this.isBootDisk;
    }

    /**
     * <p>
     * Replication Configuration replicated disk boot disk.
     * </p>
     * 
     * @param isBootDisk
     *        Replication Configuration replicated disk boot disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withIsBootDisk(Boolean isBootDisk) {
        setIsBootDisk(isBootDisk);
        return this;
    }

    /**
     * <p>
     * Replication Configuration replicated disk boot disk.
     * </p>
     * 
     * @return Replication Configuration replicated disk boot disk.
     */

    public Boolean isBootDisk() {
        return this.isBootDisk;
    }

    /**
     * <p>
     * Replication Configuration replicated disk staging disk type.
     * </p>
     * 
     * @param stagingDiskType
     *        Replication Configuration replicated disk staging disk type.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public void setStagingDiskType(String stagingDiskType) {
        this.stagingDiskType = stagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration replicated disk staging disk type.
     * </p>
     * 
     * @return Replication Configuration replicated disk staging disk type.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public String getStagingDiskType() {
        return this.stagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration replicated disk staging disk type.
     * </p>
     * 
     * @param stagingDiskType
     *        Replication Configuration replicated disk staging disk type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withStagingDiskType(String stagingDiskType) {
        setStagingDiskType(stagingDiskType);
        return this;
    }

    /**
     * <p>
     * Replication Configuration replicated disk staging disk type.
     * </p>
     * 
     * @param stagingDiskType
     *        Replication Configuration replicated disk staging disk type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withStagingDiskType(ReplicationConfigurationReplicatedDiskStagingDiskType stagingDiskType) {
        this.stagingDiskType = stagingDiskType.toString();
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getIsBootDisk() != null)
            sb.append("IsBootDisk: ").append(getIsBootDisk()).append(",");
        if (getStagingDiskType() != null)
            sb.append("StagingDiskType: ").append(getStagingDiskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationConfigurationReplicatedDisk == false)
            return false;
        ReplicationConfigurationReplicatedDisk other = (ReplicationConfigurationReplicatedDisk) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getIsBootDisk() == null ^ this.getIsBootDisk() == null)
            return false;
        if (other.getIsBootDisk() != null && other.getIsBootDisk().equals(this.getIsBootDisk()) == false)
            return false;
        if (other.getStagingDiskType() == null ^ this.getStagingDiskType() == null)
            return false;
        if (other.getStagingDiskType() != null && other.getStagingDiskType().equals(this.getStagingDiskType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getIsBootDisk() == null) ? 0 : getIsBootDisk().hashCode());
        hashCode = prime * hashCode + ((getStagingDiskType() == null) ? 0 : getStagingDiskType().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationConfigurationReplicatedDisk clone() {
        try {
            return (ReplicationConfigurationReplicatedDisk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ReplicationConfigurationReplicatedDiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
