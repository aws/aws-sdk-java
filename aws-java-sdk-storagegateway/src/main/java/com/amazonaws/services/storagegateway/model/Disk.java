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
 * Represents a gateway's local disk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/Disk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Disk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local disk.
     * </p>
     */
    private String diskId;
    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     */
    private String diskPath;
    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization environment.
     * </p>
     */
    private String diskNode;
    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     */
    private String diskStatus;
    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     */
    private Long diskSizeInBytes;

    private String diskAllocationType;
    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the
     * local disk is not defined as an iSCSI target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     */
    private String diskAllocationResource;

    private com.amazonaws.internal.SdkInternalList<String> diskAttributeList;

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local disk.
     * </p>
     * 
     * @param diskId
     *        The unique device ID or other distinguishing data that identifies a local disk.
     */

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local disk.
     * </p>
     * 
     * @return The unique device ID or other distinguishing data that identifies a local disk.
     */

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local disk.
     * </p>
     * 
     * @param diskId
     *        The unique device ID or other distinguishing data that identifies a local disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskId(String diskId) {
        setDiskId(diskId);
        return this;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     * 
     * @param diskPath
     *        The path of a local disk in the gateway virtual machine (VM).
     */

    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     * 
     * @return The path of a local disk in the gateway virtual machine (VM).
     */

    public String getDiskPath() {
        return this.diskPath;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     * 
     * @param diskPath
     *        The path of a local disk in the gateway virtual machine (VM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskPath(String diskPath) {
        setDiskPath(diskPath);
        return this;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization environment.
     * </p>
     * 
     * @param diskNode
     *        The device node of a local disk as assigned by the virtualization environment.
     */

    public void setDiskNode(String diskNode) {
        this.diskNode = diskNode;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization environment.
     * </p>
     * 
     * @return The device node of a local disk as assigned by the virtualization environment.
     */

    public String getDiskNode() {
        return this.diskNode;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization environment.
     * </p>
     * 
     * @param diskNode
     *        The device node of a local disk as assigned by the virtualization environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskNode(String diskNode) {
        setDiskNode(diskNode);
        return this;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     * 
     * @param diskStatus
     *        A value that represents the status of a local disk.
     */

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     * 
     * @return A value that represents the status of a local disk.
     */

    public String getDiskStatus() {
        return this.diskStatus;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     * 
     * @param diskStatus
     *        A value that represents the status of a local disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskStatus(String diskStatus) {
        setDiskStatus(diskStatus);
        return this;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     * 
     * @param diskSizeInBytes
     *        The local disk size in bytes.
     */

    public void setDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     * 
     * @return The local disk size in bytes.
     */

    public Long getDiskSizeInBytes() {
        return this.diskSizeInBytes;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     * 
     * @param diskSizeInBytes
     *        The local disk size in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskSizeInBytes(Long diskSizeInBytes) {
        setDiskSizeInBytes(diskSizeInBytes);
        return this;
    }

    /**
     * @param diskAllocationType
     */

    public void setDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
    }

    /**
     * @return
     */

    public String getDiskAllocationType() {
        return this.diskAllocationType;
    }

    /**
     * @param diskAllocationType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskAllocationType(String diskAllocationType) {
        setDiskAllocationType(diskAllocationType);
        return this;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the
     * local disk is not defined as an iSCSI target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     * 
     * @param diskAllocationResource
     *        The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if
     *        the local disk is not defined as an iSCSI target. The format of this field is
     *        <i>targetIqn::LUNNumber::region-volumeId</i>.
     */

    public void setDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the
     * local disk is not defined as an iSCSI target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     * 
     * @return The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if
     *         the local disk is not defined as an iSCSI target. The format of this field is
     *         <i>targetIqn::LUNNumber::region-volumeId</i>.
     */

    public String getDiskAllocationResource() {
        return this.diskAllocationResource;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the
     * local disk is not defined as an iSCSI target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     * 
     * @param diskAllocationResource
     *        The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if
     *        the local disk is not defined as an iSCSI target. The format of this field is
     *        <i>targetIqn::LUNNumber::region-volumeId</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskAllocationResource(String diskAllocationResource) {
        setDiskAllocationResource(diskAllocationResource);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getDiskAttributeList() {
        if (diskAttributeList == null) {
            diskAttributeList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return diskAttributeList;
    }

    /**
     * @param diskAttributeList
     */

    public void setDiskAttributeList(java.util.Collection<String> diskAttributeList) {
        if (diskAttributeList == null) {
            this.diskAttributeList = null;
            return;
        }

        this.diskAttributeList = new com.amazonaws.internal.SdkInternalList<String>(diskAttributeList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskAttributeList(java.util.Collection)} or {@link #withDiskAttributeList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param diskAttributeList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskAttributeList(String... diskAttributeList) {
        if (this.diskAttributeList == null) {
            setDiskAttributeList(new com.amazonaws.internal.SdkInternalList<String>(diskAttributeList.length));
        }
        for (String ele : diskAttributeList) {
            this.diskAttributeList.add(ele);
        }
        return this;
    }

    /**
     * @param diskAttributeList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskAttributeList(java.util.Collection<String> diskAttributeList) {
        setDiskAttributeList(diskAttributeList);
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
        if (getDiskId() != null)
            sb.append("DiskId: ").append(getDiskId()).append(",");
        if (getDiskPath() != null)
            sb.append("DiskPath: ").append(getDiskPath()).append(",");
        if (getDiskNode() != null)
            sb.append("DiskNode: ").append(getDiskNode()).append(",");
        if (getDiskStatus() != null)
            sb.append("DiskStatus: ").append(getDiskStatus()).append(",");
        if (getDiskSizeInBytes() != null)
            sb.append("DiskSizeInBytes: ").append(getDiskSizeInBytes()).append(",");
        if (getDiskAllocationType() != null)
            sb.append("DiskAllocationType: ").append(getDiskAllocationType()).append(",");
        if (getDiskAllocationResource() != null)
            sb.append("DiskAllocationResource: ").append(getDiskAllocationResource()).append(",");
        if (getDiskAttributeList() != null)
            sb.append("DiskAttributeList: ").append(getDiskAttributeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Disk == false)
            return false;
        Disk other = (Disk) obj;
        if (other.getDiskId() == null ^ this.getDiskId() == null)
            return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false)
            return false;
        if (other.getDiskPath() == null ^ this.getDiskPath() == null)
            return false;
        if (other.getDiskPath() != null && other.getDiskPath().equals(this.getDiskPath()) == false)
            return false;
        if (other.getDiskNode() == null ^ this.getDiskNode() == null)
            return false;
        if (other.getDiskNode() != null && other.getDiskNode().equals(this.getDiskNode()) == false)
            return false;
        if (other.getDiskStatus() == null ^ this.getDiskStatus() == null)
            return false;
        if (other.getDiskStatus() != null && other.getDiskStatus().equals(this.getDiskStatus()) == false)
            return false;
        if (other.getDiskSizeInBytes() == null ^ this.getDiskSizeInBytes() == null)
            return false;
        if (other.getDiskSizeInBytes() != null && other.getDiskSizeInBytes().equals(this.getDiskSizeInBytes()) == false)
            return false;
        if (other.getDiskAllocationType() == null ^ this.getDiskAllocationType() == null)
            return false;
        if (other.getDiskAllocationType() != null && other.getDiskAllocationType().equals(this.getDiskAllocationType()) == false)
            return false;
        if (other.getDiskAllocationResource() == null ^ this.getDiskAllocationResource() == null)
            return false;
        if (other.getDiskAllocationResource() != null && other.getDiskAllocationResource().equals(this.getDiskAllocationResource()) == false)
            return false;
        if (other.getDiskAttributeList() == null ^ this.getDiskAttributeList() == null)
            return false;
        if (other.getDiskAttributeList() != null && other.getDiskAttributeList().equals(this.getDiskAttributeList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode());
        hashCode = prime * hashCode + ((getDiskPath() == null) ? 0 : getDiskPath().hashCode());
        hashCode = prime * hashCode + ((getDiskNode() == null) ? 0 : getDiskNode().hashCode());
        hashCode = prime * hashCode + ((getDiskStatus() == null) ? 0 : getDiskStatus().hashCode());
        hashCode = prime * hashCode + ((getDiskSizeInBytes() == null) ? 0 : getDiskSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getDiskAllocationType() == null) ? 0 : getDiskAllocationType().hashCode());
        hashCode = prime * hashCode + ((getDiskAllocationResource() == null) ? 0 : getDiskAllocationResource().hashCode());
        hashCode = prime * hashCode + ((getDiskAttributeList() == null) ? 0 : getDiskAttributeList().hashCode());
        return hashCode;
    }

    @Override
    public Disk clone() {
        try {
            return (Disk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.DiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
