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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a storage volume recovery point object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/VolumeRecoveryPointInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeRecoveryPointInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;
    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     */
    private Long volumeUsageInBytes;
    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     */
    private String volumeRecoveryPointTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume target.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume target.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecoveryPointInfo withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @return The size of the volume in bytes.
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecoveryPointInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @param volumeUsageInBytes
     *        The size of the data stored on the volume in bytes.</p> <note>
     *        <p>
     *        This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     *        </p>
     */

    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @return The size of the data stored on the volume in bytes.</p> <note>
     *         <p>
     *         This value is not available for volumes created prior to May 13, 2015, until you store data on the
     *         volume.
     *         </p>
     */

    public Long getVolumeUsageInBytes() {
        return this.volumeUsageInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     * </p>
     * </note>
     * 
     * @param volumeUsageInBytes
     *        The size of the data stored on the volume in bytes.</p> <note>
     *        <p>
     *        This value is not available for volumes created prior to May 13, 2015, until you store data on the volume.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecoveryPointInfo withVolumeUsageInBytes(Long volumeUsageInBytes) {
        setVolumeUsageInBytes(volumeUsageInBytes);
        return this;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     * 
     * @param volumeRecoveryPointTime
     *        The time the recovery point was taken.
     */

    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     * 
     * @return The time the recovery point was taken.
     */

    public String getVolumeRecoveryPointTime() {
        return this.volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     * 
     * @param volumeRecoveryPointTime
     *        The time the recovery point was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecoveryPointInfo withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        setVolumeRecoveryPointTime(volumeRecoveryPointTime);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: ").append(getVolumeSizeInBytes()).append(",");
        if (getVolumeUsageInBytes() != null)
            sb.append("VolumeUsageInBytes: ").append(getVolumeUsageInBytes()).append(",");
        if (getVolumeRecoveryPointTime() != null)
            sb.append("VolumeRecoveryPointTime: ").append(getVolumeRecoveryPointTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeRecoveryPointInfo == false)
            return false;
        VolumeRecoveryPointInfo other = (VolumeRecoveryPointInfo) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeUsageInBytes() == null ^ this.getVolumeUsageInBytes() == null)
            return false;
        if (other.getVolumeUsageInBytes() != null && other.getVolumeUsageInBytes().equals(this.getVolumeUsageInBytes()) == false)
            return false;
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null)
            return false;
        if (other.getVolumeRecoveryPointTime() != null && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsageInBytes() == null) ? 0 : getVolumeUsageInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime().hashCode());
        return hashCode;
    }

    @Override
    public VolumeRecoveryPointInfo clone() {
        try {
            return (VolumeRecoveryPointInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.VolumeRecoveryPointInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
