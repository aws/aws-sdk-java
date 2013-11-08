/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * Disk
 */
public class Disk implements Serializable {

    private String diskId;

    private String diskPath;

    private String diskNode;

    private Long diskSizeInBytes;

    private String diskAllocationType;

    private String diskAllocationResource;

    /**
     * Returns the value of the DiskId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return The value of the DiskId property for this object.
     */
    public String getDiskId() {
        return diskId;
    }
    
    /**
     * Sets the value of the DiskId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The new value for the DiskId property for this object.
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
    
    /**
     * Sets the value of the DiskId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The new value for the DiskId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Disk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Returns the value of the DiskPath property for this object.
     *
     * @return The value of the DiskPath property for this object.
     */
    public String getDiskPath() {
        return diskPath;
    }
    
    /**
     * Sets the value of the DiskPath property for this object.
     *
     * @param diskPath The new value for the DiskPath property for this object.
     */
    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }
    
    /**
     * Sets the value of the DiskPath property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskPath The new value for the DiskPath property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Disk withDiskPath(String diskPath) {
        this.diskPath = diskPath;
        return this;
    }

    /**
     * Returns the value of the DiskNode property for this object.
     *
     * @return The value of the DiskNode property for this object.
     */
    public String getDiskNode() {
        return diskNode;
    }
    
    /**
     * Sets the value of the DiskNode property for this object.
     *
     * @param diskNode The new value for the DiskNode property for this object.
     */
    public void setDiskNode(String diskNode) {
        this.diskNode = diskNode;
    }
    
    /**
     * Sets the value of the DiskNode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskNode The new value for the DiskNode property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Disk withDiskNode(String diskNode) {
        this.diskNode = diskNode;
        return this;
    }

    /**
     * Returns the value of the DiskSizeInBytes property for this object.
     *
     * @return The value of the DiskSizeInBytes property for this object.
     */
    public Long getDiskSizeInBytes() {
        return diskSizeInBytes;
    }
    
    /**
     * Sets the value of the DiskSizeInBytes property for this object.
     *
     * @param diskSizeInBytes The new value for the DiskSizeInBytes property for this object.
     */
    public void setDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
    }
    
    /**
     * Sets the value of the DiskSizeInBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskSizeInBytes The new value for the DiskSizeInBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Disk withDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
        return this;
    }

    /**
     * Returns the value of the DiskAllocationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @return The value of the DiskAllocationType property for this object.
     */
    public String getDiskAllocationType() {
        return diskAllocationType;
    }
    
    /**
     * Sets the value of the DiskAllocationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param diskAllocationType The new value for the DiskAllocationType property for this object.
     */
    public void setDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
    }
    
    /**
     * Sets the value of the DiskAllocationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param diskAllocationType The new value for the DiskAllocationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Disk withDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
        return this;
    }

    /**
     * Returns the value of the DiskAllocationResource property for this
     * object.
     *
     * @return The value of the DiskAllocationResource property for this object.
     */
    public String getDiskAllocationResource() {
        return diskAllocationResource;
    }
    
    /**
     * Sets the value of the DiskAllocationResource property for this object.
     *
     * @param diskAllocationResource The new value for the DiskAllocationResource property for this object.
     */
    public void setDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
    }
    
    /**
     * Sets the value of the DiskAllocationResource property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskAllocationResource The new value for the DiskAllocationResource property for this object.
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
        if (getDiskId() != null) sb.append("DiskId: " + getDiskId() + ",");
        if (getDiskPath() != null) sb.append("DiskPath: " + getDiskPath() + ",");
        if (getDiskNode() != null) sb.append("DiskNode: " + getDiskNode() + ",");
        if (getDiskSizeInBytes() != null) sb.append("DiskSizeInBytes: " + getDiskSizeInBytes() + ",");
        if (getDiskAllocationType() != null) sb.append("DiskAllocationType: " + getDiskAllocationType() + ",");
        if (getDiskAllocationResource() != null) sb.append("DiskAllocationResource: " + getDiskAllocationResource() );
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
    