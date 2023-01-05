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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains EBS volume details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/VolumeDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EBS volume Arn information.
     * </p>
     */
    private String volumeArn;
    /**
     * <p>
     * The EBS volume type.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The device name for the EBS volume.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * EBS volume size in GB.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * EBS volume encryption type.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * Snapshot Arn of the EBS volume.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * KMS key Arn used to encrypt the EBS volume.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * EBS volume Arn information.
     * </p>
     * 
     * @param volumeArn
     *        EBS volume Arn information.
     */

    public void setVolumeArn(String volumeArn) {
        this.volumeArn = volumeArn;
    }

    /**
     * <p>
     * EBS volume Arn information.
     * </p>
     * 
     * @return EBS volume Arn information.
     */

    public String getVolumeArn() {
        return this.volumeArn;
    }

    /**
     * <p>
     * EBS volume Arn information.
     * </p>
     * 
     * @param volumeArn
     *        EBS volume Arn information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withVolumeArn(String volumeArn) {
        setVolumeArn(volumeArn);
        return this;
    }

    /**
     * <p>
     * The EBS volume type.
     * </p>
     * 
     * @param volumeType
     *        The EBS volume type.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The EBS volume type.
     * </p>
     * 
     * @return The EBS volume type.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The EBS volume type.
     * </p>
     * 
     * @param volumeType
     *        The EBS volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The device name for the EBS volume.
     * </p>
     * 
     * @param deviceName
     *        The device name for the EBS volume.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name for the EBS volume.
     * </p>
     * 
     * @return The device name for the EBS volume.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name for the EBS volume.
     * </p>
     * 
     * @param deviceName
     *        The device name for the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * EBS volume size in GB.
     * </p>
     * 
     * @param volumeSizeInGB
     *        EBS volume size in GB.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * EBS volume size in GB.
     * </p>
     * 
     * @return EBS volume size in GB.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * EBS volume size in GB.
     * </p>
     * 
     * @param volumeSizeInGB
     *        EBS volume size in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * EBS volume encryption type.
     * </p>
     * 
     * @param encryptionType
     *        EBS volume encryption type.
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * EBS volume encryption type.
     * </p>
     * 
     * @return EBS volume encryption type.
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * EBS volume encryption type.
     * </p>
     * 
     * @param encryptionType
     *        EBS volume encryption type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * Snapshot Arn of the EBS volume.
     * </p>
     * 
     * @param snapshotArn
     *        Snapshot Arn of the EBS volume.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * Snapshot Arn of the EBS volume.
     * </p>
     * 
     * @return Snapshot Arn of the EBS volume.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * Snapshot Arn of the EBS volume.
     * </p>
     * 
     * @param snapshotArn
     *        Snapshot Arn of the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * KMS key Arn used to encrypt the EBS volume.
     * </p>
     * 
     * @param kmsKeyArn
     *        KMS key Arn used to encrypt the EBS volume.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * KMS key Arn used to encrypt the EBS volume.
     * </p>
     * 
     * @return KMS key Arn used to encrypt the EBS volume.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * KMS key Arn used to encrypt the EBS volume.
     * </p>
     * 
     * @param kmsKeyArn
     *        KMS key Arn used to encrypt the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeDetail withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getVolumeArn() != null)
            sb.append("VolumeArn: ").append(getVolumeArn()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeDetail == false)
            return false;
        VolumeDetail other = (VolumeDetail) obj;
        if (other.getVolumeArn() == null ^ this.getVolumeArn() == null)
            return false;
        if (other.getVolumeArn() != null && other.getVolumeArn().equals(this.getVolumeArn()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeArn() == null) ? 0 : getVolumeArn().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public VolumeDetail clone() {
        try {
            return (VolumeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.VolumeDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
