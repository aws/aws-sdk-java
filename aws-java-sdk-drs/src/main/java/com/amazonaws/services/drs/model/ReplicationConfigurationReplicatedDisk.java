/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a disk of the Source Server to be replicated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ReplicationConfigurationReplicatedDisk"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfigurationReplicatedDisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The requested number of I/O operations per second (IOPS).
     * </p>
     */
    private Long iops;
    /**
     * <p>
     * Whether to boot from this disk or not.
     * </p>
     */
    private Boolean isBootDisk;
    /**
     * <p>
     * When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume type as it
     * is constantly updated by the service. This is a read-only field.
     * </p>
     */
    private String optimizedStagingDiskType;
    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     */
    private String stagingDiskType;
    /**
     * <p>
     * The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     * </p>
     */
    private Long throughput;

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @return The name of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The requested number of I/O operations per second (IOPS).
     * </p>
     * 
     * @param iops
     *        The requested number of I/O operations per second (IOPS).
     */

    public void setIops(Long iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The requested number of I/O operations per second (IOPS).
     * </p>
     * 
     * @return The requested number of I/O operations per second (IOPS).
     */

    public Long getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The requested number of I/O operations per second (IOPS).
     * </p>
     * 
     * @param iops
     *        The requested number of I/O operations per second (IOPS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withIops(Long iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Whether to boot from this disk or not.
     * </p>
     * 
     * @param isBootDisk
     *        Whether to boot from this disk or not.
     */

    public void setIsBootDisk(Boolean isBootDisk) {
        this.isBootDisk = isBootDisk;
    }

    /**
     * <p>
     * Whether to boot from this disk or not.
     * </p>
     * 
     * @return Whether to boot from this disk or not.
     */

    public Boolean getIsBootDisk() {
        return this.isBootDisk;
    }

    /**
     * <p>
     * Whether to boot from this disk or not.
     * </p>
     * 
     * @param isBootDisk
     *        Whether to boot from this disk or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withIsBootDisk(Boolean isBootDisk) {
        setIsBootDisk(isBootDisk);
        return this;
    }

    /**
     * <p>
     * Whether to boot from this disk or not.
     * </p>
     * 
     * @return Whether to boot from this disk or not.
     */

    public Boolean isBootDisk() {
        return this.isBootDisk;
    }

    /**
     * <p>
     * When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume type as it
     * is constantly updated by the service. This is a read-only field.
     * </p>
     * 
     * @param optimizedStagingDiskType
     *        When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume
     *        type as it is constantly updated by the service. This is a read-only field.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public void setOptimizedStagingDiskType(String optimizedStagingDiskType) {
        this.optimizedStagingDiskType = optimizedStagingDiskType;
    }

    /**
     * <p>
     * When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume type as it
     * is constantly updated by the service. This is a read-only field.
     * </p>
     * 
     * @return When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume
     *         type as it is constantly updated by the service. This is a read-only field.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public String getOptimizedStagingDiskType() {
        return this.optimizedStagingDiskType;
    }

    /**
     * <p>
     * When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume type as it
     * is constantly updated by the service. This is a read-only field.
     * </p>
     * 
     * @param optimizedStagingDiskType
     *        When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume
     *        type as it is constantly updated by the service. This is a read-only field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withOptimizedStagingDiskType(String optimizedStagingDiskType) {
        setOptimizedStagingDiskType(optimizedStagingDiskType);
        return this;
    }

    /**
     * <p>
     * When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume type as it
     * is constantly updated by the service. This is a read-only field.
     * </p>
     * 
     * @param optimizedStagingDiskType
     *        When <code>stagingDiskType</code> is set to Auto, this field shows the current staging disk EBS volume
     *        type as it is constantly updated by the service. This is a read-only field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withOptimizedStagingDiskType(ReplicationConfigurationReplicatedDiskStagingDiskType optimizedStagingDiskType) {
        this.optimizedStagingDiskType = optimizedStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param stagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public void setStagingDiskType(String stagingDiskType) {
        this.stagingDiskType = stagingDiskType;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @return The Staging Disk EBS volume type to be used during replication.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public String getStagingDiskType() {
        return this.stagingDiskType;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param stagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withStagingDiskType(String stagingDiskType) {
        setStagingDiskType(stagingDiskType);
        return this;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param stagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationReplicatedDiskStagingDiskType
     */

    public ReplicationConfigurationReplicatedDisk withStagingDiskType(ReplicationConfigurationReplicatedDiskStagingDiskType stagingDiskType) {
        this.stagingDiskType = stagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     * </p>
     * 
     * @param throughput
     *        The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     */

    public void setThroughput(Long throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     * </p>
     * 
     * @return The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     */

    public Long getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     * </p>
     * 
     * @param throughput
     *        The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationReplicatedDisk withThroughput(Long throughput) {
        setThroughput(throughput);
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
        if (getOptimizedStagingDiskType() != null)
            sb.append("OptimizedStagingDiskType: ").append(getOptimizedStagingDiskType()).append(",");
        if (getStagingDiskType() != null)
            sb.append("StagingDiskType: ").append(getStagingDiskType()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
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
        if (other.getOptimizedStagingDiskType() == null ^ this.getOptimizedStagingDiskType() == null)
            return false;
        if (other.getOptimizedStagingDiskType() != null && other.getOptimizedStagingDiskType().equals(this.getOptimizedStagingDiskType()) == false)
            return false;
        if (other.getStagingDiskType() == null ^ this.getStagingDiskType() == null)
            return false;
        if (other.getStagingDiskType() != null && other.getStagingDiskType().equals(this.getStagingDiskType()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
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
        hashCode = prime * hashCode + ((getOptimizedStagingDiskType() == null) ? 0 : getOptimizedStagingDiskType().hashCode());
        hashCode = prime * hashCode + ((getStagingDiskType() == null) ? 0 : getStagingDiskType().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
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
        com.amazonaws.services.drs.model.transform.ReplicationConfigurationReplicatedDiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
