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
 * Parameters for a block device for an Amazon Elastic Block Store (Amazon EBS) volume in an Amazon EC2 launch template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The number of I/O operations per second (IOPS).
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     * encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * </p>
     */
    private Integer throughput;
    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
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

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withDeleteOnTermination(Boolean deleteOnTermination) {
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
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an
     *        encryption value.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an
     *         encryption value.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an
     *        encryption value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an
     *         encryption value.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS).
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS).
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS).
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS).
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS).
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     * encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     *        encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     * encryption.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used
     *         for encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     * encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @return The ID of the EBS snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * </p>
     * 
     * @return The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withThroughput(Integer throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @return The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withVolumeSize(Integer volumeSize) {
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
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails withVolumeType(String volumeType) {
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
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

        if (obj instanceof AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails other = (AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails) obj;
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
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
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
