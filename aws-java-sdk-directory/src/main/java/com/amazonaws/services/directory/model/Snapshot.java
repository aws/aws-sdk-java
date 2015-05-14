/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a directory snapshot.
 * </p>
 */
public class Snapshot implements Serializable, Cloneable {

    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The snapshot identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     */
    private String snapshotId;

    /**
     * The snapshot type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     */
    private String type;

    /**
     * The descriptive name of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String name;

    /**
     * The snapshot status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     */
    private String status;

    /**
     * The date and time that the snapshot was taken.
     */
    private java.util.Date startTime;

    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The directory identifier.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The directory identifier.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The directory identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The snapshot identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @return The snapshot identifier.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @param snapshotId The snapshot identifier.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @param snapshotId The snapshot identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The snapshot type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     *
     * @return The snapshot type.
     *
     * @see SnapshotType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The snapshot type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     *
     * @param type The snapshot type.
     *
     * @see SnapshotType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The snapshot type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     *
     * @param type The snapshot type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SnapshotType
     */
    public Snapshot withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The snapshot type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     *
     * @param type The snapshot type.
     *
     * @see SnapshotType
     */
    public void setType(SnapshotType type) {
        this.type = type.toString();
    }
    
    /**
     * The snapshot type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Manual
     *
     * @param type The snapshot type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SnapshotType
     */
    public Snapshot withType(SnapshotType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The descriptive name of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return The descriptive name of the snapshot.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The descriptive name of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param name The descriptive name of the snapshot.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The descriptive name of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param name The descriptive name of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The snapshot status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @return The snapshot status.
     *
     * @see SnapshotStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The snapshot status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param status The snapshot status.
     *
     * @see SnapshotStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The snapshot status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param status The snapshot status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SnapshotStatus
     */
    public Snapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The snapshot status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param status The snapshot status.
     *
     * @see SnapshotStatus
     */
    public void setStatus(SnapshotStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The snapshot status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param status The snapshot status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SnapshotStatus
     */
    public Snapshot withStatus(SnapshotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The date and time that the snapshot was taken.
     *
     * @return The date and time that the snapshot was taken.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The date and time that the snapshot was taken.
     *
     * @param startTime The date and time that the snapshot was taken.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The date and time that the snapshot was taken.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The date and time that the snapshot was taken.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Snapshot == false) return false;
        Snapshot other = (Snapshot)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        return true;
    }
    
    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    