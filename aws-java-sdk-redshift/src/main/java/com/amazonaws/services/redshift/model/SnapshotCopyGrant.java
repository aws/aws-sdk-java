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

/**
 * <p>
 * The snapshot copy grant that grants Amazon Redshift permission to
 * encrypt copied snapshots with the specified customer master key (CMK)
 * from AWS KMS in the destination region.
 * </p>
 * <p>
 * For more information about managing snapshot copy grants, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"> Amazon Redshift Database Encryption </a>
 * in the <i>Amazon Redshift Cluster Management Guide</i> .
 * </p>
 */
public class SnapshotCopyGrant implements Serializable, Cloneable {

    /**
     * The name of the snapshot copy grant.
     */
    private String snapshotCopyGrantName;

    /**
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     */
    private String kmsKeyId;

    /**
     * A list of tag instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the snapshot copy grant.
     *
     * @return The name of the snapshot copy grant.
     */
    public String getSnapshotCopyGrantName() {
        return snapshotCopyGrantName;
    }
    
    /**
     * The name of the snapshot copy grant.
     *
     * @param snapshotCopyGrantName The name of the snapshot copy grant.
     */
    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }
    
    /**
     * The name of the snapshot copy grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCopyGrantName The name of the snapshot copy grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotCopyGrant withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
        return this;
    }

    /**
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     *
     * @return The unique identifier of the customer master key (CMK) in AWS KMS to
     *         which Amazon Redshift is granted permission.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     *
     * @param kmsKeyId The unique identifier of the customer master key (CMK) in AWS KMS to
     *         which Amazon Redshift is granted permission.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The unique identifier of the customer master key (CMK) in AWS KMS to
     *         which Amazon Redshift is granted permission.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotCopyGrant withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * A list of tag instances.
     *
     * @return A list of tag instances.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tag instances.
     *
     * @param tags A list of tag instances.
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
     * A list of tag instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotCopyGrant withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tag instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotCopyGrant withTags(java.util.Collection<Tag> tags) {
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
        if (getSnapshotCopyGrantName() != null) sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SnapshotCopyGrant == false) return false;
        SnapshotCopyGrant other = (SnapshotCopyGrant)obj;
        
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null) return false;
        if (other.getSnapshotCopyGrantName() != null && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public SnapshotCopyGrant clone() {
        try {
            return (SnapshotCopyGrant) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    