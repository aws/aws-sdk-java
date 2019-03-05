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
 * Describes a storage volume object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/VolumeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN),
     * which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     */
    private String volumeId;

    private String gatewayARN;
    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     */
    private Long volumeSizeInBytes;
    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     */
    private String volumeAttachmentStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:</p>
     *        <p>
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *        </p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:</p>
     *         <p>
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:</p>
     *        <p>
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *        </p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN),
     * which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeId
     *        The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name
     *        (ARN), which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN),
     * which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @return The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name
     *         (ARN), which you use as input for other operations.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN),
     * which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeId
     *        The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name
     *        (ARN), which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @return The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *         Amazon Resource Name (ARN), which you use as input for other operations.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @param volumeType
     *        One of the VolumeType enumeration values describing the type of the volume.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @return One of the VolumeType enumeration values describing the type of the volume.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the volume.
     * </p>
     * 
     * @param volumeType
     *        One of the VolumeType enumeration values describing the type of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @return The size of the volume in bytes.</p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.</p>
     *        <p>
     *        Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @param volumeAttachmentStatus
     *        One of the VolumeStatus values that indicates the state of the storage volume.
     */

    public void setVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @return One of the VolumeStatus values that indicates the state of the storage volume.
     */

    public String getVolumeAttachmentStatus() {
        return this.volumeAttachmentStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage volume.
     * </p>
     * 
     * @param volumeAttachmentStatus
     *        One of the VolumeStatus values that indicates the state of the storage volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeInfo withVolumeAttachmentStatus(String volumeAttachmentStatus) {
        setVolumeAttachmentStatus(volumeAttachmentStatus);
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: ").append(getVolumeSizeInBytes()).append(",");
        if (getVolumeAttachmentStatus() != null)
            sb.append("VolumeAttachmentStatus: ").append(getVolumeAttachmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeInfo == false)
            return false;
        VolumeInfo other = (VolumeInfo) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeAttachmentStatus() == null ^ this.getVolumeAttachmentStatus() == null)
            return false;
        if (other.getVolumeAttachmentStatus() != null && other.getVolumeAttachmentStatus().equals(this.getVolumeAttachmentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeAttachmentStatus() == null) ? 0 : getVolumeAttachmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public VolumeInfo clone() {
        try {
            return (VolumeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.VolumeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
