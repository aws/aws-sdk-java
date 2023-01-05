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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters that are used to automatically set up EBS volumes when an instance is launched.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to delete the volume when the instance is terminated.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * Whether to encrypt the volume.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes. Not used
     * with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * gp2 and gp3: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * io1: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * st1 and sc1: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * standard: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeType;

    /**
     * <p>
     * Whether to delete the volume when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether to delete the volume when the instance is terminated.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Whether to delete the volume when the instance is terminated.
     * </p>
     * 
     * @return Whether to delete the volume when the instance is terminated.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Whether to delete the volume when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether to delete the volume when the instance is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Whether to delete the volume when the instance is terminated.
     * </p>
     * 
     * @return Whether to delete the volume when the instance is terminated.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Whether to encrypt the volume.
     * </p>
     * 
     * @param encrypted
     *        Whether to encrypt the volume.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Whether to encrypt the volume.
     * </p>
     * 
     * @return Whether to encrypt the volume.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Whether to encrypt the volume.
     * </p>
     * 
     * @param encrypted
     *        Whether to encrypt the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Whether to encrypt the volume.
     * </p>
     * 
     * @return Whether to encrypt the volume.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes. Not used
     * with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of input/output (I/O) operations per second (IOPS) to provision for the volume.</p>
     *        <p>
     *        Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes.
     *        Not used with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes. Not used
     * with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     * </p>
     * 
     * @return The number of input/output (I/O) operations per second (IOPS) to provision for the volume.</p>
     *         <p>
     *         Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes.
     *         Not used with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes. Not used
     * with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of input/output (I/O) operations per second (IOPS) to provision for the volume.</p>
     *        <p>
     *        Only supported for <code>gp3</code> or <code>io1</code> volumes. Required for <code>io1</code> volumes.
     *        Not used with <code>standard</code>, <code>gp2</code>, <code>st1</code>, or <code>sc1</code> volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the volume to use.</p>
     *        <p>
     *        You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     * </p>
     * 
     * @return The snapshot ID of the volume to use.</p>
     *         <p>
     *         You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the volume to use.</p>
     *        <p>
     *        You must specify either <code>VolumeSize</code> or <code>SnapshotId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * gp2 and gp3: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * io1: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * st1 and sc1: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * standard: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiBs. The following are the supported volumes sizes for each volume type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        gp2 and gp3: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        io1: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        st1 and sc1: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        standard: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     *        <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *        size of the snapshot.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * gp2 and gp3: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * io1: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * st1 and sc1: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * standard: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @return The volume size, in GiBs. The following are the supported volumes sizes for each volume type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         gp2 and gp3: 1-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         io1: 4-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         st1 and sc1: 125-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         standard: 1-1,024
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     *         <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *         size of the snapshot.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * gp2 and gp3: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * io1: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * st1 and sc1: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * standard: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiBs. The following are the supported volumes sizes for each volume type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        gp2 and gp3: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        io1: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        st1 and sc1: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        standard: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify either <code>SnapshotId</code> or <code>VolumeSize</code>. If you specify both
     *        <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *        size of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>
     *        </p>
     *        </li>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The volume type. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>gp3</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sc1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>st1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>standard</code>
     *         </p>
     *         </li>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails withVolumeType(String volumeType) {
        setVolumeType(volumeType);
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails == false)
            return false;
        AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails other = (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails) obj;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails clone() {
        try {
            return (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
