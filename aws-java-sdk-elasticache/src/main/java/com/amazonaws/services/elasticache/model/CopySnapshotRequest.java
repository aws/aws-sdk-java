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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#copySnapshot(CopySnapshotRequest) CopySnapshot operation}.
 * <p>
 * The <i>CopySnapshot</i> action makes a copy of an existing snapshot.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#copySnapshot(CopySnapshotRequest)
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of an existing snapshot from which to copy.
     */
    private String sourceSnapshotName;

    /**
     * A name for the copied snapshot.
     */
    private String targetSnapshotName;

    /**
     * The name of an existing snapshot from which to copy.
     *
     * @return The name of an existing snapshot from which to copy.
     */
    public String getSourceSnapshotName() {
        return sourceSnapshotName;
    }
    
    /**
     * The name of an existing snapshot from which to copy.
     *
     * @param sourceSnapshotName The name of an existing snapshot from which to copy.
     */
    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }
    
    /**
     * The name of an existing snapshot from which to copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotName The name of an existing snapshot from which to copy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
        return this;
    }

    /**
     * A name for the copied snapshot.
     *
     * @return A name for the copied snapshot.
     */
    public String getTargetSnapshotName() {
        return targetSnapshotName;
    }
    
    /**
     * A name for the copied snapshot.
     *
     * @param targetSnapshotName A name for the copied snapshot.
     */
    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }
    
    /**
     * A name for the copied snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetSnapshotName A name for the copied snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
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
        if (getSourceSnapshotName() != null) sb.append("SourceSnapshotName: " + getSourceSnapshotName() + ",");
        if (getTargetSnapshotName() != null) sb.append("TargetSnapshotName: " + getTargetSnapshotName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode()); 
        hashCode = prime * hashCode + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopySnapshotRequest == false) return false;
        CopySnapshotRequest other = (CopySnapshotRequest)obj;
        
        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null) return false;
        if (other.getSourceSnapshotName() != null && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false) return false; 
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null) return false;
        if (other.getTargetSnapshotName() != null && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false) return false; 
        return true;
    }
    
    @Override
    public CopySnapshotRequest clone() {
        
            return (CopySnapshotRequest) super.clone();
    }

}
    