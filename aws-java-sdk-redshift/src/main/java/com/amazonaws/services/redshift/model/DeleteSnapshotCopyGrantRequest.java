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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest) DeleteSnapshotCopyGrant operation}.
 * <p>
 * Deletes the specified snapshot copy grant.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest)
 */
public class DeleteSnapshotCopyGrantRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the snapshot copy grant to delete.
     */
    private String snapshotCopyGrantName;

    /**
     * The name of the snapshot copy grant to delete.
     *
     * @return The name of the snapshot copy grant to delete.
     */
    public String getSnapshotCopyGrantName() {
        return snapshotCopyGrantName;
    }
    
    /**
     * The name of the snapshot copy grant to delete.
     *
     * @param snapshotCopyGrantName The name of the snapshot copy grant to delete.
     */
    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }
    
    /**
     * The name of the snapshot copy grant to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCopyGrantName The name of the snapshot copy grant to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteSnapshotCopyGrantRequest withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
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
        if (getSnapshotCopyGrantName() != null) sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSnapshotCopyGrantRequest == false) return false;
        DeleteSnapshotCopyGrantRequest other = (DeleteSnapshotCopyGrantRequest)obj;
        
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null) return false;
        if (other.getSnapshotCopyGrantName() != null && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteSnapshotCopyGrantRequest clone() {
        
            return (DeleteSnapshotCopyGrantRequest) super.clone();
    }

}
    