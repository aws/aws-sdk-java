/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon EBS volume.
 * </p>
 */
public class Ebs implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For <code>io1</code>
     * volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1 to 16,384. If you
     * specify a snapshot, the volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot
     * size.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
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
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Constraint: Required when the volume type is <code>io1</code>.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;

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

    public Ebs withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For <code>io1</code>
     * volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1 to 16,384. If you
     * specify a snapshot, the volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot
     * size.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For
     *        <code>io1</code> volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value
     *        from 1 to 16,384. If you specify a snapshot, the volume size must be equal to or larger than the snapshot
     *        size.</p>
     *        <p>
     *        Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the
     *        snapshot size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For <code>io1</code>
     * volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1 to 16,384. If you
     * specify a snapshot, the volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot
     * size.
     * </p>
     * 
     * @return The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For
     *         <code>io1</code> volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value
     *         from 1 to 16,384. If you specify a snapshot, the volume size must be equal to or larger than the snapshot
     *         size.</p>
     *         <p>
     *         Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the
     *         snapshot size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For <code>io1</code>
     * volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1 to 16,384. If you
     * specify a snapshot, the volume size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot
     * size.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiB. For <code>standard</code> volumes, specify a value from 1 to 1,024. For
     *        <code>io1</code> volumes, specify a value from 4 to 16,384. For <code>gp2</code> volumes, specify a value
     *        from 1 to 16,384. If you specify a snapshot, the volume size must be equal to or larger than the snapshot
     *        size.</p>
     *        <p>
     *        Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the
     *        snapshot size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     *        </p>
     *        <p>
     *        Default: <code>standard</code>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @return The volume type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     *         </p>
     *         <p>
     *         Default: <code>standard</code>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Valid values: <code>standard</code> | <code>io1</code> | <code>gp2</code>
     *        </p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Constraint: Required when the volume type is <code>io1</code>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) to provision for the volume.</p>
     *        <p>
     *        Constraint: Required when the volume type is <code>io1</code>.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Constraint: Required when the volume type is <code>io1</code>.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) to provision for the volume.</p>
     *         <p>
     *         Constraint: Required when the volume type is <code>io1</code>.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume.
     * </p>
     * <p>
     * Constraint: Required when the volume type is <code>io1</code>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) to provision for the volume.</p>
     *        <p>
     *        Constraint: Required when the volume type is <code>io1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     *        support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     *        encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted
     *        volume from an encrypted snapshot. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances
     *         that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     *         encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted
     *         volume from an encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     *        support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     *        encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted
     *        volume from an encrypted snapshot. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted.
     * There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances
     *         that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     *         encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted
     *         volume from an encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ebs == false)
            return false;
        Ebs other = (Ebs) obj;
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
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public Ebs clone() {
        try {
            return (Ebs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
