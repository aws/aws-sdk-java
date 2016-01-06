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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#copyDBClusterSnapshot(CopyDBClusterSnapshotRequest) CopyDBClusterSnapshot operation}.
 * <p>
 * Creates a snapshot of a DB cluster. For more information on Amazon
 * Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#copyDBClusterSnapshot(CopyDBClusterSnapshotRequest)
 */
public class CopyDBClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the DB cluster snapshot to copy. This parameter is
     * not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     */
    private String sourceDBClusterSnapshotIdentifier;

    /**
     * The identifier of the new DB cluster snapshot to create from the
     * source DB cluster snapshot. This parameter is not case-sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul> <p>Example: <code>my-cluster-snapshot2</code>
     */
    private String targetDBClusterSnapshotIdentifier;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier of the DB cluster snapshot to copy. This parameter is
     * not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     *
     * @return The identifier of the DB cluster snapshot to copy. This parameter is
     *         not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     */
    public String getSourceDBClusterSnapshotIdentifier() {
        return sourceDBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the DB cluster snapshot to copy. This parameter is
     * not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     *
     * @param sourceDBClusterSnapshotIdentifier The identifier of the DB cluster snapshot to copy. This parameter is
     *         not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     */
    public void setSourceDBClusterSnapshotIdentifier(String sourceDBClusterSnapshotIdentifier) {
        this.sourceDBClusterSnapshotIdentifier = sourceDBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the DB cluster snapshot to copy. This parameter is
     * not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBClusterSnapshotIdentifier The identifier of the DB cluster snapshot to copy. This parameter is
     *         not case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster-snapshot1</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBClusterSnapshotRequest withSourceDBClusterSnapshotIdentifier(String sourceDBClusterSnapshotIdentifier) {
        this.sourceDBClusterSnapshotIdentifier = sourceDBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * The identifier of the new DB cluster snapshot to create from the
     * source DB cluster snapshot. This parameter is not case-sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul> <p>Example: <code>my-cluster-snapshot2</code>
     *
     * @return The identifier of the new DB cluster snapshot to create from the
     *         source DB cluster snapshot. This parameter is not case-sensitive.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         </ul> <p>Example: <code>my-cluster-snapshot2</code>
     */
    public String getTargetDBClusterSnapshotIdentifier() {
        return targetDBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the new DB cluster snapshot to create from the
     * source DB cluster snapshot. This parameter is not case-sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul> <p>Example: <code>my-cluster-snapshot2</code>
     *
     * @param targetDBClusterSnapshotIdentifier The identifier of the new DB cluster snapshot to create from the
     *         source DB cluster snapshot. This parameter is not case-sensitive.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         </ul> <p>Example: <code>my-cluster-snapshot2</code>
     */
    public void setTargetDBClusterSnapshotIdentifier(String targetDBClusterSnapshotIdentifier) {
        this.targetDBClusterSnapshotIdentifier = targetDBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the new DB cluster snapshot to create from the
     * source DB cluster snapshot. This parameter is not case-sensitive.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul> <p>Example: <code>my-cluster-snapshot2</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBClusterSnapshotIdentifier The identifier of the new DB cluster snapshot to create from the
     *         source DB cluster snapshot. This parameter is not case-sensitive.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         </ul> <p>Example: <code>my-cluster-snapshot2</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBClusterSnapshotRequest withTargetDBClusterSnapshotIdentifier(String targetDBClusterSnapshotIdentifier) {
        this.targetDBClusterSnapshotIdentifier = targetDBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBClusterSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getSourceDBClusterSnapshotIdentifier() != null) sb.append("SourceDBClusterSnapshotIdentifier: " + getSourceDBClusterSnapshotIdentifier() + ",");
        if (getTargetDBClusterSnapshotIdentifier() != null) sb.append("TargetDBClusterSnapshotIdentifier: " + getTargetDBClusterSnapshotIdentifier() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDBClusterSnapshotIdentifier() == null) ? 0 : getSourceDBClusterSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBClusterSnapshotIdentifier() == null) ? 0 : getTargetDBClusterSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyDBClusterSnapshotRequest == false) return false;
        CopyDBClusterSnapshotRequest other = (CopyDBClusterSnapshotRequest)obj;
        
        if (other.getSourceDBClusterSnapshotIdentifier() == null ^ this.getSourceDBClusterSnapshotIdentifier() == null) return false;
        if (other.getSourceDBClusterSnapshotIdentifier() != null && other.getSourceDBClusterSnapshotIdentifier().equals(this.getSourceDBClusterSnapshotIdentifier()) == false) return false; 
        if (other.getTargetDBClusterSnapshotIdentifier() == null ^ this.getTargetDBClusterSnapshotIdentifier() == null) return false;
        if (other.getTargetDBClusterSnapshotIdentifier() != null && other.getTargetDBClusterSnapshotIdentifier().equals(this.getTargetDBClusterSnapshotIdentifier()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CopyDBClusterSnapshotRequest clone() {
        
            return (CopyDBClusterSnapshotRequest) super.clone();
    }

}
    