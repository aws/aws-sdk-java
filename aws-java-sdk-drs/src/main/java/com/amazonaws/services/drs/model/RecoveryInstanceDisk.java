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
 * An object representing a block storage device on the Recovery Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryInstanceDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceDisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     */
    private Long bytes;
    /**
     * <p>
     * The EBS Volume ID of this disk.
     * </p>
     */
    private String ebsVolumeID;
    /**
     * <p>
     * The internal device name of this disk. This is the name that is visible on the machine itself and not from the
     * EC2 console.
     * </p>
     */
    private String internalDeviceName;

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @param bytes
     *        The amount of storage on the disk in bytes.
     */

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @return The amount of storage on the disk in bytes.
     */

    public Long getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @param bytes
     *        The amount of storage on the disk in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDisk withBytes(Long bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * <p>
     * The EBS Volume ID of this disk.
     * </p>
     * 
     * @param ebsVolumeID
     *        The EBS Volume ID of this disk.
     */

    public void setEbsVolumeID(String ebsVolumeID) {
        this.ebsVolumeID = ebsVolumeID;
    }

    /**
     * <p>
     * The EBS Volume ID of this disk.
     * </p>
     * 
     * @return The EBS Volume ID of this disk.
     */

    public String getEbsVolumeID() {
        return this.ebsVolumeID;
    }

    /**
     * <p>
     * The EBS Volume ID of this disk.
     * </p>
     * 
     * @param ebsVolumeID
     *        The EBS Volume ID of this disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDisk withEbsVolumeID(String ebsVolumeID) {
        setEbsVolumeID(ebsVolumeID);
        return this;
    }

    /**
     * <p>
     * The internal device name of this disk. This is the name that is visible on the machine itself and not from the
     * EC2 console.
     * </p>
     * 
     * @param internalDeviceName
     *        The internal device name of this disk. This is the name that is visible on the machine itself and not from
     *        the EC2 console.
     */

    public void setInternalDeviceName(String internalDeviceName) {
        this.internalDeviceName = internalDeviceName;
    }

    /**
     * <p>
     * The internal device name of this disk. This is the name that is visible on the machine itself and not from the
     * EC2 console.
     * </p>
     * 
     * @return The internal device name of this disk. This is the name that is visible on the machine itself and not
     *         from the EC2 console.
     */

    public String getInternalDeviceName() {
        return this.internalDeviceName;
    }

    /**
     * <p>
     * The internal device name of this disk. This is the name that is visible on the machine itself and not from the
     * EC2 console.
     * </p>
     * 
     * @param internalDeviceName
     *        The internal device name of this disk. This is the name that is visible on the machine itself and not from
     *        the EC2 console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDisk withInternalDeviceName(String internalDeviceName) {
        setInternalDeviceName(internalDeviceName);
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
        if (getBytes() != null)
            sb.append("Bytes: ").append(getBytes()).append(",");
        if (getEbsVolumeID() != null)
            sb.append("EbsVolumeID: ").append(getEbsVolumeID()).append(",");
        if (getInternalDeviceName() != null)
            sb.append("InternalDeviceName: ").append(getInternalDeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryInstanceDisk == false)
            return false;
        RecoveryInstanceDisk other = (RecoveryInstanceDisk) obj;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getEbsVolumeID() == null ^ this.getEbsVolumeID() == null)
            return false;
        if (other.getEbsVolumeID() != null && other.getEbsVolumeID().equals(this.getEbsVolumeID()) == false)
            return false;
        if (other.getInternalDeviceName() == null ^ this.getInternalDeviceName() == null)
            return false;
        if (other.getInternalDeviceName() != null && other.getInternalDeviceName().equals(this.getInternalDeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getEbsVolumeID() == null) ? 0 : getEbsVolumeID().hashCode());
        hashCode = prime * hashCode + ((getInternalDeviceName() == null) ? 0 : getInternalDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryInstanceDisk clone() {
        try {
            return (RecoveryInstanceDisk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryInstanceDiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
