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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an EBS volume for a Scheduled Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstancesEbs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesEbs implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support
     * them.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the
     * number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the baseline
     * performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more
     * information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, Throughput
     * Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for Magnetic.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support
     * them.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that
     *        support them.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support
     * them.
     * </p>
     * 
     * @return Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that
     *         support them.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support
     * them.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that
     *        support them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support
     * them.
     * </p>
     * 
     * @return Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that
     *         support them.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the
     * number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the baseline
     * performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more
     * information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents
     *        the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the
     *        baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
     *        For more information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code>
     *        volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in
     *        requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the
     * number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the baseline
     * performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more
     * information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents
     *         the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the
     *         baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
     *         For more information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code>
     *         volumes.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in
     *         requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     *         volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the
     * number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the baseline
     * performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more
     * information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents
     *        the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents the
     *        baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
     *        For more information about <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and 100-10000 IOPS for <code>gp2</code>
     *        volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create <code>io1</code>volumes; it is not used in
     *        requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @return The size of the volume, in GiB.</p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is
     *         the snapshot size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, Throughput
     * Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for Magnetic.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *        Throughput Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for
     *        Magnetic.</p>
     *        <p>
     *        Default: <code>standard</code>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, Throughput
     * Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for Magnetic.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @return The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *         Throughput Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code>
     *         for Magnetic.</p>
     *         <p>
     *         Default: <code>standard</code>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, Throughput
     * Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for Magnetic.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     *        Throughput Optimized HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code> for
     *        Magnetic.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesEbs withVolumeType(String volumeType) {
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

        if (obj instanceof ScheduledInstancesEbs == false)
            return false;
        ScheduledInstancesEbs other = (ScheduledInstancesEbs) obj;
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
    public ScheduledInstancesEbs clone() {
        try {
            return (ScheduledInstancesEbs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
