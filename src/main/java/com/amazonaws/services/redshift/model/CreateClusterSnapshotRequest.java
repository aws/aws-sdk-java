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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createClusterSnapshot(CreateClusterSnapshotRequest) CreateClusterSnapshot operation}.
 * <p>
 * Creates a manual snapshot of the specified cluster. The cluster must be in the "available" state.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
 * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createClusterSnapshot(CreateClusterSnapshotRequest)
 */
public class CreateClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A unique identifier for the snapshot that you are requesting. This
     * identifier must be unique for all snapshots within the AWS account.
     * <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     */
    private String snapshotIdentifier;

    /**
     * The cluster identifier for which you want a snapshot.
     */
    private String clusterIdentifier;

    /**
     * A unique identifier for the snapshot that you are requesting. This
     * identifier must be unique for all snapshots within the AWS account.
     * <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @return A unique identifier for the snapshot that you are requesting. This
     *         identifier must be unique for all snapshots within the AWS account.
     *         <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * A unique identifier for the snapshot that you are requesting. This
     * identifier must be unique for all snapshots within the AWS account.
     * <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @param snapshotIdentifier A unique identifier for the snapshot that you are requesting. This
     *         identifier must be unique for all snapshots within the AWS account.
     *         <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * A unique identifier for the snapshot that you are requesting. This
     * identifier must be unique for all snapshots within the AWS account.
     * <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier A unique identifier for the snapshot that you are requesting. This
     *         identifier must be unique for all snapshots within the AWS account.
     *         <p>Constraints: <ul> <li>Cannot be null, empty, or blank</li> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The cluster identifier for which you want a snapshot.
     *
     * @return The cluster identifier for which you want a snapshot.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The cluster identifier for which you want a snapshot.
     *
     * @param clusterIdentifier The cluster identifier for which you want a snapshot.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The cluster identifier for which you want a snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The cluster identifier for which you want a snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
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
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterSnapshotRequest == false) return false;
        CreateClusterSnapshotRequest other = (CreateClusterSnapshotRequest)obj;
        
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        return true;
    }
    
}
    