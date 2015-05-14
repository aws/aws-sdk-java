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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#createSnapshot(CreateSnapshotRequest) CreateSnapshot operation}.
 * <p>
 * Creates a snapshot of an existing directory.
 * </p>
 * <p>
 * You cannot take snapshots of extended or connected directories.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to take a snapshot of.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The descriptive name to apply to the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String name;

    /**
     * The identifier of the directory to take a snapshot of.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to take a snapshot of.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to take a snapshot of.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to take a snapshot of.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to take a snapshot of.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to take a snapshot of.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateSnapshotRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The descriptive name to apply to the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return The descriptive name to apply to the snapshot.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The descriptive name to apply to the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param name The descriptive name to apply to the snapshot.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The descriptive name to apply to the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param name The descriptive name to apply to the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateSnapshotRequest withName(String name) {
        this.name = name;
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
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotRequest == false) return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateSnapshotRequest clone() {
        
            return (CreateSnapshotRequest) super.clone();
    }

}
    