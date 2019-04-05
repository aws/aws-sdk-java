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
 * The parameters for a block device for an EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateEbsBlockDeviceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateEbsBlockDeviceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the number of
     * IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of the volume and the
     * rate at which the volume accumulates I/O credits for bursting. For more information about General Purpose SSD
     * baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create
     * gp2, st1, sc1, or standard volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * </p>
     */
    private String kmsKeyId;
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
     * The volume type.
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an
     *        encryption value.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an
     *         encryption value.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an
     *        encryption value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateEbsBlockDeviceRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an
     *         encryption value.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateEbsBlockDeviceRequest withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the number of
     * IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of the volume and the
     * rate at which the volume accumulates I/O credits for bursting. For more information about General Purpose SSD
     * baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create
     * gp2, st1, sc1, or standard volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the
     *        number of IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of
     *        the volume and the rate at which the volume accumulates I/O credits for bursting. For more information
     *        about General Purpose SSD baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in
     *        the Amazon Elastic Compute Cloud User Guide.</p>
     *        <p>
     *        Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to
     *        create gp2, st1, sc1, or standard volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the number of
     * IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of the volume and the
     * rate at which the volume accumulates I/O credits for bursting. For more information about General Purpose SSD
     * baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create
     * gp2, st1, sc1, or standard volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the
     *         number of IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of
     *         the volume and the rate at which the volume accumulates I/O credits for bursting. For more information
     *         about General Purpose SSD baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in
     *         the Amazon Elastic Compute Cloud User Guide.</p>
     *         <p>
     *         Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to
     *         create gp2, st1, sc1, or standard volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the number of
     * IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of the volume and the
     * rate at which the volume accumulates I/O credits for bursting. For more information about General Purpose SSD
     * baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create
     * gp2, st1, sc1, or standard volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For io1, this represents the
     *        number of IOPS that are provisioned for the volume. For gp2, this represents the baseline performance of
     *        the volume and the rate at which the volume accumulates I/O credits for bursting. For more information
     *        about General Purpose SSD baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in
     *        the Amazon Elastic Compute Cloud User Guide.</p>
     *        <p>
     *        Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to
     *        create gp2, st1, sc1, or standard volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateEbsBlockDeviceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * </p>
     * 
     * @return The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateEbsBlockDeviceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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

    public LaunchTemplateEbsBlockDeviceRequest withSnapshotId(String snapshotId) {
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

    public LaunchTemplateEbsBlockDeviceRequest withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @return The volume type.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public LaunchTemplateEbsBlockDeviceRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * 
     * @param volumeType
     *        The volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public LaunchTemplateEbsBlockDeviceRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
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
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
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

        if (obj instanceof LaunchTemplateEbsBlockDeviceRequest == false)
            return false;
        LaunchTemplateEbsBlockDeviceRequest other = (LaunchTemplateEbsBlockDeviceRequest) obj;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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

        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateEbsBlockDeviceRequest clone() {
        try {
            return (LaunchTemplateEbsBlockDeviceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
