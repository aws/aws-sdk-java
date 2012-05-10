/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * Describes a gateway local disk.
 * </p>
 */
public class Disk {

    /**
     * The unique device ID or other distinguishing data that identify the
     * local disk.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String diskId;

    /**
     * The path of the local disk in the gateway virtual machine (VM).
     */
    private String diskPath;

    /**
     * The device node of the local disk as assigned by the virtualization
     * environment.
     */
    private String diskNode;

    /**
     * The local disk size in bytes.
     */
    private Long diskSizeInBytes;

    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     */
    private String diskAllocationType;

    /**
     * The iSCSI Qualified Name (IQN) that is defined for the disk. This
     * field is not included in the response if the local disk is not defined
     * as an iSCSI target.
     */
    private String diskAllocationResource;

    /**
     * The unique device ID or other distinguishing data that identify the
     * local disk.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return The unique device ID or other distinguishing data that identify the
     *         local disk.
     */
    public String getDiskId() {
        return diskId;
    }
    
    /**
     * The unique device ID or other distinguishing data that identify the
     * local disk.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The unique device ID or other distinguishing data that identify the
     *         local disk.
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
    
    /**
     * The unique device ID or other distinguishing data that identify the
     * local disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The unique device ID or other distinguishing data that identify the
     *         local disk.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Disk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    
    
    /**
     * The path of the local disk in the gateway virtual machine (VM).
     *
     * @return The path of the local disk in the gateway virtual machine (VM).
     */
    public String getDiskPath() {
        return diskPath;
    }
    
    /**
     * The path of the local disk in the gateway virtual machine (VM).
     *
     * @param diskPath The path of the local disk in the gateway virtual machine (VM).
     */
    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }
    
    /**
     * The path of the local disk in the gateway virtual machine (VM).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskPath The path of the local disk in the gateway virtual machine (VM).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Disk withDiskPath(String diskPath) {
        this.diskPath = diskPath;
        return this;
    }
    
    
    /**
     * The device node of the local disk as assigned by the virtualization
     * environment.
     *
     * @return The device node of the local disk as assigned by the virtualization
     *         environment.
     */
    public String getDiskNode() {
        return diskNode;
    }
    
    /**
     * The device node of the local disk as assigned by the virtualization
     * environment.
     *
     * @param diskNode The device node of the local disk as assigned by the virtualization
     *         environment.
     */
    public void setDiskNode(String diskNode) {
        this.diskNode = diskNode;
    }
    
    /**
     * The device node of the local disk as assigned by the virtualization
     * environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskNode The device node of the local disk as assigned by the virtualization
     *         environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Disk withDiskNode(String diskNode) {
        this.diskNode = diskNode;
        return this;
    }
    
    
    /**
     * The local disk size in bytes.
     *
     * @return The local disk size in bytes.
     */
    public Long getDiskSizeInBytes() {
        return diskSizeInBytes;
    }
    
    /**
     * The local disk size in bytes.
     *
     * @param diskSizeInBytes The local disk size in bytes.
     */
    public void setDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
    }
    
    /**
     * The local disk size in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskSizeInBytes The local disk size in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Disk withDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
        return this;
    }
    
    
    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     *
     * @return One of the <a>DiskAllocationType</a> enumeration values that
     *         identifies how the local disk is used.
     *
     * @see DiskAllocationType
     */
    public String getDiskAllocationType() {
        return diskAllocationType;
    }
    
    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     *
     * @param diskAllocationType One of the <a>DiskAllocationType</a> enumeration values that
     *         identifies how the local disk is used.
     *
     * @see DiskAllocationType
     */
    public void setDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
    }
    
    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     *
     * @param diskAllocationType One of the <a>DiskAllocationType</a> enumeration values that
     *         identifies how the local disk is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see DiskAllocationType
     */
    public Disk withDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
        return this;
    }
    
    
    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     *
     * @param diskAllocationType One of the <a>DiskAllocationType</a> enumeration values that
     *         identifies how the local disk is used.
     *
     * @see DiskAllocationType
     */
    public void setDiskAllocationType(DiskAllocationType diskAllocationType) {
        this.diskAllocationType = diskAllocationType.toString();
    }
    
    /**
     * One of the <a>DiskAllocationType</a> enumeration values that
     * identifies how the local disk is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STORED iSCSI VOLUME, WORKING STORAGE, AVAILABLE
     *
     * @param diskAllocationType One of the <a>DiskAllocationType</a> enumeration values that
     *         identifies how the local disk is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see DiskAllocationType
     */
    public Disk withDiskAllocationType(DiskAllocationType diskAllocationType) {
        this.diskAllocationType = diskAllocationType.toString();
        return this;
    }
    
    /**
     * The iSCSI Qualified Name (IQN) that is defined for the disk. This
     * field is not included in the response if the local disk is not defined
     * as an iSCSI target.
     *
     * @return The iSCSI Qualified Name (IQN) that is defined for the disk. This
     *         field is not included in the response if the local disk is not defined
     *         as an iSCSI target.
     */
    public String getDiskAllocationResource() {
        return diskAllocationResource;
    }
    
    /**
     * The iSCSI Qualified Name (IQN) that is defined for the disk. This
     * field is not included in the response if the local disk is not defined
     * as an iSCSI target.
     *
     * @param diskAllocationResource The iSCSI Qualified Name (IQN) that is defined for the disk. This
     *         field is not included in the response if the local disk is not defined
     *         as an iSCSI target.
     */
    public void setDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
    }
    
    /**
     * The iSCSI Qualified Name (IQN) that is defined for the disk. This
     * field is not included in the response if the local disk is not defined
     * as an iSCSI target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskAllocationResource The iSCSI Qualified Name (IQN) that is defined for the disk. This
     *         field is not included in the response if the local disk is not defined
     *         as an iSCSI target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Disk withDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (diskId != null) sb.append("DiskId: " + diskId + ", ");
        if (diskPath != null) sb.append("DiskPath: " + diskPath + ", ");
        if (diskNode != null) sb.append("DiskNode: " + diskNode + ", ");
        if (diskSizeInBytes != null) sb.append("DiskSizeInBytes: " + diskSizeInBytes + ", ");
        if (diskAllocationType != null) sb.append("DiskAllocationType: " + diskAllocationType + ", ");
        if (diskAllocationResource != null) sb.append("DiskAllocationResource: " + diskAllocationResource + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode()); 
        hashCode = prime * hashCode + ((getDiskPath() == null) ? 0 : getDiskPath().hashCode()); 
        hashCode = prime * hashCode + ((getDiskNode() == null) ? 0 : getDiskNode().hashCode()); 
        hashCode = prime * hashCode + ((getDiskSizeInBytes() == null) ? 0 : getDiskSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getDiskAllocationType() == null) ? 0 : getDiskAllocationType().hashCode()); 
        hashCode = prime * hashCode + ((getDiskAllocationResource() == null) ? 0 : getDiskAllocationResource().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof Disk == false) return false;
        Disk other = (Disk)obj;
        
        if (other.getDiskId() == null ^ this.getDiskId() == null) return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false) return false; 
        if (other.getDiskPath() == null ^ this.getDiskPath() == null) return false;
        if (other.getDiskPath() != null && other.getDiskPath().equals(this.getDiskPath()) == false) return false; 
        if (other.getDiskNode() == null ^ this.getDiskNode() == null) return false;
        if (other.getDiskNode() != null && other.getDiskNode().equals(this.getDiskNode()) == false) return false; 
        if (other.getDiskSizeInBytes() == null ^ this.getDiskSizeInBytes() == null) return false;
        if (other.getDiskSizeInBytes() != null && other.getDiskSizeInBytes().equals(this.getDiskSizeInBytes()) == false) return false; 
        if (other.getDiskAllocationType() == null ^ this.getDiskAllocationType() == null) return false;
        if (other.getDiskAllocationType() != null && other.getDiskAllocationType().equals(this.getDiskAllocationType()) == false) return false; 
        if (other.getDiskAllocationResource() == null ^ this.getDiskAllocationResource() == null) return false;
        if (other.getDiskAllocationResource() != null && other.getDiskAllocationResource().equals(this.getDiskAllocationResource()) == false) return false; 
        return true;
    }
    
}
    