/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class Disk implements Serializable, Cloneable {

    private String diskId;

    private String diskPath;

    private String diskNode;

    private String diskStatus;

    private Long diskSizeInBytes;

    private String diskAllocationType;

    private String diskAllocationResource;

    /**
     * @param diskId
     */

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * @return
     */

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @param diskId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskId(String diskId) {
        setDiskId(diskId);
        return this;
    }

    /**
     * @param diskPath
     */

    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * @return
     */

    public String getDiskPath() {
        return this.diskPath;
    }

    /**
     * @param diskPath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskPath(String diskPath) {
        setDiskPath(diskPath);
        return this;
    }

    /**
     * @param diskNode
     */

    public void setDiskNode(String diskNode) {
        this.diskNode = diskNode;
    }

    /**
     * @return
     */

    public String getDiskNode() {
        return this.diskNode;
    }

    /**
     * @param diskNode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskNode(String diskNode) {
        setDiskNode(diskNode);
        return this;
    }

    /**
     * @param diskStatus
     */

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    /**
     * @return
     */

    public String getDiskStatus() {
        return this.diskStatus;
    }

    /**
     * @param diskStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskStatus(String diskStatus) {
        setDiskStatus(diskStatus);
        return this;
    }

    /**
     * @param diskSizeInBytes
     */

    public void setDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
    }

    /**
     * @return
     */

    public Long getDiskSizeInBytes() {
        return this.diskSizeInBytes;
    }

    /**
     * @param diskSizeInBytes
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
     * @param diskAllocationResource
     */

    public void setDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
    }

    /**
     * @return
     */

    public String getDiskAllocationResource() {
        return this.diskAllocationResource;
    }

    /**
     * @param diskAllocationResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDiskAllocationResource(String diskAllocationResource) {
        setDiskAllocationResource(diskAllocationResource);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DiskId: " + getDiskId() + ",");
        if (getDiskPath() != null)
            sb.append("DiskPath: " + getDiskPath() + ",");
        if (getDiskNode() != null)
            sb.append("DiskNode: " + getDiskNode() + ",");
        if (getDiskStatus() != null)
            sb.append("DiskStatus: " + getDiskStatus() + ",");
        if (getDiskSizeInBytes() != null)
            sb.append("DiskSizeInBytes: " + getDiskSizeInBytes() + ",");
        if (getDiskAllocationType() != null)
            sb.append("DiskAllocationType: " + getDiskAllocationType() + ",");
        if (getDiskAllocationResource() != null)
            sb.append("DiskAllocationResource: " + getDiskAllocationResource());
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
}
