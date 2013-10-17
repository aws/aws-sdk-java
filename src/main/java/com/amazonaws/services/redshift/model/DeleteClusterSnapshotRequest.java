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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#deleteClusterSnapshot(DeleteClusterSnapshotRequest) DeleteClusterSnapshot operation}.
 * <p>
 * Deletes the specified manual snapshot. The snapshot must be in the "available" state, with no other users authorized to access the snapshot.
 * </p>
 * <p>
 * Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots.
 * You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of
 * the authorizations before you can delete the snapshot.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#deleteClusterSnapshot(DeleteClusterSnapshotRequest)
 */
public class DeleteClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of the manual snapshot to be deleted.
     * <p>Constraints: Must be the name of an existing snapshot that is in
     * the <code>available</code> state.
     */
    private String snapshotIdentifier;

    /**
     * The unique identifier of the cluster the snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: Must be the name of valid cluster.
     */
    private String snapshotClusterIdentifier;

    /**
     * The unique identifier of the manual snapshot to be deleted.
     * <p>Constraints: Must be the name of an existing snapshot that is in
     * the <code>available</code> state.
     *
     * @return The unique identifier of the manual snapshot to be deleted.
     *         <p>Constraints: Must be the name of an existing snapshot that is in
     *         the <code>available</code> state.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The unique identifier of the manual snapshot to be deleted.
     * <p>Constraints: Must be the name of an existing snapshot that is in
     * the <code>available</code> state.
     *
     * @param snapshotIdentifier The unique identifier of the manual snapshot to be deleted.
     *         <p>Constraints: Must be the name of an existing snapshot that is in
     *         the <code>available</code> state.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The unique identifier of the manual snapshot to be deleted.
     * <p>Constraints: Must be the name of an existing snapshot that is in
     * the <code>available</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The unique identifier of the manual snapshot to be deleted.
     *         <p>Constraints: Must be the name of an existing snapshot that is in
     *         the <code>available</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The unique identifier of the cluster the snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: Must be the name of valid cluster.
     *
     * @return The unique identifier of the cluster the snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: Must be the name of valid cluster.
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster the snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: Must be the name of valid cluster.
     *
     * @param snapshotClusterIdentifier The unique identifier of the cluster the snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: Must be the name of valid cluster.
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster the snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: Must be the name of valid cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotClusterIdentifier The unique identifier of the cluster the snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: Must be the name of valid cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterSnapshotRequest withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
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
        if (getSnapshotClusterIdentifier() != null) sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteClusterSnapshotRequest == false) return false;
        DeleteClusterSnapshotRequest other = (DeleteClusterSnapshotRequest)obj;
        
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null) return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false) return false; 
        return true;
    }
    
}
    