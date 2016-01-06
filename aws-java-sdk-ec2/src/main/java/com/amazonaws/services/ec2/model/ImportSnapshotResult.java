/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class ImportSnapshotResult implements Serializable, Cloneable {

    /**
     * The ID of the import snapshot task.
     */
    private String importTaskId;

    /**
     * Information about the import snapshot task.
     */
    private SnapshotTaskDetail snapshotTaskDetail;

    /**
     * A description of the import snapshot task.
     */
    private String description;

    /**
     * The ID of the import snapshot task.
     *
     * @return The ID of the import snapshot task.
     */
    public String getImportTaskId() {
        return importTaskId;
    }
    
    /**
     * The ID of the import snapshot task.
     *
     * @param importTaskId The ID of the import snapshot task.
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }
    
    /**
     * The ID of the import snapshot task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskId The ID of the import snapshot task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotResult withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * Information about the import snapshot task.
     *
     * @return Information about the import snapshot task.
     */
    public SnapshotTaskDetail getSnapshotTaskDetail() {
        return snapshotTaskDetail;
    }
    
    /**
     * Information about the import snapshot task.
     *
     * @param snapshotTaskDetail Information about the import snapshot task.
     */
    public void setSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
    }
    
    /**
     * Information about the import snapshot task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotTaskDetail Information about the import snapshot task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotResult withSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
        return this;
    }

    /**
     * A description of the import snapshot task.
     *
     * @return A description of the import snapshot task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the import snapshot task.
     *
     * @param description A description of the import snapshot task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the import snapshot task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the import snapshot task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotResult withDescription(String description) {
        this.description = description;
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
        if (getImportTaskId() != null) sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getSnapshotTaskDetail() != null) sb.append("SnapshotTaskDetail: " + getSnapshotTaskDetail() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotTaskDetail() == null) ? 0 : getSnapshotTaskDetail().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportSnapshotResult == false) return false;
        ImportSnapshotResult other = (ImportSnapshotResult)obj;
        
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null) return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false) return false; 
        if (other.getSnapshotTaskDetail() == null ^ this.getSnapshotTaskDetail() == null) return false;
        if (other.getSnapshotTaskDetail() != null && other.getSnapshotTaskDetail().equals(this.getSnapshotTaskDetail()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public ImportSnapshotResult clone() {
        try {
            return (ImportSnapshotResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    