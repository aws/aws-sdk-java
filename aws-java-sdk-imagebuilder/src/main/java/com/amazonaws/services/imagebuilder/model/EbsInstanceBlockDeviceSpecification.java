/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon EBS-specific block device mapping specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/EbsInstanceBlockDeviceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsInstanceBlockDeviceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     * 
     * @param encrypted
     *        Use to configure device encryption.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     * 
     * @return Use to configure device encryption.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     * 
     * @param encrypted
     *        Use to configure device encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     * 
     * @return Use to configure device encryption.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     * 
     * @param deleteOnTermination
     *        Use to configure delete on termination of the associated device.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     * 
     * @return Use to configure delete on termination of the associated device.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     * 
     * @param deleteOnTermination
     *        Use to configure delete on termination of the associated device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     * 
     * @return Use to configure delete on termination of the associated device.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * 
     * @param iops
     *        Use to configure device IOPS.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * 
     * @return Use to configure device IOPS.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * 
     * @param iops
     *        Use to configure device IOPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * 
     * @param kmsKeyId
     *        Use to configure the KMS key to use when encrypting the device.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * 
     * @return Use to configure the KMS key to use when encrypting the device.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * 
     * @param kmsKeyId
     *        Use to configure the KMS key to use when encrypting the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot that defines the device contents.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * 
     * @return The snapshot that defines the device contents.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot that defines the device contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * 
     * @param volumeSize
     *        Use to override the device's volume size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * 
     * @return Use to override the device's volume size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * 
     * @param volumeSize
     *        Use to override the device's volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDeviceSpecification withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * 
     * @param volumeType
     *        Use to override the device's volume type.
     * @see EbsVolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * 
     * @return Use to override the device's volume type.
     * @see EbsVolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * 
     * @param volumeType
     *        Use to override the device's volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsVolumeType
     */

    public EbsInstanceBlockDeviceSpecification withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * 
     * @param volumeType
     *        Use to override the device's volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsVolumeType
     */

    public EbsInstanceBlockDeviceSpecification withVolumeType(EbsVolumeType volumeType) {
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

        if (obj instanceof EbsInstanceBlockDeviceSpecification == false)
            return false;
        EbsInstanceBlockDeviceSpecification other = (EbsInstanceBlockDeviceSpecification) obj;
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
    public EbsInstanceBlockDeviceSpecification clone() {
        try {
            return (EbsInstanceBlockDeviceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.EbsInstanceBlockDeviceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
