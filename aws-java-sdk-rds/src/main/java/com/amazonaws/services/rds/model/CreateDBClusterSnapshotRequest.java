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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBClusterSnapshot(CreateDBClusterSnapshotRequest) CreateDBClusterSnapshot operation}.
 * <p>
 * Creates a snapshot of a DB cluster. For more information on Amazon
 * Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBClusterSnapshot(CreateDBClusterSnapshotRequest)
 */
public class CreateDBClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the DB cluster snapshot. This parameter is stored as
     * a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * The identifier of the DB cluster to create a snapshot for. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>my-cluster1</code>
     */
    private String dBClusterIdentifier;

    /**
     * The tags to be assigned to the DB cluster snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier of the DB cluster snapshot. This parameter is stored as
     * a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     *
     * @return The identifier of the DB cluster snapshot. This parameter is stored as
     *         a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the DB cluster snapshot. This parameter is stored as
     * a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     *
     * @param dBClusterSnapshotIdentifier The identifier of the DB cluster snapshot. This parameter is stored as
     *         a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the DB cluster snapshot. This parameter is stored as
     * a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterSnapshotIdentifier The identifier of the DB cluster snapshot. This parameter is stored as
     *         a lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1-snapshot1</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterSnapshotRequest withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * The identifier of the DB cluster to create a snapshot for. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>my-cluster1</code>
     *
     * @return The identifier of the DB cluster to create a snapshot for. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>my-cluster1</code>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The identifier of the DB cluster to create a snapshot for. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>my-cluster1</code>
     *
     * @param dBClusterIdentifier The identifier of the DB cluster to create a snapshot for. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>my-cluster1</code>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The identifier of the DB cluster to create a snapshot for. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>my-cluster1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The identifier of the DB cluster to create a snapshot for. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens.</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>my-cluster1</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * The tags to be assigned to the DB cluster snapshot.
     *
     * @return The tags to be assigned to the DB cluster snapshot.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags to be assigned to the DB cluster snapshot.
     *
     * @param tags The tags to be assigned to the DB cluster snapshot.
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
     * The tags to be assigned to the DB cluster snapshot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tags to be assigned to the DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBClusterSnapshotIdentifier() != null) sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier() + ",");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBClusterSnapshotRequest == false) return false;
        CreateDBClusterSnapshotRequest other = (CreateDBClusterSnapshotRequest)obj;
        
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null) return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDBClusterSnapshotRequest clone() {
        
            return (CreateDBClusterSnapshotRequest) super.clone();
    }

}
    